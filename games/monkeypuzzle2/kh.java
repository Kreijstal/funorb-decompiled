/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static ib field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 < 85) {
            String var2 = (String) null;
            kh.a((String) null, 30, true, (String) null, 125, (bg) null, (String) null);
        }
    }

    final static int a(byte param0) {
        String var2;
        if (param0 <= -39) {
          c.field_h.b(true);
          if (!lg.field_n.a((byte) -122)) {
            return lf.a(3);
          } else {
            return 0;
          }
        } else {
          var2 = (String) null;
          kh.a((String) null, -3, false, (String) null, 109, (bg) null, (String) null);
          c.field_h.b(true);
          if (!lg.field_n.a((byte) -122)) {
            return lf.a(3);
          } else {
            return 0;
          }
        }
    }

    final static boolean a(String param0, int param1, boolean param2, String param3, int param4, bg param5, String param6) {
        RuntimeException var7 = null;
        jg var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (di.field_a == ch.field_d) {
              L1: {
                L2: {
                  var8 = new jg(wg.field_j, param5);
                  wg.field_j.b((byte) -33, var8);
                  if (!ad.c(false)) {
                    break L2;
                  } else {
                    var8.h((byte) 114);
                    if (!MonkeyPuzzle2.field_F) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  cg.field_a = null;
                  ac.field_c = param0;
                  v.field_b = param6;
                  if (!param2) {
                    stackIn_9_0 = 0;
                    break L3;
                  } else {
                    stackIn_9_0 = 1;
                    break L3;
                  }
                }
                v.field_c = stackIn_9_0 != 0;
                dd.field_d = param4;
                ch.field_d = cf.field_b;
                mh.field_F = param3;
                break L1;
              }
              L4: {
                if (param1 > 69) {
                  break L4;
                } else {
                  kh.a(53);
                  break L4;
                }
              }
              stackIn_13_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var7);

            stackIn_16_1 = new StringBuilder().append("kh.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param6 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    static {
        field_a = new ib();
    }
}
