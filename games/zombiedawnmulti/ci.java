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
        gi var3 = null;
        int fieldTemp$0 = 0;
        try {
            var3 = new gi(param1);
            if (param0 <= 71) {
                field_h = (String) null;
            }
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            var3.field_k = fieldTemp$0;
            if (!(var3.field_j == 2)) {
                if (-5 != (var3.field_j ^ -1)) {
                }
            }
            this.field_b.a(var3, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ci.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 1475) {
            return;
        }
        field_d = null;
        field_c = null;
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_5_0 = null;
        String stackIn_15_0 = null;
        String stackOut_4_0 = null;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          var6 = "(" + k.field_k + " " + jp.field_e + " " + ij.field_d + ") " + op.field_i;
          var1 = var6;
          if (param0 < hd.field_q) {
            var1 = var6 + ":";
            var2 = 0;
            L1: while (true) {
              if (var2 >= hd.field_q) {
                break L0;
              } else {
                stackOut_4_0 = var1 + ' ';
                stackIn_15_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var5 != 0) {
                  return stackIn_15_0;
                } else {
                  L2: {
                    L3: {
                      var7 = stackIn_5_0;
                      var3 = 255 & s.field_e.field_m[var2];
                      var4 = var3 >> 2094073860;
                      var3 = var3 & 15;
                      if (10 <= var4) {
                        break L3;
                      } else {
                        var4 += 48;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 += 55;
                    break L2;
                  }
                  L4: {
                    L5: {
                      if (10 <= var3) {
                        break L5;
                      } else {
                        var3 += 48;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3 += 55;
                    break L4;
                  }
                  var8 = var7 + (char)var4;
                  var1 = var8 + (char)var3;
                  var2++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var1;
    }

    final byte[] a(byte param0, int param1) {
        th var3 = null;
        Object var4 = null;
        gi var4_ref = null;
        int var5 = 0;
        gi stackIn_5_0 = null;
        gi stackIn_12_0 = null;
        gi stackOut_4_0 = null;
        gi stackOut_11_0 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = this.field_b;
        var4 = null;
        if (param0 == -85) {
          var4_ref = (gi) ((Object) var3.c(113));
          L0: while (true) {
            L1: {
              L2: {
                if (var4_ref == null) {
                  break L2;
                } else {
                  stackOut_4_0 = (gi) (var4_ref);
                  stackIn_12_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_5_0.field_k != param1) {
                        break L3;
                      } else {
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4_ref = (gi) ((Object) var3.b(6));
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (var4_ref != null) {
                stackOut_11_0 = (gi) (var4_ref);
                stackIn_12_0 = stackOut_11_0;
                break L1;
              } else {
                return null;
              }
            }
            return stackIn_12_0.field_o;
          }
        } else {
          return (byte[]) null;
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cj var8_ref_cj = null;
        int var9_int = 0;
        mo var9 = null;
        int var10 = 0;
        mo var10_ref_mo = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cj var14 = null;
        cj var15 = null;
        int stackIn_4_0 = 0;
        cj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        cj stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        cj stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        Object stackIn_37_0 = null;
        mo stackIn_37_1 = null;
        Object stackIn_38_0 = null;
        mo stackIn_38_1 = null;
        int stackIn_48_0 = 0;
        mo stackIn_52_0 = null;
        Object stackIn_72_0 = null;
        mo stackIn_72_1 = null;
        Object stackIn_73_0 = null;
        mo stackIn_73_1 = null;
        Object stackIn_78_0 = null;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        cj stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        cj stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        cj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        Object stackOut_36_0 = null;
        mo stackOut_36_1 = null;
        Object stackOut_37_0 = null;
        mo stackOut_37_1 = null;
        int stackOut_46_0 = 0;
        int stackOut_47_0 = 0;
        mo stackOut_51_0 = null;
        Object stackOut_71_0 = null;
        mo stackOut_71_1 = null;
        Object stackOut_72_0 = null;
        mo stackOut_72_1 = null;
        cj stackOut_77_0 = null;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
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
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = da.field_a;
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = sq.field_Q;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        mf.a(stackIn_4_0, false);
                        em.field_U.a(0, mh.field_i.field_zb, 0, (byte) -74, -2 + (-40 + mh.field_i.field_z));
                        fn.field_h.a(jk.field_f, 0, ga.field_r.field_zb, 0, -3344);
                        stackOut_4_0 = ie.field_jb;
                        stackOut_4_1 = 18;
                        stackOut_4_2 = 2 + jk.field_f;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_6_1 = stackOut_4_1;
                        stackIn_6_2 = stackOut_4_2;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        if (tb.field_u) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (cj) ((Object) stackIn_5_0);
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = stackIn_5_2;
                        stackOut_5_3 = 0;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        stackIn_7_3 = stackOut_5_3;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (cj) ((Object) stackIn_6_0);
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = stackIn_6_2;
                        stackOut_6_3 = 2 + (40 + qa.field_o) + 2;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((cj) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, -stackIn_7_3 + ga.field_r.field_zb, 0, -3344);
                        bf.field_h.a(18, 2 + jk.field_f, 42 - -qa.field_o, -42 + -qa.field_o + ga.field_r.field_zb, -3344);
                        bf.field_n.a(qa.field_o, 2, ga.field_r.field_zb, 0, -2 + -jk.field_f + (ga.field_r.field_z + -20), -31465, 20 + (2 + jk.field_f));
                        jp.field_b.a(40, mh.field_i.field_z + -40, mh.field_i.field_zb, 0, -3344);
                        gg.field_m.a(30, 0, fc.field_a.field_zb, 0, -3344);
                        dl.field_a.a(-2 + fc.field_a.field_z - 70, 30, fc.field_a.field_zb, 0, -3344);
                        var2_int = 3 + kj.field_h;
                        if (2 > qo.field_r.length) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int--;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 83;
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
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = -2 + (-10 + dl.field_a.field_z - (8 + -((var2_int - -1) / 2))) / (var2_int + 1);
                        if ((var3 ^ -1) < -31) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = 30;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = -(var2_int * (var3 + 2)) + -5 + (dl.field_a.field_z - 5);
                        if ((var4 ^ -1) < -41) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = 40;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ik.field_d.a(var4, 5, -5 + (dl.field_a.field_zb - 5), 5, -3344);
                        var5 = var4 + 7;
                        var6 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (4 + kj.field_h <= var6) {
                            statePc = 77;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = -2;
                        stackOut_21_1 = var6 ^ -1;
                        stackIn_79_0 = stackOut_21_0;
                        stackIn_79_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (var13 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != stackIn_22_1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (2 > qo.field_r.length) {
                            statePc = 76;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (3 != var6) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-2 > (r.field_f ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var13 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-4 == (var6 ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!param0) {
                            statePc = 42;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-1 != (var6 ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var14 = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var14.field_zb = 0;
                        var8 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((ma.field_b[var6].length ^ -1) >= (var8 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = null;
                        stackOut_36_1 = ma.field_b[var6][var8];
                        stackIn_72_0 = stackOut_36_0;
                        stackIn_72_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (var13 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = (mo) ((Object) stackIn_37_1);
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 == stackIn_38_1) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = ma.field_b[var6][var8];
                        ma.field_b[var6][var8].field_z = 0;
                        var9.field_zb = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var13 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (!param0) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var6 < 4) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null == km.field_ab) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (!km.field_ab[var6 + -4]) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7 = stackIn_48_0;
                        if (var7 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8_ref_cj = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var8_ref_cj.field_zb = 0;
                        var9_int = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var9_int >= ma.field_b[var6].length) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = ma.field_b[var6][var9_int];
                        stackIn_78_0 = stackOut_51_0;
                        stackIn_52_0 = stackOut_51_0;
                        if (var13 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 != null) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var10_ref_mo = ma.field_b[var6][var9_int];
                        ma.field_b[var6][var9_int].field_z = 0;
                        var10_ref_mo.field_zb = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var9_int++;
                        if (var13 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var13 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        mi.field_Ib[var6].a(var3, var5, 103, 5, -3344);
                        var8 = 110;
                        if (!param0) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ma.field_b[var6][0].a(ed.field_c, 2, var3, 38, var8, var5, 2);
                        var8 += 40;
                        if (var13 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (ma.field_b[var6][0] == null) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var9 = ma.field_b[var6][0];
                        ma.field_b[var6][0].field_z = 0;
                        var9.field_zb = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var9_int = 2 + (-var8 + (-5 + fc.field_a.field_zb));
                        var10 = ma.field_b[var6].length - 1;
                        var11 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var10 <= var11) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var12 = var11 * var9_int / var10;
                        ma.field_b[var6][var11 + 1].a(ed.field_c, 2, var3, -var12 + var9_int * (var11 + 1) / var10 - 2, var8 + var12, var5, 2);
                        var11++;
                        if (var13 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var13 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var5 = var5 + (2 + var3);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var13 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var15 = mi.field_Ib[var6];
                        mi.field_Ib[var6].field_z = 0;
                        var15.field_zb = 0;
                        var8 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (ma.field_b[var6].length <= var8) {
                            statePc = 76;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = null;
                        stackOut_71_1 = ma.field_b[var6][var8];
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = stackIn_72_0;
                        stackOut_72_1 = (mo) ((Object) stackIn_72_1);
                        stackIn_38_0 = stackOut_72_0;
                        stackIn_38_1 = stackOut_72_1;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        if (var13 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0 == stackIn_73_1) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var9 = ma.field_b[var6][var8];
                        ma.field_b[var6][var8].field_z = 0;
                        var9.field_zb = 0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var6++;
                        if (var13 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        qf.field_b.a(-10 + (-4 + oo.field_l - 130), 10, 360, oo.field_b - 360 >> 246161921, -3344);
                        mq.field_l.a(24, 0, qf.field_b.field_zb, 0, -3344);
                        vb.field_c.a(-24 + qf.field_b.field_z, 24, qf.field_b.field_zb, 0, -3344);
                        vb.field_c.field_ab = tg.a(1, vb.field_c.field_z, 8421504, 3, 11579568, 35);
                        pd.field_b.a(-26 + (-10 + vb.field_c.field_z), 5, -10 + vb.field_c.field_zb, 5, -3344);
                        stackOut_77_0 = pg.field_a;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        ((cj) (Object) stackIn_78_0).a(24, -24 + vb.field_c.field_z + -5, 80, (-80 + vb.field_c.field_zb) / 2, -3344);
                        stackOut_78_0 = param1;
                        stackOut_78_1 = -6;
                        stackIn_79_0 = stackOut_78_0;
                        stackIn_79_1 = stackOut_78_1;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (stackIn_79_0 <= stackIn_79_1) {
                            statePc = 81;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    return;
                }
                case 81: {
                    try {
                        up.a(false);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "ci.C(" + param0 + ',' + param1 + ')');
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ci() {
        this.field_e = 0;
        this.field_b = new th();
    }

    static {
        field_a = 0;
        field_h = "Next";
        field_g = "Retry";
        field_c = new String[]{null, null, null, null, "You can tell the zombie where to go by <col=ff0000>right-clicking on the map</col>. Zombies are slow to react, but they'll get there eventually.", null, "Deselect your zombies by left-clicking a vacant spot on the map. Try that now."};
    }
}
