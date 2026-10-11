/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cba {
    static String field_b;
    static kv field_a;
    static int field_d;
    static ee[] field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -44) {
          field_c = (ee[]) null;
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        oha var5 = al.a(-71, param3);
        int var7 = 37 / ((param4 - 1) / 35);
        int var6 = var5.field_h;
        int var8 = var5.field_l;
        if (var8 == 1) {
          hh.field_b[var6].a(param2 + 5, param0 + 5, param1);
          return;
        }
        if (var8 == 2) {
          hh.field_b[var6].a(param2 + 5, param0 + 5, param1);
          return;
        }
        if (var8 == 3) {
          hh.field_b[var6].a(param2 + 5, param0 + 5, param1);
          return;
        }
        hh.field_b[var6].a(param2 + 5, param0 + 5, param1);
    }

    static {
        field_b = "The players are currently selecting their teams. Please wait.";
    }
}
