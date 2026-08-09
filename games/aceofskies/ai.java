/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ai {
    static String field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -28739) {
            return;
        }
        field_a = null;
    }

    final static w a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        w var5 = null;
        w stackIn_4_0 = null;
        w stackIn_8_0 = null;
        w stackIn_12_0 = null;
        w stackIn_15_0 = null;
        w stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var2_int = param0.indexOf('@');
                  if ((var2_int ^ -1) == 0) {
                    stackIn_8_0 = nh.field_f;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int - -1);
                    var5 = ds.a(false, var3);
                    if (var5 != null) {
                      stackIn_12_0 = (w) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (param1 == 12) {
                        stackIn_17_0 = in.a(126, var4);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        stackIn_15_0 = (w) null;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = mo.field_a;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("ai.C(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                return stackIn_17_0;
              }
            }
          }
        }
    }

    abstract void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, int param8, float[] param9, int param10);

    static {
        field_b = "Updates will sent to the email address you've given";
    }
}
