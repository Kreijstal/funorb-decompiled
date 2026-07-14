/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends vd implements kn, qk {
    private ph field_H;
    static vl field_J;
    private ph field_E;
    private sf field_G;
    static int field_F;
    mc field_I;

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6 = 0;
        if (((ij) this).field_H != param3) {
          if (((ij) this).field_E != param3) {
            var6 = -57 % ((-63 - param4) / 52);
            return;
          } else {
            this.j(496);
            var6 = -57 % ((-63 - param4) / 52);
            return;
          }
        } else {
          fa.a(5109);
          var6 = -57 % ((-63 - param4) / 52);
          return;
        }
    }

    public static void e(byte param0) {
        field_J = null;
        if (param0 != 75) {
            field_J = null;
        }
    }

    private final boolean l(int param0) {
        if (!this.a((sk) (Object) ((ij) this).field_G, (byte) -99)) {
          return false;
        } else {
          if (param0 != -6790) {
            ((ij) this).field_H = null;
            return true;
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        Object var6 = null;
        if (!super.a(param0 ^ 0, param1, param2, param3)) {
          if (param2 != -99) {
            if (-100 != param2) {
              if (param0 != 274) {
                var6 = null;
                ((ij) this).a(true, (String) null);
                return false;
              } else {
                return false;
              }
            } else {
              return ((ij) this).b((byte) 115, param1);
            }
          } else {
            return ((ij) this).a(param1, (byte) 113);
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = HostileSpawn.field_I ? 1 : 0;
          si.a(param3, param2, param1 + 1, 10000536);
          si.a(param3, param2 + param0, param1 + 1, 12105912);
          var5 = 1;
          if (si.field_j <= param2 + var5) {
            break L0;
          } else {
            var5 = si.field_j - param2;
            break L0;
          }
        }
        if (param4) {
          L1: {
            field_J = null;
            var6 = param0;
            if (si.field_a >= var6 + param2) {
              break L1;
            } else {
              var6 = si.field_a - param2;
              break L1;
            }
          }
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 - -(var7 * 48 / param0);
              var9 = var8 | (var8 << -1825260568 | var8 << 1372072944);
              si.field_i[si.field_e * (param2 - -var7) + param3] = var9;
              si.field_i[param1 + (param3 + si.field_e * (param2 + var7))] = var9;
              var7++;
              continue L2;
            }
          }
        } else {
          L3: {
            var6 = param0;
            if (si.field_a >= var6 + param2) {
              break L3;
            } else {
              var6 = si.field_a - param2;
              break L3;
            }
          }
          var7 = var5;
          L4: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 - -(var7 * 48 / param0);
              var9 = var8 | (var8 << -1825260568 | var8 << 1372072944);
              si.field_i[si.field_e * (param2 - -var7) + param3] = var9;
              si.field_i[param1 + (param3 + si.field_e * (param2 + var7))] = var9;
              var7++;
              continue L4;
            }
          }
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((ij) this).field_E.field_D = this.l(param2 ^ -6790);
    }

    final static int k(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var1 = w.field_r;
          if (-1 <= (sg.field_i ^ -1)) {
            break L0;
          } else {
            var1 = var1 + w.field_r * 5000 / sg.field_i;
            break L0;
          }
        }
        vj.field_s = var1;
        var2 = fl.d(-64);
        if (n.field_s < var2) {
          if (-1 <= (um.field_e ^ -1)) {
            L1: {
              if (-1 < eh.field_g) {
                if (var2 < n.field_s) {
                  return 0;
                } else {
                  break L1;
                }
              } else {
                if (-5 != mc.field_I) {
                  um.field_e = 100;
                  n.field_s = n.field_s + 1;
                  if ((n.field_s ^ -1) != -11) {
                    L2: {
                      if ((n.field_s ^ -1) == -18) {
                        ti.a(251, (byte) -126, 4);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    eh.field_c.a(fg.field_b[18], 100, uh.field_i);
                    break L1;
                  } else {
                    L3: {
                      ti.a(252, (byte) -110, 3);
                      if ((n.field_s ^ -1) == -18) {
                        ti.a(251, (byte) -126, 4);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    eh.field_c.a(fg.field_b[18], 100, uh.field_i);
                    if (19 != var2) {
                      if (param0 > -6) {
                        return -74;
                      } else {
                        return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  if (var2 < n.field_s) {
                    return 0;
                  } else {
                    if (19 != var2) {
                      if (param0 > -6) {
                        return -74;
                      } else {
                        return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
                      }
                    } else {
                      return 0;
                    }
                  }
                }
              }
            }
            if (19 != var2) {
              if (param0 > -6) {
                return -74;
              } else {
                return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
              }
            } else {
              return 0;
            }
          } else {
            if (var2 < n.field_s) {
              return 0;
            } else {
              if (19 != var2) {
                if (param0 > -6) {
                  return -74;
                } else {
                  return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
                }
              } else {
                return 0;
              }
            }
          }
        } else {
          if (var2 < n.field_s) {
            return 0;
          } else {
            if (19 != var2) {
              if (param0 > -6) {
                return -74;
              } else {
                return 512 * (-pm.field_g[var2] + var1) / (-pm.field_g[var2] + pm.field_g[1 + var2]);
              }
            } else {
              return 0;
            }
          }
        }
    }

    public final void a(boolean param0, String param1) {
        sf var3 = ((ij) this).field_G;
        String var4 = param1;
        if (!param0) {
            return;
        }
        ((ig) (Object) var3).a((byte) 91, false, var4);
    }

    private final boolean a(sk param0, byte param1) {
        bg var3 = null;
        bm var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = param0.a((byte) -51);
        if (var3 != null) {
          if (param1 > -30) {
            return false;
          } else {
            L0: {
              var4 = var3.b(-86);
              if (nd.field_d != var4) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    private final int a(String param0, String param1, byte param2, int param3, int param4, ag param5, int param6) {
        nh var11 = new nh(20, param3, param4 + 120, 25, param5, false, 120, 3, jd.field_s, 16777215, param1);
        ((ij) this).a(51448, (ag) (Object) var11);
        int var10 = -125 % ((-75 - param2) / 51);
        al var9 = new al(((sk) (Object) param5).a((byte) -106), param0, 126, param3 + var11.field_x, 25 + param4, param6);
        var9.field_p = (mh) this;
        ((ij) this).a(51448, (ag) (Object) var9);
        return var9.field_x + var11.field_x;
    }

    final static void a(byte param0, ji param1) {
        db.a(true, 256, param1);
        if (param0 != -17) {
            int discarded$0 = ij.k(-120);
        }
    }

    public ij() {
        super(0, 0, 496, 0, (nn) null);
        ((ij) this).field_G = new sf("", (mh) null, 12);
        cn var1 = new cn(jn.field_G, 0, 0, 0, 0, 16777215, -1, 3, 0, jd.field_s.field_y, -1, 2147483647, true);
        ag var2 = new ag(bl.field_d, (nn) (Object) var1, (mh) null);
        ((ij) this).field_E = new ph(fh.field_h, (mh) null);
        ((ij) this).field_H = new ph(qc.field_C, (mh) null);
        ((ij) this).field_G.field_i = u.field_g;
        ((ij) this).field_G.a((bg) (Object) new n((ig) (Object) ((ij) this).field_G), (byte) -105);
        ((ij) this).field_E.field_D = false;
        ((ij) this).field_E.field_h = (nn) (Object) new ke();
        ((ij) this).field_H.field_h = (nn) (Object) new ti();
        ((ij) this).field_G.field_h = (nn) (Object) new sd(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(270, var3, 0, 20, 50);
        ((ij) this).a(51448, var2);
        var3 += 50;
        var3 = var3 + (this.a(170, (ag) (Object) ((ij) this).field_G, vg.field_f, (byte) 31, var3, ua.field_a) + 5);
        ((ij) this).field_E.a(var5, var3, 0, -var5 + 496 >> 1785530049, 40);
        ((ij) this).field_H.a(60, var3 + 15, 0, var4 - -3, 40);
        ((ij) this).field_H.field_p = (mh) this;
        ((ij) this).field_E.field_p = (mh) this;
        ((ij) this).a(51448, (ag) (Object) ((ij) this).field_E);
        ((ij) this).a(51448, (ag) (Object) ((ij) this).field_H);
        ((ij) this).field_I = new mc((kn) this);
        ((ij) this).field_I.a(-60 + (-((ij) this).field_G.field_s + (((ij) this).field_s + -((ij) this).field_G.field_v)), 20, 0, 60 + ((ij) this).field_G.field_s + ((ij) this).field_G.field_v, 150);
        ((ij) this).a(51448, (ag) (Object) ((ij) this).field_I);
        ((ij) this).a(496, 0, 0, 0, var4 + (var3 - -55));
    }

    private final void j(int param0) {
        if (!(this.l(-6790))) {
            return;
        }
        if (param0 != 496) {
            return;
        }
        ha.a((byte) 126, ((ij) this).field_G.field_n);
    }

    public final void a(boolean param0) {
        if (param0) {
            return;
        }
        ((n) (Object) ((ij) this).field_G.a((byte) 124)).f(-2);
    }

    private final int a(int param0, ag param1, String param2, byte param3, int param4, String param5) {
        if (param3 != 31) {
          ((ij) this).field_G = null;
          return this.a(param2, param5, (byte) 71, param4, param0, param1, 35);
        } else {
          return this.a(param2, param5, (byte) 71, param4, param0, param1, 35);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new vl();
        og discarded$0 = new og();
    }
}
