/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends wl {
    static uf field_j;
    int field_n;
    static o field_p;
    static String field_i;
    static int field_k;
    static String field_l;
    static int field_o;
    static o[] field_m;

    public static void c(int param0) {
        field_j = null;
        int var1 = 7;
        field_i = null;
        field_p = null;
        field_m = null;
        field_l = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = wizardrun.field_H;
        try {
          L0: {
            il.field_e = true;
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 300) {
                var1_int = od.field_k;
                var2 = 0;
                if (var1_int <= var2) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L2: {
                    if (ii.field_e[var2].field_B != 21) {
                      var2++;
                      break L2;
                    } else {
                      ii.field_e[var2].field_e = 20;
                      ii.field_e[var2].field_h = -ii.field_e[var2].field_h;
                      ii.field_e[var2].field_o = ii.field_e[var2].field_o + 2;
                      var2++;
                      break L2;
                    }
                  }
                  var2++;
                  var2++;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L3: {
                  if (tc.field_l.field_d[var1_int]) {
                    tc.field_l.field_d[var1_int] = false;
                    var1_int++;
                    break L3;
                  } else {
                    var1_int++;
                    break L3;
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ra.C(" + 2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ra(int param0) {
        ((ra) this).field_n = param0;
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -94) {
                break L1;
              } else {
                field_k = -114;
                break L1;
              }
            }
            stackOut_2_0 = qb.field_r.a(92, param0, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ra.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new uf("");
        field_k = -1;
        field_l = "The Pirate Ship";
        field_i = "members-only content";
    }
}
