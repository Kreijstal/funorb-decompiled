/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static qa field_c;
    private int[] field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12) {
        RuntimeException var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var18 = Main.field_T;
        try {
          L0: {
            param11 = (16711935 & param3 * (param11 & 16711935) >> 8) - -((16711925 & (param11 & 65280) * param3) >> 8);
            param3 = -param3 + 256;
            var13_int = param2;
            var14 = 37 % ((param4 - -19) / 61);
            var15 = -param0;
            L1: while (true) {
              if (var15 >= 0) {
                break L0;
              } else {
                int incrementValue$2 = param9;
                param9++;
                if (~incrementValue$2 != ~param10) {
                  param2 = var13_int;
                  var16 = -param7;
                  L2: while (true) {
                    if (var16 >= 0) {
                      var15++;
                      param6 = param6 + param1;
                      continue L1;
                    } else {
                      int incrementValue$3 = param2;
                      param2++;
                      if (~incrementValue$3 != ~param10) {
                        L3: {
                          var17 = param8[param6];
                          if (~param5 != ~var17) {
                            param8[param6] = bc.a(param3 * bc.a(var17, 65280) >> 8, 65280) + bc.a(bc.a(16711935, var17) * param3 >> 8, 16711935) + param11;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var16++;
                        param6++;
                        continue L2;
                      } else {
                        L4: {
                          var17 = param12;
                          if (var16 - -param12 > 0) {
                            var17 = -var16;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        param6 = param6 + var17;
                        param2 = 0;
                        var16 = var16 + var17;
                        continue L2;
                      }
                    }
                  }
                } else {
                  param9 = 0;
                  var15 = var15 + param12;
                  param6 = param6 + param12 * vj.field_l;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var13 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var13;
            stackOut_18_1 = new StringBuilder().append("ke.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param8 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        if (param0 == -100) {
          var3 = (((ke) this).field_a.length >> 1) + -1;
          var4 = var3 & param1;
          L0: while (true) {
            var5 = ((ke) this).field_a[var4 + (var4 - -1)];
            if (var5 != -1) {
              if (((ke) this).field_a[var4 + var4] == param1) {
                return var5;
              } else {
                var4 = var3 & 1 + var4;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          return 73;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
    }

    final static void a(dh param0, int param1, int param2) {
        w var5 = null;
        int var4 = 0;
        try {
            var5 = na.field_r;
            var5.h(param1, 0);
            var5.field_i = var5.field_i + 1;
            var4 = var5.field_i;
            var5.b(-9469, 1);
            var5.b(-9469, param0.field_n);
            var5.b(-9469, param0.field_l);
            var5.a(-246, param0.field_j);
            var5.a(-246, param0.field_i);
            var5.a(-246, param0.field_p);
            var5.a(-246, param0.field_h);
            int discarded$0 = var5.b(var4, (byte) 5);
            var5.f(-var4 + var5.field_i, 8049);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ke.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 21719 + 41);
        }
    }

    ke(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > (param0.length >> 1) + param0.length) {
                ((ke) this).field_a = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (-1 == ((ke) this).field_a[var4 + var4 - -1]) {
                            ((ke) this).field_a[var4 + var4] = param0[var3];
                            ((ke) this).field_a[var4 + (var4 - -1)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int - 1 & var4 - -1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((ke) this).field_a[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("ke.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new qa("email");
        field_b = "Names should contain a maximum of 12 characters";
    }
}
