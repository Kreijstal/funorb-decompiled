/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs extends ci {
    static cn field_p;
    private int field_r;
    private int[] field_q;
    private int[] field_o;
    private short[] field_m;
    private int[][] field_n;

    public static void c(int param0) {
        if (param0 >= -91) {
          field_p = (cn) null;
        }
        field_p = null;
    }

    private final int[] d(int param0, int param1) {
        if (param0 > param1) {
          return this.field_o;
        }
        if (this.field_n.length <= param1) {
          return this.field_q;
        }
        return this.field_n[param1];
    }

    public fs() {
        super(1, true);
        this.field_r = 0;
        this.field_m = new short[257];
    }

    final static void a(byte param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
          wp.field_a = param2;
          int var4_int = 93 / ((param0 + 33) / 53);
          bta.field_q = 2;
          var5 = (CharSequence) ((Object) param2);
          mn.field_n = jd.a(1, var5);
          ica.field_b = param1;
          bb.a(-21844);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fs.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(byte param0) {
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
        var21 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_r;
        if (2 == var2) {
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
            var7 = this.d(0, -2 + var3)[1];
            var8 = var22[1];
            var9 = var34[1];
            var10 = this.d(0, var3 + 1)[1];
            var11 = (-var22[0] + var4 << 12) / (var34[0] - var22[0]);
            var12 = var11 * var11 >> 12;
            var13 = var8 - var7 + (-var9 + var10);
            var14 = -var13 + (var7 - var8);
            var15 = var9 - var7;
            var16 = var8;
            var17 = var12 * (var11 * var13 >> 12) >> 12;
            var18 = var12 * var14 >> 12;
            var19 = var11 * var15 >> 12;
            var20 = var16 + (var19 + (var17 + var18));
            if (-32768 >= var20) {
              var20 = -32767;
            }
            if (var20 >= 32768) {
              var20 = 32767;
            }
            this.field_m[var2] = (short)var20;
          }
        } else if (1 != var2) {
          for (var2 = 0; 257 > var2; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; var3 < -1 + this.field_n.length; var3++) {
              if (var4 >= this.field_n[var3][0]) {
                continue;
              }
              break;
            }
            var26 = this.field_n[var3 - 1];
            var36 = this.field_n[var3];
            var7 = (var4 - var26[0] << 12) / (var36[0] - var26[0]);
            var8 = -var7 + 4096;
            var9 = var36[1] * var7 + var8 * var26[1] >> 12;
            if (var9 <= -32768) {
              var9 = -32767;
            }
            if (var9 >= 32768) {
              var9 = 32767;
            }
            this.field_m[var2] = (short)var9;
          }
        } else {
          for (var2 = 0; 257 > var2; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; -1 + this.field_n.length > var3; var3++) {
              if (var4 >= this.field_n[var3][0]) {
                continue;
              }
              break;
            }
            var24 = this.field_n[-1 + var3];
            var35 = this.field_n[var3];
            var7 = (-var24[0] + var4 << 12) / (-var24[0] + var35[0]);
            var8 = 4096 - lm.field_r[var7 >> 5 & 255] >> 1;
            var9 = -var8 + 4096;
            var10 = var8 * var35[1] + var9 * var24[1] >> 12;
            if (var10 <= -32768) {
              var10 = -32767;
            }
            if (var10 >= 32768) {
              var10 = 32767;
            }
            this.field_m[var2] = (short)var10;
          }
        }
        if (param0 < 104) {
          this.field_m = (short[]) null;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          return (int[]) null;
        }
        int[] var8 = this.field_i.a((byte) 50, param1);
        int[] var3 = var8;
        if (this.field_i.field_d) {
          var5 = this.c(0, param0 ^ -33, param1);
          for (var6 = 0; var6 < ns.field_g; var6++) {
            var4 = var5[var6] >> 4;
            if (0 > var4) {
              var4 = 0;
            }
            if (var4 > 256) {
              var4 = 256;
            }
            var8[var6] = this.field_m[var4];
          }
        }
        return var8;
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 < 21) {
          return -58;
        }
        return 7459 * param1 + param2;
    }

    final void b(byte param0) {
        if (param0 != 116) {
          this.field_n = (int[][]) null;
        }
        if (null == this.field_n) {
          this.field_n = new int[][]{new int[]{0, 0}, new int[]{4096, 4096}};
        }
        if (2 > this.field_n.length) {
          throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field_r == 2) {
          this.a(false);
        }
        tka.b((byte) 59);
        this.d((byte) 119);
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == 0) {
            this.field_r = param1.h(255);
            this.field_n = new int[param1.h(255)][2];
            for (var4_int = 0; this.field_n.length > var4_int; var4_int++) {
              this.field_n[var4_int][0] = param1.d(126);
              this.field_n[var4_int][1] = param1.d(126);
            }
          }
          if (param0 != 107) {
            this.field_r = -36;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("fs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (!ej.a(false, param0, param1)) {
            return false;
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= param1.length()) {
              return true;
            }
            if (ov.a(16, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("fs.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        int[] var9 = this.field_n[0];
        int[] var7 = var9;
        int[] var6 = var7;
        int[] var2 = var6;
        if (param0) {
          this.d((byte) -128);
        }
        int[] var12 = this.field_n[1];
        int[] var4 = this.field_n[this.field_n.length - 2];
        int[] var5 = this.field_n[this.field_n.length - 1];
        this.field_o = new int[]{var9[0] - var12[0] + var9[0], var9[1] + var9[1] - var12[1]};
        this.field_q = new int[]{var4[0] + var4[0] - var5[0], var4[1] + var4[1] - var5[1]};
    }

    static {
    }
}
