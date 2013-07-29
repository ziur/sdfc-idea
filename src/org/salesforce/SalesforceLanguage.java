package org.salesforce;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: ale
 * Date: 7/17/13
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesforceLanguage extends Language{
    public static final SalesforceLanguage INSTANCE = new SalesforceLanguage();
    private SalesforceLanguage(){
        super("SalesforceLanguage");
    }
}
