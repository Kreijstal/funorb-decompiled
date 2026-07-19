/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vv extends wv {
    static gb field_q;
    static boolean field_r;
    private dea field_s;

    final int a(byte param0, int param1) {
        int discarded$2 = 0;
        if (param0 <= 111) {
          discarded$2 = this.g(16, -28);
          return aaa.a(false) / 2 - this.field_m.length * this.field_m[param1].e(-163) / 2 - -(this.field_m[param1].e(-163) * param1);
        } else {
          return aaa.a(false) / 2 - this.field_m.length * this.field_m[param1].e(-163) / 2 - -(this.field_m[param1].e(-163) * param1);
        }
    }

    vv(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_s = new dea(0);
        try {
            this.field_o = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vv.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        this.field_s.a((byte) -117, param0, !param1 ? true : false);
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            this.a(true, false, -53);
            return this.field_n;
        }
        return this.field_n;
    }

    final static void a(int param0, byte param1, int param2, int param3, da param4, String param5, int param6, int param7, int param8) {
        try {
            param4.a(jg.a(param2, (byte) -76, param3), -1, param8, jg.a(param0, (byte) -121, param7), param6, param5);
            int var9_int = -7 % ((66 - param1) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vv.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void h(int param0, int param1) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        da var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        String var12 = null;
        String var13 = null;
        var3 = 500;
        var4 = -(var3 / 2) + aaa.a(false) / 2;
        var5 = param1 + 100;
        oka.a(wja.field_o.toUpperCase(), 2497287, qr.field_v, -1, gg.field_f.c() / 2 + var5 + -30, aaa.a(false) / 2, -1);
        var6 = kn.field_p;
        var7 = kv.field_a.field_h + (kv.field_a.field_g + 4);
        if (param0 >= -116) {
          this.h(-40, -77);
          var8 = var7 * 3;
          var12 = aia.field_v + "<br>" + oqa.a(ip.field_b, uma.field_c, 21297, pna.field_p);
          var10 = dfa.a('#', "<br>", var12, 0);
          var9 = var10;
          var9 = gl.a((byte) 85, var10, new String[]{wba.field_q[32]});
          discarded$2 = be.a(var9, 1, var6, 2431750, var7, var8, 1, gg.field_f.c() / 2 + var5, var4, -1, (byte) 60, var3);
          return;
        } else {
          var8 = var7 * 3;
          var13 = aia.field_v + "<br>" + oqa.a(ip.field_b, uma.field_c, 21297, pna.field_p);
          var10 = dfa.a('#', "<br>", var13, 0);
          var9 = var10;
          var9 = gl.a((byte) 85, var10, new String[]{wba.field_q[32]});
          discarded$3 = be.a(var9, 1, var6, 2431750, var7, var8, 1, gg.field_f.c() / 2 + var5, var4, -1, (byte) 60, var3);
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = this.field_s.e(param0 ^ 103);
        gg.field_f.a(aaa.a(false) + -gg.field_f.a() >> 718103457, var3 - -(gg.field_f.c() / 2));
        this.h(-127, var3);
        super.a(param0, param1);
    }

    public static void d(int param0) {
        int var1 = 121 % ((-79 - param0) / 34);
        field_q = null;
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          field_r = true;
          return this.a((byte) 114, param0) + this.field_m[param0].e(param1 ^ 141);
        } else {
          return this.a((byte) 114, param0) + this.field_m[param0].e(param1 ^ 141);
        }
    }

    static {
        field_q = new gb();
    }
}
