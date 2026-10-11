/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends um {
    private short[] field_W;
    byte[] field_F;
    int field_K;
    private static int[] field_O;
    short[] field_n;
    short field_D;
    byte[] field_o;
    short field_S;
    int[] field_g;
    int field_M;
    int[] field_X;
    ef[] field_J;
    byte[] field_k;
    short[] field_E;
    int[] field_N;
    byte[] field_j;
    int[] field_v;
    int field_B;
    ah[] field_Z;
    private int[][] field_U;
    private int[] field_ab;
    byte[] field_i;
    private static int field_G;
    ah[] field_m;
    short[] field_H;
    byte[] field_R;
    private static int[] field_I;
    int[] field_Y;
    byte[] field_f;
    private short[] field_u;
    byte[] field_P;
    private boolean field_r;
    short[] field_p;
    private int[][] field_s;
    int field_l;
    byte[] field_z;
    short[] field_C;
    short field_x;
    byte field_t;
    byte[] field_Q;
    short[] field_T;
    short[] field_h;
    short[] field_L;
    short field_V;
    short field_y;
    private int[] field_A;
    int[] field_q;
    short field_w;

    final int a(int param0, int param1, int param2, byte param3, short param4, byte param5) {
        this.field_N[this.field_K] = param0;
        this.field_v[this.field_K] = param1;
        this.field_X[this.field_K] = param2;
        this.field_Q[this.field_K] = (byte)param3;
        this.field_k[this.field_K] = (byte)-1;
        this.field_n[this.field_K] = (short)param4;
        this.field_L[this.field_K] = (short)-1;
        this.field_f[this.field_K] = (byte)param5;
        int fieldTemp$0 = this.field_K;
        this.field_K = this.field_K + 1;
        return fieldTemp$0;
    }

    final void a(um param0, int param1, int param2, int param3, boolean param4) {
        int var15 = 0;
        ah dupTemp$0 = null;
        ah dupTemp$1 = null;
        eg var6;
        int var7;
        int var9;
        int var10;
        ah var11;
        int var12;
        int var13;
        int var14;
        ah var16;
        ah var17;
        ah var18;
        int[] var22;
        int var10Lifetime1;
        int var10Lifetime1Lifetime1;
        ah var16Lifetime1;
        ah var16Lifetime2;
        var6 = (eg) (param0);
        var6.e();
        var6.d();
        field_G = field_G + 1;
        var7 = 0;
        var22 = var6.field_g;
        var9 = var6.field_M;
        for (var10 = 0; var10 < this.field_M; var10++) {
          var11 = this.field_Z[var10];
          var16 = var11;
          var16Lifetime1 = var11;
          if (var11.field_a != 0) {
            var12 = this.field_Y[var10] - param2;
            if (var12 >= var6.field_y &&
              var12 <= var6.field_S) {
              var13 = this.field_g[var10] - param1;
              if (var13 >= var6.field_D &&
                var13 <= var6.field_w) {
                var14 = this.field_q[var10] - param3;
                if (var14 >= var6.field_V &&
                  var14 <= var6.field_x) {
                  for (var15 = 0; var15 < var9; var15++) {
                    var16Lifetime2 = var6.field_Z[var15];
                    if (var13 == var22[var15] &&
                      var14 == var6.field_q[var15] &&
                      var12 == var6.field_Y[var15] &&
                      var16Lifetime2.field_a != 0) {
                      if (this.field_m == null) {
                        this.field_m = new ah[this.field_M];
                      }
                      if (var6.field_m == null) {
                        var6.field_m = new ah[var9];
                      }
                      var17 = this.field_m[var10];
                      if (var17 == null) {
                        dupTemp$0 = new ah(var11);
                        this.field_m[var10] = dupTemp$0;
                        var17 = dupTemp$0;
                      }
                      var18 = var6.field_m[var15];
                      if (var18 == null) {
                        dupTemp$1 = new ah(var16Lifetime2);
                        var6.field_m[var15] = dupTemp$1;
                        var18 = dupTemp$1;
                      }
                      var17.field_f = var17.field_f + var16Lifetime2.field_f;
                      var17.field_j = var17.field_j + var16Lifetime2.field_j;
                      var17.field_d = var17.field_d + var16Lifetime2.field_d;
                      var17.field_a = var17.field_a + var16Lifetime2.field_a;
                      var18.field_f = var18.field_f + var11.field_f;
                      var18.field_j = var18.field_j + var11.field_j;
                      var18.field_d = var18.field_d + var11.field_d;
                      var18.field_a = var18.field_a + var11.field_a;
                      var7++;
                      field_I[var10] = field_G;
                      field_O[var15] = field_G;
                    }
                  }
                }
              }
            }
          }
        }
        if (var7 >= 3 &&
          param4) {
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_K; var10Lifetime1++) {
            if (field_I[this.field_N[var10Lifetime1]] == field_G &&
              field_I[this.field_v[var10Lifetime1]] == field_G &&
              field_I[this.field_X[var10Lifetime1]] == field_G) {
              if (this.field_Q == null) {
                this.field_Q = new byte[this.field_K];
              }
              this.field_Q[var10Lifetime1] = (byte)2;
            }
          }
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < var6.field_K; var10Lifetime1Lifetime1++) {
            if (field_O[var6.field_N[var10Lifetime1Lifetime1]] == field_G &&
              field_O[var6.field_v[var10Lifetime1Lifetime1]] == field_G &&
              field_O[var6.field_X[var10Lifetime1Lifetime1]] == field_G) {
              if (var6.field_Q == null) {
                var6.field_Q = new byte[var6.field_K];
              }
              var6.field_Q[var10Lifetime1Lifetime1] = (byte)2;
            }
          }
          return;
        }
    }

    final fa a(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        return this.a(param0, param1, param2 * param5[3] + param3 * param5[4] + param4 * param5[5] >> 16, param2 * param5[6] + param3 * param5[7] + param4 * param5[8] >> 16, param2 * param5[9] + param3 * param5[10] + param4 * param5[11] >> 16);
    }

    final static eg a(di param0, String param1, String param2) {
        byte[] var3 = param0.a(false, param2, param1);
        if (var3 == null) {
          return null;
        }
        return new eg(var3);
    }

    final fa a(int param0, int param1, int param2, int param3, int param4) {
        return (fa) ((Object) new nc(this, param0, param1, param2, param3, param4));
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < this.field_B; var5++) {
          this.field_g[var5] = this.field_g[var5] * param0 / param3;
          this.field_Y[var5] = this.field_Y[var5] * param1 / param3;
          this.field_q[var5] = this.field_q[var5] * param2 / param3;
        }
        this.a();
    }

    final void a() {
        this.field_Z = null;
        this.field_m = null;
        this.field_J = null;
        this.field_r = false;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < this.field_B; var4++) {
          if (this.field_g[var4] == param0 &&
            this.field_Y[var4] == param1 &&
            this.field_q[var4] == param2) {
            return var4;
          }
        }
        this.field_g[this.field_B] = param0;
        this.field_Y[this.field_B] = param1;
        this.field_q[this.field_B] = param2;
        int fieldTemp$0 = this.field_B + 1;
        this.field_B = this.field_B + 1;
        this.field_M = fieldTemp$0;
        return this.field_B - 1;
    }

    final void e() {
        int var7 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        int var9;
        int var10;
        if (this.field_r) {
          return;
        }
        this.field_r = true;
        var1 = 32767;
        var2 = 32767;
        var3 = 32767;
        var4 = -32768;
        var5 = -32768;
        var6 = -32768;
        for (var7 = 0; var7 < this.field_M; var7++) {
          var8 = this.field_g[var7];
          var9 = this.field_Y[var7];
          var10 = this.field_q[var7];
          if (var8 < var1) {
            var1 = var8;
          }
          if (var8 > var4) {
            var4 = var8;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var10 > var6) {
            var6 = var10;
          }
        }
        this.field_D = (short)var1;
        this.field_w = (short)var4;
        this.field_y = (short)var2;
        this.field_S = (short)var5;
        this.field_V = (short)var3;
        this.field_x = (short)var6;
    }

    final void c() {
        this.field_A = null;
        this.field_ab = null;
        this.field_U = (int[][]) null;
        this.field_s = (int[][]) null;
    }

    private final int a(eg param0, int param1, short param2) {
        int var7 = 0;
        int var4;
        int var5;
        int var6;
        var4 = param0.field_g[param1];
        var5 = param0.field_Y[param1];
        var6 = param0.field_q[param1];
        for (var7 = 0; var7 < this.field_B; var7++) {
          if (var4 == this.field_g[var7] &&
            var5 == this.field_Y[var7] &&
            var6 == this.field_q[var7]) {
            this.field_u[var7] = (short)(this.field_u[var7] | param2);
            return var7;
          }
        }
        this.field_g[this.field_B] = var4;
        this.field_Y[this.field_B] = var5;
        this.field_q[this.field_B] = var6;
        this.field_u[this.field_B] = (short)param2;
        if (param0.field_A != null) {
          this.field_A[this.field_B] = param0.field_A[param1];
        }
        int fieldTemp$0 = this.field_B;
        this.field_B = this.field_B + 1;
        return fieldTemp$0;
    }

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = 0; var2 < this.field_B; var2++) {
          var3 = this.field_g[var2];
          var4 = this.field_Y[var2];
          var5 = this.field_q[var2];
          this.field_g[var2] = param0[0] + (var3 * param0[3] + var4 * param0[6] + var5 * param0[9] >> 16);
          this.field_Y[var2] = param0[1] + (var3 * param0[4] + var4 * param0[7] + var5 * param0[10] >> 16);
          this.field_q[var2] = param0[2] + (var3 * param0[5] + var4 * param0[8] + var5 * param0[11] >> 16);
        }
        this.a();
    }

    public static void f() {
        field_I = null;
        field_O = null;
    }

    final void d() {
        ef dupTemp$0 = null;
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
        ef var16;
        ah var17;
        ah var18;
        ah var19;
        int var1Lifetime1;
        if (this.field_Z != null) {
          return;
        }
        this.field_Z = new ah[this.field_M];
        for (var1 = 0; var1 < this.field_M; var1++) {
          this.field_Z[var1] = new ah();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_K) {
            return;
          }
          var2 = this.field_N[var1Lifetime1];
          var3 = this.field_v[var1Lifetime1];
          var4 = this.field_X[var1Lifetime1];
          var5 = this.field_g[var3] - this.field_g[var2];
          var6 = this.field_Y[var3] - this.field_Y[var2];
          var7 = this.field_q[var3] - this.field_q[var2];
          var8 = this.field_g[var4] - this.field_g[var2];
          var9 = this.field_Y[var4] - this.field_Y[var2];
          var10 = this.field_q[var4] - this.field_q[var2];
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
              if (this.field_Q != null) {
                var15 = this.field_Q[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_J == null) {
                    this.field_J = new ef[this.field_K];
                  }
                  dupTemp$0 = new ef();
                  this.field_J[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_b = var11;
                  var16.field_a = var12;
                  var16.field_d = var13;
                }
              } else {
                var17 = this.field_Z[var2];
                var17.field_f = var17.field_f + var11;
                var17.field_j = var17.field_j + var12;
                var17.field_d = var17.field_d + var13;
                var17.field_a = var17.field_a + 1;
                var18 = this.field_Z[var3];
                var18.field_f = var18.field_f + var11;
                var18.field_j = var18.field_j + var12;
                var18.field_d = var18.field_d + var13;
                var18.field_a = var18.field_a + 1;
                var19 = this.field_Z[var4];
                var19.field_f = var19.field_f + var11;
                var19.field_j = var19.field_j + var12;
                var19.field_d = var19.field_d + var13;
                var19.field_a = var19.field_a + 1;
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

    private final void b(byte[] param0) {
        int var2;
        int var3;
        ge var4;
        ge var5;
        ge var6;
        ge var7;
        ge var8;
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
        var4 = new ge(param0);
        var5 = new ge(param0);
        var6 = new ge(param0);
        var7 = new ge(param0);
        var8 = new ge(param0);
        var4.field_v = param0.length - 18;
        var9 = var4.d(-1034);
        var10 = var4.d(-1034);
        var11 = var4.g(-121);
        var12 = var4.g(-102);
        var13 = var4.g(-120);
        var14 = var4.g(-69);
        var15 = var4.g(-113);
        var16 = var4.g(-119);
        var17 = var4.d(-1034);
        var18 = var4.d(-1034);
        var19 = var4.d(-1034);
        var20 = var4.d(-1034);
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
        this.field_B = var9;
        this.field_K = var10;
        this.field_l = var11;
        this.field_g = new int[var9];
        this.field_Y = new int[var9];
        this.field_q = new int[var9];
        this.field_N = new int[var10];
        this.field_v = new int[var10];
        this.field_X = new int[var10];
        if (var11 > 0) {
          this.field_o = new byte[var11];
          this.field_p = new short[var11];
          this.field_H = new short[var11];
          this.field_C = new short[var11];
        }
        if (var16 == 1) {
          this.field_A = new int[var9];
        }
        if (var12 == 1) {
          this.field_Q = new byte[var10];
          this.field_k = new byte[var10];
          this.field_L = new short[var10];
        }
        if (var13 != 255) {
          this.field_t = (byte)var13;
        } else {
          this.field_P = new byte[var10];
        }
        if (var14 == 1) {
          this.field_f = new byte[var10];
        }
        if (var15 == 1) {
          this.field_ab = new int[var10];
        }
        this.field_n = new short[var10];
        var4.field_v = var22;
        var5.field_v = var32;
        var6.field_v = var33;
        var7.field_v = var34;
        var8.field_v = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.g(-109);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.i(-78);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.i(-73);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.i(-123);
          }
          this.field_g[var38] = var35 + var40;
          this.field_Y[var38] = var36 + var41;
          this.field_q[var38] = var37 + var42;
          var35 = this.field_g[var38];
          var36 = this.field_Y[var38];
          var37 = this.field_q[var38];
          if (var16 == 1) {
            this.field_A[var38] = var8.g(-105);
          }
        }
        var4.field_v = var30;
        var5.field_v = var26;
        var6.field_v = var24;
        var7.field_v = var28;
        var8.field_v = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_n[var38Lifetime1] = (short)var4.d(-1034);
          if (var12 == 1) {
            var39Lifetime1 = var5.g(-108);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_Q[var38Lifetime1] = (byte) 0;
            } else {
              this.field_Q[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_k[var38Lifetime1] = (byte)-1;
              this.field_L[var38Lifetime1] = (short)-1;
            } else {
              this.field_k[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_L[var38Lifetime1] = this.field_n[var38Lifetime1];
              this.field_n[var38Lifetime1] = (short)127;
              if (this.field_L[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_P[var38Lifetime1] = var6.e((byte) 105);
          }
          if (var14 == 1) {
            this.field_f[var38Lifetime1] = var7.e((byte) 105);
          }
          if (var15 == 1) {
            this.field_ab[var38Lifetime1] = var8.g(-80);
          }
        }
        this.field_M = -1;
        var4.field_v = var29;
        var5.field_v = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.g(-110);
          if (var43 == 1) {
            var38Lifetime2 = var4.i(-33) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.i(-57) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.i(-91) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_N[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_X[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.field_M) {
              this.field_M = var38Lifetime2;
            }
            if (var39Lifetime2 > this.field_M) {
              this.field_M = var39Lifetime2;
            }
            if (var40Lifetime1 > this.field_M) {
              this.field_M = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.i(-29) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_N[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_X[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_M) {
              this.field_M = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.i(-82) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_N[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_X[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_M) {
              this.field_M = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.i(-27) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_N[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_X[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_M) {
              this.field_M = var40Lifetime1;
            }
          }
        }
        this.field_M = this.field_M + 1;
        var4.field_v = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_o[var42Lifetime2] = (byte) 0;
          this.field_p[var42Lifetime2] = (short)var4.d(-1034);
          this.field_H[var42Lifetime2] = (short)var4.d(-1034);
          this.field_C[var42Lifetime2] = (short)var4.d(-1034);
        }
        if (this.field_k != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_k[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_p[var44Lifetime1] & 65535) == this.field_N[var45] &&
                (this.field_H[var44Lifetime1] & 65535) == this.field_v[var45] &&
                (this.field_C[var44Lifetime1] & 65535) == this.field_X[var45]) {
                this.field_k[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_k = null;
          }
        }
        if (var3 == 0) {
          this.field_L = null;
        }
        if (var2 == 0) {
          this.field_Q = null;
        }
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
        if (this.field_A != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_B; var3++) {
            var4 = this.field_A[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_U = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_U[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_B; var3++) {
            var4Lifetime2 = this.field_A[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_U[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_A = null;
        }
        if (this.field_ab != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_K; var3Lifetime1++) {
            var4Lifetime1 = this.field_ab[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_s = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_s[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_K; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_ab[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_s[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_ab = null;
        }
    }

    private final void a(byte[] param0) {
        byte dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        ge var2;
        ge var3;
        ge var4;
        ge var5;
        ge var6;
        ge var7;
        ge var8;
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
        var2 = new ge(param0);
        var3 = new ge(param0);
        var4 = new ge(param0);
        var5 = new ge(param0);
        var6 = new ge(param0);
        var7 = new ge(param0);
        var8 = new ge(param0);
        var2.field_v = param0.length - 23;
        var9 = var2.d(-1034);
        var10 = var2.d(-1034);
        var11 = var2.g(-110);
        var12 = var2.g(-87);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.g(-96);
        var16 = var2.g(-82);
        var17 = var2.g(-75);
        var18 = var2.g(-118);
        var19 = var2.g(-83);
        var20 = var2.d(-1034);
        var21 = var2.d(-1034);
        var22 = var2.d(-1034);
        var23 = var2.d(-1034);
        var24 = var2.d(-1034);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_o = new byte[var11];
          var2.field_v = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.e((byte) 105);
            this.field_o[var28] = dupTemp$0;
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
        this.field_B = var9;
        this.field_K = var10;
        this.field_l = var11;
        this.field_g = new int[var9];
        this.field_Y = new int[var9];
        this.field_q = new int[var9];
        this.field_N = new int[var10];
        this.field_v = new int[var10];
        this.field_X = new int[var10];
        if (var19 == 1) {
          this.field_A = new int[var9];
        }
        if (var13 != 0) {
          this.field_Q = new byte[var10];
        }
        if (var15 != 255) {
          this.field_t = (byte)var15;
        } else {
          this.field_P = new byte[var10];
        }
        if (var16 == 1) {
          this.field_f = new byte[var10];
        }
        if (var17 == 1) {
          this.field_ab = new int[var10];
        }
        if (var18 == 1) {
          this.field_L = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_k = new byte[var10];
        }
        this.field_n = new short[var10];
        if (var11 > 0) {
          this.field_p = new short[var11];
          this.field_H = new short[var11];
          this.field_C = new short[var11];
          if (var26 > 0) {
            this.field_T = new short[var26];
            this.field_E = new short[var26];
            this.field_h = new short[var26];
            this.field_z = new byte[var26];
            this.field_F = new byte[var26];
            this.field_R = new byte[var26];
          }
          if (var27 > 0) {
            this.field_j = new byte[var27];
            this.field_i = new byte[var27];
          }
        }
        var2.field_v = var29Lifetime1;
        var3.field_v = var40;
        var4.field_v = var41;
        var5.field_v = var42;
        var6.field_v = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        for (var53 = 0; var53 < var9; var53++) {
          var54 = var2.g(-84);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.i(-4);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.i(-28);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.i(-88);
          }
          this.field_g[var53] = var50 + var55;
          this.field_Y[var53] = var51 + var56;
          this.field_q[var53] = var52 + var57;
          var50 = this.field_g[var53];
          var51 = this.field_Y[var53];
          var52 = this.field_q[var53];
          if (var19 == 1) {
            this.field_A[var53] = var6.g(-107);
          }
        }
        var2.field_v = var39;
        var3.field_v = var30;
        var4.field_v = var32;
        var5.field_v = var35;
        var6.field_v = var33;
        var7.field_v = var37;
        var8.field_v = var38;
        for (var53Lifetime1 = 0; var53Lifetime1 < var10; var53Lifetime1++) {
          this.field_n[var53Lifetime1] = (short)var2.d(-1034);
          if (var13 != 0) {
            this.field_Q[var53Lifetime1] = var3.e((byte) 105);
          }
          if (var15 == 255) {
            this.field_P[var53Lifetime1] = var4.e((byte) 105);
          }
          if (var16 == 1) {
            this.field_f[var53Lifetime1] = var5.e((byte) 105);
          }
          if (var17 == 1) {
            this.field_ab[var53Lifetime1] = var6.g(-115);
          }
          if (var18 == 1) {
            this.field_L[var53Lifetime1] = (short)(var7.d(-1034) - 1);
          }
          if (this.field_k != null) {
            if (this.field_L[var53Lifetime1] == -1) {
              this.field_k[var53Lifetime1] = (byte)-1;
            } else {
              this.field_k[var53Lifetime1] = (byte)(var8.g(-86) - 1);
            }
          }
        }
        this.field_M = -1;
        var2.field_v = var36;
        var3.field_v = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.g(-79);
          if (var58 == 1) {
            var53Lifetime2 = var2.i(-126) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.i(-118) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.i(-7) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_N[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_X[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.field_M) {
              this.field_M = var53Lifetime2;
            }
            if (var54Lifetime1 > this.field_M) {
              this.field_M = var54Lifetime1;
            }
            if (var55Lifetime1 > this.field_M) {
              this.field_M = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.i(-47) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_N[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_X[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_M) {
              this.field_M = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.i(-111) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_N[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_X[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_M) {
              this.field_M = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.i(-37) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_N[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_X[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_M) {
              this.field_M = var55Lifetime1;
            }
          }
        }
        this.field_M = this.field_M + 1;
        var2.field_v = var43;
        var3.field_v = var44;
        var4.field_v = var45;
        var5.field_v = var46;
        var6.field_v = var47;
        var7.field_v = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_o[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_p[var57Lifetime2] = (short)var2.d(-1034);
            this.field_H[var57Lifetime2] = (short)var2.d(-1034);
            this.field_C[var57Lifetime2] = (short)var2.d(-1034);
          }
          if (var58Lifetime1 == 1) {
            this.field_p[var57Lifetime2] = (short)var3.d(-1034);
            this.field_H[var57Lifetime2] = (short)var3.d(-1034);
            this.field_C[var57Lifetime2] = (short)var3.d(-1034);
            this.field_T[var57Lifetime2] = (short)var4.d(-1034);
            this.field_E[var57Lifetime2] = (short)var4.d(-1034);
            this.field_h[var57Lifetime2] = (short)var4.d(-1034);
            this.field_z[var57Lifetime2] = var5.e((byte) 105);
            this.field_F[var57Lifetime2] = var6.e((byte) 105);
            this.field_R[var57Lifetime2] = var7.e((byte) 105);
          }
          if (var58Lifetime1 == 2) {
            this.field_p[var57Lifetime2] = (short)var3.d(-1034);
            this.field_H[var57Lifetime2] = (short)var3.d(-1034);
            this.field_C[var57Lifetime2] = (short)var3.d(-1034);
            this.field_T[var57Lifetime2] = (short)var4.d(-1034);
            this.field_E[var57Lifetime2] = (short)var4.d(-1034);
            this.field_h[var57Lifetime2] = (short)var4.d(-1034);
            this.field_z[var57Lifetime2] = var5.e((byte) 105);
            this.field_F[var57Lifetime2] = var6.e((byte) 105);
            this.field_R[var57Lifetime2] = var7.e((byte) 105);
            this.field_j[var57Lifetime2] = var7.e((byte) 105);
            this.field_i[var57Lifetime2] = var7.e((byte) 105);
          }
          if (var58Lifetime1 == 3) {
            this.field_p[var57Lifetime2] = (short)var3.d(-1034);
            this.field_H[var57Lifetime2] = (short)var3.d(-1034);
            this.field_C[var57Lifetime2] = (short)var3.d(-1034);
            this.field_T[var57Lifetime2] = (short)var4.d(-1034);
            this.field_E[var57Lifetime2] = (short)var4.d(-1034);
            this.field_h[var57Lifetime2] = (short)var4.d(-1034);
            this.field_z[var57Lifetime2] = var5.e((byte) 105);
            this.field_F[var57Lifetime2] = var6.e((byte) 105);
            this.field_R[var57Lifetime2] = var7.e((byte) 105);
          }
        }
        if (var14 != 0) {
          var2.field_v = var49;
          var57Lifetime3 = var2.g(-70);
          if (var57Lifetime3 > 0) {
            var2.field_v = var2.field_v + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.g(-106);
          if (var58Lifetime2 > 0) {
            var2.field_v = var2.field_v + 4 * var58Lifetime2;
          }
        }
    }

    final byte a(short param0, short param1, short param2) {
        if (this.field_l >= 255) {
          throw new IllegalStateException();
        }
        this.field_o[this.field_l] = (byte) 0;
        this.field_p[this.field_l] = (short)param0;
        this.field_H[this.field_l] = (short)param1;
        this.field_C[this.field_l] = (short)param2;
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        return (byte)fieldTemp$0;
    }

    private eg(byte[] param0) {
        this.field_M = 0;
        this.field_B = 0;
        this.field_r = false;
        this.field_t = (byte) 0;
        this.field_K = 0;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.a(param0);
        } else {
          this.b(param0);
        }
    }

    eg(int param0, int param1, int param2) {
        this.field_M = 0;
        this.field_B = 0;
        this.field_r = false;
        this.field_t = (byte) 0;
        this.field_K = 0;
        this.field_g = new int[param0];
        this.field_Y = new int[param0];
        this.field_q = new int[param0];
        this.field_A = new int[param0];
        this.field_N = new int[param1];
        this.field_v = new int[param1];
        this.field_X = new int[param1];
        this.field_Q = new byte[param1];
        this.field_P = new byte[param1];
        this.field_f = new byte[param1];
        this.field_n = new short[param1];
        this.field_L = new short[param1];
        this.field_k = new byte[param1];
        this.field_ab = new int[param1];
        if (param2 > 0) {
          this.field_o = new byte[param2];
          this.field_p = new short[param2];
          this.field_H = new short[param2];
          this.field_C = new short[param2];
          this.field_T = new short[param2];
          this.field_E = new short[param2];
          this.field_h = new short[param2];
          this.field_z = new byte[param2];
          this.field_F = new byte[param2];
          this.field_R = new byte[param2];
          this.field_j = new byte[param2];
          this.field_i = new byte[param2];
        }
    }

    eg(eg[] param0, int param1) {
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
        eg var10_ref_eg;
        eg var11;
        int var12;
        int var13;
        int var14;
        eg var15;
        eg var16;
        int var17;
        eg var18;
        eg var19;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        eg var11Lifetime1;
        this.field_M = 0;
        this.field_B = 0;
        this.field_r = false;
        this.field_t = (byte) 0;
        this.field_K = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        this.field_B = 0;
        this.field_K = 0;
        this.field_l = 0;
        this.field_t = (byte) -1;
        for (var9 = 0; var9 < param1; var9++) {
          var10_ref_eg = param0[var9];
          if (var10_ref_eg != null) {
            this.field_B = this.field_B + var10_ref_eg.field_B;
            this.field_K = this.field_K + var10_ref_eg.field_K;
            this.field_l = this.field_l + var10_ref_eg.field_l;
            if (var10_ref_eg.field_P == null) {
              if (this.field_t == -1) {
                this.field_t = var10_ref_eg.field_t;
              }
              if (this.field_t != var10_ref_eg.field_t) {
                var4 = 1;
              }
            } else {
              var4 = 1;
            }
            stackIn_13_0 = var3;
            if (var10_ref_eg.field_Q == null) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            var3 = stackIn_13_0 | stackIn_14_1;
            stackIn_16_0 = var5;
            if (var10_ref_eg.field_f == null) {
              stackIn_17_1 = 0;
            } else {
              stackIn_17_1 = 1;
            }
            var5 = stackIn_16_0 | stackIn_17_1;
            stackIn_19_0 = var6;
            if (var10_ref_eg.field_ab == null) {
              stackIn_20_1 = 0;
            } else {
              stackIn_20_1 = 1;
            }
            var6 = stackIn_19_0 | stackIn_20_1;
            stackIn_22_0 = var7;
            if (var10_ref_eg.field_L == null) {
              stackIn_23_1 = 0;
            } else {
              stackIn_23_1 = 1;
            }
            var7 = stackIn_22_0 | stackIn_23_1;
            stackIn_25_0 = var8;
            if (var10_ref_eg.field_k == null) {
              stackIn_26_1 = 0;
            } else {
              stackIn_26_1 = 1;
            }
            var8 = stackIn_25_0 | stackIn_26_1;
          }
        }
        this.field_g = new int[this.field_B];
        this.field_Y = new int[this.field_B];
        this.field_q = new int[this.field_B];
        this.field_A = new int[this.field_B];
        this.field_u = new short[this.field_B];
        this.field_N = new int[this.field_K];
        this.field_v = new int[this.field_K];
        this.field_X = new int[this.field_K];
        if (var3 != 0) {
          this.field_Q = new byte[this.field_K];
        }
        if (var4 != 0) {
          this.field_P = new byte[this.field_K];
        }
        if (var5 != 0) {
          this.field_f = new byte[this.field_K];
        }
        if (var6 != 0) {
          this.field_ab = new int[this.field_K];
        }
        if (var7 != 0) {
          this.field_L = new short[this.field_K];
        }
        if (var8 != 0) {
          this.field_k = new byte[this.field_K];
        }
        this.field_n = new short[this.field_K];
        this.field_W = new short[this.field_K];
        if (this.field_l > 0) {
          this.field_o = new byte[this.field_l];
          this.field_p = new short[this.field_l];
          this.field_H = new short[this.field_l];
          this.field_C = new short[this.field_l];
          this.field_T = new short[this.field_l];
          this.field_E = new short[this.field_l];
          this.field_h = new short[this.field_l];
          this.field_z = new byte[this.field_l];
          this.field_F = new byte[this.field_l];
          this.field_R = new byte[this.field_l];
          this.field_j = new byte[this.field_l];
          this.field_i = new byte[this.field_l];
        }
        this.field_B = 0;
        this.field_K = 0;
        this.field_l = 0;
        for (var9Lifetime1 = 0; var9Lifetime1 < param1; var9Lifetime1++) {
          var10 = (short)(1 << var9Lifetime1);
          var15 = param0[var9Lifetime1];
          var18 = var15;
          var11 = var18;
          if (var11 != null) {
            for (var12 = 0; var12 < var18.field_K; var12++) {
              if (var3 != 0 &&
                var18.field_Q != null) {
                this.field_Q[this.field_K] = var15.field_Q[var12];
              }
              if (var4 != 0) {
                if (var18.field_P == null) {
                  this.field_P[this.field_K] = var15.field_t;
                } else {
                  this.field_P[this.field_K] = var15.field_P[var12];
                }
              }
              if (var5 != 0 &&
                var18.field_f != null) {
                this.field_f[this.field_K] = var15.field_f[var12];
              }
              if (var6 != 0 &&
                var18.field_ab != null) {
                this.field_ab[this.field_K] = var15.field_ab[var12];
              }
              if (var7 != 0) {
                if (var18.field_L == null) {
                  this.field_L[this.field_K] = (short)-1;
                } else {
                  this.field_L[this.field_K] = var15.field_L[var12];
                }
              }
              this.field_n[this.field_K] = var15.field_n[var12];
              this.field_W[this.field_K] = (short)var10;
              this.field_N[this.field_K] = this.a(var15, var15.field_N[var12], (short) var10);
              this.field_v[this.field_K] = this.a(var15, var15.field_v[var12], (short) var10);
              this.field_X[this.field_K] = this.a(var15, var15.field_X[var12], (short) var10);
              this.field_K = this.field_K + 1;
            }
          }
        }
        var9Lifetime2 = 0;
        this.field_M = this.field_B;
        for (var10Lifetime1 = 0; var10Lifetime1 < param1; var10Lifetime1++) {
          var16 = param0[var10Lifetime1];
          var19 = var16;
          var11Lifetime1 = var19;
          var12Lifetime1 = (short)(1 << var10Lifetime1);
          if (var11Lifetime1 != null) {
            for (var13 = 0; var13 < var19.field_K; var13++) {
              if (var8 != 0) {
                incrementValue$1 = var9Lifetime2;
                var9Lifetime2++;
                stackIn_82_0 = this.field_k;
                stackIn_82_1 = incrementValue$1;
                if (var19.field_k != null &&
                  var16.field_k[var13] != -1) {
                  stackIn_83_2 = var16.field_k[var13] + this.field_l;
                } else {
                  stackIn_83_2 = -1;
                }
                stackIn_82_0[stackIn_82_1] = (byte)stackIn_83_2;
              }
            }
            var17 = 0;
            var13Lifetime1 = var17;
            while (var17 < var19.field_l) {
              dupTemp$0 = var16.field_o[var17];
              this.field_o[this.field_l] = dupTemp$0;
              var14 = dupTemp$0;
              if (var14 == 0) {
                this.field_p[this.field_l] = (short)this.a(var16, (int) var16.field_p[var17], (short) var12Lifetime1);
                this.field_H[this.field_l] = (short)this.a(var16, (int) var16.field_H[var17], (short) var12Lifetime1);
                this.field_C[this.field_l] = (short)this.a(var16, (int) var16.field_C[var17], (short) var12Lifetime1);
              }
              if (var14 >= 1 &&
                var14 <= 3) {
                this.field_p[this.field_l] = var16.field_p[var17];
                this.field_H[this.field_l] = var16.field_H[var17];
                this.field_C[this.field_l] = var16.field_C[var17];
                this.field_T[this.field_l] = var16.field_T[var17];
                this.field_E[this.field_l] = var16.field_E[var17];
                this.field_h[this.field_l] = var16.field_h[var17];
                this.field_z[this.field_l] = var16.field_z[var17];
                this.field_F[this.field_l] = var16.field_F[var17];
                this.field_R[this.field_l] = var16.field_R[var17];
              }
              if (var14 == 2) {
                this.field_j[this.field_l] = var16.field_j[var17];
                this.field_i[this.field_l] = var16.field_i[var17];
              }
              this.field_l = this.field_l + 1;
              var17++;
            }
          }
        }
    }

    eg(eg param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        this.field_M = 0;
        this.field_B = 0;
        this.field_r = false;
        this.field_t = (byte) 0;
        this.field_K = 0;
        this.field_B = param0.field_B;
        this.field_M = param0.field_M;
        this.field_K = param0.field_K;
        this.field_l = param0.field_l;
        if (!param1) {
          this.field_g = new int[this.field_B];
          this.field_Y = new int[this.field_B];
          this.field_q = new int[this.field_B];
          for (var6 = 0; var6 < this.field_B; var6++) {
            this.field_g[var6] = param0.field_g[var6];
            this.field_Y[var6] = param0.field_Y[var6];
            this.field_q[var6] = param0.field_q[var6];
          }
        } else {
          this.field_g = param0.field_g;
          this.field_Y = param0.field_Y;
          this.field_q = param0.field_q;
        }
        if (!param2) {
          this.field_n = new short[this.field_K];
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_K; var6Lifetime1++) {
            this.field_n[var6Lifetime1] = param0.field_n[var6Lifetime1];
          }
        } else {
          this.field_n = param0.field_n;
        }
        if (!param3 &&
          param0.field_L != null) {
          this.field_L = new short[this.field_K];
          for (var6Lifetime2 = 0; var6Lifetime2 < this.field_K; var6Lifetime2++) {
            this.field_L[var6Lifetime2] = param0.field_L[var6Lifetime2];
          }
        } else {
          this.field_L = param0.field_L;
        }
        if (!param4) {
          this.field_f = new byte[this.field_K];
          if (param0.field_f != null) {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_K; var6Lifetime3++) {
              this.field_f[var6Lifetime3] = param0.field_f[var6Lifetime3];
            }
          } else {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_K; var6Lifetime3++) {
              this.field_f[var6Lifetime3] = (byte) 0;
            }
          }
        } else {
          this.field_f = param0.field_f;
        }
        this.field_N = param0.field_N;
        this.field_v = param0.field_v;
        this.field_X = param0.field_X;
        this.field_Q = param0.field_Q;
        this.field_P = param0.field_P;
        this.field_k = param0.field_k;
        this.field_t = param0.field_t;
        this.field_o = param0.field_o;
        this.field_p = param0.field_p;
        this.field_H = param0.field_H;
        this.field_C = param0.field_C;
        this.field_T = param0.field_T;
        this.field_E = param0.field_E;
        this.field_h = param0.field_h;
        this.field_z = param0.field_z;
        this.field_F = param0.field_F;
        this.field_R = param0.field_R;
        this.field_j = param0.field_j;
        this.field_i = param0.field_i;
        this.field_A = param0.field_A;
        this.field_ab = param0.field_ab;
        this.field_U = param0.field_U;
        this.field_s = param0.field_s;
        this.field_Z = param0.field_Z;
        this.field_J = param0.field_J;
        this.field_m = param0.field_m;
    }

    static {
        field_O = new int[10000];
        field_I = new int[10000];
        field_G = 0;
    }
}
