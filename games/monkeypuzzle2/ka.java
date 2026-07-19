/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    static int field_a;
    static le field_b;

    final static void b(int param0) {
        eg.field_d[aa.field_a].b(param0, 0);
    }

    final static String c(int param0) {
        if (param0 != 10367) {
            field_a = -49;
            if (!(null != cl.field_e)) {
                return "";
            }
            return cl.field_e;
        }
        if (!(null != cl.field_e)) {
            return "";
        }
        return cl.field_e;
    }

    abstract byte[] d(int param0);

    abstract void a(int param0, byte[] param1);

    public static void a(int param0) {
        field_b = null;
        int var1 = -110 % ((-24 - param0) / 53);
    }

    static {
        field_a = 0;
    }
}
