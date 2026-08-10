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
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = this.field_K;
            var4 = 22 % ((36 - param0) / 51);
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3.length) {
                stackIn_8_0 = var2_int;
                break L0;
              } else {
                L2: {
                  var6 = var3[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    var7 = var6.d(-30);
                    if ((var2_int ^ -1) <= (var7 ^ -1)) {
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
          throw dh.a((Throwable) ((Object) var2), "oe.DC(" + param0 + ')');
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3 = this.field_K;
            var4 = 0;
            L1: while (true) {
              if ((var3.length ^ -1) >= (var4 ^ -1)) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    this.field_K = (ce[]) null;
                    break L2;
                  }
                }
                stackIn_18_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (null == var5) {
                    break L3;
                  } else {
                    if (var5.a(false, param1)) {
                      stackIn_12_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("oe.EC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    private final boolean a(ce param0, int param1, int param2) {
        int var4_int = 0;
        ce var5 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ce var6 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null == this.field_K) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = this.field_K.length - 1;
              L1: while (true) {
                if ((var4_int ^ -1) > -1) {
                  L2: {
                    if (param2 == 0) {
                      break L2;
                    } else {
                      oe.a(-94, -2, 108, 7, 101, 46, -99);
                      break L2;
                    }
                  }
                  stackIn_35_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_K[var4_int];
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.a(true)) {
                        var4_int = var4_int - param1;
                        L4: while (true) {
                          if ((var4_int ^ -1) > -1) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_K[var4_int];
                              if (null == var6) {
                                break L5;
                              } else {
                                if (var6.a(false, param0)) {
                                  stackIn_28_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4_int = var4_int - param1;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
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
          L6: {
            var4 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var4);

            stackIn_39_1 = new StringBuilder().append("oe.P(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L6;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0 != 0;
          } else {
            return stackIn_35_0 != 0;
          }
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ce[] var5 = null;
        int var6 = 0;
        ce var7 = null;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            super.a(param0, 102, param2, param3);
            if (this.field_K != null) {
              if (param1 > 38) {
                var5 = this.field_K;
                var6 = 0;
                L1: while (true) {
                  if ((var5.length ^ -1) >= (var6 ^ -1)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      var7 = var5[var6];
                      if (var7 != null) {
                        var7.a(param0, 109, param2 + this.field_D, this.field_u + param3);
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
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (runtimeException);

            stackIn_18_1 = new StringBuilder().append("oe.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
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
                var11 = -var7_int + 65536 >> 1531409928;
                var12 = var7_int >> -1962121400;
                var13 = (var11 * (param4 & 16711935) - -(var12 * (param2 & 16711935)) & -16711936) - -(16711680 & var12 * (65280 & param2) + (65280 & param4) * var11) >>> 1249901160;
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
          throw dh.a((Throwable) ((Object) var7), "oe.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void b(boolean param0) {
        field_M = null;
        field_I = null;
        field_L = null;
        if (!param0) {
            return;
        }
        try {
            field_J = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "oe.N(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        ce[] var7 = null;
        int var8 = 0;
        ce var9 = null;
        int var10 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null != this.field_K) {
              L1: {
                var7 = this.field_K;
                if (param1 == 64) {
                  break L1;
                } else {
                  this.a((ce) null, -80, 51, 84);
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                if ((var7.length ^ -1) >= (var8 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var7[var8];
                    if (null != var9) {
                      var9.a(param0, param1 + 0, this.field_u + param2, param3, param4 + this.field_D, param5);
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (runtimeException);

            stackIn_19_1 = new StringBuilder().append("oe.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        ce[] var5 = null;
        int var6 = 0;
        ce var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null == this.field_K) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = this.field_K;
              var6 = 0;
              L1: while (true) {
                if (var5.length <= var6) {
                  L2: {
                    if (param2 == 3370) {
                      break L2;
                    } else {
                      this.a(85, -91, (ce) null, '￬');
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var5[var6];
                  discarded$10 = param0.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (var8 > param1) {
                      L4: {
                        if (var7 != null) {
                          var7.a(param3, param1 - -1, param0, true);
                          break L4;
                        } else {
                          discarded$11 = param0.append("null");
                          break L4;
                        }
                      }
                      var6++;
                      continue L1;
                    } else {
                      discarded$12 = param0.append(' ');
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
            stackIn_24_0 = (RuntimeException) (var5_ref);

            stackIn_24_1 = new StringBuilder().append("oe.M(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (null == this.a(-98)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "oe.TB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static jc a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        jc stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 > 64) {
                break L1;
              } else {
                oe.c(true);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= var2_int) {
                stackIn_14_0 = be.field_x;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var4 = param1.charAt(var3);
                  if (-49 < (var4 ^ -1)) {
                    break L3;
                  } else {
                    if (57 >= var4) {
                      var3++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_11_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("oe.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jc) ((Object) stackIn_11_0);
        } else {
          return stackIn_14_0;
        }
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
            var2 = this.field_K;
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= (var2.length ^ -1)) {
                L2: {
                  if (param0 == -95) {
                    break L2;
                  } else {
                    oe.a('ﾤ', -111);
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
          throw dh.a((Throwable) ((Object) runtimeException), "oe.WB(" + param0 + ')');
        }
    }

    final static void c(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_57_0 = false;
        int stackIn_64_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_56_0;
        uf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        wb var6 = null;
        wb var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              var1 = de.field_V;
              var2 = var1.d((byte) -25);
              if (-1 != (var2 ^ -1)) {
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
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((var2 ^ -1) != -4) {
                      if (4 != var2) {
                        qb.a((Throwable) null, 16408, "F1: " + qk.d((byte) 17));
                        si.a(100);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        jj.field_b = 1;
                        var3 = var1.c((byte) -38);
                        f.field_w = ((String) (var3)).intern();
                        var4 = var1.d((byte) -125);
                        nh.a((byte) 12, var4);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      L2: {
                        if ((jj.field_b ^ -1) != -3) {
                          break L2;
                        } else {
                          jj.field_b = 1;
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
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
                    var3 = var1.c((byte) -38);
                    if (((String) (var3)).equals("")) {
                      var3 = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    var4_ref_String = var1.c((byte) -38);
                    var5 = var1.c((byte) -38);
                    var6 = ed.a(var4_ref_String, (byte) -109);
                    if (null == var6) {
                      var6 = ed.a(var5, (byte) 71);
                      if (null != var6) {
                        mc.field_a.a(var6, -1, (long)kf.a((CharSequence) ((Object) var4_ref_String), (byte) 2).hashCode());
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
                      mc.field_a.a(var6, -1, (long)kf.a((CharSequence) ((Object) var4_ref_String), (byte) 2).hashCode());
                      fieldTemp$0 = md.field_Z;
                      md.field_Z = md.field_Z + 1;
                      var6.field_Xb = fieldTemp$0;
                      qi.field_S.a(var6, 2777);
                      break L6;
                    }
                  }
                  L7: {
                    if (var3 == null) {
                      break L7;
                    } else {
                      var3 = ((String) (var3)).intern();
                      break L7;
                    }
                  }
                  var6.field_Vb = (String) (var3);
                  var6.field_Ob = var4_ref_String;
                  var6.field_Tb = var5;
                  var6.b((byte) 125);
                  var7 = (wb) ((Object) qi.field_S.c((byte) 18));
                  L8: while (true) {
                    L9: {
                      L10: {
                        L11: {
                          if (var7 == null) {
                            break L11;
                          } else {
                            stackOut_56_0 = pn.a(var7, var6, false);
                            stackIn_64_0 = stackOut_56_0 ? 1 : 0;
                            stackIn_57_0 = stackOut_56_0;
                            if (!stackIn_57_0) {
                              break L11;
                            } else {
                              var7 = (wb) ((Object) qi.field_S.d(true));
                              continue L8;
                            }
                          }
                        }
                        if (null == var7) {
                          qi.field_S.a(var6, 2777);
                          break L9;
                        } else {
                          stackIn_64_0 = 121;
                          break L10;
                        }
                      }
                      fm.a((byte) stackIn_64_0, var6, var7);
                      break L9;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                L12: {
                  if (null != hg.field_e) {
                    break L12;
                  } else {
                    hg.field_e = new nk(128);
                    ed.field_g = 0;
                    break L12;
                  }
                }
                L13: {
                  if ((var1.d((byte) -111) ^ -1) != -2) {
                    stackIn_13_0 = 0;
                    break L13;
                  } else {
                    stackIn_13_0 = 1;
                    break L13;
                  }
                }
                L14: {
                  var3_int = stackIn_13_0;
                  var4_ref_String = var1.c((byte) -38);
                  if (var3_int == 0) {
                    var5 = var4_ref_String;
                    break L14;
                  } else {
                    var5 = var1.c((byte) -38);
                    break L14;
                  }
                }
                L15: {
                  var6 = g.a(-3805, var4_ref_String);
                  var7_ref = var1.c((byte) -38);
                  var8 = kf.a((CharSequence) ((Object) var4_ref_String), (byte) 2);
                  if (null == var8) {
                    var8 = var4_ref_String;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (null == var6) {
                    var6 = g.a(-3805, var7_ref);
                    if (null == var6) {
                      break L16;
                    } else {
                      hg.field_e.a(var6, -1, (long)var8.hashCode());
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var6 == null) {
                    var6 = new wb();
                    hg.field_e.a(var6, -1, (long)var8.hashCode());
                    fieldTemp$1 = ed.field_g;
                    ed.field_g = ed.field_g + 1;
                    var6.field_Xb = fieldTemp$1;
                    uf.field_z.a(var6, 2777);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                var6.field_Pb = var5;
                var6.field_Ob = var4_ref_String;
                var6.field_Tb = var7_ref;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref), "oe.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ce var6 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param2) {
                break L1;
              } else {
                if (null != this.field_p) {
                  this.field_p.a(true, param0, param3, (byte) -62, (ce) (this));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null != this.field_K) {
                var5_int = -1 + this.field_K.length;
                L3: while (true) {
                  if (-1 < (var5_int ^ -1)) {
                    break L2;
                  } else {
                    L4: {
                      var6 = this.field_K[var5_int];
                      if (var6 != null) {
                        var6.a(this.field_u + param0, -109, param2, param3 - -this.field_D);
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
            L5: {
              if (param1 < -103) {
                break L5;
              } else {
                this.b(36, 0, -79, -102, 25);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "oe.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K != null) {
              var8 = this.field_K;
              var9 = 0;
              L1: while (true) {
                if ((var9 ^ -1) <= (var8.length ^ -1)) {
                  L2: {
                    if (param6 == -55) {
                      break L2;
                    } else {
                      field_H = -1;
                      break L2;
                    }
                  }
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var8[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (var10.a(param0, param1, param2, param3, param4 - -this.field_D, this.field_u + param5, (byte) -55)) {
                        stackIn_15_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
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
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var8_ref);

            stackIn_25_1 = new StringBuilder().append("oe.LB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    private final boolean b(ce param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ce var5 = null;
        ce var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null != this.field_K) {
              L1: {
                if (param2 < -127) {
                  break L1;
                } else {
                  field_M = (String[]) null;
                  break L1;
                }
              }
              var4_int = 0;
              L2: while (true) {
                if (var4_int >= this.field_K.length) {
                  stackIn_28_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_K[var4_int];
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (!var5.a(true)) {
                        break L3;
                      } else {
                        var4_int = var4_int + param1;
                        L4: while (true) {
                          if ((var4_int ^ -1) <= (this.field_K.length ^ -1)) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_K[var4_int];
                              if (null == var6) {
                                break L5;
                              } else {
                                if (var6.a(false, param0)) {
                                  stackIn_24_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4_int = var4_int + param1;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4);

            stackIn_32_1 = new StringBuilder().append("oe.O(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L6;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_24_0 != 0;
          } else {
            return stackIn_28_0 != 0;
          }
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(0, param1, param0, param2)) {
                this.a((byte) 72, param2, param0, param1);
                this.a(param2, param1, 3370, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3) {
              stackIn_8_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_6_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("oe.MB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    private final boolean b(ce param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_K = (ce[]) null;
                break L1;
              }
            }
            stackIn_4_0 = this.b(param0, 1, param1 ^ -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("oe.T(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final ce a(int param0) {
        ce[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        ce var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        ce stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K == null) {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = 36 % ((param0 - 6) / 63);
              var2 = this.field_K;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2.length) {
                  stackIn_20_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = var2[var4];
                    if (null == var5) {
                      break L2;
                    } else {
                      if (var5.a(true)) {
                        stackIn_17_0 = (ce) (var5);
                        decompiledRegionSelector0 = 1;
                        break L0;
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
          throw dh.a((Throwable) ((Object) var2_ref), "oe.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ce) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return (ce) ((Object) stackIn_20_0);
          }
        }
    }

    final static int b(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1--;
              param1 = param1 | param1 >>> -1810527583;
              param1 = param1 | param1 >>> -1027453694;
              if (param0 == -10498) {
                break L1;
              } else {
                oe.a('ﾏ', -43);
                break L1;
              }
            }
            param1 = param1 | param1 >>> 499290852;
            param1 = param1 | param1 >>> -972289368;
            param1 = param1 | param1 >>> -1371497776;
            stackIn_4_0 = param1 + 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "oe.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        char stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_14_0;
        RuntimeException var2_ref = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
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
                  L3: {
                    L4: {
                      if (var2.length <= var3) {
                        var2 = oh.field_f;
                        var3 = 0;
                        L5: while (true) {
                          stackIn_24_0 = var2.length ^ -1;
                          stackIn_24_1 = var3 ^ -1;
                          if (stackIn_24_0 >= stackIn_24_1) {
                            break L3;
                          } else {
                            var4 = var2[var3];
                            if (param0 != var4) {
                              var3++;
                              continue L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        var4 = var2[var3];
                        stackOut_14_0 = param0;
                        stackIn_24_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_24_1 = var4;

                        if (stackIn_15_0 == stackIn_24_1) {
                          stackIn_20_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                    stackIn_29_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                  stackIn_32_0 = 0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "oe.K(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0 != 0;
              } else {
                return stackIn_32_0 != 0;
              }
            }
          }
        }
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K != null) {
              var5_int = -117 % ((param0 - -22) / 49);
              var6 = this.field_K;
              var7 = 0;
              L1: while (true) {
                if ((var6.length ^ -1) >= (var7 ^ -1)) {
                  var5_int = param1;
                  if ((var5_int ^ -1) == -81) {
                    L2: {
                      if (!bj.field_d[81]) {
                        stackIn_27_0 = this.b(param2, 0);
                        break L2;
                      } else {
                        stackIn_27_0 = this.a(param2, 113);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_29_0 = 0;
                    decompiledRegionSelector0 = 3;
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
                          stackIn_18_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
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
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var5);

            stackIn_33_1 = new StringBuilder().append("oe.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L4;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_27_0;
            } else {
              return stackIn_29_0 != 0;
            }
          }
        }
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K != null) {
              var2 = this.field_K;
              var3 = 0;
              L1: while (true) {
                if (var3 >= var2.length) {
                  L2: {
                    if (param0 == 113) {
                      break L2;
                    } else {
                      this.field_K = (ce[]) null;
                      break L2;
                    }
                  }
                  stackIn_19_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var4 = var2[var3];
                    if (null == var4) {
                      break L3;
                    } else {
                      var5 = var4.c((byte) 113);
                      if (var5 != null) {
                        stackIn_13_0 = (String) (var5);
                        decompiledRegionSelector0 = 1;
                        break L0;
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
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "oe.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return (String) ((Object) stackIn_19_0);
          }
        }
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        ce[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ce var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        ce stackIn_15_0 = null;
        ce stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K != null) {
              L1: {
                if (!param6) {
                  break L1;
                } else {
                  field_G = -21;
                  break L1;
                }
              }
              var8 = this.field_K;
              var9 = 0;
              L2: while (true) {
                if (var8.length <= var9) {
                  stackIn_24_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var8[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      L4: {
                        stackIn_15_0 = (ce) (var10);

                        if (param6) {
                          stackIn_16_0 = (ce) ((Object) stackIn_15_0);
                          stackIn_16_1 = 0;
                          break L4;
                        } else {

                          stackIn_16_0 = (ce) ((Object) stackIn_15_0);
                          stackIn_16_1 = 1;
                          break L4;
                        }
                      }
                      if (!((ce) (Object) stackIn_16_0).a(stackIn_16_1 != 0)) {
                        break L3;
                      } else {
                        if (!var10.a(param0, param1, param2, param3, param4, param5, false)) {
                          break L3;
                        } else {
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var8_ref);

            stackIn_28_1 = new StringBuilder().append("oe.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0 != 0;
          } else {
            return stackIn_24_0 != 0;
          }
        }
    }

    private final boolean a(ce param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 33) {
              stackIn_4_0 = this.a(param0, 1, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("oe.V(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract void g(int param0);

    final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              super.b(param0, param1, param2, param3, -16555);
              if (param4 == -16555) {
                break L1;
              } else {
                oe.b(71, 20);
                break L1;
              }
            }
            this.g(30);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var6), "oe.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_M = new String[]{"Showing by rating", "Showing by win percentage"};
        field_I = new vj();
        field_J = new int[8];
    }
}
