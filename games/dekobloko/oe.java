/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oe extends ce implements ra {
    ce[] field_K;
    static vj field_I;
    static String[] field_M;
    static boolean[] field_L;
    static int[] field_J;
    static int field_H;
    static int field_G;

    final int d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ce[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ce var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = ((oe) this).field_K;
            var4 = 22 % ((36 - param0) / 51);
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3.length) {
                stackOut_7_0 = var2_int;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L2: {
                  var6 = var3[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    var7 = var6.d(-30);
                    if (~var2_int <= ~var7) {
                      break L2;
                    } else {
                      var2_int = var7;
                      break L2;
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "oe.DC(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    oe(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4, (kg) null);
    }

    final boolean a(boolean param0, ce param1) {
        ce[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ce var5 = null;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3 = ((oe) this).field_K;
            var4 = 0;
            L1: while (true) {
              if (~var3.length >= ~var4) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    ((oe) this).field_K = null;
                    break L2;
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (null == var5) {
                    break L3;
                  } else {
                    if (var5.a(false, param1)) {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    } else {
                      break L3;
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("oe.EC(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final boolean a(ce param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ce var5 = null;
        ce var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null == ((oe) this).field_K) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var4_int = ((oe) this).field_K.length - 1;
              L1: while (true) {
                if (var4_int < 0) {
                  stackOut_34_0 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((oe) this).field_K[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (var5.a(true)) {
                        var4_int = var4_int - 1;
                        L3: while (true) {
                          if (var4_int < 0) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((oe) this).field_K[var4_int];
                              if (null == var6) {
                                break L4;
                              } else {
                                if (var6.a(false, param0)) {
                                  stackOut_27_0 = 1;
                                  stackIn_28_0 = stackOut_27_0;
                                  return stackIn_28_0 != 0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var4_int = var4_int - 1;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4_int--;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var4;
            stackOut_36_1 = new StringBuilder().append("oe.P(");
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L5;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + 1 + ',' + 0 + ')');
        }
        return stackIn_35_0 != 0;
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ce[] var5 = null;
        int var6 = 0;
        ce var7 = null;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            super.a(param0, 102, param2, param3);
            if (((oe) this).field_K != null) {
              if (param1 > 38) {
                var5 = ((oe) this).field_K;
                var6 = 0;
                L1: while (true) {
                  if (~var5.length >= ~var6) {
                    break L0;
                  } else {
                    L2: {
                      var7 = var5[var6];
                      if (var7 != null) {
                        var7.a(param0, 109, param2 + ((oe) this).field_D, ((oe) this).field_u + param3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("oe.A(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != 0) {
                break L1;
              } else {
                param0 = 1;
                break L1;
              }
            }
            L2: {
              var7_int = 0;
              var8 = 65536 / param0;
              if (param3 == -1) {
                break L2;
              } else {
                field_H = -1;
                break L2;
              }
            }
            L3: {
              if (param6 >= hk.field_h) {
                break L3;
              } else {
                var7_int = var7_int + var8 * (hk.field_h - param6);
                param1 = param1 - (hk.field_h + -param6);
                param6 = hk.field_h;
                break L3;
              }
            }
            L4: {
              if (hk.field_c > param5) {
                param0 = param0 - (hk.field_c - param5);
                param5 = hk.field_c;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (hk.field_b >= param1 + param6) {
                break L5;
              } else {
                param1 = hk.field_b + -param6;
                break L5;
              }
            }
            L6: {
              if (hk.field_g < param5 - -param0) {
                param0 = hk.field_g - param5;
                break L6;
              } else {
                break L6;
              }
            }
            var9 = param5 + hk.field_j * (param6 - -param1);
            var10 = -param0;
            L7: while (true) {
              if (0 <= var10) {
                break L0;
              } else {
                var11 = -var7_int + 65536 >> 8;
                var12 = var7_int >> 8;
                var13 = (var11 * (param4 & 16711935) - -(var12 * (param2 & 16711935)) & -16711936) - -(16711680 & var12 * (65280 & param2) + (65280 & param4) * var11) >>> 8;
                var14 = -param1;
                L8: while (true) {
                  if (0 <= var14) {
                    var9++;
                    var7_int = var7_int + var8;
                    var10++;
                    continue L7;
                  } else {
                    hk.field_l[hk.field_j * var14 + var9] = var13;
                    var14++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var7, "oe.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_M = null;
            field_I = null;
            field_L = null;
            field_J = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "oe.N(" + true + ')');
        }
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        ce[] var7 = null;
        int var8 = 0;
        ce var9 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null != ((oe) this).field_K) {
              L1: {
                var7 = ((oe) this).field_K;
                if (param1 == 64) {
                  break L1;
                } else {
                  ((oe) this).a((ce) null, -80, 51, 84);
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                if (~var7.length >= ~var8) {
                  break L0;
                } else {
                  L3: {
                    var9 = var7[var8];
                    if (null != var9) {
                      var9.a(param0, param1, ((oe) this).field_u + param2, param3, param4 + ((oe) this).field_D, param5);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("oe.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        ce[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ce var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null == ((oe) this).field_K) {
              return;
            } else {
              var5 = ((oe) this).field_K;
              var6 = 0;
              L1: while (true) {
                if (var5.length <= var6) {
                  L2: {
                    if (3370 == 3370) {
                      break L2;
                    } else {
                      boolean discarded$113 = ((oe) this).a(85, -91, (ce) null, '￬');
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var7 = var5[var6];
                  StringBuilder discarded$114 = param0.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (var8 > param1) {
                      L4: {
                        if (var7 != null) {
                          StringBuilder discarded$115 = var7.a(param3, param1 - -1, param0, true);
                          break L4;
                        } else {
                          StringBuilder discarded$116 = param0.append("null");
                          break L4;
                        }
                      }
                      var6++;
                      continue L1;
                    } else {
                      StringBuilder discarded$117 = param0.append(' ');
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5_ref;
            stackOut_21_1 = new StringBuilder().append("oe.M(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          L6: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(3370).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              L1: {
                int discarded$2 = -98;
                if (null == this.a()) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "oe.TB(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static jc a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        jc stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        jc stackOut_13_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackOut_13_0 = be.field_x;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L2: {
                  var4 = param1.charAt(var3);
                  if (var4 < 48) {
                    break L2;
                  } else {
                    if (57 >= var4) {
                      var3++;
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                return (jc) (Object) stackIn_11_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("oe.U(").append(86).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0;
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        ce[] var2 = null;
        int var3 = 0;
        ce var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2 = ((oe) this).field_K;
            var3 = 0;
            L1: while (true) {
              if (~var3 <= ~var2.length) {
                L2: {
                  if (param0 == -95) {
                    break L2;
                  } else {
                    boolean discarded$2 = oe.a('ﾤ', -111);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var4 = var2[var3];
                  if (var4 != null) {
                    var4.d((byte) -95);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "oe.WB(" + param0 + ')');
        }
    }

    final static void c(boolean param0) {
        RuntimeException var1 = null;
        uf var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        wb var6 = null;
        String var7 = null;
        wb var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_13_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_61_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1_ref = de.field_V;
            var2 = var1_ref.d((byte) -25);
            if (var2 != 0) {
              if (1 != var2) {
                if (2 == var2) {
                  L1: {
                    if (1 == jj.field_b) {
                      jj.field_b = 2;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return;
                } else {
                  if (var2 != 3) {
                    if (4 != var2) {
                      qb.a((Throwable) null, 16408, "F1: " + qk.d((byte) 17));
                      si.a(100);
                      break L0;
                    } else {
                      jj.field_b = 1;
                      var3 = var1_ref.c((byte) -38);
                      f.field_w = var3.intern();
                      var4 = var1_ref.d((byte) -125);
                      nh.a((byte) 12, var4);
                      return;
                    }
                  } else {
                    L2: {
                      if (jj.field_b != 2) {
                        break L2;
                      } else {
                        jj.field_b = 1;
                        break L2;
                      }
                    }
                    return;
                  }
                }
              } else {
                L3: {
                  if (mc.field_a == null) {
                    mc.field_a = new nk(128);
                    md.field_Z = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var3 = var1_ref.c((byte) -38);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var4_ref_String = var1_ref.c((byte) -38);
                  var5 = var1_ref.c((byte) -38);
                  var6 = ed.a(var4_ref_String, (byte) -109);
                  if (null == var6) {
                    var6 = ed.a(var5, (byte) 71);
                    if (null != var6) {
                      int discarded$5 = 2;
                      mc.field_a.a((be) (Object) var6, -1, (long)kf.a((CharSequence) (Object) var4_ref_String).hashCode());
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var6 != null) {
                    break L6;
                  } else {
                    var6 = new wb();
                    int discarded$6 = 2;
                    mc.field_a.a((be) (Object) var6, -1, (long)kf.a((CharSequence) (Object) var4_ref_String).hashCode());
                    int fieldTemp$7 = md.field_Z;
                    md.field_Z = md.field_Z + 1;
                    var6.field_Xb = fieldTemp$7;
                    qi.field_S.a((bh) (Object) var6, 2777);
                    break L6;
                  }
                }
                L7: {
                  if (var3 == null) {
                    break L7;
                  } else {
                    var3 = var3.intern();
                    break L7;
                  }
                }
                var6.field_Vb = var3;
                var6.field_Ob = var4_ref_String;
                var6.field_Tb = var5;
                var6.b((byte) 125);
                var7_ref = (wb) (Object) qi.field_S.c((byte) 18);
                L8: while (true) {
                  L9: {
                    if (var7_ref == null) {
                      break L9;
                    } else {
                      if (!pn.a(var7_ref, var6, false)) {
                        break L9;
                      } else {
                        var7_ref = (wb) (Object) qi.field_S.d(true);
                        continue L8;
                      }
                    }
                  }
                  L10: {
                    if (null == var7_ref) {
                      qi.field_S.a((bh) (Object) var6, 2777);
                      break L10;
                    } else {
                      stackOut_61_0 = 121;
                      stackIn_63_0 = stackOut_61_0;
                      fm.a((byte) stackIn_63_0, (bh) (Object) var6, (bh) (Object) var7_ref);
                      break L10;
                    }
                  }
                  return;
                }
              }
            } else {
              L11: {
                if (null != hg.field_e) {
                  break L11;
                } else {
                  hg.field_e = new nk(128);
                  ed.field_g = 0;
                  break L11;
                }
              }
              L12: {
                if (var1_ref.d((byte) -111) != 1) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L12;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_13_0 = stackOut_10_0;
                  break L12;
                }
              }
              L13: {
                var3_int = stackIn_13_0;
                var4_ref_String = var1_ref.c((byte) -38);
                if (var3_int == 0) {
                  var5 = var4_ref_String;
                  break L13;
                } else {
                  var5 = var1_ref.c((byte) -38);
                  break L13;
                }
              }
              L14: {
                var6 = g.a(-3805, var4_ref_String);
                var7 = var1_ref.c((byte) -38);
                int discarded$8 = 2;
                var8 = kf.a((CharSequence) (Object) var4_ref_String);
                if (null == var8) {
                  var8 = var4_ref_String;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (null == var6) {
                  var6 = g.a(-3805, var7);
                  if (null == var6) {
                    break L15;
                  } else {
                    hg.field_e.a((be) (Object) var6, -1, (long)var8.hashCode());
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
              L16: {
                if (var6 == null) {
                  var6 = new wb();
                  hg.field_e.a((be) (Object) var6, -1, (long)var8.hashCode());
                  int fieldTemp$9 = ed.field_g;
                  ed.field_g = ed.field_g + 1;
                  var6.field_Xb = fieldTemp$9;
                  uf.field_z.a((bh) (Object) var6, 2777);
                  break L16;
                } else {
                  break L16;
                }
              }
              var6.field_Pb = var5;
              var6.field_Ob = var4_ref_String;
              var6.field_Tb = var7;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "oe.S(" + false + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        ce var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param2) {
                break L1;
              } else {
                if (null != ((oe) this).field_p) {
                  ((oe) this).field_p.a(true, param0, param3, (byte) -62, (ce) this);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null != ((oe) this).field_K) {
                var5_int = -1 + ((oe) this).field_K.length;
                L3: while (true) {
                  if (var5_int < 0) {
                    break L2;
                  } else {
                    L4: {
                      var6 = ((oe) this).field_K[var5_int];
                      if (var6 != null) {
                        var6.a(((oe) this).field_u + param0, -109, param2, param3 - -((oe) this).field_D);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var5_int--;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var5, "oe.C(" + param0 + ',' + -106 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        ce[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ce var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (((oe) this).field_K != null) {
              var8 = ((oe) this).field_K;
              var9 = 0;
              L1: while (true) {
                if (~var9 <= ~var8.length) {
                  L2: {
                    if (param6 == -55) {
                      break L2;
                    } else {
                      field_H = -1;
                      break L2;
                    }
                  }
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L3: {
                    var10 = var8[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (var10.a(param0, param1, param2, param3, param4 - -((oe) this).field_D, ((oe) this).field_u + param5, (byte) -55)) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var8_ref;
            stackOut_22_1 = new StringBuilder().append("oe.LB(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_21_0 != 0;
    }

    private final boolean b(ce param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ce var5 = null;
        ce var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null != ((oe) this).field_K) {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= ((oe) this).field_K.length) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((oe) this).field_K[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.a(true)) {
                        break L2;
                      } else {
                        var4_int = var4_int + 1;
                        L3: while (true) {
                          if (~var4_int <= ~((oe) this).field_K.length) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((oe) this).field_K[var4_int];
                              if (null == var6) {
                                break L4;
                              } else {
                                if (var6.a(false, param0)) {
                                  stackOut_23_0 = 1;
                                  stackIn_24_0 = stackOut_23_0;
                                  return stackIn_24_0 != 0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var4_int = var4_int + 1;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("oe.O(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + 1 + ',' + -128 + ')');
        }
        return stackIn_28_0 != 0;
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        Object stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (((oe) this).a(0, param1, param0, param2)) {
                ((oe) this).a((byte) 72, param2, param0, param1);
                this.a(param2, param1, 3370, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3) {
              stackOut_7_0 = (StringBuilder) param2;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (StringBuilder) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("oe.MB(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    private final boolean b(ce param0) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_3_0 = this.b(param0, 1, -128);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("oe.T(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 0 + ')');
        }
        return stackIn_4_0;
    }

    private final ce a() {
        ce[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        ce var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        ce stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_19_0 = null;
        ce stackOut_16_0 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (((oe) this).field_K == null) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ce) (Object) stackIn_5_0;
            } else {
              var3 = 0;
              var2 = ((oe) this).field_K;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2.length) {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L2: {
                    var5 = var2[var4];
                    if (null == var5) {
                      break L2;
                    } else {
                      if (var5.a(true)) {
                        stackOut_16_0 = (ce) var5;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2_ref, "oe.J(" + -98 + ')');
        }
        return (ce) (Object) stackIn_20_0;
    }

    final static int b(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              param1--;
              param1 = param1 | param1 >>> 1;
              param1 = param1 | param1 >>> 2;
              if (param0 == -10498) {
                break L1;
              } else {
                boolean discarded$2 = oe.a('ﾏ', -43);
                break L1;
              }
            }
            param1 = param1 | param1 >>> 4;
            param1 = param1 | param1 >>> 8;
            param1 = param1 | param1 >>> 16;
            stackOut_3_0 = param1 + 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "oe.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_7_0 = 0;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (!j.a(-8241, param0)) {
                L1: {
                  var2 = sc.field_o;
                  if (param1 == -6237) {
                    break L1;
                  } else {
                    oe.a(35, -84, -82, 125, 125, -43, -29);
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  if (var2.length <= var3) {
                    var2 = oh.field_f;
                    var3 = 0;
                    L3: while (true) {
                      if (~var2.length >= ~var3) {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param0 != var4) {
                          var3++;
                          continue L3;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0 != 0;
                        }
                      }
                    }
                  } else {
                    var4 = var2[var3];
                    if (param0 == var4) {
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2_ref, "oe.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_30_0 != 0;
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        ce[] var6 = null;
        int var7 = 0;
        ce var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_26_0 = false;
        boolean stackOut_24_0 = false;
        int stackOut_28_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (((oe) this).field_K != null) {
              var5_int = -117 % ((param0 - -22) / 49);
              var6 = ((oe) this).field_K;
              var7 = 0;
              L1: while (true) {
                if (~var6.length >= ~var7) {
                  var5_int = param1;
                  if (var5_int == 80) {
                    L2: {
                      if (!bj.field_d[81]) {
                        int discarded$2 = 0;
                        stackOut_26_0 = this.b(param2);
                        stackIn_27_0 = stackOut_26_0;
                        break L2;
                      } else {
                        int discarded$3 = 113;
                        stackOut_24_0 = this.a(param2);
                        stackIn_27_0 = stackOut_24_0;
                        break L2;
                      }
                    }
                    return stackIn_27_0;
                  } else {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  }
                } else {
                  L3: {
                    var8 = var6[var7];
                    if (null == var8) {
                      break L3;
                    } else {
                      if (!var8.a(true)) {
                        break L3;
                      } else {
                        if (var8.a(98, param1, param2, param3)) {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("oe.QA(").append(param0).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L4;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param3 + ')');
        }
        return stackIn_29_0 != 0;
    }

    final String c(byte param0) {
        ce[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ce var4 = null;
        String var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        String stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (((oe) this).field_K != null) {
              var2 = ((oe) this).field_K;
              var3 = 0;
              L1: while (true) {
                if (var3 >= var2.length) {
                  L2: {
                    if (param0 == 113) {
                      break L2;
                    } else {
                      ((oe) this).field_K = null;
                      break L2;
                    }
                  }
                  stackOut_18_0 = null;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L3: {
                    var4 = var2[var3];
                    if (null == var4) {
                      break L3;
                    } else {
                      var5 = var4.c((byte) 113);
                      if (var5 != null) {
                        stackOut_12_0 = (String) var5;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2_ref, "oe.R(" + param0 + ')');
        }
        return (String) (Object) stackIn_19_0;
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        ce[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ce var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        ce stackIn_11_0 = null;
        ce stackIn_13_0 = null;
        ce stackIn_15_0 = null;
        ce stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        ce stackOut_10_0 = null;
        ce stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ce stackOut_11_0 = null;
        ce stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (((oe) this).field_K != null) {
              L1: {
                if (!param6) {
                  break L1;
                } else {
                  field_G = -21;
                  break L1;
                }
              }
              var8 = ((oe) this).field_K;
              var9 = 0;
              L2: while (true) {
                if (var8.length <= var9) {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                } else {
                  L3: {
                    var10 = var8[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      L4: {
                        stackOut_10_0 = (ce) var10;
                        stackIn_15_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (param6) {
                          stackOut_15_0 = (ce) (Object) stackIn_15_0;
                          stackOut_15_1 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          break L4;
                        } else {
                          stackOut_11_0 = (ce) (Object) stackIn_11_0;
                          stackIn_13_0 = stackOut_11_0;
                          stackOut_13_0 = (ce) (Object) stackIn_13_0;
                          stackOut_13_1 = 1;
                          stackIn_16_0 = stackOut_13_0;
                          stackIn_16_1 = stackOut_13_1;
                          break L4;
                        }
                      }
                      if (((ce) (Object) stackIn_16_0).a(stackIn_16_1 == 0)) {
                        break L3;
                      } else {
                        if (!var10.a(param0, param1, param2, param3, param4, param5, false)) {
                          break L3;
                        } else {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var8_ref;
            stackOut_25_1 = new StringBuilder().append("oe.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_24_0 != 0;
    }

    private final boolean a(ce param0) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_3_0 = this.a(param0, 1, 0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("oe.V(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 113 + ')');
        }
        return stackIn_4_0;
    }

    abstract void g(int param0);

    final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.b(param0, param1, param2, param3, -16555);
              if (param4 == -16555) {
                break L1;
              } else {
                int discarded$2 = oe.b(71, 20);
                break L1;
              }
            }
            ((oe) this).g(30);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var6, "oe.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new String[]{"Showing by rating", "Showing by win percentage"};
        field_I = new vj();
        field_J = new int[8];
    }
}
