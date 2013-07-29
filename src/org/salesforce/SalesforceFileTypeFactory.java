package org.salesforce;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: ale
 * Date: 7/17/13
 * Time: 3:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesforceFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(SalesforceFileType.INSTANCE, "cls");
    }
}
