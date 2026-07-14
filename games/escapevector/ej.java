/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static ed field_a;
    static boolean field_d;
    static String field_c;
    static int field_b;
    static ed field_e;
    static String[] field_g;
    static te[] field_f;

    final static void a(byte param0, String param1) {
        lb.b(-10002, param1);
        uf.a((byte) 125, mm.field_a, false);
        if (param0 > -113) {
            Object var3 = null;
            ej.a((byte) -29, (String) null);
        }
    }

    final static int a(int param0, int param1) {
        param1 = ((param1 & -1431655765) >>> -1516128639) + (param1 & 1431655765);
        param1 = (param1 & param0) + ((-858993460 & param1) >>> 1378065122);
        param1 = (param1 >>> -1166604636) + param1 & 252645135;
        param1 = param1 + (param1 >>> 320507944);
        param1 = param1 + (param1 >>> -2087009456);
        return param1 & 255;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
        field_g = null;
        if (param0 < 13) {
          field_c = null;
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "To Customer Support";
        field_g = new String[]{"", "", "", ""};
    }
}
