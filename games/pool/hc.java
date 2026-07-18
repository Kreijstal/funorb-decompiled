/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    final static int a(int param0, int param1) {
        return fb.field_j[2047 & param1];
    }

    final static so a(eg param0, int[] param1, byte param2) {
        RuntimeException var3 = null;
        int[] var4 = null;
        eg[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        so var9 = null;
        so var10 = null;
        Object stackIn_3_0 = null;
        so stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        so stackOut_23_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            var9 = new so();
            var10 = var9;
            var9.field_d = param1;
            if (param2 == 101) {
              L1: {
                L2: {
                  var4 = new int[]{1, 1, 1};
                  ie.a(-2656, var4, param0);
                  if (var4[0] != 1) {
                    break L2;
                  } else {
                    if (var4[1] != 1) {
                      break L2;
                    } else {
                      if (1 != var4[2]) {
                        break L2;
                      } else {
                        var9.field_i = param0;
                        break L1;
                      }
                    }
                  }
                }
                d.a(param0, param2 + -23210);
                int discarded$3 = 1;
                var5 = cm.a(param0, var4);
                var6 = var5.length;
                var7 = 0;
                L3: while (true) {
                  if (var5.length <= var7) {
                    var10.field_b = new so[var6];
                    var6 = 0;
                    var7 = 0;
                    if (var5.length <= var7) {
                      break L1;
                    } else {
                      L4: {
                        int discarded$4 = -37;
                        nd.a(var5[var7]);
                        if (var5[var7].field_K <= 0) {
                          var7++;
                          break L4;
                        } else {
                          int incrementValue$5 = var6;
                          var6++;
                          var10.field_b[incrementValue$5] = nd.a(109, var5[var7], hp.a(var10.field_d, (byte) 32));
                          var7++;
                          break L4;
                        }
                      }
                      var7++;
                      var7++;
                      break L1;
                    }
                  } else {
                    L5: {
                      if (var5[var7].field_K == 0) {
                        var6--;
                        var7++;
                        break L5;
                      } else {
                        var7++;
                        break L5;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              }
              stackOut_23_0 = (so) var10;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (so) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("hc.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ')');
        }
        return stackIn_24_0;
    }

    static {
    }
}
