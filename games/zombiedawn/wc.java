/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wc extends qk {
    static vn field_Pb;
    private int field_Qb;
    static volatile int field_Ob;
    static int[] field_Nb;
    static int field_Rb;

    private final void x(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        le var6 = null;
        int var7 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          if (this.field_yb != null) {
            this.field_yb = null;
            break L0;
          } else {
            break L0;
          }
        }
        var5 = -1;
        var6 = dj.field_e.field_R.b((byte) 26);
        L1: while (true) {
          if (!(var6 instanceof fb)) {
            if (param0 == -44) {
              L2: {
                if (67600 < var5) {
                  this.field_yb = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (null == this.field_yb) {
                  this.field_Qb = 20;
                  break L3;
                } else {
                  this.e(10, -6904);
                  this.field_Gb = 10;
                  this.field_U = kh.a(44, false);
                  this.field_U.h(ge.field_c >> 1841201313);
                  break L3;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L4: {
              if (!(var6 instanceof kd)) {
                break L4;
              } else {
                if (!((kd) ((Object) var6)).x(94)) {
                  break L4;
                } else {
                  var2 = ((kd) ((Object) var6)).a(true) + -this.a(true);
                  var3 = ((kd) ((Object) var6)).f(237239984) - this.f(237239984);
                  if (var3 <= 0) {
                    break L4;
                  } else {
                    if (var3 <= Math.abs(var2)) {
                      break L4;
                    } else {
                      L5: {
                        var4 = var3 * var3 + var2 * var2;
                        if (var4 < var5) {
                          break L5;
                        } else {
                          if (-1 != var5) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_yb = (kd) ((Object) var6);
                      var5 = var4;
                      break L4;
                    }
                  }
                }
              }
            }
            var6 = var6.field_b;
            continue L1;
          }
        }
    }

    public static void o(byte param0) {
        if (param0 != -73) {
            wc.o((byte) -35);
        }
        field_Pb = null;
        field_Nb = null;
    }

    void a(byte param0, wk param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if ((this.field_F ^ -1) == -21) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  var3_int = param1.a(this.a(true), (byte) -88);
                  var4 = param1.a(this.f(237239984), 0);
                  if (10 != this.field_F) {
                    break L2;
                  } else {
                    if (-2 == (this.field_G ^ -1)) {
                      stackOut_7_0 = -1 + var4;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = var4;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
              L3: {
                var5 = stackIn_8_0;
                var6 = 0;
                if (param0 <= -76) {
                  break L3;
                } else {
                  this.g(30);
                  break L3;
                }
              }
              L4: {
                ld.field_l[this.field_t][var6].b(-24 + var3_int, var5 - 48);
                ag.field_h.b(-24 + var3_int, -44 + var4);
                if (this.field_Gb > 0) {
                  this.b(var3_int - 3, (byte) -99, var4);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (b.field_h) {
                  bi.d(12 + var3_int, var4 - -24, 260, 16711680);
                  bi.e(var3_int, var4, var3_int + 260, var4 - -260, 16711680);
                  bi.e(var3_int, var4, var3_int + -260, 260 + var4, 16711680);
                  bj.field_q.c(Integer.toString(this.field_G), var3_int, var4, 16777215, 0);
                  bj.field_q.c(Integer.toString(this.field_N), 20 + var3_int, var4, 16777215, 0);
                  bj.field_q.c(Integer.toString(this.field_F), var3_int, var4 + -20, 16777215, 0);
                  break L5;
                } else {
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("wc.B(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(re[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        re var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = param0.length;
            var3 = 1;
            L1: while (true) {
              if (var3 >= var2_int) {
                L2: {
                  if (param1 == 0) {
                    break L2;
                  } else {
                    wc.o((byte) 86);
                    break L2;
                  }
                }
                break L0;
              } else {
                var4 = param0[var3];
                var5 = -1 + var3;
                L3: while (true) {
                  L4: {
                    if (var5 < 0) {
                      break L4;
                    } else {
                      if (!bn.a((byte) 82, param0[var5], var4)) {
                        break L4;
                      } else {
                        param0[1 + var5] = param0[var5];
                        var5--;
                        continue L3;
                      }
                    }
                  }
                  param0[var5 + 1] = var4;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("wc.OA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param1 < 24) {
            return;
        }
    }

    final static void w(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        mg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        am var15 = null;
        int[][] var19 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = ZombieDawn.field_J;
        try {
          L0: {
            var15 = fj.field_g;
            var2 = var15.d((byte) -124);
            var3 = (mg) ((Object) bg.field_i.b((byte) 26));
            if (param0 > 117) {
              L1: while (true) {
                L2: {
                  if (var3 == null) {
                    break L2;
                  } else {
                    if (var2 != var3.field_h) {
                      var3 = (mg) ((Object) bg.field_i.a(false));
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 == null) {
                  p.a(1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4 = var15.d((byte) -124);
                    if (-1 != (var4 ^ -1)) {
                      bb.field_b[0] = ce.field_r;
                      var5 = var3.field_i;
                      var6_int = 1;
                      L4: while (true) {
                        if (var6_int >= var4) {
                          jb.a(var4, true, var5);
                          var6_int = 0;
                          L5: while (true) {
                            if (var4 <= var6_int) {
                              bf.a((byte) -35, var5);
                              var6 = new String[2][var5];
                              var19 = new int[2][var5 * 4];
                              var8 = qn.field_e;
                              var9 = 0;
                              var10 = 0;
                              L6: while (true) {
                                if (var9 >= var8) {
                                  var13 = 0;
                                  var9 = var13;
                                  var14 = 0;
                                  var10 = var14;
                                  L7: while (true) {
                                    if (var8 <= var13) {
                                      var3.b(-27598);
                                      break L3;
                                    } else {
                                      L8: {
                                        var11 = qd.field_c[var13 + var5];
                                        var6[1][var14] = bb.field_b[var11];
                                        var19[1][4 * var14] = dj.field_g[var11];
                                        var19[1][1 + 4 * var14] = qo.field_r[var11];
                                        var19[1][var14 * 4 - -2] = sg.field_kb[var11];
                                        var19[1][4 * var14 + 3] = jd.field_d[var11];
                                        if (!l.a(89, bb.field_b[var11])) {
                                          break L8;
                                        } else {
                                          if (sg.field_kb[var11] + (qo.field_r[var11] + jd.field_d[var11]) != 0) {
                                            break L8;
                                          } else {
                                            var6[1][var14] = null;
                                            var14--;
                                            break L8;
                                          }
                                        }
                                      }
                                      var14++;
                                      var13++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var11 = qd.field_c[var9];
                                  var6[0][var10] = bb.field_b[var11];
                                  var19[0][var10 * 4] = dj.field_g[var11];
                                  var19[0][1 + 4 * var10] = qo.field_r[var11];
                                  var19[0][2 + var10 * 4] = sg.field_kb[var11];
                                  var19[0][var10 * 4 - -3] = jd.field_d[var11];
                                  if (l.a(126, bb.field_b[var11])) {
                                    L9: {
                                      if (jd.field_d[var11] + (qo.field_r[var11] + sg.field_kb[var11]) == 0) {
                                        var6[0][var10] = null;
                                        var10--;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var9++;
                                    var10++;
                                    continue L6;
                                  } else {
                                    var9++;
                                    var10++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              L10: {
                                aa.a(var15, -121);
                                if (var6_int != 0) {
                                  mp.a(var6_int, e.field_H, ii.field_d, 1000, sn.field_e, rj.field_E);
                                  break L10;
                                } else {
                                  mp.a(var6_int, e.field_H, ii.field_d, 1000, sn.field_e, rj.field_E);
                                  break L10;
                                }
                              }
                              var6_int++;
                              continue L5;
                            }
                          }
                        } else {
                          bb.field_b[var6_int] = var15.a(true);
                          var6_int++;
                          continue L4;
                        }
                      }
                    } else {
                      var3.b(-27598);
                      break L3;
                    }
                  }
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
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "wc.PA(" + param0 + ')');
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

    void g(int param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (param0 >= 95) {
            break L0;
          } else {
            field_Ob = 118;
            break L0;
          }
        }
        L1: {
          if ((this.field_Gb ^ -1) < -1) {
            this.field_Gb = this.field_Gb - 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 != (this.field_F ^ -1)) {
            if ((this.field_F ^ -1) == -11) {
              L3: {
                this.field_N = this.field_N + 3;
                if (2 == this.field_G) {
                  this.field_yb.z(0);
                  this.e(0, -6904);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.d(this.field_F, -26109);
              break L2;
            } else {
              this.d(this.field_F, -26109);
              break L2;
            }
          } else {
            if (this.field_Qb <= 0) {
              this.x(-44);
              this.d(this.field_F, -26109);
              break L2;
            } else {
              this.field_Qb = this.field_Qb - 1;
              this.d(this.field_F, -26109);
              break L2;
            }
          }
        }
    }

    final void a(nc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -63 / ((-53 - param1) / 54);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("wc.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
    }

    final static void f(int param0, int param1) {
        le var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ep var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 == 67600) {
              var4 = (ep) ((Object) uk.field_a.b((byte) 26));
              L1: while (true) {
                if (var4 == null) {
                  var2 = jj.field_D.b((byte) 26);
                  L2: while (true) {
                    if (var2 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      p.a(0, param1);
                      var2 = jj.field_D.a(false);
                      continue L2;
                    }
                  }
                } else {
                  sn.a(param1, var4, 0);
                  var4 = (ep) ((Object) uk.field_a.a(false));
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
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "wc.UB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    wc(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Qb = 0;
        this.field_S = 2;
    }

    static {
        field_Pb = new vn(270, 70);
        field_Ob = 0;
        field_Nb = new int[8192];
    }
}
