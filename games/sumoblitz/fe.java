/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends ah {
    static String[] field_S;
    static int field_T;

    fe(int param0, int param1) {
        super(0, 0, param0, param1);
    }

    final static dj a(int param0, qp param1) {
        int var2 = -12 % ((-31 - param0) / 63);
        return qq.a(18416, mf.a(param1, 100, 96));
    }

    public static void n(byte param0) {
        if (param0 > -63) {
            Object var2 = null;
            dj discarded$0 = fe.a(44, (qp) null);
            field_S = null;
            return;
        }
        field_S = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_T = 10;
    }
}
