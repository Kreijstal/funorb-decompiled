/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ki extends ah {
    static int field_t;
    boolean field_y;
    volatile boolean field_w;
    static int field_A;
    static int field_s;
    static String field_r;
    static int field_v;
    static int[] field_z;
    boolean field_u;
    static int field_x;

    abstract int a(boolean param0);

    final static void f(int param0) {
        jf.d(-1);
        gk.field_a = true;
        ie.field_r = true;
        na.field_d.e((byte) 67);
        if (param0 < 57) {
          ki.a(117, 22, -7);
          we.a(false, 12757, ak.field_b);
          return;
        } else {
          we.a(false, 12757, ak.field_b);
          return;
        }
    }

    abstract byte[] g(int param0);

    public static void e(int param0) {
        if (param0 != 16384) {
            ki.a(-43, -90, 83);
            field_z = null;
            field_r = null;
            return;
        }
        field_z = null;
        field_r = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 > -115) {
            ki.a(-70, -86, 61);
            eh.field_g = param1;
            s.field_b = param0;
            return;
        }
        eh.field_g = param1;
        s.field_b = param0;
    }

    ki() {
        this.field_w = true;
    }

    static {
        field_r = "Unfortunately you are not eligible to create an account.";
        field_v = 0;
        field_z = new int[16384];
    }
}
