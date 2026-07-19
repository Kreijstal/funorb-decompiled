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
        br stackIn_12_0 = null;
        br stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        br stackOut_11_0 = null;
        br stackOut_19_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
                  L4: {
                    if (param0.field_h != 0) {
                      break L4;
                    } else {
                      if (0 == param0.field_c) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2_int = 0;
                  L5: while (true) {
                    if (kb.field_a <= var2_int) {
                      break L3;
                    } else {
                      var3 = aj.field_D[var2_int];
                      stackOut_11_0 = (br) (var3);
                      stackIn_20_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L6: {
                          if (stackIn_12_0.field_g != 2) {
                            break L6;
                          } else {
                            if (param0.field_h != var3.field_h) {
                              break L6;
                            } else {
                              if (var3.field_c == param0.field_c) {
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L7: {
                  if (null == param0.field_b) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                stackOut_19_0 = (br) (param0);
                stackIn_20_0 = stackOut_19_0;
                break L2;
              }
              dl.a(stackIn_20_0, (byte) 76);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("nn.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
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
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int decompiledRegionSelector0 = 0;
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
        boolean stackIn_4_0 = false;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_5_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 53 / ((55 - param1) / 52);
            L1: while (true) {
              L2: {
                if (param0 <= var2_int) {
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_3_0 = qn.field_d[var2_int];
                  stackIn_9_0 = stackOut_3_0 ? 1 : 0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    if (stackIn_4_0) {
                      var2_int++;
                      continue L1;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "nn.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                  var9 = -64 % ((param3 - -25) / 61);
                  param4[2].b(-var7 + param1 + param5, param2, param0);
                  lk.b(mo.field_t);
                  lk.e(param5 + var6_int, param2, -var7 + (param1 + param5), param2 - -param4[1].field_w);
                  var10 = param5 - -var6_int;
                  var11 = -var7 + param1 + param5;
                  param5 = var10;
                  L2: while (true) {
                    L3: {
                      if (param5 >= var11) {
                        lk.a(mo.field_t);
                        break L3;
                      } else {
                        param4[1].b(param5, param2, param0);
                        param5 = param5 + var8;
                        if (var12 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("nn.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
