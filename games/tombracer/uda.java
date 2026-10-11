/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uda extends qra {
    static nh field_r;
    private daa field_m;
    private vna field_n;
    static String field_w;
    static String field_o;
    static int field_q;
    private int field_p;
    private boolean field_y;
    static jea field_s;
    private rp[] field_t;
    private int field_u;
    private int field_v;
    static int field_x;

    private final boolean f(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 0) {
          return true;
        }
        ad var2 = (ad) (this.field_n.f(param0 ^ -80));
        while (var2 != null) {
          if (var2.a((byte) -85) &&
            !var2.a(-64)) {
            this.field_v = var2.field_f;
            return true;
          }
          var2 = (ad) (this.field_n.e(111));
        }
        return false;
    }

    final boolean a(char param0, int param1, int param2) {
        boolean discarded$1 = false;
        if (0 != this.field_p &&
          this.i(param1 ^ -26)) {
          if (param1 != 25) {
            discarded$1 = this.f(94);
          }
          if (84 != param2 &&
            param2 != 83) {
            return false;
          }
          this.a(true, this.field_v);
          return true;
        }
        return false;
    }

    final void b(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        ad var6_ref_ad;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var7Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        la.field_j.a(0, 0);
        var3 = aaa.a(false) / 2;
        var4 = koa.b(0) / 2;
        stackIn_3_0 = (this.i(-1)) ? 0 : 1;
        var5 = stackIn_3_0;
        ik.field_h.a(0, 0);
        be.a(gta.field_a.toUpperCase(), 1, qr.field_v, 2431750, 0, 48, 1, -222 + var4, var3 - 360, -1, (byte) 60, 512);
        if (-1 == this.field_u &&
          var5 != 0) {
          be.a(jsa.field_F, 1, eda.field_f, 2431750, 0, 48, 1, koa.b(0) - 48, var3 - 256, -1, (byte) 60, 512);
        }
        var6_ref_ad = (ad) (this.field_n.f(-80));
        while (var6_ref_ad != null) {
          stackIn_12_0 = (var6_ref_ad.field_f == this.field_v) ? 1 : 0;
          var7 = stackIn_12_0;
          var6_ref_ad.a((byte) -9, var7 != 0);
          var6_ref_ad = (ad) (this.field_n.e(119));
        }
        if (param0 >= -50) {
          this.a(33, true);
        }
        ura.a(-10985);
        var6 = this.field_t.length;
        var11 = 0;
        var7Lifetime1 = var11;
        while (var6 > var11) {
          var8 = 64 - var6 * 64 + var3 + (var11 * 128 - 10);
          var9 = var4 + 80;
          if (this.field_t[var11] != null) {
            this.field_t[var11].a(var8, 1400, var9 + 55, (byte) 73);
          } else {
            bsa.field_i.a(-(bsa.field_i.a() >> 1) + var8, -(bsa.field_i.c() >> 1) + var9, 0, 1627389951, 1);
          }
          be.a(this.field_h.a(var11, false).toUpperCase(), 1, qf.field_j, wga.field_a[var11], 0, 32, 1, 55 + var9, var8 - 64, -1, (byte) 60, 128);
          var11++;
        }
        se.f((byte) -6);
        this.d(-27142);
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (!this.field_y) {
          li.b(this.field_h.l(param0 + 41), (byte) 107);
          this.field_y = true;
        }
        for (var3 = 0; this.field_t.length > var3; var3++) {
          if (null != this.field_t[var3]) {
            this.field_t[var3].b(-73);
          }
        }
        if (param1) {
          this.c(7);
        }
        if (this.field_u >= 0) {
          this.field_u = this.field_u - 1;
          if (this.field_u == 0) {
            if (this.field_h.field_D) {
              return;
            }
            this.field_h.c(111);
          }
          return;
        }
        this.field_m.a(32221);
        if (param1 &&
          this.i(param0 - 81)) {
          this.g(-13);
        }
        if (this.field_m.a(false)) {
          this.field_u = 100;
        }
        if (param0 != 80) {
          this.a('H', -116, 32);
        }
        this.field_p = this.field_p + 1;
    }

    private final void a(boolean param0, int param1) {
        if (!this.i(-1)) {
          return;
        }
        if (!param0) {
          return;
        }
        if (null != this.field_f) {
          this.field_f.d(param1, 73);
        } else {
          this.a(this.field_h.field_x, 0, param1);
        }
    }

    uda(qh param0, v param1) {
        super(param0, param1);
        int stackIn_5_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ad var8 = null;
        int var3_intLifetime1;
        this.field_p = 0;
        this.field_v = 0;
        this.field_u = -1;
        try {
          this.field_m = new daa(this.field_c);
          this.field_m.field_b = new w();
          this.field_n = new vna();
          for (var3_int = 0; var3_int < 13; var3_int++) {
            var4 = aaa.a(false);
            var5 = koa.b(0);
            var6 = var3_int % 7 * (0 + (-90 + var4) / 7) + 45;
            stackIn_5_0 = -90;
            if (var3_int >= 7) {
              stackIn_6_1 = (var5 >> 1) + 20;
            } else {
              stackIn_6_1 = (var5 >> 1) - 84;
            }
            var7 = stackIn_5_0 + stackIn_6_1;
            if (var3_int >= 7) {
              var6 += 32;
            }
            var8 = new ad(var6, var7);
            if (this.a(var3_int, (byte) -35)) {
              var8 = new ad(var3_int, var6, var7);
            }
            this.field_n.b((byte) -104, var8);
          }
          var3_intLifetime1 = param0.field_k.field_H.length;
          this.field_t = new rp[var3_intLifetime1];
          this.field_y = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("uda.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_m.a((byte) -69, param2, param0);
        this.field_t[param0] = new rp(param2);
        bua var4 = this.field_t[param0].field_j;
        var4.a(param2, false, param1, 5, true);
        int var5 = var4.c((byte) 114);
        var4.a(param1 + 107, var5, param2, 0, 0);
        jha var6 = ab.a(param1 ^ -41, gl.$cfr$intArgs$a$53ce4ab4c593(82, coa.field_n, new String[]{this.field_c.e(param0, 23807), la.field_m[param2]}));
        iqa.field_c.a(0, var6);
    }

    private final boolean i(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1) {
          this.field_p = -18;
        }
        stackIn_6_0 = (!this.field_h.d((byte) 111)) && (this.field_m.a(0, this.field_h.field_x) == -1);
        return stackIn_6_0;
    }

    private final void g(int param0) {
        int stackIn_26_1 = 0;
        int stackIn_28_2 = 0;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_p == 0) {
          return;
        }
        if (qma.field_c &&
          this.f(0) &&
          hf.field_b == 1) {
          this.a(true, this.field_v);
        }
        if (this.field_h.g(0, 2)) {
          this.field_v = this.field_v - 7;
        }
        if (this.field_h.g(0, 3)) {
          this.field_v = this.field_v + 7;
        }
        if (this.field_h.g(param0 ^ param0, 0)) {
          this.field_v = this.field_v - 1;
        }
        if (this.field_h.g(0, 1)) {
          this.field_v = this.field_v + 1;
        }
        if (this.field_v >= 13) {
          this.field_v = this.field_v - 13;
        }
        if (0 > this.field_v) {
          this.field_v = this.field_v + 13;
        }
        while (!this.a(this.field_v, (byte) -74)) {
          stackIn_26_1 = this.field_v;
          if (!this.field_h.g(0, 0) &&
            !this.field_h.g(0, 2)) {
            stackIn_28_2 = 1;
          } else {
            stackIn_28_2 = -1;
          }
          this.field_v = stackIn_26_1 + stackIn_28_2;
          if (this.field_v >= 13) {
            this.field_v = this.field_v - 13;
          }
          if (this.field_v >= 0) {
            continue;
          }
          this.field_v = 13 + this.field_v;
        }
    }

    private final boolean a(int param0, byte param1) {
        boolean stackIn_16_0 = false;
        if (param1 >= -29) {
          field_s = (jea) null;
        }
        if (!vpa.a(119) &&
          mq.field_e != null) {
          boolean decompiledFrameRemainder0 = true;
          if (!di.field_g[param0] && (!di.field_f[param0] &&
            wla.field_ub <= 0 ||
            !mq.field_e.b((byte) 4, param0)) && !eq.c(0)) {
            stackIn_16_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_16_0 = true;
          }
          return stackIn_16_0;
        }
        return di.field_g[param0];
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
          return false;
        }
        return true;
    }

    public static void h(int param0) {
        field_o = null;
        field_w = null;
        field_s = null;
        if (param0 < 9) {
          uda.h(105);
        }
        field_r = null;
    }

    static {
        field_o = "(finished quicker)";
        field_w = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
