/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk extends bh {
    int field_v;
    static java.math.BigInteger field_p;
    int field_o;
    int field_n;
    int field_r;
    int field_t;
    int field_w;
    int field_A;
    int field_u;
    pi[] field_q;
    static long[] field_x;
    static int[] field_z;
    static long[][] field_s;
    static String field_y;

    final void b(int param0, int param1) {
        pi stackIn_41_0 = null;
        pi stackIn_41_1 = null;
        pi stackIn_98_0 = null;
        pi stackIn_98_1 = null;
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
        pi var15_ref_pi;
        int var16;
        int var17;
        int var18;
        int var19;
        pi var19_ref_pi;
        pi var20;
        int var21;
        uk var22;
        pi var23;
        pi var24;
        pi var25;
        pi var26;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        pi var15_ref_piLifetime1;
        pi var19_ref_piLifetime1;
        pi var20Lifetime1;
        int var13Lifetime2;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var13Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        int var14Lifetime1Lifetime3;
        var21 = client.field_A ? 1 : 0;
        if (param1 >= this.field_n) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var22 = new uk();
        var22.field_v = this.field_v;
        var22.field_u = this.field_u;
        var22.field_A = this.field_A;
        var22.field_w = this.field_w;
        var22.field_r = this.field_r;
        var22.field_t = this.field_t;
        var22.field_q = new pi[this.field_t * this.field_A];
        if (this.field_A > this.field_t) {
          var4 = ka.a((byte) 53, this.field_w * this.field_t, tf.field_cb) + this.field_w * (this.field_A - this.field_t) / 2;
          var5 = -1 + (this.field_A * this.field_w - var4);
          var6 = ka.a((byte) 117, 1 + 2 * this.field_t * this.field_w, tf.field_cb) - this.field_t * this.field_w;
          var22.field_n = (this.field_A * this.field_w / 2 - var6 / 6) * this.field_n / (this.field_w * this.field_A);
          this.field_n = this.field_n - var22.field_n;
          var7 = this.field_t * this.field_v;
          var8 = var7 * var7;
          var9 = 0;
          var10 = 0;
          while (this.field_t > var10) {
            var11 = this.field_A;
            var12 = 0;
            for (var13 = 0; this.field_v > var13; var13++) {
              var14 = var4 + (var9 * (var5 - var4) / var7 + (var7 - var9) * (var9 * var6) / var8);
              ub.field_d[var13] = var14;
              var9++;
              if (var11 > (var14 / this.field_w)) {
                var11 = var14 / this.field_w;
              }
              if ((this.field_w + var14 - 1) / this.field_w > var12) {
                var12 = (var14 - (-this.field_w + 1)) / this.field_w;
              }
            }
            if (var11 < 0) {
              var11 = 0;
            }
            if (var12 > this.field_A) {
              var12 = this.field_A;
            }
            var13Lifetime2 = var10 * this.field_A;
            for (var14Lifetime2 = 0; var11 > var14Lifetime2; var14Lifetime2++) {
              var22.field_q[var13Lifetime2 + var14Lifetime2] = me.field_J;
            }
            for (var14Lifetime3 = var11; var12 > var14Lifetime3; var14Lifetime3++) {
              var15_ref_pi = this.field_q[var13Lifetime2 + var14Lifetime3];
              if (var15_ref_pi != null &&
                me.field_J != var15_ref_pi) {
                var15_ref_pi = var15_ref_pi.b();
              }
              var22.field_q[var14Lifetime3 + var13Lifetime2] = var15_ref_pi;
            }
            for (var14Lifetime4 = var12; this.field_A > var14Lifetime4; var14Lifetime4++) {
              var22.field_q[var13Lifetime2 + var14Lifetime4] = this.field_q[var14Lifetime4 + var13Lifetime2];
              this.field_q[var14Lifetime4 + var13Lifetime2] = me.field_J;
            }
            var14Lifetime5 = 0;
            while (true) {
              if (this.field_v <= var14Lifetime5) {
                var10++;
                break;
              }
              var15 = ub.field_d[var14Lifetime5];
              var16 = this.field_w * var11;
              var17 = var11;
              var18 = 0;
              L30: while (true) {
                if (var16 < var15) {
                  var19_ref_pi = var22.field_q[var10 * this.field_A + var17];
                  while (var18 < this.field_w) {
                    if (var16 >= var15) {
                      break L30;
                    }
                    stackIn_41_0 = var19_ref_pi;
                    stackIn_41_1 = me.field_J;
                    if (stackIn_41_0 != stackIn_41_1) {
                      if (var19_ref_pi == null) {
                        var23 = new pi(this.field_w, this.field_v, 0);
                        var19_ref_pi = var23;
                        an.a(var23.field_k, 0, this.field_w * this.field_v, (byte) 1);
                        var22.field_q[var17 + this.field_A * var10] = var23;
                      }
                      var19_ref_pi.field_k[var18 + var14Lifetime5 * this.field_w] = (byte) 0;
                    }
                    var16++;
                    var18++;
                  }
                  var17++;
                  var18 = 0;
                  continue;
                }
                break;
              }
              while (var17 < var12) {
                var19_ref_piLifetime1 = this.field_q[var17 + this.field_A * var10];
                while (this.field_w > var18) {
                  if (me.field_J != var19_ref_piLifetime1) {
                    if (var19_ref_piLifetime1 == null) {
                      var24 = new pi(this.field_w, this.field_v, 0);
                      var19_ref_piLifetime1 = var24;
                      an.a(var24.field_k, 0, this.field_w * this.field_v, (byte) 1);
                      this.field_q[this.field_A * var10 + var17] = var24;
                    }
                    var19_ref_piLifetime1.field_k[var14Lifetime5 * this.field_w + var18] = (byte) 0;
                  }
                  var18++;
                  var16++;
                }
                var17++;
                var18 = 0;
              }
              var14Lifetime5++;
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          var4Lifetime1 = ka.a((byte) 51, this.field_A * this.field_v, tf.field_cb) + this.field_v * (this.field_t - this.field_A) / 2;
          var5Lifetime1 = this.field_v * this.field_t - 1 - var4Lifetime1;
          var6Lifetime1 = ka.a((byte) 56, this.field_A * (this.field_v * 2) + 1, tf.field_cb) - this.field_v * this.field_A;
          var22.field_n = (-(var6Lifetime1 / 6) + this.field_t * this.field_v / 2) * this.field_n / (this.field_t * this.field_v);
          this.field_n = this.field_n - var22.field_n;
          var7Lifetime1 = this.field_A * this.field_w;
          var8Lifetime1 = var7Lifetime1 * var7Lifetime1;
          var9Lifetime1 = 0;
          var10Lifetime1 = 0;
          while (this.field_A > var10Lifetime1) {
            var11Lifetime1 = this.field_t;
            var12Lifetime1 = 0;
            for (var13Lifetime1 = 0; this.field_w > var13Lifetime1; var13Lifetime1++) {
              var14Lifetime1 = var4Lifetime1 - (-(var9Lifetime1 * (-var4Lifetime1 + var5Lifetime1) / var7Lifetime1) - var9Lifetime1 * var6Lifetime1 * (var7Lifetime1 - var9Lifetime1) / var8Lifetime1);
              ub.field_d[var13Lifetime1] = var14Lifetime1;
              if (var11Lifetime1 > var14Lifetime1 / this.field_v) {
                var11Lifetime1 = var14Lifetime1 / this.field_v;
              }
              var9Lifetime1++;
              if ((this.field_v + var14Lifetime1 - 1) / this.field_v > var12Lifetime1) {
                var12Lifetime1 = (-1 + this.field_v + var14Lifetime1) / this.field_v;
              }
            }
            if (var12Lifetime1 > this.field_t) {
              var12Lifetime1 = this.field_t;
            }
            if (var11Lifetime1 < 0) {
              var11Lifetime1 = 0;
            }
            var13Lifetime1Lifetime1 = var10Lifetime1;
            var14Lifetime1Lifetime1 = this.field_A * var11Lifetime1;
            while (var13Lifetime1Lifetime1 < var14Lifetime1Lifetime1) {
              var22.field_q[var13Lifetime1Lifetime1] = me.field_J;
              var13Lifetime1Lifetime1 = var13Lifetime1Lifetime1 + this.field_A;
            }
            var14Lifetime1Lifetime2 = this.field_A * var12Lifetime1;
            while (var13Lifetime1Lifetime1 < var14Lifetime1Lifetime2) {
              var15_ref_piLifetime1 = this.field_q[var13Lifetime1Lifetime1];
              if (var15_ref_piLifetime1 != null &&
                me.field_J != var15_ref_piLifetime1) {
                var15_ref_piLifetime1 = var15_ref_piLifetime1.b();
              }
              var22.field_q[var13Lifetime1Lifetime1] = var15_ref_piLifetime1;
              var13Lifetime1Lifetime1 = var13Lifetime1Lifetime1 + this.field_A;
            }
            var14Lifetime1Lifetime3 = this.field_A * this.field_t;
            while (var14Lifetime1Lifetime3 > var13Lifetime1Lifetime1) {
              var22.field_q[var13Lifetime1Lifetime1] = this.field_q[var13Lifetime1Lifetime1];
              this.field_q[var13Lifetime1Lifetime1] = me.field_J;
              var13Lifetime1Lifetime1 = var13Lifetime1Lifetime1 + this.field_A;
            }
            var15Lifetime1 = 0;
            while (true) {
              if (var15Lifetime1 >= this.field_w) {
                var10Lifetime1++;
                break;
              }
              var16Lifetime1 = ub.field_d[var15Lifetime1];
              var17Lifetime1 = var11Lifetime1 * this.field_v;
              var18Lifetime1 = var11Lifetime1;
              var19 = 0;
              L10: while (true) {
                if (var17Lifetime1 < var16Lifetime1) {
                  var20 = var22.field_q[this.field_A * var18Lifetime1 + var10Lifetime1];
                  while (this.field_v > var19) {
                    if (var16Lifetime1 <= var17Lifetime1) {
                      break L10;
                    }
                    stackIn_98_0 = me.field_J;
                    stackIn_98_1 = var20;
                    if (stackIn_98_0 != stackIn_98_1) {
                      if (var20 == null) {
                        var25 = new pi(this.field_w, this.field_v, 0);
                        var20 = var25;
                        an.a(var25.field_k, 0, this.field_w * this.field_v, (byte) 1);
                        var22.field_q[this.field_A * var18Lifetime1 + var10Lifetime1] = var25;
                      }
                      var20.field_k[var19 * this.field_w + var15Lifetime1] = (byte) 0;
                    }
                    var19++;
                    var17Lifetime1++;
                  }
                  var18Lifetime1++;
                  var19 = 0;
                  continue;
                }
                break;
              }
              while (var12Lifetime1 > var18Lifetime1) {
                var20Lifetime1 = this.field_q[var10Lifetime1 + this.field_A * var18Lifetime1];
                while (this.field_v > var19) {
                  if (var20Lifetime1 != me.field_J) {
                    if (var20Lifetime1 == null) {
                      var26 = new pi(this.field_w, this.field_v, 0);
                      var20Lifetime1 = var26;
                      an.a(var26.field_k, 0, this.field_w * this.field_v, (byte) 1);
                      this.field_q[var10Lifetime1 + var18Lifetime1 * this.field_A] = var26;
                    }
                    var20Lifetime1.field_k[var15Lifetime1 + this.field_w * var19] = (byte) 0;
                  }
                  var17Lifetime1++;
                  var19++;
                }
                var18Lifetime1++;
                var19 = 0;
              }
              var15Lifetime1++;
            }
          }
        }
        this.d((byte) 116);
        var22.d((byte) -110);
        var22.field_b = this.field_b;
        var22.field_a = (bh) (this);
        var22.field_a.field_b = (bh) ((Object) var22);
        var22.field_b.field_a = (bh) ((Object) var22);
        this.b(11976, param1);
        var22.b(param0, param1);
    }

    final static boolean c(byte param0) {
        if (param0 != -17) {
          uk.c((byte) 22);
        }
        return pa.field_V == ka.field_P ? true : false;
    }

    public static void c(int param0) {
        field_x = null;
        field_z = null;
        field_s = (long[][]) null;
        field_y = null;
        if (param0 <= 122) {
          return;
        }
        field_p = null;
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -22802) {
          field_y = (String) null;
        }
        stackIn_6_0 = (u.field_i != null) && (u.field_i.g((byte) -104) != null);
        return stackIn_6_0;
    }

    private final void d(byte param0) {
        int var10 = 0;
        int var11 = 0;
        pi stackIn_25_0 = null;
        pi stackIn_25_1 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        pi[] var9;
        int var12;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var12 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = this.field_A;
        var4 = 0;
        var5 = this.field_t;
        L0: while (var4 < var5) {
          var5--;
          var6 = var2;
          while (true) {
            if (var6 >= var3) {
              continue L0;
            }
            if (this.field_q[var5 * this.field_A + var6] == me.field_J) {
              var6++;
              continue;
            }
            break;
          }
          var5++;
          break;
        }
        var6Lifetime1 = 32 / ((-48 - param0) / 43);
        L4: while (true) {
          if (var5 > var4) {
            for (var7 = var2; var7 < var3; var7++) {
              if (me.field_J != this.field_q[var4 * this.field_A + var7]) {
                break L4;
              }
            }
            var4++;
            continue;
          }
          break;
        }
        L6: while (var3 > var2) {
          var3--;
          var7Lifetime1 = var4;
          while (true) {
            if (var7Lifetime1 >= var5) {
              continue L6;
            }
            if (this.field_q[var3 + this.field_A * var7Lifetime1] == me.field_J) {
              var7Lifetime1++;
              continue;
            }
            break;
          }
          var3++;
          break;
        }
        L10: while (true) {
          if (var2 < var3) {
            for (var7Lifetime2 = var4; var7Lifetime2 < var5; var7Lifetime2++) {
              stackIn_25_0 = me.field_J;
              stackIn_25_1 = this.field_q[var2 + this.field_A * var7Lifetime2];
              if (stackIn_25_0 != stackIn_25_1) {
                break L10;
              }
            }
            var2++;
            continue;
          }
          break;
        }
        if (0 >= var2 &&
          this.field_A <= var3 &&
          0 >= var4 &&
          this.field_t <= var5) {
          return;
        }
        var7Lifetime3 = var3 - var2;
        var8 = -var4 + var5;
        var9 = new pi[var7Lifetime3 * var8];
        for (var10 = 0; var8 > var10; var10++) {
          for (var11 = 0; var7Lifetime3 > var11; var11++) {
            var9[var11 + var10 * var7Lifetime3] = this.field_q[(var10 + var4) * this.field_A - (-var2 - var11)];
          }
        }
        this.field_u = this.field_u + var4;
        this.field_A = var7Lifetime3;
        this.field_t = var8;
        this.field_r = this.field_r + var2;
        this.field_q = var9;
        return;
    }

    uk() {
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_z = new int[8192];
        field_x = new long[11];
        field_s = new long[8][256];
        int var0 = 0;
        while (256 > var0) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 == (1 & var0) ? (long)(var1 >>> 8) : (long)(var1 & 255);
            var4 = var2 << 1;
            if (!(var4 < 256L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_s[0][var0] = jj.a(jj.a(jj.a(var8 << 16, jj.a(var10 << 24, jj.a(jj.a(var6 << 40, jj.a(var2 << 48, var2 << 56)), var2 << 32))), var4 << 8), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_s[var14][var0] = jj.a(field_s[var14 - 1][var0] >>> 8, field_s[var14 - 1][var0] << 56);
            }
            var0++;
        }
        field_x[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = (-1 + var0) * 8;
            field_x[var0] = pj.a(jg.a(255L, field_s[7][7 + var1]), pj.a(pj.a(pj.a(pj.a(pj.a(pj.a(jg.a(field_s[1][var1 + 1], 71776119061217280L), jg.a(field_s[0][var1], -72057594037927936L)), jg.a(field_s[2][2 + var1], 280375465082880L)), jg.a(1095216660480L, field_s[3][var1 + 3])), jg.a(4278190080L, field_s[4][var1 + 4])), jg.a(16711680L, field_s[5][var1 + 5])), jg.a(65280L, field_s[6][var1 + 6])));
        }
        field_y = "Passwords can only contain letters and numbers";
    }
}
