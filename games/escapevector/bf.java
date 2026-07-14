/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Canvas;

final class bf extends bj implements sg, qb, qn {
    private gd field_R;
    static rk[] field_M;
    private bo field_J;
    private ue field_H;
    rh field_G;
    static String field_O;
    private hc field_P;
    static om field_L;
    private gd field_I;
    private hc field_K;
    private gd field_N;
    static ed field_T;
    private gd field_Q;
    private gd field_U;
    private gd field_S;

    private final int a(int param0, hm param1, String param2, int param3, int param4) {
        ki var6 = null;
        if (param4 != 100) {
          java.awt.Canvas discarded$1 = bf.i((byte) -65);
          var6 = new ki(20, param3, param0 + 120, 25, param1, false, 120, 3, sb.field_a, 16777215, param2);
          ((bf) this).b((hm) (Object) var6, false);
          return var6.field_x;
        } else {
          var6 = new ki(20, param3, param0 + 120, 25, param1, false, 120, 3, sb.field_a, 16777215, param2);
          ((bf) this).b((hm) (Object) var6, false);
          return var6.field_x;
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        if (param0 != ((bf) this).field_P) {
          if (((bf) this).field_K != param0) {
            if (param3 != 1) {
              ((bf) this).field_N = null;
              return;
            } else {
              return;
            }
          } else {
            boolean discarded$3 = this.h((byte) 123);
            if (param3 == 1) {
              return;
            } else {
              ((bf) this).field_N = null;
              return;
            }
          }
        } else {
          qe.a(true);
          if (param3 == 1) {
            return;
          } else {
            ((bf) this).field_N = null;
            return;
          }
        }
    }

    private final int a(int param0, String param1, int param2, hm param3, String param4, int param5) {
        if (param0 != 170) {
          field_T = null;
          return this.a(35, param3, param5, param1, param0 + -145, param4, param2);
        } else {
          return this.a(35, param3, param5, param1, param0 + -145, param4, param2);
        }
    }

    public final void a(byte param0, String param1) {
        gd var3 = null;
        String var4 = null;
        var3 = ((bf) this).field_S;
        var4 = param1;
        ((ul) (Object) var3).a(var4, false, -33);
        if (param0 >= -49) {
          ((bf) this).field_U = null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, DataInputStream param2, int param3, int param4, int[] param5, int param6) throws IOException {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var7 = param4 + param3 >> 2102097185;
        var8 = param0 - -param1 >> 122686113;
        var9 = param2.readUnsignedByte();
        ka.a(param3, 3 & var9, var8, var7, param2, param5, (byte) -74, param0);
        var9 = var9 >>> 2;
        ka.a(var7, var9 & 3, var8, param4, param2, param5, (byte) -74, param0);
        var9 = var9 >>> 2;
        if (param6 != 2147483647) {
          return;
        } else {
          ka.a(param3, var9 & 3, param1, var7, param2, param5, (byte) -74, var8);
          var9 = var9 >>> 2;
          ka.a(var7, var9, param1, param4, param2, param5, (byte) -74, var8);
          return;
        }
    }

    public static void l(int param0) {
        field_T = null;
        field_L = null;
        if (param0 >= -118) {
            return;
        }
        field_O = null;
        field_M = null;
    }

    public bf() {
        super(0, 0, 496, 0, (db) null);
        ((bf) this).field_S = new gd("", (wn) null, 12);
        ((bf) this).field_I = new gd("", (wn) null, 100);
        ((bf) this).field_R = new gd("", (wn) null, 100);
        ((bf) this).field_Q = new gd("", (wn) null, 20);
        ((bf) this).field_U = new gd("", (wn) null, 20);
        ((bf) this).field_N = new gd("", (wn) null, 3);
        int var1 = 1;
        ((bf) this).field_J = new bo("", (wn) null, var1 != 0);
        ((bf) this).field_K = new hc(ag.field_c, (wn) null);
        ((bf) this).field_P = new hc(c.field_p, (wn) null);
        ((bf) this).field_S.field_i = bb.field_K;
        ((bf) this).field_I.field_i = en.field_a;
        ((bf) this).field_R.field_i = co.field_f;
        ((bf) this).field_Q.field_i = aa.field_b;
        ((bf) this).field_U.field_i = pl.field_i;
        ((bf) this).field_N.field_i = ta.field_k;
        ((bf) this).field_J.field_i = ad.field_h;
        ((bf) this).field_S.a((el) (Object) new kf((ul) (Object) ((bf) this).field_S), (byte) 63);
        ((bf) this).field_I.a((el) (Object) new hi((ul) (Object) ((bf) this).field_I), (byte) 63);
        ((bf) this).field_R.a((el) (Object) new dg((ul) (Object) ((bf) this).field_R, (ul) (Object) ((bf) this).field_I), (byte) 63);
        ((bf) this).field_Q.a((el) (Object) new nk((ul) (Object) ((bf) this).field_Q, (ul) (Object) ((bf) this).field_S, (ul) (Object) ((bf) this).field_I), (byte) 63);
        ((bf) this).field_U.a((el) (Object) new lb((ul) (Object) ((bf) this).field_U, (ul) (Object) ((bf) this).field_Q), (byte) 63);
        ((bf) this).field_N.a((el) (Object) new kl((ul) (Object) ((bf) this).field_N), (byte) 63);
        ((bf) this).field_K.field_y = false;
        ((bf) this).field_K.field_s = (db) (Object) new ck();
        ((bf) this).field_P.field_s = (db) (Object) new ha();
        ((bf) this).field_S.field_s = (db) (Object) new re(10000536);
        ((bf) this).field_R.field_s = (db) (Object) new re(10000536);
        ((bf) this).field_I.field_s = (db) (Object) new re(10000536);
        ((bf) this).field_N.field_s = (db) (Object) new re(10000536);
        ((bf) this).field_J.field_s = (db) (Object) new ae();
        ((bf) this).field_U.field_s = (db) (Object) new un(10000536);
        ((bf) this).field_Q.field_s = (db) (Object) new un(10000536);
        String var2 = r.a(aj.field_b, -63, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(170, (hm) (Object) ((bf) this).field_I, tm.field_Z, var3, 100);
        var3 = var3 + (this.a(20, (hm) (Object) ((bf) this).field_R, 170, ri.field_a, 25, "", var3) - -5);
        var3 = var3 + this.a(170, (hm) (Object) ((bf) this).field_Q, qc.field_vb, var3, 100);
        var3 = var3 + (this.a(170, mh.field_d, var3, (hm) (Object) ((bf) this).field_U, rm.field_a, 170) + 5);
        var3 = var3 + (5 + this.a(170, lf.field_J, var3, (hm) (Object) ((bf) this).field_S, ig.field_i, 170));
        var3 = var3 + this.a(qm.field_a, (byte) 123, var3, (hm) (Object) ((bf) this).field_N, 170);
        ki var4 = new ki(46, var3, -90 + ((bf) this).field_g, 25, (hm) (Object) ((bf) this).field_J, true, -120 + ((bf) this).field_g, 5, ke.field_c, 11579568, ii.field_b);
        ((bf) this).b((hm) (Object) var4, false);
        var3 = var3 + var4.field_x;
        k var5 = new k(sb.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, sb.field_a.field_r, -1, 2147483647, true);
        ((bf) this).field_H = new ue(var2, (db) (Object) var5);
        ((bf) this).field_H.field_i = "";
        ((bf) this).field_H.a(ah.field_m, (byte) 65, 0);
        ((bf) this).field_H.a(ah.field_m, (byte) 97, 1);
        ((bf) this).field_H.field_q = (wn) this;
        ((bf) this).field_H.b(2463, 46, ((bf) this).field_g - 90, var3);
        var3 = var3 + (15 + ((bf) this).field_H.field_x);
        ((bf) this).b((hm) (Object) ((bf) this).field_H, false);
        int var6 = 4;
        int var7 = 200;
        ((bf) this).field_K.a(var7, var3, -var7 + 496 >> -1967686239, true, 40);
        ((bf) this).field_P.a(60, 15 + var3, var6 + 3, true, 40);
        ((bf) this).field_P.field_q = (wn) this;
        ((bf) this).field_K.field_q = (wn) this;
        ((bf) this).b((hm) (Object) ((bf) this).field_K, false);
        ((bf) this).b((hm) (Object) ((bf) this).field_P, false);
        ((bf) this).field_G = new rh((qn) this);
        ((bf) this).field_G.a(-60 + -((bf) this).field_S.field_k + (((bf) this).field_g + -((bf) this).field_S.field_g), 20 + ((bf) this).field_S.field_j, 60 + ((bf) this).field_S.field_k - -((bf) this).field_S.field_g, true, 150);
        ((bf) this).b((hm) (Object) ((bf) this).field_G, false);
        ((bf) this).a(496, 0, 0, true, var6 + (var3 - -55));
    }

    private final String k(int param0) {
        if (param0 != 3674) {
            field_L = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(byte param0) {
        ((kf) (Object) ((bf) this).field_S.a((byte) -89)).g(22186);
        if (param0 != -61) {
            field_T = null;
        }
    }

    private final boolean a(boolean param0, og param1) {
        el var3 = null;
        rf var4 = null;
        if (!param0) {
          var3 = param1.a((byte) -89);
          if (var3 != null) {
            var4 = var3.a(17124);
            if (var4 == ob.field_a) {
              return false;
            } else {
              if (var4 != of.field_f) {
                if (var4 == re.field_s) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static te a(mf param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.b(-1, param3);
        if (param1 <= 48) {
          field_L = null;
          var5 = param0.a(var4, param2, true);
          return he.a(param0, -18109, var5, var4);
        } else {
          var5 = param0.a(var4, param2, true);
          return he.a(param0, -18109, var5, var4);
        }
    }

    private final int a(String param0, byte param1, int param2, hm param3, int param4) {
        oj var7 = null;
        ki var8 = null;
        var8 = new ki(20, param2, 120 + param4, 25, param3, false, 120, 3, sb.field_a, 16777215, param0);
        ((bf) this).b((hm) (Object) var8, false);
        if (param1 != 123) {
          ((bf) this).field_J = null;
          var7 = new oj(((og) (Object) param3).a((byte) -89));
          ((bf) this).b((hm) (Object) var7, false);
          var7.a(15, (-15 + var8.field_x >> 215716897) + var8.field_j, 3 + var8.field_g + var8.field_k, true, 15);
          return var8.field_x;
        } else {
          var7 = new oj(((og) (Object) param3).a((byte) -89));
          ((bf) this).b((hm) (Object) var7, false);
          var7.a(15, (-15 + var8.field_x >> 215716897) + var8.field_j, 3 + var8.field_g + var8.field_k, true, 15);
          return var8.field_x;
        }
    }

    final static java.awt.Canvas i(byte param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        af stackOut_7_0 = null;
        java.awt.Canvas stackOut_6_0 = null;
        af stackOut_3_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        if (param0 != 10) {
          L0: {
            field_M = null;
            if (null != df.field_d) {
              stackOut_7_0 = df.field_d;
              stackIn_8_0 = (Object) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = of.field_d;
              stackIn_8_0 = (Object) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null != df.field_d) {
              stackOut_3_0 = df.field_d;
              stackIn_4_0 = (Object) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = of.field_d;
              stackIn_4_0 = (Object) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, hm param3) {
        super.a(param0, param1, param2, param3);
        ((bf) this).field_K.field_y = this.b(true);
    }

    private final boolean b(boolean param0) {
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        if (param0) {
          if (this.a(false, (og) (Object) ((bf) this).field_S)) {
            if (this.a(false, (og) (Object) ((bf) this).field_I)) {
              if (this.a(false, (og) (Object) ((bf) this).field_R)) {
                L0: {
                  stackOut_8_0 = this;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (param0) {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L0;
                  } else {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L0;
                  }
                }
                if (this.a(stackIn_11_1 != 0, (og) (Object) ((bf) this).field_Q)) {
                  if (this.a(false, (og) (Object) ((bf) this).field_U)) {
                    if (!this.a(false, (og) (Object) ((bf) this).field_N)) {
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

    private final String j(int param0) {
        int var2 = -12 % ((param0 - -57) / 43);
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        if (super.a(param0, param1, param2, 20)) {
          return true;
        } else {
          if ((param2 ^ -1) == -99) {
            return ((bf) this).a((byte) 22, param0);
          } else {
            if (param3 > 0) {
              if ((param2 ^ -1) == -100) {
                return ((bf) this).a(param0, true);
              } else {
                return false;
              }
            } else {
              ((bf) this).field_I = null;
              if ((param2 ^ -1) == -100) {
                return ((bf) this).a(param0, true);
              } else {
                return false;
              }
            }
          }
        }
    }

    private final int a(int param0, hm param1, int param2, String param3, int param4, String param5, int param6) {
        ki var10 = new ki(20, param6, 120 - -param2, param4, param1, false, 120, 3, sb.field_a, 16777215, param3);
        ((bf) this).b((hm) (Object) var10, false);
        lf var9 = new lf(((og) (Object) param1).a((byte) -89), param5, 126, var10.field_x + param6, param2 - -50, param0);
        var9.field_q = (wn) this;
        ((bf) this).b((hm) (Object) var9, false);
        return var9.field_x + var10.field_x;
    }

    private final boolean h(byte param0) {
        if (!(this.b(true))) {
            return false;
        }
        int var2 = -1;
        int var3 = 38 % ((param0 - 51) / 35);
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((bf) this).field_N.field_l);
        } catch (NumberFormatException numberFormatException) {
        }
        return e.a((bf) this, false, ((bf) this).field_I.field_l, var2, ((bf) this).field_Q.field_l, ((bf) this).field_J.field_z, ((bf) this).field_S.field_l);
    }

    public final void a(int param0, ue param1, int param2, int param3) {
        int var6 = 0;
        var6 = EscapeVector.field_A;
        if (param0 == -2861) {
          if (0 != param2) {
            if (1 != param2) {
              if (2 == param2) {
                qd.a(12, "conduct.ws");
                return;
              } else {
                return;
              }
            } else {
              qd.a(12, "privacy.ws");
              return;
            }
          } else {
            qd.a(12, "terms.ws");
            return;
          }
        } else {
          field_M = null;
          if (0 != param2) {
            if (1 != param2) {
              if (2 != param2) {
                return;
              } else {
                qd.a(12, "conduct.ws");
                return;
              }
            } else {
              qd.a(12, "privacy.ws");
              return;
            }
          } else {
            qd.a(12, "terms.ws");
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -15655) {
            return;
        }
        if (!(null == bk.field_r)) {
            bk.field_r.b(-1, param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Complete the tutorial by following<br>the instructions at the top of the screen.";
        field_L = new om(11, 0, 1, 2);
    }
}
