/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends hn implements fp, ng, ba {
    static m field_D;
    vp field_M;
    private rb field_C;
    private gp field_K;
    private gp field_E;
    private gp field_G;
    private gp field_B;
    private lg field_J;
    private ok field_F;
    private gp field_L;
    private gp field_I;
    static t field_H;
    private lg field_N;

    public final void a(byte param0, String param1) {
        gp var3 = null;
        String var4 = null;
        if (param0 != 21) {
          ((ki) this).field_I = null;
          var3 = ((ki) this).field_E;
          var4 = param1;
          ((tk) (Object) var3).a(false, var4, true);
          return;
        } else {
          var3 = ((ki) this).field_E;
          var4 = param1;
          ((tk) (Object) var3).a(false, var4, true);
          return;
        }
    }

    private final boolean a(int param0, wg param1) {
        sk var3 = null;
        cd var4 = null;
        if (param0 == -1) {
          var3 = param1.a(-10116);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.a((byte) -86);
            if (var4 != so.field_u) {
              if (var4 != q.field_a) {
                if (var4 == df.field_r) {
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
          ((ki) this).field_J = null;
          var3 = param1.a(-10116);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.a((byte) -86);
            if (var4 != so.field_u) {
              if (var4 != q.field_a) {
                if (var4 == df.field_r) {
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

    public final void a(byte param0) {
        Object var3 = null;
        if (param0 <= 89) {
          var3 = null;
          boolean discarded$2 = ((ki) this).a(119, (gm) null, '', -86);
          ((il) (Object) ((ki) this).field_E.a(-10116)).e(-40);
          return;
        } else {
          ((il) (Object) ((ki) this).field_E.a(-10116)).e(-40);
          return;
        }
    }

    private final String j(int param0) {
        Object var3 = null;
        if (param0 > -64) {
          var3 = null;
          int discarded$2 = this.a((String) null, 86, -114, (gm) null, (String) null, true);
          return "<u=2164A2><col=2164A2>";
        } else {
          return "<u=2164A2><col=2164A2>";
        }
    }

    public final void a(byte param0, int param1, int param2, rb param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = Torquing.field_u;
        if (0 == param2) {
          d.a("terms.ws", (byte) 31);
          if (param0 < 106) {
            var7 = null;
            int discarded$4 = this.a((String) null, -82, -103, (gm) null, (String) null, false);
            return;
          } else {
            return;
          }
        } else {
          if (1 != param2) {
            if ((param2 ^ -1) == -3) {
              d.a("conduct.ws", (byte) 31);
              if (param0 < 106) {
                var7 = null;
                int discarded$5 = this.a((String) null, -82, -103, (gm) null, (String) null, false);
                return;
              } else {
                return;
              }
            } else {
              if (param0 >= 106) {
                return;
              } else {
                var7 = null;
                int discarded$6 = this.a((String) null, -82, -103, (gm) null, (String) null, false);
                return;
              }
            }
          } else {
            d.a("privacy.ws", (byte) 31);
            if (param0 >= 106) {
              return;
            } else {
              var7 = null;
              int discarded$7 = this.a((String) null, -82, -103, (gm) null, (String) null, false);
              return;
            }
          }
        }
    }

    private final int a(String param0, int param1, int param2, gm param3, String param4, boolean param5) {
        if (!param5) {
          ((ki) this).field_K = null;
          return this.a(param3, param1, (byte) -63, param4, param2, param0, 35);
        } else {
          return this.a(param3, param1, (byte) -63, param4, param2, param0, 35);
        }
    }

    private final boolean h(int param0) {
        if (param0 == 19545) {
          if (this.a(param0 ^ -19546, (wg) (Object) ((ki) this).field_E)) {
            if (this.a(-1, (wg) (Object) ((ki) this).field_K)) {
              if (this.a(-1, (wg) (Object) ((ki) this).field_G)) {
                if (this.a(-1, (wg) (Object) ((ki) this).field_B)) {
                  if (this.a(-1, (wg) (Object) ((ki) this).field_L)) {
                    if (!this.a(-1, (wg) (Object) ((ki) this).field_I)) {
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
          return true;
        }
    }

    public ki() {
        super(0, 0, 496, 0, (el) null);
        ((ki) this).field_E = new gp("", (ca) null, 12);
        ((ki) this).field_K = new gp("", (ca) null, 100);
        ((ki) this).field_G = new gp("", (ca) null, 100);
        ((ki) this).field_B = new gp("", (ca) null, 20);
        ((ki) this).field_L = new gp("", (ca) null, 20);
        ((ki) this).field_I = new gp("", (ca) null, 3);
        int var1 = 1;
        ((ki) this).field_F = new ok("", (ca) null, var1 != 0);
        ((ki) this).field_J = new lg(bq.field_a, (ca) null);
        ((ki) this).field_N = new lg(cm.field_k, (ca) null);
        ((ki) this).field_E.field_n = ag.field_d;
        ((ki) this).field_K.field_n = o.field_c;
        ((ki) this).field_G.field_n = pf.field_j;
        ((ki) this).field_B.field_n = oi.field_a;
        ((ki) this).field_L.field_n = ud.field_j;
        ((ki) this).field_I.field_n = df.field_p;
        ((ki) this).field_F.field_n = l.field_b;
        ((ki) this).field_E.a((sk) (Object) new il((tk) (Object) ((ki) this).field_E), 112);
        ((ki) this).field_K.a((sk) (Object) new tn((tk) (Object) ((ki) this).field_K), 99);
        ((ki) this).field_G.a((sk) (Object) new ad((tk) (Object) ((ki) this).field_G, (tk) (Object) ((ki) this).field_K), 110);
        ((ki) this).field_B.a((sk) (Object) new ij((tk) (Object) ((ki) this).field_B, (tk) (Object) ((ki) this).field_E, (tk) (Object) ((ki) this).field_K), 126);
        ((ki) this).field_L.a((sk) (Object) new um((tk) (Object) ((ki) this).field_L, (tk) (Object) ((ki) this).field_B), 86);
        ((ki) this).field_I.a((sk) (Object) new ab((tk) (Object) ((ki) this).field_I), 76);
        ((ki) this).field_J.field_x = false;
        ((ki) this).field_J.field_q = (el) (Object) new rf();
        ((ki) this).field_N.field_q = (el) (Object) new je();
        ((ki) this).field_E.field_q = (el) (Object) new ig(10000536);
        ((ki) this).field_G.field_q = (el) (Object) new ig(10000536);
        ((ki) this).field_K.field_q = (el) (Object) new ig(10000536);
        ((ki) this).field_I.field_q = (el) (Object) new ig(10000536);
        ((ki) this).field_F.field_q = (el) (Object) new kb();
        ((ki) this).field_L.field_q = (el) (Object) new io(10000536);
        ((ki) this).field_B.field_q = (el) (Object) new io(10000536);
        String var2 = ff.a(new String[2], 0, km.field_a);
        int var3 = 20;
        var3 = var3 + this.a((byte) 106, a.field_b, 170, (gm) (Object) ((ki) this).field_K, var3);
        var3 = var3 + (this.a((gm) (Object) ((ki) this).field_G, var3, (byte) -63, qn.field_E, 170, "", 20) + 5);
        var3 = var3 + this.a((byte) 115, hm.field_v, 170, (gm) (Object) ((ki) this).field_B, var3);
        var3 = var3 + (this.a(ug.field_a, var3, 170, (gm) (Object) ((ki) this).field_L, bj.field_K, true) + 5);
        var3 = var3 + (5 + this.a(de.field_b, var3, 170, (gm) (Object) ((ki) this).field_E, ad.field_l, true));
        var3 = var3 + this.a(170, ta.field_m, var3, (gm) (Object) ((ki) this).field_I, 3);
        na var4 = new na(46, var3, -90 + ((ki) this).field_p, 25, (gm) (Object) ((ki) this).field_F, true, -120 + ((ki) this).field_p, 5, sp.field_R, 11579568, ce.field_a);
        ((ki) this).a((gm) (Object) var4, -6938);
        var3 = var3 + var4.field_o;
        pc var5 = new pc(dg.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, dg.field_e.field_x, -1, 2147483647, true);
        ((ki) this).field_C = new rb(var2, (el) (Object) var5);
        ((ki) this).field_C.field_n = "";
        ((ki) this).field_C.a(0, (byte) -100, jp.field_e);
        ((ki) this).field_C.a(1, (byte) -91, jp.field_e);
        ((ki) this).field_C.field_t = (ca) this;
        ((ki) this).field_C.a((byte) 46, 46, -90 + ((ki) this).field_p, var3);
        var3 = var3 + (((ki) this).field_C.field_o + 15);
        ((ki) this).a((gm) (Object) ((ki) this).field_C, -6938);
        int var6 = 4;
        int var7 = 200;
        ((ki) this).field_J.a((byte) 123, 496 + -var7 >> -1179345983, var3, 40, var7);
        ((ki) this).field_N.a((byte) -11, 3 + var6, var3 - -15, 40, 60);
        ((ki) this).field_N.field_t = (ca) this;
        ((ki) this).field_J.field_t = (ca) this;
        ((ki) this).a((gm) (Object) ((ki) this).field_J, -6938);
        ((ki) this).a((gm) (Object) ((ki) this).field_N, -6938);
        ((ki) this).field_M = new vp((ba) this);
        ((ki) this).field_M.a((byte) 123, 60 + (((ki) this).field_E.field_p + ((ki) this).field_E.field_w), 20 + ((ki) this).field_E.field_k, 150, -((ki) this).field_E.field_w + (((ki) this).field_p - ((ki) this).field_E.field_p) - 60);
        ((ki) this).a((gm) (Object) ((ki) this).field_M, -6938);
        ((ki) this).a((byte) 125, 0, 0, var3 - (-55 - var6), 496);
    }

    private final boolean l(int param0) {
        if (!(this.h(19545))) {
            return false;
        }
        int var2 = param0;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((ki) this).field_I.field_m);
        } catch (NumberFormatException numberFormatException) {
        }
        return vf.a((ki) this, ((ki) this).field_B.field_m, var2, ((ki) this).field_F.field_A, param0 ^ -7014, ((ki) this).field_K.field_m, ((ki) this).field_E.field_m);
    }

    private final int a(int param0, String param1, int param2, gm param3, int param4) {
        na var9 = new na(20, param2, param0 + 120, 25, param3, false, 120, 3, dg.field_e, 16777215, param1);
        ((ki) this).a((gm) (Object) var9, -6938);
        ub var7 = new ub(((wg) (Object) param3).a(-10116));
        int var8 = -12 % ((param4 - 62) / 48);
        ((ki) this).a((gm) (Object) var7, -6938);
        var7.a((byte) 123, 3 + var9.field_w - -var9.field_p, (var9.field_o + -15 >> 583555617) + var9.field_k, 15, 15);
        return var9.field_o;
    }

    final static String a(String param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Torquing.field_u;
        var4 = param3.length();
        var5 = param0.length();
        var6 = param1.length();
        if (-1 != (var5 ^ -1)) {
          var7 = var4;
          var9 = 78 % ((-33 - param2) / 49);
          var8 = -var5 + var6;
          if (-1 == (var8 ^ -1)) {
            var10 = new StringBuilder(var7);
            var11 = 0;
            L0: while (true) {
              var12 = param3.indexOf(param0, var11);
              if (var12 < 0) {
                StringBuilder discarded$6 = var10.append(param3.substring(var11));
                return var10.toString();
              } else {
                StringBuilder discarded$7 = var10.append(param3.substring(var11, var12));
                var11 = var12 + var5;
                StringBuilder discarded$8 = var10.append(param1);
                continue L0;
              }
            }
          } else {
            var10_int = 0;
            L1: while (true) {
              var10_int = param3.indexOf(param0, var10_int);
              if ((var10_int ^ -1) <= -1) {
                var10_int = var10_int + var5;
                var7 = var7 + var8;
                continue L1;
              } else {
                var10 = new StringBuilder(var7);
                var11 = 0;
                L2: while (true) {
                  var12 = param3.indexOf(param0, var11);
                  if (var12 < 0) {
                    StringBuilder discarded$9 = var10.append(param3.substring(var11));
                    return var10.toString();
                  } else {
                    StringBuilder discarded$10 = var10.append(param3.substring(var11, var12));
                    var11 = var12 + var5;
                    StringBuilder discarded$11 = var10.append(param1);
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          throw new IllegalArgumentException("Key cannot have zero length");
        }
    }

    public static void m(int param0) {
        if (param0 != 0) {
            return;
        }
        field_D = null;
        field_H = null;
    }

    final static String i(int param0) {
        if (bh.field_a == mg.field_b) {
          return rf.field_u;
        } else {
          if (kh.field_o != mg.field_b) {
            if (param0 == 20) {
              if (!qk.field_q.c(param0 ^ 496)) {
                return on.field_b;
              } else {
                return eo.field_a;
              }
            } else {
              field_D = null;
              if (!qk.field_q.c(param0 ^ 496)) {
                return on.field_b;
              } else {
                return eo.field_a;
              }
            }
          } else {
            return on.field_b;
          }
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5 = 0;
        if (super.a(param0, param1, param2, -100)) {
          return true;
        } else {
          if (-99 == (param0 ^ -1)) {
            return ((ki) this).a((byte) -107, param1);
          } else {
            var5 = -121 % ((param3 - -33) / 57);
            if ((param0 ^ -1) != -100) {
              return false;
            } else {
              return ((ki) this).b(param1, -9928);
            }
          }
        }
    }

    final void a(int param0, gm param1, int param2, int param3) {
        int var5 = -8 % ((-28 - param0) / 43);
        super.a(-84, param1, param2, param3);
        ((ki) this).field_J.field_x = this.h(19545);
    }

    private final String k(int param0) {
        if (param0 > -124) {
            return null;
        }
        return "</col></u>";
    }

    private final int a(gm param0, int param1, byte param2, String param3, int param4, String param5, int param6) {
        bj var9 = null;
        na var10 = null;
        var10 = new na(20, param1, param4 + 120, 25, param0, false, 120, 3, dg.field_e, 16777215, param3);
        ((ki) this).a((gm) (Object) var10, -6938);
        if (param2 != -63) {
          return -56;
        } else {
          var9 = new bj(((wg) (Object) param0).a(-10116), param5, 126, var10.field_o + param1, param4 - -50, param6);
          var9.field_t = (ca) this;
          ((ki) this).a((gm) (Object) var9, -6938);
          return var9.field_o + var10.field_o;
        }
    }

    private final int a(byte param0, String param1, int param2, gm param3, int param4) {
        na var6 = null;
        var6 = new na(20, param4, param2 + 120, 25, param3, false, 120, 3, dg.field_e, 16777215, param1);
        if (param0 <= 102) {
          return 58;
        } else {
          ((ki) this).a((gm) (Object) var6, -6938);
          return var6.field_o;
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param1 != ((ki) this).field_N) {
          if (param1 == ((ki) this).field_J) {
            boolean discarded$4 = this.l(-1);
            if (param0 >= -85) {
              var7 = null;
              int discarded$5 = this.a((String) null, 31, 19, (gm) null, (String) null, false);
              return;
            } else {
              return;
            }
          } else {
            if (param0 < -85) {
              return;
            } else {
              var7 = null;
              int discarded$6 = this.a((String) null, 31, 19, (gm) null, (String) null, false);
              return;
            }
          }
        } else {
          of.b((byte) 105);
          if (param0 < -85) {
            return;
          } else {
            var7 = null;
            int discarded$7 = this.a((String) null, 31, 19, (gm) null, (String) null, false);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = null;
    }
}
