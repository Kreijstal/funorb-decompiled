/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gr extends rg {
    static hj field_G;
    static vh field_y;
    static String field_A;
    static int field_z;
    static dd[] field_I;
    static int[] field_w;
    volatile boolean field_F;
    static int[] field_B;
    boolean field_C;
    static String field_H;
    boolean field_x;
    static String field_D;
    static byte[] field_E;

    final static void g(int param0) {
        if (param0 <= 92) {
          gr.f(4);
          lk.field_o = false;
          rq.field_H = null;
          hk.field_n = null;
          va.field_W = null;
          fo.field_a = null;
          return;
        } else {
          lk.field_o = false;
          rq.field_H = null;
          hk.field_n = null;
          va.field_W = null;
          fo.field_a = null;
          return;
        }
    }

    abstract byte[] b(boolean param0);

    public static void f(int param0) {
        field_G = null;
        field_y = null;
        field_E = null;
        if (param0 >= -119) {
          field_B = null;
          field_D = null;
          field_A = null;
          field_I = null;
          field_B = null;
          field_w = null;
          field_H = null;
          return;
        } else {
          field_D = null;
          field_A = null;
          field_I = null;
          field_B = null;
          field_w = null;
          field_H = null;
          return;
        }
    }

    final static qb[] a(di param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.b(param1, -1);
        var5 = param0.a(var4, 0, param3);
        if (param2 != -24155) {
          return null;
        } else {
          return pn.a(var5, param0, var4, 120);
        }
    }

    abstract int e(int param0);

    gr() {
        ((gr) this).field_F = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Enter multiplayer lobby";
        field_D = "Game options";
        field_w = new int[12];
        field_A = "<%0>: Two shots!";
        field_G = new hj(0, 2, 2, 1);
    }
}
