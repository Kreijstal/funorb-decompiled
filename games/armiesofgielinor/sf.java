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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        qn.a(6 + param0, 35 + param2, ((sf) this).field_l - 12, ((sf) this).field_w + -40, 2105376, 0);
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
                  gt.field_e.g(((sf) this).field_l + (param0 + -90), 10 + param2);
                  gb.a(t.field_d, param0 - -5, param2 - -35, ((sf) this).field_l - 10, 8941);
                  gb.a(ip.field_c, param0, -22 + param2 - -((sf) this).field_w, ((sf) this).field_l, param1 ^ 1851672364);
                  var4 = ((sf) this).field_w - 79;
                  var6 = 127;
                  var5 = 169;
                  if (param1 == 1851680193) {
                    break L2;
                  } else {
                    var17 = null;
                    int discarded$1 = sf.a(-110, (String) null, (vh) null);
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
                    qn.e(param0 + ((sf) this).field_l + -6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + var7 * (-var5 + var6) / var4;
                var9 = var9 | (var9 << 809398608 | var9 << 1874934216);
                qn.e(param0, var8, 6, var9);
                qn.e(param0 - (-((sf) this).field_l + 6), var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (var8 >= qn.field_a) {
              if (var8 < qn.field_f) {
                L4: {
                  var9 = var5 + var7 * (var6 - var5) / var4;
                  var10 = 0;
                  var11 = ((sf) this).field_l;
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
        int var4 = 0;
        int var5 = 0;
        if (0 >= ((sf) this).field_O) {
        } else {
            var2 = ((sf) this).field_V;
            var3 = ((sf) this).field_U;
            ((sf) this).field_R = ((sf) this).field_R + 1;
            if (((sf) this).field_R + 1 >= ((sf) this).field_O) {
                ((sf) this).field_O = 0;
                ((sf) this).m(param0 + -22);
            } else {
                var4 = ((sf) this).field_R * (-((sf) this).field_R + 2 * ((sf) this).field_O);
                var5 = ((sf) this).field_O * ((sf) this).field_O;
                var3 = var4 * (-((sf) this).field_S + ((sf) this).field_U) / var5 + ((sf) this).field_S;
                var2 = ((sf) this).field_T + var4 * (((sf) this).field_V - ((sf) this).field_T) / var5;
            }
            ((sf) this).a(var2, (byte) 127, var3);
        }
        if (param0 != -1) {
            return true;
        }
        return this.a((byte) -1);
    }

    final static int a(int param0, String param1, vh param2) {
        if (param0 != 15901) {
            Object var5 = null;
            int discarded$0 = sf.a(-112, (String) null, (vh) null);
        }
        int var3 = param2.field_q;
        CharSequence var6 = (CharSequence) (Object) param1;
        byte[] var4 = nr.a(var6, false);
        param2.a(true, var4.length);
        param2.field_q = param2.field_q + ds.field_c.a(0, var4, var4.length, param2.field_o, param2.field_q, (byte) 28);
        return param2.field_q + -var3;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!(-1 > (param0 ^ -1))) {
            ((sf) this).a(param3, (byte) 115, param2);
            return;
        }
        ((sf) this).field_R = 0;
        ((sf) this).field_U = param2;
        ((sf) this).field_O = param0;
        ((sf) this).field_S = ((sf) this).field_w;
        ((sf) this).field_V = param3;
        ((sf) this).field_T = ((sf) this).field_l;
        if (param1) {
            ((sf) this).a(-36, true, -43, -81);
        }
    }

    boolean k(int param0) {
        int var2 = 125 / ((param0 - -1) / 44);
        ((sf) this).l(-87);
        return this.k(66);
    }

    public static void h(byte param0) {
        field_P = null;
        field_Q = null;
        if (param0 <= 21) {
            sf.h((byte) -93);
        }
    }

    final static void a(byte param0, of param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        param1.d(-123);
        int var2 = -20 % ((param0 - -16) / 62);
        of var3 = (of) (Object) be.field_u.e((byte) 125);
        while (var3 != null) {
            // ifeq L64
            var3 = (of) (Object) be.field_u.a((byte) 123);
        }
        if (var3 != null) {
            fj.a((byte) -123, (tc) (Object) param1, (tc) (Object) var3);
        } else {
            be.field_u.a((byte) -119, (tc) (Object) param1);
        }
    }

    void m(int param0) {
        int var2 = -52 % ((69 - param0) / 50);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7_int = 0;
        vb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wk stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int[][] stackIn_41_3 = null;
        wk stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int[][] stackIn_42_3 = null;
        wk stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int[][] stackIn_43_3 = null;
        int stackIn_43_4 = 0;
        wk stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int[][] stackOut_40_3 = null;
        wk stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int[][] stackOut_42_3 = null;
        int stackOut_42_4 = 0;
        wk stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int[][] stackOut_41_3 = null;
        int stackOut_41_4 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param2 == 0) {
            break L0;
          } else {
            field_Q = null;
            break L0;
          }
        }
        L1: {
          var6 = og.field_p[param4] - -param4;
          if (cu.field_a) {
            L2: {
              var7_int = bv.field_w.b(31, param0, param1, -1);
              var8 = vs.field_e[param4].field_h;
              if (4 == var8) {
                break L2;
              } else {
                if (6 == var8) {
                  break L2;
                } else {
                  if (-3 == (var8 ^ -1)) {
                    break L2;
                  } else {
                    if ((1 & var7_int) != 0) {
                      qq.a(var6, param2 ^ -12933, param5, param3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (vs.field_e[param4].c(-121)) {
                fe.a(wf.field_B[var6 % 4], param3 - 10, -25 + param5);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var9 = fn.field_Q[vs.field_e[param4].field_h];
              if (var9 > -1) {
                if (2 == var9) {
                  fe.a(oq.field_l[17], -10 + param3, param5 + -25);
                  break L4;
                } else {
                  if ((vs.field_e[param4].field_h ^ -1) == -4) {
                    ih.a((byte) -124, param3 + 30, param4 - -og.field_p[param4], 32 + param5);
                    break L4;
                  } else {
                    if ((var9 ^ -1) == -2) {
                      fe.a(oq.field_l[8 - -(var6 % 3)], -10 + param3, param5 + -55);
                      break L4;
                    } else {
                      if (var9 == 9) {
                        fe.a(oq.field_l[14 - -(var6 % 2)], -10 + param3, param5 - 30);
                        break L4;
                      } else {
                        if (8 != var9) {
                          if (-1 == (var9 ^ -1)) {
                            fe.a(oq.field_l[var6 % 8 + 0], param3 + -10, param5 - 35);
                            break L4;
                          } else {
                            if (4 == var9) {
                              ab.a(35 + param5, og.field_p[param4] + param4, param3 + 30, false);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        } else {
                          fe.a(oq.field_l[var6 % 2 + 11], -10 + param3, param5 - 55);
                          break L4;
                        }
                      }
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            rs.a(26449, param3, param4, param5);
            break L1;
          } else {
            break L1;
          }
        }
        var7 = (vb) (Object) jf.field_C.field_pc.e((byte) 106);
        L5: while (true) {
          if (var7 == null) {
            L6: {
              if (vs.field_e[param4].field_c == null) {
                break L6;
              } else {
                if (!vs.field_e[param4].field_c.field_u) {
                  wl.field_N.b(param3, param5);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            return;
          } else {
            L7: {
              if (var7.field_x != param4) {
                break L7;
              } else {
                if (!var7.field_n) {
                  if (null == var7.field_r.field_w) {
                    break L7;
                  } else {
                    if (var7.field_r.field_w.field_x == null) {
                      break L7;
                    } else {
                      if (!var7.field_z) {
                        L8: {
                          var8 = var7.field_r.field_w.field_x.field_e[0];
                          var9 = var7.field_r.field_w.field_x.field_e[1];
                          var10 = var7.field_r.field_w.field_O;
                          stackOut_40_0 = go.field_g;
                          stackOut_40_1 = -30 + var8;
                          stackOut_40_2 = var9 - 15;
                          stackOut_40_3 = op.field_c;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          stackIn_42_2 = stackOut_40_2;
                          stackIn_42_3 = stackOut_40_3;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          stackIn_41_2 = stackOut_40_2;
                          stackIn_41_3 = stackOut_40_3;
                          if (!bv.field_w.field_wb) {
                            stackOut_42_0 = (wk) (Object) stackIn_42_0;
                            stackOut_42_1 = stackIn_42_1;
                            stackOut_42_2 = stackIn_42_2;
                            stackOut_42_3 = (int[][]) (Object) stackIn_42_3;
                            stackOut_42_4 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            stackIn_43_2 = stackOut_42_2;
                            stackIn_43_3 = stackOut_42_3;
                            stackIn_43_4 = stackOut_42_4;
                            break L8;
                          } else {
                            stackOut_41_0 = (wk) (Object) stackIn_41_0;
                            stackOut_41_1 = stackIn_41_1;
                            stackOut_41_2 = stackIn_41_2;
                            stackOut_41_3 = (int[][]) (Object) stackIn_41_3;
                            stackOut_41_4 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            stackIn_43_2 = stackOut_41_2;
                            stackIn_43_3 = stackOut_41_3;
                            stackIn_43_4 = stackOut_41_4;
                            break L8;
                          }
                        }
                        ((wk) (Object) stackIn_43_0).b(stackIn_43_1, stackIn_43_2, stackIn_43_3[stackIn_43_4][var10]);
                        wl.field_N.b(var8 + -40, -20 + var9);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                } else {
                  var7 = (vb) (Object) jf.field_C.field_pc.a((byte) 123);
                  continue L5;
                }
              }
            }
            var7 = (vb) (Object) jf.field_C.field_pc.a((byte) 123);
            continue L5;
          }
        }
    }

    void l(int param0) {
        if (!(0 < ((sf) this).field_O)) {
            return;
        }
        ((sf) this).a(((sf) this).field_V, (byte) 113, ((sf) this).field_U);
        ((sf) this).field_O = 0;
        int var2 = 40 % ((-25 - param0) / 57);
        ((sf) this).m(-120);
    }

    sf(gk param0, int param1, int param2) {
        super(param0, param1, param2);
        ((sf) this).field_R = 0;
        ((sf) this).field_O = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Disruptive behaviour";
        field_P = new int[]{22, 1, 0, 39, 28, 46, 9, 22, 22, 2, 22, 22, 22, 47, 5, 29, 22, 22, 6, 48, 44, 22, 22, 22, 4, 22, 10, 42, 15, 40, 17, 10, 22, 11, 11, 32, 22, 12, 16, 23, 14, 2, 3, 22, 22, 20, 10, 22, 22, 22, 22, 43, 18, 19, 34, 24, 31, 21, 35, 8, 37, 36, 38, 25, 10, 33, 30, 22, 22, 22, 7, 41, 45, 22, 28, 13, 49, 22, 22, 22, 22, 28, 50, 51, 52, 53, 54, 55, 56, 53};
    }
}
