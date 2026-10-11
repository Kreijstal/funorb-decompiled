/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ib {
    static he[] field_r;
    private int field_s;
    double field_p;
    int field_m;
    int field_c;
    private int field_e;
    static int field_t;
    static int field_a;
    static int field_o;
    double field_b;
    int field_g;
    static int field_l;
    static vc field_f;
    boolean field_q;
    double field_k;
    double field_d;
    private int field_i;
    he field_n;
    static he[] field_j;
    static he[] field_u;
    private boolean field_h;

    ib(double param0, double param1, boolean param2, boolean param3) {
        this(param0, param1, -1, param2, param3);
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 > 6) {
          aj.a(true);
          wj.d(param4, param0, param3, param1);
          return;
        }
        ib.a(108, -87, (byte) 42, 13, 35);
        aj.a(true);
        wj.d(param4, param0, param3, param1);
    }

    private final void c(byte param0) {
        if (this.field_g != 7) {
          if (param0 != 65) {
            this.field_e = 7;
            return;
          }
          return;
        }
        if (6 > sd.field_a.field_L) {
          this.field_n = c.field_a[sd.field_a.field_L - 1];
          if (param0 != 65) {
            this.field_e = 7;
            return;
          }
          return;
        }
        this.field_g = 6;
        this.field_m = 5000;
        this.field_n = p.field_e;
        if (param0 == 65) {
          return;
        }
        this.field_e = 7;
    }

    final boolean a(byte param0) {
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_33_0 = false;
        boolean stackIn_42_0 = false;
        boolean stackIn_46_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_57_0 = false;
        boolean stackIn_63_0 = false;
        boolean stackIn_67_0 = false;
        boolean stackIn_77_0 = false;
        boolean stackIn_81_0 = false;
        boolean stackIn_88_0 = false;
        boolean stackIn_92_0 = false;
        boolean stackIn_98_0 = false;
        boolean stackIn_102_0 = false;
        boolean stackIn_110_0 = false;
        boolean stackIn_114_0 = false;
        boolean stackIn_119_0 = false;
        boolean stackIn_123_0 = false;
        boolean stackIn_129_0 = false;
        boolean stackIn_133_0 = false;
        boolean stackIn_138_0 = false;
        boolean stackIn_142_0 = false;
        if (param0 > -22) {
          return false;
        }
        this.c((byte) 65);
        if (!this.field_q &&
          !this.field_h) {
          this.field_c = this.field_c + 1;
          this.field_d = this.field_d - 1.0;
          stackIn_7_0 = !(!((double)(-this.field_n.field_h) > this.field_d));
          return stackIn_7_0;
        }
        this.field_p = this.field_p * 0.95;
        this.field_s = this.field_s - 1;
        this.field_b = this.field_b * 0.95;
        if (this.field_s < 100) {
          this.field_d = this.field_d - 1.0;
          this.field_b = 0.0;
          this.field_p = 0.0;
          if (this.field_h) {
            stackIn_17_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
            return stackIn_17_0;
          }
          stackIn_13_0 = !(0 < this.field_s);
          return stackIn_13_0;
        }
        this.field_d = this.field_d + this.field_b;
        this.field_k = this.field_k + this.field_p;
        if (0.0 > this.field_d) {
          this.field_b = Math.abs(this.field_b);
          if ((double)(-this.field_n.field_h + 640) < this.field_d) {
            this.field_b = -Math.abs(this.field_b);
            if (this.field_k < 0.0) {
              this.field_p = Math.abs(this.field_p);
            }
            if ((double)(430 - this.field_n.field_c) < this.field_k) {
              this.field_p = -Math.abs(this.field_p);
            }
            if (this.field_h) {
              stackIn_33_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
              return stackIn_33_0;
            }
            stackIn_29_0 = !(0 < this.field_s);
            return stackIn_29_0;
          }
          if (this.field_k < 0.0) {
            this.field_p = Math.abs(this.field_p);
            if ((double)(430 - this.field_n.field_c) < this.field_k) {
              this.field_p = -Math.abs(this.field_p);
            }
            if (this.field_h) {
              stackIn_46_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
              return stackIn_46_0;
            }
            stackIn_42_0 = !(0 < this.field_s);
            return stackIn_42_0;
          }
          if (!((double)(430 - this.field_n.field_c) < this.field_k)) {
            if (this.field_h) {
              stackIn_67_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
              return stackIn_67_0;
            }
            stackIn_63_0 = !(0 < this.field_s);
            return stackIn_63_0;
          }
          this.field_p = -Math.abs(this.field_p);
          if (this.field_h) {
            stackIn_57_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
            return stackIn_57_0;
          }
          stackIn_53_0 = !(0 < this.field_s);
          return stackIn_53_0;
        }
        if ((double)(-this.field_n.field_h + 640) < this.field_d) {
          this.field_b = -Math.abs(this.field_b);
          if (this.field_k < 0.0) {
            this.field_p = Math.abs(this.field_p);
            if ((double)(430 - this.field_n.field_c) < this.field_k) {
              this.field_p = -Math.abs(this.field_p);
            }
            if (this.field_h) {
              stackIn_81_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
              return stackIn_81_0;
            }
            stackIn_77_0 = !(0 < this.field_s);
            return stackIn_77_0;
          }
          if (!((double)(430 - this.field_n.field_c) < this.field_k)) {
            if (this.field_h) {
              stackIn_102_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
              return stackIn_102_0;
            }
            stackIn_98_0 = !(0 < this.field_s);
            return stackIn_98_0;
          }
          this.field_p = -Math.abs(this.field_p);
          if (this.field_h) {
            stackIn_92_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
            return stackIn_92_0;
          }
          stackIn_88_0 = !(0 < this.field_s);
          return stackIn_88_0;
        }
        if (!(this.field_k < 0.0)) {
          if (!((double)(430 - this.field_n.field_c) < this.field_k)) {
            if (!this.field_h) {
              stackIn_142_0 = !(0 < this.field_s);
              return stackIn_142_0;
            }
            stackIn_138_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
            return stackIn_138_0;
          }
          this.field_p = -Math.abs(this.field_p);
          if (!this.field_h) {
            stackIn_133_0 = !(0 < this.field_s);
            return stackIn_133_0;
          }
          stackIn_129_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
          return stackIn_129_0;
        }
        this.field_p = Math.abs(this.field_p);
        if (!((double)(430 - this.field_n.field_c) < this.field_k)) {
          if (!this.field_h) {
            stackIn_123_0 = !(0 < this.field_s);
            return stackIn_123_0;
          }
          stackIn_119_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
          return stackIn_119_0;
        }
        this.field_p = -Math.abs(this.field_p);
        if (!this.field_h) {
          stackIn_114_0 = !(0 < this.field_s);
          return stackIn_114_0;
        }
        stackIn_110_0 = !(!(this.field_d < (double)(-this.field_n.field_h)));
        return stackIn_110_0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var2Lifetime3;
        if (param0 != -114) {
          field_t = -8;
          if (!this.field_q) {
            if (this.field_c < 25) {
              var2 = -(this.field_c * 4) + 100;
              var3 = this.field_c * 10;
              wj.c((int)this.field_d + this.field_e, (int)this.field_k + this.field_i, var2, 16777215, var3);
            }
            this.field_n.a((int)this.field_d, (int)this.field_k);
            return;
          }
          if (this.field_s > 62) {
            this.field_n.a((int)this.field_d, (int)this.field_k);
            return;
          }
          var2Lifetime3 = (int)(128.0 * ji.a(65535, (double)this.field_s / 5.0) + 127.0);
          this.field_n.a((int)this.field_d, (int)this.field_k, var2Lifetime3);
          return;
        }
        if (!this.field_q) {
          if (this.field_c < 25) {
            var2Lifetime1 = -(this.field_c * 4) + 100;
            var3Lifetime1 = this.field_c * 10;
            wj.c((int)this.field_d + this.field_e, (int)this.field_k + this.field_i, var2Lifetime1, 16777215, var3Lifetime1);
          }
          this.field_n.a((int)this.field_d, (int)this.field_k);
          return;
        }
        if (this.field_s > 62) {
          this.field_n.a((int)this.field_d, (int)this.field_k);
          return;
        }
        var2Lifetime2 = (int)(128.0 * ji.a(65535, (double)this.field_s / 5.0) + 127.0);
        this.field_n.a((int)this.field_d, (int)this.field_k, var2Lifetime2);
    }

    public static void a(int param0) {
        field_u = null;
        field_j = null;
        field_f = null;
        if (param0 != 9) {
          return;
        }
        field_r = null;
    }

    ib(double param0, double param1, int param2, boolean param3, boolean param4) {
        boolean stackIn_3_1 = false;
        boolean stackIn_6_1 = false;
        double var8_double;
        int var8;
        int var9;
        this.field_s = 200;
        this.field_p = 0.0;
        this.field_d = param0;
        stackIn_3_1 = (param3);
        this.field_q = stackIn_3_1;
        stackIn_6_1 = (param4);
        this.field_h = stackIn_6_1;
        this.field_k = param1;
        this.field_b = 0.0;
        this.field_c = 0;
        if (this.field_q) {
          var8_double = 6.283185307179586 * Math.random();
          this.field_b = 3.5 * ji.a(65535, var8_double);
          this.field_p = 3.5 * pj.a(var8_double, 32768);
        }
        if (this.field_h) {
          this.field_p = -3.0;
        }
        if (0 < param2) {
          this.field_g = param2;
          this.field_n = cj.field_h[this.field_g];
          this.field_m = nd.field_R[this.field_g];
          if (this.field_g == 7) {
            this.c((byte) 65);
          }
          this.field_e = this.field_n.field_d / 2 + this.field_n.field_a;
          this.field_i = this.field_n.field_f + this.field_n.field_k / 2;
          return;
        }
        var8 = -1;
        var9 = 1;
        while (var9 != 0) {
          var8 = hi.a(100, 4, sf.field_d);
          var9 = 0;
          if (var8 < 0) {
            var9 = 1;
            continue;
          }
          if (var8 < 4 &&
            sd.field_a.field_w >= 9) {
            var9 = 1;
            continue;
          }
          if (var8 < 64) {
            continue;
          }
          if (var8 >= 79) {
            continue;
          }
          if (sd.field_a.field_L < 6) {
            continue;
          }
          var9 = 1;
        }
        if (sd.field_a.field_A < 3 * (sd.field_a.field_q + 1) + 1 >> 1) {
          this.field_g = 1;
        } else {
          if (var8 >= 4) {
            if (var8 < 29) {
              this.field_g = 4;
            } else {
              if (var8 < 49) {
                this.field_g = 5;
              } else {
                if (64 > var8) {
                  this.field_g = 6;
                } else {
                  if (79 <= var8) {
                    this.field_g = 2;
                  } else {
                    if (sd.field_a.field_L >= 6) {
                      this.field_g = 2;
                    } else {
                      this.field_g = 7;
                    }
                  }
                }
              }
            }
          } else {
            if (sd.field_a.field_w < 9) {
              this.field_g = 3;
            } else {
              if (var8 < 29) {
                this.field_g = 4;
              } else {
                if (var8 < 49) {
                  this.field_g = 5;
                } else {
                  if (64 > var8) {
                    this.field_g = 6;
                  } else {
                    if (79 <= var8) {
                      this.field_g = 2;
                    } else {
                      if (sd.field_a.field_L >= 6) {
                        this.field_g = 2;
                      } else {
                        this.field_g = 7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        this.field_n = cj.field_h[this.field_g];
        this.field_m = nd.field_R[this.field_g];
        if (this.field_g == 7) {
          this.c((byte) 65);
        }
        this.field_e = this.field_n.field_d / 2 + this.field_n.field_a;
        this.field_i = this.field_n.field_f + this.field_n.field_k / 2;
        return;
    }

    static {
    }
}
