/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lb extends uh {
    boolean field_E;
    static int[] field_B;
    boolean field_y;
    volatile boolean field_u;
    static ql field_w;
    static he field_D;
    static sa field_z;
    static na field_C;
    static int field_A;
    static nh field_x;
    static int field_v;

    final static boolean a(char param0) {
        if (param0 < 48) {
            return false;
        }
        if (param0 > 57) {
            return false;
        }
        return true;
    }

    abstract int g(int param0);

    abstract byte[] i(int param0);

    public static void h() {
        field_x = null;
        field_w = null;
        field_B = null;
        field_C = null;
        field_D = null;
        field_z = null;
    }

    lb() {
        ((lb) this).field_u = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[]{16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16711680, 16711680, 16711680, 65535, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 65280, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215, 16777215};
        field_z = new sa(13, 0, 1, 0);
        field_A = 65;
    }
}
