/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class client extends bd {
    static byte[] field_D;
    static ud field_F;
    static String field_E;
    static String field_y;
    static ck[] field_x;
    static ck[] field_C;
    static String field_B;
    public static boolean field_A;

    private final void o(int param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null != wk.field_q) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        sh.a(false, wk.field_q);
                        wk.field_q = null;
                        vj.a(true);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        tm.b((byte) -81);
                        cl.field_y = vg.a(3, 21);
                        vb.field_S = vg.a(4, 44);
                        ii.field_t = vg.a(6, 39);
                        eg.field_e = vg.a(11, 102);
                        ph.field_Db = vg.a(7, 50);
                        jj.field_c = vg.a(8, 113);
                        ah.field_d = vg.a(9, param0 ^ 24867);
                        wg.field_h = vg.a(10, param0 ^ 24938);
                        sh.field_g = new cb(65);
                        sh.field_g.a("basic", ah.field_i, bn.field_d, (byte) 95, ng.field_l);
                        sh.field_g.a("arial13", ah.field_i, un.field_a, (byte) 112, ne.field_d);
                        sh.field_g.a("arial13", qc.field_vb, un.field_a, (byte) 106, ne.field_d);
                        sh.field_g.a("arialbold14", ah.field_i, un.field_a, (byte) -97, ne.field_d);
                        sh.field_g.a("arialbold14", qc.field_vb, un.field_a, (byte) 94, ne.field_d);
                        sh.field_g.a("lobby", ah.field_i, bn.field_d, (byte) -21, ng.field_l);
                        sh.field_g.a("lobby", qc.field_vb, un.field_a, (byte) 87, ne.field_d);
                        sh.field_g.a(sc.field_k, (byte) 122, jj.field_c, he.field_fb);
                        sh.field_g.a(sc.field_k, (byte) -109, ah.field_d, he.field_fb);
                        if (param0 == 24903) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        jc discarded$1 = client.a((String) null, -14);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        sh.field_g.a(tm.field_g, (byte) 51, wg.field_h, kd.field_q);
                        sh.field_g.a("", ii.field_t, bn.field_d, (byte) 102, ng.field_l);
                        sh.field_g.a("", ph.field_Db, un.field_a, (byte) -107, ne.field_d);
                        sh.field_g.a(qa.field_w, (byte) -121, eg.field_e, ga.field_b);
                        sh.field_g.a(bk.field_Ob, (byte) 114, cl.field_y, bg.field_c);
                        sh.field_g.a(bk.field_Ob, (byte) -45, vb.field_S, bg.field_c);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dh.a((Throwable) (Object) var2, "client.V(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static jc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        jc var5 = null;
        jc stackIn_5_0 = null;
        jc stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        jc stackIn_20_0 = null;
        jc stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        jc stackOut_4_0 = null;
        jc stackOut_10_0 = null;
        Object stackOut_13_0 = null;
        jc stackOut_19_0 = null;
        jc stackOut_21_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (0 != param0.length()) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = eh.field_b;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        var2_int = param0.indexOf('@');
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 == var2_int) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = hm.field_a;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        var3 = param0.substring(0, var2_int);
                        var4 = param0.substring(1 + var2_int);
                        if (param1 == -12828) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = null;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return (jc) (Object) stackIn_14_0;
                }
                case 15: {
                    try {
                        var5 = ng.a(param1 + 12827, var3);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null != var5) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (jc) var5;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    try {
                        stackOut_21_0 = da.a(var4, -2734);
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0;
                }
                case 23: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        stackOut_24_0 = (RuntimeException) var2;
                        stackOut_24_1 = new StringBuilder().append("client.R(");
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (param0 == null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                        stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                        stackOut_25_2 = "{...}";
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                    stackOut_27_2 = "null";
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw dh.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void i(byte param0) {
        int var2_int = 0;
        ki var3_ref_ki = null;
        ff var3_ref_ff = null;
        int var3 = 0;
        String var3_ref = null;
        int[] var3_ref_int__ = null;
        int var4 = 0;
        int[] var4_ref_int__ = null;
        uf var5_ref = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        lk var5_ref_lk = null;
        int var6_int = 0;
        lk var6 = null;
        vm var6_ref = null;
        int var7 = 0;
        uf var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        rf var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String[] var16 = null;
        int var17 = 0;
        qc var18 = null;
        int var19 = 0;
        int var20 = 0;
        ui[] var21 = null;
        int var22 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_168_0 = 0;
        lk stackIn_222_0 = null;
        lk stackIn_223_0 = null;
        lk stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        int stackIn_337_0 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_70_0 = null;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_336_0 = 0;
        int stackOut_335_0 = 0;
        lk stackOut_221_0 = null;
        lk stackOut_223_0 = null;
        int stackOut_223_1 = 0;
        lk stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        L0: {
          var22 = field_A ? 1 : 0;
          var2_int = 0;
          if (kf.field_I == null) {
            break L0;
          } else {
            if ((kf.field_I.field_g.field_i ^ -1) > -4) {
              break L0;
            } else {
              var2_int = 1;
              break L0;
            }
          }
        }
        L1: {
          if (null == ce.field_C) {
            break L1;
          } else {
            if (-4 >= (ce.field_C.field_g.field_i ^ -1)) {
              var2_int = 1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (var2_int == 0) {
            ak.field_d = 1;
            break L2;
          } else {
            L3: {
              if (of.field_e > 0) {
                of.field_e = of.field_e - 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (of.field_e != 0) {
              break L2;
            } else {
              L4: {
                if ((kd.field_u ^ -1) <= -16) {
                  break L4;
                } else {
                  if ((jf.field_c ^ -1) <= -16) {
                    break L4;
                  } else {
                    if (8 > ak.field_d) {
                      ak.field_d = ak.field_d + 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L5: {
                if (15 >= kd.field_u) {
                  break L5;
                } else {
                  if ((jf.field_c ^ -1) >= -16) {
                    break L5;
                  } else {
                    if (-2 > (ak.field_d ^ -1)) {
                      ak.field_d = ak.field_d - 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              of.field_e = 50;
              kd.field_u = jf.field_c;
              break L2;
            }
          }
        }
        L6: {
          int discarded$5 = fl.a((byte) -108);
          pm.field_g = ne.b((byte) -40);
          if (!sa.field_x) {
            break L6;
          } else {
            if (null != wj.field_Ob) {
              wj.field_Ob.a(a.field_g * 50 / 128);
              sa.field_x = false;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (cl.field_v == null) {
            break L7;
          } else {
            if (!cl.field_v.field_e) {
              break L7;
            } else {
              sn.a(false);
              nm.e(54);
              break L7;
            }
          }
        }
        L8: {
          stackOut_41_0 = this;
          stackIn_43_0 = stackOut_41_0;
          stackIn_42_0 = stackOut_41_0;
          if (null == cl.field_v) {
            stackOut_43_0 = this;
            stackOut_43_1 = 0;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            break L8;
          } else {
            stackOut_42_0 = this;
            stackOut_42_1 = 1;
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            break L8;
          }
        }
        L9: {
          ((client) this).b(stackIn_44_1 != 0, -11);
          if (!of.field_c) {
            break L9;
          } else {
            this.o(24903);
            of.field_c = false;
            break L9;
          }
        }
        L10: {
          uf.field_A = uf.field_A + 1;
          if (ta.a((byte) -104)) {
            ((client) this).g(10);
            if (ta.a((byte) -93)) {
              return;
            } else {
              break L10;
            }
          } else {
            break L10;
          }
        }
        L11: {
          if (sh.field_j) {
            if (!se.i(-1)) {
              dc.a(-60);
              break L11;
            } else {
              if (ai.f((byte) -127)) {
                if ((gb.field_Vb ^ -1) == (gb.field_Ob ^ -1)) {
                  L12: {
                    var3 = tm.a((byte) -117);
                    if (-3 != (var3 ^ -1)) {
                      if ((var3 ^ -1) == -4) {
                        jk.a(2, true);
                        break L12;
                      } else {
                        if ((var3 ^ -1) != -5) {
                          break L12;
                        } else {
                          og.a(true, 3, true);
                          break L12;
                        }
                      }
                    } else {
                      sn.a(false);
                      break L12;
                    }
                  }
                  this.b(30661, true);
                  break L11;
                } else {
                  this.b(30661, false);
                  break L11;
                }
              } else {
                if (pk.d(65)) {
                  L13: {
                    stackOut_70_0 = this;
                    stackIn_73_0 = stackOut_70_0;
                    stackIn_71_0 = stackOut_70_0;
                    if (null == cl.field_v) {
                      stackOut_73_0 = this;
                      stackOut_73_1 = 0;
                      stackIn_74_0 = stackOut_73_0;
                      stackIn_74_1 = stackOut_73_1;
                      break L13;
                    } else {
                      stackOut_71_0 = this;
                      stackIn_72_0 = stackOut_71_0;
                      stackOut_72_0 = this;
                      stackOut_72_1 = 1;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_74_1 = stackOut_72_1;
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      var3 = ((client) this).a(stackIn_74_1 != 0, (byte) 102);
                      if (1 == var3) {
                        break L15;
                      } else {
                        if (2 != var3) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (cl.field_v != null) {
                        sn.a(false);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if ((var3 ^ -1) != -3) {
                      break L14;
                    } else {
                      pk.a((byte) -17, se.h(25144));
                      break L14;
                    }
                  }
                  this.b(30661, true);
                  break L11;
                } else {
                  if (!cn.f((byte) 123)) {
                    this.b(30661, false);
                    break L11;
                  } else {
                    if (gb.field_Vb == gb.field_Ob) {
                      L17: {
                        var3 = we.a(false);
                        if ((var3 ^ -1) != -2) {
                          break L17;
                        } else {
                          og.a(im.field_f, fe.field_b, true);
                          break L17;
                        }
                      }
                      this.b(30661, true);
                      break L11;
                    } else {
                      this.b(30661, false);
                      break L11;
                    }
                  }
                }
              }
            }
          } else {
            ql.a(jk.field_c, (byte) -115);
            if (!this.n(0)) {
              break L11;
            } else {
              sh.field_j = true;
              break L11;
            }
          }
        }
        L18: {
          if (!ph.n(-30146)) {
            L19: while (true) {
              var3_ref_ki = (ki) (Object) si.field_e.a(4);
              if (var3_ref_ki == null) {
                L20: while (true) {
                  var3_ref_ff = (ff) (Object) jm.field_r.a(4);
                  if (var3_ref_ff != null) {
                    wk.a(3, 5, var3_ref_ff);
                    continue L20;
                  } else {
                    break L18;
                  }
                }
              } else {
                ce.a(4, var3_ref_ki, -697);
                continue L19;
              }
            }
          } else {
            break L18;
          }
        }
        L21: while (true) {
          if (!vi.a(mk.field_c, 0)) {
            L22: {
              wj.c(4792, 0);
              if (param0 >= 49) {
                break L22;
              } else {
                jc discarded$6 = client.a((String) null, 33);
                break L22;
              }
            }
            L23: {
              L24: {
                if (null == hh.field_a) {
                  break L24;
                } else {
                  if ((ef.field_N ^ -1) >= -1) {
                    stackOut_336_0 = 0;
                    stackIn_337_0 = stackOut_336_0;
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              stackOut_335_0 = 1;
              stackIn_337_0 = stackOut_335_0;
              break L23;
            }
            L25: {
              var3 = stackIn_337_0;
              if (fm.field_b) {
                var3 = nk.field_i ? 1 : 0;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (fa.field_n) {
                var3 = og.field_ib ? 1 : 0;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (var3 == 0) {
                break L27;
              } else {
                bg.field_b = 0;
                break L27;
              }
            }
            L28: {
              if (!ea.c((byte) -60)) {
                break L28;
              } else {
                L29: {
                  L30: {
                    var4 = ((client) this).g((byte) 125);
                    if ((var4 ^ -1) == -1) {
                      break L30;
                    } else {
                      if (var4 == 1) {
                        break L30;
                      } else {
                        break L29;
                      }
                    }
                  }
                  if (1 == var4) {
                    wk.field_i = true;
                    mn.field_c = true;
                    break L29;
                  } else {
                    L31: {
                      if (!uh.field_b) {
                        break L31;
                      } else {
                        L32: {
                          un.a((byte) -123);
                          gd.field_f = true;
                          if (fm.field_b) {
                            wj.a(1, -99, false, 0, true, af.field_a);
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                        dc.a(false, 96);
                        uh.field_b = false;
                        fm.field_b = false;
                        fa.field_n = false;
                        jg.a(-100);
                        am.field_c = false;
                        break L31;
                      }
                    }
                    wk.field_i = false;
                    mn.field_c = false;
                    break L29;
                  }
                }
                L33: {
                  var5 = 0;
                  if ((var4 ^ -1) != -3) {
                    break L33;
                  } else {
                    var5 = 1;
                    break L33;
                  }
                }
                L34: {
                  L35: {
                    if (uh.field_b) {
                      break L35;
                    } else {
                      if (mn.field_c) {
                        break L35;
                      } else {
                        if (wk.field_i) {
                          break L35;
                        } else {
                          break L34;
                        }
                      }
                    }
                  }
                  var5 = 1;
                  break L34;
                }
                L36: {
                  if (ea.c((byte) -88)) {
                    break L36;
                  } else {
                    var5 = 0;
                    break L36;
                  }
                }
                if (var5 == 0) {
                  break L28;
                } else {
                  gh.a(false);
                  break L28;
                }
              }
            }
            L37: {
              of.a(0);
              if (!sh.field_j) {
                break L37;
              } else {
                if (am.field_c) {
                  break L37;
                } else {
                  if (jg.field_a != rc.field_d) {
                    nn.a(256, jg.field_a, true);
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
            }
            return;
          } else {
            if ((bh.field_k ^ -1) != -10) {
              if (77 != bh.field_k) {
                if (-15 == (bh.field_k ^ -1)) {
                  we.a((byte) 66);
                  cd.a(true);
                  nk.a(id.g(8192), rd.b(-95), 0, 5, oe.b(-10498, 2000), qi.e((byte) 117), vl.field_A, 150, oe.b(-10498, 8), 1024);
                  dg.a(21014, tc.g((byte) 98), l.a(-126));
                  gk.field_Ib = true;
                  uh.field_b = true;
                  mn.field_c = false;
                  var3_ref_int__ = j.field_d;
                  var4 = 0;
                  L38: while (true) {
                    if ((var4 ^ -1) <= -9) {
                      continue L21;
                    } else {
                      var3_ref_int__[var4] = 0;
                      var4++;
                      continue L38;
                    }
                  }
                } else {
                  if ((bh.field_k ^ -1) != -16) {
                    L39: {
                      if ((bh.field_k ^ -1) != -11) {
                        break L39;
                      } else {
                        if (uh.field_b) {
                          ke.a((byte) 113);
                          continue L21;
                        } else {
                          break L39;
                        }
                      }
                    }
                    if (-76 == (bh.field_k ^ -1)) {
                      var3_ref_int__ = b.h(-123);
                      var4_ref_int__ = var3_ref_int__;
                      var5_ref = de.field_V;
                      var6_int = ((wl) (Object) var5_ref).d((byte) -45);
                      var7 = 0;
                      L40: while (true) {
                        if ((var7 ^ -1) <= (var6_int ^ -1)) {
                          L41: {
                            if (nm.field_Qb) {
                              var4_ref_int__ = var3_ref_int__;
                              var5_ref_int__ = o.field_g;
                              var6_int = 0;
                              L42: while (true) {
                                if (-9 >= (var6_int ^ -1)) {
                                  L43: {
                                    if (null == kf.field_I) {
                                      break L43;
                                    } else {
                                      if (kf.field_I.field_g.field_p[kf.field_I.field_P] == null) {
                                        break L43;
                                      } else {
                                        var4 = 0;
                                        L44: while (true) {
                                          if ((var4 ^ -1) <= -32) {
                                            break L43;
                                          } else {
                                            L45: {
                                              if (!rb.a(-18, var4, var3_ref_int__)) {
                                                break L45;
                                              } else {
                                                kf.field_I.field_g.field_p[kf.field_I.field_P].field_cb.a((bh) (Object) new vd(var4), 2777);
                                                break L45;
                                              }
                                            }
                                            var4++;
                                            continue L44;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4_ref_int__ = j.field_d;
                                  var5_ref_int__ = var3_ref_int__;
                                  var6_int = 0;
                                  L46: while (true) {
                                    if ((var6_int ^ -1) <= -9) {
                                      break L41;
                                    } else {
                                      var4_ref_int__[var6_int] = de.b(var4_ref_int__[var6_int], var5_ref_int__[var6_int]);
                                      var6_int++;
                                      continue L46;
                                    }
                                  }
                                } else {
                                  var4_ref_int__[var6_int] = lb.a(var4_ref_int__[var6_int], var5_ref_int__[var6_int] ^ -1);
                                  var6_int++;
                                  continue L42;
                                }
                              }
                            } else {
                              break L41;
                            }
                          }
                          var4_ref_int__ = o.field_g;
                          var5_ref_int__ = var3_ref_int__;
                          var6_int = 0;
                          L47: while (true) {
                            if (-9 >= (var6_int ^ -1)) {
                              continue L21;
                            } else {
                              var4_ref_int__[var6_int] = de.b(var4_ref_int__[var6_int], var5_ref_int__[var6_int]);
                              var6_int++;
                              continue L47;
                            }
                          }
                        } else {
                          var4_ref_int__[var7] = ((wl) (Object) var5_ref).i(7553);
                          var7++;
                          continue L40;
                        }
                      }
                    } else {
                      L48: {
                        if (58 == bh.field_k) {
                          break L48;
                        } else {
                          if (bh.field_k != 59) {
                            if (bh.field_k == 60) {
                              L49: {
                                L50: {
                                  if (fm.field_b) {
                                    break L50;
                                  } else {
                                    if (fa.field_n) {
                                      break L50;
                                    } else {
                                      break L49;
                                    }
                                  }
                                }
                                fm.field_b = false;
                                am.field_c = false;
                                fa.field_n = false;
                                cd.a(true);
                                un.a((byte) -125);
                                jg.a(-111);
                                break L49;
                              }
                              wk.field_i = false;
                              continue L21;
                            } else {
                              L51: {
                                var3_ref_int__ = null;
                                if (!fm.field_b) {
                                  if (!fa.field_n) {
                                    break L51;
                                  } else {
                                    var3_ref = (String) (Object) ce.field_C;
                                    break L51;
                                  }
                                } else {
                                  var3_ref = (String) (Object) kf.field_I;
                                  break L51;
                                }
                              }
                              L52: {
                                if (null != var3_ref) {
                                  if (61 == bh.field_k) {
                                    L53: {
                                      var4 = de.field_V.d((byte) -92);
                                      var5_ref_lk = ((qc) (Object) var3_ref).field_g.field_p[var4];
                                      stackOut_221_0 = (lk) var5_ref_lk;
                                      stackIn_223_0 = stackOut_221_0;
                                      stackIn_222_0 = stackOut_221_0;
                                      if ((var4 ^ -1) != (((qc) (Object) var3_ref).field_P ^ -1)) {
                                        stackOut_223_0 = (lk) (Object) stackIn_223_0;
                                        stackOut_223_1 = 0;
                                        stackIn_224_0 = stackOut_223_0;
                                        stackIn_224_1 = stackOut_223_1;
                                        break L53;
                                      } else {
                                        stackOut_222_0 = (lk) (Object) stackIn_222_0;
                                        stackOut_222_1 = 1;
                                        stackIn_224_0 = stackOut_222_0;
                                        stackIn_224_1 = stackOut_222_1;
                                        break L53;
                                      }
                                    }
                                    ((lk) (Object) stackIn_224_0).a(stackIn_224_1 != 0, (wl) (Object) de.field_V, (byte) 118);
                                    ((qc) (Object) var3_ref).a(true, var5_ref_lk, 600, 200, var5_ref_lk.field_jb, var4, false);
                                    if (((qc) (Object) var3_ref).field_P == var4) {
                                      we.field_b.f(59, -4);
                                      we.field_b.a(true, var5_ref_lk.field_U);
                                      ((qc) (Object) var3_ref).field_E = 7 * var5_ref_lk.field_yb - 4;
                                      continue L21;
                                    } else {
                                      continue L21;
                                    }
                                  } else {
                                    if (bh.field_k == 62) {
                                      L54: {
                                        var4 = de.field_V.d((byte) -124);
                                        var5 = de.field_V.d((byte) -116);
                                        if ((((qc) (Object) var3_ref).field_g.field_b ^ -1) >= (var4 ^ -1)) {
                                          break L54;
                                        } else {
                                          if (((qc) (Object) var3_ref).field_g.field_p[var4] == null) {
                                            break L54;
                                          } else {
                                            var6 = ((qc) (Object) var3_ref).field_g.field_p[var4];
                                            L55: while (true) {
                                              if ((var6.field_fb ^ -1) <= (var6.field_gb ^ -1)) {
                                                L56: {
                                                  ((qc) (Object) var3_ref).a(18, var6, var4);
                                                  ((qc) (Object) var3_ref).field_g.field_p[var4] = null;
                                                  ((qc) (Object) var3_ref).field_g.field_d = ((qc) (Object) var3_ref).field_g.field_d & (1 << var4 ^ -1);
                                                  ((qc) (Object) var3_ref).field_g.field_i = ((qc) (Object) var3_ref).field_g.field_i - 1;
                                                  if (((qc) (Object) var3_ref).field_P == var4) {
                                                    cd.a(true);
                                                    ob.field_k = true;
                                                    ((qc) (Object) var3_ref).a(rm.field_b, 0);
                                                    break L56;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                                ((qc) (Object) var3_ref).field_r = false;
                                                ca.field_kb = 1;
                                                jb.field_a = false;
                                                rb.field_e = 0;
                                                ak.field_d = 1;
                                                ((qc) (Object) var3_ref).field_T = var5;
                                                continue L21;
                                              } else {
                                                var7 = ((qc) (Object) var3_ref).b(-117, var4) ? 1 : 0;
                                                if (var7 == 0) {
                                                  qb.a((Throwable) null, 16408, "T6");
                                                  si.a(79);
                                                  continue L21;
                                                } else {
                                                  continue L55;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      qb.a((Throwable) null, 16408, "T4: " + var4);
                                      si.a(85);
                                      continue L21;
                                    } else {
                                      if (-64 == (bh.field_k ^ -1)) {
                                        var4 = de.field_V.d((byte) -53);
                                        var5 = de.field_V.d((byte) -118);
                                        var6_int = sm.field_e + -de.field_V.field_n;
                                        if (0 <= var6_int) {
                                          var7_ref = new uf(var6_int + 1);
                                          var7_ref.a(true, var5);
                                          var7_ref.a(false, var6_int, de.field_V.field_r, de.field_V.field_n);
                                          var7_ref.field_n = 0;
                                          ((qc) (Object) var3_ref).field_v[var4].field_g.a((bh) (Object) var7_ref, 2777);
                                          ((qc) (Object) var3_ref).field_v[var4].field_e = ((qc) (Object) var3_ref).field_v[var4].field_e + var5;
                                          continue L21;
                                        } else {
                                          qb.a((Throwable) null, 16408, "T8: " + var4 + " " + var5 + " " + var6_int);
                                          si.a(65);
                                          continue L21;
                                        }
                                      } else {
                                        if (-65 != (bh.field_k ^ -1)) {
                                          if (-66 == (bh.field_k ^ -1)) {
                                            var4 = de.field_V.d((byte) -60);
                                            var5_ref_lk = ((qc) (Object) var3_ref).field_g.field_p[var4];
                                            L57: while (true) {
                                              var6_int = ((qc) (Object) var3_ref).b(-116, var4) ? 1 : 0;
                                              if (var6_int != 0) {
                                                continue L57;
                                              } else {
                                                L58: {
                                                  if ((((qc) (Object) var3_ref).field_P ^ -1) == (var4 ^ -1)) {
                                                    var6_int = 0;
                                                    L59: while (true) {
                                                      if ((var5_ref_lk.field_jb ^ -1) >= (var6_int ^ -1)) {
                                                        break L58;
                                                      } else {
                                                        fh.field_h = fh.field_h + 30000;
                                                        rk.field_cb = rk.field_cb + 30000;
                                                        var6_int++;
                                                        continue L59;
                                                      }
                                                    }
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                                var5_ref_lk.field_jb = 0;
                                                var5_ref_lk.k(-9897);
                                                ((qc) (Object) var3_ref).field_w = 0;
                                                if ((var4 ^ -1) == (((qc) (Object) var3_ref).field_P ^ -1)) {
                                                  ((qc) (Object) var3_ref).field_p.a((bh) (Object) new in(cb.field_i, 13, true), 2777);
                                                  ((qc) (Object) var3_ref).field_ob = true;
                                                  continue L21;
                                                } else {
                                                  continue L21;
                                                }
                                              }
                                            }
                                          } else {
                                            if ((bh.field_k ^ -1) == -67) {
                                              var4 = de.field_V.d((byte) -22);
                                              var5 = de.field_V.d((byte) -76);
                                              var6 = ((qc) (Object) var3_ref).field_g.field_p[var4];
                                              var7 = 0;
                                              L60: while (true) {
                                                if (var7 >= var5) {
                                                  continue L21;
                                                } else {
                                                  rf discarded$7 = var6.b(-19939);
                                                  var7++;
                                                  continue L60;
                                                }
                                              }
                                            } else {
                                              if (67 == bh.field_k) {
                                                var4 = de.field_V.d((byte) -50);
                                                var5_ref = (uf) (Object) ((qc) (Object) var3_ref).field_db.a(true, true, de.field_V);
                                                ((qc) (Object) var3_ref).field_g.field_p[var4].a((rf) (Object) var5_ref, (byte) -121);
                                                continue L21;
                                              } else {
                                                if ((bh.field_k ^ -1) != -69) {
                                                  if (bh.field_k == 69) {
                                                    ((qc) (Object) var3_ref).field_T = de.field_V.d((byte) -78);
                                                    ((qc) (Object) var3_ref).field_r = true;
                                                    ((qc) (Object) var3_ref).field_p.a((bh) (Object) new in(bn.field_c, 8, false), 2777);
                                                    continue L21;
                                                  } else {
                                                    if ((bh.field_k ^ -1) == -77) {
                                                      ((qc) (Object) var3_ref).field_g.field_f[((qc) (Object) var3_ref).field_g.field_o] = de.field_V.g((byte) -89);
                                                      ((qc) (Object) var3_ref).field_g.field_o = ((qc) (Object) var3_ref).field_g.field_o + 1;
                                                      continue L21;
                                                    } else {
                                                      if (70 != bh.field_k) {
                                                        if (71 == bh.field_k) {
                                                          ((qc) (Object) var3_ref).field_g.field_d = de.field_V.d((byte) -45);
                                                          continue L21;
                                                        } else {
                                                          if (bh.field_k != 72) {
                                                            if (bh.field_k == 73) {
                                                              ((qc) (Object) var3_ref).field_g.field_a = de.field_V.d((byte) -77);
                                                              continue L21;
                                                            } else {
                                                              if ((bh.field_k ^ -1) != -75) {
                                                                break L52;
                                                              } else {
                                                                ((qc) (Object) var3_ref).field_yb = de.field_V.d((byte) -31);
                                                                ((qc) (Object) var3_ref).field_g.field_d = ((qc) (Object) var3_ref).field_g.field_d & (((qc) (Object) var3_ref).field_yb ^ -1);
                                                                ((qc) (Object) var3_ref).field_g.field_a = ((qc) (Object) var3_ref).field_g.field_a & (((qc) (Object) var3_ref).field_yb ^ -1);
                                                                continue L21;
                                                              }
                                                            }
                                                          } else {
                                                            ((qc) (Object) var3_ref).field_g.field_h = de.field_V.d((byte) -19);
                                                            continue L21;
                                                          }
                                                        }
                                                      } else {
                                                        var4 = de.field_V.g((byte) -104);
                                                        var5 = 0;
                                                        L61: while (true) {
                                                          if ((var5 ^ -1) <= (((qc) (Object) var3_ref).field_g.field_b ^ -1)) {
                                                            L62: {
                                                              ((qc) (Object) var3_ref).field_g.a(var4, (byte) -70);
                                                              ((qc) (Object) var3_ref).a(100);
                                                              if (((qc) (Object) var3_ref).field_P >= 0) {
                                                                cd.a(true);
                                                                break L62;
                                                              } else {
                                                                break L62;
                                                              }
                                                            }
                                                            L63: {
                                                              L64: {
                                                                if (-1 < (var4 ^ -1)) {
                                                                  break L64;
                                                                } else {
                                                                  if (!((qc) (Object) var3_ref).field_ob) {
                                                                    ((qc) (Object) var3_ref).a(hb.field_Ub, 0);
                                                                    break L63;
                                                                  } else {
                                                                    break L64;
                                                                  }
                                                                }
                                                              }
                                                              ((qc) (Object) var3_ref).a(rm.field_b, 0);
                                                              break L63;
                                                            }
                                                            ob.field_k = true;
                                                            continue L21;
                                                          } else {
                                                            L65: {
                                                              if (null == ((qc) (Object) var3_ref).field_g.field_p[var5]) {
                                                                break L65;
                                                              } else {
                                                                L66: while (true) {
                                                                  if (((qc) (Object) var3_ref).field_v[var5].field_g.b(-24)) {
                                                                    break L65;
                                                                  } else {
                                                                    boolean discarded$8 = ((qc) (Object) var3_ref).b(39, var5);
                                                                    continue L66;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var5++;
                                                            continue L61;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  ((qc) (Object) var3_ref).field_T = de.field_V.d((byte) -35);
                                                  ((qc) (Object) var3_ref).field_p.a((bh) (Object) new in(eb.field_c, 12, false), 2777);
                                                  continue L21;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L67: {
                                            var4 = de.field_V.d((byte) -127);
                                            var5_ref_lk = ((qc) (Object) var3_ref).field_g.field_p[var4];
                                            var6_ref = new vm();
                                            var6_ref.field_y = de.field_V.g((byte) -88);
                                            var6_ref.field_n = de.field_V.g((byte) -118);
                                            var6_ref.field_v = de.field_V.d((byte) -93);
                                            var6_ref.field_o = de.field_V.d((byte) -83);
                                            var6_ref.field_q = ((qc) (Object) var3_ref).field_db.a(true, true, de.field_V);
                                            var6_ref.field_t = de.field_V.d((byte) -64);
                                            ((qc) (Object) var3_ref).field_v[var4].field_g.a((bh) (Object) var6_ref, 2777);
                                            var7 = de.field_V.a(117);
                                            var8 = de.field_V.a(127) + var7;
                                            if ((var8 ^ -1) < (var7 ^ -1)) {
                                              var9 = var7;
                                              L68: while (true) {
                                                if (var8 <= var9) {
                                                  L69: while (true) {
                                                    if ((var5_ref_lk.field_fb ^ -1) <= (var5_ref_lk.field_gb ^ -1)) {
                                                      var5_ref_lk.field_gb = var8;
                                                      var5_ref_lk.field_fb = var7;
                                                      break L67;
                                                    } else {
                                                      var9 = ((qc) (Object) var3_ref).b(-126, var4) ? 1 : 0;
                                                      if (var9 != 0) {
                                                        continue L69;
                                                      } else {
                                                        qb.a((Throwable) null, 16408, "T7");
                                                        si.a(97);
                                                        continue L69;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  L70: {
                                                    var10 = new rf(var9);
                                                    if ((var4 ^ -1) == (((qc) (Object) var3_ref).field_P ^ -1)) {
                                                      var10.field_m = -var7 + var9;
                                                      break L70;
                                                    } else {
                                                      break L70;
                                                    }
                                                  }
                                                  ((qc) (Object) var3_ref).field_db.a(var10, 0);
                                                  var9++;
                                                  continue L68;
                                                }
                                              }
                                            } else {
                                              break L67;
                                            }
                                          }
                                          if (((qc) (Object) var3_ref).field_P == var4) {
                                            L71: while (true) {
                                              if (!var6_ref.a((byte) 58)) {
                                                we.field_b.f(59, -4);
                                                we.field_b.a(true, ((qc) (Object) var3_ref).field_g.field_p[var4].field_U);
                                                ((qc) (Object) var3_ref).field_w = 0;
                                                continue L21;
                                              } else {
                                                boolean discarded$9 = ((qc) (Object) var3_ref).b(-118, var4);
                                                continue L71;
                                              }
                                            }
                                          } else {
                                            continue L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L52;
                                }
                              }
                              ((client) this).f((byte) 126);
                              continue L21;
                            }
                          } else {
                            break L48;
                          }
                        }
                      }
                      L72: {
                        var3 = de.field_V.e(3);
                        var4 = var3 & 15;
                        var5 = 3 & var3 >> 1315490500;
                        var6_int = var3 >> -1189014074 & 7;
                        var7 = (var3 & 3812) >> -1446042807;
                        if ((var3 & 4096 ^ -1) == -1) {
                          stackOut_158_0 = 0;
                          stackIn_159_0 = stackOut_158_0;
                          break L72;
                        } else {
                          stackOut_157_0 = 1;
                          stackIn_159_0 = stackOut_157_0;
                          break L72;
                        }
                      }
                      L73: {
                        var8 = stackIn_159_0;
                        if ((8192 & var3) == 0) {
                          stackOut_161_0 = 0;
                          stackIn_162_0 = stackOut_161_0;
                          break L73;
                        } else {
                          stackOut_160_0 = 1;
                          stackIn_162_0 = stackOut_160_0;
                          break L73;
                        }
                      }
                      L74: {
                        var9 = stackIn_162_0;
                        if ((var3 & 16384) == 0) {
                          stackOut_164_0 = 0;
                          stackIn_165_0 = stackOut_164_0;
                          break L74;
                        } else {
                          stackOut_163_0 = 1;
                          stackIn_165_0 = stackOut_163_0;
                          break L74;
                        }
                      }
                      L75: {
                        var10_int = stackIn_165_0;
                        if (-1 == (var3 & 32768 ^ -1)) {
                          stackOut_167_0 = 0;
                          stackIn_168_0 = stackOut_167_0;
                          break L75;
                        } else {
                          stackOut_166_0 = 1;
                          stackIn_168_0 = stackOut_166_0;
                          break L75;
                        }
                      }
                      L76: {
                        var11 = stackIn_168_0;
                        var12 = de.field_V.e(3);
                        var13 = de.field_V.d((byte) -92);
                        var14 = de.field_V.d((byte) -116);
                        var15 = de.field_V.g((byte) -100);
                        if ((var15 ^ -1) > -1) {
                          var15 = -2;
                          break L76;
                        } else {
                          break L76;
                        }
                      }
                      var16 = new String[var14];
                      var17 = 0;
                      L77: while (true) {
                        if (var17 >= var14) {
                          L78: {
                            var17 = de.field_V.d((byte) -27);
                            gh.field_e = null;
                            var18 = new qc(true, var13, var8 != 0, var4, var5, var6_int, var7, var16, var15, var9 != 0, false, false);
                            var18.field_R = var12;
                            var18.field_r = var10_int != 0;
                            if (var10_int != 0) {
                              var18.field_p.a((bh) (Object) new in(bn.field_c, 8, true), 2777);
                              break L78;
                            } else {
                              if (var11 != 0) {
                                var18.field_p.a((bh) (Object) new in(cf.field_e, 10, true), 2777);
                                break L78;
                              } else {
                                break L78;
                              }
                            }
                          }
                          var19 = 0;
                          var20 = 0;
                          L79: while (true) {
                            if (var20 >= var18.field_g.field_b) {
                              L80: {
                                if (-3 > (var19 ^ -1)) {
                                  var18.field_Ab = 100;
                                  break L80;
                                } else {
                                  break L80;
                                }
                              }
                              L81: {
                                var20 = var18.field_P;
                                if (-1 < (var20 ^ -1)) {
                                  var20 = 0;
                                  L82: while (true) {
                                    if (200 == var18.field_V[var20]) {
                                      break L81;
                                    } else {
                                      var20++;
                                      continue L82;
                                    }
                                  }
                                } else {
                                  break L81;
                                }
                              }
                              L83: {
                                if (2 != var19) {
                                  break L83;
                                } else {
                                  var20 = (var20 + 1) % var18.field_g.field_b;
                                  L84: while (true) {
                                    if (var18.field_V[var20] == 200) {
                                      break L83;
                                    } else {
                                      var20 = (var20 - -1) % var18.field_g.field_b;
                                      continue L84;
                                    }
                                  }
                                }
                              }
                              L85: {
                                var18.field_i = var20;
                                var18.field_D = var20;
                                var18.field_lb = var20;
                                if (-59 == (bh.field_k ^ -1)) {
                                  kf.field_I = var18;
                                  fm.field_b = true;
                                  eb.a(58);
                                  break L85;
                                } else {
                                  ce.field_C = var18;
                                  fa.field_n = true;
                                  break L85;
                                }
                              }
                              L86: {
                                wk.field_i = false;
                                am.field_c = true;
                                if (var4 == 10) {
                                  var21 = ee.field_a;
                                  break L86;
                                } else {
                                  var21 = sb.field_u[var13];
                                  break L86;
                                }
                              }
                              nn.a(var18.b(true), var21[0], true);
                              continue L21;
                            } else {
                              L87: {
                                if (-1 == (var17 & 1 << var20 ^ -1)) {
                                  break L87;
                                } else {
                                  var18.field_V[var20] = 200;
                                  var19++;
                                  break L87;
                                }
                              }
                              var20++;
                              continue L79;
                            }
                          }
                        } else {
                          var16[var17] = de.field_V.b(true);
                          var17++;
                          continue L77;
                        }
                      }
                    }
                  } else {
                    L88: {
                      if (uh.field_b) {
                        bb.b(true);
                        kh.a(true);
                        kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                        dc.a(false, 126);
                        un.a((byte) -124);
                        fm.field_b = false;
                        fa.field_n = false;
                        gd.field_f = true;
                        uh.field_b = false;
                        jg.a(-48);
                        break L88;
                      } else {
                        break L88;
                      }
                    }
                    mn.field_c = false;
                    wk.field_i = false;
                    continue L21;
                  }
                }
              } else {
                mn.field_c = false;
                pn.a(true, false, true);
                continue L21;
              }
            } else {
              mn.field_c = false;
              var3_ref = de.field_V.c((byte) -38);
              wj.a(1, -86, false, 0, true, var3_ref);
              continue L21;
            }
          }
        }
    }

    public static void j(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_y = null;
              field_D = null;
              field_E = null;
              field_F = null;
              field_C = null;
              if (param0 == -56) {
                break L0;
              } else {
                field_C = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_x = null;
          field_B = null;
        }
    }

    public client() {
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (km.field_z == null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        km.field_z.e();
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (null != cj.field_b) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        cj.field_b.e();
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == cl.field_v) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        sn.a(false);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        s.h((byte) 88);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dh.a((Throwable) (Object) var2, "client.I(" + param0 + 41);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_123_0 = 0;
        ke stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        ke stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        ke stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        ke stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        int stackIn_159_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_169_0 = 0;
        boolean stackIn_179_0 = false;
        boolean stackIn_181_0 = false;
        boolean stackIn_185_0 = false;
        Object stackIn_209_0 = null;
        int stackIn_213_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_242_0 = 0;
        int stackIn_250_0 = 0;
        int stackIn_267_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_305_0 = 0;
        int stackIn_319_0 = 0;
        int stackOut_122_0 = 0;
        ke stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        ke stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        ke stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        int stackOut_129_2 = 0;
        ke stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        int stackOut_131_2 = 0;
        int stackOut_158_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_168_0 = 0;
        boolean stackOut_178_0 = false;
        boolean stackOut_180_0 = false;
        boolean stackOut_184_0 = false;
        Object stackOut_208_0 = null;
        int stackOut_212_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_241_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_266_0 = 0;
        int stackOut_270_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_304_0 = 0;
        int stackOut_316_0 = 0;
        int stackOut_318_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 30661) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (gb.field_Vb == gb.field_Ob) {
                            statePc = 85;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ve.field_nc != gb.field_Ob) {
                            statePc = 20;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        rf.field_f = rf.field_f + 1;
                        if (rf.field_f == 16) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 338;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (im.field_f) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ed.a(param0 + -30553);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        gf.a((byte) -126);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        gb.field_Ob = g.field_L;
                        statePc = 338;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((gb.field_Ob ^ -1) == (g.field_L ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        rf.field_f = rf.field_f - 1;
                        if (-1 != (rf.field_f ^ -1)) {
                            statePc = 338;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        gb.field_Ob = gb.field_Vb;
                        statePc = 338;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!ph.n(-30146)) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (null != gh.field_e) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        qb.a(3, (byte) 85, gh.field_e);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ek.g(param0 + -31870);
                        if (1 == fe.field_b) {
                            statePc = 81;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (2 == fe.field_b) {
                            statePc = 78;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (fe.field_b == 3) {
                            statePc = 75;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (fe.field_b != 4) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        dc.a(false, param0 + -30547);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (-6 == (fe.field_b ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-7 != (fe.field_b ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        cl.field_B = qj.a(-44, false);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (fe.field_b == 8) {
                            statePc = 69;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (7 == fe.field_b) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw new IllegalStateException(Integer.toString(fe.field_b));
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        ca.field_wb = oj.a(false, 415);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        am.field_a = ib.a((byte) 82, false);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        h.field_d = uh.a(o.field_g, false, 0, -111);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        jk.a(2, true);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        jm.a(0, true);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        vk.a(true, (byte) -53);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        gb.field_Ob = lk.field_I;
                        statePc = 338;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var3_int = 0;
                        var4 = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (!param1) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (null == kf.field_G) {
                            statePc = 150;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (!ba.field_c) {
                            statePc = 96;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        pd.field_d.g((byte) -96);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (lk.field_F) {
                            statePc = 147;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (mg.field_Zb) {
                            statePc = 144;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (fm.field_e) {
                            statePc = 141;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (ve.field_Hc) {
                            statePc = 138;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (!nk.field_k) {
                            statePc = 114;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        f.field_s.g(2824);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (gi.field_b) {
                            statePc = 120;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        kf.field_G.k(128);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        h.a((ke) null, (byte) 95);
                        boolean discarded$6 = wf.a(false);
                        var5 = lg.a(0, true);
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (1 == var5) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackOut_122_0 = var5;
                        stackIn_123_0 = stackOut_122_0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if ((stackIn_123_0 ^ -1) != -3) {
                            statePc = 133;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        gi.field_b = false;
                        stackOut_126_0 = kf.field_G;
                        stackOut_126_1 = param0 ^ -30662;
                        stackIn_131_0 = stackOut_126_0;
                        stackIn_131_1 = stackOut_126_1;
                        stackIn_127_0 = stackOut_126_0;
                        stackIn_127_1 = stackOut_126_1;
                        if (var5 != 2) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = (ke) (Object) stackIn_127_0;
                        stackOut_127_1 = stackIn_127_1;
                        stackIn_129_0 = stackOut_127_0;
                        stackIn_129_1 = stackOut_127_1;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = (ke) (Object) stackIn_129_0;
                        stackOut_129_1 = stackIn_129_1;
                        stackOut_129_2 = 1;
                        stackIn_132_0 = stackOut_129_0;
                        stackIn_132_1 = stackOut_129_1;
                        stackIn_132_2 = stackOut_129_2;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = (ke) (Object) stackIn_131_0;
                        stackOut_131_1 = stackIn_131_1;
                        stackOut_131_2 = 0;
                        stackIn_132_0 = stackOut_131_0;
                        stackIn_132_1 = stackOut_131_1;
                        stackIn_132_2 = stackOut_131_2;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        ((ke) (Object) stackIn_132_0).c(stackIn_132_1, stackIn_132_2 != 0);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (3 != var5) {
                            statePc = 137;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        sm.a((byte) -65, se.h(25144));
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        ca.field_wb.d(-8622);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        am.field_a.l((byte) 101);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        cl.field_B.f((byte) -63);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        h.field_d.j(-114);
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (!am.field_c) {
                            statePc = 174;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (!uh.field_b) {
                            statePc = 166;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var3_int = 1;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (kf.field_G != null) {
                            statePc = 164;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        stackOut_158_0 = 92;
                        stackIn_159_0 = stackOut_158_0;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (ea.d((byte) stackIn_159_0)) {
                            statePc = 164;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = 1;
                        stackIn_165_0 = stackOut_162_0;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        stackOut_164_0 = 0;
                        stackIn_165_0 = stackOut_164_0;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var4 = stackIn_165_0;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var5 = kf.field_I.b(2, true) ? 1 : 0;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (var5 != 0) {
                            statePc = 173;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        stackOut_168_0 = 50;
                        stackIn_169_0 = stackOut_168_0;
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (!ab.c((byte) stackIn_169_0)) {
                            statePc = 173;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        var5 = kf.field_I.e(false) ? 1 : 0;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (!uh.field_b) {
                            statePc = 178;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        var3_int = 1;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        stackOut_178_0 = uh.field_b;
                        stackIn_179_0 = stackOut_178_0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (!stackIn_179_0) {
                            statePc = 257;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        stackOut_180_0 = mn.field_c;
                        stackIn_181_0 = stackOut_180_0;
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (stackIn_181_0) {
                            statePc = 257;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        stackOut_184_0 = wk.field_i;
                        stackIn_185_0 = stackOut_184_0;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (!stackIn_185_0) {
                            statePc = 190;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        if (!fm.field_b) {
                            statePc = 195;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (!jg.field_i) {
                            statePc = 195;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        var3_int = 0;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        ka.a(var3_int != 0, -3051);
                        if (fa.field_n) {
                            statePc = 198;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        boolean discarded$7 = ce.field_C.b(2, var4 != 0);
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        if (fm.field_b) {
                            statePc = 202;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        ph.a(180, 320, false, var4 != 0);
                        if (jg.field_i) {
                            statePc = 205;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        var4 = 0;
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        boolean discarded$8 = kf.field_I.b(2, var4 != 0);
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        if (!ab.c((byte) -123)) {
                            statePc = 257;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        stackOut_208_0 = null;
                        stackIn_209_0 = stackOut_208_0;
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        if (stackIn_209_0 == (Object) (Object) hh.field_a) {
                            statePc = 216;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        stackOut_212_0 = -1;
                        stackIn_213_0 = stackOut_212_0;
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (stackIn_213_0 <= (ef.field_N ^ -1)) {
                            statePc = 218;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        stackOut_216_0 = 1;
                        stackIn_219_0 = stackOut_216_0;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        stackOut_218_0 = 0;
                        stackIn_219_0 = stackOut_218_0;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        var5 = stackIn_219_0;
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        if (fm.field_b) {
                            statePc = 223;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        var5 = nk.field_i ? 1 : 0;
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        if (!fa.field_n) {
                            statePc = 226;
                        } else {
                            statePc = 225;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        var5 = og.field_ib ? 1 : 0;
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        if (param1) {
                            statePc = 240;
                        } else {
                            statePc = 227;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 229;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        if (!fm.field_b) {
                            statePc = 236;
                        } else {
                            statePc = 228;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        if (!gd.a(13, 12, 15, (byte) -83)) {
                            statePc = 240;
                        } else {
                            statePc = 231;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        if (var5 == 0) {
                            statePc = 240;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 239;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        boolean discarded$9 = ig.a(12, 15, 13, (byte) 69);
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 239;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        if (!fa.field_n) {
                            statePc = 248;
                        } else {
                            statePc = 241;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        stackOut_241_0 = var4;
                        stackIn_242_0 = stackOut_241_0;
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        if (stackIn_242_0 == 0) {
                            statePc = 248;
                        } else {
                            statePc = 243;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        boolean discarded$10 = ce.field_C.e(false);
                        statePc = 246;
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        if (!fm.field_b) {
                            statePc = 256;
                        } else {
                            statePc = 249;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 252;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        stackOut_249_0 = var4;
                        stackIn_250_0 = stackOut_249_0;
                        statePc = 250;
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 252;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        if (stackIn_250_0 == 0) {
                            statePc = 256;
                        } else {
                            statePc = 251;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        statePc = 253;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        boolean discarded$11 = kf.field_I.e(false);
                        statePc = 254;
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        statePc = 256;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        if (!uh.field_b) {
                            statePc = 260;
                        } else {
                            statePc = 258;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        gn.b(-29550);
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        if (ab.e(param0 + -58860) == 0) {
                            statePc = 264;
                        } else {
                            statePc = 262;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 263;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 263;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        we.a((byte) 68);
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        if (hh.field_a == null) {
                            statePc = 270;
                        } else {
                            statePc = 266;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 269;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        stackOut_266_0 = -1;
                        stackIn_267_0 = stackOut_266_0;
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 269;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        if (stackIn_267_0 <= (ef.field_N ^ -1)) {
                            statePc = 272;
                        } else {
                            statePc = 268;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 271;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        statePc = 270;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 271;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 271;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        stackOut_270_0 = 1;
                        stackIn_273_0 = stackOut_270_0;
                        statePc = 273;
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 271;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        stackOut_272_0 = 0;
                        stackIn_273_0 = stackOut_272_0;
                        statePc = 273;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        var5 = stackIn_273_0;
                        if (!fm.field_b) {
                            statePc = 275;
                        } else {
                            statePc = 274;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        var5 = nk.field_i ? 1 : 0;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        if (fa.field_n) {
                            statePc = 278;
                        } else {
                            statePc = 276;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        statePc = 279;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        var5 = og.field_ib ? 1 : 0;
                        statePc = 279;
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        if (var5 != 0) {
                            statePc = 286;
                        } else {
                            statePc = 280;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        if (-1 > (ef.field_N ^ -1)) {
                            statePc = 285;
                        } else {
                            statePc = 281;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 284;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        statePc = 283;
                        continue stateLoop;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 284;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 284;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        statePc = 292;
                        continue stateLoop;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 284;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        ef.field_N = ef.field_N - 1;
                        statePc = 292;
                        continue stateLoop;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        if ((ef.field_N ^ -1) > (dl.field_M ^ -1)) {
                            statePc = 291;
                        } else {
                            statePc = 287;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 290;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        statePc = 289;
                        continue stateLoop;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 290;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 290;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        statePc = 292;
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 290;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        ef.field_N = ef.field_N + 1;
                        statePc = 292;
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        var6 = dl.field_M * dl.field_M;
                        var7 = -(ef.field_N * ef.field_N) + var6;
                        var8 = ea.field_p + 120 * var7 / var6;
                        statePc = 293;
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        ij.a(var8, -32);
                        if (ue.field_b != hh.field_a) {
                            statePc = 329;
                        } else {
                            statePc = 294;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        stackOut_294_0 = param0;
                        stackIn_295_0 = stackOut_294_0;
                        statePc = 295;
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        if (ab.e(stackIn_295_0 + -58860) != 0) {
                            statePc = 329;
                        } else {
                            statePc = 296;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 300;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        statePc = 298;
                        continue stateLoop;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 300;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 300;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        if (!am.field_c) {
                            statePc = 320;
                        } else {
                            statePc = 299;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_298) {
                        caughtException = stateCaught_298;
                        statePc = 303;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        statePc = 301;
                        continue stateLoop;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 303;
                        continue stateLoop;
                    }
                }
                case 300: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_300) {
                        caughtException = stateCaught_300;
                        statePc = 303;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        db.field_d = false;
                        if (kf.field_I == null) {
                            statePc = 311;
                        } else {
                            statePc = 302;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_301) {
                        caughtException = stateCaught_301;
                        statePc = 307;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        statePc = 304;
                        continue stateLoop;
                    } catch (Throwable stateCaught_302) {
                        caughtException = stateCaught_302;
                        statePc = 307;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_303) {
                        caughtException = stateCaught_303;
                        statePc = 307;
                        continue stateLoop;
                    }
                }
                case 304: {
                    try {
                        stackOut_304_0 = -39;
                        stackIn_305_0 = stackOut_304_0;
                        statePc = 305;
                        continue stateLoop;
                    } catch (Throwable stateCaught_304) {
                        caughtException = stateCaught_304;
                        statePc = 307;
                        continue stateLoop;
                    }
                }
                case 305: {
                    try {
                        if (stackIn_305_0 < (kf.field_I.field_hb ^ -1)) {
                            statePc = 310;
                        } else {
                            statePc = 306;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_305) {
                        caughtException = stateCaught_305;
                        statePc = 309;
                        continue stateLoop;
                    }
                }
                case 306: {
                    try {
                        statePc = 308;
                        continue stateLoop;
                    } catch (Throwable stateCaught_306) {
                        caughtException = stateCaught_306;
                        statePc = 309;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_307) {
                        caughtException = stateCaught_307;
                        statePc = 309;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        statePc = 311;
                        continue stateLoop;
                    } catch (Throwable stateCaught_308) {
                        caughtException = stateCaught_308;
                        statePc = 309;
                        continue stateLoop;
                    }
                }
                case 309: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        ue.field_b = dn.field_p[kf.field_I.field_g.field_l];
                        statePc = 311;
                        continue stateLoop;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        if (fa.field_n) {
                            statePc = 314;
                        } else {
                            statePc = 312;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 313;
                        continue stateLoop;
                    }
                }
                case 312: {
                    try {
                        statePc = 315;
                        continue stateLoop;
                    } catch (Throwable stateCaught_312) {
                        caughtException = stateCaught_312;
                        statePc = 313;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 314: {
                    try {
                        ue.field_b = dn.field_p[ce.field_C.field_g.field_l];
                        statePc = 315;
                        continue stateLoop;
                    } catch (Throwable stateCaught_314) {
                        caughtException = stateCaught_314;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 315: {
                    try {
                        if (uh.field_b) {
                            statePc = 318;
                        } else {
                            statePc = 316;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_315) {
                        caughtException = stateCaught_315;
                        statePc = 317;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        stackOut_316_0 = 1;
                        stackIn_319_0 = stackOut_316_0;
                        statePc = 319;
                        continue stateLoop;
                    } catch (Throwable stateCaught_316) {
                        caughtException = stateCaught_316;
                        statePc = 317;
                        continue stateLoop;
                    }
                }
                case 317: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_317) {
                        caughtException = stateCaught_317;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 318: {
                    try {
                        stackOut_318_0 = 0;
                        stackIn_319_0 = stackOut_318_0;
                        statePc = 319;
                        continue stateLoop;
                    } catch (Throwable stateCaught_318) {
                        caughtException = stateCaught_318;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 319: {
                    try {
                        wg.field_f = stackIn_319_0 != 0;
                        statePc = 329;
                        continue stateLoop;
                    } catch (Throwable stateCaught_319) {
                        caughtException = stateCaught_319;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 320: {
                    try {
                        if (!uh.field_b) {
                            statePc = 326;
                        } else {
                            statePc = 321;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_320) {
                        caughtException = stateCaught_320;
                        statePc = 325;
                        continue stateLoop;
                    }
                }
                case 321: {
                    try {
                        statePc = 323;
                        continue stateLoop;
                    } catch (Throwable stateCaught_321) {
                        caughtException = stateCaught_321;
                        statePc = 325;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_322) {
                        caughtException = stateCaught_322;
                        statePc = 325;
                        continue stateLoop;
                    }
                }
                case 323: {
                    try {
                        db.field_d = false;
                        wg.field_f = false;
                        ue.field_b = null;
                        statePc = 329;
                        continue stateLoop;
                    } catch (Throwable stateCaught_323) {
                        caughtException = stateCaught_323;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 325: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_325) {
                        caughtException = stateCaught_325;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 326: {
                    try {
                        db.field_d = true;
                        ue.field_b = tc.field_Tb;
                        wg.field_f = true;
                        statePc = 327;
                        continue stateLoop;
                    } catch (Throwable stateCaught_326) {
                        caughtException = stateCaught_326;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 327: {
                    try {
                        statePc = 329;
                        continue stateLoop;
                    } catch (Throwable stateCaught_327) {
                        caughtException = stateCaught_327;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_328) {
                        caughtException = stateCaught_328;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 329: {
                    try {
                        if (ue.field_b != hh.field_a) {
                            statePc = 332;
                        } else {
                            statePc = 330;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_329) {
                        caughtException = stateCaught_329;
                        statePc = 331;
                        continue stateLoop;
                    }
                }
                case 330: {
                    try {
                        statePc = 338;
                        continue stateLoop;
                    } catch (Throwable stateCaught_330) {
                        caughtException = stateCaught_330;
                        statePc = 331;
                        continue stateLoop;
                    }
                }
                case 331: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_331) {
                        caughtException = stateCaught_331;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 332: {
                    try {
                        vf.field_b = vf.field_b + 1;
                        if (30 > vf.field_b) {
                            statePc = 338;
                        } else {
                            statePc = 333;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_332) {
                        caughtException = stateCaught_332;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        vf.field_b = 0;
                        hh.field_a = ue.field_b;
                        qd.field_Nb = wg.field_f;
                        statePc = 334;
                        continue stateLoop;
                    } catch (Throwable stateCaught_333) {
                        caughtException = stateCaught_333;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 334: {
                    try {
                        statePc = 338;
                        continue stateLoop;
                    } catch (Throwable stateCaught_334) {
                        caughtException = stateCaught_334;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 335: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_335) {
                        caughtException = stateCaught_335;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 337: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw dh.a((Throwable) (Object) var3, "client.O(" + param0 + 44 + param1 + 41);
                }
                case 338: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          client.j((byte) -56);
          vd.c((byte) 101);
          vj.b((byte) 79);
          bj.a(112);
          km.c(710);
          n.b(128);
          ml.a((byte) -33);
          wh.a(true);
          jb.a((byte) -9);
          hn.b(6);
          oh.b(false);
          wg.a(true);
          hm.b(64);
          hk.a();
          ji.a(127);
          th.a(122);
          bb.a(-117);
          wl.d(8);
          ik.b(78);
          jh.a(false);
          fe.a((byte) -108);
          ge.a(true);
          dm.a(121);
          hc.a((byte) 82);
          o.a(false);
          l.b(126);
          u.a(23358);
          hl.a(-21128);
          pc.a((byte) -46);
          sh.a((byte) -105);
          lj.a(89);
          jf.a(-114);
          ie.a((byte) -120);
          eh.a(24744);
          cb.b(12623);
          ql.b(-100);
          ri.a((byte) -91);
          dd.b((byte) 115);
          im.a(0);
          ne.a((byte) 0);
          nh.a((byte) -73);
          qk.c(-11657);
          pl.b(113);
          en.f();
          ui.b(31158);
          ia.f();
          ke.l(126);
          qc.a(false);
          ah.a(8);
          gn.a(0);
          ul.b((byte) -75);
          lk.g(36);
          bh.b(25189);
          wa.a(18);
          ch.a(78);
          d.a(36);
          rc.a(-120);
          tm.a(103);
          j.a(true);
          w.f((byte) 77);
          ve.h((byte) 116);
          nk.a(-121);
          tj.e(-18263);
          gg.c(0);
          be.a(-106);
          vh.a(true);
          p.a(110);
          ed.b(-96);
          rg.a(-114);
          ka.h((byte) 102);
          wj.s(0);
          qn.n((byte) 89);
          ph.m((byte) 24);
          gk.p(15);
          tf.b(true);
          lg.f((byte) 1);
          he.i(0);
          cn.j(3);
          jg.b((byte) 101);
          c.a(23302);
          mc.a(0);
          ng.a(-61);
          je.b(23369);
          oa.b(-1);
          ad.a((byte) -67);
          lf.a(-13495);
          of.a((byte) 91);
          am.a(119);
          lc.a(-27983);
          mm.a();
          ub.b((byte) -32);
          nd.a(3);
          pd.a((byte) -120);
          h.b((byte) -128);
          uc.a(true);
          rn.a(-117);
          ll.a(108);
          qd.f(77);
          nm.g(48);
          ha.f(3);
          jd.e(32);
          gb.e(-2);
          s.i((byte) -94);
          pf.a((byte) -103);
          mg.f(256);
          ak.a((byte) -112);
          ec.a((byte) 102);
          sk.e(-28610);
          vk.a((byte) -93);
          ic.a(-18551);
          vf.a(27067);
          om.a(false);
          kb.a(-109);
          jk.a((byte) -91);
          hh.a(-9724);
          cc.a((byte) -94);
          e.a(-22811);
          pe.a(-1);
          fh.b(0);
          eb.b(92);
          oi.a(2);
          sa.c((byte) -82);
          uk.c(127);
          sl.a((byte) 110);
          uf.h((byte) 120);
          nn.a(14925);
          gf.a(2);
          v.a(-66);
          gh.a(98);
          fm.a(true);
          ee.a((byte) -78);
          hg.a((byte) 126);
          rf.a(false);
          in.a(123);
          vm.a(121);
          eg.a(10140);
          pm.a(62);
          mf.i(-17690);
          gd.a((byte) -118);
          ok.d();
          aj.b(0);
          bk.e(15338);
          qb.d(112);
          ab.d(1);
          pj.h((byte) 106);
          kh.b(-1643605936);
          el.b(true);
          le.b(true);
          hf.b(12741);
          ci.a(-27513);
          sf.f((byte) -126);
          pg.a((byte) 126);
          ib.m(-30);
          a.a(-1);
          qg.a();
          va.c();
          oj.a(3805);
          dh.a((byte) -68);
          vg.a((byte) 91);
          rm.a(2);
          fc.a(38);
          aa.a(true);
          li.a(101);
          dk.b(16057);
          un.b((byte) 86);
          oc.a(true);
          mk.a(false);
          if (param0 >= 75) {
            td.a();
            vl.a(true);
            kl.a(true);
            uj.a((byte) 111);
            mn.a(-117);
            kk.a((byte) -117);
            bc.b((byte) -102);
            al.a((byte) -100);
            qj.b((byte) 126);
            cf.a((byte) 126);
            ce.c(54);
            ma.e((byte) -79);
            t.l((byte) 94);
            bl.i(2);
            kf.h(116);
            rd.b((byte) -119);
            k.a(-5161);
            ih.b();
            ue.a((byte) -128);
            fl.a(29047);
            ga.a((byte) -52);
            cj.a(-48);
            ig.g((byte) 34);
            em.a((byte) 82);
            sm.a(30553);
            ac.g((byte) -17);
            me.c(0);
            la.a((byte) 92);
            fb.a((byte) 117);
            jj.a(false);
            we.b((byte) -37);
            db.a((byte) 91);
            dn.d(72);
            wf.f(-119);
            gi.a(79);
            dc.a(true);
            qe.a(-20007);
            kj.a();
            fj.a(25988);
            cg.a(124);
            bn.a((byte) 92);
            wd.a(1);
            de.g(-121);
            og.i((byte) 109);
            rk.j(81);
            ca.l(104);
            df.a(1);
            qi.f((byte) 117);
            g.a(-99);
            pa.h((byte) 47);
            dl.b(false);
            wm.c(18966);
            bg.a((byte) 22);
            md.f((byte) 106);
            ai.a(-59);
            b.a(-109);
            tc.h((byte) 105);
            hb.e(-102);
            da.a((byte) -121);
            rb.a(573767765);
            qf.c(119);
            pn.l(33);
            oe.b(true);
            vb.j(-20);
            ea.b((byte) -37);
            fn.b(0);
            mb.a(false);
            se.g(11344);
            id.c(true);
            si.e(0);
            uh.b((byte) 73);
            vi.f((byte) 46);
            qm.a(2);
            ua.e(8);
            sc.b(false);
            hj.a();
            wi.a(0);
            cm.a(1714134600);
            dg.a(8);
            kc.a(93);
            kn.a(-1);
            sg.a(3);
            ug.a(-21771);
            fk.c(8);
            on.a((byte) 6);
            di.c(87);
            gm.d(38);
            tg.a(false);
            ef.g(0);
            wb.e(-78);
            cl.c((byte) -39);
            pb.a((byte) 78);
            lb.a(-19893);
            f.c(30061);
            ki.c((byte) 22);
            sb.a(13820388);
            ff.a(-45);
            ta.a(false);
            um.a(0);
            bf.a(-73);
            af.a((byte) -47);
            cd.a((byte) 121);
            dj.b(true);
            wc.a(2);
            ij.a(-85);
            wk.c(7751);
            qa.e(-30349);
            ob.a((byte) 121);
            ln.a((byte) -89);
            hd.a(22771);
            fa.c((byte) -74);
            sn.a((byte) 86);
            nf.a(-120);
            jm.e(62);
            te.e(0);
            ii.e(9369);
            tl.g((byte) -68);
            kd.e(127);
            re.g((byte) -112);
            i.b(28180);
            pk.c(-59);
            tb.a(20908);
            ba.d((byte) 127);
            jc.a(true);
            ((client) this).field_m = null;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var2 = decompiledCaughtException;
        throw dh.a((Throwable) (Object) var2, "client.J(" + param0 + 41);
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        int var3 = 0;
        ck var4_ref = null;
        int var4 = 0;
        int var5_int = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_20_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_30_0 = 0;
        boolean stackIn_77_0 = false;
        ck stackIn_101_0 = null;
        int stackIn_105_0 = 0;
        boolean stackIn_113_0 = false;
        int stackIn_119_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_122_0 = 0;
        ke stackIn_122_1 = null;
        int stackIn_123_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        boolean stackIn_142_0 = false;
        int stackIn_163_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_19_0 = false;
        boolean stackOut_23_0 = false;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        boolean stackOut_76_0 = false;
        ck stackOut_100_0 = null;
        int stackOut_104_0 = 0;
        boolean stackOut_112_0 = false;
        int stackOut_116_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_121_0 = 0;
        ke stackOut_121_1 = null;
        int stackOut_122_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        boolean stackOut_141_0 = false;
        int stackOut_162_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_165_0 = 0;
        boolean stackOut_165_1 = false;
        int stackOut_167_0 = 0;
        int stackOut_167_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = ne.d(-86);
                        if (!ta.a((byte) -56)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        jf.a(var2_ref, cd.a(param0 ^ 8512), -6351);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (!sh.field_j) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        cn.a(true, var2_ref);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        if (!se.i(-1)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        qi.a(100.0f, -81, bg.field_c);
                        cn.a(true, var2_ref);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        qn.a(kd.field_t, qm.field_c, (byte) -109);
                        if (kf.field_G != null) {
                            statePc = 29;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 111;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (ea.d((byte) stackIn_16_0)) {
                            statePc = 29;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = fm.field_b;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!stackIn_20_0) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = jg.field_i;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = 1;
                        stackIn_30_0 = stackOut_27_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3 = stackIn_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (0 == rb.field_e) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ca.field_kb = ak.field_d;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-2 > (ca.field_kb ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        jb.field_a = false;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        sg.field_b.a();
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((rb.field_e ^ -1) == -1) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ai.e((byte) 84);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (kf.field_I == null) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (null != ce.field_C) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (1 < ca.field_kb) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        rb.field_e = rb.field_e + 1;
                        if (jb.field_a) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((ca.field_kb ^ -1) < (rb.field_e ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (1 >= ca.field_kb) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (rb.field_e < ca.field_kb) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var4_ref = pa.field_U;
                        pa.field_U = sg.field_b;
                        jb.field_a = true;
                        rb.field_e = 0;
                        sg.field_b = var4_ref;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        le.field_m.a((byte) -113);
                        pa.field_U.e(0, 0);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (null != kf.field_I) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (ce.field_C != null) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (am.field_c) {
                            statePc = 111;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = uh.field_b;
                        stackIn_77_0 = stackOut_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (!stackIn_77_0) {
                            statePc = 82;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        kf.field_G.a(false);
                        var4 = 0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (null != pd.field_d) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var4 = 1;
                        pd.field_d.c((byte) -75);
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (h.field_d == null) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var4 = 1;
                        h.field_d.h((byte) 99);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (null == cl.field_B) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        cl.field_B.b((byte) -48);
                        var4 = 1;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (null == am.field_a) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        am.field_a.i(123);
                        var4 = 1;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (null == ca.field_wb) {
                            statePc = 95;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        ca.field_wb.d((byte) 45);
                        var4 = 1;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (f.field_s != null) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        f.field_s.c(2);
                        var4 = 1;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (!gi.field_b) {
                            statePc = 111;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackOut_100_0 = hh.field_a;
                        stackIn_101_0 = stackOut_100_0;
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
                        if (stackIn_101_0 != ue.field_b) {
                            statePc = 111;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackOut_104_0 = var4;
                        stackIn_105_0 = stackOut_104_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (stackIn_105_0 != 0) {
                            statePc = 111;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        pb.a(390);
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (!fm.field_b) {
                            statePc = 118;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = jg.field_i;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (!stackIn_113_0) {
                            statePc = 118;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        stackOut_116_0 = 1;
                        stackIn_119_0 = stackOut_116_0;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = 0;
                        stackIn_119_0 = stackOut_118_0;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var4 = stackIn_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackOut_120_0 = 88;
                        stackIn_131_0 = stackOut_120_0;
                        stackIn_121_0 = stackOut_120_0;
                        if (var4 != 0) {
                            statePc = 131;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackOut_121_0 = stackIn_121_0;
                        stackOut_121_1 = kf.field_G;
                        stackIn_122_0 = stackOut_121_0;
                        stackIn_122_1 = stackOut_121_1;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackOut_122_0 = stackIn_122_0;
                        stackIn_131_0 = stackOut_122_0;
                        stackIn_123_0 = stackOut_122_0;
                        if (stackIn_122_1 != null) {
                            statePc = 131;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = stackIn_123_0;
                        stackIn_125_0 = stackOut_123_0;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = stackIn_125_0;
                        stackOut_125_1 = -128;
                        stackIn_126_0 = stackOut_125_0;
                        stackIn_126_1 = stackOut_125_1;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = stackIn_126_0;
                        stackIn_131_0 = stackOut_126_0;
                        stackIn_127_0 = stackOut_126_0;
                        if (!cb.a((byte) stackIn_126_1)) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = stackIn_127_0;
                        stackIn_129_0 = stackOut_127_0;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = stackIn_129_0;
                        stackOut_129_1 = 1;
                        stackIn_132_0 = stackOut_129_0;
                        stackIn_132_1 = stackOut_129_1;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = stackIn_131_0;
                        stackOut_131_1 = 0;
                        stackIn_132_0 = stackOut_131_0;
                        stackIn_132_1 = stackOut_131_1;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        tf.a((byte) stackIn_132_0, stackIn_132_1 != 0);
                        if (var4 != 0) {
                            statePc = 135;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        da.a(false, cb.a((byte) -128));
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (param0 == 320) {
                            statePc = 140;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        field_B = null;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (am.field_c) {
                            statePc = 145;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        stackOut_141_0 = uh.field_b;
                        stackIn_142_0 = stackOut_141_0;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (!stackIn_142_0) {
                            statePc = 154;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (kf.field_G != null) {
                            statePc = 150;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        hk.d(0, 0, 640, 480);
                        kf.field_G.f(-26325);
                        if (f.field_s == null) {
                            statePc = 154;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        f.field_s.c(2);
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (cn.f((byte) 99)) {
                            statePc = 157;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        hk.a(320 + -(wk.b(3) / 2) - 34, -(pj.d(20) / 2) + 240 - 24, wk.b(3) + 68, pj.d(126) - -48, 0, 200);
                        vk.a(pj.d(param0 + -356) - -60, (byte) 50, a.field_n, wk.b(3) + 80, 240 - pj.d(-5) / 2 + -30, 320 - wk.b(3) / 2 - 40);
                        uh.b(32659);
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (ai.f((byte) 94)) {
                            statePc = 169;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (!pk.d(67)) {
                            statePc = 172;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = 112;
                        stackIn_167_0 = stackOut_162_0;
                        stackIn_163_0 = stackOut_162_0;
                        if (cl.field_v != null) {
                            statePc = 167;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackOut_163_0 = stackIn_163_0;
                        stackIn_165_0 = stackOut_163_0;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        stackOut_165_0 = stackIn_165_0;
                        stackOut_165_1 = qc.field_N;
                        stackIn_168_0 = stackOut_165_0;
                        stackIn_168_1 = stackOut_165_1 ? 1 : 0;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        stackOut_167_0 = stackIn_167_0;
                        stackOut_167_1 = 1;
                        stackIn_168_0 = stackOut_167_0;
                        stackIn_168_1 = stackOut_167_1;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        t.a(stackIn_168_0, stackIn_168_1 != 0);
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        hk.a(-34 + -(vd.a(480) / 2) + 320, -24 + (-(dj.a(110) / 2) + 240), 68 + vd.a(480), 48 + dj.a(110), 0, 200);
                        vk.a(dj.a(113) - -60, (byte) 50, a.field_n, 80 + vd.a(480), 210 + -(dj.a(108) / 2), 320 - (vd.a(param0 ^ 160) / 2 - -40));
                        cl.a(true);
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (gb.field_Ob != gb.field_Vb) {
                            statePc = 175;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        var5_int = 256 * rf.field_f / 16;
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if (-1 > (var5_int ^ -1)) {
                            statePc = 179;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        hk.a(0, 0, hk.field_j, hk.field_i, 0, var5_int);
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (2 <= te.field_p) {
                            statePc = 183;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        var5 = Runtime.getRuntime().totalMemory() / 1024L;
                        var7 = -(Runtime.getRuntime().freeMemory() / 1024L) + var5;
                        se.field_S.a("FPS: " + jf.field_c, 12, 38, 16777215, 1);
                        se.field_S.a(var7 + "/" + var5 + " kB", 12, 52, 16777215, 1);
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        mf.a(1, 0, 0, var2_ref);
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 186: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dh.a((Throwable) (Object) var2, "client.F(" + param0 + 41);
                }
                case 187: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] stackIn_10_0 = null;
        ei[] stackIn_14_0 = null;
        Object stackIn_25_0 = null;
        boolean[] stackOut_9_0 = null;
        ei[] stackOut_13_0 = null;
        Object stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (8 <= var2_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        pg.field_a[var2_int] = false;
                        ah.field_b[var2_int] = false;
                        kd.field_s[0][var2_int] = 9 * kd.field_s[0][var2_int] / 10;
                        kd.field_s[1][var2_int] = 9 * kd.field_s[1][var2_int] / 10;
                        var2_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.i((byte) 51);
                        var2_int = 0;
                        if (param0 == 11978) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        if (8 <= var2_int) {
                            statePc = 54;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = pg.field_a;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0[var2_int]) {
                            statePc = 23;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = wf.field_l;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0[var2_int] != null) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        wf.field_l[var2_int].f(0);
                        if (wf.field_l[var2_int].a((byte) 78)) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        wf.field_l[var2_int] = null;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (ah.field_b[var2_int]) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = null;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == (Object) (Object) ik.field_c[var2_int]) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ik.field_c[var2_int].g(en.field_o / 50);
                        ik.field_c[var2_int] = null;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (sk.field_a[0][var2_int] == null) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3 = kd.field_s[0][var2_int];
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (0 != var3) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        sk.field_a[0][var2_int].g(en.field_o / 50);
                        sk.field_a[0][var2_int] = null;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        sk.field_a[0][var2_int].e(en.field_o / 50, pb.field_d * var3);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null != sk.field_a[1][var2_int]) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3 = kd.field_s[1][var2_int];
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (0 != var3) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        sk.field_a[1][var2_int].g(en.field_o / 50);
                        sk.field_a[1][var2_int] = null;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        sk.field_a[1][var2_int].e(en.field_o / 50, var3 * pb.field_d);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var2_int++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dh.a((Throwable) (Object) var2, "client.D(" + param0 + 41);
                }
                case 54: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ((client) this).a(5, 94, 31, 0, 1, 12, 2, param0);
          en.a(22050, true, 10);
          km.field_z = en.a(lf.field_e, (java.awt.Component) (Object) jh.field_b, 0, 22050);
          cj.field_b = en.a(lf.field_e, (java.awt.Component) (Object) jh.field_b, 1, 1024);
          dg.field_c = new mi();
          cj.field_b.b((ol) (Object) dg.field_c);
          sh.field_a = new mi();
          km.field_z.b((ol) (Object) sh.field_a);
          ((client) this).a(false, true, true, false, true, true, false);
          mk.field_c[66] = 2;
          mk.field_c[74] = 1;
          mk.field_c[64] = -2;
          mk.field_c[68] = 1;
          mk.field_c[10] = -1;
          mk.field_c[70] = 1;
          mk.field_c[73] = 1;
          mk.field_c[58] = -2;
          mk.field_c[9] = -1;
          mk.field_c[62] = 2;
          mk.field_c[72] = 1;
          bc.field_D = hm.field_e;
          mk.field_c[71] = 1;
          mk.field_c[63] = -1;
          mk.field_c[59] = -2;
          mk.field_c[65] = 1;
          mk.field_c[75] = -1;
          mk.field_c[76] = 1;
          mk.field_c[69] = 1;
          ik.field_h = dj.field_T;
          uc.field_a = true;
          mg.field_Ob = fl.field_d;
          mk.field_c[61] = -2;
          mk.field_c[67] = -1;
          pa.field_U = new ck(640, 480);
          sg.field_b = new ck(640, 480);
          ak.field_d = 1;
          rb.field_e = 0;
          ca.field_kb = 1;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var2 = decompiledCaughtException;
        throw dh.a((Throwable) (Object) var2, "client.G(" + param0 + 41);
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5, byte param6) {
        int var7_int = 0;
        vj var8 = null;
        long var9 = 0L;
        Object var11 = null;
        ve var12 = null;
        int var13 = 0;
        int var14 = 0;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        w var18 = null;
        int var18_int = 0;
        w var19 = null;
        w var20 = null;
        w var21 = null;
        int var22_int = 0;
        w var22 = null;
        w var23 = null;
        w var23_ref = null;
        w var24 = null;
        w var25 = null;
        w var26 = null;
        w var27 = null;
        w var28 = null;
        w var29 = null;
        w var30 = null;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        int var33_int = 0;
        int var34_int = 0;
        String var34 = null;
        String var34_ref = null;
        ck var35 = null;
        String var35_ref = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        nm stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        nm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        nm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        ve stackIn_11_0 = null;
        w stackIn_11_1 = null;
        w stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        ve stackIn_12_0 = null;
        w stackIn_12_1 = null;
        w stackIn_12_2 = null;
        long stackIn_12_3 = 0L;
        ve stackIn_13_0 = null;
        w stackIn_13_1 = null;
        w stackIn_13_2 = null;
        long stackIn_13_3 = 0L;
        w stackIn_13_4 = null;
        ve stackIn_30_0 = null;
        w stackIn_30_1 = null;
        w stackIn_30_2 = null;
        long stackIn_30_3 = 0L;
        ve stackIn_31_0 = null;
        w stackIn_31_1 = null;
        w stackIn_31_2 = null;
        long stackIn_31_3 = 0L;
        ve stackIn_32_0 = null;
        w stackIn_32_1 = null;
        w stackIn_32_2 = null;
        long stackIn_32_3 = 0L;
        w stackIn_32_4 = null;
        int stackIn_36_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_89_0 = 0;
        ck[] stackIn_90_0 = null;
        ck[] stackIn_91_0 = null;
        ck[] stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        ck[] stackIn_98_0 = null;
        ck[] stackIn_99_0 = null;
        ck[] stackIn_100_0 = null;
        ck[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        String stackIn_152_0 = null;
        String stackIn_167_0 = null;
        String stackIn_177_0 = null;
        String stackIn_183_0 = null;
        nm stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        nm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        nm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        ve stackOut_10_0 = null;
        w stackOut_10_1 = null;
        w stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        ve stackOut_12_0 = null;
        w stackOut_12_1 = null;
        w stackOut_12_2 = null;
        long stackOut_12_3 = 0L;
        w stackOut_12_4 = null;
        ve stackOut_11_0 = null;
        w stackOut_11_1 = null;
        w stackOut_11_2 = null;
        long stackOut_11_3 = 0L;
        w stackOut_11_4 = null;
        ve stackOut_29_0 = null;
        w stackOut_29_1 = null;
        w stackOut_29_2 = null;
        long stackOut_29_3 = 0L;
        ve stackOut_31_0 = null;
        w stackOut_31_1 = null;
        w stackOut_31_2 = null;
        long stackOut_31_3 = 0L;
        w stackOut_31_4 = null;
        ve stackOut_30_0 = null;
        w stackOut_30_1 = null;
        w stackOut_30_2 = null;
        long stackOut_30_3 = 0L;
        w stackOut_30_4 = null;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        ck[] stackOut_89_0 = null;
        ck[] stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        ck[] stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        ck[] stackOut_97_0 = null;
        ck[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        ck[] stackOut_98_0 = null;
        ck[] stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        String stackOut_166_0 = null;
        String stackOut_165_0 = null;
        String stackOut_176_0 = null;
        String stackOut_175_0 = null;
        String stackOut_173_0 = null;
        String stackOut_182_0 = null;
        String stackOut_181_0 = null;
        Object stackOut_151_0 = null;
        String stackOut_150_0 = null;
        Object stackOut_148_0 = null;
        L0: {
          var41 = field_A ? 1 : 0;
          stackOut_0_0 = gf.field_c;
          stackOut_0_1 = 2 * (kf.field_O - -2);
          stackOut_0_2 = (kf.field_O * 4 + 8) * param0;
          stackOut_0_3 = -15230;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (ki.field_w != gf.field_c) {
            stackOut_2_0 = (nm) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (nm) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        L1: {
          var7_int = ((nm) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, 2, param2) ? 1 : 0;
          var8 = gf.field_c.field_Ob.field_M;
          if (param6 <= -48) {
            break L1;
          } else {
            client.j((byte) 82);
            break L1;
          }
        }
        var9 = ik.a(4);
        var11 = null;
        var12 = (ve) (Object) var8.c((byte) -101);
        L2: while (true) {
          if (null == var12) {
            return;
          } else {
            L3: {
              var13 = 0;
              if (null != var12.field_M) {
                break L3;
              } else {
                stackOut_9_0 = param3;
                stackOut_9_1 = param1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                L4: {
                  var14 = stackIn_10_0 | stackIn_10_1;
                  var12.field_Pb = new w(0L, fc.field_f);
                  var12.a(var12.field_Pb, -16834);
                  var12.field_Pb.field_X = 1;
                  var12.field_Bc = new w(0L, gg.field_G);
                  var12.a(var12.field_Bc, -16834);
                  var12.field_Dc = new w(0L, fc.field_f);
                  var12.a(var12.field_Dc, -16834);
                  var12.field_Dc.field_ub = 0;
                  var12.field_ec = new w(0L, fc.field_f);
                  var12.a(var12.field_ec, -16834);
                  var12.field_ec.field_ub = 0;
                  var12.field_jc = new w(0L, gg.field_G);
                  var12.a(var12.field_jc, -16834);
                  var12.field_jc.field_X = 2;
                  stackOut_10_0 = (ve) var12;
                  stackOut_10_1 = null;
                  stackOut_10_2 = null;
                  stackOut_10_3 = 0L;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  if (pd.field_a) {
                    stackOut_12_0 = (ve) (Object) stackIn_12_0;
                    stackOut_12_1 = null;
                    stackOut_12_2 = null;
                    stackOut_12_3 = stackIn_12_3;
                    stackOut_12_4 = fc.field_f;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    break L4;
                  } else {
                    stackOut_11_0 = (ve) (Object) stackIn_11_0;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = stackIn_11_3;
                    stackOut_11_4 = gg.field_G;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    break L4;
                  }
                }
                L5: {
                  new w(stackIn_13_3, stackIn_13_4);
                  stackIn_13_0.field_zc = stackIn_13_1;
                  var12.a(var12.field_zc, -16834);
                  var12.field_fc = new w[j.field_b];
                  var12.field_pc = new w(0L, (w) null);
                  if ((var14 & 1 << u.field_f ^ -1) != -1) {
                    var12.field_zc.a(var12.field_pc, -16834);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var12.field_Ac = new w(0L, (w) null);
                  if (-1 != (var14 & 1 << u.field_b ^ -1)) {
                    var12.field_zc.a(var12.field_Ac, -16834);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var12.field_Tb = new w(0L, (w) null);
                  if ((1 << rf.field_a & var14 ^ -1) == -1) {
                    break L7;
                  } else {
                    var12.field_zc.a(var12.field_Tb, -16834);
                    break L7;
                  }
                }
                L8: {
                  var12.field_Fc = new w(0L, (w) null);
                  if ((1 << ul.field_f & var14 ^ -1) != -1) {
                    var12.field_zc.a(var12.field_Fc, -16834);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var15 = var12.field_pc;
                var16 = var12.field_Fc;
                var12.field_Tb.field_W = 1;
                var17 = var12.field_Ac;
                var17.field_W = 1;
                var16.field_W = 1;
                var15.field_W = 1;
                var18_int = 0;
                L9: while (true) {
                  if ((j.field_b ^ -1) >= (var18_int ^ -1)) {
                    L10: {
                      stackOut_29_0 = (ve) var12;
                      stackOut_29_1 = null;
                      stackOut_29_2 = null;
                      stackOut_29_3 = 0L;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      stackIn_31_2 = stackOut_29_2;
                      stackIn_31_3 = stackOut_29_3;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      stackIn_30_2 = stackOut_29_2;
                      stackIn_30_3 = stackOut_29_3;
                      if (!pd.field_a) {
                        stackOut_31_0 = (ve) (Object) stackIn_31_0;
                        stackOut_31_1 = null;
                        stackOut_31_2 = null;
                        stackOut_31_3 = stackIn_31_3;
                        stackOut_31_4 = fc.field_f;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        stackIn_32_2 = stackOut_31_2;
                        stackIn_32_3 = stackOut_31_3;
                        stackIn_32_4 = stackOut_31_4;
                        break L10;
                      } else {
                        stackOut_30_0 = (ve) (Object) stackIn_30_0;
                        stackOut_30_1 = null;
                        stackOut_30_2 = null;
                        stackOut_30_3 = stackIn_30_3;
                        stackOut_30_4 = gg.field_G;
                        stackIn_32_0 = stackOut_30_0;
                        stackIn_32_1 = stackOut_30_1;
                        stackIn_32_2 = stackOut_30_2;
                        stackIn_32_3 = stackOut_30_3;
                        stackIn_32_4 = stackOut_30_4;
                        break L10;
                      }
                    }
                    new w(stackIn_32_3, stackIn_32_4);
                    stackIn_32_0.field_yc = stackIn_32_1;
                    var12.a(var12.field_yc, -16834);
                    var12.field_yc.field_X = 2;
                    var12.field_Sb = new w(0L, gg.field_G);
                    var12.a(var12.field_Sb, -16834);
                    var12.field_Ec = new w(0L, df.field_ab);
                    var12.a(var12.field_Ec, -16834);
                    var12.field_bc = new w(0L, df.field_ab);
                    var12.a(var12.field_bc, -16834);
                    var12.field_sc = new w(0L, ua.field_H);
                    var12.a(var12.field_sc, -16834);
                    var12.d(-69);
                    var12.field_Yb = new w(0L, lj.field_c);
                    var13 = 1;
                    var12.a(var12.field_Yb, -16834);
                    break L3;
                  } else {
                    L11: {
                      var12.field_fc[var18_int] = new w(0L, (w) null);
                      if ((1 << var18_int + um.field_a & var14 ^ -1) == -1) {
                        break L11;
                      } else {
                        var12.field_zc.a(var12.field_fc[var18_int], -16834);
                        break L11;
                      }
                    }
                    var12.field_fc[var18_int].field_W = 1;
                    var18_int++;
                    continue L9;
                  }
                }
              }
            }
            L12: {
              if (var12.field_lc) {
                stackOut_35_0 = param3;
                stackIn_36_0 = stackOut_35_0;
                break L12;
              } else {
                stackOut_34_0 = param1;
                stackIn_36_0 = stackOut_34_0;
                break L12;
              }
            }
            var14 = stackIn_36_0;
            var12.field_Pb.field_Y = null;
            var12.field_Pb.field_N = 0;
            var15 = var12.field_Pb;
            var15.field_mb = 0;
            var12.field_Yb.field_Y = null;
            var12.field_Yb.field_N = 0;
            var16 = var12.field_Yb;
            var16.field_mb = 0;
            var12.field_Bc.field_Y = null;
            var12.field_Bc.field_N = 0;
            var17 = var12.field_Bc;
            var17.field_mb = 0;
            var12.field_Dc.field_Y = null;
            var18 = var12.field_Dc;
            var12.field_Dc.field_N = 0;
            var18.field_mb = 0;
            var12.field_ec.field_Y = null;
            var19 = var12.field_ec;
            var12.field_ec.field_N = 0;
            var19.field_mb = 0;
            var12.field_jc.field_Y = null;
            var20 = var12.field_jc;
            var12.field_jc.field_N = 0;
            var12.field_zc.field_Y = null;
            var20.field_mb = 0;
            var12.field_zc.field_N = 0;
            var21 = var12.field_zc;
            var21.field_mb = 0;
            var22_int = 0;
            L13: while (true) {
              if (j.field_b <= var22_int) {
                L14: {
                  var12.field_pc.field_I = null;
                  var12.field_pc.field_N = 0;
                  var22 = var12.field_pc;
                  var22.field_mb = 0;
                  var12.field_Fc.field_I = null;
                  var23 = var12.field_Fc;
                  var12.field_Fc.field_N = 0;
                  var12.field_Ac.field_I = null;
                  var23.field_mb = 0;
                  var24 = var12.field_Ac;
                  var12.field_Ac.field_N = 0;
                  var24.field_mb = 0;
                  var12.field_Tb.field_I = null;
                  var12.field_Tb.field_N = 0;
                  var25 = var12.field_Tb;
                  var25.field_mb = 0;
                  var12.field_yc.field_Y = null;
                  var12.field_yc.field_N = 0;
                  var26 = var12.field_yc;
                  var26.field_mb = 0;
                  var12.field_Sb.field_Y = null;
                  var12.field_Sb.field_N = 0;
                  var27 = var12.field_Sb;
                  var12.field_Ec.field_Y = null;
                  var27.field_mb = 0;
                  var12.field_Ec.field_N = 0;
                  var28 = var12.field_Ec;
                  var28.field_mb = 0;
                  var12.field_bc.field_Y = null;
                  var12.field_bc.field_N = 0;
                  var29 = var12.field_bc;
                  var12.field_sc.field_Y = null;
                  var29.field_mb = 0;
                  var12.field_sc.field_N = 0;
                  var30 = var12.field_sc;
                  var30.field_mb = 0;
                  var12.field_mb = gf.field_c.field_Ob.field_mb;
                  var31 = 0;
                  var32 = var12.field_Vb;
                  if (var12.i((byte) 126)) {
                    break L14;
                  } else {
                    L15: {
                      if (!var12.field_lc) {
                        L16: {
                          if (var12.field_gc) {
                            break L16;
                          } else {
                            if (!var12.field_Zb) {
                              if (!var12.field_Cc) {
                                var12.field_Pb.field_Y = pc.field_d;
                                break L15;
                              } else {
                                var12.field_Pb.field_Y = cd.field_l;
                                break L15;
                              }
                            } else {
                              break L16;
                            }
                          }
                        }
                        var12.field_Yb.field_Y = gb.field_ac;
                        break L15;
                      } else {
                        if ((var12.field_Nb ^ -1) > -1) {
                          L17: {
                            if (!var12.field_wc) {
                              break L17;
                            } else {
                              L18: {
                                if (var12.field_gc) {
                                  break L18;
                                } else {
                                  if (var12.field_Zb) {
                                    break L18;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              var12.field_Yb.field_Y = gb.field_ac;
                              break L15;
                            }
                          }
                          if (-3 != (var12.field_qc ^ -1)) {
                            var12.field_Pb.field_Y = ak.field_i;
                            break L15;
                          } else {
                            var12.field_Yb.field_Y = gd.field_h;
                            break L15;
                          }
                        } else {
                          var12.field_Pb.field_Y = uf.field_t;
                          break L15;
                        }
                      }
                    }
                    L19: {
                      if (null != var12.field_Yb.field_Y) {
                        var12.field_Yb.a(68, 0, var31, kf.field_O, 0);
                        break L19;
                      } else {
                        var12.field_Pb.a(68, 0, var31, kf.field_O, 0);
                        break L19;
                      }
                    }
                    L20: {
                      var12.field_Bc.field_Y = mm.a(var12.field_Bc.field_J, var32, 78);
                      var12.field_Bc.a(78, 0, var31, kf.field_O, 70);
                      if (!var12.field_Bc.field_jb) {
                        break L20;
                      } else {
                        if (!var12.field_Bc.field_Y.equals((Object) (Object) var32)) {
                          sl.field_g = var32;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      var12.field_Dc.field_Y = Integer.toString(var12.field_rc);
                      if (!var12.field_wc) {
                        var12.field_Dc.field_X = 1;
                        var12.field_Dc.a(48, 0, var31, kf.field_O, 150);
                        break L21;
                      } else {
                        var12.field_Dc.field_X = 2;
                        var12.field_ec.field_Y = "/" + var12.field_mc;
                        var33_int = (-var12.field_ec.field_J.a("/") + 348) / 2;
                        var12.field_Dc.a(var33_int - 150, 0, var31, kf.field_O, 150);
                        var12.field_ec.a(198 - var33_int, 0, var31, kf.field_O, var33_int);
                        break L21;
                      }
                    }
                    L22: {
                      var12.field_jc.field_Y = Integer.toString(var12.field_Ub);
                      var12.field_jc.a(48, 0, var31, kf.field_O, 200);
                      if (!pd.field_a) {
                        stackOut_78_0 = 200;
                        stackIn_79_0 = stackOut_78_0;
                        break L22;
                      } else {
                        stackOut_77_0 = 250;
                        stackIn_79_0 = stackOut_77_0;
                        break L22;
                      }
                    }
                    L23: {
                      var33_int = stackIn_79_0;
                      var12.field_zc.a(-2 + (-var33_int + 365), 0, var31, kf.field_O, var33_int);
                      var34_int = j.field_c;
                      if (0 != (var14 & 1 << u.field_f)) {
                        var35 = fj.field_a[var12.field_Wb];
                        var12.field_pc.field_I = var35;
                        var12.field_pc.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (var35.field_K - -j.field_c);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (0 != (var14 & 1 << u.field_b)) {
                        L25: {
                          L26: {
                            if (var12.field_gc) {
                              break L26;
                            } else {
                              if (!var12.field_Zb) {
                                stackOut_88_0 = 0;
                                stackIn_89_0 = stackOut_88_0;
                                break L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                          stackOut_87_0 = 1;
                          stackIn_89_0 = stackOut_87_0;
                          break L25;
                        }
                        L27: {
                          var36 = stackIn_89_0;
                          stackOut_89_0 = (ck[]) field_x;
                          stackIn_91_0 = stackOut_89_0;
                          stackIn_90_0 = stackOut_89_0;
                          if (var36 == 0) {
                            stackOut_91_0 = (ck[]) (Object) stackIn_91_0;
                            stackOut_91_1 = 0;
                            stackIn_92_0 = stackOut_91_0;
                            stackIn_92_1 = stackOut_91_1;
                            break L27;
                          } else {
                            stackOut_90_0 = (ck[]) (Object) stackIn_90_0;
                            stackOut_90_1 = 1;
                            stackIn_92_0 = stackOut_90_0;
                            stackIn_92_1 = stackOut_90_1;
                            break L27;
                          }
                        }
                        var35 = stackIn_92_0[stackIn_92_1];
                        var12.field_Ac.field_I = var35;
                        var12.field_Ac.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (var35.field_K - -j.field_c);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L28: {
                      if ((1 << rf.field_a & var14) != 0) {
                        var35 = bb.field_b[-1 + var12.field_qc];
                        var12.field_Tb.field_I = var35;
                        var12.field_Tb.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (j.field_c + var35.field_K);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if ((1 << ul.field_f & var14 ^ -1) == -1) {
                        break L29;
                      } else {
                        L30: {
                          stackOut_97_0 = si.field_d;
                          stackIn_100_0 = stackOut_97_0;
                          stackIn_98_0 = stackOut_97_0;
                          if (!var12.field_Ic) {
                            stackOut_100_0 = (ck[]) (Object) stackIn_100_0;
                            stackOut_100_1 = 0;
                            stackIn_101_0 = stackOut_100_0;
                            stackIn_101_1 = stackOut_100_1;
                            break L30;
                          } else {
                            stackOut_98_0 = (ck[]) (Object) stackIn_98_0;
                            stackIn_99_0 = stackOut_98_0;
                            stackOut_99_0 = (ck[]) (Object) stackIn_99_0;
                            stackOut_99_1 = 1;
                            stackIn_101_0 = stackOut_99_0;
                            stackIn_101_1 = stackOut_99_1;
                            break L30;
                          }
                        }
                        var35 = stackIn_101_0[stackIn_101_1];
                        var12.field_Fc.field_I = var35;
                        var12.field_Fc.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (j.field_c + var35.field_K);
                        break L29;
                      }
                    }
                    L31: {
                      if (null != be.field_u) {
                        var36 = 0;
                        L32: while (true) {
                          if (j.field_b <= var36) {
                            break L31;
                          } else {
                            L33: {
                              if (be.field_u[var36] == null) {
                                break L33;
                              } else {
                                if ((var14 & 1 << um.field_a - -var36) == 0) {
                                  break L33;
                                } else {
                                  var35 = be.field_u[var36][var12.field_kc[var36] & 255];
                                  var12.field_fc[var36].field_I = var35;
                                  var12.field_fc[var36].a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                                  var34_int = var34_int + (var35.field_K + j.field_c);
                                  break L33;
                                }
                              }
                            }
                            var36++;
                            continue L32;
                          }
                        }
                      } else {
                        break L31;
                      }
                    }
                    L34: {
                      var36 = (-var34_int + var12.field_zc.field_mb) / 2;
                      if (var36 > 0) {
                        var12.field_pc.field_vb = var12.field_pc.field_vb + var36;
                        var12.field_Ac.field_vb = var12.field_Ac.field_vb + var36;
                        var12.field_Tb.field_vb = var12.field_Tb.field_vb + var36;
                        var12.field_Fc.field_vb = var12.field_Fc.field_vb + var36;
                        var37_int = 0;
                        L35: while (true) {
                          if ((j.field_b ^ -1) >= (var37_int ^ -1)) {
                            break L34;
                          } else {
                            var12.field_fc[var37_int].field_vb = var12.field_fc[var37_int].field_vb + var36;
                            var37_int++;
                            continue L35;
                          }
                        }
                      } else {
                        break L34;
                      }
                    }
                    L36: {
                      if (!var12.field_lc) {
                        break L36;
                      } else {
                        L37: {
                          var37_int = var12.field_Nb;
                          if (-1 < (var37_int ^ -1)) {
                            var37_int = (int)(var9 + -var12.field_tc);
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        var38_int = var37_int / 1000;
                        var39 = var38_int / 60;
                        var38_int = var38_int % 60;
                        if ((var39 ^ -1) > -61) {
                          var12.field_yc.field_Y = var39 + ":" + var38_int / 10 + var38_int % 10;
                          break L36;
                        } else {
                          var40 = var39 / 60;
                          var39 = var39 % 60;
                          var12.field_yc.field_Y = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                          break L36;
                        }
                      }
                    }
                    L38: {
                      var12.field_yc.a(var12.field_mb + -365, 0, var31, kf.field_O, 365);
                      var31 = var31 + kf.field_O;
                      if (null == var12.field_xc) {
                        break L38;
                      } else {
                        var31 += 2;
                        var37 = new StringBuilder(64);
                        StringBuilder discarded$4 = var37.append(jg.field_c);
                        StringBuilder discarded$5 = var37.append(var12.field_xc[0]);
                        var38_int = 1;
                        L39: while (true) {
                          if (var38_int >= var12.field_rc) {
                            var38 = var37.toString();
                            var12.field_Sb.field_Y = var38;
                            var39 = var12.field_Sb.field_J.a(var38, var12.field_mb + -(2 * var12.field_Sb.field_ub));
                            var12.field_Sb.a(var12.field_mb, 0, var31, var39 * kf.field_O, 0);
                            var31 = var31 + kf.field_O * var39;
                            break L38;
                          } else {
                            StringBuilder discarded$6 = var37.append(", ");
                            StringBuilder discarded$7 = var37.append(var12.field_xc[var38_int]);
                            var38_int++;
                            continue L39;
                          }
                        }
                      }
                    }
                    L40: {
                      if (var12.field_Zb) {
                        var12.field_Ec.field_Y = cm.a((byte) 121, li.field_g, new String[1]);
                        var12.field_Ec.a(-(2 * nk.field_b) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                        var31 = var31 + kf.field_O;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    if (var12.field_Ob) {
                      var12.field_bc.field_Y = cm.a((byte) 106, qe.field_b, new String[1]);
                      var12.field_bc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                      var31 = var31 + kf.field_O;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                L41: {
                  var33 = vk.a(var32, var12.field_oc, true);
                  if (var33 != null) {
                    var34_int = var12.field_sc.field_J.a(var33, -nk.field_b + (var12.field_mb - nk.field_b));
                    var12.field_sc.field_wb = var12.field_Rb * 256 / oa.field_a;
                    var12.field_sc.field_Y = var33;
                    var12.field_sc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, var34_int * kf.field_O, nk.field_b);
                    var31 = var31 + kf.field_O * var34_int;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  if (var7_int != 0) {
                    break L42;
                  } else {
                    var12.field_F = var31 - var12.field_N;
                    break L42;
                  }
                }
                L43: {
                  if (var13 != 0) {
                    gf.field_c.field_Ob.a((w) var11, (w) (Object) var12, 2, 0);
                    break L43;
                  } else {
                    break L43;
                  }
                }
                var34_int = 0;
                L44: while (true) {
                  if ((var34_int ^ -1) <= (j.field_b ^ -1)) {
                    L45: {
                      if (var12.field_pc.field_jb) {
                        L46: {
                          if ((var12.field_Wb ^ -1) != -2) {
                            var34 = ed.field_b[var12.field_Wb];
                            break L46;
                          } else {
                            var34_ref = bh.field_j;
                            break L46;
                          }
                        }
                        sl.field_g = hl.field_c + " - " + var34;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L47: {
                      if (!var12.field_Fc.field_jb) {
                        break L47;
                      } else {
                        L48: {
                          if (var12.field_Ic) {
                            stackOut_166_0 = cl.field_s;
                            stackIn_167_0 = stackOut_166_0;
                            break L48;
                          } else {
                            stackOut_165_0 = si.field_k;
                            stackIn_167_0 = stackOut_165_0;
                            break L48;
                          }
                        }
                        sl.field_g = stackIn_167_0;
                        break L47;
                      }
                    }
                    L49: {
                      if (!var12.field_Ac.field_jb) {
                        break L49;
                      } else {
                        L50: {
                          L51: {
                            if (var12.field_gc) {
                              break L51;
                            } else {
                              if (!var12.field_Zb) {
                                if (!var12.field_wc) {
                                  stackOut_176_0 = ec.field_b;
                                  stackIn_177_0 = stackOut_176_0;
                                  break L50;
                                } else {
                                  stackOut_175_0 = bh.field_c;
                                  stackIn_177_0 = stackOut_175_0;
                                  break L50;
                                }
                              } else {
                                break L51;
                              }
                            }
                          }
                          stackOut_173_0 = wa.field_f;
                          stackIn_177_0 = stackOut_173_0;
                          break L50;
                        }
                        sl.field_g = stackIn_177_0;
                        break L49;
                      }
                    }
                    L52: {
                      if (var12.field_Tb.field_jb) {
                        L53: {
                          if (var12.field_qc != 2) {
                            stackOut_182_0 = bc.field_F;
                            stackIn_183_0 = stackOut_182_0;
                            break L53;
                          } else {
                            stackOut_181_0 = tl.field_r;
                            stackIn_183_0 = stackOut_181_0;
                            break L53;
                          }
                        }
                        sl.field_g = stackIn_183_0;
                        break L52;
                      } else {
                        break L52;
                      }
                    }
                    L54: {
                      if ((var12.field_ob ^ -1) == -1) {
                        break L54;
                      } else {
                        if (!var12.i((byte) 100)) {
                          if (-1 == (var12.field_Yb.field_ob ^ -1)) {
                            hd.a(0, param4, var12, var32);
                            break L54;
                          } else {
                            L55: {
                              if (!var12.field_lc) {
                                break L55;
                              } else {
                                L56: {
                                  if (!var12.field_wc) {
                                    break L56;
                                  } else {
                                    if (var12.field_gc) {
                                      break L55;
                                    } else {
                                      if (!var12.field_Zb) {
                                        break L56;
                                      } else {
                                        break L55;
                                      }
                                    }
                                  }
                                }
                                ga.a(false, var12.e(-87), param5);
                                break L54;
                              }
                            }
                            cg.a(var12.e(-36), (byte) -9, param5);
                            break L54;
                          }
                        } else {
                          break L54;
                        }
                      }
                    }
                    var12 = (ve) (Object) var8.d(true);
                    continue L2;
                  } else {
                    L57: {
                      if (!var12.field_fc[var34_int].field_jb) {
                        break L57;
                      } else {
                        L58: {
                          if (hb.field_Qb != null) {
                            if (null == hb.field_Qb[var34_int]) {
                              stackOut_151_0 = null;
                              stackIn_152_0 = (String) (Object) stackOut_151_0;
                              break L58;
                            } else {
                              stackOut_150_0 = hb.field_Qb[var34_int][var12.field_kc[var34_int] & 255];
                              stackIn_152_0 = stackOut_150_0;
                              break L58;
                            }
                          } else {
                            stackOut_148_0 = null;
                            stackIn_152_0 = (String) (Object) stackOut_148_0;
                            break L58;
                          }
                        }
                        var35_ref = stackIn_152_0;
                        if (var35_ref == null) {
                          sl.field_g = pa.field_db[var34_int];
                          break L57;
                        } else {
                          sl.field_g = pa.field_db[var34_int] + " - " + var35_ref;
                          break L57;
                        }
                      }
                    }
                    var34_int++;
                    continue L44;
                  }
                }
              } else {
                var12.field_fc[var22_int].field_I = null;
                var23_ref = var12.field_fc[var22_int];
                var12.field_fc[var22_int].field_N = 0;
                var23_ref.field_mb = 0;
                var22_int++;
                continue L13;
              }
            }
          }
        }
    }

    private final boolean n(int param0) {
        je var2 = null;
        pi[] var2_array = null;
        byte[] var3 = null;
        pi[] var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        ck var6 = null;
        pi var7 = null;
        ck[] var7_array = null;
        byte[] var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10_int = 0;
        ck[] var10 = null;
        ck var10_ref = null;
        int var11_int = 0;
        ck[][] var11 = null;
        int var12_int = 0;
        ck var12 = null;
        ck[][] var12_array = null;
        pi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = field_A ? 1 : 0;
        if (null != jj.field_c) {
          fh.b((byte) -123);
          qi.a(65.0f, param0 + 98, rf.field_p);
          ((client) this).d(320);
          ka.field_N = new pl(jj.field_c, ah.field_d);
          pg.field_d = ka.field_N.a("", "fruit_step", param0 ^ 0);
          field_F = ka.field_N.a("", "cooked_fruit_step", 0);
          ib.field_ob = ka.field_N.a("", "db_loose_shape_rotate", 0);
          bj.field_e = ka.field_N.a("", "db_loose_shape_land_squish", 0);
          fh.field_c = ka.field_N.a("", "db_group_shape_land", 0);
          hm.field_d = ka.field_N.a("", "fruit_move", 0);
          wd.field_c = ka.field_N.a("", "db_loose_tiles_pop", 0);
          sa.field_w = ka.field_N.a("", "db_solid_tiles_pop2", 0);
          jm.field_v[0] = ka.field_N.a("", "db_combo_1", 0);
          jm.field_v[1] = ka.field_N.a("", "db_combo_2", param0 + 0);
          jm.field_v[2] = ka.field_N.a("", "db_combo_3", qm.b(param0, 0));
          jm.field_v[3] = ka.field_N.a("", "db_combo_4", qm.b(param0, 0));
          bf.field_w = ka.field_N.a("", "db_simultaneous_bonus2", 0);
          ob.field_n = ka.field_N.a((byte) 101, "", "db_loose_drill");
          fj.field_k = ka.field_N.a((byte) 101, "", "db_bucket_water_capsule2");
          pk.field_q = ka.field_N.a("", "db_quake", param0 ^ 0);
          ee.field_g = ka.field_N.a("", "db_special_item_explode", param0 ^ 0);
          var2 = new je(22050, 11025);
          pk.field_q = pk.field_q.a(var2);
          ee.field_g = ee.field_g.a(var2);
          w.field_Eb = ka.field_N.a("", "db_poison", param0 ^ 0);
          qa.field_s = ka.field_N.a("", "db_glass_lower", 0);
          ha.field_Pb[2] = ka.field_N.a("", "db_bucket_glass_crack2_2", param0 + 0);
          ha.field_Pb[1] = ka.field_N.a("", "db_bucket_glass_crack3", param0 + 0);
          ha.field_Pb[0] = ka.field_N.a((byte) 101, "", "db_bucket_glass_explode");
          ie.field_e = ka.field_N.a("", "db_bucket_explode", 0);
          jg.field_j = ka.field_N.a("", "db_bucket_debris", 0);
          bf.field_u = ka.field_N.a("", "db_loose_shape_fall_looped", 0);
          rc.field_i = ka.field_N.a("", "db_loose_shape_fall_quake_looped", 0);
          ak.field_b = ka.field_N.a("", "db_suck_into_machine", 0);
          kf.field_P = ka.field_N.a("", "microwave_motor_2", 0);
          ul.field_i = ka.field_N.a("", "db_shape_out_of_machine2", param0 ^ 0);
          ig.field_ac = ka.field_N.a("", "db_last_shape_out", 0);
          jj.field_c = null;
          ah.field_d = null;
          vj.a(true);
          return false;
        } else {
          if (wg.field_h != null) {
            qi.a(75.0f, -96, v.field_b);
            ((client) this).d(320);
            jg.field_a = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Titlescreen");
            sb.field_u[0][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_NORMAL");
            sb.field_u[0][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_PANIC");
            sb.field_u[0][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_REALLY_PANIC");
            sb.field_u[0][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_FINISH_THEM");
            sb.field_u[1][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_NORMAL");
            sb.field_u[1][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_PANIC");
            sb.field_u[1][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_REALLY_PANIC");
            sb.field_u[1][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_FINISH_THEM");
            sb.field_u[2][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_NORMAL");
            sb.field_u[2][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_PANIC");
            sb.field_u[2][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_REALLY_PANIC");
            sb.field_u[2][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_FINISH_THEM");
            sb.field_u[6][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_NORMAL");
            sb.field_u[6][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_PANIC");
            sb.field_u[6][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_REALLY_PANIC");
            sb.field_u[6][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_FINISH_THEM");
            sb.field_u[7][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_NORMAL");
            sb.field_u[7][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_PANIC");
            sb.field_u[7][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_REALLY_PANIC");
            sb.field_u[7][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_FINISH_THEM");
            sb.field_u[4][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_NORMAL");
            sb.field_u[4][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_PANIC");
            sb.field_u[4][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_REALLY_PANIC");
            sb.field_u[4][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_FINISH_THEM");
            sb.field_u[3][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_NORMAL");
            sb.field_u[3][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_PANIC");
            sb.field_u[3][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_REALLY_PANIC");
            sb.field_u[3][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_FINISH_THEM");
            sb.field_u[5][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_NORMAL");
            sb.field_u[5][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_PANIC");
            sb.field_u[5][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_REALLY_PANIC");
            sb.field_u[5][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_FINISH_THEM");
            ee.field_a[0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_NORMAL");
            ee.field_a[1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_PANIC");
            ee.field_a[2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_REALLY_PANIC");
            ee.field_a[3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_FINISH_THEM");
            hb.field_Ub = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Game Win");
            rm.field_b = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Game Lose");
            wg.field_h = null;
            vj.a(true);
            return false;
          } else {
            if (null != ph.field_Db) {
              qi.a(90.0f, 96, vd.field_o);
              ((client) this).d(320);
              se.field_S = cd.a("", qc.field_vb, ah.field_i, (byte) 108, "arial13");
              var2_array = t.a("", ah.field_i, false, "arialbold14");
              var3 = qc.field_vb.a(0, "", "arialbold14");
              w.field_kb = gg.a(var2_array, 55, var3);
              km.field_A = ge.a((byte) -49, 16777215, 1, var2_array, var3, 1);
              var4 = t.a("tinybloko", ii.field_t, false, "");
              var5 = ph.field_Db.a(param0 ^ 0, "tinybloko", "");
              in.field_n = gg.a(var4, param0 ^ 111, var5);
              var6_int = 0;
              L0: while (true) {
                if ((var4.length ^ -1) >= (var6_int ^ -1)) {
                  var6_int = 0;
                  L1: while (true) {
                    if ((var6_int ^ -1) <= (var5.length ^ -1)) {
                      a.field_t = gg.a(var4, param0 ^ 103, var5);
                      eh.field_j = ge.a((byte) 100, 16694016, 2, var4, var5, 1);
                      eh.field_j.field_X[1] = new int[3];
                      var6_int = 0;
                      L2: while (true) {
                        if ((var6_int ^ -1) <= (var4.length ^ -1)) {
                          var6_int = 0;
                          L3: while (true) {
                            if ((var5.length ^ -1) >= (var6_int ^ -1)) {
                              hn.field_g = gg.a(var4, 121, var5);
                              a.field_n = db.a("ui_frame_vbrick", "ui_frame_hbrick", ii.field_t, true, "ui_frame_corner");
                              on.field_e = ek.a("ui_button_up", "", param0 ^ -95, ii.field_t);
                              im.field_i = ek.a("ui_button_highlight", "", -114, ii.field_t);
                              ce.field_s = bj.a(112, ii.field_t, "", "chat_toggle_button");
                              gd.field_g = bj.a(112, ii.field_t, "", "chat_toggle_button_highlight");
                              vg.field_h = id.a(ah.field_i, "unachieved", "basic", 8192);
                              wg.field_c = id.a(ah.field_i, "locked", "basic", param0 + 8192);
                              db.field_f = new ck(32, 32);
                              db.field_f.a();
                              vg.field_h.a(0, 0, 32, 32);
                              gf.field_a = new ck(32, 32);
                              gf.field_a.a();
                              wg.field_c.a(0, 0, 32, 32);
                              le.field_m.a((byte) -84);
                              var6 = id.a(ah.field_i, "orbcoin", "basic", 8192);
                              rn.field_c = new ck(20, 20);
                              rn.field_c.a();
                              var6.a(0, 0, 20, 20);
                              le.field_m.a((byte) -106);
                              var6 = null;
                              gf.field_f = t.a("solid_mask", ii.field_t, false, "");
                              oa.field_b = bj.a(112, ii.field_t, "", "pop");
                              qf.field_h = si.a(param0 ^ 25972, false, bj.a(112, ii.field_t, "", "explode"), false);
                              qm.field_c = me.a(id.a(ii.field_t, "wildcard", "", 8192), false, (byte) -28, false);
                              kd.field_t = qm.field_c.c();
                              var7_array = bj.a(112, ii.field_t, "", "specialitems");
                              var8_int = 0;
                              L4: while (true) {
                                if (-7 >= (var8_int ^ -1)) {
                                  var8_int = 0;
                                  L5: while (true) {
                                    if ((var8_int ^ -1) <= -9) {
                                      le.field_m.a((byte) -114);
                                      var8_int = 0;
                                      L6: while (true) {
                                        if (8 <= var8_int) {
                                          var8 = eg.field_e.a(param0 + 0, "", "menu2.jpg");
                                          tc.field_Tb = new ck(var8, (java.awt.Component) (Object) jh.field_b);
                                          var9 = eg.field_e.a(0, "", "achievements.jpg");
                                          uf.field_y = fc.a(31, new ck(var9, (java.awt.Component) (Object) jh.field_b), -10241);
                                          var10 = bj.a(112, ii.field_t, "", "achievements");
                                          var11_int = 0;
                                          L7: while (true) {
                                            if (-32 >= (var11_int ^ -1)) {
                                              var10 = null;
                                              tl.field_w = new ck[31];
                                              var11_int = 0;
                                              L8: while (true) {
                                                if (-32 >= (var11_int ^ -1)) {
                                                  le.field_m.a((byte) -108);
                                                  pg.field_e = id.a(ii.field_t, "ui_clouds", "", 8192);
                                                  dk.field_h = id.a(ii.field_t, "ui_border_tl", "", 8192);
                                                  jh.field_d = id.a(ii.field_t, "ui_border_t", "", 8192);
                                                  sk.field_g = id.a(ii.field_t, "ui_border_tr", "", 8192);
                                                  fl.field_f = id.a(ii.field_t, "ui_border_l", "", param0 ^ 8192);
                                                  wm.field_n = id.a(ii.field_t, "ui_border_r", "", 8192);
                                                  vg.field_x = id.a(ii.field_t, "ui_border_bl", "", 8192);
                                                  pg.field_f = id.a(ii.field_t, "ui_border_b", "", 8192);
                                                  wc.field_r = id.a(ii.field_t, "ui_border_br", "", param0 ^ 8192);
                                                  wk.field_l = id.a(ii.field_t, "ui_menu_title", "", 8192);
                                                  ve.field_dc = id.a(ii.field_t, "ui_lobby_logo", "", 8192);
                                                  ij.field_d = mg.a(16776192, 16743168, ul.field_b, in.field_n, 6, 0, (byte) 107);
                                                  wh.field_f = mg.a(16776192, 16743168, ak.field_e, in.field_n, 6, 0, (byte) 120);
                                                  field_C[0] = mg.a(16776192, 16743168, mf.field_P, in.field_n, 6, 0, (byte) 120);
                                                  field_C[1] = mg.a(16776192, 16743168, qf.field_k, in.field_n, 6, 0, (byte) 114);
                                                  field_C[2] = mg.a(16776192, 16743168, ad.field_z, in.field_n, 6, 0, (byte) 104);
                                                  ng.field_b = mg.a(16776192, 16743168, de.field_P, in.field_n, 6, 0, (byte) 102);
                                                  l.field_j = mg.a(16776192, 16743168, im.field_g, in.field_n, 6, 0, (byte) 99);
                                                  ad.field_g = mg.a(16776192, 16743168, u.field_g, in.field_n, 6, 0, (byte) 88);
                                                  ve.field_uc[0] = bj.a(112, ii.field_t, "", "fruit_buckettop");
                                                  uj.field_d[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_lefttex"), true);
                                                  bb.field_a[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_leftsidetex"), true);
                                                  cc.field_f[0] = t.a("fruit_leftmask", ii.field_t, false, "");
                                                  rb.field_d[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_righttex"), true);
                                                  dg.field_d[0] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "fruit_rightsidetex"), true);
                                                  sc.field_j[0] = t.a("fruit_rightmask", ii.field_t, false, "");
                                                  ad.field_j[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_bottomtex"), true);
                                                  fk.field_G[0] = t.a("fruit_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[1] = bj.a(112, ii.field_t, "", "animals_buckettop");
                                                  rb.field_j[1] = si.a(25972, false, bj.a(112, ii.field_t, "", "animals_sidespr"), true);
                                                  hf.field_e[1] = si.a(25972, false, bj.a(112, ii.field_t, "", "animals_sidespr"), true);
                                                  bh.field_d[1] = si.a(25972, true, bj.a(param0 + 112, ii.field_t, "", "animals_bottomspecial"), false);
                                                  fk.field_G[1] = t.a("animals_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[2] = bj.a(112, ii.field_t, "", "breakfast_buckettop");
                                                  uj.field_d[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_lefttex"), true);
                                                  bb.field_a[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_leftsidetex"), true);
                                                  cc.field_f[2] = t.a("breakfast_leftmask", ii.field_t, false, "");
                                                  rb.field_d[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_righttex"), true);
                                                  dg.field_d[2] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "breakfast_rightsidetex"), true);
                                                  sc.field_j[2] = t.a("breakfast_rightmask", ii.field_t, false, "");
                                                  ad.field_j[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_bottomtex"), true);
                                                  fk.field_G[2] = t.a("breakfast_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[3] = bj.a(112, ii.field_t, "", "bugs_buckettop");
                                                  rb.field_j[3] = si.a(25972, false, bj.a(112, ii.field_t, "", "bugs_sidespr"), true);
                                                  hf.field_e[3] = si.a(25972, false, bj.a(112, ii.field_t, "", "bugs_sidespr"), true);
                                                  bh.field_d[3] = si.a(qm.b(param0, 25972), true, bj.a(param0 + 112, ii.field_t, "", "bugs_bottomspecial"), false);
                                                  fk.field_G[3] = t.a("bugs_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[4] = bj.a(qm.b(param0, 112), ii.field_t, "", "flowers_buckettop");
                                                  uj.field_d[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_lefttex"), true);
                                                  bb.field_a[4] = si.a(25972, true, bj.a(qm.b(param0, 112), ii.field_t, "", "flowers_leftsidetex"), true);
                                                  cc.field_f[4] = t.a("flowers_leftmask", ii.field_t, false, "");
                                                  rb.field_d[4] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "flowers_righttex"), true);
                                                  dg.field_d[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_rightsidetex"), true);
                                                  sc.field_j[4] = t.a("flowers_rightmask", ii.field_t, false, "");
                                                  ad.field_j[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_bottomtex"), true);
                                                  fk.field_G[4] = t.a("flowers_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[5] = bj.a(112, ii.field_t, "", "undersea_buckettop");
                                                  rb.field_j[5] = si.a(25972, false, bj.a(112, ii.field_t, "", "undersea_sidespr"), true);
                                                  hf.field_e[5] = si.a(25972, false, bj.a(112, ii.field_t, "", "undersea_sidespr"), true);
                                                  bh.field_d[5] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "undersea_bottomspecial"), false);
                                                  fk.field_G[5] = t.a("undersea_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[6] = bj.a(112, ii.field_t, "", "city_buckettop");
                                                  uj.field_d[6] = si.a(param0 + 25972, true, bj.a(param0 + 112, ii.field_t, "", "city_lefttex"), true);
                                                  bb.field_a[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_leftsidetex"), true);
                                                  cc.field_f[6] = t.a("city_leftmask", ii.field_t, false, "");
                                                  rb.field_d[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_righttex"), true);
                                                  dg.field_d[6] = si.a(25972, true, bj.a(qm.b(param0, 112), ii.field_t, "", "city_rightsidetex"), true);
                                                  sc.field_j[6] = t.a("city_rightmask", ii.field_t, false, "");
                                                  ad.field_j[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_bottomtex"), true);
                                                  fk.field_G[6] = t.a("city_bottommask", ii.field_t, false, "");
                                                  ve.field_uc[7] = bj.a(112, ii.field_t, "", "eightbit_buckettop");
                                                  uj.field_d[7] = si.a(25972, true, bj.a(112, ii.field_t, "", "eightbit_lefttex"), true);
                                                  bb.field_a[7] = si.a(25972, true, bj.a(param0 + 112, ii.field_t, "", "eightbit_leftsidetex"), true);
                                                  cc.field_f[7] = t.a("eightbit_leftmask", ii.field_t, false, "");
                                                  rb.field_d[7] = si.a(25972, true, bj.a(112, ii.field_t, "", "eightbit_righttex"), true);
                                                  dg.field_d[7] = si.a(qm.b(param0, 25972), true, bj.a(qm.b(param0, 112), ii.field_t, "", "eightbit_rightsidetex"), true);
                                                  sc.field_j[7] = t.a("eightbit_rightmask", ii.field_t, false, "");
                                                  ad.field_j[7] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "eightbit_bottomtex"), true);
                                                  fk.field_G[7] = t.a("eightbit_bottommask", ii.field_t, false, "");
                                                  var11_int = 0;
                                                  L9: while (true) {
                                                    if (-9 >= (var11_int ^ -1)) {
                                                      uf.field_w = id.a(ii.field_t, "machine_buttons1", "", 8192);
                                                      bn.field_e = id.a(ii.field_t, "machine_front", "", param0 ^ 8192);
                                                      cd.field_k = id.a(ii.field_t, "machine_glass", "", 8192);
                                                      e.field_b = id.a(ii.field_t, "machine_glasslit", "", param0 ^ 8192);
                                                      ca.field_qb = id.a(ii.field_t, "machine_lights1", "", 8192);
                                                      ln.field_c = id.a(ii.field_t, "machine_mouth", "", 8192);
                                                      aa.field_e = id.a(ii.field_t, "machine_next", "", param0 + 8192);
                                                      jc.field_f = id.a(ii.field_t, "machine_nextlit", "", 8192);
                                                      bb.field_c = id.a(ii.field_t, "machine_pipe", "", 8192);
                                                      u.field_h = id.a(ii.field_t, "machine_portal", "", param0 + 8192);
                                                      bc.field_J = id.a(ii.field_t, "blobmatch_scorecols", "", 8192).field_D;
                                                      a.field_u = id.a(ii.field_t, "eliminatetile_scorecols", "", param0 ^ 8192).field_D;
                                                      jg.field_f = id.a(ii.field_t, "simultaneous_scorecols", "", 8192).field_D;
                                                      nf.field_f = id.a(ii.field_t, "chain_scorecols", "", 8192).field_D;
                                                      oh.field_c = id.a(ii.field_t, "bomb_scorecols", "", param0 ^ 8192).field_D;
                                                      vl.field_G = id.a(ii.field_t, "bombardmessagecols", "", 8192).field_D;
                                                      ph.field_yb = bj.a(112, ii.field_t, "", "instructions_keys");
                                                      ma.field_K = id.a(ii.field_t, "instructions_arrow", "", 8192);
                                                      aj.field_c = id.a(ii.field_t, "instructions_inmultiplayer", "", 8192);
                                                      li.field_i = id.a(ii.field_t, "instructions_insingleplayer", "", param0 + 8192);
                                                      var11 = new ck[5][];
                                                      var12_array = new ck[5][];
                                                      var12_array[0] = bj.a(112, ii.field_t, "", "bucketsize_icons");
                                                      var11[0] = bj.a(112, ii.field_t, "", "bucketsize_icons");
                                                      var12_array[1] = bj.a(112, ii.field_t, "", "speed_icons");
                                                      var11[1] = bj.a(112, ii.field_t, "", "speed_icons");
                                                      var12_array[4] = bj.a(param0 + 112, ii.field_t, "", "shapefeedback_icons");
                                                      var11[4] = bj.a(param0 + 112, ii.field_t, "", "shapefeedback_icons");
                                                      lf.field_h = bj.a(param0 + 112, ii.field_t, "", "shapefeedback_icons");
                                                      var12_array[2] = bj.a(112, ii.field_t, "", "colours_icons");
                                                      var11[2] = bj.a(112, ii.field_t, "", "colours_icons");
                                                      var12_array[3] = bj.a(112, ii.field_t, "", "specialitems_icons");
                                                      var11[3] = bj.a(112, ii.field_t, "", "specialitems_icons");
                                                      bg.a(vl.field_A, nd.field_a, si.field_f, pf.field_d, 8, qd.field_Pb, ah.field_i, 5, 25150, qc.field_vb, var11, var12_array, true, vb.field_S, tg.field_d);
                                                      gm.a(-3504, 200);
                                                      qf.a(ah.field_i, qc.field_vb, -96);
                                                      rf.a(ac.field_z, 0, 180, -94, 16694016, (java.applet.Applet) this);
                                                      qc.field_vb = null;
                                                      ph.field_Db = null;
                                                      vj.a(true);
                                                      return false;
                                                    } else {
                                                      on.a(uj.field_d[var11_int], 19264);
                                                      on.a(rb.field_d[var11_int], param0 + 19264);
                                                      on.a(ad.field_j[var11_int], 19264);
                                                      uh.a(cc.field_f[var11_int], (byte) 115);
                                                      uh.a(sc.field_j[var11_int], (byte) -118);
                                                      uh.a(fk.field_G[var11_int], (byte) 114);
                                                      var12_int = 0;
                                                      L10: while (true) {
                                                        if ((var12_int ^ -1) <= (ve.field_uc[var11_int].length ^ -1)) {
                                                          var11_int++;
                                                          continue L9;
                                                        } else {
                                                          ve.field_uc[var11_int][var12_int].b();
                                                          var12_int++;
                                                          continue L10;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  tl.field_w[var11_int] = new ck(32, 32);
                                                  tl.field_w[var11_int].a();
                                                  uf.field_y[var11_int].a(0, 0, 32, 32);
                                                  var11_int++;
                                                  continue L8;
                                                }
                                              }
                                            } else {
                                              var10[var11_int].b();
                                              mg.a(0, var10[var11_int], uf.field_y[var11_int]);
                                              var10[var11_int] = null;
                                              var11_int++;
                                              continue L7;
                                            }
                                          }
                                        } else {
                                          var9 = eg.field_e.a(param0 + 0, "", ri.field_f[var8_int] + ".jpg");
                                          dn.field_p[var8_int] = new ck(var9, (java.awt.Component) (Object) jh.field_b);
                                          var8_int++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      var7_array = bj.a(param0 + 112, ii.field_t, "", ri.field_f[var8_int] + "_tiles");
                                      var9_int = 0;
                                      L11: while (true) {
                                        if (7 <= var9_int) {
                                          fb.field_c[var8_int][7] = kd.field_t;
                                          var9_int = 0;
                                          L12: while (true) {
                                            if (-8 >= (var9_int ^ -1)) {
                                              s.field_Qb[var8_int] = id.a(ii.field_t, ri.field_f[var8_int] + "_bucketback", "", 8192);
                                              s.field_Qb[var8_int].b();
                                              var8_int++;
                                              continue L5;
                                            } else {
                                              var10_ref = me.a(var7_array[var9_int + 7], true, (byte) -124, true);
                                              var11_int = 0;
                                              L13: while (true) {
                                                if (-17 >= (var11_int ^ -1)) {
                                                  var9_int++;
                                                  continue L12;
                                                } else {
                                                  var12 = var10_ref.c();
                                                  var12.a();
                                                  fb.field_c[var8_int][var9_int].b(6, 6, 24, 24);
                                                  var10_ref.c(0, 0, 128);
                                                  var13 = gf.field_f[var11_int];
                                                  var14 = 0;
                                                  L14: while (true) {
                                                    if (1296 <= var14) {
                                                      ob.field_j[var8_int][var9_int][var11_int] = var12;
                                                      var11_int++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        var15 = var13.field_l[var13.field_k[var14] & 255] & 255;
                                                        var16 = var12.field_D[var14];
                                                        if (var15 <= 128) {
                                                          var16 = ((var16 & 16711935) * var15 >> 1802741479 & 16711935) + (((65280 & var16) * var15 & 8355876) >> -816570233);
                                                          break L15;
                                                        } else {
                                                          var17 = 131586 * (var15 - 128);
                                                          var18 = var16;
                                                          var19 = var18 + var17;
                                                          var17 = (16711935 & var18) + (16711935 & var17);
                                                          var18 = (-var17 + var19 & 65536) + (16777472 & var17);
                                                          var16 = var19 - var18 | var18 + -(var18 >>> -74352984);
                                                          break L15;
                                                        }
                                                      }
                                                      L16: {
                                                        if (var16 == 0) {
                                                          var16 = 1;
                                                          break L16;
                                                        } else {
                                                          break L16;
                                                        }
                                                      }
                                                      var12.field_D[var14] = var16;
                                                      var14++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          fb.field_c[var8_int][var9_int] = me.a(var7_array[var9_int], false, (byte) -63, false);
                                          var9_int++;
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var9_int = 0;
                                  L17: while (true) {
                                    if (4 <= var9_int) {
                                      var8_int++;
                                      continue L4;
                                    } else {
                                      ik.field_b[var8_int][var9_int] = me.a(var7_array[var8_int * 4 - -var9_int], false, (byte) -55, false);
                                      var9_int++;
                                      continue L17;
                                    }
                                  }
                                }
                              }
                            } else {
                              var5[var6_int] = (byte)(var5[var6_int] * 3 / 2);
                              var6_int++;
                              continue L3;
                            }
                          }
                        } else {
                          var7 = var4[var6_int];
                          var8 = new byte[var7.field_b * var7.field_i * 9 / 4];
                          var9_int = 0;
                          L18: while (true) {
                            if ((var7.field_i ^ -1) >= (var9_int ^ -1)) {
                              var7.field_d = 3 * var7.field_d / 2;
                              var7.field_i = var7.field_i * 3 / 2;
                              var7.field_k = var8;
                              var7.field_c = var7.field_c * 3 / 2;
                              var7.field_g = var7.field_g * 3 / 2;
                              var7.field_b = var7.field_b * 3 / 2;
                              var7.field_a = var7.field_a * 3 / 2;
                              var6_int++;
                              continue L2;
                            } else {
                              var10_int = 0;
                              L19: while (true) {
                                if (var10_int >= var7.field_b) {
                                  var9_int += 2;
                                  continue L18;
                                } else {
                                  var11_int = var7.field_k[var10_int + var7.field_b * var9_int];
                                  var12_int = var7.field_b * (var9_int * 9) / 4 + 3 * var10_int / 2;
                                  var8[var12_int] = (byte) var11_int;
                                  var8[1 + var12_int] = (byte) var11_int;
                                  var8[2 + var12_int] = (byte) var11_int;
                                  var8[var12_int - -(3 * var7.field_b / 2)] = (byte) var11_int;
                                  var8[1 + var12_int + var7.field_b * 3 / 2] = (byte) var11_int;
                                  var8[2 + (var12_int - -(3 * var7.field_b / 2))] = (byte) var11_int;
                                  var8[var12_int + 3 * var7.field_b] = (byte) var11_int;
                                  var8[var12_int - -(3 * var7.field_b) - -1] = (byte) var11_int;
                                  var8[var12_int + (3 * var7.field_b + 2)] = (byte) var11_int;
                                  var10_int += 2;
                                  continue L19;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var5[var6_int] = (byte)(var5[var6_int] * 2);
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  var7 = var4[var6_int];
                  var8 = new byte[4 * (var7.field_i * var7.field_b)];
                  var9_int = 0;
                  L20: while (true) {
                    if (var9_int >= var7.field_i) {
                      var7.field_d = var7.field_d * 2;
                      var7.field_g = var7.field_g * 2;
                      var7.field_a = var7.field_a * 2;
                      var7.field_b = var7.field_b * 2;
                      var7.field_i = var7.field_i * 2;
                      var7.field_k = var8;
                      var7.field_c = var7.field_c * 2;
                      var6_int++;
                      continue L0;
                    } else {
                      var10_int = 0;
                      L21: while (true) {
                        if (var7.field_b <= var10_int) {
                          var9_int++;
                          continue L20;
                        } else {
                          var11_int = var7.field_k[var7.field_b * var9_int + var10_int];
                          var12_int = 2 * var10_int + 4 * var7.field_b * var9_int;
                          var8[var12_int] = (byte) var11_int;
                          var8[1 + var12_int] = (byte) var11_int;
                          var8[var12_int + 2 * var7.field_b] = (byte) var11_int;
                          var8[var7.field_b * 2 + var12_int - -1] = (byte) var11_int;
                          var10_int++;
                          continue L21;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              if (cl.field_y != null) {
                ge.a((byte) -93, new jk(cl.field_y.a(0, "huffman", "")));
                cl.field_y = null;
                vj.a(true);
                return false;
              } else {
                bj.a(320, on.field_e, (mm) (Object) eh.field_j, true, (mm) (Object) km.field_A, 20, param0, 4, 1, 20, 20, 20, a.field_n, 14, 480, 240, im.field_i, 32, 16, 0, 5);
                ie.a(on.field_e, (mm) (Object) km.field_A, a.field_n, 320, 20, 0, 32, 20, 240, 4, 5, 20, (mm) (Object) eh.field_j, im.field_i, 1, 14, 10406, 0, 16, 20);
                kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                bd.a(50, -27096);
                le.a((byte) 86, 50);
                af.a(param0 + 4, 50);
                nn.a(256, jg.field_a, true);
                vj.a(true);
                return true;
              }
            }
          }
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        String stackIn_6_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        String stackOut_5_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 > 79) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        jc discarded$2 = client.a((String) null, -100);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == param1) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (String) param1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((String) (Object) stackIn_6_0).length() < mc.field_f) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1.length() <= dn.field_r) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    try {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) var2;
                        stackOut_17_1 = new StringBuilder().append("client.P(").append(param0).append(44);
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param1 == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_21_2 = stackOut_18_2;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 20: {
                    stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                    stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                    stackOut_20_2 = "null";
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw dh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void init() {
        try {
            ((client) this).a(-2990, 32, "dekobloko");
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "client.init()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new byte[65536];
        an.a(field_D, 0, 65536, (byte) -128);
        field_E = "Theme <%0> strategy";
        field_y = "Show all private chat";
        field_C = new ck[3];
        field_B = "Use this alternative as your account name";
    }
}
