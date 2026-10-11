/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends sb {
    int[] field_q;
    int[] field_e;
    byte[] field_J;
    short[] field_b;
    byte[] field_x;
    byte[] field_h;
    short[] field_K;
    short[] field_c;
    int[] field_i;
    private static int[] field_C;
    int[] field_D;
    byte field_A;
    int[] field_H;
    int[] field_p;
    int[][] field_n;
    int[][] field_w;
    byte[] field_o;
    private static int field_u;
    short[] field_N;
    int field_O;
    sg[] field_B;
    byte[] field_I;
    int field_L;
    int[] field_r;
    short[] field_m;
    int field_G;
    sg[] field_Q;
    byte[] field_g;
    int field_z;
    short[] field_F;
    int[] field_d;
    byte[] field_k;
    private static int field_l;
    private static int[] field_s;
    short[] field_P;
    byte[] field_a;
    byte[] field_E;
    byte[] field_y;
    short[] field_M;
    short[] field_f;
    private static int field_v;
    g[] field_j;
    short[] field_t;

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
          field_v = 0;
          field_u = 0;
          field_l = 0;
          for (var8 = 0; var8 < var6; var8++) {
            var9 = param1[var8];
            if (var9 < this.field_n.length) {
              var34 = this.field_n[var9];
              for (var11 = 0; var11 < var34.length; var11++) {
                var12 = var34[var11];
                field_v = field_v + this.field_p[var12];
                field_u = field_u + this.field_D[var12];
                field_l = field_l + this.field_i[var12];
                var7++;
              }
            }
          }
          if (var7 <= 0) {
            field_v = param2;
            field_u = param3;
            field_l = param4;
          } else {
            field_v = field_v / var7 + param2;
            field_u = field_u / var7 + param3;
            field_l = field_l / var7 + param4;
          }
          return;
        }
        if (param0 == 1) {
          for (var7Lifetime1 = 0; var7Lifetime1 < var6; var7Lifetime1++) {
            var8Lifetime1 = param1[var7Lifetime1];
            if (var8Lifetime1 < this.field_n.length) {
              var35 = this.field_n[var8Lifetime1];
              for (var10 = 0; var10 < var35.length; var10++) {
                var11Lifetime1 = var35[var10];
                this.field_p[var11Lifetime1] = this.field_p[var11Lifetime1] + param2;
                this.field_D[var11Lifetime1] = this.field_D[var11Lifetime1] + param3;
                this.field_i[var11Lifetime1] = this.field_i[var11Lifetime1] + param4;
              }
            }
          }
          return;
        }
        if (param0 == 2) {
          for (var7Lifetime2 = 0; var7Lifetime2 < var6; var7Lifetime2++) {
            var8Lifetime2 = param1[var7Lifetime2];
            if (var8Lifetime2 < this.field_n.length) {
              var36 = this.field_n[var8Lifetime2];
              for (var10Lifetime1 = 0; var10Lifetime1 < var36.length; var10Lifetime1++) {
                var11Lifetime2 = var36[var10Lifetime1];
                this.field_p[var11Lifetime2] = this.field_p[var11Lifetime2] - field_v;
                this.field_D[var11Lifetime2] = this.field_D[var11Lifetime2] - field_u;
                this.field_i[var11Lifetime2] = this.field_i[var11Lifetime2] - field_l;
                if (param4 != 0) {
                  var12Lifetime1 = field_C[param4];
                  var13 = field_s[param4];
                  var14 = this.field_D[var11Lifetime2] * var12Lifetime1 + this.field_p[var11Lifetime2] * var13 >> 16;
                  this.field_D[var11Lifetime2] = this.field_D[var11Lifetime2] * var13 - this.field_p[var11Lifetime2] * var12Lifetime1 >> 16;
                  this.field_p[var11Lifetime2] = var14;
                }
                if (param2 != 0) {
                  var12Lifetime1Lifetime1 = field_C[param2];
                  var13Lifetime2 = field_s[param2];
                  var14Lifetime2 = this.field_D[var11Lifetime2] * var13Lifetime2 - this.field_i[var11Lifetime2] * var12Lifetime1Lifetime1 >> 16;
                  this.field_i[var11Lifetime2] = this.field_D[var11Lifetime2] * var12Lifetime1Lifetime1 + this.field_i[var11Lifetime2] * var13Lifetime2 >> 16;
                  this.field_D[var11Lifetime2] = var14Lifetime2;
                }
                if (param3 != 0) {
                  var12Lifetime1Lifetime2 = field_C[param3];
                  var13Lifetime3 = field_s[param3];
                  var14Lifetime3 = this.field_i[var11Lifetime2] * var12Lifetime1Lifetime2 + this.field_p[var11Lifetime2] * var13Lifetime3 >> 16;
                  this.field_i[var11Lifetime2] = this.field_i[var11Lifetime2] * var13Lifetime3 - this.field_p[var11Lifetime2] * var12Lifetime1Lifetime2 >> 16;
                  this.field_p[var11Lifetime2] = var14Lifetime3;
                }
                this.field_p[var11Lifetime2] = this.field_p[var11Lifetime2] + field_v;
                this.field_D[var11Lifetime2] = this.field_D[var11Lifetime2] + field_u;
                this.field_i[var11Lifetime2] = this.field_i[var11Lifetime2] + field_l;
              }
            }
          }
          return;
        }
        if (param0 == 3) {
          for (var7Lifetime3 = 0; var7Lifetime3 < var6; var7Lifetime3++) {
            var8Lifetime3 = param1[var7Lifetime3];
            if (var8Lifetime3 < this.field_n.length) {
              var37 = this.field_n[var8Lifetime3];
              for (var10Lifetime2 = 0; var10Lifetime2 < var37.length; var10Lifetime2++) {
                var11Lifetime3 = var37[var10Lifetime2];
                this.field_p[var11Lifetime3] = this.field_p[var11Lifetime3] - field_v;
                this.field_D[var11Lifetime3] = this.field_D[var11Lifetime3] - field_u;
                this.field_i[var11Lifetime3] = this.field_i[var11Lifetime3] - field_l;
                this.field_p[var11Lifetime3] = this.field_p[var11Lifetime3] * param2 / 128;
                this.field_D[var11Lifetime3] = this.field_D[var11Lifetime3] * param3 / 128;
                this.field_i[var11Lifetime3] = this.field_i[var11Lifetime3] * param4 / 128;
                this.field_p[var11Lifetime3] = this.field_p[var11Lifetime3] + field_v;
                this.field_D[var11Lifetime3] = this.field_D[var11Lifetime3] + field_u;
                this.field_i[var11Lifetime3] = this.field_i[var11Lifetime3] + field_l;
              }
            }
          }
          return;
        }
        if (param0 == 5) {
          if (this.field_w != null &&
            this.field_o != null) {
            for (var7Lifetime4 = 0; var7Lifetime4 < var6; var7Lifetime4++) {
              var8Lifetime4 = param1[var7Lifetime4];
              if (var8Lifetime4 < this.field_w.length) {
                var38 = this.field_w[var8Lifetime4];
                for (var10Lifetime3 = 0; var10Lifetime3 < var38.length; var10Lifetime3++) {
                  var11Lifetime4 = var38[var10Lifetime3];
                  var12Lifetime2 = (this.field_o[var11Lifetime4] & 255) + param2 * 8;
                  if (var12Lifetime2 >= 0) {
                    if (var12Lifetime2 > 255) {
                      var12Lifetime2 = 255;
                    }
                  } else {
                    var12Lifetime2 = 0;
                  }
                  this.field_o[var11Lifetime4] = (byte)var12Lifetime2;
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
        if (this.field_w != null) {
          for (var7Lifetime5 = 0; var7Lifetime5 < var6; var7Lifetime5++) {
            var8Lifetime5 = param1[var7Lifetime5];
            if (var8Lifetime5 < this.field_w.length) {
              var39 = this.field_w[var8Lifetime5];
              for (var10Lifetime4 = 0; var10Lifetime4 < var39.length; var10Lifetime4++) {
                var11Lifetime5 = var39[var10Lifetime4];
                var12Lifetime3 = this.field_c[var11Lifetime5] & 65535;
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
                this.field_c[var11Lifetime5] = (short)(var13Lifetime1 << 10 | var14Lifetime1 << 7 | var15);
              }
            }
          }
        }
    }

    final fc b(int param0, int param1, int param2, int param3, int param4) {
        return new fc(this, param0, param1, param2, param3, param4);
    }

    final void b() {
        this.field_B = null;
        this.field_Q = null;
        this.field_j = null;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < this.field_G; var4++) {
          this.field_p[var4] = this.field_p[var4] * param0 / 128;
          this.field_D[var4] = this.field_D[var4] * param1 / 128;
          this.field_i[var4] = this.field_i[var4] * param2 / 128;
        }
        this.b();
    }

    final void a(lg param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        this.field_G = param0.field_G;
        this.field_O = param0.field_O;
        this.field_z = param0.field_z;
        this.field_L = param0.field_L;
        if (!param1) {
          for (var6 = 0; var6 < this.field_G; var6++) {
            this.field_p[var6] = param0.field_p[var6];
            this.field_D[var6] = param0.field_D[var6];
            this.field_i[var6] = param0.field_i[var6];
          }
        } else {
          this.field_p = param0.field_p;
          this.field_D = param0.field_D;
          this.field_i = param0.field_i;
        }
        if (!param2) {
          qq.a(param0.field_c, 0, this.field_c, 0, this.field_z);
        } else {
          this.field_c = param0.field_c;
        }
        if (!param3 &&
          param0.field_N != null) {
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_z; var6Lifetime1++) {
            this.field_N[var6Lifetime1] = param0.field_N[var6Lifetime1];
          }
        } else {
          this.field_N = param0.field_N;
        }
        if (!param4) {
          if (param0.field_o == null) {
            for (var6Lifetime2 = 0; var6Lifetime2 < this.field_z; var6Lifetime2++) {
              this.field_o[var6Lifetime2] = (byte) 0;
            }
          } else {
            qq.a(param0.field_o, 0, this.field_o, 0, this.field_z);
          }
        } else {
          this.field_o = param0.field_o;
        }
        this.field_e = param0.field_e;
        this.field_H = param0.field_H;
        this.field_r = param0.field_r;
        this.field_g = param0.field_g;
        this.field_k = param0.field_k;
        this.field_x = param0.field_x;
        this.field_A = param0.field_A;
        this.field_E = param0.field_E;
        this.field_M = param0.field_M;
        this.field_P = param0.field_P;
        this.field_F = param0.field_F;
        this.field_m = param0.field_m;
        this.field_b = param0.field_b;
        this.field_t = param0.field_t;
        this.field_y = param0.field_y;
        this.field_a = param0.field_a;
        this.field_h = param0.field_h;
        this.field_J = param0.field_J;
        this.field_I = param0.field_I;
        this.field_d = param0.field_d;
        this.field_q = param0.field_q;
        this.field_n = param0.field_n;
        this.field_w = param0.field_w;
        this.field_B = param0.field_B;
        this.field_j = param0.field_j;
        this.field_Q = param0.field_Q;
        this.field_f = param0.field_f;
        this.field_K = param0.field_K;
    }

    final void a(ei param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        this.d();
        if (this.field_n == null) {
          return;
        }
        if (param1 == -1) {
          return;
        }
        ul var3 = param0.field_t[param1];
        mb var4 = var3.field_a;
        field_v = 0;
        field_u = 0;
        field_l = 0;
        for (var5 = 0; var5 < var3.field_l; var5++) {
          var6 = var3.field_f[var5];
          if (var3.field_e[var5] != -1) {
            this.a(0, var4.field_p[var3.field_e[var5]], 0, 0, 0);
          }
          this.a(var4.field_r[var6], var4.field_p[var6], (int) var3.field_d[var5], (int) var3.field_n[var5], (int) var3.field_k[var5]);
        }
        this.b();
    }

    final static lg a(r param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, param2, 0);
        if (var3 == null) {
          return null;
        }
        return new lg(var3);
    }

    private final int a(lg param0, int param1, short param2) {
        int var7 = 0;
        int var4;
        int var5;
        int var6;
        var4 = param0.field_p[param1];
        var5 = param0.field_D[param1];
        var6 = param0.field_i[param1];
        for (var7 = 0; var7 < this.field_G; var7++) {
          if (var4 == this.field_p[var7] &&
            var5 == this.field_D[var7] &&
            var6 == this.field_i[var7]) {
            this.field_f[var7] = (short)(this.field_f[var7] | param2);
            return var7;
          }
        }
        this.field_p[this.field_G] = var4;
        this.field_D[this.field_G] = var5;
        this.field_i[this.field_G] = var6;
        this.field_f[this.field_G] = (short)param2;
        if (param0.field_d != null) {
          this.field_d[this.field_G] = param0.field_d[param1];
        }
        int fieldTemp$0 = this.field_G;
        this.field_G = this.field_G + 1;
        return fieldTemp$0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < this.field_G; var4++) {
          if (this.field_p[var4] == param0 &&
            this.field_D[var4] == param1 &&
            this.field_i[var4] == param2) {
            return var4;
          }
        }
        this.field_p[this.field_G] = param0;
        this.field_D[this.field_G] = param1;
        this.field_i[this.field_G] = param2;
        int fieldTemp$0 = this.field_G + 1;
        this.field_G = this.field_G + 1;
        this.field_O = fieldTemp$0;
        return this.field_G - 1;
    }

    final bn a(int param0, int param1, int param2, int param3, int param4) {
        return (bn) ((Object) new fc(this, param0, param1, param2, param3, param4));
    }

    final byte a(short param0, short param1, short param2) {
        if (this.field_L >= 255) {
          throw new IllegalStateException();
        }
        this.field_E[this.field_L] = (byte) 0;
        this.field_M[this.field_L] = (short)param0;
        this.field_P[this.field_L] = (short)param1;
        this.field_F[this.field_L] = (short)param2;
        int fieldTemp$0 = this.field_L;
        this.field_L = this.field_L + 1;
        return (byte)fieldTemp$0;
    }

    final void c() {
        g dupTemp$0 = null;
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
        g var16;
        sg var17;
        sg var18;
        sg var19;
        int var1Lifetime1;
        if (this.field_B != null) {
          return;
        }
        this.field_B = new sg[this.field_O];
        for (var1 = 0; var1 < this.field_O; var1++) {
          this.field_B[var1] = new sg();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_z) {
            return;
          }
          var2 = this.field_e[var1Lifetime1];
          var3 = this.field_H[var1Lifetime1];
          var4 = this.field_r[var1Lifetime1];
          var5 = this.field_p[var3] - this.field_p[var2];
          var6 = this.field_D[var3] - this.field_D[var2];
          var7 = this.field_i[var3] - this.field_i[var2];
          var8 = this.field_p[var4] - this.field_p[var2];
          var9 = this.field_D[var4] - this.field_D[var2];
          var10 = this.field_i[var4] - this.field_i[var2];
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
              if (this.field_g != null) {
                var15 = this.field_g[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_j == null) {
                    this.field_j = new g[this.field_z];
                  }
                  dupTemp$0 = new g();
                  this.field_j[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_a = var11;
                  var16.field_c = var12;
                  var16.field_d = var13;
                }
              } else {
                var17 = this.field_B[var2];
                var17.field_b = var17.field_b + var11;
                var17.field_h = var17.field_h + var12;
                var17.field_f = var17.field_f + var13;
                var17.field_g = var17.field_g + 1;
                var18 = this.field_B[var3];
                var18.field_b = var18.field_b + var11;
                var18.field_h = var18.field_h + var12;
                var18.field_f = var18.field_f + var13;
                var18.field_g = var18.field_g + 1;
                var19 = this.field_B[var4];
                var19.field_b = var19.field_b + var11;
                var19.field_h = var19.field_h + var12;
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

    private final void b(byte[] param0) {
        byte dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        ed var2;
        ed var3;
        ed var4;
        ed var5;
        ed var6;
        ed var7;
        ed var8;
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
        var2 = new ed(param0);
        var3 = new ed(param0);
        var4 = new ed(param0);
        var5 = new ed(param0);
        var6 = new ed(param0);
        var7 = new ed(param0);
        var8 = new ed(param0);
        var2.field_u = param0.length - 23;
        var9 = var2.a((byte) -11);
        var10 = var2.a((byte) -11);
        var11 = var2.h(-11);
        var12 = var2.h(-11);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.h(-11);
        var16 = var2.h(-11);
        var17 = var2.h(-11);
        var18 = var2.h(-11);
        var19 = var2.h(-11);
        var20 = var2.a((byte) -11);
        var21 = var2.a((byte) -11);
        var22 = var2.a((byte) -11);
        var23 = var2.a((byte) -11);
        var24 = var2.a((byte) -11);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_E = new byte[var11];
          var2.field_u = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.g(85);
            this.field_E[var28] = dupTemp$0;
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
        this.field_G = var9;
        this.field_z = var10;
        this.field_L = var11;
        this.field_p = new int[var9];
        this.field_D = new int[var9];
        this.field_i = new int[var9];
        this.field_e = new int[var10];
        this.field_H = new int[var10];
        this.field_r = new int[var10];
        if (var19 == 1) {
          this.field_d = new int[var9];
        }
        if (var13 != 0) {
          this.field_g = new byte[var10];
        }
        if (var15 != 255) {
          this.field_A = (byte)var15;
        } else {
          this.field_k = new byte[var10];
        }
        if (var16 == 1) {
          this.field_o = new byte[var10];
        }
        if (var17 == 1) {
          this.field_q = new int[var10];
        }
        if (var18 == 1) {
          this.field_N = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_x = new byte[var10];
        }
        this.field_c = new short[var10];
        if (var11 > 0) {
          this.field_M = new short[var11];
          this.field_P = new short[var11];
          this.field_F = new short[var11];
          if (var26 > 0) {
            this.field_m = new short[var26];
            this.field_b = new short[var26];
            this.field_t = new short[var26];
            this.field_y = new byte[var26];
            this.field_a = new byte[var26];
            this.field_h = new byte[var26];
          }
          if (var27 > 0) {
            this.field_J = new byte[var27];
            this.field_I = new byte[var27];
          }
        }
        var2.field_u = var29Lifetime1;
        var3.field_u = var40;
        var4.field_u = var41;
        var5.field_u = var42;
        var6.field_u = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        for (var53 = 0; var53 < var9; var53++) {
          var54 = var2.h(-11);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.j(-3084);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.j(-3084);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.j(-3084);
          }
          this.field_p[var53] = var50 + var55;
          this.field_D[var53] = var51 + var56;
          this.field_i[var53] = var52 + var57;
          var50 = this.field_p[var53];
          var51 = this.field_D[var53];
          var52 = this.field_i[var53];
          if (var19 == 1) {
            this.field_d[var53] = var6.h(-11);
          }
        }
        var2.field_u = var39;
        var3.field_u = var30;
        var4.field_u = var32;
        var5.field_u = var35;
        var6.field_u = var33;
        var7.field_u = var37;
        var8.field_u = var38;
        for (var53Lifetime1 = 0; var53Lifetime1 < var10; var53Lifetime1++) {
          this.field_c[var53Lifetime1] = (short)var2.a((byte) -11);
          if (var13 != 0) {
            this.field_g[var53Lifetime1] = var3.g(112);
          }
          if (var15 == 255) {
            this.field_k[var53Lifetime1] = var4.g(113);
          }
          if (var16 == 1) {
            this.field_o[var53Lifetime1] = var5.g(96);
          }
          if (var17 == 1) {
            this.field_q[var53Lifetime1] = var6.h(-11);
          }
          if (var18 == 1) {
            this.field_N[var53Lifetime1] = (short)(var7.a((byte) -11) - 1);
          }
          if (this.field_x != null) {
            if (this.field_N[var53Lifetime1] == -1) {
              this.field_x[var53Lifetime1] = (byte)-1;
            } else {
              this.field_x[var53Lifetime1] = (byte)(var8.h(-11) - 1);
            }
          }
        }
        this.field_O = -1;
        var2.field_u = var36;
        var3.field_u = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.h(-11);
          if (var58 == 1) {
            var53Lifetime2 = var2.j(-3084) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.j(-3084) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.j(-3084) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_e[var57Lifetime1] = var53Lifetime2;
            this.field_H[var57Lifetime1] = var54Lifetime1;
            this.field_r[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.field_O) {
              this.field_O = var53Lifetime2;
            }
            if (var54Lifetime1 > this.field_O) {
              this.field_O = var54Lifetime1;
            }
            if (var55Lifetime1 > this.field_O) {
              this.field_O = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.j(-3084) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_e[var57Lifetime1] = var53Lifetime2;
            this.field_H[var57Lifetime1] = var54Lifetime1;
            this.field_r[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_O) {
              this.field_O = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.j(-3084) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_e[var57Lifetime1] = var53Lifetime2;
            this.field_H[var57Lifetime1] = var54Lifetime1;
            this.field_r[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_O) {
              this.field_O = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.j(-3084) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_e[var57Lifetime1] = var53Lifetime2;
            this.field_H[var57Lifetime1] = var54Lifetime1;
            this.field_r[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_O) {
              this.field_O = var55Lifetime1;
            }
          }
        }
        this.field_O = this.field_O + 1;
        var2.field_u = var43;
        var3.field_u = var44;
        var4.field_u = var45;
        var5.field_u = var46;
        var6.field_u = var47;
        var7.field_u = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_E[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_M[var57Lifetime2] = (short)var2.a((byte) -11);
            this.field_P[var57Lifetime2] = (short)var2.a((byte) -11);
            this.field_F[var57Lifetime2] = (short)var2.a((byte) -11);
          }
          if (var58Lifetime1 == 1) {
            this.field_M[var57Lifetime2] = (short)var3.a((byte) -11);
            this.field_P[var57Lifetime2] = (short)var3.a((byte) -11);
            this.field_F[var57Lifetime2] = (short)var3.a((byte) -11);
            this.field_m[var57Lifetime2] = (short)var4.a((byte) -11);
            this.field_b[var57Lifetime2] = (short)var4.a((byte) -11);
            this.field_t[var57Lifetime2] = (short)var4.a((byte) -11);
            this.field_y[var57Lifetime2] = var5.g(90);
            this.field_a[var57Lifetime2] = var6.g(105);
            this.field_h[var57Lifetime2] = var7.g(88);
          }
          if (var58Lifetime1 == 2) {
            this.field_M[var57Lifetime2] = (short)var3.a((byte) -11);
            this.field_P[var57Lifetime2] = (short)var3.a((byte) -11);
            this.field_F[var57Lifetime2] = (short)var3.a((byte) -11);
            this.field_m[var57Lifetime2] = (short)var4.a((byte) -11);
            this.field_b[var57Lifetime2] = (short)var4.a((byte) -11);
            this.field_t[var57Lifetime2] = (short)var4.a((byte) -11);
            this.field_y[var57Lifetime2] = var5.g(120);
            this.field_a[var57Lifetime2] = var6.g(97);
            this.field_h[var57Lifetime2] = var7.g(94);
            this.field_J[var57Lifetime2] = var7.g(119);
            this.field_I[var57Lifetime2] = var7.g(110);
          }
          if (var58Lifetime1 == 3) {
            this.field_M[var57Lifetime2] = (short)var3.a((byte) -11);
            this.field_P[var57Lifetime2] = (short)var3.a((byte) -11);
            this.field_F[var57Lifetime2] = (short)var3.a((byte) -11);
            this.field_m[var57Lifetime2] = (short)var4.a((byte) -11);
            this.field_b[var57Lifetime2] = (short)var4.a((byte) -11);
            this.field_t[var57Lifetime2] = (short)var4.a((byte) -11);
            this.field_y[var57Lifetime2] = var5.g(118);
            this.field_a[var57Lifetime2] = var6.g(119);
            this.field_h[var57Lifetime2] = var7.g(79);
          }
        }
        if (var14 != 0) {
          var2.field_u = var49;
          var57Lifetime3 = var2.h(-11);
          if (var57Lifetime3 > 0) {
            var2.field_u = var2.field_u + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.h(-11);
          if (var58Lifetime2 > 0) {
            var2.field_u = var2.field_u + 4 * var58Lifetime2;
          }
        }
    }

    final int a(int param0, int param1, int param2, byte param3, byte param4, short param5, short param6) {
        this.field_e[this.field_z] = param0;
        this.field_H[this.field_z] = param1;
        this.field_r[this.field_z] = param2;
        this.field_g[this.field_z] = (byte)param3;
        this.field_x[this.field_z] = (byte)param4;
        this.field_c[this.field_z] = (short)param5;
        this.field_N[this.field_z] = (short)param6;
        int fieldTemp$0 = this.field_z;
        this.field_z = this.field_z + 1;
        return fieldTemp$0;
    }

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = 0; var2 < this.field_G; var2++) {
          var3 = this.field_p[var2];
          var4 = this.field_D[var2];
          var5 = this.field_i[var2];
          this.field_p[var2] = param0[0] + (var3 * param0[3] + var4 * param0[6] + var5 * param0[9] >> 16);
          this.field_D[var2] = param0[1] + (var3 * param0[4] + var4 * param0[7] + var5 * param0[10] >> 16);
          this.field_i[var2] = param0[2] + (var3 * param0[5] + var4 * param0[8] + var5 * param0[11] >> 16);
        }
        this.b();
    }

    public static void a() {
        field_C = null;
        field_s = null;
    }

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
        if (this.field_d != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_G; var3++) {
            var4 = this.field_d[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_n = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_n[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_G; var3++) {
            var4Lifetime2 = this.field_d[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_n[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_d = null;
        }
        if (this.field_q != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_z; var3Lifetime1++) {
            var4Lifetime1 = this.field_q[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_w = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_w[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_z; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_q[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_w[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_q = null;
        }
    }

    private final void a(byte[] param0) {
        int var2;
        int var3;
        ed var4;
        ed var5;
        ed var6;
        ed var7;
        ed var8;
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
        var4 = new ed(param0);
        var5 = new ed(param0);
        var6 = new ed(param0);
        var7 = new ed(param0);
        var8 = new ed(param0);
        var4.field_u = param0.length - 18;
        var9 = var4.a((byte) -11);
        var10 = var4.a((byte) -11);
        var11 = var4.h(-11);
        var12 = var4.h(-11);
        var13 = var4.h(-11);
        var14 = var4.h(-11);
        var15 = var4.h(-11);
        var16 = var4.h(-11);
        var17 = var4.a((byte) -11);
        var18 = var4.a((byte) -11);
        var19 = var4.a((byte) -11);
        var20 = var4.a((byte) -11);
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
        this.field_G = var9;
        this.field_z = var10;
        this.field_L = var11;
        this.field_p = new int[var9];
        this.field_D = new int[var9];
        this.field_i = new int[var9];
        this.field_e = new int[var10];
        this.field_H = new int[var10];
        this.field_r = new int[var10];
        if (var11 > 0) {
          this.field_E = new byte[var11];
          this.field_M = new short[var11];
          this.field_P = new short[var11];
          this.field_F = new short[var11];
        }
        if (var16 == 1) {
          this.field_d = new int[var9];
        }
        if (var12 == 1) {
          this.field_g = new byte[var10];
          this.field_x = new byte[var10];
          this.field_N = new short[var10];
        }
        if (var13 != 255) {
          this.field_A = (byte)var13;
        } else {
          this.field_k = new byte[var10];
        }
        if (var14 == 1) {
          this.field_o = new byte[var10];
        }
        if (var15 == 1) {
          this.field_q = new int[var10];
        }
        this.field_c = new short[var10];
        var4.field_u = var22;
        var5.field_u = var32;
        var6.field_u = var33;
        var7.field_u = var34;
        var8.field_u = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.h(-11);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.j(-3084);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.j(-3084);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.j(-3084);
          }
          this.field_p[var38] = var35 + var40;
          this.field_D[var38] = var36 + var41;
          this.field_i[var38] = var37 + var42;
          var35 = this.field_p[var38];
          var36 = this.field_D[var38];
          var37 = this.field_i[var38];
          if (var16 == 1) {
            this.field_d[var38] = var8.h(-11);
          }
        }
        var4.field_u = var30;
        var5.field_u = var26;
        var6.field_u = var24;
        var7.field_u = var28;
        var8.field_u = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_c[var38Lifetime1] = (short)var4.a((byte) -11);
          if (var12 == 1) {
            var39Lifetime1 = var5.h(-11);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_g[var38Lifetime1] = (byte) 0;
            } else {
              this.field_g[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_x[var38Lifetime1] = (byte)-1;
              this.field_N[var38Lifetime1] = (short)-1;
            } else {
              this.field_x[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_N[var38Lifetime1] = this.field_c[var38Lifetime1];
              this.field_c[var38Lifetime1] = (short)127;
              if (this.field_N[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_k[var38Lifetime1] = var6.g(84);
          }
          if (var14 == 1) {
            this.field_o[var38Lifetime1] = var7.g(82);
          }
          if (var15 == 1) {
            this.field_q[var38Lifetime1] = var8.h(-11);
          }
        }
        this.field_O = -1;
        var4.field_u = var29;
        var5.field_u = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.h(-11);
          if (var43 == 1) {
            var38Lifetime2 = var4.j(-3084) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.j(-3084) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.j(-3084) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_e[var42Lifetime1] = var38Lifetime2;
            this.field_H[var42Lifetime1] = var39Lifetime2;
            this.field_r[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.field_O) {
              this.field_O = var38Lifetime2;
            }
            if (var39Lifetime2 > this.field_O) {
              this.field_O = var39Lifetime2;
            }
            if (var40Lifetime1 > this.field_O) {
              this.field_O = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.j(-3084) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_e[var42Lifetime1] = var38Lifetime2;
            this.field_H[var42Lifetime1] = var39Lifetime2;
            this.field_r[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_O) {
              this.field_O = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.j(-3084) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_e[var42Lifetime1] = var38Lifetime2;
            this.field_H[var42Lifetime1] = var39Lifetime2;
            this.field_r[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_O) {
              this.field_O = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.j(-3084) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_e[var42Lifetime1] = var38Lifetime2;
            this.field_H[var42Lifetime1] = var39Lifetime2;
            this.field_r[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_O) {
              this.field_O = var40Lifetime1;
            }
          }
        }
        this.field_O = this.field_O + 1;
        var4.field_u = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_E[var42Lifetime2] = (byte) 0;
          this.field_M[var42Lifetime2] = (short)var4.a((byte) -11);
          this.field_P[var42Lifetime2] = (short)var4.a((byte) -11);
          this.field_F[var42Lifetime2] = (short)var4.a((byte) -11);
        }
        if (this.field_x != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_x[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_M[var44Lifetime1] & 65535) == this.field_e[var45] &&
                (this.field_P[var44Lifetime1] & 65535) == this.field_H[var45] &&
                (this.field_F[var44Lifetime1] & 65535) == this.field_r[var45]) {
                this.field_x[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_x = null;
          }
        }
        if (var3 == 0) {
          this.field_N = null;
        }
        if (var2 == 0) {
          this.field_g = null;
        }
    }

    private lg(byte[] param0) {
        this.field_G = 0;
        this.field_O = 0;
        this.field_A = (byte) 0;
        this.field_z = 0;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.b(param0);
        } else {
          this.a(param0);
        }
    }

    lg(int param0, int param1, int param2) {
        this.field_G = 0;
        this.field_O = 0;
        this.field_A = (byte) 0;
        this.field_z = 0;
        this.field_p = new int[param0];
        this.field_D = new int[param0];
        this.field_i = new int[param0];
        this.field_d = new int[param0];
        this.field_e = new int[param1];
        this.field_H = new int[param1];
        this.field_r = new int[param1];
        this.field_g = new byte[param1];
        this.field_k = new byte[param1];
        this.field_o = new byte[param1];
        this.field_c = new short[param1];
        this.field_N = new short[param1];
        this.field_x = new byte[param1];
        this.field_q = new int[param1];
        if (param2 > 0) {
          this.field_E = new byte[param2];
          this.field_M = new short[param2];
          this.field_P = new short[param2];
          this.field_F = new short[param2];
          this.field_m = new short[param2];
          this.field_b = new short[param2];
          this.field_t = new short[param2];
          this.field_y = new byte[param2];
          this.field_a = new byte[param2];
          this.field_h = new byte[param2];
          this.field_J = new byte[param2];
          this.field_I = new byte[param2];
        }
    }

    lg(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7) {
        this.field_G = 0;
        this.field_O = 0;
        this.field_A = (byte) 0;
        this.field_z = 0;
        int var9 = 0;
        this.field_A = (byte) -1;
        this.field_p = new int[param0];
        this.field_D = new int[param0];
        this.field_i = new int[param0];
        this.field_d = new int[param0];
        this.field_f = new short[param0];
        this.field_e = new int[param1];
        this.field_H = new int[param1];
        this.field_r = new int[param1];
        if (var9 != 0) {
          this.field_g = new byte[param1];
        }
        if (param3) {
          this.field_k = new byte[param1];
        }
        if (param4) {
          this.field_o = new byte[param1];
        }
        if (param5) {
          this.field_q = new int[param1];
        }
        if (param6) {
          this.field_N = new short[param1];
        }
        if (param7) {
          this.field_x = new byte[param1];
        }
        this.field_c = new short[param1];
        this.field_K = new short[param1];
        if (param2 > 0) {
          this.field_E = new byte[param2];
          this.field_M = new short[param2];
          this.field_P = new short[param2];
          this.field_F = new short[param2];
          this.field_m = new short[param2];
          this.field_b = new short[param2];
          this.field_t = new short[param2];
          this.field_y = new byte[param2];
          this.field_a = new byte[param2];
          this.field_h = new byte[param2];
          this.field_J = new byte[param2];
          this.field_I = new byte[param2];
        }
    }

    lg(lg[] param0, int param1) {
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
        lg var10_ref_lg;
        lg var11;
        int var12;
        int var13;
        int var14;
        lg var15;
        lg var16;
        int var17;
        lg var18;
        lg var19;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        lg var11Lifetime1;
        this.field_G = 0;
        this.field_O = 0;
        this.field_A = (byte) 0;
        this.field_z = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        this.field_G = 0;
        this.field_z = 0;
        this.field_L = 0;
        this.field_A = (byte) -1;
        for (var9 = 0; var9 < param1; var9++) {
          var10_ref_lg = param0[var9];
          if (var10_ref_lg != null) {
            this.field_G = this.field_G + var10_ref_lg.field_G;
            this.field_z = this.field_z + var10_ref_lg.field_z;
            this.field_L = this.field_L + var10_ref_lg.field_L;
            if (var10_ref_lg.field_k == null) {
              if (this.field_A == -1) {
                this.field_A = var10_ref_lg.field_A;
              }
              if (this.field_A != var10_ref_lg.field_A) {
                var4 = 1;
              }
            } else {
              var4 = 1;
            }
            stackIn_13_0 = var3;
            if (var10_ref_lg.field_g == null) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            var3 = stackIn_13_0 | stackIn_14_1;
            stackIn_16_0 = var5;
            if (var10_ref_lg.field_o == null) {
              stackIn_17_1 = 0;
            } else {
              stackIn_17_1 = 1;
            }
            var5 = stackIn_16_0 | stackIn_17_1;
            stackIn_19_0 = var6;
            if (var10_ref_lg.field_q == null) {
              stackIn_20_1 = 0;
            } else {
              stackIn_20_1 = 1;
            }
            var6 = stackIn_19_0 | stackIn_20_1;
            stackIn_22_0 = var7;
            if (var10_ref_lg.field_N == null) {
              stackIn_23_1 = 0;
            } else {
              stackIn_23_1 = 1;
            }
            var7 = stackIn_22_0 | stackIn_23_1;
            stackIn_25_0 = var8;
            if (var10_ref_lg.field_x == null) {
              stackIn_26_1 = 0;
            } else {
              stackIn_26_1 = 1;
            }
            var8 = stackIn_25_0 | stackIn_26_1;
          }
        }
        this.field_p = new int[this.field_G];
        this.field_D = new int[this.field_G];
        this.field_i = new int[this.field_G];
        this.field_d = new int[this.field_G];
        this.field_f = new short[this.field_G];
        this.field_e = new int[this.field_z];
        this.field_H = new int[this.field_z];
        this.field_r = new int[this.field_z];
        if (var3 != 0) {
          this.field_g = new byte[this.field_z];
        }
        if (var4 != 0) {
          this.field_k = new byte[this.field_z];
        }
        if (var5 != 0) {
          this.field_o = new byte[this.field_z];
        }
        if (var6 != 0) {
          this.field_q = new int[this.field_z];
        }
        if (var7 != 0) {
          this.field_N = new short[this.field_z];
        }
        if (var8 != 0) {
          this.field_x = new byte[this.field_z];
        }
        this.field_c = new short[this.field_z];
        this.field_K = new short[this.field_z];
        if (this.field_L > 0) {
          this.field_E = new byte[this.field_L];
          this.field_M = new short[this.field_L];
          this.field_P = new short[this.field_L];
          this.field_F = new short[this.field_L];
          this.field_m = new short[this.field_L];
          this.field_b = new short[this.field_L];
          this.field_t = new short[this.field_L];
          this.field_y = new byte[this.field_L];
          this.field_a = new byte[this.field_L];
          this.field_h = new byte[this.field_L];
          this.field_J = new byte[this.field_L];
          this.field_I = new byte[this.field_L];
        }
        this.field_G = 0;
        this.field_z = 0;
        this.field_L = 0;
        for (var9Lifetime1 = 0; var9Lifetime1 < param1; var9Lifetime1++) {
          var10 = (short)(1 << var9Lifetime1);
          var15 = param0[var9Lifetime1];
          var18 = var15;
          var11 = var18;
          if (var11 != null) {
            for (var12 = 0; var12 < var18.field_z; var12++) {
              if (var3 != 0 &&
                var18.field_g != null) {
                this.field_g[this.field_z] = var15.field_g[var12];
              }
              if (var4 != 0) {
                if (var18.field_k == null) {
                  this.field_k[this.field_z] = var15.field_A;
                } else {
                  this.field_k[this.field_z] = var15.field_k[var12];
                }
              }
              if (var5 != 0 &&
                var18.field_o != null) {
                this.field_o[this.field_z] = var15.field_o[var12];
              }
              if (var6 != 0 &&
                var18.field_q != null) {
                this.field_q[this.field_z] = var15.field_q[var12];
              }
              if (var7 != 0) {
                if (var18.field_N == null) {
                  this.field_N[this.field_z] = (short)-1;
                } else {
                  this.field_N[this.field_z] = var15.field_N[var12];
                }
              }
              this.field_c[this.field_z] = var15.field_c[var12];
              this.field_K[this.field_z] = (short)var10;
              this.field_e[this.field_z] = this.a(var15, var15.field_e[var12], (short) var10);
              this.field_H[this.field_z] = this.a(var15, var15.field_H[var12], (short) var10);
              this.field_r[this.field_z] = this.a(var15, var15.field_r[var12], (short) var10);
              this.field_z = this.field_z + 1;
            }
          }
        }
        var9Lifetime2 = 0;
        this.field_O = this.field_G;
        for (var10Lifetime1 = 0; var10Lifetime1 < param1; var10Lifetime1++) {
          var16 = param0[var10Lifetime1];
          var19 = var16;
          var11Lifetime1 = var19;
          var12Lifetime1 = (short)(1 << var10Lifetime1);
          if (var11Lifetime1 != null) {
            for (var13 = 0; var13 < var19.field_z; var13++) {
              if (var8 != 0) {
                incrementValue$1 = var9Lifetime2;
                var9Lifetime2++;
                stackIn_82_0 = this.field_x;
                stackIn_82_1 = incrementValue$1;
                if (var19.field_x != null &&
                  var16.field_x[var13] != -1) {
                  stackIn_83_2 = var16.field_x[var13] + this.field_L;
                } else {
                  stackIn_83_2 = -1;
                }
                stackIn_82_0[stackIn_82_1] = (byte)stackIn_83_2;
              }
            }
            var17 = 0;
            var13Lifetime1 = var17;
            while (var17 < var19.field_L) {
              dupTemp$0 = var16.field_E[var17];
              this.field_E[this.field_L] = dupTemp$0;
              var14 = dupTemp$0;
              if (var14 == 0) {
                this.field_M[this.field_L] = (short)this.a(var16, (int) var16.field_M[var17], (short) var12Lifetime1);
                this.field_P[this.field_L] = (short)this.a(var16, (int) var16.field_P[var17], (short) var12Lifetime1);
                this.field_F[this.field_L] = (short)this.a(var16, (int) var16.field_F[var17], (short) var12Lifetime1);
              }
              if (var14 >= 1 &&
                var14 <= 3) {
                this.field_M[this.field_L] = var16.field_M[var17];
                this.field_P[this.field_L] = var16.field_P[var17];
                this.field_F[this.field_L] = var16.field_F[var17];
                this.field_m[this.field_L] = var16.field_m[var17];
                this.field_b[this.field_L] = var16.field_b[var17];
                this.field_t[this.field_L] = var16.field_t[var17];
                this.field_y[this.field_L] = var16.field_y[var17];
                this.field_a[this.field_L] = var16.field_a[var17];
                this.field_h[this.field_L] = var16.field_h[var17];
              }
              if (var14 == 2) {
                this.field_J[this.field_L] = var16.field_J[var17];
                this.field_I[this.field_L] = var16.field_I[var17];
              }
              this.field_L = this.field_L + 1;
              var17++;
            }
          }
        }
    }

    lg(lg param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        this.field_G = 0;
        this.field_O = 0;
        this.field_A = (byte) 0;
        this.field_z = 0;
        this.field_G = param0.field_G;
        this.field_O = param0.field_O;
        this.field_z = param0.field_z;
        this.field_L = param0.field_L;
        if (!param1) {
          this.field_p = new int[this.field_G];
          this.field_D = new int[this.field_G];
          this.field_i = new int[this.field_G];
          for (var6 = 0; var6 < this.field_G; var6++) {
            this.field_p[var6] = param0.field_p[var6];
            this.field_D[var6] = param0.field_D[var6];
            this.field_i[var6] = param0.field_i[var6];
          }
        } else {
          this.field_p = param0.field_p;
          this.field_D = param0.field_D;
          this.field_i = param0.field_i;
        }
        if (!param2) {
          this.field_c = new short[this.field_z];
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_z; var6Lifetime1++) {
            this.field_c[var6Lifetime1] = param0.field_c[var6Lifetime1];
          }
        } else {
          this.field_c = param0.field_c;
        }
        if (!param3 &&
          param0.field_N != null) {
          this.field_N = new short[this.field_z];
          for (var6Lifetime2 = 0; var6Lifetime2 < this.field_z; var6Lifetime2++) {
            this.field_N[var6Lifetime2] = param0.field_N[var6Lifetime2];
          }
        } else {
          this.field_N = param0.field_N;
        }
        if (!param4) {
          this.field_o = new byte[this.field_z];
          if (param0.field_o != null) {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_z; var6Lifetime3++) {
              this.field_o[var6Lifetime3] = param0.field_o[var6Lifetime3];
            }
          } else {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_z; var6Lifetime3++) {
              this.field_o[var6Lifetime3] = (byte) 0;
            }
          }
        } else {
          this.field_o = param0.field_o;
        }
        this.field_e = param0.field_e;
        this.field_H = param0.field_H;
        this.field_r = param0.field_r;
        this.field_g = param0.field_g;
        this.field_k = param0.field_k;
        this.field_x = param0.field_x;
        this.field_A = param0.field_A;
        this.field_E = param0.field_E;
        this.field_M = param0.field_M;
        this.field_P = param0.field_P;
        this.field_F = param0.field_F;
        this.field_m = param0.field_m;
        this.field_b = param0.field_b;
        this.field_t = param0.field_t;
        this.field_y = param0.field_y;
        this.field_a = param0.field_a;
        this.field_h = param0.field_h;
        this.field_J = param0.field_J;
        this.field_I = param0.field_I;
        this.field_d = param0.field_d;
        this.field_q = param0.field_q;
        this.field_n = param0.field_n;
        this.field_w = param0.field_w;
        this.field_B = param0.field_B;
        this.field_j = param0.field_j;
        this.field_Q = param0.field_Q;
    }

    static {
        field_C = oo.field_j;
        field_s = oo.field_h;
    }
}
