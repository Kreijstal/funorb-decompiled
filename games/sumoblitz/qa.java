/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ha {
    private int field_s;
    private ce field_n;
    private java.awt.Canvas field_l;
    private int field_z;
    private te field_K;
    private boolean field_J;
    private boolean field_p;
    private int field_A;
    private int field_q;
    private int field_M;
    int field_k;
    private int field_y;
    private int field_x;
    int field_v;
    int[] field_o;
    private int field_G;
    private int field_r;
    int field_D;
    private sd field_u;
    private int field_m;
    private int field_j;
    private hi field_t;
    int field_H;
    private int field_w;
    int field_C;
    private int field_F;
    private int field_B;
    private int field_L;
    private rp[] field_i;
    private sd field_E;
    private static String field_I;

    final void f(int param0) {
        le var4 = null;
        int var5 = 0;
        wm var6 = null;
        int var2 = param0 - this.field_A;
        Object var3 = this.field_u.b(0);
        while (var3 != null) {
          var4 = (le) (var3);
          if (var4.field_p) {
            var4.field_m = var4.field_m + var2;
            var5 = var4.field_m / 20;
            if (var5 > 0) {
              var6 = this.field_h.a(-29193, var4.field_o);
              var4.a(var6.field_c * var2 * 50 / 1000, var6.field_u * var2 * 50 / 1000);
              var4.field_m = var4.field_m - var5 * 20;
            }
            var4.field_p = false;
          }
          var3 = this.field_u.a((byte) -92);
        }
        this.field_A = param0;
        this.field_E.a(5, 22663);
        this.field_u.a(5, 22663);
    }

    final int XA() {
        return this.field_L;
    }

    final int i() {
        return this.field_M;
    }

    final void GA(int param0) {
        this.aa(0, 0, this.field_k, this.field_B, param0, 0);
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (this.field_v < param0) {
          this.field_v = param0;
        }
        if (this.field_H < param1) {
          this.field_H = param1;
        }
        if (this.field_D > param2) {
          this.field_D = param2;
        }
        if (this.field_C > param3) {
          this.field_C = param3;
        }
        this.j();
    }

    final boolean a() {
        return false;
    }

    final hr a(ri param0, boolean param1) {
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        int[] var3;
        byte[] var4;
        int var5;
        int var6;
        Object var7;
        int[] var8;
        byte[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        byte[] var14;
        int[] var15;
        int[] var16;
        byte[] var17;
        int[] var18;
        int[] var19;
        int[] var20;
        byte[] var21;
        int[] var22;
        int[] var23;
        var20 = param0.field_g;
        var16 = var20;
        var3 = var16;
        var4 = param0.field_e;
        var5 = param0.field_h;
        var6 = param0.field_i;
        if (param1 &&
          param0.field_a == null) {
          var22 = new int[var20.length];
          var18 = var22;
          var8 = var18;
          var21 = new byte[var5 * var6];
          var17 = var21;
          var14 = var17;
          var9 = var14;
          for (var10 = 0; var10 < var6; var10++) {
            var11 = var10 * var5;
            for (var12 = 0; var12 < var5; var12++) {
              var14[var11 + var12] = var4[var11 + var12];
            }
          }
          for (var10 = 0; var10 < var20.length; var10++) {
            var8[var10] = var20[var10];
          }
          var7 = new uh(this, var21, var22, var5, var6);
        } else {
          var23 = new int[var5 * var6];
          var19 = var23;
          var15 = var19;
          var9 = param0.field_a;
          if (var9 != null) {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                var15[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
              }
            }
            var7 = new gl(this, var23, var5, var6);
          } else {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                var13 = var3[var4[var11 + var12] & 255];
                stackIn_26_0 = var15;
                stackIn_26_1 = var11 + var12;
                if (var13 == 0) {
                  stackIn_27_2 = 0;
                } else {
                  stackIn_27_2 = -16777216 | var13;
                }
                stackIn_26_0[stackIn_26_1] = stackIn_27_2;
              }
            }
            var7 = new mj(this, var23, var5, var6);
          }
        }
        ((hr) (var7)).a(param0.field_c, param0.field_d, param0.field_b, param0.field_f);
        return (hr) (var7);
    }

    private qa(d param0) {
        super(param0);
        kn discarded$0 = null;
        this.field_p = false;
        this.field_J = false;
        this.field_K = new te(4);
        this.field_y = 512;
        this.field_D = 0;
        this.field_M = 50;
        this.field_C = 0;
        this.field_G = 512;
        this.field_v = 0;
        this.field_H = 0;
        this.field_L = 3500;
        this.field_E = new sd(16);
        try {
          this.field_u = new sd(256);
          discarded$0 = new kn();
          this.g(1);
          this.d(0);
          kr.a(true, -52, true);
          this.field_J = true;
          this.field_A = (int)wq.a(-48);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.a((byte) -34);
          throw new RuntimeException("");
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
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
        int var16;
        int var17;
        int var18;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime2;
        int var12Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var14Lifetime6;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var15Lifetime5;
        int var15Lifetime6;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        int var16Lifetime6;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var17Lifetime6;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var18Lifetime6;
        int var14Lifetime7;
        int var14Lifetime8;
        int var14Lifetime9;
        int var14Lifetime10;
        int var14Lifetime11;
        int var15Lifetime7;
        int var15Lifetime8;
        int var15Lifetime9;
        int var15Lifetime10;
        int var15Lifetime11;
        int var16Lifetime7;
        int var16Lifetime8;
        int var16Lifetime9;
        int var16Lifetime10;
        int var16Lifetime11;
        int var17Lifetime7;
        int var17Lifetime8;
        int var17Lifetime9;
        int var17Lifetime10;
        int var17Lifetime11;
        int var18Lifetime7;
        int var18Lifetime8;
        int var18Lifetime9;
        int var18Lifetime10;
        int var18Lifetime11;
        int var14Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        int var14Lifetime1Lifetime3;
        int var14Lifetime1Lifetime4;
        int var14Lifetime6Lifetime1;
        int var14Lifetime6Lifetime2;
        int var14Lifetime6Lifetime3;
        int var14Lifetime6Lifetime4;
        int var15Lifetime1Lifetime1;
        int var15Lifetime1Lifetime2;
        int var15Lifetime1Lifetime3;
        int var15Lifetime1Lifetime4;
        int var15Lifetime6Lifetime1;
        int var15Lifetime6Lifetime2;
        int var15Lifetime6Lifetime3;
        int var15Lifetime6Lifetime4;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        int var16Lifetime1Lifetime3;
        int var16Lifetime1Lifetime4;
        int var16Lifetime6Lifetime1;
        int var16Lifetime6Lifetime2;
        int var16Lifetime6Lifetime3;
        int var16Lifetime6Lifetime4;
        int var17Lifetime1Lifetime1;
        int var17Lifetime1Lifetime2;
        int var17Lifetime1Lifetime3;
        int var17Lifetime1Lifetime4;
        int var17Lifetime6Lifetime1;
        int var17Lifetime6Lifetime2;
        int var17Lifetime6Lifetime3;
        int var17Lifetime6Lifetime4;
        int var18Lifetime1Lifetime1;
        int var18Lifetime1Lifetime2;
        int var18Lifetime1Lifetime3;
        int var18Lifetime1Lifetime4;
        int var18Lifetime6Lifetime1;
        int var18Lifetime6Lifetime2;
        int var18Lifetime6Lifetime3;
        int var18Lifetime6Lifetime4;
        int var14Lifetime12;
        int var14Lifetime13;
        int var14Lifetime14;
        int var14Lifetime15;
        int var15Lifetime12;
        int var15Lifetime13;
        int var15Lifetime14;
        int var15Lifetime15;
        int var16Lifetime12;
        int var16Lifetime13;
        int var16Lifetime14;
        int var16Lifetime15;
        int var16Lifetime16;
        int var16Lifetime17;
        int var16Lifetime18;
        int var16Lifetime19;
        int var17Lifetime12;
        int var17Lifetime13;
        int var17Lifetime14;
        int var17Lifetime15;
        int var18Lifetime12;
        int var18Lifetime13;
        int var18Lifetime14;
        int var18Lifetime15;
        int var14Lifetime6Lifetime5;
        int var15Lifetime6Lifetime5;
        int var16Lifetime6Lifetime5;
        int var17Lifetime6Lifetime5;
        int var18Lifetime6Lifetime5;
        int var14Lifetime11Lifetime1;
        int var14Lifetime11Lifetime2;
        int var14Lifetime11Lifetime3;
        int var14Lifetime11Lifetime4;
        int var15Lifetime11Lifetime1;
        int var15Lifetime11Lifetime2;
        int var15Lifetime11Lifetime3;
        int var15Lifetime11Lifetime4;
        int var16Lifetime7Lifetime1;
        int var16Lifetime8Lifetime1;
        int var16Lifetime9Lifetime1;
        int var16Lifetime10Lifetime1;
        int var16Lifetime11Lifetime1;
        int var16Lifetime11Lifetime2;
        int var16Lifetime11Lifetime3;
        int var16Lifetime11Lifetime4;
        int var16Lifetime11Lifetime5;
        int var17Lifetime11Lifetime1;
        int var17Lifetime11Lifetime2;
        int var17Lifetime11Lifetime3;
        int var17Lifetime11Lifetime4;
        int var18Lifetime11Lifetime1;
        int var18Lifetime11Lifetime2;
        int var18Lifetime11Lifetime3;
        int var18Lifetime11Lifetime4;
        int var14Lifetime1Lifetime4Lifetime1;
        int var14Lifetime1Lifetime4Lifetime2;
        int var14Lifetime1Lifetime4Lifetime3;
        int var14Lifetime1Lifetime4Lifetime4;
        int var14Lifetime1Lifetime4Lifetime5;
        int var14Lifetime1Lifetime4Lifetime6;
        int var14Lifetime1Lifetime4Lifetime7;
        int var14Lifetime6Lifetime1Lifetime1;
        int var14Lifetime6Lifetime2Lifetime1;
        int var15Lifetime1Lifetime4Lifetime1;
        int var15Lifetime1Lifetime4Lifetime2;
        int var15Lifetime1Lifetime4Lifetime3;
        int var15Lifetime1Lifetime4Lifetime4;
        int var15Lifetime1Lifetime4Lifetime5;
        int var15Lifetime1Lifetime4Lifetime6;
        int var15Lifetime1Lifetime4Lifetime7;
        int var15Lifetime6Lifetime1Lifetime1;
        int var15Lifetime6Lifetime2Lifetime1;
        int var16Lifetime1Lifetime4Lifetime1;
        int var16Lifetime1Lifetime4Lifetime2;
        int var16Lifetime1Lifetime4Lifetime3;
        int var16Lifetime1Lifetime4Lifetime4;
        int var16Lifetime1Lifetime4Lifetime5;
        int var16Lifetime1Lifetime4Lifetime6;
        int var16Lifetime1Lifetime4Lifetime7;
        int var16Lifetime6Lifetime1Lifetime1;
        int var16Lifetime6Lifetime2Lifetime1;
        int var17Lifetime1Lifetime4Lifetime1;
        int var17Lifetime1Lifetime4Lifetime2;
        int var17Lifetime1Lifetime4Lifetime3;
        int var17Lifetime1Lifetime4Lifetime4;
        int var17Lifetime1Lifetime4Lifetime5;
        int var17Lifetime1Lifetime4Lifetime6;
        int var17Lifetime1Lifetime4Lifetime7;
        int var17Lifetime6Lifetime1Lifetime1;
        int var17Lifetime6Lifetime2Lifetime1;
        int var18Lifetime1Lifetime4Lifetime1;
        int var18Lifetime1Lifetime4Lifetime2;
        int var18Lifetime1Lifetime4Lifetime3;
        int var18Lifetime1Lifetime4Lifetime4;
        int var18Lifetime1Lifetime4Lifetime5;
        int var18Lifetime1Lifetime4Lifetime6;
        int var18Lifetime1Lifetime4Lifetime7;
        int var18Lifetime6Lifetime1Lifetime1;
        int var18Lifetime6Lifetime2Lifetime1;
        if (param2 == 0) {
          if (param0 >= this.field_v) {
            if (param1 >= this.field_H &&
              param0 < this.field_D &&
              param1 < this.field_C) {
              var6 = param3 >>> 24;
              var7 = param0 + param1 * this.field_k;
              if (param4 != 0 && (param4 != 1 ||
                var6 != 255)) {
                if (param4 == 1) {
                  var8 = var7;
                  var9 = param3;
                  var10 = var6;
                  var9 = ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280) + (var10 << 24);
                  var11 = 256 - var10;
                  var12 = this.field_o[var8];
                  var12 = ((var12 & 16711935) * var11 >> 8 & 16711935) + ((var12 & 65280) * var11 >> 8 & 65280);
                  this.field_o[var8] = var9 + var12;
                  return;
                }
                if (param4 != 2) {
                  return;
                }
                var8Lifetime2 = var7;
                var9Lifetime2 = param3;
                var10Lifetime2 = this.field_o[var8Lifetime2];
                var11Lifetime2 = var9Lifetime2 + var10Lifetime2;
                var12Lifetime2 = (var9Lifetime2 & 16711935) + (var10Lifetime2 & 16711935);
                var10Lifetime3 = (var12Lifetime2 & 16777472) + (var11Lifetime2 - var12Lifetime2 & 65536);
                this.field_o[var8Lifetime2] = var11Lifetime2 - var10Lifetime3 | var10Lifetime3 - (var10Lifetime3 >>> 8);
                return;
              }
              this.field_o[var7] = param3;
              return;
            }
            return;
          }
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        if (this.field_D > this.field_v) {
          if (this.field_C <= this.field_H) {
            return;
          }
          if (param0 + param2 >= this.field_v) {
            if (param0 - param2 < this.field_D &&
              param1 + param2 >= this.field_H &&
              param1 - param2 < this.field_C) {
              var6Lifetime1 = param0 + param1 * this.field_k;
              var7Lifetime1 = var6Lifetime1;
              var8Lifetime1 = var6Lifetime1 - param2 * this.field_k;
              var9Lifetime1 = var6Lifetime1 + param2 * this.field_k;
              var10Lifetime1 = param2;
              var11Lifetime1 = 0;
              param2 = param2 * param2;
              var12Lifetime1 = param2 - var10Lifetime1;
              var13 = param3 >>> 24;
              if (param4 != 0 && (param4 != 1 ||
                var13 != 255)) {
                if (param4 != 1) {
                  if (param4 != 2) {
                    return;
                  }
                  if (param0 - var10Lifetime1 >= this.field_v &&
                    param0 + var10Lifetime1 < this.field_D &&
                    param1 - var10Lifetime1 >= this.field_H &&
                    param1 + var10Lifetime1 < this.field_C) {
                    var14 = var6Lifetime1 - var10Lifetime1;
                    var15 = param3;
                    var16 = this.field_o[var14];
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var16Lifetime12 = (var18 & 16777472) + (var17 - var18 & 65536);
                    this.field_o[var14] = var17 - var16Lifetime12 | var16Lifetime12 - (var16Lifetime12 >>> 8);
                    var14Lifetime12 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime12 = param3;
                    var16Lifetime13 = this.field_o[var14Lifetime12];
                    var17Lifetime12 = var15Lifetime12 + var16Lifetime13;
                    var18Lifetime12 = (var15Lifetime12 & 16711935) + (var16Lifetime13 & 16711935);
                    var16Lifetime14 = (var18Lifetime12 & 16777472) + (var17Lifetime12 - var18Lifetime12 & 65536);
                    this.field_o[var14Lifetime12] = var17Lifetime12 - var16Lifetime14 | var16Lifetime14 - (var16Lifetime14 >>> 8);
                    var14Lifetime13 = var8Lifetime1;
                    var15Lifetime13 = param3;
                    var16Lifetime15 = this.field_o[var14Lifetime13];
                    var17Lifetime13 = var15Lifetime13 + var16Lifetime15;
                    var18Lifetime13 = (var15Lifetime13 & 16711935) + (var16Lifetime15 & 16711935);
                    var16Lifetime16 = (var18Lifetime13 & 16777472) + (var17Lifetime13 - var18Lifetime13 & 65536);
                    this.field_o[var14Lifetime13] = var17Lifetime13 - var16Lifetime16 | var16Lifetime16 - (var16Lifetime16 >>> 8);
                    var14Lifetime14 = var9Lifetime1;
                    var15Lifetime14 = param3;
                    var16Lifetime17 = this.field_o[var14Lifetime14];
                    var17Lifetime14 = var15Lifetime14 + var16Lifetime17;
                    var18Lifetime14 = (var15Lifetime14 & 16711935) + (var16Lifetime17 & 16711935);
                    var16Lifetime18 = (var18Lifetime14 & 16777472) + (var17Lifetime14 - var18Lifetime14 & 65536);
                    this.field_o[var14Lifetime14] = var17Lifetime14 - var16Lifetime18 | var16Lifetime18 - (var16Lifetime18 >>> 8);
                    while (true) {
                      incrementValue$0 = var11Lifetime1;
                      var11Lifetime1++;
                      var12Lifetime1 = var12Lifetime1 + (incrementValue$0 + var11Lifetime1);
                      var6Lifetime1 = var6Lifetime1 - this.field_k;
                      var7Lifetime1 = var7Lifetime1 + this.field_k;
                      if (var12Lifetime1 > param2) {
                        var10Lifetime1--;
                        var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                        var8Lifetime1 = var8Lifetime1 + this.field_k;
                        var9Lifetime1 = var9Lifetime1 - this.field_k;
                      }
                      if (var10Lifetime1 < var11Lifetime1) {
                        return;
                      }
                      var14Lifetime15 = var8Lifetime1 - var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_o[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_o[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var8Lifetime1 + var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_o[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_o[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var6Lifetime1 - var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_o[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_o[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var6Lifetime1 + var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_o[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_o[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var7Lifetime1 - var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_o[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_o[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var7Lifetime1 + var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_o[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_o[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var9Lifetime1 - var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_o[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_o[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var9Lifetime1 + var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.field_o[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.field_o[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                    }
                  }
                  if (param0 - var10Lifetime1 >= this.field_v &&
                    param1 >= this.field_H &&
                    param1 < this.field_C) {
                    var14Lifetime7 = var6Lifetime1 - var10Lifetime1;
                    var15Lifetime7 = param3;
                    var16Lifetime7 = this.field_o[var14Lifetime7];
                    var17Lifetime7 = var15Lifetime7 + var16Lifetime7;
                    var18Lifetime7 = (var15Lifetime7 & 16711935) + (var16Lifetime7 & 16711935);
                    var16Lifetime7Lifetime1 = (var18Lifetime7 & 16777472) + (var17Lifetime7 - var18Lifetime7 & 65536);
                    this.field_o[var14Lifetime7] = var17Lifetime7 - var16Lifetime7Lifetime1 | var16Lifetime7Lifetime1 - (var16Lifetime7Lifetime1 >>> 8);
                  }
                  if (param0 + var10Lifetime1 < this.field_D &&
                    param1 >= this.field_H &&
                    param1 < this.field_C) {
                    var14Lifetime8 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime8 = param3;
                    var16Lifetime8 = this.field_o[var14Lifetime8];
                    var17Lifetime8 = var15Lifetime8 + var16Lifetime8;
                    var18Lifetime8 = (var15Lifetime8 & 16711935) + (var16Lifetime8 & 16711935);
                    var16Lifetime8Lifetime1 = (var18Lifetime8 & 16777472) + (var17Lifetime8 - var18Lifetime8 & 65536);
                    this.field_o[var14Lifetime8] = var17Lifetime8 - var16Lifetime8Lifetime1 | var16Lifetime8Lifetime1 - (var16Lifetime8Lifetime1 >>> 8);
                  }
                  if (param1 - var10Lifetime1 >= this.field_H &&
                    param0 >= this.field_v &&
                    param0 < this.field_D) {
                    var14Lifetime9 = var8Lifetime1;
                    var15Lifetime9 = param3;
                    var16Lifetime9 = this.field_o[var14Lifetime9];
                    var17Lifetime9 = var15Lifetime9 + var16Lifetime9;
                    var18Lifetime9 = (var15Lifetime9 & 16711935) + (var16Lifetime9 & 16711935);
                    var16Lifetime9Lifetime1 = (var18Lifetime9 & 16777472) + (var17Lifetime9 - var18Lifetime9 & 65536);
                    this.field_o[var14Lifetime9] = var17Lifetime9 - var16Lifetime9Lifetime1 | var16Lifetime9Lifetime1 - (var16Lifetime9Lifetime1 >>> 8);
                  }
                  if (param1 + var10Lifetime1 < this.field_C &&
                    param0 >= this.field_v &&
                    param0 < this.field_D) {
                    var14Lifetime10 = var9Lifetime1;
                    var15Lifetime10 = param3;
                    var16Lifetime10 = this.field_o[var14Lifetime10];
                    var17Lifetime10 = var15Lifetime10 + var16Lifetime10;
                    var18Lifetime10 = (var15Lifetime10 & 16711935) + (var16Lifetime10 & 16711935);
                    var16Lifetime10Lifetime1 = (var18Lifetime10 & 16777472) + (var17Lifetime10 - var18Lifetime10 & 65536);
                    this.field_o[var14Lifetime10] = var17Lifetime10 - var16Lifetime10Lifetime1 | var16Lifetime10Lifetime1 - (var16Lifetime10Lifetime1 >>> 8);
                  }
                  while (true) {
                    incrementValue$1 = var11Lifetime1;
                    var11Lifetime1++;
                    var12Lifetime1 = var12Lifetime1 + (incrementValue$1 + var11Lifetime1);
                    var6Lifetime1 = var6Lifetime1 - this.field_k;
                    var7Lifetime1 = var7Lifetime1 + this.field_k;
                    if (var12Lifetime1 > param2) {
                      var10Lifetime1--;
                      var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                      var8Lifetime1 = var8Lifetime1 + this.field_k;
                      var9Lifetime1 = var9Lifetime1 - this.field_k;
                    }
                    if (var10Lifetime1 < var11Lifetime1) {
                      return;
                    }
                    if (param1 - var10Lifetime1 >= this.field_H &&
                      param1 - var10Lifetime1 < this.field_C) {
                      if (param0 - var11Lifetime1 >= this.field_v &&
                        param0 - var11Lifetime1 < this.field_D) {
                        var14Lifetime11 = var8Lifetime1 - var11Lifetime1;
                        var15Lifetime11 = param3;
                        var16Lifetime11 = this.field_o[var14Lifetime11];
                        var17Lifetime11 = var15Lifetime11 + var16Lifetime11;
                        var18Lifetime11 = (var15Lifetime11 & 16711935) + (var16Lifetime11 & 16711935);
                        var16Lifetime11 = (var18Lifetime11 & 16777472) + (var17Lifetime11 - var18Lifetime11 & 65536);
                        this.field_o[var14Lifetime11] = var17Lifetime11 - var16Lifetime11 | var16Lifetime11 - (var16Lifetime11 >>> 8);
                      }
                      if (param0 + var11Lifetime1 >= this.field_v &&
                        param0 + var11Lifetime1 < this.field_D) {
                        var14Lifetime11 = var8Lifetime1 + var11Lifetime1;
                        var15Lifetime11 = param3;
                        var16Lifetime11 = this.field_o[var14Lifetime11];
                        var17Lifetime11 = var15Lifetime11 + var16Lifetime11;
                        var18Lifetime11 = (var15Lifetime11 & 16711935) + (var16Lifetime11 & 16711935);
                        var16Lifetime11 = (var18Lifetime11 & 16777472) + (var17Lifetime11 - var18Lifetime11 & 65536);
                        this.field_o[var14Lifetime11] = var17Lifetime11 - var16Lifetime11 | var16Lifetime11 - (var16Lifetime11 >>> 8);
                      }
                    }
                    if (param1 - var11Lifetime1 >= this.field_H &&
                      param1 - var11Lifetime1 < this.field_C) {
                      if (param0 - var10Lifetime1 >= this.field_v &&
                        param0 - var10Lifetime1 < this.field_D) {
                        var14Lifetime11Lifetime1 = var6Lifetime1 - var10Lifetime1;
                        var15Lifetime11Lifetime1 = param3;
                        var16Lifetime11Lifetime1 = this.field_o[var14Lifetime11Lifetime1];
                        var17Lifetime11Lifetime1 = var15Lifetime11Lifetime1 + var16Lifetime11Lifetime1;
                        var18Lifetime11Lifetime1 = (var15Lifetime11Lifetime1 & 16711935) + (var16Lifetime11Lifetime1 & 16711935);
                        var16Lifetime11Lifetime1 = (var18Lifetime11Lifetime1 & 16777472) + (var17Lifetime11Lifetime1 - var18Lifetime11Lifetime1 & 65536);
                        this.field_o[var14Lifetime11Lifetime1] = var17Lifetime11Lifetime1 - var16Lifetime11Lifetime1 | var16Lifetime11Lifetime1 - (var16Lifetime11Lifetime1 >>> 8);
                      }
                      if (param0 + var10Lifetime1 >= this.field_v &&
                        param0 + var10Lifetime1 < this.field_D) {
                        var14Lifetime11Lifetime1 = var6Lifetime1 + var10Lifetime1;
                        var15Lifetime11Lifetime1 = param3;
                        var16Lifetime11Lifetime1 = this.field_o[var14Lifetime11Lifetime1];
                        var17Lifetime11Lifetime1 = var15Lifetime11Lifetime1 + var16Lifetime11Lifetime1;
                        var18Lifetime11Lifetime1 = (var15Lifetime11Lifetime1 & 16711935) + (var16Lifetime11Lifetime1 & 16711935);
                        var16Lifetime11Lifetime1 = (var18Lifetime11Lifetime1 & 16777472) + (var17Lifetime11Lifetime1 - var18Lifetime11Lifetime1 & 65536);
                        this.field_o[var14Lifetime11Lifetime1] = var17Lifetime11Lifetime1 - var16Lifetime11Lifetime1 | var16Lifetime11Lifetime1 - (var16Lifetime11Lifetime1 >>> 8);
                      }
                    }
                    if (param1 + var11Lifetime1 >= this.field_H &&
                      param1 + var11Lifetime1 < this.field_C) {
                      if (param0 - var10Lifetime1 >= this.field_v &&
                        param0 - var10Lifetime1 < this.field_D) {
                        var14Lifetime11Lifetime2 = var7Lifetime1 - var10Lifetime1;
                        var15Lifetime11Lifetime2 = param3;
                        var16Lifetime11Lifetime2 = this.field_o[var14Lifetime11Lifetime2];
                        var17Lifetime11Lifetime2 = var15Lifetime11Lifetime2 + var16Lifetime11Lifetime2;
                        var18Lifetime11Lifetime2 = (var15Lifetime11Lifetime2 & 16711935) + (var16Lifetime11Lifetime2 & 16711935);
                        var16Lifetime11Lifetime2 = (var18Lifetime11Lifetime2 & 16777472) + (var17Lifetime11Lifetime2 - var18Lifetime11Lifetime2 & 65536);
                        this.field_o[var14Lifetime11Lifetime2] = var17Lifetime11Lifetime2 - var16Lifetime11Lifetime2 | var16Lifetime11Lifetime2 - (var16Lifetime11Lifetime2 >>> 8);
                      }
                      if (param0 + var10Lifetime1 >= this.field_v &&
                        param0 + var10Lifetime1 < this.field_D) {
                        var14Lifetime11Lifetime2 = var7Lifetime1 + var10Lifetime1;
                        var15Lifetime11Lifetime2 = param3;
                        var16Lifetime11Lifetime2 = this.field_o[var14Lifetime11Lifetime2];
                        var17Lifetime11Lifetime2 = var15Lifetime11Lifetime2 + var16Lifetime11Lifetime2;
                        var18Lifetime11Lifetime2 = (var15Lifetime11Lifetime2 & 16711935) + (var16Lifetime11Lifetime2 & 16711935);
                        var16Lifetime11Lifetime2 = (var18Lifetime11Lifetime2 & 16777472) + (var17Lifetime11Lifetime2 - var18Lifetime11Lifetime2 & 65536);
                        this.field_o[var14Lifetime11Lifetime2] = var17Lifetime11Lifetime2 - var16Lifetime11Lifetime2 | var16Lifetime11Lifetime2 - (var16Lifetime11Lifetime2 >>> 8);
                      }
                    }
                    if (param1 + var10Lifetime1 < this.field_H) {
                      continue;
                    }
                    if (param1 + var10Lifetime1 >= this.field_C) {
                      continue;
                    }
                    if (param0 - var11Lifetime1 >= this.field_v &&
                      param0 - var11Lifetime1 < this.field_D) {
                      var14Lifetime11Lifetime3 = var9Lifetime1 - var11Lifetime1;
                      var15Lifetime11Lifetime3 = param3;
                      var16Lifetime11Lifetime3 = this.field_o[var14Lifetime11Lifetime3];
                      var17Lifetime11Lifetime3 = var15Lifetime11Lifetime3 + var16Lifetime11Lifetime3;
                      var18Lifetime11Lifetime3 = (var15Lifetime11Lifetime3 & 16711935) + (var16Lifetime11Lifetime3 & 16711935);
                      var16Lifetime11Lifetime3 = (var18Lifetime11Lifetime3 & 16777472) + (var17Lifetime11Lifetime3 - var18Lifetime11Lifetime3 & 65536);
                      this.field_o[var14Lifetime11Lifetime3] = var17Lifetime11Lifetime3 - var16Lifetime11Lifetime3 | var16Lifetime11Lifetime3 - (var16Lifetime11Lifetime3 >>> 8);
                    }
                    if (param0 + var11Lifetime1 < this.field_v) {
                      continue;
                    }
                    if (param0 + var11Lifetime1 >= this.field_D) {
                      continue;
                    }
                    var14Lifetime11Lifetime4 = var9Lifetime1 + var11Lifetime1;
                    var15Lifetime11Lifetime4 = param3;
                    var16Lifetime11Lifetime4 = this.field_o[var14Lifetime11Lifetime4];
                    var17Lifetime11Lifetime4 = var15Lifetime11Lifetime4 + var16Lifetime11Lifetime4;
                    var18Lifetime11Lifetime4 = (var15Lifetime11Lifetime4 & 16711935) + (var16Lifetime11Lifetime4 & 16711935);
                    var16Lifetime11Lifetime5 = (var18Lifetime11Lifetime4 & 16777472) + (var17Lifetime11Lifetime4 - var18Lifetime11Lifetime4 & 65536);
                    this.field_o[var14Lifetime11Lifetime4] = var17Lifetime11Lifetime4 - var16Lifetime11Lifetime5 | var16Lifetime11Lifetime5 - (var16Lifetime11Lifetime5 >>> 8);
                  }
                }
                if (param0 - var10Lifetime1 >= this.field_v &&
                  param0 + var10Lifetime1 < this.field_D &&
                  param1 - var10Lifetime1 >= this.field_H &&
                  param1 + var10Lifetime1 < this.field_C) {
                  var14Lifetime1 = var6Lifetime1 - var10Lifetime1;
                  var15Lifetime1 = param3;
                  var16Lifetime1 = var13;
                  var15Lifetime1 = ((var15Lifetime1 & 16711935) * var16Lifetime1 >> 8 & 16711935) + ((var15Lifetime1 & 65280) * var16Lifetime1 >> 8 & 65280) + (var16Lifetime1 << 24);
                  var17Lifetime1 = 256 - var16Lifetime1;
                  var18Lifetime1 = this.field_o[var14Lifetime1];
                  var18Lifetime1 = ((var18Lifetime1 & 16711935) * var17Lifetime1 >> 8 & 16711935) + ((var18Lifetime1 & 65280) * var17Lifetime1 >> 8 & 65280);
                  this.field_o[var14Lifetime1] = var15Lifetime1 + var18Lifetime1;
                  var14Lifetime1Lifetime1 = var6Lifetime1 + var10Lifetime1;
                  var15Lifetime1Lifetime1 = param3;
                  var16Lifetime1Lifetime1 = var13;
                  var15Lifetime1Lifetime1 = ((var15Lifetime1Lifetime1 & 16711935) * var16Lifetime1Lifetime1 >> 8 & 16711935) + ((var15Lifetime1Lifetime1 & 65280) * var16Lifetime1Lifetime1 >> 8 & 65280) + (var16Lifetime1Lifetime1 << 24);
                  var17Lifetime1Lifetime1 = 256 - var16Lifetime1Lifetime1;
                  var18Lifetime1Lifetime1 = this.field_o[var14Lifetime1Lifetime1];
                  var18Lifetime1Lifetime1 = ((var18Lifetime1Lifetime1 & 16711935) * var17Lifetime1Lifetime1 >> 8 & 16711935) + ((var18Lifetime1Lifetime1 & 65280) * var17Lifetime1Lifetime1 >> 8 & 65280);
                  this.field_o[var14Lifetime1Lifetime1] = var15Lifetime1Lifetime1 + var18Lifetime1Lifetime1;
                  var14Lifetime1Lifetime2 = var8Lifetime1;
                  var15Lifetime1Lifetime2 = param3;
                  var16Lifetime1Lifetime2 = var13;
                  var15Lifetime1Lifetime2 = ((var15Lifetime1Lifetime2 & 16711935) * var16Lifetime1Lifetime2 >> 8 & 16711935) + ((var15Lifetime1Lifetime2 & 65280) * var16Lifetime1Lifetime2 >> 8 & 65280) + (var16Lifetime1Lifetime2 << 24);
                  var17Lifetime1Lifetime2 = 256 - var16Lifetime1Lifetime2;
                  var18Lifetime1Lifetime2 = this.field_o[var14Lifetime1Lifetime2];
                  var18Lifetime1Lifetime2 = ((var18Lifetime1Lifetime2 & 16711935) * var17Lifetime1Lifetime2 >> 8 & 16711935) + ((var18Lifetime1Lifetime2 & 65280) * var17Lifetime1Lifetime2 >> 8 & 65280);
                  this.field_o[var14Lifetime1Lifetime2] = var15Lifetime1Lifetime2 + var18Lifetime1Lifetime2;
                  var14Lifetime1Lifetime3 = var9Lifetime1;
                  var15Lifetime1Lifetime3 = param3;
                  var16Lifetime1Lifetime3 = var13;
                  var15Lifetime1Lifetime3 = ((var15Lifetime1Lifetime3 & 16711935) * var16Lifetime1Lifetime3 >> 8 & 16711935) + ((var15Lifetime1Lifetime3 & 65280) * var16Lifetime1Lifetime3 >> 8 & 65280) + (var16Lifetime1Lifetime3 << 24);
                  var17Lifetime1Lifetime3 = 256 - var16Lifetime1Lifetime3;
                  var18Lifetime1Lifetime3 = this.field_o[var14Lifetime1Lifetime3];
                  var18Lifetime1Lifetime3 = ((var18Lifetime1Lifetime3 & 16711935) * var17Lifetime1Lifetime3 >> 8 & 16711935) + ((var18Lifetime1Lifetime3 & 65280) * var17Lifetime1Lifetime3 >> 8 & 65280);
                  this.field_o[var14Lifetime1Lifetime3] = var15Lifetime1Lifetime3 + var18Lifetime1Lifetime3;
                  while (true) {
                    incrementValue$2 = var11Lifetime1;
                    var11Lifetime1++;
                    var12Lifetime1 = var12Lifetime1 + (incrementValue$2 + var11Lifetime1);
                    var6Lifetime1 = var6Lifetime1 - this.field_k;
                    var7Lifetime1 = var7Lifetime1 + this.field_k;
                    if (var12Lifetime1 > param2) {
                      var10Lifetime1--;
                      var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                      var8Lifetime1 = var8Lifetime1 + this.field_k;
                      var9Lifetime1 = var9Lifetime1 - this.field_k;
                    }
                    if (var10Lifetime1 < var11Lifetime1) {
                      return;
                    }
                    var14Lifetime1Lifetime4 = var8Lifetime1 - var11Lifetime1;
                    var15Lifetime1Lifetime4 = param3;
                    var16Lifetime1Lifetime4 = var13;
                    var15Lifetime1Lifetime4 = ((var15Lifetime1Lifetime4 & 16711935) * var16Lifetime1Lifetime4 >> 8 & 16711935) + ((var15Lifetime1Lifetime4 & 65280) * var16Lifetime1Lifetime4 >> 8 & 65280) + (var16Lifetime1Lifetime4 << 24);
                    var17Lifetime1Lifetime4 = 256 - var16Lifetime1Lifetime4;
                    var18Lifetime1Lifetime4 = this.field_o[var14Lifetime1Lifetime4];
                    var18Lifetime1Lifetime4 = ((var18Lifetime1Lifetime4 & 16711935) * var17Lifetime1Lifetime4 >> 8 & 16711935) + ((var18Lifetime1Lifetime4 & 65280) * var17Lifetime1Lifetime4 >> 8 & 65280);
                    this.field_o[var14Lifetime1Lifetime4] = var15Lifetime1Lifetime4 + var18Lifetime1Lifetime4;
                    var14Lifetime1Lifetime4Lifetime1 = var8Lifetime1 + var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime1 = param3;
                    var16Lifetime1Lifetime4Lifetime1 = var13;
                    var15Lifetime1Lifetime4Lifetime1 = ((var15Lifetime1Lifetime4Lifetime1 & 16711935) * var16Lifetime1Lifetime4Lifetime1 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime1 & 65280) * var16Lifetime1Lifetime4Lifetime1 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime1 << 24);
                    var17Lifetime1Lifetime4Lifetime1 = 256 - var16Lifetime1Lifetime4Lifetime1;
                    var18Lifetime1Lifetime4Lifetime1 = this.field_o[var14Lifetime1Lifetime4Lifetime1];
                    var18Lifetime1Lifetime4Lifetime1 = ((var18Lifetime1Lifetime4Lifetime1 & 16711935) * var17Lifetime1Lifetime4Lifetime1 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime1 & 65280) * var17Lifetime1Lifetime4Lifetime1 >> 8 & 65280);
                    this.field_o[var14Lifetime1Lifetime4Lifetime1] = var15Lifetime1Lifetime4Lifetime1 + var18Lifetime1Lifetime4Lifetime1;
                    var14Lifetime1Lifetime4Lifetime2 = var6Lifetime1 - var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime2 = param3;
                    var16Lifetime1Lifetime4Lifetime2 = var13;
                    var15Lifetime1Lifetime4Lifetime2 = ((var15Lifetime1Lifetime4Lifetime2 & 16711935) * var16Lifetime1Lifetime4Lifetime2 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime2 & 65280) * var16Lifetime1Lifetime4Lifetime2 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime2 << 24);
                    var17Lifetime1Lifetime4Lifetime2 = 256 - var16Lifetime1Lifetime4Lifetime2;
                    var18Lifetime1Lifetime4Lifetime2 = this.field_o[var14Lifetime1Lifetime4Lifetime2];
                    var18Lifetime1Lifetime4Lifetime2 = ((var18Lifetime1Lifetime4Lifetime2 & 16711935) * var17Lifetime1Lifetime4Lifetime2 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime2 & 65280) * var17Lifetime1Lifetime4Lifetime2 >> 8 & 65280);
                    this.field_o[var14Lifetime1Lifetime4Lifetime2] = var15Lifetime1Lifetime4Lifetime2 + var18Lifetime1Lifetime4Lifetime2;
                    var14Lifetime1Lifetime4Lifetime3 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime3 = param3;
                    var16Lifetime1Lifetime4Lifetime3 = var13;
                    var15Lifetime1Lifetime4Lifetime3 = ((var15Lifetime1Lifetime4Lifetime3 & 16711935) * var16Lifetime1Lifetime4Lifetime3 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime3 & 65280) * var16Lifetime1Lifetime4Lifetime3 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime3 << 24);
                    var17Lifetime1Lifetime4Lifetime3 = 256 - var16Lifetime1Lifetime4Lifetime3;
                    var18Lifetime1Lifetime4Lifetime3 = this.field_o[var14Lifetime1Lifetime4Lifetime3];
                    var18Lifetime1Lifetime4Lifetime3 = ((var18Lifetime1Lifetime4Lifetime3 & 16711935) * var17Lifetime1Lifetime4Lifetime3 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime3 & 65280) * var17Lifetime1Lifetime4Lifetime3 >> 8 & 65280);
                    this.field_o[var14Lifetime1Lifetime4Lifetime3] = var15Lifetime1Lifetime4Lifetime3 + var18Lifetime1Lifetime4Lifetime3;
                    var14Lifetime1Lifetime4Lifetime4 = var7Lifetime1 - var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime4 = param3;
                    var16Lifetime1Lifetime4Lifetime4 = var13;
                    var15Lifetime1Lifetime4Lifetime4 = ((var15Lifetime1Lifetime4Lifetime4 & 16711935) * var16Lifetime1Lifetime4Lifetime4 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime4 & 65280) * var16Lifetime1Lifetime4Lifetime4 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime4 << 24);
                    var17Lifetime1Lifetime4Lifetime4 = 256 - var16Lifetime1Lifetime4Lifetime4;
                    var18Lifetime1Lifetime4Lifetime4 = this.field_o[var14Lifetime1Lifetime4Lifetime4];
                    var18Lifetime1Lifetime4Lifetime4 = ((var18Lifetime1Lifetime4Lifetime4 & 16711935) * var17Lifetime1Lifetime4Lifetime4 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime4 & 65280) * var17Lifetime1Lifetime4Lifetime4 >> 8 & 65280);
                    this.field_o[var14Lifetime1Lifetime4Lifetime4] = var15Lifetime1Lifetime4Lifetime4 + var18Lifetime1Lifetime4Lifetime4;
                    var14Lifetime1Lifetime4Lifetime5 = var7Lifetime1 + var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime5 = param3;
                    var16Lifetime1Lifetime4Lifetime5 = var13;
                    var15Lifetime1Lifetime4Lifetime5 = ((var15Lifetime1Lifetime4Lifetime5 & 16711935) * var16Lifetime1Lifetime4Lifetime5 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime5 & 65280) * var16Lifetime1Lifetime4Lifetime5 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime5 << 24);
                    var17Lifetime1Lifetime4Lifetime5 = 256 - var16Lifetime1Lifetime4Lifetime5;
                    var18Lifetime1Lifetime4Lifetime5 = this.field_o[var14Lifetime1Lifetime4Lifetime5];
                    var18Lifetime1Lifetime4Lifetime5 = ((var18Lifetime1Lifetime4Lifetime5 & 16711935) * var17Lifetime1Lifetime4Lifetime5 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime5 & 65280) * var17Lifetime1Lifetime4Lifetime5 >> 8 & 65280);
                    this.field_o[var14Lifetime1Lifetime4Lifetime5] = var15Lifetime1Lifetime4Lifetime5 + var18Lifetime1Lifetime4Lifetime5;
                    var14Lifetime1Lifetime4Lifetime6 = var9Lifetime1 - var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime6 = param3;
                    var16Lifetime1Lifetime4Lifetime6 = var13;
                    var15Lifetime1Lifetime4Lifetime6 = ((var15Lifetime1Lifetime4Lifetime6 & 16711935) * var16Lifetime1Lifetime4Lifetime6 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime6 & 65280) * var16Lifetime1Lifetime4Lifetime6 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime6 << 24);
                    var17Lifetime1Lifetime4Lifetime6 = 256 - var16Lifetime1Lifetime4Lifetime6;
                    var18Lifetime1Lifetime4Lifetime6 = this.field_o[var14Lifetime1Lifetime4Lifetime6];
                    var18Lifetime1Lifetime4Lifetime6 = ((var18Lifetime1Lifetime4Lifetime6 & 16711935) * var17Lifetime1Lifetime4Lifetime6 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime6 & 65280) * var17Lifetime1Lifetime4Lifetime6 >> 8 & 65280);
                    this.field_o[var14Lifetime1Lifetime4Lifetime6] = var15Lifetime1Lifetime4Lifetime6 + var18Lifetime1Lifetime4Lifetime6;
                    var14Lifetime1Lifetime4Lifetime7 = var9Lifetime1 + var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime7 = param3;
                    var16Lifetime1Lifetime4Lifetime7 = var13;
                    var15Lifetime1Lifetime4Lifetime7 = ((var15Lifetime1Lifetime4Lifetime7 & 16711935) * var16Lifetime1Lifetime4Lifetime7 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime7 & 65280) * var16Lifetime1Lifetime4Lifetime7 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime7 << 24);
                    var17Lifetime1Lifetime4Lifetime7 = 256 - var16Lifetime1Lifetime4Lifetime7;
                    var18Lifetime1Lifetime4Lifetime7 = this.field_o[var14Lifetime1Lifetime4Lifetime7];
                    var18Lifetime1Lifetime4Lifetime7 = ((var18Lifetime1Lifetime4Lifetime7 & 16711935) * var17Lifetime1Lifetime4Lifetime7 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime7 & 65280) * var17Lifetime1Lifetime4Lifetime7 >> 8 & 65280);
                    this.field_o[var14Lifetime1Lifetime4Lifetime7] = var15Lifetime1Lifetime4Lifetime7 + var18Lifetime1Lifetime4Lifetime7;
                  }
                }
                if (param0 - var10Lifetime1 >= this.field_v &&
                  param1 >= this.field_H &&
                  param1 < this.field_C) {
                  var14Lifetime2 = var6Lifetime1 - var10Lifetime1;
                  var15Lifetime2 = param3;
                  var16Lifetime2 = var13;
                  var15Lifetime2 = ((var15Lifetime2 & 16711935) * var16Lifetime2 >> 8 & 16711935) + ((var15Lifetime2 & 65280) * var16Lifetime2 >> 8 & 65280) + (var16Lifetime2 << 24);
                  var17Lifetime2 = 256 - var16Lifetime2;
                  var18Lifetime2 = this.field_o[var14Lifetime2];
                  var18Lifetime2 = ((var18Lifetime2 & 16711935) * var17Lifetime2 >> 8 & 16711935) + ((var18Lifetime2 & 65280) * var17Lifetime2 >> 8 & 65280);
                  this.field_o[var14Lifetime2] = var15Lifetime2 + var18Lifetime2;
                }
                if (param0 + var10Lifetime1 < this.field_D &&
                  param1 >= this.field_H &&
                  param1 < this.field_C) {
                  var14Lifetime3 = var6Lifetime1 + var10Lifetime1;
                  var15Lifetime3 = param3;
                  var16Lifetime3 = var13;
                  var15Lifetime3 = ((var15Lifetime3 & 16711935) * var16Lifetime3 >> 8 & 16711935) + ((var15Lifetime3 & 65280) * var16Lifetime3 >> 8 & 65280) + (var16Lifetime3 << 24);
                  var17Lifetime3 = 256 - var16Lifetime3;
                  var18Lifetime3 = this.field_o[var14Lifetime3];
                  var18Lifetime3 = ((var18Lifetime3 & 16711935) * var17Lifetime3 >> 8 & 16711935) + ((var18Lifetime3 & 65280) * var17Lifetime3 >> 8 & 65280);
                  this.field_o[var14Lifetime3] = var15Lifetime3 + var18Lifetime3;
                }
                if (param1 - var10Lifetime1 >= this.field_H &&
                  param0 >= this.field_v &&
                  param0 < this.field_D) {
                  var14Lifetime4 = var8Lifetime1;
                  var15Lifetime4 = param3;
                  var16Lifetime4 = var13;
                  var15Lifetime4 = ((var15Lifetime4 & 16711935) * var16Lifetime4 >> 8 & 16711935) + ((var15Lifetime4 & 65280) * var16Lifetime4 >> 8 & 65280) + (var16Lifetime4 << 24);
                  var17Lifetime4 = 256 - var16Lifetime4;
                  var18Lifetime4 = this.field_o[var14Lifetime4];
                  var18Lifetime4 = ((var18Lifetime4 & 16711935) * var17Lifetime4 >> 8 & 16711935) + ((var18Lifetime4 & 65280) * var17Lifetime4 >> 8 & 65280);
                  this.field_o[var14Lifetime4] = var15Lifetime4 + var18Lifetime4;
                }
                if (param1 + var10Lifetime1 < this.field_C &&
                  param0 >= this.field_v &&
                  param0 < this.field_D) {
                  var14Lifetime5 = var9Lifetime1;
                  var15Lifetime5 = param3;
                  var16Lifetime5 = var13;
                  var15Lifetime5 = ((var15Lifetime5 & 16711935) * var16Lifetime5 >> 8 & 16711935) + ((var15Lifetime5 & 65280) * var16Lifetime5 >> 8 & 65280) + (var16Lifetime5 << 24);
                  var17Lifetime5 = 256 - var16Lifetime5;
                  var18Lifetime5 = this.field_o[var14Lifetime5];
                  var18Lifetime5 = ((var18Lifetime5 & 16711935) * var17Lifetime5 >> 8 & 16711935) + ((var18Lifetime5 & 65280) * var17Lifetime5 >> 8 & 65280);
                  this.field_o[var14Lifetime5] = var15Lifetime5 + var18Lifetime5;
                }
                while (true) {
                  incrementValue$3 = var11Lifetime1;
                  var11Lifetime1++;
                  var12Lifetime1 = var12Lifetime1 + (incrementValue$3 + var11Lifetime1);
                  var6Lifetime1 = var6Lifetime1 - this.field_k;
                  var7Lifetime1 = var7Lifetime1 + this.field_k;
                  if (var12Lifetime1 > param2) {
                    var10Lifetime1--;
                    var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                    var8Lifetime1 = var8Lifetime1 + this.field_k;
                    var9Lifetime1 = var9Lifetime1 - this.field_k;
                  }
                  if (var10Lifetime1 < var11Lifetime1) {
                    return;
                  }
                  if (param1 - var10Lifetime1 >= this.field_H &&
                    param1 - var10Lifetime1 < this.field_C) {
                    if (param0 - var11Lifetime1 >= this.field_v &&
                      param0 - var11Lifetime1 < this.field_D) {
                      var14Lifetime6 = var8Lifetime1 - var11Lifetime1;
                      var15Lifetime6 = param3;
                      var16Lifetime6 = var13;
                      var15Lifetime6 = ((var15Lifetime6 & 16711935) * var16Lifetime6 >> 8 & 16711935) + ((var15Lifetime6 & 65280) * var16Lifetime6 >> 8 & 65280) + (var16Lifetime6 << 24);
                      var17Lifetime6 = 256 - var16Lifetime6;
                      var18Lifetime6 = this.field_o[var14Lifetime6];
                      var18Lifetime6 = ((var18Lifetime6 & 16711935) * var17Lifetime6 >> 8 & 16711935) + ((var18Lifetime6 & 65280) * var17Lifetime6 >> 8 & 65280);
                      this.field_o[var14Lifetime6] = var15Lifetime6 + var18Lifetime6;
                    }
                    if (param0 + var11Lifetime1 >= this.field_v &&
                      param0 + var11Lifetime1 < this.field_D) {
                      var14Lifetime6Lifetime5 = var8Lifetime1 + var11Lifetime1;
                      var15Lifetime6Lifetime5 = param3;
                      var16Lifetime6Lifetime5 = var13;
                      var15Lifetime6Lifetime5 = ((var15Lifetime6Lifetime5 & 16711935) * var16Lifetime6Lifetime5 >> 8 & 16711935) + ((var15Lifetime6Lifetime5 & 65280) * var16Lifetime6Lifetime5 >> 8 & 65280) + (var16Lifetime6Lifetime5 << 24);
                      var17Lifetime6Lifetime5 = 256 - var16Lifetime6Lifetime5;
                      var18Lifetime6Lifetime5 = this.field_o[var14Lifetime6Lifetime5];
                      var18Lifetime6Lifetime5 = ((var18Lifetime6Lifetime5 & 16711935) * var17Lifetime6Lifetime5 >> 8 & 16711935) + ((var18Lifetime6Lifetime5 & 65280) * var17Lifetime6Lifetime5 >> 8 & 65280);
                      this.field_o[var14Lifetime6Lifetime5] = var15Lifetime6Lifetime5 + var18Lifetime6Lifetime5;
                    }
                  }
                  if (param1 - var11Lifetime1 >= this.field_H &&
                    param1 - var11Lifetime1 < this.field_C) {
                    if (param0 - var10Lifetime1 >= this.field_v &&
                      param0 - var10Lifetime1 < this.field_D) {
                      var14Lifetime6Lifetime1 = var6Lifetime1 - var10Lifetime1;
                      var15Lifetime6Lifetime1 = param3;
                      var16Lifetime6Lifetime1 = var13;
                      var15Lifetime6Lifetime1 = ((var15Lifetime6Lifetime1 & 16711935) * var16Lifetime6Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime1 & 65280) * var16Lifetime6Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime1 << 24);
                      var17Lifetime6Lifetime1 = 256 - var16Lifetime6Lifetime1;
                      var18Lifetime6Lifetime1 = this.field_o[var14Lifetime6Lifetime1];
                      var18Lifetime6Lifetime1 = ((var18Lifetime6Lifetime1 & 16711935) * var17Lifetime6Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime1 & 65280) * var17Lifetime6Lifetime1 >> 8 & 65280);
                      this.field_o[var14Lifetime6Lifetime1] = var15Lifetime6Lifetime1 + var18Lifetime6Lifetime1;
                    }
                    if (param0 + var10Lifetime1 >= this.field_v &&
                      param0 + var10Lifetime1 < this.field_D) {
                      var14Lifetime6Lifetime1Lifetime1 = var6Lifetime1 + var10Lifetime1;
                      var15Lifetime6Lifetime1Lifetime1 = param3;
                      var16Lifetime6Lifetime1Lifetime1 = var13;
                      var15Lifetime6Lifetime1Lifetime1 = ((var15Lifetime6Lifetime1Lifetime1 & 16711935) * var16Lifetime6Lifetime1Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime1Lifetime1 & 65280) * var16Lifetime6Lifetime1Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime1Lifetime1 << 24);
                      var17Lifetime6Lifetime1Lifetime1 = 256 - var16Lifetime6Lifetime1Lifetime1;
                      var18Lifetime6Lifetime1Lifetime1 = this.field_o[var14Lifetime6Lifetime1Lifetime1];
                      var18Lifetime6Lifetime1Lifetime1 = ((var18Lifetime6Lifetime1Lifetime1 & 16711935) * var17Lifetime6Lifetime1Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime1Lifetime1 & 65280) * var17Lifetime6Lifetime1Lifetime1 >> 8 & 65280);
                      this.field_o[var14Lifetime6Lifetime1Lifetime1] = var15Lifetime6Lifetime1Lifetime1 + var18Lifetime6Lifetime1Lifetime1;
                    }
                  }
                  if (param1 + var11Lifetime1 >= this.field_H &&
                    param1 + var11Lifetime1 < this.field_C) {
                    if (param0 - var10Lifetime1 >= this.field_v &&
                      param0 - var10Lifetime1 < this.field_D) {
                      var14Lifetime6Lifetime2 = var7Lifetime1 - var10Lifetime1;
                      var15Lifetime6Lifetime2 = param3;
                      var16Lifetime6Lifetime2 = var13;
                      var15Lifetime6Lifetime2 = ((var15Lifetime6Lifetime2 & 16711935) * var16Lifetime6Lifetime2 >> 8 & 16711935) + ((var15Lifetime6Lifetime2 & 65280) * var16Lifetime6Lifetime2 >> 8 & 65280) + (var16Lifetime6Lifetime2 << 24);
                      var17Lifetime6Lifetime2 = 256 - var16Lifetime6Lifetime2;
                      var18Lifetime6Lifetime2 = this.field_o[var14Lifetime6Lifetime2];
                      var18Lifetime6Lifetime2 = ((var18Lifetime6Lifetime2 & 16711935) * var17Lifetime6Lifetime2 >> 8 & 16711935) + ((var18Lifetime6Lifetime2 & 65280) * var17Lifetime6Lifetime2 >> 8 & 65280);
                      this.field_o[var14Lifetime6Lifetime2] = var15Lifetime6Lifetime2 + var18Lifetime6Lifetime2;
                    }
                    if (param0 + var10Lifetime1 >= this.field_v &&
                      param0 + var10Lifetime1 < this.field_D) {
                      var14Lifetime6Lifetime2Lifetime1 = var7Lifetime1 + var10Lifetime1;
                      var15Lifetime6Lifetime2Lifetime1 = param3;
                      var16Lifetime6Lifetime2Lifetime1 = var13;
                      var15Lifetime6Lifetime2Lifetime1 = ((var15Lifetime6Lifetime2Lifetime1 & 16711935) * var16Lifetime6Lifetime2Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime2Lifetime1 & 65280) * var16Lifetime6Lifetime2Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime2Lifetime1 << 24);
                      var17Lifetime6Lifetime2Lifetime1 = 256 - var16Lifetime6Lifetime2Lifetime1;
                      var18Lifetime6Lifetime2Lifetime1 = this.field_o[var14Lifetime6Lifetime2Lifetime1];
                      var18Lifetime6Lifetime2Lifetime1 = ((var18Lifetime6Lifetime2Lifetime1 & 16711935) * var17Lifetime6Lifetime2Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime2Lifetime1 & 65280) * var17Lifetime6Lifetime2Lifetime1 >> 8 & 65280);
                      this.field_o[var14Lifetime6Lifetime2Lifetime1] = var15Lifetime6Lifetime2Lifetime1 + var18Lifetime6Lifetime2Lifetime1;
                    }
                  }
                  if (param1 + var10Lifetime1 < this.field_H) {
                    continue;
                  }
                  if (param1 + var10Lifetime1 >= this.field_C) {
                    continue;
                  }
                  if (param0 - var11Lifetime1 >= this.field_v &&
                    param0 - var11Lifetime1 < this.field_D) {
                    var14Lifetime6Lifetime3 = var9Lifetime1 - var11Lifetime1;
                    var15Lifetime6Lifetime3 = param3;
                    var16Lifetime6Lifetime3 = var13;
                    var15Lifetime6Lifetime3 = ((var15Lifetime6Lifetime3 & 16711935) * var16Lifetime6Lifetime3 >> 8 & 16711935) + ((var15Lifetime6Lifetime3 & 65280) * var16Lifetime6Lifetime3 >> 8 & 65280) + (var16Lifetime6Lifetime3 << 24);
                    var17Lifetime6Lifetime3 = 256 - var16Lifetime6Lifetime3;
                    var18Lifetime6Lifetime3 = this.field_o[var14Lifetime6Lifetime3];
                    var18Lifetime6Lifetime3 = ((var18Lifetime6Lifetime3 & 16711935) * var17Lifetime6Lifetime3 >> 8 & 16711935) + ((var18Lifetime6Lifetime3 & 65280) * var17Lifetime6Lifetime3 >> 8 & 65280);
                    this.field_o[var14Lifetime6Lifetime3] = var15Lifetime6Lifetime3 + var18Lifetime6Lifetime3;
                  }
                  if (param0 + var11Lifetime1 < this.field_v) {
                    continue;
                  }
                  if (param0 + var11Lifetime1 >= this.field_D) {
                    continue;
                  }
                  var14Lifetime6Lifetime4 = var9Lifetime1 + var11Lifetime1;
                  var15Lifetime6Lifetime4 = param3;
                  var16Lifetime6Lifetime4 = var13;
                  var15Lifetime6Lifetime4 = ((var15Lifetime6Lifetime4 & 16711935) * var16Lifetime6Lifetime4 >> 8 & 16711935) + ((var15Lifetime6Lifetime4 & 65280) * var16Lifetime6Lifetime4 >> 8 & 65280) + (var16Lifetime6Lifetime4 << 24);
                  var17Lifetime6Lifetime4 = 256 - var16Lifetime6Lifetime4;
                  var18Lifetime6Lifetime4 = this.field_o[var14Lifetime6Lifetime4];
                  var18Lifetime6Lifetime4 = ((var18Lifetime6Lifetime4 & 16711935) * var17Lifetime6Lifetime4 >> 8 & 16711935) + ((var18Lifetime6Lifetime4 & 65280) * var17Lifetime6Lifetime4 >> 8 & 65280);
                  this.field_o[var14Lifetime6Lifetime4] = var15Lifetime6Lifetime4 + var18Lifetime6Lifetime4;
                }
              }
              if (param0 - var10Lifetime1 >= this.field_v) {
                if (param0 + var10Lifetime1 < this.field_D) {
                  if (param1 - var10Lifetime1 >= this.field_H) {
                    if (param1 + var10Lifetime1 < this.field_C) {
                      this.field_o[var6Lifetime1 - var10Lifetime1] = param3;
                      this.field_o[var6Lifetime1 + var10Lifetime1] = param3;
                      this.field_o[var8Lifetime1] = param3;
                      this.field_o[var9Lifetime1] = param3;
                      while (true) {
                        incrementValue$4 = var11Lifetime1;
                        var11Lifetime1++;
                        var12Lifetime1 = var12Lifetime1 + (incrementValue$4 + var11Lifetime1);
                        var6Lifetime1 = var6Lifetime1 - this.field_k;
                        var7Lifetime1 = var7Lifetime1 + this.field_k;
                        if (var12Lifetime1 > param2) {
                          var10Lifetime1--;
                          var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                          var8Lifetime1 = var8Lifetime1 + this.field_k;
                          var9Lifetime1 = var9Lifetime1 - this.field_k;
                        }
                        if (var10Lifetime1 < var11Lifetime1) {
                          return;
                        }
                        this.field_o[var8Lifetime1 - var11Lifetime1] = param3;
                        this.field_o[var8Lifetime1 + var11Lifetime1] = param3;
                        this.field_o[var6Lifetime1 - var10Lifetime1] = param3;
                        this.field_o[var6Lifetime1 + var10Lifetime1] = param3;
                        this.field_o[var7Lifetime1 - var10Lifetime1] = param3;
                        this.field_o[var7Lifetime1 + var10Lifetime1] = param3;
                        this.field_o[var9Lifetime1 - var11Lifetime1] = param3;
                        this.field_o[var9Lifetime1 + var11Lifetime1] = param3;
                      }
                    }
                    if (param0 - var10Lifetime1 >= this.field_v &&
                      param1 >= this.field_H &&
                      param1 < this.field_C) {
                      this.field_o[var6Lifetime1 - var10Lifetime1] = param3;
                    }
                  } else {
                    if (param0 - var10Lifetime1 >= this.field_v &&
                      param1 >= this.field_H &&
                      param1 < this.field_C) {
                      this.field_o[var6Lifetime1 - var10Lifetime1] = param3;
                    }
                  }
                } else {
                  if (param0 - var10Lifetime1 >= this.field_v &&
                    param1 >= this.field_H &&
                    param1 < this.field_C) {
                    this.field_o[var6Lifetime1 - var10Lifetime1] = param3;
                  }
                }
              } else {
                if (param0 - var10Lifetime1 >= this.field_v &&
                  param1 >= this.field_H &&
                  param1 < this.field_C) {
                  this.field_o[var6Lifetime1 - var10Lifetime1] = param3;
                }
              }
              if (param0 + var10Lifetime1 < this.field_D) {
                if (param1 >= this.field_H) {
                  if (param1 < this.field_C) {
                    this.field_o[var6Lifetime1 + var10Lifetime1] = param3;
                    if (param1 - var10Lifetime1 >= this.field_H &&
                      param0 >= this.field_v &&
                      param0 < this.field_D) {
                      this.field_o[var8Lifetime1] = param3;
                    }
                  } else {
                    if (param1 - var10Lifetime1 >= this.field_H &&
                      param0 >= this.field_v &&
                      param0 < this.field_D) {
                      this.field_o[var8Lifetime1] = param3;
                    }
                  }
                } else {
                  if (param1 - var10Lifetime1 >= this.field_H &&
                    param0 >= this.field_v &&
                    param0 < this.field_D) {
                    this.field_o[var8Lifetime1] = param3;
                  }
                }
              } else {
                if (param1 - var10Lifetime1 >= this.field_H &&
                  param0 >= this.field_v &&
                  param0 < this.field_D) {
                  this.field_o[var8Lifetime1] = param3;
                }
              }
              if (param1 + var10Lifetime1 < this.field_C &&
                param0 >= this.field_v &&
                param0 < this.field_D) {
                this.field_o[var9Lifetime1] = param3;
              }
              while (true) {
                incrementValue$5 = var11Lifetime1;
                var11Lifetime1++;
                var12Lifetime1 = var12Lifetime1 + (incrementValue$5 + var11Lifetime1);
                var6Lifetime1 = var6Lifetime1 - this.field_k;
                var7Lifetime1 = var7Lifetime1 + this.field_k;
                if (var12Lifetime1 > param2) {
                  var10Lifetime1--;
                  var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                  var8Lifetime1 = var8Lifetime1 + this.field_k;
                  var9Lifetime1 = var9Lifetime1 - this.field_k;
                }
                if (var10Lifetime1 < var11Lifetime1) {
                  return;
                }
                if (param1 - var10Lifetime1 >= this.field_H &&
                  param1 - var10Lifetime1 < this.field_C) {
                  if (param0 - var11Lifetime1 >= this.field_v) {
                    if (param0 - var11Lifetime1 < this.field_D) {
                      this.field_o[var8Lifetime1 - var11Lifetime1] = param3;
                      if (param0 + var11Lifetime1 >= this.field_v &&
                        param0 + var11Lifetime1 < this.field_D) {
                        this.field_o[var8Lifetime1 + var11Lifetime1] = param3;
                      }
                    } else {
                      if (param0 + var11Lifetime1 >= this.field_v &&
                        param0 + var11Lifetime1 < this.field_D) {
                        this.field_o[var8Lifetime1 + var11Lifetime1] = param3;
                      }
                    }
                  } else {
                    if (param0 + var11Lifetime1 >= this.field_v &&
                      param0 + var11Lifetime1 < this.field_D) {
                      this.field_o[var8Lifetime1 + var11Lifetime1] = param3;
                    }
                  }
                }
                if (param1 - var11Lifetime1 >= this.field_H &&
                  param1 - var11Lifetime1 < this.field_C) {
                  if (param0 - var10Lifetime1 >= this.field_v &&
                    param0 - var10Lifetime1 < this.field_D) {
                    this.field_o[var6Lifetime1 - var10Lifetime1] = param3;
                  }
                  if (param0 + var10Lifetime1 >= this.field_v &&
                    param0 + var10Lifetime1 < this.field_D) {
                    this.field_o[var6Lifetime1 + var10Lifetime1] = param3;
                  }
                }
                if (param1 + var11Lifetime1 >= this.field_H &&
                  param1 + var11Lifetime1 < this.field_C) {
                  if (param0 - var10Lifetime1 >= this.field_v &&
                    param0 - var10Lifetime1 < this.field_D) {
                    this.field_o[var7Lifetime1 - var10Lifetime1] = param3;
                  }
                  if (param0 + var10Lifetime1 >= this.field_v &&
                    param0 + var10Lifetime1 < this.field_D) {
                    this.field_o[var7Lifetime1 + var10Lifetime1] = param3;
                  }
                }
                if (param1 + var10Lifetime1 < this.field_H) {
                  continue;
                }
                if (param1 + var10Lifetime1 >= this.field_C) {
                  continue;
                }
                if (param0 - var11Lifetime1 >= this.field_v &&
                  param0 - var11Lifetime1 < this.field_D) {
                  this.field_o[var9Lifetime1 - var11Lifetime1] = param3;
                }
                if (param0 + var11Lifetime1 < this.field_v) {
                  continue;
                }
                if (param0 + var11Lifetime1 >= this.field_D) {
                  continue;
                }
                this.field_o[var9Lifetime1 + var11Lifetime1] = param3;
              }
            }
            return;
          }
        }
    }

    private final rp a(Runnable param0) {
        int var2 = 0;
        for (var2 = 0; var2 < this.field_r; var2++) {
          if (this.field_i[var2].field_e == param0) {
            return this.field_i[var2];
          }
        }
        return null;
    }

    final void K(int[] param0) {
        param0[0] = this.field_v;
        param0[1] = this.field_H;
        param0[2] = this.field_D;
        param0[3] = this.field_C;
    }

    private final void j() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        int var1Lifetime1;
        for (var1 = 0; var1 < this.field_r; var1++) {
        }
        var1Lifetime1 = this.field_H * this.field_k + this.field_v;
        for (var2 = this.field_H; var2 < this.field_C; var2++) {
          for (var3 = 0; var3 < this.field_r; var3++) {
            this.field_i[var3].field_c.field_a[var2 - this.field_H] = var1Lifetime1;
          }
          var1Lifetime1 = var1Lifetime1 + this.field_k;
        }
    }

    final boolean c() {
        return false;
    }

    final void a(vc param0) {
        hi var2 = (hi) (param0);
        this.field_k = var2.field_d;
        this.field_B = var2.field_a;
        this.field_o = var2.field_c;
        this.field_t = var2;
        this.field_x = var2.field_d;
        this.field_m = var2.field_a;
        this.h();
    }

    private final void g() {
        this.field_v = 0;
        this.field_H = 0;
        this.field_D = this.field_k;
        this.field_C = this.field_B;
        this.j();
    }

    final za c(int param0) {
        return null;
    }

    final hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var10 = 0;
        int incrementValue$4 = 0;
        int var7;
        int var8;
        int var9;
        int var11;
        var7 = 0;
        var8 = param1;
        var9 = 0;
        L1: while (true) {
          if (var9 < param4) {
            for (var10 = 0; var10 < param3; var10++) {
              incrementValue$4 = var8;
              var8++;
              var11 = param0[incrementValue$4] >>> 24;
              if (var11 != 0 &&
                var11 != 255) {
                var7 = 1;
                break L1;
              }
            }
            var9++;
            continue;
          }
          break;
        }
        if (var7 == 0) {
          return (hr) ((Object) new mj(this, param0, param1, param2, param3, param4, param5));
        }
        return (hr) ((Object) new gl(this, param0, param1, param2, param3, param4, param5));
    }

    private final void b(java.awt.Canvas param0, int param1, int param2) {
        ce var4;
        var4 = (ce) (this.field_K.a(106, (long)param0.hashCode()));
        if (var4 != null) {
          if (var4.field_n == param1 &&
            var4.field_k == param2) {
            return;
          }
          this.a(param0, param1, param2);
        } else {
          var4 = id.a(param1, param2, param0, -101);
          this.field_K.a(var4, -1, (long)param0.hashCode());
        }
    }

    private final void a(java.awt.Canvas param0) {
        ce var2;
        java.awt.Dimension var3;
        if (param0 == null) {
          this.field_l = null;
          this.field_n = null;
          if (this.field_t == null) {
            this.field_o = null;
            this.field_B = 1;
            this.field_k = 1;
            this.field_m = 1;
            this.field_x = 1;
            this.h();
          }
        } else {
          var2 = (ce) (this.field_K.a(127, (long)param0.hashCode()));
          if (var2 != null) {
            this.field_l = param0;
            var3 = param0.getSize();
            this.field_z = var3.width;
            this.field_s = var3.height;
            this.field_n = var2;
            if (this.field_t == null) {
              this.field_o = var2.field_m;
              this.field_k = var2.field_n;
              this.field_B = var2.field_k;
              if (this.field_k != this.field_x ||
                this.field_B != this.field_m) {
                this.field_x = this.field_k;
                this.field_F = this.field_k;
                this.field_m = this.field_B;
                this.field_w = this.field_B;
              }
              this.h();
            }
          }
        }
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var13Lifetime1;
        if (param0 < this.field_v) {
          param2 = param2 - (this.field_v - param0);
          param0 = this.field_v;
        }
        if (param1 < this.field_H) {
          param3 = param3 - (this.field_H - param1);
          param1 = this.field_H;
        }
        if (param0 + param2 > this.field_D) {
          param2 = this.field_D - param0;
        }
        if (param1 + param3 > this.field_C) {
          param3 = this.field_C - param1;
        }
        if (param2 > 0) {
          if (param3 > 0 &&
            param0 <= this.field_D &&
            param1 <= this.field_C) {
            var7 = this.field_k - param2;
            var8 = param0 + param1 * this.field_k;
            var9 = param4 >>> 24;
            if (param5 != 0 && (param5 != 1 ||
              var9 != 255)) {
              if (param5 == 1) {
                param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                var10 = 256 - var9;
                for (var11 = 0; var11 < param3; var11++) {
                  for (var12 = -param2; var12 < 0; var12++) {
                    var13 = this.field_o[var8];
                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                    incrementValue$1 = var8;
                    var8++;
                    this.field_o[incrementValue$1] = param4 + var13;
                  }
                  var8 = var8 + var7;
                }
                return;
              }
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              for (var10 = 0; var10 < param3; var10++) {
                for (var11 = -param2; var11 < 0; var11++) {
                  var12 = this.field_o[var8];
                  var13Lifetime1 = param4 + var12;
                  var14 = (param4 & 16711935) + (var12 & 16711935);
                  var12 = (var14 & 16777472) + (var13Lifetime1 - var14 & 65536);
                  incrementValue$0 = var8;
                  var8++;
                  this.field_o[incrementValue$0] = var13Lifetime1 - var12 | var12 - (var12 >>> 8);
                }
                var8 = var8 + var7;
              }
              return;
            }
            var10 = param2 >> 3;
            var11 = param2 & 7;
            param2 = var8 - 1;
            for (var12 = -param3; var12 < 0; var12++) {
              if (var10 > 0) {
                param0 = var10;
                do {
                  param2++;
                  this.field_o[param2] = param4;
                  param2++;
                  this.field_o[param2] = param4;
                  param2++;
                  this.field_o[param2] = param4;
                  param2++;
                  this.field_o[param2] = param4;
                  param2++;
                  this.field_o[param2] = param4;
                  param2++;
                  this.field_o[param2] = param4;
                  param2++;
                  this.field_o[param2] = param4;
                  param2++;
                  this.field_o[param2] = param4;
                  param0--;
                } while (param0 > 0);
              }
              if (var11 > 0) {
                param0 = var11;
                do {
                  param2++;
                  this.field_o[param2] = param4;
                  param0--;
                } while (param0 > 0);
              }
              param2 = param2 + var7;
            }
          } else {
            return;
          }
        }
    }

    final boolean f() {
        return this.field_p;
    }

    private final void d(int param0) {
        this.field_i[param0].a((Runnable) ((Object) Thread.currentThread()), true);
    }

    private final void h() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_r; var1++) {
          this.field_i[var1].a(126);
        }
        this.g();
    }

    final da a(ta param0, ri[] param1, boolean param2) {
        int var7 = 0;
        int[] var4;
        int[] var5;
        int var6;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        for (var7 = 0; var7 < param1.length; var7++) {
          var4[var7] = param1[var7].field_h;
          var5[var7] = param1[var7].field_i;
          if (param1[var7].field_a != null) {
            var6 = 1;
          }
        }
        if (!param2) {
          if (var6 == 0) {
            return (da) ((Object) new je(this, param0, param1, var4, var5));
          }
          throw new IllegalArgumentException("");
        }
        if (var6 == 0) {
          return (da) ((Object) new at(this, param0, param1, var4, var5));
        }
        return (da) ((Object) new it(this, param0, param1, var4, var5));
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var9Lifetime3;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        int var9Lifetime4;
        int var11Lifetime2Lifetime1;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 == 0) {
          if (param2 < 0) {
            this.U(param0 + param2, param1, -param2 + 1, param4, param5);
          } else {
            this.U(param0, param1, param2 + 1, param4, param5);
          }
          return;
        }
        if (param2 == 0) {
          if (param3 < 0) {
            this.b(param0, param1 + param3, -param3 + 1, param4, param5);
          } else {
            this.b(param0, param1, param3 + 1, param4, param5);
          }
          return;
        }
        if (param2 + param3 < 0) {
          param0 = param0 + param2;
          param2 = -param2;
          param1 = param1 + param3;
          param3 = -param3;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param2 <= param3) {
          param0 = param0 << 16;
          param0 = param0 + 32768;
          param2 = param2 << 16;
          var7 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
          param3 = param3 + param1;
          if (param1 < this.field_H) {
            param0 = param0 + var7 * (this.field_H - param1);
            param1 = this.field_H;
          }
          if (param3 >= this.field_C) {
            param3 = this.field_C - 1;
          }
          var8 = param4 >>> 24;
          if (param5 != 0 && (param5 != 1 ||
            var8 != 255)) {
            if (param5 == 1) {
              param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
              var9 = 256 - var8;
              while (param1 <= param3) {
                var10 = param0 >> 16;
                if (var10 >= this.field_v &&
                  var10 < this.field_D) {
                  var11 = var10 + param1 * this.field_k;
                  var12 = this.field_o[var11];
                  var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.field_o[var10 + param1 * this.field_k] = param4 + var12;
                }
                param0 = param0 + var7;
                param1++;
              }
            } else {
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              while (param1 <= param3) {
                var9Lifetime4 = param0 >> 16;
                if (var9Lifetime4 >= this.field_v &&
                  var9Lifetime4 < this.field_D) {
                  var10Lifetime2 = var9Lifetime4 + param1 * this.field_k;
                  var11Lifetime2 = this.field_o[var10Lifetime2];
                  var12Lifetime2 = param4 + var11Lifetime2;
                  var13 = (param4 & 16711935) + (var11Lifetime2 & 16711935);
                  var11Lifetime2Lifetime1 = (var13 & 16777472) + (var12Lifetime2 - var13 & 65536);
                  this.field_o[var10Lifetime2] = var12Lifetime2 - var11Lifetime2Lifetime1 | var11Lifetime2Lifetime1 - (var11Lifetime2Lifetime1 >>> 8);
                }
                param0 = param0 + var7;
                param1++;
              }
            }
          } else {
            while (param1 <= param3) {
              var9Lifetime3 = param0 >> 16;
              if (var9Lifetime3 >= this.field_v &&
                var9Lifetime3 < this.field_D) {
                this.field_o[var9Lifetime3 + param1 * this.field_k] = param4;
              }
              param0 = param0 + var7;
              param1++;
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          param1 = param1 << 16;
          param1 = param1 + 32768;
          param3 = param3 << 16;
          var7Lifetime1 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
          param2 = param2 + param0;
          if (param0 < this.field_v) {
            param1 = param1 + var7Lifetime1 * (this.field_v - param0);
            param0 = this.field_v;
          }
          if (param2 >= this.field_D) {
            param2 = this.field_D - 1;
          }
          var8Lifetime1 = param4 >>> 24;
          if (param5 != 0 && (param5 != 1 ||
            var8Lifetime1 != 255)) {
            if (param5 == 1) {
              param4 = ((param4 & 16711935) * var8Lifetime1 >> 8 & 16711935) + ((param4 & 65280) * var8Lifetime1 >> 8 & 65280) + (var8Lifetime1 << 24);
              var9Lifetime1 = 256 - var8Lifetime1;
              while (param0 <= param2) {
                var10Lifetime1 = param1 >> 16;
                if (var10Lifetime1 >= this.field_H &&
                  var10Lifetime1 < this.field_C) {
                  var11Lifetime1 = param0 + var10Lifetime1 * this.field_k;
                  var12Lifetime1 = this.field_o[var11Lifetime1];
                  var12Lifetime1 = ((var12Lifetime1 & 16711935) * var9Lifetime1 >> 8 & 16711935) + ((var12Lifetime1 & 65280) * var9Lifetime1 >> 8 & 65280);
                  this.field_o[var11Lifetime1] = param4 + var12Lifetime1;
                }
                param1 = param1 + var7Lifetime1;
                param0++;
              }
            } else {
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              while (param0 <= param2) {
                var9Lifetime1 = param1 >> 16;
                if (var9Lifetime1 >= this.field_H &&
                  var9Lifetime1 < this.field_C) {
                  var10Lifetime1 = param0 + var9Lifetime1 * this.field_k;
                  var11Lifetime1 = this.field_o[var10Lifetime1];
                  var12Lifetime1 = param4 + var11Lifetime1;
                  var13Lifetime1 = (param4 & 16711935) + (var11Lifetime1 & 16711935);
                  var11Lifetime1 = (var13Lifetime1 & 16777472) + (var12Lifetime1 - var13Lifetime1 & 65536);
                  this.field_o[var10Lifetime1] = var12Lifetime1 - var11Lifetime1 | var11Lifetime1 - (var11Lifetime1 >>> 8);
                }
                param1 = param1 + var7Lifetime1;
                param0++;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            while (param0 <= param2) {
              var9Lifetime2 = param1 >> 16;
              if (var9Lifetime2 >= this.field_H &&
                var9Lifetime2 < this.field_C) {
                this.field_o[param0 + var9Lifetime2 * this.field_k] = param4;
              }
              param1 = param1 + var7Lifetime1;
              param0++;
            }
          }
        }

    }

    qa(java.awt.Canvas param0, d param1, int param2, int param3) {
        this(param1);
        try {
          this.b(param0, param2, param3);
          this.a(param0);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.a((byte) -21);
          throw new RuntimeException("");
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1Lifetime1;
        if (param1 >= this.field_H) {
          if (param1 >= this.field_C) {
            return;
          }
          if (param0 < this.field_v) {
            param2 = param2 - (this.field_v - param0);
            param0 = this.field_v;
          }
          if (param0 + param2 > this.field_D) {
            param2 = this.field_D - param0;
          }
          var6 = param0 + param1 * this.field_k;
          var7 = param3 >>> 24;
          if (param4 != 0 && (param4 != 1 ||
            var7 != 255)) {
            if (param4 == 1) {
              param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < param2; var9++) {
                var10 = this.field_o[var6 + var9];
                var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                this.field_o[var6 + var9] = param3 + var10;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < param2; var8Lifetime2++) {
              var9Lifetime1 = this.field_o[var6 + var8Lifetime2];
              var10Lifetime1 = param3 + var9Lifetime1;
              var11 = (param3 & 16711935) + (var9Lifetime1 & 16711935);
              var9Lifetime1Lifetime1 = (var11 & 16777472) + (var10Lifetime1 - var11 & 65536);
              this.field_o[var6 + var8Lifetime2] = var10Lifetime1 - var9Lifetime1Lifetime1 | var9Lifetime1Lifetime1 - (var9Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < param2; var8Lifetime1++) {
            this.field_o[var6 + var8Lifetime1] = param3;
          }
        }
    }

    final void a(za param0) {
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        if (param2 > this.field_k) {
          param2 = this.field_k;
        }
        if (param3 > this.field_B) {
          param3 = this.field_B;
        }
        this.field_v = param0;
        this.field_D = param2;
        this.field_H = param1;
        this.field_C = param3;
        this.j();
    }

    final void f(int param0, int param1) {
        rp discarded$0 = this.a((Runnable) ((Object) Thread.currentThread()));
        this.field_M = param0;
        this.field_L = param1;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_q = param0;
        this.field_j = param1;
        this.field_G = param2;
        this.field_y = param3;
        this.j();
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
          var9 = (param1 + var8) * this.field_k + param0;
          for (var10 = 0; var10 < param2; var10++) {
            incrementValue$0 = param5;
            param5++;
            this.field_o[var9 + var10] = param4[incrementValue$0];
          }
          param5 = param5 + param6;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        this.field_r = param0;
        this.field_i = new rp[this.field_r];
        for (var2 = 0; var2 < this.field_r; var2++) {
          this.field_i[var2] = new rp(this);
        }
    }

    final void d() {
        if (this.field_J) {
          pt.a(true, false, -1);
          this.field_J = false;
        }
        this.field_n = null;
        this.field_l = null;
        this.field_z = 0;
        this.field_s = 0;
        this.field_K = null;
        this.field_p = true;
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        java.awt.Dimension var5 = null;
        ce var4 = (ce) (this.field_K.a(122, (long)param0.hashCode()));
        if (var4 != null) {
          var4.b(false);
          var4 = id.a(param1, param2, param0, -91);
          this.field_K.a(var4, -1, (long)param0.hashCode());
          if (this.field_l == param0 &&
            this.field_t == null) {
            var5 = param0.getSize();
            this.field_z = var5.width;
            this.field_s = var5.height;
            this.field_n = var4;
            this.field_o = var4.field_m;
            this.field_k = var4.field_n;
            this.field_B = var4.field_k;
            if (this.field_k != this.field_x ||
              this.field_B != this.field_m) {
              this.field_x = this.field_k;
              this.field_F = this.field_k;
              this.field_m = this.field_B;
              this.field_w = this.field_B;
            }
            this.h();
          }
          return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1Lifetime1;
        if (param0 >= this.field_v) {
          if (param0 >= this.field_D) {
            return;
          }
          if (param1 < this.field_H) {
            param2 = param2 - (this.field_H - param1);
            param1 = this.field_H;
          }
          if (param1 + param2 > this.field_C) {
            param2 = this.field_C - param1;
          }
          var6 = param0 + param1 * this.field_k;
          var7 = param3 >>> 24;
          if (param4 != 0 && (param4 != 1 ||
            var7 != 255)) {
            if (param4 == 1) {
              param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < param2; var9++) {
                var10 = var6 + var9 * this.field_k;
                var11 = this.field_o[var10];
                var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                this.field_o[var10] = param3 + var11;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < param2; var8Lifetime2++) {
              var9Lifetime1 = var6 + var8Lifetime2 * this.field_k;
              var10Lifetime1 = this.field_o[var9Lifetime1];
              var11Lifetime1 = param3 + var10Lifetime1;
              var12 = (param3 & 16711935) + (var10Lifetime1 & 16711935);
              var10Lifetime1Lifetime1 = (var12 & 16777472) + (var11Lifetime1 - var12 & 65536);
              this.field_o[var9Lifetime1] = var11Lifetime1 - var10Lifetime1Lifetime1 | var10Lifetime1Lifetime1 - (var10Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < param2; var8Lifetime1++) {
            this.field_o[var6 + var8Lifetime1 * this.field_k] = param3;
          }
        }
    }

    final void b(int param0, int param1) throws rf {
        java.awt.Graphics var3 = null;
        if (this.field_l == null ||
          this.field_n == null) {
          throw new IllegalStateException(field_I);
        }
        try {
          var3 = this.field_l.getGraphics();
          this.field_n.a(var3, 0, param1, this.field_z, param0, this.field_s, 0, (byte) -106);
        } catch (Exception exception) {
          this.field_l.repaint();
        }
    }

    final vc a(bu param0, nr param1) {
        return (vc) ((Object) new hi(this, (hr) (param0), (od) (param1)));
    }

    final int[] Y() {
        return new int[]{this.field_q, this.field_j, this.field_G, this.field_y};
    }

    final nr a(int param0, int param1) {
        return (nr) ((Object) new od(param0, param1));
    }

    final void b() {
        if (this.field_l != null) {
          this.field_o = this.field_n.field_m;
          this.field_k = this.field_n.field_n;
          this.field_B = this.field_n.field_k;
          this.field_x = this.field_F;
          this.field_m = this.field_w;
        } else {
          this.field_k = 1;
          this.field_B = 1;
          this.field_o = null;
          this.field_x = 1;
          this.field_m = 1;
        }
        this.field_t = null;
        this.h();
    }

    final void e() {
    }

    static {
        field_I = "off";
    }
}
