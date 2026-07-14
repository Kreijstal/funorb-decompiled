/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    String[] field_g;
    String field_h;
    static volatile int field_d;
    int field_i;
    boolean field_f;
    static int field_e;
    static pj field_a;
    boolean field_b;
    static int[] field_c;

    final static int[] a(byte param0) {
        if (param0 <= 107) {
            return null;
        }
        return new int[8];
    }

    public static void a(int param0) {
        if (param0 != 50) {
            cj.a(-125);
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, td param1) {
        na.a((byte) 46, li.a(param1, 100, 96));
        int var2 = -91 % ((param0 - 43) / 57);
    }

    cj(boolean param0) {
        ((cj) this).field_b = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_e = 50;
        field_a = new pj();
    }
}
