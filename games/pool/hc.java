/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    final static int a(int param0, int param1) {
        if (param0 != 2047) {
            return -81;
        }
        return fb.field_j[2047 & param1];
    }

    final static so a(eg param0, int[] param1, byte param2) {
        int incrementValue$1 = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        eg[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        so var9 = null;
        so var10 = null;
        so stackIn_3_0 = null;
        so stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        so stackOut_21_0 = null;
        so stackOut_2_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
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
                var5 = cm.a(param0, var4, true);
                var6 = var5.length;
                var7 = 0;
                L3: while (true) {
                  if (var5.length <= var7) {
                    var10.field_b = new so[var6];
                    var6 = 0;
                    var7 = 0;
                    L4: while (true) {
                      if (var5.length <= var7) {
                        break L1;
                      } else {
                        L5: {
                          nd.a(var5[var7], (byte) -37);
                          if ((var5[var7].field_K ^ -1) >= -1) {
                            break L5;
                          } else {
                            incrementValue$1 = var6;
                            var6++;
                            var10.field_b[incrementValue$1] = nd.a(109, var5[var7], hp.a(var10.field_d, (byte) 32));
                            break L5;
                          }
                        }
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if (var5[var7].field_K == 0) {
                        var6--;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              }
              stackOut_21_0 = (so) (var10);
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (so) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("hc.B(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_22_0;
        }
    }

    static {
    }
}
