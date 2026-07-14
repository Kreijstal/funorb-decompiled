/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sa extends qg implements vc {
    static boolean field_E;

    public abstract void a(boolean param0, byte param1);

    private final void j(boolean param0) {
        int var3 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_4_0;
        Object stackOut_6_0;
        int stackOut_6_1;
        Object stackOut_5_0;
        int stackOut_5_1;
        var3 = BrickABrac.field_J ? 1 : 0;
        L0: while (true) {
          if (!nl.a(ch.field_g, (byte) 64)) {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_E = false;
                break L1;
              }
            }
            return;
          } else {
            if (!((sa) this).a(jl.field_e, (byte) 47, si.field_a)) {
              L2: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param0) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L2;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L2;
                }
              }
              ((sa) this).h(stackIn_7_1 != 0);
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        param0 = param0 & 8191;
        if ((param0 ^ -1) <= param1) {
            return -6145 >= (param0 ^ -1) ? -um.field_j[8192 + -param0] : -um.field_j[-4096 + param0];
        }
        return -2049 < (param0 ^ -1) ? um.field_j[param0] : um.field_j[4096 - param0];
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        int stackOut_8_0;
        int stackOut_9_0;
        if ((dc.field_b ^ -1) == -14) {
          th.b(param1 ^ 103);
          return true;
        } else {
          if (dc.field_b == param1) {
            hd.field_a.f((byte) 41);
            return true;
          } else {
            L0: {
              L1: {
                if (hd.field_a == null) {
                  break L1;
                } else {
                  if (!hd.field_a.a(param2, param0, (byte) -126)) {
                    break L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L0;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    public abstract void a(int param0);

    abstract void b(int param0, int param1);

    public abstract boolean a(int param0, char param1, int param2);

    private final void i(boolean param0) {
        if (param0) {
            ((sa) this).f(-67);
        }
    }

    final void g(int param0) {
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        java.awt.Canvas var2 = gd.a((byte) 0);
        if (!(!r.c((byte) -84))) {
            pk.a((byte) 68, var2, mj.a((byte) -81));
            return;
        }
        if (!(un.field_f)) {
            kn.a(true, var2);
            return;
        }
        if (!og.h(-26090)) {
            ai.a((byte) 24, 100.0f, qm.field_e);
            kn.a(true, var2);
            return;
        }
        pe.field_i = true;
        for (var3 = kp.field_d.size() + -1; var3 >= 0; var3--) {
            ((vc) kp.field_d.elementAt(var3)).a(16769381);
        }
        if (param0 <= 93) {
            field_E = false;
        }
        if (pe.field_i) {
            boolean discarded$1 = jj.a((byte) -123);
            ck.a(var2, 0, 14209, 0);
        } else {
            this.i(false);
        }
    }

    protected sa() {
    }

    final void a(int param0, wb param1) {
        al.field_j = param1;
        ((sa) this).a(8, true);
        ((sa) this).l(param0 ^ 3156);
        ((sa) this).i(2);
        ((sa) this).e(true);
        ((sa) this).b((byte) -67);
        if (param0 != 3160) {
            return;
        }
        ((sa) this).j(64);
        ((sa) this).c((byte) -19);
        ch.field_g[9] = -1;
        ch.field_g[10] = -1;
        kp.field_d = new Vector();
        op.a((vc) this, 0);
    }

    abstract boolean a(pi param0, byte param1, int param2);

    final static void a(int param0, bi param1, String param2, int param3, int param4, int param5, int param6) {
        int var7 = (-param1.field_B + (param4 + (2 * param0 - param1.field_L))) / 2;
        int var8 = -69 / ((param6 - -85) / 40);
        nn.field_g.b(param2, param3, var7 + nn.field_g.field_B, param5, -1);
    }

    private final void r(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vc var6 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        Object stackOut_14_0;
        Object stackOut_16_0;
        int stackOut_16_1;
        Object stackOut_15_0;
        int stackOut_15_1;
        int stackOut_51_0;
        int stackOut_53_0;
        int stackOut_53_1;
        int stackOut_52_0;
        int stackOut_52_1;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 10) {
          L0: {
            var2 = 0;
            if (m.a(2)) {
              ((sa) this).a(false, (byte) 28);
              break L0;
            } else {
              if (!lg.a(9)) {
                if (!dj.c((byte) -33)) {
                  if (!uc.f(21651)) {
                    if (me.b(-34)) {
                      nk.a(114);
                      break L0;
                    } else {
                      var2 = 1;
                      var3 = -1;
                      L1: while (true) {
                        if (!jl.a((byte) 5)) {
                          break L0;
                        } else {
                          L2: {
                            if (dc.field_b != -1) {
                              if (!uf.b(-102, dc.field_b)) {
                                break L2;
                              } else {
                                var3 = dc.field_b;
                                continue L1;
                              }
                            } else {
                              if (-1 != dc.field_b) {
                                break L2;
                              } else {
                                if (var3 != -1) {
                                  dc.field_b = var3;
                                  var3 = -1;
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                          var4 = 0;
                          L3: while (true) {
                            L4: {
                              if ((var4 ^ -1) <= (kp.field_d.size() ^ -1)) {
                                break L4;
                              } else {
                                if (((vc) kp.field_d.elementAt(var4)).a(dc.field_b, go.field_b, -81)) {
                                  break L4;
                                } else {
                                  var4++;
                                  continue L3;
                                }
                              }
                            }
                            continue L1;
                          }
                        }
                      }
                    }
                  } else {
                    if (me.b(param0 ^ -16)) {
                      nk.a(param0 + 47);
                      break L0;
                    } else {
                      L5: {
                        var3 = vh.h(0);
                        if (1 != var3) {
                          break L5;
                        } else {
                          he.a(mq.field_a, true, (byte) 97);
                          break L5;
                        }
                      }
                      ((sa) this).a(false, (byte) 7);
                      break L0;
                    }
                  }
                } else {
                  L6: {
                    stackOut_14_0 = this;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (ua.field_d == null) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L6;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var3 = ((sa) this).b(stackIn_17_1 != 0, (byte) -118);
                      if (1 == var3) {
                        break L8;
                      } else {
                        if ((var3 ^ -1) == -3) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (null != ua.field_d) {
                        nc.b(118);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if ((var3 ^ -1) != -3) {
                      break L7;
                    } else {
                      nk.a(param0 ^ 2058, uc.e((byte) -85));
                      break L7;
                    }
                  }
                  ((sa) this).a(false, (byte) 81);
                  break L0;
                }
              } else {
                if (me.b(126)) {
                  nk.a(58);
                  break L0;
                } else {
                  L10: {
                    var3 = md.f((byte) 124);
                    if (var3 == 2) {
                      nc.b(102);
                      break L10;
                    } else {
                      if (var3 != 3) {
                        if (var3 != 4) {
                          break L10;
                        } else {
                          he.a(qn.field_k, false, (byte) 61);
                          wi.field_g = true;
                          break L10;
                        }
                      } else {
                        cp.a(true, 21543);
                        break L10;
                      }
                    }
                  }
                  ((sa) this).a(false, (byte) 69);
                  break L0;
                }
              }
            }
          }
          var3 = 0;
          L11: while (true) {
            if (var3 >= kp.field_d.size()) {
              return;
            } else {
              L12: {
                var6 = (vc) kp.field_d.elementAt(var3);
                var6.a(var2 != 0, (byte) -126);
                stackOut_51_0 = var2;
                stackIn_53_0 = stackOut_51_0;
                stackIn_52_0 = stackOut_51_0;
                if (var6.b(59)) {
                  stackOut_53_0 = stackIn_53_0;
                  stackOut_53_1 = 0;
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  break L12;
                } else {
                  stackOut_52_0 = stackIn_52_0;
                  stackOut_52_1 = 1;
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  break L12;
                }
              }
              var2 = stackIn_54_0 & stackIn_54_1;
              var3++;
              continue L11;
            }
          }
        } else {
          return;
        }
    }

    final static String a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; param2 > var4; var4++) {
            var6[var4] = param0;
        }
        var4 = -55 / ((param1 - 75) / 40);
        return new String(var3);
    }

    abstract void p(int param0);

    public final boolean b(int param0) {
        if (param0 < 36) {
            return true;
        }
        return true;
    }

    abstract boolean q(int param0);

    final static void a(byte param0, jp param1, int param2, int param3, jp param4, jp param5, int param6, int param7, int param8, int param9) {
        param5.d((param6 * 5 >> -1649660336) + ((-param5.field_x + param7) / 2 + param9), param2);
        param4.c(param9 + (param7 - param4.field_x) / 2 - (-(param6 * 10 >> 526831088) + -(10 / param3)), 480 + (param8 + (param2 - param4.field_z)));
        if (param0 <= 79) {
            Object var11 = null;
            sa.a((byte) 75, (jp) null, -80, -107, (jp) null, (jp) null, 10, 97, -30, 44);
        }
        param1.c(10 / param3 + (param9 - (-((-param1.field_x + param7) / 2) + -(20 * param6 >> -2016118800))), 480 + (param2 + param8 - param1.field_z));
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_4_0;
        Object stackOut_6_0;
        int stackOut_6_1;
        Object stackOut_5_0;
        int stackOut_5_1;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (null == ua.field_d) {
            break L0;
          } else {
            if (ua.field_d.field_e) {
              nc.b(84);
              ee.c(4);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          stackOut_4_0 = this;
          stackIn_6_0 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if (ua.field_d == null) {
            stackOut_6_0 = this;
            stackOut_6_1 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          } else {
            stackOut_5_0 = this;
            stackOut_5_1 = 1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            break L1;
          }
        }
        L2: {
          ((sa) this).b(stackIn_7_1 != 0, 1);
          if (param0 < -34) {
            break L2;
          } else {
            field_E = false;
            break L2;
          }
        }
        L3: {
          if (!lo.field_d) {
            break L3;
          } else {
            al.field_j.b(true);
            lo.field_d = false;
            break L3;
          }
        }
        L4: {
          if (r.c((byte) -87)) {
            ((sa) this).g(false);
            if (!r.c((byte) -113)) {
              break L4;
            } else {
              return;
            }
          } else {
            break L4;
          }
        }
        L5: {
          this.j(true);
          if (un.field_f) {
            if (!og.h(-26090)) {
              if (al.field_j.a(23570)) {
                um.field_t = true;
                ((sa) this).p(1);
                mc.a((byte) 126);
                break L5;
              } else {
                break L5;
              }
            } else {
              this.r(10);
              break L5;
            }
          } else {
            gk.a(qc.field_o, (byte) 112);
            if (!al.field_j.a((byte) -54)) {
              break L5;
            } else {
              al.field_j.a(false);
              un.field_f = true;
              break L5;
            }
          }
        }
        L6: {
          if (og.h(-26090)) {
            break L6;
          } else {
            L7: while (true) {
              var5 = (e) (Object) lp.field_wb.c(3);
              if (var5 != null) {
                df.a(var5, 4, -161);
                continue L7;
              } else {
                break L6;
              }
            }
          }
        }
        L8: {
          fk.a(14114);
          tm.a((byte) 110, 0);
          if (!ui.a(false)) {
            break L8;
          } else {
            L9: {
              L10: {
                var2 = ((sa) this).o(-105);
                if (0 == var2) {
                  break L10;
                } else {
                  if (-2 == (var2 ^ -1)) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              ((sa) this).b(var2, 1);
              break L9;
            }
            L11: {
              var3 = 0;
              if (-3 == (var2 ^ -1)) {
                var3 = 1;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (((sa) this).q(73)) {
                var3 = 1;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (ui.a(false)) {
                break L13;
              } else {
                var3 = 0;
                break L13;
              }
            }
            if (var3 == 0) {
              break L8;
            } else {
              qb.g(115);
              break L8;
            }
          }
        }
    }

    static {
    }
}
