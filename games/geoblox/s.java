/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
          tl.field_f[param0] = fc.field_e;
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

    final static void a(vd param0, int param1) {
        int var2 = 0;
        int var4 = 0;
        vd var5 = null;
        vd var6 = null;
        var4 = Geoblox.field_C;
        if (param1 == 0) {
          if (null != param0.field_k) {
            if (param0.field_o != 0) {
              var2 = 0;
              L0: while (true) {
                if (oj.field_b > var2) {
                  var6 = n.field_k[var2];
                  if (2 == var6.field_f) {
                    if (param0.field_o == var6.field_o) {
                      if (param0.field_d == var6.field_d) {
                        return;
                      } else {
                        var2++;
                        var2++;
                        continue L0;
                      }
                    } else {
                      var2++;
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    var2++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (null == param0.field_g) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ki.a(param0, 31274);
                  return;
                }
              }
            } else {
              if (0 != param0.field_d) {
                var2 = 0;
                if (oj.field_b > var2) {
                  var5 = n.field_k[var2];
                  if (2 == var5.field_f) {
                    if (param0.field_o == var5.field_o) {
                      if (param0.field_d == var5.field_d) {
                        return;
                      } else {
                        L2: {
                          var2++;
                          var2++;
                          var2++;
                          var2++;
                          var2++;
                          if (null == param0.field_g) {
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ki.a(param0, 31274);
                        return;
                      }
                    } else {
                      L3: {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        if (null == param0.field_g) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ki.a(param0, 31274);
                      return;
                    }
                  } else {
                    var2++;
                    L4: {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      if (null == param0.field_g) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ki.a(param0, 31274);
                    return;
                  }
                } else {
                  L5: {
                    if (null == param0.field_g) {
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ki.a(param0, 31274);
                  return;
                }
              } else {
                L6: {
                  if (null == param0.field_g) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ki.a(param0, 31274);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    s(r param0) {
        super(0, 0, 288, 0, (dh) null);
        ((s) this).field_C = param0;
        ((s) this).field_K = new hk(cl.field_d, (bb) null);
        ((s) this).field_K.field_q = (dh) (Object) new ml();
        String var7 = wj.a(nk.field_i, new String[2], (byte) -114);
        int var3 = 20;
        ff var4 = new ff(ng.field_F, 0, 0, 0, 0, 16777215, -1, 3, 0, ng.field_F.field_o, -1, 2147483647, true);
        ((s) this).field_J = new vf(var7, (dh) (Object) var4);
        ((s) this).field_J.field_j = "";
        ((s) this).field_J.a(0, -47, eh.field_a);
        ((s) this).field_J.a(1, 118, eh.field_a);
        ((s) this).field_J.field_u = (bb) this;
        ((s) this).field_J.field_r = ((s) this).field_r + -40;
        ((s) this).field_J.b(26, 0, var3, ((s) this).field_r + -40);
        var3 = var3 + (((s) this).field_J.field_h + 15);
        ((s) this).b((byte) -108, (el) (Object) ((s) this).field_J);
        int var5 = 4;
        int var6 = 200;
        ((s) this).field_K.a(40, var6, (byte) -71, var3, -var6 + 300 >> 717385921);
        ((s) this).field_K.field_u = (bb) this;
        ((s) this).b((byte) -63, (el) (Object) ((s) this).field_K);
        ((s) this).a(var3 + (55 + var5), 300, (byte) -104, 0, 0);
    }

    public final void a(vf param0, int param1, int param2, int param3) {
        int var6 = 0;
        var6 = Geoblox.field_C;
        if (0 == param1) {
          uk.a(false, "terms.ws");
          if (param2 != 2) {
            ((s) this).field_C = null;
            return;
          } else {
            return;
          }
        } else {
          if (param1 != 1) {
            if (2 == param1) {
              uk.a(false, "conduct.ws");
              if (param2 != 2) {
                ((s) this).field_C = null;
                return;
              } else {
                return;
              }
            } else {
              if (param2 == 2) {
                return;
              } else {
                ((s) this).field_C = null;
                return;
              }
            }
          } else {
            uk.a(false, "privacy.ws");
            if (param2 == 2) {
              return;
            } else {
              ((s) this).field_C = null;
              return;
            }
          }
        }
    }

    private final String f(int param0) {
        if (param0 != 11501) {
            String discarded$0 = this.c(true);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param0 != 98) {
            if (-100 != (param0 ^ -1)) {
              return false;
            } else {
              return ((s) this).a(param3, -104);
            }
          } else {
            return ((s) this).a(7305, param3);
          }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          field_I = 58;
          field_G = null;
          field_E = null;
          field_F = null;
          return;
        } else {
          field_G = null;
          field_E = null;
          field_F = null;
          return;
        }
    }

    private final String c(boolean param0) {
        if (param0) {
            field_E = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        if (param4 != ((s) this).field_K) {
          if (param1 != -20) {
            ((s) this).field_C = null;
            return;
          } else {
            return;
          }
        } else {
          ki.a(77);
          ((s) this).field_C.h((byte) -104);
          if (param1 == -20) {
            return;
          } else {
            ((s) this).field_C = null;
            return;
          }
        }
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            String stackIn_5_0 = null;
            String stackOut_4_0 = null;
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
                            if (-1 < (var7 ^ -1)) {
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
                        var2 = caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (param0 == -1) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        s.g(14);
                        if (null != sd.field_z) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        return param1.getParameter("settings");
                    }
                    case 12: {
                        return sd.field_z;
                    }
                    case 14: {
                        if (null != sd.field_z) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return param1.getParameter("settings");
                    }
                    case 16: {
                        return sd.field_z;
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
