// This is a generated file. Not intended for manual editing.
package me.rexim.morganey.plugin.parser.generated.psi.impl;

import java.util.List;

import me.rexim.morganey.plugin.parser.generated.psi.ListLiteral;
import me.rexim.morganey.plugin.parser.generated.psi.Visitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class ListLiteralImpl extends ASTWrapperPsiElement implements ListLiteral {

  public ListLiteralImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitListLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PsiElement> getTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PsiElement.class);
  }

}
