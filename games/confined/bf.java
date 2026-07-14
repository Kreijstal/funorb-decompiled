/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends ga implements pg, el {
    ak field_H;
    static String field_S;
    static od[][] field_R;
    static int[][] field_L;
    private rg field_Q;
    private wh field_O;
    private rg field_P;

    final void a(fj param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((bf) this).field_Q.field_L = this.j(-106);
    }

    public final void a(int param0, String param1) {
        wh var3 = null;
        String var4 = null;
        var3 = ((bf) this).field_O;
        var4 = param1;
        if (param0 != 11579568) {
          this.k(29);
          ((ul) (Object) var3).a(false, false, var4);
          return;
        } else {
          ((ul) (Object) var3).a(false, false, var4);
          return;
        }
    }

    public static void b(boolean param0) {
        field_L = null;
        field_R = null;
        field_S = null;
        if (param0) {
            bf.b(false);
        }
    }

    private final int a(fj param0, int param1, int param2, int param3, String param4, String param5, int param6) {
        la var10 = new la(20, param2, 120 - -param3, 25, param0, false, 120, param1, gm.field_cb, 16777215, param5);
        ((bf) this).b((fj) (Object) var10, 10);
        rh var9 = new rh(((j) (Object) param0).a((byte) -9), param4, 126, param2 - -var10.field_z, param3 - -25, param6);
        var9.field_t = (uk) this;
        ((bf) this).b((fj) (Object) var9, 10);
        return var10.field_z - -var9.field_z;
    }

    private final void k(int param0) {
        int var2 = 0;
        var2 = 105 % ((param0 - -68) / 53);
        if (!this.j(-112)) {
          return;
        } else {
          bf.b(-121, ((bf) this).field_O.field_B);
          return;
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        if (((bf) this).field_P == param3) {
          rk.b((byte) 32);
          if (param0 <= 68) {
            this.k(109);
            return;
          } else {
            return;
          }
        } else {
          if (param3 == ((bf) this).field_Q) {
            this.k(95);
            if (param0 > 68) {
              return;
            } else {
              this.k(109);
              return;
            }
          } else {
            if (param0 > 68) {
              return;
            } else {
              this.k(109);
              return;
            }
          }
        }
    }

    public bf() {
        super(0, 0, 496, 0, (fe) null);
        ((bf) this).field_O = new wh("", (uk) null, 12);
        vf var1 = new vf(fa.field_Q, 0, 0, 0, 0, 16777215, -1, 3, 0, gm.field_cb.field_C, -1, 2147483647, true);
        fj var2 = new fj(Confined.field_G, (fe) (Object) var1, (uk) null);
        ((bf) this).field_Q = new rg(ta.field_a, (uk) null);
        ((bf) this).field_P = new rg(rb.field_d, (uk) null);
        ((bf) this).field_O.field_C = ra.field_b;
        ((bf) this).field_O.a(-18312, (dm) (Object) new qg((ul) (Object) ((bf) this).field_O));
        ((bf) this).field_Q.field_L = false;
        ((bf) this).field_Q.field_n = (fe) (Object) new je();
        ((bf) this).field_P.field_n = (fe) (Object) new hk();
        ((bf) this).field_O.field_n = (fe) (Object) new db(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(-125, 270, var3, 50, 20);
        ((bf) this).b(var2, 10);
        var3 += 50;
        var3 = var3 + (5 + this.a((fj) (Object) ((bf) this).field_O, 170, rc.field_a, 3, va.field_d, var3));
        ((bf) this).field_Q.a(-117, var5, var3, 40, 496 + -var5 >> 484395009);
        ((bf) this).field_P.a(-128, 60, var3 - -15, 40, 3 + var4);
        ((bf) this).field_P.field_t = (uk) this;
        ((bf) this).field_Q.field_t = (uk) this;
        ((bf) this).b((fj) (Object) ((bf) this).field_Q, 10);
        ((bf) this).b((fj) (Object) ((bf) this).field_P, 10);
        ((bf) this).field_H = new ak((pg) this);
        ((bf) this).field_H.a(-126, -((bf) this).field_O.field_F + (-((bf) this).field_O.field_q + ((bf) this).field_F - 60), 20, 150, ((bf) this).field_O.field_F + ((bf) this).field_O.field_q + 60);
        ((bf) this).b((fj) (Object) ((bf) this).field_H, 10);
        ((bf) this).a(-125, 496, 0, var3 + (55 + var4), 0);
    }

    public final void a(byte param0) {
        ((qg) (Object) ((bf) this).field_O.a((byte) -9)).e(639775169);
        if (param0 >= -101) {
            bf.b(false);
        }
    }

    private final boolean j(int param0) {
        if (!this.a((j) (Object) ((bf) this).field_O, false)) {
            return false;
        }
        if (param0 > -82) {
            return true;
        }
        return true;
    }

    private final static void b(int param0, String param1) {
        ae.a(param1, 0);
        if (param0 >= -14) {
          field_L = null;
          r.a((byte) 93, false, sj.field_kb);
          return;
        } else {
          r.a((byte) 93, false, sj.field_kb);
          return;
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = 0;
        if (!super.a(param0, (byte) -2, param2, param3)) {
          if (param2 == -99) {
            return ((bf) this).c(param0, 32);
          } else {
            if (-100 == param2) {
              return ((bf) this).a(17731, param0);
            } else {
              var5 = -65 / ((47 - param1) / 43);
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final int a(fj param0, int param1, String param2, int param3, String param4, int param5) {
        if (param3 != 3) {
          ((bf) this).field_O = null;
          return this.a(param0, param3 + 0, param5, param1, param4, param2, 35);
        } else {
          return this.a(param0, param3 + 0, param5, param1, param4, param2, 35);
        }
    }

    private final boolean a(j param0, boolean param1) {
        dm var3 = null;
        fi var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = param0.a((byte) -9);
        if (var3 != null) {
          if (param1) {
            L0: {
              boolean discarded$2 = ((bf) this).a((fj) null, (byte) -77, -37, '￳');
              var4 = var3.a(-3621);
              if (nn.field_q != var4) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              var4 = var3.a(-3621);
              if (nn.field_q != var4) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new int[][]{new int[4], new int[4], new int[1], new int[4]};
        field_R = new od[3][4];
        field_S = "<col=FFFFFF>Cloak:</col> an advanced technology that renders your ship invisible for 30 seconds, so you can fly down the tunnel eluding the aliens. But beware: each time you fire your weapons or your shield shimmers from an impact, they will know where you are!";
    }
}
