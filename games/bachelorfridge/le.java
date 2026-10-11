/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends iaa {
    private short[] field_k;
    byte[] field_e;
    sr[] field_D;
    private byte[] field_r;
    short[] field_x;
    private int[][] field_n;
    short[] field_I;
    private int[] field_o;
    short[] field_z;
    int[] field_v;
    private byte[] field_y;
    private short[] field_g;
    sr[] field_m;
    private byte[] field_f;
    int[] field_p;
    private int[][] field_G;
    byte[] field_s;
    int field_u;
    private byte[] field_c;
    jea[] field_B;
    short[] field_w;
    private byte[] field_h;
    byte[] field_q;
    int[] field_l;
    int[] field_J;
    private int[] field_t;
    int[] field_H;
    int field_F;
    int[] field_L;
    int field_i;
    int field_d;
    byte[] field_C;
    byte[] field_A;
    short[] field_E;
    private short[] field_j;

    private final void a(byte[] param0) {
        byte dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        lu var2;
        lu var3;
        lu var4;
        lu var5;
        lu var6;
        lu var7;
        lu var8;
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
        var2 = new lu(param0);
        var3 = new lu(param0);
        var4 = new lu(param0);
        var5 = new lu(param0);
        var6 = new lu(param0);
        var7 = new lu(param0);
        var8 = new lu(param0);
        var2.field_g = param0.length - 23;
        var9 = var2.e((byte) 56);
        var10 = var2.e((byte) 55);
        var11 = var2.b(16711935);
        var12 = var2.b(16711935);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.b(16711935);
        var16 = var2.b(16711935);
        var17 = var2.b(16711935);
        var18 = var2.b(16711935);
        var19 = var2.b(16711935);
        var20 = var2.e((byte) 53);
        var21 = var2.e((byte) 110);
        var22 = var2.e((byte) 75);
        var23 = var2.e((byte) 49);
        var24 = var2.e((byte) 113);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_e = new byte[var11];
          var2.field_g = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.b(true);
            this.field_e[var28] = dupTemp$0;
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
        this.field_d = var9;
        this.field_i = var10;
        this.field_u = var11;
        this.field_l = new int[var9];
        this.field_L = new int[var9];
        this.field_H = new int[var9];
        this.field_p = new int[var10];
        this.field_v = new int[var10];
        this.field_J = new int[var10];
        if (var19 == 1) {
          this.field_o = new int[var9];
        }
        if (var13 != 0) {
          this.field_C = new byte[var10];
        }
        if (var15 == 255) {
          this.field_A = new byte[var10];
        }
        if (var16 == 1) {
          this.field_q = new byte[var10];
        }
        if (var17 == 1) {
          this.field_t = new int[var10];
        }
        if (var18 == 1) {
          this.field_x = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_s = new byte[var10];
        }
        this.field_z = new short[var10];
        if (var11 > 0) {
          this.field_I = new short[var11];
          this.field_w = new short[var11];
          this.field_E = new short[var11];
          if (var26 > 0) {
            this.field_k = new short[var26];
            this.field_g = new short[var26];
            this.field_j = new short[var26];
            this.field_c = new byte[var26];
            this.field_r = new byte[var26];
            this.field_h = new byte[var26];
          }
          if (var27 > 0) {
            this.field_f = new byte[var27];
            this.field_y = new byte[var27];
          }
        }
        var2.field_g = var29Lifetime1;
        var3.field_g = var40;
        var4.field_g = var41;
        var5.field_g = var42;
        var6.field_g = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        for (var53 = 0; var53 < var9; var53++) {
          var54 = var2.b(16711935);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.e(-4095);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.e(-4095);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.e(-4095);
          }
          this.field_l[var53] = var50 + var55;
          this.field_L[var53] = var51 + var56;
          this.field_H[var53] = var52 + var57;
          var50 = this.field_l[var53];
          var51 = this.field_L[var53];
          var52 = this.field_H[var53];
          if (var19 == 1) {
            this.field_o[var53] = var6.b(16711935);
          }
        }
        var2.field_g = var39;
        var3.field_g = var30;
        var4.field_g = var32;
        var5.field_g = var35;
        var6.field_g = var33;
        var7.field_g = var37;
        var8.field_g = var38;
        for (var53Lifetime1 = 0; var53Lifetime1 < var10; var53Lifetime1++) {
          this.field_z[var53Lifetime1] = (short)var2.e((byte) 105);
          if (var13 != 0) {
            this.field_C[var53Lifetime1] = var3.b(true);
          }
          if (var15 == 255) {
            this.field_A[var53Lifetime1] = var4.b(true);
          }
          if (var16 == 1) {
            this.field_q[var53Lifetime1] = var5.b(true);
          }
          if (var17 == 1) {
            this.field_t[var53Lifetime1] = var6.b(16711935);
          }
          if (var18 == 1) {
            this.field_x[var53Lifetime1] = (short)(var7.e((byte) 121) - 1);
          }
          if (this.field_s != null) {
            if (this.field_x[var53Lifetime1] == -1) {
              this.field_s[var53Lifetime1] = (byte)-1;
            } else {
              this.field_s[var53Lifetime1] = (byte)(var8.b(16711935) - 1);
            }
          }
        }
        this.field_F = -1;
        var2.field_g = var36;
        var3.field_g = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.b(16711935);
          if (var58 == 1) {
            var53Lifetime2 = var2.e(-4095) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.e(-4095) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.e(-4095) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_p[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_J[var57Lifetime1] = var55Lifetime1;
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
            var55Lifetime1 = var2.e(-4095) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_p[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_J[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_F) {
              this.field_F = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.e(-4095) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_p[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_J[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_F) {
              this.field_F = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.e(-4095) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_p[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_J[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_F) {
              this.field_F = var55Lifetime1;
            }
          }
        }
        this.field_F = this.field_F + 1;
        var2.field_g = var43;
        var3.field_g = var44;
        var4.field_g = var45;
        var5.field_g = var46;
        var6.field_g = var47;
        var7.field_g = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_e[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_I[var57Lifetime2] = (short)var2.e((byte) 47);
            this.field_w[var57Lifetime2] = (short)var2.e((byte) 59);
            this.field_E[var57Lifetime2] = (short)var2.e((byte) 89);
          }
          if (var58Lifetime1 == 1) {
            this.field_I[var57Lifetime2] = (short)var3.e((byte) 121);
            this.field_w[var57Lifetime2] = (short)var3.e((byte) 66);
            this.field_E[var57Lifetime2] = (short)var3.e((byte) 96);
            this.field_k[var57Lifetime2] = (short)var4.e((byte) 94);
            this.field_g[var57Lifetime2] = (short)var4.e((byte) 111);
            this.field_j[var57Lifetime2] = (short)var4.e((byte) 121);
            this.field_c[var57Lifetime2] = var5.b(true);
            this.field_r[var57Lifetime2] = var6.b(true);
            this.field_h[var57Lifetime2] = var7.b(true);
          }
          if (var58Lifetime1 == 2) {
            this.field_I[var57Lifetime2] = (short)var3.e((byte) 96);
            this.field_w[var57Lifetime2] = (short)var3.e((byte) 66);
            this.field_E[var57Lifetime2] = (short)var3.e((byte) 78);
            this.field_k[var57Lifetime2] = (short)var4.e((byte) 124);
            this.field_g[var57Lifetime2] = (short)var4.e((byte) 86);
            this.field_j[var57Lifetime2] = (short)var4.e((byte) 113);
            this.field_c[var57Lifetime2] = var5.b(true);
            this.field_r[var57Lifetime2] = var6.b(true);
            this.field_h[var57Lifetime2] = var7.b(true);
            this.field_f[var57Lifetime2] = var7.b(true);
            this.field_y[var57Lifetime2] = var7.b(true);
          }
          if (var58Lifetime1 == 3) {
            this.field_I[var57Lifetime2] = (short)var3.e((byte) 125);
            this.field_w[var57Lifetime2] = (short)var3.e((byte) 119);
            this.field_E[var57Lifetime2] = (short)var3.e((byte) 124);
            this.field_k[var57Lifetime2] = (short)var4.e((byte) 50);
            this.field_g[var57Lifetime2] = (short)var4.e((byte) 62);
            this.field_j[var57Lifetime2] = (short)var4.e((byte) 95);
            this.field_c[var57Lifetime2] = var5.b(true);
            this.field_r[var57Lifetime2] = var6.b(true);
            this.field_h[var57Lifetime2] = var7.b(true);
          }
        }
        if (var14 != 0) {
          var2.field_g = var49;
          var57Lifetime3 = var2.b(16711935);
          if (var57Lifetime3 > 0) {
            var2.field_g = var2.field_g + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.b(16711935);
          if (var58Lifetime2 > 0) {
            var2.field_g = var2.field_g + 4 * var58Lifetime2;
          }
        }
    }

    final void b() {
        jea dupTemp$0 = null;
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
        jea var16;
        sr var17;
        sr var18;
        sr var19;
        int var1Lifetime1;
        if (this.field_D != null) {
          return;
        }
        this.field_D = new sr[this.field_F];
        for (var1 = 0; var1 < this.field_F; var1++) {
          this.field_D[var1] = new sr();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_i) {
            return;
          }
          var2 = this.field_p[var1Lifetime1];
          var3 = this.field_v[var1Lifetime1];
          var4 = this.field_J[var1Lifetime1];
          var5 = this.field_l[var3] - this.field_l[var2];
          var6 = this.field_L[var3] - this.field_L[var2];
          var7 = this.field_H[var3] - this.field_H[var2];
          var8 = this.field_l[var4] - this.field_l[var2];
          var9 = this.field_L[var4] - this.field_L[var2];
          var10 = this.field_H[var4] - this.field_H[var2];
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
                  if (this.field_B == null) {
                    this.field_B = new jea[this.field_i];
                  }
                  dupTemp$0 = new jea();
                  this.field_B[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_b = var11;
                  var16.field_e = var12;
                  var16.field_a = var13;
                }
              } else {
                var17 = this.field_D[var2];
                var17.field_f = var17.field_f + var11;
                var17.field_h = var17.field_h + var12;
                var17.field_e = var17.field_e + var13;
                var17.field_g = var17.field_g + 1;
                var18 = this.field_D[var3];
                var18.field_f = var18.field_f + var11;
                var18.field_h = var18.field_h + var12;
                var18.field_e = var18.field_e + var13;
                var18.field_g = var18.field_g + 1;
                var19 = this.field_D[var4];
                var19.field_f = var19.field_f + var11;
                var19.field_h = var19.field_h + var12;
                var19.field_e = var19.field_e + var13;
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

    final gga a(int param0, int param1, int param2, int param3, int param4) {
        return (gga) ((Object) new ss(this, param0, param1, param2, param3, param4));
    }

    final static le a(vr param0, String param1, String param2) {
        byte[] var3 = param0.a((byte) 123, param2, param1);
        if (var3 == null) {
          return null;
        }
        return new le(var3);
    }

    private final void b(byte[] param0) {
        int var2;
        int var3;
        lu var4;
        lu var5;
        lu var6;
        lu var7;
        lu var8;
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
        var4 = new lu(param0);
        var5 = new lu(param0);
        var6 = new lu(param0);
        var7 = new lu(param0);
        var8 = new lu(param0);
        var4.field_g = param0.length - 18;
        var9 = var4.e((byte) 120);
        var10 = var4.e((byte) 74);
        var11 = var4.b(16711935);
        var12 = var4.b(16711935);
        var13 = var4.b(16711935);
        var14 = var4.b(16711935);
        var15 = var4.b(16711935);
        var16 = var4.b(16711935);
        var17 = var4.e((byte) 121);
        var18 = var4.e((byte) 62);
        var19 = var4.e((byte) 95);
        var20 = var4.e((byte) 112);
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
        this.field_d = var9;
        this.field_i = var10;
        this.field_u = var11;
        this.field_l = new int[var9];
        this.field_L = new int[var9];
        this.field_H = new int[var9];
        this.field_p = new int[var10];
        this.field_v = new int[var10];
        this.field_J = new int[var10];
        if (var11 > 0) {
          this.field_e = new byte[var11];
          this.field_I = new short[var11];
          this.field_w = new short[var11];
          this.field_E = new short[var11];
        }
        if (var16 == 1) {
          this.field_o = new int[var9];
        }
        if (var12 == 1) {
          this.field_C = new byte[var10];
          this.field_s = new byte[var10];
          this.field_x = new short[var10];
        }
        if (var13 == 255) {
          this.field_A = new byte[var10];
        }
        if (var14 == 1) {
          this.field_q = new byte[var10];
        }
        if (var15 == 1) {
          this.field_t = new int[var10];
        }
        this.field_z = new short[var10];
        var4.field_g = var22;
        var5.field_g = var32;
        var6.field_g = var33;
        var7.field_g = var34;
        var8.field_g = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.b(16711935);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.e(-4095);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.e(-4095);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.e(-4095);
          }
          this.field_l[var38] = var35 + var40;
          this.field_L[var38] = var36 + var41;
          this.field_H[var38] = var37 + var42;
          var35 = this.field_l[var38];
          var36 = this.field_L[var38];
          var37 = this.field_H[var38];
          if (var16 == 1) {
            this.field_o[var38] = var8.b(16711935);
          }
        }
        var4.field_g = var30;
        var5.field_g = var26;
        var6.field_g = var24;
        var7.field_g = var28;
        var8.field_g = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_z[var38Lifetime1] = (short)var4.e((byte) 79);
          if (var12 == 1) {
            var39Lifetime1 = var5.b(16711935);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_C[var38Lifetime1] = (byte) 0;
            } else {
              this.field_C[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_s[var38Lifetime1] = (byte)-1;
              this.field_x[var38Lifetime1] = (short)-1;
            } else {
              this.field_s[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_x[var38Lifetime1] = this.field_z[var38Lifetime1];
              this.field_z[var38Lifetime1] = (short)127;
              if (this.field_x[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_A[var38Lifetime1] = var6.b(true);
          }
          if (var14 == 1) {
            this.field_q[var38Lifetime1] = var7.b(true);
          }
          if (var15 == 1) {
            this.field_t[var38Lifetime1] = var8.b(16711935);
          }
        }
        this.field_F = -1;
        var4.field_g = var29;
        var5.field_g = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.b(16711935);
          if (var43 == 1) {
            var38Lifetime2 = var4.e(-4095) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.e(-4095) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.e(-4095) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_p[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_J[var42Lifetime1] = var40Lifetime1;
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
            var40Lifetime1 = var4.e(-4095) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_p[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_J[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_F) {
              this.field_F = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.e(-4095) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_p[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_J[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_F) {
              this.field_F = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.e(-4095) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_p[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_J[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_F) {
              this.field_F = var40Lifetime1;
            }
          }
        }
        this.field_F = this.field_F + 1;
        var4.field_g = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_e[var42Lifetime2] = (byte) 0;
          this.field_I[var42Lifetime2] = (short)var4.e((byte) 52);
          this.field_w[var42Lifetime2] = (short)var4.e((byte) 98);
          this.field_E[var42Lifetime2] = (short)var4.e((byte) 98);
        }
        if (this.field_s != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_s[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_I[var44Lifetime1] & 65535) == this.field_p[var45] &&
                (this.field_w[var44Lifetime1] & 65535) == this.field_v[var45] &&
                (this.field_E[var44Lifetime1] & 65535) == this.field_J[var45]) {
                this.field_s[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_s = null;
          }
        }
        if (var3 == 0) {
          this.field_x = null;
        }
        if (var2 == 0) {
          this.field_C = null;
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
        if (this.field_o != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_d; var3++) {
            var4 = this.field_o[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_G = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_G[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_d; var3++) {
            var4Lifetime2 = this.field_o[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_G[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_o = null;
        }
        if (this.field_t != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_i; var3Lifetime1++) {
            var4Lifetime1 = this.field_t[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_n = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_n[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_i; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_t[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_n[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_t = null;
        }
    }

    private le(byte[] param0) {
        this.field_d = 0;
        this.field_F = 0;
        this.field_i = 0;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.a(param0);
        } else {
          this.b(param0);
        }
    }
}
