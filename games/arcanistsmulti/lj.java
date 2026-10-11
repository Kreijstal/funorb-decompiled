/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends hg {
    static String field_m;
    private int field_r;
    static String[][] field_o;
    static kc field_t;
    static int[] field_u;
    private long[] field_h;
    static int field_k;
    private long field_f;
    private long field_i;
    private long field_s;
    static int[] field_g;
    static kc field_j;
    static String field_q;
    private int field_l;
    static int[] field_n;
    static String field_p;

    final static void a(int param0, ec param1, int param2, int param3) {
        try {
          if (param3 < 60) {
            lj.b(false);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final long a(byte param0) {
        this.field_f = this.field_f + this.c((byte) 10);
        if (this.field_i > this.field_f) {
          return (-this.field_f + this.field_i) / 1000000L;
        }
        int var2 = -7 / ((-43 - param0) / 58);
        return 0L;
    }

    final void a(int param0) {
        if (param0 != -12619) {
          field_u = (int[]) null;
        }
        this.field_s = 0L;
        if (this.field_i > this.field_f) {
          this.field_f = this.field_f + (-this.field_f + this.field_i);
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          lj.c(-97);
        }
        return hk.field_s;
    }

    final int a(long param0, byte param1) {
        int var4;
        int var5;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 >= -15) {
          return 40;
        }
        if (this.field_f < this.field_i) {
          this.field_s = this.field_s + (-this.field_f + this.field_i);
          this.field_f = this.field_f + (this.field_i - this.field_f);
          this.field_i = this.field_i + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_i = this.field_i + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_i < this.field_f);
        if (this.field_f > this.field_i) {
          this.field_i = this.field_f;
        }
        return var4;
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        qb var4;
        qb var5;
        int var6;
        qb var8;
        qb var9;
        qb var10;
        qb var11;
        qb var12;
        qb var13;
        qb var14;
        qb var15;
        qb var16;
        qb var17;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = param1;
        vn.field_b = ea.field_E[var2];
        wm.field_H[var2] = null;
        wm.field_H[var2] = new qb(640, 480);
        wm.field_H[var2].a();
        if (5 != param1 &&
          param1 != 3 &&
          param1 != 2 &&
          4 != param1 &&
          param1 != 1 && (param1 != 7 ||
          null == jb.field_z &&
          null == r.field_b)) {
          ql.a(640, 480, 0);
        }
        if (param1 == 0) {
          var8 = new qb(640, 480);
          var9 = var8;
          var9.a();
          ArcanistsMulti.a(param1, (byte) -26);
          wm.field_H[var2].a();
          var9.b(0, 0, 128);
        }
        if (param1 == 0) {
          var3 = sc.field_U[param1] * wl.field_L[param1].length + tg.field_f[param1];
          var4 = new qb(640, 480);
          var4.a();
          o.field_F.c(-64 + lm.field_e[param1], var3 - 80);
          j.field_a.c(eo.field_b[param1] - 110, -70 + var3);
          pe.field_Ib.c(lm.field_e[param1] - 39, tg.field_f[param1] - 66);
          rg.field_a.c(-150 + eo.field_b[param1], -80 + tg.field_f[param1]);
          var5 = fj.a(ec.field_c, -22612, ue.field_d, "");
          if (ec.field_c.equals("underdark")) {
            var5.a(0, -8 + (-var5.field_y + 480), 16777215);
          } else {
            if (!ec.field_c.equals("clockwork")) {
              var5.a(0, -var5.field_y + 480, 16777215);
            } else {
              var5.a(0, 434 - var5.field_y, 16777215);
            }
          }
          de.d(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].a();
          var4.b(0, 0, 255);
          o.field_F.c(lm.field_e[param1] - 64, var3 - 80);
          j.field_a.c(eo.field_b[param1] - 110, -70 + var3);
          pe.field_Ib.c(lm.field_e[param1] - 39, -66 + tg.field_f[param1]);
          rg.field_a.c(-150 + eo.field_b[param1], tg.field_f[param1] - 80);
          if (!ec.field_c.equals("underdark")) {
            if (ec.field_c.equals("clockwork")) {
              var5.c(0, 480 - var5.field_y - 46);
            } else {
              var5.c(0, -var5.field_y + 480);
            }
          } else {
            var5.c(0, -8 - var5.field_y + 480);
          }
        }
        if (param1 != 3) {
        }
        if (5 == param1) {
        }
        if (param1 == 6) {
          var10 = new qb(640, 480);
          var10.a();
          gl.a(371, 32, -27327, 576, kf.field_b, 63);
          wm.field_H[var2].a();
          var10.b(0, 0, 128);
          bj.a(var10.field_A, 0);
          var10.a();
          gd.field_mb.c(-(gd.field_mb.field_n / 2) + 320, -5);
          de.d(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].a();
          var10.b(0, 0, 255);
          gd.field_mb.c(-(gd.field_mb.field_n / 2) + 320, -5);
        }
        if (7 == param1) {
          var11 = new qb(640, 480);
          var11.a();
          gl.a(385, 32, -27327, 576, kf.field_b, 63);
          wm.field_H[var2].a();
          var11.b(0, 0, 128);
          bj.a(var11.field_A, 0);
          var11.a();
          gd.field_mb.c(320 - gd.field_mb.field_n / 2, -5);
          de.d(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].a();
          var11.b(0, 0, 255);
          gd.field_mb.c(320 - gd.field_mb.field_n / 2, -5);
        }
        if (param1 == 9) {
          var12 = new qb(640, 480);
          var12.a();
          gl.a(330, 32, -27327, 576, kf.field_b, 63);
          wm.field_H[var2].a();
          var12.b(0, 0, 128);
          var13 = new qb(640, 480);
          var13.a();
          gd.field_mb.c(320 - gd.field_mb.field_n / 2, 35);
          de.d(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].a();
          var13.b(0, 0, 255);
          gd.field_mb.c(-(gd.field_mb.field_n / 2) + 320, 35);
        }
        if (!param0) {
          lj.a(true, -39);
        }
        if (param1 == 8) {
          var14 = new qb(640, 480);
          var14.a();
          fe.field_o.a(0, 0, 16777215);
          de.d(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].a();
          var14.b(0, 0, 255);
          fe.field_o.c(0, 0);
          var15 = new qb(640, 480);
          var15.a();
          o.field_F.c(343, -2);
          j.field_a.c(108, 6);
          de.d(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].a();
          var15.b(0, 0, 255);
          o.field_F.c(343, -2);
          j.field_a.c(108, 6);
        }
        if (param1 == 11) {
          var16 = new qb(640, 480);
          var16.a();
          gd.field_mb.c(320 - gd.field_mb.field_n / 2 - 72, 10);
          gd.field_mb.c(72 + (-(gd.field_mb.field_n / 2) + 320), 10);
          de.d(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].a();
          var16.b(0, 0, 255);
          gd.field_mb.c(248 - gd.field_mb.field_n / 2, 10);
          gd.field_mb.c(72 - gd.field_mb.field_n / 2 + 320, 10);
        }
        if (param1 == 12) {
          var17 = new qb(640, 480);
          var17.a();
          gd.field_mb.c(248 - gd.field_mb.field_n / 2, 0);
          gd.field_mb.c(72 + (320 - gd.field_mb.field_n / 2), 0);
          de.d(4, 4, 0, 0, 640, 480);
          wm.field_H[var2].a();
          var17.b(0, 0, 255);
          gd.field_mb.c(320 - (gd.field_mb.field_n / 2 + 72), 0);
          gd.field_mb.c(72 + (320 - gd.field_mb.field_n / 2), 0);
        }
        rk.g(491697968);
    }

    public static void c(int param0) {
        field_j = null;
        field_m = null;
        field_n = null;
        field_g = null;
        field_u = null;
        field_o = (String[][]) null;
        field_t = null;
        field_p = null;
        field_q = null;
        if (param0 != -80) {
          ec var2 = (ec) null;
          lj.a(-21, (ec) null, -125, -127);
        }
    }

    private final long c(byte param0) {
        int var9 = 0;
        int var10 = ArcanistsMulti.field_G ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -this.field_s + var2;
        this.field_s = var2;
        if (-5000000000L < var4 &&
          var4 < 5000000000L) {
          this.field_h[this.field_r] = var4;
          this.field_r = (this.field_r + 1) % 10;
          if (this.field_l < 1) {
            this.field_l = this.field_l + 1;
          }
        }
        long var6 = 0L;
        int var8 = 82 % ((51 - param0) / 35);
        for (var9 = 1; this.field_l >= var9; var9++) {
          var6 = var6 + this.field_h[(-var9 + this.field_r + 10) % 10];
        }
        return var6 / (long)this.field_l;
    }

    lj() {
        this.field_r = 0;
        this.field_h = new long[10];
        this.field_i = 0L;
        this.field_f = 0L;
        this.field_s = 0L;
        this.field_l = 1;
        this.field_f = System.nanoTime();
        this.field_i = System.nanoTime();
    }

    static {
        field_m = "Similar rating";
        field_u = new int[]{62};
        field_q = "ZOMBIE MONKEY KILLER - ";
        field_g = new int[]{12, 13, 14};
        field_n = new int[]{36, 37, 38};
        field_p = "Lobby";
    }
}
