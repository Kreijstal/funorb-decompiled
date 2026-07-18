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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
            var9 = var8 * param1.field_s - -var7;
            var10 = param3 * tc.field_j + (param4 + -1);
            var11 = 0;
            L5: while (true) {
              if (var6 <= var11) {
                break L0;
              } else {
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var5_int) {
                    var9 = var9 + (param1.field_s - var5_int);
                    var10 = var10 + (tc.field_j - param1.field_s);
                    var11++;
                    continue L5;
                  } else {
                    L7: {
                      if (0 != param1.field_z[var9]) {
                        if (param1.field_z[var9] != 16777215) {
                          var10++;
                          tc.field_b[var10] = param1.field_z[var9];
                          break L7;
                        } else {
                          var10++;
                          tc.field_b[var10] = param0;
                          break L7;
                        }
                      } else {
                        var10++;
                        break L7;
                      }
                    }
                    var9++;
                    var12++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("w.O(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + 109 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract int a(long param0, int param1);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
    }

    final static ok a(String[] args) {
        ok var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        int var4 = 0;
        String var5 = null;
        String[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          var2 = new ok();
          var3 = args;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              return var2;
            } else {
              var5 = var3[var4];
              var6 = ca.a((byte) -107, ' ', var5);
              var2.a(bg.a(0, var6), 116);
              var4++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("w.Q(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (args == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 55 + ')');
        }
    }

    abstract long a(int param0);

    abstract void b(byte param0);

    final int b(long param0, int param1) {
        long var4 = ((w) this).a(-123);
        if (!(0L >= var4)) {
            int discarded$0 = 45;
            qe.a(var4);
        }
        if (param1 <= 38) {
            return 20;
        }
        return ((w) this).a(param0, -35);
    }

    static {
    }
}
