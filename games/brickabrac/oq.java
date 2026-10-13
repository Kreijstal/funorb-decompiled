/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oq extends lh {
    private int[] field_y;
    static String field_u;
    static int field_x;
    static String field_w;
    static String field_v;

    public static void h(byte param0) {
        field_w = null;
        field_u = null;
        if (param0 != -34) {
          return;
        }
        field_v = null;
    }

    final void refreshMenu(int obfuscationGuard) {
        this.initializeButtons(this.field_y, 0);
        if (obfuscationGuard > -60) {
          field_u = (String) null;
        }
    }

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        int var3 = (this.buttonSpacing * 2 * this.selection.itemCount + this.buttonSpacing) / 2;
        int var4 = (480 - var3) / 2;
        if (buttonIndex != this.selection.itemCount - obfuscationGuard) {
          return var4 + buttonIndex * this.buttonSpacing;
        }
        return -this.buttonSpacing + (var3 + var4);
    }

    final int getParentScreenId(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          field_v = (String) null;
          return -1;
        }
        return -1;
    }

    oq(int param0, int[] param1, int[] param2) {
        super(param0, 180, 460, 150, 35, param1);
        try {
          this.field_y = param2;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "oq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void drawScreen(byte obfuscationGuard) {
        pe.field_o.drawScreen((byte) -116);
        Rasterizer2D.darkenRectangle(0, 0, 640, 480);
        this.g(102);
        pg.d(0);
        if (obfuscationGuard <= -14) {
          this.a(0);
          return;
        }
        field_v = (String) null;
        this.a(0);
    }

    static {
        field_u = "Next";
        field_w = "You are not currently logged in to the game.";
        field_v = "Accelerate: paddle increases the ball's velocity.";
    }
}
