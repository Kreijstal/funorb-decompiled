/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_a;
    static pb field_b;
    static v field_d;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 84) {
            pb[] var2 = (pb[]) null;
            q.a(-104, (pb[]) null);
        }
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
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
        int[] var14 = null;
        var13 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param4 <= param1) {
                break L1;
              } else {
                L2: {
                  var5_int = (param4 + param1) / 2;
                  var6 = param1;
                  var7 = param2[var5_int];
                  param2[var5_int] = param2[param4];
                  param2[param4] = var7;
                  var8 = param3[var5_int];
                  param3[var5_int] = param3[param4];
                  param3[param4] = var8;
                  if (var7 != 2147483647) {
                    stackIn_5_0 = 1;
                    break L2;
                  } else {
                    stackIn_5_0 = 0;
                    break L2;
                  }
                }
                var9 = stackIn_5_0;
                var10 = param1;
                L3: while (true) {
                  if (var10 >= param4) {
                    param2[param4] = param2[var6];
                    param2[var6] = var7;
                    param3[param4] = param3[var6];
                    param3[var6] = var8;
                    q.a(1, param1, param2, param3, var6 + -1);
                    q.a(param0 + 0, var6 + 1, param2, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if ((var7 - (var9 & var10) ^ -1) > (param2[var10] ^ -1)) {
                        var11 = param2[var10];
                        param2[var10] = param2[var6];
                        param2[var6] = var11;
                        var12 = param3[var10];
                        param3[var10] = param3[var6];
                        incrementValue$0 = var6;
                        var6++;
                        param3[incrementValue$0] = var12;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              }
            }
            L5: {
              if (param0 == 1) {
                break L5;
              } else {
                var14 = (int[]) null;
                q.a(-111, -13, (int[]) null, (int[]) null, 22);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("q.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, pb[] param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ed.field_a = param1;
              if (param0 > 58) {
                break L1;
              } else {
                var3 = (int[]) null;
                q.a(84, -14, (int[]) null, (int[]) null, 119);
                break L1;
              }
            }
            L2: {
              if (ed.field_a == null) {
                break L2;
              } else {
                if (param1.length < 3) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("q.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_a = 0;
        field_c = 0;
    }
}
