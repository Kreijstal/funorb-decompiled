/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hs {
    int field_d;
    int field_b;
    private cda[] field_a;
    static String field_c;
    private su field_e;

    final static boolean a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            if (!lna.field_q) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var1_int = 114 % (param0 / 55);
              if (gk.field_d != 0) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "hs.B(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final nla a(int param0, byte param1) {
        RuntimeException var3 = null;
        nla var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        dha var11 = null;
        int var12 = 0;
        int var13 = 0;
        nla stackIn_8_0 = null;
        nla stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        nla stackOut_7_0 = null;
        nla stackOut_11_0 = null;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var3_ref = new nla();
                  var4 = -13 / ((param1 - 34) / 41);
                  var5 = this.a(param0, 376);
                  if (param0 != ((hs) this).field_a[var5].field_a) {
                    break L3;
                  } else {
                    var3_ref.a(((hs) this).field_a[var5], true);
                    if (var13 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = 0;
                L4: while (true) {
                  if (var6 >= 11) {
                    break L2;
                  } else {
                    var7 = (double)this.a((byte) -95, param0);
                    var9 = (double)(param0 - ((hs) this).field_a[var5].field_a);
                    var11 = ((hs) this).field_e.field_f[var6][var5].a(var9 / var7, 81);
                    var3_ref.field_g[var6].field_h = var11.field_c;
                    var3_ref.field_g[var6].field_l = var11.field_a;
                    var11 = ((hs) this).field_e.field_d[var6][var5].a(var9 / var7, 72);
                    var3_ref.field_g[var6].field_d = var11.field_c;
                    var3_ref.field_g[var6].field_e = var11.field_a;
                    var12 = ((hs) this).field_e.field_b[var6][var5].a((int)var9, (byte) -52);
                    stackOut_7_0 = (nla) var3_ref;
                    stackIn_12_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var13 != 0) {
                      break L1;
                    } else {
                      stackIn_8_0.field_g[var6].field_j = var12;
                      var6++;
                      if (var13 == 0) {
                        continue L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_11_0 = (nla) var3_ref;
              stackIn_12_0 = stackOut_11_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "hs.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    private final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -95) {
                break L1;
              } else {
                nla discarded$2 = ((hs) this).a(-51, (byte) 112);
                break L1;
              }
            }
            L2: {
              var3_int = this.a(param1, 376);
              if (null == ((hs) this).field_a[var3_int]) {
                break L2;
              } else {
                if (null != ((hs) this).field_a[var3_int + 1]) {
                  stackOut_9_0 = ((hs) this).field_a[var3_int + 1].field_a + -((hs) this).field_a[var3_int].field_a;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_7_0 = -1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "hs.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    private final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1 == 376) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (~var3_int <= ~((hs) this).field_a.length) {
                    break L2;
                  } else {
                    L3: {
                      if (((hs) this).field_a[var3_int] == null) {
                        break L3;
                      } else {
                        if (~((hs) this).field_a[var3_int].field_a >= ~param0) {
                          break L3;
                        } else {
                          stackOut_10_0 = -1 + var3_int;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0;
                        }
                      }
                    }
                    var3_int++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 113;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "hs.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final static boolean a(char param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < 32) {
                break L1;
              } else {
                if (param0 > 126) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            if (param1 == 376) {
              L2: {
                if (param0 < 160) {
                  break L2;
                } else {
                  if (param0 > 255) {
                    break L2;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
              L3: {
                if (param0 == 8364) {
                  break L3;
                } else {
                  if (338 == param0) {
                    break L3;
                  } else {
                    if (8212 == param0) {
                      break L3;
                    } else {
                      if (param0 == 339) {
                        break L3;
                      } else {
                        if (376 == param0) {
                          break L3;
                        } else {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_30_0 = 1;
              stackIn_31_0 = stackOut_30_0;
              return stackIn_31_0 != 0;
            } else {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "hs.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_33_0 != 0;
    }

    final static boolean a(boolean param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = 0;
            if (!param0) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= 8) {
                      break L3;
                    } else {
                      stackOut_5_0 = -1;
                      stackIn_15_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0 != ~param1[var2_int]) {
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        } else {
                          var2_int++;
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("hs.G(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    hs(int param0, int param1, cda[] param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((hs) this).field_a = param2;
            ((hs) this).field_b = param3;
            ((hs) this).field_d = param1;
            ((hs) this).field_e = new su(((hs) this).field_a);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hs.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_c = null;
            if (param0 != -127) {
                field_c = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hs.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Cleared!";
    }
}
