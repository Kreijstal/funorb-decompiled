/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends ae {
    private int field_i;
    private int field_o;
    static int field_p;
    private int field_k;
    static ja field_j;
    private int field_q;
    private int field_l;
    private int field_n;
    static int field_m;

    final static void a(String[] args, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                id.field_B = oi.field_j;
                if (param2 == 255) {
                  break L2;
                } else {
                  L3: {
                    if ((param2 ^ -1) > -101) {
                      break L3;
                    } else {
                      if (105 < param2) {
                        break L3;
                      } else {
                        iq.field_c = kn.a(args, -111);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  iq.field_c = p.a(-38, param3, param2);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (-14 >= (rj.field_J ^ -1)) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L4;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L4;
                }
              }
              iq.field_c = ij.a(stackIn_11_0 != 0, stackIn_11_1 != 0);
              break L1;
            }
            if (param1 == 31407) {
              break L0;
            } else {
              field_p = -77;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("sj.E(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (args == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    sj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0);
        this.field_o = param3;
        this.field_q = param4;
        this.field_i = param2;
        this.field_k = param6;
        this.field_n = param5;
        this.field_l = param1;
    }

    final static void a(int param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 == -66) {
              var7 = new int[1 + me.field_f.length];
              var3 = var7;
              var4 = new int[me.field_f.length + 1];
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (me.field_f.length <= var5) {
                      break L3;
                    } else {
                      var7[var5] = me.field_f[var5];
                      var4[var5] = nm.field_u[var5];
                      var5++;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var7[var7.length + -1] = param1;
                  var4[-1 + var4.length] = param0;
                  nm.field_u = var4;
                  me.field_f = var7;
                  break L2;
                }
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
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "sj.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_25_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        boolean stackOut_24_0 = false;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_16_0 = false;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1 == -891231071) {
              if (param2 <= param5) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param5 + 1 < param4) {
                  L1: {
                    if (param4 <= 5 + param5) {
                      break L1;
                    } else {
                      if (param0 != param6) {
                        var7_int = (1 & (param0 & param6)) + ((param6 >> -891231071) - -(param0 >> -759131647));
                        var8 = param5;
                        var9 = param0;
                        var10 = param6;
                        var11 = param5;
                        L2: while (true) {
                          L3: {
                            if (param4 <= var11) {
                              sj.a(param0, param1 + 0, param2, param3, var8, param5, var9);
                              stackOut_35_0 = var10;
                              stackIn_36_0 = stackOut_35_0;
                              break L3;
                            } else {
                              var12 = la.field_c[var11];
                              stackOut_24_0 = param3;
                              stackIn_36_0 = stackOut_24_0 ? 1 : 0;
                              stackIn_25_0 = stackOut_24_0;
                              if (var14 != 0) {
                                break L3;
                              } else {
                                L4: {
                                  if (stackIn_25_0) {
                                    stackOut_27_0 = lb.field_c[var12];
                                    stackIn_28_0 = stackOut_27_0;
                                    break L4;
                                  } else {
                                    stackOut_26_0 = hn.field_f[var12];
                                    stackIn_28_0 = stackOut_26_0;
                                    break L4;
                                  }
                                }
                                L5: {
                                  L6: {
                                    var13 = stackIn_28_0;
                                    if (var13 > var7_int) {
                                      break L6;
                                    } else {
                                      if (var10 >= var13) {
                                        break L5;
                                      } else {
                                        var10 = var13;
                                        if (var14 == 0) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  la.field_c[var11] = la.field_c[var8];
                                  incrementValue$1 = var8;
                                  var8++;
                                  la.field_c[incrementValue$1] = var12;
                                  if (var9 > var13) {
                                    var9 = var13;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                var11++;
                                continue L2;
                              }
                            }
                          }
                          sj.a(stackIn_36_0, param1 + 0, param2, param3, param4, var8, param6);
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  var7_int = param4 - 1;
                  L7: while (true) {
                    stackOut_12_0 = var7_int;
                    stackIn_13_0 = stackOut_12_0;
                    L8: while (true) {
                      L9: {
                        if (stackIn_13_0 <= param5) {
                          break L9;
                        } else {
                          var8 = param5;
                          L10: while (true) {
                            L11: {
                              if (var7_int <= var8) {
                                break L11;
                              } else {
                                var9 = la.field_c[var8];
                                var10 = la.field_c[1 + var8];
                                stackOut_16_0 = un.a(101, param3, var9, var10);
                                stackIn_13_0 = stackOut_16_0 ? 1 : 0;
                                stackIn_17_0 = stackOut_16_0;
                                if (var14 != 0) {
                                  continue L8;
                                } else {
                                  L12: {
                                    if (!stackIn_17_0) {
                                      break L12;
                                    } else {
                                      la.field_c[var8] = var10;
                                      la.field_c[1 + var8] = var9;
                                      break L12;
                                    }
                                  }
                                  var8++;
                                  if (var14 == 0) {
                                    continue L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            var7_int--;
                            if (var14 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var7), "sj.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
                return;
              }
            }
          }
        }
    }

    final void a(int param0, qd param1) {
        gm var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        wb var4_ref = null;
        Exception var5 = null;
        qk var5_ref = null;
        wb var6 = null;
        wb stackIn_4_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        wb stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var3 = op.field_m.a(this.field_i, 70);
            var4 = null;
            try {
              L1: {
                L2: {
                  if (this.field_l == -1) {
                    stackOut_3_0 = null;
                    stackIn_4_0 = (wb) ((Object) stackOut_3_0);
                    break L2;
                  } else {
                    stackOut_2_0 = op.field_m.a(this.field_l, false);
                    stackIn_4_0 = stackOut_2_0;
                    break L2;
                  }
                }
                L3: {
                  var4_ref = stackIn_4_0;
                  if (param0 == 0) {
                    break L3;
                  } else {
                    sj.c(true);
                    break L3;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              return;
            }
            var5_ref = new qk(this.field_q, this.field_n);
            var6 = param1.a(this.field_k, var4_ref, var3, true, var5_ref);
            var6.field_y = this.field_o;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("sj.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            this.field_q = 6;
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        if (!param0) {
            sj.a(-121, -52, -61, false, 25, -17, -24);
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 12319) {
                break L1;
              } else {
                sj.a(97, -25, -42, true, 8, 4, 118);
                break L1;
              }
            }
            stackOut_2_0 = dp.a(0, false, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("sj.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
