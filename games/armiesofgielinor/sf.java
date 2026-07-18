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
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    qn.e(param0, var8, 6, var9);
                    qn.e(param0 + ((sf) this).field_l + -6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + var7 * (-var5 + var6) / var4;
                var9 = var9 | (var9 << 16 | var9 << 8);
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
                  if (var7 > 20) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (20 < var10) {
                        break L4;
                      } else {
                        var12 = (-var10 + 20) * (-var10 + 20) + (-var7 + 20) * (-var7 + 20);
                        if (var12 <= 462) {
                          if (var12 < 420) {
                            break L4;
                          } else {
                            var13 = var9 * (462 - var12) / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
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
                  if (var7 <= 20) {
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
                            if (var14 < 420) {
                              var12 = 1 + var11;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var15 = var9 * (462 - var14) / 42;
                              var15 = var15 | (var15 << 16 | var15 << 8);
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
                var9 = var9 | (var9 << 16 | var9 << 8);
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
            int fieldTemp$0 = ((sf) this).field_R + 1;
            ((sf) this).field_R = ((sf) this).field_R + 1;
            if (fieldTemp$0 >= ((sf) this).field_O) {
                ((sf) this).field_O = 0;
                ((sf) this).m(-23);
            } else {
                var4 = ((sf) this).field_R * (-((sf) this).field_R + 2 * ((sf) this).field_O);
                var5 = ((sf) this).field_O * ((sf) this).field_O;
                var3 = var4 * (-((sf) this).field_S + ((sf) this).field_U) / var5 + ((sf) this).field_S;
                var2 = ((sf) this).field_T + var4 * (((sf) this).field_V - ((sf) this).field_T) / var5;
            }
            ((sf) this).a(var2, (byte) 127, var3);
        }
        return super.a((byte) -1);
    }

    final static int a(int param0, String param1, vh param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 15901) {
                break L1;
              } else {
                var5 = null;
                int discarded$2 = sf.a(-112, (String) null, (vh) null);
                break L1;
              }
            }
            var3_int = param2.field_q;
            var6 = (CharSequence) (Object) param1;
            var4 = nr.a(var6, false);
            param2.a(true, var4.length);
            param2.field_q = param2.field_q + ds.field_c.a(0, var4, var4.length, param2.field_o, param2.field_q, (byte) 28);
            stackOut_2_0 = param2.field_q + -var3_int;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("sf.GB(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!(param0 > 0)) {
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
        int var2 = 62;
        ((sf) this).l(-87);
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
        RuntimeException var2 = null;
        of var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1.d(-123);
            var2_int = -20 % ((param0 - -16) / 62);
            var3 = (of) (Object) be.field_u.e((byte) 125);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (!var3.a(9687, param1)) {
                    break L2;
                  } else {
                    var3 = (of) (Object) be.field_u.a((byte) 123);
                    continue L1;
                  }
                }
              }
              L3: {
                if (var3 == null) {
                  be.field_u.a((byte) -119, (tc) (Object) param1);
                  break L3;
                } else {
                  fj.a((byte) -123, (tc) (Object) param1, (tc) (Object) var3);
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
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("sf.KB(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    void m(int param0) {
        int var2 = -52 % ((69 - param0) / 50);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7_int = 0;
        vb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wk stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int[][] stackIn_40_3 = null;
        wk stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int[][] stackIn_41_3 = null;
        wk stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int[][] stackIn_42_3 = null;
        int stackIn_42_4 = 0;
        RuntimeException decompiledCaughtException = null;
        wk stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int[][] stackOut_39_3 = null;
        wk stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int[][] stackOut_41_3 = null;
        int stackOut_41_4 = 0;
        wk stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int[][] stackOut_40_3 = null;
        int stackOut_40_4 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = og.field_p[param4] - -param4;
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
                      if (var8 == 2) {
                        break L2;
                      } else {
                        if ((1 & var7_int) != 0) {
                          qq.a(var6_int, -12933, param5, param3);
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
                    fe.a(wf.field_B[var6_int % 4], param3 - 10, -25 + param5);
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
                      if (vs.field_e[param4].field_h == 3) {
                        ih.a((byte) -124, param3 + 30, param4 - -og.field_p[param4], 32 + param5);
                        break L4;
                      } else {
                        if (var9 == 1) {
                          fe.a(oq.field_l[8 - -(var6_int % 3)], -10 + param3, param5 + -55);
                          break L4;
                        } else {
                          if (var9 == 9) {
                            fe.a(oq.field_l[14 - -(var6_int % 2)], -10 + param3, param5 - 30);
                            break L4;
                          } else {
                            if (8 != var9) {
                              if (var9 == 0) {
                                fe.a(oq.field_l[var6_int % 8], param3 + -10, param5 - 35);
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
                              fe.a(oq.field_l[var6_int % 2 + 11], -10 + param3, param5 - 55);
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
                break L0;
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
                              stackOut_39_0 = go.field_g;
                              stackOut_39_1 = -30 + var8;
                              stackOut_39_2 = var9 - 15;
                              stackOut_39_3 = op.field_c;
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_41_2 = stackOut_39_2;
                              stackIn_41_3 = stackOut_39_3;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              stackIn_40_2 = stackOut_39_2;
                              stackIn_40_3 = stackOut_39_3;
                              if (!bv.field_w.field_wb) {
                                stackOut_41_0 = (wk) (Object) stackIn_41_0;
                                stackOut_41_1 = stackIn_41_1;
                                stackOut_41_2 = stackIn_41_2;
                                stackOut_41_3 = (int[][]) (Object) stackIn_41_3;
                                stackOut_41_4 = 0;
                                stackIn_42_0 = stackOut_41_0;
                                stackIn_42_1 = stackOut_41_1;
                                stackIn_42_2 = stackOut_41_2;
                                stackIn_42_3 = stackOut_41_3;
                                stackIn_42_4 = stackOut_41_4;
                                break L8;
                              } else {
                                stackOut_40_0 = (wk) (Object) stackIn_40_0;
                                stackOut_40_1 = stackIn_40_1;
                                stackOut_40_2 = stackIn_40_2;
                                stackOut_40_3 = (int[][]) (Object) stackIn_40_3;
                                stackOut_40_4 = 1;
                                stackIn_42_0 = stackOut_40_0;
                                stackIn_42_1 = stackOut_40_1;
                                stackIn_42_2 = stackOut_40_2;
                                stackIn_42_3 = stackOut_40_3;
                                stackIn_42_4 = stackOut_40_4;
                                break L8;
                              }
                            }
                            ((wk) (Object) stackIn_42_0).b(stackIn_42_1, stackIn_42_2, stackIn_42_3[stackIn_42_4][var10]);
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "sf.JB(" + param0 + ',' + param1 + ',' + 0 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
