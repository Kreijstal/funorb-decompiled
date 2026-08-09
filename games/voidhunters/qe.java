/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              stackIn_4_0 = new nc(frb.a(159, 121));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("qe.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static char a(byte param0, int param1) {
        int var2;
        int var3;
        var2 = param0 & 255;
        if (-1 == (var2 ^ -1)) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          if (-129 >= (var2 ^ -1)) {
            if (-161 >= (var2 ^ -1)) {
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
            field_o = (String) null;
        }
    }

    qe(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static vcb a(int param0) {
        if (param0 != 0) {
          return (vcb) null;
        } else {
          return new vcb(0, 0, msa.field_s.field_s, 0, (wwa) null, msa.field_s.field_e, msa.field_s.field_l, msa.field_s.field_s, msa.field_s.field_s, msa.field_s.field_r, msa.field_s.field_i, false, true, 32768, 0);
        }
    }

    static {
        field_o = "Ship at <%0>% complexity";
    }
}
