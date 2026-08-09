/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ia {
    static ee field_s;
    static int field_t;
    static String field_p;
    static int field_n;
    static String field_o;
    static String field_q;
    static String field_u;
    static int field_r;

    public static void c(int param0) {
        if (param0 != 18384) {
            return;
        }
        field_u = null;
        field_o = null;
        field_s = null;
        field_p = null;
        field_q = null;
    }

    final vd a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        vd stackIn_6_0 = null;
        vd stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (gm.a(true, param0) != null) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (var3_int == 0) {
              stackIn_6_0 = fa.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param1 == -1) {
                  break L2;
                } else {
                  var4 = (String) null;
                  this.a((String) null, -6);
                  break L2;
                }
              }
              stackIn_10_0 = vf.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ih.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_10_0;
        }
    }

    ih(jf param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1, -1) != fa.field_d) {
              L1: {
                if (param0 == 100) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a(5, (String) null);
                  break L1;
                }
              }
              stackIn_6_0 = mg.field_lc;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = oh.field_g;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ih.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_p = "Accept rematch";
        field_o = "(1 player wants to join)";
        field_u = "You must play 1 more rated game before playing with the current options.";
    }
}
