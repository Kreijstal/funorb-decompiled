/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static int field_c;
    static ei field_a;
    static int field_d;
    static double[] field_b;

    final static sm a(int param0, int param1, la param2, byte param3) {
        int var4 = 0;
        var4 = 92 / ((param3 - 64) / 38);
        if (!nd.a(param0, param2, -1, param1)) {
          return null;
        } else {
          return oi.a((byte) -97);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3) {
            bf.a(-44);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ei();
        field_b = new double[3];
    }
}
