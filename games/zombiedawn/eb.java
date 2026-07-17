/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb implements io {
    static vn field_b;
    static int field_a;
    static vo field_d;
    static int field_c;

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (param3.field_n < var6_int) {
                L2: {
                  var6_int = 1;
                  if (param0 == 16777215) {
                    break L2;
                  } else {
                    field_a = -128;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var6_int > 5) {
                    break L0;
                  } else {
                    L4: {
                      var7 = -5 + (param4 + param3.field_k + param3.field_i) + (-(param3.field_i >> 1) - -var6_int);
                      var8 = -(var6_int * 2) + (param3.field_i >> 1);
                      var9 = var6_int + ((param3.field_n - 4 >> 1) + param3.field_j) + param2;
                      if (bi.field_l > var9) {
                        break L4;
                      } else {
                        if (bi.field_d <= var9) {
                          break L4;
                        } else {
                          L5: {
                            if (bi.field_g >= var7) {
                              break L5;
                            } else {
                              bi.field_c[var9 * bi.field_f + var7 - 1] = eg.a(bi.field_c[-1 + (var9 * bi.field_f - -var7)], 16711422) >> 1;
                              break L5;
                            }
                          }
                          if (var8 + var7 >= bi.field_b) {
                            break L4;
                          } else {
                            bi.field_c[bi.field_f * var9 - (-var7 - var8)] = eg.a(bi.field_c[var8 + (bi.field_f * var9 + var7)] >> 1, 8355711);
                            break L4;
                          }
                        }
                      }
                    }
                    bi.b(var7, var9, var8, 0);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                var7 = 152 - -(48 * var6_int / param3.field_n);
                var8 = var7 | (var7 << 16 | var7 << 8);
                bi.b(param3.field_k + param4, var6_int + param2 - -param3.field_j, param3.field_i, var8);
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("eb.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_b = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: while (true) {
              param2--;
              if (param2 < 0) {
                break L0;
              } else {
                var9 = param0;
                var5 = var9;
                var6 = param3;
                var7 = param4;
                var9[var6] = var7 + eg.a(var9[var6] >> 1, 8355711);
                param3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("eb.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 1393669633 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
    }
}
