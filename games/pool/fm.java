/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fm extends ei implements lj {
    static dd[] field_G;
    static boolean field_H;
    static jd[][] field_K;
    static String field_I;
    static int field_M;
    ei[] field_L;
    static String field_J;

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        ei[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ei var7 = null;
        int var8 = 0;
        ei[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pool.field_O;
        try {
          L0: {
            if (null != this.field_L) {
              var9 = this.field_L;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var9.length <= var6) {
                  var5_int = param1;
                  if ((var5_int ^ -1) != -81) {
                    if (!param2) {
                      stackIn_22_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      stackIn_20_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    L2: {
                      if (!vj.field_c[81]) {
                        stackIn_17_0 = this.a(param3, -3094);
                        break L2;
                      } else {
                        stackIn_17_0 = this.b(param3, (byte) 89);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L3: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L3;
                    } else {
                      if (!var7.d(-117)) {
                        break L3;
                      } else {
                        if (var7.a(param0, param1, param2, param3)) {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var6++;
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
            var5_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5_ref);

            stackIn_25_1 = new StringBuilder().append("fm.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1, ei param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ei var5 = null;
        ei var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          L0: {
            if (this.field_L == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 2676) {
                var4_int = this.field_L.length - 1;
                L1: while (true) {
                  if (0 > var4_int) {
                    stackIn_22_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var5 = this.field_L[var4_int];
                      if (null == var5) {
                        break L2;
                      } else {
                        if (!var5.d(param1 + -2568)) {
                          break L2;
                        } else {
                          var4_int = var4_int - param0;
                          L3: while (true) {
                            if (var4_int < 0) {
                              break L2;
                            } else {
                              L4: {
                                var6 = this.field_L[var4_int];
                                if (null != var6) {
                                  if (!var6.a(param2, (byte) -106)) {
                                    break L4;
                                  } else {
                                    stackIn_18_0 = 1;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                              var4_int = var4_int - param0;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4_int--;
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("fm.NA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    final int c(int param0) {
        int var2;
        ei[] var3;
        int var4;
        ei var5;
        int var7;
        int var6;
        var7 = Pool.field_O;
        if (param0 > 33) {
          var2 = 0;
          var3 = this.field_L;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              return var2;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.c(73);
                if (var2 < var6) {
                  var2 = var6;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 77;
        }
    }

    public static void g(int param0) {
        field_I = null;
        field_K = (jd[][]) null;
        if (param0 != 16) {
            return;
        }
        field_G = null;
        field_J = null;
    }

    private final ei f(int param0) {
        ei[] var2;
        int var3;
        ei var4;
        int var5;
        ei[] var6;
        var5 = Pool.field_O;
        if (this.field_L != null) {
          if (param0 == 15041) {
            var6 = this.field_L;
            var2 = var6;
            var3 = 0;
            L0: while (true) {
              if (var3 < var6.length) {
                var4 = var6[var3];
                if (var4 != null) {
                  if (var4.d(124)) {
                    return var4;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return (ei) null;
          }
        } else {
          return null;
        }
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, byte param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        int var6 = 0;
        ei var7 = null;
        int var8 = 0;
        int var9 = 0;
        ei[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            if (this.field_L == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var10 = this.field_L;
                if (param3 > 96) {
                  break L1;
                } else {
                  this.field_L = (ei[]) null;
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var10.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var10[var6];
                  discarded$4 = param1.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (var8 > param2) {
                      L4: {
                        if (var7 == null) {
                          discarded$5 = param1.append("null");
                          break L4;
                        } else {
                          var7.a(param1, 1 + param2, param0, 61);
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      discarded$6 = param1.append(' ');
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
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("fm.PA(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(ei param0, byte param1) {
        ei[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ei var6 = null;
        int var7 = 0;
        ei[] var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          L0: {
            var8 = this.field_L;
            var3 = var8;
            var4 = -24 % ((param1 - -43) / 47);
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    if (var6.a(param0, (byte) 32)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
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
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("fm.M(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        ei[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ei var10 = null;
        int var11 = 0;
        ei[] var12 = null;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param4 < -126) {
                break L1;
              } else {
                field_K = (jd[][]) null;
                break L1;
              }
            }
            if (this.field_L == null) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_L;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.d(-85)) {
                        break L3;
                      } else {
                        if (!var10.a(param0, param1, param2, param3, (byte) -127, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_13_0 = 1;
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8_ref);

            stackIn_19_1 = new StringBuilder().append("fm.WA(");

            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final void d(byte param0) {
        ei[] var2;
        int var3;
        ei var4;
        int var5;
        ei[] var6;
        L0: {
          var5 = Pool.field_O;
          var6 = this.field_L;
          var2 = var6;
          if (param0 == 99) {
            break L0;
          } else {
            field_I = (String) null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var6.length <= var3) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.d((byte) 99);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5;
        ei var6;
        int var7;
        L0: {
          var7 = Pool.field_O;
          if (-1 != (param0 ^ -1)) {
            break L0;
          } else {
            if (this.field_z == null) {
              break L0;
            } else {
              this.field_z.a(true, param2, (byte) 51, param3, (ei) (this));
              break L0;
            }
          }
        }
        L1: {
          if (null == this.field_L) {
            break L1;
          } else {
            var5 = -1 + this.field_L.length;
            L2: while (true) {
              if (-1 < (var5 ^ -1)) {
                break L1;
              } else {
                var6 = this.field_L[var5];
                if (var6 != null) {
                  var6.a(param0, (byte) -98, this.field_C + param2, this.field_D + param3);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          }
        }
        var5 = 93 / ((param1 - -42) / 53);
    }

    private final boolean b(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -98 % ((49 - param1) / 35);
            stackIn_1_0 = this.a(1, 2676, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("fm.QA(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static oc a(int param0, oq param1) {
        oc stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          L0: {
            var2_int = param1.e(8, 74);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                if (param0 == -16336) {
                  break L1;
                } else {
                  fm.g(-31);
                  break L1;
                }
              }
              L2: {
                var3 = gk.a((byte) 118, param1) ? 1 : 0;
                var4 = gk.a((byte) 118, param1) ? 1 : 0;
                var5 = new oc();
                var5.field_k = (short)param1.e(16, 98);
                var5.field_m = kh.a(16, var5.field_m, (byte) 127, param1);
                var5.field_s = kh.a(16, var5.field_s, (byte) 99, param1);
                var5.field_l = kh.a(16, var5.field_l, (byte) 123, param1);
                var5.field_d = (short)param1.e(16, 69);
                var5.field_y = kh.a(16, var5.field_y, (byte) 122, param1);
                var5.field_r = kh.a(16, var5.field_r, (byte) 111, param1);
                var5.field_u = kh.a(16, var5.field_u, (byte) 109, param1);
                if (var3 == 0) {
                  break L2;
                } else {
                  var5.field_o = (short)param1.e(16, param0 + 16375);
                  var5.field_Q = kh.a(16, var5.field_Q, (byte) 109, param1);
                  var5.field_p = kh.a(16, var5.field_p, (byte) 121, param1);
                  var5.field_j = kh.a(16, var5.field_j, (byte) 120, param1);
                  var5.field_x = kh.a(16, var5.field_x, (byte) 109, param1);
                  var5.field_w = kh.a(16, var5.field_w, (byte) 110, param1);
                  var5.field_O = kh.a(16, var5.field_O, (byte) 118, param1);
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  param1.e(16, param0 ^ -16283);
                  var5.field_v = kh.a(16, var5.field_v, (byte) 94, param1);
                  var5.field_a = kh.a(16, var5.field_a, (byte) 118, param1);
                  var5.field_i = kh.a(16, var5.field_i, (byte) 111, param1);
                  var5.field_P = kh.a(16, var5.field_P, (byte) 104, param1);
                  var5.field_z = kh.a(16, var5.field_z, (byte) 102, param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (gk.a((byte) 118, param1)) {
                  var5.field_H = kh.a(16, var5.field_H, (byte) 110, param1);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!gk.a((byte) 118, param1)) {
                  break L5;
                } else {
                  var5.field_K = cb.a(50, 16, param1, var5.field_K);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_K.length) {
                      if (0 != var6) {
                        var5.field_I = (byte)(1 + var6);
                        break L5;
                      } else {
                        var5.field_K = null;
                        break L5;
                      }
                    } else {
                      L7: {
                        if ((var5.field_K[var7] & 255) > var6) {
                          var6 = 255 & var5.field_K[var7];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_24_0 = (oc) (var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("fm.SA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.b(param1, param2, param0, -1)) {
                this.a(1, param2, param0, param1);
                this.a(param2, param0, param1, (byte) 108);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 >= 13) {
              stackIn_7_0 = (StringBuilder) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("fm.EA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(ge param0, boolean param1, int param2, int param3, int param4) {
        param0.a(12, false);
        param0.a((byte) -81, 17);
        if (!param1) {
            return;
        }
        try {
            param0.a((byte) -81, param2);
            param0.a((byte) -81, param4);
            param0.a(param3, false);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "fm.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    fm(int param0, int param1, int param2, int param3, fp param4) {
        super(param0, param1, param2, param3, param4, (cc) null);
    }

    private final boolean a(int param0, ei param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ei var5 = null;
        ei var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          L0: {
            if (null == this.field_L) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == -9478) {
                  break L1;
                } else {
                  this.field_L = (ei[]) null;
                  break L1;
                }
              }
              var4_int = 0;
              L2: while (true) {
                if (this.field_L.length <= var4_int) {
                  stackIn_22_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_L[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.d(103)) {
                        var4_int = var4_int + param0;
                        L4: while (true) {
                          if (var4_int >= this.field_L.length) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_L[var4_int];
                              if (var6 != null) {
                                if (!var6.a(param1, (byte) -112)) {
                                  break L5;
                                } else {
                                  stackIn_18_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var4_int = var4_int + param0;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("fm.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    final String e(int param0) {
        ei[] var2;
        int var3;
        ei var4;
        int var6;
        StringBuilder var7;
        String var5;
        var6 = Pool.field_O;
        if (null != this.field_L) {
          L0: {
            if (param0 < -10) {
              break L0;
            } else {
              var7 = (StringBuilder) null;
              this.a((Hashtable) null, (StringBuilder) null, -53, (byte) -52);
              break L0;
            }
          }
          var2 = this.field_L;
          var3 = 0;
          L1: while (true) {
            if (var2.length > var3) {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.e(-47);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        ei[] var7 = null;
        int var8 = 0;
        ei var9 = null;
        int var10 = 0;
        ei[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Pool.field_O;
        try {
          L0: {
            if (this.field_L != null) {
              var11 = this.field_L;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                if (var11.length <= var8) {
                  L2: {
                    if (param4 >= 62) {
                      break L2;
                    } else {
                      field_I = (String) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 != null) {
                      var9.a(param0 - -this.field_C, param1, this.field_D + param2, param3, (byte) 86, param5);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L1;
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
            var7_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7_ref);

            stackIn_14_1 = new StringBuilder().append("fm.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f((byte) -125);
    }

    private final boolean a(ei param0, int param1) {
        RuntimeException var3 = null;
        ei var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -3094) {
                break L1;
              } else {
                var4 = (ei) null;
                this.a((ei) null, 110, true, -117, 91, 109, -124);
                break L1;
              }
            }
            stackIn_3_0 = this.a(1, param0, param1 ^ 10512);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("fm.KA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        ei[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ei var10 = null;
        int var11 = 0;
        ei[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Pool.field_O;
        try {
          L0: {
            if (null == this.field_L) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2) {
                var12 = this.field_L;
                var8 = var12;
                var9 = 0;
                L1: while (true) {
                  if (var12.length <= var9) {
                    stackIn_17_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var10 = var12[var9];
                      if (var10 == null) {
                        break L2;
                      } else {
                        if (var10.a(param0, param1 + this.field_C, param2, param3, param4, this.field_D + param5, param6)) {
                          stackIn_14_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var9++;
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8_ref);

            stackIn_20_1 = new StringBuilder().append("fm.AA(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    abstract void f(byte param0);

    final static Class a(boolean param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_K = (jd[][]) null;
                  break L1;
                }
              }
              if (!param1.equals("I")) {
                if (!param1.equals("S")) {
                  if (param1.equals("J")) {
                    stackIn_15_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param1.equals("Z")) {
                      if (param1.equals("F")) {
                        stackIn_22_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param1.equals("D")) {
                          stackIn_26_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param1.equals("C")) {
                            stackIn_31_0 = Class.forName(param1);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_29_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_18_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_11_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("fm.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        ei[] var5 = null;
        int var6 = 0;
        ei var7 = null;
        int var8 = 0;
        ei[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param1 == 958) {
                break L1;
              } else {
                field_K = (jd[][]) null;
                break L1;
              }
            }
            super.a(param0, param1 + 0, param2, param3);
            if (this.field_L == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = this.field_L;
              var5 = var9;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var9.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L3;
                    } else {
                      var7.a(param0, 958, param2 + this.field_C, this.field_D + param3);
                      break L3;
                    }
                  }
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("fm.S(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean d(int param0) {
        int var2 = -51 / ((7 - param0) / 48);
        return null != this.f(15041) ? true : false;
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = Pool.field_O;
        try {
            pj.field_J.b((byte) 26);
            for (var1_int = param0; var1_int < 32; var1_int++) {
                dj.field_l[var1_int] = 0L;
            }
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                oa.field_f[var1_int] = 0L;
            }
            rn.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "fm.AB(" + param0 + ')');
        }
    }

    static {
        field_H = false;
        field_J = "Please select an option in the '<%0>' row.";
    }
}
