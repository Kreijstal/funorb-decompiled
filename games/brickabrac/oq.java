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

    final void d(int param0) {
        this.a(this.field_y, 0);
        if (param0 > -60) {
          field_u = (String) null;
        }
    }

    final int b(int param0, int param1) {
        int var3 = (this.field_q * 2 * this.field_h.field_r + this.field_q) / 2;
        int var4 = (480 - var3) / 2;
        if (param0 != this.field_h.field_r - param1) {
          return var4 + param0 * this.field_q;
        }
        return -this.field_q + (var3 + var4);
    }

    final int a(boolean param0) {
        if (!param0) {
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
