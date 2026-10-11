/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc {
    String field_l;
    int field_s;
    hc field_m;
    private String field_i;
    private int field_b;
    private int field_j;
    private byte[][] field_o;
    tl[] field_q;
    private double[] field_p;
    private int field_w;
    private kh field_y;
    private int field_f;
    static String[] field_d;
    private ei field_a;
    private sg field_g;
    uf field_e;
    private int field_r;
    private int[][] field_x;
    private int field_n;
    private boolean[][] field_h;
    static fj field_c;
    private kh field_t;
    static String field_u;
    ti[] field_k;
    private int field_v;

    final int a(int param0) {
        if (param0 != -31648) {
          return 84;
        }
        return this.field_j;
    }

    final void a(double param0, double[] param1, byte param2, double param3) {
        int var21_int = 0;
        double dupTemp$2 = 0.0;
        double dupTemp$3 = 0.0;
        int var41_int = 0;
        double dupTemp$0 = 0.0;
        double dupTemp$1 = 0.0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var7_double = 0.0;
        RuntimeException var7 = null;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        tl[] var21 = null;
        int var22 = 0;
        int var23 = 0;
        double[] var23_ref_double__ = null;
        int var24 = 0;
        double[] var24_ref_double__ = null;
        double var25 = 0.0;
        double[] var25_ref_double__ = null;
        double[] var26 = null;
        double var27 = 0.0;
        double var29 = 0.0;
        int var31 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        double var42 = 0.0;
        int var42_int = 0;
        int var43 = 0;
        double[] var44 = null;
        int var44_int = 0;
        double[] var45 = null;
        double var46 = 0.0;
        int var48 = 0;
        double[] var49 = null;
        double[] var50 = null;
        double[] var51 = null;
        double[] var52 = null;
        double[] var53 = null;
        double[] var54 = null;
        double[] var55 = null;
        double[] var56 = null;
        tl var57 = null;
        pj var58 = null;
        double[] var65 = null;
        double[] var66 = null;
        double[] var67 = null;
        double[] var68 = null;
        double[] var69 = null;
        double[] var70 = null;
        double[] var71 = null;
        double[] var72 = null;
        double[] var73 = null;
        double[] var74 = null;
        double[] var81 = null;
        double[] var82 = null;
        int[] var89 = null;
        int[] var90 = null;
        int[] var91 = null;
        int[] var92 = null;
        int[] var93 = null;
        int[] var94 = null;
        double[] var23_ref_double__Lifetime1;
        double[] var23_ref_double__Lifetime2;
        double[] var23_ref_double__Lifetime3;
        double[] var24_ref_double__Lifetime1;
        double[] var24_ref_double__Lifetime2;
        double[] var24_ref_double__Lifetime3;
        double[] var45Lifetime1;
        int var22Lifetime1;
        var48 = Torquing.field_u;
        try {
          var7_double = 1.1 * param0;
          var9 = -var7_double + param1[0];
          var11 = param1[0] + var7_double;
          if (param2 != 37) {
            return;
          }
          var13 = -var7_double + param1[2];
          var15 = param1[2] + var7_double;
          var17 = Math.max(0, (int)(var9 / 100.0));
          var18 = Math.max(0, (int)(var13 / 100.0));
          var19 = Math.min(-1 + this.field_r, -(int)(-var11 / 100.0));
          var20 = Math.min(this.field_v - 1, -(int)(-var15 / 100.0));
          for (var21_int = var17; var21_int <= var19; var21_int++) {
            for (var22 = var18; var20 >= var22; var22++) {
              if (this.field_o[var21_int][var22] != -1) {
                var23 = 1 + var21_int;
                var24 = var22 + 1;
                if (0 == (var21_int + var22 & 1)) {
                  var25_ref_double__ = this.a(var21_int, var24, var21_int, var22, param1, 5, var23, var24);
                  var26 = this.a(var23, var22, var23, var24, param1, 5, var21_int, var22);
                } else {
                  var25_ref_double__ = this.a(var23, var22, var21_int, var22, param1, param2 - 32, var21_int, var24);
                  var26 = this.a(var21_int, var24, var23, var24, param1, 5, var23, var22);
                }
                dupTemp$2 = param3 + mo.field_D[this.field_o[var21_int][var22]];
                var26[5] = dupTemp$2;
                var25_ref_double__[5] = dupTemp$2;
                dupTemp$3 = mo.field_x[this.field_o[var21_int][var22]];
                var26[4] = dupTemp$3;
                var25_ref_double__[4] = dupTemp$3;
                if (var25_ref_double__[3] <= param0 + 1.0) {
                  ol.a(var25_ref_double__, (byte) 89);
                }
                if (var26[3] <= 1.0 + param0) {
                  ol.a(var26, (byte) 95);
                }
              } else {
                if (-2147483648 != this.field_w) {
                  if (0 < var21_int &&
                    -1 != this.field_o[-1 + var21_int][var22] &&
                    !this.field_h[var21_int - 1][var22]) {
                    var67 = ie.a(this.field_w, var22, 1 + var22, param1, this.field_w, var21_int, var22, var21_int, this.field_x[var21_int][var22], var21_int, (byte) 109);
                    var49 = var67;
                    var23_ref_double__ = var49;
                    var68 = ie.a(this.field_x[var21_int][1 + var22], 1 + var22, var22, param1, this.field_x[var21_int][var22], var21_int, 1 + var22, var21_int, this.field_w, var21_int, (byte) -11);
                    var50 = var68;
                    var24_ref_double__ = var50;
                    var24_ref_double__[5] = param3;
                    var23_ref_double__[5] = param3;
                    var24_ref_double__[4] = 0.1;
                    var25_ref_double__ = var23_ref_double__;
                    var25_ref_double__[4] = 0.1;
                    if (param0 + 1.0 >= var67[3]) {
                      ol.a(var67, (byte) 65);
                    }
                    if (1.0 + param0 >= var68[3]) {
                      ol.a(var68, (byte) 37);
                    }
                  }
                  if (var22 > 0 &&
                    this.field_o[var21_int][var22 - 1] != -1 &&
                    !this.field_h[var21_int][var22 - 1]) {
                    var69 = ie.a(this.field_w, var22, var22, param1, this.field_x[var21_int][var22], var21_int, var22, var21_int, this.field_w, 1 + var21_int, (byte) -92);
                    var51 = var69;
                    var23_ref_double__Lifetime1 = var51;
                    var70 = ie.a(this.field_x[var21_int + 1][var22], var22, var22, param1, this.field_w, 1 + var21_int, var22, 1 + var21_int, this.field_x[var21_int][var22], var21_int, (byte) -24);
                    var52 = var70;
                    var24_ref_double__Lifetime1 = var52;
                    var24_ref_double__Lifetime1[5] = param3;
                    var23_ref_double__Lifetime1[5] = param3;
                    var24_ref_double__Lifetime1[4] = 0.1;
                    var25_ref_double__ = var23_ref_double__Lifetime1;
                    var25_ref_double__[4] = 0.1;
                    if (1.0 + param0 >= var69[3]) {
                      ol.a(var69, (byte) 51);
                    }
                    if (1.0 + param0 >= var70[3]) {
                      ol.a(var70, (byte) 108);
                    }
                  }
                  if (var21_int < this.field_r - 1 &&
                    -1 != this.field_o[1 + var21_int][var22] &&
                    !this.field_h[var21_int + 1][var22]) {
                    var71 = ie.a(this.field_w, var22 + 1, var22, param1, this.field_x[1 + var21_int][var22], var21_int + 1, var22, 1 + var21_int, this.field_w, var21_int + 1, (byte) 110);
                    var53 = var71;
                    var23_ref_double__Lifetime2 = var53;
                    var72 = ie.a(this.field_x[1 + var21_int][1 + var22], var22, 1 + var22, param1, this.field_w, 1 + var21_int, 1 + var22, 1 + var21_int, this.field_x[var21_int + 1][var22], var21_int + 1, (byte) 112);
                    var54 = var72;
                    var24_ref_double__Lifetime2 = var54;
                    var24_ref_double__Lifetime2[5] = param3;
                    var23_ref_double__Lifetime2[5] = param3;
                    var24_ref_double__Lifetime2[4] = 0.1;
                    var25_ref_double__ = var23_ref_double__Lifetime2;
                    var25_ref_double__[4] = 0.1;
                    if (var71[3] <= 1.0 + param0) {
                      ol.a(var71, (byte) 82);
                    }
                    if (var72[3] <= 1.0 + param0) {
                      ol.a(var72, (byte) 93);
                    }
                  }
                  if (-1 + this.field_v > var22 &&
                    this.field_o[var21_int][1 + var22] != -1 &&
                    !this.field_h[var21_int][1 + var22]) {
                    var73 = ie.a(this.field_w, var22 + 1, 1 + var22, param1, this.field_w, var21_int + 1, 1 + var22, var21_int, this.field_x[var21_int][1 + var22], var21_int, (byte) 119);
                    var55 = var73;
                    var23_ref_double__Lifetime3 = var55;
                    var74 = ie.a(this.field_x[1 + var21_int][1 + var22], var22 + 1, var22 + 1, param1, this.field_x[var21_int][1 + var22], var21_int, var22 + 1, 1 + var21_int, this.field_w, var21_int + 1, (byte) -98);
                    var56 = var74;
                    var24_ref_double__Lifetime3 = var56;
                    var24_ref_double__Lifetime3[5] = param3;
                    var23_ref_double__Lifetime3[5] = param3;
                    var25_ref_double__ = var23_ref_double__Lifetime3;
                    var24_ref_double__Lifetime3[4] = 0.1;
                    var25_ref_double__[4] = 0.1;
                    if (1.0 + param0 >= var73[3]) {
                      ol.a(var73, (byte) 92);
                    }
                    if (param0 + 1.0 >= var74[3]) {
                      ol.a(var74, (byte) 118);
                    }
                  }
                }
              }
            }
          }
          var21 = this.field_q;
          for (var22Lifetime1 = 0; var21.length > var22Lifetime1; var22Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var57 = var21[var22Lifetime1];
            if (var57 != null) {
              if ((3 != var57.field_r) &&
                (decompiledFrameRemainder0 = !(25 > var57.field_r))) {
                decompiledFrameRemainder0 = !(31 < var57.field_r);
              }
              if (decompiledFrameRemainder0) {
                var58 = vb.field_c[var57.field_r];
                var25 = -var57.field_g[0] + param1[0];
                var27 = param1[1] - var57.field_g[1];
                var29 = -var57.field_g[2] + param1[2];
                var31 = var58.a();
                if (var29 * var29 + (var27 * var27 + var25 * var25) < (double)(var31 * var31)) {
                  var92 = var58.field_j;
                  var93 = var58.field_y;
                  var94 = var58.field_v;
                  var89 = var58.field_p;
                  var90 = var58.field_u;
                  var91 = var58.field_t;
                  var38 = (int)(0.5 + var57.field_g[0]);
                  var39 = (int)(0.5 + var57.field_g[1]);
                  var40 = (int)(var57.field_g[2] + 0.5);
                  for (var41_int = 0; var58.field_x > var41_int; var41_int++) {
                    var42_int = var89[var41_int];
                    var43 = var90[var41_int];
                    var44_int = var91[var41_int];
                    var81 = qa.a(var92[var42_int] + var38, var93[var43] + var39, var40 + var94[var42_int], var40 + var94[var43], var94[var44_int] + var40, var38 + var92[var44_int], (byte) -80, var93[var44_int] + var39, var93[var42_int] + var39, param1, var92[var43] + var38);
                    var65 = var81;
                    var45 = var65;
                    var45[4] = 0.1;
                    var81[5] = param3;
                    if (var81[3] <= 1.0 + param0) {
                      ol.a(var81, (byte) 101);
                    }
                  }
                  var41 = ka.field_n[var57.field_r];
                  var42 = (double)var41[2];
                  if (var42 > 0.0 &&
                    param1[1] >= (double)(var39 + var41[3]) &&
                    param1[1] <= (double)(var41[4] + var39)) {
                    var82 = new double[12];
                    var66 = var82;
                    var44 = var66;
                    var44[9] = param1[0] - (double)(var41[0] + var38);
                    var45Lifetime1 = var44;
                    var44[10] = 0.0;
                    var44[11] = (double)(-var40 - var41[1]) + param1[2];
                    var45Lifetime1[7] = 0.0;
                    var46 = Math.sqrt(ap.a(var82, 9, var82, 9));
                    if (0.0 != var46 &&
                      !(1.0 + param0 < var46 - var42)) {
                      dupTemp$0 = var82[11] / var46;
                      var44[11] = dupTemp$0;
                      var44[8] = dupTemp$0;
                      dupTemp$1 = var82[9] / var46;
                      var44[9] = dupTemp$1;
                      var44[6] = dupTemp$1;
                      var44[0] = (double)(var41[0] + var38) + var82[9] * var42;
                      var44[3] = -var42 + var46;
                      var44[4] = 0.1;
                      var44[1] = param1[1];
                      var82[5] = param3;
                      var44[2] = var42 * var82[11] + (double)(var41[1] + var40);
                      ol.a(var82, (byte) 103);
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_78_0 = var7;
          stackIn_78_1 = new StringBuilder().append("hc.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_i = (String) null;
        }
        return this.field_f;
    }

    final double[] f(int param0) {
        int var2 = -45 % ((param0 + 39) / 46);
        return this.field_p;
    }

    final boolean g(int param0) {
        long var2;
        lm var4;
        int var4_int;
        ti var5;
        int var6;
        long var2Lifetime1;
        var6 = Torquing.field_u;
        if (param0 != 1) {
          this.field_s = 77;
        }
        if (this.field_a == null) {
          return true;
        }
        if (null == this.field_g) {
          this.field_g = new sg(1);
          this.field_g.a(0, this.a(-100, true));
          return false;
        }
        if (0 < this.field_a.a(false)) {
          var2 = km.b(-1);
          var4 = (lm) ((Object) this.field_a.b(0));
          while (var4 != null) {
            this.field_g.a(var4);
            ((q) ((Object) var4)).f(0);
            if (50L >= -var2 + km.b(-1)) {
              var4 = (lm) ((Object) this.field_a.f(-24059));
              continue;
            }
            break;
          }
          return false;
        }
        var2Lifetime1 = km.b(-1);
        if (this.field_k == null) {
          this.field_k = this.field_g.a(0);
        }
        if (this.field_k != null) {
          var4_int = 0;
          while (true) {
            if (this.field_n >= this.field_k.length) {
              break;
            }
            var5 = this.field_k[this.field_n];
            if (var5 != null) {
              if (var5.a((byte) 112) != 0) {
                if (var5.a(-3)) {
                  var4_int++;
                }
              } else {
                this.field_k[this.field_n] = null;
                var4_int++;
              }
            }
            this.field_n = this.field_n + 1;
            if (5 > var4_int) {
              continue;
            }
            if (50L >= km.b(param0 - 2) - var2Lifetime1) {
              continue;
            }
            return false;
          }
        }
        this.field_g = null;
        this.field_a = null;
        return true;
    }

    final boolean e(int param0) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$40 = 0;
        byte[] dupTemp$41 = null;
        int incrementValue$38 = 0;
        int incrementValue$39 = 0;
        int incrementValue$8 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int incrementValue$36 = 0;
        int incrementValue$37 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int var2;
        int var3;
        int var4;
        int var18;
        int var5;
        int[] var6_ref_int__;
        int var6;
        int[] var7_ref_int__;
        int var7;
        int[] var8_ref_int__;
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
        int[] var19;
        int[] var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        var18 = Torquing.field_u;
        if (this.field_i == null) {
          return true;
        }
        if (null != this.field_o) {
          if (this.field_a == null) {
            this.field_a = new ei();
          }
          if (param0 != 0) {
            return true;
          }
          this.a(param0 - 100, true);
          this.field_i = null;
          return false;
        }
        boolean decompiledFrameRemainder0 = true;
        var2 = 0;
        if (this.field_i.charAt(var2) == 34) {
          do {
            var2++;
          } while (34 != this.field_i.charAt(var2));
          this.field_l = this.field_i.substring(1, var2);
          var2++;
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_l = "";
        }
        incrementValue$6 = var2;
        var2++;
        this.field_r = 1 + lk.a(this.field_i.charAt(incrementValue$6), 97);
        incrementValue$7 = var2;
        var2++;
        this.field_v = lk.a(this.field_i.charAt(incrementValue$7), 97) + 1;
        this.field_o = new byte[this.field_r][this.field_v];
        this.field_h = new boolean[this.field_r][this.field_v];
        this.field_x = new int[1 + this.field_r][this.field_v + 1];
        for (var3 = 0; this.field_r > var3; var3++) {
          for (var4 = 0; var4 < this.field_v; var4++) {
            incrementValue$40 = var2;
            var2++;
            this.field_o[var3][var4] = (byte)lk.a(this.field_i.charAt(incrementValue$40), 97);
            if (this.field_o[var3][var4] == 63) {
              this.field_o[var3][var4] = (byte)-1;
            } else {
              if ((this.field_o[var3][var4] & 32) != 0) {
                this.field_h[var3][var4] = true;
                dupTemp$41 = this.field_o[var3];
                dupTemp$41[var4] = (byte)(dupTemp$41[var4] - 32);
              }
            }
          }
        }
        for (var3Lifetime1 = 0; var3Lifetime1 <= this.field_r; var3Lifetime1++) {
          for (var4Lifetime1 = 0; var4Lifetime1 <= this.field_v; var4Lifetime1++) {
            incrementValue$38 = var2;
            var2++;
            incrementValue$39 = var2;
            var2++;
            this.field_x[var3Lifetime1][var4Lifetime1] = -((lk.a(this.field_i.charAt(incrementValue$38), 97) << 6) + lk.a(this.field_i.charAt(incrementValue$39), 97));
          }
        }
        incrementValue$8 = var2;
        var2++;
        this.field_q = new tl[lk.a(this.field_i.charAt(incrementValue$8), 97)];
        for (var3Lifetime2 = 0; var3Lifetime2 < this.field_q.length; var3Lifetime2++) {
          incrementValue$29 = var2;
          var2++;
          var4Lifetime2 = lk.a(this.field_i.charAt(incrementValue$29), 97);
          incrementValue$30 = var2;
          var2++;
          var5 = lk.a(this.field_i.charAt(incrementValue$30), 97);
          incrementValue$31 = var2;
          var2++;
          var6 = lk.a(this.field_i.charAt(incrementValue$31), 97);
          incrementValue$32 = var2;
          var2++;
          var7 = lk.a(this.field_i.charAt(incrementValue$32), 97);
          incrementValue$33 = var2;
          var2++;
          var8 = lk.a(this.field_i.charAt(incrementValue$33), 97);
          incrementValue$34 = var2;
          var2++;
          var9 = lk.a(this.field_i.charAt(incrementValue$34), 97);
          incrementValue$35 = var2;
          var2++;
          var10 = lk.a(this.field_i.charAt(incrementValue$35), 97);
          incrementValue$36 = var2;
          var2++;
          var11 = lk.a(this.field_i.charAt(incrementValue$36), 97);
          incrementValue$37 = var2;
          var2++;
          var12 = lk.a(this.field_i.charAt(incrementValue$37), 97);
          var13 = (var6 >> 5) + (var5 << 1) + (var4Lifetime2 << 7);
          var14 = -((var8 >> 4) + (var7 << 2) + ((31 & var6) << 8));
          var15 = (var10 >> 3) + ((15 & var8) << 9) + (var9 << 3);
          var16 = (var11 >> 4) + (var10 << 2 & 28);
          var17 = var12 + (960 & var11 << 6);
          this.field_q[var3Lifetime2] = l.a(var13, var16, var17, (byte) 83, var15, var14);
          if (var16 != 7 &&
            var16 != 0 &&
            var16 != 3 && (var16 < 25 ||
            var16 > 31)) {
            mh.field_k[this.field_s] = mh.field_k[this.field_s] + 1;
          }
        }
        incrementValue$9 = var2;
        var2++;
        incrementValue$10 = var2;
        var2++;
        var3Lifetime3 = lk.a(this.field_i.charAt(incrementValue$9), 97) * 64 + lk.a(this.field_i.charAt(incrementValue$10), 97);
        if (var3Lifetime3 < 4095) {
          this.field_a = new ei();
          for (var4Lifetime3 = 0; var4Lifetime3 < var3Lifetime3; var4Lifetime3++) {
            incrementValue$11 = var2;
            var2++;
            var5Lifetime1 = lk.a(this.field_i.charAt(incrementValue$11), 97);
            var23 = new int[var5Lifetime1];
            var20 = var23;
            var6_ref_int__ = var20;
            var22 = new int[var5Lifetime1];
            var19 = var22;
            var7_ref_int__ = var19;
            var24 = new int[var5Lifetime1];
            var21 = var24;
            var8_ref_int__ = var21;
            for (var9Lifetime1 = 0; var5Lifetime1 > var9Lifetime1; var9Lifetime1++) {
              incrementValue$12 = var2;
              var2++;
              var10Lifetime1 = lk.a(this.field_i.charAt(incrementValue$12), 97);
              incrementValue$13 = var2;
              var2++;
              var11 = lk.a(this.field_i.charAt(incrementValue$13), 97);
              incrementValue$14 = var2;
              var2++;
              var12 = lk.a(this.field_i.charAt(incrementValue$14), 97);
              incrementValue$15 = var2;
              var2++;
              var13 = lk.a(this.field_i.charAt(incrementValue$15), 97);
              incrementValue$16 = var2;
              var2++;
              var14Lifetime1 = lk.a(this.field_i.charAt(incrementValue$16), 97);
              incrementValue$17 = var2;
              var2++;
              var15Lifetime1 = lk.a(this.field_i.charAt(incrementValue$17), 97);
              incrementValue$18 = var2;
              var2++;
              var16Lifetime1 = lk.a(this.field_i.charAt(incrementValue$18), 97);
              var6_ref_int__[var9Lifetime1] = (var10Lifetime1 << 7) + ((var11 << 1) + (var12 >> 5));
              var7_ref_int__[var9Lifetime1] = -((ie.a(31, var12) << 8) + ((var13 << 2) + (var14Lifetime1 >> 4)));
              if (-8172 == var22[var9Lifetime1]) {
                var22[var9Lifetime1] = 20;
              }
              var8_ref_int__[var9Lifetime1] = (var16Lifetime1 >> 3) + (var15Lifetime1 << 3) + (ie.a(var14Lifetime1, 15) << 9);
            }
            this.field_a.a((byte) 54, new pf(var23, var22, var24));
          }
        }
        incrementValue$19 = var2;
        var2++;
        this.field_j = 5000 * lk.a(this.field_i.charAt(incrementValue$19), 97);
        incrementValue$20 = var2;
        var2++;
        var4Lifetime4 = lk.a(this.field_i.charAt(incrementValue$20), 97);
        incrementValue$21 = var2;
        var2++;
        var5Lifetime2 = lk.a(this.field_i.charAt(incrementValue$21), 97);
        incrementValue$22 = var2;
        var2++;
        var6Lifetime1 = lk.a(this.field_i.charAt(incrementValue$22), 97);
        incrementValue$23 = var2;
        var2++;
        var7Lifetime1 = lk.a(this.field_i.charAt(incrementValue$23), 97);
        incrementValue$24 = var2;
        var2++;
        var8Lifetime1 = lk.a(this.field_i.charAt(incrementValue$24), 97);
        incrementValue$25 = var2;
        var2++;
        var9Lifetime2 = lk.a(this.field_i.charAt(incrementValue$25), 97);
        incrementValue$26 = var2;
        var2++;
        var10Lifetime2 = lk.a(this.field_i.charAt(incrementValue$26), 97);
        var11 = (var6Lifetime1 >> 5) + (var5Lifetime2 << 1) + (var4Lifetime4 << 7);
        var12 = -((var8Lifetime1 >> 4) + (var7Lifetime1 << 2) + (var6Lifetime1 << 8 & 7936));
        var13 = (var9Lifetime2 << 3) + (var8Lifetime1 << 9 & 7680) + (var10Lifetime2 >> 3);
        this.field_p = new double[]{(double)var11, (double)var12, (double)var13, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
        incrementValue$27 = var2;
        var2++;
        this.field_f = lk.a(this.field_i.charAt(incrementValue$27), 97);
        incrementValue$28 = var2;
        var2++;
        this.field_b = lk.a(this.field_i.charAt(incrementValue$28), 97);
        return false;
    }

    private final double[] a(int param0, int param1, int param2, int param3, double[] param4, int param5, int param6, int param7) {
        double[] var9 = null;
        double[] var10 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double[] var22 = null;
        double[] var23 = null;
        double[] var24 = null;
        double[] var25 = null;
        double[] var26 = null;
        double[] var27 = null;
        double[] var28 = null;
        double[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9_ref = null;
        var21 = Torquing.field_u;
        try {
          var27 = new double[12];
          var24 = var27;
          var22 = var24;
          var28 = var22;
          var25 = var28;
          var9 = var25;
          var26 = new double[9];
          var23 = var26;
          var10 = var23;
          var10[0] = (double)(100 * (param6 - param2));
          var10[1] = (double)(-this.field_x[param2][param1] + this.field_x[param6][param7]);
          var10[3] = (double)((-param2 + param0) * 100);
          var10[2] = (double)((-param1 + param7) * 100);
          var10[4] = (double)(this.field_x[param0][param3] - this.field_x[param2][param1]);
          var10[5] = (double)(100 * (-param1 + param3));
          ap.a(var26, 0, var26, 3, var27, 9);
          ap.a(var27, 9);
          var10[0] = param4[0] - (double)(param2 * 100);
          var10[1] = param4[1] - (double)this.field_x[param2][param1];
          var10[2] = param4[2] - (double)(100 * param1);
          var11 = ap.a(var26, 0, var27, 9);
          var10[4] = -(var27[10] * var11) + param4[1];
          var10[3] = param4[0] - var11 * var27[9];
          var10[param5] = -(var11 * var27[11]) + param4[2];
          if (param6 == param2) {
            var17 = (double)(-param1 + param7);
            var13 = ((double)(-(param1 * 100)) + var26[5]) / (100.0 * var17);
            var19 = (double)(-param2 + param0);
            var15 = (var26[3] - (double)(100 * param2)) / (100.0 * var19);
          } else {
            var17 = (double)(param6 - param2);
            var13 = (var26[3] - (double)(100 * param2)) / (100.0 * var17);
            var19 = (double)(-param1 + param3);
            var15 = ((double)(-(100 * param1)) + var26[5]) / (100.0 * var19);
          }
          if (0.0 <= var13 &&
            var15 >= 0.0 &&
            1.0 >= var15 + var13) {
            var9[0] = var26[3];
            var9[2] = var26[5];
            var9[1] = var26[4];
            var9[7] = var28[10];
            var28[3] = var11;
            var9[6] = var28[9];
            var9[8] = var28[11];
          } else {
            ap.a(param4[0], param4[1], param4[2], (double)(param6 * 100), (double)this.field_x[param6][param7], (double)(100 * param7), (double)(param2 * 100), (double)this.field_x[param2][param1], (double)(100 * param1), (double)(100 * param0), (double)this.field_x[param0][param3], (double)(100 * param3), var27);
            var22[8] = -var27[2] + param4[2];
            var22[6] = -var27[0] + param4[0];
            var22[7] = param4[1] - var27[1];
            ap.a(var27, 6);
          }
          stackIn_11_0 = var9;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_14_0 = var9_ref;
          stackIn_14_1 = new StringBuilder().append("hc.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final kh c(int param0) {
        int var10_int = 0;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int dupTemp$2 = 0;
        int[] arrayValue$3 = null;
        int dupTemp$4 = 0;
        int[] arrayValue$5 = null;
        int dupTemp$6 = 0;
        int[] arrayValue$7 = null;
        int dupTemp$8 = 0;
        int[] arrayValue$9 = null;
        int dupTemp$10 = 0;
        int[] arrayValue$11 = null;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        kh var3;
        rm var4;
        kh var5;
        pj var6;
        int var7;
        int var8;
        int[] var10;
        int var11;
        int[] var12;
        int var12_int;
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
        int[] var28;
        rm var29;
        int[] var31;
        int[] var32;
        int[] var34;
        int[] var35;
        int[][] var37;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var21Lifetime1;
        int[] var12Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var13Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        var27 = Torquing.field_u;
        if (param0 != -20561) {
          return (kh) null;
        }
        if (null == this.field_t) {
          var29 = new rm(64, 64, 0);
          var3 = new kh(var29);
          var4 = var29;
          var29.field_r = null;
          var4.field_G = null;
          var29.b();
          var5 = this.a(param0 ^ 20531, true);
          var6 = var5.field_k;
          var7 = var6.field_k;
          var8 = var6.field_x;
          var37 = new int[var7][32];
          for (var10_int = 0; var7 > var10_int; var10_int++) {
            dk.a(var37[var10_int], 0, 32, -1);
          }
          var34 = new int[var7];
          var31 = var34;
          var10 = var31;
          for (var11 = 0; var8 > var11; var11++) {
            var12_int = var6.field_p[var11];
            var13 = var6.field_u[var11];
            var14 = var6.field_t[var11];
            dupTemp$0 = var10[var12_int];
            arrayValue$1 = var37[var12_int];
            var10[var12_int] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var13;
            dupTemp$2 = var10[var12_int];
            arrayValue$3 = var37[var12_int];
            var10[var12_int] = dupTemp$2 + 1;
            arrayValue$3[dupTemp$2] = var14;
            dupTemp$4 = var10[var13];
            arrayValue$5 = var37[var13];
            var10[var13] = dupTemp$4 + 1;
            arrayValue$5[dupTemp$4] = var12_int;
            dupTemp$6 = var10[var13];
            arrayValue$7 = var37[var13];
            var10[var13] = dupTemp$6 + 1;
            arrayValue$7[dupTemp$6] = var14;
            dupTemp$8 = var10[var14];
            arrayValue$9 = var37[var14];
            var10[var14] = dupTemp$8 + 1;
            arrayValue$9[dupTemp$8] = var12_int;
            dupTemp$10 = var10[var14];
            arrayValue$11 = var37[var14];
            var10[var14] = dupTemp$10 + 1;
            arrayValue$11[dupTemp$10] = var13;
            if (this.field_w < var6.field_y[var12_int]) {
              this.field_w = var6.field_y[var12_int];
            }
            if (this.field_w < var6.field_y[var13]) {
              this.field_w = var6.field_y[var13];
            }
            if (this.field_w < var6.field_y[var14]) {
              this.field_w = var6.field_y[var14];
            }
          }
          this.field_w = this.field_w + 20;
          for (var11Lifetime1 = 0; var7 > var11Lifetime1; var11Lifetime1++) {
            dk.a(var34, 0, var7);
            var35 = var37[var11Lifetime1];
            var32 = var35;
            var28 = var32;
            var12 = var28;
            for (var13Lifetime1 = 0; var13Lifetime1 < var35.length; var13Lifetime1++) {
              var14Lifetime1 = var35[var13Lifetime1];
              if (var14Lifetime1 != -1) {
                var10[var14Lifetime1] = var10[var14Lifetime1] + 1;
              }
            }
            var12Lifetime1 = var37[var11Lifetime1];
            for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1.length; var13Lifetime1Lifetime1++) {
              boolean decompiledFrameRemainder0 = true;
              var14Lifetime1Lifetime1 = var12Lifetime1[var13Lifetime1Lifetime1];
              if (var14Lifetime1Lifetime1 != -1 &&
                var34[var14Lifetime1Lifetime1] == 1) {
                var15 = var6.field_y[var11Lifetime1];
                var16 = var6.field_y[var14Lifetime1Lifetime1];
                var17 = var6.field_j[var11Lifetime1];
                var18 = var6.field_j[var14Lifetime1Lifetime1];
                var19 = var6.field_v[var11Lifetime1];
                var20 = var6.field_v[var14Lifetime1Lifetime1];
                if (var18 >= var17 && (var17 != var18 ||
                  var19 <= var20)) {
                  if (var17 == var18) {
                    decompiledFrameRemainder0 = (!(var17 >= 100) ||
                      !(this.field_h[var17 / 100 - 1][var19 / 100]));
                    if (decompiledFrameRemainder0) {
                      decompiledFrameRemainder0 = (!(var17 < 100 * this.field_r) ||
                        !(this.field_h[var17 / 100][var19 / 100]));
                    }
                  } else {
                    decompiledFrameRemainder0 = (!(100 <= var19) ||
                      !(this.field_h[var17 / 100][-1 + var19 / 100]));
                    if (decompiledFrameRemainder0) {
                      decompiledFrameRemainder0 = (!(var19 < 100 * this.field_v) ||
                        !(this.field_h[var17 / 100][var19 / 100]));
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (var18 != var17) {
                      decompiledFrameRemainder0 = (var19 != this.field_v * 100);
                      if (decompiledFrameRemainder0) {
                        decompiledFrameRemainder0 = (this.field_o[var17 / 100][var19 / 100] != -1);
                      }
                    } else {
                      if (var17 < 100 ||
                        this.field_o[var17 / 100 - 1][var19 / 100] == -1) {
                        var21 = var15;
                        var15 = var16;
                        var16 = var21;
                        var21Lifetime2 = var17;
                        var17 = var18;
                        var18 = var21Lifetime2;
                        var21Lifetime3 = var19;
                        var19 = var20;
                        var20 = var21Lifetime3;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var21Lifetime1 = this.field_w;
                      var22 = this.field_w;
                      cd.a(var29, -19729, 2);
                      var23 = var29.a(var17, var21Lifetime1, var19);
                      var24 = var29.a(var18, var22, var20);
                      while (var15 < var21Lifetime1 ||
                        var16 < var22) {
                        stackIn_79_0 = var21Lifetime1;
                        stackIn_79_1 = var15;
                        if (stackIn_79_0 > stackIn_79_1) {
                          var21Lifetime1 -= 100;
                          if (var15 > var21Lifetime1) {
                            var21Lifetime1 = var15;
                          }
                          cd.a(var29, -19729, 1);
                          var25 = var29.a(var17, var21Lifetime1, var19);
                        } else {
                          var25 = var23;
                        }
                        if (var16 < var22) {
                          var22 -= 100;
                          if (var22 < var16) {
                            var22 = var16;
                          }
                          cd.a(var29, -19729, 1);
                          var26 = var29.a(var18, var22, var20);
                        } else {
                          var26 = var24;
                        }
                        if (var23 != var25 &&
                          var24 != var26) {
                          pm.a(var3, -27226, 2);
                          var29.a(var25, var23, var24, (byte) 1, (byte) -1, (short) 17493, (short) -1);
                          var29.a(var24, var26, var25, (byte) 1, (byte) -1, (short) 17493, (short) -1);
                        } else {
                          if (var25 != var23) {
                            pm.a(var3, -27226, 1);
                            var29.a(var25, var23, var24, (byte) 1, (byte) -1, (short) 17493, (short) -1);
                          } else {
                            if (var24 == var26) {
                              var24 = var26;
                              var23 = var25;
                              continue;
                            }
                            pm.a(var3, -27226, 1);
                            var29.a(var23, var24, var26, (byte) 1, (byte) -1, (short) 17493, (short) -1);
                          }
                        }
                        var24 = var26;
                        var23 = var25;
                      }
                    }
                  }
                }
              }
            }
          }
          if (16384 < var29.field_g) {
            var29.field_g = 3840;
          }
          kh.a(var3, (byte) -126);
          this.field_t = new kh(var29);
          this.field_t.field_k = (pj) (var29.a(80, 1365, -1, -12, 12));
          this.field_t.field_q = var3.field_q;
        }
        return this.field_t;
    }

    final boolean b(int param0) {
        int var2 = this.field_t != null ? 1 : 0;
        int var3 = 96 % ((param0 - 0) / 61);
        this.c(-20561);
        return var2 != 0;
    }

    final void d(int param0) {
        sg.field_s = this.field_b;
        if (param0 != -18916) {
          this.field_m = (hc) null;
        }
    }

    final static la a(boolean param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          gl var8 = null;
          la stackIn_14_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param3 != 8505) {
              field_c = (fj) null;
            }
            var6 = null;
            if (hq.field_a.field_t != null) {
              jd.field_F = new o(hq.field_a.field_t, 5200, 0);
              hq.field_a.field_t = null;
              var6 = new pb(255, jd.field_F, new o(hq.field_a.field_n, 12000, 0), 2097152);
            }
            var7 = null;
            if (jd.field_F != null) {
              if (uj.field_b == null) {
                uj.field_b = new o[hq.field_a.field_w.length];
              }
              if (uj.field_b[param2] == null) {
                uj.field_b[param2] = new o(hq.field_a.field_w[param2], 12000, 0);
                hq.field_a.field_w[param2] = null;
              }
              var7 = new pb(param2, jd.field_F, uj.field_b[param2], 2097152);
            }
            var8 = no.field_n.a((pb) (var7), (byte) 101, param2, (pb) (var6), param0);
            if (param4) {
              var8.d(-118);
            }
            stackIn_14_0 = new la(var8, param1, param5);
            return stackIn_14_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 > -29) {
          hc.a(true, true, -54, 24, true, 101);
        }
        field_u = null;
        field_c = null;
        field_d = null;
    }

    final kh a(int param0, boolean param1) {
        int var9 = 0;
        kh var4;
        mp var5;
        int var6;
        int var7;
        int var8;
        int var15;
        rm var16;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var6Lifetime1;
        var15 = Torquing.field_u;
        if (param0 != -100) {
          this.field_w = -33;
        }
        if (this.field_y == null) {
          var16 = new rm((this.field_x[0].length + 1) * (this.field_x.length + 1), this.field_v * 2 * this.field_r, 0);
          var4 = new kh(var16);
          var16.b();
          var16.field_G = null;
          var16.field_r = null;
          var5 = new mp(2 * (this.field_r * this.field_v));
          var4.field_q = var5;
          for (var6 = this.field_v - 1; 0 <= var6; var6--) {
            var7 = -1;
            var8 = -1;
            for (var9 = 0; this.field_r > var9; var9++) {
              if (-1 == this.field_o[var9][var6]) {
                var7 = -1;
              } else {
                if (var7 == -1) {
                  cd.a(var16, param0 ^ 19827, 2);
                  var7 = var16.a(var9 * 100, this.field_x[var9][var6], var6 * 100);
                  var8 = var16.a(100 * var9, this.field_x[var9][var6 + 1], var6 * 100 + 100);
                }
                cd.a(var16, param0 - 19629, 2);
                var10 = var16.a(100 * var9 + 100, this.field_x[var9 + 1][var6], var6 * 100);
                var11 = var16.a((1 + var9) * 100, this.field_x[var9 + 1][1 + var6], 100 + var6 * 100);
                var12 = 3;
                var13 = (short)be.field_c.b((int) this.field_o[var9][var6]);
                var14 = (short)mo.field_C[this.field_o[var9][var6]];
                if (param1 &&
                  this.field_x[var9][1 + var6] - this.field_x[var9 + 1][1 + var6] == this.field_x[var9][var6] - this.field_x[1 + var9][var6] &&
                  -this.field_x[1 + var9][var6 + 1] + this.field_x[var9 + 1][var6] == -this.field_x[var9][var6 + 1] + this.field_x[var9][var6]) {
                  pc.a(var7, 5265, var10, var11, var8, var4, (short) var14, (short) var13, var12);
                } else {
                  if (0 != (var6 + var9) % 2) {
                    oj.a(var12, (short) var13, 2, param1, true, var8, var7, (short) var14, var10, var4);
                    oj.a(var12, (short) var13, 1, param1, true, var10, var11, (short) var14, var8, var4);
                  } else {
                    oj.a(var12, (short) var13, 0, param1, true, var11, var8, (short) var14, var7, var4);
                    oj.a(var12, (short) var13, 3, param1, true, var7, var10, (short) var14, var11, var4);
                  }
                }
                var8 = var11;
                var7 = var10;
              }
            }
          }
          kh.a(var4, (byte) -102);
          this.field_y = var4;
          this.field_y.field_k = (pj) (var16.a(80, 1365, -1, -12, 12));
          this.field_y.field_k.field_i = new int[var16.field_k];
          this.field_y.field_k.field_g = new int[var16.field_k];
          this.field_y.field_k.field_m = var16.field_k;
          this.field_y.field_k.field_h = new int[var16.field_k];
          for (var6Lifetime1 = 0; var16.field_k > var6Lifetime1; var6Lifetime1++) {
            this.field_y.field_k.field_h[var6Lifetime1] = ie.a(65535, (int) var16.field_u[var6Lifetime1]);
            this.field_y.field_k.field_g[var6Lifetime1] = ie.a((int) var16.field_n[var6Lifetime1], 65535);
            this.field_y.field_k.field_i[var6Lifetime1] = ie.a((int) var16.field_x[var6Lifetime1], 65535);
          }
          this.field_y.field_k.field_F = null;
          this.field_y.field_l.field_D = null;
        }
        return this.field_y;
    }

    hc(int param0, String param1) {
        this.field_w = -2147483648;
        this.field_n = 0;
        try {
          this.field_i = param1;
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "hc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
