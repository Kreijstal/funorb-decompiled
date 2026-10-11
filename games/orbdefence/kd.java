/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    int field_t;
    boolean[] field_m;
    int field_k;
    int[] field_s;
    static String field_b;
    int[] field_a;
    static double field_h;
    int[] field_g;
    int[] field_j;
    int field_n;
    static boolean field_d;
    int[] field_l;
    private cg field_p;
    int field_c;
    int[] field_o;
    static ki field_q;
    private int[] field_u;
    static String field_f;
    cg field_r;
    boolean[] field_e;
    int field_i;
    int[] field_v;

    final static hj[] a(int param0, int param1, int param2, int param3, int param4) {
        hj[] var6 = new hj[9];
        hj[] var5 = var6;
        hj dupTemp$0 = af.a(param0, (byte) -50, param4);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        hj dupTemp$1 = af.a(param0, (byte) -95, param3);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param1 != 0) {
          var6[4] = af.a(64, (byte) -54, param1);
        }
        if (param2 < 20) {
          kd.b((byte) 65);
        }
        return var5;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
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
        double var15;
        int var15_int;
        long var17;
        int var19;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        double var15Lifetime1;
        int var9Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1;
        int var13Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1Lifetime1;
        var19 = OrbDefence.field_D ? 1 : 0;
        var5 = (param2 - 320) / ol.field_e;
        var6 = (param0 - 240) / ol.field_e;
        var7 = 1 + (var5 + 640 / ol.field_e);
        var8 = var6 + 480 / ol.field_e + 1;
        if (var5 < 0) {
          var5 = 0;
        }
        if (-1 + this.field_c < var7) {
          var7 = -1 + this.field_c;
        }
        if (var8 > this.field_t - 1) {
          var8 = -1 + this.field_t;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        var10 = var5 + var6 * this.field_c;
        for (var11 = var6; var8 >= var11; var11++) {
          var9 = var10;
          var10 = var10 + this.field_c;
          for (var12 = var5; var12 <= var7; var12++) {
            boolean decompiledFrameRemainder0 = true;
            var13 = -param2 + (var12 * ol.field_e + 320 - ol.field_a);
            var14 = ol.field_e * var11 + 240 - ol.field_a - param0;
            if (null == mf.field_b) {
              var15_int = 0;
              if (this.field_o[var9] == 0) {
                var15_int = 12426084;
              }
              if (this.field_o[var9] == 1) {
                var15_int = 11184810;
              }
              if (this.field_o[var9] == 2) {
                var15_int = 4473924;
              }
              if (this.field_o[var9] == 3) {
                var15_int = 4500138;
              }
              if (this.field_o[var9] == 5) {
                var15_int = 16777215;
              }
              if (this.field_o[var9] == 6) {
                var15_int = 16776960;
              }
              ul.h(var13, var14, ol.field_e, ol.field_e, var15_int);
            } else {
              if (!param3 &&
                0 < this.field_a[var9]) {
                var15_int = this.field_a[var9];
                if (var15_int > 0) {
                  if (var15_int < 25) {
                    var15_int = var15_int >> 1;
                  } else {
                    var15_int = -var15_int + 50 >> 1;
                  }
                  ul.d(var13 - ol.field_e, -ol.field_e + var14, ol.field_d, ol.field_d, 16711935, var15_int << 1);
                }
              }
              if (0 != this.field_o[var9] ||
                param3) {
                if (this.field_o[var9] != 4 &&
                  this.field_o[var9] != 3 &&
                  !param3) {
                  if (192 < this.field_g[var9]) {
                    mf.field_b[27].b(var13, var14, ol.field_e, ol.field_e);
                  } else {
                    if (this.field_j[var9] < mf.field_b.length) {
                      mf.field_b[this.field_j[var9]].b(var13, var14, ol.field_e, ol.field_e);
                    }
                    if (!(this.field_g[var9] <= 0)) {
                      mf.field_b[27].d(var13, var14, ol.field_e, ol.field_e, 64 + this.field_g[var9]);
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (this.field_o[var9] == 3 &&
                    !param3) {
                    if (!(bc.field_q.length <= this.field_j[var9])) {
                      bc.field_q[this.field_j[var9]].b(var13, var14, ol.field_e, ol.field_e);
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (this.field_o[var9] == 4 &&
                      param3 &&
                      this.field_j[var9] < bc.field_q.length) {
                      bc.field_q[this.field_j[var9]].b(var13, var14, ol.field_e, ol.field_e);
                    }
                  }
                }
              }
            }
            var9++;
          }
        }
        var12Lifetime1 = 61 % ((25 - param1) / 37);
        if (param3) {
          for (var9Lifetime1 = 0; var9Lifetime1 < this.field_s.length; var9Lifetime1++) {
            var13Lifetime1 = this.field_s[var9Lifetime1] % this.field_c;
            var14Lifetime1 = this.field_s[var9Lifetime1] / this.field_c;
            var12Lifetime2 = ol.field_e * var14Lifetime1 + (240 - param0);
            var11Lifetime1 = 320 + (ol.field_e * var13Lifetime1 - param2);
            var15 = -Math.abs(Math.sin(0.1 * (double)da.field_b + (double)var9Lifetime1));
            ul.i(var11Lifetime1, (int)(var15 * 5.0 + (double)var12Lifetime2), 16, 16742399, 64);
            ul.i(var11Lifetime1, (int)((double)var12Lifetime2 + var15 * 4.0), 15, 16751103, 96);
            ul.i(var11Lifetime1, (int)(var15 * 3.0 + (double)var12Lifetime2), 14, 16759807, 128);
            ul.i(var11Lifetime1, (int)(var15 * 2.0 + (double)var12Lifetime2), 13, 16768511, 192);
            ul.f(var11Lifetime1, var12Lifetime2, 12, 16777215);
            ul.f(var11Lifetime1, (int)((double)var12Lifetime2 + var15 * 2.0), 6, 16768511);
            ul.f(var11Lifetime1, (int)((double)var12Lifetime2 + var15 * 3.0), 5, 16759807);
            ul.f(var11Lifetime1, (int)(var15 * 4.0 + (double)var12Lifetime2), 4, 16751103);
            ul.f(var11Lifetime1, (int)(5.0 * var15 + (double)var12Lifetime2), 3, 16742399);
          }
          var10Lifetime1 = var5 + var6 * this.field_c;
          for (var14Lifetime1Lifetime1 = var6; var14Lifetime1Lifetime1 <= var8; var14Lifetime1Lifetime1++) {
            var9Lifetime1Lifetime1 = var10Lifetime1;
            var10Lifetime1 = var10Lifetime1 + this.field_c;
            for (var13Lifetime1Lifetime1 = var5; var7 >= var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
              if (this.field_j[var9Lifetime1Lifetime1] == 85) {
                var12Lifetime2Lifetime1 = -(ol.field_e / 2) + 240 + (var14Lifetime1Lifetime1 * ol.field_e + (-param0 - 12));
                var11Lifetime1Lifetime1 = -(ol.field_e / 2) + 320 + (var13Lifetime1Lifetime1 * ol.field_e - param2) + 4;
                var15Lifetime1 = -Math.abs(Math.sin(0.1 * (double)da.field_b + (double)var9Lifetime1Lifetime1));
                ul.i(var11Lifetime1Lifetime1, (int)((double)var12Lifetime2Lifetime1 + var15Lifetime1 * 5.0), 16, 7799039, 64);
                ul.i(var11Lifetime1Lifetime1, (int)(var15Lifetime1 * 4.0 + (double)var12Lifetime2Lifetime1), 15, 10027263, 96);
                ul.i(var11Lifetime1Lifetime1, (int)((double)var12Lifetime2Lifetime1 + var15Lifetime1 * 3.0), 14, 12255487, 128);
                ul.i(var11Lifetime1Lifetime1, (int)((double)var12Lifetime2Lifetime1 + 2.0 * var15Lifetime1), 13, 14483711, 192);
                ul.f(var11Lifetime1Lifetime1, var12Lifetime2Lifetime1, 12, 16711935);
                ul.f(var11Lifetime1Lifetime1, (int)(2.0 * var15Lifetime1 + (double)var12Lifetime2Lifetime1), 6, 14483711);
                ul.f(var11Lifetime1Lifetime1, (int)((double)var12Lifetime2Lifetime1 + var15Lifetime1 * 3.0), 5, 12255487);
                ul.f(var11Lifetime1Lifetime1, (int)((double)var12Lifetime2Lifetime1 + 4.0 * var15Lifetime1), 4, 10027263);
                ul.f(var11Lifetime1Lifetime1, (int)(5.0 * var15Lifetime1 + (double)var12Lifetime2Lifetime1), 3, 7799039);
                var12Lifetime2Lifetime1Lifetime1 = -param0 + (-(ol.field_e >> 1) + 240 + var14Lifetime1Lifetime1 * ol.field_e);
                var11Lifetime1Lifetime1Lifetime1 = 320 + (ol.field_e * var13Lifetime1Lifetime1 - (ol.field_e >> 1)) - param2;
                var17 = (long)(100 * da.field_b);
                hg.field_ab.c(var11Lifetime1Lifetime1Lifetime1 - (hg.field_ab.field_s / 2 - 4), var12Lifetime2Lifetime1Lifetime1 - 64 - (int)(8.0 + 8.0 * Math.sin((double)var14Lifetime1Lifetime1 + ((double)var13Lifetime1Lifetime1 + (double)var17 * 0.001))));
              }
              var9Lifetime1Lifetime1++;
            }
          }
        }
    }

    final void a(byte param0) {
        int var2;
        int var3_int;
        j var3;
        int var4;
        int var5;
        int var6;
        int var3_intLifetime1;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 100) {
          return;
        }
        if (this.field_r.b(param0 ^ 100)) {
          this.field_k = 0;
          for (var3_int = 0; this.field_i > var3_int; var3_int++) {
            this.field_l[var3_int] = this.field_u[var3_int];
            this.field_u[var3_int] = 2147483647;
            if (this.field_v[var3_int] > 0) {
              this.field_v[var3_int] = this.field_v[var3_int] - 1;
            }
            if (this.field_g[var3_int] > 0) {
              this.field_g[var3_int] = this.field_g[var3_int] - 1;
            }
            if (this.field_o[var3_int] == 6) {
              this.field_r.a(new j(var3_int, 0, this.field_u), (byte) -83);
              this.field_k = this.field_k + 1;
            }
          }
        }
        var2 = 0;
        var6 = 0;
        var3_intLifetime1 = var6;
        while (var6 < this.field_i) {
          if (this.field_a[var6] > 0) {
            this.field_a[var6] = this.field_a[var6] - 1;
          }
          var6++;
        }
        while (!this.field_r.b(param0 ^ 100)) {
          var2++;
          if (750 >= var2) {
            var3 = this.field_r.a(-2);
            var4 = var3.field_a;
            if (this.field_o[var4] == 3) {
              continue;
            }
            if (4 == this.field_o[var4]) {
              continue;
            }
            if (var4 > this.field_c &&
              this.field_u[var4 - this.field_c] > var3.field_d + this.a(var4 - this.field_c, (byte) 69)) {
              this.field_p.a(new j(var4 - this.field_c, var3.field_d + this.a(-this.field_c + var4, (byte) 86), this.field_u), (byte) -83);
            }
            if (var4 < -this.field_c + (this.field_i - 1) &&
              this.field_u[this.field_c + var4] > var3.field_d + this.a(var4 + this.field_c, (byte) 57)) {
              this.field_p.a(new j(var4 + this.field_c, var3.field_d + this.a(var4 + this.field_c, (byte) 66), this.field_u), (byte) -83);
            }
            if (1 < var4 &&
              this.field_u[var4 - 1] > var3.field_d + this.a(-1 + var4, (byte) 48)) {
              this.field_p.a(new j(var4 - 1, var3.field_d + this.a(-1 + var4, (byte) 48), this.field_u), (byte) -83);
            }
            if (-2 + this.field_i <= var4) {
              continue;
            }
            if (this.field_u[1 + var4] <= var3.field_d + this.a(var4 + 1, (byte) 72)) {
              continue;
            }
            this.field_p.a(new j(var4 + 1, var3.field_d + this.a(var4 + 1, (byte) 72), this.field_u), (byte) -83);
            continue;
          }
          break;
        }
        if (var2 < 750) {
        }
        if (this.field_r.b(param0 - 100)) {
          this.field_r = this.field_p;
          this.field_p = new cg(this.field_r.field_a);
        }
        return;
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var4;
        if (!param1) {
          return true;
        }
        var4 = param0 + param2 * this.field_c;
        if (var4 >= 0 &&
          this.field_i > var4) {
          if (this.field_o[var4] != 4) {
            return false;
          }
          return true;
        }
        return true;
    }

    final void a(byte param0, int param1) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var4 = 27 % ((param0 + 24) / 63);
        int[] var7 = this.field_s;
        int[] var3 = var7;
        this.field_s = new int[var7.length + 1];
        for (var5 = 0; var7.length > var5; var5++) {
          this.field_s[var5] = var7[var5];
        }
        this.field_s[var3.length] = param1;
    }

    private final int a(int param0, byte param1) {
        if (param1 <= 38) {
          kd.a(false);
        }
        return m.field_d[this.field_o[param0]] + (!this.field_e[param0] ? 0 : 25000) + (this.field_v[param0] + this.field_g[param0]) * this.field_n;
    }

    public static void b(byte param0) {
        int var1 = 87 / ((49 - param0) / 39);
        field_q = null;
        field_f = null;
        field_b = null;
    }

    final static jc a(boolean param0) {
        if (param0) {
          return (jc) null;
        }
        if (null == ve.field_O) {
          ve.field_O = new jc(pc.field_bb, 20, 0, 0, 0, 11579568, -1, 0, 0, pc.field_bb.field_H, -1, 2147483647, true);
        }
        return ve.field_O;
    }

    kd(hj param0) {
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        this.field_n = 0;
        try {
          this.field_t = param0.field_k;
          this.field_c = param0.field_o;
          this.field_i = this.field_t * this.field_c;
          this.field_a = new int[this.field_i];
          this.field_g = new int[this.field_i];
          this.field_u = new int[this.field_i];
          this.field_o = new int[this.field_i];
          this.field_e = new boolean[this.field_i];
          this.field_j = new int[this.field_i];
          this.field_m = new boolean[this.field_i];
          this.field_v = new int[this.field_i];
          this.field_l = new int[this.field_i];
          this.field_r = new cg(16);
          this.field_p = new cg(16);
          this.field_s = new int[]{};
          var2_int = this.field_o.length;
          for (var3 = 0; var3 < var2_int; var3++) {
            if (16711680 == param0.field_v[var3]) {
              this.field_o[var3] = 0;
            }
            if (param0.field_v[var3] == 65535) {
              this.field_o[var3] = 1;
            }
            if (param0.field_v[var3] == 255) {
              this.field_o[var3] = 2;
            }
            if (param0.field_v[var3] == 65280) {
              this.field_o[var3] = 3;
            }
            if (param0.field_v[var3] == 1) {
              this.field_o[var3] = 4;
            }
            if (param0.field_v[var3] == 16777215) {
              this.field_o[var3] = 10;
              this.a((byte) 90, var3);
            }
            if (param0.field_v[var3] == 16776960) {
              this.field_o[var3] = 6;
              this.field_k = this.field_k + 1;
            }
            this.field_j[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < var2_int; var3Lifetime1++) {
            if (0 == this.field_o[var3Lifetime1] ||
              this.field_o[var3Lifetime1] == 8) {
              this.field_j[var3Lifetime1] = (11 + (int)(3.0 * Math.random())) * 8 + (int)(Math.random() * 2.0);
            }
            if (this.field_o[var3Lifetime1] == 1 ||
              10 == this.field_o[var3Lifetime1]) {
              this.field_j[var3Lifetime1] = 27;
            }
            if (this.field_o[var3Lifetime1] == 2) {
              this.field_j[var3Lifetime1] = 35;
            }
            if (this.field_o[var3Lifetime1] == 3) {
              this.field_j[var3Lifetime1] = 0;
              if (-this.field_c + var3Lifetime1 >= 0 &&
                this.field_o[var3Lifetime1 - this.field_c] != 3) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 1;
              }
              if (1 + var3Lifetime1 < this.field_i &&
                this.field_o[var3Lifetime1 + 1] != 3) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 2;
              }
              if (0 <= var3Lifetime1 - 1 &&
                this.field_o[-1 + var3Lifetime1] != 3) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 16;
              }
              if (this.field_i > this.field_c + var3Lifetime1 &&
                this.field_o[this.field_c + var3Lifetime1] != 3) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 32;
              }
              if (var3Lifetime1 - this.field_c - 1 >= 0 &&
                (17 & this.field_j[var3Lifetime1]) == 0 &&
                this.field_o[-1 + var3Lifetime1 - this.field_c] != 3) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 4;
              }
              if (1 - this.field_c + var3Lifetime1 >= 0 &&
                (3 & this.field_j[var3Lifetime1]) == 0 &&
                this.field_o[-this.field_c + (var3Lifetime1 + 1)] != 3) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 8;
              }
              if (this.field_i > var3Lifetime1 - (-this.field_c - 1) &&
                0 == (34 & this.field_j[var3Lifetime1]) &&
                3 != this.field_o[var3Lifetime1 + this.field_c + 1]) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 64;
              }
              if (this.field_c + var3Lifetime1 - 1 < this.field_i &&
                0 == (this.field_j[var3Lifetime1] & 48) &&
                this.field_o[-1 + var3Lifetime1 + this.field_c] != 3) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 128;
              }
            }
            if (this.field_o[var3Lifetime1] == 4 &&
              this.field_c < var3Lifetime1 &&
              var3Lifetime1 < -this.field_c + this.field_i - 1) {
              this.field_j[var3Lifetime1] = 0;
              if (this.field_o[var3Lifetime1 - this.field_c] != 4) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 1;
              }
              if (this.field_o[var3Lifetime1 + 1] != 4) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 2;
              }
              if (this.field_o[-1 + var3Lifetime1] != 4) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 16;
              }
              if (this.field_o[var3Lifetime1 + this.field_c] != 4) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 32;
              }
              if ((this.field_j[var3Lifetime1] & 17) == 0 &&
                this.field_o[-1 + (var3Lifetime1 - this.field_c)] != 4) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 4;
              }
              if ((this.field_j[var3Lifetime1] & 3) == 0 &&
                this.field_o[1 - this.field_c + var3Lifetime1] != 4) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 8;
              }
              if ((34 & this.field_j[var3Lifetime1]) == 0 &&
                this.field_o[var3Lifetime1 + this.field_c + 1] != 4) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 64;
              }
              if ((this.field_j[var3Lifetime1] & 48) == 0 &&
                this.field_o[-1 + (this.field_c + var3Lifetime1)] != 4) {
                this.field_j[var3Lifetime1] = this.field_j[var3Lifetime1] + 128;
              }
            }
            if (this.field_o[var3Lifetime1] == 5) {
              if (this.field_o[var3Lifetime1 - 1] == 5 &&
                this.field_o[var3Lifetime1 + 1] == 5) {
                this.field_j[var3Lifetime1 - 1] = 43;
                this.field_j[var3Lifetime1] = 44;
                this.field_j[1 + var3Lifetime1] = 45;
              } else {
                if (this.field_o[var3Lifetime1 - this.field_c] == 5 &&
                  this.field_o[var3Lifetime1 + this.field_c] == 5) {
                  this.field_j[-this.field_c + var3Lifetime1] = 74;
                  this.field_j[var3Lifetime1] = 82;
                  this.field_j[var3Lifetime1 + this.field_c] = 90;
                } else {
                  if (this.field_o[var3Lifetime1 - 1] != 5 &&
                    this.field_o[var3Lifetime1 + 1] != 5 &&
                    this.field_o[-this.field_c + var3Lifetime1] != 5 &&
                    5 != this.field_o[var3Lifetime1 + this.field_c]) {
                    this.field_o[var3Lifetime1] = 11;
                  }
                }
              }
            }
            if (this.field_o[var3Lifetime1] == 6 &&
              this.field_o[var3Lifetime1 - 1] != 6 &&
              this.field_o[var3Lifetime1 - this.field_c] != 6) {
              for (var4 = 0; 5 > var4; var4++) {
                for (var5 = 0; var5 < 5; var5++) {
                  this.field_j[this.field_c * var5 + (var3Lifetime1 + var4)] = var4 + (6 + var5) * 8 + 3;
                }
              }
            }
          }
          this.a((byte) 100);
          while (!this.field_r.b(0)) {
            this.a((byte) 100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_108_0 = var2;
          stackIn_108_1 = new StringBuilder().append("kd.<init>(");
          if (param0 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_108_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(')').toString());
        }
    }

    static {
        field_b = "STORM SCRAPER";
        field_d = false;
        field_h = Math.atan2(1.0, 0.0);
        field_f = "Mouse over an icon for details";
    }
}
