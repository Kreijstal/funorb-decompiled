/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn extends gf {
    private int[][] field_m;
    cb[] field_A;
    private byte[] field_k;
    private byte[] field_E;
    short[] field_x;
    byte[] field_Q;
    private short[] field_L;
    private byte field_t;
    int field_y;
    int[] field_O;
    private byte[] field_z;
    private short[] field_S;
    int[] field_v;
    int[] field_C;
    int[] field_P;
    int field_q;
    int[] field_N;
    short[] field_J;
    cb[] field_o;
    int field_R;
    short[] field_B;
    byte[] field_G;
    byte[] field_l;
    private byte[] field_u;
    private short[] field_s;
    private int[] field_r;
    private short[] field_H;
    private int[][] field_M;
    private byte[] field_i;
    int[] field_K;
    int field_h;
    byte[] field_w;
    byte[] field_D;
    private short[] field_F;
    short[] field_n;
    short[] field_j;
    private int[] field_I;
    fh[] field_p;

    final void d() {
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
        if (this.field_I != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_h; var3++) {
            var4 = this.field_I[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_M = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_M[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_h; var3++) {
            var4Lifetime2 = this.field_I[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_M[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_I = null;
        }
        if (this.field_r != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_y; var3Lifetime1++) {
            var4Lifetime1 = this.field_r[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_m = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_m[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_y; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_r[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_m[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_r = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < this.field_h; var5++) {
          this.field_K[var5] = this.field_K[var5] * param0 / param3;
          this.field_C[var5] = this.field_C[var5] * param1 / param3;
          this.field_v[var5] = this.field_v[var5] * param2 / param3;
        }
        this.a();
    }

    private final void a() {
        this.field_o = null;
        this.field_A = null;
        this.field_p = null;
    }

    final void c() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_h; var1++) {
          this.field_K[var1] = -this.field_K[var1];
          this.field_v[var1] = -this.field_v[var1];
        }
        this.a();
    }

    private final void a(byte[] param0) {
        int var2;
        int var3;
        p var4;
        p var5;
        p var6;
        p var7;
        p var8;
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
        var4 = new p(param0);
        var5 = new p(param0);
        var6 = new p(param0);
        var7 = new p(param0);
        var8 = new p(param0);
        var4.field_l = param0.length - 18;
        var9 = var4.f(674914976);
        var10 = var4.f(674914976);
        var11 = var4.i(-96);
        var12 = var4.i(-102);
        var13 = var4.i(-97);
        var14 = var4.i(-81);
        var15 = var4.i(-121);
        var16 = var4.i(-100);
        var17 = var4.f(674914976);
        var18 = var4.f(674914976);
        var19 = var4.f(674914976);
        var20 = var4.f(674914976);
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
        this.field_h = var9;
        this.field_y = var10;
        this.field_R = var11;
        this.field_K = new int[var9];
        this.field_C = new int[var9];
        this.field_v = new int[var9];
        this.field_P = new int[var10];
        this.field_O = new int[var10];
        this.field_N = new int[var10];
        if (var11 > 0) {
          this.field_l = new byte[var11];
          this.field_J = new short[var11];
          this.field_n = new short[var11];
          this.field_x = new short[var11];
        }
        if (var16 == 1) {
          this.field_I = new int[var9];
        }
        if (var12 == 1) {
          this.field_G = new byte[var10];
          this.field_Q = new byte[var10];
          this.field_B = new short[var10];
        }
        if (var13 != 255) {
          this.field_t = (byte)var13;
        } else {
          this.field_w = new byte[var10];
        }
        if (var14 == 1) {
          this.field_D = new byte[var10];
        }
        if (var15 == 1) {
          this.field_r = new int[var10];
        }
        this.field_j = new short[var10];
        var4.field_l = var22;
        var5.field_l = var32;
        var6.field_l = var33;
        var7.field_l = var34;
        var8.field_l = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.i(-79);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.a(false);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.a(false);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.a(false);
          }
          this.field_K[var38] = var35 + var40;
          this.field_C[var38] = var36 + var41;
          this.field_v[var38] = var37 + var42;
          var35 = this.field_K[var38];
          var36 = this.field_C[var38];
          var37 = this.field_v[var38];
          if (var16 == 1) {
            this.field_I[var38] = var8.i(-104);
          }
        }
        var4.field_l = var30;
        var5.field_l = var26;
        var6.field_l = var24;
        var7.field_l = var28;
        var8.field_l = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_j[var38Lifetime1] = (short)var4.f(674914976);
          if (var12 == 1) {
            var39Lifetime1 = var5.i(-119);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_G[var38Lifetime1] = (byte) 0;
            } else {
              this.field_G[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_Q[var38Lifetime1] = (byte)-1;
              this.field_B[var38Lifetime1] = (short)-1;
            } else {
              this.field_Q[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_B[var38Lifetime1] = this.field_j[var38Lifetime1];
              this.field_j[var38Lifetime1] = (short)127;
              if (this.field_B[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_w[var38Lifetime1] = var6.g(0);
          }
          if (var14 == 1) {
            this.field_D[var38Lifetime1] = var7.g(0);
          }
          if (var15 == 1) {
            this.field_r[var38Lifetime1] = var8.i(-110);
          }
        }
        this.field_q = -1;
        var4.field_l = var29;
        var5.field_l = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.i(-99);
          if (var43 == 1) {
            var38Lifetime2 = var4.a(false) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.a(false) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.a(false) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_P[var42Lifetime1] = var38Lifetime2;
            this.field_O[var42Lifetime1] = var39Lifetime2;
            this.field_N[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.field_q) {
              this.field_q = var38Lifetime2;
            }
            if (var39Lifetime2 > this.field_q) {
              this.field_q = var39Lifetime2;
            }
            if (var40Lifetime1 > this.field_q) {
              this.field_q = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.a(false) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_P[var42Lifetime1] = var38Lifetime2;
            this.field_O[var42Lifetime1] = var39Lifetime2;
            this.field_N[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_q) {
              this.field_q = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.a(false) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_P[var42Lifetime1] = var38Lifetime2;
            this.field_O[var42Lifetime1] = var39Lifetime2;
            this.field_N[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_q) {
              this.field_q = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.a(false) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_P[var42Lifetime1] = var38Lifetime2;
            this.field_O[var42Lifetime1] = var39Lifetime2;
            this.field_N[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_q) {
              this.field_q = var40Lifetime1;
            }
          }
        }
        this.field_q = this.field_q + 1;
        var4.field_l = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_l[var42Lifetime2] = (byte) 0;
          this.field_J[var42Lifetime2] = (short)var4.f(674914976);
          this.field_n[var42Lifetime2] = (short)var4.f(674914976);
          this.field_x[var42Lifetime2] = (short)var4.f(674914976);
        }
        if (this.field_Q != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_Q[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_J[var44Lifetime1] & 65535) == this.field_P[var45] &&
                (this.field_n[var44Lifetime1] & 65535) == this.field_O[var45] &&
                (this.field_x[var44Lifetime1] & 65535) == this.field_N[var45]) {
                this.field_Q[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_Q = null;
          }
        }
        if (var3 == 0) {
          this.field_B = null;
        }
        if (var2 == 0) {
          this.field_G = null;
        }
    }

    private final int a(bn param0, int param1, short param2) {
        int var7 = 0;
        int var4;
        int var5;
        int var6;
        var4 = param0.field_K[param1];
        var5 = param0.field_C[param1];
        var6 = param0.field_v[param1];
        for (var7 = 0; var7 < this.field_h; var7++) {
          if (var4 == this.field_K[var7] &&
            var5 == this.field_C[var7] &&
            var6 == this.field_v[var7]) {
            this.field_L[var7] = (short)(this.field_L[var7] | param2);
            return var7;
          }
        }
        this.field_K[this.field_h] = var4;
        this.field_C[this.field_h] = var5;
        this.field_v[this.field_h] = var6;
        this.field_L[this.field_h] = (short)param2;
        if (param0.field_I != null) {
          this.field_I[this.field_h] = param0.field_I[param1];
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return fieldTemp$0;
    }

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = 0; var2 < this.field_h; var2++) {
          var3 = this.field_K[var2];
          var4 = this.field_C[var2];
          var5 = this.field_v[var2];
          this.field_K[var2] = param0[0] + (var3 * param0[3] + var4 * param0[6] + var5 * param0[9] >> 16);
          this.field_C[var2] = param0[1] + (var3 * param0[4] + var4 * param0[7] + var5 * param0[10] >> 16);
          this.field_v[var2] = param0[2] + (var3 * param0[5] + var4 * param0[8] + var5 * param0[11] >> 16);
        }
        this.a();
    }

    final static bn a(um param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, 30045, param2);
        if (var3 == null) {
          return null;
        }
        return new bn(var3);
    }

    final kk a(int param0, int param1, int param2, int param3, int param4) {
        return (kk) ((Object) new dd(this, param0, param1, param2, param3, param4));
    }

    final void b() {
        fh dupTemp$0 = null;
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
        fh var16;
        cb var17;
        cb var18;
        cb var19;
        int var1Lifetime1;
        if (this.field_o != null) {
          return;
        }
        this.field_o = new cb[this.field_q];
        for (var1 = 0; var1 < this.field_q; var1++) {
          this.field_o[var1] = new cb();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_y) {
            return;
          }
          var2 = this.field_P[var1Lifetime1];
          var3 = this.field_O[var1Lifetime1];
          var4 = this.field_N[var1Lifetime1];
          var5 = this.field_K[var3] - this.field_K[var2];
          var6 = this.field_C[var3] - this.field_C[var2];
          var7 = this.field_v[var3] - this.field_v[var2];
          var8 = this.field_K[var4] - this.field_K[var2];
          var9 = this.field_C[var4] - this.field_C[var2];
          var10 = this.field_v[var4] - this.field_v[var2];
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
              if (this.field_G != null) {
                var15 = this.field_G[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_p == null) {
                    this.field_p = new fh[this.field_y];
                  }
                  dupTemp$0 = new fh();
                  this.field_p[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_f = var11;
                  var16.field_a = var12;
                  var16.field_c = var13;
                }
              } else {
                var17 = this.field_o[var2];
                var17.field_j = var17.field_j + var11;
                var17.field_d = var17.field_d + var12;
                var17.field_i = var17.field_i + var13;
                var17.field_g = var17.field_g + 1;
                var18 = this.field_o[var3];
                var18.field_j = var18.field_j + var11;
                var18.field_d = var18.field_d + var12;
                var18.field_i = var18.field_i + var13;
                var18.field_g = var18.field_g + 1;
                var19 = this.field_o[var4];
                var19.field_j = var19.field_j + var11;
                var19.field_d = var19.field_d + var12;
                var19.field_i = var19.field_i + var13;
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

    final int a(int param0, int param1, int param2, byte param3, byte param4, short param5, short param6) {
        this.field_P[this.field_y] = param0;
        this.field_O[this.field_y] = param1;
        this.field_N[this.field_y] = param2;
        this.field_G[this.field_y] = (byte)param3;
        this.field_Q[this.field_y] = (byte)param4;
        this.field_j[this.field_y] = (short)param5;
        this.field_B[this.field_y] = (short)param6;
        int fieldTemp$0 = this.field_y;
        this.field_y = this.field_y + 1;
        return fieldTemp$0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < this.field_h; var4++) {
          if (this.field_K[var4] == param0 &&
            this.field_C[var4] == param1 &&
            this.field_v[var4] == param2) {
            return var4;
          }
        }
        this.field_K[this.field_h] = param0;
        this.field_C[this.field_h] = param1;
        this.field_v[this.field_h] = param2;
        int fieldTemp$0 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_q = fieldTemp$0;
        return this.field_h - 1;
    }

    private final void b(byte[] param0) {
        byte dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        p var2;
        p var3;
        p var4;
        p var5;
        p var6;
        p var7;
        p var8;
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
        var2 = new p(param0);
        var3 = new p(param0);
        var4 = new p(param0);
        var5 = new p(param0);
        var6 = new p(param0);
        var7 = new p(param0);
        var8 = new p(param0);
        var2.field_l = param0.length - 23;
        var9 = var2.f(674914976);
        var10 = var2.f(674914976);
        var11 = var2.i(-77);
        var12 = var2.i(-87);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.i(-82);
        var16 = var2.i(-123);
        var17 = var2.i(-109);
        var18 = var2.i(-90);
        var19 = var2.i(-92);
        var20 = var2.f(674914976);
        var21 = var2.f(674914976);
        var22 = var2.f(674914976);
        var23 = var2.f(674914976);
        var24 = var2.f(674914976);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_l = new byte[var11];
          var2.field_l = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.g(0);
            this.field_l[var28] = dupTemp$0;
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
        this.field_h = var9;
        this.field_y = var10;
        this.field_R = var11;
        this.field_K = new int[var9];
        this.field_C = new int[var9];
        this.field_v = new int[var9];
        this.field_P = new int[var10];
        this.field_O = new int[var10];
        this.field_N = new int[var10];
        if (var19 == 1) {
          this.field_I = new int[var9];
        }
        if (var13 != 0) {
          this.field_G = new byte[var10];
        }
        if (var15 != 255) {
          this.field_t = (byte)var15;
        } else {
          this.field_w = new byte[var10];
        }
        if (var16 == 1) {
          this.field_D = new byte[var10];
        }
        if (var17 == 1) {
          this.field_r = new int[var10];
        }
        if (var18 == 1) {
          this.field_B = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_Q = new byte[var10];
        }
        this.field_j = new short[var10];
        if (var11 > 0) {
          this.field_J = new short[var11];
          this.field_n = new short[var11];
          this.field_x = new short[var11];
          if (var26 > 0) {
            this.field_s = new short[var26];
            this.field_S = new short[var26];
            this.field_H = new short[var26];
            this.field_z = new byte[var26];
            this.field_k = new byte[var26];
            this.field_u = new byte[var26];
          }
          if (var27 > 0) {
            this.field_E = new byte[var27];
            this.field_i = new byte[var27];
          }
        }
        var2.field_l = var29Lifetime1;
        var3.field_l = var40;
        var4.field_l = var41;
        var5.field_l = var42;
        var6.field_l = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        for (var53 = 0; var53 < var9; var53++) {
          var54 = var2.i(-79);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.a(false);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.a(false);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.a(false);
          }
          this.field_K[var53] = var50 + var55;
          this.field_C[var53] = var51 + var56;
          this.field_v[var53] = var52 + var57;
          var50 = this.field_K[var53];
          var51 = this.field_C[var53];
          var52 = this.field_v[var53];
          if (var19 == 1) {
            this.field_I[var53] = var6.i(-115);
          }
        }
        var2.field_l = var39;
        var3.field_l = var30;
        var4.field_l = var32;
        var5.field_l = var35;
        var6.field_l = var33;
        var7.field_l = var37;
        var8.field_l = var38;
        for (var53Lifetime1 = 0; var53Lifetime1 < var10; var53Lifetime1++) {
          this.field_j[var53Lifetime1] = (short)var2.f(674914976);
          if (var13 != 0) {
            this.field_G[var53Lifetime1] = var3.g(0);
          }
          if (var15 == 255) {
            this.field_w[var53Lifetime1] = var4.g(0);
          }
          if (var16 == 1) {
            this.field_D[var53Lifetime1] = var5.g(0);
          }
          if (var17 == 1) {
            this.field_r[var53Lifetime1] = var6.i(-111);
          }
          if (var18 == 1) {
            this.field_B[var53Lifetime1] = (short)(var7.f(674914976) - 1);
          }
          if (this.field_Q != null) {
            if (this.field_B[var53Lifetime1] == -1) {
              this.field_Q[var53Lifetime1] = (byte)-1;
            } else {
              this.field_Q[var53Lifetime1] = (byte)(var8.i(-125) - 1);
            }
          }
        }
        this.field_q = -1;
        var2.field_l = var36;
        var3.field_l = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.i(-101);
          if (var58 == 1) {
            var53Lifetime2 = var2.a(false) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.a(false) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.a(false) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_P[var57Lifetime1] = var53Lifetime2;
            this.field_O[var57Lifetime1] = var54Lifetime1;
            this.field_N[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.field_q) {
              this.field_q = var53Lifetime2;
            }
            if (var54Lifetime1 > this.field_q) {
              this.field_q = var54Lifetime1;
            }
            if (var55Lifetime1 > this.field_q) {
              this.field_q = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.a(false) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_P[var57Lifetime1] = var53Lifetime2;
            this.field_O[var57Lifetime1] = var54Lifetime1;
            this.field_N[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_q) {
              this.field_q = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.a(false) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_P[var57Lifetime1] = var53Lifetime2;
            this.field_O[var57Lifetime1] = var54Lifetime1;
            this.field_N[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_q) {
              this.field_q = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.a(false) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_P[var57Lifetime1] = var53Lifetime2;
            this.field_O[var57Lifetime1] = var54Lifetime1;
            this.field_N[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_q) {
              this.field_q = var55Lifetime1;
            }
          }
        }
        this.field_q = this.field_q + 1;
        var2.field_l = var43;
        var3.field_l = var44;
        var4.field_l = var45;
        var5.field_l = var46;
        var6.field_l = var47;
        var7.field_l = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_l[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_J[var57Lifetime2] = (short)var2.f(674914976);
            this.field_n[var57Lifetime2] = (short)var2.f(674914976);
            this.field_x[var57Lifetime2] = (short)var2.f(674914976);
          }
          if (var58Lifetime1 == 1) {
            this.field_J[var57Lifetime2] = (short)var3.f(674914976);
            this.field_n[var57Lifetime2] = (short)var3.f(674914976);
            this.field_x[var57Lifetime2] = (short)var3.f(674914976);
            this.field_s[var57Lifetime2] = (short)var4.f(674914976);
            this.field_S[var57Lifetime2] = (short)var4.f(674914976);
            this.field_H[var57Lifetime2] = (short)var4.f(674914976);
            this.field_z[var57Lifetime2] = var5.g(0);
            this.field_k[var57Lifetime2] = var6.g(0);
            this.field_u[var57Lifetime2] = var7.g(0);
          }
          if (var58Lifetime1 == 2) {
            this.field_J[var57Lifetime2] = (short)var3.f(674914976);
            this.field_n[var57Lifetime2] = (short)var3.f(674914976);
            this.field_x[var57Lifetime2] = (short)var3.f(674914976);
            this.field_s[var57Lifetime2] = (short)var4.f(674914976);
            this.field_S[var57Lifetime2] = (short)var4.f(674914976);
            this.field_H[var57Lifetime2] = (short)var4.f(674914976);
            this.field_z[var57Lifetime2] = var5.g(0);
            this.field_k[var57Lifetime2] = var6.g(0);
            this.field_u[var57Lifetime2] = var7.g(0);
            this.field_E[var57Lifetime2] = var7.g(0);
            this.field_i[var57Lifetime2] = var7.g(0);
          }
          if (var58Lifetime1 == 3) {
            this.field_J[var57Lifetime2] = (short)var3.f(674914976);
            this.field_n[var57Lifetime2] = (short)var3.f(674914976);
            this.field_x[var57Lifetime2] = (short)var3.f(674914976);
            this.field_s[var57Lifetime2] = (short)var4.f(674914976);
            this.field_S[var57Lifetime2] = (short)var4.f(674914976);
            this.field_H[var57Lifetime2] = (short)var4.f(674914976);
            this.field_z[var57Lifetime2] = var5.g(0);
            this.field_k[var57Lifetime2] = var6.g(0);
            this.field_u[var57Lifetime2] = var7.g(0);
          }
        }
        if (var14 != 0) {
          var2.field_l = var49;
          var57Lifetime3 = var2.i(-90);
          if (var57Lifetime3 > 0) {
            var2.field_l = var2.field_l + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.i(-80);
          if (var58Lifetime2 > 0) {
            var2.field_l = var2.field_l + 4 * var58Lifetime2;
          }
        }
    }

    private bn(byte[] param0) {
        this.field_t = (byte) 0;
        this.field_y = 0;
        this.field_q = 0;
        this.field_h = 0;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.b(param0);
        } else {
          this.a(param0);
        }
    }

    bn(int param0, int param1, int param2) {
        this.field_t = (byte) 0;
        this.field_y = 0;
        this.field_q = 0;
        this.field_h = 0;
        this.field_K = new int[param0];
        this.field_C = new int[param0];
        this.field_v = new int[param0];
        this.field_I = new int[param0];
        this.field_P = new int[param1];
        this.field_O = new int[param1];
        this.field_N = new int[param1];
        this.field_G = new byte[param1];
        this.field_w = new byte[param1];
        this.field_D = new byte[param1];
        this.field_j = new short[param1];
        this.field_B = new short[param1];
        this.field_Q = new byte[param1];
        this.field_r = new int[param1];
        if (param2 > 0) {
          this.field_l = new byte[param2];
          this.field_J = new short[param2];
          this.field_n = new short[param2];
          this.field_x = new short[param2];
          this.field_s = new short[param2];
          this.field_S = new short[param2];
          this.field_H = new short[param2];
          this.field_z = new byte[param2];
          this.field_k = new byte[param2];
          this.field_u = new byte[param2];
          this.field_E = new byte[param2];
          this.field_i = new byte[param2];
        }
    }

    bn(bn[] param0, int param1) {
        int incrementValue$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_1 = 0;
        byte[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_83_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        bn var10_ref_bn;
        bn var11;
        int var12;
        int var13;
        int var14;
        bn var15;
        bn var16;
        int var17;
        bn var18;
        bn var19;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        bn var11Lifetime1;
        this.field_t = (byte) 0;
        this.field_y = 0;
        this.field_q = 0;
        this.field_h = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        this.field_h = 0;
        this.field_y = 0;
        this.field_R = 0;
        this.field_t = (byte) -1;
        for (var9 = 0; var9 < param1; var9++) {
          var10_ref_bn = param0[var9];
          if (var10_ref_bn != null) {
            this.field_h = this.field_h + var10_ref_bn.field_h;
            this.field_y = this.field_y + var10_ref_bn.field_y;
            this.field_R = this.field_R + var10_ref_bn.field_R;
            if (var10_ref_bn.field_w == null) {
              if (this.field_t == -1) {
                this.field_t = var10_ref_bn.field_t;
              }
              if (this.field_t != var10_ref_bn.field_t) {
                var4 = 1;
              }
            } else {
              var4 = 1;
            }
            stackIn_13_0 = var3;
            if (var10_ref_bn.field_G == null) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            var3 = stackIn_13_0 | stackIn_14_1;
            stackIn_16_0 = var5;
            if (var10_ref_bn.field_D == null) {
              stackIn_17_1 = 0;
            } else {
              stackIn_17_1 = 1;
            }
            var5 = stackIn_16_0 | stackIn_17_1;
            stackIn_19_0 = var6;
            if (var10_ref_bn.field_r == null) {
              stackIn_20_1 = 0;
            } else {
              stackIn_20_1 = 1;
            }
            var6 = stackIn_19_0 | stackIn_20_1;
            stackIn_22_0 = var7;
            if (var10_ref_bn.field_B == null) {
              stackIn_23_1 = 0;
            } else {
              stackIn_23_1 = 1;
            }
            var7 = stackIn_22_0 | stackIn_23_1;
            stackIn_25_0 = var8;
            if (var10_ref_bn.field_Q == null) {
              stackIn_26_1 = 0;
            } else {
              stackIn_26_1 = 1;
            }
            var8 = stackIn_25_0 | stackIn_26_1;
          }
        }
        this.field_K = new int[this.field_h];
        this.field_C = new int[this.field_h];
        this.field_v = new int[this.field_h];
        this.field_I = new int[this.field_h];
        this.field_L = new short[this.field_h];
        this.field_P = new int[this.field_y];
        this.field_O = new int[this.field_y];
        this.field_N = new int[this.field_y];
        if (var3 != 0) {
          this.field_G = new byte[this.field_y];
        }
        if (var4 != 0) {
          this.field_w = new byte[this.field_y];
        }
        if (var5 != 0) {
          this.field_D = new byte[this.field_y];
        }
        if (var6 != 0) {
          this.field_r = new int[this.field_y];
        }
        if (var7 != 0) {
          this.field_B = new short[this.field_y];
        }
        if (var8 != 0) {
          this.field_Q = new byte[this.field_y];
        }
        this.field_j = new short[this.field_y];
        this.field_F = new short[this.field_y];
        if (this.field_R > 0) {
          this.field_l = new byte[this.field_R];
          this.field_J = new short[this.field_R];
          this.field_n = new short[this.field_R];
          this.field_x = new short[this.field_R];
          this.field_s = new short[this.field_R];
          this.field_S = new short[this.field_R];
          this.field_H = new short[this.field_R];
          this.field_z = new byte[this.field_R];
          this.field_k = new byte[this.field_R];
          this.field_u = new byte[this.field_R];
          this.field_E = new byte[this.field_R];
          this.field_i = new byte[this.field_R];
        }
        this.field_h = 0;
        this.field_y = 0;
        this.field_R = 0;
        for (var9Lifetime1 = 0; var9Lifetime1 < param1; var9Lifetime1++) {
          var10 = (short)(1 << var9Lifetime1);
          var15 = param0[var9Lifetime1];
          var18 = var15;
          var11 = var18;
          if (var11 != null) {
            for (var12 = 0; var12 < var18.field_y; var12++) {
              if (var3 != 0 &&
                var18.field_G != null) {
                this.field_G[this.field_y] = var15.field_G[var12];
              }
              if (var4 != 0) {
                if (var18.field_w == null) {
                  this.field_w[this.field_y] = var15.field_t;
                } else {
                  this.field_w[this.field_y] = var15.field_w[var12];
                }
              }
              if (var5 != 0 &&
                var18.field_D != null) {
                this.field_D[this.field_y] = var15.field_D[var12];
              }
              if (var6 != 0 &&
                var18.field_r != null) {
                this.field_r[this.field_y] = var15.field_r[var12];
              }
              if (var7 != 0) {
                if (var18.field_B == null) {
                  this.field_B[this.field_y] = (short)-1;
                } else {
                  this.field_B[this.field_y] = var15.field_B[var12];
                }
              }
              this.field_j[this.field_y] = var15.field_j[var12];
              this.field_F[this.field_y] = (short)var10;
              this.field_P[this.field_y] = this.a(var15, var15.field_P[var12], (short) var10);
              this.field_O[this.field_y] = this.a(var15, var15.field_O[var12], (short) var10);
              this.field_N[this.field_y] = this.a(var15, var15.field_N[var12], (short) var10);
              this.field_y = this.field_y + 1;
            }
          }
        }
        var9Lifetime2 = 0;
        this.field_q = this.field_h;
        for (var10Lifetime1 = 0; var10Lifetime1 < param1; var10Lifetime1++) {
          var16 = param0[var10Lifetime1];
          var19 = var16;
          var11Lifetime1 = var19;
          var12Lifetime1 = (short)(1 << var10Lifetime1);
          if (var11Lifetime1 != null) {
            for (var13 = 0; var13 < var19.field_y; var13++) {
              if (var8 != 0) {
                incrementValue$1 = var9Lifetime2;
                var9Lifetime2++;
                stackIn_82_0 = this.field_Q;
                stackIn_82_1 = incrementValue$1;
                if (var19.field_Q != null &&
                  var16.field_Q[var13] != -1) {
                  stackIn_83_2 = var16.field_Q[var13] + this.field_R;
                } else {
                  stackIn_83_2 = -1;
                }
                stackIn_82_0[stackIn_82_1] = (byte)stackIn_83_2;
              }
            }
            var17 = 0;
            var13Lifetime1 = var17;
            while (var17 < var19.field_R) {
              dupTemp$0 = var16.field_l[var17];
              this.field_l[this.field_R] = dupTemp$0;
              var14 = dupTemp$0;
              if (var14 == 0) {
                this.field_J[this.field_R] = (short)this.a(var16, (int) var16.field_J[var17], (short) var12Lifetime1);
                this.field_n[this.field_R] = (short)this.a(var16, (int) var16.field_n[var17], (short) var12Lifetime1);
                this.field_x[this.field_R] = (short)this.a(var16, (int) var16.field_x[var17], (short) var12Lifetime1);
              }
              if (var14 >= 1 &&
                var14 <= 3) {
                this.field_J[this.field_R] = var16.field_J[var17];
                this.field_n[this.field_R] = var16.field_n[var17];
                this.field_x[this.field_R] = var16.field_x[var17];
                this.field_s[this.field_R] = var16.field_s[var17];
                this.field_S[this.field_R] = var16.field_S[var17];
                this.field_H[this.field_R] = var16.field_H[var17];
                this.field_z[this.field_R] = var16.field_z[var17];
                this.field_k[this.field_R] = var16.field_k[var17];
                this.field_u[this.field_R] = var16.field_u[var17];
              }
              if (var14 == 2) {
                this.field_E[this.field_R] = var16.field_E[var17];
                this.field_i[this.field_R] = var16.field_i[var17];
              }
              this.field_R = this.field_R + 1;
              var17++;
            }
          }
        }
    }
}
