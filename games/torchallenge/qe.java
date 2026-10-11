/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    private boolean field_q;
    private boolean field_S;
    private boolean field_mb;
    int field_a;
    int field_z;
    int field_h;
    private int field_b;
    private boolean field_O;
    private int field_W;
    int field_B;
    int field_H;
    private boolean field_Z;
    int field_db;
    int field_V;
    static int field_R;
    private int field_P;
    boolean field_s;
    private boolean field_jb;
    boolean field_nb;
    private boolean field_k;
    int field_p;
    private int field_M;
    static String field_J;
    int field_L;
    int field_F;
    int field_kb;
    boolean field_ab;
    int field_y;
    private boolean field_fb;
    int field_D;
    int field_d;
    int field_I;
    int field_Q;
    int field_f;
    int field_hb;
    int field_x;
    boolean field_j;
    private boolean field_m;
    private int field_K;
    boolean field_ib;
    static int[] field_A;
    int field_r;
    private boolean field_Y;
    static ka field_E;
    private boolean field_t;
    boolean field_c;
    int field_G;
    int field_o;
    private boolean field_cb;
    boolean field_n;
    private boolean field_v;
    private boolean field_X;
    private boolean field_i;
    private int field_l;
    private boolean field_T;
    boolean field_eb;
    private boolean field_gb;
    private int field_g;
    private int field_lb;
    static String field_bb;
    int field_e;
    boolean field_N;
    int field_w;
    private int field_C;
    int field_u;

    final void x(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 96) {
            this.field_o = 91;
          }
          this.field_N = false;
          this.field_ab = false;
          this.field_j = false;
          if (this.field_F != 3 ||
            !this.field_k) {
            this.field_k = false;
          }
          this.field_c = false;
          this.field_s = false;
          if (this.field_F == 0 &&
            cl.field_z) {
            cl.field_z = false;
            if (2 != vj.field_c) {
              this.field_w = 96;
            }
          }
          this.field_n = false;
          this.field_ib = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.O(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          var4_int = (this.field_I >> 1) + this.field_e;
          var5 = 2048;
          var6 = 0;
          if (var4_int >= var5) {
            var4_int = var4_int - var5;
          }
          if (param0 != 64) {
            this.y(-55);
          }
          var7 = (param2 >> 1) + param1;
          if (var7 >= var5) {
            var7 = var7 - var5;
          }
          if (var4_int >= var7) {
            var6 = -1;
          }
          if ((var4_int < var7 ||
            var9 != 0) &&
            var7 > var4_int) {
            var6 = 1;
          }
          if (var6 > 0) {
            var8 = var7 - var4_int;
            if (var5 >> 1 < var8) {
              var6 = -var6;
              if (var9 != 0 &&
                var6 < 0) {
                var8 = var4_int - var7;
                if ((var5 >> 1) < var8) {
                  var6 = -var6;
                }
              }
            }
          } else {
            if (var6 < 0) {
              var8 = var4_int - var7;
              if ((var5 >> 1) < var8) {
                var6 = -var6;
              }
            }
          }
          stackIn_31_0 = var6;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "qe.FB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6 = 0;
        try {
          var4_int = 0;
          if (param1 != 28) {
            this.field_n = true;
          }
          var5 = 2048;
          if (param0 <= param2) {
            var4_int = param0 + param2 >> 1;
          }
          if ((param0 > param2 ||
            TorChallenge.field_F) &&
            param0 > param2) {
            var6 = var5 + param2 - param0;
            var4_int = param0 + (var6 >> 1);
          }
          if (var5 <= var4_int) {
            var4_int = var4_int - var5;
          }
          stackIn_14_0 = var4_int;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "qe.JD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void H(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          uf.field_k = false;
          ah.field_i = false;
          this.field_D = 0;
          if (param0 != ti.field_d) {
            this.field_kb = 0;
          }
          this.n(96);
          vk.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.EA(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = ma.field_k;
          if (param0 != -1) {
            this.field_j = true;
          }
          var3 = 40;
          var4 = 6;
          var5 = 6;
          if (var3 < (this.field_h * var2_int)) {
            if (var2_int * this.field_h <= var3) {
              return;
            }
            if (var4 > (-var3 + this.field_h * var2_int)) {
              var4 = 2;
            }
            this.field_h = this.field_h - var2_int * var4;
            if (!TorChallenge.field_F) {
              return;
            }
          }
          if ((-(this.field_h * var2_int) + var3) < var5) {
            var5 = 2;
          }
          this.field_h = this.field_h + var5 * var2_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.BD(" + param0 + ')');
        }
    }

    private final void o(byte param0) {
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_113_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var9Lifetime4;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (s.field_m) {
            if (0 < ed.field_c) {
              ed.field_c = ed.field_c - 1;
            }
            if (ed.field_c == 0) {
              s.field_m = false;
            }
          }
          this.g((byte) -85);
          if (13 == this.field_L) {
            this.F(115);
            return;
          }
          if (this.field_G > 0) {
            this.field_G = this.field_G - 1;
          }
          if (0 < hb.field_f) {
            hb.field_f = hb.field_f - 1;
          }
          stackIn_25_0 = (ol.field_g.a(2, wb.field_p.field_e, wb.field_p.field_w, wb.field_p.field_I, 1 - wb.field_p.field_w + wb.field_p.field_z)) ? 0 : 1;
          var2_int = stackIn_25_0;
          var3 = -1;
          var4 = -1;
          if (var2_int == 0) {
            var3 = oi.a((byte) -75, wb.field_p.field_H);
          }
          if (var3 >= 0) {
            var4 = ub.a(var3, 48, wb.field_p.field_e, wb.field_p.field_I);
          }
          stackIn_35_0 = (ol.field_g.a(2, this.field_e, this.field_w, this.field_I, 1 - this.field_w + this.field_z)) ? 0 : 1;
          var5 = stackIn_35_0;
          var6 = -1;
          if (var5 == 0) {
            var6 = oi.a((byte) -58, this.field_H);
          }
          if (var6 >= 0) {
            ub.a(var6, 87, this.field_e, this.field_I);
          }
          var7 = 8 / ((param0 + 53) / 60);
          if (var5 == 0 &&
            this.field_L != 1) {
            if (var6 != 0) {
              if (var6 != 1) {
                if (var6 != 2) {
                  return;
                }
                var8 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
                if (0 < this.field_G) {
                  var9 = -var8;
                  this.field_h = -(this.field_M >> 2);
                  this.field_lb = 0;
                  this.field_L = 1;
                  this.field_Q = var9 * this.field_K;
                }
                this.a(false, this.field_C, true, true, true);
                if (var11 == 0) {
                  return;
                }
              }
              boolean decompiledFrameRemainder2 = true;
              if (!this.f(8) &&
                this.field_lb == 0 &&
                !this.field_ib) {
                var8Lifetime4 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
                if (var8Lifetime4 != 0 &&
                  this.field_a != var8Lifetime4) {
                  this.field_lb = 25;
                }
                decompiledFrameRemainder2 = (var11 != 0);
              }
              if (decompiledFrameRemainder2) {
                if (this.field_lb > 0) {
                  this.field_lb = this.field_lb - 1;
                  if (this.field_lb == 0) {
                    this.field_Q = 0;
                    this.field_a = -this.field_a;
                    if (var11 != 0 &&
                      this.field_lb < 0) {
                      this.field_lb = 0;
                    }
                  }
                } else {
                  if (this.field_lb < 0) {
                    this.field_lb = 0;
                  }
                }
              }
              if (this.field_lb == 0 &&
                !this.field_ib &&
                hb.field_f == 0) {
                this.field_ib = true;
                hb.field_f = 200;
                this.field_L = 8;
                ad.field_a = false;
                this.k((byte) -126);
              }
              if (this.f(8)) {
                this.a(false, 14);
              }
              if (!this.f(8) &&
                this.field_ib) {
                this.a(false, this.field_C, true, true, true);
                stackIn_113_0 = (ol.field_g.a(2, this.field_e, this.field_w, this.field_I, this.field_z - this.field_w + 1)) ? 0 : 1;
                var5 = stackIn_113_0;
                if (var5 != 0) {
                  this.field_ib = false;
                }
              }
              var8Lifetime5 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
              if (this.field_G > 0) {
                var9Lifetime4 = -var8Lifetime5;
                this.field_Q = var9Lifetime4 * this.field_K;
                this.field_lb = 0;
                this.field_L = 1;
                this.field_h = -(this.field_M >> 2);
                this.j(-123);
              }
              if (var11 == 0) {
                return;
              }
            }
            if (var3 != 0 &&
              var2_int == 0) {
              boolean decompiledFrameRemainder1 = true;
              if (this.f(8)) {
                this.a(false, -120);
                decompiledFrameRemainder1 = (var11 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (this.field_lb <= 0) {
                  var8Lifetime1 = this.m(true);
                  if (0 <= var8Lifetime1) {
                    var9Lifetime1 = this.a(var4, -21293, var3, var8Lifetime1);
                    this.field_Q = var9Lifetime1 * this.field_K;
                    this.field_L = 1;
                    this.field_h = this.field_h - this.field_M;
                  }
                  if (var11 != 0) {
                    this.field_lb = this.field_lb - 1;
                    if (this.field_lb == 0) {
                      this.field_a = -this.field_a;
                      this.field_Q = 0;
                    }
                  }
                } else {
                  this.field_lb = this.field_lb - 1;
                  if (this.field_lb == 0) {
                    this.field_a = -this.field_a;
                    this.field_Q = 0;
                  }
                }
              }
              var8Lifetime1Lifetime1 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
              if (0 < this.field_G) {
                var9Lifetime1Lifetime1 = -var8Lifetime1Lifetime1;
                this.field_lb = 0;
                this.field_Q = this.field_K * var9Lifetime1Lifetime1;
                this.field_L = 1;
                this.field_h = -(this.field_M >> 2);
              }
              this.a(true, this.field_C, true, true, true);
              this.j(-123);
              if (var11 == 0) {
                return;
              }
            }
            if (ii.field_e) {
              this.field_Q = (5 * this.field_K >> 2) * this.field_a;
              ii.field_e = false;
              ed.field_c = 200;
              s.field_m = true;
              this.k((byte) -121);
              this.field_L = 9;
            }
            boolean decompiledFrameRemainder0 = true;
            if (this.f(8) ||
              this.field_lb != 0) {
              if ((0 >= this.field_lb) &&
                (decompiledFrameRemainder0 = !(this.field_lb >= 0))) {
                this.field_lb = 0;
                decompiledFrameRemainder0 = (var11 != 0);
              }
              if (decompiledFrameRemainder0) {
                this.field_lb = this.field_lb - 1;
                if (0 == this.field_lb) {
                  this.field_a = -this.field_a;
                  this.field_Q = 0;
                  if (var11 != 0) {
                    var8Lifetime2 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
                    if (var8Lifetime2 != 0 &&
                      ~this.field_a != ~var8Lifetime2) {
                      this.field_lb = 25;
                    }
                  }
                }
              }
            } else {
              var8Lifetime2 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
              if (var8Lifetime2 != 0 &&
                ~this.field_a != ~var8Lifetime2) {
                this.field_lb = 25;
              }
            }
            var8Lifetime3 = this.a(wb.field_p.field_e, wb.field_p.field_I, true);
            if (!this.f(8) &&
              0 == this.field_lb) {
              var9Lifetime2 = 32 * rk.field_a[1];
              if (var8Lifetime3 <= var9Lifetime2) {
                this.field_L = 3;
              }
              if (this.f(8)) {
                this.k((byte) -115);
              }
            }
            var9Lifetime3 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
            if (ni.field_b) {
              ni.field_b = false;
              var10 = -var9Lifetime3;
              this.field_lb = 0;
              this.field_L = 1;
              this.field_Q = var10 * (this.field_K >> 1) * 3;
              this.field_h = -(this.field_M >> 2);
              return;
            }
            this.a(false, this.field_C, true, true, true);
            if (this.f(8)) {
              this.a(false, -118);
            }
            if (var11 == 0) {
              return;
            }
          }
          if (this.field_L != 2 &&
            this.field_L != 1) {
            this.field_L = 2;
          }
          this.a(true, 0, false, true, false);
          this.j(-125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.DA(" + param0 + ')');
        }
    }

    private final void a(ka param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1024 == this.field_u &&
            this.field_H == -1 + ba.field_i.field_a) {
            return;
          }
          param2 = param2 << 4;
          if (param3 <= 33) {
            this.field_t = true;
          }
          param1 = param1 << 4;
          var5_int = 65536 * this.field_W / 200;
          param0.a(0, 0, param2, param1, var5_int, 4096);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("qe.R(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void p(int param0) {
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        RuntimeException var2_ref = null;
        try {
          this.field_Q = 0;
          if (param0 != -8) {
            this.field_eb = false;
          }
          var2 = new qe(this.field_o, this.field_H, 7, this.field_V);
          ef.a(0, var2);
          var2.field_u = this.field_u - 192;
          if (this.field_a > 0) {
            var2.field_B = this.field_B + 256 * (this.field_I >> 1) / 32;
            if ((TorChallenge.field_F) &&
              (this.field_a < 0)) {
              var2.field_B = this.field_B;
            }
          } else {
            if (this.field_a < 0) {
              var2.field_B = this.field_B;
            }
          }
          var2.field_a = this.field_a;
          var2.field_D = 250;
          var2.field_z = var2.field_H * 64 + var2.field_u * 64 / 256;
          var2.field_m = true;
          var2.field_e = var2.field_o * 32 + 32 * var2.field_B / 256;
          this.field_S = true;
          hc.a(54, wb.field_p.field_H, this.field_V, 6, wb.field_p.field_o, dg.field_T[this.field_F], this.field_H, this.field_o);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "qe.KB(" + param0 + ')');
        }
    }

    private final qe o(int param0) {
        Object stackIn_10_0 = null;
        int stackIn_15_0 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (sd.field_d > 0) {
            sd.field_d = sd.field_d - 1;
            decompiledFrameRemainder0 = !(!TorChallenge.field_F);
          }
          if ((decompiledFrameRemainder0) &&
            (0 >= sd.field_d)) {
            stackIn_10_0 = null;
            return (qe) (stackIn_10_0);
          }
          var2_int = wb.field_p.field_e - this.field_e;
          var3 = wb.field_p.field_z - this.field_z;
          var4 = var3 * var3 + var2_int * var2_int;
          var4 = var4 << 8;
          var4 = de.a(107, var4);
          var4 = var4 >> 12;
          var5 = 96;
          var7 = 39 / ((-23 - param0) / 60);
          stackIn_15_0 = (var5 > var4) ? 0 : 1;
          var6 = stackIn_15_0;
          var8 = wb.field_p.field_K * 3 / 4;
          if (var6 != 0) {
            this.field_h = var8 * var3 / var4;
            this.field_Q = var8 * var2_int / var4;
          }
          this.field_z = this.field_z + 64 * this.field_h / 256;
          this.field_e = this.field_Q * 32 / 256 + this.field_e;
          this.field_u = 256 * (this.field_z % 64) / 64;
          this.field_B = 256 * (this.field_e % 32) / 32;
          this.field_o = this.field_e / 32;
          this.field_H = this.field_z / 64;
          var9 = this.a((byte) -50, vc.field_b) ? 1 : 0;
          if (var9 == 0) {
            stackIn_23_0 = null;
            return (qe) (stackIn_23_0);
          }
          var10 = this.i((byte) 116) ? 1 : 0;
          if (var10 == 0) {
            return this;
          }
          stackIn_26_0 = null;
          return (qe) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.VB(" + param0 + ')');
        }
    }

    public static void d(boolean param0) {
        field_J = null;
        field_bb = null;
        if (!param0) {
          return;
        }
        try {
          field_A = null;
          field_E = null;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "qe.CB(" + param0 + ')');
        }
    }

    private final void k(byte param0) {
        try {
          wb.field_p.field_Y = false;
          this.field_kb = 0;
          lc.field_r = false;
          this.field_D = 0;
          if (param0 > -111) {
            field_A = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "qe.WC(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, int param3) {
        int stackIn_49_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[][] var5 = null;
        RuntimeException var5_ref = null;
        int[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var19Lifetime1;
        int var20Lifetime1;
        var21 = TorChallenge.field_F ? 1 : 0;
        try {
          var5 = pa.field_v[1];
          var6 = wf.field_c;
          var7 = 2048;
          var8 = 32 * var6[param3][0];
          if (var8 >= var7) {
            var8 = var8 - var7;
          }
          var9 = 32 * (1 + var6[param3][1]);
          if (var9 >= var7) {
            var9 = var9 - var7;
          }
          var10 = this.b(var8, 28, var9);
          if (param1 != -21293) {
            this.field_Q = 118;
          }
          var12 = s.field_i[1];
          var16 = 0;
          var17 = -1;
          var18 = -1;
          var19 = -1;
          var20 = 0;
          var11 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var11 >= var12))) {
            var13 = 32 * var5[var11][0];
            stackIn_49_0 = var7;
            if (var21 == 0) {
              if (stackIn_49_0 <= var13) {
                var13 = var13 - var7;
              }
              var14 = 32 + 32 * var5[var11][1];
              if (var14 >= var7) {
                var14 = var14 - var7;
              }
              var15 = this.b(var13, 28, var14);
              var19Lifetime1 = -var10 + var15;
              var20Lifetime1 = 1;
              if (var15 < var10) {
                var19Lifetime1 = -var19Lifetime1;
                var20Lifetime1 = -1;
              }
              if (var7 / 2 < var19Lifetime1) {
                var19Lifetime1 = var7 - var19Lifetime1;
                var20Lifetime1 = -var20Lifetime1;
              }
              if (var17 < 0 && (1 != param2 ||
                var11 != param0)) {
                var17 = var11;
                var18 = var19Lifetime1;
                var16 = var20Lifetime1;
              }
              if (var18 > var19Lifetime1 && (param2 != 1 ||
                ~param0 != ~var11)) {
                var18 = var19Lifetime1;
                var16 = var20Lifetime1;
                var17 = var11;
              }
              var11++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_49_0 = var16;
          }
          return stackIn_49_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5_ref), "qe.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void m(byte param0) {
        boolean discarded$0 = false;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        boolean stackIn_91_0 = false;
        boolean stackIn_103_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[][] var3 = null;
        int var3_int = 0;
        int[][] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
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
        int var18Lifetime1;
        int var14Lifetime2;
        int var18Lifetime2;
        var21 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = this.a((byte) -50, fk.field_s) ? 1 : 0;
          if (var2_int == 0) {
            var3_int = fk.field_s[0][0] * 32;
            var4_int = 32 * fk.field_s[0][1] + 32;
            var5 = fk.field_s[1][0] * 64;
            var6 = 64 * (fk.field_s[1][1] + 1);
            var7 = this.field_e;
            var8 = this.field_I + var7;
            var9 = this.field_z;
            var10 = var9 - this.field_w;
            var11 = 0;
            var12 = 0;
            var13 = 40;
            if (var3_int >= var7) {
              this.field_a = 1;
              var11 = 1;
            }
            if (var8 >= var4_int) {
              this.field_a = -1;
              var11 = 1;
            }
            if (var5 >= var10) {
              var12 = 1;
              ma.field_k = 1;
            }
            if (var6 <= var9) {
              var12 = 1;
              ma.field_k = -1;
            }
            if (var11 == 0) {
              this.field_Q = 0;
            }
            if (var11 != 0 ||
              var21 != 0) {
              this.field_Q = this.field_K * this.field_a;
            }
            if (var12 == 0) {
              this.field_h = 0;
            }
            if (var12 != 0 ||
              var21 != 0) {
              this.field_h = ma.field_k * var13;
            }
            if (var11 != 0) {
              var14 = 0;
              var15 = 0;
              discarded$0 = this.a(var14 != 0, (byte) -127, var15 != 0);
            }
            if (var12 != 0) {
              var14Lifetime2 = 1;
              this.a(true, var14Lifetime2 != 0);
            }
            return;
          }
          var3 = ae.field_j;
          var4 = pg.field_n;
          if (param0 < 106) {
            this.C(92);
          }
          var5Lifetime1 = (1 + var3[0][1]) * 32;
          var6Lifetime1 = var3[1][0] * 32;
          var9Lifetime1 = this.field_e;
          var10Lifetime1 = this.field_I + var9Lifetime1;
          var11Lifetime1 = this.field_z;
          var12Lifetime1 = -this.field_w + var11Lifetime1;
          var13Lifetime1 = 16;
          var14Lifetime1 = -1;
          var15Lifetime1 = var12Lifetime1 + var11Lifetime1 >> 1;
          var16 = 40;
          var17 = 0;
          if (var9Lifetime1 >= var5Lifetime1 &&
            var6Lifetime1 >= var10Lifetime1) {
            var17 = 1;
          }
          boolean decompiledFrameCompleted0 = true;
          if (var17 != 0) {
            var17 = 0;
            var18 = 0;
            while (var18 < 2) {
              var7Lifetime1 = var4[1 + var18][0] * 64;
              var8Lifetime1 = var7Lifetime1 + var13Lifetime1;
              stackIn_81_0 = ~var7Lifetime1;
              stackIn_81_1 = ~var12Lifetime1;
              if (var21 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_81_0 <= stackIn_81_1 &&
                var11Lifetime1 >= var7Lifetime1) {
                var17 = 1;
              }
              var14Lifetime1 = var8Lifetime1 + var7Lifetime1 >> 1;
              if (var12Lifetime1 <= var8Lifetime1 &&
                var8Lifetime1 <= var11Lifetime1) {
                var17 = 1;
              }
              if (var17 == 0) {
                var18++;
                continue;
              }
              break;
            }
            if ((decompiledFrameCompleted0) &&
              (var17 != 0)) {
              if (var14Lifetime1 >= var15Lifetime1) {
                ma.field_k = -1;
              }
              this.field_Q = 0;
              if (var15Lifetime1 > var14Lifetime1) {
                ma.field_k = 1;
              }
              this.field_h = ma.field_k * var16;
              var18Lifetime2 = 1;
              this.a(true, var18Lifetime2 != 0);
              return;
            }
          }
          if (decompiledFrameCompleted0) {
            var18Lifetime1 = this.b(false, -1);
            stackIn_81_0 = -1;
            stackIn_81_1 = ~var18Lifetime1;
          }
          if (stackIn_81_0 >= stackIn_81_1) {
            kf.field_d = 1;
            if (!rk.field_e) {
              stackIn_91_0 = !(rk.field_e);
              rk.field_e = stackIn_91_0;
            }
            return;
          }
          var19 = this.b((byte) 109, false);
          if (var19 < 0) {
            ma.field_k = 1;
            this.field_h = ma.field_k * var16;
            var20 = 1;
            this.a(true, var20 != 0);
            return;
          }
          kf.field_d = 0;
          if (!rk.field_e) {
            stackIn_103_0 = !(rk.field_e);
            rk.field_e = stackIn_103_0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.LB(" + param0 + ')');
        }
    }

    final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_F != 23 &&
            this.field_F != 24) {
            if (param0 != 0) {
              return;
            }
            boolean decompiledFrameRemainder1 = true;
            var2_int = 1;
            if (this.field_L == 13 ||
              this.field_O ||
              this.field_db <= 0) {
              var2_int = 4;
              decompiledFrameRemainder1 = (var4 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (12 != this.field_L) {
                if (this.field_L == 2 ||
                  this.field_L == 0 &&
                  this.field_eb) {
                  var2_int = 3;
                  decompiledFrameRemainder1 = (var4 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if ((this.field_F == 7 ||
                    !(this.field_D > -ik.field_d[2][dg.field_T[this.field_F]][this.field_V] + 200) ||
                    this.field_L != 0) &&
                    this.field_L != 1) {
                    if (this.field_L == 0) {
                      var2_int = 1;
                      if (var4 != 0) {
                        var2_int = 2;
                        var2_int = 1;
                      }
                    }
                  } else {
                    var2_int = 2;
                    if (var4 != 0) {
                      var2_int = 1;
                    }
                  }
                }
              } else {
                var2_int = 1;
              }
            }
            if (var2_int != 4) {
              if (this.field_F == 2 && (112 < this.field_D ||
                this.field_S)) {
                var2_int = 5;
              }
              boolean decompiledSharedTail0 = (3 != this.field_F || ((!(this.field_D > 112) ||
                !(this.field_H < wb.field_p.field_H)) &&
                !(this.field_T)));
              if (!decompiledSharedTail0) {
                var2_int = 6;
                decompiledSharedTail0 = (var4 != 0);
              }
              if ((decompiledSharedTail0) && (3 == this.field_F &&
                2 == this.field_V &&
                this.field_k)) {
                var2_int = 7;
              }
            }
            boolean decompiledFrameCompleted0 = true;
            if (~this.field_g != ~var2_int) {
              this.field_p = ef.field_k;
              this.field_g = var2_int;
              if (7 == this.field_g) {
                var3 = 0;
                while (!(h.field_b[7][dg.field_T[3]][0] <= var3)) {
                  ak.field_j[var3][0] = -1;
                  var3++;
                  if (var4 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
            }
            if (decompiledFrameCompleted0) {
              this.field_P = (ef.field_k - this.field_p) / ik.field_d[this.field_g][dg.field_T[this.field_F]][this.field_V];
            }
            if (qh.field_O[this.field_g][dg.field_T[this.field_F]][this.field_V]) {
              this.field_P = this.field_P % h.field_b[this.field_g][dg.field_T[this.field_F]][this.field_V];
            }
            if (this.field_P >= h.field_b[this.field_g][dg.field_T[this.field_F]][this.field_V]) {
              this.field_P = -1 + h.field_b[this.field_g][dg.field_T[this.field_F]][this.field_V];
            }
            boolean decompiledFrameRemainder0 = true;
            if (2 != this.field_g ||
              this.field_L != 1) {
              if (this.field_g == 2) {
                this.field_P = 0;
                decompiledFrameRemainder0 = (var4 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.field_g != 3 ||
                  2 != this.field_L) {
                  if (this.field_g == 3) {
                    if (this.field_v) {
                      this.field_p = ef.field_k;
                      this.field_v = false;
                    }
                    if ((ef.field_k - this.field_p) > ik.field_d[this.field_g][dg.field_T[this.field_F]][this.field_V]) {
                      this.field_eb = false;
                    }
                    this.field_P = 1;
                    if (var4 != 0) {
                      this.field_v = true;
                      this.field_P = 0;
                      this.field_P = 1;
                    }
                  }
                } else {
                  this.field_v = true;
                  this.field_P = 0;
                  if (var4 != 0) {
                    this.field_P = 1;
                  }
                }
              }
            } else {
              this.field_P = 1;
            }
            if (this.field_P >= h.field_b[this.field_g][dg.field_T[this.field_F]][this.field_V] &&
              h.field_b[this.field_g][dg.field_T[this.field_F]][this.field_V] > 0) {
              this.field_P = h.field_b[this.field_g][dg.field_T[this.field_F]][this.field_V] - 1;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.IB(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        try {
          int var2_int = -5 / ((17 - param0) / 63);
          this.x(96);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "qe.AB(" + param0 + ')');
        }
    }

    private final boolean i(byte param0) {
        int stackIn_67_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != 116) {
            this.field_Q = 16;
          }
          if (this.field_F == 0) {
            return false;
          }
          if (this.field_G > 0 &&
            this.field_F != 6) {
            this.field_jb = false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_L != 13 &&
            this.field_jb &&
            null != wb.field_p &&
            wb.field_p.field_db > 0) {
            var2_int = this.field_e;
            var3 = -this.field_w + this.field_z;
            var4 = this.field_I;
            var5 = this.field_w;
            var6 = wb.field_p.field_e + 8;
            if (-var2_int + var6 > 1024) {
              var6 -= 2048;
            }
            if (var6 - var2_int < -1024) {
              var6 += 2048;
            }
            var7 = wb.field_p.field_z - wb.field_p.field_w;
            var8 = wb.field_p.field_I - 16;
            var9 = wb.field_p.field_w;
            if (wb.field_p.field_L != 19 &&
              wb.field_p.field_L != 20 &&
              wb.field_p.field_L != 18) {
              if (ec.field_e) {
                return false;
              }
              if (this.field_F == 23) {
                var2_int += 16;
                var3 += 16;
                var4 -= 32;
                var5 -= 32;
              }
              boolean decompiledFrameRemainder1 = true;
              if (2 == vj.field_c &&
                cl.field_z &&
                this.field_a != wb.field_p.field_a && (this.field_F != 7 ||
                this.field_V != 2)) {
                stackIn_67_0 = 1;
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_67_0 = 0;
              }
              var10 = stackIn_67_0;
              decompiledFrameRemainder0 = !(!o.a(var9, var3, var8, var4, var5, var6, var2_int, (byte) 9, var7));
              if (decompiledFrameRemainder0) {
                this.field_Q = 0;
                if (!(wb.field_p.field_G > 0) ||
                  !(wb.field_p.field_G > 50) &&
                  this.field_F == 3) {
                  if (var10 == 0) {
                    wb.field_p.field_G = wb.field_p.field_G + 50;
                    if (mj.field_b) {
                      if (kc.field_w != null) {
                        kc.field_w[0][0] = 0;
                      }
                      lj.field_b = 0;
                      hf.field_c = 0;
                      fh.field_d = 0;
                      vd.field_b = true;
                      dk.field_a = 0;
                      mj.field_b = false;
                    }
                    wb.field_p.field_db = wb.field_p.field_db - 1;
                    if (wb.field_p.field_db <= 0) {
                      if (!(wb.field_p.field_db > 0)) {
                        wh.a(vj.field_c, 10, -125);
                        if (var11 != 0) {
                          ei.a((byte) 66, wb.field_p.field_db % 3 + 11, vj.field_c);
                        }
                      }
                    } else {
                      ei.a((byte) 66, wb.field_p.field_db % 3 + 11, vj.field_c);
                    }
                    jj.field_d = false;
                    wb.field_p.field_L = 12;
                    if (wb.field_p.field_db > 0 &&
                      this.field_F == 3) {
                      wb.field_p.field_G = wb.field_p.field_G + 50;
                      wb.field_p.field_db = wb.field_p.field_db - 1;
                    }
                    wb.field_p.field_D = 0;
                  }
                  if (var3 <= var7) {
                    wb.field_p.field_h = -20;
                  }
                  wb.field_p.field_Q = 64 * this.field_a;
                  if (var2_int >= var6) {
                    this.field_a = -1;
                  }
                  if (var2_int < var6 ||
                    var11 != 0) {
                    this.field_a = 1;
                  }
                  kl.field_a = true;
                  if (this.field_F == 6) {
                    this.field_a = -this.field_a;
                  }
                }
                decompiledFrameRemainder0 = (this.field_cb);
                if (decompiledFrameRemainder0) {
                  return true;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.B(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_h < 64) {
            this.field_h = this.field_h + 1;
          }
          this.field_u = this.field_u + this.field_h;
          if (this.field_u < 0) {
            this.field_u = this.field_u + 256;
            this.field_H = this.field_H - 1;
            if (var4 != 0 &&
              this.field_u >= 256) {
              this.field_H = this.field_H + 1;
              this.field_u = this.field_u - 256;
            }
          } else {
            if (this.field_u >= 256) {
              this.field_H = this.field_H + 1;
              this.field_u = this.field_u - 256;
            }
          }
          if (!param0) {
            this.a((byte) 54);
          }
          var3_int = this.field_h;
          while (ol.field_g.a(2, 32 * this.field_o + this.field_B * 32 / 256, this.field_w, this.field_I, -this.field_w + (this.field_u * 64 / 256 + 64 * this.field_H))) {
            if (var4 != 0) {
              return;
            }
            if (var3_int > 0) {
              this.field_u = this.field_u - 1;
            } else {
              if (var3_int < 0) {
                this.field_u = this.field_u + 1;
              }
            }
            if (this.field_u >= 0) {
              if (this.field_u >= 256) {
                this.field_H = this.field_H + 1;
                this.field_u = this.field_u - 256;
              }
            } else {
              this.field_H = this.field_H - 1;
              this.field_u = this.field_u + 256;
            }
            if (var3_int > 0) {
              this.field_h = 0;
              if (this.field_F == 0) {
                ve.field_a.field_h = var3_int;
              }
              if (!param1) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_L == 2) {
                  this.field_eb = true;
                  if (this.field_F == 0) {
                    wh.a(vj.field_c, 1, -113);
                  } else {
                    if (28 != this.field_F) {
                      if (!(!vg.a(this.field_F, -1))) {
                        qa.a(this.field_o, wb.field_p.field_H, dg.field_T[this.field_F], this, this.field_H, -1, 4, wb.field_p.field_o, 25, this.field_V);
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      jc.b(fh.field_e, 1, 1);
                    }
                  }
                }
                this.field_L = 0;
                kl.field_a = false;
                if (this.field_F != 5) {
                  this.field_D = 0;
                }
              }
            } else {
              if (this.field_h < 64) {
                this.field_h = this.field_h + 1;
              }
            }
            if (this.field_H >= 0 &&
              this.field_H < ol.field_g.field_a) {
              continue;
            }
            var3_int = -var3_int;
          }
          this.field_z = this.field_u * 64 / 256 + this.field_H * 64;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_55_0Lifetime1;
        int stackIn_55_1Lifetime1;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 > -16) {
            return;
          }
          var3_int = this.field_o;
          var3_int++;
          if (64 <= var3_int) {
            var3_int -= 64;
          }
          var4 = var3_int;
          stackIn_10_0 = ic.field_E[var3_int];
          stackIn_10_1 = this.field_H;
          if (param1) {
            stackIn_11_2 = 31;
          } else {
            stackIn_11_2 = 0;
          }
          stackIn_10_0[stackIn_10_1] = stackIn_11_2;
          var3_int++;
          if (var3_int >= 64) {
            var3_int -= 64;
          }
          stackIn_18_0 = ic.field_E[var3_int];
          stackIn_18_1 = this.field_H;
          if (param1) {
            stackIn_19_2 = 31;
          } else {
            stackIn_19_2 = 0;
          }
          stackIn_18_0[stackIn_18_1] = stackIn_19_2;
          var5 = var3_int;
          var3_int++;
          if (var3_int >= 64) {
            var3_int -= 64;
          }
          if (!param1) {
            var10 = 0;
            do {
              if (w.field_m <= var10) {
                return;
              }
              var6 = cb.field_c[var10][0];
              var8 = cb.field_c[var10][1];
              var9 = cb.field_c[var10][3];
              var7 = cb.field_c[var10][2];
              if (var4 == var6 &&
                var8 == this.field_H ||
                var6 == var5 &&
                ~this.field_H == ~var8) {
                cb.field_c[var10][0] = -1;
                cb.field_c[var10][1] = -1;
                cb.field_c[var10][2] = -1;
                cb.field_c[var10][3] = -1;
              }
              if (~var4 == ~var7 &&
                ~var9 == ~this.field_H ||
                ~var5 == ~var7 &&
                ~this.field_H == ~var9) {
                cb.field_c[var10][0] = -1;
                cb.field_c[var10][1] = -1;
                cb.field_c[var10][2] = -1;
                cb.field_c[var10][3] = -1;
              }
              var10++;
            } while (var11 == 0);
            return;
          }
          var10 = 0;
          L14: while (true) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (w.field_m > var10) {
              var8 = cb.field_c[var10][1];
              var9 = cb.field_c[var10][3];
              var6 = cb.field_c[var10][0];
              var7 = cb.field_c[var10][2];
              stackIn_55_0 = ~var6;
              stackIn_55_1 = ~var4;
              if (var11 != 0) {
                if (stackIn_55_0 < stackIn_55_1) {
                  var6 = cb.field_c[var10][0];
                  stackIn_65_0 = ~var6;
                  stackIn_65_1 = -1;
                  break L14;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_55_0 == stackIn_55_1 &&
                  this.field_H == var8) {
                  return;
                }
                if (var5 == var6 &&
                  var8 == this.field_H) {
                  return;
                }
                if (~var4 == ~var7 &&
                  ~this.field_H == ~var9) {
                  return;
                }
                if (~var7 == ~var5 &&
                  ~this.field_H == ~var9) {
                  return;
                }
                var10++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var10 = 0;
              while (true) {
                stackIn_55_0Lifetime1 = ~w.field_m;
                stackIn_55_1Lifetime1 = ~var10;
                if (stackIn_55_0Lifetime1 >= stackIn_55_1Lifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var6 = cb.field_c[var10][0];
                stackIn_65_0 = ~var6;
                stackIn_65_1 = -1;
                if (var11 != 0) {
                  break L14;
                }
                if (stackIn_65_0 > stackIn_65_1) {
                  break;
                }
                var10++;
              }
              if (decompiledFrameCompleted0) {
                cb.field_c[var10][0] = var4;
                cb.field_c[var10][1] = this.field_H;
                cb.field_c[var10][2] = var5;
                cb.field_c[var10][3] = this.field_H;
                return;
              }
            }
            stackIn_65_0 = -1;
            stackIn_65_1 = ~w.field_m;
            break;
          }
          if (stackIn_65_0 <= stackIn_65_1) {
            return;
          }
          cb.field_c[0][1] = this.field_H;
          cb.field_c[0][2] = var5;
          cb.field_c[0][0] = var4;
          cb.field_c[0][3] = this.field_H;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.JC(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean D(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.field_e - 32;
          var3 = -this.field_w + this.field_z;
          var4 = 64 + this.field_I;
          var5 = this.field_w + 128;
          var6 = wb.field_p.field_e;
          if (-var2_int + var6 > 1024) {
            var6 -= 2048;
          }
          if (~(-var2_int + var6) > param0) {
            var6 += 2048;
          }
          var7 = wb.field_p.field_z - this.field_w;
          var8 = wb.field_p.field_I;
          var9 = wb.field_p.field_w;
          if (!o.a(var9, var3, var8, var4, var5, var6, var2_int, (byte) 9, var7)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.UA(" + param0 + ')');
        }
    }

    private final void r(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qe var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = ca.field_a.length;
          var3 = ca.field_a[param0 + var2_int];
          var4 = var3[0] << 3;
          var5 = var3[1] << 3;
          var6 = ki.field_e[dg.field_T[23]];
          var7 = new qe(this.field_o, this.field_H, 23, 0);
          var7.field_e = this.field_e;
          var7.field_z = var5 + (-this.field_w + this.field_z);
          if (0 > this.field_a) {
            var7.field_e = var7.field_e + (this.field_I - var4 - var6);
            var7.field_a = -1;
            if (TorChallenge.field_F) {
              var7.field_e = var7.field_e + var4;
            }
          } else {
            var7.field_e = var7.field_e + var4;
          }
          var7.field_cb = true;
          var7.field_B = 256 * (var7.field_e % 32) / 32;
          var7.field_u = 256 * (var7.field_z % 64) / 64;
          var7.field_H = var7.field_z / 64;
          var7.field_o = var7.field_e / 32;
          ef.a(0, var7);
          sd.field_d = 350;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.I(" + param0 + ')');
        }
    }

    private final void l(byte param0) {
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2_int = r.field_a[fh.field_e];
          stackIn_4_0 = (fc.field_o < var2_int) ? 0 : 1;
          var3 = stackIn_4_0;
          this.g((byte) -69);
          if (param0 < 69) {
            this.a(41, 60, 113, (byte) -4, 97);
          }
          if (13 == this.field_L) {
            this.F(59);
            return;
          }
          if (this.field_G > 0) {
            this.field_G = this.field_G - 1;
            if (1 == kf.field_d) {
              this.field_L = 0;
              this.field_D = 0;
              this.field_kb = 0;
              this.f(true);
              return;
            }
          }
          if (0 == kf.field_d) {
            var4 = af.a(-4275, this.field_L) ? 1 : 0;
            if (var3 == 0 &&
              var4 != 0) {
              this.field_D = 0;
              this.field_L = 0;
              this.field_kb = 0;
              wb.field_p.field_Y = false;
            }
            this.B(127);
            this.y(0);
            return;
          }
          if (kf.field_d == 1) {
            if (ad.field_a) {
              this.i(29647);
            }
            this.y(0);
            return;
          }
          if (kf.field_d != 2) {
            return;
          }
          this.m((byte) 127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.C(" + param0 + ')');
        }
    }

    private final qe h(int param0, int param1) {
        int stackIn_24_0 = 0;
        Object stackIn_82_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 != 0) {
            this.field_K = -75;
          }
          var3_int = -this.field_w + (64 * this.field_H - param0 + 64 * this.field_u / 256);
          var4 = -param0 + (this.field_f * 64 - this.field_w);
          var5 = 0;
          if (var4 < 2 * -this.field_w) {
            var5 = 1;
          }
          if ((480 + this.field_w * 2) < var4) {
            var5 = 1;
          }
          if (wb.field_p != null) {
            var6 = Math.abs(this.field_r - wb.field_p.field_o);
            if (32 < var6) {
              var6 = -var6 + 64;
            }
            if (var6 > 24) {
              var5 = 1;
            }
          }
          if (this == wb.field_p) {
            stackIn_24_0 = (gl.field_k <= 0) ? 0 : 1;
            var5 = stackIn_24_0;
          }
          if (!this.field_Z ||
            this.field_L != 14 ||
            !(wb.field_p.field_db > 0)) {
            if (this.field_F != 14 &&
              this.field_F != 18 ||
              (14 != this.field_L ||
              !(wb.field_p.field_db <= 0))) {
              if (this.field_Z &&
                this.field_L == 14 &&
                !(wb.field_p.field_db > 0)) {
                var5 = 0;
                this.field_l = 50;
                if (var7 != 0) {
                  this.field_l = 50;
                  var5 = 1;
                  var5 = 0;
                  this.field_l = 50;
                }
              }
            } else {
              this.field_l = 50;
              var5 = 1;
              if (var7 != 0) {
                var5 = 0;
                this.field_l = 50;
              }
            }
          } else {
            var5 = 0;
            this.field_l = 50;
          }
          if (null == wb.field_p) {
            this.field_l = 50;
            var5 = 1;
            var3_int = 481;
          }
          if ((var3_int < (-this.field_w * 2) ||
            480 < var3_int ||
            this.field_L == 14 ||
            this.field_F == 0 &&
            this.field_L == 13) && var5 != 0) {
            if (this.field_f == -1) {
              stackIn_82_0 = null;
              return (qe) (stackIn_82_0);
            }
            this.field_l = this.field_l + 1;
            if (50 < this.field_l) {
              if (this.field_F == 6 &&
                13 != this.field_L) {
                this.a((byte) -19, false);
              }
              aj.a((byte) -101, this, this.field_y);
              this.field_H = this.field_f;
              this.field_o = this.field_r;
              kf.a(this, this.field_y, param1 ^ 8);
              this.field_l = 0;
              this.field_db = this.field_d;
              this.field_h = 0;
              this.field_L = 0;
              this.field_W = 0;
              this.field_Q = 0;
              this.field_B = 0;
              this.field_u = 0;
              this.field_D = 0;
              if (this.field_F == 0) {
                kl.field_a = false;
                if (this.field_L == 13) {
                  this.field_L = 0;
                }
              }
              this.field_u = 256;
              this.field_G = 0;
              this.x(param1 + 96);
              this.field_b = 0;
              this.field_a = 0;
              this.c(true);
              this.field_z = 64 * this.field_u / 256 + this.field_H * 64;
              this.field_e = 32 * this.field_o + 32 * this.field_B / 256;
            }
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.NB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void u(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_gb = true;
          this.field_fb = true;
          if (this.field_a == 0) {
            this.field_a = 1;
          }
          this.field_jb = false;
          this.field_mb = true;
          if (!ja.a((byte) 121, this.field_L) && (!this.field_c ||
            this.field_a <= 0 ||
            this.field_Q <= 0) && (!this.field_N ||
            this.field_a >= 0 ||
            this.field_Q >= 0)) {
            if (this.field_c) {
              this.field_a = -1;
              if (TorChallenge.field_F &&
                this.field_N) {
                this.field_a = 1;
              }
            } else {
              if (this.field_N) {
                this.field_a = 1;
              }
            }
          }
          if (dk.field_a >= 4) {
            if (hf.field_c == 0) {
              mj.field_b = true;
              vd.field_b = true;
              hf.field_c = 250;
            }
            fh.field_d = 0;
            dk.field_a = 4;
            if (hf.field_c > 0) {
              hf.field_c = hf.field_c - 1;
            }
            if (hf.field_c == 0) {
              mj.field_b = false;
              lj.field_b = 0;
              vd.field_b = true;
              if (kc.field_w != null) {
                kc.field_w[0][0] = 0;
              }
              fh.field_d = 0;
              dk.field_a = 0;
            }
          }
          if (this.field_L != 0 &&
            this.field_L != 9) {
            gl.field_f = false;
            tk.field_P = false;
          }
          if (param0 > -50) {
            this.r(96);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.IA(" + param0 + ')');
        }
    }

    private final boolean d(int param0, int param1) {
        int stackIn_34_0 = 0;
        boolean stackIn_59_0 = false;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_58_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 != -1 &&
            param1 != 1) {
            return false;
          }
          var3_int = this.field_H;
          this.field_h = this.field_h + param1;
          var4 = this.field_u;
          this.field_u = this.field_u + this.field_h;
          if (0 >= this.field_G && (this.field_L == 14 ||
            this.field_L == 13)) {
            this.field_G = this.field_G + 10;
          }
          L4: while (true) {
            if (this.field_u * param1 > 256) {
              stackIn_34_0 = ~param1;
              if (var9 != 0) {
                break L4;
              }
              if (stackIn_34_0 == 0 &&
                this.field_H > 0 ||
                param1 == 1 &&
                !(this.field_H >= ba.field_i.field_a - 1)) {
                this.field_u = this.field_u + -param1 * 256;
                this.field_H = this.field_H + param1;
                continue;
              }
            }
            stackIn_34_0 = 1024 * param1;
            break;
          }
          if (stackIn_34_0 < this.field_u && (param1 == -1 &&
            0 >= this.field_H ||
            param1 == 1 &&
            !((ba.field_i.field_a - 1) > this.field_H))) {
            this.field_u = 1024 * param1;
          }
          boolean decompiledFrameCompleted0 = true;
          if (22 == this.field_F) {
            var5 = 64 * var3_int + (var4 * 64 / 256 + this.field_w);
            var6 = this.field_w + (64 * this.field_H + 64 * this.field_u / 256);
            var7 = 32 * this.field_o + 32 * this.field_B / 256;
            if (var7 >= 2048) {
              var7 -= 2048;
            }
            var8 = var5;
            while (var6 > var8) {
              stackOut_58_0 = ol.field_g.a(2, var7, this.field_w, this.field_I, var8 - this.field_w);
              stackIn_80_0 = stackOut_58_0 ? 1 : 0;
              stackIn_59_0 = stackOut_58_0;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (!stackIn_59_0) {
                if (this.field_i) {
                  this.field_X = true;
                }
              } else {
                if (!this.field_i) {
                  this.field_i = true;
                }
                if (this.field_X) {
                  var8 = var8 + (this.field_w >> 1);
                  this.field_u = var8 % 64 * 256 / 64;
                  this.field_H = var8 / 64;
                  return true;
                }
              }
              var8 = var8 + this.field_w;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_80_0 = this.field_F;
          }
          if (stackIn_80_0 == 0 &&
            this.field_H >= ol.field_g.field_a &&
            this.field_db <= 0) {
            bd.field_l = true;
          }
          this.field_z = 64 * this.field_u / 256 + this.field_H * 64;
          var5Lifetime1 = 7 / ((-12 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.A(" + param0 + ',' + param1 + ')');
        }
    }

    final qe c(byte param0, int param1) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        qe discarded$3 = null;
        qe stackIn_10_0 = null;
        qe stackIn_12_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_58_0 = 0;
        int stackIn_59_1 = 0;
        Object stackIn_166_0 = null;
        Object stackIn_277_0 = null;
        RuntimeException decompiledCaughtException = null;
        qe var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        qe var3Lifetime1;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_x >= 0) {
            this.field_x = this.field_x - 1;
          }
          if (this.field_F == 23) {
            var3 = this.o(param0 ^ 39);
            stackIn_12_0 = var3;
            return stackIn_12_0;
          }
          if (this.field_F == 24) {
            var3Lifetime1 = this.g(param0 + 11198);
            stackIn_10_0 = var3Lifetime1;
            return stackIn_10_0;
          }
          if (this.field_F == 28 &&
            0 == fh.field_e) {
            this.E(24888);
            this.k(-47);
            return this;
          }
          if (this.field_F == 28 &&
            fh.field_e == 1) {
            this.l((byte) 122);
            this.k(123);
            return this;
          }
          if (this.field_F == 28 &&
            fh.field_e == 2) {
            this.o((byte) 39);
            this.k(10);
            return this;
          }
          this.K(param0 ^ -30);
          this.e((byte) -70);
          this.g((byte) -113);
          if (this.h(param1, 0) == null) {
            stackIn_39_0 = null;
            return (qe) (stackIn_39_0);
          }
          if (param0 != 29) {
            this.field_fb = true;
          }
          if (0 == this.field_F) {
            this.u(-91);
          }
          if (vg.a(this.field_F, -1)) {
            this.b((byte) -121, this.field_F);
            this.b(359, this.field_F);
          }
          if (this.field_F == 28) {
            this.a((byte) -35);
            this.b((byte) -66);
          }
          this.d(-15777);
          if (28 == this.field_F) {
            stackIn_58_0 = 0;
            if (this.field_jb) {
              stackIn_59_1 = 0;
            } else {
              stackIn_59_1 = 1;
            }
            if (stackIn_58_0 != stackIn_59_1) {
              this.field_jb = true;
            }
          }
          this.field_O = this.i((byte) 116);
          if (this.field_O) {
            this.j(false);
          }
          if (this.field_lb > 0) {
            this.field_lb = this.field_lb - 1;
          }
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          var4 = this.field_L;
          if ((14 != var4 ||
            var5 != 0) &&
            (decompiledFrameRemainder7 = (13 != var4))) {
            boolean decompiledFrameRemainder5 = true;
            boolean decompiledFrameRemainder4 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            if (var4 == 0 &&
              var5 == 0) {
              if (this.field_fb &&
                !ol.field_g.a(2, this.field_e, this.field_w, this.field_I, -this.field_w + this.field_z + 1) &&
                22 != this.field_F) {
                this.field_L = 2;
                if (!(!vg.a(this.field_F, param0 ^ -30))) {
                  qa.a(this.field_o, wb.field_p.field_H, dg.field_T[this.field_F], this, this.field_H, -1, 5, wb.field_p.field_o, 25, this.field_V);
                }
              } else {
                boolean decompiledFrameRemainder9 = true;
                if (this.field_F == 0) {
                  if (0 != this.field_F ||
                    vj.field_c != 2 ||
                    !kl.field_a) {
                    if (!this.field_c &&
                      !this.field_N) {
                      this.field_j = true;
                    } else {
                      if (!this.field_c ||
                        this.field_Q <= 0) {
                        if (this.field_N &&
                          this.field_Q < 0) {
                          this.field_j = true;
                        } else {
                          if (0 > this.field_a &&
                            this.field_Q < -this.field_K) {
                            this.field_j = true;
                          } else {
                            if ((!(this.field_a <= 0)) &&
                              (!(this.field_Q <= this.field_K))) {
                              this.field_j = true;
                            }
                          }
                        }
                      } else {
                        this.field_j = true;
                      }
                    }
                    decompiledFrameRemainder9 = false;
                  }
                  else {
                    if (this.field_Q == 0) {
                      kl.field_a = false;
                    } else {
                      this.field_j = true;
                    }
                  }
                }
                boolean decompiledFrameRemainder8 = true;
                if (this.field_j) {
                  if (this.field_K < this.field_a * this.field_Q) {
                    this.field_j = false;
                  }
                  this.field_Q = 7 * this.field_Q >> 3;
                  if (this.field_Q >= 0) {
                    if (!(this.field_Q <= 0)) {
                      this.field_Q = this.field_Q - 1;
                    }
                    decompiledFrameRemainder8 = false;
                  }
                  else {
                    this.field_Q = this.field_Q + 1;
                  }
                }
                aj.a((byte) -94, this, this.field_y);
                if (this.field_F == 0) {
                  this.v(12);
                } else if (this.field_F != 22) {
                  if (this.field_F != 0) {
                    this.field_O = this.g(false);
                  }
                } else {
                  this.field_O = this.d(-119, 1);
                  if (this.k(false) == null) {
                    stackIn_277_0 = null;
                    return (qe) (stackIn_277_0);
                  }
                }
                kf.a(this, this.field_y, param0 - 21);
                if (this.field_O) {
                  this.j(false);
                } else {
                  if (this.field_F == 7 &&
                    0 >= this.field_D) {
                    this.field_O = true;
                    this.j(false);
                  } else {
                    if (this.field_ab &&
                      this.field_L != 2 &&
                      !ol.field_g.a(param0 - 27, this.field_e, this.field_w, this.field_I, -16 + (this.field_z - this.field_w))) {
                      this.field_h = -this.field_M;
                      this.field_L = 1;
                      if (this.field_F != 0) {
                        if (this.field_F != 28) {
                          if (vg.a(this.field_F, -1)) {
                            qa.a(this.field_o, wb.field_p.field_H, dg.field_T[this.field_F], this, this.field_H, param0 ^ -30, 3, wb.field_p.field_o, 25, this.field_V);
                          }
                        } else {
                          jc.b(fh.field_e, 1, 0);
                        }
                      } else {
                        wh.a(vj.field_c, 0, param0 - 82);
                      }
                      this.field_D = 0;
                    }
                    if (this.field_ib &&
                      this.field_F == 2) {
                      this.p(param0 - 37);
                    }
                    if (this.field_ib &&
                      this.field_F == 3) {
                      this.C(-126);
                    }
                    if ((0 == this.field_F)) {
                      this.l(false);
                    }
                  }
                }
              }
              decompiledFrameRemainder10 = false;
            } else {
              if ((var4 != 2) &&
                (decompiledFrameRemainder0 = (1 != var4 ||
                var5 != 0))) {
                decompiledFrameRemainder1 = (var4 != 3);
                if (((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = (var4 != 4 ||
                  var5 != 0)) &&
                  (decompiledFrameRemainder1 = (var4 != 5 ||
                  var5 != 0)) &&
                  (decompiledFrameRemainder1 = (var4 != 7)) &&
                  (decompiledFrameRemainder1 = (var4 != 6 ||
                  var5 != 0)) &&
                  (decompiledFrameRemainder1 = (var4 != 8)) &&
                  (decompiledFrameRemainder1 = (var4 != 10 ||
                  var5 != 0)) &&
                  (decompiledFrameRemainder1 = (var4 != 9 ||
                  var5 != 0))) &&
                  (decompiledFrameRemainder2 = (12 != var4)) &&
                  (decompiledFrameRemainder3 = (18 != var4 ||
                  var5 != 0)) &&
                  (decompiledFrameRemainder4 = (var4 != 19)) &&
                  (decompiledFrameRemainder10 = (var4 == 20))) {
                  decompiledFrameRemainder5 = (var5 != 0);
                  decompiledFrameRemainder6 = !(decompiledFrameRemainder5);
                }
              }
            }
            if ((decompiledFrameRemainder10) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              aj.a((byte) -94, this, this.field_y);
              this.a(true, false);
              if (0 == this.field_F) {
                this.v(12);
                if (var5 != 0) {
                  this.field_O = this.g(false);
                }
              } else {
                this.field_O = this.g(false);
              }
              kf.a(this, this.field_y, param0 - 21);
              if (this.field_O) {
                this.j(false);
                decompiledFrameRemainder10 = (var5 != 0);
              }
              if (decompiledFrameRemainder10) {
                if (this.field_ib &&
                  this.field_F == 0 &&
                  ch.field_a[vj.field_c][pl.field_e[10]] &&
                  this.field_h > 0 &&
                  !ol.field_g.a(param0 ^ 31, this.field_e, (-this.field_w + 160) / 2, this.field_I, this.field_z)) {
                  this.field_kb = 0;
                  this.field_L = 10;
                  ti.field_d = 10;
                  this.field_D = 0;
                  wk.field_F = 0;
                  decompiledFrameRemainder10 = (var5 != 0);
                }
                if ((decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder10 = (this.field_ib)) &&
                  (decompiledFrameRemainder10 = (this.field_F == 0)) &&
                  (decompiledFrameRemainder10 = !(this.field_h <= 0))) {
                  this.field_L = 3;
                  this.H(param0 ^ 20);
                  this.field_kb = 0;
                  decompiledFrameRemainder10 = (var5 != 0);
                }
              }
            }
            if ((decompiledFrameRemainder10) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              this.field_D = this.field_D + 1;
              aj.a((byte) -106, this, this.field_y);
              if (!wb.field_p.field_ab &&
                this.field_h < qf.field_f) {
                this.field_h = this.field_h + 1;
              }
              this.a(true, false);
              if (0 < this.field_h) {
                this.field_L = 2;
                if (vg.a(this.field_F, -1)) {
                  qa.a(this.field_o, wb.field_p.field_H, dg.field_T[this.field_F], this, this.field_H, param0 - 30, 5, wb.field_p.field_o, 20, this.field_V);
                }
              }
              if (this.field_F != 0) {
                this.field_O = this.g(false);
                if (var5 != 0) {
                  this.v(12);
                }
              } else {
                this.v(12);
              }
              kf.a(this, this.field_y, 8);
              if (this.field_O) {
                this.j(false);
                decompiledFrameRemainder10 = (var5 != 0);
              }
              if ((decompiledFrameRemainder10) &&
                (decompiledFrameRemainder10 = (this.field_ib)) &&
                (decompiledFrameRemainder10 = (0 == this.field_F)) &&
                (decompiledFrameRemainder10 = !(!ch.field_a[vj.field_c][pl.field_e[10]]))) {
                ti.field_d = 10;
                this.field_L = 10;
                wk.field_F = 0;
                if (cl.field_s[vj.field_c] > this.field_D) {
                  this.field_h = this.field_h - 7;
                  this.field_Q = this.field_Q + 20 * this.field_a;
                }
                if (this.field_F != 0) {
                  this.field_D = 0;
                }
                this.n(param0 + 67);
                this.field_kb = 0;
                decompiledFrameRemainder10 = (var5 != 0);
              }
            }
            if ((decompiledFrameRemainder10) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2)) {
              if (this.field_F == 28) {
                this.a(true, -121);
                decompiledFrameRemainder10 = (var5 != 0);
              }
              if (decompiledFrameRemainder10) {
                this.b(param0 ^ 31);
                decompiledFrameRemainder10 = (var5 != 0);
              }
            }
            if ((decompiledFrameRemainder10) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3)) {
              this.field_D = this.field_D + 1;
              if (this.field_D > 24) {
                this.field_L = 0;
                if (this.field_F == 0) {
                  kl.field_a = false;
                }
              }
              if (vg.a(this.field_F, -1)) {
                aj.a((byte) -123, this, this.field_y);
              }
              var3_int = this.field_D;
              this.a(true, false);
              this.field_D = var3_int;
              if (this.field_L == 0 &&
                24 >= this.field_D) {
                this.field_L = 12;
              }
              if (this.field_F == 0) {
                this.v(param0 ^ 17);
                if (var5 != 0) {
                  if (this.field_F == 28) {
                    this.e(false);
                    this.field_O = this.g(false);
                  } else {
                    this.field_O = this.g(false);
                  }
                }
              } else {
                if (this.field_F == 28) {
                  this.e(false);
                  if (var5 != 0) {
                    this.field_O = this.g(false);
                  }
                } else {
                  this.field_O = this.g(false);
                }
              }
              if (vg.a(this.field_F, -1)) {
                kf.a(this, this.field_y, 8);
                if (this.field_O) {
                  this.j(false);
                  decompiledFrameRemainder10 = (var5 != 0);
                }
              }
              if ((decompiledFrameRemainder10) &&
                (decompiledFrameRemainder10 = (this.field_F == 0)) &&
                (decompiledFrameRemainder10 = !(!ol.field_g.a(2, this.field_e, this.field_w, this.field_I, 1 + (-this.field_w + this.field_z))))) {
                if ((!this.field_ib) &&
                  (decompiledFrameRemainder10 = (this.field_ab))) {
                  decompiledFrameRemainder10 = !(ol.field_g.a(2, this.field_e, this.field_w, this.field_I, -this.field_w + (this.field_z - 16)));
                }
                if (decompiledFrameRemainder10) {
                  this.field_L = 0;
                  kl.field_a = false;
                  this.H(param0 - 20);
                  decompiledFrameRemainder10 = (var5 != 0);
                }
              }
            }
            if ((decompiledFrameRemainder10) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4)) {
              this.field_D = this.field_D + 1;
              decompiledFrameRemainder10 = !(this.field_D <= 50);
              if (decompiledFrameRemainder10) {
                hk.field_b = true;
                decompiledFrameRemainder10 = (var5 != 0);
              }
            }
            if ((decompiledFrameRemainder10) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5)) {
              this.field_D = this.field_D + 1;
              decompiledFrameRemainder10 = !(this.field_D <= 50);
              if (decompiledFrameRemainder10) {
                discarded$0 = this.c((byte) 88, true);
                this.field_o = this.field_o + 32;
                if (this.field_o >= 64) {
                  this.field_o = this.field_o - 64;
                }
                this.field_e = 32 * this.field_o;
                var4 = 2048;
                this.field_D = 0;
                if (var4 <= this.field_e) {
                  this.field_e = this.field_e % var4;
                }
                this.field_L = 20;
                decompiledFrameRemainder10 = (var5 != 0);
              }
            }
            if ((decompiledFrameRemainder10) &&
              (decompiledFrameRemainder6)) {
              this.field_D = this.field_D + 1;
              if (!(50 >= this.field_D)) {
                ec.field_e = true;
                this.field_L = 0;
                this.field_D = 0;
                we.field_f = 100;
              }
              decompiledFrameRemainder10 = false;
            }
          }
          if ((decompiledFrameRemainder10) &&
            (decompiledFrameRemainder7)) {
            discarded$1 = this.d(param0 - 102, -1);
            decompiledFrameRemainder10 = (var5 != 0);
          }
          if (decompiledFrameRemainder10) {
            if (!this.field_cb ||
              !this.field_q) {
              aj.a((byte) -102, this, this.field_y);
              discarded$2 = this.d(120, 1);
              discarded$3 = this.k(false);
              kf.a(this, this.field_y, 8);
              decompiledFrameRemainder10 = (var5 != 0);
            }
            if (decompiledFrameRemainder10) {
              this.field_D = this.field_D + 1;
              if (32 <= this.field_D) {
                stackIn_166_0 = null;
                return (qe) (stackIn_166_0);
              }
            }
          }
          if (this.field_F == 6 &&
            wb.field_p != null &&
            this.field_db > 0 &&
            wb.field_p.field_z <= (-this.field_w + this.field_z)) {
            this.a((byte) -74, true);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3_ref), "qe.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void y(int param0) {
        boolean discarded$0 = false;
        int stackIn_4_0 = 0;
        int stackIn_55_0 = 0;
        boolean stackIn_74_0 = false;
        boolean stackIn_84_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        try {
          var2_int = r.field_a[fh.field_e];
          stackIn_4_0 = (var2_int > fc.field_o) ? 0 : 1;
          var3 = stackIn_4_0;
          var4 = af.a(-4275, this.field_L) ? 1 : 0;
          if (this.field_L != 8) {
            ad.field_a = true;
          }
          if (kf.field_d == 0) {
            var5 = this.b((byte) 109, false);
            var6 = this.c((byte) -74);
            var7 = re.a(-1, var6, var5, -1) ? 1 : 0;
            if (var3 == 0 &&
              var7 == 0) {
              return;
            }
          }
          var5Lifetime1 = this.b(false, -1);
          var6Lifetime1 = wb.field_p.b(false, -1);
          if (var3 == 0 &&
            var4 == 0 &&
            var5Lifetime1 != var6Lifetime1) {
            return;
          }
          var7Lifetime1 = (this.field_I >> 1) + this.field_e;
          var8 = (wb.field_p.field_I >> 1) + wb.field_p.field_e;
          if (var3 == 0 &&
            var4 == 0 &&
            this.field_a >= 0 &&
            var8 < var7Lifetime1) {
            return;
          }
          if (var3 == 0 &&
            var4 == 0 &&
            this.field_a < 0 &&
            var7Lifetime1 < var8) {
            return;
          }
          if (var4 == 0) {
            this.field_D = 0;
            this.field_kb = 0;
            wb.field_p.field_Y = false;
            this.field_L = 3;
          }
          stackIn_55_0 = (wb.field_p.field_z <= this.field_z) ? 0 : 1;
          var9 = stackIn_55_0;
          if (var3 != 0 &&
            var9 != 0 &&
            kf.field_d == 1 &&
            0 >= hb.field_f) {
            ad.field_a = false;
            this.field_kb = 0;
            hb.field_f = 500;
            this.field_L = 8;
            this.field_D = 0;
            wb.field_p.field_Y = false;
            var10 = fk.field_s[0][0] * 32;
            var11 = 32 * fk.field_s[0][1] + 32;
            var12 = var11 + var10 >> 1;
            if (var7Lifetime1 <= var12) {
              this.field_a = 1;
              stackIn_74_0 = !(ql.field_j);
              ql.field_j = stackIn_74_0;
              if ((TorChallenge.field_F) &&
                (var7Lifetime1 > var12)) {
                this.field_a = -1;
                stackIn_84_0 = !(ql.field_j);
                ql.field_j = stackIn_84_0;
              }
            } else {
              if (var7Lifetime1 > var12) {
                this.field_a = -1;
                stackIn_84_0 = !(ql.field_j);
                ql.field_j = stackIn_84_0;
              }
            }
          }
          if (param0 != 0) {
            discarded$0 = this.s(52);
          }
          this.a(false, -124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.WB(" + param0 + ')');
        }
    }

    private final void v(int param0) {
        boolean discarded$0 = false;
        int stackIn_13_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (param0 != 12) {
            discarded$0 = this.d(-114, -51);
          }
          var2_int = vj.field_c;
          if (this.field_n &&
            !this.field_c &&
            !this.field_N) {
            stackIn_13_0 = 1;
          } else {
            stackIn_13_0 = 0;
          }
          var3 = stackIn_13_0;
          if (this.field_L == 0 &&
            var3 != 0 && (2 != var2_int ||
            this.field_F == 28)) {
            return;
          }
          if (this.field_L == 0 &&
            var3 != 0 &&
            var2_int == 2 &&
            !kl.field_a) {
            return;
          }
          if (this.field_Q != 0) {
            if (0 != this.field_L) {
              stackIn_44_0 = 1;
            } else {
              stackIn_44_0 = this.field_mb ? 1 : 0;
            }
            var4 = stackIn_44_0;
            if (this.field_L == 0 &&
              this.field_K < (this.field_Q * this.field_a)) {
              var4 = 0;
            }
            if (this.field_L == 0) {
              stackIn_53_0 = this.field_gb ? 1 : 0;
            } else {
              stackIn_53_0 = 0;
            }
            var5 = stackIn_53_0;
            var6 = this.a(var4 != 0, (byte) -127, var5 != 0) ? 1 : 0;
            if (var6 != 0) {
              this.field_Q = 0;
            }
          }
          if (this.field_c &&
            -this.field_K < this.field_Q &&
            !this.field_j) {
            this.field_Q = this.field_Q - this.field_C;
            if (!TorChallenge.field_F) {
              return;
            }
          }
          if (this.field_N &&
            this.field_Q < this.field_K &&
            !this.field_j) {
            this.field_Q = this.field_Q + this.field_C;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.HA(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, qe param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1) {
            return false;
          }
          param1.field_b = 0;
          var3_int = df.field_R / 32;
          if (param1.field_o < var3_int &&
            this.field_a > 0) {
            param1.field_b = 64;
          }
          if (param0 > -18) {
            this.r(-61);
          }
          if (var3_int < param1.field_o &&
            this.field_a < 0) {
            param1.field_b = -64;
          }
          param1.field_b = param1.field_o - var3_int;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("qe.RC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        try {
          if (this.field_db <= 0 &&
            !this.field_Z && (6 != this.field_F ||
            this.field_V != 0 &&
            2 != this.field_V) && this.field_L != 13) {
            if (wb.field_p == this) {
              if (mj.field_b) {
                vd.field_b = true;
                if (kc.field_w != null) {
                  kc.field_w[0][0] = 0;
                }
                fh.field_d = 0;
                mj.field_b = false;
                dk.field_a = 0;
                hf.field_c = 0;
                lj.field_b = 0;
              }
              if (gl.field_k > 0) {
                gl.field_k = gl.field_k - 1;
              }
            }
            this.field_D = 0;
            this.field_L = 13;
            if (this.field_nb) {
              this.field_nb = false;
              wj.field_a = wj.field_a + 1;
              var2 = new qe(this.field_o, this.field_H, 8 + this.field_V, 0);
              ef.a(0, var2);
              var2.field_B = this.field_B;
              var2.field_u = this.field_u;
              var2.field_L = 1;
              this.field_z = this.field_H * 64 + this.field_u * 64 / 256;
              var2.field_h = -10;
              this.field_e = 32 * this.field_B / 256 + this.field_o * 32;
              var2.field_Q = 0;
            }
            if (6 == this.field_F &&
              this.field_V == 1) {
              this.a((byte) -117, false);
            }
          }
          if (this.field_L == 13 ||
            this.field_O ||
            this.field_db <= 0) {
            this.field_W = this.field_W + 1;
          }
          if (this.field_W >= 200) {
            this.field_W = 0;
          }
          var2_int = 87 % ((param0 - 43) / 50);
          if (0 > this.field_W) {
            this.field_W = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "qe.BC(" + param0 + ')');
        }
    }

    private final int b(boolean param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        RuntimeException var3_ref = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          var3 = pg.field_n;
          var6 = this.field_z;
          var7 = var6 - this.field_w;
          var8 = 16;
          var11 = 0;
          if (param1 != -1) {
            stackIn_3_0 = 124;
            return stackIn_3_0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (3 <= var11))) {
            var4 = var3[var11][0] * 64;
            var4 = var4 + var8;
            var5 = 64 * (1 + var3[var11][1]);
            var9 = -var4 + var5;
            var10 = -this.field_w + (var9 - 8);
            stackOut_5_0 = param0;
            stackIn_19_0 = stackOut_5_0 ? 1 : 0;
            stackIn_6_0 = stackOut_5_0;
            if (var12 == 0) {
              if (!stackIn_6_0) {
                var10 = 0;
              }
              if ((var4 + var10) <= var7 &&
                var5 >= var6) {
                stackIn_16_0 = var11;
                return stackIn_16_0;
              }
              var11++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_19_0 = -1;
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3_ref), "qe.HC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void i(int param0) {
        boolean discarded$0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_29_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_44_0 = 0;
        boolean stackIn_58_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var4Lifetime1;
        try {
          var4 = 0;
          var5 = this.a((byte) -50, fk.field_s) ? 1 : 0;
          if (var5 == 0) {
            if (!rk.field_e) {
              stackIn_10_0 = !(rk.field_e);
              rk.field_e = stackIn_10_0;
            }
            this.field_Q = 0;
            kf.field_d = 2;
            this.field_h = 0;
            return;
          }
          var6 = this.b(false, -1);
          if (var6 < 0) {
            kf.field_d = 2;
            this.field_Q = 0;
            this.field_h = 0;
            if (!rk.field_e) {
              stackIn_23_0 = !(rk.field_e);
              rk.field_e = stackIn_23_0;
            }
            return;
          }
          this.field_a = this.c(var6, -21);
          stackIn_29_0 = (this.field_a <= 0) ? 0 : 1;
          var7 = stackIn_29_0;
          var8 = this.c((byte) -74);
          var4Lifetime1 = re.a(-1, var8, var7, var6) ? 1 : 0;
          if (var4Lifetime1 != 0) {
            this.d((byte) 120, var6);
          }
          if (sl.a(var6, var7, var8, -22981)) {
            stackIn_40_0 = !(ql.field_j);
            ql.field_j = stackIn_40_0;
            this.field_a = -this.field_a;
            stackIn_44_0 = (0 >= this.field_a) ? 0 : 1;
            var7 = stackIn_44_0;
          }
          this.I(-31487);
          var2_int = 0;
          var3 = 0;
          if (param0 != 29647) {
            this.field_V = 96;
          }
          discarded$0 = this.a(var2_int != 0, (byte) -127, var3 != 0);
          var9 = this.b((byte) 109, var4Lifetime1 != 0);
          if (var7 == var9) {
            this.field_Q = 0;
            kf.field_d = 0;
            if (!rk.field_e) {
              stackIn_58_0 = !(rk.field_e);
              rk.field_e = stackIn_58_0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.KA(" + param0 + ')');
        }
    }

    final void b(boolean param0, boolean param1) {
        int stackIn_261_0 = 0;
        int stackIn_273_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1) {
            return;
          }
          boolean decompiledFrameRemainder2 = true;
          if (this.field_L != 2 && (this.field_L != 0 ||
            !this.field_eb)) {
            if (this.field_L != 1) {
              if (this.field_L != 0 ||
                !cl.field_z) {
                if (this.field_L != 18) {
                  if (this.field_L != 19) {
                    if (this.field_L == 20) {
                      i.field_r = 10;
                      decompiledFrameRemainder2 = (var7 != 0);
                    }
                    if (decompiledFrameRemainder2) {
                      if (this.field_L != 12 ||
                        this.field_Q <= 0 &&
                        this.field_g != 5) {
                        if (12 == this.field_L && (this.field_Q < 0 ||
                          this.field_g == 6)) {
                          i.field_r = 6;
                          decompiledFrameRemainder2 = (var7 != 0);
                        }
                        if (decompiledFrameRemainder2) {
                          if (this.field_L != 0 ||
                            5 != this.field_g &&
                            this.field_g != 6) {
                            if (this.field_L != 9 && (this.field_L != 0 ||
                              !tk.field_P)) {
                              if (this.field_L != 0 ||
                                !this.field_j ||
                                this.field_Q == 0) {
                                if (this.field_L == 0 &&
                                  0 == this.field_Q) {
                                  i.field_r = 0;
                                  decompiledFrameRemainder2 = (var7 != 0);
                                }
                                if (decompiledFrameRemainder2) {
                                  if (this.field_L != 0 ||
                                    0 == this.field_Q) {
                                    if (this.field_L != 3) {
                                      if (this.field_L == 4) {
                                        i.field_r = 12;
                                        decompiledFrameRemainder2 = (var7 != 0);
                                      }
                                      if (decompiledFrameRemainder2) {
                                        if (this.field_L == 5) {
                                          i.field_r = 13;
                                          decompiledFrameRemainder2 = (var7 != 0);
                                        }
                                        if (decompiledFrameRemainder2) {
                                          if (this.field_L != 6) {
                                            if (this.field_L != 7) {
                                              if (this.field_L == 10) {
                                                i.field_r = 14;
                                                decompiledFrameRemainder2 = (var7 != 0);
                                              }
                                              if ((decompiledFrameRemainder2) &&
                                                (decompiledFrameRemainder2 = (this.field_L == 13))) {
                                                i.field_r = 8;
                                                decompiledFrameRemainder2 = (var7 != 0);
                                              }
                                            }
                                            if (decompiledFrameRemainder2) {
                                              i.field_r = 16;
                                              decompiledFrameRemainder2 = (var7 != 0);
                                            }
                                          }
                                          if (decompiledFrameRemainder2) {
                                            i.field_r = 15;
                                            decompiledFrameRemainder2 = (var7 != 0);
                                          }
                                        }
                                      }
                                    }
                                    if (decompiledFrameRemainder2) {
                                      i.field_r = 11;
                                      decompiledFrameRemainder2 = (var7 != 0);
                                    }
                                  }
                                  if (decompiledFrameRemainder2) {
                                    i.field_r = 1;
                                    decompiledFrameRemainder2 = (var7 != 0);
                                  }
                                }
                              }
                              if (decompiledFrameRemainder2) {
                                i.field_r = 4;
                                decompiledFrameRemainder2 = (var7 != 0);
                              }
                            }
                            if (decompiledFrameRemainder2) {
                              i.field_r = 17;
                              decompiledFrameRemainder2 = (var7 != 0);
                            }
                          }
                          if (decompiledFrameRemainder2) {
                            i.field_r = 7;
                            decompiledFrameRemainder2 = (var7 != 0);
                          }
                        }
                      }
                      if (decompiledFrameRemainder2) {
                        i.field_r = 5;
                        decompiledFrameRemainder2 = (var7 != 0);
                      }
                    }
                  }
                  if (decompiledFrameRemainder2) {
                    i.field_r = 9;
                    decompiledFrameRemainder2 = (var7 != 0);
                  }
                }
                if (decompiledFrameRemainder2) {
                  i.field_r = 9;
                  if (var7 != 0) {
                    i.field_r = 19;
                    i.field_r = 2;
                    i.field_r = 3;
                  }
                }
              } else {
                i.field_r = 19;
                if (var7 != 0) {
                  i.field_r = 2;
                  i.field_r = 3;
                }
              }
            } else {
              i.field_r = 2;
              if (var7 != 0) {
                i.field_r = 3;
              }
            }
          } else {
            i.field_r = 3;
          }
          var3_int = vj.field_c;
          if (this.field_g != i.field_r) {
            this.field_g = i.field_r;
            this.field_p = ef.field_k;
          }
          boolean decompiledFrameRemainder1 = true;
          if (i.field_r == 3) {
            if (this.field_L != 2) {
              if (this.field_v) {
                this.field_v = false;
                this.field_p = ef.field_k;
              }
              if ((ef.field_k - this.field_p) > bb.field_k[i.field_r][var3_int]) {
                this.field_eb = false;
              }
              n.field_jb = 1;
              decompiledFrameRemainder1 = (var7 != 0);
            }
            if (decompiledFrameRemainder1) {
              n.field_jb = 0;
              this.field_v = true;
              decompiledFrameRemainder1 = (var7 != 0);
            }
          }
          if (decompiledFrameRemainder1) {
            if (i.field_r != 2) {
              if (!ja.a((byte) 104, this.field_L) && (this.field_L != 0 ||
                i.field_r != 17)) {
                n.field_jb = (-this.field_p + ef.field_k) / bb.field_k[i.field_r][var3_int];
                if (n.field_jb >= -1 + db.field_x[i.field_r][var3_int] &&
                  !ue.field_i[i.field_r][var3_int]) {
                  n.field_jb = db.field_x[i.field_r][var3_int] - 1;
                  if (var7 != 0) {
                    n.field_jb = n.field_jb % db.field_x[i.field_r][var3_int];
                  }
                } else {
                  n.field_jb = n.field_jb % db.field_x[i.field_r][var3_int];
                }
                decompiledFrameRemainder1 = (i.field_r == 1);
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = ((ef.field_k - this.field_p) % bb.field_k[i.field_r][var3_int] == 0)) &&
                  (decompiledFrameRemainder1 = !(!ja.field_e[var3_int][n.field_jb]))) {
                  wh.a(vj.field_c, 3, -103);
                  decompiledFrameRemainder1 = (var7 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                n.field_jb = this.field_kb;
                if (n.field_jb >= (-1 + db.field_x[i.field_r][var3_int])) {
                  n.field_jb = -1 + db.field_x[i.field_r][var3_int];
                }
                if ((i.field_r == 17) &&
                  (0 == this.field_D) &&
                  (cg.field_h[var3_int][n.field_jb])) {
                  wh.a(vj.field_c, 4, -114);
                  if (var7 != 0) {
                    if (ef.field_k + (-this.field_p - bb.field_k[i.field_r][var3_int]) <= 0) {
                      n.field_jb = 0;
                      n.field_jb = 1;
                    } else {
                      n.field_jb = 1;
                    }
                  }
                }
              }
            } else {
              if (ef.field_k + (-this.field_p - bb.field_k[i.field_r][var3_int]) <= 0) {
                n.field_jb = 0;
                if (var7 != 0) {
                  n.field_jb = 1;
                }
              } else {
                n.field_jb = 1;
              }
            }
          }
          if (vd.field_b) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted1 = true;
            vd.field_b = false;
            var4 = 4;
            if (null != id.field_d) {
              var5 = 0;
              while (var5 < var4) {
                stackIn_261_0 = 0;
                if (var7 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                var6 = stackIn_261_0;
                while (var6 < 4) {
                  id.field_d[var5][var6] = 0;
                  var6++;
                }
                var5++;
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameRemainder0 = (kc.field_w != null))) {
              stackIn_261_0 = 0;
            }
            if (decompiledFrameRemainder0) {
              var5Lifetime1 = stackIn_261_0;
              while (var4 > var5Lifetime1) {
                stackIn_273_0 = 0;
                if (var7 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var6Lifetime1 = stackIn_273_0;
                while (var6Lifetime1 < 3) {
                  kc.field_w[var5Lifetime1][var6Lifetime1] = 0;
                  var6Lifetime1++;
                }
                var5Lifetime1++;
              }
            }
            if (decompiledFrameCompleted0) {
              fa.field_t = -1;
              ul.field_m = 0;
              stackIn_273_0 = -1;
            }
            ec.field_b = stackIn_273_0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -1) {
            this.field_m = false;
          }
          lc.field_r = false;
          ni.field_b = false;
          this.field_D = 0;
          ql.field_n = 0;
          wb.field_p.field_Y = false;
          ra.field_q = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.OD(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != 359) {
            this.e(false);
          }
          if (param1 == 1) {
            this.x(96);
            if (this.field_V > 0) {
              this.field_D = this.field_D + 1;
            }
            if (this.field_a > 0) {
              this.field_N = true;
              if (var4 != 0) {
                this.field_c = true;
              }
            } else {
              this.field_c = true;
            }
            if (this.field_D <= 200) {
              return;
            }
            this.field_D = 0;
            this.field_ab = true;
            if (this.field_V <= 1) {
              return;
            }
            this.b(true);
            this.field_k = true;
            if (var4 == 0) {
              return;
            }
          }
          if (2 == param1) {
            this.x(96);
            if (this.field_a <= 0) {
              this.field_c = true;
              if (var4 != 0) {
                this.field_N = true;
              }
            } else {
              this.field_N = true;
            }
            this.field_D = this.field_D + 1;
            if (0 == this.field_a) {
              this.field_a = 1;
            }
            if (this.field_S) {
              this.field_j = true;
              this.field_c = false;
              this.field_N = false;
            }
            if (this.field_D > 37) {
              this.field_S = false;
            }
            if (this.field_D <= 150 ||
              this.field_L != 0) {
              if (112 >= this.field_D) {
                return;
              }
              if (this.field_L != 0) {
                return;
              }
              this.field_N = false;
              this.field_j = true;
              this.field_c = false;
              if (this.field_V <= 1) {
                return;
              }
              this.b(true);
              this.field_k = true;
              if (var4 == 0) {
                return;
              }
            }
            this.field_N = false;
            this.field_D = 0;
            this.field_c = false;
            this.field_ib = true;
            this.field_j = true;
            if (this.field_V <= 1) {
              return;
            }
            this.b(true);
            this.field_k = true;
            if (var4 == 0) {
              return;
            }
          }
          if (param1 != 7) {
            if (22 == param1) {
              this.x(96);
              if (var4 == 0) {
                return;
              }
            }
            if (param1 == 3) {
              this.x(param0 ^ 263);
              if (this.field_a > 0) {
                this.field_N = true;
                if (var4 != 0) {
                  this.field_c = true;
                }
              } else {
                this.field_c = true;
              }
              if (this.field_T) {
                this.field_j = true;
                this.field_N = false;
                this.field_c = false;
              }
              if (this.field_T ||
                2 != this.field_V ||
                !this.a((byte) -25, this.field_a) &&
                !this.field_k) {
                if (this.field_V > 0) {
                  this.field_D = this.field_D + 1;
                  if (this.field_D > 37) {
                    this.field_T = false;
                  }
                  if (this.field_D > 112 &&
                    wb.field_p.field_H > this.field_H) {
                    if (this.field_V > 1) {
                      this.b(true);
                    }
                    this.field_t = true;
                    this.field_j = true;
                  }
                }
                if (this.field_D > 150 &&
                  this.field_t) {
                  this.field_D = 0;
                  this.field_t = false;
                  this.field_ib = true;
                  if (var4 == 0) {
                    return;
                  }
                }
                if (this.field_D <= 150) {
                  return;
                }
                this.field_D = 0;
                if (var4 == 0) {
                  return;
                }
              }
              this.b(true);
              this.field_k = true;
              this.field_D = 0;
              if (var4 == 0) {
                return;
              }
            }
            if (param1 != 4) {
              if (param1 != 5) {
                if (param1 != 6) {
                  return;
                }
                if (this.field_db > 0) {
                  this.a((byte) -30, false);
                }
                this.x(96);
                if (this.field_a <= 0) {
                  this.field_c = true;
                  if (var4 != 0) {
                    this.field_N = true;
                  }
                } else {
                  this.field_N = true;
                }
                if (2 != this.field_V) {
                  return;
                }
                this.field_G = 0;
                if (var4 == 0) {
                  return;
                }
              }
              if (0 == this.field_V) {
                this.field_Q = 0;
              }
              if (this.field_D <= 0) {
                if (wb.field_p != null &&
                  this.D(1023)) {
                  this.field_D = 1;
                }
                if (0 >= this.field_G) {
                  return;
                }
                this.field_D = 1;
                if (var4 == 0) {
                  return;
                }
              }
              if (2 == this.field_V) {
                this.b(true);
                this.field_k = true;
              }
              this.field_fb = true;
              this.x(param0 ^ 263);
              if (0 >= this.field_a) {
                this.field_c = true;
                if (var4 == 0) {
                  return;
                }
              }
              this.field_N = true;
              if (var4 == 0) {
                return;
              }
            }
            this.x(96);
            if (this.field_V > 0 &&
              this.field_L == 2) {
              this.b(true);
              this.field_k = true;
            }
            if (this.field_V > 1) {
              this.field_D = this.field_D + 1;
            }
            if (this.field_D > 200) {
              this.field_D = 0;
              this.field_ab = true;
              this.b(true);
              this.field_k = true;
            }
            if (this.field_a > 0) {
              this.field_N = true;
              if (var4 == 0) {
                return;
              }
            }
            this.field_c = true;
            if (var4 == 0) {
              return;
            }
          }
          this.x(96);
          if (this.field_D > 0 &&
            this.field_L != 13) {
            this.field_D = this.field_D - 1;
          }
          this.field_Q = 64 * this.field_a;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.ID(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(ka param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_58_0 = 0;
        RuntimeException stackIn_379_0 = null;
        StringBuilder stackIn_379_1 = null;
        String stackIn_380_2 = null;
        StringBuilder stackIn_383_1 = null;
        String stackIn_384_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var12Lifetime1;
        int var24Lifetime1;
        int var12Lifetime1Lifetime1;
        var27 = TorChallenge.field_F ? 1 : 0;
        try {
          var9_int = vj.field_c;
          stackIn_5_0 = (this.field_a >= 0) ? 0 : 1;
          var10 = stackIn_5_0;
          if (1 == param7 ||
            param7 == 2) {
            stackIn_15_0 = (param3[0] >= 0) ? 0 : 1;
            var10 = stackIn_15_0;
          }
          var11 = 0;
          var12 = 0;
          var13 = 0;
          var14 = i.field_r;
          var15 = n.field_jb;
          var16 = 7;
          if (param5 != -20861) {
            this.field_N = true;
          }
          var17 = 0;
          var18 = 1;
          if (bd.field_l) {
            return;
          }
          if (param3 != null && (2 == param7 ||
            param7 == 1)) {
            if (param3.length >= 2) {
              var14 = param3[1];
            }
            if (4 <= param3.length) {
              var16 = param3[3];
            }
            if (param3.length >= 3) {
              var15 = param3[2];
            }
          }
          if (2 != var9_int &&
            uf.field_o[var14][var9_int].length > var15 &&
            null != uf.field_o[var14][var9_int][var15]) {
            if (uf.field_o[var14][var9_int][var15].field_u <= 0 &&
              uf.field_o[var14][var9_int][var15].field_x <= 0) {
              stackIn_58_0 = 0;
            } else {
              stackIn_58_0 = 1;
            }
            var17 = stackIn_58_0;
          }
          if (null == c.field_c) {
            return;
          }
          if (0 > var14 ||
            !(c.field_c.length > var14)) {
            var14 = 0;
          }
          if (c.field_c.length != 0 &&
            null != c.field_c[var14]) {
            if (var9_int < 0 ||
              !(c.field_c[var14].length > var9_int)) {
              var9_int = 0;
            }
            if (c.field_c[var14].length != 0 &&
              null != c.field_c[var14][var9_int]) {
              if (var15 < 0 ||
                !(var15 < c.field_c[var14][var9_int].length)) {
                var15 = 0;
              }
              if (c.field_c[var14][var9_int].length != 0 &&
                null != c.field_c[var14][var9_int]) {
                if (var10 != 0 &&
                  9 != var14 &&
                  10 != var14) {
                  oa.field_e.d();
                  qg.b();
                  c.field_c[var14][var9_int][var15].d(0, 0);
                  if (var17 != 0) {
                    of.field_b.d();
                    qg.b();
                    uf.field_o[var14][var9_int][var15].d(0, 0);
                    if (param7 == 2) {
                      oa.field_e.d();
                      od.a(0, 0, 0, var16, 0, of.field_b);
                    }
                  }
                  la.field_f.a(param5 ^ 20762);
                }
                param1 -= 32;
                var19 = 160;
                var20 = 160;
                if (param7 == 1 ||
                  2 == param7) {
                  var13 = dl.field_n[2];
                  var11 = dl.field_n[0];
                }
                param4 = -(-this.field_I + var20 >> 1);
                if (var14 != 9 &&
                  var14 != 10) {
                  if (0 >= this.field_G &&
                    !ec.field_e ||
                    (2 == param7 ||
                    param7 == 1)) {
                    if (null != param0 ||
                      param7 != 2 ||
                      var10 == 0) {
                      if (null == param0 &&
                        2 == param7) {
                        od.a(var11, var13, 0, var16, 0, c.field_c[var14][var9_int][var15]);
                        if (var17 != 0) {
                          od.a(var11, var13, 0, var16, 0, uf.field_o[var14][var9_int][var15]);
                        }
                        if (var9_int != 2) {
                          return;
                        }
                        this.a(var13, aa.field_g, -72, false, var11, df.field_R);
                        if (var27 == 0) {
                          return;
                        }
                      }
                      if (null == param0 ||
                        1 != param7 ||
                        var10 == 0) {
                        if (param0 == null ||
                          1 != param7) {
                          if (param0 != null &&
                            var10 != 0) {
                            param0.d();
                            qg.b();
                            oa.field_e.d(var11, param1, var20, var19);
                            if (var17 != 0) {
                              od.a(param6 + param4, param1, 0, var16, 0, of.field_b);
                            }
                            if (var9_int != 2) {
                              return;
                            }
                            this.a(param1, aa.field_g, -118, true, param6 + param4, df.field_R);
                            if (var27 == 0) {
                              return;
                            }
                          }
                          if (var10 != 0) {
                            var11 = param6 + param4;
                            var12Lifetime1 = var11 + var20;
                            if ((this.field_l > 0 ||
                              !(0 < gl.field_k)) && bc.field_o != 3) {
                              if (var11 > 320 &&
                                si.field_L[0] >= var11) {
                                var18 = 0;
                              }
                              if (var12Lifetime1 < 320 &&
                                si.field_L[1] <= var12Lifetime1) {
                                var18 = 0;
                              }
                            }
                            if (var18 != 0) {
                              oa.field_e.d(param4 + param6, param1, var20, var19);
                            }
                            if (this.field_l > 0 ||
                              !(gl.field_k > 0)) {
                              si.field_L[0] = var11;
                              si.field_L[1] = var12Lifetime1;
                            }
                            if (var17 != 0) {
                              od.a(param4 + param6, param1, 0, var16, 0, of.field_b);
                            }
                            if (var9_int != 2) {
                              return;
                            }
                            this.a(param1, aa.field_g, -126, true, param6 + param4, df.field_R);
                            if (var27 == 0) {
                              return;
                            }
                          }
                          if (param0 == null) {
                            var11 = param4 + param6;
                            var12Lifetime1 = var11 + var20;
                            if ((this.field_l > 0 ||
                              !(gl.field_k > 0)) && bc.field_o != 3) {
                              if (var11 > 320 &&
                                si.field_L[0] >= var11) {
                                var18 = 0;
                              }
                              if (var12Lifetime1 < 320 &&
                                var12Lifetime1 >= si.field_L[1]) {
                                var18 = 0;
                              }
                            }
                            if (var18 != 0) {
                              c.field_c[var14][var9_int][var15].d(param6 + param4, param1, var20, var19);
                            }
                            if (0 < this.field_l ||
                              !(gl.field_k > 0)) {
                              si.field_L[1] = var12Lifetime1;
                              si.field_L[0] = var11;
                            }
                            if (var17 != 0) {
                              od.a(param4 + param6, param1, 0, var16, 0, uf.field_o[var14][var9_int][var15]);
                            }
                            if (var9_int != 2) {
                              return;
                            }
                            this.a(param1, aa.field_g, -85, true, param4 + param6, df.field_R);
                            if (var27 == 0) {
                              return;
                            }
                          }
                          param0.d();
                          qg.b();
                          c.field_c[var14][var9_int][var15].d(param4 + param6, param1, var20, var19);
                          if (var17 != 0) {
                            od.a(param4 + param6, param1, 0, var16, 0, uf.field_o[var14][var9_int][var15]);
                          }
                          if (var9_int != 2) {
                            return;
                          }
                          this.a(param1, aa.field_g, param5 ^ 20793, true, param4 + param6, df.field_R);
                          if (var27 == 0) {
                            return;
                          }
                        }
                        param0.d();
                        qg.b();
                        c.field_c[var14][var9_int][var15].a(var11, var13, var16);
                        if (var27 == 0) {
                          return;
                        }
                      }
                      param0.d();
                      qg.b();
                      oa.field_e.a(var11, var13, param3[3]);
                      if (var27 == 0) {
                        return;
                      }
                    }
                    od.a(var11, var13, 0, var16, 0, oa.field_e);
                    if (var27 == 0) {
                      return;
                    }
                  }
                  var21 = this.field_G;
                  if (ec.field_e) {
                    var21 = we.field_f;
                  }
                  var22 = 50;
                  if (ec.field_e) {
                    var22 = 200;
                  }
                  var23 = var22 >> 1;
                  var24 = 0;
                  var25 = 96;
                  if (ec.field_e) {
                    var25 = 32;
                  }
                  if (var22 < var21) {
                    var21 = var22;
                  }
                  if (!ec.field_e) {
                    if (var21 <= var23) {
                      var24Lifetime1 = var25 + (-var21 + var23) * (256 - var25) / var23;
                      if (var27 != 0) {
                        var24Lifetime1 = (var21 - var22) * (256 - var25) / var23 + 256;
                        var24Lifetime1 = var25 + (-var21 + var22) * (256 - var25) / var22;
                      }
                    } else {
                      var24Lifetime1 = (var21 - var22) * (256 - var25) / var23 + 256;
                      if (var27 != 0) {
                        var24Lifetime1 = var25 + (-var21 + var22) * (256 - var25) / var22;
                      }
                    }
                  } else {
                    var24Lifetime1 = var25 + (-var21 + var22) * (256 - var25) / var22;
                  }
                  var26 = 16711680;
                  if (ec.field_e) {
                    var26 = 16777215;
                  }
                  qg.a(bf.field_l);
                  lk.field_e.d();
                  qg.b();
                  if (var10 == 0) {
                    c.field_c[var14][var9_int][var15].d(0, 0, var20, var19);
                  }
                  if (var10 != 0 ||
                    var27 != 0) {
                    oa.field_e.d(0, 0, var20, var19);
                  }
                  la.field_f.a(-72);
                  var11 = param6 + param4;
                  qg.b(bf.field_l);
                  var12Lifetime1Lifetime1 = var11 + var20;
                  if ((this.field_l > 0 ||
                    !(gl.field_k > 0)) && (this.field_l > 0 ||
                    !(gl.field_k > 0))) {
                    if (var11 > 320 &&
                      si.field_L[0] >= var11) {
                      var18 = 0;
                    }
                    if (var12Lifetime1Lifetime1 < 320 &&
                      si.field_L[1] <= var12Lifetime1Lifetime1) {
                      var18 = 0;
                    }
                  }
                  if (var18 != 0) {
                    lk.field_e.a(param6 + param4, param1, var24Lifetime1, var26);
                  }
                  if (this.field_l > 0 ||
                    !(gl.field_k > 0)) {
                    si.field_L[1] = var12Lifetime1Lifetime1;
                    si.field_L[0] = var11;
                  }
                  if (var27 == 0) {
                    return;
                  }
                }
                if (50 <= this.field_D) {
                  var16 = 0;
                  if (var27 != 0) {
                    if (this.field_D < 0) {
                      var16 = 255;
                      var16 = (12750 - 255 * this.field_D) / 50;
                    } else {
                      var16 = (12750 - 255 * this.field_D) / 50;
                    }
                  }
                } else {
                  if (this.field_D < 0) {
                    var16 = 255;
                    if (var27 != 0) {
                      var16 = (12750 - 255 * this.field_D) / 50;
                    }
                  } else {
                    var16 = (12750 - 255 * this.field_D) / 50;
                  }
                }
                if (var14 == 10) {
                  var16 = 255 - var16;
                }
                c.field_c[var14][var9_int][var15].d(param4 + param6, param1, var16);
                return;
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_379_0 = var9;
          stackIn_379_1 = new StringBuilder().append("qe.VC(");
          if (param0 == null) {
            stackIn_380_2 = "null";
          } else {
            stackIn_380_2 = "{...}";
          }
          stackIn_383_1 = ((StringBuilder) (Object) stackIn_379_1).append(stackIn_380_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_384_2 = "null";
          } else {
            stackIn_384_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_379_0), ((StringBuilder) (Object) stackIn_383_1).append(stackIn_384_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        try {
          this.field_fb = true;
          this.field_gb = true;
          this.field_jb = false;
          this.field_mb = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "qe.DD(" + param0 + ')');
        }
    }

    private final int b(byte param0, boolean param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        RuntimeException var3_ref = null;
        int var6 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != 109) {
            this.j(false);
          }
          var3 = gl.field_c;
          var7 = this.field_e;
          var8 = var7 + this.field_I;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 >= 2))) {
            var4 = 32 * var3[var9][0];
            var5 = 32 * var3[var9][1] + 32;
            stackOut_6_0 = param1;
            stackIn_27_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var10 == 0) {
              if (stackIn_7_0) {
                var6 = -var4 + var5;
                if (0 == var9) {
                  var5 = var5 - (-8 - this.field_I + var6);
                }
                if (var9 == 1) {
                  var4 = var4 + (var6 + (-this.field_I - 8));
                }
              }
              if (var4 <= var7 &&
                var8 <= var5) {
                stackIn_24_0 = var9;
                return stackIn_24_0;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_27_0 = -1;
          }
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3_ref), "qe.DC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void E(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_212_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        var18 = TorChallenge.field_F ? 1 : 0;
        try {
          var2 = bj.field_d;
          var3 = dd.field_q;
          var8 = v.field_S[fh.field_e];
          var9 = r.field_a[fh.field_e];
          stackIn_5_0 = (var9 > fc.field_o) ? 0 : 1;
          var10 = stackIn_5_0;
          this.g((byte) 104);
          if (this.field_L == 13) {
            this.F(87);
            return;
          }
          if (this.field_G > 0) {
            this.field_G = this.field_G - 1;
            if (!this.w(-89) &&
              !wh.field_b) {
              this.field_ib = false;
              this.field_L = 0;
              var11 = -this.field_e + wb.field_p.field_e;
              stackIn_23_0 = (var11 < 0) ? -1 : 1;
              var12 = stackIn_23_0;
              if (var12 * var11 > 1024) {
                var11 = -(var11 * var12) + 2048;
                var12 = -var12;
              }
              this.field_h = -this.field_M;
              wh.field_b = true;
              this.field_Q = this.field_K * -var12;
              kf.field_d = 3;
            }
          }
          if (kf.field_d == 0) {
            this.field_ib = false;
            this.a(true);
            if (this.j((byte) 58)) {
              this.m(-30719);
            }
            if (this.field_a == 0) {
              this.field_a = 1;
            }
            var4 = 1;
            var5 = 0;
            this.g(this.field_a, 85);
            var6 = this.a(var4 != 0, (byte) -127, var5 != 0) ? 1 : 0;
            if (var6 != 0) {
              this.field_a = -this.field_a;
              this.field_Q = 0;
            }
            if (this.w(-119)) {
              kf.field_d = 1;
            }
            return;
          }
          if (kf.field_d == 1) {
            this.a(true);
            this.field_L = 2;
            this.field_ib = false;
            var7 = 0;
            this.a(true, var7 != 0);
            if (this.field_L == 0) {
              this.field_ib = false;
              kf.field_d = 2;
              kf.field_d = lg.b((byte) 84, this.field_H);
              if (kf.field_d < 0) {
                kf.field_d = 0;
              }
            }
            return;
          }
          if (kf.field_d == 2) {
            this.a(true);
            this.field_mb = false;
            kf.field_d = lg.b((byte) 84, this.field_H);
            if (kf.field_d < 0) {
              kf.field_d = 0;
            }
            if (this.w(80)) {
              kf.field_d = 1;
            }
            var4Lifetime1 = 0;
            this.g(this.field_a, 76);
            var5Lifetime1 = 0;
            var6Lifetime1 = this.a(var4Lifetime1 != 0, (byte) -127, var5Lifetime1 != 0) ? 1 : 0;
            if (var6Lifetime1 != 0) {
              kf.field_d = 3;
              this.field_h = -this.field_M;
              this.field_Q = 0;
            }
            var11Lifetime1 = lg.b((byte) 84, wb.field_p.field_H);
            if (this.j((byte) 112) ||
              var11Lifetime1 < 0 ||
              var11Lifetime1 == 2) {
              this.m(-30719);
            }
            if (2 != kf.field_d) {
              this.h((byte) -1);
            }
            return;
          }
          if (3 == kf.field_d) {
            this.a(true);
            this.field_ib = false;
            if (!wh.field_b) {
              this.g(this.field_a, param0 ^ 24905);
            }
            var7Lifetime1 = 0;
            this.field_L = 2;
            this.a(true, var7Lifetime1 != 0);
            if (0 == this.field_L) {
              wh.field_b = false;
              this.field_ib = false;
              kf.field_d = 4;
              kf.field_d = lg.b((byte) 84, this.field_H);
              if (0 > kf.field_d) {
                kf.field_d = 0;
              }
            }
            var4Lifetime2 = 1;
            var5Lifetime2 = 0;
            var6Lifetime2 = this.a(var4Lifetime2 != 0, (byte) -127, var5Lifetime2 != 0) ? 1 : 0;
            if (var6Lifetime2 != 0 &&
              !wh.field_b) {
              this.field_Q = 0;
            }
            return;
          }
          if (kf.field_d != 4) {
            if (param0 != 24888) {
              this.u(123);
            }
            if (kf.field_d == 5) {
              this.a(true);
              var5Lifetime3 = 0;
              var4Lifetime3 = 1;
              this.g(this.field_a, param0 - 24809);
              var6Lifetime3 = this.a(var4Lifetime3 != 0, (byte) -127, var5Lifetime3 != 0) ? 1 : 0;
              if (var6Lifetime3 != 0 &&
                var10 == 0) {
                kf.field_d = 1;
                this.field_Q = 0;
                td.field_e = 0;
                this.h((byte) -1);
                return;
              }
              this.field_L = 2;
              var7Lifetime2 = 0;
              this.a(true, var7Lifetime2 != 0);
              if (this.field_L == 0) {
                var11Lifetime2 = this.h(-26698);
                if (var11Lifetime2 < 0) {
                  kf.field_d = lg.b((byte) 84, this.field_H);
                  if (kf.field_d < 0) {
                    kf.field_d = 0;
                  }
                  this.h((byte) -1);
                  this.field_ib = false;
                  return;
                }
                kf.field_d = 4;
                this.field_ib = false;
                if (var10 != 0 &&
                  this.J(-16517) &&
                  this.t(32)) {
                  this.field_h = -this.field_M;
                  kf.field_d = 5;
                  this.field_Q = this.field_K * this.field_a;
                  this.h((byte) -1);
                  this.field_kb = 0;
                }
                return;
              }
              this.field_L = 10;
              this.a(false, param0 - 24805);
            }
            return;
          }
          this.a(true);
          this.field_mb = false;
          if (this.w(param0 - 24849)) {
            kf.field_d = 1;
            this.h((byte) -1);
            td.field_e = 0;
            return;
          }
          kf.field_d = lg.b((byte) 84, this.field_H);
          if (kf.field_d < 0) {
            kf.field_d = 0;
          }
          if (kf.field_d != 4) {
            td.field_e = 0;
            this.h((byte) -1);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          this.g(this.field_a, 98);
          var5Lifetime4 = 0;
          var4Lifetime4 = 0;
          var6Lifetime4 = this.a(var4Lifetime4 != 0, (byte) -127, var5Lifetime4 != 0) ? 1 : 0;
          if (var6Lifetime4 != 0) {
            var11Lifetime3 = this.h(param0 - 51586);
            if (var11Lifetime3 < 0) {
              if (this.w(param0 ^ 24873)) {
                td.field_e = 0;
                kf.field_d = 1;
                if (kf.field_d != 4) {
                  this.h((byte) -1);
                }
                return;
              }
              kf.field_d = lg.b((byte) 84, this.field_H);
              if (0 > kf.field_d) {
                kf.field_d = 0;
              }
              if (kf.field_d != 4) {
                this.h((byte) -1);
              }
              return;
            }
            var12Lifetime1 = 32 * var3[var11Lifetime3][0];
            var13 = var3[var11Lifetime3][1] * 32;
            var14 = var13 + var12Lifetime1 >> 1;
            var15 = (this.field_I >> 1) + this.field_e;
            if ((var11Lifetime3 != 0 ||
              var15 > var14) && (var11Lifetime3 != 1 ||
              var15 < var14)) {
              if ((var11Lifetime3 != 0 ||
                var14 > var15) &&
                (decompiledFrameRemainder0 = (var11Lifetime3 == 1))) {
                decompiledFrameRemainder0 = !(var15 > var14);
              }
              if (decompiledFrameRemainder0) {
                stackIn_187_0 = (2 <= td.field_e) ? 0 : 1;
                var16 = stackIn_187_0;
                if (var16 == 0 &&
                  var10 != 0) {
                  var17 = var2[0];
                  if (wb.field_p.field_H == var17 &&
                    var8 > wb.field_p.field_o &&
                    var11Lifetime3 == 0 ||
                    !(wb.field_p.field_o <= var8) &&
                    1 == var11Lifetime3) {
                    stackIn_212_0 = (var16 != 0) ? 0 : 1;
                    var16 = stackIn_212_0;
                  }
                }
                if (var16 != 0) {
                  this.field_h = this.field_h - this.field_M;
                  kf.field_d = 5;
                  this.field_Q = this.field_a * this.field_K;
                  td.field_e = td.field_e + 1;
                  this.field_kb = 0;
                }
                if (kf.field_d != 4) {
                  this.h((byte) -1);
                }
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var10 == 0) {
                this.field_a = -this.field_a;
                this.field_Q = 0;
              }
              if (var10 != 0 ||
                var18 != 0) {
                boolean decompiledSharedTail0 = (this.J(-16517) &&
                  this.t(param0 - 24856));
                if (!decompiledSharedTail0) {
                  kf.field_d = 3;
                  decompiledSharedTail0 = (var18 != 0);
                }
                if (decompiledSharedTail0) {
                  this.field_Q = this.field_a * this.field_K;
                  kf.field_d = 5;
                  this.field_kb = 0;
                }
                this.field_h = this.field_h - this.field_M;
              }
              if (kf.field_d != 4) {
                this.h((byte) -1);
              }
              return;
            }
          }
          if (this.J(-16517)) {
            this.m(-30719);
          }
          if (kf.field_d != 4) {
            this.h((byte) -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "qe.AA(" + param0 + ')');
        }
    }

    private final void f(boolean param0) {
        int discarded$0 = 0;
        boolean stackIn_9_1 = false;
        boolean stackIn_65_0 = false;
        boolean stackIn_76_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          if (1 == fh.field_e) {
            var2_int = this.b((byte) 109, false);
            discarded$0 = this.b(false, -1);
            var3 = -1;
            var4 = this.c(1) ? 1 : 0;
            var5 = 0;
            if (var2_int >= 0) {
              stackIn_9_1 = !(param0);
              var3 = this.c(stackIn_9_1, var2_int);
            }
            boolean decompiledFrameRemainder0 = true;
            if (this.field_Q >= 0 &&
              (-this.field_C + this.field_K) > this.field_Q) {
              this.field_Q = this.field_Q + this.field_C;
              decompiledFrameRemainder0 = (var6 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_Q < 0 ||
                (this.field_K - this.field_C) >= this.field_Q ||
                this.field_Q >= this.field_K) {
                if (this.field_Q < 0 &&
                  -this.field_Q < (-this.field_C + this.field_K)) {
                  this.field_Q = this.field_Q - this.field_C;
                  if ((var6 != 0) &&
                    (this.field_Q < 0 &&
                    -this.field_C + this.field_K < -this.field_Q &&
                    -this.field_Q < this.field_K)) {
                    this.field_Q = this.field_Q - 1;
                    this.field_Q = this.field_Q + 1;
                  }
                } else {
                  if (this.field_Q < 0 &&
                    -this.field_C + this.field_K < -this.field_Q &&
                    -this.field_Q < this.field_K) {
                    this.field_Q = this.field_Q - 1;
                    if (var6 != 0) {
                      this.field_Q = this.field_Q + 1;
                    }
                  }
                }
              } else {
                this.field_Q = this.field_Q + 1;
              }
            }
            if (var3 >= 0) {
              var5 = (var4 != 0) && (var6 == 0) ? (1) : (-1);
              if (0 < var5 &&
                2 != var3) {
                stackIn_65_0 = !(ql.field_j);
                ql.field_j = stackIn_65_0;
              }
              if (var5 < 0 &&
                var3 != 0) {
                stackIn_76_0 = !(ql.field_j);
                ql.field_j = stackIn_76_0;
              }
            }
            if ((var5 * this.field_h) < (-this.field_C + this.field_M)) {
              this.field_h = this.field_h + var5 * this.field_C;
              if (var6 != 0 && (this.field_M - this.field_C < var5 * this.field_h &&
                this.field_M > (var5 * this.field_h))) {
                this.field_h = this.field_h + var5 * 2;
              }
            } else {
              if (this.field_M - this.field_C < var5 * this.field_h &&
                this.field_M > (var5 * this.field_h)) {
                this.field_h = this.field_h + var5 * 2;
              }
            }
          }
          var2_intLifetime1 = 0;
          var3Lifetime1 = 0;
          if (fh.field_e == 2) {
            this.field_mb = true;
            var3Lifetime1 = 1;
          }
          var4Lifetime1 = this.a(var2_intLifetime1 != 0, (byte) -127, var3Lifetime1 != 0) ? 1 : 0;
          if (var4Lifetime1 != 0) {
            this.field_Q = 0;
          }
          var5Lifetime1 = param0 ? 1 : 0;
          this.a(true, var5Lifetime1 != 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.NC(" + param0 + ')');
        }
    }

    private final int f(int param0, int param1) {
        qe discarded$0 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var3_intLifetime4;
        int var3_intLifetime5;
        int var9Lifetime1;
        int var11Lifetime1;
        int var3_intLifetime1Lifetime1;
        int var3_intLifetime1Lifetime2;
        int var3_intLifetime1Lifetime3;
        int var3_intLifetime3Lifetime1;
        try {
          var3_int = 1;
          var4 = fk.field_s[1];
          var5 = 16;
          var6 = var4[0] * 64 + var5;
          var7 = 64 + 64 * var4[1];
          var8 = var6 + var7 >> 1;
          var10 = pg.field_n;
          var12 = this.field_z;
          var13 = var10[0][1] * 64 + 64;
          if (param0 != -16452) {
            discarded$0 = this.o(-125);
          }
          var14 = wb.field_p.field_z;
          var15 = -this.field_w + var14;
          var16 = var15 + var14 >> 1;
          if (param1 == 0) {
            if (var13 > var12) {
              var3_intLifetime1 = 1;
              stackIn_10_0 = var3_intLifetime1;
              return stackIn_10_0;
            }
            if (ql.field_j) {
              var11 = 64 * (var10[1][1] + 1);
              if (var12 >= var11) {
                var3_intLifetime1Lifetime1 = -1;
                stackIn_18_0 = var3_intLifetime1Lifetime1;
                return stackIn_18_0;
              }
              var3_intLifetime1Lifetime1 = 1;
              stackIn_16_0 = var3_intLifetime1Lifetime1;
              return stackIn_16_0;
            }
            stackIn_23_0 = (var16 > var8) ? 0 : 1;
            var9 = stackIn_23_0;
            if (var9 != 0) {
              var3_intLifetime1Lifetime2 = -1;
              if (ql.field_j) {
                var3_intLifetime1Lifetime2 = -var3_intLifetime1Lifetime2;
              }
              stackIn_33_0 = var3_intLifetime1Lifetime2;
              return stackIn_33_0;
            }
            var3_intLifetime1Lifetime3 = 1;
            if (ql.field_j) {
              var3_intLifetime1Lifetime3 = -var3_intLifetime1Lifetime3;
            }
            stackIn_27_0 = var3_intLifetime1Lifetime3;
            return stackIn_27_0;
          }
          if (1 != param1) {
            stackIn_66_0 = 1;
            return stackIn_66_0;
          }
          if (var12 <= var13) {
            var3_intLifetime2 = 1;
            stackIn_41_0 = var3_intLifetime2;
            return stackIn_41_0;
          }
          if (ql.field_j) {
            stackIn_49_0 = (var8 < var16) ? 0 : 1;
            var9Lifetime1 = stackIn_49_0;
            if (var9Lifetime1 != 0) {
              var3_intLifetime3 = -1;
              stackIn_53_0 = var3_intLifetime3;
              return stackIn_53_0;
            }
            var3_intLifetime3Lifetime1 = 1;
            stackIn_51_0 = var3_intLifetime3Lifetime1;
            return stackIn_51_0;
          }
          var11Lifetime1 = 64 * (1 + var10[1][1]);
          if (var11Lifetime1 > var12) {
            var3_intLifetime4 = 1;
            if (ql.field_j) {
              var3_intLifetime4 = -var3_intLifetime4;
            }
            stackIn_64_0 = var3_intLifetime4;
            return stackIn_64_0;
          }
          var3_intLifetime5 = -1;
          if (ql.field_j) {
            var3_intLifetime5 = -var3_intLifetime5;
          }
          stackIn_58_0 = var3_intLifetime5;
          return stackIn_58_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.LD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0) {
        qe discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_B >= 256) {
            this.field_B = this.field_B - 256;
            this.field_o = this.field_o + 1;
            if (64 <= this.field_o) {
              this.field_o = this.field_o - 64;
              if (TorChallenge.field_F &&
                this.field_B < 0) {
                this.field_o = this.field_o - 1;
                this.field_B = this.field_B + 256;
                if (this.field_o < 0) {
                  this.field_o = this.field_o + 64;
                }
              }
            }
          } else {
            if (this.field_B < 0) {
              this.field_o = this.field_o - 1;
              this.field_B = this.field_B + 256;
              if (this.field_o < 0) {
                this.field_o = this.field_o + 64;
              }
            }
          }
          if (param0 > -89) {
            discarded$1 = this.g(-27);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.PA(" + param0 + ')');
        }
    }

    private final boolean s(int param0) {
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        qe var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          var2 = this;
          var3 = wb.field_p;
          if (null == var2) {
            return false;
          }
          if (var3 == null) {
            return false;
          }
          var4 = this.field_e + ((qe) (var2)).field_I / param0;
          var5 = -(((qe) (var2)).field_w / 2) + this.field_z;
          var6 = ef.field_i[this.field_L][fh.field_e];
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 > 1))) {
            var7 = lh.field_r[fh.field_e][var6][this.field_kb][var8];
            var9 = var7[0] + var4;
            var10 = var5 + var7[1];
            var11 = var7[2];
            var12 = var7[3];
            stackIn_26_0 = 0;
            if (var17 == 0) {
              if (stackIn_26_0 > ((qe) (var2)).field_a) {
                var9 = -var11 + (-var9 + var4 * 2);
              }
              var13 = var3.field_e;
              if (var13 - var9 > 1024) {
                var13 -= 2048;
              }
              if (-var9 + var13 < -1024) {
                var13 += 2048;
              }
              var14 = var3.field_z - var3.field_w;
              var15 = var3.field_I;
              var16 = var3.field_w;
              if (o.a(var16, var10, var15, var11, var12, var13, var9, (byte) 9, var14)) {
                return true;
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_26_0 = 0;
          }
          return stackIn_26_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "qe.FC(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        boolean discarded$0 = false;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        boolean stackIn_199_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = 5;
          if (8 <= this.field_F &&
            this.field_F < 21) {
            this.field_gb = false;
            if (this.field_f == -1) {
              this.field_fb = true;
              if (var5 != 0) {
                this.field_fb = false;
              }
            } else {
              this.field_fb = false;
            }
            this.field_mb = true;
            this.field_Q = this.field_Q / 2;
            this.x(96);
            this.field_jb = false;
            if (this.field_F == 12 &&
              o.field_l == 0 &&
              this.field_f != -1) {
              this.i(false);
            }
            if (this.field_F == 13 &&
              o.field_l == 0) {
              this.i(false);
            }
          }
          if (this.field_L != 14 &&
            this.field_Z &&
            null != wb.field_p &&
            0 < wb.field_p.field_db &&
            0 <= this.field_h) {
            if (13 == this.field_F &&
              db.field_B >= 10) {
              return;
            }
            if (this.A(-16)) {
              boolean decompiledFrameRemainder0 = true;
              this.field_L = 14;
              this.f((byte) -17);
              if ((18 == this.field_F) &&
                (decompiledFrameRemainder0 = !(gl.field_k >= 9))) {
                gl.field_k = gl.field_k + 1;
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.field_F == 14) {
                  if (wb.field_p.field_d <= wb.field_p.field_db) {
                    this.field_L = 0;
                    decompiledFrameRemainder0 = (ea.field_e == 0);
                    if (decompiledFrameRemainder0) {
                      rj.field_d = df.field_P;
                      decompiledFrameRemainder0 = (var5 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ii.field_i = 50;
                    be.field_d = wb.field_p.field_db;
                    wb.field_p.field_db = wb.field_p.field_db + 1;
                    decompiledFrameRemainder0 = (var5 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (12 != this.field_F) {
                    if (this.field_F != 13) {
                      if (15 == this.field_F) {
                        if (this.field_nb) {
                          var3 = -1;
                          var4 = 0;
                          while (true) {
                            if (var4 < 5) {
                              stackIn_100_0 = bl.field_O[1][var4];
                              stackIn_100_1 = this.field_y;
                              if (var5 == 0) {
                                if (stackIn_100_0 == stackIn_100_1) {
                                  var3 = var4;
                                }
                                var4++;
                                continue;
                              }
                            } else {
                              stackIn_100_0 = ~var3;
                              stackIn_100_1 = -1;
                            }
                            break;
                          }
                          if (stackIn_100_0 <= stackIn_100_1) {
                            vi.field_a = vi.field_a | 1 << var3;
                            mh.field_d[var3] = this.field_y;
                          }
                          this.field_nb = false;
                          hd.field_d = hd.field_d + 1;
                          var4Lifetime2 = jj.a(255);
                          wb.field_p.field_d = 3 + var4Lifetime2 / var2_int;
                          if (jj.field_d) {
                            gh.field_m = true;
                            if (var5 != 0) {
                              jj.field_d = true;
                            }
                          } else {
                            jj.field_d = true;
                          }
                          this.field_D = 0;
                        }
                        this.field_L = 0;
                        if (wb.field_p.field_db < wb.field_p.field_d) {
                          ii.field_i = 50;
                          be.field_d = wb.field_p.field_db;
                        }
                        wb.field_p.field_r = this.field_o;
                        wb.field_p.field_f = this.field_H;
                        wb.field_p.field_db = wb.field_p.field_d;
                        decompiledFrameRemainder0 = (var5 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (this.field_F == 20) {
                          ij.field_z = true;
                          this.field_L = 0;
                          var3Lifetime1 = 0;
                          var4Lifetime1 = 0;
                          while (true) {
                            if (var4Lifetime1 < var2_int) {
                              stackIn_127_0 = 0;
                              stackIn_127_1 = vi.field_a & 1 << var4Lifetime1;
                              if (var5 == 0) {
                                if (stackIn_127_0 < stackIn_127_1) {
                                  var3Lifetime1++;
                                }
                                var4Lifetime1++;
                                continue;
                              }
                            } else {
                              stackIn_127_0 = var3Lifetime1;
                              stackIn_127_1 = 3;
                            }
                            break;
                          }
                          if (stackIn_127_0 < stackIn_127_1) {
                            rj.field_d = uf.field_p;
                          }
                          if (stackIn_127_0 >= stackIn_127_1 ||
                            var5 != 0) {
                            rj.field_d = lj.field_k;
                            eb.field_n = true;
                          }
                          if (wb.field_p != null &&
                            wb.field_p.field_n &&
                            eb.field_n &&
                            wb.field_p.field_L == 0) {
                            if (cl.field_z) {
                              if (2 != vj.field_c) {
                                wb.field_p.field_w = 96;
                              }
                              cl.field_z = false;
                            }
                            wb.field_p.field_L = 18;
                            wb.field_p.field_D = 0;
                          }
                          decompiledFrameRemainder0 = (var5 != 0);
                        }
                        if ((decompiledFrameRemainder0) &&
                          (decompiledFrameRemainder0 = (this.field_F == 19))) {
                          this.field_L = 0;
                          rj.field_d = vb.a(ea.field_e, (byte) 109, this.field_hb);
                          decompiledFrameRemainder0 = (var5 != 0);
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      if (o.field_l <= 0) {
                        this.field_L = 0;
                        decompiledFrameRemainder0 = (var5 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        db.field_B = db.field_B + 1;
                        if (!(db.field_B < 10)) {
                          if (gl.field_k < 9) {
                            gl.field_k = gl.field_k + 1;
                          }
                          o.field_l = 0;
                          ii.field_k.field_f = -1;
                          if (!(ab.field_d >= 6)) {
                            ab.field_d = ab.field_d + 1;
                            if (var5 != 0) {
                              if (o.field_l <= 0) {
                                df.field_O = true;
                                ii.field_k = this;
                                ug.field_o = 2;
                                db.field_B = 0;
                                o.field_l = 500;
                                this.field_L = 0;
                              } else {
                                this.field_L = 0;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (o.field_l <= 0) {
                      df.field_O = true;
                      ii.field_k = this;
                      ug.field_o = 2;
                      db.field_B = 0;
                      o.field_l = 500;
                      if (var5 != 0) {
                        this.field_L = 0;
                      }
                    } else {
                      this.field_L = 0;
                    }
                  }
                }
              }
              this.e(this.field_F, -1);
            }
          }
          if (param0 != -15777) {
            discarded$0 = this.c((byte) -5, true);
          }
          if (this.field_F == 15) {
            stackIn_199_0 = !(this.field_nb);
            if (stackIn_199_0 &&
              !wa.field_pb[-(ea.field_e * 5) + this.field_V]) {
              this.field_D = this.field_D + 1;
              if (this.field_D >= 51) {
                wa.field_pb[this.field_V - 5 * ea.field_e] = true;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.MC(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_Q != 0) {
            if (this.field_L == 0) {
              stackIn_7_0 = this.field_mb ? 1 : 0;
            } else {
              stackIn_7_0 = 1;
            }
            var2_int = stackIn_7_0;
            if (this.field_L == 0) {
              stackIn_11_0 = this.field_gb ? 1 : 0;
            } else {
              stackIn_11_0 = 0;
            }
            var3 = stackIn_11_0;
            if (this.field_L == 0 &&
              this.field_K < (this.field_a * this.field_Q)) {
              var2_int = 0;
            }
            var4 = this.a(var2_int != 0, (byte) -127, var3 != 0) ? 1 : 0;
            if (var4 != 0) {
              this.field_Q = 0;
            }
          }
          if (param0) {
            this.field_l = -89;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.MD(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (0 == this.field_a) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var4_int = this.field_e + (this.field_I >> 1);
          var5 = 2048;
          if (var5 <= var4_int) {
            var4_int = var4_int - var5;
          }
          var6 = (param1 >> 1) + param0;
          if (var5 <= var6) {
            var6 = var6 - var5;
          }
          var7 = 0;
          if (!param2) {
            this.field_X = false;
          }
          var7Lifetime1 = var6 - var4_int;
          if (var7Lifetime1 < 0) {
            var7Lifetime1 = -var7Lifetime1;
          }
          boolean decompiledFrameRemainder0 = true;
          if (0 >= this.field_a ||
            var6 < var4_int) {
            if (0 >= this.field_a ||
              var6 >= var4_int) {
              if (this.field_a < 0 &&
                var4_int <= var6) {
                var7Lifetime1 = -var7Lifetime1 + var5;
                decompiledFrameRemainder0 = (var8 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (this.field_a < 0 &&
                var4_int > var6)) {
                var7Lifetime1 = var7Lifetime1;
                if (var8 != 0) {
                  var7Lifetime1 = -var7Lifetime1 + var5;
                  var7Lifetime1 = var7Lifetime1;
                }
              }
            } else {
              var7Lifetime1 = -var7Lifetime1 + var5;
              if (var8 != 0) {
                var7Lifetime1 = var7Lifetime1;
              }
            }
          } else {
            var7Lifetime1 = var7Lifetime1;
          }
          stackIn_46_0 = var7Lifetime1;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "qe.UB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(byte param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 120) {
            this.field_Z = true;
          }
          var3 = pg.field_n[param1];
          var4 = var3[0] * 64;
          var5 = 16;
          var4 = var4 + var5;
          var4 += 8;
          var6 = -1;
          var7 = 40;
          var8 = 6;
          var9 = -this.field_w + this.field_z;
          if (var4 < var9) {
            if ((this.field_h * var6) < var7) {
              this.field_h = this.field_h + var6 * var8;
              if (TorChallenge.field_F) {
                this.field_h = 0;
              }
            }
          } else {
            this.field_h = 0;
          }
          var10 = 1;
          this.a(true, var10 != 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3_ref), "qe.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean f(int param0) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8) {
            discarded$1 = this.J(11);
          }
          if (3 != this.field_L &&
            9 != this.field_L &&
            this.field_L != 8) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.KC(" + param0 + ')');
        }
    }

    private final void G(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (3 == this.field_L) {
            return;
          }
          if (this.field_L == 13) {
            return;
          }
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var2_int = kf.field_d;
          if ((var2_int != 0 ||
            var3 != 0) &&
            (decompiledFrameRemainder0 = (var2_int != 1 ||
            var3 != 0)) &&
            (decompiledFrameRemainder1 = (var2_int != 2)) &&
            (decompiledFrameRemainder2 = (3 != var2_int ||
            var3 != 0)) &&
            (decompiledFrameRemainder3 = (var2_int != 4)) &&
            (decompiledFrameRemainder4 = (var2_int != 5)) &&
            (decompiledFrameRemainder5 = (var2_int != 6 ||
            var3 != 0)) &&
            (decompiledFrameRemainder7 = (var2_int == 7))) {
            decompiledFrameRemainder6 = (var3 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            this.field_L = 0;
            decompiledFrameRemainder8 = (var3 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            this.field_L = 2;
            decompiledFrameRemainder8 = (var3 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            this.field_L = 0;
            decompiledFrameRemainder8 = (var3 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            this.field_L = 1;
            if (this.field_h > 0) {
              this.field_L = 2;
            }
            decompiledFrameRemainder8 = !(!wh.field_b);
            if (decompiledFrameRemainder8) {
              this.field_L = 0;
              decompiledFrameRemainder8 = (var3 != 0);
            }
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            this.field_L = 0;
            decompiledFrameRemainder8 = (var3 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            this.field_L = 10;
            decompiledFrameRemainder8 = (var3 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            this.field_L = 3;
            decompiledFrameRemainder8 = (var3 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7)) {
            this.field_L = 0;
            wh.field_b = true;
          }
          if (decompiledFrameRemainder8) {
            this.field_L = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.V(" + param0 + ')');
        }
    }

    private final int c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 1;
          if (param0 == 0) {
            var3_int = 1;
          }
          if (param0 == 1) {
            var3_int = -1;
          }
          if (2 == param0) {
            var3_int = 1;
          }
          if (param1 != -21) {
            this.E(85);
          }
          if (ql.field_j) {
            var3_int = -var3_int;
          }
          stackIn_16_0 = var3_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.LA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -35) {
            this.I(-36);
          }
          this.field_mb = true;
          this.field_jb = false;
          this.field_gb = true;
          this.field_fb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.P(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -30719) {
            this.b(true, true);
          }
          if (!this.field_ib) {
            this.field_kb = 0;
            this.field_L = 3;
            wb.field_p.field_Y = false;
            this.field_D = 0;
            this.field_ib = true;
          }
          if (this.field_L == 3) {
            this.a(false, param0 + 30600);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.CA(" + param0 + ')');
        }
    }

    private final boolean t(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = wb.field_p.field_z;
          if (param0 != 32) {
            this.e(false);
          }
          var3 = this.field_z;
          return !(var2_int > var3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.SA(" + param0 + ')');
        }
    }

    private final void h(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_I = lh.field_B[fh.field_e];
          this.field_w = lh.field_p[fh.field_e];
          this.field_db = ah.field_f[fh.field_e];
          this.field_K = rj.field_e[fh.field_e];
          if (fh.field_e == 2 &&
            null != wb.field_p) {
            this.field_K = wb.field_p.field_K;
          }
          this.field_M = jf.field_pb[fh.field_e];
          this.field_C = jd.field_g[fh.field_e];
          this.field_jb = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.CC(" + param0 + ')');
        }
    }

    private final boolean w(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 102 / ((-38 - param0) / 36);
          if (this.field_fb &&
            !ol.field_g.a(2, this.field_e, this.field_w, this.field_I, 1 + this.field_z - this.field_w)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.LC(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var9_intLifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var21 = TorChallenge.field_F ? 1 : 0;
        try {
          var9_int = 0;
          var10 = 0;
          var11 = 0;
          var12 = 0;
          var13 = param1 % 32 - param2 * 32 / 256;
          var14 = param4 - param1 / 32;
          var15 = this.field_I;
          if (vg.a(param5, -1)) {
            var15 = ki.field_e[dg.field_T[param5]];
          }
          var16 = 32 * var14 - var13 - (var15 - this.field_I >> 1);
          var17 = var16 + var15;
          if (param5 == 4 &&
            this.field_a > 0) {
            var16 = var16 - 96;
            if (var21 != 0 && (param5 == 4 &&
              this.field_a < 0)) {
              var17 = 96 + var17;
            }
          } else {
            if (param5 == 4 &&
              this.field_a < 0) {
              var17 = 96 + var17;
            }
          }
          var18 = (0 <= var16) && (var21 == 0) ? (1) : (-1);
          var16 = var16 * var18;
          if (var16 > 1024 &&
            var16 < 2048) {
            var18 = -var18;
          }
          if (var16 >= 2048) {
            var16 -= 2048;
            if (var16 > 1024) {
              var18 = -var18;
            }
          }
          if (param6 != 2657) {
            this.j(false);
          }
          var19 = (0 > var17) && (var21 == 0) ? (-1) : (1);
          var17 = var17 * var19;
          if (1024 < var17 &&
            var17 < 2048) {
            var19 = -var19;
          }
          if (var17 >= 2048) {
            var17 -= 2048;
            if (var17 > 1024) {
              var19 = -var19;
            }
          }
          var20 = this.field_w;
          if (0 != param5 ||
            this.field_L != 0 ||
            !cl.field_z) {
            if (param5 != 28) {
              if (vg.a(param5, param6 ^ -2658)) {
                var20 = ae.field_s[dg.field_T[param5]];
                if (var21 != 0) {
                  var20 = lh.field_q[fh.field_e];
                  var20 = 96;
                }
              }
            } else {
              var20 = lh.field_q[fh.field_e];
              if (var21 != 0) {
                var20 = 96;
              }
            }
          } else {
            var20 = 96;
          }
          if (param5 != 0 &&
            this.field_I > 64) {
            var12Lifetime1 = 296 + this.field_I / 2;
            if (var21 != 0) {
              var12Lifetime1 = 328;
            }
          } else {
            var12Lifetime1 = 328;
          }
          L18: {
            if (param5 != 0 ||
              this.field_L != 0 ||
              !cl.field_z) {
              if (param5 == 22 &&
                this.field_q) {
                var11Lifetime1 = -var20 + (64 * param3 - param0) + 64 * param7 / 256;
                if (var21 == 0) {
                  break L18;
                }
              }
              if (22 != param5) {
                var11Lifetime1 = -(-this.field_w + var20 >> 1) - param0 + (param3 * 64 + (64 * param7 / 256 - this.field_w));
                if (var21 != 0) {
                  var11Lifetime1 = 16 + param7 * 64 / 256 + (param3 * 64 - param0 + (-this.field_w - (-this.field_w + var20 >> 1)));
                  var11Lifetime1 = -var20 + (64 * param7 / 256 + (-param0 + param3 * 64));
                }
              } else {
                var11Lifetime1 = 16 + param7 * 64 / 256 + (param3 * 64 - param0 + (-this.field_w - (-this.field_w + var20 >> 1)));
                if (var21 != 0) {
                  var11Lifetime1 = -var20 + (64 * param7 / 256 + (-param0 + param3 * 64));
                }
              }
            } else {
              var11Lifetime1 = -var20 + (64 * param7 / 256 + (-param0 + param3 * 64));
            }
          }
          var9_intLifetime1 = var18 * (fj.a(1870096848, wi.field_a[var16], var12Lifetime1 << 16) >> 16) + 320;
          var10Lifetime1 = 320 + var19 * (fj.a(1870096848, wi.field_a[var17], var12Lifetime1 << 16) >> 16);
          if (!vg.a(param5, param6 ^ -2658)) {
            if (this.field_I <= -var9_intLifetime1 + var10Lifetime1) {
              if (!(var10Lifetime1 - var9_intLifetime1 >= 64)) {
                var9_intLifetime1 = (var9_intLifetime1 + var10Lifetime1) / 2 - 32;
                var10Lifetime1 = var9_intLifetime1 + 64;
                if (var21 != 0) {
                  var9_intLifetime1 = (-this.field_I + (var9_intLifetime1 + var10Lifetime1)) / 2;
                  var10Lifetime1 = this.field_I + var9_intLifetime1;
                  if (ki.field_e[dg.field_T[param5]] > var10Lifetime1 - var9_intLifetime1) {
                    var9_intLifetime1 = (-ki.field_e[dg.field_T[param5]] + (var10Lifetime1 + var9_intLifetime1)) / 2;
                    var10Lifetime1 = ki.field_e[dg.field_T[param5]] + var9_intLifetime1;
                  }
                }
              }
            } else {
              var9_intLifetime1 = (-this.field_I + (var9_intLifetime1 + var10Lifetime1)) / 2;
              var10Lifetime1 = this.field_I + var9_intLifetime1;
              if ((var21 != 0) &&
                (ki.field_e[dg.field_T[param5]] > var10Lifetime1 - var9_intLifetime1)) {
                var9_intLifetime1 = (-ki.field_e[dg.field_T[param5]] + (var10Lifetime1 + var9_intLifetime1)) / 2;
                var10Lifetime1 = ki.field_e[dg.field_T[param5]] + var9_intLifetime1;
              }
            }
          } else {
            if (ki.field_e[dg.field_T[param5]] > var10Lifetime1 - var9_intLifetime1) {
              var9_intLifetime1 = (-ki.field_e[dg.field_T[param5]] + (var10Lifetime1 + var9_intLifetime1)) / 2;
              var10Lifetime1 = ki.field_e[dg.field_T[param5]] + var9_intLifetime1;
            }
          }
          dl.field_n[2] = var11Lifetime1;
          dl.field_n[1] = var10Lifetime1;
          dl.field_n[0] = var9_intLifetime1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var9), "qe.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void b(boolean param0) {
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (!param0) {
            this.field_cb = true;
          }
          if (wb.field_p != null) {
            var2_int = 2048;
            var3 = (wb.field_p.field_I >> 1) + wb.field_p.field_e;
            var4 = this.field_e + (this.field_I >> 1);
            if (var2_int <= var3) {
              var3 = var3 - var2_int;
            }
            if (var2_int <= var4) {
              var4 = var4 - var2_int;
            }
            var5 = -var4 + var3;
            stackIn_14_0 = (var5 >= 0) ? 1 : -1;
            var6 = stackIn_14_0;
            var5 = var6 * var5;
            if ((var2_int >> 1) < var5) {
              var6 = -var6;
              var5 = var2_int - var5;
            }
            if (var6 != 1) {
              this.field_N = false;
              this.field_a = -1;
              this.field_c = true;
              if (!TorChallenge.field_F) {
                return;
              }
            }
            this.field_c = false;
            this.field_N = true;
            this.field_a = 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.ND(" + param0 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 >= -90) {
            this.field_B = 89;
          }
          var3_int = dg.field_T[param1];
          this.field_fb = lb.field_q[var3_int];
          this.field_mb = ja.field_j[var3_int][this.field_V];
          this.field_gb = be.field_c[var3_int];
          this.field_jb = dl.field_r[var3_int][this.field_V];
          if (0 == this.field_a) {
            this.field_a = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.H(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        ka var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        var27 = TorChallenge.field_F ? 1 : 0;
        try {
          var7_int = vj.field_c;
          if (var7_int != 2) {
            return;
          }
          var8 = pl.field_e[this.field_L];
          if (var8 >= 0 &&
            var8 < cg.field_f.length) {
            if (0 > cg.field_f[var8][0]) {
              return;
            }
            var9 = cg.field_f[var8][2];
            if (this.field_kb >= 0 &&
              af.field_e[var8].length > this.field_kb) {
              var10 = af.field_e[var8][this.field_kb][0];
              if (var9 == 0 &&
                var10 < 0) {
                return;
              }
              if (this.field_kb >= 0 &&
                this.field_kb < tc.field_m[var8].length) {
                var11 = tc.field_m[var8][this.field_kb];
                if (var11 < 0 &&
                  !param3) {
                  return;
                }
                stackIn_41_0 = (this.field_a >= 0) ? 0 : 1;
                var12 = stackIn_41_0;
                if (this.field_L == 6) {
                  stackIn_48_0 = (var12 != 0) ? 0 : 1;
                  var12 = stackIn_48_0;
                }
                boolean decompiledFrameRemainder2 = true;
                var13 = 128;
                var14 = -1;
                var15 = -1;
                var16 = -1;
                var17 = var13;
                var18 = 0;
                if (var9 == 1) {
                  var19_int = cg.field_f[var8][0];
                  var20 = cg.field_f[var8][1];
                  if (var19_int <= this.field_kb &&
                    this.field_kb <= var20) {
                    var21 = 0;
                    var22 = var19_int;
                    do {
                      if (var20 < var22) {
                        var22 = 0;
                        break;
                      }
                      var21 = var21 + ae.field_u[var7_int][var8][var22];
                      var22++;
                    } while (var27 == 0);
                    var23 = var19_int;
                    do {
                      if (this.field_kb <= var23) {
                        var23 = -1;
                        break;
                      }
                      var22 = var22 + ae.field_u[var7_int][var8][var23];
                      var23++;
                    } while (var27 == 0);
                    boolean decompiledFrameRemainder1 = true;
                    if ((var21 / 2) <= (this.field_D + var22)) {
                      if (this.field_L != 10) {
                        if (this.field_D + var22 > var21) {
                          var17 = 0;
                          decompiledFrameRemainder1 = (var27 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          var17 = var13 * (2 * (var21 - (this.field_D + var22))) / var21;
                          decompiledFrameRemainder1 = (var27 != 0);
                        }
                      }
                      if ((decompiledFrameRemainder1) &&
                        (var21 <= (this.field_D + var22))) {
                        var23 = (var22 + this.field_D) % (2 * var21);
                        boolean decompiledSharedTail1 = !(var21 > var23);
                        if (!decompiledSharedTail1) {
                          var18 = (var13 - 32) * (-var23 + var21) / var21;
                          var17 = var13 - 32;
                          decompiledSharedTail1 = (var27 != 0);
                        }
                        if (decompiledSharedTail1) {
                          var17 = (-var23 + var21 * 2) * (-32 + var13) / var21;
                          var18 = var13 - 32;
                        }
                      }
                    }
                    var24 = ae.field_u[var7_int][var8][this.field_kb];
                    if (this.field_D <= var24) {
                      var22 = var22 + this.field_D;
                      if (var27 != 0) {
                        var22 = var22 + var24;
                      }
                    } else {
                      var22 = var22 + var24;
                    }
                    var25 = cg.field_f[var8][3];
                    if (this.field_L == 10) {
                      var14 = var25;
                    }
                    var26 = cg.field_f[var8][4];
                    if (this.field_L == 10 &&
                      var23 >= 0) {
                      if (var23 >= var21) {
                        var15 = (-var25 + var26) * (var23 - var21) / (var21 * 2) + var25;
                      }
                      if (var23 < var21 ||
                        var27 != 0) {
                        var15 = (-var25 + var26) * (var23 + var21) / (2 * var21) + var25;
                      }
                      var14 = (var26 - var25) * var23 / (2 * var21) + var25;
                    }
                    var16 = cg.field_f[var8][5];
                    decompiledFrameRemainder2 = false;
                  }
                  else {
                    return;
                  }
                }
                if (var9 == 0) {
                  var14 = var10;
                  var19_int = af.field_e[var8][this.field_kb][1];
                  var16 = var19_int;
                }
                var19 = ra.field_b[0][0];
                var20 = var19.field_q / 2;
                var21 = var19.field_v / 4;
                var22 = param4;
                var23 = param4;
                var24 = param0;
                if (var12 != 0 &&
                  this.field_L != 6 ||
                  var12 == 0 &&
                  this.field_L == 6) {
                  var22 = var22 + 160 - var14;
                  var23 = -var15 + 160 + var23;
                  if (var27 != 0) {
                    var23 = var15 + var23;
                    var22 = var22 + var14;
                  }
                } else {
                  var23 = var15 + var23;
                  var22 = var22 + var14;
                }
                var24 = var16 + var24;
                if (var9 != 0) {
                  if (var9 == 1) {
                    boolean decompiledFrameRemainder0 = true;
                    if (var12 != 0) {
                      var19 = ra.field_b[0][0];
                      decompiledFrameRemainder0 = (this.field_L == 9);
                      if (decompiledFrameRemainder0) {
                        var22 = var22 - (var19.field_q >> 1) * 3;
                        var23 = var23 - (var19.field_q >> 1) * 3;
                      }
                    }
                    if ((decompiledFrameRemainder0) &&
                      (var12 == 0 ||
                      var27 != 0)) {
                      var19 = ra.field_b[0][1];
                      boolean decompiledSharedTail0 = (this.field_L != 10);
                      if (!decompiledSharedTail0) {
                        var23 = var23 - var19.field_q;
                        var22 = var22 - var19.field_q;
                        decompiledSharedTail0 = (var27 != 0);
                      }
                      if ((decompiledSharedTail0) &&
                        (this.field_L == 9)) {
                        var23 = var23 + (var19.field_q >> 1);
                        var22 = var22 + (var19.field_q >> 1);
                      }
                    }
                    if (0 < var17) {
                      var19.b(var22, var24, var17);
                    }
                    if (!(0 >= var18)) {
                      var19.b(var23, var24, var18);
                      if (var27 != 0) {
                        if (var12 != 0) {
                          var19 = ra.field_b[var11][0];
                        }
                        var19 = ra.field_b[var11][1];
                        var24 = var24 - var21 / 2;
                        var22 = var22 - var20 / 2;
                        var19.d(var22, var24, var20, var21, var17);
                      }
                    }
                  }
                } else {
                  if (var12 != 0) {
                    var19 = ra.field_b[var11][0];
                  }
                  if (var12 == 0 ||
                    var27 != 0) {
                    var19 = ra.field_b[var11][1];
                  }
                  var24 = var24 - var21 / 2;
                  var22 = var22 - var20 / 2;
                  var19.d(var22, var24, var20, var21, var17);
                }
                return;
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var7), "qe.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final qe g(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_7_0 = null;
        qe stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_D > 0) {
            this.field_D = this.field_D - 1;
          } else {
            if (0 >= this.field_D) {
              stackIn_7_0 = null;
              return (qe) (stackIn_7_0);
            }
          }
          this.field_Q = this.field_a * 120;
          this.field_e = this.field_Q * 32 / 256 + this.field_e;
          var2_int = 2048;
          if (0 > this.field_e) {
            this.field_e = this.field_e + var2_int;
          }
          if (var2_int <= this.field_e) {
            this.field_e = -var2_int + this.field_e;
          }
          this.field_B = this.field_e % 32 * 256 / 32;
          this.field_o = this.field_e / 32;
          if (param0 != 11227) {
            stackIn_17_0 = (qe) null;
            return stackIn_17_0;
          }
          var3 = this.i((byte) 116) ? 1 : 0;
          if (var3 == 0) {
            return this;
          }
          stackIn_20_0 = null;
          return (qe) (stackIn_20_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.SB(" + param0 + ')');
        }
    }

    private final int c(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.c(1) ? 1 : 0;
          if (param0) {
            stackIn_2_0 = -5;
            return stackIn_2_0;
          }
          var4 = 1;
          if (param1 == 0 &&
            var3_int != 0) {
            var4 = 0;
            if (ql.field_j) {
              var4 = 1;
            }
          }
          if (param1 == 0 &&
            var3_int == 0) {
            var4 = 2;
            if (ql.field_j) {
              var4 = 1;
            }
          }
          if (param1 == 1 &&
            var3_int != 0) {
            var4 = 1;
            if (ql.field_j) {
              var4 = 0;
            }
          }
          if (1 == param1 &&
            var3_int == 0) {
            var4 = 1;
            if (ql.field_j) {
              var4 = 2;
            }
          }
          stackIn_36_0 = var4;
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.UC(" + param0 + ',' + param1 + ')');
        }
    }

    private final int m(boolean param0) {
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          var2 = wf.field_c;
          if (!param0) {
            this.field_ib = false;
          }
          var3 = s.field_i[0];
          var5 = 0;
          while (true) {
            stackIn_6_0 = var5;
            stackIn_6_1 = var3;
            if (stackIn_6_0 < stackIn_6_1) {
              stackIn_18_0 = 0;
              if (var7 == 0) {
                var6 = stackIn_18_0;
                while (var6 <= 1) {
                  var4 = var2[var5][var6];
                  stackIn_6_0 = var4;
                  stackIn_6_1 = this.field_o;
                  if (stackIn_6_0 == stackIn_6_1) {
                    stackIn_14_0 = var5;
                    return stackIn_14_0;
                  }
                  var6++;
                }
                var5++;
                continue;
              }
            } else {
              stackIn_18_0 = -1;
            }
            return stackIn_18_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "qe.T(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        int stackIn_5_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6_intLifetime1;
        int var7Lifetime1;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          stackIn_5_0 = (this.field_Q <= 0) ? -1 : 1;
          var6_int = stackIn_5_0;
          if (this.field_Q == 0) {
            var6_int = this.field_a;
          }
          if (s.field_m) {
            param1 = 5 * param1 >> 2;
          }
          var7 = var6_int * this.field_Q;
          if (0 < param1) {
            if (var6_int != this.field_a ||
              this.field_K < (var7 + param1)) {
              if (~this.field_a != ~var6_int ||
                this.field_K <= var7) {
                if (~this.field_a != ~var6_int) {
                  var7 = var7 - param1;
                  if (var9 != 0) {
                    var7++;
                    var7 = var7 + param1;
                  }
                }
              } else {
                var7++;
                if (var9 != 0) {
                  var7 = var7 + param1;
                }
              }
            } else {
              var7 = var7 + param1;
            }
            this.field_Q = var7 * var6_int;
          }
          this.field_Q = var6_int * var7;
          stackIn_37_0 = (this.field_Q <= 0) ? -1 : 1;
          var6_intLifetime1 = stackIn_37_0;
          if (!param3) {
            return;
          }
          if (this.field_Q == 0) {
            var6_intLifetime1 = this.field_a;
          }
          var7Lifetime1 = this.field_Q * var6_intLifetime1;
          if (var7Lifetime1 > 0) {
            if (this.field_K < var7Lifetime1) {
              var7Lifetime1--;
              this.field_Q = var7Lifetime1 * var6_intLifetime1;
            }
            var8 = this.a(param2, (byte) -127, param4) ? 1 : 0;
            if (var8 != 0 &&
              !param0) {
              this.field_Q = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var6), "qe.QC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean q(int param0) {
        boolean discarded$0 = false;
        int stackIn_12_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var2_intLifetime1;
        try {
          var2_int = 0;
          var3 = ef.field_i[this.field_L][fh.field_e];
          var4 = dd.field_l[fh.field_e][var3][this.field_kb] ? 1 : 0;
          var5 = cb.field_b[fh.field_e][var3][this.field_kb] ? 1 : 0;
          var6 = bi.field_e[fh.field_e][var3][this.field_kb];
          if (wb.field_p == null) {
            return false;
          }
          if (this.s(2) &&
            wb.field_p.field_db > 0) {
            stackIn_12_0 = 1;
          } else {
            stackIn_12_0 = 0;
          }
          var2_intLifetime1 = stackIn_12_0;
          var8 = -71 % ((param0 + 67) / 33);
          if (var2_intLifetime1 != 0 && (var5 != 0 ||
            var4 != 0)) {
            if (!wb.field_p.field_Y &&
              var4 != 0) {
              wb.field_p.field_Y = true;
              wb.field_p.field_G = wb.field_p.field_G + 10;
              wb.field_p.field_db = wb.field_p.field_db - var6;
              boolean decompiledSharedTail0 = !(wb.field_p.field_db > 0);
              if (!decompiledSharedTail0) {
                ei.a((byte) 66, 11 + wb.field_p.field_db % 3, vj.field_c);
                decompiledSharedTail0 = (TorChallenge.field_F);
              }
              if ((decompiledSharedTail0) &&
                (wb.field_p.field_db <= 0)) {
                wh.a(vj.field_c, 10, -81);
              }
            }
            wb.field_p.field_Q = this.field_Q + this.field_a * 64;
            stackIn_40_0 = (wb.field_p.field_Q >= 0) ? 1 : -1;
            var7 = stackIn_40_0;
            if (wb.field_p.field_Q * var7 > 128) {
              wb.field_p.field_Q = var7 * 128;
            }
            if (wb.field_p.field_db <= 0) {
              discarded$0 = this.a((byte) -34, wb.field_p);
            }
            if (this.field_L != 9) {
              this.field_Q = this.field_Q * 8 / 10;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.NA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = dg.field_T[param0];
          this.field_I = pl.field_b[var3_int];
          this.field_w = ae.field_A[var3_int];
          if (this.field_V > 2) {
            return;
          }
          this.field_db = dl.field_C[var3_int][this.field_V];
          this.field_nb = de.field_c[var3_int][this.field_V];
          this.field_K = mh.field_c[var3_int][this.field_V];
          this.field_M = ck.field_a[var3_int];
          this.field_cb = bc.field_l[var3_int];
          this.field_C = ll.field_k[var3_int][this.field_V];
          this.field_L = 0;
          if (param1 <= 41) {
            this.a(-49, 35, 18, 17, 35, 117, -19, 68);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "qe.HD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void g(int param0, int param1) {
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 > 0) {
            this.field_c = false;
            this.field_N = true;
          }
          if ((param0 <= 0 ||
            var4 != 0) &&
            param0 < 0) {
            this.field_N = false;
            this.field_c = true;
          }
          if (param1 <= 71) {
            this.field_hb = 5;
          }
          this.field_a = param0;
          if (this.field_c &&
            param0 * this.field_K < this.field_Q) {
            this.field_Q = this.field_Q + this.field_C * param0;
            if (var4 == 0) {
              return;
            }
          }
          if (this.field_N &&
            this.field_Q < param0 * this.field_K) {
            this.field_Q = this.field_Q + this.field_C * param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.MB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = -5 / ((param0 - 71) / 49);
          oa.field_g = 0;
          we.field_j = 0;
          if (fh.field_e != 0) {
            if (1 == fh.field_e) {
              this.L(64);
              if (var4 != 0) {
                this.G(0);
              }
            }
          } else {
            this.G(0);
          }
          boolean decompiledFrameRemainder1 = true;
          if (2 == this.field_L ||
            0 == this.field_L &&
            this.field_eb) {
            we.field_j = 3;
            decompiledFrameRemainder1 = (var4 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (this.field_L != 1) {
              if (this.field_L != 0 ||
                !wh.field_b ||
                fh.field_e != 0) {
                if (this.field_L == 12 && (this.field_Q > 0 ||
                  this.field_g == 4)) {
                  we.field_j = 4;
                  decompiledFrameRemainder1 = (var4 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (12 != this.field_L ||
                    0 <= this.field_Q &&
                    5 != this.field_g) {
                    if (0 != this.field_L ||
                      4 != this.field_g &&
                      this.field_g != 5 ||
                      !(kk.field_h[6][fh.field_e] > 0)) {
                      if (this.field_L != 9 && (this.field_L != 0 ||
                        !bk.field_w)) {
                        if (this.field_L != 0 ||
                          0 != this.field_Q) {
                          if (this.field_L == 0 &&
                            this.field_Q != 0) {
                            we.field_j = 1;
                            decompiledFrameRemainder1 = (var4 != 0);
                          }
                          if (decompiledFrameRemainder1) {
                            if (this.field_L == 3) {
                              we.field_j = 8;
                              decompiledFrameRemainder1 = (var4 != 0);
                            }
                            if (decompiledFrameRemainder1) {
                              if (4 == this.field_L) {
                                we.field_j = 9;
                                decompiledFrameRemainder1 = (var4 != 0);
                              }
                              if (decompiledFrameRemainder1) {
                                if (this.field_L != 5) {
                                  if (this.field_L == 10) {
                                    we.field_j = 11;
                                    decompiledFrameRemainder1 = (var4 != 0);
                                  }
                                  if (decompiledFrameRemainder1) {
                                    if (this.field_L == 8) {
                                      if ((fh.field_e != 1) &&
                                        (decompiledFrameRemainder1 = (2 == fh.field_e))) {
                                        we.field_j = 15;
                                        decompiledFrameRemainder1 = (var4 != 0);
                                      }
                                      if (decompiledFrameRemainder1) {
                                        we.field_j = 14;
                                        decompiledFrameRemainder1 = (var4 != 0);
                                      }
                                    }
                                    if ((decompiledFrameRemainder1) &&
                                      (decompiledFrameRemainder1 = (this.field_L == 13))) {
                                      we.field_j = 7;
                                      decompiledFrameRemainder1 = (var4 != 0);
                                    }
                                  }
                                }
                                if (decompiledFrameRemainder1) {
                                  we.field_j = 10;
                                  decompiledFrameRemainder1 = (var4 != 0);
                                }
                              }
                            }
                          }
                        }
                        if (decompiledFrameRemainder1) {
                          we.field_j = 0;
                          decompiledFrameRemainder1 = (var4 != 0);
                        }
                      }
                      if (decompiledFrameRemainder1) {
                        we.field_j = 12;
                        decompiledFrameRemainder1 = (this.field_L == 0);
                        if ((decompiledFrameRemainder1) &&
                          (decompiledFrameRemainder1 = (!(this.field_j) ||
                          this.field_Q == 0))) {
                          bk.field_w = false;
                          decompiledFrameRemainder1 = (var4 != 0);
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      we.field_j = 6;
                      if (var4 != 0) {
                        we.field_j = 5;
                        we.field_j = 13;
                        we.field_j = 2;
                      }
                    }
                  } else {
                    we.field_j = 5;
                    if (var4 != 0) {
                      we.field_j = 13;
                      we.field_j = 2;
                    }
                  }
                }
              } else {
                we.field_j = 13;
                if (var4 != 0) {
                  we.field_j = 2;
                }
              }
            } else {
              we.field_j = 2;
            }
          }
          if (we.field_j != this.field_g) {
            this.field_g = we.field_j;
            this.field_p = ef.field_k;
          }
          boolean decompiledFrameRemainder0 = true;
          if (we.field_j != 3) {
            if (we.field_j == 2) {
              if (ef.field_k - this.field_p - qi.field_f[we.field_j][fh.field_e] <= 0) {
                oa.field_g = 0;
                decompiledFrameRemainder0 = (var4 != 0);
              }
              if (decompiledFrameRemainder0) {
                oa.field_g = 1;
                decompiledFrameRemainder0 = (var4 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (ja.a((byte) 101, this.field_L) ||
                0 == this.field_L &&
                we.field_j == 12) {
                oa.field_g = this.field_kb;
                decompiledFrameRemainder0 = (var4 != 0);
              }
              if (decompiledFrameRemainder0) {
                oa.field_g = (ef.field_k - this.field_p) / qi.field_f[we.field_j][fh.field_e];
                if ((-1 + kk.field_h[we.field_j][fh.field_e]) <= oa.field_g &&
                  !jh.field_b[we.field_j][fh.field_e]) {
                  oa.field_g = kk.field_h[we.field_j][fh.field_e] - 1;
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  oa.field_g = oa.field_g % kk.field_h[we.field_j][fh.field_e];
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            boolean decompiledSharedTail0 = (this.field_L != 2);
            if (!decompiledSharedTail0) {
              this.field_v = true;
              oa.field_g = 0;
              decompiledSharedTail0 = (var4 != 0);
            }
            if (decompiledSharedTail0) {
              if (this.field_v) {
                this.field_v = false;
                this.field_p = ef.field_k;
              }
              if ((ef.field_k - this.field_p) > qi.field_f[we.field_j][fh.field_e]) {
                this.field_eb = false;
              }
              oa.field_g = 1;
            }
          }
          if (we.field_j == 1) {
            var3 = pi.field_g[fh.field_e][oa.field_g] ? 1 : 0;
            if (var3 != 0 &&
              0 == (-this.field_p + ef.field_k) % qi.field_f[we.field_j][fh.field_e]) {
              jc.b(fh.field_e, 1, 3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.BA(" + param0 + ')');
        }
    }

    private final boolean c(byte param0, boolean param1) {
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_45_0Lifetime1;
        int stackIn_45_1Lifetime1;
        int var9Lifetime1;
        int var16Lifetime1;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          var3_int = this.field_o;
          var4 = 32 * var3_int;
          var6 = var4 + this.field_B * 32 / 256 + this.field_I;
          var7 = 2048;
          var8 = 0;
          if (var6 >= var7) {
            var6 = var6 % var7;
            var8 = 1;
          }
          var5 = var6 / 32;
          var9 = var3_int;
          var10 = var5;
          if (var8 != 0) {
            var10 = 63;
          }
          var11 = this.field_H;
          var12 = 64 * this.field_u / 256 + this.field_H * 64;
          var14 = -this.field_w + var12;
          if (var11 < 0) {
            var11 = 0;
          }
          var13 = var14 / 64;
          if (var13 < 0) {
            var13 = 0;
          }
          if (ol.field_g.field_a <= var11) {
            var11 = -1 + ol.field_g.field_a;
          }
          if (var13 >= ol.field_g.field_a) {
            var13 = -1 + ol.field_g.field_a;
          }
          if (param0 != 88) {
            this.field_j = true;
          }
          var15 = var9;
          while (true) {
            stackIn_22_0 = var15;
            stackIn_22_1 = var10;
            if (stackIn_22_0 <= stackIn_22_1) {
              stackIn_42_0 = var13;
              if (var17 == 0) {
                var16 = stackIn_42_0;
                while (var11 >= var16) {
                  stackIn_22_0 = -1;
                  stackIn_22_1 = ~(ic.field_E[var15][var16] & 32);
                  if (stackIn_22_0 > stackIn_22_1) {
                    if (param1) {
                      this.field_B = 0;
                      this.field_o = var15;
                      this.field_H = 1 + var16;
                      if (this.field_H >= ol.field_g.field_a) {
                        this.field_H = ol.field_g.field_a - 1;
                      }
                      this.field_u = 0;
                    }
                    return true;
                  }
                  var16++;
                }
                var15++;
                continue;
              }
            } else {
              stackIn_42_0 = var8;
            }
            boolean decompiledFrameCompleted0 = true;
            if (stackIn_42_0 != 0) {
              var10 = var5;
              var9Lifetime1 = 0;
              var15 = var9Lifetime1;
              while (true) {
                stackIn_45_0 = var15;
                stackIn_45_1 = var10;
                if (stackIn_45_0 > stackIn_45_1) {
                  break;
                }
                stackIn_63_0 = var13;
                if (var17 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var16Lifetime1 = stackIn_63_0;
                while (var11 >= var16Lifetime1) {
                  stackIn_45_0Lifetime1 = 0;
                  stackIn_45_1Lifetime1 = ic.field_E[var15][var16Lifetime1] & 32;
                  if (stackIn_45_0Lifetime1 < stackIn_45_1Lifetime1) {
                    if (param1) {
                      this.field_B = 0;
                      this.field_H = 1 + var16Lifetime1;
                      this.field_o = var15;
                      this.field_u = 0;
                      if (this.field_H >= ol.field_g.field_a) {
                        this.field_H = -1 + ol.field_g.field_a;
                      }
                    }
                    return true;
                  }
                  var16Lifetime1++;
                }
                var15++;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_63_0 = 0;
            }
            return stackIn_63_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.OB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          var4 = param0 - 8;
          if (param1 >= ~var4 &&
            var4 < 4) {
            var3_int = ab.field_d * cd.field_d[var4];
            qk.field_lb = qk.field_lb + 1;
            if (param0 == 11) {
              hd.field_c[vj.field_c] = p.a(hd.field_c[vj.field_c], 1 << -1 + ea.field_e);
            }
          }
          if (param0 == 13 &&
            db.field_B >= 10) {
            var3_int = ab.field_d * 500;
          }
          tf.field_o = tf.field_o + var3_int;
          pd.field_c = pd.field_c - var3_int;
          ub.field_j = ub.field_j - 1;
          pi.field_f = pi.field_f - al.field_z;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.GB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var13Lifetime1;
        int var7_intLifetime1Lifetime1;
        int var8Lifetime1Lifetime1;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param4 <= 13) {
            return;
          }
          var7_int = 0;
          var8 = 0;
          stackIn_7_0 = (0 <= this.field_a) ? 0 : 1;
          var9 = stackIn_7_0;
          var10 = ae.field_s[dg.field_T[this.field_F]];
          stackIn_11_0 = (0 >= this.field_G) ? 0 : 1;
          var11 = stackIn_11_0;
          var12 = bc.field_l[dg.field_T[this.field_F]] ? 1 : 0;
          if (this.field_F == 23) {
            nd.a(-996593372, param2, param3);
            return;
          }
          if (this.field_F == 24) {
            if (this.field_a < 0) {
              if (cb.field_f == null) {
                cb.field_f = new ka(ki.field_e[dg.field_T[24]], ae.field_s[dg.field_T[24]]);
              }
              cb.field_f.d();
              qg.b();
              dj.field_O.d(0, 0);
              la.field_f.a(110);
              cb.field_f.d(param2, param3, param5 - param2, ae.field_s[dg.field_T[24]]);
              if (var15 == 0) {
                return;
              }
            }
            dj.field_O.d(param2, param3, -param2 + param5, ae.field_s[dg.field_T[24]]);
            return;
          }
          if (0 <= dg.field_T[this.field_F] &&
            dg.field_T[this.field_F] < ah.field_d.length) {
            if (this.field_g >= 0 &&
              this.field_g < ah.field_d[dg.field_T[this.field_F]].length) {
              if (this.field_V >= 0 &&
                ah.field_d[dg.field_T[this.field_F]][this.field_g].length > this.field_V) {
                if (0 <= this.field_P &&
                  this.field_P < ah.field_d[dg.field_T[this.field_F]][this.field_g][this.field_V].length) {
                  if (this.field_F == 5 &&
                    this.field_D == 0) {
                    qg.a(bf.field_l);
                    mb.field_e.d();
                    qg.b();
                    ah.field_d[dg.field_T[this.field_F]][this.field_g][this.field_V][this.field_P].d(0, 0, param5 - param2, var10);
                    jc.field_i.d();
                    qg.b();
                    mb.field_e.b(0, var10 - this.field_w >> 1);
                    la.field_f.a(126);
                    qg.b(bf.field_l);
                  }
                  if (var9 != 0) {
                    qg.a(bf.field_l);
                    mb.field_e.d();
                    qg.b();
                    ah.field_d[dg.field_T[this.field_F]][this.field_g][this.field_V][this.field_P].d(0, 0, param5 - param2, var10);
                    jj.field_e.d();
                    qg.b();
                    if (5 != this.field_F ||
                      this.field_D != 0) {
                      mb.field_e.d(0, 0);
                      if (var15 != 0) {
                        jc.field_i.d(0, 0);
                      }
                    } else {
                      jc.field_i.d(0, 0);
                    }
                    la.field_f.a(112);
                    qg.b(bf.field_l);
                  }
                  if (6 == this.field_g) {
                    if (0 == this.field_P &&
                      !this.field_T) {
                      if (var9 == 0) {
                        this.a(param1, param0, -128 + this.field_B, this.field_H, this.field_o, 22, 2657, -128 + this.field_u);
                      }
                      if (var9 != 0 ||
                        var15 != 0) {
                        this.a(param1, param0, 256 * (16 + (this.field_I - pl.field_b[dg.field_T[22]])) / 32 + this.field_B, this.field_H, this.field_o, 22, 2657, -128 + this.field_u);
                      }
                      ah.field_d[dg.field_T[22]][1][this.field_V][0].d(dl.field_n[0], dl.field_n[2], dl.field_n[1] - dl.field_n[0], ae.field_s[dg.field_T[22]]);
                      if ((var15 != 0) && (this.field_P == 1 &&
                        !this.field_T)) {
                        if (var9 != 0) {
                          this.a(param1, param0, this.field_B + (-32 + (-pl.field_b[dg.field_T[22]] + this.field_I)) * 256 / 32, this.field_H, this.field_o, 22, 2657, -256 + this.field_u);
                        }
                        this.a(param1, param0, 256 + this.field_B, this.field_H, this.field_o, 22, 2657, this.field_u - 256);
                        ah.field_d[dg.field_T[22]][1][this.field_V][0].d(dl.field_n[0], dl.field_n[2], -dl.field_n[0] + dl.field_n[1], ae.field_s[dg.field_T[22]]);
                      }
                    } else {
                      if (this.field_P == 1 &&
                        !this.field_T) {
                        if (var9 != 0) {
                          this.a(param1, param0, this.field_B + (-32 + (-pl.field_b[dg.field_T[22]] + this.field_I)) * 256 / 32, this.field_H, this.field_o, 22, 2657, -256 + this.field_u);
                        }
                        if (var9 == 0 ||
                          var15 != 0) {
                          this.a(param1, param0, 256 + this.field_B, this.field_H, this.field_o, 22, 2657, this.field_u - 256);
                        }
                        ah.field_d[dg.field_T[22]][1][this.field_V][0].d(dl.field_n[0], dl.field_n[2], -dl.field_n[0] + dl.field_n[1], ae.field_s[dg.field_T[22]]);
                      }
                    }
                  }
                  L17: {
                    if (this.field_F != 4 ||
                      this.field_g == 4) {
                      if (7 == this.field_F &&
                        this.field_m) {
                        if (0 != this.field_P) {
                          this.field_m = false;
                          if (var15 == 0) {
                            break L17;
                          }
                        }
                        var13 = (ef.field_k - this.field_p << 7) / ik.field_d[this.field_g][dg.field_T[this.field_F]][this.field_V] + 128;
                        if (var9 == 0) {
                          ah.field_d[dg.field_T[this.field_F]][this.field_g][this.field_V][this.field_P].b(param2, param3, -param2 + param5, var10, var13);
                        }
                        if (var9 != 0 ||
                          var15 != 0) {
                          jj.field_e.d(-96 + (-param2 + param5 + param2), param3, var13);
                        }
                        if (var15 == 0) {
                          break L17;
                        }
                      }
                      if ((var11 == 0 ||
                        this.field_g == 4) &&
                        (!ol.field_a ||
                        ~this.field_o != ~ol.field_g.field_l ||
                        ~ol.field_g.field_i != ~this.field_H)) {
                        if (var9 == 0) {
                          if (this.field_F == 5 &&
                            this.field_D == 0) {
                            var8Lifetime1 = param3 + var10 - 96;
                            var7_intLifetime1 = param2;
                            if (4 == this.field_g &&
                              var12 == 0) {
                              this.a(jc.field_i, var8Lifetime1, var7_intLifetime1, 102);
                              if (var15 == 0) {
                                break L17;
                              }
                            }
                            jc.field_i.g(var7_intLifetime1, var8Lifetime1);
                            if (var15 == 0) {
                              break L17;
                            }
                          }
                          var7_intLifetime1 = param2;
                          if (5 != this.field_F) {
                            var8Lifetime1 = param3;
                            if (var15 != 0) {
                              var8Lifetime1 = param3 - (var10 - this.field_w >> 1);
                            }
                          } else {
                            var8Lifetime1 = param3 - (var10 - this.field_w >> 1);
                          }
                          if (this.field_g != 4 ||
                            var12 != 0) {
                            ah.field_d[dg.field_T[this.field_F]][this.field_g][this.field_V][this.field_P].d(var7_intLifetime1, var8Lifetime1, -param2 + param5, var10);
                            if (var15 == 0) {
                              break L17;
                            }
                          }
                          qg.a(bf.field_l);
                          mb.field_e.d();
                          qg.b();
                          ah.field_d[dg.field_T[this.field_F]][this.field_g][this.field_V][this.field_P].d(0, 0, -param2 + param5, var10);
                          la.field_f.a(100);
                          qg.b(bf.field_l);
                          this.a(mb.field_e, var8Lifetime1, var7_intLifetime1, 34);
                          if (var15 == 0) {
                            break L17;
                          }
                        }
                        if (this.field_F != 5 ||
                          this.field_D != 0) {
                          if (this.field_F != 22 ||
                            !this.field_q) {
                            var8Lifetime1 = param3 - (var10 - this.field_w >> 1);
                            var7_intLifetime1 = -96 + param5 + (-param2 + param2);
                            if (4 == this.field_g &&
                              var12 == 0) {
                              this.a(jj.field_e, var8Lifetime1, var7_intLifetime1, 103);
                              if (var15 == 0) {
                                break L17;
                              }
                            }
                            jj.field_e.g(var7_intLifetime1, var8Lifetime1);
                            if (var15 == 0) {
                              break L17;
                            }
                          }
                          jj.field_e.g(param2 + (-param2 + param5) - 96, param3);
                          if (var15 == 0) {
                            break L17;
                          }
                        }
                        var8Lifetime1 = param3 - 96 + var10;
                        var7_intLifetime1 = param5 + (-param2 - 96) + param2;
                        if (4 == this.field_g &&
                          var12 == 0) {
                          this.a(jj.field_e, var8Lifetime1, var7_intLifetime1, 74);
                          if (var15 == 0) {
                            break L17;
                          }
                        }
                        jj.field_e.g(var7_intLifetime1, var8Lifetime1);
                        if (var15 == 0) {
                          break L17;
                        }
                      }
                      var13Lifetime1 = 0;
                      var14 = this.field_G;
                      if (var14 < 0) {
                        var14 = 0;
                      }
                      if (10 < var14) {
                        var14 = 10;
                      }
                      if (var14 <= 5) {
                        var13Lifetime1 = (1275 - var14 * 255) / 5;
                      }
                      if (var14 > 5 ||
                        var15 != 0) {
                        var13Lifetime1 = (255 * var14 - 1275) / 5;
                      }
                      if (ol.field_a &&
                        this.field_o == ol.field_g.field_l &&
                        ~ol.field_g.field_i == ~this.field_H) {
                        var13Lifetime1 = 1;
                      }
                      if (var13Lifetime1 <= 0) {
                        var13Lifetime1 = 1;
                      }
                      boolean decompiledFrameRemainder0 = true;
                      if (var9 == 0) {
                        if (5 == this.field_F &&
                          this.field_D == 0) {
                          var7_intLifetime1Lifetime1 = param2;
                          var8Lifetime1Lifetime1 = var10 - 96 + param3;
                          jc.field_i.a(var7_intLifetime1Lifetime1, var8Lifetime1Lifetime1, var13Lifetime1, 16711680);
                          decompiledFrameRemainder0 = (var15 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          var8Lifetime1Lifetime1 = param3;
                          var7_intLifetime1Lifetime1 = param2;
                          if (5 == this.field_F) {
                            var8Lifetime1Lifetime1 = -(var10 - this.field_w >> 1) + var8Lifetime1Lifetime1;
                          }
                          ah.field_d[dg.field_T[this.field_F]][this.field_g][this.field_V][this.field_P].a(var7_intLifetime1Lifetime1, var8Lifetime1Lifetime1, var13Lifetime1, 16711680);
                        }
                      }
                      if ((decompiledFrameRemainder0) &&
                        (var9 != 0 ||
                        var15 != 0)) {
                        if (this.field_F != 5 ||
                          this.field_D != 0) {
                          var8Lifetime1Lifetime1 = param3;
                          var7_intLifetime1Lifetime1 = param2 + (-96 - (-param5 + param2));
                          if (this.field_F == 5) {
                            var8Lifetime1Lifetime1 = -(-this.field_w + var10 >> 1) + var8Lifetime1Lifetime1;
                          }
                          jj.field_e.a(var7_intLifetime1Lifetime1, var8Lifetime1Lifetime1, var13Lifetime1, 16711680);
                          if (var15 != 0) {
                            var8Lifetime1Lifetime1 = param3 - 96 + var10;
                            var7_intLifetime1Lifetime1 = -param2 + param5 - 96 + param2;
                            jj.field_e.a(var7_intLifetime1Lifetime1, var8Lifetime1Lifetime1, var13Lifetime1, 16711680);
                          }
                        } else {
                          var8Lifetime1Lifetime1 = param3 - 96 + var10;
                          var7_intLifetime1Lifetime1 = -param2 + param5 - 96 + param2;
                          jj.field_e.a(var7_intLifetime1Lifetime1, var8Lifetime1Lifetime1, var13Lifetime1, 16711680);
                        }
                      }
                      if (var15 != 0) {
                        this.a(param3, param5, (byte) 87, param2, ah.field_d[dg.field_T[this.field_F]][this.field_g][this.field_V][this.field_P], this.field_P);
                      }
                    } else {
                      this.a(param3, param5, (byte) 87, param2, ah.field_d[dg.field_T[this.field_F]][this.field_g][this.field_V][this.field_P], this.field_P);
                    }
                  }
                  if (this.field_g == 7) {
                    this.a(param0, this.field_P, param1, (byte) 100);
                  }
                  return;
                }
                return;
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var7), "qe.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void L(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = af.a(-4275, this.field_L) ? 1 : 0;
          if (param0 <= 35) {
            this.field_B = 127;
          }
          if (var2_int != 0) {
            return;
          }
          if (13 == this.field_L) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = kf.field_d;
          if (var3 == 1 &&
            var4 == 0) {
            this.field_L = 0;
            return;
          } else {
            decompiledFrameRemainder0 = (0 == var3);
          }
          if (decompiledFrameRemainder0) {
            this.field_L = 0;
            if (var4 == 0) {
              return;
            }
          }
          this.field_L = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.M(" + param0 + ')');
        }
    }

    private final void j(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_q = true;
          this.field_jb = param0;
          this.field_D = 0;
          this.field_h = 0;
          this.field_Q = 0;
          this.field_L = 13;
          if (this.field_F != 22 &&
            this.field_F != 7) {
            return;
          }
          hc.a(35, wb.field_p.field_H, this.field_V, 4, wb.field_p.field_o, dg.field_T[this.field_F], this.field_H, this.field_o);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.W(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int[][] stackIn_132_0;
        int stackIn_132_1;
        int stackIn_132_2;
        int stackIn_132_3;
        boolean stackIn_133_4;
        int[][] stackIn_156_0;
        int stackIn_156_1;
        int stackIn_156_2;
        int stackIn_156_3;
        boolean stackIn_157_4 = false;
        int[][] stackIn_163_0;
        int stackIn_163_1;
        int stackIn_163_2;
        int stackIn_163_3;
        boolean stackIn_164_4;
        int stackIn_177_0 = 0;
        int stackIn_177_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        String var14_ref_String = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object var11Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        var19 = TorChallenge.field_F ? 1 : 0;
        try {
          if (19 == this.field_F &&
            !ui.field_b) {
            return;
          }
          var4_int = dl.field_n[0];
          var5 = dl.field_n[1];
          var6 = dl.field_n[2];
          var7 = -112 / ((-25 - param0) / 49);
          var10 = 0;
          if (var5 > var4_int) {
            var11 = null;
            if (vg.a(this.field_F, -1)) {
              this.a(param1, param2, var4_int, var6, 47, var5);
            }
            var13 = 0;
            if (this.field_F >= 8 &&
              11 >= this.field_F) {
              if (100 <= ad.field_c) {
                ad.field_c = ad.field_c % 100;
              }
              var8 = 16;
              var9 = ad.field_c * var8 / 100;
              if (var9 >= 9) {
                var9 = var8 - var9;
                var10 = 1;
              }
              var11 = dk.field_c[-8 + this.field_F][var9];
              var13 = 1;
            }
            if (this.field_F == 15) {
              var11 = ec.field_a[3];
              var13 = 1;
            }
            if (this.field_F == 18) {
              var9Lifetime1 = 7;
              if (vj.field_c == 0) {
                var9Lifetime1 = 7;
                if (var19 != 0) {
                  if (vj.field_c == 1) {
                    var9Lifetime1 = 8;
                    if (var19 != 0 &&
                      vj.field_c == 2) {
                      var9Lifetime1 = 9;
                    }
                  } else {
                    if (vj.field_c == 2) {
                      var9Lifetime1 = 9;
                    }
                  }
                }
              } else {
                if (vj.field_c == 1) {
                  var9Lifetime1 = 8;
                  if (var19 != 0 &&
                    vj.field_c == 2) {
                    var9Lifetime1 = 9;
                  }
                } else {
                  if (vj.field_c == 2) {
                    var9Lifetime1 = 9;
                  }
                }
              }
              var11 = ec.field_a[var9Lifetime1];
              var13 = 1;
            }
            if (this.field_F == 19) {
              var13 = 1;
              var11 = ec.field_a[5];
            }
            if (this.field_F == 12 &&
              0 >= o.field_l) {
              var13 = 1;
              var11 = ec.field_a[0];
            }
            if (this.field_F == 13 && (!(o.field_l <= 0) ||
              ol.field_a)) {
              var13 = 1;
              var6 += 16;
              var11 = ec.field_a[1];
            }
            if (this.field_F == 14) {
              var11 = ec.field_a[6];
              var13 = 1;
            }
            if (var13 != 0) {
              if (var10 != 0) {
                if (pd.field_i == null) {
                  pd.field_i = new ka(dk.field_c[0][0].field_q, dk.field_c[0][0].field_v);
                }
                qg.a(bf.field_l);
                pd.field_i.d();
                qg.b();
                ((ka) (var11)).d(0, 0);
                la.field_f.a(-117);
                qg.b(bf.field_l);
                var11 = pd.field_i;
              }
              boolean decompiledFrameRemainder1 = true;
              qg.a(bf.field_l);
              qg.a(var4_int, var6, var4_int + ((ka) (var11)).field_q, ((ka) (var11)).field_v + var6);
              if (ol.field_a &&
                ~this.field_o == ~ol.field_g.field_l &&
                ~this.field_H == ~ol.field_g.field_i) {
                ((ka) (var11)).a(var4_int, var6, 16711680);
                decompiledFrameRemainder1 = (var19 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (this.field_F == 15 &&
                  wb.field_p != null && (~this.field_o == ~wb.field_p.field_r &&
                  ~this.field_H == ~wb.field_p.field_f ||
                  !this.field_nb)) {
                  if (!wa.field_pb[-(ea.field_e * 5) + this.field_V]) {
                    if (te.field_e == null) {
                      te.field_e = new ka(16 + ((ka) (var11)).field_q, ((ka) (var11)).field_v + 16);
                    }
                    te.field_e.d();
                    qg.b(bf.field_l);
                    qg.b();
                    ((ka) (var11)).a(0, 0, -(this.field_D * 5) + 255, 16777215);
                    la.field_f.a(115);
                    te.field_e.g(var4_int, var6);
                    var11 = te.field_e;
                    decompiledFrameRemainder1 = (var19 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    ec.field_a[4].g(var4_int, var6);
                    decompiledFrameRemainder1 = (var19 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (15 != this.field_F) {
                    if (0 < this.field_G &&
                      this.field_G % 4 >= 2) {
                      ((ka) (var11)).a(var4_int, var6, 16777215);
                      decompiledFrameRemainder1 = (var19 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      ((ka) (var11)).g(var4_int, var6);
                      if (var19 != 0) {
                        ((ka) (var11)).g(var4_int, var6);
                        qg.b(bf.field_l);
                        stackIn_132_0 = ob.field_c;
                        stackIn_132_1 = var6;
                        stackIn_132_2 = ((ka) (var11)).field_v;
                        stackIn_132_3 = 4;
                        stackIn_133_4 = (de.field_d % 8 == 0);
                        rd.a(stackIn_132_0, stackIn_132_1, stackIn_132_2, stackIn_132_3, stackIn_133_4, 4, -1012815519, ((ka) (var11)).field_q, var4_int, 10);
                      }
                    }
                  } else {
                    ((ka) (var11)).g(var4_int, var6);
                    qg.b(bf.field_l);
                    stackIn_132_0 = ob.field_c;
                    stackIn_132_1 = var6;
                    stackIn_132_2 = ((ka) (var11)).field_v;
                    stackIn_132_3 = 4;
                    stackIn_133_4 = (de.field_d % 8 == 0);
                    rd.a(stackIn_132_0, stackIn_132_1, stackIn_132_2, stackIn_132_3, stackIn_133_4, 4, -1012815519, ((ka) (var11)).field_q, var4_int, 10);
                  }
                }
              }
              if (this.field_L == 14) {
                var15 = -8 + this.field_F;
                if (0 <= var15 &&
                  var15 < cd.field_d.length) {
                  var14_ref_String = Integer.toString(ab.field_d * cd.field_d[var15]);
                  var16 = var4_int + (((ka) (var11)).field_q >> 1);
                  var17 = 24;
                  var18 = var6 + (((ka) (var11)).field_v >> 1) - ((var17 >> 1) - 6);
                  tf.field_x.a(var14_ref_String, var16, var18, 0, -1);
                }
              }
              if (this.field_F == 19 &&
                ol.field_a) {
                tf.field_x.c("X:" + this.field_o + " Y:" + this.field_H, var4_int, var6, 0, -1);
              }
              qg.b(bf.field_l);
              if (this.field_F != 13) {
                if (this.field_F == 12) {
                  stackIn_156_0 = ba.field_f;
                  stackIn_156_1 = var6;
                  stackIn_156_2 = ec.field_a[4].field_v;
                  stackIn_156_3 = 4;
                  stackIn_157_4 = (0 == de.field_d % 8);
                  rd.a(stackIn_156_0, stackIn_156_1, stackIn_156_2, stackIn_156_3, stackIn_157_4, 4, -1012815519, ec.field_a[4].field_q, var4_int, 2);
                  if (var19 != 0) {
                    stackIn_163_0 = p.field_f[e.b((byte) 57, 10)];
                    stackIn_163_1 = var6 + (ec.field_a[5].field_q >> 2);
                    stackIn_163_2 = ec.field_a[5].field_v >> 1;
                    stackIn_163_3 = 4;
                    stackIn_164_4 = (0 == de.field_d % 8);
                    rd.a(stackIn_163_0, stackIn_163_1, stackIn_163_2, stackIn_163_3, stackIn_164_4, 4, -1012815519, ec.field_a[5].field_q >> 1, (ec.field_a[5].field_q >> 2) + var4_int, 2);
                  }
                }
              } else {
                stackIn_163_0 = p.field_f[e.b((byte) 57, 10)];
                stackIn_163_1 = var6 + (ec.field_a[5].field_q >> 2);
                stackIn_163_2 = ec.field_a[5].field_v >> 1;
                stackIn_163_3 = 4;
                stackIn_164_4 = (0 == de.field_d % 8);
                rd.a(stackIn_163_0, stackIn_163_1, stackIn_163_2, stackIn_163_3, stackIn_164_4, 4, -1012815519, ec.field_a[5].field_q >> 1, (ec.field_a[5].field_q >> 2) + var4_int, 2);
              }
            }
            var12 = 0;
            if (this.field_F == 20) {
              var13Lifetime1 = 5;
              var14 = 0;
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (var13Lifetime1 > var14) {
                  stackIn_177_0 = -1;
                  stackIn_177_1 = ~(1 << var14 & vi.field_a);
                  if (var19 == 0) {
                    if (stackIn_177_0 <= stackIn_177_1) {
                    }
                    var14++;
                    continue;
                  }
                } else {
                  decompiledFrameRemainder0 = !(!ol.field_a);
                  if (decompiledFrameRemainder0) {
                    stackIn_177_0 = var4_int;
                    stackIn_177_1 = var6;
                  }
                }
                if (decompiledFrameRemainder0) {
                  qg.b(stackIn_177_0, stackIn_177_1, -var4_int + var5, 128, 16777215);
                }
                if (!ol.field_a) {
                  break;
                }
                if (this.field_o != ol.field_g.field_l) {
                  break;
                }
                if (ol.field_g.field_i != this.field_H) {
                  break;
                }
                qg.f(var4_int, var6, var5 - var4_int, 128, 16711680);
                break;
              }
            }
            if (this.field_F == 0 &&
              !ol.field_a) {
              if (mj.field_b &&
                wb.field_p.field_L != 19 &&
                20 != wb.field_p.field_L &&
                18 != wb.field_p.field_L) {
                this.a(var12, param2, var6, var4_int, var5, (byte) -119);
                if (var19 == 0) {
                  return;
                }
              }
              this.a((ka) null, var6, var5, (int[]) null, var12, -20861, var4_int, 0);
              if (var19 == 0) {
                return;
              }
            }
            if (0 != this.field_F ||
              !ol.field_a) {
              if (this.field_F != 28) {
                return;
              }
              this.a(var12, var6, var5, (byte) -66, var4_int);
              if (var19 == 0) {
                return;
              }
            }
            var13Lifetime2 = param1 / 32;
            var14Lifetime1 = 0;
            if (wb.field_p.field_o >= var13Lifetime2) {
              var14Lifetime1 = -var13Lifetime2 + wb.field_p.field_o;
              if (!(var14Lifetime1 < 32)) {
                var14Lifetime1 -= 32;
                if ((var19 != 0) &&
                  (wb.field_p.field_o < var13Lifetime2)) {
                  var14Lifetime1 = var13Lifetime2 - wb.field_p.field_o;
                  if (32 <= var14Lifetime1) {
                    var14Lifetime1 -= 32;
                  }
                }
              }
            } else {
              if (wb.field_p.field_o < var13Lifetime2) {
                var14Lifetime1 = var13Lifetime2 - wb.field_p.field_o;
                if (32 <= var14Lifetime1) {
                  var14Lifetime1 -= 32;
                }
              }
            }
            if (var14Lifetime1 < 16) {
              var11Lifetime1 = c.field_c[0][0][0];
              var12Lifetime1 = -(var5 - var4_int);
              var6 -= 32;
              ((ka) (var11Lifetime1)).g(var4_int + var12Lifetime1, var6);
              if (~ol.field_g.field_l == ~this.field_o &&
                ol.field_g.field_i == this.field_H) {
                ((ka) (var11Lifetime1)).a(var12Lifetime1 + var4_int, var6, 16711680);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "qe.JB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_o < 64 &&
            ol.field_g.field_a > this.field_H) {
            if (0 < (8 & ic.field_E[this.field_o][this.field_H])) {
              this.field_u = 192;
            }
            if ((ic.field_E[this.field_o][this.field_H] & 4) > 0) {
              this.field_u = 128;
            }
            if ((ic.field_E[this.field_o][this.field_H] & 2) > 0) {
              this.field_u = 64;
            }
            if (!param0) {
              this.field_r = 12;
            }
            if ((ic.field_E[this.field_o][this.field_H] & 1) > 0) {
              this.field_u = 0;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.WA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        boolean discarded$0 = false;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var4Lifetime1;
        int var8Lifetime1;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          var3_int = ef.field_i[this.field_L][fh.field_e];
          if (var3_int < 0) {
            return;
          }
          var6 = -122 / ((-75 - param1) / 39);
          var4 = 0;
          var5 = dd.field_l[fh.field_e][var3_int][this.field_kb] ? 1 : 0;
          var7 = cb.field_b[fh.field_e][var3_int][this.field_kb] ? 1 : 0;
          if (var5 != 0) {
            var8 = u.field_b[fh.field_e][var3_int][this.field_kb];
            if (var8 >= 0) {
              jc.b(fh.field_e, 1, var8);
            }
          }
          if ((var5 != 0 ||
            var7 != 0) && !wh.field_b) {
            boolean decompiledSharedTail0 = !(lc.field_r);
            if (!decompiledSharedTail0) {
              discarded$0 = this.q(-32);
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              lc.field_r = this.q(-7);
              if (lc.field_r) {
                jc.b(fh.field_e, 1, 5);
              }
            }
          }
          if (param0) {
            this.n((byte) -42);
          }
          var8Lifetime1 = mc.field_g[fh.field_e][var3_int][this.field_kb] - 1;
          var9 = of.field_a[fh.field_e][var3_int][this.field_kb] ? 1 : 0;
          me.field_g = hk.field_a[fh.field_e][var3_int][this.field_kb][0];
          stackIn_34_0 = (var8Lifetime1 > this.field_D) ? 0 : 1;
          var10 = stackIn_34_0;
          var4Lifetime1 = hk.field_a[fh.field_e][var3_int][this.field_kb][1];
          if (this.field_L != 10 ||
            0 > this.field_h ||
            !ol.field_g.a(2, this.field_e, this.field_w, this.field_I, -this.field_w + this.field_z)) {
            if (!this.field_ib ||
              var9 == 0 ||
              var10 == 0 ||
              me.field_g == 17) {
              if (var9 == 0 ||
                var10 == 0 ||
                17 == me.field_g) {
                if (var9 != 0 &&
                  var10 != 0 &&
                  me.field_g == 17) {
                  if (10 != this.field_L) {
                    if (this.field_L == 9) {
                      bk.field_w = true;
                    }
                    this.field_L = 0;
                    sf.field_c = sf.field_c + 1;
                    if (lb.field_p[fh.field_e] <= sf.field_c) {
                      sf.field_c = 0;
                    }
                    lc.field_r = false;
                    ni.field_b = false;
                    wb.field_p.field_Y = false;
                    this.field_D = 0;
                  }
                  if (0 != fh.field_e) {
                    return;
                  }
                  if (10 != this.field_L) {
                    return;
                  }
                  if (ra.field_q) {
                    return;
                  }
                  ra.field_q = true;
                  if (0 < ql.field_n) {
                    return;
                  }
                  ql.field_n = 25;
                  if (var11 == 0) {
                    return;
                  }
                }
                if (var10 == 0) {
                  this.field_D = this.field_D + 1;
                  if (var11 == 0) {
                    return;
                  }
                }
                if (var5 != 0 &&
                  !lc.field_r) {
                  jc.b(fh.field_e, 1, 2);
                }
                this.field_D = 0;
                this.field_kb = this.field_kb + 1;
                if (var11 == 0) {
                  return;
                }
              }
              if (fh.field_e == 1 &&
                8 == this.field_L &&
                !ad.field_a) {
                this.r(-1);
                ad.field_a = true;
              }
              if (2 == fh.field_e &&
                this.field_L == 8 &&
                !ad.field_a) {
                this.d((byte) 62);
                ad.field_a = true;
              }
              this.field_L = 0;
              wb.field_p.field_Y = false;
              ni.field_b = false;
              this.field_D = 0;
              lc.field_r = false;
              if (var11 == 0) {
                return;
              }
            }
            if (this.field_L != 10 &&
              10 == me.field_g) {
              this.field_h = -this.field_M;
            }
            if (2 == fh.field_e &&
              this.field_L == 8 &&
              !ad.field_a) {
              this.d((byte) -117);
              ad.field_a = true;
            }
            lc.field_r = false;
            ni.field_b = false;
            this.field_L = me.field_g;
            this.field_kb = var4Lifetime1;
            this.field_D = 0;
            wb.field_p.field_Y = false;
            if (var11 == 0) {
              return;
            }
          }
          lc.field_r = false;
          this.field_L = 2;
          this.field_D = 0;
          wb.field_p.field_Y = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.TC(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean g(boolean param0) {
        boolean stackIn_11_1 = false;
        int stackIn_14_2 = 0;
        boolean stackIn_15_3 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0) {
            this.field_l = -56;
          }
          if (0 != this.field_Q) {
            if (this.field_L != 0) {
              stackIn_11_1 = true;
            } else {
              stackIn_11_1 = this.field_mb;
            }
            stackIn_14_2 = -127;
            if (0 == this.field_L) {
              stackIn_15_3 = this.field_gb;
            } else {
              stackIn_15_3 = false;
            }
            var2_int = this.a(stackIn_11_1, (byte) stackIn_14_2, stackIn_15_3) ? 1 : 0;
            if (var2_int != 0) {
              if (this.field_F == 6) {
                qa.a(this.field_o, wb.field_p.field_H, dg.field_T[this.field_F], this, this.field_H, -1, 4, wb.field_p.field_o, 25, this.field_V);
              }
              if (this.field_cb) {
                return true;
              }
              if (0 >= this.field_lb &&
                0 == this.field_L &&
                112 < this.field_D &&
                this.field_F == 3) {
                this.field_lb = 187 - this.field_D;
              }
              boolean decompiledFrameRemainder1 = true;
              if (this.field_lb <= 0 &&
                this.field_L == 0 &&
                112 < this.field_D &&
                this.field_F == 2) {
                this.field_lb = 187 - this.field_D;
                decompiledFrameRemainder1 = (var3 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (0 >= this.field_lb &&
                  this.field_L == 0 &&
                  this.field_k &&
                  this.field_F == 3) {
                  this.field_lb = 50;
                  if (0 >= this.field_Q) {
                    this.field_a = 1;
                    if (var3 != 0) {
                      this.field_a = -1;
                    }
                  } else {
                    this.field_a = -1;
                  }
                  this.field_k = false;
                  decompiledFrameRemainder1 = (var3 != 0);
                }
                if ((decompiledFrameRemainder1) && (0 >= this.field_lb &&
                  this.field_L == 0)) {
                  if (this.field_Q > 0) {
                    this.field_a = -1;
                    if (var3 != 0) {
                      this.field_a = 1;
                    }
                  } else {
                    this.field_a = 1;
                  }
                  this.field_lb = 50;
                }
              }
              this.field_Q = 0;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_F == 3 &&
            this.field_k &&
            this.field_c) {
            this.field_Q = this.field_Q - 1;
            decompiledFrameRemainder0 = (var3 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_F != 3 ||
              !this.field_k ||
              !this.field_N) {
              if (!this.field_c ||
                this.field_G > 0 ||
                this.field_L != 0) {
                if (!this.field_N ||
                  this.field_G > 0 ||
                  this.field_L != 0) {
                  if (this.field_c &&
                    -this.field_K < this.field_Q &&
                    this.field_L != 12) {
                    this.field_Q = this.field_Q - this.field_C;
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameRemainder0 = (this.field_N)) &&
                    (decompiledFrameRemainder0 = !(this.field_Q >= this.field_K)) &&
                    (decompiledFrameRemainder0 = (this.field_L != 12))) {
                    this.field_Q = this.field_Q + this.field_C;
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_Q <= this.field_K) {
                    this.field_Q = this.field_Q + this.field_C;
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    this.field_Q = this.field_Q - this.field_C;
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                if (this.field_Q >= -this.field_K) {
                  this.field_Q = this.field_Q - this.field_C;
                  if (var3 != 0) {
                    this.field_Q = this.field_Q + this.field_C;
                    this.field_Q = this.field_Q + 1;
                  }
                } else {
                  this.field_Q = this.field_Q + this.field_C;
                  if (var3 != 0) {
                    this.field_Q = this.field_Q + 1;
                  }
                }
              }
            } else {
              this.field_Q = this.field_Q + 1;
            }
          }
          boolean decompiledSharedTail0 = (this.field_F != 3 ||
            !(this.field_k));
          if (!decompiledSharedTail0) {
            qa.a(this.field_o, wb.field_p.field_H, dg.field_T[this.field_F], this, this.field_H, -1, 7, wb.field_p.field_o, 25, this.field_V);
            decompiledSharedTail0 = (var3 != 0);
          }
          if ((decompiledSharedTail0) && (this.field_F == 4 &&
            !hc.field_Q)) {
            cb.a(25, wb.field_p.field_H, (byte) 125, wb.field_p.field_o);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.BB(" + param0 + ')');
        }
    }

    private final int h(int param0) {
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = dd.field_q;
          var3 = 0;
          var4 = var2[var3][0];
          var4 = var4 * 32;
          var5 = var2[var3][1];
          var5 = var5 * 32;
          if (param0 != -26698) {
            this.field_k = true;
          }
          if ((this.field_e + this.field_I) <= var4 ||
            this.field_e >= var5) {
            var3 = 1;
            var4 = var2[var3][0];
            var5 = var2[var3][1];
            var4 = 32 * var4;
            var5 = var5 * 32;
          }
          if ((this.field_e + this.field_I) > var4 &&
            var5 > this.field_e) {
            stackIn_15_0 = var3;
            return stackIn_15_0;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "qe.RA(" + param0 + ')');
        }
    }

    private final void B(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_38_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.a((byte) -50, fk.field_s) ? 1 : 0;
          if (var2_int == 0) {
            kf.field_d = 2;
            this.field_h = 0;
            if (!rk.field_e) {
              stackIn_10_0 = !(rk.field_e);
              rk.field_e = stackIn_10_0;
            }
            this.field_Q = 0;
            return;
          }
          var3 = this.b((byte) 109, false);
          if (var3 < 0) {
            kf.field_d = 2;
            if (!rk.field_e) {
              stackIn_23_0 = !(rk.field_e);
              rk.field_e = stackIn_23_0;
            }
            this.field_h = 0;
            this.field_Q = 0;
            return;
          }
          if (param0 < 125) {
            return;
          }
          var4 = this.c(false, var3);
          ma.field_k = this.f(-16452, var3);
          this.a(-1);
          var5 = 1;
          this.a(true, var5 != 0);
          var6 = this.b(true, -1);
          if (~var4 == ~var6) {
            kf.field_d = 1;
            if (!rk.field_e) {
              stackIn_38_0 = !(rk.field_e);
              rk.field_e = stackIn_38_0;
            }
            this.field_h = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.D(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 32 * param1[0][0];
          var4 = 32 * (1 + param1[0][1]);
          if (param0 != -50) {
            this.b((byte) -32);
          }
          var5 = 64 * param1[1][0];
          var6 = 64 * (1 + param1[1][1]);
          var7 = this.field_e;
          var8 = var7 + this.field_I;
          var9 = this.field_z;
          var10 = var9 - this.field_w;
          if (var7 < var3_int) {
            return false;
          }
          if (var4 < var8) {
            return false;
          }
          if (var5 > var10) {
            return false;
          }
          if (var6 < var9) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("qe.ED(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (ak.field_j[param1][0] < 0) {
            ak.field_j[param1][0] = this.field_o;
            ak.field_j[param1][1] = this.field_B;
            ak.field_j[param1][2] = this.field_H;
            ak.field_j[param1][3] = this.field_u;
          }
          if (ak.field_j[h.field_b[7][dg.field_T[3]][0] - 1][0] >= 0) {
            return;
          }
          var6 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6 > param1))) {
            stackIn_13_0 = 256 - (param1 - var6) * 256 / (h.field_b[7][dg.field_T[3]][0] * 2 - 2);
            if (var8 == 0) {
              var5_int = stackIn_13_0;
              this.a(param2, param0, ak.field_j[var6][1], ak.field_j[var6][2], ak.field_j[var6][0], this.field_F, 2657, ak.field_j[var6][3]);
              wh.field_f[var6].b(dl.field_n[0], dl.field_n[2], dl.field_n[1] - dl.field_n[0], this.field_w, var5_int);
              var6++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = -82 % ((param3 - 49) / 43);
          }
          var7 = stackIn_13_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "qe.FD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean c(int param0) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = fk.field_s[param0];
          var3 = 16;
          var4 = var3 + 64 * var2[0];
          var5 = var2[1] * 64 + 64;
          var6 = var4 + var5 >> 1;
          var7 = this.field_z;
          var8 = var7 - this.field_w;
          var9 = var8 + var7 >> 1;
          stackIn_4_0 = (var9 > var6) ? 0 : 1;
          var10 = stackIn_4_0;
          stackIn_5_0 = var10;
          return stackIn_5_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "qe.OA(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (this.field_G > 0) {
            this.field_G = this.field_G - 1;
            var2_int = 0;
            while (var2_int < 10) {
              stackIn_14_0 = this.field_F;
              stackIn_14_1 = ba.field_g[var2_int];
              if (var3 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_14_0 == stackIn_14_1) {
                la.a(this, 75);
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_14_0 = param0;
            stackIn_14_1 = -42;
          }
          if (stackIn_14_0 >= stackIn_14_1) {
            this.field_db = -106;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.OC(" + param0 + ')');
        }
    }

    private final void n(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        boolean stackIn_107_1 = false;
        boolean stackIn_108_2 = false;
        boolean stackIn_115_1 = false;
        int stackIn_118_2 = 0;
        boolean stackIn_119_3 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = ef.field_i[this.field_L][fh.field_e];
          var3 = ie.field_b[fh.field_e][var2_int][this.field_kb];
          var4 = ah.field_j[fh.field_e][var2_int][this.field_kb];
          var5 = k.field_c[fh.field_e][var2_int][this.field_kb];
          stackIn_5_0 = (0 >= var3) ? 0 : 1;
          var6 = stackIn_5_0;
          if (param0 != -42) {
            return;
          }
          if ((var5 >= 0 ||
            this.field_h != 0) &&
            (var5 <= 0 ||
            0 == this.field_h)) {
            stackIn_20_0 = 0;
          } else {
            stackIn_20_0 = 1;
          }
          boolean decompiledFrameRemainder1 = true;
          var7 = stackIn_20_0;
          var8 = vl.field_d[fh.field_e][var2_int][this.field_kb] ? 1 : 0;
          if ((!this.field_c ||
            this.field_a >= 0) && (!this.field_N ||
            this.field_a <= 0)) {
            stackIn_33_0 = 0;
            decompiledFrameRemainder1 = false;
          }
          else {
            stackIn_33_0 = 1;
          }
          var9 = stackIn_33_0;
          stackIn_37_0 = (var4 <= this.field_a * this.field_Q) ? 0 : 1;
          var10 = stackIn_37_0;
          if (var7 != 0) {
            this.field_h = this.field_h + var5;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_L == 10) {
            var9 = 1;
            if (this.field_a < 0 &&
              -var4 < this.field_Q) {
              this.field_Q = this.field_Q - var3;
              decompiledFrameRemainder0 = (var12 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = !(this.field_a < 0)) &&
              (decompiledFrameRemainder0 = !(var4 <= this.field_Q))) {
              this.field_Q = this.field_Q + var3;
              decompiledFrameRemainder0 = (var12 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (var6 != 0 &&
              !lc.field_r &&
              var10 != 0 && (var9 != 0 ||
              var8 != 0)) {
              this.field_Q = this.field_Q + this.field_a * var3;
              decompiledFrameRemainder0 = (var12 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (var6 != 0 &&
                !lc.field_r &&
                var10 != 0) {
                this.field_Q = this.field_Q + this.field_a;
                decompiledFrameRemainder0 = (var12 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (var6 != 0) {
                  if (lc.field_r &&
                    this.field_L != 9 &&
                    0 < this.field_a * this.field_Q) {
                    this.field_Q = this.field_Q - var3 * this.field_a;
                    if (var12 != 0) {
                      this.field_Q = (-var3 * (this.field_Q * this.field_a) >> 3) * this.field_a;
                    }
                  }
                } else {
                  this.field_Q = (-var3 * (this.field_Q * this.field_a) >> 3) * this.field_a;
                }
              }
            }
          }
          stackIn_107_1 = true;
          stackIn_108_2 = (this.field_L != 10);
          this.a(stackIn_107_1, stackIn_108_2);
          if (this.field_Q != 0) {
            stackIn_115_1 = (9 != this.field_L);
            stackIn_118_2 = -127;
            stackIn_119_3 = (this.field_L != 10);
            var11 = this.a(stackIn_115_1, (byte) stackIn_118_2, stackIn_119_3) ? 1 : 0;
            if (var11 != 0) {
              this.field_Q = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.AC(" + param0 + ')');
        }
    }

    private final void C(int param0) {
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        RuntimeException var2_ref = null;
        try {
          this.field_Q = 0;
          if (param0 >= -104) {
            this.field_H = -10;
          }
          var2 = new qe(this.field_o, this.field_H, 22, this.field_V);
          ef.a(0, var2);
          boolean decompiledSharedTail0 = !(this.field_a > 0);
          if (!decompiledSharedTail0) {
            var2.field_B = this.field_B + 384 * this.field_a;
            decompiledSharedTail0 = (TorChallenge.field_F);
          }
          if ((decompiledSharedTail0) &&
            (this.field_a < 0)) {
            var2.field_B = 192 * this.field_a + this.field_B;
          }
          var2.field_u = -192 + this.field_u;
          var2.field_Q = this.field_a * 10;
          this.field_T = true;
          var2.field_a = this.field_a;
          var2.field_X = false;
          var2.field_i = false;
          var2.field_e = 32 * var2.field_o + var2.field_B * 32 / 256;
          var2.field_z = 64 * var2.field_u / 256 + var2.field_H * 64;
          hc.a(44, wb.field_p.field_H, this.field_V, 6, wb.field_p.field_o, dg.field_T[this.field_F], this.field_H, this.field_o);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "qe.SC(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        qe var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = tj.field_c[0] << 3;
          var3 = tj.field_c[1] << 3;
          var4 = ki.field_e[dg.field_T[24]];
          var5 = new qe(this.field_o, this.field_H, 24, 0);
          var5.field_e = this.field_e;
          boolean decompiledSharedTail0 = !(this.field_a >= 0);
          if (!decompiledSharedTail0) {
            var5.field_e = var5.field_e + var2_int;
            decompiledSharedTail0 = (TorChallenge.field_F);
          }
          if (decompiledSharedTail0) {
            var5.field_a = -1;
            var5.field_e = var5.field_e + (this.field_I - var2_int - var4);
          }
          var5.field_z = var3 + this.field_z - this.field_w;
          var6 = -125 / ((param0 + 30) / 46);
          var7 = 2048;
          var8 = 64 * ol.field_g.field_a;
          if (var5.field_e >= var7) {
            var5.field_e = -var7 + var5.field_e;
          }
          if (var8 <= var5.field_z) {
            var5.field_z = -1 + var8;
          }
          if (var5.field_e < 0) {
            var5.field_e = var7 - var5.field_e;
          }
          if (0 > var5.field_z) {
            var5.field_z = 0;
          }
          var5.field_o = var5.field_e / 32;
          var5.field_u = var5.field_z % 64 * 256 / 64;
          var5.field_H = var5.field_z / 64;
          var5.field_B = var5.field_e % 32 * 256 / 32;
          var5.field_cb = true;
          ef.a(0, var5);
          var5.field_D = 125;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.GC(" + param0 + ')');
        }
    }

    private final boolean J(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        try {
          var2_int = v.field_S[fh.field_e];
          if (param0 != -16517) {
            return true;
          }
          var3 = wb.field_p.field_e + (wb.field_p.field_I >> 1);
          var4 = (this.field_I >> 1) + this.field_e;
          var5 = -var2_int + var3;
          var6 = var4 - var2_int;
          stackIn_7_0 = (0 <= var5) ? 1 : -1;
          var5Lifetime1 = stackIn_7_0;
          stackIn_11_0 = (var6 < 0) ? -1 : 1;
          var6Lifetime1 = stackIn_11_0;
          return (var6Lifetime1 == var5Lifetime1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.HB(" + param0 + ')');
        }
    }

    private final boolean a(qe param0, int param1, boolean param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          var4 = this;
          if (var4 != null &&
            ((qe) (var4)).field_F == 0) {
            if (param0 == null) {
              return false;
            }
            var5 = ((qe) (var4)).field_I / 2 + this.field_e;
            var6 = this.field_z - ((qe) (var4)).field_w / param1;
            var7 = vj.field_c;
            var8 = pl.field_e[this.field_L];
            var9 = tg.field_w[var7][var8][this.field_kb];
            if (param2) {
              var9 = ab.field_e;
            }
            var10 = var5 + var9[0];
            var11 = var9[1] + var6;
            var12 = var9[2];
            if (((qe) (var4)).field_a < 0) {
              var10 = 2 * var5 + (-var10 - var12);
            }
            var13 = var9[3];
            var14 = param0.field_e;
            if (-var10 + var14 > 1024) {
              var14 -= 2048;
            }
            if (-var10 + var14 < -1024) {
              var14 += 2048;
            }
            var15 = -param0.field_w + param0.field_z;
            var16 = param0.field_I;
            var17 = param0.field_w;
            if (o.a(var17, var11, var16, var12, var13, var14, var10, (byte) 9, var15)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("qe.K(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean a(boolean param0, byte param1, boolean param2) {
        int stackIn_65_0 = 0;
        ra stackIn_71_0;
        int stackIn_71_1;
        int stackIn_71_2;
        int stackIn_71_3;
        int stackIn_72_4 = 0;
        int stackIn_75_2 = 0;
        int stackIn_76_3 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 != -127) {
            this.a(83, -26, -56, 4, -8, -73, -64, -26);
          }
          var4_int = this.field_B;
          this.field_B = this.field_B + this.field_Q;
          if (this.field_Q >= 0) {
            var5 = 1;
            if (var7 != 0) {
              var5 = -1;
            }
          } else {
            var5 = -1;
          }
          boolean decompiledFrameRemainder0 = true;
          this.e(-126);
          if (param2 &&
            ol.field_g.a(2, this.field_o * 32 + 32 * this.field_B / 256, this.field_w, this.field_I, -this.field_w + this.field_H * 64 + this.field_u * 64 / 256) &&
            ~var4_int != ~this.field_B &&
            !ol.field_g.a(2, 32 * this.field_o + this.field_B * 32 / 256, this.field_w, this.field_I, 64 * this.field_u / 256 + 64 * this.field_H - this.field_w - 16)) {
            this.field_u = this.field_u - 64;
            decompiledFrameRemainder0 = !(this.field_u >= 0);
            if (decompiledFrameRemainder0) {
              this.field_u = this.field_u + 256;
              this.field_H = this.field_H - 1;
              decompiledFrameRemainder0 = !(0 <= this.field_H);
              if (decompiledFrameRemainder0) {
                this.field_H = this.field_H + ol.field_g.field_a;
                decompiledFrameRemainder0 = (var7 != 0);
              }
            }
          }
          if ((decompiledFrameRemainder0) && (param2 &&
            ol.field_g.a(2, this.field_o * 32 + 32 * (-(var5 * 256) + this.field_B) / 256, this.field_w, this.field_I, 16 + this.field_u * 64 / 256 + (this.field_H * 64 - this.field_w)) &&
            !ol.field_g.a(2, this.field_B * 32 / 256 + this.field_o * 32, this.field_w, this.field_I, 16 + (this.field_H * 64 + (this.field_u * 64 / 256 - this.field_w))) &&
            ~this.field_B != ~var4_int &&
            ol.field_g.a(param1 + 129, this.field_B * 32 / 256 + 32 * this.field_o, this.field_w, this.field_I, 32 + 64 * this.field_u / 256 + this.field_H * 64 - this.field_w))) {
            this.field_u = this.field_u + 64;
            if (this.field_u >= 256) {
              this.field_H = this.field_H + 1;
              this.field_u = this.field_u - 256;
              if (ba.field_i.field_a <= this.field_H) {
                this.field_H = this.field_H - ba.field_i.field_a;
              }
            }
          }
          var6 = 0;
          L6: while (true) {
            if (ol.field_g.a(2, 32 * this.field_B / 256 + 32 * this.field_o, this.field_w, this.field_I, 64 * this.field_u / 256 + (this.field_H * 64 - this.field_w))) {
              stackIn_65_0 = ~var4_int;
              if (var7 != 0) {
                break L6;
              }
              if (stackIn_65_0 != ~this.field_B) {
                if (0 < this.field_Q) {
                  this.field_B = this.field_B - 1;
                } else {
                  this.field_B = this.field_B + 1;
                }
                this.e(param1 ^ 3);
                var6 = 1;
                continue;
              }
            }
            stackIn_65_0 = param0 ? 1 : 0;
            break;
          }
          if (stackIn_65_0 == 0) {
            stackIn_71_0 = ol.field_g;
            stackIn_71_1 = 2;
            stackIn_71_2 = this.field_o * 32;
            stackIn_71_3 = -(32 * this.field_B / 256);
            if (this.field_a > 0) {
              stackIn_72_4 = this.field_I;
            } else {
              stackIn_72_4 = -this.field_I;
            }
            stackIn_75_2 = stackIn_71_2 - (stackIn_71_3 - stackIn_72_4);
            if (param2) {
              stackIn_76_3 = 56;
            } else {
              stackIn_76_3 = 8;
            }
            if (!((ra) (Object) stackIn_71_0).a(stackIn_71_1, stackIn_75_2, stackIn_76_3 + this.field_w, this.field_I, -this.field_w + (64 * this.field_u / 256 + this.field_H * 64))) {
              var6 = 1;
            }
          }
          this.field_z = 64 * this.field_u / 256 + 64 * this.field_H;
          this.field_e = 32 * this.field_o + 32 * this.field_B / 256;
          stackIn_81_0 = var6;
          return stackIn_81_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "qe.AD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean a(byte param0, int param1) {
        boolean discarded$0 = false;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var7Lifetime1;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != -25) {
            discarded$0 = this.a((qe) null, 57, false);
          }
          var3_int = this.field_e;
          var4 = this.field_z - this.field_w;
          var7 = this.field_o;
          var8 = this.field_H;
          var5 = var3_int;
          var6 = var4;
          var10 = this.field_u;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 >= 8))) {
            var5Lifetime1 = var3_int + 32 * (param1 * var9);
            var7Lifetime1 = this.field_o + var9 * param1;
            stackIn_80_0 = -2049;
            if (var11 == 0) {
              if (stackIn_80_0 > ~var5Lifetime1) {
                var5Lifetime1 -= 2048;
              }
              if (var7Lifetime1 >= 64) {
                var7Lifetime1 -= 64;
              }
              if (var5Lifetime1 < 0) {
                var5Lifetime1 += 2048;
              }
              if (var7Lifetime1 < 0) {
                var7Lifetime1 += 64;
              }
              boolean decompiledFrameRemainder0 = true;
              if (!ol.field_g.a(param0 + 27, var5Lifetime1, this.field_w, this.field_I, var6) ||
                ol.field_g.a(2, var5Lifetime1, this.field_w, this.field_I, -16 + var6)) {
                if (!ol.field_g.a(2, var5Lifetime1, this.field_w, this.field_I, var6) &&
                  !ol.field_g.a(2, var5Lifetime1, this.field_w, this.field_I, 16 + var6) &&
                  ol.field_g.a(2, var5Lifetime1, this.field_w, this.field_I, 32 + var6)) {
                  var6 += 16;
                  var10 += 64;
                  if (!(var10 <= 256)) {
                    var8++;
                    var10 -= 256;
                  }
                  decompiledFrameRemainder0 = false;
                } else {
                  if (ol.field_g.a(2, var5Lifetime1, this.field_w, this.field_I, var6) &&
                    ol.field_g.a(param0 + 27, var5Lifetime1, this.field_w, this.field_I, var6 - 16)) {
                    return false;
                  }
                  decompiledFrameRemainder0 = !(ol.field_g.a(2, var5Lifetime1, this.field_w, this.field_I, var6));
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameRemainder0 = !(ol.field_g.a(2, var5Lifetime1, this.field_w, this.field_I, 16 + var6))) &&
                    (decompiledFrameRemainder0 = !(ol.field_g.a(2, var5Lifetime1, this.field_w, this.field_I, var6 + 32)))) {
                    return false;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                var10 -= 64;
                var6 -= 16;
                if (var10 < 0) {
                  var10 += 256;
                  var8--;
                }
              }
              if (~wb.field_p.field_o == ~var7Lifetime1 &&
                wb.field_p.field_H == var8) {
                return true;
              }
              if (~var7Lifetime1 == ~wb.field_p.field_o &&
                wb.field_p.field_H == -1 + var8) {
                return true;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_80_0 = 0;
          }
          return stackIn_80_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "qe.RB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var18Lifetime1;
        var19 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param5 > -29) {
            this.field_eb = false;
          }
          var15 = 0;
          var16 = 4;
          var14 = 160;
          var13 = 160;
          var15Lifetime1 = var16;
          if (null == ea.field_h) {
            ea.field_h = new ka(var13, var14);
            id.field_d = new int[var16][4];
            kc.field_w = new int[var16][3];
            var17 = 0;
            while (true) {
              if (var17 < var16) {
                kc.field_w[var17][0] = 0;
                var17++;
                if (var19 == 0) {
                  continue;
                }
              } else {
                ul.field_m = 0;
                ec.field_b = -1;
              }
              break;
            }
            fa.field_t = -1;
          }
          var17 = 0;
          L6: while (true) {
            if (var16 > var17) {
              stackIn_24_0 = ~kc.field_w[var17][0];
              stackIn_24_1 = -1;
              if (var19 != 0) {
                break L6;
              }
              if (stackIn_24_0 == stackIn_24_1) {
                var15Lifetime1 = var17;
              } else {
                var17++;
                continue;
              }
            }
            stackIn_24_0 = i.field_r;
            stackIn_24_1 = ec.field_b;
            break;
          }
          if (stackIn_24_0 != stackIn_24_1 ||
            n.field_jb != fa.field_t ||
            ul.field_m != this.field_a ||
            ul.field_m == 0) {
            dl.field_n[2] = 0;
            dl.field_n[0] = 0;
            this.a(ea.field_h, param2, param4, new int[]{this.field_a, i.field_r, n.field_jb, 16777215}, param0, -20861, param3, 1);
            ea.field_h.d();
            qg.d(2, 2, 0, 0, ea.field_h.field_u, ea.field_h.field_x);
            la.field_f.a(124);
            ul.field_m = this.field_a;
            ec.field_b = i.field_r;
            fa.field_t = n.field_jb;
          }
          boolean decompiledFrameCompleted0 = true;
          od.a(param3 - (var13 - this.field_I >> 1), -32 + param2, -1, 8, 4, ea.field_h);
          if (ef.field_k % 4 == 0) {
            if (var15Lifetime1 >= var16) {
              var17 = 1;
              while (var17 < var16) {
                stackIn_63_0 = 0;
                if (var19 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var18 = stackIn_63_0;
                while (var18 < 4) {
                  id.field_d[-1 + var17][var18] = id.field_d[var17][var18];
                  var18++;
                }
                var18Lifetime1 = 0;
                while (var18Lifetime1 < 3) {
                  kc.field_w[-1 + var17][var18Lifetime1] = kc.field_w[var17][var18Lifetime1];
                  var18Lifetime1++;
                }
                var17++;
              }
              if (decompiledFrameCompleted0) {
                kc.field_w[var16 - 1][0] = this.field_a;
                kc.field_w[-1 + var16][1] = i.field_r;
                kc.field_w[var16 - 1][2] = n.field_jb;
                id.field_d[var16 - 1][0] = this.field_o;
                id.field_d[var16 - 1][1] = this.field_B;
                id.field_d[var16 - 1][2] = this.field_H;
                id.field_d[-1 + var16][3] = this.field_u;
                if (var19 != 0) {
                  kc.field_w[var15Lifetime1][0] = this.field_a;
                  kc.field_w[var15Lifetime1][1] = i.field_r;
                  kc.field_w[var15Lifetime1][2] = n.field_jb;
                  id.field_d[var15Lifetime1][0] = this.field_o;
                  id.field_d[var15Lifetime1][1] = this.field_B;
                  id.field_d[var15Lifetime1][2] = this.field_H;
                  id.field_d[var15Lifetime1][3] = this.field_u;
                }
              }
            } else {
              kc.field_w[var15Lifetime1][0] = this.field_a;
              kc.field_w[var15Lifetime1][1] = i.field_r;
              kc.field_w[var15Lifetime1][2] = n.field_jb;
              id.field_d[var15Lifetime1][0] = this.field_o;
              id.field_d[var15Lifetime1][1] = this.field_B;
              id.field_d[var15Lifetime1][2] = this.field_H;
              id.field_d[var15Lifetime1][3] = this.field_u;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_63_0 = 0;
          }
          var17 = stackIn_63_0;
          while (var16 > var17) {
            this.a(param1, df.field_R, id.field_d[var17][1], id.field_d[var17][2], id.field_d[var17][0], this.field_F, 2657, id.field_d[var17][3]);
            var9 = dl.field_n[2];
            var7_int = dl.field_n[0];
            var8 = dl.field_n[1];
            dl.field_n[2] = -32 + var9;
            dl.field_n[0] = -(-this.field_I + var13 >> 1) + var7_int;
            var11 = kc.field_w[var17][1];
            var10 = kc.field_w[var17][0];
            var12 = kc.field_w[var17][2];
            if (var19 != 0) {
              return;
            }
            if (var8 >= var7_int) {
              this.a((ka) null, param2, param4, new int[]{var10, var11, var12, tk.field_Q[var17]}, param0, -20861, param3, 2);
            }
            var17++;
          }
          this.a((ka) null, param2, param4, (int[]) null, param0, -20861, param3, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var7), "qe.PB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int c(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          var2 = bf.field_o;
          var3 = ae.field_m;
          if (param0 != -74) {
            field_A = (int[]) null;
          }
          var7 = wb.field_p.field_e;
          var8 = var7 + wb.field_p.field_I;
          var9 = wb.field_p.field_H;
          var10 = 0;
          while (true) {
            stackIn_6_0 = 1;
            stackIn_6_1 = var10;
            if (stackIn_6_0 >= stackIn_6_1) {
              stackIn_31_0 = 0;
              if (var12 == 0) {
                var11 = stackIn_31_0;
                while (3 > var11) {
                  var4 = var2[var10][0] * 32;
                  var6 = var3[var11];
                  var5 = 32 + var2[var10][1] * 32;
                  stackIn_6_0 = ~var7;
                  stackIn_6_1 = ~var4;
                  if ((stackIn_6_0 <= stackIn_6_1 &&
                    var5 >= var7 ||
                    var4 <= var8 &&
                    var8 <= var5) && ~var9 == ~var6) {
                    stackIn_27_0 = (var10 << 16) + var11;
                    return stackIn_27_0;
                  }
                  var11++;
                }
                var10++;
                continue;
              }
            } else {
              stackIn_31_0 = -1;
            }
            return stackIn_31_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "qe.FA(" + param0 + ')');
        }
    }

    private final void F(int param0) {
        boolean discarded$2 = false;
        qe discarded$3 = null;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_L != 13) {
            return;
          }
          if (param0 <= 34) {
            this.field_o = 93;
          }
          this.field_D = this.field_D + 1;
          if (this.field_D <= 100) {
            bi.field_f = false;
            if (TorChallenge.field_F) {
              bi.field_f = true;
            }
          } else {
            bi.field_f = true;
          }
          aj.a((byte) -105, this, this.field_y);
          discarded$2 = this.d(-125, 1);
          if (this.field_a == 0) {
            this.field_a = 1;
          }
          this.field_Q = this.field_Q + this.field_a;
          discarded$3 = this.k(false);
          kf.a(this, this.field_y, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.CD(" + param0 + ')');
        }
    }

    private final void I(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_K > (this.field_Q * this.field_a)) {
            this.field_Q = this.field_Q + this.field_a * this.field_C;
            decompiledFrameRemainder0 = (var3 != 0);
          }
          if ((decompiledFrameRemainder0) &&
            (this.field_K < this.field_Q * this.field_a)) {
            if (this.field_C <= (this.field_a * this.field_Q)) {
              this.field_Q = this.field_Q - this.field_C * this.field_a;
              if (var3 != 0) {
                this.field_Q = this.field_Q - this.field_a;
              }
            } else {
              this.field_Q = this.field_Q - this.field_a;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.KD(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        int stackIn_118_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = -1;
          var3 = 0;
          if (param0 != -17) {
            this.field_ib = false;
          }
          L1: {
            var4 = 5;
            var5 = this.field_F;
            L2: switch ((var6 == 0
              || var5 == 8
              || var5 == 13
              || var5 == 15
              || var5 == 18
              || var5 == 19
              ) ? var5 : -1) {
              case 9:
              case 8:
                var2_int = 0;
                if (var6 == 0) {
                  break;
                }
              case 13:
                if (o.field_l <= 0) {
                  break;
                }
                var2_int = 0;
                if (var6 == 0) {
                  break;
                }
              case 10:
              case 11:
                var2_int = 1;
                if (var6 == 0) {
                  break;
                }
              case 12:
                if (o.field_l > 0) {
                  break;
                }
                var2_int = 1;
                if (var6 == 0) {
                  break;
                }
              case 15:
                {
                  if (!this.field_nb) {
                    if (!(wb.field_p.field_d <= wb.field_p.field_db)) {
                      var2_int = 5;
                      if (var6 != 0) {
                        var2_int = 8;
                      }
                    }
                  } else {
                    var2_int = 8;
                  }
                }
                if (this.field_nb &&
                  hd.field_d % 5 == 4) {
                  var2_int = 3;
                }
                var5 = 0;
                while (var5 < var4) {
                  stackIn_131_0 = 0;
                  stackIn_131_1 = 1 << var5 & vi.field_a;
                  if (var6 != 0) {
                    break L1;
                  }
                  if (stackIn_131_0 < stackIn_131_1) {
                    var3++;
                  }
                  var5++;
                }
                if (!this.field_nb) {
                  break;
                }
                if (var3 != 2) {
                  break;
                }
                var2_int = 8;
                if (var6 == 0) {
                  break;
                }
              case 14:
                if (wb.field_p.field_d <= wb.field_p.field_db) {
                  break;
                }
                var2_int = 5;
                if (var6 == 0) {
                  break;
                }
              case 19:
                if (!ui.field_b) {
                  break;
                }
                if (ng.field_I > 0) {
                  break;
                }
                var2_int = 6;
                if (var6 == 0) {
                  break;
                }
              case 20:
                var5 = 0;
                {
                  while (true) {
                    if (var4 > var5) {
                      stackIn_118_0 = vi.field_a & 1 << var5;
                      if (var6 == 0) {
                        if (stackIn_118_0 > 0) {
                          var3++;
                        }
                        var5++;
                        continue;
                      }
                    } else {
                      stackIn_118_0 = -3;
                    }
                    break;
                  }
                  if (stackIn_118_0 < ~var3) {
                    break L2;
                  }
                  if (wb.field_p == null) {
                    break L2;
                  }
                  if (!wb.field_p.field_n) {
                    break L2;
                  }
                  var2_int = 2;
                  if (var6 == 0) {
                    break L2;
                  }
                }
              case 18:
                var2_int = 4;
                if (var6 == 0) {
                  break;
                }
              default:
                var2_int = -1;
            }
            stackIn_131_0 = ~var2_int;
            stackIn_131_1 = -1;
          }
          if (stackIn_131_0 <= stackIn_131_1 &&
            var2_int < 13) {
            u.a(12604, var2_int);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.TB(" + param0 + ')');
        }
    }

    private final qe k(boolean param0) {
        Object stackIn_51_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = 0;
          if (param0) {
            this.b((byte) -1);
          }
          if (this.field_Q < 0) {
            var2_int = -1;
            if (var5 != 0 &&
              this.field_Q > 0) {
              var2_int = 1;
            }
          } else {
            if (this.field_Q > 0) {
              var2_int = 1;
            }
          }
          if (var2_int * this.field_Q > 128) {
            this.field_Q = var2_int * 128;
          }
          this.field_B = this.field_B + this.field_Q;
          L5: while (true) {
            if (var2_int * this.field_B > 256) {
              this.field_o = this.field_o + var2_int;
              this.field_B = this.field_B + -256 * var2_int;
              this.field_b = this.field_b + var2_int;
              if (var5 == 0) {
                continue;
              }
            } else {
              if (64 > this.field_o) {
                if (0 <= this.field_o) {
                  break L5;
                }
                this.field_o = this.field_o + 64;
                if (var5 == 0) {
                  break L5;
                }
              }
            }
            this.field_o = this.field_o - 64;
            break;
          }
          boolean decompiledFrameRemainder0 = true;
          if (0 < this.field_Q ||
            this.field_Q < 0) {
            var3 = 24;
            var4 = -var3;
            if ((var3 >= this.field_b ||
              var2_int <= 0) &&
              (decompiledFrameRemainder0 = !(var4 <= this.field_b))) {
              decompiledFrameRemainder0 = !(var2_int >= 0);
            }
            if (decompiledFrameRemainder0) {
              this.field_H = ba.field_i.field_a - 1;
              if (this.field_F == 0) {
                bd.field_l = true;
              }
              this.field_u = 1024;
              this.field_Q = 0;
              if (this.field_F == 22) {
                this.field_z = this.field_u * 64 / 256 + this.field_H * 64;
                this.field_e = this.field_o * 32 + 32 * this.field_B / 256;
                stackIn_51_0 = null;
                return (qe) (stackIn_51_0);
              }
            }
          }
          this.field_z = 64 * this.field_H + this.field_u * 64 / 256;
          this.field_e = 32 * this.field_B / 256 + 32 * this.field_o;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.EB(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_44_0 = false;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_88_0 = false;
        int stackIn_102_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_43_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var2_int = vj.field_c;
          var3 = pl.field_e[this.field_L];
          var4 = 0;
          var5 = bc.field_h[var2_int][var3][this.field_kb] ? 1 : 0;
          var6 = ba.field_e[var2_int][var3][this.field_kb] ? 1 : 0;
          var7 = 0;
          var8 = vc.field_d[var2_int][var3][this.field_kb] ? 1 : 0;
          if ((!this.field_c ||
            this.field_a >= 0) && (!this.field_N ||
            0 >= this.field_a)) {
            stackIn_14_0 = 0;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_14_0 = 1;
          }
          var9 = stackIn_14_0;
          if (var5 != 0) {
            var10 = r.field_i[var2_int][var3][this.field_kb] ? 1 : 0;
            if (var10 != 0) {
              var11 = 6 + e.b((byte) 57, 3);
              if (mj.field_b) {
                var11 = 6 + e.b((byte) 57, 4);
              }
              if (var11 >= 0 &&
                var11 < 14) {
                ei.a((byte) 66, var11, var2_int);
              }
            }
          }
          if (param0 == var2_int &&
            this.field_L == 9 &&
            ~(-1 + ah.field_a[var2_int][var3]) == ~this.field_kb) {
            var7 = 1;
          }
          boolean decompiledFrameCompleted0 = true;
          if (var5 != 0 ||
            var6 != 0) {
            var10Lifetime1 = 0;
            while (!(var10Lifetime1 >= ea.field_g.length)) {
              stackOut_43_0 = uf.field_k;
              stackIn_61_0 = stackOut_43_0 ? 1 : 0;
              stackIn_44_0 = stackOut_43_0;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_44_0) {
                discarded$0 = this.a(ea.field_g[var10Lifetime1], false, false);
              } else {
                uf.field_k = this.a(ea.field_g[var10Lifetime1], false, false);
                if (uf.field_k) {
                  ei.a((byte) 66, 5, var2_int);
                }
              }
              if (var7 != 0) {
                discarded$1 = this.a(ea.field_g[var10Lifetime1], false, var7 != 0);
              }
              var10Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            this.z(3);
            stackIn_61_0 = -1 + ah.field_a[var2_int][var3];
          }
          stackIn_65_0 = (stackIn_61_0 != this.field_kb) ? 0 : 1;
          var10Lifetime2 = stackIn_65_0;
          var11Lifetime1 = -1 + ae.field_u[var2_int][var3][this.field_kb];
          var12 = ll.field_j[var2_int][var3][this.field_kb] ? 1 : 0;
          stackIn_69_0 = (this.field_D < var11Lifetime1) ? 0 : 1;
          var13 = stackIn_69_0;
          if (!ah.field_i) {
            stackIn_88_0 = ((this.field_ab &&
              !(this.field_s) &&
              ch.field_a[var2_int][pl.field_e[7]]) ||
              (this.field_ab &&
              !(ch.field_a[var2_int][pl.field_e[7]])));
            ah.field_i = stackIn_88_0;
          }
          if ((!this.field_c ||
            this.field_a <= 0) &&
            (!this.field_N ||
            this.field_a >= 0)) {
            stackIn_102_0 = 0;
          } else {
            stackIn_102_0 = 1;
          }
          var14 = stackIn_102_0;
          if (this.field_L == 10 ||
            6 == this.field_L ||
            this.field_L == 7 ||
            wk.field_F != 6 &&
            wk.field_F != 7) {
            wk.field_F = a.field_d[var2_int][var3][this.field_kb][0];
            var4 = a.field_d[var2_int][var3][this.field_kb][1];
          }
          if (10 == this.field_L ||
            this.field_L == 6 ||
            this.field_L == 9 ||
            !this.field_ib ||
            var14 == 0 ||
            !ch.field_a[var2_int][pl.field_e[6]]) {
            if (this.field_L == 10 ||
              this.field_L == 7 ||
              !this.field_ib ||
              !this.field_s ||
              !ch.field_a[var2_int][pl.field_e[7]]) {
              if (this.field_L == 10 ||
                this.field_L == 7 ||
                !this.field_ib ||
                !ah.field_i) {
                if ((this.field_L != 10) &&
                  (this.field_L != 7) &&
                  (!this.field_ib) &&
                  (ah.field_i)) {
                  var4 = 0;
                  wk.field_F = 1;
                  if (var15 != 0) {
                    wk.field_F = 10;
                    var4 = 0;
                    wk.field_F = 7;
                    var4 = 0;
                    wk.field_F = 6;
                    var4 = 0;
                  }
                }
              } else {
                wk.field_F = 10;
                var4 = 0;
                if (var15 != 0) {
                  wk.field_F = 7;
                  var4 = 0;
                  wk.field_F = 6;
                  var4 = 0;
                }
              }
            } else {
              wk.field_F = 7;
              var4 = 0;
              if (var15 != 0) {
                wk.field_F = 6;
                var4 = 0;
              }
            }
          } else {
            wk.field_F = 6;
            var4 = 0;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_L != 10 &&
            this.field_ib &&
            !ol.field_g.a(param0 + 0, this.field_e, this.field_w, this.field_I, this.field_z) &&
            !ol.field_g.a(2, this.field_e, (160 - this.field_w) / 2, this.field_I, this.field_z)) {
            this.field_kb = 0;
            this.field_L = 10;
            this.H(9);
            decompiledFrameRemainder1 = (var15 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (this.field_L != 10 &&
              !ol.field_g.a(2, this.field_e, this.field_w, this.field_I, this.field_z)) {
              this.field_L = 2;
              this.field_kb = 0;
              this.H(9);
              decompiledFrameRemainder1 = (var15 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (this.field_L == 10 &&
                this.field_h >= 0 &&
                ol.field_g.a(param0 ^ 0, this.field_e, (160 - this.field_w) / 2, this.field_I, this.field_z)) {
                this.field_L = 2;
                this.H(param0 ^ 11);
                decompiledFrameRemainder1 = (var15 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (!this.field_ib ||
                  var12 == 0 ||
                  var13 == 0 ||
                  wk.field_F == 17 ||
                  9 == this.field_L) {
                  if (var12 != 0 &&
                    var13 != 0 &&
                    wk.field_F != 17) {
                    if (this.field_L == 9 &&
                      !this.field_ab) {
                      this.field_D = 0;
                      if (var10Lifetime2 != 0) {
                        this.field_kb = 0;
                        this.field_L = 0;
                        decompiledFrameRemainder1 = (var15 != 0);
                      }
                      if (decompiledFrameRemainder1) {
                        this.field_kb = this.field_kb + 1;
                        decompiledFrameRemainder1 = (var15 != 0);
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      if (wk.field_F != 1) {
                        this.field_L = 0;
                        kl.field_a = false;
                        this.H(9);
                        decompiledFrameRemainder1 = (var15 != 0);
                      }
                      if (decompiledFrameRemainder1) {
                        this.field_L = 1;
                        wh.a(vj.field_c, 0, -75);
                        this.field_h = -this.field_M;
                        this.H(9);
                        decompiledFrameRemainder1 = (var15 != 0);
                      }
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (var12 != 0 &&
                      var13 != 0 &&
                      wk.field_F == 17) {
                      if (10 == this.field_L) {
                        this.field_L = 10;
                        decompiledFrameRemainder1 = (var15 != 0);
                      }
                      if (decompiledFrameRemainder1) {
                        ti.field_d = this.field_L;
                        if (9 == this.field_L) {
                          tk.field_P = true;
                          gl.field_f = true;
                        }
                        kl.field_a = false;
                        this.field_L = 0;
                        this.H(9);
                        decompiledFrameRemainder1 = (var15 != 0);
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      if (var13 == 0) {
                        this.field_D = this.field_D + 1;
                        decompiledFrameRemainder1 = (var15 != 0);
                      }
                      if (decompiledFrameRemainder1) {
                        this.field_D = 0;
                        if (var10Lifetime2 == 0) {
                          this.field_kb = this.field_kb + 1;
                        }
                        uf.field_k = false;
                        decompiledFrameRemainder1 = (var8 != 0);
                        if (decompiledFrameRemainder1) {
                          this.n(param0 + 94);
                          decompiledFrameRemainder1 = (var15 != 0);
                        }
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (this.field_L != 6) {
                    if (this.field_L != 10 && (1 != var2_int ||
                      this.field_L != 7) && wk.field_F == 10) {
                      this.field_h = -this.field_M;
                      if ((var15 != 0) &&
                        (ch.field_a[var2_int][pl.field_e[9]] &&
                        !this.field_ab &&
                        this.field_n &&
                        var9 != 0)) {
                        wk.field_F = 9;
                        var4 = 0;
                        this.field_a = -this.field_a;
                      }
                    } else {
                      if (ch.field_a[var2_int][pl.field_e[9]] &&
                        !this.field_ab &&
                        this.field_n &&
                        var9 != 0) {
                        wk.field_F = 9;
                        var4 = 0;
                        if (var15 != 0) {
                          this.field_a = -this.field_a;
                        }
                      }
                    }
                  } else {
                    this.field_a = -this.field_a;
                  }
                  kl.field_a = false;
                  this.field_L = wk.field_F;
                  this.H(param0 ^ 11);
                  this.field_kb = var4;
                }
              }
            }
          }
          if (var2_int == 2 &&
            this.field_L == 9 &&
            this.field_kb == -1 + ah.field_a[var2_int][var3]) {
            this.field_eb = true;
            ve.field_a.field_h = 64;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.EC(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          var2_int = -124 / ((-86 - param0) / 35);
          var3 = 0;
          this.a(true, var3 != 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.JA(" + param0 + ')');
        }
    }

    private final boolean j(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 31) {
            this.g((byte) 80);
          }
          var2_int = r.field_a[fh.field_e];
          stackIn_7_0 = (fc.field_o < var2_int) ? 0 : 1;
          var3 = stackIn_7_0;
          stackIn_8_0 = var3;
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.PC(" + param0 + ')');
        }
    }

    private final boolean A(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.field_e;
          var3 = this.field_z - this.field_w;
          var4 = this.field_I - 16;
          var5 = this.field_w;
          var6 = param0 + wb.field_p.field_e;
          if (20 == this.field_F) {
            var4 = 32;
            var2_int = this.field_e + 48;
            var6 = wb.field_p.field_e + 16;
          }
          if (var6 - var2_int > 1024) {
            var6 -= 2048;
          }
          if (-var2_int + var6 < -1024) {
            var6 += 2048;
          }
          var7 = wb.field_p.field_z - this.field_w;
          var8 = wb.field_p.field_I;
          if (this.field_F == 20) {
            var8 = 32;
          }
          var9 = wb.field_p.field_w;
          if (!o.a(var9, var3, var8, var4, var5, var6, var2_int, (byte) 9, var7)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.IC(" + param0 + ')');
        }
    }

    private final void K(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_fb = false;
          if (param0 != -1) {
            this.field_s = true;
          }
          this.field_gb = false;
          this.field_jb = true;
          this.field_mb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.F(" + param0 + ')');
        }
    }

    private final boolean a(qe param0, boolean param1, boolean param2) {
        boolean discarded$0 = false;
        int stackIn_13_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        boolean stackIn_85_2 = false;
        boolean stackIn_113_0 = false;
        boolean stackIn_117_0 = false;
        int stackIn_174_0 = 0;
        int stackIn_187_0 = 0;
        RuntimeException stackIn_241_0 = null;
        StringBuilder stackIn_241_1 = null;
        String stackIn_242_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var4_intLifetime1;
        int var6Lifetime1;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          var4_int = param1 ? 1 : 0;
          var7 = vj.field_c;
          var8 = pl.field_e[this.field_L];
          var9 = bc.field_h[var7][var8][this.field_kb] ? 1 : 0;
          var10 = ba.field_e[var7][var8][this.field_kb] ? 1 : 0;
          var11 = p.field_e[var7][var8][this.field_kb];
          if (param2) {
            var11 = 0;
            var10 = 1;
            var9 = 0;
          }
          if (param0 == null) {
            return false;
          }
          if (!vg.a(param0.field_F, -1) &&
            28 != param0.field_F) {
            stackIn_13_0 = 0;
          } else {
            stackIn_13_0 = 1;
          }
          var4_intLifetime1 = stackIn_13_0;
          if (var4_intLifetime1 == 0) {
            return false;
          }
          if (param0.field_F == 6 && (param0.field_V == 0 ||
            param0.field_V == 2)) {
            return false;
          }
          if (7 == param0.field_F &&
            param0.field_V == 2) {
            return false;
          }
          if (param0.field_F == 23) {
            return false;
          }
          if (param0.field_F == 24) {
            return false;
          }
          if (28 == param0.field_F &&
            wh.field_b &&
            param0.field_a != this.field_a) {
            var9 = 0;
          }
          if (param0.field_F == 28 &&
            wh.field_b) {
            var9 = 0;
            var10 = 0;
          }
          if (var10 == 0 &&
            var9 == 0) {
            var5 = 0;
          }
          if (var10 != 0 ||
            var9 != 0 || var12 != 0) {
            if (this.a(param0, 2, param2) &&
              param0.field_db > 0) {
              stackIn_68_0 = 1;
            } else {
              stackIn_68_0 = 0;
            }
            var5 = stackIn_68_0;
          }
          if (var5 == 0) {
            return false;
          }
          if (!param0.field_Y &&
            var9 != 0 &&
            param0.field_G <= 0) {
            param0.field_db = param0.field_db - ((dk.field_a >> 1) + var11);
            stackIn_84_0 = param0.field_z;
            stackIn_84_1 = param0.field_I;
            stackIn_85_2 = !(param1);
            boolean decompiledFrameRemainder0 = true;
            rc.a(stackIn_84_0, stackIn_84_1, stackIn_85_2, this.field_I, this.field_w, this.field_e, param0.field_w, this.field_z, param0.field_e);
            if (param0.field_F == 28 &&
              fh.field_e == 2) {
              if (!s.field_m) {
                ha.field_d = ha.field_d + 1;
                if (ha.field_d >= 4) {
                  ha.field_d = 0;
                  ii.field_e = true;
                }
              }
              ni.field_b = true;
              decompiledFrameRemainder0 = (var12 != 0);
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledSharedTail1 = (param0.field_F != 28 ||
                fh.field_e != 1);
              if (!decompiledSharedTail1) {
                if (rk.field_e) {
                  stackIn_113_0 = !(rk.field_e);
                  rk.field_e = stackIn_113_0;
                  stackIn_117_0 = !(ql.field_j);
                  ql.field_j = stackIn_117_0;
                }
                fc.field_o = -param0.field_db + param0.field_d;
                decompiledSharedTail1 = (var12 != 0);
              }
              if ((decompiledSharedTail1) && (param0.field_F == 28 &&
                fh.field_e == 0)) {
                fc.field_o = param0.field_d - param0.field_db;
              }
            }
            if (!(param0.field_db <= 0) ||
              param0.field_F == 28 ||
              param0.field_F == 24 ||
              param0.field_F == 23) {
              if ((!(param0.field_db > 0)) &&
                (param0.field_F == 28)) {
                jc.b(fh.field_e, 1, 7);
                if (var12 != 0) {
                  hc.a(91, wb.field_p.field_H, param0.field_V, 0, wb.field_p.field_o, dg.field_T[param0.field_F], param0.field_H, param0.field_o);
                }
              }
            } else {
              hc.a(91, wb.field_p.field_H, param0.field_V, 0, wb.field_p.field_o, dg.field_T[param0.field_F], param0.field_H, param0.field_o);
            }
            param0.field_G = param0.field_G + 10;
            if (mj.field_b) {
              param0.field_db = param0.field_db - (-(dk.field_a >> 1) + dk.field_a);
            }
            param0.field_Y = true;
            if (param0.field_F == 28 && (fh.field_e == 1 ||
              fh.field_e == 2)) {
              param0.field_G = param0.field_G + 14;
            }
            if (param0.field_F == 28) {
              if (param0.field_db > 0) {
                jc.b(fh.field_e, 1, 8);
              }
              param0.field_D = 0;
              param0.field_L = 12;
            }
          }
          stackIn_174_0 = (this.field_Q >= 0) ? 1 : -1;
          var6 = stackIn_174_0;
          boolean decompiledSharedTail0 = (28 != param0.field_F ||
            2 != fh.field_e);
          if (!decompiledSharedTail0) {
            param0.field_Q = param0.field_Q;
            decompiledSharedTail0 = (var12 != 0);
          }
          if (decompiledSharedTail0) {
            param0.field_Q = (1 + (dk.field_a >> 1)) * (this.field_a * 10) + this.field_Q * var6 * this.field_a;
          }
          stackIn_187_0 = (param0.field_Q >= 0) ? 1 : -1;
          var6Lifetime1 = stackIn_187_0;
          if (var6Lifetime1 * param0.field_Q > 128) {
            param0.field_Q = 128 * var6Lifetime1;
          }
          if (mj.field_b) {
            param0.field_Q = param0.field_Q + (-(dk.field_a >> 1) + dk.field_a) * this.field_a * 10;
          }
          if (param2 &&
            !param0.field_Y && (28 != param0.field_F &&
            0 < h.field_b[3][dg.field_T[param0.field_F]][this.field_V] ||
            param0.field_F == 28)) {
            if (5 != param0.field_F) {
              param0.field_h = -8;
              param0.field_L = 2;
              if (vg.a(this.field_F, -1)) {
                qa.a(this.field_o, wb.field_p.field_H, this.field_F, this, this.field_H, -1, 5, wb.field_p.field_o, 20, this.field_V);
                if (var12 != 0) {
                  this.field_D = 1;
                }
              }
            } else {
              this.field_D = 1;
            }
            param0.field_Y = true;
          }
          if (param0.field_db <= 0) {
            kk.a(param0, 0);
            if (4 > dk.field_a) {
              lj.field_b = lj.field_b + 25;
              dk.field_a = dk.field_a + 1;
            }
            discarded$0 = this.a((byte) -31, param0);
            if (param0.field_cb) {
              param0.field_O = true;
              param0.j(false);
            }
          }
          if (this.field_L != 9) {
            this.field_Q = this.field_Q * 8 / 10;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_241_0 = var4;
          stackIn_241_1 = new StringBuilder().append("qe.MA(");
          if (param0 == null) {
            stackIn_242_2 = "null";
          } else {
            stackIn_242_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_241_0), ((StringBuilder) (Object) stackIn_241_1).append(stackIn_242_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, ka param4, int param5) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          if (null == oj.field_b) {
            oj.field_b = new ka(dd.field_m[0].field_q * 3 + param4.field_q, this.field_w);
          }
          qg.a(bf.field_l);
          oj.field_b.d();
          qg.b();
          if (param2 < 12) {
            return;
          }
          param4.a(oj.field_b.field_q >> 1, 0);
          var9 = 0;
          do {
            if (var9 >= 3) {
              la.field_f.a(-91);
              qg.b(bf.field_l);
              break;
            }
            var7_int = 192 * var9 / 2 + 64;
            var8 = (var9 + param5) % 4;
            dd.field_m[var8].d(dd.field_m[0].field_q * var9, -dd.field_m[0].field_v + this.field_w >> 1, var7_int);
            var9++;
          } while (var10 == 0);
          if (this.field_a < 0) {
            oj.field_b.a();
          }
          if (-param3 + param1 >= 128) {
            if (!(oj.field_b.field_q >= param1 - param3)) {
              param3 = -(oj.field_b.field_q >> 1) + (param3 + param1 >> 1);
              param1 = param3 + oj.field_b.field_q;
              if (var10 != 0) {
                param3 = (param3 + param1 >> 1) - 64;
                param1 = 128 + param3;
              }
            }
          } else {
            param3 = (param3 + param1 >> 1) - 64;
            param1 = 128 + param3;
          }
          oj.field_b.d(param3, param0, param1 - param3, this.field_w);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("qe.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void p(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_w = 96;
          this.field_I = 64;
          var2_int = jj.a(255);
          var3 = 5;
          if (param0 <= 22) {
            this.field_a = 95;
          }
          this.field_db = 3 + var2_int / var3;
          this.field_K = bf.field_f[vj.field_c];
          this.field_M = eb.field_s[vj.field_c];
          qf.field_f = db.field_E[vj.field_c];
          we.a(qf.field_f, this.field_M, 73);
          this.field_C = ee.field_n[vj.field_c];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "qe.S(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != 96) {
            this.field_lb = 15;
          }
          var2_int = 0;
          while (var2_int < ea.field_g.length) {
            if (var3 != 0) {
              return;
            }
            if (null != ea.field_g[var2_int] &&
              ea.field_g[var2_int].field_Y &&
              ea.field_g[var2_int].field_F != 0) {
              ea.field_g[var2_int].field_Y = false;
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.VA(" + param0 + ')');
        }
    }

    private final void z(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        boolean stackIn_139_1 = false;
        boolean stackIn_140_2 = false;
        boolean stackIn_147_1 = false;
        int stackIn_150_2 = 0;
        boolean stackIn_151_3 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = vj.field_c;
          var3 = pl.field_e[this.field_L];
          var4 = n.field_db[var2_int][var3][this.field_kb];
          var5 = ga.field_x[var2_int][var3][this.field_kb];
          var6 = lc.field_k[var2_int][var3][this.field_kb];
          stackIn_5_0 = (0 >= var4) ? 0 : 1;
          boolean decompiledFrameRemainder2 = true;
          var7 = stackIn_5_0;
          if ((var6 >= 0 ||
            this.field_h != 0) && (0 >= var6 ||
            this.field_h == 0)) {
            stackIn_18_0 = 0;
            decompiledFrameRemainder2 = false;
          }
          else {
            stackIn_18_0 = 1;
          }
          boolean decompiledFrameRemainder1 = true;
          var8 = stackIn_18_0;
          if ((!this.field_c ||
            0 <= this.field_a) && (!this.field_N ||
            this.field_a <= 0)) {
            stackIn_31_0 = 0;
            decompiledFrameRemainder1 = false;
          }
          else {
            stackIn_31_0 = 1;
          }
          var9 = stackIn_31_0;
          if (fj.field_z[var2_int][var3][this.field_kb] &&
            var9 != 0) {
            stackIn_38_0 = 1;
          } else {
            stackIn_38_0 = 0;
          }
          var10 = stackIn_38_0;
          stackIn_42_0 = ((this.field_Q * this.field_a) >= var5) ? 0 : 1;
          var11 = stackIn_42_0;
          if (param0 != 3) {
            this.field_l = -79;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_L != 10) {
            if (var7 != 0 &&
              !uf.field_k &&
              var11 != 0 && (var9 != 0 ||
              var10 != 0)) {
              this.field_Q = this.field_Q + var4 * this.field_a;
              decompiledFrameRemainder0 = (var13 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (var7 != 0 &&
                !uf.field_k &&
                var11 != 0) {
                this.field_Q = this.field_Q + this.field_a;
                decompiledFrameRemainder0 = (var13 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (var7 == 0) {
                  this.field_Q = this.field_a * (this.field_a * this.field_Q * -var4 >> 3);
                }
                if ((var7 != 0 ||
                  var13 != 0) &&
                  (uf.field_k) &&
                  (9 != this.field_L) &&
                  (!(this.field_Q * this.field_a <= 0))) {
                  this.field_Q = this.field_Q - this.field_a * var4;
                  if (var13 != 0) {
                    if (this.field_c &&
                      this.field_Q > -var5) {
                      this.field_Q = this.field_Q - var4;
                      if (var13 != 0 && (this.field_N &&
                        this.field_Q < var5)) {
                        this.field_Q = this.field_Q + var4;
                      }
                    } else {
                      if (this.field_N &&
                        this.field_Q < var5) {
                        this.field_Q = this.field_Q + var4;
                      }
                    }
                  }
                }  }
            }
          } else {
            if (this.field_c &&
              this.field_Q > -var5) {
              this.field_Q = this.field_Q - var4;
              if (var13 != 0 && (this.field_N &&
                this.field_Q < var5)) {
                this.field_Q = this.field_Q + var4;
              }
            } else {
              if (this.field_N &&
                this.field_Q < var5) {
                this.field_Q = this.field_Q + var4;
              }
            }
          }
          if (var8 != 0) {
            this.field_h = this.field_h + var6;
          }
          if (!wb.field_p.field_ab &&
            qf.field_f > this.field_h) {
            this.field_h = this.field_h + 1;
          }
          if (this.field_L == 10 &&
            var2_int == 2 &&
            wb.field_p.field_ab &&
            this.field_h == 1 &&
            !vk.field_b) {
            this.field_h = this.field_h - 23;
            vk.field_b = true;
          }
          stackIn_139_1 = true;
          stackIn_140_2 = (10 != this.field_L);
          this.a(stackIn_139_1, stackIn_140_2);
          if (this.field_Q != 0) {
            stackIn_147_1 = (this.field_L != 9);
            stackIn_150_2 = -127;
            stackIn_151_3 = (this.field_L != 10);
            var12 = this.a(stackIn_147_1, (byte) stackIn_150_2, stackIn_151_3) ? 1 : 0;
            if (var12 != 0) {
              this.field_Q = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.E(" + param0 + ')');
        }
    }

    private final void l(boolean param0) {
        boolean discarded$0 = false;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0) {
            discarded$0 = this.c(12);
          }
          var2_int = vj.field_c;
          if (!this.field_ib) {
            gl.field_f = false;
          }
          if ((!this.field_c ||
            this.field_a >= 0) &&
            (!this.field_N ||
            this.field_a <= 0)) {
            stackIn_21_0 = 0;
          } else {
            stackIn_21_0 = 1;
          }
          var3 = stackIn_21_0;
          if (wk.field_F == 17 &&
            ti.field_d == 9 &&
            this.field_j) {
            tk.field_P = true;
          }
          if (tk.field_P && (!this.field_j ||
            0 == this.field_Q ||
            var3 == 0)) {
            tk.field_P = false;
            ti.field_d = 0;
          }
          if (bd.field_l) {
            bd.field_l = false;
          }
          if (tk.field_P) {
            return;
          }
          if (!this.field_ib) {
            if (this.field_lb <= 0 &&
              this.c((byte) 88, false) &&
              this.field_L == 0) {
              if (this.field_n) {
                this.field_Q = 0;
                this.field_lb = 10;
                this.field_D = 0;
                this.field_L = 19;
                this.field_h = 0;
                if (var4 == 0) {
                  return;
                }
              }
              ij.field_z = true;
              rj.field_d = k.field_h;
              if (var4 == 0) {
                return;
              }
            }
            if (!this.field_n) {
              return;
            }
            if (this.field_c) {
              return;
            }
            if (this.field_N) {
              return;
            }
            if (cl.field_z) {
              return;
            }
            if (0 != this.field_L) {
              return;
            }
            if (2 != var2_int) {
              this.field_w = 32;
            }
            cl.field_z = true;
            if (var4 == 0) {
              return;
            }
          }
          if (var3 != 0 &&
            this.field_n &&
            ch.field_a[var2_int][pl.field_e[9]] &&
            !gl.field_f) {
            this.field_L = 9;
            ti.field_d = 9;
            this.H(9);
            this.field_kb = 0;
            if (var4 == 0) {
              return;
            }
          }
          if (this.field_L == 0) {
            this.field_L = 3;
            ti.field_d = 3;
            this.H(9);
            this.field_kb = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.QB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12_intLifetime1;
        int var12_intLifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          stackIn_5_0 = (this.field_a >= 0) ? 0 : 1;
          var6_int = stackIn_5_0;
          var7 = lh.field_q[fh.field_e];
          var8 = lh.field_C[fh.field_e];
          if (we.field_j < 0) {
            we.field_j = 0;
          }
          if (oa.field_g < 0) {
            oa.field_g = 0;
          }
          param0 = -(var8 - this.field_I >> 1);
          var9 = ok.field_c[we.field_j][fh.field_e];
          if (we.field_j == 15) {
            var11 = ef.field_i[this.field_L][fh.field_e];
            var12_int = ga.field_s[fh.field_e][var11];
            if (this.field_kb == var12_int - 1) {
              var13 = tj.field_c[0] << 3;
              var14 = tj.field_c[1] << 3;
              var15 = param4 + param0;
              var16 = ki.field_e[dg.field_T[24]];
              if (var6_int == 0) {
                var15 = var15 + var13;
              }
              if (var6_int != 0 ||
                var17 != 0) {
                var15 = var15 + (-var16 - var13 + this.field_I);
              }
              boolean decompiledSharedTail0 = (var6_int == 0);
              if (!decompiledSharedTail0) {
                if (cb.field_f == null) {
                  cb.field_f = new ka(ki.field_e[dg.field_T[24]], ae.field_s[dg.field_T[24]]);
                }
                cb.field_f.d();
                qg.b();
                dj.field_O.d(0, 0);
                la.field_f.a(126);
                cb.field_f.d(var15, param1 + var14, var8 * var16 / this.field_I, ae.field_s[dg.field_T[24]]);
                decompiledSharedTail0 = (var17 != 0);
              }
              if (decompiledSharedTail0) {
                dj.field_O.d(var15, param1 + var14, var16 * var8 / this.field_I, ae.field_s[dg.field_T[24]]);
              }
            }
          }
          stackIn_33_0 = (0 > var9) ? 0 : 1;
          var10 = stackIn_33_0;
          if (var6_int != 0) {
            qg.a(bf.field_l);
            vd.field_d[fh.field_e].d();
            qg.b();
            g.field_i[we.field_j][fh.field_e][oa.field_g].d(0, 0);
            la.field_f.a(123);
            qg.b(bf.field_l);
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_G <= 0 ||
            we.field_j == 7) {
            if (we.field_j == 7) {
              jl.field_a[fh.field_e].d();
              qg.b();
              if (var6_int != 0) {
                vd.field_d[fh.field_e].d(0, 0, var8, var7);
              }
              if (var6_int == 0 ||
                var17 != 0) {
                g.field_i[we.field_j][fh.field_e][oa.field_g].d(0, 0, var8, var7);
              }
              la.field_f.a(124);
              this.a(jl.field_a[fh.field_e], param1, param0 + param4, 89);
              decompiledFrameRemainder0 = (var17 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (var6_int != 0) {
                vd.field_d[fh.field_e].d(param0 + param4, param1, var8, var7);
                decompiledFrameRemainder0 = (var17 != 0);
              }
              if (decompiledFrameRemainder0) {
                g.field_i[we.field_j][fh.field_e][oa.field_g].d(param0 + param4, param1, var8, var7);
                decompiledFrameRemainder0 = (var17 != 0);
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var11Lifetime1 = this.field_G;
            var12_intLifetime1 = 10;
            if (fh.field_e == 1 ||
              fh.field_e == 2) {
              var12_intLifetime1 = 24;
            }
            var13Lifetime1 = var12_intLifetime1 >> 1;
            var14Lifetime1 = 0;
            var15Lifetime1 = 64;
            if (var12_intLifetime1 < var11Lifetime1) {
              var11Lifetime1 = var12_intLifetime1;
            }
            if (var13Lifetime1 < var11Lifetime1) {
              var14Lifetime1 = (var11Lifetime1 - var12_intLifetime1) * (-var15Lifetime1 + 256) / var13Lifetime1 + 256;
            }
            if (var13Lifetime1 >= var11Lifetime1 ||
              var17 != 0) {
              var14Lifetime1 = var15Lifetime1 + (-var11Lifetime1 + var13Lifetime1) * (256 - var15Lifetime1) / var13Lifetime1;
            }
            var16Lifetime1 = 16711680;
            qg.a(bf.field_l);
            jl.field_a[fh.field_e].d();
            qg.b();
            if (var6_int == 0) {
              g.field_i[we.field_j][fh.field_e][oa.field_g].d(0, 0, var8, var7);
            }
            if (var6_int != 0 ||
              var17 != 0) {
              vd.field_d[fh.field_e].d(0, 0, var8, var7);
            }
            la.field_f.a(106);
            qg.b(bf.field_l);
            jl.field_a[fh.field_e].a(param0 + param4, param1, var14Lifetime1, var16Lifetime1);
          }
          if (var10 != 0) {
            var11Lifetime2 = 192;
            if (fh.field_e == 0 &&
              ra.field_q &&
              ql.field_n > 0) {
              var11Lifetime2 = ql.field_n * 192 / 25;
            }
            if (fh.field_e != 0 ||
              !ra.field_q ||
              ql.field_n != 0) {
              if (var6_int != 0) {
                var12_intLifetime2 = ol.field_e[fh.field_e][0];
                var13Lifetime2 = ol.field_e[fh.field_e][0];
                if (gj.field_b == null ||
                  ~var12_intLifetime2 != ~gj.field_b.field_q ||
                  ~var13Lifetime2 != ~gj.field_b.field_v) {
                  gj.field_b = new ka(var12_intLifetime2, var13Lifetime2);
                }
                qg.a(bf.field_l);
                gj.field_b.d();
                qg.b();
                si.field_I[fh.field_e][var9][oa.field_g].d(0, 0);
                la.field_f.a(-67);
                qg.b(bf.field_l);
                gj.field_b.d(param0 + param4, param1, var8, var7, var11Lifetime2);
                if (var17 != 0) {
                  si.field_I[fh.field_e][var9][oa.field_g].d(param4 + param0, param1, var8, var7, var11Lifetime2);
                }
              } else {
                si.field_I[fh.field_e][var9][oa.field_g].d(param4 + param0, param1, var8, var7, var11Lifetime2);
              }
            }
          }
          var11Lifetime3 = 37 % ((param3 - 34) / 35);
          if (we.field_j == 14) {
            var12 = ca.field_a[oa.field_g];
            if (var12 == null) {
              return;
            }
            var13Lifetime3 = var12[0] << 3;
            var14Lifetime2 = var12[1] << 3;
            var15Lifetime2 = param4 + param0;
            var16Lifetime2 = ki.field_e[dg.field_T[23]];
            if (this.field_a < 0) {
              var15Lifetime2 = var15Lifetime2 + (-var16Lifetime2 + (-var13Lifetime3 + this.field_I));
              if (var17 != 0) {
                var15Lifetime2 = var15Lifetime2 + var13Lifetime3;
              }
            } else {
              var15Lifetime2 = var15Lifetime2 + var13Lifetime3;
            }
            nd.a(-996593372, var15Lifetime2, param1 + var14Lifetime2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var6), "qe.GD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void i(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_u = 256;
          this.field_B = 0;
          this.field_o = this.field_r;
          if (param0) {
            this.field_L = -19;
          }
          this.field_H = this.field_f;
          this.field_L = 0;
          this.field_h = 0;
          this.field_Q = 0;
          this.field_e = this.field_o * 32 + 32 * this.field_B / 256;
          this.field_z = this.field_u * 64 / 256 + 64 * this.field_H;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "qe.DB(" + param0 + ')');
        }
    }

    qe(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        this.field_q = false;
        this.field_O = false;
        this.field_S = false;
        this.field_jb = true;
        this.field_k = false;
        this.field_P = 0;
        this.field_mb = false;
        this.field_fb = false;
        this.field_hb = 0;
        this.field_K = 0;
        this.field_t = false;
        this.field_x = -1;
        this.field_v = false;
        this.field_M = 0;
        this.field_T = false;
        this.field_cb = false;
        this.field_g = 0;
        this.field_m = false;
        this.field_eb = false;
        this.field_gb = false;
        this.field_C = 1;
        try {
          if (-1 != param0 &&
            -1 != param1) {
            boolean decompiledFrameRemainder0 = true;
            this.field_o = param0;
            this.field_B = 0;
            this.field_H = param1;
            this.field_f = param1;
            this.field_Q = 0;
            this.field_F = param2;
            this.field_h = 0;
            this.field_r = param0;
            this.field_u = 0;
            this.field_V = param3;
            this.field_u = 256;
            this.c(true);
            this.field_z = param1 * 64 + this.field_u * 64 / 256;
            this.field_e = this.field_B * 32 / 256 + param0 * 32;
            if (param2 != 0) {
              if (param2 == 28) {
                this.h(true);
              }
              if (param2 != 28 ||
                var6 != 0) {
                if (vg.a(param2, -1)) {
                  this.a(param2, 93);
                  decompiledFrameRemainder0 = (7 == param2 ||
                    param2 == 22);
                  if (decompiledFrameRemainder0) {
                    this.field_f = -1;
                    decompiledFrameRemainder0 = (var6 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (!(param2 < 8)) &&
                  (!(param2 >= 21))) {
                  this.field_w = 64;
                  this.field_Z = true;
                  this.field_I = 64;
                  if (param2 == 15) {
                    this.field_nb = true;
                  }
                  if ((param2 != 15 ||
                    var6 != 0) &&
                    (param2 == 20)) {
                    vk.field_i = this;
                    this.field_Z = true;
                    this.field_I = 128;
                    this.field_w = 128;
                    if (var6 != 0) {
                      this.p((byte) 25);
                    }
                  }}
              }} else {
              this.p((byte) 25);
            }
            this.field_b = 0;
            this.field_a = 1;
            this.field_Y = false;
            this.field_d = this.field_db;
            return;
          }
          this.field_f = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "qe.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_A = new int[256];
    }
}
