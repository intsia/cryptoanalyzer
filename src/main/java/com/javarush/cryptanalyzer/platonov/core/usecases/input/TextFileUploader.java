package com.javarush.cryptanalyzer.platonov.core.usecases.input;

import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

public class TextFileUploader //TODO тут по хорошему добавить какой-то обработчик строк, чтобы не заморачиваться с двойными // и другими ошибками. Как-то поудобнее сварганить. Но пока работает.
{
    Path path;
    String pathInString;


    public TextFileUploader(String path)
    {
        pathInString = path;
        this.path = Path.of(pathInString);
        this.path.toAbsolutePath();
    }

    public EncryptionText uploadTextFile()
    {
        try
                (
                        RandomAccessFile file = new RandomAccessFile(path.toFile(), "r");
                        FileChannel channel = file.getChannel();
                )
        {
            ByteBuffer byteBuffer = ByteBuffer.allocate((int) channel.size());
            StringBuilder builder = new StringBuilder();
            channel.read(byteBuffer);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining())
            {
                builder.append((char) byteBuffer.get());
            }
            return new EncryptionText(builder.toString());
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
