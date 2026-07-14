/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class at extends ofa implements tsa {
    static volatile int field_X;
    private sta field_T;
    private rj field_Z;
    private rj[] field_U;
    private rj field_N;
    private dh[] field_P;
    private rj field_W;
    static String field_Q;
    static String field_R;
    private rla field_ab;
    private boolean field_O;
    private rj field_L;
    private rj field_V;
    private boolean field_M;
    private boolean field_Y;
    private rj field_S;

    final static void j(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TombRacer.field_G ? 1 : 0;
                    var1 = (Object) (Object) nfa.field_n;
                    // monitorenter nfa.field_n
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 3321) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        cda.field_p = cda.field_p + 1;
                        vha.field_b = nt.field_a;
                        if (0 > ita.field_f) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (hka.field_a == ita.field_f) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = cna.field_c[hka.field_a];
                        hka.field_a = 127 & hka.field_a + 1;
                        if (-1 < (var2 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        oj.field_tb[var2] = true;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        oj.field_tb[var2 ^ -1] = false;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = 0;
                        var2 = var5;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (112 <= var5) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        oj.field_tb[var5] = false;
                        var5++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ita.field_f = hka.field_a;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        nt.field_a = rca.field_n;
                        // monitorexit var1
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var3;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    at(jta param0) {
        super(param0, 430, 254);
        int var2 = 0;
        int var3 = 0;
        dh[] var3_ref_dh__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        rj var6 = null;
        int var7_int = 0;
        ae var7 = null;
        dh var8 = null;
        String var10 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_53_0 = null;
        sta stackIn_53_1 = null;
        sta stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        Object stackIn_54_0 = null;
        sta stackIn_54_1 = null;
        sta stackIn_54_2 = null;
        int stackIn_54_3 = 0;
        Object stackIn_55_0 = null;
        sta stackIn_55_1 = null;
        sta stackIn_55_2 = null;
        int stackIn_55_3 = 0;
        Object stackIn_56_0 = null;
        sta stackIn_56_1 = null;
        sta stackIn_56_2 = null;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String stackIn_78_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        Object stackOut_52_0 = null;
        sta stackOut_52_1 = null;
        sta stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        Object stackOut_53_0 = null;
        sta stackOut_53_1 = null;
        sta stackOut_53_2 = null;
        int stackOut_53_3 = 0;
        Object stackOut_54_0 = null;
        sta stackOut_54_1 = null;
        sta stackOut_54_2 = null;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        Object stackOut_55_0 = null;
        sta stackOut_55_1 = null;
        sta stackOut_55_2 = null;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_77_0 = null;
        String stackOut_76_0 = null;
        L0: {
          ((at) this).field_P = af.a(99, dsa.field_c);
          if ((((at) this).field_P.length ^ -1) >= -1) {
            break L0;
          } else {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ((at) this).field_P.length) {
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (((at) this).field_P.length <= var3) {
                    var3_ref_dh__ = ((at) this).field_P;
                    ((at) this).field_P = new dh[var2];
                    var4 = 0;
                    var5 = 0;
                    L3: while (true) {
                      if (var3_ref_dh__.length <= var5) {
                        ag.a(-95, ((at) this).field_P);
                        break L0;
                      } else {
                        if (var3_ref_dh__[var5] != null) {
                          var4++;
                          ((at) this).field_P[var4] = var3_ref_dh__[var5];
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (null != ((at) this).field_P[var3]) {
                      var2++;
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (((at) this).field_P[var2] != null) {
                  var3 = var2 - -1;
                  L4: while (true) {
                    if (var3 >= ((at) this).field_P.length) {
                      if (wba.field_o != null) {
                        if (null != ((at) this).field_P[var2]) {
                          if (!wba.field_o.a(((at) this).field_P[var2].field_c, (byte) 43, ((at) this).field_P[var2].field_a)) {
                            ((at) this).field_P[var2] = null;
                            var2++;
                            continue L1;
                          } else {
                            var2++;
                            continue L1;
                          }
                        } else {
                          var2++;
                          continue L1;
                        }
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      if (null != ((at) this).field_P[var3]) {
                        if (((at) this).field_P[var3].field_a == ((at) this).field_P[var2].field_a) {
                          if (((at) this).field_P[var2].field_c == ((at) this).field_P[var3].field_c) {
                            ((at) this).field_P[var3] = null;
                            var3++;
                            continue L4;
                          } else {
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
        L5: {
          stackOut_32_0 = this;
          stackIn_34_0 = stackOut_32_0;
          stackIn_33_0 = stackOut_32_0;
          if (-1 <= (((at) this).field_P.length ^ -1)) {
            stackOut_34_0 = this;
            stackOut_34_1 = 0;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            break L5;
          } else {
            stackOut_33_0 = this;
            stackOut_33_1 = 1;
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            break L5;
          }
        }
        L6: {
          ((at) this).field_M = stackIn_35_1 != 0;
          if (!sta.g((byte) 97)) {
            stackOut_37_0 = 0;
            stackIn_38_0 = stackOut_37_0;
            break L6;
          } else {
            stackOut_36_0 = 1;
            stackIn_38_0 = stackOut_36_0;
            break L6;
          }
        }
        L7: {
          var2 = stackIn_38_0;
          stackOut_38_0 = this;
          stackIn_40_0 = stackOut_38_0;
          stackIn_39_0 = stackOut_38_0;
          if (vpa.a(56)) {
            stackOut_40_0 = this;
            stackOut_40_1 = 0;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            break L7;
          } else {
            stackOut_39_0 = this;
            stackOut_39_1 = 1;
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            break L7;
          }
        }
        L8: {
          ((at) this).field_Y = stackIn_41_1 != 0;
          if (var2 != 0) {
            stackOut_43_0 = 3;
            stackIn_44_0 = stackOut_43_0;
            break L8;
          } else {
            stackOut_42_0 = 2;
            stackIn_44_0 = stackOut_42_0;
            break L8;
          }
        }
        L9: {
          var3 = stackIn_44_0;
          if (var2 == 0) {
            if (wba.field_o != null) {
              if (wba.field_o.d(-1)) {
                stackOut_50_0 = 1;
                stackIn_52_0 = stackOut_50_0;
                break L9;
              } else {
                stackOut_49_0 = 0;
                stackIn_52_0 = stackOut_49_0;
                break L9;
              }
            } else {
              stackOut_47_0 = 0;
              stackIn_52_0 = stackOut_47_0;
              break L9;
            }
          } else {
            stackOut_45_0 = 0;
            stackIn_52_0 = stackOut_45_0;
            break L9;
          }
        }
        L10: {
          L11: {
            var4 = stackIn_52_0;
            stackOut_52_0 = this;
            stackOut_52_1 = null;
            stackOut_52_2 = null;
            stackOut_52_3 = 10;
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_55_2 = stackOut_52_2;
            stackIn_55_3 = stackOut_52_3;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            stackIn_53_2 = stackOut_52_2;
            stackIn_53_3 = stackOut_52_3;
            if (var2 != 0) {
              break L11;
            } else {
              stackOut_53_0 = this;
              stackOut_53_1 = null;
              stackOut_53_2 = null;
              stackOut_53_3 = stackIn_53_3;
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              stackIn_55_3 = stackOut_53_3;
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              stackIn_54_3 = stackOut_53_3;
              if (var4 != 0) {
                break L11;
              } else {
                stackOut_54_0 = this;
                stackOut_54_1 = null;
                stackOut_54_2 = null;
                stackOut_54_3 = stackIn_54_3;
                stackOut_54_4 = 75;
                stackIn_56_0 = stackOut_54_0;
                stackIn_56_1 = stackOut_54_1;
                stackIn_56_2 = stackOut_54_2;
                stackIn_56_3 = stackOut_54_3;
                stackIn_56_4 = stackOut_54_4;
                break L10;
              }
            }
          }
          stackOut_55_0 = this;
          stackOut_55_1 = null;
          stackOut_55_2 = null;
          stackOut_55_3 = stackIn_55_3;
          stackOut_55_4 = 58;
          stackIn_56_0 = stackOut_55_0;
          stackIn_56_1 = stackOut_55_1;
          stackIn_56_2 = stackOut_55_2;
          stackIn_56_3 = stackOut_55_3;
          stackIn_56_4 = stackOut_55_4;
          break L10;
        }
        L12: {
          new sta(stackIn_56_3, stackIn_56_4, 410, 105, (isa) null, var3, 1);
          ((at) this).field_T = stackIn_56_1;
          ((at) this).field_T.field_E = 83;
          ((at) this).field_T.a(5, 5, (byte) 97);
          ((at) this).a((ae) (Object) ((at) this).field_T, -1);
          ((at) this).field_W = this.a(-82, ie.field_f, ke.field_a, (qc) this);
          if (var2 == 0) {
            break L12;
          } else {
            ((at) this).field_N = this.a(-87, rra.field_a, kka.field_o, (qc) this);
            break L12;
          }
        }
        L13: {
          ((at) this).field_V = this.a(-94, ita.field_e, pa.field_c, (qc) this);
          stackOut_58_0 = this;
          stackIn_60_0 = stackOut_58_0;
          stackIn_59_0 = stackOut_58_0;
          if (var2 != 0) {
            stackOut_60_0 = this;
            stackOut_60_1 = 3;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            break L13;
          } else {
            stackOut_59_0 = this;
            stackOut_59_1 = 2;
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            break L13;
          }
        }
        L14: {
          ((at) this).field_U = new rj[stackIn_61_1];
          ((at) this).field_U[1] = ((at) this).field_V;
          if (var2 == 0) {
            break L14;
          } else {
            ((at) this).field_U[2] = ((at) this).field_N;
            break L14;
          }
        }
        L15: {
          ((at) this).field_U[0] = ((at) this).field_W;
          if (!((at) this).field_M) {
            break L15;
          } else {
            if (var2 == 0) {
              break L15;
            } else {
              var5_ref_String__ = new String[((at) this).field_P.length];
              var6_int = -1 + var5_ref_String__.length;
              var7_int = 0;
              L16: while (true) {
                if (((at) this).field_P.length <= var7_int) {
                  ((at) this).field_ab = new rla((Object[]) (Object) var5_ref_String__, var6_int, 150);
                  ((at) this).field_ab.a((byte) -31, 126, 18, ((at) this).field_V.field_i + ((at) this).field_T.field_i, -19 + (((at) this).field_V.field_p + (((at) this).field_V.field_n + ((at) this).field_T.field_n)));
                  ((at) this).field_u.a((byte) 126, (vg) (Object) ((at) this).field_ab);
                  break L15;
                } else {
                  L17: {
                    var8 = ((at) this).field_P[var7_int];
                    if (dq.field_f == null) {
                      break L17;
                    } else {
                      if (wba.field_o.field_s != var8.field_a) {
                        break L17;
                      } else {
                        if (wba.field_o.field_p != var8.field_c) {
                          break L17;
                        } else {
                          var6_int = var7_int;
                          break L17;
                        }
                      }
                    }
                  }
                  var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_c;
                  var7_int++;
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          L19: {
            ((at) this).field_Z = this.a((qc) this, po.field_i, 30815);
            var5 = ((at) this).field_Z.field_m / 2 + ((at) this).field_Z.field_i;
            ((at) this).field_Z.field_m = 150;
            ((at) this).field_Z.field_i = -((at) this).field_Z.field_m + (var5 - 20);
            ((at) this).field_L = this.a((qc) this, wm.field_b, 30815);
            ((at) this).field_L.field_y = false;
            ((at) this).field_L.field_i = var5 - -20;
            ((at) this).field_L.field_m = ((at) this).field_Z.field_m;
            if (var2 != 0) {
              break L19;
            } else {
              if (var4 == 0) {
                break L18;
              } else {
                break L19;
              }
            }
          }
          L20: {
            if (var2 == 0) {
              stackOut_77_0 = tla.field_a;
              stackIn_78_0 = stackOut_77_0;
              break L20;
            } else {
              stackOut_76_0 = ab.field_w;
              stackIn_78_0 = stackOut_76_0;
              break L20;
            }
          }
          var10 = stackIn_78_0;
          var6 = (rj) (Object) var10;
          var7 = new ae(var10, (qc) null);
          var7.field_m = ((at) this).field_m;
          var7.field_p = 80;
          var7.field_n = 163;
          var7.field_i = 0;
          var7.field_r = (isa) (Object) new vpa(mj.field_J, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
          ((at) this).a(var7, -1);
          break L18;
        }
        L21: {
          ((at) this).field_O = false;
          var6 = this.g(-46);
          if (var6 == null) {
            break L21;
          } else {
            var6.field_w = true;
            break L21;
          }
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        rj var5 = null;
        int var6 = 0;
        int var7 = 0;
        rj stackIn_33_0 = null;
        Object stackIn_33_1 = null;
        rj stackIn_34_0 = null;
        Object stackIn_34_1 = null;
        rj stackIn_35_0 = null;
        Object stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        rj stackIn_38_0 = null;
        Object stackIn_38_1 = null;
        rj stackIn_39_0 = null;
        Object stackIn_39_1 = null;
        rj stackIn_40_0 = null;
        Object stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        rj stackIn_46_0 = null;
        Object stackIn_46_1 = null;
        rj stackIn_47_0 = null;
        Object stackIn_47_1 = null;
        rj stackIn_48_0 = null;
        Object stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        rj stackIn_55_0 = null;
        Object stackIn_55_1 = null;
        rj stackIn_56_0 = null;
        Object stackIn_56_1 = null;
        rj stackIn_57_0 = null;
        Object stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        rj stackIn_67_0 = null;
        Object stackIn_67_1 = null;
        rj stackIn_68_0 = null;
        Object stackIn_68_1 = null;
        rj stackIn_69_0 = null;
        Object stackIn_69_1 = null;
        int stackIn_69_2 = 0;
        rj stackIn_75_0 = null;
        Object stackIn_75_1 = null;
        rj stackIn_76_0 = null;
        Object stackIn_76_1 = null;
        rj stackIn_77_0 = null;
        Object stackIn_77_1 = null;
        int stackIn_77_2 = 0;
        rj stackOut_74_0 = null;
        Object stackOut_74_1 = null;
        rj stackOut_76_0 = null;
        Object stackOut_76_1 = null;
        int stackOut_76_2 = 0;
        rj stackOut_75_0 = null;
        Object stackOut_75_1 = null;
        int stackOut_75_2 = 0;
        rj stackOut_66_0 = null;
        Object stackOut_66_1 = null;
        rj stackOut_68_0 = null;
        Object stackOut_68_1 = null;
        int stackOut_68_2 = 0;
        rj stackOut_67_0 = null;
        Object stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        rj stackOut_45_0 = null;
        Object stackOut_45_1 = null;
        rj stackOut_47_0 = null;
        Object stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        rj stackOut_46_0 = null;
        Object stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        rj stackOut_54_0 = null;
        Object stackOut_54_1 = null;
        rj stackOut_56_0 = null;
        Object stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        rj stackOut_55_0 = null;
        Object stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        rj stackOut_32_0 = null;
        Object stackOut_32_1 = null;
        rj stackOut_34_0 = null;
        Object stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        rj stackOut_33_0 = null;
        Object stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        rj stackOut_37_0 = null;
        Object stackOut_37_1 = null;
        rj stackOut_39_0 = null;
        Object stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        rj stackOut_38_0 = null;
        Object stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var5 = null;
          if (!((at) this).field_W.b((byte) -34)) {
            L1: {
              if (((at) this).field_N == null) {
                break L1;
              } else {
                if (!((at) this).field_N.b((byte) -34)) {
                  break L1;
                } else {
                  var5 = ((at) this).field_N;
                  break L0;
                }
              }
            }
            if (!((at) this).field_V.b((byte) -34)) {
              if (((at) this).field_Z.b((byte) -34)) {
                var5 = ((at) this).field_Z;
                break L0;
              } else {
                if (((at) this).field_L.b((byte) -34)) {
                  var5 = ((at) this).field_L;
                  break L0;
                } else {
                  if (!((at) this).field_W.field_w) {
                    L2: {
                      if (((at) this).field_N == null) {
                        break L2;
                      } else {
                        if (!((at) this).field_N.field_w) {
                          break L2;
                        } else {
                          var5 = ((at) this).field_N;
                          break L0;
                        }
                      }
                    }
                    if (!((at) this).field_V.field_w) {
                      break L0;
                    } else {
                      var5 = ((at) this).field_V;
                      break L0;
                    }
                  } else {
                    var5 = ((at) this).field_W;
                    break L0;
                  }
                }
              }
            } else {
              var5 = ((at) this).field_V;
              break L0;
            }
          } else {
            var5 = ((at) this).field_W;
            break L0;
          }
        }
        L3: {
          var6 = param2;
          if (96 != var6) {
            if (-98 != (var6 ^ -1)) {
              if (var6 == 98) {
                if (var5 != ((at) this).field_Z) {
                  if (((at) this).field_L == var5) {
                    boolean discarded$13 = ((at) this).field_V.a((ae) this, false);
                    return true;
                  } else {
                    break L3;
                  }
                } else {
                  boolean discarded$14 = ((at) this).field_W.a((ae) this, false);
                  return true;
                }
              } else {
                if (var6 != 99) {
                  break L3;
                } else {
                  L4: {
                    if (var5 == ((at) this).field_W) {
                      break L4;
                    } else {
                      if (((at) this).field_N != var5) {
                        if (var5 == ((at) this).field_V) {
                          L5: {
                            if (!((at) this).field_L.field_y) {
                              L6: {
                                stackOut_74_0 = ((at) this).field_Z;
                                stackOut_74_1 = this;
                                stackIn_76_0 = stackOut_74_0;
                                stackIn_76_1 = stackOut_74_1;
                                stackIn_75_0 = stackOut_74_0;
                                stackIn_75_1 = stackOut_74_1;
                                if (param3) {
                                  stackOut_76_0 = (rj) (Object) stackIn_76_0;
                                  stackOut_76_1 = this;
                                  stackOut_76_2 = 0;
                                  stackIn_77_0 = stackOut_76_0;
                                  stackIn_77_1 = stackOut_76_1;
                                  stackIn_77_2 = stackOut_76_2;
                                  break L6;
                                } else {
                                  stackOut_75_0 = (rj) (Object) stackIn_75_0;
                                  stackOut_75_1 = this;
                                  stackOut_75_2 = 1;
                                  stackIn_77_0 = stackOut_75_0;
                                  stackIn_77_1 = stackOut_75_1;
                                  stackIn_77_2 = stackOut_75_2;
                                  break L6;
                                }
                              }
                              boolean discarded$15 = ((rj) (Object) stackIn_77_0).a((ae) this, stackIn_77_2 != 0);
                              break L5;
                            } else {
                              boolean discarded$16 = ((at) this).field_L.a((ae) this, false);
                              break L5;
                            }
                          }
                          return true;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L7: {
                    stackOut_66_0 = ((at) this).field_Z;
                    stackOut_66_1 = this;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    if (param3) {
                      stackOut_68_0 = (rj) (Object) stackIn_68_0;
                      stackOut_68_1 = this;
                      stackOut_68_2 = 0;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      stackIn_69_2 = stackOut_68_2;
                      break L7;
                    } else {
                      stackOut_67_0 = (rj) (Object) stackIn_67_0;
                      stackOut_67_1 = this;
                      stackOut_67_2 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      stackIn_69_2 = stackOut_67_2;
                      break L7;
                    }
                  }
                  boolean discarded$17 = ((rj) (Object) stackIn_69_0).a((ae) this, stackIn_69_2 != 0);
                  return true;
                }
              }
            } else {
              if (var5 == ((at) this).field_W) {
                L8: {
                  if (null == ((at) this).field_N) {
                    L9: {
                      stackOut_45_0 = ((at) this).field_V;
                      stackOut_45_1 = this;
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_47_1 = stackOut_45_1;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      if (param3) {
                        stackOut_47_0 = (rj) (Object) stackIn_47_0;
                        stackOut_47_1 = this;
                        stackOut_47_2 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        stackIn_48_2 = stackOut_47_2;
                        break L9;
                      } else {
                        stackOut_46_0 = (rj) (Object) stackIn_46_0;
                        stackOut_46_1 = this;
                        stackOut_46_2 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        stackIn_48_2 = stackOut_46_2;
                        break L9;
                      }
                    }
                    boolean discarded$18 = ((rj) (Object) stackIn_48_0).a((ae) this, stackIn_48_2 != 0);
                    break L8;
                  } else {
                    boolean discarded$19 = ((at) this).field_N.a((ae) this, false);
                    break L8;
                  }
                }
                return true;
              } else {
                if (var5 != ((at) this).field_N) {
                  if (((at) this).field_Z != var5) {
                    break L3;
                  } else {
                    if (!((at) this).field_L.field_y) {
                      break L3;
                    } else {
                      L10: {
                        stackOut_54_0 = ((at) this).field_L;
                        stackOut_54_1 = this;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_56_1 = stackOut_54_1;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        if (param3) {
                          stackOut_56_0 = (rj) (Object) stackIn_56_0;
                          stackOut_56_1 = this;
                          stackOut_56_2 = 0;
                          stackIn_57_0 = stackOut_56_0;
                          stackIn_57_1 = stackOut_56_1;
                          stackIn_57_2 = stackOut_56_2;
                          break L10;
                        } else {
                          stackOut_55_0 = (rj) (Object) stackIn_55_0;
                          stackOut_55_1 = this;
                          stackOut_55_2 = 1;
                          stackIn_57_0 = stackOut_55_0;
                          stackIn_57_1 = stackOut_55_1;
                          stackIn_57_2 = stackOut_55_2;
                          break L10;
                        }
                      }
                      boolean discarded$20 = ((rj) (Object) stackIn_57_0).a((ae) this, stackIn_57_2 != 0);
                      return true;
                    }
                  }
                } else {
                  boolean discarded$21 = ((at) this).field_V.a((ae) this, false);
                  return true;
                }
              }
            }
          } else {
            if (var5 == ((at) this).field_V) {
              if (null != ((at) this).field_N) {
                boolean discarded$22 = ((at) this).field_N.a((ae) this, false);
                return true;
              } else {
                boolean discarded$23 = ((at) this).field_W.a((ae) this, false);
                return true;
              }
            } else {
              if (((at) this).field_N == var5) {
                L11: {
                  stackOut_32_0 = ((at) this).field_W;
                  stackOut_32_1 = this;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  if (param3) {
                    stackOut_34_0 = (rj) (Object) stackIn_34_0;
                    stackOut_34_1 = this;
                    stackOut_34_2 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    break L11;
                  } else {
                    stackOut_33_0 = (rj) (Object) stackIn_33_0;
                    stackOut_33_1 = this;
                    stackOut_33_2 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    break L11;
                  }
                }
                boolean discarded$24 = ((rj) (Object) stackIn_35_0).a((ae) this, stackIn_35_2 != 0);
                return true;
              } else {
                if (((at) this).field_L != var5) {
                  break L3;
                } else {
                  L12: {
                    stackOut_37_0 = ((at) this).field_Z;
                    stackOut_37_1 = this;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    if (param3) {
                      stackOut_39_0 = (rj) (Object) stackIn_39_0;
                      stackOut_39_1 = this;
                      stackOut_39_2 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      stackIn_40_2 = stackOut_39_2;
                      break L12;
                    } else {
                      stackOut_38_0 = (rj) (Object) stackIn_38_0;
                      stackOut_38_1 = this;
                      stackOut_38_2 = 1;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      break L12;
                    }
                  }
                  boolean discarded$25 = ((rj) (Object) stackIn_40_0).a((ae) this, stackIn_40_2 != 0);
                  return true;
                }
              }
            }
          }
        }
        L13: {
          if (param3) {
            break L13;
          } else {
            ((at) this).field_O = false;
            break L13;
          }
        }
        return super.a(param0, param1, param2, true);
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 == ((at) this).field_Z) {
            this.h(-8266);
            break L0;
          } else {
            if (((at) this).field_L != param2) {
              if (param2 == ((at) this).field_W) {
                this.a(20306, param2);
                break L0;
              } else {
                if (param2 != ((at) this).field_N) {
                  L1: {
                    if (((at) this).field_ab != null) {
                      if (((at) this).field_ab.field_f) {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L1;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_12_0 = stackOut_9_0;
                        break L1;
                      }
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_12_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                  var6 = stackIn_12_0;
                  if (var6 != 0) {
                    break L0;
                  } else {
                    if (((at) this).field_V != param2) {
                      break L0;
                    } else {
                      if (((at) this).field_M) {
                        if (-1 > (wla.field_ub ^ -1)) {
                          this.a(20306, param2);
                          break L0;
                        } else {
                          ((at) this).field_z.c((ae) (Object) new bra(((at) this).field_z), 84);
                          break L0;
                        }
                      } else {
                        ((at) this).field_z.c((ae) (Object) new gga(((at) this).field_z, gj.field_o), 95);
                        break L0;
                      }
                    }
                  }
                } else {
                  this.a(20306, param2);
                  break L0;
                }
              }
            } else {
              this.i(-1);
              break L0;
            }
          }
        }
        L2: {
          if (param4 >= 44) {
            break L2;
          } else {
            ((at) this).field_S = null;
            break L2;
          }
        }
    }

    private final void h(int param0) {
        if (!((at) this).field_B) {
            return;
        }
        ((at) this).field_B = false;
        if (param0 != -8266) {
            Object var3 = null;
            rj discarded$0 = this.a(-99, (hja[]) null, (String) null, (qc) null);
        }
    }

    private final void a(int param0, rj param1) {
        int var4 = 0;
        dh var5 = null;
        ((at) this).field_S = param1;
        boolean discarded$0 = param1.a((ae) this, false);
        rj var3 = this.g(-46);
        ((at) this).field_L.field_y = param1 != var3 ? true : false;
        if (param0 != 20306) {
            Object var6 = null;
            rj discarded$1 = this.a(-82, (hja[]) null, (String) null, (qc) null);
        }
        if (param1 == ((at) this).field_V) {
            if (var3 == param1) {
                if (!(((at) this).field_ab == null)) {
                    var4 = ((at) this).field_ab.i((byte) 126);
                    var5 = ((at) this).field_P[var4];
                    if (wba.field_o.field_s == var5.field_a) {
                        // if_icmpeq L159
                    }
                    ((at) this).field_L.field_y = true;
                }
            }
        }
        this.j((byte) -30);
    }

    final static boolean f(int param0) {
        if (param0 != 24316) {
            field_Q = null;
        }
        return ota.a(ica.field_b, (byte) 13, mn.field_n);
    }

    private final rj a(qc param0, String param1, int param2) {
        rj var4 = new rj(param1, param0);
        var4.field_r = (isa) (Object) new td();
        int var5 = -46 + ((at) this).field_p;
        if (param2 != 30815) {
            return null;
        }
        var4.a((byte) -31, ((at) this).field_m - 30, 30, 15, var5);
        ((at) this).a((ae) (Object) var4, param2 + -30816);
        return var4;
    }

    private final rj g(int param0) {
        if (dq.field_f != null) {
            return ((at) this).field_V;
        }
        if (param0 != -46) {
            return null;
        }
        if (null != wba.field_o) {
            if (wba.field_o.field_h) {
                if (!(((at) this).field_N == null)) {
                    return ((at) this).field_N;
                }
            }
        }
        return ((at) this).field_W;
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            var4 = null;
            rj discarded$2 = this.a((qc) null, (String) null, -2);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((at) this).field_W == ((at) this).field_S) {
              og.b(param0 + 1);
              kla.b(0);
              break L2;
            } else {
              if (((at) this).field_S == ((at) this).field_N) {
                og.b(0);
                cva.a(-117);
                break L2;
              } else {
                if (((at) this).field_S == ((at) this).field_V) {
                  if (null != ((at) this).field_ab) {
                    var2 = ((at) this).field_ab.i((byte) 123);
                    if (-1 < (var2 ^ -1)) {
                      in.a(-30600, true);
                      ((at) this).field_z.c((ae) (Object) new op(((at) this).field_z), 89);
                      break L2;
                    } else {
                      wba.field_o.a(((at) this).field_P[var2].field_a, ((at) this).field_P[var2].field_c, -1);
                      in.a(-30600, true);
                      ((at) this).field_z.c((ae) (Object) new op(((at) this).field_z), 89);
                      break L2;
                    }
                  } else {
                    in.a(-30600, true);
                    ((at) this).field_z.c((ae) (Object) new op(((at) this).field_z), 89);
                    break L2;
                  }
                } else {
                  ((at) this).field_L.field_y = false;
                  break L1;
                }
              }
            }
          }
          ((at) this).field_L.field_y = false;
          break L1;
        }
    }

    private final void j(byte param0) {
        int var3 = 0;
        rj var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        rj[] var7 = ((at) this).field_U;
        rj[] var2 = var7;
        for (var3 = 0; var3 < var7.length; var3++) {
            var4 = var7[var3];
            var4.field_w = ((at) this).field_S == var4 ? true : false;
        }
        if (param0 != -30) {
            Object var6 = null;
            rj discarded$0 = this.a(-33, (hja[]) null, (String) null, (qc) null);
        }
    }

    public static void i(byte param0) {
        field_Q = null;
        field_R = null;
        int var1 = -92 / ((26 - param0) / 46);
    }

    final void a(int param0, int param1, ae param2, int param3) {
        rj[] var5 = null;
        int var6 = 0;
        rj var7 = null;
        int var8 = 0;
        rj[] var9 = null;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          super.a(param0, param1, param2, param3);
          if (qma.field_c) {
            param2.f((byte) -103);
            var9 = ((at) this).field_U;
            var5 = var9;
            var6 = 0;
            L1: while (true) {
              if (var9.length > var6) {
                var7 = var9[var6];
                if (var7.field_f) {
                  boolean discarded$1 = var7.a((ae) this, false);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                if (((at) this).field_Y) {
                  break L0;
                } else {
                  if (vpa.a(127)) {
                    break L0;
                  } else {
                    this.h(-8266);
                    ((at) this).field_z.c((ae) (Object) new at(((at) this).field_z), 109);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (((at) this).field_Y) {
              break L0;
            } else {
              if (vpa.a(127)) {
                break L0;
              } else {
                this.h(-8266);
                ((at) this).field_z.c((ae) (Object) new at(((at) this).field_z), 109);
                break L0;
              }
            }
          }
        }
        L2: {
          if (((at) this).field_ab == null) {
            break L2;
          } else {
            L3: {
              if (((at) this).field_ab.j((byte) -125)) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L3;
              } else {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L3;
              }
            }
            if (stackIn_17_0 == (((at) this).field_O ? 1 : 0)) {
              this.a(20306, ((at) this).field_V);
              ((at) this).field_O = ((at) this).field_ab.j((byte) 76);
              break L2;
            } else {
              break L2;
            }
          }
        }
    }

    private final rj a(int param0, hja[] param1, String param2, qc param3) {
        rj var5 = new rj(param2, param3);
        var5.field_r = (isa) (Object) new tka(param1);
        if (param0 >= -81) {
            ((at) this).field_L = null;
        }
        sta var6 = ((at) this).field_T;
        rj var7 = var5;
        var6.b(0, (ae) (Object) var7, var6.field_E);
        ((at) this).field_T.c((byte) 124);
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = 0;
        field_R = "Pressure pads trigger doors or traps, when activated by the weight of an idol, block, body or skeleton.";
        field_Q = "<%0> failed to finish";
    }
}
