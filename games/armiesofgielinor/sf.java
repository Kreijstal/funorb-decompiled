/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sf extends wl {
    private int field_T;
    static int[] field_P;
    private int field_R;
    private int field_V;
    static String field_Q;
    private int field_U;
    private int field_O;
    private int field_S;

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        vh var17;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        qn.a(6 + param0, 35 + param2, this.field_l - 12, this.field_w + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            var6 = 169;
            var4 = 22;
            var5 = 194;
            var7 = 0;
            var8 = param2 - -35;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  gt.field_e.g(this.field_l + (param0 + -90), 10 + param2);
                  gb.a(t.field_d, param0 - -5, param2 - -35, this.field_l - 10, 8941);
                  gb.a(ip.field_c, param0, -22 + param2 - -this.field_w, this.field_l, param1 ^ 1851672364);
                  var4 = this.field_w - 79;
                  var6 = 127;
                  var5 = 169;
                  if (param1 == 1851680193) {
                    break L2;
                  } else {
                    var17 = (vh) null;
                    sf.a(-110, (String) null, (vh) null);
                    break L2;
                  }
                }
                var7 = 0;
                var8 = param2 + 57;
                L3: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 777267248 | var9 << -827783032);
                    qn.e(param0, var8, 6, var9);
                    qn.e(param0 + this.field_l + -6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + var7 * (-var5 + var6) / var4;
                var9 = var9 | (var9 << 809398608 | var9 << 1874934216);
                qn.e(param0, var8, 6, var9);
                qn.e(param0 - (-this.field_l + 6), var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if ((var8 ^ -1) <= (qn.field_a ^ -1)) {
              if (var8 < qn.field_f) {
                L4: {
                  var9 = var5 + var7 * (var6 - var5) / var4;
                  var10 = 0;
                  var11 = this.field_l;
                  if (-21 > (var7 ^ -1)) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (20 < var10) {
                        break L4;
                      } else {
                        var12 = (-var10 + 20) * (-var10 + 20) + (-var7 + 20) * (-var7 + 20);
                        if (var12 <= 462) {
                          if ((var12 ^ -1) > -421) {
                            break L4;
                          } else {
                            var13 = var9 * (462 - var12) / 42;
                            var13 = var13 | (var13 << 835442024 | var13 << 1342106736);
                            qn.field_d[var8 * qn.field_l - (-param0 + -var10)] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if ((var7 ^ -1) >= -21) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                          if (462 < var14) {
                            break L8;
                          } else {
                            if (-421 < (var14 ^ -1)) {
                              var12 = 1 + var11;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var15 = var9 * (462 - var14) / 42;
                              var15 = var15 | (var15 << 980103152 | var15 << 423611272);
                              qn.field_d[var11 + param0 + qn.field_l * var8] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 57202544 | var9 << 1639885448);
                qn.e(param0 + var10, var8, -var10 + var11, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 >= this.field_O) {
        } else {
            var2 = this.field_V;
            var3 = this.field_U;
            fieldTemp$0 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (fieldTemp$0 >= this.field_O) {
                this.field_O = 0;
                this.m(param0 + -22);
            } else {
                var4 = this.field_R * (-this.field_R + 2 * this.field_O);
                var5 = this.field_O * this.field_O;
                var3 = var4 * (-this.field_S + this.field_U) / var5 + this.field_S;
                var2 = this.field_T + var4 * (this.field_V - this.field_T) / var5;
            }
            this.a(var2, (byte) 127, var3);
        }
        if (param0 != -1) {
            return true;
        }
        return super.a((byte) -1);
    }

    final static int a(int param0, String param1, vh param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        vh var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 15901) {
                break L1;
              } else {
                var5 = (vh) null;
                sf.a(-112, (String) null, (vh) null);
                break L1;
              }
            }
            var3_int = param2.field_q;
            var6 = (CharSequence) ((Object) param1);
            var4 = nr.a(var6, false);
            param2.a(true, var4.length);
            param2.field_q = param2.field_q + ds.field_c.a(0, var4, var4.length, param2.field_o, param2.field_q, (byte) 28);
            stackIn_3_0 = param2.field_q + -var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("sf.GB(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!(-1 > (param0 ^ -1))) {
            this.a(param3, (byte) 115, param2);
            return;
        }
        this.field_R = 0;
        this.field_U = param2;
        this.field_O = param0;
        this.field_S = this.field_w;
        this.field_V = param3;
        this.field_T = this.field_l;
        if (param1) {
            this.a(-36, true, -43, -81);
        }
    }

    boolean k(int param0) {
        int var2 = 125 / ((param0 - -1) / 44);
        this.l(-87);
        return super.k(66);
    }

    public static void h(byte param0) {
        field_P = null;
        field_Q = null;
        if (param0 <= 21) {
            sf.h((byte) -93);
        }
    }

    final static void a(byte param0, of param1) {
        int var2_int = 0;
        of var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1.d(-123);
            var2_int = -20 % ((param0 - -16) / 62);
            var3 = (of) ((Object) be.field_u.e((byte) 125));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (!var3.a(9687, param1)) {
                    break L2;
                  } else {
                    var3 = (of) ((Object) be.field_u.a((byte) 123));
                    continue L1;
                  }
                }
              }
              L3: {
                if (var3 == null) {
                  be.field_u.a((byte) -119, (tc) (param1));
                  break L3;
                } else {
                  stackIn_7_0 = -123;
                  fj.a((byte) stackIn_7_0, param1, var3);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("sf.KB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    void m(int param0) {
        int var2 = -52 % ((69 - param0) / 50);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        wk stackIn_43_0;
        int stackIn_43_1;
        int stackIn_43_2;
        int[][] stackIn_43_3;
        wk stackIn_44_0;
        int stackIn_44_1;
        int stackIn_44_2;
        int[][] stackIn_44_3;
        int stackIn_44_4;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        vb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_Q = (String) null;
                break L1;
              }
            }
            L2: {
              var6_int = og.field_p[param4] - -param4;
              if (cu.field_a) {
                L3: {
                  var7_int = bv.field_w.b(31, param0, param1, -1);
                  var8 = vs.field_e[param4].field_h;
                  if (4 == var8) {
                    break L3;
                  } else {
                    if (6 == var8) {
                      break L3;
                    } else {
                      if (-3 == (var8 ^ -1)) {
                        break L3;
                      } else {
                        if ((1 & var7_int) != 0) {
                          qq.a(var6_int, param2 ^ -12933, param5, param3);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (vs.field_e[param4].c(-121)) {
                    fe.a(wf.field_B[var6_int % 4], param3 - 10, -25 + param5);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var9 = fn.field_Q[vs.field_e[param4].field_h];
                  if (var9 > -1) {
                    if (2 == var9) {
                      fe.a(oq.field_l[17], -10 + param3, param5 + -25);
                      break L5;
                    } else {
                      if ((vs.field_e[param4].field_h ^ -1) == -4) {
                        ih.a((byte) -124, param3 + 30, param4 - -og.field_p[param4], 32 + param5);
                        break L5;
                      } else {
                        if ((var9 ^ -1) == -2) {
                          fe.a(oq.field_l[8 - -(var6_int % 3)], -10 + param3, param5 + -55);
                          break L5;
                        } else {
                          if (var9 == 9) {
                            fe.a(oq.field_l[14 - -(var6_int % 2)], -10 + param3, param5 - 30);
                            break L5;
                          } else {
                            if (8 != var9) {
                              if (-1 == (var9 ^ -1)) {
                                fe.a(oq.field_l[var6_int % 8 + 0], param3 + -10, param5 - 35);
                                break L5;
                              } else {
                                if (4 == var9) {
                                  ab.a(35 + param5, og.field_p[param4] + param4, param3 + 30, false);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            } else {
                              fe.a(oq.field_l[var6_int % 2 + 11], -10 + param3, param5 - 55);
                              break L5;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                rs.a(26449, param3, param4, param5);
                break L2;
              } else {
                break L2;
              }
            }
            var7 = (vb) ((Object) jf.field_C.field_pc.e((byte) 106));
            L6: while (true) {
              if (var7 == null) {
                L7: {
                  L8: {
                    if (vs.field_e[param4].field_c == null) {
                      break L8;
                    } else {
                      if (!vs.field_e[param4].field_c.field_u) {
                        wl.field_N.b(param3, param5);
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  break L7;
                }
                break L0;
              } else {
                L9: {
                  if (var7.field_x != param4) {
                    break L9;
                  } else {
                    if (!var7.field_n) {
                      if (null == var7.field_r.field_w) {
                        break L9;
                      } else {
                        if (var7.field_r.field_w.field_x == null) {
                          break L9;
                        } else {
                          if (!var7.field_z) {
                            L10: {
                              var8 = var7.field_r.field_w.field_x.field_e[0];
                              var9 = var7.field_r.field_w.field_x.field_e[1];
                              var10 = var7.field_r.field_w.field_O;
                              stackIn_43_0 = go.field_g;

                              stackIn_43_1 = -30 + var8;

                              stackIn_43_2 = var9 - 15;

                              stackIn_43_3 = op.field_c;

                              if (!bv.field_w.field_wb) {
                                stackIn_44_0 = (wk) ((Object) stackIn_43_0);
                                stackIn_44_1 = stackIn_43_1;
                                stackIn_44_2 = stackIn_43_2;
                                stackIn_44_3 = (int[][]) ((Object) stackIn_43_3);
                                stackIn_44_4 = 0;
                                break L10;
                              } else {
                                stackIn_44_0 = (wk) ((Object) stackIn_43_0);
                                stackIn_44_1 = stackIn_43_1;
                                stackIn_44_2 = stackIn_43_2;
                                stackIn_44_3 = (int[][]) ((Object) stackIn_43_3);
                                stackIn_44_4 = 1;
                                break L10;
                              }
                            }
                            ((wk) (Object) stackIn_44_0).b(stackIn_44_1, stackIn_44_2, stackIn_44_3[stackIn_44_4][var10]);
                            wl.field_N.b(var8 + -40, -20 + var9);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    } else {
                      var7 = (vb) ((Object) jf.field_C.field_pc.a((byte) 123));
                      continue L6;
                    }
                  }
                }
                var7 = (vb) ((Object) jf.field_C.field_pc.a((byte) 123));
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "sf.JB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void l(int param0) {
        if (!(0 < this.field_O)) {
            return;
        }
        this.a(this.field_V, (byte) 113, this.field_U);
        this.field_O = 0;
        int var2 = 40 % ((-25 - param0) / 57);
        this.m(-120);
    }

    sf(gk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_R = 0;
        this.field_O = 0;
    }

    static {
        field_Q = "Disruptive behaviour";
        field_P = new int[]{22, 1, 0, 39, 28, 46, 9, 22, 22, 2, 22, 22, 22, 47, 5, 29, 22, 22, 6, 48, 44, 22, 22, 22, 4, 22, 10, 42, 15, 40, 17, 10, 22, 11, 11, 32, 22, 12, 16, 23, 14, 2, 3, 22, 22, 20, 10, 22, 22, 22, 22, 43, 18, 19, 34, 24, 31, 21, 35, 8, 37, 36, 38, 25, 10, 33, 30, 22, 22, 22, 7, 41, 45, 22, 28, 13, 49, 22, 22, 22, 22, 28, 50, 51, 52, 53, 54, 55, 56, 53};
    }
}
