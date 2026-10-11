/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or {
    private double field_j;
    static int[] field_e;
    private double field_i;
    private double field_d;
    static jj field_f;
    static int field_c;
    static er field_b;
    static String field_h;
    static String field_k;
    static String[] field_n;
    static String field_l;
    static String field_a;
    private double field_m;
    static String field_g;

    final void a(byte param0, double param1, double param2, double param3, double param4) {
        param1 = param1 * 0.5;
        double var10 = Math.sin(param1);
        double var12 = Math.cos(param1);
        this.field_j = param3 * var10;
        this.field_d = var10 * param4;
        if (param0 == 40) {
          this.field_i = var12;
          this.field_m = param2 * var10;
          return;
        }
        field_l = (String) null;
        this.field_i = var12;
        this.field_m = param2 * var10;
    }

    final static void b(byte param0) {
        nj.field_b = new np(hb.field_D, ji.field_s, eh.field_a, ee.field_b, fr.field_a, ja.field_e);
        if (param0 <= 76) {
          or.b(-8);
        }
    }

    final static void b(int param0) {
        kh.a((byte) -32);
        tk.field_e = true;
        if (param0 == 4) {
          un.field_Ib = true;
          ch.field_e.i(0);
          fi.a(param0 + 31816, false, wp.field_c);
          return;
        }
        field_l = (String) null;
        un.field_Ib = true;
        ch.field_e.i(0);
        fi.a(param0 + 31816, false, wp.field_c);
    }

    final static String a(int param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var9;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0 >= 112) {
          var15 = "(" + gf.field_d + " " + jb.field_G + " " + cp.field_c + ") " + lc.field_f;
          var1 = var15;
          if (ca.field_b <= 0) {
            return var1;
          }
          var1Lifetime3 = var15 + ":";
          for (var2 = 0; ca.field_b > var2; var2++) {
            var16 = var1Lifetime3 + ' ';
            var3 = 255 & id.field_f.field_p[var2];
            var4 = var3 >> 4;
            if (10 > var4) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var3 = var3 & 15;
            var17 = var16 + (char)var4;
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var1Lifetime3 = var17 + (char)var3;
          }
          return var1Lifetime3;
        }
        field_n = (String[]) null;
        var9 = "(" + gf.field_d + " " + jb.field_G + " " + cp.field_c + ") " + lc.field_f;
        var1Lifetime1 = var9;
        if (ca.field_b <= 0) {
          return var1Lifetime1;
        }
        var1Lifetime2 = var9 + ":";
        for (var2Lifetime1 = 0; ca.field_b > var2Lifetime1; var2Lifetime1++) {
          var13 = var1Lifetime2 + ' ';
          var3Lifetime1 = 255 & id.field_f.field_p[var2Lifetime1];
          var4Lifetime1 = var3Lifetime1 >> 4;
          if (10 > var4Lifetime1) {
            var4Lifetime1 += 48;
          } else {
            var4Lifetime1 += 55;
          }
          var3Lifetime1 = var3Lifetime1 & 15;
          var14 = var13 + (char)var4Lifetime1;
          if (var3Lifetime1 < 10) {
            var3Lifetime1 += 48;
          } else {
            var3Lifetime1 += 55;
          }
          var1Lifetime2 = var14 + (char)var3Lifetime1;
        }
        return var1Lifetime2;
    }

    final void a(int[] param0, int param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var22 = 0.0;
        try {
          var3_double = this.field_i * this.field_i;
          var5 = this.field_d * this.field_i;
          var7 = this.field_i * this.field_m;
          var9 = this.field_j * this.field_i;
          var11 = this.field_d * this.field_d;
          var13 = this.field_m * this.field_d;
          var15 = this.field_d * this.field_j;
          var17 = this.field_m * this.field_m;
          int var21 = -96 / ((param1 - 58) / 46);
          var19 = this.field_m * this.field_j;
          var22 = this.field_j * this.field_j;
          param0[6] = (int)(65536.0 * (var13 + (var13 - var9 - var9)));
          param0[7] = (int)((-var11 + (var17 + var3_double) - var22) * 65536.0);
          param0[10] = (int)((var19 + (-var5 + (-var5 + var19))) * 65536.0);
          param0[8] = (int)(65536.0 * (var19 + var5 + var19 + var5));
          param0[5] = (int)((var15 - var7 - var7 + var15) * 65536.0);
          param0[4] = (int)(65536.0 * (var9 + (var13 + (var13 + var9))));
          param0[9] = (int)(65536.0 * (var15 + var7 + var15 + var7));
          param0[3] = (int)(65536.0 * (var3_double + var11 - var22 - var17));
          param0[11] = (int)((var22 + var3_double - var17 - var11) * 65536.0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "or.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(String param0, boolean param1, int param2, boolean param3) {
        try {
          if (param2 != 65536) {
            String var5 = (String) null;
            or.a((String) null, false, -70, false);
          }
          kh.a((byte) -32);
          ch.field_e.i(param2 - 65536);
          eb.field_d = new ob(ff.field_u, (String) null, tk.field_e, param3, param1);
          n.field_b = new ga(ch.field_e, eb.field_d);
          ch.field_e.b(n.field_b, 0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "or.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(byte param0) {
        int var4 = 111 / ((60 - param0) / 51);
        double var2 = this.field_d * this.field_d + this.field_i * this.field_i + this.field_m * this.field_m + this.field_j * this.field_j;
        if (0.999999999999 > var2) {
          var2 = 1.0 / Math.sqrt(var2);
          this.field_j = this.field_j * var2;
          this.field_i = this.field_i * var2;
          this.field_d = this.field_d * var2;
          this.field_m = this.field_m * var2;
          return;
        }
        if (var2 > 1.000000000001) {
          var2 = 1.0 / Math.sqrt(var2);
          this.field_j = this.field_j * var2;
          this.field_i = this.field_i * var2;
          this.field_d = this.field_d * var2;
          this.field_m = this.field_m * var2;
          return;
        }
    }

    final void a(or param0, int param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        if (param1 != 55) {
          return;
        }
        try {
          var3_double = -(param0.field_j * this.field_j) + (-(param0.field_d * this.field_d) + this.field_i * param0.field_i - param0.field_m * this.field_m);
          var5 = -(this.field_m * param0.field_j) + (param0.field_i * this.field_d + param0.field_d * this.field_i + param0.field_m * this.field_j);
          var7 = param0.field_j * this.field_d + (-(param0.field_d * this.field_j) + param0.field_i * this.field_m + param0.field_m * this.field_i);
          this.field_j = param0.field_d * this.field_m + this.field_j * param0.field_i - this.field_d * param0.field_m + param0.field_j * this.field_i;
          this.field_m = var7;
          this.field_i = var3_double;
          this.field_d = var5;
          this.c((byte) 119);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "or.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_h = null;
        if (param0 > 28) {
          field_n = null;
          field_l = null;
          field_g = null;
          field_a = null;
          field_b = null;
          field_e = null;
          field_f = null;
          return;
        }
        field_g = (String) null;
        field_n = null;
        field_l = null;
        field_g = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_f = null;
    }

    final static tp a(int param0, String param1) {
        String var2 = null;
        tp var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        tp stackIn_6_0 = null;
        tp stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (jn.field_g == null) {
            stackIn_3_0 = null;
            return (tp) (stackIn_3_0);
          }
          if (param0 <= 54) {
            stackIn_6_0 = (tp) null;
            return stackIn_6_0;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = rc.a(var6, 320);
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (tp) (jn.field_g.a(3661, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Mb);
            var4 = rc.a(var7, 320);
            if (var4 == null) {
              var4 = var3.field_Mb;
            }
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (tp) (jn.field_g.a(-122));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("or.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public or() {
        this.field_i = 1.0;
    }

    static {
        field_c = -1;
        field_l = "You won!";
        field_k = "Game";
        field_h = "Playing";
        field_a = "Invalid name";
        field_n = new String[16];
        field_g = "Previous best: <%0>";
    }
}
