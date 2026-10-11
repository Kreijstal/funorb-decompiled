/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends on {
    short[] field_U;
    oh[] field_I;
    short[] field_p;
    private static int field_N;
    private int[][] field_O;
    byte[] field_G;
    private byte[] field_K;
    private int[] field_J;
    short[] field_g;
    private short[] field_o;
    ea[] field_u;
    int[] field_S;
    private byte[] field_l;
    int[] field_q;
    oh[] field_r;
    int[] field_i;
    byte[] field_n;
    int[] field_h;
    byte[] field_y;
    private short[] field_H;
    int[] field_s;
    short[] field_T;
    int field_Q;
    int field_j;
    short[] field_M;
    private static int field_A;
    private byte[] field_L;
    private static int[] field_E;
    private byte[] field_m;
    int field_R;
    private byte[] field_B;
    int[] field_v;
    private int[][] field_x;
    private short[] field_w;
    int field_t;
    private static int field_F;
    private int[] field_k;
    byte[] field_C;
    private static int[] field_D;
    byte[] field_z;

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < this.field_j; var5++) {
          this.field_v[var5] = this.field_v[var5] * param0 / param3;
          this.field_s[var5] = this.field_s[var5] * param1 / param3;
          this.field_h[var5] = this.field_h[var5] * param2 / param3;
        }
        this.e();
    }

    final int b(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        int var6;
        int var7;
        var2 = 0;
        for (var3 = 0; var3 < this.field_j; var3++) {
          var4 = this.field_v[var3];
          var5 = this.field_s[var3];
          var6 = this.field_h[var3];
          var7 = var4 * var4 + var6 * var6 + var5 * var5;
          if (var7 > var2) {
            var2 = var7;
          }
        }
        var2 = (int)(Math.sqrt((double)var2) + 0.99);
        this.a(param0, param0, param0, var2);
        return var2;
    }

    final wj a(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        return this.a(param0, param1, param2 * param5[3] + param3 * param5[4] + param4 * param5[5] >> 16, param2 * param5[6] + param3 * param5[7] + param4 * param5[8] >> 16, param2 * param5[9] + param3 * param5[10] + param4 * param5[11] >> 16);
    }

    final static od a(mi param0, String param1, String param2) {
        byte[] var3 = param0.a(81, param1, param2);
        if (var3 == null) {
          return null;
        }
        return new od(var3);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < this.field_j; var4++) {
          this.field_v[var4] = this.field_v[var4] * param0 / 128;
          this.field_s[var4] = this.field_s[var4] * param1 / 128;
          this.field_h[var4] = this.field_h[var4] * param2 / 128;
        }
        this.e();
    }

    private final void e() {
        this.field_I = null;
        this.field_r = null;
        this.field_u = null;
    }

    public static void c() {
        field_E = null;
        field_D = null;
    }

    private final void a(byte[] param0) {
        byte dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        kg var2;
        kg var3;
        kg var4;
        kg var5;
        kg var6;
        kg var7;
        kg var8;
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
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        int var43;
        int var44;
        int var45;
        int var46;
        int var47;
        int var48;
        int var49;
        int var50;
        int var51;
        int var52;
        int var53;
        int var54;
        int var55;
        int var56;
        int var57;
        int var58;
        int var59;
        int var28Lifetime1;
        int var29Lifetime1;
        int var53Lifetime1;
        int var53Lifetime2;
        int var54Lifetime1;
        int var55Lifetime1;
        int var56Lifetime1;
        int var57Lifetime1;
        int var57Lifetime2;
        int var57Lifetime3;
        int var58Lifetime1;
        int var58Lifetime2;
        var2 = new kg(param0);
        var3 = new kg(param0);
        var4 = new kg(param0);
        var5 = new kg(param0);
        var6 = new kg(param0);
        var7 = new kg(param0);
        var8 = new kg(param0);
        var2.field_n = param0.length - 23;
        var9 = var2.a((byte) 25);
        var10 = var2.a((byte) 25);
        var11 = var2.c(32);
        var12 = var2.c(32);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.c(32);
        var16 = var2.c(32);
        var17 = var2.c(32);
        var18 = var2.c(32);
        var19 = var2.c(32);
        var20 = var2.a((byte) 25);
        var21 = var2.a((byte) 25);
        var22 = var2.a((byte) 25);
        var23 = var2.a((byte) 25);
        var24 = var2.a((byte) 25);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_z = new byte[var11];
          var2.field_n = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.b(true);
            this.field_z[var28] = dupTemp$0;
            var29 = dupTemp$0;
            if (var29 == 0) {
              var25++;
            }
            if (var29 >= 1 &&
              var29 <= 3) {
              var26++;
            }
            if (var29 == 2) {
              var27++;
            }
          }
        }
        var28Lifetime1 = var11;
        var29Lifetime1 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var9;
        var30 = var28Lifetime1;
        if (var13 != 0) {
          var28Lifetime1 = var28Lifetime1 + var10;
        }
        var31 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var10;
        var32 = var28Lifetime1;
        if (var15 == 255) {
          var28Lifetime1 = var28Lifetime1 + var10;
        }
        var33 = var28Lifetime1;
        if (var17 == 1) {
          var28Lifetime1 = var28Lifetime1 + var10;
        }
        var34 = var28Lifetime1;
        if (var19 == 1) {
          var28Lifetime1 = var28Lifetime1 + var9;
        }
        var35 = var28Lifetime1;
        if (var16 == 1) {
          var28Lifetime1 = var28Lifetime1 + var10;
        }
        var36 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var23;
        var37 = var28Lifetime1;
        if (var18 == 1) {
          var28Lifetime1 = var28Lifetime1 + var10 * 2;
        }
        var38 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var24;
        var39 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var10 * 2;
        var40 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var20;
        var41 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var21;
        var42 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var22;
        var43 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var25 * 6;
        var44 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var26 * 6;
        var45 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var26 * 6;
        var46 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var26;
        var47 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var26;
        var48 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + (var26 + var27 * 2);
        var49 = var28Lifetime1;
        this.field_j = var9;
        this.field_t = var10;
        this.field_Q = var11;
        this.field_v = new int[var9];
        this.field_s = new int[var9];
        this.field_h = new int[var9];
        this.field_S = new int[var10];
        this.field_q = new int[var10];
        this.field_i = new int[var10];
        if (var19 == 1) {
          this.field_k = new int[var9];
        }
        if (var13 != 0) {
          this.field_C = new byte[var10];
        }
        if (var15 == 255) {
          this.field_G = new byte[var10];
        }
        if (var16 == 1) {
          this.field_n = new byte[var10];
        }
        if (var17 == 1) {
          this.field_J = new int[var10];
        }
        if (var18 == 1) {
          this.field_p = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_y = new byte[var10];
        }
        this.field_M = new short[var10];
        if (var11 > 0) {
          this.field_g = new short[var11];
          this.field_U = new short[var11];
          this.field_T = new short[var11];
          if (var26 > 0) {
            this.field_o = new short[var26];
            this.field_w = new short[var26];
            this.field_H = new short[var26];
            this.field_B = new byte[var26];
            this.field_m = new byte[var26];
            this.field_l = new byte[var26];
          }
          if (var27 > 0) {
            this.field_K = new byte[var27];
            this.field_L = new byte[var27];
          }
        }
        var2.field_n = var29Lifetime1;
        var3.field_n = var40;
        var4.field_n = var41;
        var5.field_n = var42;
        var6.field_n = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        for (var53 = 0; var53 < var9; var53++) {
          var54 = var2.c(32);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.b(1647);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.b(1647);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.b(1647);
          }
          this.field_v[var53] = var50 + var55;
          this.field_s[var53] = var51 + var56;
          this.field_h[var53] = var52 + var57;
          var50 = this.field_v[var53];
          var51 = this.field_s[var53];
          var52 = this.field_h[var53];
          if (var19 == 1) {
            this.field_k[var53] = var6.c(32);
          }
        }
        var2.field_n = var39;
        var3.field_n = var30;
        var4.field_n = var32;
        var5.field_n = var35;
        var6.field_n = var33;
        var7.field_n = var37;
        var8.field_n = var38;
        for (var53Lifetime1 = 0; var53Lifetime1 < var10; var53Lifetime1++) {
          this.field_M[var53Lifetime1] = (short)var2.a((byte) 25);
          if (var13 != 0) {
            this.field_C[var53Lifetime1] = var3.b(true);
          }
          if (var15 == 255) {
            this.field_G[var53Lifetime1] = var4.b(true);
          }
          if (var16 == 1) {
            this.field_n[var53Lifetime1] = var5.b(true);
          }
          if (var17 == 1) {
            this.field_J[var53Lifetime1] = var6.c(32);
          }
          if (var18 == 1) {
            this.field_p[var53Lifetime1] = (short)(var7.a((byte) 25) - 1);
          }
          if (this.field_y != null) {
            if (this.field_p[var53Lifetime1] == -1) {
              this.field_y[var53Lifetime1] = (byte)-1;
            } else {
              this.field_y[var53Lifetime1] = (byte)(var8.c(32) - 1);
            }
          }
        }
        this.field_R = -1;
        var2.field_n = var36;
        var3.field_n = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.c(32);
          if (var58 == 1) {
            var53Lifetime2 = var2.b(1647) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.b(1647) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.b(1647) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_S[var57Lifetime1] = var53Lifetime2;
            this.field_q[var57Lifetime1] = var54Lifetime1;
            this.field_i[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.field_R) {
              this.field_R = var53Lifetime2;
            }
            if (var54Lifetime1 > this.field_R) {
              this.field_R = var54Lifetime1;
            }
            if (var55Lifetime1 > this.field_R) {
              this.field_R = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.b(1647) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_S[var57Lifetime1] = var53Lifetime2;
            this.field_q[var57Lifetime1] = var54Lifetime1;
            this.field_i[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_R) {
              this.field_R = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.b(1647) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_S[var57Lifetime1] = var53Lifetime2;
            this.field_q[var57Lifetime1] = var54Lifetime1;
            this.field_i[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_R) {
              this.field_R = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.b(1647) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_S[var57Lifetime1] = var53Lifetime2;
            this.field_q[var57Lifetime1] = var54Lifetime1;
            this.field_i[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_R) {
              this.field_R = var55Lifetime1;
            }
          }
        }
        this.field_R = this.field_R + 1;
        var2.field_n = var43;
        var3.field_n = var44;
        var4.field_n = var45;
        var5.field_n = var46;
        var6.field_n = var47;
        var7.field_n = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_z[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_g[var57Lifetime2] = (short)var2.a((byte) 25);
            this.field_U[var57Lifetime2] = (short)var2.a((byte) 25);
            this.field_T[var57Lifetime2] = (short)var2.a((byte) 25);
          }
          if (var58Lifetime1 == 1) {
            this.field_g[var57Lifetime2] = (short)var3.a((byte) 25);
            this.field_U[var57Lifetime2] = (short)var3.a((byte) 25);
            this.field_T[var57Lifetime2] = (short)var3.a((byte) 25);
            this.field_o[var57Lifetime2] = (short)var4.a((byte) 25);
            this.field_w[var57Lifetime2] = (short)var4.a((byte) 25);
            this.field_H[var57Lifetime2] = (short)var4.a((byte) 25);
            this.field_B[var57Lifetime2] = var5.b(true);
            this.field_m[var57Lifetime2] = var6.b(true);
            this.field_l[var57Lifetime2] = var7.b(true);
          }
          if (var58Lifetime1 == 2) {
            this.field_g[var57Lifetime2] = (short)var3.a((byte) 25);
            this.field_U[var57Lifetime2] = (short)var3.a((byte) 25);
            this.field_T[var57Lifetime2] = (short)var3.a((byte) 25);
            this.field_o[var57Lifetime2] = (short)var4.a((byte) 25);
            this.field_w[var57Lifetime2] = (short)var4.a((byte) 25);
            this.field_H[var57Lifetime2] = (short)var4.a((byte) 25);
            this.field_B[var57Lifetime2] = var5.b(true);
            this.field_m[var57Lifetime2] = var6.b(true);
            this.field_l[var57Lifetime2] = var7.b(true);
            this.field_K[var57Lifetime2] = var7.b(true);
            this.field_L[var57Lifetime2] = var7.b(true);
          }
          if (var58Lifetime1 == 3) {
            this.field_g[var57Lifetime2] = (short)var3.a((byte) 25);
            this.field_U[var57Lifetime2] = (short)var3.a((byte) 25);
            this.field_T[var57Lifetime2] = (short)var3.a((byte) 25);
            this.field_o[var57Lifetime2] = (short)var4.a((byte) 25);
            this.field_w[var57Lifetime2] = (short)var4.a((byte) 25);
            this.field_H[var57Lifetime2] = (short)var4.a((byte) 25);
            this.field_B[var57Lifetime2] = var5.b(true);
            this.field_m[var57Lifetime2] = var6.b(true);
            this.field_l[var57Lifetime2] = var7.b(true);
          }
        }
        if (var14 != 0) {
          var2.field_n = var49;
          var57Lifetime3 = var2.c(32);
          if (var57Lifetime3 > 0) {
            var2.field_n = var2.field_n + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.c(32);
          if (var58Lifetime2 > 0) {
            var2.field_n = var2.field_n + 4 * var58Lifetime2;
          }
        }
    }

    final wj a(int param0, int param1, int param2, int param3, int param4) {
        return (wj) ((Object) new sk(this, param0, param1, param2, param3, param4));
    }

    final void b() {
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$5 = null;
        int dupTemp$3 = 0;
        int[] arrayValue$4 = null;
        int var2;
        int var3;
        int var4;
        int[] var5;
        int[] var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime1Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        if (this.field_k != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_j; var3++) {
            var4 = this.field_k[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_O = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_O[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_j; var3++) {
            var4Lifetime2 = this.field_k[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_O[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_k = null;
        }
        if (this.field_J != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_t; var3Lifetime1++) {
            var4Lifetime1 = this.field_J[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_x = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_x[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_t; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_J[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_x[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_J = null;
        }
    }

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_j; var1++) {
          this.field_v[var1] = -this.field_v[var1];
          this.field_h[var1] = -this.field_h[var1];
        }
        this.e();
    }

    final void a(sg param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        this.b();
        if (this.field_O == null) {
          return;
        }
        if (param1 == -1) {
          return;
        }
        cm var3 = param0.field_t[param1];
        ij var4 = var3.field_g;
        field_F = 0;
        field_N = 0;
        field_A = 0;
        for (var5 = 0; var5 < var3.field_k; var5++) {
          var6 = var3.field_i[var5];
          if (var3.field_n[var5] != -1) {
            this.a(0, var4.field_w[var3.field_n[var5]], 0, 0, 0);
          }
          this.a(var4.field_n[var6], var4.field_w[var6], (int) var3.field_c[var5], (int) var3.field_a[var5], (int) var3.field_l[var5]);
        }
        this.e();
    }

    final void d() {
        ea dupTemp$0 = null;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        ea var16;
        oh var17;
        oh var18;
        oh var19;
        int var1Lifetime1;
        if (this.field_I != null) {
          return;
        }
        this.field_I = new oh[this.field_R];
        for (var1 = 0; var1 < this.field_R; var1++) {
          this.field_I[var1] = new oh();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_t) {
            return;
          }
          var2 = this.field_S[var1Lifetime1];
          var3 = this.field_q[var1Lifetime1];
          var4 = this.field_i[var1Lifetime1];
          var5 = this.field_v[var3] - this.field_v[var2];
          var6 = this.field_s[var3] - this.field_s[var2];
          var7 = this.field_h[var3] - this.field_h[var2];
          var8 = this.field_v[var4] - this.field_v[var2];
          var9 = this.field_s[var4] - this.field_s[var2];
          var10 = this.field_h[var4] - this.field_h[var2];
          var11 = var6 * var10 - var9 * var7;
          var12 = var7 * var8 - var10 * var5;
          var13 = var5 * var9 - var8 * var6;
          while (true) {
            if (var11 <= 8192 &&
              var12 <= 8192 &&
              var13 <= 8192 &&
              var11 >= -8192 &&
              var12 >= -8192 &&
              var13 >= -8192) {
              var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
              if (var14 <= 0) {
                var14 = 1;
              }
              var11 = var11 * 256 / var14;
              var12 = var12 * 256 / var14;
              var13 = var13 * 256 / var14;
              if (this.field_C != null) {
                var15 = this.field_C[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_u == null) {
                    this.field_u = new ea[this.field_t];
                  }
                  dupTemp$0 = new ea();
                  this.field_u[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_d = var11;
                  var16.field_c = var12;
                  var16.field_b = var13;
                }
              } else {
                var17 = this.field_I[var2];
                var17.field_b = var17.field_b + var11;
                var17.field_c = var17.field_c + var12;
                var17.field_f = var17.field_f + var13;
                var17.field_g = var17.field_g + 1;
                var18 = this.field_I[var3];
                var18.field_b = var18.field_b + var11;
                var18.field_c = var18.field_c + var12;
                var18.field_f = var18.field_f + var13;
                var18.field_g = var18.field_g + 1;
                var19 = this.field_I[var4];
                var19.field_b = var19.field_b + var11;
                var19.field_c = var19.field_c + var12;
                var19.field_f = var19.field_f + var13;
                var19.field_g = var19.field_g + 1;
              }
              var1Lifetime1++;
              break;
            }
            var11 = var11 >> 1;
            var12 = var12 >> 1;
            var13 = var13 >> 1;
          }
        }
    }

    private final void a(int param0, int[] param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[] var34;
        int[] var35;
        int[] var36;
        int[] var37;
        int[] var38;
        int[] var39;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var14Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime2;
        int var14Lifetime3;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        var6 = param1.length;
        if (param0 == 0) {
          var7 = 0;
          field_F = 0;
          field_N = 0;
          field_A = 0;
          for (var8 = 0; var8 < var6; var8++) {
            var9 = param1[var8];
            if (var9 < this.field_O.length) {
              var34 = this.field_O[var9];
              for (var11 = 0; var11 < var34.length; var11++) {
                var12 = var34[var11];
                field_F = field_F + this.field_v[var12];
                field_N = field_N + this.field_s[var12];
                field_A = field_A + this.field_h[var12];
                var7++;
              }
            }
          }
          if (var7 <= 0) {
            field_F = param2;
            field_N = param3;
            field_A = param4;
          } else {
            field_F = field_F / var7 + param2;
            field_N = field_N / var7 + param3;
            field_A = field_A / var7 + param4;
          }
          return;
        }
        if (param0 == 1) {
          for (var7Lifetime1 = 0; var7Lifetime1 < var6; var7Lifetime1++) {
            var8Lifetime1 = param1[var7Lifetime1];
            if (var8Lifetime1 < this.field_O.length) {
              var35 = this.field_O[var8Lifetime1];
              for (var10 = 0; var10 < var35.length; var10++) {
                var11Lifetime1 = var35[var10];
                this.field_v[var11Lifetime1] = this.field_v[var11Lifetime1] + param2;
                this.field_s[var11Lifetime1] = this.field_s[var11Lifetime1] + param3;
                this.field_h[var11Lifetime1] = this.field_h[var11Lifetime1] + param4;
              }
            }
          }
          return;
        }
        if (param0 == 2) {
          for (var7Lifetime2 = 0; var7Lifetime2 < var6; var7Lifetime2++) {
            var8Lifetime2 = param1[var7Lifetime2];
            if (var8Lifetime2 < this.field_O.length) {
              var36 = this.field_O[var8Lifetime2];
              for (var10Lifetime1 = 0; var10Lifetime1 < var36.length; var10Lifetime1++) {
                var11Lifetime2 = var36[var10Lifetime1];
                this.field_v[var11Lifetime2] = this.field_v[var11Lifetime2] - field_F;
                this.field_s[var11Lifetime2] = this.field_s[var11Lifetime2] - field_N;
                this.field_h[var11Lifetime2] = this.field_h[var11Lifetime2] - field_A;
                if (param4 != 0) {
                  var12Lifetime1 = field_E[param4];
                  var13 = field_D[param4];
                  var14 = this.field_s[var11Lifetime2] * var12Lifetime1 + this.field_v[var11Lifetime2] * var13 >> 16;
                  this.field_s[var11Lifetime2] = this.field_s[var11Lifetime2] * var13 - this.field_v[var11Lifetime2] * var12Lifetime1 >> 16;
                  this.field_v[var11Lifetime2] = var14;
                }
                if (param2 != 0) {
                  var12Lifetime1Lifetime1 = field_E[param2];
                  var13Lifetime2 = field_D[param2];
                  var14Lifetime2 = this.field_s[var11Lifetime2] * var13Lifetime2 - this.field_h[var11Lifetime2] * var12Lifetime1Lifetime1 >> 16;
                  this.field_h[var11Lifetime2] = this.field_s[var11Lifetime2] * var12Lifetime1Lifetime1 + this.field_h[var11Lifetime2] * var13Lifetime2 >> 16;
                  this.field_s[var11Lifetime2] = var14Lifetime2;
                }
                if (param3 != 0) {
                  var12Lifetime1Lifetime2 = field_E[param3];
                  var13Lifetime3 = field_D[param3];
                  var14Lifetime3 = this.field_h[var11Lifetime2] * var12Lifetime1Lifetime2 + this.field_v[var11Lifetime2] * var13Lifetime3 >> 16;
                  this.field_h[var11Lifetime2] = this.field_h[var11Lifetime2] * var13Lifetime3 - this.field_v[var11Lifetime2] * var12Lifetime1Lifetime2 >> 16;
                  this.field_v[var11Lifetime2] = var14Lifetime3;
                }
                this.field_v[var11Lifetime2] = this.field_v[var11Lifetime2] + field_F;
                this.field_s[var11Lifetime2] = this.field_s[var11Lifetime2] + field_N;
                this.field_h[var11Lifetime2] = this.field_h[var11Lifetime2] + field_A;
              }
            }
          }
          return;
        }
        if (param0 == 3) {
          for (var7Lifetime3 = 0; var7Lifetime3 < var6; var7Lifetime3++) {
            var8Lifetime3 = param1[var7Lifetime3];
            if (var8Lifetime3 < this.field_O.length) {
              var37 = this.field_O[var8Lifetime3];
              for (var10Lifetime2 = 0; var10Lifetime2 < var37.length; var10Lifetime2++) {
                var11Lifetime3 = var37[var10Lifetime2];
                this.field_v[var11Lifetime3] = this.field_v[var11Lifetime3] - field_F;
                this.field_s[var11Lifetime3] = this.field_s[var11Lifetime3] - field_N;
                this.field_h[var11Lifetime3] = this.field_h[var11Lifetime3] - field_A;
                this.field_v[var11Lifetime3] = this.field_v[var11Lifetime3] * param2 / 128;
                this.field_s[var11Lifetime3] = this.field_s[var11Lifetime3] * param3 / 128;
                this.field_h[var11Lifetime3] = this.field_h[var11Lifetime3] * param4 / 128;
                this.field_v[var11Lifetime3] = this.field_v[var11Lifetime3] + field_F;
                this.field_s[var11Lifetime3] = this.field_s[var11Lifetime3] + field_N;
                this.field_h[var11Lifetime3] = this.field_h[var11Lifetime3] + field_A;
              }
            }
          }
          return;
        }
        if (param0 == 5) {
          if (this.field_x != null &&
            this.field_n != null) {
            for (var7Lifetime4 = 0; var7Lifetime4 < var6; var7Lifetime4++) {
              var8Lifetime4 = param1[var7Lifetime4];
              if (var8Lifetime4 < this.field_x.length) {
                var38 = this.field_x[var8Lifetime4];
                for (var10Lifetime3 = 0; var10Lifetime3 < var38.length; var10Lifetime3++) {
                  var11Lifetime4 = var38[var10Lifetime3];
                  var12Lifetime2 = (this.field_n[var11Lifetime4] & 255) + param2 * 8;
                  if (var12Lifetime2 >= 0) {
                    if (var12Lifetime2 > 255) {
                      var12Lifetime2 = 255;
                    }
                  } else {
                    var12Lifetime2 = 0;
                  }
                  this.field_n[var11Lifetime4] = (byte)var12Lifetime2;
                }
              }
            }
            return;
          }
          return;
        }
        if (param0 != 7) {
          return;
        }
        if (this.field_x != null) {
          for (var7Lifetime5 = 0; var7Lifetime5 < var6; var7Lifetime5++) {
            var8Lifetime5 = param1[var7Lifetime5];
            if (var8Lifetime5 < this.field_x.length) {
              var39 = this.field_x[var8Lifetime5];
              for (var10Lifetime4 = 0; var10Lifetime4 < var39.length; var10Lifetime4++) {
                var11Lifetime5 = var39[var10Lifetime4];
                var12Lifetime3 = this.field_M[var11Lifetime5] & 65535;
                var13Lifetime1 = var12Lifetime3 >> 10 & 63;
                var14Lifetime1 = var12Lifetime3 >> 7 & 7;
                var15 = var12Lifetime3 & 127;
                var13Lifetime1 = var13Lifetime1 + param2 & 63;
                var14Lifetime1 = var14Lifetime1 + param3;
                if (var14Lifetime1 >= 0) {
                  if (var14Lifetime1 > 7) {
                    var14Lifetime1 = 7;
                  }
                } else {
                  var14Lifetime1 = 0;
                }
                var15 = var15 + param4;
                if (var15 >= 0) {
                  if (var15 > 127) {
                    var15 = 127;
                  }
                } else {
                  var15 = 0;
                }
                this.field_M[var11Lifetime5] = (short)(var13Lifetime1 << 10 | var14Lifetime1 << 7 | var15);
              }
            }
          }
        }
    }

    private od(byte[] param0) {
        this.field_R = 0;
        this.field_t = 0;
        this.field_j = 0;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.a(param0);
        } else {
          this.b(param0);
        }
    }

    od(od param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        this.field_R = 0;
        this.field_t = 0;
        this.field_j = 0;
        this.field_j = param0.field_j;
        this.field_R = param0.field_R;
        this.field_t = param0.field_t;
        this.field_Q = param0.field_Q;
        if (!param1) {
          this.field_v = new int[this.field_j];
          this.field_s = new int[this.field_j];
          this.field_h = new int[this.field_j];
          for (var6 = 0; var6 < this.field_j; var6++) {
            this.field_v[var6] = param0.field_v[var6];
            this.field_s[var6] = param0.field_s[var6];
            this.field_h[var6] = param0.field_h[var6];
          }
        } else {
          this.field_v = param0.field_v;
          this.field_s = param0.field_s;
          this.field_h = param0.field_h;
        }
        if (!param2) {
          this.field_M = new short[this.field_t];
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_t; var6Lifetime1++) {
            this.field_M[var6Lifetime1] = param0.field_M[var6Lifetime1];
          }
        } else {
          this.field_M = param0.field_M;
        }
        if (!param3 &&
          param0.field_p != null) {
          this.field_p = new short[this.field_t];
          for (var6Lifetime2 = 0; var6Lifetime2 < this.field_t; var6Lifetime2++) {
            this.field_p[var6Lifetime2] = param0.field_p[var6Lifetime2];
          }
        } else {
          this.field_p = param0.field_p;
        }
        if (!param4) {
          this.field_n = new byte[this.field_t];
          if (param0.field_n != null) {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_t; var6Lifetime3++) {
              this.field_n[var6Lifetime3] = param0.field_n[var6Lifetime3];
            }
          } else {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_t; var6Lifetime3++) {
              this.field_n[var6Lifetime3] = (byte) 0;
            }
          }
        } else {
          this.field_n = param0.field_n;
        }
        this.field_S = param0.field_S;
        this.field_q = param0.field_q;
        this.field_i = param0.field_i;
        this.field_C = param0.field_C;
        this.field_G = param0.field_G;
        this.field_y = param0.field_y;
        this.field_z = param0.field_z;
        this.field_g = param0.field_g;
        this.field_U = param0.field_U;
        this.field_T = param0.field_T;
        this.field_o = param0.field_o;
        this.field_w = param0.field_w;
        this.field_H = param0.field_H;
        this.field_B = param0.field_B;
        this.field_m = param0.field_m;
        this.field_l = param0.field_l;
        this.field_K = param0.field_K;
        this.field_L = param0.field_L;
        this.field_k = param0.field_k;
        this.field_J = param0.field_J;
        this.field_O = param0.field_O;
        this.field_x = param0.field_x;
        this.field_I = param0.field_I;
        this.field_u = param0.field_u;
        this.field_r = param0.field_r;
    }

    private final void b(byte[] param0) {
        int var2;
        int var3;
        kg var4;
        kg var5;
        kg var6;
        kg var7;
        kg var8;
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
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        int var43;
        int var44;
        int var45;
        int var38Lifetime1;
        int var38Lifetime2;
        int var39Lifetime1;
        int var39Lifetime2;
        int var40Lifetime1;
        int var41Lifetime1;
        int var42Lifetime1;
        int var42Lifetime2;
        int var42Lifetime3;
        int var43Lifetime1;
        int var44Lifetime1;
        var2 = 0;
        var3 = 0;
        var4 = new kg(param0);
        var5 = new kg(param0);
        var6 = new kg(param0);
        var7 = new kg(param0);
        var8 = new kg(param0);
        var4.field_n = param0.length - 18;
        var9 = var4.a((byte) 25);
        var10 = var4.a((byte) 25);
        var11 = var4.c(32);
        var12 = var4.c(32);
        var13 = var4.c(32);
        var14 = var4.c(32);
        var15 = var4.c(32);
        var16 = var4.c(32);
        var17 = var4.a((byte) 25);
        var18 = var4.a((byte) 25);
        var19 = var4.a((byte) 25);
        var20 = var4.a((byte) 25);
        var21 = 0;
        var22 = var21;
        var21 = var21 + var9;
        var23 = var21;
        var21 = var21 + var10;
        var24 = var21;
        if (var13 == 255) {
          var21 = var21 + var10;
        }
        var25 = var21;
        if (var15 == 1) {
          var21 = var21 + var10;
        }
        var26 = var21;
        if (var12 == 1) {
          var21 = var21 + var10;
        }
        var27 = var21;
        if (var16 == 1) {
          var21 = var21 + var9;
        }
        var28 = var21;
        if (var14 == 1) {
          var21 = var21 + var10;
        }
        var29 = var21;
        var21 = var21 + var20;
        var30 = var21;
        var21 = var21 + var10 * 2;
        var31 = var21;
        var21 = var21 + var11 * 6;
        var32 = var21;
        var21 = var21 + var17;
        var33 = var21;
        var21 = var21 + var18;
        var34 = var21;
        var21 = var21 + var19;
        this.field_j = var9;
        this.field_t = var10;
        this.field_Q = var11;
        this.field_v = new int[var9];
        this.field_s = new int[var9];
        this.field_h = new int[var9];
        this.field_S = new int[var10];
        this.field_q = new int[var10];
        this.field_i = new int[var10];
        if (var11 > 0) {
          this.field_z = new byte[var11];
          this.field_g = new short[var11];
          this.field_U = new short[var11];
          this.field_T = new short[var11];
        }
        if (var16 == 1) {
          this.field_k = new int[var9];
        }
        if (var12 == 1) {
          this.field_C = new byte[var10];
          this.field_y = new byte[var10];
          this.field_p = new short[var10];
        }
        if (var13 == 255) {
          this.field_G = new byte[var10];
        }
        if (var14 == 1) {
          this.field_n = new byte[var10];
        }
        if (var15 == 1) {
          this.field_J = new int[var10];
        }
        this.field_M = new short[var10];
        var4.field_n = var22;
        var5.field_n = var32;
        var6.field_n = var33;
        var7.field_n = var34;
        var8.field_n = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.c(32);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.b(1647);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.b(1647);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.b(1647);
          }
          this.field_v[var38] = var35 + var40;
          this.field_s[var38] = var36 + var41;
          this.field_h[var38] = var37 + var42;
          var35 = this.field_v[var38];
          var36 = this.field_s[var38];
          var37 = this.field_h[var38];
          if (var16 == 1) {
            this.field_k[var38] = var8.c(32);
          }
        }
        var4.field_n = var30;
        var5.field_n = var26;
        var6.field_n = var24;
        var7.field_n = var28;
        var8.field_n = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_M[var38Lifetime1] = (short)var4.a((byte) 25);
          if (var12 == 1) {
            var39Lifetime1 = var5.c(32);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_C[var38Lifetime1] = (byte) 0;
            } else {
              this.field_C[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_y[var38Lifetime1] = (byte)-1;
              this.field_p[var38Lifetime1] = (short)-1;
            } else {
              this.field_y[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_p[var38Lifetime1] = this.field_M[var38Lifetime1];
              this.field_M[var38Lifetime1] = (short)127;
              if (this.field_p[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_G[var38Lifetime1] = var6.b(true);
          }
          if (var14 == 1) {
            this.field_n[var38Lifetime1] = var7.b(true);
          }
          if (var15 == 1) {
            this.field_J[var38Lifetime1] = var8.c(32);
          }
        }
        this.field_R = -1;
        var4.field_n = var29;
        var5.field_n = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.c(32);
          if (var43 == 1) {
            var38Lifetime2 = var4.b(1647) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.b(1647) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.b(1647) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_S[var42Lifetime1] = var38Lifetime2;
            this.field_q[var42Lifetime1] = var39Lifetime2;
            this.field_i[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.field_R) {
              this.field_R = var38Lifetime2;
            }
            if (var39Lifetime2 > this.field_R) {
              this.field_R = var39Lifetime2;
            }
            if (var40Lifetime1 > this.field_R) {
              this.field_R = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.b(1647) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_S[var42Lifetime1] = var38Lifetime2;
            this.field_q[var42Lifetime1] = var39Lifetime2;
            this.field_i[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_R) {
              this.field_R = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.b(1647) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_S[var42Lifetime1] = var38Lifetime2;
            this.field_q[var42Lifetime1] = var39Lifetime2;
            this.field_i[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_R) {
              this.field_R = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.b(1647) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_S[var42Lifetime1] = var38Lifetime2;
            this.field_q[var42Lifetime1] = var39Lifetime2;
            this.field_i[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_R) {
              this.field_R = var40Lifetime1;
            }
          }
        }
        this.field_R = this.field_R + 1;
        var4.field_n = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_z[var42Lifetime2] = (byte) 0;
          this.field_g[var42Lifetime2] = (short)var4.a((byte) 25);
          this.field_U[var42Lifetime2] = (short)var4.a((byte) 25);
          this.field_T[var42Lifetime2] = (short)var4.a((byte) 25);
        }
        if (this.field_y != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_y[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_g[var44Lifetime1] & 65535) == this.field_S[var45] &&
                (this.field_U[var44Lifetime1] & 65535) == this.field_q[var45] &&
                (this.field_T[var44Lifetime1] & 65535) == this.field_i[var45]) {
                this.field_y[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_y = null;
          }
        }
        if (var3 == 0) {
          this.field_p = null;
        }
        if (var2 == 0) {
          this.field_C = null;
        }
    }

    static {
        field_D = ti.field_j;
        field_E = ti.field_m;
    }
}
