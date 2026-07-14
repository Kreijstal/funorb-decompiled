/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends hs implements he {
    static int field_J;
    private no field_M;
    static int field_L;
    private fw field_K;

    final void a(int param0, int param1, byte param2, int param3) {
        this.a(param0, param1, (byte) -114, param3);
        if (param2 >= -82) {
            Object var6 = null;
            ((wr) this).a(51, -1, -80, (kb) null);
        }
        gl.field_e.b(mq.field_Nb, param0 - (-((wr) this).field_B + -4), 4 + (param1 + ((wr) this).field_p) - -gl.field_e.field_H, 16777215, -1);
    }

    wr(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (kh) null);
        ((wr) this).field_M = new no((kh) (Object) new lu(10000536), c.field_c, 0, 0, 140, 25);
        ((wr) this).field_M.a((byte) -101, new sb());
        ((wr) this).field_K = new fw(ro.field_kb, (qo) this);
        ((wr) this).field_C = new kb[]{(kb) (Object) ((wr) this).field_M, (kb) (Object) ((wr) this).field_K};
        ((wr) this).field_K.field_k = (kh) (Object) new nu();
        ((wr) this).e(0);
    }

    final void d(byte param0) {
        int var2 = 250;
        if (param0 < 84) {
            ((wr) this).field_M = null;
        }
        ((wr) this).field_M.a(-var2 + ((wr) this).field_l >> 1614630337, 140, -25 + (((wr) this).field_w - -20) >> -802366399, 8192, 25);
        ((wr) this).field_K.a(10 + ((-var2 + ((wr) this).field_l >> -2077435391) - -140), 100, 2 + (-30 + ((wr) this).field_w + 20 >> 1107692097), 8192, 30);
    }

    final static void a(byte param0, String param1) {
        bw.field_g = true;
        vu.field_Q.field_X = param1;
        int var2 = so.field_b.field_a;
        int var3 = so.field_b.field_g;
        int var4 = vu.field_Q.field_Z.a(param1, 272, vu.field_Q.field_pb);
        int var5 = -(var4 / 2) + var3 / 2 - 103;
        if (param0 < 27) {
            field_J = -20;
        }
        qc.field_c.a(-(var5 * 2) + (-120 + var3), -20500, 320, var5, (var2 + -320) / 2);
        qc.field_c.field_G = tq.a(11579568, false, qc.field_c.field_ob, 2105376, 3, 8421504);
        vu.field_Q.a(-20 + (qc.field_c.field_ob - 24), -20500, qc.field_c.field_gb + -48, 16, 24);
        td.field_g.a(24, -20500, 80, qc.field_c.field_ob + -20 - 24, 120);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (!(((wr) this).field_M.a(-918933630).a(false) == oo.field_g)) {
            return;
        }
        if (param1 != 11) {
            return;
        }
        ak.a(((wr) this).field_M.l(param1 ^ 35), ((wr) this).field_M.m(-26458), ((wr) this).field_M.a((byte) -77), 30);
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 95) {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                if (param0 == 40) {
                  break L1;
                } else {
                  if (param0 != 41) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        this.a(param0, param1, param2, param3);
        ((wr) this).field_K.field_I = ((wr) this).field_M.a(-918933630).a(false) == oo.field_g ? true : false;
    }

    final static void a(byte param0, aj param1, int param2) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        bv var8 = vl.field_n;
        bv var9 = var8;
        var9.h(32161, param2);
        var9.field_q = var9.field_q + 1;
        int var4 = var9.field_q;
        var9.b(1, 1);
        var9.b(true, param1.field_s);
        var9.b(true, param1.field_n);
        var9.b(true, param1.field_q);
        var9.a((byte) -99, param1.field_k);
        var9.a((byte) -92, param1.field_m);
        var9.a((byte) -103, param1.field_o);
        var9.a((byte) -62, param1.field_r);
        var9.b(1, param1.field_l.length);
        for (var5 = 0; var5 < param1.field_l.length; var5++) {
            var8.a((byte) -70, param1.field_l[var5]);
        }
        if (param0 >= -26) {
            Object var7 = null;
            wr.a((byte) -126, (aj) null, 112);
        }
        int discarded$0 = var9.b((byte) -39, var4);
        var9.e(var9.field_q + -var4, 5930);
    }

    static {
    }
}
