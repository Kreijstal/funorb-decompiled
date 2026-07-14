/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends g implements md, oi, rf {
    private pl field_C;
    private ig field_I;
    private pl field_K;
    private nd field_D;
    private rg field_M;
    static int field_F;
    private pl field_H;
    ul field_O;
    static int field_L;
    private pl field_N;
    static bd field_E;
    private pl field_G;
    private pl field_B;
    private ig field_J;

    public final void a(byte param0, String param1) {
        pl var3 = ((mj) this).field_N;
        String var4 = param1;
        ((ae) (Object) var3).a((byte) 20, var4, false);
        int var5 = -111 / ((61 - param0) / 62);
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        if (!param3) {
          if (((mj) this).field_J != param2) {
            if (((mj) this).field_I == param2) {
              boolean discarded$2 = this.j(5255);
              return;
            } else {
              return;
            }
          } else {
            cg.a((byte) 122);
            return;
          }
        } else {
          return;
        }
    }

    final static ml i(int param0) {
        if (ok.field_a != o.field_l) {
          if (param0 == 0) {
            if (ta.field_m != o.field_l) {
              return null;
            } else {
              o.field_l = ok.field_a;
              return hi.field_d;
            }
          } else {
            return null;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final boolean h(int param0) {
        if (this.a(10000536, (je) (Object) ((mj) this).field_N)) {
          if (this.a(param0 ^ 10000560, (je) (Object) ((mj) this).field_H)) {
            if (this.a(10000536, (je) (Object) ((mj) this).field_K)) {
              if (this.a(10000536, (je) (Object) ((mj) this).field_G)) {
                if (this.a(10000536, (je) (Object) ((mj) this).field_B)) {
                  if (this.a(10000536, (je) (Object) ((mj) this).field_C)) {
                    if (param0 != 40) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public final void a(int param0) {
        ((ge) (Object) ((mj) this).field_N.a((byte) 56)).a(false);
        int var2 = -120 % ((param0 - 63) / 60);
    }

    final static void a(String param0, String param1, int param2) {
        L0: {
          if (null != ei.field_G) {
            ei.field_G.o(3);
            break L0;
          } else {
            break L0;
          }
        }
        af.field_r = new la(param1, param0, false, true, true);
        if (param2 <= 30) {
          mj.l(116);
          sf.field_f.b((rj) (Object) af.field_r, 23143);
          return;
        } else {
          sf.field_f.b((rj) (Object) af.field_r, 23143);
          return;
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = stellarshard.field_B;
        var3 = -53 / ((25 - param0) / 47);
        if (param2 == null) {
          return false;
        } else {
          var4 = param2.length();
          if (var4 >= 1) {
            if (-13 <= (var4 ^ -1)) {
              var5 = nh.a(param2, false);
              if (var5 == null) {
                return false;
              } else {
                if (-2 >= (var5.length() ^ -1)) {
                  L0: {
                    if (sk.a(var5.charAt(0), -107)) {
                      break L0;
                    } else {
                      if (sk.a(var5.charAt(var5.length() + -1), -114)) {
                        break L0;
                      } else {
                        var6 = 0;
                        var7 = 0;
                        L1: while (true) {
                          if (param2.length() <= var7) {
                            if (var6 <= 0) {
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            L2: {
                              var8 = param2.charAt(var7);
                              if (sk.a((char) var8, -112)) {
                                var6++;
                                break L2;
                              } else {
                                var6 = 0;
                                break L2;
                              }
                            }
                            if (var6 < 2) {
                              var7++;
                              var7++;
                              continue L1;
                            } else {
                              if (!param1) {
                                return false;
                              } else {
                                var7++;
                                continue L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    private final int a(int param0, rj param1, int param2, byte param3, String param4, String param5) {
        if (param3 != -113) {
            ((mj) this).field_I = null;
        }
        return this.a(param4, param2, param5, param1, param0, 35, -2);
    }

    public final void a(int param0, int param1, rg param2, int param3) {
        int var6 = 0;
        var6 = stellarshard.field_B;
        if (param1 == -2) {
          if (param0 != 0) {
            if ((param0 ^ -1) != -2) {
              if (param0 == 2) {
                sf.a("conduct.ws", 12);
                return;
              } else {
                return;
              }
            } else {
              sf.a("privacy.ws", param1 + 14);
              return;
            }
          } else {
            sf.a("terms.ws", 12);
            return;
          }
        } else {
          mj.l(-50);
          if (param0 != 0) {
            if ((param0 ^ -1) != -2) {
              if (param0 != 2) {
                return;
              } else {
                sf.a("conduct.ws", 12);
                return;
              }
            } else {
              sf.a("privacy.ws", param1 + 14);
              return;
            }
          } else {
            sf.a("terms.ws", 12);
            return;
          }
        }
    }

    private final String k(int param0) {
        if (param0 != 120) {
            mj.l(51);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (-99 != (param1 ^ -1)) {
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              return ((mj) this).a(param3, (byte) 123);
            }
          } else {
            return ((mj) this).a(param3, -8666);
          }
        } else {
          return true;
        }
    }

    private final int a(int param0, String param1, rj param2, int param3, int param4) {
        kg var6 = null;
        if (param0 != -31909) {
          ((mj) this).field_M = null;
          var6 = new kg(20, param3, 120 - -param4, 25, param2, false, 120, 3, si.field_V, 16777215, param1);
          ((mj) this).b(param0 ^ -31905, (rj) (Object) var6);
          return var6.field_t;
        } else {
          var6 = new kg(20, param3, 120 - -param4, 25, param2, false, 120, 3, si.field_V, 16777215, param1);
          ((mj) this).b(param0 ^ -31905, (rj) (Object) var6);
          return var6.field_t;
        }
    }

    private final int a(int param0, int param1, rj param2, String param3, int param4) {
        ii var7 = null;
        kg var8 = null;
        var8 = new kg(20, param1, 120 - -param4, 25, param2, false, 120, 3, si.field_V, 16777215, param3);
        if (param0 != -17073) {
          ((mj) this).field_O = null;
          ((mj) this).b(4, (rj) (Object) var8);
          var7 = new ii(((je) (Object) param2).a((byte) 38));
          ((mj) this).b(4, (rj) (Object) var7);
          var7.b(15, var8.field_p + var8.field_w + 3, var8.field_k - -(var8.field_t - 15 >> 1761851521), 15, 23987);
          return var8.field_t;
        } else {
          ((mj) this).b(4, (rj) (Object) var8);
          var7 = new ii(((je) (Object) param2).a((byte) 38));
          ((mj) this).b(4, (rj) (Object) var7);
          var7.b(15, var8.field_p + var8.field_w + 3, var8.field_k - -(var8.field_t - 15 >> 1761851521), 15, 23987);
          return var8.field_t;
        }
    }

    public mj() {
        super(0, 0, 496, 0, (uk) null);
        ((mj) this).field_N = new pl("", (lf) null, 12);
        ((mj) this).field_H = new pl("", (lf) null, 100);
        ((mj) this).field_K = new pl("", (lf) null, 100);
        ((mj) this).field_G = new pl("", (lf) null, 20);
        ((mj) this).field_B = new pl("", (lf) null, 20);
        ((mj) this).field_C = new pl("", (lf) null, 3);
        int var1 = 1;
        ((mj) this).field_D = new nd("", (lf) null, var1 != 0);
        ((mj) this).field_I = new ig(ta.field_k, (lf) null);
        ((mj) this).field_J = new ig(bc.field_h, (lf) null);
        ((mj) this).field_N.field_x = fc.field_d;
        ((mj) this).field_H.field_x = fk.field_r;
        ((mj) this).field_K.field_x = ib.field_m;
        ((mj) this).field_G.field_x = wg.field_d;
        ((mj) this).field_B.field_x = bi.field_t;
        ((mj) this).field_C.field_x = si.field_B;
        ((mj) this).field_D.field_x = ci.field_c;
        ((mj) this).field_N.a((byte) -2, (w) (Object) new ge((ae) (Object) ((mj) this).field_N));
        ((mj) this).field_H.a((byte) -2, (w) (Object) new qb((ae) (Object) ((mj) this).field_H));
        ((mj) this).field_K.a((byte) -2, (w) (Object) new ef((ae) (Object) ((mj) this).field_K, (ae) (Object) ((mj) this).field_H));
        ((mj) this).field_G.a((byte) -2, (w) (Object) new lc((ae) (Object) ((mj) this).field_G, (ae) (Object) ((mj) this).field_N, (ae) (Object) ((mj) this).field_H));
        ((mj) this).field_B.a((byte) -2, (w) (Object) new ea((ae) (Object) ((mj) this).field_B, (ae) (Object) ((mj) this).field_G));
        ((mj) this).field_C.a((byte) -2, (w) (Object) new kk((ae) (Object) ((mj) this).field_C));
        ((mj) this).field_I.field_E = false;
        ((mj) this).field_I.field_u = (uk) (Object) new b();
        ((mj) this).field_J.field_u = (uk) (Object) new ll();
        ((mj) this).field_N.field_u = (uk) (Object) new vg(10000536);
        ((mj) this).field_K.field_u = (uk) (Object) new vg(10000536);
        ((mj) this).field_H.field_u = (uk) (Object) new vg(10000536);
        ((mj) this).field_C.field_u = (uk) (Object) new vg(10000536);
        ((mj) this).field_D.field_u = (uk) (Object) new kf();
        ((mj) this).field_B.field_u = (uk) (Object) new il(10000536);
        ((mj) this).field_G.field_u = (uk) (Object) new il(10000536);
        String var2 = h.a(hk.field_v, 0, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(-31909, t.field_b, (rj) (Object) ((mj) this).field_H, var3, 170);
        var3 = var3 + (this.a("", var3, ca.field_a, (rj) (Object) ((mj) this).field_K, 170, 20, -2) + 5);
        var3 = var3 + this.a(-31909, th.field_b, (rj) (Object) ((mj) this).field_G, var3, 170);
        var3 = var3 + (this.a(170, (rj) (Object) ((mj) this).field_B, var3, (byte) -113, u.field_l, ta.field_l) - -5);
        var3 = var3 + (5 + this.a(170, (rj) (Object) ((mj) this).field_N, var3, (byte) -113, nk.field_h, si.field_I));
        var3 = var3 + this.a(-17073, var3, (rj) (Object) ((mj) this).field_C, vd.field_c, 170);
        kg var4 = new kg(46, var3, ((mj) this).field_p - 90, 25, (rj) (Object) ((mj) this).field_D, true, ((mj) this).field_p + -120, 5, de.field_c, 11579568, nf.field_o);
        ((mj) this).b(4, (rj) (Object) var4);
        var3 = var3 + var4.field_t;
        id var5 = new id(si.field_V, 0, 0, 0, 0, 16777215, -1, 0, 0, si.field_V.field_N, -1, 2147483647, true);
        ((mj) this).field_M = new rg(var2, (uk) (Object) var5);
        ((mj) this).field_M.field_x = "";
        ((mj) this).field_M.a(ni.field_b, 0, 1);
        ((mj) this).field_M.a(ni.field_b, 1, 1);
        ((mj) this).field_M.field_v = (lf) this;
        ((mj) this).field_M.b(((mj) this).field_p - 90, (byte) -11, 46, var3);
        var3 = var3 + (((mj) this).field_M.field_t + 15);
        ((mj) this).b(4, (rj) (Object) ((mj) this).field_M);
        int var6 = 4;
        int var7 = 200;
        ((mj) this).field_I.b(var7, -var7 + 496 >> 171315585, var3, 40, 23987);
        ((mj) this).field_J.b(60, 3 + var6, 15 + var3, 40, 23987);
        ((mj) this).field_J.field_v = (lf) this;
        ((mj) this).field_I.field_v = (lf) this;
        ((mj) this).b(4, (rj) (Object) ((mj) this).field_I);
        ((mj) this).b(4, (rj) (Object) ((mj) this).field_J);
        ((mj) this).field_O = new ul((rf) this);
        ((mj) this).field_O.b(-60 + -((mj) this).field_N.field_p + -((mj) this).field_N.field_w + ((mj) this).field_p, 60 + ((mj) this).field_N.field_w - -((mj) this).field_N.field_p, 20 + ((mj) this).field_N.field_k, 150, 23987);
        ((mj) this).b(4, (rj) (Object) ((mj) this).field_O);
        ((mj) this).b(496, 0, 0, var3 - (-55 + -var6), 23987);
    }

    private final int a(String param0, int param1, String param2, rj param3, int param4, int param5, int param6) {
        kg var10 = new kg(20, param1, param4 + 120, 25, param3, false, 120, 3, si.field_V, 16777215, param2);
        ((mj) this).b(param6 ^ -6, (rj) (Object) var10);
        if (param6 != -2) {
            ((mj) this).field_G = null;
        }
        cd var9 = new cd(((je) (Object) param3).a((byte) 105), param0, 126, param1 + var10.field_t, 50 + param4, param5);
        var9.field_v = (lf) this;
        ((mj) this).b(param6 ^ -6, (rj) (Object) var9);
        return var9.field_t + var10.field_t;
    }

    private final boolean j(int param0) {
        NumberFormatException numberFormatException = null;
        int var2 = 0;
        Object var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (this.h(40)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    var2 = -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var2 = Integer.parseInt(((mj) this).field_C.field_m);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    numberFormatException = (NumberFormatException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param0 != 5255) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return wd.a(var2, ((mj) this).field_D.field_z, 5, ((mj) this).field_H.field_m, ((mj) this).field_G.field_m, ((mj) this).field_N.field_m, (mj) this);
                }
                case 8: {
                    var4 = null;
                    ((mj) this).a(-3, false, -41, (rj) null);
                    return wd.a(var2, ((mj) this).field_D.field_z, 5, ((mj) this).field_H.field_m, ((mj) this).field_G.field_m, ((mj) this).field_N.field_m, (mj) this);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, je param1) {
        w var3 = null;
        cg var4 = null;
        if (param0 == 10000536) {
          var3 = param1.a((byte) 43);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.b(-28036);
            if (qj.field_c != var4) {
              if (var4 != eh.field_c) {
                if (var4 == sf.field_a) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          ((mj) this).field_N = null;
          var3 = param1.a((byte) 43);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.b(-28036);
            if (qj.field_c != var4) {
              if (var4 != eh.field_c) {
                if (var4 == sf.field_a) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    public static void l(int param0) {
        field_E = null;
        if (param0 != 120) {
            Object var2 = null;
            mj.a((String) null, (String) null, 64);
        }
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        super.a(param0, param1, param2, param3);
        ((mj) this).field_I.field_E = this.h(40);
    }

    private final String e(byte param0) {
        Object var3 = null;
        if (param0 < 87) {
          var3 = null;
          int discarded$2 = this.a(-39, (String) null, (rj) null, 36, -97);
          return "</col></u>";
        } else {
          return "</col></u>";
        }
    }

    static {
    }
}
