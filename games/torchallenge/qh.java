/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends kj implements tl, sg {
    static int field_J;
    static int field_P;
    private ta field_Q;
    private df field_N;
    private ng field_K;
    static boolean[][][] field_O;
    static String field_L;
    static lj field_M;

    private final String a(int param0) {
        if (param0 <= 27) {
            ((qh) this).field_Q = null;
        }
        return "</col></u>";
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        ka var10 = null;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          if (null != uk.field_N) {
            uk.field_N.d();
            qg.b();
            break L0;
          } else {
            uk.field_N = new ka(640, 480);
            uk.field_N.d();
            break L0;
          }
        }
        L1: {
          if (3 != param0) {
            L2: {
              if (ii.field_h != null) {
                break L2;
              } else {
                ue.b((byte) 102);
                break L2;
              }
            }
            ag.a(52);
            break L1;
          } else {
            param0 = 0;
            break L1;
          }
        }
        L3: {
          L4: {
            var2 = af.field_f[0];
            var3 = af.field_f[1];
            var5 = af.field_f[3];
            var4 = af.field_f[2];
            sf.a(uk.field_N, ng.field_L, var3, var5, var2, var4, (byte) -55);
            if (param0 == 0) {
              break L4;
            } else {
              if (param0 != 1) {
                if (param0 == 2) {
                  var3 = ed.field_i[1];
                  var5 = ed.field_i[3];
                  var4 = ed.field_i[2];
                  var2 = ed.field_i[0];
                  sf.a(uk.field_N, ng.field_L, var3, var5, var2, var4, (byte) -55);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L4;
              }
            }
          }
          var4 = ob.field_b[2];
          var3 = ob.field_b[1];
          var2 = ob.field_b[0];
          var5 = ob.field_b[3];
          sf.a(uk.field_N, ng.field_L, var3, var5, var2, var4, (byte) -55);
          break L3;
        }
        L5: {
          var4 = oj.field_e[2];
          if (param1) {
            break L5;
          } else {
            field_L = null;
            break L5;
          }
        }
        L6: {
          L7: {
            var2 = oj.field_e[0];
            var5 = oj.field_e[3];
            var3 = oj.field_e[1];
            var10 = new ka(1 + var4 / 2, var5);
            sf.a(var10, ph.field_h, 0, var5, 0, var4 / 2 + 1, (byte) -55);
            uk.field_N.d();
            var10.g(var2, var3);
            var10.d(var2 - -(var4 / 2) - 2, var3);
            var7 = di.field_t[vj.field_c].field_v;
            var6 = di.field_t[vj.field_c].field_q;
            var8 = null;
            di.field_t[vj.field_c].g(var2 + (-var6 + var4 / 2) / 2 - -2, (var5 - var7) / 2 + var3);
            if (0 == param0) {
              break L7;
            } else {
              if ((param0 ^ -1) == -3) {
                break L7;
              } else {
                if (param0 != 1) {
                  break L6;
                } else {
                  var3 = oa.field_a[1];
                  var2 = oa.field_a[0];
                  var4 = oa.field_a[2];
                  var5 = oa.field_a[3];
                  sf.a(uk.field_N, ng.field_L, var3, var5, var2, var4, (byte) -55);
                  break L6;
                }
              }
            }
          }
          var3 = rf.field_eb[vj.field_c][1];
          var2 = rf.field_eb[vj.field_c][0];
          uk.field_N.d();
          ie.field_f[vj.field_c][0].g(var2, var3);
          fd.field_h = new ka(ie.field_f[vj.field_c][1].field_q, ie.field_f[vj.field_c][1].field_v);
          ac.field_a = new ka(ie.field_f[vj.field_c][1].field_q, ie.field_f[vj.field_c][1].field_v);
          fd.field_h.d();
          ie.field_f[vj.field_c][1].a(0, 0, 0, 47211);
          break L6;
        }
        L8: {
          L9: {
            if (param0 == 0) {
              break L9;
            } else {
              if (2 == param0) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          var3 = nh.field_db[1];
          var2 = nh.field_db[0];
          uk.field_N.d();
          wf.field_b.g(var2, var3);
          break L8;
        }
        la.field_f.a(-53);
    }

    public final void a(df param0, int param1, int param2, boolean param3) {
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          if (param3) {
            break L0;
          } else {
            var7 = null;
            ((qh) this).a((ng) null, -60, 57, -19, true);
            break L0;
          }
        }
        L1: {
          if (0 == param1) {
            ri.a("terms.ws", (byte) -90);
            break L1;
          } else {
            if (param1 != -2) {
              if (-3 == param1) {
                ri.a("conduct.ws", (byte) -100);
                break L1;
              } else {
                break L1;
              }
            } else {
              ri.a("privacy.ws", (byte) -79);
              break L1;
            }
          }
        }
    }

    final static void d(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = TorChallenge.field_F ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            var3 = null;
            int discarded$1 = qh.a((CharSequence) null, (byte) -29);
            break L0;
          }
        }
        var1 = 0;
        L1: while (true) {
          if (var1 >= 2) {
            return;
          } else {
            L2: {
              L3: {
                if (tg.field_r != null) {
                  if (var1 < tg.field_r.length) {
                    if (tg.field_r[var1] != null) {
                      je.a((byte) 15, tg.field_r[var1]);
                      if (tg.field_r != null) {
                        if (fh.field_h == null) {
                          break L2;
                        } else {
                          if (fh.field_h.length <= var1) {
                            break L2;
                          } else {
                            fh.field_h[var1] = 0;
                            break L2;
                          }
                        }
                      } else {
                        if (fh.field_h == null) {
                          break L2;
                        } else {
                          if (fh.field_h.length <= var1) {
                            break L2;
                          } else {
                            fh.field_h[var1] = 0;
                            break L2;
                          }
                        }
                      }
                    } else {
                      if (tg.field_r == null) {
                        break L3;
                      } else {
                        if (tg.field_r.length <= var1) {
                          break L3;
                        } else {
                          tg.field_r[var1] = null;
                          break L3;
                        }
                      }
                    }
                  } else {
                    if (tg.field_r == null) {
                      break L3;
                    } else {
                      if (tg.field_r.length <= var1) {
                        break L3;
                      } else {
                        tg.field_r[var1] = null;
                        break L3;
                      }
                    }
                  }
                } else {
                  if (tg.field_r == null) {
                    break L3;
                  } else {
                    if (tg.field_r.length <= var1) {
                      break L3;
                    } else {
                      tg.field_r[var1] = null;
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (da.field_g != null) {
                  if (var1 < da.field_g.length) {
                    da.field_g[var1] = null;
                    if (wh.field_d == null) {
                      break L4;
                    } else {
                      if (wh.field_d.length <= var1) {
                        break L4;
                      } else {
                        wh.field_d[var1] = false;
                        break L4;
                      }
                    }
                  } else {
                    if (wh.field_d == null) {
                      break L4;
                    } else {
                      if (wh.field_d.length <= var1) {
                        break L4;
                      } else {
                        wh.field_d[var1] = false;
                        break L4;
                      }
                    }
                  }
                } else {
                  if (wh.field_d == null) {
                    break L4;
                  } else {
                    if (wh.field_d.length <= var1) {
                      break L4;
                    } else {
                      wh.field_d[var1] = false;
                      break L4;
                    }
                  }
                }
              }
              if (fk.field_u == null) {
                if (fh.field_h == null) {
                  break L2;
                } else {
                  if (fh.field_h.length <= var1) {
                    break L2;
                  } else {
                    fh.field_h[var1] = 0;
                    break L2;
                  }
                }
              } else {
                if (fh.field_h == null) {
                  break L2;
                } else {
                  if (fh.field_h.length <= var1) {
                    break L2;
                  } else {
                    fh.field_h[var1] = 0;
                    break L2;
                  }
                }
              }
            }
            var1++;
            continue L1;
          }
        }
    }

    final static int a(CharSequence param0, byte param1) {
        if (param1 >= -60) {
            return 109;
        }
        return vh.a((byte) -128, true, 10, param0);
    }

    public static void f(byte param0) {
        if (param0 != -36) {
            field_O = null;
        }
        field_O = null;
        field_L = null;
        field_M = null;
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        if (param2 <= 9) {
            qh.f((byte) -104);
        }
        if (super.a(param0, param1, (byte) 51, param3)) {
            return true;
        }
        if (!((param0 ^ -1) != -99)) {
            return ((qh) this).a(param3, (byte) -16);
        }
        if (99 != param0) {
            return false;
        }
        return ((qh) this).b(109, param3);
    }

    final static void a(int param0, int[] param1, byte param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var13 = TorChallenge.field_F ? 1 : 0;
          if (param2 == 75) {
            break L0;
          } else {
            qh.d(false);
            break L0;
          }
        }
        L1: {
          if (param0 < param4) {
            L2: {
              var5 = (param0 - -param4) / 2;
              var6 = param0;
              var7 = param3[var5];
              param3[var5] = param3[param4];
              param3[param4] = var7;
              var8 = param1[var5];
              param1[var5] = param1[param4];
              param1[param4] = var8;
              if ((var7 ^ -1) != -2147483648) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var9 = stackIn_7_0;
            var10 = param0;
            L3: while (true) {
              if (param4 <= var10) {
                param3[param4] = param3[var6];
                param3[var6] = var7;
                param1[param4] = param1[var6];
                param1[var6] = var8;
                qh.a(param0, param1, (byte) 75, param3, -1 + var6);
                qh.a(1 + var6, param1, (byte) 75, param3, param4);
                break L1;
              } else {
                if (param3[var10] > -(var9 & var10) + var7) {
                  var11 = param3[var10];
                  param3[var10] = param3[var6];
                  param3[var6] = var11;
                  var12 = param1[var10];
                  param1[var10] = param1[var6];
                  var6++;
                  param1[var6] = var12;
                  var10++;
                  continue L3;
                } else {
                  var10++;
                  continue L3;
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        if (!(((qh) this).field_K != param0)) {
            bj.a(120);
            ((qh) this).field_Q.o(77);
        }
        if (param4) {
            ((qh) this).field_N = null;
        }
    }

    private final String c(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((qh) this).a((df) null, -29, 80, false);
        }
        return "<u=2164A2><col=2164A2>";
    }

    qh(ta param0) {
        super(0, 0, 288, 0, (j) null);
        ((qh) this).field_Q = param0;
        ((qh) this).field_K = new ng(be.field_a, (gg) null);
        ((qh) this).field_K.field_q = (j) (Object) new cl();
        String var7 = ni.a(new String[2], 0, lc.field_m);
        int var3 = 20;
        bc var4 = new bc(oe.field_g, 0, 0, 0, 0, 16777215, -1, 3, 0, oe.field_g.field_x, -1, 2147483647, true);
        ((qh) this).field_N = new df(var7, (j) (Object) var4);
        ((qh) this).field_N.field_r = "";
        ((qh) this).field_N.a(0, false, gh.field_z);
        ((qh) this).field_N.a(1, false, gh.field_z);
        ((qh) this).field_N.field_p = ((qh) this).field_p + -40;
        ((qh) this).field_N.field_k = (gg) this;
        ((qh) this).field_N.b(var3, 2, -40 + ((qh) this).field_p, 26);
        var3 = var3 + (15 + ((qh) this).field_N.field_l);
        ((qh) this).a(0, (ee) (Object) ((qh) this).field_N);
        int var5 = 4;
        int var6 = 200;
        ((qh) this).field_K.a((byte) 105, 300 + -var6 >> -1189173663, 40, var6, var3);
        ((qh) this).field_K.field_k = (gg) this;
        ((qh) this).a(0, (ee) (Object) ((qh) this).field_K);
        ((qh) this).a((byte) 106, 0, var5 + 55 + var3, 300, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = 0;
        field_O = new boolean[][][]{new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][]};
        field_L = "Waiting for music";
    }
}
