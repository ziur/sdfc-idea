package org.salesforce.psi;

/**
 * Created with IntelliJ IDEA.
 * User: ale
 * Date: 7/18/13
 * Time: 1:10 AM
 * To change this template use File | Settings | File Templates.
 */


import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import org.salesforce.*;

public class SimpleElementType extends IElementType {
    public SimpleElementType(@NotNull @NonNls String debugName) {

        super(debugName, SalesforceLanguage.INSTANCE .INSTANCE);
    }
}
