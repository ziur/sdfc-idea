package org.salesforce.psi;
import com.intellij.psi.tree.IElementType;


import com.intellij.psi.tree.IElementType;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.salesforce.*;

public class SimpleTokenType extends IElementType {
    public SimpleTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SalesforceLanguage.INSTANCE );
    }

    @Override
    public String toString() {
        return "SimpleTokenType." + super.toString();
    }
}