/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int[] field_d;
    int[] field_j;
    short[] field_s;
    short[] field_h;
    private int field_w;
    short[] field_q;
    int[] field_I;
    int[] field_v;
    int field_E;
    jt[] field_m;
    ava[] field_B;
    int[] field_c;
    short[] field_K;
    int[] field_D;
    byte field_k;
    rga[] field_e;
    byte[] field_z;
    int field_L;
    byte[] field_G;
    byte[] field_u;
    short[] field_y;
    int[] field_p;
    int[] field_l;
    byte[] field_n;
    short[] field_J;
    int field_F;
    byte[] field_g;
    byte[] field_i;
    int[] field_x;
    int field_o;
    byte[] field_C;
    short[] field_t;
    static su field_H;
    int[] field_b;
    int[] field_f;
    short[] field_A;
    short[] field_a;
    short[] field_r;

    final int[][] c(byte param0) {
        int var5_int = 0;
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int var2;
        int[] var3;
        int var4;
        int[][] var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[][] var10;
        int[] var11;
        int[][] var12;
        int[][] var12Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var8 = TombRacer.field_G ? 1 : 0;
        var2 = 83 % ((param0 - 22) / 49);
        var11 = new int[256];
        var9 = var11;
        var3 = var9;
        var4 = 0;
        for (var5_int = 0; this.field_o > var5_int; var5_int++) {
          var6 = this.field_D[var5_int];
          if (var6 >= 0) {
            var3[var6] = var3[var6] + 1;
            if (var4 < var6) {
              var4 = var6;
            }
          }
        }
        var12 = new int[var4 + 1][];
        var10 = var12;
        var5 = var10;
        for (var6Lifetime1 = 0; var4 >= var6Lifetime1; var6Lifetime1++) {
          array$2 = new int[var11[var6Lifetime1]];
          var5[var6Lifetime1] = array$2;
          var11[var6Lifetime1] = 0;
        }
        for (var6Lifetime2 = 0; this.field_o > var6Lifetime2; var6Lifetime2++) {
          var7 = this.field_D[var6Lifetime2];
          if (0 <= var7) {
            var12Lifetime1 = var10;
            dupTemp$0 = var3[var7];
            arrayValue$1 = var12Lifetime1[var7];
            var3[var7] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var6Lifetime2;
          }
        }
        return var5;
    }

    public static void a(byte param0) {
        field_H = null;
        if (param0 != -71) {
          oc.a((byte) 123);
        }
    }

    final int[][] b(byte param0) {
        int var4_int = 0;
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] var2;
        int var3;
        int[][] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        int[][] var10;
        int[] var11;
        int[][] var12;
        int var5Lifetime1;
        int var5Lifetime2;
        var7 = TombRacer.field_G ? 1 : 0;
        var11 = new int[256];
        var9 = var11;
        var8 = var9;
        var2 = var8;
        var3 = 0;
        for (var4_int = 0; this.field_m.length > var4_int; var4_int++) {
          var5 = this.field_m[var4_int].field_b;
          if (0 <= var5) {
            var8[var5] = var8[var5] + 1;
            if (var3 < var5) {
              var3 = var5;
            }
          }
        }
        var12 = new int[1 + var3][];
        var10 = var12;
        var4 = var10;
        for (var5Lifetime1 = 0; var3 >= var5Lifetime1; var5Lifetime1++) {
          array$2 = new int[var11[var5Lifetime1]];
          var4[var5Lifetime1] = array$2;
          var11[var5Lifetime1] = 0;
        }
        if (param0 >= -76) {
          this.a(false, (byte) -5);
        }
        for (var5Lifetime2 = 0; this.field_m.length > var5Lifetime2; var5Lifetime2++) {
          var6 = this.field_m[var5Lifetime2].field_b;
          if (var6 >= 0) {
            dupTemp$0 = var2[var6];
            arrayValue$1 = var12[var6];
            var2[var6] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var5Lifetime2;
          }
        }
        return var4;
    }

    private final int a(int param0, short param1, oc param2, int param3) {
        int var8 = 0;
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3 != 1) {
            this.field_n = (byte[]) null;
          }
          var5_int = param2.field_b[param0];
          var6 = param2.field_I[param0];
          var7 = param2.field_p[param0];
          for (var8 = 0; this.field_E > var8; var8++) {
            if (var5_int == this.field_b[var8] &&
              this.field_I[var8] == var6 &&
              this.field_p[var8] == var7) {
              this.field_y[var8] = (short)fh.a((int) this.field_y[var8], (int) param1);
              stackIn_10_0 = var8;
              return stackIn_10_0;
            }
          }
          this.field_b[this.field_E] = var5_int;
          this.field_I[this.field_E] = var6;
          this.field_p[this.field_E] = var7;
          this.field_y[this.field_E] = (short)param1;
          stackIn_14_0 = this.field_l;
          stackIn_14_1 = this.field_E;
          if (null != param2.field_l) {
            stackIn_15_2 = param2.field_l[param0];
          } else {
            stackIn_15_2 = -1;
          }
          stackIn_14_0[stackIn_14_1] = stackIn_15_2;
          fieldTemp$0 = this.field_E;
          this.field_E = this.field_E + 1;
          stackIn_16_0 = fieldTemp$0;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("oc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_187_0 = null;
        StringBuilder stackIn_187_1 = null;
        String stackIn_188_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        uia var4 = null;
        uia var5 = null;
        uia var6 = null;
        uia var7 = null;
        uia var8 = null;
        uia var9 = null;
        int var10 = 0;
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
        int var24 = 0;
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
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        uia var65 = null;
        uia var66 = null;
        int var28Lifetime1;
        int var29Lifetime1;
        int var54Lifetime1;
        int var54Lifetime2;
        int var55Lifetime1;
        int var56Lifetime1;
        int var57Lifetime1;
        int var60Lifetime1;
        int var60Lifetime2;
        int var61Lifetime1;
        int var62Lifetime1;
        int var58Lifetime1;
        int var58Lifetime2;
        int var58Lifetime3;
        int var58Lifetime4;
        int var59Lifetime1;
        int var59Lifetime2;
        int var59Lifetime3;
        int var61Lifetime2;
        int var62Lifetime2;
        int var60Lifetime1Lifetime1;
        var64 = TombRacer.field_G ? 1 : 0;
        try {
          var65 = new uia(param0);
          var66 = var65;
          var4 = new uia(param0);
          var5 = new uia(param0);
          var6 = new uia(param0);
          var7 = new uia(param0);
          var8 = new uia(param0);
          var9 = new uia(param0);
          var66.field_h = param0.length - 23;
          this.field_E = var66.d(123);
          this.field_o = var66.d(123);
          this.field_F = var66.h(255);
          var10 = var66.h(255);
          stackIn_4_0 = ((var10 & 1) != 1) ? 0 : 1;
          var11 = stackIn_4_0;
          stackIn_7_0 = ((var10 & 2) != 2) ? 0 : 1;
          var12 = stackIn_7_0;
          stackIn_10_0 = ((var10 & 4) != 4) ? 0 : 1;
          var13 = stackIn_10_0;
          stackIn_13_0 = (8 != (var10 & 8)) ? 0 : 1;
          var14 = stackIn_13_0;
          if (var14 != 0) {
            var66.field_h = var66.field_h - 7;
            this.field_w = var66.h(255);
            var66.field_h = var66.field_h + 6;
          }
          var15 = var66.h(param1 ^ 255);
          var16 = var66.h(255);
          var17 = var66.h(255);
          var18 = var66.h(255);
          var19 = var66.h(255);
          var20 = var66.d(param1 + 124);
          var21 = var66.d(127);
          var22 = var66.d(param1 + 127);
          var23 = var66.d(124);
          var24 = var66.d(param1 + 124);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (0 < this.field_F) {
            this.field_u = new byte[this.field_F];
            var66.field_h = 0;
            for (var28 = 0; this.field_F > var28; var28++) {
              dupTemp$0 = var65.c((byte) 52);
              this.field_u[var28] = dupTemp$0;
              var29 = dupTemp$0;
              if (var29 >= 1 &&
                var29 <= 3) {
                var26++;
              }
              if (var29 == 0) {
                var25++;
              }
              if (var29 == 2) {
                var27++;
              }
            }
          }
          var28Lifetime1 = this.field_F;
          var29Lifetime1 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + this.field_E;
          var30 = var28Lifetime1;
          if (var11 != 0) {
            var28Lifetime1 = var28Lifetime1 + this.field_o;
          }
          var31 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + this.field_o;
          var32 = var28Lifetime1;
          if (var15 == 255) {
            var28Lifetime1 = var28Lifetime1 + this.field_o;
          }
          var33 = var28Lifetime1;
          if (var17 == 1) {
            var28Lifetime1 = var28Lifetime1 + this.field_o;
          }
          var34 = var28Lifetime1;
          if (1 == var19) {
            var28Lifetime1 = var28Lifetime1 + this.field_E;
          }
          var35 = var28Lifetime1;
          if (var16 == 1) {
            var28Lifetime1 = var28Lifetime1 + this.field_o;
          }
          var36 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var23;
          var37 = var28Lifetime1;
          if (var18 == 1) {
            var28Lifetime1 = var28Lifetime1 + 2 * this.field_o;
          }
          var38 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var24;
          var39 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + this.field_o * 2;
          var40 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var20;
          var41 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var21;
          var42 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var22;
          var43 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var25 * 6;
          var44 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + 6 * var26;
          var45 = 6;
          if (this.field_w != 14) {
            if (this.field_w >= 15) {
              var45 = 9;
            }
          } else {
            var45 = 7;
          }
          var46 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var45 * var26;
          var47 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var26;
          var48 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + var26;
          var49 = var28Lifetime1;
          var28Lifetime1 = var28Lifetime1 + (var27 * 2 + var26);
          this.field_t = new short[this.field_o];
          var50 = var28Lifetime1;
          this.field_p = new int[this.field_E];
          this.field_a = new short[this.field_o];
          if (var18 == 1 &&
            0 < this.field_F) {
            this.field_g = new byte[this.field_o];
          }
          if (var16 == 1) {
            this.field_n = new byte[this.field_o];
          }
          if (this.field_F > 0) {
            this.field_K = new short[this.field_F];
            if (0 < var26) {
              this.field_i = new byte[var26];
              this.field_j = new int[var26];
              this.field_x = new int[var26];
              this.field_f = new int[var26];
              this.field_z = new byte[var26];
              this.field_d = new int[var26];
            }
            this.field_q = new short[this.field_F];
            if (0 < var27) {
              this.field_c = new int[var27];
              this.field_v = new int[var27];
            }
            this.field_s = new short[this.field_F];
          }
          if (var11 != 0) {
            this.field_G = new byte[this.field_o];
          }
          if (255 != var15) {
            this.field_k = (byte)var15;
          } else {
            this.field_C = new byte[this.field_o];
          }
          if (1 == var18) {
            this.field_r = new short[this.field_o];
          }
          this.field_A = new short[this.field_o];
          this.field_I = new int[this.field_E];
          this.field_J = new short[this.field_o];
          if (var17 == 1) {
            this.field_D = new int[this.field_o];
          }
          var66.field_h = var29Lifetime1;
          this.field_b = new int[this.field_E];
          if (var19 == 1) {
            this.field_l = new int[this.field_E];
          }
          var4.field_h = var40;
          var5.field_h = var41;
          var6.field_h = var42;
          var7.field_h = var34;
          var51 = 0;
          var52 = 0;
          var53 = 0;
          for (var54 = 0; this.field_E > var54; var54++) {
            var55 = var66.h(255);
            var56 = 0;
            if ((var55 & 1) != 0) {
              var56 = var4.f((byte) -128);
            }
            var57 = 0;
            if ((2 & var55) != 0) {
              var57 = var5.f((byte) -128);
            }
            var58 = 0;
            if ((var55 & 4) != 0) {
              var58 = var6.f((byte) -128);
            }
            this.field_b[var54] = var51 + var56;
            this.field_I[var54] = var52 + var57;
            this.field_p[var54] = var53 + var58;
            var53 = this.field_p[var54];
            var51 = this.field_b[var54];
            var52 = this.field_I[var54];
            if (1 == var19) {
              this.field_l[var54] = var7.h(kha.b(param1, 255));
            }
          }
          var66.field_h = var39;
          var4.field_h = var30;
          var5.field_h = var32;
          var6.field_h = var35;
          var7.field_h = var33;
          var8.field_h = var37;
          var9.field_h = var38;
          for (var54Lifetime1 = 0; var54Lifetime1 < this.field_o; var54Lifetime1++) {
            this.field_A[var54Lifetime1] = (short)var66.d(127);
            if (var11 != 0) {
              this.field_G[var54Lifetime1] = var4.c((byte) 33);
            }
            if (var15 == 255) {
              this.field_C[var54Lifetime1] = var5.c((byte) 96);
            }
            if (var16 == 1) {
              this.field_n[var54Lifetime1] = var6.c((byte) 119);
            }
            if (var17 == 1) {
              this.field_D[var54Lifetime1] = var7.h(255);
            }
            if (var18 == 1) {
              this.field_r[var54Lifetime1] = (short)(var8.d(kha.b(param1, 127)) - 1);
            }
            if (this.field_g != null) {
              if (this.field_r[var54Lifetime1] != -1) {
                this.field_g[var54Lifetime1] = (byte)(var9.h(255) - 1);
              } else {
                this.field_g[var54Lifetime1] = (byte)-1;
              }
            }
          }
          var66.field_h = var36;
          this.field_L = -1;
          var4.field_h = var31;
          var54Lifetime2 = 0;
          var55Lifetime1 = 0;
          var56Lifetime1 = 0;
          var57Lifetime1 = 0;
          for (var58Lifetime1 = 0; var58Lifetime1 < this.field_o; var58Lifetime1++) {
            var59 = var4.h(255);
            if (var59 == 1) {
              var54Lifetime2 = (short)(var57Lifetime1 + var66.f((byte) -128));
              var57Lifetime1 = var54Lifetime2;
              var55Lifetime1 = (short)(var66.f((byte) -128) + var57Lifetime1);
              var57Lifetime1 = var55Lifetime1;
              var56Lifetime1 = (short)(var66.f((byte) -128) + var57Lifetime1);
              var57Lifetime1 = var56Lifetime1;
              this.field_a[var58Lifetime1] = (short)var54Lifetime2;
              this.field_t[var58Lifetime1] = (short)var55Lifetime1;
              this.field_J[var58Lifetime1] = (short)var56Lifetime1;
              if (var54Lifetime2 > this.field_L) {
                this.field_L = var54Lifetime2;
              }
              if (this.field_L < var55Lifetime1) {
                this.field_L = var55Lifetime1;
              }
              if (this.field_L < var56Lifetime1) {
                this.field_L = var56Lifetime1;
              }
            }
            if (2 == var59) {
              var55Lifetime1 = var56Lifetime1;
              var56Lifetime1 = (short)(var66.f((byte) -128) + var57Lifetime1);
              this.field_a[var58Lifetime1] = (short)var54Lifetime2;
              var57Lifetime1 = var56Lifetime1;
              this.field_t[var58Lifetime1] = (short)var55Lifetime1;
              this.field_J[var58Lifetime1] = (short)var56Lifetime1;
              if (this.field_L < var56Lifetime1) {
                this.field_L = var56Lifetime1;
              }
            }
            if (var59 == 3) {
              var54Lifetime2 = var56Lifetime1;
              var56Lifetime1 = (short)(var66.f((byte) -128) + var57Lifetime1);
              this.field_a[var58Lifetime1] = (short)var54Lifetime2;
              var57Lifetime1 = var56Lifetime1;
              this.field_t[var58Lifetime1] = (short)var55Lifetime1;
              this.field_J[var58Lifetime1] = (short)var56Lifetime1;
              if (var56Lifetime1 > this.field_L) {
                this.field_L = var56Lifetime1;
              }
            }
            if (var59 == 4) {
              var60 = var54Lifetime2;
              var54Lifetime2 = var55Lifetime1;
              var55Lifetime1 = var60;
              var56Lifetime1 = (short)(var57Lifetime1 + var66.f((byte) -128));
              var57Lifetime1 = var56Lifetime1;
              this.field_a[var58Lifetime1] = (short)var54Lifetime2;
              this.field_t[var58Lifetime1] = (short)var55Lifetime1;
              this.field_J[var58Lifetime1] = (short)var56Lifetime1;
              if (this.field_L < var56Lifetime1) {
                this.field_L = var56Lifetime1;
              }
            }
          }
          var66.field_h = var43;
          if (param1 != 0) {
            this.field_e = (rga[]) null;
          }
          this.field_L = this.field_L + 1;
          var4.field_h = var44;
          var5.field_h = var46;
          var6.field_h = var47;
          var7.field_h = var48;
          var8.field_h = var49;
          for (var58Lifetime2 = 0; var58Lifetime2 < this.field_F; var58Lifetime2++) {
            var59Lifetime1 = this.field_u[var58Lifetime2] & 255;
            if (var59Lifetime1 == 0) {
              this.field_s[var58Lifetime2] = (short)var66.d(123);
              this.field_q[var58Lifetime2] = (short)var66.d(125);
              this.field_K[var58Lifetime2] = (short)var66.d(123);
            }
            if (var59Lifetime1 == 1) {
              this.field_s[var58Lifetime2] = (short)var4.d(126);
              this.field_q[var58Lifetime2] = (short)var4.d(123);
              this.field_K[var58Lifetime2] = (short)var4.d(param1 + 122);
              if (15 > this.field_w) {
                this.field_j[var58Lifetime2] = var5.d(param1 + 127);
                if (this.field_w < 14) {
                  this.field_f[var58Lifetime2] = var5.d(123);
                } else {
                  this.field_f[var58Lifetime2] = var5.a(-32768);
                }
                this.field_x[var58Lifetime2] = var5.d(kha.b(param1, 125));
              } else {
                this.field_j[var58Lifetime2] = var5.a(-32768);
                this.field_f[var58Lifetime2] = var5.a(-32768);
                this.field_x[var58Lifetime2] = var5.a(-32768);
              }
              this.field_i[var58Lifetime2] = var6.c((byte) 87);
              this.field_z[var58Lifetime2] = var7.c((byte) 96);
              this.field_d[var58Lifetime2] = var8.c((byte) 75);
            }
            if (var59Lifetime1 == 2) {
              this.field_s[var58Lifetime2] = (short)var4.d(126);
              this.field_q[var58Lifetime2] = (short)var4.d(127);
              this.field_K[var58Lifetime2] = (short)var4.d(param1 + 123);
              if (this.field_w >= 15) {
                this.field_j[var58Lifetime2] = var5.a(-32768);
                this.field_f[var58Lifetime2] = var5.a(-32768);
                this.field_x[var58Lifetime2] = var5.a(-32768);
              } else {
                this.field_j[var58Lifetime2] = var5.d(122);
                if (this.field_w >= 14) {
                  this.field_f[var58Lifetime2] = var5.a(-32768);
                } else {
                  this.field_f[var58Lifetime2] = var5.d(param1 + 126);
                }
                this.field_x[var58Lifetime2] = var5.d(122);
              }
              this.field_i[var58Lifetime2] = var6.c((byte) 122);
              this.field_z[var58Lifetime2] = var7.c((byte) 119);
              this.field_d[var58Lifetime2] = var8.c((byte) 88);
              this.field_v[var58Lifetime2] = var8.c((byte) 82);
              this.field_c[var58Lifetime2] = var8.c((byte) 65);
            }
            if (var59Lifetime1 == 3) {
              this.field_s[var58Lifetime2] = (short)var4.d(125);
              this.field_q[var58Lifetime2] = (short)var4.d(param1 + 124);
              this.field_K[var58Lifetime2] = (short)var4.d(125);
              if (this.field_w < 15) {
                this.field_j[var58Lifetime2] = var5.d(123);
                if (this.field_w < 14) {
                  this.field_f[var58Lifetime2] = var5.d(123);
                } else {
                  this.field_f[var58Lifetime2] = var5.a(-32768);
                }
                this.field_x[var58Lifetime2] = var5.d(123);
              } else {
                this.field_j[var58Lifetime2] = var5.a(kha.b(param1, -32768));
                this.field_f[var58Lifetime2] = var5.a(kha.b(param1, -32768));
                this.field_x[var58Lifetime2] = var5.a(param1 - 32768);
              }
              this.field_i[var58Lifetime2] = var6.c((byte) 31);
              this.field_z[var58Lifetime2] = var7.c((byte) 70);
              this.field_d[var58Lifetime2] = var8.c((byte) 32);
            }
          }
          var66.field_h = var50;
          if (var12 != 0) {
            var58Lifetime3 = var66.h(255);
            if (0 < var58Lifetime3) {
              this.field_B = new ava[var58Lifetime3];
              for (var59Lifetime2 = 0; var59Lifetime2 < var58Lifetime3; var59Lifetime2++) {
                var60Lifetime1 = var66.d(param1 + 121);
                var61 = var66.d(122);
                if (255 != var15) {
                  var62 = (byte)var15;
                } else {
                  var62 = this.field_C[var61];
                }
                this.field_B[var59Lifetime2] = new ava(var60Lifetime1, (int) this.field_a[var61], (int) this.field_t[var61], (int) this.field_J[var61], (byte) var62);
              }
            }
            var59Lifetime2 = var66.h(255);
            if (var59Lifetime2 > 0) {
              this.field_e = new rga[var59Lifetime2];
              for (var60Lifetime1Lifetime1 = 0; var60Lifetime1Lifetime1 < var59Lifetime2; var60Lifetime1Lifetime1++) {
                var61Lifetime2 = var66.d(121);
                var62Lifetime2 = var66.d(123);
                this.field_e[var60Lifetime1Lifetime1] = new rga(var61Lifetime2, var62Lifetime2);
              }
            }
          }
          if (var13 != 0) {
            var58Lifetime4 = var66.h(255);
            if (var58Lifetime4 <= 0) {
              return;
            }
            this.field_m = new jt[var58Lifetime4];
            for (var59Lifetime3 = 0; var59Lifetime3 < var58Lifetime4; var59Lifetime3++) {
              var60Lifetime2 = var66.d(124);
              var61Lifetime1 = var66.d(param1 ^ 123);
              var62Lifetime1 = var66.h(param1 + 255);
              var63 = var66.c((byte) 60);
              this.field_m[var59Lifetime3] = new jt(var60Lifetime2, var61Lifetime1, var62Lifetime1, var63);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_187_0 = var3;
          stackIn_187_1 = new StringBuilder().append("oc.D(");
          if (param0 == null) {
            stackIn_188_2 = "null";
          } else {
            stackIn_188_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_187_0), ((StringBuilder) (Object) stackIn_187_1).append(stackIn_188_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[][] a(boolean param0, byte param1) {
        int var6_int = 0;
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int stackIn_3_0 = 0;
        int[] var3;
        int var4;
        int var5;
        int[][] var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int[] var11;
        int[][] var12;
        int[] var13;
        int[][] var14;
        int var7Lifetime1;
        int var7Lifetime2;
        var9 = TombRacer.field_G ? 1 : 0;
        var13 = new int[256];
        var11 = var13;
        var10 = var11;
        var3 = var10;
        var4 = 0;
        if (param0) {
          stackIn_3_0 = this.field_E;
        } else {
          stackIn_3_0 = this.field_L;
        }
        var5 = stackIn_3_0;
        for (var6_int = 0; var6_int < var5; var6_int++) {
          var7 = this.field_l[var6_int];
          if (var7 >= 0) {
            var10[var7] = var10[var7] + 1;
            if (var4 < var7) {
              var4 = var7;
            }
          }
        }
        if (param1 != 64) {
          this.field_g = (byte[]) null;
        }
        var14 = new int[var4 + 1][];
        var12 = var14;
        var6 = var12;
        for (var7Lifetime1 = 0; var7Lifetime1 <= var4; var7Lifetime1++) {
          array$2 = new int[var13[var7Lifetime1]];
          var6[var7Lifetime1] = array$2;
          var13[var7Lifetime1] = 0;
        }
        for (var7Lifetime2 = 0; var7Lifetime2 < var5; var7Lifetime2++) {
          var8 = this.field_l[var7Lifetime2];
          if (var8 >= 0) {
            dupTemp$0 = var3[var8];
            arrayValue$1 = var14[var8];
            var3[var8] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var7Lifetime2;
          }
        }
        return var6;
    }

    private final void a(int param0, byte[] param1) {
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_116_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        uia var5 = null;
        uia var6 = null;
        uia var7 = null;
        uia var8 = null;
        uia var9 = null;
        int var10 = 0;
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
        int var24 = 0;
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
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37Lifetime1;
        int var37Lifetime2;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var40Lifetime2;
        int var40Lifetime3;
        int var41Lifetime1;
        int var42Lifetime1;
        var43 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          var4 = 0;
          var5 = new uia(param1);
          var6 = new uia(param1);
          var7 = new uia(param1);
          var8 = new uia(param1);
          var9 = new uia(param1);
          var5.field_h = -18 + param1.length;
          this.field_E = var5.d(param0 - 5349);
          this.field_o = var5.d(124);
          this.field_F = var5.h(255);
          var10 = var5.h(param0 - 5219);
          var11 = var5.h(param0 ^ 5533);
          var12 = var5.h(255);
          var13 = var5.h(255);
          var14 = var5.h(param0 ^ 5533);
          var15 = var5.d(123);
          var16 = var5.d(125);
          var17 = var5.d(param0 - 5348);
          var18 = var5.d(127);
          var19 = 0;
          var20 = var19;
          var19 = var19 + this.field_E;
          var21 = var19;
          var19 = var19 + this.field_o;
          var22 = var19;
          if (var11 == 255) {
            var19 = var19 + this.field_o;
          }
          var23 = var19;
          if (1 == var13) {
            var19 = var19 + this.field_o;
          }
          var24 = var19;
          if (1 == var10) {
            var19 = var19 + this.field_o;
          }
          var25 = var19;
          if (var14 == 1) {
            var19 = var19 + this.field_E;
          }
          var26 = var19;
          if (1 == var12) {
            var19 = var19 + this.field_o;
          }
          var27 = var19;
          var19 = var19 + var18;
          var28 = var19;
          var19 = var19 + this.field_o * 2;
          var29 = var19;
          var19 = var19 + this.field_F * 6;
          var30 = var19;
          var19 = var19 + var15;
          var31 = var19;
          var19 = var19 + var16;
          var32 = var19;
          this.field_p = new int[this.field_E];
          this.field_t = new short[this.field_o];
          if (this.field_F > 0) {
            this.field_u = new byte[this.field_F];
            this.field_s = new short[this.field_F];
            this.field_K = new short[this.field_F];
            this.field_q = new short[this.field_F];
          }
          if (var13 == 1) {
            this.field_D = new int[this.field_o];
          }
          this.field_I = new int[this.field_E];
          var19 = var19 + var17;
          this.field_a = new short[this.field_o];
          if (255 == var11) {
            this.field_C = new byte[this.field_o];
          } else {
            this.field_k = (byte)var11;
          }
          this.field_J = new short[this.field_o];
          this.field_A = new short[this.field_o];
          var5.field_h = var20;
          if (var14 == 1) {
            this.field_l = new int[this.field_E];
          }
          if (1 == var10) {
            this.field_G = new byte[this.field_o];
            this.field_g = new byte[this.field_o];
            this.field_r = new short[this.field_o];
          }
          this.field_b = new int[this.field_E];
          if (var12 == 1) {
            this.field_n = new byte[this.field_o];
          }
          var6.field_h = var30;
          var7.field_h = var31;
          var8.field_h = var32;
          var9.field_h = var25;
          var33 = 0;
          var34 = 0;
          var35 = 0;
          for (var36 = 0; this.field_E > var36; var36++) {
            var37 = var5.h(255);
            var38 = 0;
            if ((var37 & 1) != 0) {
              var38 = var6.f((byte) -128);
            }
            var39 = 0;
            if ((var37 & 2) != 0) {
              var39 = var7.f((byte) -128);
            }
            var40 = 0;
            if ((4 & var37) != 0) {
              var40 = var8.f((byte) -128);
            }
            this.field_b[var36] = var33 + var38;
            this.field_I[var36] = var39 + var34;
            this.field_p[var36] = var40 + var35;
            var35 = this.field_p[var36];
            var34 = this.field_I[var36];
            var33 = this.field_b[var36];
            if (var14 == 1) {
              this.field_l[var36] = var9.h(255);
            }
          }
          var5.field_h = var28;
          var6.field_h = var24;
          var7.field_h = var22;
          var8.field_h = var26;
          var9.field_h = var23;
          for (var36Lifetime1 = 0; this.field_o > var36Lifetime1; var36Lifetime1++) {
            this.field_A[var36Lifetime1] = (short)var5.d(param0 - 5352);
            if (var10 == 1) {
              var37Lifetime1 = var6.h(255);
              if ((var37Lifetime1 & 1) != 1) {
                this.field_G[var36Lifetime1] = (byte) 0;
              } else {
                this.field_G[var36Lifetime1] = (byte) 1;
                var3_int = 1;
              }
              if ((2 & var37Lifetime1) != 2) {
                this.field_g[var36Lifetime1] = (byte)-1;
                this.field_r[var36Lifetime1] = (short)-1;
              } else {
                this.field_g[var36Lifetime1] = (byte)(var37Lifetime1 >> 2);
                this.field_r[var36Lifetime1] = this.field_A[var36Lifetime1];
                this.field_A[var36Lifetime1] = (short)127;
                if (this.field_r[var36Lifetime1] != -1) {
                  var4 = 1;
                }
              }
            }
            if (var11 == 255) {
              this.field_C[var36Lifetime1] = var7.c((byte) 92);
            }
            if (1 == var12) {
              this.field_n[var36Lifetime1] = var8.c((byte) 87);
            }
            if (1 == var13) {
              this.field_D[var36Lifetime1] = var9.h(255);
            }
          }
          this.field_L = -1;
          var5.field_h = var27;
          var6.field_h = var21;
          var36Lifetime2 = 0;
          var37Lifetime2 = 0;
          var38Lifetime1 = 0;
          var39Lifetime1 = 0;
          for (var40Lifetime1 = 0; var40Lifetime1 < this.field_o; var40Lifetime1++) {
            var41 = var6.h(255);
            if (var41 == 1) {
              var36Lifetime2 = (short)(var39Lifetime1 + var5.f((byte) -128));
              var39Lifetime1 = var36Lifetime2;
              var37Lifetime2 = (short)(var39Lifetime1 + var5.f((byte) -128));
              var39Lifetime1 = var37Lifetime2;
              var38Lifetime1 = (short)(var39Lifetime1 + var5.f((byte) -128));
              var39Lifetime1 = var38Lifetime1;
              this.field_a[var40Lifetime1] = (short)var36Lifetime2;
              this.field_t[var40Lifetime1] = (short)var37Lifetime2;
              this.field_J[var40Lifetime1] = (short)var38Lifetime1;
              if (this.field_L < var36Lifetime2) {
                this.field_L = var36Lifetime2;
              }
              if (var37Lifetime2 > this.field_L) {
                this.field_L = var37Lifetime2;
              }
              if (var38Lifetime1 > this.field_L) {
                this.field_L = var38Lifetime1;
              }
            }
            if (2 == var41) {
              var37Lifetime2 = var38Lifetime1;
              var38Lifetime1 = (short)(var5.f((byte) -128) + var39Lifetime1);
              this.field_a[var40Lifetime1] = (short)var36Lifetime2;
              var39Lifetime1 = var38Lifetime1;
              this.field_t[var40Lifetime1] = (short)var37Lifetime2;
              this.field_J[var40Lifetime1] = (short)var38Lifetime1;
              if (this.field_L < var38Lifetime1) {
                this.field_L = var38Lifetime1;
              }
            }
            if (3 == var41) {
              var36Lifetime2 = var38Lifetime1;
              var38Lifetime1 = (short)(var39Lifetime1 + var5.f((byte) -128));
              this.field_a[var40Lifetime1] = (short)var36Lifetime2;
              var39Lifetime1 = var38Lifetime1;
              this.field_t[var40Lifetime1] = (short)var37Lifetime2;
              this.field_J[var40Lifetime1] = (short)var38Lifetime1;
              if (this.field_L < var38Lifetime1) {
                this.field_L = var38Lifetime1;
              }
            }
            if (var41 == 4) {
              var42 = var36Lifetime2;
              var36Lifetime2 = var37Lifetime2;
              var37Lifetime2 = var42;
              var38Lifetime1 = (short)(var39Lifetime1 + var5.f((byte) -128));
              this.field_a[var40Lifetime1] = (short)var36Lifetime2;
              var39Lifetime1 = var38Lifetime1;
              this.field_t[var40Lifetime1] = (short)var37Lifetime2;
              this.field_J[var40Lifetime1] = (short)var38Lifetime1;
              if (this.field_L < var38Lifetime1) {
                this.field_L = var38Lifetime1;
              }
            }
          }
          var5.field_h = var29;
          this.field_L = this.field_L + 1;
          var40Lifetime2 = 0;
          if (param0 != 5474) {
            return;
          }
          while (this.field_F > var40Lifetime2) {
            this.field_u[var40Lifetime2] = (byte) 0;
            this.field_s[var40Lifetime2] = (short)var5.d(kha.b(param0, 5407));
            this.field_q[var40Lifetime2] = (short)var5.d(126);
            this.field_K[var40Lifetime2] = (short)var5.d(kha.b(param0, 5407));
            var40Lifetime2++;
          }
          if (null != this.field_g) {
            var40Lifetime3 = 0;
            var44 = 0;
            var41Lifetime1 = var44;
            while (var44 < this.field_o) {
              var42Lifetime1 = 255 & this.field_g[var44];
              if (255 != var42Lifetime1) {
                if (this.field_a[var44] == (this.field_s[var42Lifetime1] & 65535) &&
                  this.field_t[var44] == (65535 & this.field_q[var42Lifetime1]) &&
                  (65535 & this.field_K[var42Lifetime1]) == this.field_J[var44]) {
                  this.field_g[var44] = (byte)-1;
                } else {
                  var40Lifetime3 = 1;
                }
              }
              var44++;
            }
            if (var40Lifetime3 == 0) {
              this.field_g = null;
            }
          }
          if (var3_int == 0) {
            this.field_G = null;
          }
          if (var4 == 0) {
            this.field_r = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_115_0 = var3;
          stackIn_115_1 = new StringBuilder().append("oc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_116_2 = "null";
          } else {
            stackIn_116_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_115_0), ((StringBuilder) (Object) stackIn_115_1).append(stackIn_116_2).append(')').toString());
        }
    }

    oc(byte[] param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_k = (byte) 0;
        this.field_L = 0;
        this.field_o = 0;
        this.field_F = 0;
        this.field_w = 12;
        this.field_E = 0;
        try {
          if (param0[param0.length - 1] == -1 &&
            param0[param0.length - 2] == -1) {
            this.a(param0, 0);
            return;
          }
          this.a(5474, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("oc.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    oc(oc[] param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        byte[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_100_2 = 0;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_117_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        oc var13_ref_oc = null;
        int var14 = 0;
        oc var14_ref_oc = null;
        oc var15 = null;
        int var15_int = 0;
        int var16 = 0;
        jt var16_ref_jt = null;
        int var17 = 0;
        int var18 = 0;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var15_intLifetime1;
        int var15_intLifetime2;
        int var15_intLifetime3;
        int var16Lifetime1;
        int var17Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var16Lifetime2;
        int var16Lifetime1Lifetime1;
        this.field_k = (byte) 0;
        this.field_L = 0;
        this.field_o = 0;
        this.field_F = 0;
        this.field_w = 12;
        this.field_E = 0;
        try {
          this.field_F = 0;
          this.field_o = 0;
          this.field_E = 0;
          var3_int = 0;
          var4 = 0;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          this.field_k = (byte) -1;
          var11 = 0;
          for (var12 = 0; param1 > var12; var12++) {
            var13_ref_oc = param0[var12];
            if (var13_ref_oc != null) {
              this.field_E = this.field_E + var13_ref_oc.field_E;
              this.field_o = this.field_o + var13_ref_oc.field_o;
              this.field_F = this.field_F + var13_ref_oc.field_F;
              if (var13_ref_oc.field_e != null) {
                var4 = var4 + var13_ref_oc.field_e.length;
              }
              if (null != var13_ref_oc.field_m) {
                var5 = var5 + var13_ref_oc.field_m.length;
              }
              if (null != var13_ref_oc.field_B) {
                var3_int = var3_int + var13_ref_oc.field_B.length;
              }
              stackIn_12_0 = var6;
              if (null == var13_ref_oc.field_G) {
                stackIn_13_1 = 0;
              } else {
                stackIn_13_1 = 1;
              }
              var6 = stackIn_12_0 | stackIn_13_1;
              stackIn_15_0 = var11;
              if (null == var13_ref_oc.field_D) {
                stackIn_16_1 = 0;
              } else {
                stackIn_16_1 = 1;
              }
              var11 = stackIn_15_0 | stackIn_16_1;
              if (null == var13_ref_oc.field_C) {
                if (this.field_k == -1) {
                  this.field_k = var13_ref_oc.field_k;
                }
                if (this.field_k != var13_ref_oc.field_k) {
                  var7 = 1;
                }
              } else {
                var7 = 1;
              }
              stackIn_24_0 = var8;
              if (null == var13_ref_oc.field_n) {
                stackIn_25_1 = 0;
              } else {
                stackIn_25_1 = 1;
              }
              var8 = stackIn_24_0 | stackIn_25_1;
              stackIn_27_0 = var10;
              if (null == var13_ref_oc.field_r) {
                stackIn_28_1 = 0;
              } else {
                stackIn_28_1 = 1;
              }
              var10 = stackIn_27_0 | stackIn_28_1;
              stackIn_30_0 = var9;
              if (null == var13_ref_oc.field_g) {
                stackIn_31_1 = 0;
              } else {
                stackIn_31_1 = 1;
              }
              var9 = stackIn_30_0 | stackIn_31_1;
            }
          }
          if (var4 > 0) {
            this.field_e = new rga[var4];
          }
          if (var9 != 0) {
            this.field_g = new byte[this.field_o];
          }
          this.field_a = new short[this.field_o];
          if (var10 != 0) {
            this.field_r = new short[this.field_o];
          }
          if (this.field_F > 0) {
            this.field_v = new int[this.field_F];
            this.field_z = new byte[this.field_F];
            this.field_c = new int[this.field_F];
            this.field_f = new int[this.field_F];
            this.field_s = new short[this.field_F];
            this.field_q = new short[this.field_F];
            this.field_x = new int[this.field_F];
            this.field_j = new int[this.field_F];
            this.field_K = new short[this.field_F];
            this.field_i = new byte[this.field_F];
            this.field_d = new int[this.field_F];
            this.field_u = new byte[this.field_F];
          }
          this.field_A = new short[this.field_o];
          if (var7 != 0) {
            this.field_C = new byte[this.field_o];
          }
          this.field_I = new int[this.field_E];
          this.field_p = new int[this.field_E];
          this.field_y = new short[this.field_E];
          this.field_h = new short[this.field_o];
          this.field_J = new short[this.field_o];
          this.field_b = new int[this.field_E];
          if (var11 != 0) {
            this.field_D = new int[this.field_o];
          }
          this.field_l = new int[this.field_E];
          if (var5 > 0) {
            this.field_m = new jt[var5];
          }
          this.field_t = new short[this.field_o];
          if (var6 != 0) {
            this.field_G = new byte[this.field_o];
          }
          if (var8 != 0) {
            this.field_n = new byte[this.field_o];
          }
          if (var3_int > 0) {
            this.field_B = new ava[var3_int];
          }
          var3_intLifetime1 = 0;
          var5Lifetime1 = 0;
          var4Lifetime1 = 0;
          this.field_o = 0;
          this.field_F = 0;
          this.field_E = 0;
          for (var12Lifetime1 = 0; param1 > var12Lifetime1; var12Lifetime1++) {
            var13 = (short)(1 << var12Lifetime1);
            var14_ref_oc = param0[var12Lifetime1];
            if (var14_ref_oc != null) {
              if (var14_ref_oc.field_m != null) {
                for (var15_int = 0; var15_int < var14_ref_oc.field_m.length; var15_int++) {
                  var16_ref_jt = var14_ref_oc.field_m[var15_int];
                  incrementValue$2 = var5Lifetime1;
                  var5Lifetime1++;
                  this.field_m[incrementValue$2] = var16_ref_jt.a(9677, var16_ref_jt.field_a + this.field_o);
                }
              }
              for (var15_intLifetime1 = 0; var14_ref_oc.field_o > var15_intLifetime1; var15_intLifetime1++) {
                if (var6 != 0 &&
                  null != var14_ref_oc.field_G) {
                  this.field_G[this.field_o] = var14_ref_oc.field_G[var15_intLifetime1];
                }
                if (var7 != 0) {
                  if (null != var14_ref_oc.field_C) {
                    this.field_C[this.field_o] = var14_ref_oc.field_C[var15_intLifetime1];
                  } else {
                    this.field_C[this.field_o] = var14_ref_oc.field_k;
                  }
                }
                if (var8 != 0 &&
                  null != var14_ref_oc.field_n) {
                  this.field_n[this.field_o] = var14_ref_oc.field_n[var15_intLifetime1];
                }
                if (var10 != 0) {
                  if (null == var14_ref_oc.field_r) {
                    this.field_r[this.field_o] = (short)-1;
                  } else {
                    this.field_r[this.field_o] = var14_ref_oc.field_r[var15_intLifetime1];
                  }
                }
                if (var11 != 0) {
                  if (var14_ref_oc.field_D != null) {
                    this.field_D[this.field_o] = var14_ref_oc.field_D[var15_intLifetime1];
                  } else {
                    this.field_D[this.field_o] = -1;
                  }
                }
                this.field_a[this.field_o] = (short)this.a((int) var14_ref_oc.field_a[var15_intLifetime1], (short) var13, var14_ref_oc, 1);
                this.field_t[this.field_o] = (short)this.a((int) var14_ref_oc.field_t[var15_intLifetime1], (short) var13, var14_ref_oc, 1);
                this.field_J[this.field_o] = (short)this.a((int) var14_ref_oc.field_J[var15_intLifetime1], (short) var13, var14_ref_oc, 1);
                this.field_h[this.field_o] = (short)var13;
                this.field_A[this.field_o] = var14_ref_oc.field_A[var15_intLifetime1];
                this.field_o = this.field_o + 1;
              }
              if (null != var14_ref_oc.field_B) {
                for (var15_intLifetime2 = 0; var14_ref_oc.field_B.length > var15_intLifetime2; var15_intLifetime2++) {
                  var16 = this.a(var14_ref_oc.field_B[var15_intLifetime2].field_a, (short) var13, var14_ref_oc, 1);
                  var17 = this.a(var14_ref_oc.field_B[var15_intLifetime2].field_c, (short) var13, var14_ref_oc, 1);
                  var18 = this.a(var14_ref_oc.field_B[var15_intLifetime2].field_b, (short) var13, var14_ref_oc, 1);
                  this.field_B[var3_intLifetime1] = var14_ref_oc.field_B[var15_intLifetime2].a(0, var17, var18, var16);
                  var3_intLifetime1++;
                }
              }
              if (null != var14_ref_oc.field_e) {
                for (var15_intLifetime3 = 0; var14_ref_oc.field_e.length > var15_intLifetime3; var15_intLifetime3++) {
                  var16Lifetime2 = this.a(var14_ref_oc.field_e[var15_intLifetime3].field_a, (short) var13, var14_ref_oc, 1);
                  this.field_e[var4Lifetime1] = var14_ref_oc.field_e[var15_intLifetime3].a(0, var16Lifetime2);
                  var4Lifetime1++;
                }
              }
            }
          }
          var12Lifetime2 = 0;
          this.field_L = this.field_E;
          for (var13Lifetime1 = 0; param1 > var13Lifetime1; var13Lifetime1++) {
            var14 = (short)(1 << var13Lifetime1);
            var15 = param0[var13Lifetime1];
            if (var15 != null) {
              for (var16Lifetime1 = 0; var15.field_o > var16Lifetime1; var16Lifetime1++) {
                if (var9 != 0) {
                  incrementValue$1 = var12Lifetime2;
                  var12Lifetime2++;
                  stackIn_99_0 = this.field_g;
                  stackIn_99_1 = incrementValue$1;
                  if (null != var15.field_g &&
                    var15.field_g[var16Lifetime1] != -1) {
                    stackIn_100_2 = this.field_F + var15.field_g[var16Lifetime1];
                  } else {
                    stackIn_100_2 = -1;
                  }
                  stackIn_99_0[stackIn_99_1] = (byte)stackIn_100_2;
                }
              }
              for (var16Lifetime1Lifetime1 = 0; var15.field_F > var16Lifetime1Lifetime1; var16Lifetime1Lifetime1++) {
                dupTemp$0 = var15.field_u[var16Lifetime1Lifetime1];
                this.field_u[this.field_F] = dupTemp$0;
                var17Lifetime1 = dupTemp$0;
                if (var17Lifetime1 == 0) {
                  this.field_s[this.field_F] = (short)this.a((int) var15.field_s[var16Lifetime1Lifetime1], (short) var14, var15, 1);
                  this.field_q[this.field_F] = (short)this.a((int) var15.field_q[var16Lifetime1Lifetime1], (short) var14, var15, 1);
                  this.field_K[this.field_F] = (short)this.a((int) var15.field_K[var16Lifetime1Lifetime1], (short) var14, var15, 1);
                }
                if (var17Lifetime1 >= 1 &&
                  var17Lifetime1 <= 3) {
                  this.field_s[this.field_F] = var15.field_s[var16Lifetime1Lifetime1];
                  this.field_q[this.field_F] = var15.field_q[var16Lifetime1Lifetime1];
                  this.field_K[this.field_F] = var15.field_K[var16Lifetime1Lifetime1];
                  this.field_j[this.field_F] = var15.field_j[var16Lifetime1Lifetime1];
                  this.field_f[this.field_F] = var15.field_f[var16Lifetime1Lifetime1];
                  this.field_x[this.field_F] = var15.field_x[var16Lifetime1Lifetime1];
                  this.field_i[this.field_F] = var15.field_i[var16Lifetime1Lifetime1];
                  this.field_z[this.field_F] = var15.field_z[var16Lifetime1Lifetime1];
                  this.field_d[this.field_F] = var15.field_d[var16Lifetime1Lifetime1];
                }
                if (var17Lifetime1 == 2) {
                  this.field_v[this.field_F] = var15.field_v[var16Lifetime1Lifetime1];
                  this.field_c[this.field_F] = var15.field_c[var16Lifetime1Lifetime1];
                }
                this.field_F = this.field_F + 1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_116_0 = var3;
          stackIn_116_1 = new StringBuilder().append("oc.<init>(");
          if (param0 == null) {
            stackIn_117_2 = "null";
          } else {
            stackIn_117_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_116_0), ((StringBuilder) (Object) stackIn_116_1).append(stackIn_117_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_H = new su(15, 0, 1, 0);
    }
}
