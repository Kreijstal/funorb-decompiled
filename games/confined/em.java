/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class em {
    static int field_e;
    static int[] field_b;
    static String field_c;
    static nf[] field_d;
    static int field_a;
    static String[] field_f;

    final static nf[] a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != 2) {
          field_b = null;
          return fa.a(3, 1, param0, param1, param2, 1, param4, 1, (byte) -97);
        } else {
          return fa.a(3, 1, param0, param1, param2, 1, param4, 1, (byte) -97);
        }
    }

    public static void a(byte param0) {
        if (param0 != -64) {
          field_b = null;
          field_d = null;
          field_c = null;
          field_b = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_b = null;
          field_f = null;
          return;
        }
    }

    abstract si b(byte param0);

    abstract void a(kg param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "to return to the normal view.";
        field_a = 20;
        field_f = new String[255];
    }
}
