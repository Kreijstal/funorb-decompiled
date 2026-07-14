/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends gb implements n {
    private eb field_J;
    static ok field_K;
    private eb field_G;
    static String field_H;
    private eb field_F;
    static String field_I;

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 > -106) {
            return;
        }
        int var5 = param0 + ((cg) this).field_w;
        int var6 = ((cg) this).field_u - -param3;
        int discarded$0 = qk.field_e.a(gb.field_A, 20 + var5, 20 + var6, -40 + ((cg) this).field_p, ((cg) this).field_n + -50, 16777215, -1, 1, 0, qk.field_e.field_s);
        super.a(param0, -125, param2, param3);
    }

    final static void f(byte param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = Terraphoenix.field_V;
        ob.b();
        me.field_m = new int[260];
        hb.field_l = 11;
        for (var1 = 0; var1 < 256; var1++) {
            var2 = 15.0;
            me.field_m[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
        }
        if (param0 > -43) {
            field_H = null;
        }
        int var5 = 256;
        var1 = var5;
        while (me.field_m.length > var5) {
            me.field_m[var5] = 255;
            var5++;
        }
    }

    public static void a(int param0) {
        field_H = null;
        if (param0 != 4) {
            return;
        }
        field_K = null;
        field_I = null;
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Terraphoenix.field_V;
          var6 = 36 / ((param4 - -5) / 57);
          if (((cg) this).field_G != param0) {
            if (((cg) this).field_F == param0) {
              oe.a(-47);
              break L0;
            } else {
              if (((cg) this).field_J == param0) {
                bm.a(-126);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            ld.a(1);
            break L0;
          }
        }
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (param3 == 98) {
            return ((cg) this).a(48, param1);
        }
        if ((param3 ^ -1) == -100) {
            return ((cg) this).a(param1, (byte) 100);
        }
        return false;
    }

    public cg() {
        super(0, 0, 476, 225, (cj) null);
        ((cg) this).field_F = new eb(td.field_j, (sc) null);
        ((cg) this).field_G = new eb(sl.field_f, (sc) null);
        ((cg) this).field_J = new eb(aj.field_c, (sc) null);
        ic var1 = new ic();
        ((cg) this).field_F.field_l = (cj) (Object) var1;
        ((cg) this).field_G.field_l = (cj) (Object) var1;
        ((cg) this).field_J.field_l = (cj) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -338210879;
        ((cg) this).field_G.a(-var2 + (((cg) this).field_n - 48), (byte) 48, var4, ((cg) this).field_p - var3 >> 2043909025, 30);
        ((cg) this).field_J.a(((cg) this).field_n + -48 - var2, (byte) 51, var4, var4 + (-var3 + ((cg) this).field_p >> -1312206271) + var2, 30);
        ((cg) this).field_F.a(-(2 * var2) + -78 + ((cg) this).field_n, (byte) 111, var3, ((cg) this).field_p + -var3 >> 1986338625, 30);
        ((cg) this).field_G.field_r = (sc) this;
        ((cg) this).field_F.field_r = (sc) this;
        ((cg) this).field_J.field_r = (sc) this;
        ((cg) this).field_F.field_x = sj.field_d;
        ((cg) this).field_J.field_x = qf.field_b;
        ((cg) this).b((byte) 95, (gl) (Object) ((cg) this).field_G);
        ((cg) this).b((byte) 95, (gl) (Object) ((cg) this).field_F);
        ((cg) this).b((byte) 95, (gl) (Object) ((cg) this).field_J);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "    Covering Terrain";
    }
}
