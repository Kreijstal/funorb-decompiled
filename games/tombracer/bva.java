/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bva {
    static fta field_b;
    static float field_c;
    static String field_a;

    public static void a(byte param0) {
        if (param0 > -7) {
            field_b = null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final synchronized static long b(byte param0) {
        long var1 = 0L;
        if (param0 == -107) {
          var1 = System.currentTimeMillis();
          if (var1 < dca.field_o) {
            br.field_p = br.field_p + (-var1 + dca.field_o);
            dca.field_o = var1;
            return var1 - -br.field_p;
          } else {
            dca.field_o = var1;
            return var1 - -br.field_p;
          }
        } else {
          bva.a((byte) 0);
          var1 = System.currentTimeMillis();
          if (var1 >= dca.field_o) {
            dca.field_o = var1;
            return var1 - -br.field_p;
          } else {
            br.field_p = br.field_p + (-var1 + dca.field_o);
            dca.field_o = var1;
            return var1 - -br.field_p;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fta();
        field_a = "<%0> is already on your ignore list.";
    }
}
