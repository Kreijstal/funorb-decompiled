/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur extends qr {
    static String field_yb;
    private qr field_Gb;
    private qr field_Fb;
    static gb field_zb;
    private qr field_xb;
    static String[] field_Bb;
    private qr field_Eb;
    static String field_Db;
    private qr field_Ab;
    private qr field_Cb;
    private int field_Hb;

    ur(long param0, qr param1, qr param2, qr param3, qr param4) {
        super(param0, (qr) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        qr var9 = null;
        qr var10 = null;
        try {
          this.field_Fb = new qr(0L, param1);
          this.field_Cb = new qr(0L, param2);
          this.a(4, this.field_Fb);
          this.a(4, this.field_Cb);
          this.field_Gb = new qr(0L, (qr) null);
          this.a(4, this.field_Gb);
          this.field_xb = new qr(0L, param3);
          this.field_Eb = new qr(0L, param3);
          this.field_Eb.field_r = true;
          var9 = this.field_xb;
          var10 = var9;
          var10.field_r = true;
          this.field_Gb.a(4, this.field_xb);
          this.field_Gb.a(4, this.field_Eb);
          this.field_Ab = new qr(0L, param4);
          this.field_Ab.field_P = true;
          this.field_Gb.a(4, this.field_Ab);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("ur.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean i(int param0) {
        if (this.field_xb.field_rb != 0) {
          this.field_Hb = 20;
          return true;
        }
        if (0 == this.field_xb.field_ub) {
          if (param0 > 84) {
            return false;
          }
          return true;
        }
        if (this.field_Hb > 0) {
          this.field_Hb = this.field_Hb - 1;
        }
        if (0 != this.field_Hb) {
          if (param0 > 84) {
            return false;
          }
          return true;
        }
        if (this.field_Ab.field_N + this.field_Ab.field_w > bb.field_b) {
          this.field_Hb = 3;
          return true;
        }
        if (param0 > 84) {
          return false;
        }
        return true;
    }

    final int a(int param0, int param1, int param2, boolean param3) {
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var6 = this.field_Gb.field_mb - this.field_Ab.field_mb;
        if (0 < var6) {
          var7 = this.field_Ab.field_db;
          var8 = -param2 + param1;
          var5 = (var6 / 2 + var8 * var7) / var6;
        }
        if (param0 != -5639) {
          return 96;
        }
        if (!param3) {
          if (-param2 + param1 < var5) {
            var5 = -param2 + param1;
          }
          if (0 > var5) {
            var5 = 0;
            return var5;
          }
          return var5;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (var5 > param1 - param2) {
          var5 = param1 - param2;
          return var5;
        }
        return var5;
    }

    final boolean h(int param0) {
        if (param0 >= -109) {
          return false;
        }
        if (this.field_Fb.field_rb != 0) {
          this.field_Hb = 20;
          return true;
        }
        if (this.field_Fb.field_ub == 0) {
          return false;
        }
        if (this.field_Hb > 0) {
          this.field_Hb = this.field_Hb - 1;
          if (this.field_Hb != 0) {
            return false;
          }
          this.field_Hb = 3;
          return true;
        }
        if (this.field_Hb != 0) {
          return false;
        }
        this.field_Hb = 3;
        return true;
    }

    final boolean g(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (this.field_Eb.field_rb != 0) {
          this.field_Hb = 20;
          return true;
        }
        if (this.field_Eb.field_ub == 0) {
          var2 = 125 % ((param0 + 29) / 47);
          return false;
        }
        if (this.field_Hb > 0) {
          this.field_Hb = this.field_Hb - 1;
        }
        if (this.field_Hb != 0) {
          var2Lifetime1 = 125 % ((param0 + 29) / 47);
          return false;
        }
        if (bb.field_b >= this.field_Ab.field_N + this.field_Ab.field_w + (this.field_Ab.field_mb + this.field_Ab.field_gb)) {
          this.field_Hb = 3;
          return true;
        }
        var2Lifetime2 = 125 % ((param0 + 29) / 47);
        return false;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        this.field_hb = param1;
        if (param3 == -77) {
          this.field_mb = param7;
          this.field_db = param0;
          this.field_K = param2;
          this.a(param5, param3 + 97, param6, param4);
          return;
        }
    }

    final boolean g(int param0) {
        if (param0 == -20641) {
          return this.field_Ab.field_ub != 0 ? true : false;
        }
        this.i(-86);
        return this.field_Ab.field_ub != 0 ? true : false;
    }

    final static void j(int param0) {
        if (param0 != 0) {
          return;
        }
        String var2 = (String) null;
        ce.a(ae.field_g, (String) null, (byte) 3);
    }

    final boolean f(boolean param0) {
        if (this.field_Cb.field_rb != 0) {
          this.field_Hb = 20;
          return true;
        }
        if (param0) {
          ur.f((byte) -12);
        }
        if (this.field_Cb.field_ub == 0) {
          return false;
        }
        if (this.field_Hb > 0) {
          this.field_Hb = this.field_Hb - 1;
        }
        if (0 != this.field_Hb) {
          return false;
        }
        this.field_Hb = 3;
        return true;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param1) {
          return;
        }
        cb.field_n = param0;
        s.field_c = param2;
    }

    public static void f(byte param0) {
        field_Bb = null;
        field_Db = null;
        field_zb = null;
        if (param0 != -118) {
          return;
        }
        field_yb = null;
    }

    final static void a(bi[][] param0, int param1, byte[] param2, boolean param3, bc param4, int[] param5, bi[][] param6, String[] param7, String[] param8, int param9, byte[] param10, bc param11, bc param12, nk[] param13, String[][] param14, int param15, String[][] param16, int[] param17, int param18) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          var20 = (String[]) null;
          fe.a(param3, param2, param10, param18, param5, param7, param1, param4, param11, param16, param12, param0, (String[]) null, param6, param14, param13, -128, param17, param8, 1);
          if (param9 > -55) {
            field_Db = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_5_0 = var19;
          stackIn_5_1 = new StringBuilder().append("ur.SA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param7 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param11 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param12 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param13 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param14 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param17 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param18).append(')').toString());
        }
    }

    ur(long param0, ur param1) {
        this(param0, param1.field_Fb, param1.field_Cb, param1.field_xb, param1.field_Ab);
    }

    final static fs a(dc param0, int param1, ob param2) {
        RuntimeException var3 = null;
        fs stackIn_2_0 = null;
        fs stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 53) {
            stackIn_4_0 = us.a(param2, param0.field_v, 2);
            return stackIn_4_0;
          }
          stackIn_2_0 = (fs) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ur.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qr var14 = null;
        qr var15 = null;
        qr var16 = null;
        qr var17 = null;
        qr var18 = null;
        qr var19 = null;
        qr var14Lifetime1;
        qr var14Lifetime2;
        qr var15Lifetime1;
        qr var15Lifetime2;
        qr var16Lifetime1;
        qr var16Lifetime2;
        qr var17Lifetime1;
        qr var17Lifetime2;
        qr var18Lifetime1;
        qr var18Lifetime2;
        qr var19Lifetime1;
        qr var19Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        if (this.field_K * 2 <= this.field_mb) {
          var5 = this.field_K;
          var6 = -this.field_K + this.field_mb;
        } else {
          var6 = this.field_mb / 2;
          var5 = this.field_mb / 2;
        }
        int var7 = var6 - var5;
        int var8 = var7;
        if (0 >= param2) {
          var9 = -param0 + param2;
          var10 = var7 - var8;
          var11 = 0;
          if (0 < var9) {
            var11 = (param3 * var10 + var9 / 2) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Fb;
          var14.field_mb = var5;
          var14.field_hb = 0;
          var14.field_db = 0;
          var14.field_K = this.field_K;
          var15 = this.field_Cb;
          var15.field_db = var6;
          var15.field_mb = -var6 + this.field_mb;
          if (param1 != 20) {
            this.i(-87);
          }
          var15.field_hb = 0;
          var15.field_K = this.field_K;
          var16 = this.field_Gb;
          var16.field_hb = 0;
          var16.field_db = var5;
          var16.field_K = this.field_K;
          var16.field_mb = var7;
          var17 = this.field_xb;
          var17.field_mb = var12;
          var17.field_K = this.field_K;
          var17.field_hb = 0;
          var17.field_db = 0;
          var18 = this.field_Eb;
          var18.field_mb = var7 - var12;
          var18.field_db = var12;
          var18.field_hb = 0;
          var18.field_K = this.field_K;
          var19 = this.field_Ab;
          this.field_Gb.field_s = param2 > param0 ? true : false;
          this.field_Cb.field_s = param2 > param0 ? true : false;
          this.field_Fb.field_s = param2 > param0 ? true : false;
          var19.field_db = var11;
          var19.field_K = this.field_K;
          var19.field_hb = 0;
          var19.field_mb = var8;
          return;
        }
        var8 = param0 * var8 / param2;
        if (var8 < this.field_K) {
          var8 = this.field_K;
        }
        if (var7 < var8) {
          var8 = var7;
          var9Lifetime1 = -param0 + param2;
          var10Lifetime1 = var7 - var8;
          var11Lifetime1 = 0;
          if (0 < var9Lifetime1) {
            var11Lifetime1 = (param3 * var10Lifetime1 + var9Lifetime1 / 2) / var9Lifetime1;
          }
          var12Lifetime1 = var11Lifetime1 + var8 / 2;
          var14Lifetime1 = this.field_Fb;
          var14Lifetime1.field_mb = var5;
          var14Lifetime1.field_hb = 0;
          var14Lifetime1.field_db = 0;
          var14Lifetime1.field_K = this.field_K;
          var15Lifetime1 = this.field_Cb;
          var15Lifetime1.field_db = var6;
          var15Lifetime1.field_mb = -var6 + this.field_mb;
          if (param1 != 20) {
            this.i(-87);
          }
          var15Lifetime1.field_hb = 0;
          var15Lifetime1.field_K = this.field_K;
          var16Lifetime1 = this.field_Gb;
          var16Lifetime1.field_hb = 0;
          var16Lifetime1.field_db = var5;
          var16Lifetime1.field_K = this.field_K;
          var16Lifetime1.field_mb = var7;
          var17Lifetime1 = this.field_xb;
          var17Lifetime1.field_mb = var12Lifetime1;
          var17Lifetime1.field_K = this.field_K;
          var17Lifetime1.field_hb = 0;
          var17Lifetime1.field_db = 0;
          var18Lifetime1 = this.field_Eb;
          var18Lifetime1.field_mb = var7 - var12Lifetime1;
          var18Lifetime1.field_db = var12Lifetime1;
          var18Lifetime1.field_hb = 0;
          var18Lifetime1.field_K = this.field_K;
          var19Lifetime1 = this.field_Ab;
          this.field_Gb.field_s = param2 > param0 ? true : false;
          this.field_Cb.field_s = param2 > param0 ? true : false;
          this.field_Fb.field_s = param2 > param0 ? true : false;
          var19Lifetime1.field_db = var11Lifetime1;
          var19Lifetime1.field_K = this.field_K;
          var19Lifetime1.field_hb = 0;
          var19Lifetime1.field_mb = var8;
          return;
        }
        var9Lifetime2 = -param0 + param2;
        var10Lifetime2 = var7 - var8;
        var11Lifetime2 = 0;
        if (0 < var9Lifetime2) {
          var11Lifetime2 = (param3 * var10Lifetime2 + var9Lifetime2 / 2) / var9Lifetime2;
        }
        var12Lifetime2 = var11Lifetime2 + var8 / 2;
        var14Lifetime2 = this.field_Fb;
        var14Lifetime2.field_mb = var5;
        var14Lifetime2.field_hb = 0;
        var14Lifetime2.field_db = 0;
        var14Lifetime2.field_K = this.field_K;
        var15Lifetime2 = this.field_Cb;
        var15Lifetime2.field_db = var6;
        var15Lifetime2.field_mb = -var6 + this.field_mb;
        if (param1 != 20) {
          this.i(-87);
        }
        var15Lifetime2.field_hb = 0;
        var15Lifetime2.field_K = this.field_K;
        var16Lifetime2 = this.field_Gb;
        var16Lifetime2.field_hb = 0;
        var16Lifetime2.field_db = var5;
        var16Lifetime2.field_K = this.field_K;
        var16Lifetime2.field_mb = var7;
        var17Lifetime2 = this.field_xb;
        var17Lifetime2.field_mb = var12Lifetime2;
        var17Lifetime2.field_K = this.field_K;
        var17Lifetime2.field_hb = 0;
        var17Lifetime2.field_db = 0;
        var18Lifetime2 = this.field_Eb;
        var18Lifetime2.field_mb = var7 - var12Lifetime2;
        var18Lifetime2.field_db = var12Lifetime2;
        var18Lifetime2.field_hb = 0;
        var18Lifetime2.field_K = this.field_K;
        var19Lifetime2 = this.field_Ab;
        this.field_Gb.field_s = param2 > param0 ? true : false;
        this.field_Cb.field_s = param2 > param0 ? true : false;
        this.field_Fb.field_s = param2 > param0 ? true : false;
        var19Lifetime2.field_db = var11Lifetime2;
        var19Lifetime2.field_K = this.field_K;
        var19Lifetime2.field_hb = 0;
        var19Lifetime2.field_mb = var8;
    }

    static {
        field_Bb = new String[]{"Shattered", "Freezing", "Scorching", "Lost", "Cold", "Sundered", "Burning", "Wandering", "Enduring", "Ancient", "Chaos", "Potent", "Reborn", "Unseen", "Golden", "Beckoning", "Silent", "Waning", "Dancing", "Quantum", "Glittering", "Blackened"};
        field_yb = "Project is <%0>/5 complete.";
        field_Db = "Achievements";
    }
}
