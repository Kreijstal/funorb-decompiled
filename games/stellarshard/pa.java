/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends tf {
    short[] field_k;
    byte[] field_q;
    nk[] field_s;
    int field_v;
    byte[] field_J;
    short[] field_w;
    int[] field_g;
    private byte[] field_d;
    private byte[] field_r;
    short[] field_I;
    private short[] field_p;
    short[] field_D;
    nk[] field_u;
    int field_h;
    int[] field_C;
    private int[] field_n;
    private short[] field_f;
    int[] field_E;
    private int[] field_y;
    private byte[] field_H;
    byte[] field_i;
    private short[] field_o;
    short[] field_B;
    private int[][] field_A;
    private byte[] field_t;
    int field_L;
    private int[][] field_e;
    int[] field_F;
    byte[] field_x;
    int field_m;
    byte[] field_j;
    private byte[] field_K;
    l[] field_l;
    int[] field_z;
    int[] field_G;

    final bj a(int param0, int param1, int param2, int param3, int param4) {
        return (bj) ((Object) new sc(this, param0, param1, param2, param3, param4));
    }

    private final void a(byte[] param0) {
        int var2;
        int var3;
        ka var4;
        ka var5;
        ka var6;
        ka var7;
        ka var8;
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
        var4 = new ka(param0);
        var5 = new ka(param0);
        var6 = new ka(param0);
        var7 = new ka(param0);
        var8 = new ka(param0);
        var4.field_k = param0.length - 18;
        var9 = var4.c((byte) 104);
        var10 = var4.c((byte) 113);
        var11 = var4.f(4);
        var12 = var4.f(4);
        var13 = var4.f(4);
        var14 = var4.f(4);
        var15 = var4.f(4);
        var16 = var4.f(4);
        var17 = var4.c((byte) 81);
        var18 = var4.c((byte) 25);
        var19 = var4.c((byte) 22);
        var20 = var4.c((byte) 71);
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
        this.field_h = var10;
        this.field_L = var11;
        this.field_g = new int[var9];
        this.field_F = new int[var9];
        this.field_C = new int[var9];
        this.field_z = new int[var10];
        this.field_E = new int[var10];
        this.field_G = new int[var10];
        if (var11 > 0) {
          this.field_i = new byte[var11];
          this.field_B = new short[var11];
          this.field_w = new short[var11];
          this.field_k = new short[var11];
        }
        if (var16 == 1) {
          this.field_y = new int[var9];
        }
        if (var12 == 1) {
          this.field_q = new byte[var10];
          this.field_J = new byte[var10];
          this.field_D = new short[var10];
        }
        if (var13 == 255) {
          this.field_x = new byte[var10];
        }
        if (var14 == 1) {
          this.field_j = new byte[var10];
        }
        if (var15 == 1) {
          this.field_n = new int[var10];
        }
        this.field_I = new short[var10];
        var4.field_k = var22;
        var5.field_k = var32;
        var6.field_k = var33;
        var7.field_k = var34;
        var8.field_k = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.f(4);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.e(-64);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.e(-64);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.e(-64);
          }
          this.field_g[var38] = var35 + var40;
          this.field_F[var38] = var36 + var41;
          this.field_C[var38] = var37 + var42;
          var35 = this.field_g[var38];
          var36 = this.field_F[var38];
          var37 = this.field_C[var38];
          if (var16 == 1) {
            this.field_y[var38] = var8.f(4);
          }
        }
        var4.field_k = var30;
        var5.field_k = var26;
        var6.field_k = var24;
        var7.field_k = var28;
        var8.field_k = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_I[var38Lifetime1] = (short)var4.c((byte) 46);
          if (var12 == 1) {
            var39Lifetime1 = var5.f(4);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_q[var38Lifetime1] = (byte) 0;
            } else {
              this.field_q[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_J[var38Lifetime1] = (byte)-1;
              this.field_D[var38Lifetime1] = (short)-1;
            } else {
              this.field_J[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_D[var38Lifetime1] = this.field_I[var38Lifetime1];
              this.field_I[var38Lifetime1] = (short)127;
              if (this.field_D[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_x[var38Lifetime1] = var6.g(103);
          }
          if (var14 == 1) {
            this.field_j[var38Lifetime1] = var7.g(116);
          }
          if (var15 == 1) {
            this.field_n[var38Lifetime1] = var8.f(4);
          }
        }
        this.field_v = -1;
        var4.field_k = var29;
        var5.field_k = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.f(4);
          if (var43 == 1) {
            var38Lifetime2 = var4.e(-64) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.e(-64) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.e(-64) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_z[var42Lifetime1] = var38Lifetime2;
            this.field_E[var42Lifetime1] = var39Lifetime2;
            this.field_G[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.field_v) {
              this.field_v = var38Lifetime2;
            }
            if (var39Lifetime2 > this.field_v) {
              this.field_v = var39Lifetime2;
            }
            if (var40Lifetime1 > this.field_v) {
              this.field_v = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.e(-64) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_z[var42Lifetime1] = var38Lifetime2;
            this.field_E[var42Lifetime1] = var39Lifetime2;
            this.field_G[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_v) {
              this.field_v = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.e(-64) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_z[var42Lifetime1] = var38Lifetime2;
            this.field_E[var42Lifetime1] = var39Lifetime2;
            this.field_G[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_v) {
              this.field_v = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.e(-64) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_z[var42Lifetime1] = var38Lifetime2;
            this.field_E[var42Lifetime1] = var39Lifetime2;
            this.field_G[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_v) {
              this.field_v = var40Lifetime1;
            }
          }
        }
        this.field_v = this.field_v + 1;
        var4.field_k = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_i[var42Lifetime2] = (byte) 0;
          this.field_B[var42Lifetime2] = (short)var4.c((byte) 105);
          this.field_w[var42Lifetime2] = (short)var4.c((byte) 98);
          this.field_k[var42Lifetime2] = (short)var4.c((byte) 120);
        }
        if (this.field_J != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_J[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_B[var44Lifetime1] & 65535) == this.field_z[var45] &&
                (this.field_w[var44Lifetime1] & 65535) == this.field_E[var45] &&
                (this.field_k[var44Lifetime1] & 65535) == this.field_G[var45]) {
                this.field_J[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_J = null;
          }
        }
        if (var3 == 0) {
          this.field_D = null;
        }
        if (var2 == 0) {
          this.field_q = null;
        }
    }

    private final void c() {
        this.field_u = null;
        this.field_s = null;
        this.field_l = null;
    }

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = 0; var2 < this.field_m; var2++) {
          var3 = this.field_g[var2];
          var4 = this.field_F[var2];
          var5 = this.field_C[var2];
          this.field_g[var2] = param0[0] + (var3 * param0[3] + var4 * param0[6] + var5 * param0[9] >> 16);
          this.field_F[var2] = param0[1] + (var3 * param0[4] + var4 * param0[7] + var5 * param0[10] >> 16);
          this.field_C[var2] = param0[2] + (var3 * param0[5] + var4 * param0[8] + var5 * param0[11] >> 16);
        }
        this.c();
    }

    private final void b(byte[] param0) {
        byte dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        ka var2;
        ka var3;
        ka var4;
        ka var5;
        ka var6;
        ka var7;
        ka var8;
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
        var2 = new ka(param0);
        var3 = new ka(param0);
        var4 = new ka(param0);
        var5 = new ka(param0);
        var6 = new ka(param0);
        var7 = new ka(param0);
        var8 = new ka(param0);
        var2.field_k = param0.length - 23;
        var9 = var2.c((byte) 116);
        var10 = var2.c((byte) 52);
        var11 = var2.f(4);
        var12 = var2.f(4);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.f(4);
        var16 = var2.f(4);
        var17 = var2.f(4);
        var18 = var2.f(4);
        var19 = var2.f(4);
        var20 = var2.c((byte) 89);
        var21 = var2.c((byte) 84);
        var22 = var2.c((byte) 86);
        var23 = var2.c((byte) 72);
        var24 = var2.c((byte) 75);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_i = new byte[var11];
          var2.field_k = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.g(112);
            this.field_i[var28] = dupTemp$0;
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
        this.field_h = var10;
        this.field_L = var11;
        this.field_g = new int[var9];
        this.field_F = new int[var9];
        this.field_C = new int[var9];
        this.field_z = new int[var10];
        this.field_E = new int[var10];
        this.field_G = new int[var10];
        if (var19 == 1) {
          this.field_y = new int[var9];
        }
        if (var13 != 0) {
          this.field_q = new byte[var10];
        }
        if (var15 == 255) {
          this.field_x = new byte[var10];
        }
        if (var16 == 1) {
          this.field_j = new byte[var10];
        }
        if (var17 == 1) {
          this.field_n = new int[var10];
        }
        if (var18 == 1) {
          this.field_D = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_J = new byte[var10];
        }
        this.field_I = new short[var10];
        if (var11 > 0) {
          this.field_B = new short[var11];
          this.field_w = new short[var11];
          this.field_k = new short[var11];
          if (var26 > 0) {
            this.field_o = new short[var26];
            this.field_f = new short[var26];
            this.field_p = new short[var26];
            this.field_d = new byte[var26];
            this.field_H = new byte[var26];
            this.field_r = new byte[var26];
          }
          if (var27 > 0) {
            this.field_K = new byte[var27];
            this.field_t = new byte[var27];
          }
        }
        var2.field_k = var29Lifetime1;
        var3.field_k = var40;
        var4.field_k = var41;
        var5.field_k = var42;
        var6.field_k = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        for (var53 = 0; var53 < var9; var53++) {
          var54 = var2.f(4);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.e(-64);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.e(-64);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.e(-64);
          }
          this.field_g[var53] = var50 + var55;
          this.field_F[var53] = var51 + var56;
          this.field_C[var53] = var52 + var57;
          var50 = this.field_g[var53];
          var51 = this.field_F[var53];
          var52 = this.field_C[var53];
          if (var19 == 1) {
            this.field_y[var53] = var6.f(4);
          }
        }
        var2.field_k = var39;
        var3.field_k = var30;
        var4.field_k = var32;
        var5.field_k = var35;
        var6.field_k = var33;
        var7.field_k = var37;
        var8.field_k = var38;
        for (var53Lifetime1 = 0; var53Lifetime1 < var10; var53Lifetime1++) {
          this.field_I[var53Lifetime1] = (short)var2.c((byte) 76);
          if (var13 != 0) {
            this.field_q[var53Lifetime1] = var3.g(-122);
          }
          if (var15 == 255) {
            this.field_x[var53Lifetime1] = var4.g(-28);
          }
          if (var16 == 1) {
            this.field_j[var53Lifetime1] = var5.g(-52);
          }
          if (var17 == 1) {
            this.field_n[var53Lifetime1] = var6.f(4);
          }
          if (var18 == 1) {
            this.field_D[var53Lifetime1] = (short)(var7.c((byte) 73) - 1);
          }
          if (this.field_J != null) {
            if (this.field_D[var53Lifetime1] == -1) {
              this.field_J[var53Lifetime1] = (byte)-1;
            } else {
              this.field_J[var53Lifetime1] = (byte)(var8.f(4) - 1);
            }
          }
        }
        this.field_v = -1;
        var2.field_k = var36;
        var3.field_k = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.f(4);
          if (var58 == 1) {
            var53Lifetime2 = var2.e(-64) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.e(-64) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.e(-64) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_z[var57Lifetime1] = var53Lifetime2;
            this.field_E[var57Lifetime1] = var54Lifetime1;
            this.field_G[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.field_v) {
              this.field_v = var53Lifetime2;
            }
            if (var54Lifetime1 > this.field_v) {
              this.field_v = var54Lifetime1;
            }
            if (var55Lifetime1 > this.field_v) {
              this.field_v = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.e(-64) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_z[var57Lifetime1] = var53Lifetime2;
            this.field_E[var57Lifetime1] = var54Lifetime1;
            this.field_G[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_v) {
              this.field_v = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.e(-64) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_z[var57Lifetime1] = var53Lifetime2;
            this.field_E[var57Lifetime1] = var54Lifetime1;
            this.field_G[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_v) {
              this.field_v = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.e(-64) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_z[var57Lifetime1] = var53Lifetime2;
            this.field_E[var57Lifetime1] = var54Lifetime1;
            this.field_G[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_v) {
              this.field_v = var55Lifetime1;
            }
          }
        }
        this.field_v = this.field_v + 1;
        var2.field_k = var43;
        var3.field_k = var44;
        var4.field_k = var45;
        var5.field_k = var46;
        var6.field_k = var47;
        var7.field_k = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_i[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_B[var57Lifetime2] = (short)var2.c((byte) 44);
            this.field_w[var57Lifetime2] = (short)var2.c((byte) 117);
            this.field_k[var57Lifetime2] = (short)var2.c((byte) 65);
          }
          if (var58Lifetime1 == 1) {
            this.field_B[var57Lifetime2] = (short)var3.c((byte) 112);
            this.field_w[var57Lifetime2] = (short)var3.c((byte) 38);
            this.field_k[var57Lifetime2] = (short)var3.c((byte) 94);
            this.field_o[var57Lifetime2] = (short)var4.c((byte) 42);
            this.field_f[var57Lifetime2] = (short)var4.c((byte) 26);
            this.field_p[var57Lifetime2] = (short)var4.c((byte) 32);
            this.field_d[var57Lifetime2] = var5.g(-105);
            this.field_H[var57Lifetime2] = var6.g(115);
            this.field_r[var57Lifetime2] = var7.g(106);
          }
          if (var58Lifetime1 == 2) {
            this.field_B[var57Lifetime2] = (short)var3.c((byte) 25);
            this.field_w[var57Lifetime2] = (short)var3.c((byte) 34);
            this.field_k[var57Lifetime2] = (short)var3.c((byte) 88);
            this.field_o[var57Lifetime2] = (short)var4.c((byte) 54);
            this.field_f[var57Lifetime2] = (short)var4.c((byte) 94);
            this.field_p[var57Lifetime2] = (short)var4.c((byte) 45);
            this.field_d[var57Lifetime2] = var5.g(126);
            this.field_H[var57Lifetime2] = var6.g(126);
            this.field_r[var57Lifetime2] = var7.g(-44);
            this.field_K[var57Lifetime2] = var7.g(122);
            this.field_t[var57Lifetime2] = var7.g(120);
          }
          if (var58Lifetime1 == 3) {
            this.field_B[var57Lifetime2] = (short)var3.c((byte) 76);
            this.field_w[var57Lifetime2] = (short)var3.c((byte) 107);
            this.field_k[var57Lifetime2] = (short)var3.c((byte) 26);
            this.field_o[var57Lifetime2] = (short)var4.c((byte) 101);
            this.field_f[var57Lifetime2] = (short)var4.c((byte) 30);
            this.field_p[var57Lifetime2] = (short)var4.c((byte) 24);
            this.field_d[var57Lifetime2] = var5.g(-40);
            this.field_H[var57Lifetime2] = var6.g(123);
            this.field_r[var57Lifetime2] = var7.g(-29);
          }
        }
        if (var14 != 0) {
          var2.field_k = var49;
          var57Lifetime3 = var2.f(4);
          if (var57Lifetime3 > 0) {
            var2.field_k = var2.field_k + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.f(4);
          if (var58Lifetime2 > 0) {
            var2.field_k = var2.field_k + 4 * var58Lifetime2;
          }
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
        if (this.field_y != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_m; var3++) {
            var4 = this.field_y[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_A = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_A[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_m; var3++) {
            var4Lifetime2 = this.field_y[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_A[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_y = null;
        }
        if (this.field_n != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_h; var3Lifetime1++) {
            var4Lifetime1 = this.field_n[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_e = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_e[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_h; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_n[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_e[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_n = null;
        }
    }

    final void a() {
        l dupTemp$0 = null;
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
        l var16;
        nk var17;
        nk var18;
        nk var19;
        int var1Lifetime1;
        if (this.field_u != null) {
          return;
        }
        this.field_u = new nk[this.field_v];
        for (var1 = 0; var1 < this.field_v; var1++) {
          this.field_u[var1] = new nk();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_h) {
            return;
          }
          var2 = this.field_z[var1Lifetime1];
          var3 = this.field_E[var1Lifetime1];
          var4 = this.field_G[var1Lifetime1];
          var5 = this.field_g[var3] - this.field_g[var2];
          var6 = this.field_F[var3] - this.field_F[var2];
          var7 = this.field_C[var3] - this.field_C[var2];
          var8 = this.field_g[var4] - this.field_g[var2];
          var9 = this.field_F[var4] - this.field_F[var2];
          var10 = this.field_C[var4] - this.field_C[var2];
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
              if (this.field_q != null) {
                var15 = this.field_q[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_l == null) {
                    this.field_l = new l[this.field_h];
                  }
                  dupTemp$0 = new l();
                  this.field_l[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_i = var11;
                  var16.field_c = var12;
                  var16.field_a = var13;
                }
              } else {
                var17 = this.field_u[var2];
                var17.field_e = var17.field_e + var11;
                var17.field_d = var17.field_d + var12;
                var17.field_f = var17.field_f + var13;
                var17.field_g = var17.field_g + 1;
                var18 = this.field_u[var3];
                var18.field_e = var18.field_e + var11;
                var18.field_d = var18.field_d + var12;
                var18.field_f = var18.field_f + var13;
                var18.field_g = var18.field_g + 1;
                var19 = this.field_u[var4];
                var19.field_e = var19.field_e + var11;
                var19.field_d = var19.field_d + var12;
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

    final static pa a(pf param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, param2, (byte) -12);
        if (var3 == null) {
          return null;
        }
        return new pa(var3);
    }

    private pa(byte[] param0) {
        this.field_v = 0;
        this.field_h = 0;
        this.field_m = 0;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.b(param0);
        } else {
          this.a(param0);
        }
    }

    pa(pa param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        this.field_v = 0;
        this.field_h = 0;
        this.field_m = 0;
        this.field_m = param0.field_m;
        this.field_v = param0.field_v;
        this.field_h = param0.field_h;
        this.field_L = param0.field_L;
        if (!param1) {
          this.field_g = new int[this.field_m];
          this.field_F = new int[this.field_m];
          this.field_C = new int[this.field_m];
          for (var6 = 0; var6 < this.field_m; var6++) {
            this.field_g[var6] = param0.field_g[var6];
            this.field_F[var6] = param0.field_F[var6];
            this.field_C[var6] = param0.field_C[var6];
          }
        } else {
          this.field_g = param0.field_g;
          this.field_F = param0.field_F;
          this.field_C = param0.field_C;
        }
        if (!param2) {
          this.field_I = new short[this.field_h];
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_h; var6Lifetime1++) {
            this.field_I[var6Lifetime1] = param0.field_I[var6Lifetime1];
          }
        } else {
          this.field_I = param0.field_I;
        }
        if (!param3 &&
          param0.field_D != null) {
          this.field_D = new short[this.field_h];
          for (var6Lifetime2 = 0; var6Lifetime2 < this.field_h; var6Lifetime2++) {
            this.field_D[var6Lifetime2] = param0.field_D[var6Lifetime2];
          }
        } else {
          this.field_D = param0.field_D;
        }
        if (!param4) {
          this.field_j = new byte[this.field_h];
          if (param0.field_j != null) {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_h; var6Lifetime3++) {
              this.field_j[var6Lifetime3] = param0.field_j[var6Lifetime3];
            }
          } else {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_h; var6Lifetime3++) {
              this.field_j[var6Lifetime3] = (byte) 0;
            }
          }
        } else {
          this.field_j = param0.field_j;
        }
        this.field_z = param0.field_z;
        this.field_E = param0.field_E;
        this.field_G = param0.field_G;
        this.field_q = param0.field_q;
        this.field_x = param0.field_x;
        this.field_J = param0.field_J;
        this.field_i = param0.field_i;
        this.field_B = param0.field_B;
        this.field_w = param0.field_w;
        this.field_k = param0.field_k;
        this.field_o = param0.field_o;
        this.field_f = param0.field_f;
        this.field_p = param0.field_p;
        this.field_d = param0.field_d;
        this.field_H = param0.field_H;
        this.field_r = param0.field_r;
        this.field_K = param0.field_K;
        this.field_t = param0.field_t;
        this.field_y = param0.field_y;
        this.field_n = param0.field_n;
        this.field_A = param0.field_A;
        this.field_e = param0.field_e;
        this.field_u = param0.field_u;
        this.field_l = param0.field_l;
        this.field_s = param0.field_s;
    }
}
