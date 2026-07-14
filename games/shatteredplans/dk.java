/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static String field_c;
    static String field_a;
    static int[] field_b;

    public static void a(byte param0) {
        if (param0 < 117) {
          field_a = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static void a(byte param0, String param1) {
        int var2 = pd.field_k;
        int var3 = bb.field_b;
        int var4 = ii.field_u.field_nb.a(param1, 500);
        int var5 = 7 % ((-9 - param0) / 60);
        int var6 = ii.field_u.field_nb.c(param1, 500) - -6;
        int var7 = 2 + var4 * cr.field_c;
        int var8 = uh.a(-38, var2, var6, 12);
        int var9 = uq.a(20, 0, var7, var3);
        gf.b(var8, var9, var6, var7, 0);
        gf.d(1 + var8, 1 + var9, -2 + var6, var7 + -2, 16777088);
        int discarded$0 = ii.field_u.field_nb.a(param1, var8 + 3, s.field_i + (1 + var9 - ii.field_u.field_nb.field_J), 500, 1000, 0, -1, 0, 0, cr.field_c);
    }

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        var2 = 56 % ((param0 - -3) / 56);
        if (param1 >= 48) {
          if (param1 > 57) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Find opponent";
        field_b = new int[4];
        field_c = "Report abuse";
    }
}
