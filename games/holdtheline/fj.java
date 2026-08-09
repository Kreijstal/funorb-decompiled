/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fj extends ln {
    static go field_s;
    static lc field_o;
    static String field_r;
    static int[] field_q;
    static String field_p;

    final static wd a(boolean param0, float param1, wd param2) {
        RuntimeException var3 = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_p = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = wc.a(param2, 0.0f, param1, (byte) -115);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("fj.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, boolean param1) {
        vk.a(param0, param1, -113);
    }

    final static void f(int param0) {
        ka.field_g = param0;
    }

    fj() {
    }

    final static int a(int[] param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              param2 = param2 - param0[0];
              var4 = param0.length - 1;
              if (param1 == -119) {
                break L1;
              } else {
                field_s = (go) null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= var4) {
                stackIn_11_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = param0[1 + var3_int];
                  if (var5 <= param2) {
                    break L3;
                  } else {
                    if (-16 <= (param2 ^ -1)) {
                      break L3;
                    } else {
                      stackIn_8_0 = var3_int;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                param2 = param2 - var5;
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("fj.E(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static hj a(int param0, int param1, hj param2, int param3, int param4, int param5) {
        hj var6 = null;
        RuntimeException var6_ref = null;
        hj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new hj(param5, param3);
            hj.a(param2, var6, param1, param4, 0, param0, param5, param3);
            stackIn_1_0 = (hj) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6_ref);

            stackIn_4_1 = new StringBuilder().append("fj.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    public static void b(byte param0) {
        field_p = null;
        field_s = null;
        field_q = null;
        int var1 = -99 / ((param0 - -1) / 60);
        field_o = null;
        field_r = null;
    }

    static {
        field_r = "Unpacking levels";
        field_p = "Snowcat";
    }
}
