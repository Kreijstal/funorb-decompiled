/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw extends sna {
    static js field_zb;
    private sna field_vb;
    private sna field_wb;
    private int field_Cb;
    private sna field_Bb;
    static sna field_yb;
    private sna field_Db;
    private sna field_Ab;
    private sna field_xb;

    final boolean f(int param0) {
        if (param0 <= 14) {
          return false;
        }
        return this.field_Bb.field_ib != 0 ? true : false;
    }

    public static void h(int param0) {
        field_yb = null;
        field_zb = null;
        int var1 = -59 / ((param0 - 43) / 53);
    }

    final boolean f(byte param0) {
        if (this.field_vb.field_R != 0) {
          this.field_Cb = 20;
          return true;
        }
        if (0 == this.field_vb.field_ib) {
          if (param0 != 62) {
            field_yb = (sna) null;
            return false;
          }
          return false;
        }
        if (this.field_Cb > 0) {
          this.field_Cb = this.field_Cb - 1;
        }
        if (this.field_Cb == 0) {
          this.field_Cb = 3;
          return true;
        }
        if (param0 == 62) {
          return false;
        }
        field_yb = (sna) null;
        return false;
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        var5 = 0;
        var6 = -this.field_Bb.field_p + this.field_wb.field_p;
        if (param0 == 7409) {
          if (0 < var6) {
            var7 = this.field_Bb.field_rb;
            var8 = param2 - param3;
            var5 = (var6 / 2 + var8 * var7) / var6;
          }
        } else {
          this.a((byte) -100, 39, -69, -35);
          if (0 < var6) {
            var7 = this.field_Bb.field_rb;
            var8 = param2 - param3;
            var5 = (var6 / 2 + var8 * var7) / var6;
          }
        }
        if (param1) {
          if (0 > var5) {
            var5 = 0;
          }
          if (param2 - param3 < var5) {
            var5 = param2 - param3;
          }
          return var5;
        }
        if (var5 > -param3 + param2) {
          var5 = -param3 + param2;
        }
        if (var5 >= 0) {
          return var5;
        }
        var5Lifetime1 = 0;
        return var5Lifetime1;
    }

    final boolean b(boolean param0) {
        if (!param0) {
          return false;
        }
        if (this.field_Db.field_R != 0) {
          this.field_Cb = 20;
          return true;
        }
        if (0 == this.field_Db.field_ib) {
          return false;
        }
        if (this.field_Cb > 0) {
          this.field_Cb = this.field_Cb - 1;
        }
        if (this.field_Cb != 0) {
          return false;
        }
        this.field_Cb = 3;
        return true;
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!param2) {
            var4 = (String) null;
            cw.a((String) null, (String) null, false);
          }
          param1 = jm.a((byte) 75, param1, '_', "");
          var3 = vm.a(param0, (byte) 117);
          stackIn_7_0 = (param1.indexOf(param0) != -1) || (-1 != param1.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("cw.EA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        this.field_rb = param4;
        this.field_sb = param0;
        this.field_p = param7;
        this.field_kb = param2;
        this.a((byte) 29, param1, param3, param6);
        if (param5) {
          this.i(52);
        }
    }

    final boolean i(int param0) {
        int var2 = -1 % ((param0 - 67) / 48);
        if (this.field_xb.field_R != 0) {
          this.field_Cb = 20;
          return true;
        }
        if (0 == this.field_xb.field_ib) {
          return false;
        }
        if (this.field_Cb > 0) {
          this.field_Cb = this.field_Cb - 1;
        }
        if (this.field_Cb != 0) {
          return false;
        }
        if (this.field_Bb.field_hb + this.field_Bb.field_p + (this.field_Bb.field_I + this.field_Bb.field_M) <= gd.field_m) {
          this.field_Cb = 3;
          return true;
        }
        return false;
    }

    final boolean g(int param0) {
        if (this.field_Ab.field_R != 0) {
          this.field_Cb = 20;
          return true;
        }
        if (this.field_Ab.field_ib == 0) {
          if (param0 == 0) {
            return false;
          }
          this.field_xb = (sna) null;
          return false;
        }
        if (this.field_Cb > 0) {
          this.field_Cb = this.field_Cb - 1;
        }
        if (0 != this.field_Cb) {
          if (param0 == 0) {
            return false;
          }
          this.field_xb = (sna) null;
          return false;
        }
        if (this.field_Bb.field_I + this.field_Bb.field_M > gd.field_m) {
          this.field_Cb = 3;
          return true;
        }
        if (param0 == 0) {
          return false;
        }
        this.field_xb = (sna) null;
        return false;
    }

    cw(long param0, sna param1, sna param2, sna param3, sna param4) {
        super(param0, (sna) null);
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
        sna var9 = null;
        sna var10 = null;
        try {
          this.field_Db = new sna(0L, param1);
          this.field_vb = new sna(0L, param2);
          this.a(-1, this.field_Db);
          this.a(-1, this.field_vb);
          this.field_wb = new sna(0L, (sna) null);
          this.a(-1, this.field_wb);
          this.field_Ab = new sna(0L, param3);
          this.field_xb = new sna(0L, param3);
          this.field_xb.field_qb = true;
          var9 = this.field_Ab;
          var10 = var9;
          var10.field_qb = true;
          this.field_wb.a(-1, this.field_Ab);
          this.field_wb.a(-1, this.field_xb);
          this.field_Bb = new sna(0L, param4);
          this.field_Bb.field_ub = true;
          this.field_wb.a(-1, this.field_Bb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("cw.<init>(").append(param0).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sna var14 = null;
        sna var15 = null;
        sna var16 = null;
        sna var17 = null;
        sna var18 = null;
        sna var19 = null;
        sna var14Lifetime1;
        sna var15Lifetime1;
        sna var16Lifetime1;
        sna var17Lifetime1;
        sna var18Lifetime1;
        sna var19Lifetime1;
        sna var19Lifetime2;
        sna var19Lifetime3;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        if (this.field_p >= 2 * this.field_sb) {
          var5 = this.field_sb;
          var6 = -this.field_sb + this.field_p;
        } else {
          var6 = this.field_p / 2;
          var5 = this.field_p / 2;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param3 <= 0) {
          var9 = param3 - param2;
          var10 = var7 - var8;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var9 / 2 + param1 * var10) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Db;
          var14.field_rb = 0;
          var14.field_kb = 0;
          var14.field_sb = this.field_sb;
          var14.field_p = var5;
          var15 = this.field_vb;
          var15.field_sb = this.field_sb;
          var15.field_rb = var6;
          var15.field_p = -var6 + this.field_p;
          var15.field_kb = 0;
          var16 = this.field_wb;
          var16.field_p = var7;
          var16.field_rb = var5;
          var16.field_kb = 0;
          var16.field_sb = this.field_sb;
          var17 = this.field_Ab;
          var17.field_rb = 0;
          var17.field_p = var12;
          var17.field_sb = this.field_sb;
          var17.field_kb = 0;
          var18 = this.field_xb;
          var18.field_sb = this.field_sb;
          var18.field_kb = 0;
          var18.field_p = -var12 + var7;
          var18.field_rb = var12;
          if (param0 != 29) {
            this.field_Ab = (sna) null;
            var19 = this.field_Bb;
            var19.field_p = var8;
            var19.field_kb = 0;
            this.field_wb.field_u = param3 > param2 ? true : false;
            this.field_vb.field_u = param3 > param2 ? true : false;
            this.field_Db.field_u = param3 > param2 ? true : false;
            var19.field_sb = this.field_sb;
            var19.field_rb = var11;
            return;
          }
          var19Lifetime3 = this.field_Bb;
          var19Lifetime3.field_p = var8;
          var19Lifetime3.field_kb = 0;
          this.field_wb.field_u = param3 > param2 ? true : false;
          this.field_vb.field_u = param3 > param2 ? true : false;
          this.field_Db.field_u = param3 > param2 ? true : false;
          var19Lifetime3.field_sb = this.field_sb;
          var19Lifetime3.field_rb = var11;
          return;
        }
        var8 = param2 * var8 / param3;
        if (var8 < this.field_sb) {
          var8 = this.field_sb;
        }
        if (var7 < var8) {
          var8 = var7;
        }
        var9Lifetime1 = param3 - param2;
        var10Lifetime1 = var7 - var8;
        var11Lifetime1 = 0;
        if (var9Lifetime1 > 0) {
          var11Lifetime1 = (var9Lifetime1 / 2 + param1 * var10Lifetime1) / var9Lifetime1;
        }
        var12Lifetime1 = var11Lifetime1 + var8 / 2;
        var14Lifetime1 = this.field_Db;
        var14Lifetime1.field_rb = 0;
        var14Lifetime1.field_kb = 0;
        var14Lifetime1.field_sb = this.field_sb;
        var14Lifetime1.field_p = var5;
        var15Lifetime1 = this.field_vb;
        var15Lifetime1.field_sb = this.field_sb;
        var15Lifetime1.field_rb = var6;
        var15Lifetime1.field_p = -var6 + this.field_p;
        var15Lifetime1.field_kb = 0;
        var16Lifetime1 = this.field_wb;
        var16Lifetime1.field_p = var7;
        var16Lifetime1.field_rb = var5;
        var16Lifetime1.field_kb = 0;
        var16Lifetime1.field_sb = this.field_sb;
        var17Lifetime1 = this.field_Ab;
        var17Lifetime1.field_rb = 0;
        var17Lifetime1.field_p = var12Lifetime1;
        var17Lifetime1.field_sb = this.field_sb;
        var17Lifetime1.field_kb = 0;
        var18Lifetime1 = this.field_xb;
        var18Lifetime1.field_sb = this.field_sb;
        var18Lifetime1.field_kb = 0;
        var18Lifetime1.field_p = -var12Lifetime1 + var7;
        var18Lifetime1.field_rb = var12Lifetime1;
        if (param0 == 29) {
          var19Lifetime1 = this.field_Bb;
          var19Lifetime1.field_p = var8;
          var19Lifetime1.field_kb = 0;
          this.field_wb.field_u = param3 > param2 ? true : false;
          this.field_vb.field_u = param3 > param2 ? true : false;
          this.field_Db.field_u = param3 > param2 ? true : false;
          var19Lifetime1.field_sb = this.field_sb;
          var19Lifetime1.field_rb = var11Lifetime1;
          return;
        }
        this.field_Ab = (sna) null;
        var19Lifetime2 = this.field_Bb;
        var19Lifetime2.field_p = var8;
        var19Lifetime2.field_kb = 0;
        this.field_wb.field_u = param3 > param2 ? true : false;
        this.field_vb.field_u = param3 > param2 ? true : false;
        this.field_Db.field_u = param3 > param2 ? true : false;
        var19Lifetime2.field_sb = this.field_sb;
        var19Lifetime2.field_rb = var11Lifetime1;
    }

    cw(long param0, cw param1) {
        this(param0, param1.field_Db, param1.field_vb, param1.field_Ab, param1.field_Bb);
    }

    static {
    }
}
