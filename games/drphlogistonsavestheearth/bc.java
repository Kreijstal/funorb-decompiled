/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static nh field_d;
    static String[] field_e;
    static gk field_c;
    static String field_g;
    static sa field_a;
    static int field_f;
    static String[] field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 < 28) {
          field_b = (String[]) null;
          field_g = null;
          field_a = null;
          return;
        } else {
          field_g = null;
          field_a = null;
          return;
        }
    }

    final static vi a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        vi var5 = null;
        vi stackIn_4_0 = null;
        vi stackIn_7_0 = null;
        vi stackIn_10_0 = null;
        vi stackIn_13_0 = null;
        vi stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length()) {
                  var2_int = param0.indexOf('@');
                  if (param1 == -3303) {
                    if ((var2_int ^ -1) != 0) {
                      var3 = param0.substring(0, var2_int);
                      var4 = param0.substring(var2_int - -1);
                      var5 = qg.b((byte) 71, var3);
                      if (var5 == null) {
                        stackIn_15_0 = pd.a(var4, param1 ^ 3302);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        stackIn_13_0 = (vi) (var5);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_10_0 = qj.field_e;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_7_0 = (vi) null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = dm.field_A;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("bc.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                return stackIn_15_0;
              }
            }
          }
        }
    }

    static {
        field_g = "No highscores";
        field_a = new sa(14, 0, 4, 1);
    }
}
