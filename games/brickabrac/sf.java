/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends TextFieldWidget implements je {
    static RgbSprite[] field_V;
    static int decodedRankingLosses;
    private int field_ab;
    static String field_bb;
    static String field_X;
    static RgbSprite[] field_U;
    private ia field_W;
    static RgbSprite constructionFarSprite;
    static RgbSprite constructionNearSprite;

    final void notifyTextChanged(int obfuscationGuard) {
        if (obfuscationGuard >= 7) {
          super.notifyTextChanged(90);
          if (this.field_W != null) {
            this.field_W.a(false);
          }
          return;
        }
        sf.o(8);
        super.notifyTextChanged(90);
        if (this.field_W != null) {
          this.field_W.a(false);
        }
    }

    final void a(ia param0, byte param1) {
        try {
          if (param1 != -68) {
            this.notifyTextChanged(48);
          }
          this.field_W = param0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "sf.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    sf(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    public final ia a(int param0) {
        if (param0 != -11011) {
          return (ia) null;
        }
        return this.field_W;
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
          ap.a(-this.field_ab - (-this.width - MusicPatch.pointerX), po.pointerY, (byte) 79);
          return this.tooltip;
        }
        this.field_ab = -5;
        ap.a(-this.field_ab - (-this.width - MusicPatch.pointerX), po.pointerY, (byte) 79);
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
        sf.o(121);
        field_V = null;
    }

    static {
        field_X = "The account name you use to access RuneScape and other Jagex.com games";
        field_bb = "Unpacking music";
    }
}
