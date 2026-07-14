/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static rga field_c;
    static String field_b;
    static int field_a;

    final static void a(int param0, int param1, cfa param2) {
        if (param1 < 91) {
          field_a = -26;
          eaa.field_d.a((bw) (Object) param2, true);
          nr.a(param0, param2, (byte) -48);
          return;
        } else {
          eaa.field_d.a((bw) (Object) param2, true);
          nr.a(param0, param2, (byte) -48);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 >= -93) {
            rm.a(-6);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new rga();
        field_b = "Confirm Email:";
        field_a = 50;
    }
}
