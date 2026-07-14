/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(159, 121));
    }

    final static char a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param0 & 255;
        if (-1 == (var2 ^ -1)) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          if (-129 >= var2) {
            if (-161 <= var2) {
              var3 = 44 / ((param1 - -12) / 34);
              return (char)var2;
            } else {
              L0: {
                var3 = tu.field_c[var2 + -128];
                if (var3 == 0) {
                  var3 = 63;
                  break L0;
                } else {
                  break L0;
                }
              }
              var2 = var3;
              var3 = 44 / ((param1 - -12) / 34);
              return (char)var2;
            }
          } else {
            var3 = 44 / ((param1 - -12) / 34);
            return (char)var2;
          }
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 <= 56) {
            field_o = null;
        }
    }

    qe(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static vcb a(int param0) {
        if (param0 != 0) {
          return null;
        } else {
          return new vcb(0, 0, msa.field_s.field_s, 0, (wwa) null, msa.field_s.field_e, msa.field_s.field_l, msa.field_s.field_s, msa.field_s.field_s, msa.field_s.field_r, msa.field_s.field_i, false, true, 32768, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Ship at <%0>% complexity";
    }
}
