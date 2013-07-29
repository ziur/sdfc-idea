package org.salesforce;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: ale
 * Date: 7/17/13
 * Time: 3:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesforceFileType extends LanguageFileType {
    public static final SalesforceFileType INSTANCE = new SalesforceFileType();

    private SalesforceFileType(){
        super(SalesforceLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Apex class";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Apex class file";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cls";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SalesforceIcons.FILE;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
