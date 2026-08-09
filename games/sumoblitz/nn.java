/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nn {
    static ri[] field_a;

    final static void a(br param0, byte param1) {
        int var2_int = 0;
        br var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null == param0.field_e) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 >= 43) {
                  break L1;
                } else {
                  field_a = (ri[]) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param0.field_h != 0) {
                    break L3;
                  } else {
                    if (0 == param0.field_c) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int = 0;
                L4: while (true) {
                  if (kb.field_a <= var2_int) {
                    break L2;
                  } else {
                    L5: {
                      var3 = aj.field_D[var2_int];
                      if (var3.field_g != 2) {
                        break L5;
                      } else {
                        if (param0.field_h != var3.field_h) {
                          break L5;
                        } else {
                          if (var3.field_c == param0.field_c) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L4;
                  }
                }
              }
              L6: {
                if (null == param0.field_b) {
                  break L6;
                } else {
                  break L6;
                }
              }
              dl.a(param0, (byte) 76);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("nn.E(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 152 + 48 * var7 / param0;
                  var9 = var8 << -1856017616 | var8 << 984406600 | var8;
                  lk.field_a[param1 + lk.field_b * (var7 + param4)] = var9;
                  lk.field_a[(param4 - -var7) * lk.field_b + (param1 - -param2)] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var5), "nn.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 53 / ((55 - param1) / 52);
            L1: while (true) {
              if (param0 <= var2_int) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (qn.field_d[var2_int]) {
                  var2_int++;
                  continue L1;
                } else {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "nn.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    abstract byte[] a(boolean param0);

    abstract void a(byte[] param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, wb[] param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = Sumoblitz.field_L ? 1 : 0;
        if (param4 == null || param1 <= 0) {
            return;
        }
        try {
            var6_int = param4[0].field_z;
            var7 = param4[2].field_z;
            var8 = param4[1].field_z;
            param4[0].b(param5, param2, param0);
            int var9 = -64 % ((param3 - -25) / 61);
            param4[2].b(-var7 + param1 + param5, param2, param0);
            lk.b(mo.field_t);
            lk.e(param5 + var6_int, param2, -var7 + (param1 + param5), param2 - -param4[1].field_w);
            var10 = param5 - -var6_int;
            var11 = -var7 + param1 + param5;
            for (param5 = var10; param5 < var11; param5 = param5 + var8) {
                param4[1].b(param5, param2, param0);
            }
            lk.a(mo.field_t);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "nn.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 65 / ((-2 - param0) / 57);
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
