/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private dk field_u;
    static bg[] field_j;
    int field_o;
    double field_t;
    static qf field_r;
    double field_b;
    e field_g;
    int field_m;
    double field_k;
    double field_p;
    double field_i;
    int field_c;
    ga field_e;
    static int field_v;
    private int field_f;
    int field_x;
    double field_y;
    int field_a;
    int field_s;
    int field_d;
    static String field_q;
    static tf field_l;
    static boolean field_w;
    static int field_h;
    private boolean field_n;

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        double var5;
        double var7;
        double var9;
        int var11;
        int var12;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        double var5Lifetime1;
        double var5Lifetime2;
        double var5Lifetime3;
        double var5Lifetime4;
        double var7Lifetime1;
        double var7Lifetime2;
        double var7Lifetime3;
        double var7Lifetime4;
        double var9Lifetime1;
        double var9Lifetime2;
        double var9Lifetime3;
        double var9Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime1Lifetime1;
        int var11Lifetime1Lifetime2;
        int var11Lifetime2Lifetime1;
        var12 = Terraphoenix.field_V;
        if (this.field_n) {
          var3 = 240 + (int)(((double)this.field_c + this.field_y / 100.0) * 16.0 + 16.0 * (this.field_p / 100.0 + (double)this.field_m) - (double)lg.field_c + (double)(96 * this.field_x));
          var4 = (int)(48.0 * (((double)(300 * this.field_x) + this.field_t) / 100.0));
          var2 = (int)((double)(-sj.field_b) + ((this.field_y / 100.0 + (double)this.field_c) * 32.0 - ((double)this.field_m + this.field_p / 100.0) * 32.0)) + 320;
          if (this.field_s == 0 &&
            this.field_f < 4) {
            te.a((byte) 99, 12 - this.field_f * 3, var2, var3, var4, 16777215, false);
          }
          if (2 == this.field_s &&
            this.field_f < 16) {
            te.a((byte) 99, 8 - this.field_f / 2, var2, var3, var4, 16777215, false);
          }
          if (this.field_s == 3) {
            if (this.field_f < 6) {
              te.a((byte) 99, 4 * this.field_f, var2, var3, var4, 65535, false);
            }
            if (32 > this.field_f) {
              te.a((byte) 99, 8 - this.field_f / 4, var2, var3, var4, 65535, false);
            }
          }
          if (this.field_s == 4) {
            if (this.field_f < 6) {
              te.a((byte) 99, this.field_f * 4, var2, var3, var4, 16711680, false);
            }
            if (this.field_f < 32) {
              te.a((byte) 99, 16 - this.field_f / 2, var2, var3, var4, 16711680, false);
            }
            if (this.field_f >= 8) {
              return;
            }
            te.a((byte) 99, 16 - this.field_f * 2, var2, var3, var4, 16777215, false);
          }
          return;
        }
        var3Lifetime1 = 240 + (int)((double)(this.field_x * 96) + (((double)this.field_m + this.field_p / 100.0) * 16.0 + ((double)this.field_c + this.field_y / 100.0) * (double)param0 - (double)lg.field_c));
        var2Lifetime1 = (int)((this.field_y / 100.0 + (double)this.field_c) * 32.0 - (this.field_p / 100.0 + (double)this.field_m) * 32.0 - (double)sj.field_b) + 320;
        var4Lifetime1 = (int)(((double)(this.field_x * 300) + this.field_t) / 100.0 * 48.0);
        if (this.field_s == 0) {
          var5 = (this.field_b + -this.field_i) * 32.0 * (double)this.field_o / 1600.0;
          var7 = (-this.field_i - this.field_b) * 16.0 * (double)this.field_o / 1600.0;
          var9 = -this.field_k * 48.0 * (double)this.field_o / 1600.0;
          if (this.field_d < 5) {
            for (var11 = 0; var11 < 16; var11++) {
              te.a((byte) 99, -(var11 / 2) + 8, (int)((double)var2Lifetime1 - var5 * (double)var11 / 10.0), var3Lifetime1, (int)((double)var4Lifetime1 + (double)var11 * var7 / 10.0 - var9 * (double)var11 / 10.0), 16776960, false);
            }
            for (var11 = 0; var11 < 12; var11++) {
              te.a((byte) 99, -(var11 / 2) + 6, (int)((double)var2Lifetime1 - var5 * (double)var11 / 10.0), var3Lifetime1, (int)((double)var11 * var7 / 10.0 + (double)var4Lifetime1 - (double)var11 * var9 / 10.0), 16777215, true);
            }
          } else {
            for (var11 = 0; var11 < 10; var11++) {
              if (var11 < 8) {
                te.a((byte) 99, 3, (int)((double)var2Lifetime1 + (double)var11 * var5 / 10.0), (int)(var7 * (double)var11 / 10.0 + (double)var3Lifetime1), (int)((double)var4Lifetime1 + (double)var11 * var9 / 10.0), 16776960, false);
              } else {
                te.a((byte) 99, 3, (int)((double)var11 * var5 / 10.0 + (double)var2Lifetime1), (int)((double)var3Lifetime1 + var7 * (double)var11 / 10.0), (int)((double)var4Lifetime1 + (double)var11 * var9 / 10.0), 16744448, false);
              }
            }
            for (var11 = 0; 8 > var11; var11++) {
              te.a((byte) 99, 2, (int)((double)var2Lifetime1 + var5 * (double)var11 / 10.0), (int)((double)var3Lifetime1 + var7 * (double)var11 / 10.0), (int)((double)var4Lifetime1 + var9 * (double)var11 / 10.0), 16777215, true);
            }
          }
        }
        if (1 == this.field_s) {
          var5Lifetime1 = (this.field_b + -this.field_i) * 32.0 / 100.0;
          var7Lifetime1 = (-this.field_b + -this.field_i) * 16.0 / 100.0;
          var9Lifetime1 = -this.field_k * 48.0 / 100.0;
          te.a((byte) 99, 6, (int)((double)var2Lifetime1 + var5Lifetime1), (int)((double)var3Lifetime1 + var7Lifetime1), (int)(var9Lifetime1 + (double)var4Lifetime1), 16777215, true);
          te.a((byte) 99, 6, (int)(var5Lifetime1 / 2.0 + (double)var2Lifetime1), (int)((double)var3Lifetime1 + var7Lifetime1 / 2.0), (int)(var9Lifetime1 / 2.0 + (double)var4Lifetime1), 16777215, true);
          te.a((byte) 99, 3, var2Lifetime1, var3Lifetime1, var4Lifetime1, 0, true);
        }
        if (2 == this.field_s) {
          var5Lifetime2 = (-this.field_i + this.field_b) * 32.0 / 100.0;
          var7Lifetime2 = 16.0 * (-this.field_b + -this.field_i) / 100.0;
          var9Lifetime2 = 48.0 * -this.field_k / 100.0;
          if (this.field_d >= 5) {
            for (var11Lifetime1 = 0; var11Lifetime1 < 25; var11Lifetime1++) {
              te.a((byte) 99, 3, (int)(-(var5Lifetime2 * (double)var11Lifetime1 / 5.0) + (double)var2Lifetime1), (int)(-(var7Lifetime2 * (double)var11Lifetime1 / 5.0) + (double)var3Lifetime1), (int)(-((double)var11Lifetime1 * var9Lifetime2 / 5.0) + (double)var4Lifetime1), 255, false);
            }
            for (var11Lifetime1Lifetime1 = 0; var11Lifetime1Lifetime1 < 25; var11Lifetime1Lifetime1++) {
              te.a((byte) 99, 2, (int)(-(var5Lifetime2 * (double)var11Lifetime1Lifetime1 / 5.0) + (double)var2Lifetime1), (int)(-(var7Lifetime2 * (double)var11Lifetime1Lifetime1 / 5.0) + (double)var3Lifetime1), (int)(-(var9Lifetime2 * (double)var11Lifetime1Lifetime1 / 5.0) + (double)var4Lifetime1), 65280, false);
            }
            for (var11Lifetime1Lifetime2 = 0; var11Lifetime1Lifetime2 < 25; var11Lifetime1Lifetime2++) {
              te.a((byte) 99, 1, (int)((double)var2Lifetime1 - (double)var11Lifetime1Lifetime2 * var5Lifetime2 / 5.0), (int)((double)var3Lifetime1 - var7Lifetime2 * (double)var11Lifetime1Lifetime2 / 5.0), (int)((double)var4Lifetime1 - (double)var11Lifetime1Lifetime2 * var9Lifetime2 / 5.0), 16777215, true);
            }
          } else {
            te.a((byte) 99, 10, (int)(-(var5Lifetime2 / 2.0) + (double)var2Lifetime1), var3Lifetime1, (int)((double)var4Lifetime1 + var7Lifetime2 / 2.0 - var9Lifetime2 / 2.0), 255, false);
            te.a((byte) 99, 8, (int)((double)var2Lifetime1 - var5Lifetime2 / 5.0), var3Lifetime1, (int)(-(var9Lifetime2 / 5.0) + ((double)var4Lifetime1 + var7Lifetime2 / 5.0)), 65535, false);
            te.a((byte) 99, 6, var2Lifetime1, var3Lifetime1, var4Lifetime1, 16777215, true);
          }
        }
        if (this.field_s == 3) {
          var5Lifetime3 = (-this.field_i + this.field_b) * 32.0 / 100.0;
          var7Lifetime3 = 16.0 * (-this.field_b + -this.field_i) / 100.0;
          var9Lifetime3 = 48.0 * -this.field_k / 100.0;
          for (var11Lifetime2 = 0; var11Lifetime2 < 8; var11Lifetime2++) {
            te.a((byte) 99, -var11Lifetime2 + 8, (int)(var5Lifetime3 * (double)var11Lifetime2 / 10.0 + (double)var2Lifetime1), (int)((double)var3Lifetime1 + var7Lifetime3 * (double)var11Lifetime2 / 10.0), (int)((double)var4Lifetime1 + var9Lifetime3 * (double)var11Lifetime2 / 10.0), 33023, false);
          }
          for (var11Lifetime2Lifetime1 = 0; var11Lifetime2Lifetime1 < 6; var11Lifetime2Lifetime1++) {
            te.a((byte) 99, -var11Lifetime2Lifetime1 + 6, (int)((double)var11Lifetime2Lifetime1 * var5Lifetime3 / 10.0 + (double)var2Lifetime1), (int)((double)var3Lifetime1 + var7Lifetime3 * (double)var11Lifetime2Lifetime1 / 10.0), (int)((double)var11Lifetime2Lifetime1 * var9Lifetime3 / 10.0 + (double)var4Lifetime1), 65535, true);
          }
        }
        if (4 == this.field_s) {
          var5Lifetime4 = (-this.field_i + this.field_b) * 32.0 * (double)this.field_o / 5200.0;
          var7Lifetime4 = (-this.field_i - this.field_b) * 16.0 * (double)this.field_o / 5200.0;
          var9Lifetime4 = 48.0 * -this.field_k * (double)this.field_o / 5200.0;
          if (5 > this.field_d) {
            for (var11Lifetime3 = 0; var11Lifetime3 < 16; var11Lifetime3++) {
              te.a((byte) 99, 10 - var11Lifetime3 * 2 / 3, (int)((double)var2Lifetime1 - var5Lifetime4 * (double)var11Lifetime3 / 10.0), var3Lifetime1, (int)((double)var4Lifetime1 + var7Lifetime4 * (double)var11Lifetime3 / 10.0 - var9Lifetime4 * (double)var11Lifetime3 / 10.0), 16711680, false);
            }
            for (var11Lifetime3 = 0; 12 > var11Lifetime3; var11Lifetime3++) {
              te.a((byte) 99, 8 - var11Lifetime3 * 2 / 3, (int)(-((double)var11Lifetime3 * var5Lifetime4 / 10.0) + (double)var2Lifetime1), var3Lifetime1, (int)(-(var9Lifetime4 * (double)var11Lifetime3 / 10.0) + ((double)var11Lifetime3 * var7Lifetime4 / 10.0 + (double)var4Lifetime1)), 16777215, true);
            }
          } else {
            for (var11Lifetime3 = 0; var11Lifetime3 < 10; var11Lifetime3++) {
              if (8 <= var11Lifetime3) {
                te.a((byte) 99, 4, (int)((double)var11Lifetime3 * var5Lifetime4 / 10.0 + (double)var2Lifetime1), (int)((double)var11Lifetime3 * var7Lifetime4 / 10.0 + (double)var3Lifetime1), (int)((double)var4Lifetime1 + (double)var11Lifetime3 * var9Lifetime4 / 10.0), 16711680, false);
              } else {
                te.a((byte) 99, 4, (int)(var5Lifetime4 * (double)var11Lifetime3 / 10.0 + (double)var2Lifetime1), (int)((double)var3Lifetime1 + var7Lifetime4 * (double)var11Lifetime3 / 10.0), (int)((double)var4Lifetime1 + var9Lifetime4 * (double)var11Lifetime3 / 10.0), 16744576, false);
              }
            }
            for (var11Lifetime3 = 0; 8 > var11Lifetime3; var11Lifetime3++) {
              te.a((byte) 99, 3, (int)(var5Lifetime4 * (double)var11Lifetime3 / 10.0 + (double)var2Lifetime1), (int)((double)var3Lifetime1 + var7Lifetime4 * (double)var11Lifetime3 / 10.0), (int)((double)var11Lifetime3 * var9Lifetime4 / 10.0 + (double)var4Lifetime1), 16777215, true);
            }
          }
        }
        if (this.field_s == 5) {
          te.a((byte) 99, 8, var2Lifetime1, var3Lifetime1, var4Lifetime1, 255, false);
          te.a((byte) 99, 7, var2Lifetime1, var3Lifetime1, var4Lifetime1, 65535, false);
          te.a((byte) 99, 6, var2Lifetime1, var3Lifetime1, var4Lifetime1, 16777215, false);
        }
        if (this.field_s == 6) {
          var3Lifetime2 = (int)((double)(-lg.field_c) + (-(((double)(this.field_x * 100) + this.field_t) / 100.0 * 48.0) + (16.0 * ((double)this.field_m + this.field_p / 100.0) + 16.0 * ((double)this.field_c + this.field_y / 100.0)))) + 240;
          var2Lifetime2 = (int)(32.0 * ((double)this.field_c + this.field_y / 100.0) - 32.0 * ((double)this.field_m + this.field_p / 100.0) - (double)sj.field_b) + 320;
          l.e(var2Lifetime2, var3Lifetime2, 3, 8421504);
        }
        if (7 == this.field_s) {
          var2Lifetime3 = (int)((double)(-sj.field_b) + (((double)this.field_c + this.field_y / 100.0) * 32.0 - 32.0 * ((double)this.field_m + this.field_p / 100.0))) + 320;
          var3Lifetime3 = 240 + (int)(-(48.0 * (((double)(this.field_x * 100) + this.field_t) / 100.0)) + ((this.field_y / 100.0 + (double)this.field_c) * 16.0 + (this.field_p / 100.0 + (double)this.field_m) * 16.0) - (double)lg.field_c);
          l.e(var2Lifetime3, var3Lifetime3, 3, 65535);
        }
    }

    private final gi a(int param0, int param1, int param2, byte param3) {
        int var5;
        dl var6;
        int var7;
        var7 = Terraphoenix.field_V;
        this.field_n = true;
        var5 = 54 % ((-72 - param3) / 40);
        if ((this.field_s != 0 &&
          2 != this.field_s &&
          this.field_s != 5 || !(this.field_o < 40)) && (Math.random() * 100.0 < (double)this.field_o)) {
          var6 = this.field_u.a(104, param0, param2, param1);
          if (var6 == null) {
            return this;
          }
          if (-1 != var6.field_j) {
            var6.field_j = hb.field_h[var6.field_j];
            if (var6.field_j == -1) {
              if (var6.field_b == -1) {
                var6.field_v = -1;
              } else {
                var6.field_v = 0;
              }
            } else {
              if (var6.field_b != -1 &&
                nc.field_a[var6.field_j] != 5) {
                var6.field_v = nc.field_a[var6.field_j];
              }
            }
          } else {
            if (var6.field_b != -1 && (var6.field_b != 5 ||
              100.0 * Math.random() < (double)(this.field_o - 60))) {
              var6.field_b = ck.field_f[var6.field_b];
              if (var6.field_b == -1) {
                var6.field_v = -1;
                if (var6.field_r > 0) {
                  if (var6.field_h != null) {
                    var6.field_h.field_E = var6.field_h.field_E - 1;
                    var6.field_h.field_P = 0;
                    var6.field_h.field_c = var6.field_c;
                    if (null == var6.field_c.field_h) {
                      var6.field_c.field_h = var6.field_h;
                      var6.field_h = null;
                      if (-1 == var6.field_c.field_v &&
                        null == var6.field_c.field_c.field_h) {
                        var6.field_c.field_c.field_h = var6.field_c.field_h;
                        var6.field_c.field_h = null;
                        var6.field_c.field_c.field_h.field_A = 0;
                        var6.field_c.field_c.field_h.field_d = 5;
                        var6.field_c.field_c.field_h.field_S = true;
                        var6.field_c.field_c.field_h.field_P = 0;
                        var6.field_c.field_c.field_h.field_c = var6.field_c.field_c;
                      }
                    }
                  }
                } else {
                  var6.field_v = 0;
                  var6.field_b = 3;
                }
              }
            }
          }
        }
        return this;
    }

    private final void a(byte param0, boolean param1) {
        int var7 = 0;
        gi discarded$1 = null;
        gi discarded$2 = null;
        gi discarded$3 = null;
        gi discarded$4 = null;
        gi discarded$5 = null;
        gi discarded$6 = null;
        gi discarded$0 = null;
        dl stackIn_45_0 = null;
        int stackIn_46_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        int var9;
        int var10;
        dl var11;
        int var12;
        dl var13;
        int var5Lifetime1;
        int var6Lifetime1;
        var12 = Terraphoenix.field_V;
        var3 = 0;
        this.field_n = true;
        var4 = this.field_o;
        if (this.field_s == 0 &&
          param1) {
          if (!(30.0 * Math.random() < (double)(-15 + this.field_o))) {
            qd.$cfr$intArgs$a$e9dea5688aa5(81, 40);
          } else {
            qd.$cfr$intArgs$a$e9dea5688aa5(116, (int)(Math.random() * 2.0) + 41);
          }
        }
        if (3 == this.field_s &&
          param1) {
          qd.$cfr$intArgs$a$e9dea5688aa5(98, 91);
        }
        if (this.field_s == 1) {
          var3 = 4;
          qd.$cfr$intArgs$a$e9dea5688aa5(86, 81);
        }
        if (6 == this.field_s) {
          var3 = 4;
          qd.$cfr$intArgs$a$e9dea5688aa5(56, 78);
        }
        if (this.field_s == 5) {
          var3 = 10;
          qd.$cfr$intArgs$a$e9dea5688aa5(91, 49);
        }
        if (this.field_s == 7) {
          var3 = 6;
          qd.$cfr$intArgs$a$e9dea5688aa5(58, 65);
        }
        if (var3 > 0) {
          var5 = 32 * this.field_c - this.field_m * 32;
          sj.field_b = var5;
          eg.field_p = this.field_x;
          var6 = -(this.field_x * 48) + (16 * this.field_c + 16 * this.field_m);
          lg.field_c = var6;
        }
        for (var5Lifetime1 = 0; var5Lifetime1 < var3; var5Lifetime1++) {
          for (var6Lifetime1 = -var3 + this.field_c; this.field_c + var3 >= var6Lifetime1; var6Lifetime1++) {
            for (var7 = -var3 + this.field_m; var3 + this.field_m >= var7; var7++) {
              var8 = var6Lifetime1 - this.field_c;
              var9 = var7 - this.field_m;
              var10 = (int)Math.sqrt((double)(var8 * var8 + var9 * var9));
              this.field_o = (-var10 + var3) * var4 / var3;
              if (this.field_o > 0 && (this.field_c - var5Lifetime1 == var6Lifetime1 ||
                var6Lifetime1 == var5Lifetime1 + this.field_c ||
                var7 == -var5Lifetime1 + this.field_m ||
                var5Lifetime1 + this.field_m == var7) && this.field_u.a(this.field_x, this.field_m, this.field_x, var6Lifetime1, -17402, this.field_c, var7)) {
                var11 = this.field_u.a(121, var7, this.field_x, var6Lifetime1);
                if (var11 != null) {
                  stackIn_45_0 = var11;
                  if (64 < var4) {
                    stackIn_46_1 = -this.field_o + var4 + 64;
                  } else {
                    stackIn_46_1 = -this.field_o + (var4 + var4);
                  }
                  stackIn_45_0.field_p = stackIn_46_1;
                }
                discarded$1 = this.a(var11, false, -29593);
                discarded$2 = this.a(this.field_u.a(param0 + 126, var7, this.field_x, var6Lifetime1 + 1), false, -29593);
                discarded$3 = this.a((byte) 94, false, this.field_u.a(param0 + 89, var7, this.field_x, var6Lifetime1));
                discarded$4 = this.a((byte) 94, false, this.field_u.a(126, 1 + var7, this.field_x, var6Lifetime1));
                discarded$5 = this.a(var7, var6Lifetime1, this.field_x, (byte) -20);
                discarded$6 = this.a(var7, var6Lifetime1, 1 + this.field_x, (byte) -124);
                if (var11 != null &&
                  var11.field_h != null &&
                  0 < var11.field_h.field_P) {
                  var11.field_h.a((byte) -51, this.field_o);
                  if (var11.field_h.field_P <= 0 &&
                    var11.field_h.field_Z == null &&
                    var11.field_h.field_t != 7 &&
                    null != this.field_e) {
                    if (null != this.field_e) {
                      this.field_e.field_e = this.field_e.field_e + 1;
                    }
                    if (null != this.field_e &&
                      Math.random() * 100.0 > (double)this.field_e.field_q) {
                      this.field_e.field_q = this.field_e.field_q + 1;
                    }
                    if (this.field_e.field_B >= 90) {
                      mh.a((byte) 117, 0, 255);
                    }
                    if (this.field_e.field_e >= 10) {
                      mh.a((byte) 126, 2, 253);
                    }
                    if (25 <= this.field_e.field_e) {
                      mh.a((byte) 127, 3, 252);
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 != -6) {
          var13 = (dl) null;
          discarded$0 = this.a((dl) null, false, 122);
        }
    }

    final gi a(byte param0) {
        int var2;
        int var3;
        dl var4;
        gi var5;
        int var6;
        int var7;
        int var8;
        dl var9;
        gi var5Lifetime1;
        gi var5Lifetime2;
        var8 = Terraphoenix.field_V;
        if (this.field_n) {
          this.field_f = this.field_f + 1;
          if (this.field_f <= 25) {
            return this;
          }
          return null;
        }
        if (ja.field_n > 0) {
          return this;
        }
        var2 = 1;
        if (param0 != 11) {
          this.a((byte) -35);
        }
        if (this.field_s == 0) {
          var2 = 2;
        }
        if (this.field_s == 2) {
          var2 = 5;
        }
        if (4 == this.field_s) {
          var2 = 2;
        }
        if (this.field_d < 5) {
          this.field_d = this.field_d + 1;
          if (0 != this.field_s &&
            this.field_s != 2 &&
            this.field_s != 4) {
            this.field_d = 5;
          } else {
            if (this.field_d < 5) {
              return this;
            }
          }
          if (this.field_d == 5) {
            if (this.field_y > 50.0) {
              this.field_y = 50.0;
              var2 += 2;
            }
            if (-50.0 > this.field_y) {
              var2 += 2;
              this.field_y = -50.0;
            }
            if (this.field_p > 50.0) {
              this.field_p = 50.0;
              var2 += 2;
            }
            if (this.field_p < -50.0) {
              this.field_p = -50.0;
              var2 += 2;
            }
          }
        }
        while (true) {
          if (var2 <= 0) {
            return this;
          }
          var2--;
          var3 = 0;
          if (this.field_s >= 6) {
            this.field_a = this.field_a - 1;
            this.field_k = this.field_k - 1.04;
            var3 = 1;
            var9 = this.field_u.a(-83, this.field_m, this.field_x, this.field_c);
            if (this.field_a < 0 &&
              var9 != null &&
              var9.field_v != -1) {
              this.a(param0 ^ -120);
              return null;
            }
          }
          if (this.field_s == 1 ||
            this.field_s == 5) {
            this.field_k = this.field_k - 0.17333333333333334;
          }
          if (this.field_s == 0) {
            this.field_k = this.field_k - 0.065;
          }
          if (this.field_s == 3) {
            this.field_k = this.field_k - 0.26;
          }
          if (this.field_s == 4) {
            this.field_k = this.field_k - 0.065;
          }
          var4 = this.field_u.a(-105, this.field_m, this.field_x, this.field_c);
          while (var4 == null) {
            this.field_t = this.field_t + 100.0;
            this.field_x = this.field_x - 1;
            var4 = this.field_u.a(116, this.field_m, this.field_x, this.field_c);
          }
          this.field_t = this.field_t + this.field_k;
          if (this.field_t < (double)(-(var4.field_r * 100) + var4.field_l)) {
            if (var4.field_v != -1 &&
              var4.field_b != -1) {
              if (var3 == 0) {
                this.a(37);
                return this.a(this.field_m, this.field_c, this.field_x, (byte) -122);
              }
              this.field_k = -this.field_k / 2.0;
              this.field_t = (double)(-(var4.field_r * 100) + var4.field_l);
              this.field_i = this.field_i * 0.9;
            } else {
              this.field_t = this.field_t + 100.0;
              this.field_x = this.field_x - 1;
              var4 = this.field_u.a(-54, this.field_m, this.field_x, this.field_c);
            }
          }
          if (100.0 < this.field_t) {
            if (null != var4.field_C) {
              if (var4.field_C.field_v != -1 &&
                -1 != var4.field_C.field_b) {
                if (var3 == 0) {
                  this.a(param0 + 9);
                  return this.a(this.field_m, this.field_c, this.field_x + 1, (byte) -125);
                }
                this.field_t = 100.0;
                this.field_k = -this.field_k / 2.0;
                this.field_i = 0.9 * this.field_i;
              } else {
                this.field_x = this.field_x + 1;
                this.field_t = this.field_t - 100.0;
                var4 = var4.field_C;
              }
            }
            if (1000.0 < this.field_t) {
              return null;
            }
          }
          if (var4.field_v == 1 &&
            (double)(var4.field_l + 50) > this.field_t) {
            var5 = this.a(this.field_m, 3394, this.field_c, this.field_x);
            if (var5 == null) {
              return null;
            }
          }
          if (var4.field_v == 2 &&
            (double)(var4.field_l + 50) > this.field_t) {
            var5Lifetime1 = this.a(this.field_m, 3394, this.field_c, this.field_x);
            if (var5Lifetime1 == null) {
              return null;
            }
          }
          if (var4.field_v == 3 &&
            this.field_t <= (double)(100 + var4.field_l)) {
            var5Lifetime2 = this.a(this.field_m, 3394, this.field_c, this.field_x);
            if (var5Lifetime2 == null) {
              return null;
            }
          }
          this.field_y = this.field_y + this.field_i;
          if (-50.0 > this.field_y) {
            if ((1 & var4.field_e) == 1) {
              this.field_y = -50.0;
              return this.a(var4, true, -29593);
            }
            if ((16 & var4.field_e) == 16 &&
              50.0 > this.field_t) {
              this.field_y = -50.0;
              return this.a(var4, true, -29593);
            }
            this.field_c = this.field_c - 1;
            this.field_y = this.field_y + 100.0;
          }
          if (50.0 < this.field_y) {
            if ((4 & var4.field_e) == 4) {
              this.field_y = 50.0;
              return this.a(this.field_u.a(-61, this.field_m, this.field_x, 1 + this.field_c), true, -29593);
            }
            if (64 == (64 & var4.field_e) &&
              50.0 > this.field_t) {
              this.field_y = 50.0;
              return this.a(this.field_u.a(-62, this.field_m, this.field_x, 1 + this.field_c), true, -29593);
            }
            this.field_y = this.field_y - 100.0;
            this.field_c = this.field_c + 1;
          }
          if (this.field_c <= 0) {
            return null;
          }
          if (this.field_u.field_b - 1 <= this.field_c) {
            return null;
          }
          var4 = this.field_u.a(param0 ^ 126, this.field_m, this.field_x, this.field_c);
          while (var4 == null) {
            this.field_t = this.field_t + 100.0;
            this.field_x = this.field_x - 1;
            var4 = this.field_u.a(-111, this.field_m, this.field_x, this.field_c);
          }
          while (null != var4.field_C) {
            if (100.0 < this.field_t) {
              this.field_x = this.field_x + 1;
              this.field_t = this.field_t - 100.0;
              var4 = this.field_u.a(108, this.field_m, this.field_x, this.field_c);
              continue;
            }
            break;
          }
          this.field_p = this.field_p + this.field_b;
          if (this.field_p > 50.0) {
            if (this.field_t <= 100.0) {
              if ((8 & var4.field_e) == 8) {
                this.field_p = 50.0;
                return this.a((byte) 94, true, this.field_u.a(param0 ^ -70, 1 + this.field_m, this.field_x, this.field_c));
              }
              if ((128 & var4.field_e) == 128 &&
                this.field_t < 50.0) {
                this.field_p = 50.0;
                return this.a((byte) 94, true, this.field_u.a(-26, this.field_m + 1, this.field_x, this.field_c));
              }
            }
            this.field_m = this.field_m + 1;
            this.field_p = this.field_p - 100.0;
          }
          if (-50.0 > this.field_p) {
            if (100.0 >= this.field_t) {
              if ((2 & var4.field_e) == 2) {
                this.field_p = -50.0;
                return this.a((byte) 94, true, var4);
              }
              if (32 == (32 & var4.field_e) &&
                this.field_t < 50.0) {
                this.field_p = -50.0;
                return this.a((byte) 94, true, var4);
              }
            }
            this.field_p = this.field_p + 100.0;
            this.field_m = this.field_m - 1;
          }
          if (this.field_m <= 0) {
            return null;
          }
          if (-1 + this.field_u.field_e <= this.field_m) {
            return null;
          }
          var4 = this.field_u.a(param0 - 46, this.field_m, this.field_x, this.field_c);
          while (var4 == null) {
            this.field_t = this.field_t + 100.0;
            this.field_x = this.field_x - 1;
            var4 = this.field_u.a(-109, this.field_m, this.field_x, this.field_c);
          }
          while (var4.field_C != null) {
            if (this.field_t > 100.0) {
              this.field_x = this.field_x + 1;
              this.field_t = this.field_t - 100.0;
              var4 = this.field_u.a(-85, this.field_m, this.field_x, this.field_c);
              continue;
            }
            break;
          }
          if (var4.field_h == null) {
            continue;
          }
          if (this.field_s == 6) {
            continue;
          }
          if (this.field_s == 7) {
            continue;
          }
          var6 = var4.field_h.c(param0 ^ -117);
          var7 = var4.field_h.h(13);
          if (!((double)var7 > this.field_p)) {
            continue;
          }
          if (!((double)(-var6) < this.field_y)) {
            continue;
          }
          if (!((double)var6 > this.field_y)) {
            continue;
          }
          if (!((double)(-var6) < this.field_p)) {
            continue;
          }
          if (!(this.field_p < (double)var6)) {
            continue;
          }
          break;
        }
        if (var4.field_h.field_P <= 0) {
          this.a((byte) -6, false);
          return this;
        }
        if (null != this.field_e) {
          if (100.0 * Math.random() > (double)this.field_e.field_B) {
            this.field_e.field_B = this.field_e.field_B + 1;
          }
          if (this.field_s != 1 &&
            this.field_s != 6 &&
            this.field_s != 5 &&
            this.field_s != 7) {
            var4.field_h.a((byte) 114, this.field_o, this.field_s);
          }
        } else {
          if (this.field_s != 1 &&
            this.field_s != 6 &&
            this.field_s != 5 &&
            this.field_s != 7) {
            var4.field_h.a((byte) 114, this.field_o, this.field_s);
          }
        }
        if (var4.field_h.field_P <= 0 &&
          var4.field_h.field_Z == null &&
          7 != var4.field_h.field_t &&
          this.field_e != null) {
          this.field_e.field_e = this.field_e.field_e + 1;
        }
        if (this.field_e != null) {
          if (this.field_e.field_B >= 90) {
            mh.a((byte) 112, 0, 255);
          }
          if (this.field_e.field_e >= 10) {
            mh.a((byte) 113, 2, 253);
          }
          if (this.field_e.field_e >= 25) {
            mh.a((byte) 126, 3, 252);
          }
        }
        this.a((byte) -6, false);
        return this;
    }

    final static int a(int param0, String param1, boolean param2, int param3, int param4, String param5, String param6) {
        gd var7 = null;
        RuntimeException var7_ref = null;
        gd var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new gd(param6);
          var8 = new gd(param5);
          if (param3 != 3) {
            field_h = 67;
          }
          stackIn_3_0 = tb.a(param1, var8, var7, param2, param0, (byte) 96, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("gi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (0L != param1 % 10L) {
          te.a(param1, 0);
        } else {
          te.a(-1L + param1, 0);
          te.a(1L, 0);
        }
        if (param0 >= -25) {
          field_r = (qf) null;
        }
    }

    private final gi a(int param0, int param1, int param2, int param3) {
        int var6;
        dl var7;
        dl var8;
        var6 = Terraphoenix.field_V;
        this.field_n = true;
        var7 = this.field_u.a(param1 ^ -3426, param0, param3, param2);
        var8 = var7;
        if (var8 == null) {
          return this;
        }
        if (this.field_s == 0 &&
          var8.field_j <= 3) {
          return this;
        }
        if ((3 != var8.field_v ||
          var8.field_j == 1) &&
          this.field_s == 6) {
          this.a(param1 ^ -3416);
          return this;
        }
        if (var8.field_j == -1) {
          return this;
        }
        if (param1 != 3394) {
          this.field_d = 24;
        }
        if ((this.field_s != 0 &&
          this.field_s != 2 &&
          this.field_s != 5 ||
          40 <= this.field_o ||
          this.field_s == 3 &&
          !(var8.field_j >= 7)) &&
          100.0 * Math.random() < (double)this.field_o) {
          var7.field_j = hb.field_h[var7.field_j];
          if (var8.field_j == -1) {
            if (var8.field_b != -1) {
              var8.field_v = 0;
            } else {
              var8.field_v = -1;
            }
          } else {
            if (var8.field_b != -1 &&
              nc.field_a[var7.field_j] != 5) {
              var7.field_v = nc.field_a[var7.field_j];
            }
          }
        }
        this.a(-127);
        return this;
    }

    public static void b(int param0) {
        field_r = null;
        field_q = null;
        field_j = null;
        if (param0 != -50) {
          return;
        }
        field_l = null;
    }

    final static void d(int param0) {
        int var9_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var20 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        nd var5 = null;
        long var5_long = 0L;
        int var6 = 0;
        int var7 = 0;
        fb var7_ref_fb = null;
        int var8 = 0;
        String[][] var9 = null;
        String[][] var10 = null;
        long[][] var11 = null;
        int[][] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        String var22 = null;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        uc var28 = null;
        int var4Lifetime1;
        int var26Lifetime1;
        int var26Lifetime2;
        var27 = Terraphoenix.field_V;
        try {
          var28 = mk.field_j;
          var3 = 83 % ((56 - param0) / 50);
          var2 = var28.a(-16384);
          if (var2 == 0) {
            var4 = var28.i(-25578);
            var5 = (nd) (r.field_Q.d(9272));
            while (var5 != null) {
              if (var5.field_s != var4) {
                var5 = (nd) (r.field_Q.e((byte) -119));
                continue;
              }
              break;
            }
            if (var5 == null) {
              gb.g(-17464);
              return;
            }
            var6 = var28.a(-16384);
            if (var6 != 0) {
              var7 = var5.field_n;
              od.field_h[0].field_d = null;
              var8 = var5.field_j;
              od.field_h[0].field_f = kj.field_f;
              od.field_h[0].field_a = false;
              for (var9_int = 1; var6 > var9_int; var9_int++) {
                od.field_h[var9_int].field_f = var28.e(-1);
                od.field_h[var9_int].field_a = false;
                if (1 == var28.a(-16384)) {
                  od.field_h[var9_int].field_d = var28.e(-1);
                } else {
                  od.field_h[var9_int].field_d = null;
                }
              }
              dupTemp$0 = new String[3][var7];
              var5.field_p = dupTemp$0;
              var9 = dupTemp$0;
              var10 = new String[3][var7];
              dupTemp$1 = new long[3][var7];
              var5.field_l = dupTemp$1;
              var11 = dupTemp$1;
              dupTemp$2 = new int[3][var8 * var7];
              var5.field_q = dupTemp$2;
              var12 = dupTemp$2;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = 0;
              var19 = var28.a(-16384);
              if (0 < var19) {
                for (var20 = 0; var19 > var20; var20++) {
                  var21 = var28.a(-16384);
                  var22 = od.field_h[var21].field_f;
                  var23 = var28.h((byte) 78);
                  var25 = var28.field_k;
                  if (var7 > var20) {
                    var9[0][var13] = var22;
                    var10[0][var13] = od.field_h[var21].field_d;
                    var11[0][var13] = var23;
                    var13++;
                    for (var26 = 0; var26 < var8; var26++) {
                      incrementValue$3 = var16;
                      var16++;
                      var12[0][incrementValue$3] = var28.f((byte) -107);
                    }
                  }
                  if (var22 != null &&
                    me.a(100, var22)) {
                    var9[1][var14] = kj.field_f;
                    var10[1][var14] = null;
                    var11[1][var14] = var23;
                    var28.field_k = var25;
                    var14++;
                    for (var26Lifetime1 = 0; var8 > var26Lifetime1; var26Lifetime1++) {
                      incrementValue$4 = var17;
                      var17++;
                      var12[1][incrementValue$4] = var28.f((byte) -107);
                    }
                  }
                  if (var7 > var15 &&
                    !od.field_h[var21].field_a) {
                    od.field_h[var21].field_a = true;
                    var9[2][var15] = var22;
                    var10[2][var15] = od.field_h[var21].field_d;
                    var11[2][var15] = var23;
                    var28.field_k = var25;
                    var15++;
                    for (var26Lifetime2 = 0; var8 > var26Lifetime2; var26Lifetime2++) {
                      incrementValue$5 = var18;
                      var18++;
                      var12[2][incrementValue$5] = var28.f((byte) -107);
                    }
                  }
                }
              }
            }
            var5.field_m = true;
            var5.b((byte) 12);
            return;
          }
          if (var2 == 1) {
            var4Lifetime1 = var28.i(-25578);
            var5_long = var28.h((byte) 78);
            var7_ref_fb = (fb) (hd.field_p.d(9272));
            while (var7_ref_fb != null) {
              if (var7_ref_fb.field_s != var4Lifetime1) {
                var7_ref_fb = (fb) (hd.field_p.e((byte) -119));
                continue;
              }
              break;
            }
            if (var7_ref_fb == null) {
              gb.g(-17464);
              return;
            }
            var7_ref_fb.field_p = var5_long;
            var7_ref_fb.b((byte) 12);
            return;
          }
          bd.a((Throwable) null, "HS1: " + r.i(-15465), -60);
          gb.g(-17464);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "gi.I(" + param0 + ')');
        }
    }

    private final gi a(dl param0, boolean param1, int param2) {
        gi stackIn_2_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_n = true;
          if (param2 != -29593) {
            stackIn_2_0 = (gi) null;
            return stackIn_2_0;
          }
          if (param0 == null) {
            return this;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((this.field_s != 0 &&
            this.field_s != 2 ||
            40 <= this.field_o) && Math.random() * 100.0 < (double)this.field_o) {
            if ((!(100.0 * Math.random() < (double)(this.field_o - 60))) &&
              (decompiledFrameRemainder0 = (param0.field_g != 28))) {
              decompiledFrameRemainder0 = (param0.field_g != 32);
            }
            if ((decompiledFrameRemainder0) && ((28 != param0.field_g ||
              13 != param0.field_s.field_i.field_G.field_Bb) && 0 <= param0.field_g)) {
              if (nh.field_E[param0.field_g] == 1) {
                param0.a(1, true, 111);
              }
              if (nh.field_E[param0.field_g] == 2) {
                param0.a(1, false, param2 ^ -29687);
              }
              if (3 == nh.field_E[param0.field_g]) {
                param0.a(1, true, 96);
                param0.field_i = 0;
                this.field_u.a(122, param0.field_n, param0.field_r, -1 + param0.field_A).field_i = 0;
              }
              param0.field_g = le.field_s[param0.field_g];
              if (param0.field_g >= 0) {
                if (1 == nh.field_E[param0.field_g]) {
                  param0.a(1, true, -82);
                }
                if (2 == nh.field_E[param0.field_g]) {
                  param0.a(1, false, param2 + 29671);
                }
                if (nh.field_E[param0.field_g] == 3) {
                  param0.a(1, true, param2 + 29485);
                  param0.field_i = 1;
                  this.field_u.a(-88, param0.field_n, param0.field_r, -1 + param0.field_A).field_i = 1;
                }
              }
            }
          }
          if (param1) {
            this.a(110);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("gi.G(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final gi a(byte param0, boolean param1, dl param2) {
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 94) {
            this.field_d = -74;
          }
          this.field_n = true;
          if (param2 == null) {
            return this;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((this.field_s != 0 &&
            this.field_s != 2 ||
            this.field_o >= 40) && 100.0 * Math.random() < (double)this.field_o) {
            if ((!(Math.random() * 100.0 < (double)(this.field_o - 60))) &&
              (decompiledFrameRemainder0 = (param2.field_k != 28))) {
              decompiledFrameRemainder0 = (32 != param2.field_k);
            }
            if ((decompiledFrameRemainder0) && ((28 != param2.field_k ||
              param2.field_s.field_i.field_G.field_Bb != 13) && param2.field_k >= 0)) {
              if (1 == nh.field_E[param2.field_k]) {
                param2.a(2, true, -95);
              }
              if (nh.field_E[param2.field_k] == 2) {
                param2.a(2, false, 87);
              }
              if (3 == nh.field_E[param2.field_k]) {
                param2.a(2, true, -75);
                param2.field_i = 0;
                this.field_u.a(82, -1 + param2.field_n, param2.field_r, param2.field_A).field_i = 0;
              }
              param2.field_k = le.field_s[param2.field_k];
              if (param2.field_k >= 0) {
                if (1 == nh.field_E[param2.field_k]) {
                  param2.a(2, true, param0 ^ 54);
                }
                if (2 == nh.field_E[param2.field_k]) {
                  param2.a(2, false, 93);
                }
                if (nh.field_E[param2.field_k] == 3) {
                  param2.a(2, true, -108);
                  param2.field_i = 1;
                  this.field_u.a(-91, param2.field_n - 1, param2.field_r, param2.field_A).field_i = 1;
                }
              }
            }
          }
          if (param1) {
            this.a(-122);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("gi.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    private final void a(int param0) {
        int var2 = -112 % ((param0 + 82) / 40);
        this.a((byte) -6, true);
    }

    final static void a(fa param0, fa param1, fa param2, int param3) {
        ci var18 = null;
        bg[] var5 = null;
        bg[][] var6 = null;
        int[][] var20 = null;
        int[][] var17 = null;
        int[][] var7 = null;
        bg[] var15 = null;
        int var11_int = 0;
        ci var16 = null;
        ci var19 = null;
        ci var11 = null;
        ci var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Terraphoenix.field_V;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          e.field_p = ig.a(param0, 0, "frame_top", "commonui");
          qb.field_f = ig.a(param0, 0, "frame_bottom", "commonui");
          hd.field_o = il.a("jagex_logo_grey", "commonui", param0, param3 + 2039);
          i.field_c = ig.a(param0, 0, "button", "commonui");
          og.field_c = ce.a("validation", (byte) -90, "commonui", param0);
          ra.field_l = (pk) ((Object) ec.a("commonui", 8192, param1, param0, "arezzo12"));
          qk.field_e = (pk) ((Object) ec.a("commonui", 8192, param1, param0, "arezzo14"));
          be.field_x = (pk) ((Object) ec.a("commonui", param3 + 10232, param1, param0, "arezzo14bold"));
          var18 = new ci(param2.a("button.gif", "", -21653), (java.awt.Component) ((Object) ae.field_G));
          qb.a("dropdown", (byte) -36, "commonui", param0);
          var5 = lf.a(true, "commonui", "screen_options", param0);
          hk.field_d = new bg[4];
          ng.field_u = new bg[4];
          o.field_c = new bg[4];
          var6 = new bg[][]{o.field_c, ng.field_u, hk.field_d};
          var20 = new int[4][];
          var17 = var20;
          var7 = var17;
          var7[0] = var5[0].field_m;
          for (var8 = 1; var8 < var20.length; var8++) {
            var7[var8] = (int[]) ((Object) var20[0].clone());
          }
          var8Lifetime1 = var5[0].field_l[0];
          var20[2][var8Lifetime1] = 16777215;
          var20[1][var8Lifetime1] = 2394342;
          if (param3 != -2040) {
            String var14 = (String) null;
            gi.a(-71, (String) null, false, 84, -18, (String) null, (String) null);
          }
          var20[3][var8Lifetime1] = 4767999;
          for (var9 = 0; 3 > var9; var9++) {
            var15 = var6[var9];
            bg[] var10 = var15;
            for (var11_int = 0; var11_int < var15.length; var11_int++) {
              var15[var11_int] = lf.a(var20[var11_int], var5[var9], param3 + 2040);
            }
          }
          var9Lifetime1 = var18.field_t;
          ja.c((byte) 109);
          var18.a();
          l.h(0, 0, l.field_k, l.field_j);
          var16 = new ci(var9Lifetime1, var9Lifetime1);
          var19 = var16;
          var19.a();
          var18.d(0, 0);
          var11 = new ci(var9Lifetime1, var9Lifetime1);
          var11.a();
          var18.d(var9Lifetime1 - var18.field_r, 0);
          var12 = new ci(-(var9Lifetime1 * 2) + var18.field_r, var9Lifetime1);
          var12.a();
          var18.d(-var9Lifetime1, 0);
          ij.a(false);
          i.field_c = new ci[]{var16, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "gi.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    gi(e param0) {
        try {
          this.field_g = param0;
          this.field_n = false;
          this.field_f = 0;
          this.field_e = null;
          this.field_u = this.field_g.field_h;
          this.field_d = 0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new qf();
        field_q = "Remove ";
        field_h = 0;
    }
}
