/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ch {
    static String field_w;
    int field_u;
    static double field_r;
    static String field_z;
    static gb field_t;
    static int field_x;
    int field_v;
    static java.awt.Image field_y;
    static int[] field_s;

    public static void b(boolean param0) {
        if (!param0) {
          he.b(false);
        }
        field_z = null;
        field_t = null;
        field_w = null;
        field_y = null;
        field_s = null;
    }

    final static pg[] c(int param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 > -120) {
          return (pg[]) null;
        }
        pg[] var1 = new pg[sc.field_c];
        for (var2 = 0; sc.field_c > var2; var2++) {
          var1[var2] = new pg(ra.field_a, vc.field_e, th.field_Jb[var2], nh.field_O[var2], sf.field_X[var2], hd.field_r[var2], ja.field_e[var2], bf.field_d);
        }
        uj.d(113);
        return var1;
    }

    final void a(int param0) {
        super.a(param0);
        this.field_u = 0;
        this.field_v = 0;
    }

    final static void a(double param0, oc param1, int param2, double param3, oj param4, int param5, int param6) {
        og dupTemp$0 = null;
        og dupTemp$1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        try {
          if (r.field_a != 0 && ((bm.field_c != 0 ||
            3 != rl.field_c) &&
            (bm.field_c != 1 ||
            rl.field_c != 2))) {
            return;
          }
          var13 = -122 / ((20 - param5) / 48);
          var11 = -param2 + param1.field_e;
          var12 = -param6 + param1.field_g;
          if (var11 > -24 &&
            var11 < 24 &&
            -24 < var12 &&
            var12 < 24) {
            param4.field_F = param4.field_F - 1;
            jn.field_F[ib.field_c].field_c = 256.0 * Math.random();
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1);
            jn.field_F[ib.field_c].field_l.a(param4.field_l, -28860);
            jn.field_F[ib.field_c].field_e = 1;
            jn.field_F[ib.field_c].field_h = 0;
            jn.field_F[ib.field_c].field_i = 1;
            dupTemp$0 = jn.field_F[ib.field_c].field_l;
            dupTemp$0.field_f = dupTemp$0.field_f + 0.5;
            dupTemp$1 = jn.field_F[ib.field_c].field_l;
            dupTemp$1.field_a = dupTemp$1.field_a + 0.5;
            jn.field_F[ib.field_c].field_l.a((int)(Math.random() * 10.0), (byte) 94, jn.field_F[ib.field_c].field_c);
            ib.field_c = ib.field_c + 1;
          }
          if ((7 & em.field_c) == 0 &&
            uj.field_l == 1) {
            var9_int = (int)(24.0 * (-param4.field_l.field_f + ((double)(-param1.field_e) + ((double)param2 + param3))));
            var10 = (int)(((double)(-param1.field_g) + (param0 + (double)param6) - param4.field_l.field_a) * 24.0);
            var14 = (int)Math.sqrt((double)(var10 * var10 + var9_int * var9_int));
            if (400 < var14) {
              return;
            }
            var15 = -var14 + 400;
            if (jh.field_db >= var15) {
              return;
            }
            jh.field_db = var15;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_24_0 = var9;
          stackIn_24_1 = new StringBuilder().append("he.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(p param0, oj param1, byte param2, double param3, double param4) {
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param2 < 104) {
            return;
          }
          var7_int = (int)((param4 - (double)param0.field_j.field_e - param0.field_l.field_f) * 24.0);
          var8 = (int)((-param0.field_l.field_a + ((double)(-param0.field_j.field_g) + param3)) * 24.0);
          if (var7_int >= -24 &&
            var7_int <= 24 &&
            var8 >= -24 &&
            24 > var8) {
            param1.field_z = 4;
            param1.field_F = 255;
            ci.a(1, 76);
            nh.a(param1, -29966);
          }
          param0.field_e = param0.field_e + 2;
          if (param0.field_e > 32) {
            param0.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int c(int param0, byte param1) {
        int var3 = 122 % ((-73 - param1) / 45);
        int var2 = (16707538 & param0) >> 16;
        int var4 = 254 & param0 >> 8;
        int var5 = param0 & 254;
        return var5 >> 1 | (var2 << 15 | var4 << 7);
    }

    final void b(int param0) {
        super.b(param0 ^ 0);
        if (param0 != -24) {
          he.b(false);
        }
    }

    he(kh param0) {
        super(param0, new mn[5]);
        int var2_int = 0;
        int var3 = 0;
        this.field_u = 0;
        this.field_v = 0;
        try {
          for (var2_int = 0; var2_int < this.field_g.length; var2_int++) {
            this.field_g[var2_int] = new mn();
            for (var3 = 0; var3 < 4; var3++) {
              this.field_g[var2_int].field_d[var3] = var2_int <= var3 ? 0 : 256;
            }
          }
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "Passwords must be between 5 and 20 letters and numbers";
        field_z = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_r = Math.atan2(1.0, 0.0);
        field_s = new int[4];
    }
}
