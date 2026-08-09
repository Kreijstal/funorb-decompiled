/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lk extends ml implements dm {
    static int field_sb;
    private boolean field_ob;
    private boolean field_rb;
    static int field_wb;
    private boolean field_qb;
    private boolean field_vb;
    private jb field_ub;
    static String field_pb;
    private lg field_tb;
    static String field_nb;

    public static void f(byte param0) {
        int var1 = -101 / ((-67 - param0) / 47);
        field_nb = null;
        field_pb = null;
    }

    final static le a(int param0, hl param1, hl param2, hl param3, int[] param4) {
        Object stackIn_9_0 = null;
        le stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        le[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        j var11 = null;
        int var12 = 0;
        int[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        var12 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var5_int = param4.length;
              if (param0 <= -26) {
                break L1;
              } else {
                var13 = (int[]) null;
                lk.a(90, (hl) null, (hl) null, (hl) null, (int[]) null);
                break L1;
              }
            }
            var6 = new String[var5_int];
            var15 = new char[var5_int];
            var14 = var15;
            var7 = var14;
            var8 = new le[var5_int];
            var9 = 49;
            try {
              L2: {
                var10_int = 0;
                L3: while (true) {
                  if (var10_int >= var5_int) {
                    break L2;
                  } else {
                    var11 = eh.field_p.a(param4[var10_int], -128);
                    var6[var10_int] = var11.h(-107);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L3;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackIn_9_0 = null;
              return (le) ((Object) stackIn_9_0);
            }
            stackIn_11_0 = new le(0L, param3, param2, param1, var8, param4, var6, var15);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("lk.DA(").append(param0).append(',');

            if (param1 == null) {
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
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ')');
        }
        return stackIn_11_0;
    }

    lk(pk param0, jb param1, String param2, boolean param3, boolean param4) {
        super(param0, new ba((lk) null, param1, param2), 77, 10, 10);
        try {
            this.field_ob = false;
            this.field_qb = false;
            this.field_ub = param1;
            this.field_rb = param4 ? true : false;
            this.field_vb = param3 ? true : false;
            this.field_tb = new lg(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_tb.field_K = true;
            this.c(this.field_tb, 10);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                lk.q(108);
                break L1;
              }
            }
            if (-14 == (param0 ^ -1)) {
              this.r(-125);
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = super.a(param0, param1, 1, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("lk.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    final void p(int param0) {
        if (param0 != 128) {
            el var3 = (el) null;
            lk.a(false, (byte) -124, 39, (el) null, -11, -14, 32, -111);
        }
        this.field_tb.b(param0 ^ 248, 2121792, 4210752);
        ba var2 = new ba((lk) (this), this.field_ub, oa.field_t);
        var2.a(lm.field_l, 15, param0 ^ -256);
        this.e(var2, -27667);
    }

    final static java.applet.Applet q(int param0) {
        if (param0 != 13) {
            field_sb = 60;
        }
        if (!(null == ik.field_c)) {
            return ik.field_c;
        }
        return (java.applet.Applet) ((Object) lc.field_a);
    }

    final void r(int param0) {
        if (this.field_K) {
          L0: {
            this.field_K = false;
            if (this.field_vb) {
              gg.c(-8);
              break L0;
            } else {
              if (this.field_rb) {
                aa.d((byte) 116);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (param0 < -122) {
              break L1;
            } else {
              this.r(122);
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!sj.a(3010, param0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 != null) {
                var3_int = param2.length();
                if (param1 == -1) {
                  if (12 <= var3_int) {
                    stackIn_13_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!tk.a((byte) 81, param0)) {
                      stackIn_20_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (var3_int == 0) {
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("lk.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L1;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0 != 0;
                } else {
                  return stackIn_20_0 != 0;
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, byte param1, int param2, el param3, int param4, int param5, int param6, int param7) {
        nh[][] stackIn_35_0 = null;
        nh[][] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nh[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        nh var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        el var16 = null;
        nh[] var17 = null;
        int[] var18 = null;
        nh[] var19 = null;
        int[] var20 = null;
        var15 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param1 < -111) {
                break L1;
              } else {
                var16 = (el) null;
                lk.a(true, (byte) -16, 61, (el) null, -105, 77, -74, -96);
                break L1;
              }
            }
            L2: {
              if (param6 > param2) {
                L3: {
                  stackIn_35_0 = cn.field_e;

                  if (-1 == param2) {
                    stackIn_36_0 = (nh[][]) ((Object) stackIn_35_0);
                    stackIn_36_1 = 1;
                    break L3;
                  } else {
                    stackIn_36_0 = (nh[][]) ((Object) stackIn_35_0);
                    stackIn_36_1 = param2 + 4;
                    break L3;
                  }
                }
                L4: {
                  var17 = stackIn_36_0[stackIn_36_1];
                  var19 = var17;
                  var8 = var19;
                  var9 = 1;
                  if (!param0) {
                    break L4;
                  } else {
                    if (0 == (param2 ^ -1)) {
                      var10 = 0;
                      L5: while (true) {
                        if (cl.field_f.length <= var10) {
                          break L4;
                        } else {
                          if (0 == (km.field_o[var10 / 8] & 1 << (7 & var10))) {
                            var10++;
                            continue L5;
                          } else {
                            var9 = 0;
                            break L4;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L6: while (true) {
                        L7: {
                          if (var10 >= -1 + var17.length) {
                            break L7;
                          } else {
                            if (-1 != (lo.field_a[(param4 - -var10) / 8] & 1 << (7 & param4 + var10) ^ -1)) {
                              var9 = 0;
                              break L7;
                            } else {
                              var10++;
                              continue L6;
                            }
                          }
                        }
                        param4 = param4 + (255 & nn.field_Y[param2]);
                        break L4;
                      }
                    }
                  }
                }
                var10 = 0;
                var11 = 0;
                L8: while (true) {
                  L9: {
                    if (0 != (param2 ^ -1)) {
                      stackIn_54_0 = var19.length + -1;
                      break L9;
                    } else {
                      stackIn_54_0 = cl.field_f.length;
                      break L9;
                    }
                  }
                  if (stackIn_54_0 <= var11) {
                    if (var10 == 0) {
                      var11 = 0;
                      L10: while (true) {
                        if (-1 + var19.length <= var11) {
                          break L2;
                        } else {
                          L11: {
                            if (0 == (param2 ^ -1)) {
                              param5 = var11;
                              break L11;
                            } else {
                              eg.field_K[param2] = (byte)var11;
                              break L11;
                            }
                          }
                          lk.a(param0, (byte) -118, param2 + 1, param3, param4, param5, param6, param7);
                          if (nn.field_R) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var11++;
                            continue L10;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L12: {
                      if (-1 == param2) {
                        param5 = var11;
                        break L12;
                      } else {
                        eg.field_K[param2] = (byte)var11;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        if (param2 != -1) {
                          break L14;
                        } else {
                          if (cl.field_f.length != 1) {
                            break L14;
                          } else {
                            var12 = 1;
                            break L13;
                          }
                        }
                      }
                      var13 = var8[var11 + 1];
                      if (param0) {
                        L15: {
                          if (!var13.field_zb) {
                            if (var9 != 0) {
                              if (var13.field_S) {
                                stackIn_78_0 = 1;
                                break L15;
                              } else {
                                stackIn_78_0 = 0;
                                break L15;
                              }
                            } else {
                              stackIn_78_0 = 0;
                              break L15;
                            }
                          } else {
                            stackIn_78_0 = 1;
                            break L15;
                          }
                        }
                        var12 = stackIn_78_0;
                        break L13;
                      } else {
                        L16: {
                          if (0 == (param2 ^ -1)) {
                            if (cl.field_f[var11] != qb.field_N.field_rc) {
                              stackIn_69_0 = 0;
                              break L16;
                            } else {
                              stackIn_69_0 = 1;
                              break L16;
                            }
                          } else {
                            if (var11 != (255 & qb.field_N.field_sc[param2])) {
                              stackIn_69_0 = 0;
                              break L16;
                            } else {
                              stackIn_69_0 = 1;
                              break L16;
                            }
                          }
                        }
                        var12 = stackIn_69_0;
                        break L13;
                      }
                    }
                    L17: {
                      if (var12 != 0) {
                        lk.a(param0, (byte) -120, param2 - -1, param3, param4, param5, param6, param7);
                        var10 = 1;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    if (nn.field_R) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var11++;
                      continue L8;
                    }
                  }
                }
              } else {
                var8_int = 1;
                var9 = 0;
                L18: while (true) {
                  if (var9 >= uj.field_s.length) {
                    if (var8_int != 0) {
                      nn.field_R = true;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var20 = uj.field_s[var9];
                    var18 = var20;
                    var10_ref_int__ = var18;
                    var11 = 0;
                    var12 = 0;
                    L19: while (true) {
                      L20: {
                        if (var12 >= var20.length) {
                          L21: {
                            if (var11 != 0) {
                              break L21;
                            } else {
                              if (hg.field_k == param2) {
                                break L21;
                              } else {
                                break L20;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L22: while (true) {
                            if (var12 >= var20.length) {
                              break L20;
                            } else {
                              L23: {
                                var13_int = var20[var12];
                                if (0 != (var13_int ^ -1)) {
                                  if (param2 > var13_int) {
                                    rh.field_G[var13_int] = true;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                } else {
                                  n.field_P = true;
                                  break L23;
                                }
                              }
                              var12 += 2;
                              continue L22;
                            }
                          }
                        } else {
                          L24: {
                            var13_int = var20[var12];
                            var14 = var10_ref_int__[1 + var12];
                            if (-1 == var13_int) {
                              if (cl.field_f[param5] == var14) {
                                break L24;
                              } else {
                                break L20;
                              }
                            } else {
                              L25: {
                                if (param2 != var13_int) {
                                  break L25;
                                } else {
                                  if (param7 != var14) {
                                    break L25;
                                  } else {
                                    var11 = 1;
                                    break L24;
                                  }
                                }
                              }
                              if (var13_int >= param2) {
                                break L20;
                              } else {
                                if ((255 & eg.field_K[var13_int]) == var14) {
                                  break L24;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          var12 += 2;
                          continue L19;
                        }
                      }
                      var9++;
                      continue L18;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8_ref = decompiledCaughtException;
            stackIn_100_0 = (RuntimeException) (var8_ref);

            stackIn_100_1 = new StringBuilder().append("lk.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "null";
              break L26;
            } else {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "{...}";
              break L26;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final void a(String param0, int param1, int param2) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ba stackIn_13_0 = null;
        ba stackIn_14_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ba var6 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (!this.field_qb) {
              L1: {
                stackIn_5_0 = this;

                if ((param1 ^ -1) != -257) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((lk) (this)).field_ob = stackIn_6_1 != 0;
                this.field_qb = true;
                this.field_tb.b(-32, 8405024, 4210752);
                if (param2 == 17) {
                  break L2;
                } else {
                  this.r(0);
                  break L2;
                }
              }
              L3: {
                var6 = new ba((lk) (this), this.field_ub, param0);
                if (5 != param1) {
                  if (-257 == (param1 ^ -1)) {
                    var6.a((dn) (this), param2 ^ -44, mb.field_v);
                    break L3;
                  } else {
                    L4: {
                      stackIn_13_0 = (ba) (var6);

                      if (!this.field_vb) {
                        stackIn_14_0 = (ba) ((Object) stackIn_13_0);
                        stackIn_14_1 = nb.field_T;
                        break L4;
                      } else {
                        stackIn_14_0 = (ba) ((Object) stackIn_13_0);
                        stackIn_14_1 = mb.field_v;
                        break L4;
                      }
                    }
                    ((ba) (Object) stackIn_14_0).a(stackIn_14_1, -1, param2 ^ 103);
                    break L3;
                  }
                } else {
                  var6.a(ml.field_hb, 11, 94);
                  var6.a(uh.field_a, 17, 91);
                  break L3;
                }
              }
              L5: {
                L6: {
                  if (-4 == (param1 ^ -1)) {
                    var6.a(hl.field_C, 7, param2 ^ 108);
                    break L6;
                  } else {
                    if (-5 == (param1 ^ -1)) {
                      var6.a(u.field_d, 8, 97);
                      break L6;
                    } else {
                      if (6 == param1) {
                        var6.a(em.field_c, 9, 81);
                        break L6;
                      } else {
                        if (9 == param1) {
                          var6.a((dn) (this), 40, jm.field_d);
                          break L6;
                        } else {
                          this.e(var6, -27667);
                          break L5;
                        }
                      }
                    }
                  }
                }
                this.e(var6, -27667);
                break L5;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4);

            stackIn_29_1 = new StringBuilder().append("lk.EA(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public void a(byte param0, ae param1, int param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                this.field_rb = false;
                break L1;
              }
            }
            L2: {
              if (this.field_ob) {
                t.a(3, 0);
                this.r(-124);
                break L2;
              } else {
                ha.a(-92, "tochangedisplayname.ws", lk.q(13));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("lk.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_sb = -1;
        field_nb = "Remove <%0> from ignore list";
        field_pb = "Start Game";
    }
}
