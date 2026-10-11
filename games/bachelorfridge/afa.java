/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class afa extends k {
    static String field_k;
    private int[] field_m;
    private int[][] field_o;
    private short[] field_l;
    private int[] field_p;
    private int field_n;

    private final void e(int param0) {
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
        var21 = BachelorFridge.field_y;
        if (param0 != 0) {
          return;
        }
        var2 = this.field_n;
        if (var2 == 2) {
          for (var2 = 0; var2 < 257; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; this.field_o.length - 1 > var3; var3++) {
              if (var4 >= this.field_o[var3][0]) {
                continue;
              }
              break;
            }
            var22 = this.field_o[var3 - 1];
            var34 = this.field_o[var3];
            var7 = this.a(-2 + var3, (byte) 122)[1];
            var8 = var22[1];
            var9 = var34[1];
            var10 = this.a(var3 + 1, (byte) 122)[1];
            var11 = (var4 - var22[0] << 12) / (var34[0] - var22[0]);
            var12 = var11 * var11 >> 12;
            var13 = var8 - var9 + var10 - var7;
            var14 = -var8 + var7 - var13;
            var15 = var9 - var7;
            var16 = var8;
            var17 = (var11 * var13 >> 12) * var12 >> 12;
            var18 = var14 * var12 >> 12;
            var19 = var15 * var11 >> 12;
            var20 = var16 + (var18 + (var17 + var19));
            if (var20 <= -32768) {
              var20 = -32767;
            }
            if (var20 >= 32768) {
              var20 = 32767;
            }
            this.field_l[var2] = (short)var20;
          }
        } else if (var2 != 1) {
          for (var2 = 0; 257 > var2; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; this.field_o.length - 1 > var3; var3++) {
              if (this.field_o[var3][0] <= var4) {
                continue;
              }
              break;
            }
            var26 = this.field_o[-1 + var3];
            var36 = this.field_o[var3];
            var7 = (-var26[0] + var4 << 12) / (var36[0] - var26[0]);
            var8 = 4096 - var7;
            var9 = var26[1] * var8 + var7 * var36[1] >> 12;
            if (-32768 >= var9) {
              var9 = -32767;
            }
            if (32768 <= var9) {
              var9 = 32767;
            }
            this.field_l[var2] = (short)var9;
          }
        } else {
          for (var2 = 0; 257 > var2; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; this.field_o.length - 1 > var3; var3++) {
              if (var4 >= this.field_o[var3][0]) {
                continue;
              }
              break;
            }
            var24 = this.field_o[-1 + var3];
            var35 = this.field_o[var3];
            var7 = (var4 - var24[0] << 12) / (-var24[0] + var35[0]);
            var8 = 4096 - am.field_R[var7 >> 5 & 255] >> 1;
            var9 = 4096 - var8;
            var10 = var35[1] * var8 + var24[1] * var9 >> 12;
            if (var10 <= -32768) {
              var10 = -32767;
            }
            if (var10 >= 32768) {
              var10 = 32767;
            }
            this.field_l[var2] = (short)var10;
          }
        }
    }

    private final int[] a(int param0, byte param1) {
        if (param1 != 122) {
          this.b(true);
        }
        if (param0 < 0) {
          return this.field_p;
        }
        if (this.field_o.length <= param0) {
          return this.field_m;
        }
        return this.field_o[param0];
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 <= 56) {
          field_k = (String) null;
        }
    }

    public afa() {
        super(1, true);
        this.field_l = new short[257];
        this.field_n = 0;
    }

    final int[] a(int param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = BachelorFridge.field_y;
        if (param1 != 0) {
          this.d((byte) -65);
        }
        int[] var8 = this.field_j.a(param0, param1 - 1);
        int[] var3 = var8;
        if (this.field_j.field_m) {
          var5 = this.a(0, param0, (byte) 117);
          for (var6 = 0; var6 < hh.field_d; var6++) {
            var4 = var5[var6] >> 4;
            if (var4 < 0) {
              var4 = 0;
            }
            if (var4 > 256) {
              var4 = 256;
            }
            var8[var6] = this.field_l[var4];
          }
        }
        return var8;
    }

    final static fe a(lu param0, int param1) {
        RuntimeException var2 = null;
        fe stackIn_2_0 = null;
        fe stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -113) {
            stackIn_4_0 = new fe(param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.a(3), param0.a(3), param0.b(16711935));
            return stackIn_4_0;
          }
          stackIn_2_0 = (fe) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("afa.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        int[] var10 = this.field_o[0];
        int[] var8 = var10;
        int[] var6 = var8;
        int[] var2 = var6;
        int[] var12 = this.field_o[1];
        int[] var4 = this.field_o[-2 + this.field_o.length];
        if (param0) {
          this.a(126, 19);
        }
        int[] var5 = this.field_o[this.field_o.length - 1];
        this.field_m = new int[]{var4[0] - (var5[0] - var4[0]), var4[1] - var5[1] + var4[1]};
        this.field_p = new int[]{-var12[0] + (var10[0] + var10[0]), var10[1] - (var12[1] - var10[1])};
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        lu var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param2 == 0) {
            this.field_n = param1.b(16711935);
            this.field_o = new int[param1.b(param0 + 16712006)][2];
            for (var4_int = 0; var4_int < this.field_o.length; var4_int++) {
              this.field_o[var4_int][0] = param1.e((byte) 90);
              this.field_o[var4_int][1] = param1.e((byte) 105);
            }
          }
          if (param0 != -71) {
            var6 = (lu) null;
            this.a((byte) -45, (lu) null, -22);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("afa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void d(byte param0) {
        if (null == this.field_o) {
          this.field_o = new int[][]{new int[]{0, 0}, new int[]{4096, 4096}};
        }
        if (param0 != -68) {
          this.field_o = (int[][]) null;
        }
        if (this.field_o.length < 2) {
          throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field_n == 2) {
          this.b(false);
        }
        gea.a(param0 ^ -4293);
        this.e(0);
    }

    static {
        field_k = "You need to play 1 more rated game to unlock this option.";
    }
}
