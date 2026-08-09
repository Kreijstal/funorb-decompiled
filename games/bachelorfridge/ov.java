/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ov extends uo {
    static sna field_d;
    static String field_g;
    static int field_c;
    static int[] field_e;
    static java.applet.Applet field_f;

    final static int b(int param0, int param1) {
        int stackIn_8_0 = 0;
        if (param1 == 60) {
          if (param0 > 0) {
            if (-5 > (param0 ^ -1)) {
              return 0;
            } else {
              L0: {
                if ((param0 ^ -1) <= -4) {
                  stackIn_8_0 = -2 + param0;
                  break L0;
                } else {
                  stackIn_8_0 = param0 - -2;
                  break L0;
                }
              }
              return stackIn_8_0;
            }
          } else {
            return 0;
          }
        } else {
          return 32;
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != -5) {
            return;
        }
        field_d = null;
    }

    final static iga a(long param0, boolean param1, String param2, String param3, byte param4) {
        RuntimeException var6 = null;
        bd stackIn_5_0 = null;
        jda stackIn_7_0 = null;
        iga stackIn_10_0 = null;
        ot stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1L) != -1L) {
                break L1;
              } else {
                if (param2 != null) {
                  stackIn_7_0 = new jda(param2, param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param1) {
              if (param4 >= 41) {
                stackIn_12_0 = new ot(param0, param3);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_10_0 = (iga) null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_5_0 = new bd(param0, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ov.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (iga) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (iga) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (iga) ((Object) stackIn_12_0);
            }
          }
        }
    }

    static {
        field_g = null;
        field_e = new int[]{100, 60, 30, 10};
    }
}
