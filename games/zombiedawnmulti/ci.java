/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String[] field_c;
    static String field_f;
    static fm field_d;
    static int field_a;
    private int field_e;
    static String field_h;
    private th field_b;
    static String field_g;

    final void a(byte param0, byte[] param1) {
        RuntimeException runtimeException = null;
        gi var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3 = new gi(param1);
              if (param0 > 71) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            L2: {
              int fieldTemp$3 = ((ci) this).field_e;
              ((ci) this).field_e = ((ci) this).field_e + 1;
              var3.field_k = fieldTemp$3;
              if (var3.field_j != 2) {
                if (var3.field_j == 4) {
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            ((ci) this).field_b.a((br) (Object) var3, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("ci.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 1475) {
            return;
        }
        try {
            field_d = null;
            field_c = null;
            field_h = null;
            field_f = null;
            field_g = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ci.E(" + param0 + ')');
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        String stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_20_0 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + k.field_k + " " + jp.field_e + " " + ij.field_d + ") " + op.field_i;
                if (param0 < hd.field_q) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (var2 >= hd.field_q) {
                      break L2;
                    } else {
                      stackOut_6_0 = var1_ref + ' ';
                      stackIn_21_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            var1_ref = stackIn_7_0;
                            var3 = 255 & s.field_e.field_m[var2];
                            var4 = var3 >> 2094073860;
                            var3 = var3 & 15;
                            if (10 <= var4) {
                              break L5;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 55;
                          break L4;
                        }
                        L6: {
                          L7: {
                            if (10 <= var3) {
                              break L7;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 55;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_20_0 = (String) var1_ref;
              stackIn_21_0 = stackOut_20_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "ci.D(" + param0 + ')');
        }
        return stackIn_21_0;
    }

    final byte[] a(byte param0, int param1) {
        th var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        gi var4_ref = null;
        int var5 = 0;
        Object stackIn_3_0 = null;
        gi stackIn_7_0 = null;
        Object stackIn_18_0 = null;
        gi stackIn_20_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        gi stackOut_6_0 = null;
        Object stackOut_17_0 = null;
        gi stackOut_19_0 = null;
        byte[] stackOut_20_0 = null;
        Object stackOut_2_0 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = ((ci) this).field_b;
            var4 = null;
            if (param0 == -85) {
              var4_ref = (gi) (Object) var3.c(113);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4_ref == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = (gi) var4_ref;
                      stackIn_20_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0.field_k != param1) {
                            break L4;
                          } else {
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var4_ref = (gi) (Object) var3.b(6);
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (null == var4_ref) {
                    stackOut_17_0 = null;
                    stackIn_18_0 = stackOut_17_0;
                    return (byte[]) (Object) stackIn_18_0;
                  } else {
                    stackOut_19_0 = (gi) var4_ref;
                    stackIn_20_0 = stackOut_19_0;
                    break L2;
                  }
                }
                stackOut_20_0 = stackIn_20_0.field_o;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3_ref, "ci.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        cj var7 = null;
        int var7_int = 0;
        int var8 = 0;
        cj var8_ref_cj = null;
        int var9_int = 0;
        mo var9 = null;
        int var10 = 0;
        mo var10_ref_mo = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        cj stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        cj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        cj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        Object stackIn_58_0 = null;
        mo stackIn_58_1 = null;
        Object stackIn_60_0 = null;
        mo stackIn_60_1 = null;
        int stackIn_77_0 = 0;
        mo stackIn_81_0 = null;
        Object stackIn_107_0 = null;
        mo stackIn_107_1 = null;
        Object stackIn_108_0 = null;
        mo stackIn_108_1 = null;
        Object stackIn_113_0 = null;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        cj stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        cj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        cj stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        Object stackOut_57_0 = null;
        mo stackOut_57_1 = null;
        Object stackOut_58_0 = null;
        mo stackOut_58_1 = null;
        int stackOut_74_0 = 0;
        int stackOut_76_0 = 0;
        mo stackOut_80_0 = null;
        Object stackOut_106_0 = null;
        mo stackOut_106_1 = null;
        Object stackOut_107_0 = null;
        mo stackOut_107_1 = null;
        cj stackOut_112_0 = null;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        dm.field_Qb = oo.field_l;
                        kp.field_l = oo.field_b;
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = da.field_a;
                        stackIn_5_0 = stackOut_2_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = sq.field_Q;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        mf.a(stackIn_5_0, false);
                        em.field_U.a(0, mh.field_i.field_zb, 0, (byte) -74, -2 + (-40 + mh.field_i.field_z));
                        fn.field_h.a(jk.field_f, 0, ga.field_r.field_zb, 0, -3344);
                        stackOut_5_0 = ie.field_jb;
                        stackOut_5_1 = 18;
                        stackOut_5_2 = 2 + jk.field_f;
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        stackIn_6_2 = stackOut_5_2;
                        if (tb.field_u) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (cj) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = stackIn_6_2;
                        stackOut_6_3 = 0;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        stackIn_9_3 = stackOut_6_3;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (cj) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = stackIn_8_2;
                        stackOut_8_3 = 2 + (40 + qa.field_o) + 2;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        stackIn_9_3 = stackOut_8_3;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((cj) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, -stackIn_9_3 + ga.field_r.field_zb, 0, -3344);
                        bf.field_h.a(18, 2 + jk.field_f, 42 - -qa.field_o, -42 + -qa.field_o + ga.field_r.field_zb, -3344);
                        bf.field_n.a(qa.field_o, 2, ga.field_r.field_zb, 0, -2 + -jk.field_f + (ga.field_r.field_z + -20), -31465, 20 + (2 + jk.field_f));
                        jp.field_b.a(40, mh.field_i.field_z + -40, mh.field_i.field_zb, 0, -3344);
                        gg.field_m.a(30, 0, fc.field_a.field_zb, 0, -3344);
                        dl.field_a.a(-2 + fc.field_a.field_z - 70, 30, fc.field_a.field_zb, 0, -3344);
                        var2_int = 3 + kj.field_h;
                        if (2 > qo.field_r.length) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_int--;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int--;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3 = -2 + (-10 + dl.field_a.field_z - (8 + -((var2_int - -1) / 2))) / (var2_int + 1);
                        if (var3 > 30) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3 = 30;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = -(var2_int * (var3 + 2)) + -5 + (dl.field_a.field_z - 5);
                        if (var4 > 40) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4 = 40;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ik.field_d.a(var4, 5, -5 + (dl.field_a.field_zb - 5), 5, -3344);
                        var5 = var4 + 7;
                        var6 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (4 + kj.field_h <= var6) {
                            statePc = 112;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = -2;
                        stackOut_27_1 = ~var6;
                        stackIn_114_0 = stackOut_27_0;
                        stackIn_114_1 = stackOut_27_1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        if (var13 != 0) {
                            statePc = 114;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 != stackIn_28_1) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (2 > qo.field_r.length) {
                            statePc = 111;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (3 != var6) {
                            statePc = 43;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (r.field_f > 1) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var13 == 0) {
                            statePc = 111;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (param0) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var6 == 3) {
                            statePc = 104;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!param0) {
                            statePc = 64;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var6 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var7 = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var7.field_zb = 0;
                        var8 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (~ma.field_b[var6].length >= ~var8) {
                            statePc = 63;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = null;
                        stackOut_57_1 = ma.field_b[var6][var8];
                        stackIn_107_0 = stackOut_57_0;
                        stackIn_107_1 = stackOut_57_1;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        if (var13 != 0) {
                            statePc = 107;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = stackIn_58_0;
                        stackOut_58_1 = (mo) (Object) stackIn_58_1;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 == (Object) (Object) stackIn_60_1) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var9 = ma.field_b[var6][var8];
                        ma.field_b[var6][var8].field_z = 0;
                        var9.field_zb = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var13 == 0) {
                            statePc = 111;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (!param0) {
                            statePc = 76;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var6 < 4) {
                            statePc = 76;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (null == km.field_ab) {
                            statePc = 76;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (!km.field_ab[var6 + -4]) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = 1;
                        stackIn_77_0 = stackOut_74_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = 0;
                        stackIn_77_0 = stackOut_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var7_int = stackIn_77_0;
                        if (var7_int == 0) {
                            statePc = 88;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var8_ref_cj = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var8_ref_cj.field_zb = 0;
                        var9_int = 0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var9_int >= ma.field_b[var6].length) {
                            statePc = 87;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackOut_80_0 = ma.field_b[var6][var9_int];
                        stackIn_113_0 = (Object) (Object) stackOut_80_0;
                        stackIn_81_0 = stackOut_80_0;
                        if (var13 != 0) {
                            statePc = 113;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (stackIn_81_0 != null) {
                            statePc = 85;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var10_ref_mo = ma.field_b[var6][var9_int];
                        ma.field_b[var6][var9_int].field_z = 0;
                        var10_ref_mo.field_zb = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var9_int++;
                        if (var13 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var13 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        mi.field_Ib[var6].a(var3, var5, 103, 5, -3344);
                        var8 = 110;
                        if (!param0) {
                            statePc = 92;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        ma.field_b[var6][0].a(ed.field_c, 2, var3, 38, var8, var5, 2);
                        var8 += 40;
                        if (var13 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (ma.field_b[var6][0] == null) {
                            statePc = 96;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var9 = ma.field_b[var6][0];
                        ma.field_b[var6][0].field_z = 0;
                        var9.field_zb = 0;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var9_int = 2 + (-var8 + (-5 + fc.field_a.field_zb));
                        var10 = ma.field_b[var6].length - 1;
                        var11 = 0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var10 <= var11) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var12 = var11 * var9_int / var10;
                        ma.field_b[var6][var11 + 1].a(ed.field_c, 2, var3, -var12 + var9_int * (var11 + 1) / var10 - 2, var8 + var12, var5, 2);
                        var11++;
                        if (var13 != 0) {
                            statePc = 103;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var13 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var5 = var5 + (2 + var3);
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (var13 == 0) {
                            statePc = 111;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var7 = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var7.field_zb = 0;
                        var8 = 0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (ma.field_b[var6].length <= var8) {
                            statePc = 111;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackOut_106_0 = null;
                        stackOut_106_1 = ma.field_b[var6][var8];
                        stackIn_107_0 = stackOut_106_0;
                        stackIn_107_1 = stackOut_106_1;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackOut_107_0 = stackIn_107_0;
                        stackOut_107_1 = (mo) (Object) stackIn_107_1;
                        stackIn_60_0 = stackOut_107_0;
                        stackIn_60_1 = stackOut_107_1;
                        stackIn_108_0 = stackOut_107_0;
                        stackIn_108_1 = stackOut_107_1;
                        if (var13 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (stackIn_108_0 == (Object) (Object) stackIn_108_1) {
                            statePc = 110;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var9 = ma.field_b[var6][var8];
                        ma.field_b[var6][var8].field_z = 0;
                        var9.field_zb = 0;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 105;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var6++;
                        if (var13 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        qf.field_b.a(-10 + (-4 + oo.field_l - 130), 10, 360, oo.field_b - 360 >> 246161921, -3344);
                        mq.field_l.a(24, 0, qf.field_b.field_zb, 0, -3344);
                        vb.field_c.a(-24 + qf.field_b.field_z, 24, qf.field_b.field_zb, 0, -3344);
                        vb.field_c.field_ab = tg.a(1, vb.field_c.field_z, 8421504, 3, 11579568, 35);
                        pd.field_b.a(-26 + (-10 + vb.field_c.field_z), 5, -10 + vb.field_c.field_zb, 5, -3344);
                        stackOut_112_0 = pg.field_a;
                        stackIn_113_0 = (Object) (Object) stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        ((cj) (Object) stackIn_113_0).a(24, -24 + vb.field_c.field_z + -5, 80, (-80 + vb.field_c.field_zb) / 2, -3344);
                        stackOut_113_0 = param1;
                        stackOut_113_1 = -6;
                        stackIn_114_0 = stackOut_113_0;
                        stackIn_114_1 = stackOut_113_1;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (stackIn_114_0 <= stackIn_114_1) {
                            statePc = 116;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    return;
                }
                case 116: {
                    try {
                        up.a(false);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 118: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var2, "ci.C(" + param0 + ',' + param1 + ')');
                }
                case 119: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ci() {
        ((ci) this).field_e = 0;
        try {
            ((ci) this).field_b = new th();
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ci.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_h = "Next";
        field_g = "Retry";
        field_c = new String[]{null, null, null, null, "You can tell the zombie where to go by <col=ff0000>right-clicking on the map</col>. Zombies are slow to react, but they'll get there eventually.", null, "Deselect your zombies by left-clicking a vacant spot on the map. Try that now."};
    }
}
