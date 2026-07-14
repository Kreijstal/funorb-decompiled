/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wj extends gk implements vn {
    static ia field_Ob;
    static w field_Mb;
    static sm field_Qb;
    private boolean field_Pb;
    private tf field_Nb;
    static String field_Kb;
    private boolean field_Rb;
    static sk field_Jb;
    static int field_Lb;

    final boolean h(byte param0) {
        cd var2 = null;
        if (param0 <= 15) {
            ((wj) this).field_Nb = null;
        }
        if (((wj) this).field_S) {
            if (!((wj) this).field_Pb) {
                var2 = je.a(13);
                if (var2 != null) {
                    this.a(false, var2, false);
                }
            }
        }
        return super.h((byte) 117);
    }

    final static void q(int param0) {
        mg.field_Nb = false;
        int var1 = -22 % ((-14 - param0) / 35);
        vb.field_Z = false;
        hm.a(-1, (byte) -122);
        ka.field_P = uc.field_c;
        sh.field_d = uc.field_c;
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        if (((wj) this).field_Rb) {
            dd.a(false, true, (byte) 66);
            return;
        }
        in.c((byte) -51);
        ((wj) this).n(-128);
        if (param0 != 67) {
            field_Jb = null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, String param5) {
        de.a(param4, -5540, param5, param0, param2);
        fe.field_b = param3;
        im.field_f = !param2 ? true : false;
        if (param1 >= -70) {
            Object var7 = null;
            wj.a((ck) null, 81);
        }
    }

    final static void a(boolean param0, java.awt.Frame param1, fd param2) {
        mh var3 = null;
        int var4 = 0;
        L0: {
          var4 = client.field_A ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            wj.q(92);
            break L0;
          }
        }
        L1: while (true) {
          var3 = param2.a(75254128, param1);
          L2: while (true) {
            if (-1 != (var3.field_c ^ -1)) {
              if ((var3.field_c ^ -1) == -2) {
                param1.setVisible(false);
                param1.dispose();
                return;
              } else {
                ua.a(100L, -128);
                continue L1;
              }
            } else {
              ua.a(10L, -128);
              continue L2;
            }
          }
        }
    }

    final static void c(int param0, int param1) {
        try {
            if (qc.field_s != null) {
                // iflt L30
                // if_acmpne L22
            } else {
                we.field_b.field_n = 0;
                return;
            }
            if (we.field_b.field_n == 0) {
                if (!(ik.a(4) <= 10000L + el.field_J)) {
                    we.field_b.f(param1, -4);
                }
            }
            if (param0 != 4792) {
                field_Kb = null;
            }
            if (-1 > (we.field_b.field_n ^ -1)) {
                try {
                    qc.field_s.a(0, we.field_b.field_n, 1, we.field_b.field_r);
                    el.field_J = ik.a(param0 ^ 4796);
                } catch (IOException iOException) {
                    si.a(100);
                }
                we.field_b.field_n = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    wj(ka param0, tf param1) {
        super(param0, ec.field_p, cm.field_i, false, false);
        ((wj) this).field_Nb = param1;
    }

    private final void a(boolean param0, cd param1, boolean param2) {
        String var4 = null;
        dj var5 = null;
        int var6 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          ((wj) this).field_Pb = true;
          if (param1.field_n) {
            var4 = wf.field_k;
            break L0;
          } else {
            if (null != param1.field_d) {
              var4 = of.field_g;
              if (((wj) this).field_Nb != null) {
                ((wj) this).field_Nb.a(25);
                break L0;
              } else {
                break L0;
              }
            } else {
              var4 = param1.field_f;
              if (param1.field_h == 248) {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    k.a((byte) -36);
                    break L1;
                  }
                }
                ((wj) this).field_Rb = true;
                var4 = ab.field_d;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          var5 = new dj((gk) this, ec.field_p, var4);
          if (!param1.field_n) {
            L3: {
              if (!((wj) this).field_Rb) {
                if (-6 == (param1.field_h ^ -1)) {
                  var5.a(pb.field_e, 11, 14);
                  var5.a(ig.field_Tb, 17, 14);
                  break L3;
                } else {
                  var5.a(bl.field_X, -1, 14);
                  break L3;
                }
              } else {
                ek discarded$2 = var5.a(115, fa.field_o, (kg) this);
                break L3;
              }
            }
            if (-4 == param1.field_h) {
              var5.a(ce.field_z, 7, 14);
              break L2;
            } else {
              if (-7 != param1.field_h) {
                break L2;
              } else {
                var5.a(vb.field_Y, 9, 14);
                break L2;
              }
            }
          } else {
            if (!param1.field_e) {
              ek discarded$3 = var5.a(119, fa.field_o, (kg) this);
              break L2;
            } else {
              ((wj) this).c((ce) (Object) new md((wj) this), (byte) 79);
              return;
            }
          }
        }
        L4: {
          ((wj) this).c((ce) (Object) var5, (byte) 68);
          if (!param2) {
            break L4;
          } else {
            field_Lb = 4;
            break L4;
          }
        }
    }

    final void b(boolean param0) {
        this.a(param0, un.a(248, ab.field_d, -12), false);
    }

    public static void s(int param0) {
        field_Ob = null;
        field_Qb = null;
        field_Mb = null;
        field_Kb = null;
        if (param0 != 0) {
            Object var2 = null;
            wj.a(true, (java.awt.Frame) null, (fd) null);
        }
        field_Jb = null;
    }

    final static boolean r(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 17) {
          L0: {
            L1: {
              if (li.field_b == null) {
                break L1;
              } else {
                if (!li.field_b.b(0)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static hl a(byte param0, int param1, int param2, int param3) {
        hl var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        hl var8_ref_hl = null;
        int var9 = 0;
        hl var9_ref_hl = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        var13 = client.field_A ? 1 : 0;
        var4 = null;
        dn.field_l.field_Ob.field_M.c(115);
        var5 = 0;
        var6 = 0;
        var7 = ic.field_c - 1;
        L0: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            if (param0 == 55) {
              L1: while (true) {
                if (var8 >= ic.field_c) {
                  L2: {
                    var8 = -var7 + var6 + (dn.field_l.field_Ob.field_F + dn.field_l.field_Ob.field_N);
                    dn.field_l.field_Ob.field_N = dn.field_l.field_Ob.field_N - var8;
                    dn.field_l.field_Ob.field_Ib = dn.field_l.field_Ob.field_Ib + var8;
                    if (rg.field_c) {
                      dn.field_l.field_Ob.field_N = var7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (!rg.field_c) {
                      break L3;
                    } else {
                      rg.field_c = false;
                      sc.field_m = true;
                      dn.field_l.field_Ob.field_Ib = dn.field_l.field_Rb.field_N + -dn.field_l.field_Ob.field_N;
                      dn.field_l.field_Ob.field_Mb = 0;
                      break L3;
                    }
                  }
                  L4: {
                    dn.field_l.field_Ob.field_F = var7 - dn.field_l.field_Ob.field_N;
                    if (!jg.field_i) {
                      break L4;
                    } else {
                      if (tf.field_gb != null) {
                        sc.field_m = true;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var9 = -dn.field_l.field_Ob.field_F - (dn.field_l.field_Ob.field_N - dn.field_l.field_Rb.field_N);
                    if (!sc.field_m) {
                      break L5;
                    } else {
                      dn.field_l.field_Ob.field_Mb = -dn.field_l.field_Ob.field_Ib + var9;
                      break L5;
                    }
                  }
                  L6: {
                    dn.field_l.a(2 * param1 * param2, true, true, param1);
                    if (var9 != dn.field_l.field_Ob.field_Ib - -dn.field_l.field_Ob.field_Mb) {
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L6;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L6;
                    }
                  }
                  sc.field_m = stackIn_41_0 != 0;
                  return var4;
                } else {
                  var9_ref_hl = pd.field_g[var8];
                  if (null != var9_ref_hl.field_f) {
                    dn.field_l.field_Ob.a(var9_ref_hl.field_f, -16834);
                    var9_ref_hl.field_f.a(var9_ref_hl.field_f.a(true), 0, var7, param1, param3);
                    var7 = var7 + param1;
                    if (var9_ref_hl.field_f.field_ob != 0) {
                      var4 = var9_ref_hl;
                      var8++;
                      continue L1;
                    } else {
                      var8++;
                      continue L1;
                    }
                  } else {
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            L7: {
              var8_ref_hl = pd.field_g[var7];
              var9 = 0;
              if (wc.field_n) {
                break L7;
              } else {
                if (var5 < kf.field_M) {
                  var10_int = rf.a(0, var8_ref_hl.field_m);
                  if (var8_ref_hl.b((byte) 94) < var10_int) {
                    break L7;
                  } else {
                    L8: {
                      if (var8_ref_hl.field_j) {
                        break L8;
                      } else {
                        if (!ik.a(var8_ref_hl.field_o, (byte) -118)) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var9 = 1;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
            }
            if (var9 != 0) {
              L9: {
                if (var8_ref_hl.field_f == null) {
                  break L9;
                } else {
                  if (rg.field_c) {
                    break L9;
                  } else {
                    var5++;
                    var7--;
                    continue L0;
                  }
                }
              }
              L10: {
                if (null == var8_ref_hl.field_f) {
                  bg.field_b = bg.field_b + 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              var10 = mb.a(106, var8_ref_hl);
              var11 = var10 + mm.c(var8_ref_hl.field_h);
              var12 = tc.a(param0 ^ 4651, var8_ref_hl);
              var8_ref_hl.field_f = new w(0L, fj.field_g, var11);
              var6 = var6 + param1;
              var8_ref_hl.field_f.field_J = ff.field_o;
              var8_ref_hl.field_f.field_fb = var12 - ((16711422 & var12) >> 1796712545) - -((fj.field_g.field_fb & 16711422) >> -1751457759);
              var8_ref_hl.field_f.field_G = var12;
              var8_ref_hl.field_f.field_Bb = ((16711423 & fj.field_g.field_Bb) >> 369179521) + -((16711423 & var12) >> -1720740735) + var12;
              var5++;
              var7--;
              continue L0;
            } else {
              var8_ref_hl.field_f = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    final static void a(ck param0, int param1) {
        pe.field_d = param0;
        if (param1 != 369179521) {
            field_Lb = -2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Kb = "Accept unrated rematch";
        field_Jb = new sk(1);
    }
}
