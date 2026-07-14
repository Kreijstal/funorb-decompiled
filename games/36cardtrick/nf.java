/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static de field_d;
    static String[] field_b;
    static String field_a;
    static int field_c;

    final static void a(boolean param0, byte param1, boolean param2) {
        mb.a((String) null, param1 ^ -1026, param0, param2);
        if (param1 != -2) {
            field_d = (de) null;
        }
    }

    final static void a(pb param0, boolean param1, int param2, int param3, int param4) {
        param0.b(-9469, 12);
        param0.e(17, 26040);
        if (param1) {
          field_d = (de) null;
          param0.e(param3, 26040);
          param0.e(param2, 26040);
          param0.b(-9469, param4);
          return;
        } else {
          param0.e(param3, 26040);
          param0.e(param2, 26040);
          param0.b(-9469, param4);
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 17) {
            field_c = -8;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new de(8, 0, 4, 1);
        field_b = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_a = "Names can only contain letters, numbers, spaces and underscores";
    }
}
