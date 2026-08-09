/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ae extends na {
    boolean field_N;
    static hl field_J;
    private boolean field_O;
    boolean field_K;
    private boolean field_I;
    static String field_M;
    static int field_L;

    final static void b(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        we.a(0, ai.field_h, nd.field_Mb, param1, true, 0, eh.field_s);
                        if (param0 > 77) {
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
                        field_M = (String) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var2_int ^ -1) <= (nd.field_Mb ^ -1)) {
                            statePc = 10;
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
                        qd.field_W[var2_int - -param1] = var2_int;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 11;
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
                        if (var3 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        we.a(0, mh.field_d, param1 + nd.field_Mb, param1 + param1, false, param1, va.field_z);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((nd.field_Mb ^ -1) >= (param1 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        nd.field_Mb = param1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw oi.a((Throwable) ((Object) var2), "ae.BA(" + param0 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param2 == 80) {
                break L1;
              } else {
                this.field_O = true;
                break L1;
              }
            }
            L2: {
              if (null == this.field_s) {
                break L2;
              } else {
                if (this.field_s instanceof dm) {
                  ((dm) ((Object) this.field_s)).a((byte) -55, (ae) (this), param3, param1, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5), "ae.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(na param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_K) {
                break L1;
              } else {
                if (this.field_I) {
                  L2: {
                    param0.f(-102);
                    this.field_O = true;
                    if (null == this.field_s) {
                      break L2;
                    } else {
                      if (!(this.field_s instanceof ub)) {
                        break L2;
                      } else {
                        ((ub) ((Object) this.field_s)).a(param1 ^ 384161774, (na) (this), this.field_O);
                        break L2;
                      }
                    }
                  }
                  if (param1 == -384169950) {
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_5_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("ae.EB(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final static void a(java.math.BigInteger param0, bh param1, bh param2, java.math.BigInteger param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param4 > 54) {
                break L1;
              } else {
                field_L = 109;
                break L1;
              }
            }
            ac.a((byte) 92, param2.field_u, param2.field_t, param1, 0, param0, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ae.EA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_21_2 + ',' + param4 + ')');
        }
    }

    ae(String param0, dn param1) {
        this(param0, dh.field_q.field_n, param1);
    }

    final static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 82) {
                break L1;
              } else {
                field_J = (hl) null;
                break L1;
              }
            }
            bo.field_C = new je();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "ae.W(" + param0 + ')');
        }
    }

    final static ud a(boolean param0, int param1, int param2) {
        rb stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        boolean stackIn_2_4 = false;
        rb stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        boolean stackIn_4_4 = false;
        rb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        boolean stackIn_5_4 = false;
        int stackIn_5_5 = 0;
        ud stackIn_7_0 = null;
        hl stackIn_42_0 = null;
        hl stackIn_44_0 = null;
        hl stackIn_45_0 = null;
        String stackIn_45_1 = null;
        hl stackIn_46_0 = null;
        hl stackIn_48_0 = null;
        hl stackIn_49_0 = null;
        String stackIn_49_1 = null;
        int stackIn_53_0 = 0;
        Object stackIn_102_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        je var4 = null;
        Object var5 = null;
        Object var6 = null;
        ud var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        pf var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = pj.field_f.field_Rb;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = 2;
                        stackIn_2_1 = stackIn_4_1;
                        stackIn_4_2 = qe.field_d + 2;
                        stackIn_2_2 = stackIn_4_2;
                        stackIn_4_3 = -127;
                        stackIn_2_3 = stackIn_4_3;
                        stackIn_4_4 = param0;
                        stackIn_2_4 = stackIn_4_4;
                        if (bi.field_d != pj.field_f.field_Rb) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (rb) ((Object) stackIn_2_0);
                        stackIn_5_1 = stackIn_2_1;
                        stackIn_5_2 = stackIn_2_2;
                        stackIn_5_3 = stackIn_2_3;
                        stackIn_5_4 = stackIn_2_4;
                        stackIn_5_5 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (rb) ((Object) stackIn_4_0);
                        stackIn_5_1 = stackIn_4_1;
                        stackIn_5_2 = stackIn_4_2;
                        stackIn_5_3 = stackIn_4_3;
                        stackIn_5_4 = stackIn_4_4;
                        stackIn_5_5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((rb) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5 != 0, param1 * (6 + qe.field_d * 3)) ? 1 : 0;
                        var4 = pj.field_f.field_Kb.field_fb;
                        if (param2 == -13047) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = (ud) null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var5 = null;
                        if ((ji.field_Tb ^ -1) == -3) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        mi.field_Kb.field_jb = dg.field_m;
                        go.field_d.field_S = false;
                        if ((ji.field_Tb ^ -1) == -2) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        pj.field_f.field_Rb.field_Ob.field_jb = kl.field_f;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        pj.field_f.field_Rb.field_Ob.field_jb = oe.field_t;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        hd.a(pj.field_f.field_Kb, (byte) -104);
                        if (var19 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        go.field_d.field_S = true;
                        mi.field_Kb.field_jb = sk.a(new String[]{ul.field_e}, vc.field_a, param2 + 13174);
                        pj.field_f.field_Rb.field_Ob.field_jb = null;
                        var6 = null;
                        var7 = (ud) ((Object) var4.c(false));
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == var7) {
                            statePc = 94;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = 0;
                        if (var19 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null != var7.field_fb) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7.field_Tb = new hl(0L, sk.field_h);
                        var7.a((byte) -114, var7.field_Tb);
                        var7.field_Wb = new hl(0L, ga.field_c);
                        var7.a((byte) 94, var7.field_Wb);
                        var7.field_Kb = new hl(0L, sk.field_h);
                        var7.a((byte) -122, var7.field_Kb);
                        var7.field_Wb.field_xb = 2;
                        var8 = 1;
                        var7.c((byte) -43);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7.field_Hb = pj.field_f.field_Kb.field_Hb;
                        var9 = 0;
                        if (null == var7.field_Ub) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (ul.field_e == var7.field_Ub) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var11 = 16777062;
                        var10 = 13421568;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12 = 0;
                        if (var7.field_Vb == null) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var7.field_Vb.equals("")) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7.field_Kb.field_vb = db.field_b;
                        var7.field_Kb.field_L = var11;
                        var7.field_Kb.a((byte) -120, 3 + db.field_b.field_t, var9, qe.field_d, 0);
                        var12 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7.field_Wb.field_ib = var11;
                        var7.field_Tb.field_ib = var11;
                        var7.field_Wb.field_nb = var11;
                        var7.field_Tb.field_nb = var11;
                        var7.field_Wb.field_N = var10;
                        var7.field_Tb.field_N = var10;
                        var7.field_Wb.field_L = var11;
                        var7.field_Tb.field_L = var11;
                        var13 = 0;
                        var14 = var7.field_Hb - 80 + -2;
                        if (var12 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var13 = db.field_b.field_t - -3;
                        var14 = var14 - var13;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_44_0 = var7.field_Tb;
                        stackIn_42_0 = stackIn_44_0;
                        if ((var14 ^ -1) < -1) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_45_0 = (hl) ((Object) stackIn_42_0);
                        stackIn_45_1 = var7.field_Mb;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = (hl) ((Object) stackIn_44_0);
                        stackIn_45_1 = jb.a(var7.field_Tb.field_Ib, var7.field_Mb, var14);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_45_0.field_jb = stackIn_45_1;
                        var7.field_Tb.a((byte) -93, var14, var9, qe.field_d, var13);
                        stackIn_48_0 = var7.field_Wb;
                        stackIn_46_0 = stackIn_48_0;
                        if (var7.field_Ub != null) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_49_0 = (hl) ((Object) stackIn_46_0);
                        stackIn_49_1 = j.field_t;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = (hl) ((Object) stackIn_48_0);
                        stackIn_49_1 = var7.field_Ub;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_49_0.field_jb = stackIn_49_1;
                        var7.field_Wb.a((byte) -108, 80, var9, qe.field_d, var7.field_Hb + -80);
                        if (var7.field_Tb.field_jb.equals(var7.field_Mb)) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_53_0 = 1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var15 = stackIn_53_0;
                        var9 = var9 + qe.field_d;
                        if (var3_int == 0) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var7.field_mb = var9 + -var7.field_R;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var8 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        pj.field_f.field_Kb.a((hl) (var6), true, var7, 2);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var7.field_Kb == null) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var7.field_Kb.field_Y) {
                            statePc = 91;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var7.field_F ^ -1) == -1) {
                            statePc = 82;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var16 = var7.field_Mb;
                        gd.a(var16, 255, (String) null, -1, pj.field_f.field_Rb, (int[]) null, 0L, var7, -1);
                        if (null == var7.field_Ub) {
                            statePc = 81;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (cc.a(hd.field_s.field_b, (byte) -80)) {
                            statePc = 81;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (cd.field_a) {
                            statePc = 81;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (!fn.field_K) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var17 = hd.field_s;
                        var18 = sk.a(new String[]{var16}, jk.field_a, 123);
                        var17.field_j.a(var18, param2 + 13048, 8);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var17 = hd.field_s;
                        var18 = sk.a(new String[]{var16}, pl.field_b, param2 + 13172);
                        var17.field_j.a(var18, 1, 18);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var5 = var7;
                        if (var19 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (!var7.field_Tb.field_Y) {
                            statePc = 93;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var15 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        re.field_P = var7.field_Mb;
                        if (var19 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        re.field_P = var7.field_Vb;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var6 = var7;
                        var7 = (ud) ((Object) var4.a((byte) -70));
                        if (var19 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if ((pj.field_f.field_Sb.field_F ^ -1) == -1) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        lf.field_b = new vg(pj.field_f.field_Sb.field_eb, pj.field_f.field_Sb.field_z, pj.field_f.field_Sb.field_Hb, pj.field_f.field_Sb.field_R, qj.field_d, um.field_n, bk.field_i, bk.field_i);
                        ke.field_c = 0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if ((pj.field_f.field_Pb.field_F ^ -1) != -1) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        lf.field_b = new vg(pj.field_f.field_Pb.field_eb, pj.field_f.field_Pb.field_z, pj.field_f.field_Pb.field_Hb, pj.field_f.field_Pb.field_R, wg.field_g, um.field_n, bk.field_i, bk.field_i);
                        ke.field_c = 1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_102_0 = var5;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    return (ud) ((Object) stackIn_102_0);
                }
                case 103: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw oi.a((Throwable) ((Object) var3), "ae.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.c(3)) {
                break L1;
              } else {
                L2: {
                  if ((param0 ^ -1) == -85) {
                    break L2;
                  } else {
                    if (-84 == (param0 ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                this.b(-1, -1, 80, 1);
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L3: {
              if (param2 == 1) {
                break L3;
              } else {
                this.field_K = true;
                break L3;
              }
            }
            stackIn_15_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ae.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        try {
            field_J = null;
            field_M = null;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ae.DA(" + param0 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_12_0 = null;
        StringBuilder stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param0, param2, 80, param1)) {
                L2: {
                  this.a(-126, param1, param0, param2);
                  if (!this.field_N) {
                    break L2;
                  } else {
                    discarded$0 = param1.append(" active");
                    break L2;
                  }
                }
                if (!this.field_K) {
                  discarded$1 = param1.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param3 == -372494750) {
              stackIn_14_0 = (StringBuilder) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_12_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ae.WA(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_14_0;
        }
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (null == this.field_s) {
                  break L1;
                } else {
                  if (this.field_s instanceof tf) {
                    ((tf) ((Object) this.field_s)).a(param0, param4, param3, (ae) (this), param5, 126);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_x = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7);

            stackIn_14_1 = new StringBuilder().append("ae.AB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == -32738) {
                break L1;
              } else {
                field_J = (hl) null;
                break L1;
              }
            }
            L2: {
              if (!this.field_K) {
                break L2;
              } else {
                if (this.b(param6, 1343807649, param1, param3, param5)) {
                  L3: {
                    this.a(param0, -384169950);
                    this.field_x = param2;
                    if (null == this.field_s) {
                      break L3;
                    } else {
                      if (this.field_s instanceof tf) {
                        ((tf) ((Object) this.field_s)).a(param3, param6, param1, 9294, param5, (ae) (this), param2);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_17_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackIn_19_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var8);

            stackIn_23_1 = new StringBuilder().append("ae.PA(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    void a(na param0, int param1, int param2, boolean param3) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (0 == this.field_x) {
                break L1;
              } else {
                if (ho.field_X != this.field_x) {
                  L2: {
                    if (!this.b(aa.field_Nb, 1343807649, param1, param2, a.field_a)) {
                      break L2;
                    } else {
                      if ((ho.field_X ^ -1) == -1) {
                        this.b(-param2 + a.field_a, -param1 + aa.field_Nb, 80, this.field_x);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.a(a.field_a, false, param0, param2, aa.field_Nb, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ae.MA(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ae(String param0, kg param1, dn param2) {
        super(param0, param1, param2);
        this.field_K = true;
        this.field_O = false;
        this.field_I = true;
    }

    protected ae() {
        this.field_K = true;
        this.field_O = false;
        this.field_I = true;
        try {
            this.field_H = dh.field_q.field_t;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ae.<init>()");
        }
    }

    final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_O) {
                break L1;
              } else {
                this.field_O = false;
                if (this.field_s == null) {
                  break L1;
                } else {
                  if (!(this.field_s instanceof ub)) {
                    break L1;
                  } else {
                    ((ub) ((Object) this.field_s)).a(-8244, (na) (this), this.field_O);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 <= -63) {
                break L2;
              } else {
                field_M = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "ae.UA(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                this.field_K = true;
                break L1;
              }
            }
            stackIn_4_0 = this.field_O;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "ae.JA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_M = "You need a rating of <%1> to play with the current options.";
        field_L = 0;
    }
}
