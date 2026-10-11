/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ooa extends llb {
    private llb[] field_yb;
    private llb[] field_vb;
    int field_Ab;
    private llb field_wb;
    static String field_zb;
    static int field_xb;

    ooa(long param0, llb param1, String[] param2, llb param3, llb[] param4, int param5) {
        super(param0, (llb) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        llb var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_yb = new llb[param2.length];
          this.field_wb = new llb(0L, param3);
          this.field_vb = param4;
          for (var8_int = 0; var8_int < param2.length; var8_int++) {
            var9 = new llb(0L, param1);
            var9.field_R = param2[var8_int];
            this.field_yb[var8_int] = var9;
            this.b(-561, var9);
          }
          this.b(-561, this.field_wb);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (param4.length > var11) {
            this.field_wb.b(-561, param4[var11]);
            var11++;
          }
          this.field_Ab = param5;
          this.field_yb[param5].field_J = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ooa.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_hb = param1;
        this.field_K = param0;
        this.field_G = param5;
        this.field_L = param6;
        this.a(param3, (byte) -107, param2);
        int var8 = -32 % ((param4 - 15) / 35);
    }

    public static void h(int param0) {
        if (param0 <= 18) {
          return;
        }
        field_zb = null;
    }

    private final void a(int param0, byte param1, int param2) {
        llb dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = VoidHunters.field_G;
        for (var4 = 0; var4 < this.field_yb.length; var4++) {
          var5 = this.field_hb * var4 / this.field_yb.length;
          var6 = (var4 + 1) * this.field_hb / this.field_yb.length;
          this.field_yb[var4].field_L = var5;
          this.field_yb[var4].field_K = 0;
          this.field_yb[var4].field_hb = -var5 + var6;
          this.field_yb[var4].field_G = param2;
        }
        this.field_wb.a(0, -65, this.field_hb, param2, this.field_G - param2);
        var8 = 0;
        var4Lifetime1 = var8;
        while (this.field_vb.length > var8) {
          this.field_vb[var8].a(param0, -48, -(param0 * 2) + this.field_wb.field_hb, param0, -(2 * param0) + this.field_wb.field_G);
          if (~var8 != ~this.field_Ab) {
            dupTemp$0 = this.field_vb[var8];
            dupTemp$0.field_L = dupTemp$0.field_L + 10000;
          }
          var8++;
        }
        if (param1 != -107) {
          this.a(-69, (byte) 80, 46);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var24 = 0;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        var35 = VoidHunters.field_G;
        try {
          if (param2 == param9 &&
            param3 == param6 &&
            param5 == param0 &&
            param1 == param7) {
            ew.a(param3, param5, (byte) 52, param9, param1, param8);
          } else {
            var10_int = param9;
            var11 = param3;
            var12 = 3 * param9;
            var13 = 3 * param3;
            var14 = 3 * param2;
            var15 = param6 * 3;
            var16 = 3 * param0;
            var17 = 3 * param7;
            var18 = var14 + param5 - var16 - param9;
            var19 = -var17 + (param1 + var15) - param3;
            var20 = -var14 + var16 + (-var14 + var12);
            var21 = -var15 - var15 + (var17 + var13);
            var22 = var14 - var12;
            var23 = -var13 + var15;
            for (var24 = 128; var24 <= 4096; var24 += 128) {
              var25 = var24 * var24 >> 12;
              var26 = var24 * var25 >> 12;
              var27 = var26 * var18;
              var28 = var19 * var26;
              var29 = var20 * var25;
              var30 = var25 * var21;
              var31 = var22 * var24;
              var32 = var24 * var23;
              var33 = param9 + (var31 + var29 + var27 >> 12);
              var34 = param3 + (var32 + (var30 + var28) >> 12);
              ew.a(var11, var33, (byte) 110, var10_int, var34, param8);
              var11 = var34;
              var10_int = var33;
            }
          }
          if (param4 != -17572) {
            ooa.h(79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var10), "ooa.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void i(int param0) {
        int var2 = 0;
        llb dupTemp$0 = null;
        llb dupTemp$1 = null;
        int var3;
        var3 = VoidHunters.field_G;
        if (param0 != 10000) {
          this.field_vb = (llb[]) null;
        }
        for (var2 = 0; var2 < this.field_yb.length; var2++) {
          if (var2 != this.field_Ab &&
            this.field_yb[var2].field_o != 0) {
            this.field_yb[this.field_Ab].field_J = false;
            dupTemp$0 = this.field_vb[this.field_Ab];
            dupTemp$0.field_L = dupTemp$0.field_L + 10000;
            this.field_Ab = var2;
            this.field_yb[var2].field_J = true;
            dupTemp$1 = this.field_vb[var2];
            dupTemp$1.field_L = dupTemp$1.field_L - 10000;
          }
        }
    }

    static {
        field_zb = "You have not yet unlocked this option for use.";
        field_xb = 8;
    }
}
