/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class owa extends le {
    private short[] field_i;
    static String field_j;
    private int[] field_l;
    private int[] field_k;
    private int[][] field_n;
    private int field_m;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 >= -60) {
            return;
          }
          if (param0 == 0) {
            this.field_m = param2.e((byte) -118);
            this.field_n = new int[param2.e((byte) -126)][2];
            for (var4_int = 0; var4_int < this.field_n.length; var4_int++) {
              this.field_n[var4_int][0] = param2.e(1869);
              this.field_n[var4_int][1] = param2.e(1869);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("owa.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int[] var22;
        int[] var24;
        int[] var26;
        int[] var34;
        int[] var35;
        int[] var36;
        var21 = VoidHunters.field_G;
        var2 = this.field_m;
        if (var2 == 2) {
          for (var2 = 0; var2 < 257; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; var3 < -1 + this.field_n.length; var3++) {
              if (this.field_n[var3][0] <= var4) {
                continue;
              }
              break;
            }
            var22 = this.field_n[var3 - 1];
            var34 = this.field_n[var3];
            var7 = this.b(58, var3 - 2)[1];
            var8 = var22[1];
            var9 = var34[1];
            var10 = this.b(-128, 1 + var3)[1];
            var11 = (-var22[0] + var4 << 12) / (-var22[0] + var34[0]);
            var12 = var11 * var11 >> 12;
            var13 = var8 - var9 + var10 - var7;
            var14 = -var13 + (var7 - var8);
            var15 = -var7 + var9;
            var16 = var8;
            var17 = var12 * (var11 * var13 >> 12) >> 12;
            var18 = var14 * var12 >> 12;
            var19 = var15 * var11 >> 12;
            var20 = var17 + var18 - (-var19 - var16);
            if (var20 <= -32768) {
              var20 = -32767;
            }
            if (var20 >= 32768) {
              var20 = 32767;
            }
            this.field_i[var2] = (short)var20;
          }
        } else if (var2 != 1) {
          for (var2 = 0; var2 < 257; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; var3 < -1 + this.field_n.length; var3++) {
              if (var4 >= this.field_n[var3][0]) {
                continue;
              }
              break;
            }
            var26 = this.field_n[-1 + var3];
            var36 = this.field_n[var3];
            var7 = (-var26[0] + var4 << 12) / (-var26[0] + var36[0]);
            var8 = -var7 + 4096;
            var9 = var8 * var26[1] + var36[1] * var7 >> 12;
            if (var9 <= -32768) {
              var9 = -32767;
            }
            if (32768 <= var9) {
              var9 = 32767;
            }
            this.field_i[var2] = (short)var9;
          }
        } else {
          for (var2 = 0; 257 > var2; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; this.field_n.length - 1 > var3; var3++) {
              if (var4 >= this.field_n[var3][0]) {
                continue;
              }
              break;
            }
            var24 = this.field_n[-1 + var3];
            var35 = this.field_n[var3];
            var7 = (var4 - var24[0] << 12) / (var35[0] - var24[0]);
            var8 = 4096 - jmb.field_q[(var7 & 8165) >> 5] >> 1;
            var9 = 4096 - var8;
            var10 = var9 * var24[1] + var35[1] * var8 >> 12;
            if (var10 <= -32768) {
              var10 = -32767;
            }
            if (var10 >= 32768) {
              var10 = 32767;
            }
            this.field_i[var2] = (short)var10;
          }
        }
        if (param0 < 42) {
          this.field_k = (int[]) null;
        }
    }

    private final void e(int param0) {
        int[] var9 = this.field_n[0];
        int[] var7 = var9;
        int[] var6 = var7;
        int[] var2 = var6;
        int[] var12 = this.field_n[1];
        int[] var4 = this.field_n[-2 + this.field_n.length];
        int[] var5 = this.field_n[-1 + this.field_n.length];
        this.field_l = new int[]{var4[0] - var5[0] + var4[param0], var4[1] - (-var4[1] + var5[1])};
        this.field_k = new int[]{var9[0] + (var9[0] - var12[0]), var9[1] - var12[1] + var9[1]};
    }

    final int[] a(int param0, boolean param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = VoidHunters.field_G;
        int[] var8 = this.field_f.a((byte) 6, param0);
        int[] var3 = var8;
        if (this.field_f.field_e) {
          var5 = this.a(0, param0, 255);
          for (var6 = 0; hob.field_d > var6; var6++) {
            var4 = var5[var6] >> 4;
            if (0 > var4) {
              var4 = 0;
            }
            if (var4 > 256) {
              var4 = 256;
            }
            var8[var6] = this.field_i[var4];
          }
        }
        if (!param1) {
          this.d(-119);
        }
        return var8;
    }

    private final int[] b(int param0, int param1) {
        if (param1 < 0) {
          return this.field_k;
        }
        int var3 = 67 % ((param0 + 78) / 43);
        if (param1 >= this.field_n.length) {
          return this.field_l;
        }
        return this.field_n[param1];
    }

    final void c(byte param0) {
        if (this.field_n == null) {
          this.field_n = new int[][]{new int[]{0, 0}, new int[]{4096, 4096}};
        }
        if (this.field_n.length < 2) {
          throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (param0 >= -35) {
          return;
        }
        if (this.field_m == 2) {
          this.e(0);
        }
        taa.e((byte) -21);
        this.d(90);
    }

    public owa() {
        super(1, true);
        this.field_i = new short[257];
        this.field_m = 0;
    }

    public static void e(byte param0) {
        if (param0 < 83) {
          owa.e((byte) 58);
        }
        field_j = null;
    }

    static {
        field_j = "Unfortunately we are unable to create an account for you at this time.";
    }
}
