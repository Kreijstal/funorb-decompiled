/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu extends me {
    private int field_j;
    private int field_m;
    static Object field_l;
    static String field_k;
    private int field_n;

    final void b(byte param0) {
        int var9 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var15;
        int var11;
        int var12;
        int var13;
        int var14;
        var15 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_i.l(106);
        if (param0 >= -13) {
          return;
        }
        var3 = 16776960;
        var4 = 11184810;
        var5 = 20;
        var6 = 50 + this.field_g.field_P * var5;
        var7 = this.field_j;
        var8 = var7 + 40;
        rba.a(192, var6, 3145728, this.field_n, (byte) 47, var7 - 16, this.field_m - this.field_n / 2);
        tp.a(-(this.field_n / 2) + this.field_m, (byte) -85, var7 - 16, 5242880, 2, var6, this.field_n);
        oka.a(wj.field_b, 16777215, kn.field_p, -1, var7 + 4, this.field_m, 0);
        for (var9 = 0; var9 < this.field_g.field_H.length; var9++) {
          var10 = this.field_g.field_e.field_b[var9];
          if (var10 != -1) {
            if (var10 == var2) {
              var11 = var3;
            } else {
              var11 = var4;
            }
            var12 = this.field_g.field_H[var10].e(false);
            var13 = this.field_g.field_H[var10].j(false);
            var14 = var13 + var12;
            oka.a(rka.a(1 + var9, 114) + "  " + this.field_i.a(var10, false) + "  " + rja.field_c + ": " + var14 + " (" + var12 + "+" + var13 + ")", var11, kn.field_p, -1, var8 + var9 * var5, this.field_m, 0);
          }
        }
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 != -28) {
          field_l = (Object) null;
        }
        field_l = null;
    }

    final static ci a(byte param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 > 0) {
          gu.c(-61);
        }
        var2 = param1;
        if (var2 == 0) {
          return (ci) ((Object) new nga());
        }
        if (var2 == 1) {
          return (ci) ((Object) new lm());
        }
        if (var2 == 2) {
          return (ci) ((Object) new qga());
        }
        if (var2 == 3) {
          return (ci) ((Object) new gm());
        }
        if (var2 == 4) {
          return (ci) ((Object) new bma());
        }
        if (var2 == 5) {
          return (ci) ((Object) new cl());
        }
        if (var2 == 6) {
          return (ci) ((Object) new wja());
        }
        if (var2 == 7) {
          return (ci) ((Object) new eka());
        }
        if (var2 == 8) {
          return (ci) ((Object) new fs());
        }
        if (var2 == 9) {
          return (ci) ((Object) new pv());
        }
        if (var2 == 10) {
          return (ci) ((Object) new wna());
        }
        if (var2 == 11) {
          return (ci) ((Object) new vda());
        }
        if (var2 == 12) {
          return (ci) ((Object) new ifa());
        }
        if (var2 == 13) {
          return (ci) ((Object) new bda());
        }
        if (var2 == 14) {
          return (ci) ((Object) new gla());
        }
        if (var2 == 15) {
          return (ci) ((Object) new nw());
        }
        if (var2 == 16) {
          return (ci) ((Object) new vc());
        }
        if (var2 == 17) {
          return (ci) ((Object) new wsa());
        }
        if (var2 == 18) {
          return (ci) ((Object) new hb());
        }
        if (var2 == 19) {
          return (ci) ((Object) new vla());
        }
        if (var2 == 20) {
          return (ci) ((Object) new nfa());
        }
        if (var2 == 21) {
          return (ci) ((Object) new nia());
        }
        if (var2 == 22) {
          return (ci) ((Object) new sba());
        }
        if (var2 == 23) {
          return (ci) ((Object) new fl());
        }
        if (24 == var2) {
          return (ci) ((Object) new jda());
        }
        if (var2 == 25) {
          return (ci) ((Object) new cma());
        }
        if (var2 == 26) {
          return (ci) ((Object) new hv());
        }
        if (var2 == 27) {
          return (ci) ((Object) new bj());
        }
        if (28 == var2) {
          return (ci) ((Object) new iia());
        }
        if (29 == var2) {
          return (ci) ((Object) new rda());
        }
        if (var2 == 30) {
          return (ci) ((Object) new ksa());
        }
        if (var2 == 31) {
          return (ci) ((Object) new qv());
        }
        if (32 == var2) {
          return (ci) ((Object) new un());
        }
        if (var2 == 33) {
          return (ci) ((Object) new jv());
        }
        if (var2 == 34) {
          return (ci) ((Object) new lva());
        }
        if (var2 == 35) {
          return (ci) ((Object) new go());
        }
        if (var2 == 36) {
          return (ci) ((Object) new gia());
        }
        if (var2 == 37) {
          return (ci) ((Object) new voa());
        }
        if (38 == var2) {
          return (ci) ((Object) new bk());
        }
        if (39 == var2) {
          return (ci) ((Object) new coa());
        }
        return null;
    }

    final static void a(int param0, boolean param1, String param2, String param3, String param4, int param5) {
        gqa var6 = null;
        try {
          if (!param1) {
            String var7 = (String) null;
            gu.a(-67, true, (String) null, (String) null, (String) null, 15);
          }
          var6 = new gqa(param5, param2, param0, param4, param3);
          tna.a(16599, var6);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gu.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    gu(qh param0) {
        super(param0);
        this.field_j = 350;
        this.field_m = 320;
        this.field_n = 300;
    }

    final void a(byte param0) {
        if (param0 > -107) {
          this.a((byte) -84);
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = -43 % ((29 - param2) / 57);
        return false;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        return false;
    }

    static {
        field_k = "Hold <img=8><img=9> while walking into a moveable block to grab it, then push or pull it around the room. Release <img=8><img=9> to let go.";
    }
}
