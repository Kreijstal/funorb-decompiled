/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo extends aa {
    static ut[] field_n;
    static int field_m;
    static int field_k;
    static String field_l;
    static String[] field_j;
    static int field_o;

    final static void a(ot param0, gm param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        if (param1 != null) {
          var4 = 37 % ((param2 - 60) / 56);
          var5 = param0.field_o;
          var6 = param0.field_v;
          var7 = ug.a(0, param1.field_kb >> -162301264) - (var5 >> 1760165345);
          var8 = -(var6 >> 192913121) + lf.a((byte) -101, param1.field_bb >> 1328688880);
          if ((hw.field_i ^ -1) != -257) {
            var9 = var5 * hw.field_i >> 1020001192;
            if (tb.field_v != 1) {
              nh.a(param0, (-var9 + var5 >> -1357985599) + var7, (var6 - var9 >> 733532033) + var8, var9, var9);
              return;
            } else {
              param0.d((-var9 + var5 >> 1095375841) + var7, (var6 + -var9 >> 873676673) + var8, var9, var9, param3);
              return;
            }
          } else {
            if (1 != tb.field_v) {
              nh.a(param0, var7, var8);
              return;
            } else {
              param0.b(var7, var8, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    wo(long param0, String param1) {
        super(param0, param1);
    }

    final kj a(byte param0) {
        if (param0 > -77) {
            return null;
        }
        return si.field_j;
    }

    public static void a(boolean param0) {
        field_l = null;
        field_n = null;
        if (param0) {
            wo.a(true);
            field_j = null;
            return;
        }
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "New Game";
        field_j = new String[]{"Learn basic controls though the interactive tutorial.", "Experiment with your team on an empty pitch.", null};
        field_o = 0;
    }
}
