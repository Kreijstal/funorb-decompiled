/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static int field_e;
    static gd field_f;
    static int field_d;
    static int field_c;
    static int field_g;
    static cn field_a;
    static ad field_b;

    final static void b(int param0) {
        if (param0 <= 34) {
            Object var2 = null;
            StringBuilder discarded$0 = am.a((StringBuilder) null, 'ﾍ', -124, false);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        if (param0 != 30111) {
            am.b(93);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        var4 = param0.length();
        param0.setLength(param2);
        if (param3) {
          return null;
        } else {
          var5 = var4;
          L0: while (true) {
            if (param2 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param1);
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        mc.b(50, 150);
        field_b = new ad(1, 2, 2, 0);
    }
}
