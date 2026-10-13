/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends mh {
    private mh field_ac;
    static String field_Qb;
    private int field_Tb;
    private mh field_Yb;
    private mh field_Zb;
    static int[] field_Pb;
    static sp field_Ub;
    private mh field_Vb;
    private mh field_Wb;
    static String field_Rb;
    private mh field_Xb;
    static int[] field_Sb;

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = -128 % ((-55 - param3) / 47);
        this.field_cb = param2;
        this.field_Ib = param4;
        this.field_zb = param7;
        this.field_P = param0;
        this.a(-98, param6, param5, param1);
    }

    final boolean j(int param0) {
        if (this.field_Zb.field_L != 0) {
          this.field_Tb = 20;
          return true;
        }
        if (0 != this.field_Zb.field_Ob) {
          if (this.field_Tb > 0) {
            this.field_Tb = this.field_Tb - 1;
          }
          if (this.field_Tb == 0 &&
            this.field_Vb.field_db + this.field_Vb.field_Db > po.pointerY) {
            this.field_Tb = 3;
            return true;
          }
        }
        if (param0 == 2) {
          return false;
        }
        this.i(36);
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        wd.field_w.a(param2, param5, param1, param3, (byte) 64);
        if (param6 == 94) {
          if (null != hd.field_a) {
            hd.field_a.a(param6 ^ 94, -HighscoresScreen.field_v + param4, param2, param0, param4, param2);
          }
          return;
        }
    }

    final boolean d(byte param0) {
        int var2 = -127 % ((-24 - param0) / 34);
        if (this.field_ac.field_L != 0) {
          this.field_Tb = 20;
          return true;
        }
        if (0 == this.field_ac.field_Ob) {
          return false;
        }
        if (0 < this.field_Tb) {
          this.field_Tb = this.field_Tb - 1;
          if (this.field_Tb != 0) {
            return false;
          }
          if (this.field_Vb.field_C + this.field_Vb.field_cb + (this.field_Vb.field_db + this.field_Vb.field_Db) <= po.pointerY) {
            this.field_Tb = 3;
            return true;
          }
          return false;
        }
        if (this.field_Tb != 0) {
          return false;
        }
        if (this.field_Vb.field_C + this.field_Vb.field_cb + (this.field_Vb.field_db + this.field_Vb.field_Db) <= po.pointerY) {
          this.field_Tb = 3;
          return true;
        }
        return false;
    }

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        int var2 = -124 % ((35 - param1) / 37);
        return 1 + param0;
    }

    final boolean f(byte param0) {
        if (param0 != 57) {
          return false;
        }
        return this.field_Vb.field_Ob != 0 ? true : false;
    }

    fj(long param0, mh param1, mh param2, mh param3, mh param4) {
        super(param0, (mh) null);
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
        mh var9 = null;
        mh var10 = null;
        try {
          this.field_Yb = new mh(0L, param1);
          this.field_Wb = new mh(0L, param2);
          this.a(this.field_Yb, 0);
          this.a(this.field_Wb, 0);
          this.field_Xb = new mh(0L, (mh) null);
          this.a(this.field_Xb, 0);
          this.field_Zb = new mh(0L, param3);
          this.field_ac = new mh(0L, param3);
          this.field_ac.field_Lb = true;
          var9 = this.field_Zb;
          var10 = var9;
          var10.field_Lb = true;
          this.field_Xb.a(this.field_Zb, 0);
          this.field_Xb.a(this.field_ac, 0);
          this.field_Vb = new mh(0L, param4);
          this.field_Vb.field_nb = true;
          this.field_Xb.a(this.field_Vb, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("fj.<init>(").append(param0).append(',');
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
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean h(int param0) {
        if (param0 != this.field_Yb.field_L) {
          this.field_Tb = 20;
          return true;
        }
        if (this.field_Yb.field_Ob == 0) {
          return false;
        }
        if (0 < this.field_Tb) {
          this.field_Tb = this.field_Tb - 1;
          if (this.field_Tb == 0) {
            this.field_Tb = 3;
            return true;
          }
          return false;
        }
        if (this.field_Tb == 0) {
          this.field_Tb = 3;
          return true;
        }
        return false;
    }

    fj(long param0, fj param1) {
        this(param0, param1.field_Yb, param1.field_Wb, param1.field_Zb, param1.field_Vb);
    }

    public static void e(byte param0) {
        field_Sb = null;
        field_Rb = null;
        field_Ub = null;
        field_Qb = null;
        if (param0 == 33) {
          field_Pb = null;
          return;
        }
        PaletteFont var2 = (PaletteFont) null;
        fj.a(31, (String) null, 82, (PaletteFont) null, 55, -109);
        field_Pb = null;
    }

    final int a(int param0, int param1, byte param2, boolean param3) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 0;
        int var7 = -116 % ((49 - param2) / 47);
        int var6 = -this.field_Vb.field_cb + this.field_Xb.field_cb;
        if (0 < var6) {
          var8 = this.field_Vb.field_zb;
          var9 = -param1 + param0;
          var5 = (var6 / 2 + var8 * var9) / var6;
        }
        if (param3) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (-param1 + param0 < var5) {
            var5 = -param1 + param0;
          }
          return var5;
        }
        if (-param1 + param0 < var5) {
          var5 = -param1 + param0;
        }
        if (var5 < 0) {
          var5 = 0;
          return var5;
        }
        return var5;
    }

    final static RgbSprite[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 == 1) {
          return SpriteGeometry.a(param0, 1, 1, 9361, param2, 1, 3, param4, param1);
        }
        field_Ub = (sp) null;
        return SpriteGeometry.a(param0, 1, 1, 9361, param2, 1, 3, param4, param1);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        mh var14 = null;
        mh var15 = null;
        mh var16 = null;
        mh var17 = null;
        mh var18 = null;
        mh var19 = null;
        mh var14Lifetime1;
        mh var15Lifetime1;
        mh var16Lifetime1;
        mh var17Lifetime1;
        mh var18Lifetime1;
        mh var19Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        if (this.field_Ib * 2 <= this.field_cb) {
          var5 = this.field_Ib;
          var6 = this.field_cb - this.field_Ib;
        } else {
          var6 = this.field_cb / 2;
          var5 = this.field_cb / 2;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param1 <= 0) {
          var9 = -param3 + param1;
          var10 = var7 - var8;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var9 / 2 + var10 * param2) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Yb;
          var14.field_zb = 0;
          var14.field_cb = var5;
          var14.field_Ib = this.field_Ib;
          var14.field_P = 0;
          var15 = this.field_Wb;
          var15.field_zb = var6;
          var15.field_cb = this.field_cb - var6;
          var15.field_P = 0;
          var15.field_Ib = this.field_Ib;
          var16 = this.field_Xb;
          var16.field_zb = var5;
          var16.field_cb = var7;
          var16.field_P = 0;
          var16.field_Ib = this.field_Ib;
          var17 = this.field_Zb;
          var17.field_Ib = this.field_Ib;
          var17.field_cb = var12;
          var17.field_P = 0;
          var17.field_zb = 0;
          var18 = this.field_ac;
          var18.field_Ib = this.field_Ib;
          if (param0 <= -75) {
            var18.field_cb = var7 - var12;
            var18.field_zb = var12;
            var18.field_P = 0;
            var19 = this.field_Vb;
            var19.field_zb = var11;
            this.field_Xb.field_eb = param1 > param3 ? true : false;
            this.field_Wb.field_eb = param1 > param3 ? true : false;
            this.field_Yb.field_eb = param1 > param3 ? true : false;
            var19.field_cb = var8;
            var19.field_Ib = this.field_Ib;
            var19.field_P = 0;
            return;
          }
          return;
        }
        var8 = var8 * param3 / param1;
        if (this.field_Ib > var8) {
          var8 = this.field_Ib;
        }
        if (var7 < var8) {
          var8 = var7;
        }
        var9Lifetime1 = -param3 + param1;
        var10Lifetime1 = var7 - var8;
        var11Lifetime1 = 0;
        if (var9Lifetime1 > 0) {
          var11Lifetime1 = (var9Lifetime1 / 2 + var10Lifetime1 * param2) / var9Lifetime1;
        }
        var12Lifetime1 = var11Lifetime1 + var8 / 2;
        var14Lifetime1 = this.field_Yb;
        var14Lifetime1.field_zb = 0;
        var14Lifetime1.field_cb = var5;
        var14Lifetime1.field_Ib = this.field_Ib;
        var14Lifetime1.field_P = 0;
        var15Lifetime1 = this.field_Wb;
        var15Lifetime1.field_zb = var6;
        var15Lifetime1.field_cb = this.field_cb - var6;
        var15Lifetime1.field_P = 0;
        var15Lifetime1.field_Ib = this.field_Ib;
        var16Lifetime1 = this.field_Xb;
        var16Lifetime1.field_zb = var5;
        var16Lifetime1.field_cb = var7;
        var16Lifetime1.field_P = 0;
        var16Lifetime1.field_Ib = this.field_Ib;
        var17Lifetime1 = this.field_Zb;
        var17Lifetime1.field_Ib = this.field_Ib;
        var17Lifetime1.field_cb = var12Lifetime1;
        var17Lifetime1.field_P = 0;
        var17Lifetime1.field_zb = 0;
        var18Lifetime1 = this.field_ac;
        var18Lifetime1.field_Ib = this.field_Ib;
        if (param0 <= -75) {
          var18Lifetime1.field_cb = var7 - var12Lifetime1;
          var18Lifetime1.field_zb = var12Lifetime1;
          var18Lifetime1.field_P = 0;
          var19Lifetime1 = this.field_Vb;
          var19Lifetime1.field_zb = var11Lifetime1;
          this.field_Xb.field_eb = param1 > param3 ? true : false;
          this.field_Wb.field_eb = param1 > param3 ? true : false;
          this.field_Yb.field_eb = param1 > param3 ? true : false;
          var19Lifetime1.field_cb = var8;
          var19Lifetime1.field_Ib = this.field_Ib;
          var19Lifetime1.field_P = 0;
          return;
        }
    }

    final static void a(int param0, String param1, int param2, PaletteFont param3, int param4, int param5) {
        try {
          if (param4 != -15531) {
            fj.e((byte) 21);
          }
          sa.a(param2, param3, param1, 320, param0, param5, -126);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "fj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean i(int param0) {
        if (0 != this.field_Wb.field_L) {
          this.field_Tb = 20;
          return true;
        }
        if (param0 != 2) {
          return true;
        }
        if (this.field_Wb.field_Ob == 0) {
          return false;
        }
        if (this.field_Tb > 0) {
          this.field_Tb = this.field_Tb - 1;
        }
        if (this.field_Tb != 0) {
          return false;
        }
        this.field_Tb = 3;
        return true;
    }

    static {
        field_Ub = null;
        field_Rb = "Return to Main Menu";
        field_Sb = new int[]{15091200, 16494651, 3781573, 12658477, 26679};
    }
}
