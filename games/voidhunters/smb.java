/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class smb extends le {
    private int[] field_l;
    private int field_i;
    private int field_k;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 > -60) {
            this.field_k = -104;
          }
          var4_int = param0;
          if (0 == var4_int) {
            this.field_k = param2.e(1869);
          } else {
            if (var4_int == 1) {
              this.field_i = param2.e(1869);
            } else {
              if (2 == var4_int) {
                this.field_j = param2.e(1869);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("smb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        this.d(-32307);
        if (param0 >= -35) {
          int[] var3 = (int[]) null;
          smb.a((int[]) null, 127, -20, (byte) 126, (int[]) null);
        }
    }

    private final void d(int param0) {
        double var2 = Math.cos((double)((float)this.field_j / 4096.0f));
        this.field_l[0] = (int)(4096.0 * (Math.sin((double)((float)this.field_i / 4096.0f)) * var2));
        this.field_l[1] = (int)(var2 * Math.cos((double)((float)this.field_i / 4096.0f)) * 4096.0);
        this.field_l[2] = (int)(Math.sin((double)((float)this.field_j / 4096.0f)) * 4096.0);
        int var4 = this.field_l[0] * this.field_l[0] >> 12;
        int var5 = this.field_l[1] * this.field_l[1] >> 12;
        if (param0 != -32307) {
          this.field_k = 57;
        }
        int var6 = this.field_l[2] * this.field_l[2] >> 12;
        int var7 = (int)(Math.sqrt((double)(var4 + var5 + var6 >> 12)) * 4096.0);
        if (var7 != 0) {
          this.field_l[0] = (this.field_l[0] << 12) / var7;
          this.field_l[2] = (this.field_l[2] << 12) / var7;
          this.field_l[1] = (this.field_l[1] << 12) / var7;
        }
    }

    final int[] a(int param0, boolean param1) {
        int var7 = 0;
        int[] var25 = null;
        int[] var9 = null;
        int[] var26 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4 = 0;
        int var17 = VoidHunters.field_G;
        if (!param1) {
          return (int[]) null;
        }
        int[] var18 = this.field_f.a((byte) 127, param0);
        int[] var3 = var18;
        if (this.field_f.field_e) {
          var7 = this.field_k * tpa.field_b >> 12;
          var25 = this.a(0, -1 + param0 & wf.field_d, 255);
          var9 = this.a(0, param0, 255);
          var26 = this.a(0, 1 + param0 & wf.field_d, 255);
          for (var11 = 0; var11 < hob.field_d; var11++) {
            var12 = var7 * (-var25[var11] + var26[var11]) >> 12;
            var13 = (var9[-1 + var11 & gbb.field_q] - var9[var11 + 1 & gbb.field_q]) * var7 >> 12;
            var14 = var13 >> 4;
            var15 = var12 >> 4;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (0 > var15) {
              var15 = -var15;
            }
            if (255 < var14) {
              var14 = 255;
            }
            if (var15 > 255) {
              var15 = 255;
            }
            var16 = rob.field_o[(var15 * (var15 + 1) >> 1) + var14] & 255;
            var5 = var16 * var12 >> 8;
            var6 = var16 * 4096 >> 8;
            var4 = var16 * var13 >> 8;
            var6 = var6 * this.field_l[2] >> 12;
            var4 = var4 * this.field_l[0] >> 12;
            var5 = this.field_l[1] * var5 >> 12;
            var18[var11] = var6 + (var5 + var4);
          }
        }
        return var18;
    }

    final static void a(int[] param0, int param1, int param2, byte param3, int[] param4) {
        int var10 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = VoidHunters.field_G;
        try {
          if (param1 < param2) {
            var5_int = (param2 + param1) / 2;
            var6 = param1;
            var7 = param4[var5_int];
            param4[var5_int] = param4[param2];
            param4[param2] = var7;
            var8 = param0[var5_int];
            param0[var5_int] = param0[param2];
            param0[param2] = var8;
            stackIn_5_0 = (var7 != 2147483647) ? 1 : 0;
            var9 = stackIn_5_0;
            for (var10 = param1; var10 < param2; var10++) {
              if ((var9 & var10) + var7 > param4[var10]) {
                var11 = param4[var10];
                param4[var10] = param4[var6];
                param4[var6] = var11;
                var12 = param0[var10];
                param0[var10] = param0[var6];
                param0[var6++] = var12;
              }
            }
            param4[param2] = param4[var6];
            param4[var6] = var7;
            param0[param2] = param0[var6];
            param0[var6] = var8;
            smb.a(param0, param1, -1 + var6, (byte) -54, param4);
            smb.a(param0, var6 + 1, param2, (byte) -119, param4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("smb.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public smb() {
        super(1, true);
        this.field_l = new int[3];
        this.field_i = 3216;
        this.field_k = 4096;
        this.field_j = 3216;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -26) {
          int[] var3 = (int[]) null;
          smb.a((int[]) null, -116, 50, (byte) -85, (int[]) null);
        }
        return true;
    }

    static {
    }
}
