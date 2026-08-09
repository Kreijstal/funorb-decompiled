/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w {
    static hj field_c;
    static uf field_a;
    static int field_b;

    final static void a(int param0, hj param1, int param2, int param3, int param4) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
              if (-641 > (var5_int + param4 ^ -1)) {
                var5_int = -param4 + 640;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 < (param3 ^ -1)) {
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
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("w.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract int a(long param0, int param1);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 <= 68) {
            String[] var2 = (String[]) null;
            w.a((String[]) null, (byte) -85);
        }
    }

    final static ok a(String[] args, byte param1) {
        ok var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        int var4 = 0;
        String var5 = null;
        String[] var6 = null;
        int var7 = 0;
        ok stackIn_6_0 = null;
        ok stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var2 = new ok();
            var3 = args;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                if (param1 == 55) {
                  stackIn_8_0 = (ok) (var2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = (ok) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("w.Q(");

            if (args == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    abstract long a(int param0);

    abstract void b(byte param0);

    final int b(long param0, int param1) {
        long var4 = this.a(-123);
        if (!(0L >= var4)) {
            qe.a(var4, (byte) 45);
        }
        if (param1 <= 38) {
            return 20;
        }
        return this.a(param0, -35);
    }

    static {
    }
}
