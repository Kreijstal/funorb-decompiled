/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends ma {
    nb field_o;
    static String field_l;
    int field_n;
    ma field_m;

    public static void a(int param0) {
        field_l = null;
    }

    final void a(int param0, int param1, int param2) {
        ((kf) this).field_n = param0;
        ((kf) this).field_o.c(param1, param2 + ec.field_b * param0 >> 8);
    }

    final static void a(int param0, byte param1, int[] param2, int[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            param4++;
            L1: while (true) {
              param0--;
              var7 = 1;
              var5_int = param4;
              L2: while (true) {
                if (param0 < var5_int) {
                  if (var7 == 0) {
                    L3: {
                      var5_int = param0;
                      if (param4 > var5_int) {
                        break L3;
                      } else {
                        L4: {
                          if (param2[var5_int - 1] > param2[var5_int]) {
                            var6 = param2[var5_int + -1];
                            param2[var5_int - 1] = param2[var5_int];
                            param2[var5_int] = var6;
                            var6 = param3[-1 + var5_int];
                            param3[var5_int + -1] = param3[var5_int];
                            param3[var5_int] = var6;
                            var7 = 0;
                            break L4;
                          } else {
                            var5_int--;
                            break L4;
                          }
                        }
                        var5_int--;
                        var5_int--;
                        break L3;
                      }
                    }
                    if (var7 == 0) {
                      param4++;
                      continue L1;
                    } else {
                      break L0;
                    }
                  } else {
                    return;
                  }
                } else {
                  L5: {
                    if (param2[var5_int - 1] > param2[var5_int]) {
                      var6 = param2[-1 + var5_int];
                      param2[var5_int + -1] = param2[var5_int];
                      param2[var5_int] = var6;
                      var6 = param3[-1 + var5_int];
                      param3[var5_int + -1] = param3[var5_int];
                      var7 = 0;
                      param3[var5_int] = var6;
                      var5_int++;
                      break L5;
                    } else {
                      var5_int++;
                      break L5;
                    }
                  }
                  var5_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("kf.A(").append(param0).append(',').append(-104).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param4 + ')');
        }
    }

    kf(nb param0, ma param1) {
        try {
            ((kf) this).field_o = param0;
            ((kf) this).field_n = param0.j();
            ((kf) this).field_m = param1;
            ((kf) this).field_o.d(ec.field_b * ((kf) this).field_n + 128 >> 8);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "kf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Exploiting a bug";
    }
}
