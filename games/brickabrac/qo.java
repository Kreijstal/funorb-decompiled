/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends ib implements vf, en {
    static boolean field_I;
    static byte[] field_J;
    static String field_H;
    static int field_N;
    static String field_P;
    private d field_K;
    private sf field_L;
    private d field_Q;
    static String[] field_M;
    ri field_R;
    static int field_O;

    private final int a(int param0, String param1, oc param2, String param3, int param4, int param5) {
        if (param0 >= -10) {
            return 82;
        }
        return this.a(param1, param5, param4, param2, 35, param3, false);
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        var3 = 0;
        var4 = jq.field_r;
        if (param0 != 120) {
          field_O = -69;
          if (qh.field_i.length > var3) {
            var5 = BrickABrac.field_K[var3];
            if (var5 >= 0) {
              var6 = hm.a(true, qh.field_i[var3], 0);
              var4 = var4 + kn.field_y;
              var7 = wi.field_k + -(var6 >> 240271041);
              if (bg.a(var7 + -cn.field_c, (jb.field_H << -1684686015) + b.field_c, var6 - -(cn.field_c << -297184703), (byte) 65, param1, param2, var4)) {
                return var5;
              } else {
                var4 = var4 + (kn.field_y + ((jb.field_H << -1252785983) - -b.field_c));
                var3++;
                var3++;
                var3++;
                var3++;
                return -1;
              }
            } else {
              var4 = var4 + pe.field_s;
              var3++;
              var3++;
              var3++;
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          if (qh.field_i.length > var3) {
            var5 = BrickABrac.field_K[var3];
            if (var5 >= 0) {
              var6 = hm.a(true, qh.field_i[var3], 0);
              var4 = var4 + kn.field_y;
              var7 = wi.field_k + -(var6 >> 240271041);
              if (bg.a(var7 + -cn.field_c, (jb.field_H << -1684686015) + b.field_c, var6 - -(cn.field_c << -297184703), (byte) 65, param1, param2, var4)) {
                return var5;
              } else {
                var4 = var4 + (kn.field_y + ((jb.field_H << -1252785983) - -b.field_c));
                var3++;
                var3++;
                var3++;
                var3++;
                return -1;
              }
            } else {
              var4 = var4 + pe.field_s;
              var3++;
              var3++;
              var3++;
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param0 != 98) {
            if (-100 != (param0 ^ -1)) {
              return false;
            } else {
              return ((qo) this).a(param2, (byte) -127);
            }
          } else {
            return ((qo) this).b(param2, (byte) 87);
          }
        }
    }

    private final int a(String param0, int param1, int param2, oc param3, int param4, String param5, boolean param6) {
        ma var10 = new ma(20, param2, param1 + 120, 25, param3, param6, 120, 3, a.field_u, 16777215, param0);
        ((qo) this).a((oc) (Object) var10, !param6 ? true : false);
        nf var9 = new nf(((je) (Object) param3).a(-11011), param5, 126, param2 - -var10.field_s, 25 + param1, param4);
        var9.field_i = (uh) this;
        ((qo) this).a((oc) (Object) var9, true);
        return var9.field_s + var10.field_s;
    }

    final static void a(int param0, int param1) {
        fo.field_f = 400 * param1 / param0;
        fo.field_c = (param1 << -450123184) / 150;
        fo.field_n = param1 * 100 / 150;
    }

    public static void h(int param0) {
        field_P = null;
        field_H = null;
        field_J = null;
        field_M = null;
        int var1 = -119 / ((-4 - param0) / 38);
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        if (param4 == ((qo) this).field_K) {
          ee.d(-101);
          if (param2 <= -22) {
            return;
          } else {
            field_P = null;
            return;
          }
        } else {
          if (param4 == ((qo) this).field_Q) {
            this.a(28462);
            if (param2 <= -22) {
              return;
            } else {
              field_P = null;
              return;
            }
          } else {
            if (param2 <= -22) {
              return;
            } else {
              field_P = null;
              return;
            }
          }
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((qo) this).field_Q.field_J = this.h((byte) 92);
    }

    private final boolean a(int param0, je param1) {
        ia var3 = null;
        qh var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0;
        int stackOut_9_0;
        int stackOut_6_0;
        int stackOut_5_0;
        var3 = param1.a(-11011);
        if (var3 == null) {
          return true;
        } else {
          var4 = var3.b((byte) -31);
          if (param0 > -64) {
            L0: {
              field_J = null;
              if (var4 != ae.field_c) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if (var4 != ae.field_c) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    private final void a(int param0) {
        if (!this.h((byte) 92)) {
          return;
        } else {
          kb.a(((qo) this).field_L.field_A, -96);
          if (param0 == 28462) {
            return;
          } else {
            ((qo) this).field_Q = null;
            return;
          }
        }
    }

    public qo() {
        super(0, 0, 496, 0, (ub) null);
        ((qo) this).field_L = new sf("", (uh) null, 12);
        um var1 = new um(og.field_Yb, 0, 0, 0, 0, 16777215, -1, 3, 0, a.field_u.field_F, -1, 2147483647, true);
        oc var2 = new oc(ac.field_d, (ub) (Object) var1, (uh) null);
        ((qo) this).field_Q = new d(k.field_j, (uh) null);
        ((qo) this).field_K = new d(wl.field_L, (uh) null);
        ((qo) this).field_L.field_z = hh.field_a;
        ((qo) this).field_L.a((ia) (Object) new fl((vb) (Object) ((qo) this).field_L), (byte) -68);
        ((qo) this).field_Q.field_J = false;
        ((qo) this).field_Q.field_l = (ub) (Object) new hi();
        ((qo) this).field_K.field_l = (ub) (Object) new bb();
        ((qo) this).field_L.field_l = (ub) (Object) new r(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 20, var3, (byte) -119, 270);
        var3 += 50;
        ((qo) this).a(var2, true);
        var3 = var3 + (this.a(-14, of.field_j, (oc) (Object) ((qo) this).field_L, dj.field_h, var3, 170) + 5);
        ((qo) this).field_Q.a(40, 496 + -var5 >> 1395692737, var3, (byte) -119, var5);
        ((qo) this).field_K.a(40, var4 - -3, var3 - -15, (byte) -119, 60);
        ((qo) this).field_K.field_i = (uh) this;
        ((qo) this).field_Q.field_i = (uh) this;
        ((qo) this).a((oc) (Object) ((qo) this).field_Q, true);
        ((qo) this).a((oc) (Object) ((qo) this).field_K, true);
        ((qo) this).field_R = new ri((vf) this);
        ((qo) this).field_R.a(150, ((qo) this).field_L.field_t + ((qo) this).field_L.field_o - -60, 20, (byte) -119, -60 + (-((qo) this).field_L.field_t + -((qo) this).field_L.field_o + ((qo) this).field_t));
        ((qo) this).a((oc) (Object) ((qo) this).field_R, true);
        ((qo) this).a(var4 + (55 + var3), 0, 0, (byte) -119, 496);
    }

    private final boolean h(byte param0) {
        if (param0 == 92) {
          if (!this.a(-68, (je) (Object) ((qo) this).field_L)) {
            return false;
          } else {
            return true;
          }
        } else {
          field_P = null;
          if (!this.a(-68, (je) (Object) ((qo) this).field_L)) {
            return false;
          } else {
            return true;
          }
        }
    }

    public final void a(String param0, byte param1) {
        sf var3 = null;
        String var4 = null;
        var3 = ((qo) this).field_L;
        var4 = param0;
        ((vb) (Object) var3).a(var4, param1 + -12648, false);
        if (param1 == 56) {
          return;
        } else {
          field_P = null;
          return;
        }
    }

    public final void a(byte param0) {
        if (param0 < 96) {
            return;
        }
        ((fl) (Object) ((qo) this).field_L.a(-11011)).e((byte) -22);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_P = "Curses!";
        field_M = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_O = 0;
    }
}
