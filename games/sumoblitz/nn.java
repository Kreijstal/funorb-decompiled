/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nn {
    static ri[] field_a;

    final static void a(br param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        br var3 = null;
        int var4 = 0;
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
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null == param0.field_e) {
              return;
            } else {
              L1: {
                L2: {
                  if (param0.field_h != 0) {
                    break L2;
                  } else {
                    if (0 == param0.field_c) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (kb.field_a <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = aj.field_D[var2_int];
                      if (var3.field_g != 2) {
                        break L4;
                      } else {
                        if (param0.field_h != var3.field_h) {
                          break L4;
                        } else {
                          if (var3.field_c == param0.field_c) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == param0.field_b) {
                  break L5;
                } else {
                  break L5;
                }
              }
              dl.a(param0, (byte) 76);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("nn.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 60 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            lk.f(param1, param4, 1 + param2, 10000536);
            lk.f(param1, param4 - -param0, 1 + param2, 12105912);
            var5_int = 1;
            if (param3 == -84) {
              L1: {
                var6 = param0;
                if (lk.field_i <= var5_int + param4) {
                  break L1;
                } else {
                  var5_int = -param4 + lk.field_i;
                  break L1;
                }
              }
              L2: {
                if (param4 + var6 <= lk.field_e) {
                  break L2;
                } else {
                  var6 = lk.field_e + -param4;
                  break L2;
                }
              }
              var7 = var5_int;
              L3: while (true) {
                if (var6 <= var7) {
                  break L0;
                } else {
                  var8 = 152 + 48 * var7 / param0;
                  var9 = var8 << 16 | var8 << 8 | var8;
                  lk.field_a[param1 + lk.field_b * (var7 + param4)] = var9;
                  lk.field_a[(param4 - -var7) * lk.field_b + (param1 - -param2)] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var5, "nn.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract byte[] a(int param0, int param1, int param2);

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = -53;
            L1: while (true) {
              if (var2_int >= 25) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if (qn.field_d[var2_int]) {
                  var2_int++;
                  continue L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "nn.C(" + 25 + ',' + 115 + ')');
        }
        return stackIn_8_0 != 0;
    }

    abstract byte[] a(boolean param0);

    abstract void a(byte[] param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, wb[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (param1 > 0) {
                  var6_int = param4[0].field_z;
                  var7 = param4[2].field_z;
                  var8 = param4[1].field_z;
                  param4[0].b(param5, param2, param0);
                  var9 = 0;
                  param4[2].b(-var7 + param1 + param5, param2, param0);
                  lk.b(mo.field_t);
                  lk.e(param5 + var6_int, param2, -var7 + (param1 + param5), param2 - -param4[1].field_w);
                  var10 = param5 - -var6_int;
                  var11 = -var7 + param1 + param5;
                  param5 = var10;
                  L2: while (true) {
                    if (param5 >= var11) {
                      lk.a(mo.field_t);
                      break L0;
                    } else {
                      param4[1].b(param5, param2, param0);
                      param5 = param5 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("nn.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(67).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 65;
        field_a = null;
    }

    final static void b(int param0, int param1) {
        if (param1 > -95) {
            nn.a(27, 41, -94, (byte) -104, 35);
        }
    }

    static {
    }
}
