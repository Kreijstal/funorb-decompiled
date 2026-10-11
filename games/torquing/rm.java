/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rm extends pa {
    private byte[] field_L;
    private short[] field_H;
    private int[] field_i;
    short[] field_A;
    bl[] field_J;
    int[] field_E;
    int[] field_q;
    private byte[] field_t;
    short[] field_x;
    byte[] field_D;
    short[] field_u;
    dd[] field_l;
    private int[] field_p;
    int field_g;
    int[] field_y;
    byte field_I;
    private short[] field_z;
    byte[] field_j;
    int[] field_M;
    int field_F;
    private byte[] field_Q;
    short[] field_m;
    private byte[] field_v;
    dd[] field_h;
    byte[] field_s;
    private int[][] field_R;
    private short[] field_N;
    private short[] field_K;
    byte[] field_r;
    private short[] field_P;
    private byte[] field_C;
    byte[] field_G;
    int[] field_B;
    int field_k;
    int[] field_o;
    short[] field_n;
    private int[][] field_w;
    int field_f;

    final int a(int param0, int param1, int param2, byte param3, byte param4, short param5, short param6) {
        this.field_o[this.field_g] = param0;
        this.field_y[this.field_g] = param1;
        this.field_q[this.field_g] = param2;
        this.field_j[this.field_g] = (byte)param3;
        this.field_D[this.field_g] = (byte)param4;
        this.field_m[this.field_g] = (short)param5;
        this.field_A[this.field_g] = (short)param6;
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        return fieldTemp$0;
    }

    final static rm a(la param0, String param1, String param2) {
        byte[] var3 = param0.a(-106, param2, param1);
        if (var3 == null) {
          return null;
        }
        return new rm(var3);
    }

    final void b() {
        this.field_i = null;
        this.field_p = null;
        this.field_w = (int[][]) null;
        this.field_R = (int[][]) null;
    }

    private final void b(byte[] param0) {
        int var2;
        int var3;
        fj var4;
        fj var5;
        fj var6;
        fj var7;
        fj var8;
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
        var4 = new fj(param0);
        var5 = new fj(param0);
        var6 = new fj(param0);
        var7 = new fj(param0);
        var8 = new fj(param0);
        var4.field_n = param0.length - 18;
        var9 = var4.i(7088);
        var10 = var4.i(7088);
        var11 = var4.i((byte) -101);
        var12 = var4.i((byte) -101);
        var13 = var4.i((byte) -101);
        var14 = var4.i((byte) -101);
        var15 = var4.i((byte) -101);
        var16 = var4.i((byte) -101);
        var17 = var4.i(7088);
        var18 = var4.i(7088);
        var19 = var4.i(7088);
        var20 = var4.i(7088);
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
        this.field_f = var9;
        this.field_g = var10;
        this.field_k = var11;
        this.field_M = new int[var9];
        this.field_B = new int[var9];
        this.field_E = new int[var9];
        this.field_o = new int[var10];
        this.field_y = new int[var10];
        this.field_q = new int[var10];
        if (var11 > 0) {
          this.field_s = new byte[var11];
          this.field_u = new short[var11];
          this.field_n = new short[var11];
          this.field_x = new short[var11];
        }
        if (var16 == 1) {
          this.field_i = new int[var9];
        }
        if (var12 == 1) {
          this.field_j = new byte[var10];
          this.field_D = new byte[var10];
          this.field_A = new short[var10];
        }
        if (var13 != 255) {
          this.field_I = (byte)var13;
        } else {
          this.field_G = new byte[var10];
        }
        if (var14 == 1) {
          this.field_r = new byte[var10];
        }
        if (var15 == 1) {
          this.field_p = new int[var10];
        }
        this.field_m = new short[var10];
        var4.field_n = var22;
        var5.field_n = var32;
        var6.field_n = var33;
        var7.field_n = var34;
        var8.field_n = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.i((byte) -101);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.g((byte) -121);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.g((byte) -123);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.g((byte) -116);
          }
          this.field_M[var38] = var35 + var40;
          this.field_B[var38] = var36 + var41;
          this.field_E[var38] = var37 + var42;
          var35 = this.field_M[var38];
          var36 = this.field_B[var38];
          var37 = this.field_E[var38];
          if (var16 == 1) {
            this.field_i[var38] = var8.i((byte) -101);
          }
        }
        var4.field_n = var30;
        var5.field_n = var26;
        var6.field_n = var24;
        var7.field_n = var28;
        var8.field_n = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_m[var38Lifetime1] = (short)var4.i(7088);
          if (var12 == 1) {
            var39Lifetime1 = var5.i((byte) -101);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_j[var38Lifetime1] = (byte) 0;
            } else {
              this.field_j[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_D[var38Lifetime1] = (byte)-1;
              this.field_A[var38Lifetime1] = (short)-1;
            } else {
              this.field_D[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_A[var38Lifetime1] = this.field_m[var38Lifetime1];
              this.field_m[var38Lifetime1] = (short)127;
              if (this.field_A[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_G[var38Lifetime1] = var6.f((byte) 69);
          }
          if (var14 == 1) {
            this.field_r[var38Lifetime1] = var7.f((byte) 76);
          }
          if (var15 == 1) {
            this.field_p[var38Lifetime1] = var8.i((byte) -101);
          }
        }
        this.field_F = -1;
        var4.field_n = var29;
        var5.field_n = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.i((byte) -101);
          if (var43 == 1) {
            var38Lifetime2 = var4.g((byte) -118) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.g((byte) -120) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.g((byte) -121) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_o[var42Lifetime1] = var38Lifetime2;
            this.field_y[var42Lifetime1] = var39Lifetime2;
            this.field_q[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.field_F) {
              this.field_F = var38Lifetime2;
            }
            if (var39Lifetime2 > this.field_F) {
              this.field_F = var39Lifetime2;
            }
            if (var40Lifetime1 > this.field_F) {
              this.field_F = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.g((byte) -118) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_o[var42Lifetime1] = var38Lifetime2;
            this.field_y[var42Lifetime1] = var39Lifetime2;
            this.field_q[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_F) {
              this.field_F = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.g((byte) -122) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_o[var42Lifetime1] = var38Lifetime2;
            this.field_y[var42Lifetime1] = var39Lifetime2;
            this.field_q[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_F) {
              this.field_F = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.g((byte) -117) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_o[var42Lifetime1] = var38Lifetime2;
            this.field_y[var42Lifetime1] = var39Lifetime2;
            this.field_q[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_F) {
              this.field_F = var40Lifetime1;
            }
          }
        }
        this.field_F = this.field_F + 1;
        var4.field_n = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_s[var42Lifetime2] = (byte) 0;
          this.field_u[var42Lifetime2] = (short)var4.i(7088);
          this.field_n[var42Lifetime2] = (short)var4.i(7088);
          this.field_x[var42Lifetime2] = (short)var4.i(7088);
        }
        if (this.field_D != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_D[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_u[var44Lifetime1] & 65535) == this.field_o[var45] &&
                (this.field_n[var44Lifetime1] & 65535) == this.field_y[var45] &&
                (this.field_x[var44Lifetime1] & 65535) == this.field_q[var45]) {
                this.field_D[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_D = null;
          }
        }
        if (var3 == 0) {
          this.field_A = null;
        }
        if (var2 == 0) {
          this.field_j = null;
        }
    }

    final int a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        int var6;
        int var7;
        var2 = 0;
        for (var3 = 0; var3 < this.field_f; var3++) {
          var4 = this.field_M[var3];
          var5 = this.field_B[var3];
          var6 = this.field_E[var3];
          var7 = var4 * var4 + var6 * var6 + var5 * var5;
          if (var7 > var2) {
            var2 = var7;
          }
        }
        var2 = (int)(Math.sqrt((double)var2) + 0.99);
        this.a(param0, param0, param0, var2);
        return var2;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < this.field_f; var5++) {
          this.field_M[var5] = this.field_M[var5] * param0 / param3;
          this.field_B[var5] = this.field_B[var5] * param1 / param3;
          this.field_E[var5] = this.field_E[var5] * param2 / param3;
        }
        this.d();
    }

    final bk a(int param0, int param1, int param2, int param3, int param4) {
        return (bk) ((Object) new pj(this, param0, param1, param2, param3, param4));
    }

    final void a() {
        bl dupTemp$0 = null;
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
        bl var16;
        dd var17;
        dd var18;
        dd var19;
        int var1Lifetime1;
        if (this.field_l != null) {
          return;
        }
        this.field_l = new dd[this.field_F];
        for (var1 = 0; var1 < this.field_F; var1++) {
          this.field_l[var1] = new dd();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_g) {
            return;
          }
          var2 = this.field_o[var1Lifetime1];
          var3 = this.field_y[var1Lifetime1];
          var4 = this.field_q[var1Lifetime1];
          var5 = this.field_M[var3] - this.field_M[var2];
          var6 = this.field_B[var3] - this.field_B[var2];
          var7 = this.field_E[var3] - this.field_E[var2];
          var8 = this.field_M[var4] - this.field_M[var2];
          var9 = this.field_B[var4] - this.field_B[var2];
          var10 = this.field_E[var4] - this.field_E[var2];
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
              if (this.field_j != null) {
                var15 = this.field_j[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_J == null) {
                    this.field_J = new bl[this.field_g];
                  }
                  dupTemp$0 = new bl();
                  this.field_J[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_c = var11;
                  var16.field_f = var12;
                  var16.field_a = var13;
                }
              } else {
                var17 = this.field_l[var2];
                var17.field_g = var17.field_g + var11;
                var17.field_a = var17.field_a + var12;
                var17.field_h = var17.field_h + var13;
                var17.field_f = var17.field_f + 1;
                var18 = this.field_l[var3];
                var18.field_g = var18.field_g + var11;
                var18.field_a = var18.field_a + var12;
                var18.field_h = var18.field_h + var13;
                var18.field_f = var18.field_f + 1;
                var19 = this.field_l[var4];
                var19.field_g = var19.field_g + var11;
                var19.field_a = var19.field_a + var12;
                var19.field_h = var19.field_h + var13;
                var19.field_f = var19.field_f + 1;
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

    private final void a(byte[] param0) {
        byte dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        fj var2;
        fj var3;
        fj var4;
        fj var5;
        fj var6;
        fj var7;
        fj var8;
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
        var2 = new fj(param0);
        var3 = new fj(param0);
        var4 = new fj(param0);
        var5 = new fj(param0);
        var6 = new fj(param0);
        var7 = new fj(param0);
        var8 = new fj(param0);
        var2.field_n = param0.length - 23;
        var9 = var2.i(7088);
        var10 = var2.i(7088);
        var11 = var2.i((byte) -101);
        var12 = var2.i((byte) -101);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.i((byte) -101);
        var16 = var2.i((byte) -101);
        var17 = var2.i((byte) -101);
        var18 = var2.i((byte) -101);
        var19 = var2.i((byte) -101);
        var20 = var2.i(7088);
        var21 = var2.i(7088);
        var22 = var2.i(7088);
        var23 = var2.i(7088);
        var24 = var2.i(7088);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_s = new byte[var11];
          var2.field_n = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.f((byte) 64);
            this.field_s[var28] = dupTemp$0;
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
        this.field_f = var9;
        this.field_g = var10;
        this.field_k = var11;
        this.field_M = new int[var9];
        this.field_B = new int[var9];
        this.field_E = new int[var9];
        this.field_o = new int[var10];
        this.field_y = new int[var10];
        this.field_q = new int[var10];
        if (var19 == 1) {
          this.field_i = new int[var9];
        }
        if (var13 != 0) {
          this.field_j = new byte[var10];
        }
        if (var15 != 255) {
          this.field_I = (byte)var15;
        } else {
          this.field_G = new byte[var10];
        }
        if (var16 == 1) {
          this.field_r = new byte[var10];
        }
        if (var17 == 1) {
          this.field_p = new int[var10];
        }
        if (var18 == 1) {
          this.field_A = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_D = new byte[var10];
        }
        this.field_m = new short[var10];
        if (var11 > 0) {
          this.field_u = new short[var11];
          this.field_n = new short[var11];
          this.field_x = new short[var11];
          if (var26 > 0) {
            this.field_N = new short[var26];
            this.field_z = new short[var26];
            this.field_K = new short[var26];
            this.field_C = new byte[var26];
            this.field_v = new byte[var26];
            this.field_L = new byte[var26];
          }
          if (var27 > 0) {
            this.field_Q = new byte[var27];
            this.field_t = new byte[var27];
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
          var54 = var2.i((byte) -101);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.g((byte) -124);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.g((byte) -128);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.g((byte) -125);
          }
          this.field_M[var53] = var50 + var55;
          this.field_B[var53] = var51 + var56;
          this.field_E[var53] = var52 + var57;
          var50 = this.field_M[var53];
          var51 = this.field_B[var53];
          var52 = this.field_E[var53];
          if (var19 == 1) {
            this.field_i[var53] = var6.i((byte) -101);
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
          this.field_m[var53Lifetime1] = (short)var2.i(7088);
          if (var13 != 0) {
            this.field_j[var53Lifetime1] = var3.f((byte) 78);
          }
          if (var15 == 255) {
            this.field_G[var53Lifetime1] = var4.f((byte) 54);
          }
          if (var16 == 1) {
            this.field_r[var53Lifetime1] = var5.f((byte) 54);
          }
          if (var17 == 1) {
            this.field_p[var53Lifetime1] = var6.i((byte) -101);
          }
          if (var18 == 1) {
            this.field_A[var53Lifetime1] = (short)(var7.i(7088) - 1);
          }
          if (this.field_D != null) {
            if (this.field_A[var53Lifetime1] == -1) {
              this.field_D[var53Lifetime1] = (byte)-1;
            } else {
              this.field_D[var53Lifetime1] = (byte)(var8.i((byte) -101) - 1);
            }
          }
        }
        this.field_F = -1;
        var2.field_n = var36;
        var3.field_n = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.i((byte) -101);
          if (var58 == 1) {
            var53Lifetime2 = var2.g((byte) -123) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.g((byte) -127) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.g((byte) -116) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_o[var57Lifetime1] = var53Lifetime2;
            this.field_y[var57Lifetime1] = var54Lifetime1;
            this.field_q[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.field_F) {
              this.field_F = var53Lifetime2;
            }
            if (var54Lifetime1 > this.field_F) {
              this.field_F = var54Lifetime1;
            }
            if (var55Lifetime1 > this.field_F) {
              this.field_F = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.g((byte) -127) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_o[var57Lifetime1] = var53Lifetime2;
            this.field_y[var57Lifetime1] = var54Lifetime1;
            this.field_q[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_F) {
              this.field_F = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.g((byte) -118) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_o[var57Lifetime1] = var53Lifetime2;
            this.field_y[var57Lifetime1] = var54Lifetime1;
            this.field_q[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_F) {
              this.field_F = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.g((byte) -121) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_o[var57Lifetime1] = var53Lifetime2;
            this.field_y[var57Lifetime1] = var54Lifetime1;
            this.field_q[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_F) {
              this.field_F = var55Lifetime1;
            }
          }
        }
        this.field_F = this.field_F + 1;
        var2.field_n = var43;
        var3.field_n = var44;
        var4.field_n = var45;
        var5.field_n = var46;
        var6.field_n = var47;
        var7.field_n = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_s[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_u[var57Lifetime2] = (short)var2.i(7088);
            this.field_n[var57Lifetime2] = (short)var2.i(7088);
            this.field_x[var57Lifetime2] = (short)var2.i(7088);
          }
          if (var58Lifetime1 == 1) {
            this.field_u[var57Lifetime2] = (short)var3.i(7088);
            this.field_n[var57Lifetime2] = (short)var3.i(7088);
            this.field_x[var57Lifetime2] = (short)var3.i(7088);
            this.field_N[var57Lifetime2] = (short)var4.i(7088);
            this.field_z[var57Lifetime2] = (short)var4.i(7088);
            this.field_K[var57Lifetime2] = (short)var4.i(7088);
            this.field_C[var57Lifetime2] = var5.f((byte) 100);
            this.field_v[var57Lifetime2] = var6.f((byte) 114);
            this.field_L[var57Lifetime2] = var7.f((byte) 52);
          }
          if (var58Lifetime1 == 2) {
            this.field_u[var57Lifetime2] = (short)var3.i(7088);
            this.field_n[var57Lifetime2] = (short)var3.i(7088);
            this.field_x[var57Lifetime2] = (short)var3.i(7088);
            this.field_N[var57Lifetime2] = (short)var4.i(7088);
            this.field_z[var57Lifetime2] = (short)var4.i(7088);
            this.field_K[var57Lifetime2] = (short)var4.i(7088);
            this.field_C[var57Lifetime2] = var5.f((byte) 51);
            this.field_v[var57Lifetime2] = var6.f((byte) 74);
            this.field_L[var57Lifetime2] = var7.f((byte) 86);
            this.field_Q[var57Lifetime2] = var7.f((byte) 22);
            this.field_t[var57Lifetime2] = var7.f((byte) 37);
          }
          if (var58Lifetime1 == 3) {
            this.field_u[var57Lifetime2] = (short)var3.i(7088);
            this.field_n[var57Lifetime2] = (short)var3.i(7088);
            this.field_x[var57Lifetime2] = (short)var3.i(7088);
            this.field_N[var57Lifetime2] = (short)var4.i(7088);
            this.field_z[var57Lifetime2] = (short)var4.i(7088);
            this.field_K[var57Lifetime2] = (short)var4.i(7088);
            this.field_C[var57Lifetime2] = var5.f((byte) 118);
            this.field_v[var57Lifetime2] = var6.f((byte) 119);
            this.field_L[var57Lifetime2] = var7.f((byte) 35);
          }
        }
        if (var14 != 0) {
          var2.field_n = var49;
          var57Lifetime3 = var2.i((byte) -101);
          if (var57Lifetime3 > 0) {
            var2.field_n = var2.field_n + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.i((byte) -101);
          if (var58Lifetime2 > 0) {
            var2.field_n = var2.field_n + 4 * var58Lifetime2;
          }
        }
    }

    private final void d() {
        this.field_l = null;
        this.field_h = null;
        this.field_J = null;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < this.field_f; var4++) {
          if (this.field_M[var4] == param0 &&
            this.field_B[var4] == param1 &&
            this.field_E[var4] == param2) {
            return var4;
          }
        }
        this.field_M[this.field_f] = param0;
        this.field_B[this.field_f] = param1;
        this.field_E[this.field_f] = param2;
        int fieldTemp$0 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        this.field_F = fieldTemp$0;
        return this.field_f - 1;
    }

    private final int a(rm param0, int param1, short param2) {
        int var7 = 0;
        int var4;
        int var5;
        int var6;
        var4 = param0.field_M[param1];
        var5 = param0.field_B[param1];
        var6 = param0.field_E[param1];
        for (var7 = 0; var7 < this.field_f; var7++) {
          if (var4 == this.field_M[var7] &&
            var5 == this.field_B[var7] &&
            var6 == this.field_E[var7]) {
            this.field_H[var7] = (short)(this.field_H[var7] | param2);
            return var7;
          }
        }
        this.field_M[this.field_f] = var4;
        this.field_B[this.field_f] = var5;
        this.field_E[this.field_f] = var6;
        this.field_H[this.field_f] = (short)param2;
        if (param0.field_i != null) {
          this.field_i[this.field_f] = param0.field_i[param1];
        }
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        return fieldTemp$0;
    }

    final void c() {
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
        if (this.field_i != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_f; var3++) {
            var4 = this.field_i[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_w = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_w[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_f; var3++) {
            var4Lifetime2 = this.field_i[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_w[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_i = null;
        }
        if (this.field_p != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_g; var3Lifetime1++) {
            var4Lifetime1 = this.field_p[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_R = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_R[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_g; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_p[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_R[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_p = null;
        }
    }

    private rm(byte[] param0) {
        this.field_I = (byte) 0;
        this.field_F = 0;
        this.field_g = 0;
        this.field_f = 0;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.a(param0);
        } else {
          this.b(param0);
        }
    }

    rm(int param0, int param1, int param2) {
        this.field_I = (byte) 0;
        this.field_F = 0;
        this.field_g = 0;
        this.field_f = 0;
        this.field_M = new int[param0];
        this.field_B = new int[param0];
        this.field_E = new int[param0];
        this.field_i = new int[param0];
        this.field_o = new int[param1];
        this.field_y = new int[param1];
        this.field_q = new int[param1];
        this.field_j = new byte[param1];
        this.field_G = new byte[param1];
        this.field_r = new byte[param1];
        this.field_m = new short[param1];
        this.field_A = new short[param1];
        this.field_D = new byte[param1];
        this.field_p = new int[param1];
        if (param2 > 0) {
          this.field_s = new byte[param2];
          this.field_u = new short[param2];
          this.field_n = new short[param2];
          this.field_x = new short[param2];
          this.field_N = new short[param2];
          this.field_z = new short[param2];
          this.field_K = new short[param2];
          this.field_C = new byte[param2];
          this.field_v = new byte[param2];
          this.field_L = new byte[param2];
          this.field_Q = new byte[param2];
          this.field_t = new byte[param2];
        }
    }

    rm(rm[] param0, int param1) {
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
        rm var10_ref_rm;
        rm var11;
        int var12;
        int var13;
        int var14;
        rm var15;
        rm var16;
        int var17;
        rm var18;
        rm var19;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        rm var11Lifetime1;
        this.field_I = (byte) 0;
        this.field_F = 0;
        this.field_g = 0;
        this.field_f = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        this.field_f = 0;
        this.field_g = 0;
        this.field_k = 0;
        this.field_I = (byte) -1;
        for (var9 = 0; var9 < param1; var9++) {
          var10_ref_rm = param0[var9];
          if (var10_ref_rm != null) {
            this.field_f = this.field_f + var10_ref_rm.field_f;
            this.field_g = this.field_g + var10_ref_rm.field_g;
            this.field_k = this.field_k + var10_ref_rm.field_k;
            if (var10_ref_rm.field_G == null) {
              if (this.field_I == -1) {
                this.field_I = var10_ref_rm.field_I;
              }
              if (this.field_I != var10_ref_rm.field_I) {
                var4 = 1;
              }
            } else {
              var4 = 1;
            }
            stackIn_13_0 = var3;
            if (var10_ref_rm.field_j == null) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            var3 = stackIn_13_0 | stackIn_14_1;
            stackIn_16_0 = var5;
            if (var10_ref_rm.field_r == null) {
              stackIn_17_1 = 0;
            } else {
              stackIn_17_1 = 1;
            }
            var5 = stackIn_16_0 | stackIn_17_1;
            stackIn_19_0 = var6;
            if (var10_ref_rm.field_p == null) {
              stackIn_20_1 = 0;
            } else {
              stackIn_20_1 = 1;
            }
            var6 = stackIn_19_0 | stackIn_20_1;
            stackIn_22_0 = var7;
            if (var10_ref_rm.field_A == null) {
              stackIn_23_1 = 0;
            } else {
              stackIn_23_1 = 1;
            }
            var7 = stackIn_22_0 | stackIn_23_1;
            stackIn_25_0 = var8;
            if (var10_ref_rm.field_D == null) {
              stackIn_26_1 = 0;
            } else {
              stackIn_26_1 = 1;
            }
            var8 = stackIn_25_0 | stackIn_26_1;
          }
        }
        this.field_M = new int[this.field_f];
        this.field_B = new int[this.field_f];
        this.field_E = new int[this.field_f];
        this.field_i = new int[this.field_f];
        this.field_H = new short[this.field_f];
        this.field_o = new int[this.field_g];
        this.field_y = new int[this.field_g];
        this.field_q = new int[this.field_g];
        if (var3 != 0) {
          this.field_j = new byte[this.field_g];
        }
        if (var4 != 0) {
          this.field_G = new byte[this.field_g];
        }
        if (var5 != 0) {
          this.field_r = new byte[this.field_g];
        }
        if (var6 != 0) {
          this.field_p = new int[this.field_g];
        }
        if (var7 != 0) {
          this.field_A = new short[this.field_g];
        }
        if (var8 != 0) {
          this.field_D = new byte[this.field_g];
        }
        this.field_m = new short[this.field_g];
        this.field_P = new short[this.field_g];
        if (this.field_k > 0) {
          this.field_s = new byte[this.field_k];
          this.field_u = new short[this.field_k];
          this.field_n = new short[this.field_k];
          this.field_x = new short[this.field_k];
          this.field_N = new short[this.field_k];
          this.field_z = new short[this.field_k];
          this.field_K = new short[this.field_k];
          this.field_C = new byte[this.field_k];
          this.field_v = new byte[this.field_k];
          this.field_L = new byte[this.field_k];
          this.field_Q = new byte[this.field_k];
          this.field_t = new byte[this.field_k];
        }
        this.field_f = 0;
        this.field_g = 0;
        this.field_k = 0;
        for (var9Lifetime1 = 0; var9Lifetime1 < param1; var9Lifetime1++) {
          var10 = (short)(1 << var9Lifetime1);
          var15 = param0[var9Lifetime1];
          var18 = var15;
          var11 = var18;
          if (var11 != null) {
            for (var12 = 0; var12 < var18.field_g; var12++) {
              if (var3 != 0 &&
                var18.field_j != null) {
                this.field_j[this.field_g] = var15.field_j[var12];
              }
              if (var4 != 0) {
                if (var18.field_G == null) {
                  this.field_G[this.field_g] = var15.field_I;
                } else {
                  this.field_G[this.field_g] = var15.field_G[var12];
                }
              }
              if (var5 != 0 &&
                var18.field_r != null) {
                this.field_r[this.field_g] = var15.field_r[var12];
              }
              if (var6 != 0 &&
                var18.field_p != null) {
                this.field_p[this.field_g] = var15.field_p[var12];
              }
              if (var7 != 0) {
                if (var18.field_A == null) {
                  this.field_A[this.field_g] = (short)-1;
                } else {
                  this.field_A[this.field_g] = var15.field_A[var12];
                }
              }
              this.field_m[this.field_g] = var15.field_m[var12];
              this.field_P[this.field_g] = (short)var10;
              this.field_o[this.field_g] = this.a(var15, var15.field_o[var12], (short) var10);
              this.field_y[this.field_g] = this.a(var15, var15.field_y[var12], (short) var10);
              this.field_q[this.field_g] = this.a(var15, var15.field_q[var12], (short) var10);
              this.field_g = this.field_g + 1;
            }
          }
        }
        var9Lifetime2 = 0;
        this.field_F = this.field_f;
        for (var10Lifetime1 = 0; var10Lifetime1 < param1; var10Lifetime1++) {
          var16 = param0[var10Lifetime1];
          var19 = var16;
          var11Lifetime1 = var19;
          var12Lifetime1 = (short)(1 << var10Lifetime1);
          if (var11Lifetime1 != null) {
            for (var13 = 0; var13 < var19.field_g; var13++) {
              if (var8 != 0) {
                incrementValue$1 = var9Lifetime2;
                var9Lifetime2++;
                stackIn_82_0 = this.field_D;
                stackIn_82_1 = incrementValue$1;
                if (var19.field_D != null &&
                  var16.field_D[var13] != -1) {
                  stackIn_83_2 = var16.field_D[var13] + this.field_k;
                } else {
                  stackIn_83_2 = -1;
                }
                stackIn_82_0[stackIn_82_1] = (byte)stackIn_83_2;
              }
            }
            var17 = 0;
            var13Lifetime1 = var17;
            while (var17 < var19.field_k) {
              dupTemp$0 = var16.field_s[var17];
              this.field_s[this.field_k] = dupTemp$0;
              var14 = dupTemp$0;
              if (var14 == 0) {
                this.field_u[this.field_k] = (short)this.a(var16, (int) var16.field_u[var17], (short) var12Lifetime1);
                this.field_n[this.field_k] = (short)this.a(var16, (int) var16.field_n[var17], (short) var12Lifetime1);
                this.field_x[this.field_k] = (short)this.a(var16, (int) var16.field_x[var17], (short) var12Lifetime1);
              }
              if (var14 >= 1 &&
                var14 <= 3) {
                this.field_u[this.field_k] = var16.field_u[var17];
                this.field_n[this.field_k] = var16.field_n[var17];
                this.field_x[this.field_k] = var16.field_x[var17];
                this.field_N[this.field_k] = var16.field_N[var17];
                this.field_z[this.field_k] = var16.field_z[var17];
                this.field_K[this.field_k] = var16.field_K[var17];
                this.field_C[this.field_k] = var16.field_C[var17];
                this.field_v[this.field_k] = var16.field_v[var17];
                this.field_L[this.field_k] = var16.field_L[var17];
              }
              if (var14 == 2) {
                this.field_Q[this.field_k] = var16.field_Q[var17];
                this.field_t[this.field_k] = var16.field_t[var17];
              }
              this.field_k = this.field_k + 1;
              var17++;
            }
          }
        }
    }

    rm(rm param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        this.field_I = (byte) 0;
        this.field_F = 0;
        this.field_g = 0;
        this.field_f = 0;
        this.field_f = param0.field_f;
        this.field_F = param0.field_F;
        this.field_g = param0.field_g;
        this.field_k = param0.field_k;
        if (!param1) {
          this.field_M = new int[this.field_f];
          this.field_B = new int[this.field_f];
          this.field_E = new int[this.field_f];
          for (var6 = 0; var6 < this.field_f; var6++) {
            this.field_M[var6] = param0.field_M[var6];
            this.field_B[var6] = param0.field_B[var6];
            this.field_E[var6] = param0.field_E[var6];
          }
        } else {
          this.field_M = param0.field_M;
          this.field_B = param0.field_B;
          this.field_E = param0.field_E;
        }
        if (!param2) {
          this.field_m = new short[this.field_g];
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_g; var6Lifetime1++) {
            this.field_m[var6Lifetime1] = param0.field_m[var6Lifetime1];
          }
        } else {
          this.field_m = param0.field_m;
        }
        if (!param3 &&
          param0.field_A != null) {
          this.field_A = new short[this.field_g];
          for (var6Lifetime2 = 0; var6Lifetime2 < this.field_g; var6Lifetime2++) {
            this.field_A[var6Lifetime2] = param0.field_A[var6Lifetime2];
          }
        } else {
          this.field_A = param0.field_A;
        }
        if (!param4) {
          this.field_r = new byte[this.field_g];
          if (param0.field_r != null) {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_g; var6Lifetime3++) {
              this.field_r[var6Lifetime3] = param0.field_r[var6Lifetime3];
            }
          } else {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_g; var6Lifetime3++) {
              this.field_r[var6Lifetime3] = (byte) 0;
            }
          }
        } else {
          this.field_r = param0.field_r;
        }
        this.field_o = param0.field_o;
        this.field_y = param0.field_y;
        this.field_q = param0.field_q;
        this.field_j = param0.field_j;
        this.field_G = param0.field_G;
        this.field_D = param0.field_D;
        this.field_I = param0.field_I;
        this.field_s = param0.field_s;
        this.field_u = param0.field_u;
        this.field_n = param0.field_n;
        this.field_x = param0.field_x;
        this.field_N = param0.field_N;
        this.field_z = param0.field_z;
        this.field_K = param0.field_K;
        this.field_C = param0.field_C;
        this.field_v = param0.field_v;
        this.field_L = param0.field_L;
        this.field_Q = param0.field_Q;
        this.field_t = param0.field_t;
        this.field_i = param0.field_i;
        this.field_p = param0.field_p;
        this.field_w = param0.field_w;
        this.field_R = param0.field_R;
        this.field_l = param0.field_l;
        this.field_J = param0.field_J;
        this.field_h = param0.field_h;
    }
}
