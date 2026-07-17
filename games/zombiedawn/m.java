/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class m extends wb implements ib {
    static String field_B;
    static String field_C;
    static int field_z;
    static vn field_A;

    abstract void o(int param0);

    protected m() {
    }

    final void a(ug param0, byte param1) {
        try {
            pf.field_b = param0;
            ((m) this).b((byte) 116, true);
            ((m) this).i(12);
            ((m) this).f(param1 + -15);
            ((m) this).h((byte) 63);
            ((m) this).d(false);
            ((m) this).g((byte) 122);
            ((m) this).k(-113);
            if (param1 != 14) {
                return;
            }
            try {
                wh.field_d[10] = -1;
                wh.field_d[9] = -1;
                cf.field_eb = new Vector();
                on.a((byte) 6, (ib) this);
            } catch (RuntimeException runtimeException) {
                throw sh.a((Throwable) (Object) runtimeException, "m.NA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        int var5 = ZombieDawn.field_J;
        java.awt.Canvas var2 = uh.e(-122);
        if (uk.a((byte) -44)) {
            dg.a(var2, 0, ck.c(-6376));
            return;
        }
        if (!(qi.field_F)) {
            am.a(var2, (byte) -125);
            return;
        }
        if (!dg.field_b) {
            if (!(po.w(13296))) {
                eh.a(lo.field_p, 100.0f, -1);
                am.a(var2, (byte) -86);
                return;
            }
        }
        wn.field_b = true;
        for (var3 = -1 + cf.field_eb.size(); var3 >= 0; var3--) {
            ((ib) cf.field_eb.elementAt(var3)).a(-14964);
        }
        int var4 = 35 / ((param0 - -27) / 44);
        if (wn.field_b) {
            boolean discarded$1 = rm.a(false);
            uh.a(-126, 0, 0, var2);
        } else {
            this.l(29268);
        }
    }

    abstract boolean n(int param0);

    public abstract void a(int param0);

    private final void p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ib var6 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          var2 = 0;
          if (!we.o((byte) -80)) {
            if (dl.a(false)) {
              if (bg.a(2)) {
                dh.c(256);
                break L0;
              } else {
                L1: {
                  var3 = va.a(true);
                  if (var3 != 2) {
                    if (3 == var3) {
                      cn.a(true, false);
                      break L1;
                    } else {
                      if (var3 != 4) {
                        break L1;
                      } else {
                        mn.a(-1, hi.field_Y, false);
                        hp.field_C = true;
                        break L1;
                      }
                    }
                  } else {
                    re.a((byte) -71);
                    break L1;
                  }
                }
                ((m) this).a(false, false);
                break L0;
              }
            } else {
              if (nk.b(15000)) {
                L2: {
                  stackOut_26_0 = this;
                  stackOut_26_1 = -27698;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  if (null == cn.field_b) {
                    stackOut_28_0 = this;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    break L2;
                  } else {
                    stackOut_27_0 = this;
                    stackOut_27_1 = stackIn_27_1;
                    stackOut_27_2 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    stackIn_29_2 = stackOut_27_2;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = ((m) this).a(stackIn_29_1, stackIn_29_2 != 0);
                    if (var3 == 1) {
                      break L4;
                    } else {
                      if (var3 == 2) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (null != cn.field_b) {
                      re.a((byte) -71);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var3 != 2) {
                    break L3;
                  } else {
                    bo.a(param0 ^ -1869, hc.a(0));
                    break L3;
                  }
                }
                ((m) this).a(false, false);
                break L0;
              } else {
                if (ac.d(param0 ^ 1813)) {
                  if (!bg.a(2)) {
                    L6: {
                      var3 = cg.a(param0 + -1831);
                      if (var3 == 1) {
                        mn.a(-1, vd.field_e, true);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((m) this).a(false, false);
                    break L0;
                  } else {
                    dh.c(256);
                    break L0;
                  }
                } else {
                  if (bg.a(2)) {
                    dh.c(param0 + -1575);
                    break L0;
                  } else {
                    var2 = 1;
                    var3 = -1;
                    L7: while (true) {
                      if (!on.b(param0 ^ -1902)) {
                        break L0;
                      } else {
                        L8: {
                          if (kg.field_i == -1) {
                            if (kg.field_i != -1) {
                              break L8;
                            } else {
                              if (-1 == var3) {
                                break L8;
                              } else {
                                kg.field_i = var3;
                                var3 = -1;
                                break L8;
                              }
                            }
                          } else {
                            if (!dg.a((byte) -116, kg.field_i)) {
                              break L8;
                            } else {
                              var3 = kg.field_i;
                              continue L7;
                            }
                          }
                        }
                        var4 = 0;
                        L9: while (true) {
                          L10: {
                            if (cf.field_eb.size() <= var4) {
                              break L10;
                            } else {
                              if (((ib) cf.field_eb.elementAt(var4)).a(lc.field_c, kg.field_i, 20)) {
                                break L10;
                              } else {
                                var4++;
                                continue L9;
                              }
                            }
                          }
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            ((m) this).a(false, false);
            break L0;
          }
        }
        if (param0 == 1831) {
          var3 = 0;
          L11: while (true) {
            if (~cf.field_eb.size() >= ~var3) {
              return;
            } else {
              L12: {
                var6 = (ib) cf.field_eb.elementAt(var3);
                var6.a(var2 != 0, false);
                stackOut_51_0 = var2;
                stackIn_53_0 = stackOut_51_0;
                stackIn_52_0 = stackOut_51_0;
                if (var6.a((byte) 119)) {
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

    private final void m(int param0) {
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        L0: while (true) {
          if (!gf.a(wh.field_d, (byte) 44)) {
            return;
          } else {
            if (((m) this).a(fj.field_g, l.field_d, 2)) {
              continue L0;
            } else {
              ((m) this).e(-12);
              continue L0;
            }
          }
        }
    }

    abstract boolean a(am param0, int param1, int param2);

    private final void l(int param0) {
    }

    public abstract boolean a(char param0, int param1, int param2);

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bo var5 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param0 == 15) {
            break L0;
          } else {
            lo discarded$1 = m.a((byte) 91, 77, -4, -72);
            break L0;
          }
        }
        L1: {
          if (cn.field_b == null) {
            break L1;
          } else {
            if (cn.field_b.field_a) {
              re.a((byte) -71);
              rj.d(-121);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (cn.field_b == null) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((m) this).b(stackIn_9_1 != 0, false);
          if (!di.field_K) {
            break L3;
          } else {
            pf.field_b.b(81);
            di.field_K = false;
            break L3;
          }
        }
        L4: {
          if (uk.a((byte) -44)) {
            ((m) this).i((byte) 20);
            if (uk.a((byte) -44)) {
              return;
            } else {
              break L4;
            }
          } else {
            break L4;
          }
        }
        L5: {
          this.m(81);
          if (qi.field_F) {
            L6: {
              if (dg.field_b) {
                break L6;
              } else {
                if (!po.w(13296)) {
                  if (pf.field_b.a((byte) 19)) {
                    dg.field_b = true;
                    ((m) this).o(1235);
                    oh.d((byte) -118);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L6;
                }
              }
            }
            this.p(param0 ^ 1832);
            break L5;
          } else {
            wd.b(-91, id.field_I);
            if (pf.field_b.a(false)) {
              pf.field_b.a(22833);
              qi.field_F = true;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L7: {
          if (po.w(13296)) {
            break L7;
          } else {
            L8: while (true) {
              var5 = (bo) (Object) kk.field_j.f(117);
              if (var5 == null) {
                break L7;
              } else {
                i.a(var5, (byte) 7, 4);
                continue L8;
              }
            }
          }
        }
        L9: {
          da.d((byte) -48);
          b.a(0, param0 ^ -90);
          if (!dn.i(-19301)) {
            break L9;
          } else {
            L10: {
              L11: {
                var2 = ((m) this).h(99);
                if (0 == var2) {
                  break L11;
                } else {
                  if (var2 != 1) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              ((m) this).a(var2, param0 + 95);
              break L10;
            }
            L12: {
              var3 = 0;
              if (var2 != 2) {
                break L12;
              } else {
                var3 = 1;
                break L12;
              }
            }
            L13: {
              if (((m) this).n(10)) {
                var3 = 1;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (dn.i(param0 + -19316)) {
                break L14;
              } else {
                var3 = 0;
                break L14;
              }
            }
            if (var3 == 0) {
              break L9;
            } else {
              nc.d((byte) 110);
              break L9;
            }
          }
        }
    }

    public final boolean a(byte param0) {
        if (param0 < 118) {
            Object var3 = null;
            ((m) this).a((ug) null, (byte) 96);
        }
        return true;
    }

    public static void j(byte param0) {
        field_C = null;
        field_B = null;
        if (param0 > -121) {
            lo discarded$0 = m.a((byte) -29, 125, -97, 86);
        }
        field_A = null;
    }

    public abstract void a(boolean param0, boolean param1);

    final static lo a(byte param0, int param1, int param2, int param3) {
        if (param0 > -104) {
            m.j((byte) -31);
        }
        lo var4 = new lo();
        var4.field_k = param3;
        var4.field_o = new int[param1];
        c.field_b.a(0, (le) (Object) var4);
        ga.a(param2, 0, var4);
        return var4;
    }

    abstract void a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 0;
        field_C = "Mouse-over an icon for details";
        field_A = new vn(664, 504);
    }
}
