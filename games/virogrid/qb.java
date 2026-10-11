/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends ll {
    pg[] field_L;
    s[] field_n;
    int[] field_l;
    private byte[] field_m;
    s[] field_g;
    short[] field_q;
    private int[] field_Q;
    private byte[] field_D;
    private short field_U;
    private byte[] field_j;
    int field_z;
    int field_J;
    private short field_G;
    byte[] field_s;
    private int[] field_C;
    byte[] field_O;
    private short[] field_i;
    private static int[] field_H;
    short[] field_A;
    int[] field_x;
    int[] field_e;
    int field_t;
    private short field_F;
    private short[] field_E;
    int field_f;
    private short field_S;
    private short field_k;
    int[] field_o;
    short[] field_W;
    private static int field_u;
    private boolean field_T;
    int[] field_v;
    short[] field_p;
    int[] field_V;
    private byte[] field_r;
    short[] field_M;
    private short field_h;
    private int[][] field_R;
    byte[] field_B;
    byte[] field_w;
    private static int[] field_K;
    byte[] field_N;
    private short[] field_P;
    private int[][] field_y;
    private byte[] field_I;

    final static qb a(eh param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, 100, param2);
        if (var3 == null) {
          return null;
        }
        return new qb(var3);
    }

    private final void b(byte[] param0) {
        int var2;
        int var3;
        jc var4;
        jc var5;
        jc var6;
        jc var7;
        jc var8;
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
        var4 = new jc(param0);
        var5 = new jc(param0);
        var6 = new jc(param0);
        var7 = new jc(param0);
        var8 = new jc(param0);
        var4.field_l = param0.length - 18;
        var9 = var4.c((byte) -96);
        var10 = var4.c((byte) -60);
        var11 = var4.g(11132);
        var12 = var4.g(11132);
        var13 = var4.g(11132);
        var14 = var4.g(11132);
        var15 = var4.g(11132);
        var16 = var4.g(11132);
        var17 = var4.c((byte) 123);
        var18 = var4.c((byte) -60);
        var19 = var4.c((byte) 115);
        var20 = var4.c((byte) -68);
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
        this.field_t = var9;
        this.field_J = var10;
        this.field_f = var11;
        this.field_x = new int[var9];
        this.field_o = new int[var9];
        this.field_l = new int[var9];
        this.field_V = new int[var10];
        this.field_v = new int[var10];
        this.field_e = new int[var10];
        if (var11 > 0) {
          this.field_N = new byte[var11];
          this.field_M = new short[var11];
          this.field_q = new short[var11];
          this.field_A = new short[var11];
        }
        if (var16 == 1) {
          this.field_C = new int[var9];
        }
        if (var12 == 1) {
          this.field_s = new byte[var10];
          this.field_B = new byte[var10];
          this.field_p = new short[var10];
        }
        if (var13 == 255) {
          this.field_O = new byte[var10];
        }
        if (var14 == 1) {
          this.field_w = new byte[var10];
        }
        if (var15 == 1) {
          this.field_Q = new int[var10];
        }
        this.field_W = new short[var10];
        var4.field_l = var22;
        var5.field_l = var32;
        var6.field_l = var33;
        var7.field_l = var34;
        var8.field_l = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.g(11132);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.d(103);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.d(56);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.d(61);
          }
          this.field_x[var38] = var35 + var40;
          this.field_o[var38] = var36 + var41;
          this.field_l[var38] = var37 + var42;
          var35 = this.field_x[var38];
          var36 = this.field_o[var38];
          var37 = this.field_l[var38];
          if (var16 == 1) {
            this.field_C[var38] = var8.g(11132);
          }
        }
        var4.field_l = var30;
        var5.field_l = var26;
        var6.field_l = var24;
        var7.field_l = var28;
        var8.field_l = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_W[var38Lifetime1] = (short)var4.c((byte) 55);
          if (var12 == 1) {
            var39Lifetime1 = var5.g(11132);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_s[var38Lifetime1] = (byte) 0;
            } else {
              this.field_s[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_B[var38Lifetime1] = (byte)-1;
              this.field_p[var38Lifetime1] = (short)-1;
            } else {
              this.field_B[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_p[var38Lifetime1] = this.field_W[var38Lifetime1];
              this.field_W[var38Lifetime1] = (short)127;
              if (this.field_p[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_O[var38Lifetime1] = var6.a((byte) -88);
          }
          if (var14 == 1) {
            this.field_w[var38Lifetime1] = var7.a((byte) 121);
          }
          if (var15 == 1) {
            this.field_Q[var38Lifetime1] = var8.g(11132);
          }
        }
        this.field_z = -1;
        var4.field_l = var29;
        var5.field_l = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.g(11132);
          if (var43 == 1) {
            var38Lifetime2 = var4.d(111) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.d(123) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.d(49) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_V[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_e[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.field_z) {
              this.field_z = var38Lifetime2;
            }
            if (var39Lifetime2 > this.field_z) {
              this.field_z = var39Lifetime2;
            }
            if (var40Lifetime1 > this.field_z) {
              this.field_z = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.d(52) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_V[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_e[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_z) {
              this.field_z = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.d(95) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_V[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_e[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_z) {
              this.field_z = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.d(72) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_V[var42Lifetime1] = var38Lifetime2;
            this.field_v[var42Lifetime1] = var39Lifetime2;
            this.field_e[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_z) {
              this.field_z = var40Lifetime1;
            }
          }
        }
        this.field_z = this.field_z + 1;
        var4.field_l = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_N[var42Lifetime2] = (byte) 0;
          this.field_M[var42Lifetime2] = (short)var4.c((byte) -52);
          this.field_q[var42Lifetime2] = (short)var4.c((byte) -63);
          this.field_A[var42Lifetime2] = (short)var4.c((byte) -114);
        }
        if (this.field_B != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_B[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_M[var44Lifetime1] & 65535) == this.field_V[var45] &&
                (this.field_q[var44Lifetime1] & 65535) == this.field_v[var45] &&
                (this.field_A[var44Lifetime1] & 65535) == this.field_e[var45]) {
                this.field_B[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_B = null;
          }
        }
        if (var3 == 0) {
          this.field_p = null;
        }
        if (var2 == 0) {
          this.field_s = null;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < this.field_t; var4++) {
          this.field_x[var4] = this.field_x[var4] + param0;
          this.field_o[var4] = this.field_o[var4] + param1;
          this.field_l[var4] = this.field_l[var4] + param2;
        }
        this.c();
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
          for (var3 = 0; var3 < this.field_t; var3++) {
            var4 = this.field_C[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_y = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_y[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_t; var3++) {
            var4Lifetime2 = this.field_C[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_y[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_C = null;
        }
        if (this.field_Q != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_J; var3Lifetime1++) {
            var4Lifetime1 = this.field_Q[var3Lifetime1];
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
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_J; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_Q[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_R[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_Q = null;
        }
    }

    private final void c() {
        this.field_n = null;
        this.field_g = null;
        this.field_L = null;
        this.field_T = false;
    }

    final void d() {
        pg dupTemp$0 = null;
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
        pg var16;
        s var17;
        s var18;
        s var19;
        int var1Lifetime1;
        if (this.field_n != null) {
          return;
        }
        this.field_n = new s[this.field_z];
        for (var1 = 0; var1 < this.field_z; var1++) {
          this.field_n[var1] = new s();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_J) {
            return;
          }
          var2 = this.field_V[var1Lifetime1];
          var3 = this.field_v[var1Lifetime1];
          var4 = this.field_e[var1Lifetime1];
          var5 = this.field_x[var3] - this.field_x[var2];
          var6 = this.field_o[var3] - this.field_o[var2];
          var7 = this.field_l[var3] - this.field_l[var2];
          var8 = this.field_x[var4] - this.field_x[var2];
          var9 = this.field_o[var4] - this.field_o[var2];
          var10 = this.field_l[var4] - this.field_l[var2];
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
              if (this.field_s != null) {
                var15 = this.field_s[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_L == null) {
                    this.field_L = new pg[this.field_J];
                  }
                  dupTemp$0 = new pg();
                  this.field_L[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_b = var11;
                  var16.field_d = var12;
                  var16.field_f = var13;
                }
              } else {
                var17 = this.field_n[var2];
                var17.field_j = var17.field_j + var11;
                var17.field_d = var17.field_d + var12;
                var17.field_i = var17.field_i + var13;
                var17.field_e = var17.field_e + 1;
                var18 = this.field_n[var3];
                var18.field_j = var18.field_j + var11;
                var18.field_d = var18.field_d + var12;
                var18.field_i = var18.field_i + var13;
                var18.field_e = var18.field_e + 1;
                var19 = this.field_n[var4];
                var19.field_j = var19.field_j + var11;
                var19.field_d = var19.field_d + var12;
                var19.field_i = var19.field_i + var13;
                var19.field_e = var19.field_e + 1;
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
        jc var2;
        jc var3;
        jc var4;
        jc var5;
        jc var6;
        jc var7;
        jc var8;
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
        var2 = new jc(param0);
        var3 = new jc(param0);
        var4 = new jc(param0);
        var5 = new jc(param0);
        var6 = new jc(param0);
        var7 = new jc(param0);
        var8 = new jc(param0);
        var2.field_l = param0.length - 23;
        var9 = var2.c((byte) -106);
        var10 = var2.c((byte) -91);
        var11 = var2.g(11132);
        var12 = var2.g(11132);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.g(11132);
        var16 = var2.g(11132);
        var17 = var2.g(11132);
        var18 = var2.g(11132);
        var19 = var2.g(11132);
        var20 = var2.c((byte) -104);
        var21 = var2.c((byte) 110);
        var22 = var2.c((byte) -98);
        var23 = var2.c((byte) 83);
        var24 = var2.c((byte) 108);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_N = new byte[var11];
          var2.field_l = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.a((byte) 110);
            this.field_N[var28] = dupTemp$0;
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
        this.field_t = var9;
        this.field_J = var10;
        this.field_f = var11;
        this.field_x = new int[var9];
        this.field_o = new int[var9];
        this.field_l = new int[var9];
        this.field_V = new int[var10];
        this.field_v = new int[var10];
        this.field_e = new int[var10];
        if (var19 == 1) {
          this.field_C = new int[var9];
        }
        if (var13 != 0) {
          this.field_s = new byte[var10];
        }
        if (var15 == 255) {
          this.field_O = new byte[var10];
        }
        if (var16 == 1) {
          this.field_w = new byte[var10];
        }
        if (var17 == 1) {
          this.field_Q = new int[var10];
        }
        if (var18 == 1) {
          this.field_p = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_B = new byte[var10];
        }
        this.field_W = new short[var10];
        if (var11 > 0) {
          this.field_M = new short[var11];
          this.field_q = new short[var11];
          this.field_A = new short[var11];
          if (var26 > 0) {
            this.field_E = new short[var26];
            this.field_P = new short[var26];
            this.field_i = new short[var26];
            this.field_D = new byte[var26];
            this.field_r = new byte[var26];
            this.field_m = new byte[var26];
          }
          if (var27 > 0) {
            this.field_I = new byte[var27];
            this.field_j = new byte[var27];
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
          var54 = var2.g(11132);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.d(87);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.d(85);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.d(55);
          }
          this.field_x[var53] = var50 + var55;
          this.field_o[var53] = var51 + var56;
          this.field_l[var53] = var52 + var57;
          var50 = this.field_x[var53];
          var51 = this.field_o[var53];
          var52 = this.field_l[var53];
          if (var19 == 1) {
            this.field_C[var53] = var6.g(11132);
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
          this.field_W[var53Lifetime1] = (short)var2.c((byte) 62);
          if (var13 != 0) {
            this.field_s[var53Lifetime1] = var3.a((byte) -82);
          }
          if (var15 == 255) {
            this.field_O[var53Lifetime1] = var4.a((byte) 43);
          }
          if (var16 == 1) {
            this.field_w[var53Lifetime1] = var5.a((byte) 64);
          }
          if (var17 == 1) {
            this.field_Q[var53Lifetime1] = var6.g(11132);
          }
          if (var18 == 1) {
            this.field_p[var53Lifetime1] = (short)(var7.c((byte) -93) - 1);
          }
          if (this.field_B != null) {
            if (this.field_p[var53Lifetime1] == -1) {
              this.field_B[var53Lifetime1] = (byte)-1;
            } else {
              this.field_B[var53Lifetime1] = (byte)(var8.g(11132) - 1);
            }
          }
        }
        this.field_z = -1;
        var2.field_l = var36;
        var3.field_l = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.g(11132);
          if (var58 == 1) {
            var53Lifetime2 = var2.d(48) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.d(127) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.d(53) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_V[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_e[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.field_z) {
              this.field_z = var53Lifetime2;
            }
            if (var54Lifetime1 > this.field_z) {
              this.field_z = var54Lifetime1;
            }
            if (var55Lifetime1 > this.field_z) {
              this.field_z = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.d(101) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_V[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_e[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_z) {
              this.field_z = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.d(125) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_V[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_e[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_z) {
              this.field_z = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.d(50) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_V[var57Lifetime1] = var53Lifetime2;
            this.field_v[var57Lifetime1] = var54Lifetime1;
            this.field_e[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_z) {
              this.field_z = var55Lifetime1;
            }
          }
        }
        this.field_z = this.field_z + 1;
        var2.field_l = var43;
        var3.field_l = var44;
        var4.field_l = var45;
        var5.field_l = var46;
        var6.field_l = var47;
        var7.field_l = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_N[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_M[var57Lifetime2] = (short)var2.c((byte) 34);
            this.field_q[var57Lifetime2] = (short)var2.c((byte) 78);
            this.field_A[var57Lifetime2] = (short)var2.c((byte) -81);
          }
          if (var58Lifetime1 == 1) {
            this.field_M[var57Lifetime2] = (short)var3.c((byte) -103);
            this.field_q[var57Lifetime2] = (short)var3.c((byte) 97);
            this.field_A[var57Lifetime2] = (short)var3.c((byte) 112);
            this.field_E[var57Lifetime2] = (short)var4.c((byte) -70);
            this.field_P[var57Lifetime2] = (short)var4.c((byte) -89);
            this.field_i[var57Lifetime2] = (short)var4.c((byte) -58);
            this.field_D[var57Lifetime2] = var5.a((byte) -124);
            this.field_r[var57Lifetime2] = var6.a((byte) 50);
            this.field_m[var57Lifetime2] = var7.a((byte) -114);
          }
          if (var58Lifetime1 == 2) {
            this.field_M[var57Lifetime2] = (short)var3.c((byte) -91);
            this.field_q[var57Lifetime2] = (short)var3.c((byte) 96);
            this.field_A[var57Lifetime2] = (short)var3.c((byte) -69);
            this.field_E[var57Lifetime2] = (short)var4.c((byte) -100);
            this.field_P[var57Lifetime2] = (short)var4.c((byte) -87);
            this.field_i[var57Lifetime2] = (short)var4.c((byte) -82);
            this.field_D[var57Lifetime2] = var5.a((byte) 67);
            this.field_r[var57Lifetime2] = var6.a((byte) 88);
            this.field_m[var57Lifetime2] = var7.a((byte) -73);
            this.field_I[var57Lifetime2] = var7.a((byte) -79);
            this.field_j[var57Lifetime2] = var7.a((byte) 84);
          }
          if (var58Lifetime1 == 3) {
            this.field_M[var57Lifetime2] = (short)var3.c((byte) -71);
            this.field_q[var57Lifetime2] = (short)var3.c((byte) -91);
            this.field_A[var57Lifetime2] = (short)var3.c((byte) 76);
            this.field_E[var57Lifetime2] = (short)var4.c((byte) -118);
            this.field_P[var57Lifetime2] = (short)var4.c((byte) -68);
            this.field_i[var57Lifetime2] = (short)var4.c((byte) 60);
            this.field_D[var57Lifetime2] = var5.a((byte) -70);
            this.field_r[var57Lifetime2] = var6.a((byte) 127);
            this.field_m[var57Lifetime2] = var7.a((byte) -70);
          }
        }
        if (var14 != 0) {
          var2.field_l = var49;
          var57Lifetime3 = var2.g(11132);
          if (var57Lifetime3 > 0) {
            var2.field_l = var2.field_l + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.g(11132);
          if (var58Lifetime2 > 0) {
            var2.field_l = var2.field_l + 4 * var58Lifetime2;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < this.field_t; var5++) {
          this.field_x[var5] = this.field_x[var5] * param0 / param3;
          this.field_o[var5] = this.field_o[var5] * param1 / param3;
          this.field_l[var5] = this.field_l[var5] * param2 / param3;
        }
        this.c();
    }

    final cn a(int param0, int param1, int param2, int param3, int param4) {
        return (cn) ((Object) new il(this, param0, param1, param2, param3, param4));
    }

    final void a(ll param0, int param1, int param2, int param3, boolean param4) {
        int var15 = 0;
        s dupTemp$0 = null;
        s dupTemp$1 = null;
        qb var6;
        int var7;
        int var9;
        int var10;
        s var11;
        int var12;
        int var13;
        int var14;
        s var16;
        s var17;
        s var18;
        int[] var22;
        int var10Lifetime1;
        int var10Lifetime1Lifetime1;
        s var16Lifetime1;
        s var16Lifetime2;
        var6 = (qb) (param0);
        var6.e();
        var6.d();
        field_u = field_u + 1;
        var7 = 0;
        var22 = var6.field_x;
        var9 = var6.field_z;
        for (var10 = 0; var10 < this.field_z; var10++) {
          var11 = this.field_n[var10];
          var16 = var11;
          var16Lifetime1 = var11;
          if (var11.field_e != 0) {
            var12 = this.field_o[var10] - param2;
            if (var12 >= var6.field_h &&
              var12 <= var6.field_S) {
              var13 = this.field_x[var10] - param1;
              if (var13 >= var6.field_F &&
                var13 <= var6.field_G) {
                var14 = this.field_l[var10] - param3;
                if (var14 >= var6.field_U &&
                  var14 <= var6.field_k) {
                  for (var15 = 0; var15 < var9; var15++) {
                    var16Lifetime2 = var6.field_n[var15];
                    if (var13 == var22[var15] &&
                      var14 == var6.field_l[var15] &&
                      var12 == var6.field_o[var15] &&
                      var16Lifetime2.field_e != 0) {
                      if (this.field_g == null) {
                        this.field_g = new s[this.field_z];
                      }
                      if (var6.field_g == null) {
                        var6.field_g = new s[var9];
                      }
                      var17 = this.field_g[var10];
                      if (var17 == null) {
                        dupTemp$0 = new s(var11);
                        this.field_g[var10] = dupTemp$0;
                        var17 = dupTemp$0;
                      }
                      var18 = var6.field_g[var15];
                      if (var18 == null) {
                        dupTemp$1 = new s(var16Lifetime2);
                        var6.field_g[var15] = dupTemp$1;
                        var18 = dupTemp$1;
                      }
                      var17.field_j = var17.field_j + var16Lifetime2.field_j;
                      var17.field_d = var17.field_d + var16Lifetime2.field_d;
                      var17.field_i = var17.field_i + var16Lifetime2.field_i;
                      var17.field_e = var17.field_e + var16Lifetime2.field_e;
                      var18.field_j = var18.field_j + var11.field_j;
                      var18.field_d = var18.field_d + var11.field_d;
                      var18.field_i = var18.field_i + var11.field_i;
                      var18.field_e = var18.field_e + var11.field_e;
                      var7++;
                      field_K[var10] = field_u;
                      field_H[var15] = field_u;
                    }
                  }
                }
              }
            }
          }
        }
        if (var7 >= 3 &&
          param4) {
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_J; var10Lifetime1++) {
            if (field_K[this.field_V[var10Lifetime1]] == field_u &&
              field_K[this.field_v[var10Lifetime1]] == field_u &&
              field_K[this.field_e[var10Lifetime1]] == field_u) {
              if (this.field_s == null) {
                this.field_s = new byte[this.field_J];
              }
              this.field_s[var10Lifetime1] = (byte)2;
            }
          }
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < var6.field_J; var10Lifetime1Lifetime1++) {
            if (field_H[var6.field_V[var10Lifetime1Lifetime1]] == field_u &&
              field_H[var6.field_v[var10Lifetime1Lifetime1]] == field_u &&
              field_H[var6.field_e[var10Lifetime1Lifetime1]] == field_u) {
              if (var6.field_s == null) {
                var6.field_s = new byte[var6.field_J];
              }
              var6.field_s[var10Lifetime1Lifetime1] = (byte)2;
            }
          }
          return;
        }
    }

    public static void b() {
        field_K = null;
        field_H = null;
    }

    private final void e() {
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
        if (this.field_T) {
          return;
        }
        this.field_T = true;
        var1 = 32767;
        var2 = 32767;
        var3 = 32767;
        var4 = -32768;
        var5 = -32768;
        var6 = -32768;
        for (var7 = 0; var7 < this.field_z; var7++) {
          var8 = this.field_x[var7];
          var9 = this.field_o[var7];
          var10 = this.field_l[var7];
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
        this.field_F = (short)var1;
        this.field_G = (short)var4;
        this.field_h = (short)var2;
        this.field_S = (short)var5;
        this.field_U = (short)var3;
        this.field_k = (short)var6;
    }

    private qb(byte[] param0) {
        this.field_z = 0;
        this.field_t = 0;
        this.field_J = 0;
        this.field_T = false;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.a(param0);
        } else {
          this.b(param0);
        }
    }

    static {
        field_u = 0;
        field_H = new int[10000];
        field_K = new int[10000];
    }
}
