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
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) nfa.field_n;
            synchronized (var1) {
              L1: {
                L2: {
                  cda.field_p = cda.field_p + 1;
                  vha.field_b = nt.field_a;
                  if (0 > ita.field_f) {
                    var5 = 0;
                    var2 = var5;
                    L3: while (true) {
                      if (112 <= var5) {
                        ita.field_f = hka.field_a;
                        break L2;
                      } else {
                        oj.field_tb[var5] = false;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: while (true) {
                      if (hka.field_a == ita.field_f) {
                        break L2;
                      } else {
                        var2 = cna.field_c[hka.field_a];
                        hka.field_a = 127 & hka.field_a + 1;
                        if (var2 < 0) {
                          oj.field_tb[~var2] = false;
                          continue L4;
                        } else {
                          oj.field_tb[var2] = true;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                nt.field_a = rca.field_n;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1_ref, "at.J(" + 3321 + 41);
        }
    }

    at(jta param0) {
        super(param0, 430, 254);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        dh[] var3_ref_dh__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        rj var6 = null;
        String var6_ref = null;
        int var7_int = 0;
        ae var7 = null;
        dh var8 = null;
        String var10 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_49_0 = null;
        sta stackIn_49_1 = null;
        sta stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        Object stackIn_50_0 = null;
        sta stackIn_50_1 = null;
        sta stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        Object stackIn_51_0 = null;
        sta stackIn_51_1 = null;
        sta stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        Object stackIn_52_0 = null;
        sta stackIn_52_1 = null;
        sta stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        Object stackOut_48_0 = null;
        sta stackOut_48_1 = null;
        sta stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        Object stackOut_49_0 = null;
        sta stackOut_49_1 = null;
        sta stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        Object stackOut_50_0 = null;
        sta stackOut_50_1 = null;
        sta stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        Object stackOut_51_0 = null;
        sta stackOut_51_1 = null;
        sta stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        String stackOut_73_0 = null;
        String stackOut_72_0 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            L1: {
              ((at) this).field_P = af.a(99, dsa.field_c);
              if (((at) this).field_P.length <= 0) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= ((at) this).field_P.length) {
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (((at) this).field_P.length <= var3) {
                        var3_ref_dh__ = ((at) this).field_P;
                        ((at) this).field_P = new dh[var2_int];
                        var4 = 0;
                        var5 = 0;
                        L4: while (true) {
                          if (var3_ref_dh__.length <= var5) {
                            ag.a(-95, ((at) this).field_P);
                            break L1;
                          } else {
                            L5: {
                              if (var3_ref_dh__[var5] == null) {
                                break L5;
                              } else {
                                int incrementValue$5 = var4;
                                var4++;
                                ((at) this).field_P[incrementValue$5] = var3_ref_dh__[var5];
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (null == ((at) this).field_P[var3]) {
                            break L6;
                          } else {
                            var2_int++;
                            break L6;
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (((at) this).field_P[var2_int] == null) {
                        break L7;
                      } else {
                        var3 = var2_int - -1;
                        L8: while (true) {
                          if (var3 >= ((at) this).field_P.length) {
                            if (wba.field_o == null) {
                              break L7;
                            } else {
                              if (null == ((at) this).field_P[var2_int]) {
                                break L7;
                              } else {
                                if (wba.field_o.a(((at) this).field_P[var2_int].field_c, (byte) 43, ((at) this).field_P[var2_int].field_a)) {
                                  break L7;
                                } else {
                                  ((at) this).field_P[var2_int] = null;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L9: {
                              if (null == ((at) this).field_P[var3]) {
                                break L9;
                              } else {
                                if (((at) this).field_P[var3].field_a != ((at) this).field_P[var2_int].field_a) {
                                  break L9;
                                } else {
                                  if (((at) this).field_P[var2_int].field_c != ((at) this).field_P[var3].field_c) {
                                    break L9;
                                  } else {
                                    ((at) this).field_P[var3] = null;
                                    break L9;
                                  }
                                }
                              }
                            }
                            var3++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              }
            }
            L10: {
              stackOut_28_0 = this;
              stackIn_30_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (((at) this).field_P.length <= 0) {
                stackOut_30_0 = this;
                stackOut_30_1 = 0;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                break L10;
              } else {
                stackOut_29_0 = this;
                stackOut_29_1 = 1;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                break L10;
              }
            }
            L11: {
              ((at) this).field_M = stackIn_31_1 != 0;
              int discarded$6 = 97;
              if (!sta.g()) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L11;
              } else {
                stackOut_32_0 = 1;
                stackIn_34_0 = stackOut_32_0;
                break L11;
              }
            }
            L12: {
              var2_int = stackIn_34_0;
              stackOut_34_0 = this;
              stackIn_36_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (vpa.a(56)) {
                stackOut_36_0 = this;
                stackOut_36_1 = 0;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                break L12;
              } else {
                stackOut_35_0 = this;
                stackOut_35_1 = 1;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                break L12;
              }
            }
            L13: {
              ((at) this).field_Y = stackIn_37_1 != 0;
              if (var2_int != 0) {
                stackOut_39_0 = 3;
                stackIn_40_0 = stackOut_39_0;
                break L13;
              } else {
                stackOut_38_0 = 2;
                stackIn_40_0 = stackOut_38_0;
                break L13;
              }
            }
            L14: {
              var3 = stackIn_40_0;
              if (var2_int == 0) {
                if (wba.field_o != null) {
                  if (wba.field_o.d(-1)) {
                    stackOut_46_0 = 1;
                    stackIn_48_0 = stackOut_46_0;
                    break L14;
                  } else {
                    stackOut_45_0 = 0;
                    stackIn_48_0 = stackOut_45_0;
                    break L14;
                  }
                } else {
                  stackOut_43_0 = 0;
                  stackIn_48_0 = stackOut_43_0;
                  break L14;
                }
              } else {
                stackOut_41_0 = 0;
                stackIn_48_0 = stackOut_41_0;
                break L14;
              }
            }
            L15: {
              L16: {
                var4 = stackIn_48_0;
                stackOut_48_0 = this;
                stackOut_48_1 = null;
                stackOut_48_2 = null;
                stackOut_48_3 = 10;
                stackIn_51_0 = stackOut_48_0;
                stackIn_51_1 = stackOut_48_1;
                stackIn_51_2 = stackOut_48_2;
                stackIn_51_3 = stackOut_48_3;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                stackIn_49_2 = stackOut_48_2;
                stackIn_49_3 = stackOut_48_3;
                if (var2_int != 0) {
                  break L16;
                } else {
                  stackOut_49_0 = this;
                  stackOut_49_1 = null;
                  stackOut_49_2 = null;
                  stackOut_49_3 = stackIn_49_3;
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  stackIn_51_3 = stackOut_49_3;
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  stackIn_50_3 = stackOut_49_3;
                  if (var4 != 0) {
                    break L16;
                  } else {
                    stackOut_50_0 = this;
                    stackOut_50_1 = null;
                    stackOut_50_2 = null;
                    stackOut_50_3 = stackIn_50_3;
                    stackOut_50_4 = 75;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_52_1 = stackOut_50_1;
                    stackIn_52_2 = stackOut_50_2;
                    stackIn_52_3 = stackOut_50_3;
                    stackIn_52_4 = stackOut_50_4;
                    break L15;
                  }
                }
              }
              stackOut_51_0 = this;
              stackOut_51_1 = null;
              stackOut_51_2 = null;
              stackOut_51_3 = stackIn_51_3;
              stackOut_51_4 = 58;
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              stackIn_52_3 = stackOut_51_3;
              stackIn_52_4 = stackOut_51_4;
              break L15;
            }
            L17: {
              ((at) this).field_T = new sta(stackIn_52_3, stackIn_52_4, 410, 105, (isa) null, var3, 1);
              ((at) this).field_T.field_E = 83;
              ((at) this).field_T.a(5, 5, (byte) 97);
              ((at) this).a((ae) (Object) ((at) this).field_T, -1);
              ((at) this).field_W = this.a(-82, ie.field_f, ke.field_a, (qc) this);
              if (var2_int == 0) {
                break L17;
              } else {
                ((at) this).field_N = this.a(-87, rra.field_a, kka.field_o, (qc) this);
                break L17;
              }
            }
            L18: {
              ((at) this).field_V = this.a(-94, ita.field_e, pa.field_c, (qc) this);
              stackOut_54_0 = this;
              stackIn_56_0 = stackOut_54_0;
              stackIn_55_0 = stackOut_54_0;
              if (var2_int != 0) {
                stackOut_56_0 = this;
                stackOut_56_1 = 3;
                stackIn_57_0 = stackOut_56_0;
                stackIn_57_1 = stackOut_56_1;
                break L18;
              } else {
                stackOut_55_0 = this;
                stackOut_55_1 = 2;
                stackIn_57_0 = stackOut_55_0;
                stackIn_57_1 = stackOut_55_1;
                break L18;
              }
            }
            L19: {
              ((at) this).field_U = new rj[stackIn_57_1];
              ((at) this).field_U[1] = ((at) this).field_V;
              if (var2_int == 0) {
                break L19;
              } else {
                ((at) this).field_U[2] = ((at) this).field_N;
                break L19;
              }
            }
            L20: {
              ((at) this).field_U[0] = ((at) this).field_W;
              if (!((at) this).field_M) {
                break L20;
              } else {
                if (var2_int == 0) {
                  break L20;
                } else {
                  var5_ref_String__ = new String[((at) this).field_P.length];
                  var6_int = -1 + var5_ref_String__.length;
                  var7_int = 0;
                  L21: while (true) {
                    if (((at) this).field_P.length <= var7_int) {
                      ((at) this).field_ab = new rla((Object[]) (Object) var5_ref_String__, var6_int, 150);
                      ((at) this).field_ab.a((byte) -31, 126, 18, ((at) this).field_V.field_i + ((at) this).field_T.field_i, -19 + (((at) this).field_V.field_p + (((at) this).field_V.field_n + ((at) this).field_T.field_n)));
                      ((at) this).field_u.a((byte) 126, (vg) (Object) ((at) this).field_ab);
                      break L20;
                    } else {
                      L22: {
                        var8 = ((at) this).field_P[var7_int];
                        if (dq.field_f == null) {
                          break L22;
                        } else {
                          if (wba.field_o.field_s != var8.field_a) {
                            break L22;
                          } else {
                            if (wba.field_o.field_p != var8.field_c) {
                              break L22;
                            } else {
                              var6_int = var7_int;
                              break L22;
                            }
                          }
                        }
                      }
                      var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_c;
                      var7_int++;
                      continue L21;
                    }
                  }
                }
              }
            }
            L23: {
              L24: {
                int discarded$7 = 30815;
                ((at) this).field_Z = this.a((qc) this, po.field_i);
                var5 = ((at) this).field_Z.field_m / 2 + ((at) this).field_Z.field_i;
                ((at) this).field_Z.field_m = 150;
                ((at) this).field_Z.field_i = -((at) this).field_Z.field_m + (var5 - 20);
                int discarded$8 = 30815;
                ((at) this).field_L = this.a((qc) this, wm.field_b);
                ((at) this).field_L.field_y = false;
                ((at) this).field_L.field_i = var5 - -20;
                ((at) this).field_L.field_m = ((at) this).field_Z.field_m;
                if (var2_int != 0) {
                  break L24;
                } else {
                  if (var4 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              L25: {
                if (var2_int == 0) {
                  stackOut_73_0 = tla.field_a;
                  stackIn_74_0 = stackOut_73_0;
                  break L25;
                } else {
                  stackOut_72_0 = ab.field_w;
                  stackIn_74_0 = stackOut_72_0;
                  break L25;
                }
              }
              var10 = stackIn_74_0;
              var6_ref = var10;
              var7 = new ae(var10, (qc) null);
              var7.field_m = ((at) this).field_m;
              var7.field_p = 80;
              var7.field_n = 163;
              var7.field_i = 0;
              var7.field_r = (isa) (Object) new vpa(mj.field_J, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
              ((at) this).a(var7, -1);
              break L23;
            }
            L26: {
              ((at) this).field_O = false;
              int discarded$9 = -46;
              var6 = this.g();
              if (var6 == null) {
                break L26;
              } else {
                var6.field_w = true;
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var2 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var2;
            stackOut_78_1 = new StringBuilder().append("at.<init>(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L27;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L27;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 41);
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_31_0 = 0;
        rj stackIn_35_0 = null;
        Object stackIn_35_1 = null;
        rj stackIn_36_0 = null;
        Object stackIn_36_1 = null;
        rj stackIn_37_0 = null;
        Object stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_38_0 = 0;
        rj stackIn_41_0 = null;
        Object stackIn_41_1 = null;
        rj stackIn_42_0 = null;
        Object stackIn_42_1 = null;
        rj stackIn_43_0 = null;
        Object stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_44_0 = 0;
        rj stackIn_50_0 = null;
        Object stackIn_50_1 = null;
        rj stackIn_51_0 = null;
        Object stackIn_51_1 = null;
        rj stackIn_52_0 = null;
        Object stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        rj stackIn_61_0 = null;
        Object stackIn_61_1 = null;
        rj stackIn_62_0 = null;
        Object stackIn_62_1 = null;
        rj stackIn_63_0 = null;
        Object stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        rj stackIn_76_0 = null;
        Object stackIn_76_1 = null;
        rj stackIn_77_0 = null;
        Object stackIn_77_1 = null;
        rj stackIn_78_0 = null;
        Object stackIn_78_1 = null;
        int stackIn_78_2 = 0;
        int stackIn_79_0 = 0;
        rj stackIn_85_0 = null;
        Object stackIn_85_1 = null;
        rj stackIn_86_0 = null;
        Object stackIn_86_1 = null;
        rj stackIn_87_0 = null;
        Object stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_89_0 = 0;
        boolean stackIn_93_0 = false;
        Object stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        Object stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        Object stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_70_0 = 0;
        int stackOut_66_0 = 0;
        rj stackOut_84_0 = null;
        Object stackOut_84_1 = null;
        rj stackOut_86_0 = null;
        Object stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        rj stackOut_85_0 = null;
        Object stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_88_0 = 0;
        rj stackOut_75_0 = null;
        Object stackOut_75_1 = null;
        rj stackOut_77_0 = null;
        Object stackOut_77_1 = null;
        int stackOut_77_2 = 0;
        rj stackOut_76_0 = null;
        Object stackOut_76_1 = null;
        int stackOut_76_2 = 0;
        int stackOut_78_0 = 0;
        rj stackOut_49_0 = null;
        Object stackOut_49_1 = null;
        rj stackOut_51_0 = null;
        Object stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        rj stackOut_50_0 = null;
        Object stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_53_0 = 0;
        rj stackOut_60_0 = null;
        Object stackOut_60_1 = null;
        rj stackOut_62_0 = null;
        Object stackOut_62_1 = null;
        int stackOut_62_2 = 0;
        rj stackOut_61_0 = null;
        Object stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_30_0 = 0;
        rj stackOut_34_0 = null;
        Object stackOut_34_1 = null;
        rj stackOut_36_0 = null;
        Object stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        rj stackOut_35_0 = null;
        Object stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_37_0 = 0;
        rj stackOut_40_0 = null;
        Object stackOut_40_1 = null;
        rj stackOut_42_0 = null;
        Object stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        rj stackOut_41_0 = null;
        Object stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_43_0 = 0;
        boolean stackOut_92_0 = false;
        Object stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        Object stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        Object stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = null;
              if (!((at) this).field_W.b((byte) -34)) {
                L2: {
                  if (((at) this).field_N == null) {
                    break L2;
                  } else {
                    if (!((at) this).field_N.b((byte) -34)) {
                      break L2;
                    } else {
                      var5 = (Object) (Object) ((at) this).field_N;
                      break L1;
                    }
                  }
                }
                if (!((at) this).field_V.b((byte) -34)) {
                  if (((at) this).field_Z.b((byte) -34)) {
                    var5 = (Object) (Object) ((at) this).field_Z;
                    break L1;
                  } else {
                    if (((at) this).field_L.b((byte) -34)) {
                      var5 = (Object) (Object) ((at) this).field_L;
                      break L1;
                    } else {
                      if (!((at) this).field_W.field_w) {
                        L3: {
                          if (((at) this).field_N == null) {
                            break L3;
                          } else {
                            if (!((at) this).field_N.field_w) {
                              break L3;
                            } else {
                              var5 = (Object) (Object) ((at) this).field_N;
                              break L1;
                            }
                          }
                        }
                        if (!((at) this).field_V.field_w) {
                          break L1;
                        } else {
                          var5 = (Object) (Object) ((at) this).field_V;
                          break L1;
                        }
                      } else {
                        var5 = (Object) (Object) ((at) this).field_W;
                        break L1;
                      }
                    }
                  }
                } else {
                  var5 = (Object) (Object) ((at) this).field_V;
                  break L1;
                }
              } else {
                var5 = (Object) (Object) ((at) this).field_W;
                break L1;
              }
            }
            L4: {
              var6 = param2;
              if (96 != var6) {
                if (var6 != 97) {
                  if (var6 == 98) {
                    if (var5 != (Object) (Object) ((at) this).field_Z) {
                      if ((Object) (Object) ((at) this).field_L == var5) {
                        boolean discarded$13 = ((at) this).field_V.a((ae) this, false);
                        stackOut_70_0 = 1;
                        stackIn_71_0 = stackOut_70_0;
                        return stackIn_71_0 != 0;
                      } else {
                        break L4;
                      }
                    } else {
                      boolean discarded$14 = ((at) this).field_W.a((ae) this, false);
                      stackOut_66_0 = 1;
                      stackIn_67_0 = stackOut_66_0;
                      return stackIn_67_0 != 0;
                    }
                  } else {
                    if (var6 != 99) {
                      break L4;
                    } else {
                      L5: {
                        if (var5 == (Object) (Object) ((at) this).field_W) {
                          break L5;
                        } else {
                          if ((Object) (Object) ((at) this).field_N != var5) {
                            if (var5 == (Object) (Object) ((at) this).field_V) {
                              L6: {
                                if (!((at) this).field_L.field_y) {
                                  L7: {
                                    stackOut_84_0 = ((at) this).field_Z;
                                    stackOut_84_1 = this;
                                    stackIn_86_0 = stackOut_84_0;
                                    stackIn_86_1 = stackOut_84_1;
                                    stackIn_85_0 = stackOut_84_0;
                                    stackIn_85_1 = stackOut_84_1;
                                    if (param3) {
                                      stackOut_86_0 = (rj) (Object) stackIn_86_0;
                                      stackOut_86_1 = this;
                                      stackOut_86_2 = 0;
                                      stackIn_87_0 = stackOut_86_0;
                                      stackIn_87_1 = stackOut_86_1;
                                      stackIn_87_2 = stackOut_86_2;
                                      break L7;
                                    } else {
                                      stackOut_85_0 = (rj) (Object) stackIn_85_0;
                                      stackOut_85_1 = this;
                                      stackOut_85_2 = 1;
                                      stackIn_87_0 = stackOut_85_0;
                                      stackIn_87_1 = stackOut_85_1;
                                      stackIn_87_2 = stackOut_85_2;
                                      break L7;
                                    }
                                  }
                                  boolean discarded$15 = ((rj) (Object) stackIn_87_0).a((ae) this, stackIn_87_2 != 0);
                                  break L6;
                                } else {
                                  boolean discarded$16 = ((at) this).field_L.a((ae) this, false);
                                  break L6;
                                }
                              }
                              stackOut_88_0 = 1;
                              stackIn_89_0 = stackOut_88_0;
                              return stackIn_89_0 != 0;
                            } else {
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      L8: {
                        stackOut_75_0 = ((at) this).field_Z;
                        stackOut_75_1 = this;
                        stackIn_77_0 = stackOut_75_0;
                        stackIn_77_1 = stackOut_75_1;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        if (param3) {
                          stackOut_77_0 = (rj) (Object) stackIn_77_0;
                          stackOut_77_1 = this;
                          stackOut_77_2 = 0;
                          stackIn_78_0 = stackOut_77_0;
                          stackIn_78_1 = stackOut_77_1;
                          stackIn_78_2 = stackOut_77_2;
                          break L8;
                        } else {
                          stackOut_76_0 = (rj) (Object) stackIn_76_0;
                          stackOut_76_1 = this;
                          stackOut_76_2 = 1;
                          stackIn_78_0 = stackOut_76_0;
                          stackIn_78_1 = stackOut_76_1;
                          stackIn_78_2 = stackOut_76_2;
                          break L8;
                        }
                      }
                      boolean discarded$17 = ((rj) (Object) stackIn_78_0).a((ae) this, stackIn_78_2 != 0);
                      stackOut_78_0 = 1;
                      stackIn_79_0 = stackOut_78_0;
                      return stackIn_79_0 != 0;
                    }
                  }
                } else {
                  if (var5 == (Object) (Object) ((at) this).field_W) {
                    L9: {
                      if (null == ((at) this).field_N) {
                        L10: {
                          stackOut_49_0 = ((at) this).field_V;
                          stackOut_49_1 = this;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_51_1 = stackOut_49_1;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          if (param3) {
                            stackOut_51_0 = (rj) (Object) stackIn_51_0;
                            stackOut_51_1 = this;
                            stackOut_51_2 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            stackIn_52_2 = stackOut_51_2;
                            break L10;
                          } else {
                            stackOut_50_0 = (rj) (Object) stackIn_50_0;
                            stackOut_50_1 = this;
                            stackOut_50_2 = 1;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_52_1 = stackOut_50_1;
                            stackIn_52_2 = stackOut_50_2;
                            break L10;
                          }
                        }
                        boolean discarded$18 = ((rj) (Object) stackIn_52_0).a((ae) this, stackIn_52_2 != 0);
                        break L9;
                      } else {
                        boolean discarded$19 = ((at) this).field_N.a((ae) this, false);
                        break L9;
                      }
                    }
                    stackOut_53_0 = 1;
                    stackIn_54_0 = stackOut_53_0;
                    return stackIn_54_0 != 0;
                  } else {
                    if (var5 != (Object) (Object) ((at) this).field_N) {
                      if ((Object) (Object) ((at) this).field_Z != var5) {
                        break L4;
                      } else {
                        if (!((at) this).field_L.field_y) {
                          break L4;
                        } else {
                          L11: {
                            stackOut_60_0 = ((at) this).field_L;
                            stackOut_60_1 = this;
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_62_1 = stackOut_60_1;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            if (param3) {
                              stackOut_62_0 = (rj) (Object) stackIn_62_0;
                              stackOut_62_1 = this;
                              stackOut_62_2 = 0;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              stackIn_63_2 = stackOut_62_2;
                              break L11;
                            } else {
                              stackOut_61_0 = (rj) (Object) stackIn_61_0;
                              stackOut_61_1 = this;
                              stackOut_61_2 = 1;
                              stackIn_63_0 = stackOut_61_0;
                              stackIn_63_1 = stackOut_61_1;
                              stackIn_63_2 = stackOut_61_2;
                              break L11;
                            }
                          }
                          boolean discarded$20 = ((rj) (Object) stackIn_63_0).a((ae) this, stackIn_63_2 != 0);
                          stackOut_63_0 = 1;
                          stackIn_64_0 = stackOut_63_0;
                          return stackIn_64_0 != 0;
                        }
                      }
                    } else {
                      boolean discarded$21 = ((at) this).field_V.a((ae) this, false);
                      stackOut_56_0 = 1;
                      stackIn_57_0 = stackOut_56_0;
                      return stackIn_57_0 != 0;
                    }
                  }
                }
              } else {
                if (var5 == (Object) (Object) ((at) this).field_V) {
                  if (null != ((at) this).field_N) {
                    boolean discarded$22 = ((at) this).field_N.a((ae) this, false);
                    stackOut_30_0 = 1;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0 != 0;
                  } else {
                    boolean discarded$23 = ((at) this).field_W.a((ae) this, false);
                    return true;
                  }
                } else {
                  if ((Object) (Object) ((at) this).field_N == var5) {
                    L12: {
                      stackOut_34_0 = ((at) this).field_W;
                      stackOut_34_1 = this;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      if (param3) {
                        stackOut_36_0 = (rj) (Object) stackIn_36_0;
                        stackOut_36_1 = this;
                        stackOut_36_2 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        break L12;
                      } else {
                        stackOut_35_0 = (rj) (Object) stackIn_35_0;
                        stackOut_35_1 = this;
                        stackOut_35_2 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        break L12;
                      }
                    }
                    boolean discarded$24 = ((rj) (Object) stackIn_37_0).a((ae) this, stackIn_37_2 != 0);
                    stackOut_37_0 = 1;
                    stackIn_38_0 = stackOut_37_0;
                    return stackIn_38_0 != 0;
                  } else {
                    if ((Object) (Object) ((at) this).field_L != var5) {
                      break L4;
                    } else {
                      L13: {
                        stackOut_40_0 = ((at) this).field_Z;
                        stackOut_40_1 = this;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (param3) {
                          stackOut_42_0 = (rj) (Object) stackIn_42_0;
                          stackOut_42_1 = this;
                          stackOut_42_2 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          stackIn_43_2 = stackOut_42_2;
                          break L13;
                        } else {
                          stackOut_41_0 = (rj) (Object) stackIn_41_0;
                          stackOut_41_1 = this;
                          stackOut_41_2 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          stackIn_43_2 = stackOut_41_2;
                          break L13;
                        }
                      }
                      boolean discarded$25 = ((rj) (Object) stackIn_43_0).a((ae) this, stackIn_43_2 != 0);
                      stackOut_43_0 = 1;
                      stackIn_44_0 = stackOut_43_0;
                      return stackIn_44_0 != 0;
                    }
                  }
                }
              }
            }
            L14: {
              if (param3) {
                break L14;
              } else {
                ((at) this).field_O = false;
                break L14;
              }
            }
            stackOut_92_0 = super.a(param0, param1, param2, true);
            stackIn_93_0 = stackOut_92_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_94_0 = var5;
            stackOut_94_1 = new StringBuilder().append("at.P(").append(param0).append(44);
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param1 == null) {
              stackOut_96_0 = stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L15;
            } else {
              stackOut_95_0 = stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L15;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_93_0;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == ((at) this).field_Z) {
                int discarded$1 = -8266;
                this.h();
                break L1;
              } else {
                if (((at) this).field_L != param2) {
                  if (param2 == ((at) this).field_W) {
                    this.a(20306, param2);
                    break L1;
                  } else {
                    if (param2 != ((at) this).field_N) {
                      L2: {
                        if (((at) this).field_ab != null) {
                          if (((at) this).field_ab.field_f) {
                            stackOut_11_0 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            break L2;
                          } else {
                            stackOut_10_0 = 0;
                            stackIn_13_0 = stackOut_10_0;
                            break L2;
                          }
                        } else {
                          stackOut_8_0 = 0;
                          stackIn_13_0 = stackOut_8_0;
                          break L2;
                        }
                      }
                      var6_int = stackIn_13_0;
                      if (var6_int != 0) {
                        break L1;
                      } else {
                        if (((at) this).field_V != param2) {
                          break L1;
                        } else {
                          if (((at) this).field_M) {
                            if (wla.field_ub > 0) {
                              this.a(20306, param2);
                              break L1;
                            } else {
                              ((at) this).field_z.c((ae) (Object) new bra(((at) this).field_z), 84);
                              break L1;
                            }
                          } else {
                            ((at) this).field_z.c((ae) (Object) new gga(((at) this).field_z, gj.field_o), 95);
                            break L1;
                          }
                        }
                      }
                    } else {
                      this.a(20306, param2);
                      break L1;
                    }
                  }
                } else {
                  this.i(-1);
                  break L1;
                }
              }
            }
            L3: {
              if (param4 >= 44) {
                break L3;
              } else {
                ((at) this).field_S = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("at.M(").append(param0).append(44).append(param1).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void h() {
        if (!((at) this).field_B) {
            return;
        }
        ((at) this).field_B = false;
    }

    private final void a(int param0, rj param1) {
        rj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        dh var5 = null;
        rj stackIn_1_0 = null;
        rj stackIn_2_0 = null;
        rj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_0_0 = null;
        rj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        rj stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              ((at) this).field_S = param1;
              boolean discarded$167 = param1.a((ae) this, false);
              int discarded$168 = -46;
              var3 = this.g();
              stackOut_0_0 = ((at) this).field_L;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param1 == var3) {
                stackOut_2_0 = (rj) (Object) stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (rj) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              L3: {
                stackIn_3_0.field_y = stackIn_3_1 != 0;
                if (param1 != ((at) this).field_V) {
                  break L3;
                } else {
                  if (var3 != param1) {
                    break L3;
                  } else {
                    if (((at) this).field_ab != null) {
                      L4: {
                        var4 = ((at) this).field_ab.i((byte) 126);
                        var5 = ((at) this).field_P[var4];
                        if (wba.field_o.field_s != var5.field_a) {
                          break L4;
                        } else {
                          if (wba.field_o.field_p == var5.field_c) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((at) this).field_L.field_y = true;
                      break L3;
                    } else {
                      int discarded$169 = -30;
                      this.j();
                      break L2;
                    }
                  }
                }
              }
              int discarded$170 = -30;
              this.j();
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("at.D(").append(20306).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static boolean f() {
        return ota.a(ica.field_b, (byte) 13, mn.field_n);
    }

    private final rj a(qc param0, String param1) {
        rj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rj stackIn_3_0 = null;
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
        rj stackOut_2_0 = null;
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
            var4 = new rj(param1, param0);
            var4.field_r = (isa) (Object) new td();
            var5 = -46 + ((at) this).field_p;
            var4.a((byte) -31, ((at) this).field_m - 30, 30, 15, var5);
            ((at) this).a((ae) (Object) var4, -1);
            stackOut_2_0 = (rj) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("at.V(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + 30815 + 41);
        }
        return stackIn_3_0;
    }

    private final rj g() {
        if (dq.field_f != null) {
            return ((at) this).field_V;
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
        L0: {
          L1: {
            var3 = TombRacer.field_G ? 1 : 0;
            if (((at) this).field_W == ((at) this).field_S) {
              int discarded$4 = 0;
              og.b();
              int discarded$5 = 0;
              kla.b();
              break L1;
            } else {
              if (((at) this).field_S == ((at) this).field_N) {
                int discarded$6 = 0;
                og.b();
                int discarded$7 = -117;
                cva.a();
                break L1;
              } else {
                if (((at) this).field_S == ((at) this).field_V) {
                  if (null != ((at) this).field_ab) {
                    var2 = ((at) this).field_ab.i((byte) 123);
                    if (var2 < 0) {
                      in.a(-30600, true);
                      ((at) this).field_z.c((ae) (Object) new op(((at) this).field_z), 89);
                      break L1;
                    } else {
                      wba.field_o.a(((at) this).field_P[var2].field_a, ((at) this).field_P[var2].field_c, -1);
                      in.a(-30600, true);
                      ((at) this).field_z.c((ae) (Object) new op(((at) this).field_z), 89);
                      break L1;
                    }
                  } else {
                    in.a(-30600, true);
                    ((at) this).field_z.c((ae) (Object) new op(((at) this).field_z), 89);
                    break L1;
                  }
                } else {
                  ((at) this).field_L.field_y = false;
                  break L0;
                }
              }
            }
          }
          ((at) this).field_L.field_y = false;
          break L0;
        }
    }

    private final void j() {
        int var3 = 0;
        rj var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        rj[] var6 = ((at) this).field_U;
        rj[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_w = ((at) this).field_S == var4 ? true : false;
        }
    }

    public static void i() {
        field_Q = null;
        field_R = null;
        int var1 = -46;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        rj[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        rj var7 = null;
        int var8 = 0;
        rj[] var9 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (!qma.field_c) {
                break L1;
              } else {
                param2.f((byte) -103);
                var9 = ((at) this).field_U;
                var5 = var9;
                var6 = 0;
                L2: while (true) {
                  if (var9.length <= var6) {
                    break L1;
                  } else {
                    L3: {
                      var7 = var9[var6];
                      if (!var7.field_f) {
                        break L3;
                      } else {
                        boolean discarded$6 = var7.a((ae) this, false);
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (((at) this).field_Y) {
                break L4;
              } else {
                if (vpa.a(127)) {
                  break L4;
                } else {
                  int discarded$7 = -8266;
                  this.h();
                  ((at) this).field_z.c((ae) (Object) new at(((at) this).field_z), 109);
                  break L4;
                }
              }
            }
            L5: {
              if (((at) this).field_ab == null) {
                break L5;
              } else {
                L6: {
                  if (((at) this).field_ab.j((byte) -125)) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L6;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L6;
                  }
                }
                if (stackIn_14_0 == (((at) this).field_O ? 1 : 0)) {
                  this.a(20306, ((at) this).field_V);
                  ((at) this).field_O = ((at) this).field_ab.j((byte) 76);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("at.A(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 41);
        }
    }

    private final rj a(int param0, hja[] param1, String param2, qc param3) {
        rj var5 = null;
        RuntimeException var5_ref = null;
        sta var6 = null;
        rj var7 = null;
        rj stackIn_3_0 = null;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_2_0 = null;
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
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var5 = new rj(param2, param3);
              var5.field_r = (isa) (Object) new tka(param1);
              if (param0 < -81) {
                break L1;
              } else {
                ((at) this).field_L = null;
                break L1;
              }
            }
            var6 = ((at) this).field_T;
            var7 = var5;
            var6.b(0, (ae) (Object) var7, var6.field_E);
            ((at) this).field_T.c((byte) 124);
            stackOut_2_0 = (rj) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("at.U(").append(param0).append(44);
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
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
