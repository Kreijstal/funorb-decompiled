/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends bc {
    private gj field_t;
    static sl field_w;
    static String field_u;
    private gj[] field_v;
    static boolean field_y;
    static int[][][] field_x;
    static int[][] field_s;

    final void a(ka[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1;
          if (this.field_v[var4_int] == null) {
            this.field_v[var4_int] = new gj();
          }
          this.field_v[param1].field_k = param0;
          if (param2 <= 43) {
            field_s = (int[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ga.M(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(ga param0, boolean param1, int param2) {
        int var5 = 0;
        gj dupTemp$0 = null;
        gj stackIn_8_0 = null;
        gj stackIn_9_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        gj var6 = null;
        gj var7 = null;
        int var8 = 0;
        gj var7Lifetime1;
        gj var7Lifetime2;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          var4_int = 120 / ((-63 - param2) / 38);
          super.a(-122, param0);
          if (param1) {
            for (var5 = 0; var5 < 6; var5++) {
              var6 = this.field_v[var5];
              var7 = var6;
              var7Lifetime1 = var6;
              if (var6 != null) {
                var7Lifetime2 = param0.field_v[var5];
                stackIn_8_0 = var6;
                if (var7Lifetime2 != null) {
                  stackIn_9_1 = var7Lifetime2;
                } else {
                  dupTemp$0 = new gj();
                  param0.field_v[var5] = dupTemp$0;
                  stackIn_9_1 = dupTemp$0;
                }
                ((gj) (Object) stackIn_8_0).a(stackIn_9_1, (byte) 73);
              } else {
                param0.field_v[var5] = null;
              }
            }
            return;
          }
          he.a(this.field_v, 0, param0.field_v, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ga.S(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        ee stackIn_5_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        gj var7 = null;
        gj var9 = null;
        ga var10 = null;
        ng var11 = null;
        gj var12 = null;
        gj var13 = null;
        gj var14 = null;
        gj var15 = null;
        try {
          if (param3 != 97) {
            var10 = (ga) null;
            this.a((ga) null, true, 35);
          }
          if (param0 instanceof ng) {
            stackIn_5_0 = (ee) (param0);
          } else {
            stackIn_5_0 = null;
          }
          var11 = (ng) (stackIn_5_0);
          bc.a(param0.field_l + (param1 + param0.field_i), param0.field_m + param2, param0.field_i + param1, param2 + param0.field_m + param0.field_p, param3 - 96);
          if (var11 != null) {
            param4 = param4 & var11.field_F;
          }
          var7 = this.field_v[0];
          this.field_t.b(param3 + 14914);
          var7.a(param2, this.field_t, this, -1, param1, param0);
          if (var11 != null) {
            if (var11.field_D) {
              var12 = this.field_v[1];
              if (var12 != null) {
                var12.a(param2, this.field_t, this, -1, param1, param0);
              }
            }
            if (var11.field_w) {
              var13 = this.field_v[3];
              if (var11.field_z != 0 &&
                var13 != null) {
                var13.a(param2, this.field_t, this, param3 ^ -98, param1, param0);
              } else {
                var9 = this.field_v[2];
                if (var9 != null) {
                  var9.a(param2, this.field_t, this, param3 ^ -98, param1, param0);
                }
              }
            }
          }
          if (param0.c(118)) {
            var14 = this.field_v[5];
            if (var14 != null) {
              var14.a(param2, this.field_t, this, -1, param1, param0);
            }
          }
          if (!param4) {
            var15 = this.field_v[4];
            if (var15 != null) {
              var15.a(param2, this.field_t, this, param3 - 98, param1, param0);
            }
          }
          this.field_t.a(param1, param0, param2, this, (byte) 44);
          ie.b((byte) -9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("ga.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, ka param1) {
        gj[] var7 = null;
        int var4 = 0;
        gj var5_ref_gj = null;
        int var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var7 = this.field_v;
          gj[] var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5_ref_gj = var7[var4];
            if (var5_ref_gj != null) {
              var5_ref_gj.field_e = param1;
            }
          }
          int var5 = -109 / ((param0 + 88) / 32);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ga.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, eg param1, String[] param2, int param3, String param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = param1.a(param4);
          if (param3 >= var5_int &&
            param4.indexOf("<br>") == -1) {
            param2[0] = param4;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (var5_int + param3 - 1) / param3;
          param3 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param4.length();
          for (var9 = param0; var9 < var8; var9++) {
            var10 = param4.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param4.substring(var7, var9 + 1).trim();
              var12 = param1.a(var11);
              if (var12 >= param3) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param2[incrementValue$1] = var11;
                var7 = 1 + var9;
              }
            }
            if (var10 == 62 &&
              param4.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param2[incrementValue$2] = param4.substring(var7, -3 + var9).trim();
              var7 = 1 + var9;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param2[incrementValue$0] = param4.substring(var7, var8).trim();
          }
          stackIn_24_0 = var6Lifetime1;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("ga.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public ga() {
        this.field_v = new gj[6];
        this.field_t = new gj();
        gj dupTemp$0 = new gj();
        this.field_v[0] = dupTemp$0;
        gj var1 = dupTemp$0;
        var1.b(15011);
    }

    ga(ga param0, boolean param1) {
        this();
        try {
          param0.a(this, param1, 31);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, ka[] param1) {
        int var4 = 0;
        gj[] var3 = null;
        gj var5 = null;
        int var6 = 0;
        gj[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var7 = this.field_v;
          var3 = var7;
          if (param0 != 107) {
            field_y = false;
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_k = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ga.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_s = (int[][]) null;
        field_w = null;
        field_x = (int[][][]) null;
        if (param0 != -79) {
          field_y = false;
        }
        field_u = null;
    }

    final static int a(byte param0, int param1) {
        if (param0 < 3) {
          field_x = (int[][][]) null;
        }
        return oc.field_g[param1 & 2047];
    }

    final gj a(int param0, int param1) {
        if (param1 != -27140) {
          this.field_v = (gj[]) null;
        }
        gj dupTemp$0 = new gj();
        this.field_v[param0] = dupTemp$0;
        return dupTemp$0;
    }

    static {
        field_u = "Unfortunately we are unable to create an account for you at this time.";
        field_w = new sl();
        field_x = new int[][][]{new int[][]{new int[]{40, 40, 40}, new int[]{40, 40}, new int[]{40, 40}, new int[]{40, 40, 40, 40, 40, 40}, new int[]{40, 40}, new int[]{0}, new int[]{100, 100, 100, 100, 100, 80}}, new int[][]{new int[]{60, 60}, new int[]{60, 60, 60, 60}, new int[]{60, 60, 60, 60, 60, 60}, new int[]{60, 60, 60, 60, 60, 60}, new int[]{60, 60, 60, 60, 60}, new int[]{60, 60, 60, 60, 60}, new int[]{0}}, new int[][]{new int[]{30, 30, 30}, new int[]{30, 30}, new int[]{30, 30, 30, 30}, new int[]{30, 30, 30, 30, 30, 30}, new int[]{30, 30, 30}, new int[]{0}, new int[]{60, 60, 60, 60, 60, 60}}};
        field_s = new int[][]{new int[]{6, 0, 0, 5, 0, 0, 0}, new int[]{6, 5, 4, 0, 0, 7, 0}, new int[]{6, 0, 0, 0, 6, 0, 6}};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$f0c91481eb80(int param0, int param1) {
        if (param0 < 3) {
          field_x = (int[][][]) null;
        }
        return oc.field_g[param1 & 2047];
    }
}
