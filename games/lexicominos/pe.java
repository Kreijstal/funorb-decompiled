/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static String field_e;
    static char field_b;
    private int field_i;
    private int field_f;
    private int[] field_g;
    private int[] field_h;
    static String field_a;
    private int field_d;
    static String field_j;
    private int field_c;

    public static void a(byte param0) {
        int var1 = -40 / ((36 - param0) / 44);
        field_j = null;
        field_e = null;
        field_a = null;
    }

    final int c(int param0) {
        if (!(this.field_d != param0)) {
            this.a(param0 ^ -2034);
            this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_g[fieldTemp$0];
    }

    final static void a(int param0, int param1, int param2, le param3, int param4, db[] param5, db[] param6, int param7, le param8, int param9, int param10, int param11, int param12, int param13, boolean param14) {
        try {
            db[] var16 = (db[]) null;
            aj.a(0, param9, 0, ea.field_b, param3, g.field_n, 480, param7, ec.field_c, param8, param13, param0, param5, (db[]) null, param4, true, param12, param6, param2, param10, param1);
            if (param11 > -58) {
                field_e = (String) null;
            }
            bl.a(param14, 2);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "pe.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final void a(int param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          fieldTemp$0 = this.field_i + 1;
          this.field_i = this.field_i + 1;
          this.field_f = this.field_f + fieldTemp$0;
          if (param0 == -2034) {
            break L0;
          } else {
            this.field_d = 0;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (-257 >= (var2 ^ -1)) {
            return;
          } else {
            L2: {
              var3 = this.field_h[var2];
              if ((var2 & 2) != 0) {
                if (-1 != (1 & var2 ^ -1)) {
                  this.field_c = this.field_c ^ this.field_c >>> 1629135984;
                  break L2;
                } else {
                  this.field_c = this.field_c ^ this.field_c << 924088194;
                  break L2;
                }
              } else {
                if (0 == (var2 & 1)) {
                  this.field_c = this.field_c ^ this.field_c << -1151052115;
                  break L2;
                } else {
                  this.field_c = this.field_c ^ this.field_c >>> -1807891514;
                  break L2;
                }
              }
            }
            this.field_c = this.field_c + this.field_h[255 & 128 + var2];
            dupTemp$1 = this.field_f + this.field_c + this.field_h[vg.a(1020, var3) >> -525883838];
            var4 = dupTemp$1;
            this.field_h[var2] = dupTemp$1;
            dupTemp$2 = this.field_h[vg.a(255, var4 >> -261288888 >> -436990558)] - -var3;
            this.field_f = dupTemp$2;
            this.field_g[var2] = dupTemp$2;
            var2++;
            continue L1;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var11 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -24892) {
            return;
        }
        int var8 = -1640531527;
        int var4 = -1640531527;
        int var3 = -1640531527;
        int var6 = -1640531527;
        int var5 = -1640531527;
        int var10 = -1640531527;
        int var9 = -1640531527;
        int var7 = -1640531527;
        for (var2 = 0; (var2 ^ -1) > -5; var2++) {
            var3 = var3 ^ var4 << -1744189045;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 230049858;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -1354752056;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -928714640;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -1383598294;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -267155900;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 1211697160;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -427202519;
            var5 = var5 + var10;
            var3 = var3 + var4;
        }
        for (var2 = 0; -257 < (var2 ^ -1); var2 += 8) {
            var4 = var4 + this.field_g[1 + var2];
            var3 = var3 + this.field_g[var2];
            var10 = var10 + this.field_g[var2 + 7];
            var6 = var6 + this.field_g[var2 - -3];
            var9 = var9 + this.field_g[6 + var2];
            var8 = var8 + this.field_g[var2 + 5];
            var5 = var5 + this.field_g[2 + var2];
            var7 = var7 + this.field_g[var2 - -4];
            var3 = var3 ^ var4 << 1244647339;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 2024320354;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 852485224;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -959607888;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -1949847414;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 580294468;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << -730799000;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 1723287689;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_h[var2] = var3;
            this.field_h[1 + var2] = var4;
            this.field_h[var2 + 2] = var5;
            this.field_h[var2 - -3] = var6;
            this.field_h[4 + var2] = var7;
            this.field_h[var2 + 5] = var8;
            this.field_h[var2 + 6] = var9;
            this.field_h[7 + var2] = var10;
        }
        for (var2 = 0; -257 < (var2 ^ -1); var2 += 8) {
            var9 = var9 + this.field_h[var2 - -6];
            var8 = var8 + this.field_h[5 + var2];
            var4 = var4 + this.field_h[var2 + 1];
            var7 = var7 + this.field_h[var2 + 4];
            var3 = var3 + this.field_h[var2];
            var10 = var10 + this.field_h[7 + var2];
            var5 = var5 + this.field_h[2 + var2];
            var6 = var6 + this.field_h[var2 - -3];
            var3 = var3 ^ var4 << -74087637;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -512437438;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -933219704;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -153572816;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -626644502;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -1133152316;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 557812456;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 2083273353;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_h[var2] = var3;
            this.field_h[1 + var2] = var4;
            this.field_h[var2 + 2] = var5;
            this.field_h[var2 + 3] = var6;
            this.field_h[4 + var2] = var7;
            this.field_h[var2 - -5] = var8;
            this.field_h[6 + var2] = var9;
            this.field_h[var2 - -7] = var10;
        }
        this.a(-2034);
        this.field_d = 256;
    }

    pe(int[] param0) {
        int var2_int = 0;
        try {
            this.field_g = new int[256];
            this.field_h = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_g[var2_int] = param0[var2_int];
            }
            this.b(-24892);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Passwords must be between 5 and 20 characters long";
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Loading graphics";
    }
}
