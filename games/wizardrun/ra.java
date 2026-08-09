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
        int var1 = 7 / ((param0 - 64) / 46);
        field_i = null;
        field_p = null;
        field_m = null;
        field_l = null;
    }

    final static void a(int param0) {
        eg dupTemp$0 = null;
        int var1_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = wizardrun.field_H;
        try {
          L0: {
            il.field_e = true;
            if (param0 == 2) {
              var1_int = 0;
              L1: while (true) {
                if (-301 >= (var1_int ^ -1)) {
                  var1_int = od.field_k;
                  var2 = 0;
                  L2: while (true) {
                    if (var1_int <= var2) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        if (ii.field_e[var2].field_B != 21) {
                          break L3;
                        } else {
                          ii.field_e[var2].field_e = 20;
                          ii.field_e[var2].field_h = -ii.field_e[var2].field_h;
                          dupTemp$0 = ii.field_e[var2];
                          dupTemp$0.field_o = dupTemp$0.field_o + 2;
                          break L3;
                        }
                      }
                      var2++;
                      continue L2;
                    }
                  }
                } else {
                  L4: {
                    if (tc.field_l.field_d[var1_int]) {
                      tc.field_l.field_d[var1_int] = false;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ra.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ra(int param0) {
        this.field_n = param0;
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = qb.field_r.a(92, param0, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ra.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_j = new uf("");
        field_k = -1;
        field_l = "The Pirate Ship";
        field_i = "members-only content";
    }
}
