/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_d;
    byte[] field_c;
    int field_a;
    int field_k;
    static String field_l;
    static int[] field_j;
    int field_e;
    int field_i;
    int field_f;
    static String field_h;
    int field_b;
    static String field_m;
    byte[] field_g;

    final static int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (param1 != 1) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = param0 * var3_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                L2: {
                  if ((1 & param1) == 0) {
                    break L2;
                  } else {
                    var3_int = var3_int * param0;
                    break L2;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "nh.D(" + param0 + ',' + param1 + ',' + 26186 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(ti param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 >= 31) {
              L1: {
                if (((param0.field_m | param0.field_n) & 3) != 0) {
                  var2_int = 4 - (param0.field_n & 3);
                  var3 = -(3 & param0.field_m) + 4;
                  var4 = param0.field_n + var2_int;
                  var5 = new int[(param0.field_n + var2_int) * (param0.field_m + var3)];
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= param0.field_m) {
                      param0.field_u = param0.field_u - var2_int;
                      param0.field_n = param0.field_n + var2_int;
                      param0.field_l = param0.field_l - var3;
                      param0.field_w = var5;
                      param0.field_m = param0.field_m + var3;
                      break L1;
                    } else {
                      var7 = 0;
                      L3: while (true) {
                        if (var7 >= param0.field_n) {
                          var6++;
                          continue L2;
                        } else {
                          var5[(var6 + var3) * var4 - -var2_int - -var7] = param0.field_w[var7 + var6 * param0.field_n];
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("nh.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final static gd a(int param0, int param1, int param2, int param3, int param4, int param5) {
        gd var8 = new gd(param4, param2, param3, param1, param0, param5);
        int var9 = 0;
        rh.field_r.a((wf) (Object) var8, -107);
        ne.a((byte) 7, var8, 4);
        return var8;
    }

    public static void a() {
        field_l = null;
        field_j = null;
        field_h = null;
        field_m = null;
        int var1 = 0;
    }

    final static rj b() {
        try {
            Throwable var1 = null;
            rj stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            rj stackOut_0_0 = null;
            try {
              L0: {
                stackOut_0_0 = (rj) Class.forName("sk").newInstance();
                stackIn_1_0 = stackOut_0_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_1_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_l = "Discard";
        field_h = "Cancel";
        field_m = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
