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
            return (int[]) null;
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
        try {
            na.a((byte) 46, li.a(param1, 100, 96));
            int var2_int = -91 % ((param0 - 43) / 57);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "cj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    cj(boolean param0) {
        this.field_b = param0 ? true : false;
    }

    static {
        field_d = 0;
        field_e = 50;
        field_a = new pj();
    }
}
