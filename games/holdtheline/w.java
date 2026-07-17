/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w {
    static hj field_c;
    static uf field_a;
    static int field_b;

    final static void a(int param0, hj param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5_int = param1.field_s;
              var6 = param1.field_y;
              var7 = 0;
              if (param4 < 0) {
                var7 = -param4;
                var5_int = var5_int + param4;
                param4 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = 0;
              if (-641 > var5_int + param4) {
                var5_int = -param4 + 640;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 > param3) {
                var6 = var6 + param3;
                var8 = -param3;
                param3 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param3 + var6 <= 480) {
                break L4;
              } else {
                var6 = 480 - param3;
                break L4;
              }
            }
            L5: {
              if (param2 > 86) {
                break L5;
              } else {
                field_b = 92;
                break L5;
              }
            }
            var9 = var8 * param1.field_s - -var7;
            var10 = param3 * tc.field_j + (param4 + -1);
            var11 = 0;
            L6: while (true) {
              if (var6 <= var11) {
                break L0;
              } else {
                var12 = 0;
                L7: while (true) {
                  if (var12 >= var5_int) {
                    var9 = var9 + (param1.field_s - var5_int);
                    var10 = var10 + (tc.field_j - param1.field_s);
                    var11++;
                    continue L6;
                  } else {
                    L8: {
                      if (0 != param1.field_z[var9]) {
                        if (param1.field_z[var9] != 16777215) {
                          var10++;
                          tc.field_b[var10] = param1.field_z[var9];
                          break L8;
                        } else {
                          var10++;
                          tc.field_b[var10] = param0;
                          break L8;
                        }
                      } else {
                        var10++;
                        break L8;
                      }
                    }
                    var9++;
                    var12++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("w.O(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    abstract int a(long param0, int param1);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
    }

    final static ok a(String[] args, byte param1) {
        ok var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        int var4 = 0;
        String var5 = null;
        String[] var6 = null;
        int var7 = 0;
        Object stackIn_6_0 = null;
        ok stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ok stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var2 = new ok();
            var3 = args;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                if (param1 == 55) {
                  stackOut_7_0 = (ok) var2;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_5_0 = null;
                  stackIn_6_0 = stackOut_5_0;
                  return (ok) (Object) stackIn_6_0;
                }
              } else {
                var5 = var3[var4];
                var6 = ca.a((byte) -107, ' ', var5);
                var2.a(bg.a(0, var6), param1 ^ 67);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("w.Q(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (args == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    abstract long a(int param0);

    abstract void b(byte param0);

    final int b(long param0, int param1) {
        long var4 = ((w) this).a(-123);
        if (!(0L >= var4)) {
            qe.a(var4, (byte) 45);
        }
        if (param1 <= 38) {
            return 20;
        }
        return ((w) this).a(param0, -35);
    }

    static {
    }
}
