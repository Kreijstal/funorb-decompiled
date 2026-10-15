/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextFieldWidget extends TextFieldWidget implements ValidatableWidget {
    static RgbSprite[] field_V;
    static int decodedRankingLosses;
    private int field_ab;
    static String field_bb;
    static String field_X;
    static RgbSprite[] field_U;
    private ValidationSource validationSource;
    static RgbSprite constructionFarSprite;
    static RgbSprite constructionNearSprite;

    final void notifyTextChanged(int obfuscationGuard) {
        if (obfuscationGuard >= 7) {
          super.notifyTextChanged(90);
          if (this.validationSource != null) {
            this.validationSource.markEdited(false);
          }
          return;
        }
        ValidatedTextFieldWidget.o(8);
        super.notifyTextChanged(90);
        if (this.validationSource != null) {
          this.validationSource.markEdited(false);
        }
    }

    final void setValidationSource(ValidationSource validationSource, byte obfuscationGuard) {
        try {
          if (obfuscationGuard != -68) {
            this.notifyTextChanged(48);
          }
          this.validationSource = validationSource;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "sf.AB(" + (validationSource != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    ValidatedTextFieldWidget(String text, WidgetListener listener, int maxLength) {
        super(text, listener, maxLength);
    }

    public final ValidationSource getValidationSource(int obfuscationGuard) {
        if (obfuscationGuard != -11011) {
          return (ValidationSource) null;
        }
        return this.validationSource;
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          this.field_ab = -parentX - this.x + MusicPatch.pointerX;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "sf.WA(" + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ',' + parentY + ')');
        }
    }

    final String getTooltip(int obfuscationGuard) {
        if (!this.mouseOver) {
          return null;
        }
        if (this.tooltip == null) {
          return null;
        }
        if (obfuscationGuard >= 6) {
          CanvasInputHelpers.setPendingTooltipAnchor(-this.field_ab - (-this.width - MusicPatch.pointerX), ResourcePreparationEntry.pointerY, (byte) 79);
          return this.tooltip;
        }
        this.field_ab = -5;
        CanvasInputHelpers.setPendingTooltipAnchor(-this.field_ab - (-this.width - MusicPatch.pointerX), ResourcePreparationEntry.pointerY, (byte) 79);
        return this.tooltip;
    }

    public static void o(int param0) {
        field_U = null;
        constructionFarSprite = null;
        field_bb = null;
        field_X = null;
        constructionNearSprite = null;
        if (param0 == -16124) {
          field_V = null;
          return;
        }
        ValidatedTextFieldWidget.o(121);
        field_V = null;
    }

    static {
        field_X = "The account name you use to access RuneScape and other Jagex.com games";
        field_bb = "Unpacking music";
    }
}
