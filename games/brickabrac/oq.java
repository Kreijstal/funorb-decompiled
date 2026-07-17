/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oq extends lh {
    private int[] field_y;
    static String field_u;
    static int field_x;
    static String field_w;
    static String field_v;

    public static void h() {
        field_w = null;
        field_u = null;
        field_v = null;
    }

    final void d(int param0) {
        ((oq) this).a(((oq) this).field_y, 0);
        if (param0 > -60) {
            field_u = null;
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var3 = (((oq) this).field_q * 2 * ((oq) this).field_h.field_r - -((oq) this).field_q) / 2;
        var4 = (480 - var3) / 2;
        if (param0 == ((oq) this).field_h.field_r - param1) {
          return -((oq) this).field_q + (var3 + var4);
        } else {
          return var4 - -(param0 * ((oq) this).field_q);
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            field_v = null;
            return -1;
        }
        return -1;
    }

    oq(int param0, int[] param1, int[] param2) {
        super(param0, 180, 460, 150, 35, param1);
        try {
            ((oq) this).field_y = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "oq.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    void b(byte param0) {
        pe.field_o.b((byte) -116);
        lb.b(0, 0, 640, 480);
        ((oq) this).g(102);
        int discarded$15 = 0;
        pg.d();
        if (param0 > -14) {
          field_v = null;
          ((oq) this).a(0);
          return;
        } else {
          ((oq) this).a(0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Next";
        field_w = "You are not currently logged in to the game.";
        field_v = "Accelerate: paddle increases the ball's velocity.";
    }
}
