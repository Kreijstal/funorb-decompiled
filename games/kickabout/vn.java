/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends cv {
    private byte[] field_N;
    rn[] field_q;
    short[] field_u;
    ia[] field_J;
    byte[] field_I;
    int[] field_L;
    short[] field_h;
    byte[] field_o;
    int[] field_r;
    private byte[] field_G;
    int[] field_l;
    int[][] field_s;
    private byte[] field_x;
    int[] field_A;
    short[] field_K;
    int[][] field_v;
    int[] field_H;
    private short[] field_S;
    int field_R;
    int field_m;
    rn[] field_i;
    short[] field_p;
    private byte[] field_E;
    int[] field_w;
    short[] field_B;
    short[] field_n;
    byte[] field_z;
    int field_D;
    private short[] field_P;
    private byte[] field_Q;
    private short[] field_j;
    short[] field_y;
    byte[] field_k;
    private int[] field_O;
    int field_t;
    byte[] field_T;
    private int[] field_C;
    private byte field_F;

    private final int a(vn param0, int param1, short param2) {
        int var7 = 0;
        int var4;
        int var5;
        int var6;
        var4 = param0.field_H[param1];
        var5 = param0.field_l[param1];
        var6 = param0.field_A[param1];
        for (var7 = 0; var7 < this.field_m; var7++) {
          if (var4 == this.field_H[var7] &&
            var5 == this.field_l[var7] &&
            var6 == this.field_A[var7]) {
            this.field_n[var7] = (short)(this.field_n[var7] | param2);
            return var7;
          }
        }
        this.field_H[this.field_m] = var4;
        this.field_l[this.field_m] = var5;
        this.field_A[this.field_m] = var6;
        this.field_n[this.field_m] = (short)param2;
        if (param0.field_C != null) {
          this.field_C[this.field_m] = param0.field_C[param1];
        }
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        return fieldTemp$0;
    }

    final static vn a(sj param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, param1, 28);
        if (var3 == null) {
          return null;
        }
        return new vn(var3);
    }

    private final void b(byte[] param0) {
        int var2;
        int var3;
        iw var4;
        iw var5;
        iw var6;
        iw var7;
        iw var8;
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
        var4 = new iw(param0);
        var5 = new iw(param0);
        var6 = new iw(param0);
        var7 = new iw(param0);
        var8 = new iw(param0);
        var4.field_n = param0.length - 18;
        var9 = var4.a((byte) 81);
        var10 = var4.a((byte) 81);
        var11 = var4.h((byte) -123);
        var12 = var4.h((byte) -118);
        var13 = var4.h((byte) -122);
        var14 = var4.h((byte) -126);
        var15 = var4.h((byte) -110);
        var16 = var4.h((byte) -124);
        var17 = var4.a((byte) 81);
        var18 = var4.a((byte) 81);
        var19 = var4.a((byte) 81);
        var20 = var4.a((byte) 81);
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
        this.field_m = var9;
        this.field_D = var10;
        this.field_R = var11;
        this.field_H = new int[var9];
        this.field_l = new int[var9];
        this.field_A = new int[var9];
        this.field_r = new int[var10];
        this.field_L = new int[var10];
        this.field_w = new int[var10];
        if (var11 > 0) {
          this.field_T = new byte[var11];
          this.field_h = new short[var11];
          this.field_B = new short[var11];
          this.field_y = new short[var11];
        }
        if (var16 == 1) {
          this.field_C = new int[var9];
        }
        if (var12 == 1) {
          this.field_o = new byte[var10];
          this.field_I = new byte[var10];
          this.field_u = new short[var10];
        }
        if (var13 != 255) {
          this.field_F = (byte)var13;
        } else {
          this.field_z = new byte[var10];
        }
        if (var14 == 1) {
          this.field_k = new byte[var10];
        }
        if (var15 == 1) {
          this.field_O = new int[var10];
        }
        this.field_p = new short[var10];
        var4.field_n = var22;
        var5.field_n = var32;
        var6.field_n = var33;
        var7.field_n = var34;
        var8.field_n = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.h((byte) -126);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.e(1);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.e(-10);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.e(29);
          }
          this.field_H[var38] = var35 + var40;
          this.field_l[var38] = var36 + var41;
          this.field_A[var38] = var37 + var42;
          var35 = this.field_H[var38];
          var36 = this.field_l[var38];
          var37 = this.field_A[var38];
          if (var16 == 1) {
            this.field_C[var38] = var8.h((byte) -122);
          }
        }
        var4.field_n = var30;
        var5.field_n = var26;
        var6.field_n = var24;
        var7.field_n = var28;
        var8.field_n = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_p[var38Lifetime1] = (short)var4.a((byte) 81);
          if (var12 == 1) {
            var39Lifetime1 = var5.h((byte) -108);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_o[var38Lifetime1] = (byte) 0;
            } else {
              this.field_o[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_I[var38Lifetime1] = (byte)-1;
              this.field_u[var38Lifetime1] = (short)-1;
            } else {
              this.field_I[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_u[var38Lifetime1] = this.field_p[var38Lifetime1];
              this.field_p[var38Lifetime1] = (short)127;
              if (this.field_u[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_z[var38Lifetime1] = var6.j((byte) -81);
          }
          if (var14 == 1) {
            this.field_k[var38Lifetime1] = var7.j((byte) -70);
          }
          if (var15 == 1) {
            this.field_O[var38Lifetime1] = var8.h((byte) -106);
          }
        }
        this.field_t = -1;
        var4.field_n = var29;
        var5.field_n = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.h((byte) -112);
          if (var43 == 1) {
            var38Lifetime2 = var4.e(29) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.e(1) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.e(-124) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_r[var42Lifetime1] = var38Lifetime2;
            this.field_L[var42Lifetime1] = var39Lifetime2;
            this.field_w[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.field_t) {
              this.field_t = var38Lifetime2;
            }
            if (var39Lifetime2 > this.field_t) {
              this.field_t = var39Lifetime2;
            }
            if (var40Lifetime1 > this.field_t) {
              this.field_t = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.e(-110) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_r[var42Lifetime1] = var38Lifetime2;
            this.field_L[var42Lifetime1] = var39Lifetime2;
            this.field_w[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_t) {
              this.field_t = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.e(15) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_r[var42Lifetime1] = var38Lifetime2;
            this.field_L[var42Lifetime1] = var39Lifetime2;
            this.field_w[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_t) {
              this.field_t = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.e(-113) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_r[var42Lifetime1] = var38Lifetime2;
            this.field_L[var42Lifetime1] = var39Lifetime2;
            this.field_w[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_t) {
              this.field_t = var40Lifetime1;
            }
          }
        }
        this.field_t = this.field_t + 1;
        var4.field_n = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_T[var42Lifetime2] = (byte) 0;
          this.field_h[var42Lifetime2] = (short)var4.a((byte) 81);
          this.field_B[var42Lifetime2] = (short)var4.a((byte) 81);
          this.field_y[var42Lifetime2] = (short)var4.a((byte) 81);
        }
        if (this.field_I != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_I[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_h[var44Lifetime1] & 65535) == this.field_r[var45] &&
                (this.field_B[var44Lifetime1] & 65535) == this.field_L[var45] &&
                (this.field_y[var44Lifetime1] & 65535) == this.field_w[var45]) {
                this.field_I[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_I = null;
          }
        }
        if (var3 == 0) {
          this.field_u = null;
        }
        if (var2 == 0) {
          this.field_o = null;
        }
    }

    final eg b(int param0, int param1, int param2, int param3, int param4) {
        return new eg(this, param0, param1, param2, param3, param4);
    }

    final void b() {
        ia dupTemp$0 = null;
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
        ia var16;
        rn var17;
        rn var18;
        rn var19;
        int var1Lifetime1;
        if (this.field_i != null) {
          return;
        }
        this.field_i = new rn[this.field_t];
        for (var1 = 0; var1 < this.field_t; var1++) {
          this.field_i[var1] = new rn();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_D) {
            return;
          }
          var2 = this.field_r[var1Lifetime1];
          var3 = this.field_L[var1Lifetime1];
          var4 = this.field_w[var1Lifetime1];
          var5 = this.field_H[var3] - this.field_H[var2];
          var6 = this.field_l[var3] - this.field_l[var2];
          var7 = this.field_A[var3] - this.field_A[var2];
          var8 = this.field_H[var4] - this.field_H[var2];
          var9 = this.field_l[var4] - this.field_l[var2];
          var10 = this.field_A[var4] - this.field_A[var2];
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
              if (this.field_o != null) {
                var15 = this.field_o[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_J == null) {
                    this.field_J = new ia[this.field_D];
                  }
                  dupTemp$0 = new ia();
                  this.field_J[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_f = var11;
                  var16.field_a = var12;
                  var16.field_g = var13;
                }
              } else {
                var17 = this.field_i[var2];
                var17.field_a = var17.field_a + var11;
                var17.field_b = var17.field_b + var12;
                var17.field_f = var17.field_f + var13;
                var17.field_g = var17.field_g + 1;
                var18 = this.field_i[var3];
                var18.field_a = var18.field_a + var11;
                var18.field_b = var18.field_b + var12;
                var18.field_f = var18.field_f + var13;
                var18.field_g = var18.field_g + 1;
                var19 = this.field_i[var4];
                var19.field_a = var19.field_a + var11;
                var19.field_b = var19.field_b + var12;
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

    private final void a(byte[] param0) {
        byte dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        iw var2;
        iw var3;
        iw var4;
        iw var5;
        iw var6;
        iw var7;
        iw var8;
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
        var2 = new iw(param0);
        var3 = new iw(param0);
        var4 = new iw(param0);
        var5 = new iw(param0);
        var6 = new iw(param0);
        var7 = new iw(param0);
        var8 = new iw(param0);
        var2.field_n = param0.length - 23;
        var9 = var2.a((byte) 81);
        var10 = var2.a((byte) 81);
        var11 = var2.h((byte) -118);
        var12 = var2.h((byte) -120);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.h((byte) -121);
        var16 = var2.h((byte) -126);
        var17 = var2.h((byte) -112);
        var18 = var2.h((byte) -114);
        var19 = var2.h((byte) -128);
        var20 = var2.a((byte) 81);
        var21 = var2.a((byte) 81);
        var22 = var2.a((byte) 81);
        var23 = var2.a((byte) 81);
        var24 = var2.a((byte) 81);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_T = new byte[var11];
          var2.field_n = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.j((byte) -114);
            this.field_T[var28] = dupTemp$0;
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
        this.field_m = var9;
        this.field_D = var10;
        this.field_R = var11;
        this.field_H = new int[var9];
        this.field_l = new int[var9];
        this.field_A = new int[var9];
        this.field_r = new int[var10];
        this.field_L = new int[var10];
        this.field_w = new int[var10];
        if (var19 == 1) {
          this.field_C = new int[var9];
        }
        if (var13 != 0) {
          this.field_o = new byte[var10];
        }
        if (var15 != 255) {
          this.field_F = (byte)var15;
        } else {
          this.field_z = new byte[var10];
        }
        if (var16 == 1) {
          this.field_k = new byte[var10];
        }
        if (var17 == 1) {
          this.field_O = new int[var10];
        }
        if (var18 == 1) {
          this.field_u = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_I = new byte[var10];
        }
        this.field_p = new short[var10];
        if (var11 > 0) {
          this.field_h = new short[var11];
          this.field_B = new short[var11];
          this.field_y = new short[var11];
          if (var26 > 0) {
            this.field_S = new short[var26];
            this.field_P = new short[var26];
            this.field_j = new short[var26];
            this.field_x = new byte[var26];
            this.field_E = new byte[var26];
            this.field_Q = new byte[var26];
          }
          if (var27 > 0) {
            this.field_N = new byte[var27];
            this.field_G = new byte[var27];
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
          var54 = var2.h((byte) -111);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.e(-115);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.e(-124);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.e(57);
          }
          this.field_H[var53] = var50 + var55;
          this.field_l[var53] = var51 + var56;
          this.field_A[var53] = var52 + var57;
          var50 = this.field_H[var53];
          var51 = this.field_l[var53];
          var52 = this.field_A[var53];
          if (var19 == 1) {
            this.field_C[var53] = var6.h((byte) -112);
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
          this.field_p[var53Lifetime1] = (short)var2.a((byte) 81);
          if (var13 != 0) {
            this.field_o[var53Lifetime1] = var3.j((byte) -125);
          }
          if (var15 == 255) {
            this.field_z[var53Lifetime1] = var4.j((byte) -120);
          }
          if (var16 == 1) {
            this.field_k[var53Lifetime1] = var5.j((byte) -96);
          }
          if (var17 == 1) {
            this.field_O[var53Lifetime1] = var6.h((byte) -125);
          }
          if (var18 == 1) {
            this.field_u[var53Lifetime1] = (short)(var7.a((byte) 81) - 1);
          }
          if (this.field_I != null) {
            if (this.field_u[var53Lifetime1] == -1) {
              this.field_I[var53Lifetime1] = (byte)-1;
            } else {
              this.field_I[var53Lifetime1] = (byte)(var8.h((byte) -108) - 1);
            }
          }
        }
        this.field_t = -1;
        var2.field_n = var36;
        var3.field_n = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.h((byte) -124);
          if (var58 == 1) {
            var53Lifetime2 = var2.e(-117) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.e(60) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.e(-116) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_r[var57Lifetime1] = var53Lifetime2;
            this.field_L[var57Lifetime1] = var54Lifetime1;
            this.field_w[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.field_t) {
              this.field_t = var53Lifetime2;
            }
            if (var54Lifetime1 > this.field_t) {
              this.field_t = var54Lifetime1;
            }
            if (var55Lifetime1 > this.field_t) {
              this.field_t = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.e(-127) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_r[var57Lifetime1] = var53Lifetime2;
            this.field_L[var57Lifetime1] = var54Lifetime1;
            this.field_w[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_t) {
              this.field_t = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.e(-115) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_r[var57Lifetime1] = var53Lifetime2;
            this.field_L[var57Lifetime1] = var54Lifetime1;
            this.field_w[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_t) {
              this.field_t = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.e(-123) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_r[var57Lifetime1] = var53Lifetime2;
            this.field_L[var57Lifetime1] = var54Lifetime1;
            this.field_w[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_t) {
              this.field_t = var55Lifetime1;
            }
          }
        }
        this.field_t = this.field_t + 1;
        var2.field_n = var43;
        var3.field_n = var44;
        var4.field_n = var45;
        var5.field_n = var46;
        var6.field_n = var47;
        var7.field_n = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_T[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_h[var57Lifetime2] = (short)var2.a((byte) 81);
            this.field_B[var57Lifetime2] = (short)var2.a((byte) 81);
            this.field_y[var57Lifetime2] = (short)var2.a((byte) 81);
          }
          if (var58Lifetime1 == 1) {
            this.field_h[var57Lifetime2] = (short)var3.a((byte) 81);
            this.field_B[var57Lifetime2] = (short)var3.a((byte) 81);
            this.field_y[var57Lifetime2] = (short)var3.a((byte) 81);
            this.field_S[var57Lifetime2] = (short)var4.a((byte) 81);
            this.field_P[var57Lifetime2] = (short)var4.a((byte) 81);
            this.field_j[var57Lifetime2] = (short)var4.a((byte) 81);
            this.field_x[var57Lifetime2] = var5.j((byte) -100);
            this.field_E[var57Lifetime2] = var6.j((byte) -58);
            this.field_Q[var57Lifetime2] = var7.j((byte) -48);
          }
          if (var58Lifetime1 == 2) {
            this.field_h[var57Lifetime2] = (short)var3.a((byte) 81);
            this.field_B[var57Lifetime2] = (short)var3.a((byte) 81);
            this.field_y[var57Lifetime2] = (short)var3.a((byte) 81);
            this.field_S[var57Lifetime2] = (short)var4.a((byte) 81);
            this.field_P[var57Lifetime2] = (short)var4.a((byte) 81);
            this.field_j[var57Lifetime2] = (short)var4.a((byte) 81);
            this.field_x[var57Lifetime2] = var5.j((byte) -109);
            this.field_E[var57Lifetime2] = var6.j((byte) -113);
            this.field_Q[var57Lifetime2] = var7.j((byte) -111);
            this.field_N[var57Lifetime2] = var7.j((byte) -92);
            this.field_G[var57Lifetime2] = var7.j((byte) -111);
          }
          if (var58Lifetime1 == 3) {
            this.field_h[var57Lifetime2] = (short)var3.a((byte) 81);
            this.field_B[var57Lifetime2] = (short)var3.a((byte) 81);
            this.field_y[var57Lifetime2] = (short)var3.a((byte) 81);
            this.field_S[var57Lifetime2] = (short)var4.a((byte) 81);
            this.field_P[var57Lifetime2] = (short)var4.a((byte) 81);
            this.field_j[var57Lifetime2] = (short)var4.a((byte) 81);
            this.field_x[var57Lifetime2] = var5.j((byte) -102);
            this.field_E[var57Lifetime2] = var6.j((byte) -102);
            this.field_Q[var57Lifetime2] = var7.j((byte) -76);
          }
        }
        if (var14 != 0) {
          var2.field_n = var49;
          var57Lifetime3 = var2.h((byte) -111);
          if (var57Lifetime3 > 0) {
            var2.field_n = var2.field_n + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.h((byte) -121);
          if (var58Lifetime2 > 0) {
            var2.field_n = var2.field_n + 4 * var58Lifetime2;
          }
        }
    }

    final void a() {
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
        if (this.field_C != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_m; var3++) {
            var4 = this.field_C[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_s = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_s[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_m; var3++) {
            var4Lifetime2 = this.field_C[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_s[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_C = null;
        }
        if (this.field_O != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_D; var3Lifetime1++) {
            var4Lifetime1 = this.field_O[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_v = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_v[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_D; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_O[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_v[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_O = null;
        }
    }

    final qc a(int param0, int param1, int param2, int param3, int param4) {
        return (qc) ((Object) new eg(this, param0, param1, param2, param3, param4));
    }

    private vn(byte[] param0) {
        this.field_D = 0;
        this.field_m = 0;
        this.field_t = 0;
        this.field_F = (byte) 0;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.a(param0);
        } else {
          this.b(param0);
        }
    }

    vn(vn[] param0, int param1) {
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
        vn var10_ref_vn;
        vn var11;
        int var12;
        int var13;
        int var14;
        vn var15;
        vn var16;
        int var17;
        vn var18;
        vn var19;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        vn var11Lifetime1;
        this.field_D = 0;
        this.field_m = 0;
        this.field_t = 0;
        this.field_F = (byte) 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        this.field_m = 0;
        this.field_D = 0;
        this.field_R = 0;
        this.field_F = (byte) -1;
        for (var9 = 0; var9 < param1; var9++) {
          var10_ref_vn = param0[var9];
          if (var10_ref_vn != null) {
            this.field_m = this.field_m + var10_ref_vn.field_m;
            this.field_D = this.field_D + var10_ref_vn.field_D;
            this.field_R = this.field_R + var10_ref_vn.field_R;
            if (var10_ref_vn.field_z == null) {
              if (this.field_F == -1) {
                this.field_F = var10_ref_vn.field_F;
              }
              if (this.field_F != var10_ref_vn.field_F) {
                var4 = 1;
              }
            } else {
              var4 = 1;
            }
            stackIn_13_0 = var3;
            if (var10_ref_vn.field_o == null) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            var3 = stackIn_13_0 | stackIn_14_1;
            stackIn_16_0 = var5;
            if (var10_ref_vn.field_k == null) {
              stackIn_17_1 = 0;
            } else {
              stackIn_17_1 = 1;
            }
            var5 = stackIn_16_0 | stackIn_17_1;
            stackIn_19_0 = var6;
            if (var10_ref_vn.field_O == null) {
              stackIn_20_1 = 0;
            } else {
              stackIn_20_1 = 1;
            }
            var6 = stackIn_19_0 | stackIn_20_1;
            stackIn_22_0 = var7;
            if (var10_ref_vn.field_u == null) {
              stackIn_23_1 = 0;
            } else {
              stackIn_23_1 = 1;
            }
            var7 = stackIn_22_0 | stackIn_23_1;
            stackIn_25_0 = var8;
            if (var10_ref_vn.field_I == null) {
              stackIn_26_1 = 0;
            } else {
              stackIn_26_1 = 1;
            }
            var8 = stackIn_25_0 | stackIn_26_1;
          }
        }
        this.field_H = new int[this.field_m];
        this.field_l = new int[this.field_m];
        this.field_A = new int[this.field_m];
        this.field_C = new int[this.field_m];
        this.field_n = new short[this.field_m];
        this.field_r = new int[this.field_D];
        this.field_L = new int[this.field_D];
        this.field_w = new int[this.field_D];
        if (var3 != 0) {
          this.field_o = new byte[this.field_D];
        }
        if (var4 != 0) {
          this.field_z = new byte[this.field_D];
        }
        if (var5 != 0) {
          this.field_k = new byte[this.field_D];
        }
        if (var6 != 0) {
          this.field_O = new int[this.field_D];
        }
        if (var7 != 0) {
          this.field_u = new short[this.field_D];
        }
        if (var8 != 0) {
          this.field_I = new byte[this.field_D];
        }
        this.field_p = new short[this.field_D];
        this.field_K = new short[this.field_D];
        if (this.field_R > 0) {
          this.field_T = new byte[this.field_R];
          this.field_h = new short[this.field_R];
          this.field_B = new short[this.field_R];
          this.field_y = new short[this.field_R];
          this.field_S = new short[this.field_R];
          this.field_P = new short[this.field_R];
          this.field_j = new short[this.field_R];
          this.field_x = new byte[this.field_R];
          this.field_E = new byte[this.field_R];
          this.field_Q = new byte[this.field_R];
          this.field_N = new byte[this.field_R];
          this.field_G = new byte[this.field_R];
        }
        this.field_m = 0;
        this.field_D = 0;
        this.field_R = 0;
        for (var9Lifetime1 = 0; var9Lifetime1 < param1; var9Lifetime1++) {
          var10 = (short)(1 << var9Lifetime1);
          var15 = param0[var9Lifetime1];
          var18 = var15;
          var11 = var18;
          if (var11 != null) {
            for (var12 = 0; var12 < var18.field_D; var12++) {
              if (var3 != 0 &&
                var18.field_o != null) {
                this.field_o[this.field_D] = var15.field_o[var12];
              }
              if (var4 != 0) {
                if (var18.field_z == null) {
                  this.field_z[this.field_D] = var15.field_F;
                } else {
                  this.field_z[this.field_D] = var15.field_z[var12];
                }
              }
              if (var5 != 0 &&
                var18.field_k != null) {
                this.field_k[this.field_D] = var15.field_k[var12];
              }
              if (var6 != 0 &&
                var18.field_O != null) {
                this.field_O[this.field_D] = var15.field_O[var12];
              }
              if (var7 != 0) {
                if (var18.field_u == null) {
                  this.field_u[this.field_D] = (short)-1;
                } else {
                  this.field_u[this.field_D] = var15.field_u[var12];
                }
              }
              this.field_p[this.field_D] = var15.field_p[var12];
              this.field_K[this.field_D] = (short)var10;
              this.field_r[this.field_D] = this.a(var15, var15.field_r[var12], (short) var10);
              this.field_L[this.field_D] = this.a(var15, var15.field_L[var12], (short) var10);
              this.field_w[this.field_D] = this.a(var15, var15.field_w[var12], (short) var10);
              this.field_D = this.field_D + 1;
            }
          }
        }
        var9Lifetime2 = 0;
        this.field_t = this.field_m;
        for (var10Lifetime1 = 0; var10Lifetime1 < param1; var10Lifetime1++) {
          var16 = param0[var10Lifetime1];
          var19 = var16;
          var11Lifetime1 = var19;
          var12Lifetime1 = (short)(1 << var10Lifetime1);
          if (var11Lifetime1 != null) {
            for (var13 = 0; var13 < var19.field_D; var13++) {
              if (var8 != 0) {
                incrementValue$1 = var9Lifetime2;
                var9Lifetime2++;
                stackIn_82_0 = this.field_I;
                stackIn_82_1 = incrementValue$1;
                if (var19.field_I != null &&
                  var16.field_I[var13] != -1) {
                  stackIn_83_2 = var16.field_I[var13] + this.field_R;
                } else {
                  stackIn_83_2 = -1;
                }
                stackIn_82_0[stackIn_82_1] = (byte)stackIn_83_2;
              }
            }
            var17 = 0;
            var13Lifetime1 = var17;
            while (var17 < var19.field_R) {
              dupTemp$0 = var16.field_T[var17];
              this.field_T[this.field_R] = dupTemp$0;
              var14 = dupTemp$0;
              if (var14 == 0) {
                this.field_h[this.field_R] = (short)this.a(var16, (int) var16.field_h[var17], (short) var12Lifetime1);
                this.field_B[this.field_R] = (short)this.a(var16, (int) var16.field_B[var17], (short) var12Lifetime1);
                this.field_y[this.field_R] = (short)this.a(var16, (int) var16.field_y[var17], (short) var12Lifetime1);
              }
              if (var14 >= 1 &&
                var14 <= 3) {
                this.field_h[this.field_R] = var16.field_h[var17];
                this.field_B[this.field_R] = var16.field_B[var17];
                this.field_y[this.field_R] = var16.field_y[var17];
                this.field_S[this.field_R] = var16.field_S[var17];
                this.field_P[this.field_R] = var16.field_P[var17];
                this.field_j[this.field_R] = var16.field_j[var17];
                this.field_x[this.field_R] = var16.field_x[var17];
                this.field_E[this.field_R] = var16.field_E[var17];
                this.field_Q[this.field_R] = var16.field_Q[var17];
              }
              if (var14 == 2) {
                this.field_N[this.field_R] = var16.field_N[var17];
                this.field_G[this.field_R] = var16.field_G[var17];
              }
              this.field_R = this.field_R + 1;
              var17++;
            }
          }
        }
    }

    vn(vn param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        this.field_D = 0;
        this.field_m = 0;
        this.field_t = 0;
        this.field_F = (byte) 0;
        this.field_m = param0.field_m;
        this.field_t = param0.field_t;
        this.field_D = param0.field_D;
        this.field_R = param0.field_R;
        if (!param1) {
          this.field_H = new int[this.field_m];
          this.field_l = new int[this.field_m];
          this.field_A = new int[this.field_m];
          for (var6 = 0; var6 < this.field_m; var6++) {
            this.field_H[var6] = param0.field_H[var6];
            this.field_l[var6] = param0.field_l[var6];
            this.field_A[var6] = param0.field_A[var6];
          }
        } else {
          this.field_H = param0.field_H;
          this.field_l = param0.field_l;
          this.field_A = param0.field_A;
        }
        if (!param2) {
          this.field_p = new short[this.field_D];
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_D; var6Lifetime1++) {
            this.field_p[var6Lifetime1] = param0.field_p[var6Lifetime1];
          }
        } else {
          this.field_p = param0.field_p;
        }
        if (!param3 &&
          param0.field_u != null) {
          this.field_u = new short[this.field_D];
          for (var6Lifetime2 = 0; var6Lifetime2 < this.field_D; var6Lifetime2++) {
            this.field_u[var6Lifetime2] = param0.field_u[var6Lifetime2];
          }
        } else {
          this.field_u = param0.field_u;
        }
        if (!param4) {
          this.field_k = new byte[this.field_D];
          if (param0.field_k != null) {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_D; var6Lifetime3++) {
              this.field_k[var6Lifetime3] = param0.field_k[var6Lifetime3];
            }
          } else {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_D; var6Lifetime3++) {
              this.field_k[var6Lifetime3] = (byte) 0;
            }
          }
        } else {
          this.field_k = param0.field_k;
        }
        this.field_r = param0.field_r;
        this.field_L = param0.field_L;
        this.field_w = param0.field_w;
        this.field_o = param0.field_o;
        this.field_z = param0.field_z;
        this.field_I = param0.field_I;
        this.field_F = param0.field_F;
        this.field_T = param0.field_T;
        this.field_h = param0.field_h;
        this.field_B = param0.field_B;
        this.field_y = param0.field_y;
        this.field_S = param0.field_S;
        this.field_P = param0.field_P;
        this.field_j = param0.field_j;
        this.field_x = param0.field_x;
        this.field_E = param0.field_E;
        this.field_Q = param0.field_Q;
        this.field_N = param0.field_N;
        this.field_G = param0.field_G;
        this.field_C = param0.field_C;
        this.field_O = param0.field_O;
        this.field_s = param0.field_s;
        this.field_v = param0.field_v;
        this.field_i = param0.field_i;
        this.field_J = param0.field_J;
        this.field_q = param0.field_q;
    }
}
