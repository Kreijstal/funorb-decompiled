/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends hp implements ri, hh {
    private an field_H;
    private an field_G;
    kn field_I;
    private ic field_F;

    public fh() {
        super(0, 0, 496, 0, (io) null);
        ((fh) this).field_F = new ic("", (sk) null, 12);
        vf var1 = new vf(ii.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, ia.field_e.field_I, -1, 2147483647, true);
        ga var2 = new ga(rc.field_j, (io) (Object) var1, (sk) null);
        ((fh) this).field_H = new an(on.field_n, (sk) null);
        ((fh) this).field_G = new an(vi.field_b, (sk) null);
        ((fh) this).field_F.field_s = sn.field_d;
        ((fh) this).field_F.a(46, (vc) (Object) new ql((tb) (Object) ((fh) this).field_F));
        ((fh) this).field_H.field_C = false;
        ((fh) this).field_H.field_h = (io) (Object) new vm();
        ((fh) this).field_G.field_h = (io) (Object) new dp();
        ((fh) this).field_F.field_h = (io) (Object) new tc(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(87, var3, 20, 270, 50);
        var3 += 50;
        ((fh) this).a(var2, 10);
        var3 = var3 + (this.a(170, a.field_l, (byte) -76, b.field_i, (ga) (Object) ((fh) this).field_F, var3) + 5);
        ((fh) this).field_H.a(34, var3, 496 + -var5 >> -115755295, var5, 40);
        ((fh) this).field_G.a(63, 15 + var3, var4 + 3, 60, 40);
        ((fh) this).field_G.field_v = (sk) this;
        ((fh) this).field_H.field_v = (sk) this;
        ((fh) this).a((ga) (Object) ((fh) this).field_H, 10);
        ((fh) this).a((ga) (Object) ((fh) this).field_G, 10);
        ((fh) this).field_I = new kn((ri) this);
        ((fh) this).field_I.a(38, 20, 60 + ((fh) this).field_F.field_i + ((fh) this).field_F.field_k, -60 + (((fh) this).field_i + -((fh) this).field_F.field_k + -((fh) this).field_F.field_i), 150);
        ((fh) this).a((ga) (Object) ((fh) this).field_I, 10);
        ((fh) this).a(-90, 0, 0, 496, var4 + (var3 - -55));
    }

    private final boolean h(int param0) {
        Object var3 = null;
        if (param0 == 13) {
          if (!this.a(65, (mi) (Object) ((fh) this).field_F)) {
            return false;
          } else {
            return true;
          }
        } else {
          var3 = null;
          int discarded$2 = this.a(106, (String) null, (byte) -4, (String) null, (ga) null, -13);
          if (!this.a(65, (mi) (Object) ((fh) this).field_F)) {
            return false;
          } else {
            return true;
          }
        }
    }

    private final int a(int param0, int param1, ga param2, String param3, int param4, int param5, String param6) {
        wf var9 = null;
        q var10 = null;
        var10 = new q(20, param1, param0 + 120, 25, param2, false, 120, 3, ia.field_e, 16777215, param3);
        ((fh) this).a((ga) (Object) var10, 10);
        var9 = new wf(((mi) (Object) param2).a(0), param6, 126, param1 - -var10.field_n, param0 + 25, param5);
        var9.field_v = (sk) this;
        ((fh) this).a((ga) (Object) var9, 10);
        if (param4 != -24396) {
          ((fh) this).field_I = null;
          return var9.field_n + var10.field_n;
        } else {
          return var9.field_n + var10.field_n;
        }
    }

    private final void e(byte param0) {
        if (!(this.h(13))) {
            return;
        }
        ca.a((byte) 2, ((fh) this).field_F.field_o);
        if (param0 < 97) {
            Object var3 = null;
            String discarded$0 = fh.a((CharSequence) null, -91, false);
        }
    }

    public final void a(byte param0, String param1) {
        ic var3 = ((fh) this).field_F;
        String var4 = param1;
        ((tb) (Object) var3).a(false, false, var4);
        int var5 = -116 % ((-40 - param0) / 48);
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        if (param1 == 7065) {
          var3 = ip.a(1048576, param2, param0);
          if (var3 != null) {
            return var3;
          } else {
            var4 = 0;
            L0: while (true) {
              if (param0.length() > var4) {
                if (jb.a((byte) 27, param0.charAt(var4))) {
                  var4++;
                  continue L0;
                } else {
                  return ao.field_G;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        var5 = -90 % ((param0 - -83) / 32);
        if (!super.a(-119, param1, param2, param3)) {
          if (-99 != (param1 ^ -1)) {
            if (99 == param1) {
              return ((fh) this).a(1, param2);
            } else {
              return false;
            }
          } else {
            return ((fh) this).b((byte) 120, param2);
          }
        } else {
          return true;
        }
    }

    private final boolean a(int param0, mi param1) {
        vc var3 = null;
        rh var4 = null;
        if (param0 <= 64) {
            ((fh) this).field_F = null;
            var3 = param1.a(0);
            if (!(var3 != null)) {
                return true;
            }
            var4 = var3.a((byte) -90);
            return mc.field_g == var4 ? true : false;
        }
        var3 = param1.a(0);
        if (!(var3 != null)) {
            return true;
        }
        var4 = var3.a((byte) -90);
        return mc.field_g == var4 ? true : false;
    }

    final static void i(int param0) {
        int[] var2 = null;
        int var3 = 0;
        Object var4 = null;
        int[] var5 = null;
        L0: {
          var5 = new int[]{0, 42, 3, 43, 2, 14, 11};
          var2 = new int[]{37, 12, 13, 4, 6};
          ei.a(0, param0, new int[0], 0, false, -14237, 0, 0);
          ei.a(170, 470, var5, 1, true, -14237, 33, 180);
          ei.a(170, 470, var2, 14, true, -14237, 33, 180);
          ei.a(170, 460, new int[7], 2, true, -14237, 38, 118);
          ei.a(0, 640, new int[2], 3, false, -14237, 40, 430);
          ei.a(30, 468, new int[3], 4, false, -14237, 200, 430);
          ei.a(0, 640, new int[2], 5, false, -14237, 120, 430);
          ei.a(100, 440, new int[2], 6, false, param0 + -14237, 220, 430);
          ei.a(194, 446, new int[2], 7, true, param0 + -14237, 100, 200);
          ei.a(50, 288, new int[1], 8, false, -14237, 40, 400);
          rl.a(240, 428, 400, 160, new int[10], 9, false, (byte) -12, new int[6]);
          var4 = null;
          ei.a(180, 460, (int[]) null, 10, true, -14237, 60, 370);
          ei.a(0, 0, new int[0], 11, true, param0 + -14237, 0, 0);
          ei.a(0, 0, new int[1], 12, true, -14237, 0, 0);
          ei.a(240, 400, new int[4], 13, false, -14237, 160, 428);
          oe.b(param0 ^ 1);
          ff.field_b = sg.field_jb.b(vk.field_b[12]);
          var3 = sg.field_jb.b(vk.field_b[13]);
          if (var3 > ff.field_b) {
            ff.field_b = var3;
            break L0;
          } else {
            break L0;
          }
        }
        ((pg) (Object) qk.field_Jb[1]).d((byte) -49);
        ((pg) (Object) qk.field_Jb[14]).d((byte) -41);
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -48, param2, param3);
        int var5 = 102 % ((param1 - 46) / 42);
        ((fh) this).field_H.field_C = this.h(13);
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = param2;
        if (!(!param1)) {
            var4 += 4;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        if (!(!param0)) {
            var4++;
        }
        return ae.field_b[var4];
    }

    private final int a(int param0, String param1, byte param2, String param3, ga param4, int param5) {
        if (param2 != -76) {
            return 105;
        }
        return this.a(param0, param5, param4, param3, param2 + -24320, 35, param1);
    }

    public final void a(int param0) {
        ((ql) (Object) ((fh) this).field_F.a(0)).e(-28769);
        int var2 = -91 % ((39 - param0) / 49);
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        if (param2 != ((fh) this).field_G) {
          if (((fh) this).field_H != param2) {
            if (param1 != -6) {
              this.e((byte) 71);
              return;
            } else {
              return;
            }
          } else {
            this.e((byte) 117);
            if (param1 == -6) {
              return;
            } else {
              this.e((byte) 71);
              return;
            }
          }
        } else {
          dj.a(113);
          if (param1 == -6) {
            return;
          } else {
            this.e((byte) 71);
            return;
          }
        }
    }

    static {
    }
}
