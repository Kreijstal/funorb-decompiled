/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class s extends ee implements pe, pl {
    private hk field_K;
    static ck field_E;
    private vf field_J;
    private r field_C;
    static int field_H;
    static volatile int field_I;
    static dm[][] field_G;
    static String field_F;

    final static void g(int param0) {
        if (null != tl.field_f) {
          return;
        } else {
          jk.field_b = wj.a(jk.field_b, new String[1], (byte) -123);
          mj.field_c = wj.a(mj.field_c, new String[1], (byte) -55);
          tl.field_f = new String[19];
          tl.field_f[12] = lh.field_a;
          tl.field_f[7] = tc.field_b;
          tl.field_f[6] = df.field_b;
          tl.field_f[8] = wb.field_c;
          tl.field_f[14] = ne.field_c;
          tl.field_f[5] = ij.field_Z;
          tl.field_f[0] = nk.field_g;
          tl.field_f[4] = wf.field_q;
          tl.field_f[9] = fc.field_e;
          tl.field_f[10] = bl.field_a;
          tl.field_f[11] = tl.field_o;
          tl.field_f[15] = em.field_a;
          tl.field_f[1] = id.field_a;
          tl.field_f[13] = gj.field_t;
          tl.field_f[3] = ef.field_c;
          tl.field_f[2] = ii.field_b;
          tl.field_f[18] = vd.field_m[2];
          tl.field_f[16] = vd.field_m[0];
          tl.field_f[17] = vd.field_m[1];
          return;
        }
    }

    final static void a(vd param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        vd var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            if (null != param0.field_k) {
              L1: {
                L2: {
                  if (param0.field_o != 0) {
                    break L2;
                  } else {
                    if (0 == param0.field_d) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (oj.field_b <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = n.field_k[var2_int];
                      if (2 != var3.field_f) {
                        break L4;
                      } else {
                        if (param0.field_o != var3.field_o) {
                          break L4;
                        } else {
                          if (param0.field_d == var3.field_d) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == param0.field_g) {
                  break L5;
                } else {
                  break L5;
                }
              }
              int discarded$2 = 31274;
              ki.a(param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("s.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 0 + ')');
        }
    }

    s(r param0) {
        super(0, 0, 288, 0, (dh) null);
        RuntimeException var2 = null;
        int var3 = 0;
        ff var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((s) this).field_C = param0;
            ((s) this).field_K = new hk(cl.field_d, (bb) null);
            ((s) this).field_K.field_q = (dh) (Object) new ml();
            int discarded$2 = 11501;
            int discarded$3 = 0;
            var7 = wj.a(nk.field_i, new String[2], (byte) -114);
            var3 = 20;
            var4 = new ff(ng.field_F, 0, 0, 0, 0, 16777215, -1, 3, 0, ng.field_F.field_o, -1, 2147483647, true);
            ((s) this).field_J = new vf(var7, (dh) (Object) var4);
            ((s) this).field_J.field_j = "";
            ((s) this).field_J.a(0, -47, eh.field_a);
            ((s) this).field_J.a(1, 118, eh.field_a);
            ((s) this).field_J.field_u = (bb) this;
            ((s) this).field_J.field_r = ((s) this).field_r + -40;
            ((s) this).field_J.b(26, 0, var3, ((s) this).field_r + -40);
            var3 = var3 + (((s) this).field_J.field_h + 15);
            ((s) this).b((byte) -108, (el) (Object) ((s) this).field_J);
            var5 = 4;
            var6 = 200;
            ((s) this).field_K.a(40, var6, (byte) -71, var3, -var6 + 300 >> 1);
            ((s) this).field_K.field_u = (bb) this;
            ((s) this).b((byte) -63, (el) (Object) ((s) this).field_K);
            ((s) this).a(var3 + (55 + var5), 300, (byte) -104, 0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("s.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void a(vf param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
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
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (0 == param1) {
                uk.a(false, "terms.ws");
                break L1;
              } else {
                if (param1 != 1) {
                  if (2 == param1) {
                    uk.a(false, "conduct.ws");
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  uk.a(false, "privacy.ws");
                  break L1;
                }
              }
            }
            if (param2 == 2) {
              break L0;
            } else {
              ((s) this).field_C = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("s.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String f() {
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param0 != 98) {
                if (param0 == 99) {
                  stackOut_9_0 = ((s) this).a(param3, -104);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = ((s) this).a(7305, param3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("s.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void b(boolean param0) {
        field_G = null;
        field_E = null;
        field_F = null;
    }

    private final String c() {
        return "</col></u>";
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param4 != ((s) this).field_K) {
                break L1;
              } else {
                ki.a(77);
                ((s) this).field_C.h((byte) -104);
                break L1;
              }
            }
            if (param1 == -20) {
              break L0;
            } else {
              ((s) this).field_C = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("s.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            String stackIn_5_0 = null;
            String stackIn_11_0 = null;
            String stackIn_13_0 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            String stackOut_4_0 = null;
            String stackOut_10_0 = null;
            String stackOut_12_0 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var8 = param1.getParameter("cookieprefix");
                            var3 = var8 + "settings";
                            var4 = (String) wk.a((byte) -6, param1, "getcookies");
                            var5 = uj.a(';', true, var4);
                            var6 = 0;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 9;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = var5[var6].substring(var7 + 1).trim();
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0;
                    }
                    case 6: {
                        try {
                            var6++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = caughtException;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (null == sd.field_z) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = sd.field_z;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = param1.getParameter("settings");
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_14_0 = (RuntimeException) var2_ref;
                        stackOut_14_1 = new StringBuilder().append("s.B(").append(-1).append(',');
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param1 == null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "null";
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new ck(7, 0, 1, 1);
        field_G = new dm[7][7];
        field_I = 0;
        field_F = "Growing Pumpkin";
    }
}
