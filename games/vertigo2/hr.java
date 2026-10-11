/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr extends ji {
    static String field_z;
    private int[][] field_B;
    private int field_E;
    private int[] field_y;
    private short[] field_F;
    static cr field_C;
    static int field_D;
    private int[] field_A;

    private final void b(byte param0) {
        int[] var10 = this.field_B[0];
        int[] var8 = var10;
        int[] var7 = var8;
        int[] var2 = var7;
        int var3 = 10 % ((param0 - 38) / 60);
        int[] var13 = this.field_B[1];
        int[] var5 = this.field_B[-2 + this.field_B.length];
        int[] var6 = this.field_B[-1 + this.field_B.length];
        this.field_y = new int[]{var5[0] - var6[0] + var5[0], -var6[1] - (-var5[1] - var5[1])};
        this.field_A = new int[]{var10[0] + (var10[0] - var13[0]), var10[1] - var13[1] + var10[1]};
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        vi var4 = null;
        s var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          var4 = (vi) (mc.field_i.a((byte) 100));
          while (var4 != null) {
            aj.a(param0, 126, var4);
            var4 = (vi) (mc.field_i.b(40));
          }
          var5 = (s) (wg.field_i.a((byte) 100));
          while (var5 != null) {
            mm.a(param0, var5, (byte) 108);
            var5 = (s) (wg.field_i.b(125));
          }
          if (!param1) {
            field_z = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "hr.J(" + param0 + ',' + param1 + ')');
        }
    }

    final static String h(int param0) {
        if (bf.field_b == un.field_Hb) {
          return wn.field_d;
        }
        if (um.field_F == bf.field_b) {
          return uk.field_u;
        }
        if (param0 > -85) {
          field_D = -44;
        }
        if (!cl.field_c.a((byte) -86)) {
          return uk.field_u;
        }
        return ff.field_u;
    }

    final static int i(int param0) {
        if (param0 <= 25) {
          hr.i(55);
        }
        return mf.field_b + ((rm.field_B << 4) + (oa.field_p << 2));
    }

    final int[] c(int param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        int[] var8 = this.field_x.a(param0, (byte) 67);
        int[] var3 = var8;
        if (param1 <= 91) {
          field_z = (String) null;
        }
        if (this.field_x.field_i) {
          var5 = this.a(0, -1, param0);
          for (var6 = 0; var6 < we.field_M; var6++) {
            var4 = var5[var6] >> 4;
            if (var4 < 0) {
              var4 = 0;
            }
            if (256 < var4) {
              var4 = 256;
            }
            var8[var6] = this.field_F[var4];
          }
        }
        return var8;
    }

    private final int[] a(int param0, byte param1) {
        if (0 > param0) {
          return this.field_A;
        }
        if (param1 <= 49) {
          return (int[]) null;
        }
        if (this.field_B.length <= param0) {
          return this.field_y;
        }
        return this.field_B[param0];
    }

    public static void j(int param0) {
        if (param0 < 34) {
          return;
        }
        field_z = null;
        field_C = null;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            return;
          }
          if (param1 == 0) {
            this.field_E = param2.h(param0 ^ -101);
            this.field_B = new int[param2.h(param0 - 121)][2];
            for (var4_int = 0; var4_int < this.field_B.length; var4_int++) {
              this.field_B[var4_int][0] = param2.a((byte) -11);
              this.field_B[var4_int][1] = param2.a((byte) -11);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("hr.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        td.a(param0, param1, (byte) -77);
    }

    public hr() {
        super(1, true);
        this.field_F = new short[257];
        this.field_E = 0;
    }

    private final void g(int param0) {
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
        var21 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        var2 = this.field_E;
        if (var2 == 2) {
          for (var2 = 0; var2 < 257; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; this.field_B.length - 1 > var3; var3++) {
              if (var4 >= this.field_B[var3][0]) {
                continue;
              }
              break;
            }
            var22 = this.field_B[var3 - 1];
            var34 = this.field_B[var3];
            var7 = this.a(-2 + var3, (byte) 104)[1];
            var8 = var22[1];
            var9 = var34[1];
            var10 = this.a(var3 + 1, (byte) 117)[1];
            var11 = (-var22[0] + var4 << 12) / (-var22[0] + var34[0]);
            var12 = var11 * var11 >> 12;
            var13 = var8 - var9 + var10 - var7;
            var14 = -var13 + (-var8 + var7);
            var15 = var9 - var7;
            var16 = var8;
            var17 = var12 * (var11 * var13 >> 12) >> 12;
            var18 = var14 * var12 >> 12;
            var19 = var11 * var15 >> 12;
            var20 = var16 + (var19 + (var18 + var17));
            if (var20 <= -32768) {
              var20 = -32767;
            }
            if (var20 >= 32768) {
              var20 = 32767;
            }
            this.field_F[var2] = (short)var20;
          }
        } else if (var2 != 1) {
          for (var2 = 0; var2 < 257; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; -1 + this.field_B.length > var3; var3++) {
              if (this.field_B[var3][0] <= var4) {
                continue;
              }
              break;
            }
            var26 = this.field_B[-1 + var3];
            var36 = this.field_B[var3];
            var7 = (-var26[0] + var4 << 12) / (-var26[0] + var36[0]);
            var8 = 4096 - var7;
            var9 = var36[1] * var7 + var8 * var26[1] >> 12;
            if (var9 <= -32768) {
              var9 = -32767;
            }
            if (var9 >= 32768) {
              var9 = 32767;
            }
            this.field_F[var2] = (short)var9;
          }
        } else {
          for (var2 = 0; var2 < 257; var2++) {
            var4 = var2 << 4;
            for (var3 = 1; var3 < -1 + this.field_B.length; var3++) {
              if (var4 >= this.field_B[var3][0]) {
                continue;
              }
              break;
            }
            var24 = this.field_B[-1 + var3];
            var35 = this.field_B[var3];
            var7 = (-var24[0] + var4 << 12) / (-var24[0] + var35[0]);
            var8 = 4096 - qb.field_b[var7 >> 5 & 255] >> 1;
            var9 = 4096 - var8;
            var10 = var8 * var35[1] + var9 * var24[1] >> 12;
            if (-32768 >= var10) {
              var10 = -32767;
            }
            if (var10 >= 32768) {
              var10 = 32767;
            }
            this.field_F[var2] = (short)var10;
          }
        }
    }

    final void a(int param0) {
        if (this.field_B == null) {
          this.field_B = new int[][]{new int[]{0, 0}, new int[]{4096, 4096}};
        }
        if (this.field_B.length < 2) {
          throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field_E == 2) {
          this.b((byte) 125);
        }
        uk.d((byte) 66);
        this.g(1);
        if (param0 > -98) {
          hr.h(104);
        }
    }

    static {
        field_z = "Real-life threats";
    }
}
