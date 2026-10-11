/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends am {
    private int[][] field_s;
    static ei field_z;
    private int[] field_y;
    static fn field_x;
    private int[] field_u;
    private short[] field_t;
    static int field_v;
    private int field_w;

    public static void b(int param0) {
        if (param0 != 0) {
          return;
        }
        field_x = null;
        field_z = null;
    }

    private final int[] b(int param0, int param1) {
        if (param0 < 0) {
          return this.field_u;
        }
        if (this.field_s.length <= param0) {
          return this.field_y;
        }
        if (param1 != 257) {
          return (int[]) null;
        }
        return this.field_s[param0];
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          if (param1 != 35) {
            return;
          }
          if (param2 == 0) {
            this.field_w = param0.i((byte) -101);
            this.field_s = new int[param0.i((byte) -101)][2];
            for (var4_int = 0; var4_int < this.field_s.length; var4_int++) {
              this.field_s[var4_int][0] = param0.i(7088);
              this.field_s[var4_int][1] = param0.i(7088);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("kc.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        int[] var10 = this.field_s[0];
        int[] var8 = var10;
        int[] var7 = var8;
        int[] var2 = var7;
        int[] var13 = this.field_s[1];
        int[] var4 = this.field_s[this.field_s.length - 2];
        int[] var5 = this.field_s[this.field_s.length - 1];
        if (param0 < 27) {
          CharSequence var6 = (CharSequence) null;
          kc.a((byte) -52, (CharSequence) null);
        }
        this.field_y = new int[]{var4[0] - var5[0] + var4[0], var4[1] + (-var5[1] + var4[1])};
        this.field_u = new int[]{var10[0] + var10[0] - var13[0], var10[1] - var13[1] + var10[1]};
    }

    private final void a(boolean param0) {
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
        var21 = Torquing.field_u;
        var2 = this.field_w;
        if (var2 == 2) {
          for (var2 = 0; var2 < 257; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; this.field_s.length - 1 > var3; var3++) {
              if (this.field_s[var3][0] <= var4) {
                continue;
              }
              break;
            }
            var22 = this.field_s[var3 - 1];
            var34 = this.field_s[var3];
            var7 = this.b(var3 - 2, 257)[1];
            var8 = var22[1];
            var9 = var34[1];
            var10 = this.b(1 + var3, 257)[1];
            var11 = (var4 - var22[0] << 12) / (var34[0] - var22[0]);
            var12 = var11 * var11 >> 12;
            var13 = var8 - var7 - var9 + var10;
            var14 = -var8 + (var7 - var13);
            var15 = -var7 + var9;
            var16 = var8;
            var17 = var12 * (var11 * var13 >> 12) >> 12;
            var18 = var12 * var14 >> 12;
            var19 = var15 * var11 >> 12;
            var20 = var19 + var17 + var18 + var16;
            if (var20 <= -32768) {
              var20 = -32767;
            }
            if (var20 >= 32768) {
              var20 = 32767;
            }
            this.field_t[var2] = (short)var20;
          }
        } else if (1 != var2) {
          for (var2 = 0; 257 > var2; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; var3 < -1 + this.field_s.length; var3++) {
              if (this.field_s[var3][0] <= var4) {
                continue;
              }
              break;
            }
            var26 = this.field_s[-1 + var3];
            var36 = this.field_s[var3];
            var7 = (-var26[0] + var4 << 12) / (-var26[0] + var36[0]);
            var8 = -var7 + 4096;
            var9 = var8 * var26[1] + var36[1] * var7 >> 12;
            if (-32768 >= var9) {
              var9 = -32767;
            }
            if (32768 <= var9) {
              var9 = 32767;
            }
            this.field_t[var2] = (short)var9;
          }
        } else {
          for (var2 = 0; var2 < 257; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; this.field_s.length - 1 > var3; var3++) {
              if (var4 >= this.field_s[var3][0]) {
                continue;
              }
              break;
            }
            var24 = this.field_s[var3 - 1];
            var35 = this.field_s[var3];
            var7 = (var4 - var24[0] << 12) / (var35[0] - var24[0]);
            var8 = 4096 - de.field_d[(var7 & 8167) >> 5] >> 1;
            var9 = -var8 + 4096;
            var10 = var24[1] * var9 + var8 * var35[1] >> 12;
            if (var10 <= -32768) {
              var10 = -32767;
            }
            if (var10 >= 32768) {
              var10 = 32767;
            }
            this.field_t[var2] = (short)var10;
          }
        }
        if (param0) {
          this.field_u = (int[]) null;
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = Torquing.field_u;
        if (param0 <= 86) {
          return (int[]) null;
        }
        int[] var8 = this.field_l.a(param1, 25657);
        int[] var3 = var8;
        if (this.field_l.field_b) {
          var5 = this.b(0, 0, param1);
          for (var6 = 0; var6 < ci.field_c; var6++) {
            var4 = var5[var6] >> 4;
            if (var4 < 0) {
              var4 = 0;
            }
            if (var4 > 256) {
              var4 = 256;
            }
            var8[var6] = this.field_t[var4];
          }
        }
        return var8;
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -83 / ((param0 - 49) / 60);
          stackIn_1_0 = ga.a(false, param1, true, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("kc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public kc() {
        super(1, true);
        this.field_t = new short[257];
        this.field_w = 0;
    }

    final void a(byte param0) {
        if (this.field_s == null) {
          this.field_s = new int[][]{new int[]{0, 0}, new int[]{4096, 4096}};
        }
        if (2 > this.field_s.length) {
          throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field_w == 2) {
          this.g((byte) 69);
        }
        if (param0 <= 123) {
          la var3 = (la) null;
          kc.a(76, (la) null, (la) null);
        }
        ie.a(14837);
        this.a(false);
    }

    final static String[] a(char param0, String param1, int param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Torquing.field_u;
        try {
          var10 = (CharSequence) ((Object) param1);
          var3_int = fm.a(param2, param0, var10);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param1.charAt(var8) != param0; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param1.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param1.substring(var6);
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("kc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, la param1, la param2) {
        try {
          if (param0 != 1) {
            String var4 = (String) null;
            kc.a('\021', (String) null, -20);
          }
          qm.field_a = param1;
          ae.field_mb = param2;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "kc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = new ei();
    }
}
