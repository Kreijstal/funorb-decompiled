/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hj {
    static ch field_D;
    int field_k;
    int field_P;
    private int field_H;
    private int field_Y;
    private int[] field_cb;
    private int field_d;
    private int[] field_lb;
    private int field_jb;
    private int field_U;
    private boolean field_o;
    private le field_m;
    private int field_u;
    static boolean field_L;
    private int field_T;
    int field_O;
    int field_A;
    private boolean[] field_gb;
    static long field_db;
    private int field_n;
    int field_I;
    private int field_M;
    private StringBuilder field_j;
    private int field_nb;
    private boolean field_S;
    private int field_v;
    private int field_h;
    private int field_x;
    private int field_s;
    private int field_c;
    private int field_ob;
    private int field_G;
    private int[] field_fb;
    private boolean field_V;
    private int field_z;
    private le field_q;
    private int field_eb;
    private le field_N;
    private int field_i;
    private float field_B;
    private int field_hb;
    private int field_a;
    private int field_g;
    private int field_J;
    private le field_f;
    private int[] field_F;
    private int field_y;
    private int field_r;
    private int field_Q;
    private float field_mb;
    private int field_t;
    private int field_bb;
    private boolean field_C;
    private int field_W;
    private int field_e;
    private boolean field_l;
    private float field_Z;
    private int field_b;
    private int field_ib;
    private le field_R;
    private int field_w;
    private int field_p;
    private int field_ab;
    private int field_X;
    private int field_kb;

    private final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var5 = -param1 + this.field_d;
          if (var5 >= 50) {
            var6 = (-(60 * (-50 + var5)) + 6000) / 100;
            if (var6 > 5) {
              var4_int = hc.field_h[param2][1] - Math.abs((int)((float)var6 * ia.a(true, 0.10000000149011612f * (float)(var5 - 50))));
            } else {
              var4_int = hc.field_h[param2][1];
            }
          } else {
            var4_int = 2 * ((hc.field_h[param2][1] + (480 - hc.field_h[param2][1])) * var5) / 100 + (-480 + hc.field_h[param2][1]);
          }
          var6Lifetime1 = 86 % ((param0 - 30) / 41);
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var4), "hj.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_g = this.field_g + (-4000 + pf.a((byte) 111, 8000));
          if (0 <= this.field_g) {
            if (this.field_g > 65535) {
              this.field_g = this.field_g - 65536;
            }
          } else {
            this.field_g = 65535 - this.field_g;
          }
          if (param0 != 120) {
            this.field_q = (le) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.I(" + param0 + ')');
        }
    }

    final void d(int param0) {
        try {
          int var2_int = 6 / ((param0 + 69) / 45);
          this.field_jb = 13;
          if (!ok.a(false)) {
            this.c((byte) 25);
          }
          this.field_u = 5;
          this.field_Y = 0;
          this.field_nb = 0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "hj.B(" + param0 + ')');
        }
    }

    private final void e(int param0) {
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
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = -this.field_W + (this.field_O - 90);
          if (var2_int < 0) {
            var2_int = -var2_int;
          }
          if (var2_int > 200) {
            var2_int = 200;
          }
          var2_int -= 40;
          if (var2_int < 0) {
            var2_int = 0;
          }
          var3 = var2_int * 256 / 100;
          var4 = -var3 + 256;
          this.field_v = var4;
          var5 = 0;
          var6 = 15 / ((param0 - 63) / 32);
          while (this.field_fb.length > var5) {
            var7 = ua.field_w[var5];
            var8 = ad.field_g[var5];
            this.field_fb[var5] = ch.a(ch.a(65280, var8) * var4 + var3 * ch.a(var7, 65280), 16711680) + ch.a(var4 * ch.a(var8, 16711935) + ch.a(var7, 16711935) * var3, -16711936) >> 8;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.G(" + param0 + ')');
        }
    }

    final void a(int param0) {
        StringBuilder discarded$0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 > this.field_A) {
            this.field_A = 0;
          }
          this.field_j.setLength(0);
          discarded$0 = this.field_j.append(Integer.toString(this.field_A));
          if (param0 != -19921) {
            this.i(-97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.N(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        try {
          if (param0 != 30717) {
            this.b((byte) 65);
          }
          var7_int = param3 + this.field_O;
          if (param1 + param2 >= var7_int) {
            if (var7_int + param5 <= param1) {
              return;
            }
            if (param5 < -var7_int + param1) {
              param4 = param4 + (-var7_int + param1);
            }
            var8 = param1 - var7_int + param2;
            if (var8 > param5) {
              param4 = param4 + (-param5 + var8);
              var8 = param5;
            }
            if (this.field_O <= param4 + var8) {
              var8 = this.field_O - param4;
            }
            ge.d(-1 + param1, param4, var8, 5592405);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var7), "hj.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void b(byte param0) {
        try {
          if (param0 >= -36) {
            this.i(34);
          }
          ie.a(aa.field_a, 112);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "hj.P(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_T < 0 &&
            0 == this.field_U) {
            this.field_T = 0;
          }
          if (param0 <= 30) {
            return;
          }
          if (3 <= this.field_U &&
            0 <= this.field_T) {
            return;
          }
          this.field_U = this.field_U + this.field_T;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.J(" + param0 + ')');
        }
    }

    private final void g(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param0 != 13816) {
            this.c((byte) -114);
          }
          for (var2_int = 0; var2_int < 5; var2_int++) {
            this.field_gb[var2_int] = false;
            this.field_cb[var2_int] = 10 + 10 * var2_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.D(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        try {
          if (this.field_A > 0 &&
            !this.field_o &&
            null == pg.field_b) {
            pg.field_b = di.a(rk.field_d, 65494, h.field_a, nj.field_b, new int[]{this.field_A}, 41, cl.field_d, 3, (byte) 100);
          }
          int var2_int = -67 / ((param0 + 63) / 42);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "hj.E(" + param0 + ')');
        }
    }

    private final void i(int param0) {
        int var2_int = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          for (var2_int = param0; var2_int < 5; var2_int++) {
            if (this.field_gb[var2_int]) {
              dupTemp$0 = this.field_cb[var2_int];
              this.field_cb[var2_int] = dupTemp$0 + 1;
              if (dupTemp$0 > 10) {
                this.field_cb[var2_int] = 10;
              }
            } else {
              dupTemp$1 = this.field_cb[var2_int];
              this.field_cb[var2_int] = dupTemp$1 - 1;
              if (0 > dupTemp$1) {
                stackIn_10_0 = this.field_gb;
                stackIn_10_1 = var2_int;
                stackIn_11_2 = !(var2_int >= -1 + wd.field_h.b(-81));
                stackIn_10_0[stackIn_10_1] = stackIn_11_2;
                if (this.field_gb[var2_int] &&
                  var2_int > 0) {
                  this.field_cb[var2_int] = this.field_cb[-1 + var2_int] - 10;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.H(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        try {
          if (param0 != 1903697041) {
            hj.$cfr$intArgs$a$ae8766b723be(-29, false);
          }
          field_D = null;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "hj.M(" + param0 + ')');
        }
    }

    final static cj a(byte param0, boolean param1) {
        cj var2 = null;
        RuntimeException var2_ref = null;
        cj stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        cj stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -89) {
            field_db = 6L;
          }
          var2 = new cj(true);
          stackIn_4_0 = var2;
          stackIn_5_1 = (param1);
          stackIn_4_0.field_f = stackIn_5_1;
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "hj.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
        float var2_float = 0.0f;
        int stackIn_10_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_eb = this.field_eb + 1;
          if ((this.field_eb & 3) == 0) {
            this.field_p = this.field_p + 1;
            if (this.field_p >= 4) {
              this.field_p = 0;
            }
          }
          var2_float = (float)this.field_eb / 200.0f;
          if (param0 != 340) {
            this.c((byte) 81);
          }
          if (var2_float >= 1.0f) {
            this.field_eb = 0;
            this.field_Q = 80 + pf.a((byte) 25, 480);
            this.field_kb = pf.a((byte) 45, 200) + 100;
            if (!(Math.random() > 0.5)) {
              stackIn_10_1 = 660 + pf.a((byte) 41, 50);
            } else {
              stackIn_10_1 = -20 - pf.a((byte) -109, 50);
            }
            this.field_e = stackIn_10_1;
            this.field_b = -20 - pf.a((byte) -91, 50);
          }
          this.field_bb = (int)(var2_float * (float)j.field_f[0].field_n);
          this.field_ob = (int)((float)(this.field_b - this.field_kb) * var2_float) + this.field_kb;
          this.field_a = this.field_Q + (int)(var2_float * (float)(-this.field_Q + this.field_e));
          this.field_i = (int)((float)j.field_f[0].field_m * var2_float);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.A(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (ok.a(param0)) {
            if (this.field_A <= 0 &&
              fg.field_b <= 0) {
              l.field_f = 0;
            } else {
              l.field_f = 7;
            }
          } else {
            if (fg.field_b <= 0) {
              l.field_f = 2;
            } else {
              if (0 < this.field_A) {
                l.field_f = 6;
              } else {
                l.field_f = 10;
              }
            }
          }
          bl.a(50, uh.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.K(" + param0 + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
          Throwable decompiledCaughtException = null;
          int var2_int = 0;
          IOException var2 = null;
          RuntimeException var2_ref = null;
          try {
            if (param0 <= MonkeyPuzzle2.field_D.field_h) {
              return true;
            }
            if (ol.field_g == null) {
              return false;
            }
            try {
              if (!param1) {
                field_D = (ch) null;
              }
              var2_int = ol.field_g.c(-110);
              if (var2_int > 0) {
                if (var2_int > param0 - MonkeyPuzzle2.field_D.field_h) {
                  var2_int = param0 - MonkeyPuzzle2.field_D.field_h;
                }
                ol.field_g.a(var2_int, param1, MonkeyPuzzle2.field_D.field_g, MonkeyPuzzle2.field_D.field_h);
                d.field_k = pf.a(0);
                MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + var2_int;
                if (param0 > MonkeyPuzzle2.field_D.field_h) {
                  return false;
                }
                MonkeyPuzzle2.field_D.field_h = 0;
                return true;
              }
              if (var2_int >= 0 &&
                wf.a(55) <= 30000L) {
                return false;
              }
              gk.a(-1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              gk.a(-1);
            }
            return false;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw la.a((Throwable) ((Object) var2_ref), "hj.L(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (Math.random() > 0.9) {
            this.field_hb = pf.a((byte) 54, 2);
            this.f(120);
          }
          this.field_V = false;
          if (param0 != 56) {
            this.a(true);
          }
          if (this.field_hb != 0) {
            var2_float = 3.1415927410125732f;
            var3 = 0.75f * var2_float + (float)(-this.field_g) / 65535.0f * var2_float * 2.0f;
            this.field_B = this.field_B + ha.a((byte) 51, var3);
            this.field_Z = this.field_Z + ia.a(true, var3);
            this.field_V = true;
          }
          if (69.0f < this.field_B) {
            this.field_B = 69.0f;
            this.field_V = false;
            this.f(120);
          } else {
            if (this.field_B < 0.0f) {
              this.field_B = 0.0f;
              this.field_V = false;
              this.f(120);
            }
          }
          if (this.field_Z < 0.0f) {
            this.field_V = false;
            this.field_Z = 0.0f;
            this.f(120);
          } else {
            if (480.0f < this.field_Z) {
              this.field_V = false;
              this.field_Z = 480.0f;
              this.f(120);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.R(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int dupTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        boolean stackIn_124_0 = false;
        boolean stackIn_134_1 = false;
        boolean stackIn_200_1 = false;
        boolean stackIn_424_1 = false;
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
        ki var9_ref_ki = null;
        double var9_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var4Lifetime4;
        int var8Lifetime2;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (0 != kc.field_d &&
            13 == this.field_jb) {
            this.a(false);
            pg.field_d[l.field_f].c((byte) -87);
            ej.field_b = 0;
            return;
          }
          if (!dl.field_c[96] &&
            !dl.field_c[97]) {
            this.field_w = 0;
          } else {
            this.field_w = this.field_w + 1;
          }
          var2_int = 2 + 2 * (this.field_w / 5);
          if (10 < var2_int) {
            var2_int = 10;
          }
          if (dl.field_c[96]) {
            this.field_z = this.field_z - 50 * var2_int;
          }
          if (dl.field_c[97]) {
            this.field_z = this.field_z + var2_int * 50;
          }
          if (this.field_z < 33677) {
            this.field_z = 33677;
          }
          if (this.field_z > 64623) {
            this.field_z = 64623;
          }
          var3 = 0;
          while (ba.a(-1)) {
            if (!hf.field_f.field_o) {
              var4 = (oa.field_H ^ hf.field_f.field_d) % 8;
              if (0 != var4) {
                if (var4 == 1) {
                  rk.field_d = rk.field_d - 1;
                  cl.field_d = cl.field_d + h.field_a;
                } else {
                  if (var4 == 2) {
                    h.field_a = h.field_a + 1;
                    cl.field_d = cl.field_d - rk.field_d;
                  } else {
                    if (var4 == 3) {
                      rk.field_d = rk.field_d + 1;
                      cl.field_d = cl.field_d - h.field_a;
                    } else {
                      if (var4 == 4) {
                        h.field_a = h.field_a + 1;
                        nj.field_b = nj.field_b + rk.field_d;
                      } else {
                        if (var4 == 5) {
                          rk.field_d = rk.field_d + 1;
                          nj.field_b = nj.field_b + h.field_a;
                        } else {
                          if (6 == var4) {
                            nj.field_b = nj.field_b - rk.field_d;
                            h.field_a = h.field_a - 1;
                          } else {
                            if (var4 == 7) {
                              nj.field_b = nj.field_b - h.field_a;
                              rk.field_d = rk.field_d - 1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                cl.field_d = cl.field_d + rk.field_d;
                h.field_a = h.field_a - 1;
              }
              var4Lifetime4 = (hf.field_f.field_d ^ oa.field_H + hf.field_f.field_A) % 5;
              if (0 == var4Lifetime4) {
                bh.field_g = bh.field_g | jc.field_e + b.field_m << 17;
              } else {
                if (var4Lifetime4 == 1) {
                  b.field_m = b.field_m + sd.field_e;
                  jc.field_e = jc.field_e + 1;
                } else {
                  if (var4Lifetime4 == 2) {
                    jc.field_e = jc.field_e - 1;
                    b.field_m = b.field_m - sd.field_e;
                  } else {
                    if (var4Lifetime4 != 3) {
                      if (var4Lifetime4 == 4) {
                        b.field_m = b.field_m - jc.field_e;
                        sd.field_e = sd.field_e - 1;
                      }
                    } else {
                      b.field_m = b.field_m + jc.field_e;
                      sd.field_e = sd.field_e + 1;
                    }
                  }
                }
              }
            }
            if (oa.field_H == 13) {
              if (13 != this.field_jb) {
                l.field_f = 1;
              } else {
                this.a(false);
              }
              pg.field_d[l.field_f].c((byte) 73);
              pg.field_d[l.field_f].a(false, false);
              ej.field_b = 0;
              return;
            }
            if (ec.field_d >= 2) {
              if (oa.field_H == 99) {
                this.field_o = true;
                if (!dl.field_c[82]) {
                  this.field_O = this.field_O + 1;
                } else {
                  this.field_ib = this.field_ib - 1;
                }
              }
              if (98 == oa.field_H) {
                if (dl.field_c[82]) {
                  this.field_ib = this.field_ib + 1;
                } else {
                  this.field_O = this.field_O - 1;
                }
                this.field_o = true;
              }
            }
            if ((this.field_u == 0 ||
              this.field_u == 6) && (oa.field_H == 83 ||
              oa.field_H == 82) && (jj.b(true) &&
              this.field_jb == 0) && (!qb.field_b ||
              !(ck.field_b >= 0))) {
              this.field_u = 1;
              this.field_Y = 0;
              this.field_T = 1;
              cj.a((byte) -18, ke.field_h[1]);
            }
            if (ec.field_d >= 2) {
              if (oa.field_H == 26 &&
                dc.field_c > 0) {
                this.field_M = 320;
                this.field_k = 480;
                this.field_O = -14 + this.field_k;
                uj.b(0);
                dc.field_c = dc.field_c - 1;
                rb.a(dc.field_c, (byte) -58);
                this.field_o = true;
              }
              if (oa.field_H == 36) {
                this.field_jb = 1;
                this.field_o = true;
                this.field_d = 0;
                cj.a((byte) 124, ke.field_h[31]);
              }
              if (oa.field_H == 39) {
                stackIn_124_0 = !(ok.field_e);
                ok.field_e = stackIn_124_0;
              }
              if (oa.field_H == 27) {
                this.field_M = 320;
                this.field_k = 480;
                this.field_O = -14 + this.field_k;
                uj.b(0);
                dc.field_c = dc.field_c + 1;
                rb.a(dc.field_c, (byte) -58);
                this.field_o = true;
              }
              if (oa.field_H == 33) {
                stackIn_134_1 = !(this.field_S);
                this.field_S = stackIn_134_1;
              }
              if (oa.field_H == 9) {
                this.field_o = true;
                el.a(true, 0);
              }
              if (oa.field_H == 10) {
                this.field_o = true;
                el.a(true, 1);
              }
              if (oa.field_H == 11) {
                this.field_o = true;
                el.a(true, 2);
              }
              if (oa.field_H == 12) {
                this.field_o = true;
                el.a(true, 3);
              }
            }
            if (oa.field_H != 84) {
              continue;
            }
            var3 = 1;
          }
          if (ec.field_d >= 2 &&
            dl.field_c[48]) {
            this.field_o = true;
            e.a(255, (byte) 40, 0);
          }
          if (ec.field_d >= 2 &&
            dl.field_c[68]) {
            this.field_o = true;
            e.a(254, (byte) 40, 1);
          }
          boolean decompiledFrameRemainder0 = true;
          mk.f(126);
          this.field_H = this.field_H + 1;
          var7 = this.field_jb;
          if (var7 == 0) {
            this.i(0);
            hh.f(8500);
            eb.d((byte) -93);
            ff.a(this.field_O, -6961);
            if (ub.field_a) {
              this.field_J = jf.a(-2147483648);
            }
            if (gb.field_o == this.field_r &&
              this.field_t > 500 &&
              !ok.field_d &&
              hd.field_u.e(11253)) {
              al.c((byte) -103);
              this.field_t = 0;
              this.field_r = -1;
            }
            this.field_t = this.field_t + 1;
            if (this.field_d % 800 == 2 &&
              500 < this.field_t) {
              a.b(92);
            }
            this.d((byte) 56);
            if (0 == (15 & this.field_d) &&
              this.field_V) {
              fieldTemp$6 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (fieldTemp$6 == 4) {
                this.field_ab = 0;
              }
            }
            if (13 > (127 & this.field_d) &&
              (3 & this.field_d) == 0) {
              fieldTemp$7 = this.field_x + 1;
              this.field_x = this.field_x + 1;
              if (fieldTemp$7 == 4) {
                this.field_x = 0;
              }
            }
            fieldTemp$8 = this.field_G;
            this.field_G = this.field_G - 1;
            if (fieldTemp$8 == 0) {
              stackIn_200_1 = !(!(Math.random() > 0.9));
              this.field_C = stackIn_200_1;
              this.field_G = 25;
              this.field_X = 172 + pf.a((byte) -115, 232);
              this.field_h = pf.a((byte) 76, 64);
            }
            kj.a(var3 != 0, -1);
            if (qb.field_b &&
              ck.field_b >= 0) {
              this.field_d = this.field_d + 2;
            } else {
              this.a(-19921);
              var4Lifetime1 = 15;
              if (1 == this.field_u) {
                var4Lifetime1 = 3;
              }
              if (0 == (this.field_d & var4Lifetime1)) {
                var7 = ba.field_a[this.field_u].length;
                this.a((byte) 82);
                fieldTemp$9 = this.field_Y + 1;
                this.field_Y = this.field_Y + 1;
                if (var7 == fieldTemp$9) {
                  if (1 == this.field_u) {
                    var8 = 0;
                    var9_ref_ki = (ki) (wd.field_h.a((byte) -117));
                    L47: while (true) {
                      if (var9_ref_ki != null) {
                        if (0 != var8) {
                          this.field_lb[-1 + var8] = var9_ref_ki.field_l;
                          var8++;
                          if (var8 == 6) {
                            break L47;
                          }
                        } else {
                          var8++;
                        }
                        var9_ref_ki = (ki) (wd.field_h.d((byte) 63));
                        continue;
                      }
                      break;
                    }
                    this.field_r = gb.field_o;
                    var9_double = (double)this.field_z * 6.283185307179586 / 65535.0;
                    var11 = (int)(10000.0 * Math.cos(var9_double));
                    var12 = (int)(Math.sin(var9_double) * 10000.0);
                    n.a(var12, var11, this.field_M, this.field_k, -301);
                    this.field_T = -1;
                    this.field_u = 0;
                    this.g(13816);
                  }
                  this.field_Y = 0;
                }
              }
              if (gb.field_o == 0) {
                this.field_jb = 1;
                this.field_d = 0;
                cj.a((byte) 112, ke.field_h[31]);
              } else {
                this.field_d = this.field_d + 2;
              }
              var5 = pf.a((byte) -119, 480);
              var6 = 2147483647;
              for (var7 = var5 - 3; var5 + 3 > var7; var7++) {
                if (0 < var7 &&
                  var7 < 480) {
                  this.field_F[var7] = this.field_F[var7] + this.field_n;
                }
              }
              for (var7 = 0; 480 > var7; var7++) {
                if (var6 > this.field_F[var7]) {
                  var6 = this.field_F[var7];
                }
              }
              if (var6 >> 4 > 0) {
                for (var7 = 0; var7 < 480; var7++) {
                  this.field_F[var7] = this.field_F[var7] - var6;
                }
                this.field_O = this.field_O - (var6 >> 4);
                this.field_k = this.field_O + 14;
                this.e(125);
              }
              if (this.field_u == 0 &&
                50 > -90 + this.field_O - this.field_W) {
                this.field_u = 6;
                ve.a(125, 8, 0, je.field_i);
              } else {
                if (((this.field_u == 6)) &&
                  (!(-90 + this.field_O - this.field_W <= 50))) {
                  this.field_u = 0;
                  nf.a(aa.field_a, (byte) 115, 8, 1);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (var7 != 6) {
              if (var7 == 4) {
                if (850 < this.field_d) {
                  this.field_d = 0;
                  this.field_jb = 3;
                } else {
                  if (0 == (15 & this.field_d) &&
                    this.field_d > 200) {
                    fieldTemp$0 = this.field_Y + 1;
                    this.field_Y = this.field_Y + 1;
                    if (fieldTemp$0 == cm.field_F.length) {
                      this.field_Y = 0;
                    }
                  }
                  if (this.field_d > 450 &&
                    aa.field_a == 3) {
                    this.field_jb = 3;
                    this.field_d = 0;
                  } else {
                    if (450 < this.field_d) {
                      ie.a(aa.field_a + 1, -28);
                    }
                    this.field_d = this.field_d + 2;
                  }
                }
              } else {
                if (13 == var7) {
                  if (this.field_nb == 0) {
                    bl.a(50, bl.field_g);
                    al.c((byte) -84);
                  }
                  this.field_nb = this.field_nb + 4;
                  if (this.field_nb > 2120) {
                    bl.a(50, uh.field_e);
                    if (ok.a(false)) {
                      if (0 >= this.field_P &&
                        this.field_A <= 0) {
                        l.field_f = 0;
                        bl.a(50, uh.field_e);
                      } else {
                        l.field_f = 7;
                      }
                    } else {
                      if (0 >= this.field_P) {
                        l.field_f = 2;
                      } else {
                        l.field_f = 6;
                      }
                    }
                    pg.field_d[l.field_f].c((byte) -98);
                    ej.field_b = 0;
                  }
                  if ((this.field_d & 15) == 0) {
                    var7 = ba.field_a[this.field_u].length;
                    this.a((byte) 115);
                    fieldTemp$1 = this.field_Y + 1;
                    this.field_Y = this.field_Y + 1;
                    if (fieldTemp$1 == var7) {
                      this.field_Y = 3;
                    }
                  }
                  this.field_d = this.field_d + 2;
                } else {
                  if (var7 != 1) {
                    if (var7 == 2) {
                      if (this.field_d <= 100) {
                        this.field_d = this.field_d + 2;
                      } else {
                        this.field_jb = 3;
                        this.field_d = 0;
                      }
                    } else {
                      if (var7 == 3) {
                        if (0 == this.field_d) {
                          this.field_A = this.field_A + (10000 + this.field_I);
                          var7 = this.field_I + 10000;
                          var8Lifetime2 = ej.field_b % 3;
                          if (0 != var8Lifetime2) {
                            if (var8Lifetime2 != 1) {
                              var9 = var7 / 3;
                              cl.field_d = cl.field_d + var9;
                              nj.field_b = nj.field_b - (var7 - var9);
                            } else {
                              nj.field_b = nj.field_b - var7;
                            }
                          } else {
                            cl.field_d = cl.field_d + var7;
                          }
                          this.a(-19921);
                          this.field_k = 480;
                          this.field_M = 320;
                          this.field_I = -1;
                          this.field_O = -14 + this.field_k;
                          uj.b(0);
                          vi.a(true);
                          dc.field_c = dc.field_c + 1;
                          rb.a(dc.field_c, (byte) -58);
                          this.field_r = 1;
                          this.field_t = 0;
                          dupTemp$2 = jf.a(-2147483648);
                          this.field_W = dupTemp$2;
                          this.field_J = dupTemp$2;
                          this.e(102);
                          this.field_u = 0;
                          fl.b(124);
                          this.a(-19921);
                          if (aa.field_a != 0) {
                            if (3 == aa.field_a) {
                              this.field_ib = 11;
                            }
                          } else {
                            this.field_ib = 95;
                          }
                          if (20 == dc.field_c) {
                            this.field_u = 4;
                            this.field_jb = 5;
                            decompiledFrameRemainder0 = false;
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          if (this.field_d > 100) {
                            this.field_jb = 0;
                          }
                          this.field_d = this.field_d + 2;
                        }
                      } else {
                        if (var7 == 5) {
                          if (this.field_d > 1050) {
                            if (!ok.a(false)) {
                              if (0 < this.field_P) {
                                l.field_f = 6;
                                this.c((byte) -109);
                              } else {
                                l.field_f = 2;
                                this.c((byte) -115);
                              }
                            } else {
                              l.field_f = 7;
                            }
                            pg.field_d[l.field_f].c((byte) 93);
                            this.field_nb = 0;
                            ej.field_b = 0;
                            this.field_d = 0;
                            bl.a(50, uh.field_e);
                          }
                          if ((this.field_d & 15) == 0) {
                            var7 = ba.field_a[this.field_u].length;
                            fieldTemp$3 = this.field_Y + 1;
                            this.field_Y = this.field_Y + 1;
                            if (fieldTemp$3 == var7) {
                              this.field_Y = 0;
                            }
                          }
                          this.field_d = this.field_d + 2;
                        }
                      }
                    }
                  } else {
                    if (this.field_d == 0) {
                      this.field_I = (4800000 - (-this.field_O + 480) * 30000) / 480;
                      if (0 > this.field_I) {
                        this.field_I = 0;
                      }
                      this.field_Y = 0;
                      bl.a(50, kb.field_d);
                      this.field_R.e();
                      lb.a(0, 340, (byte) 24, wc.field_e, 0, 40);
                      sb.field_r.a(gg.a(new String[]{Integer.toString(10000)}, sc.field_d, true), 170, sb.field_r.field_C, 1, -1);
                      this.field_f.e();
                      lb.a(0, 340, (byte) -14, wc.field_e, 0, 40);
                      sb.field_r.a(gg.a(new String[]{Integer.toString(this.field_I)}, ff.field_a, true), 170, sb.field_r.field_C, 1, -1);
                      ac.field_a.a((byte) 119);
                      if (dc.field_c == 19) {
                        e.a(254, (byte) 40, 1);
                      }
                      this.field_mb = 0.0f;
                      this.field_s = 1 + (-13 + this.field_k - ba.field_a[0][0].field_n) / 30;
                      cj.a((byte) -33, ke.field_h[18]);
                    }
                    if (0 == (this.field_d & 15)) {
                      var7 = ba.field_a[this.field_u].length;
                      this.a((byte) 75);
                      fieldTemp$4 = this.field_Y + 1;
                      this.field_Y = this.field_Y + 1;
                      if (fieldTemp$4 == var7) {
                        if (this.field_u == 2) {
                          this.field_Y = 2;
                        } else {
                          this.field_Y = 0;
                        }
                      }
                    }
                    nh.b((byte) 107);
                    ff.a(this.field_O, -6961);
                    hh.f(8500);
                    this.d((byte) 56);
                    if (this.field_u != 2 &&
                      hl.a(1, -ba.field_a[0][0].field_n + (-13 + this.field_k), this.field_M - 100) < 100) {
                      this.field_u = 2;
                      cj.a((byte) -116, ke.field_h[19]);
                    }
                    rc.a(this.field_mb, this.field_s, (byte) -111);
                    if (0 > mh.field_D &&
                      this.field_u == 2) {
                      if (vj.a(dc.field_c, 1) == aa.field_a) {
                        ie.a(aa.field_a, 119);
                        this.field_jb = 2;
                        this.field_d = 0;
                      } else {
                        this.field_jb = 4;
                        this.field_d = 0;
                        if (dc.field_c != 19) {
                          bl.a(50, b.field_l);
                        } else {
                          bl.a(50, wf.field_h);
                        }
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (2 == this.field_u) {
                        this.field_mb = this.field_mb + 0.10000000149011612f;
                        if (1.0f < this.field_mb) {
                          this.field_mb = 0.0f;
                          this.field_s = this.field_s - 1;
                          nf.n(-48);
                        }
                      }
                      this.field_d = this.field_d + 2;
                    }
                  }
                }
              }
            } else {
              if ((this.field_d & 15) == 0) {
                fieldTemp$5 = this.field_Y + 1;
                this.field_Y = this.field_Y + 1;
                if (fieldTemp$5 == cm.field_F.length) {
                  this.field_Y = 0;
                }
              }
              if (this.field_d <= 450) {
                this.field_d = this.field_d + 2;
              } else {
                this.field_jb = 0;
                this.field_d = 0;
              }
            }
          }
          if (!this.field_l) {
            var4Lifetime2 = this.field_d % 480;
            for (var5Lifetime1 = 0; 480 > var5Lifetime1; var5Lifetime1++) {
              var6Lifetime1 = 1 + var4Lifetime2;
              var7Lifetime1 = var4Lifetime2;
              if (var6Lifetime1 >= 480) {
                var6Lifetime1 = -480 + var6Lifetime1;
              }
              if (480 <= var7Lifetime1) {
                var7Lifetime1 = var7Lifetime1 - 480;
              }
              var8Lifetime1 = this.field_F[var6Lifetime1];
              var9Lifetime1 = this.field_F[var7Lifetime1];
              if (var8Lifetime1 <= var9Lifetime1) {
                var10 = var9Lifetime1 + var8Lifetime1 >> 1;
                var9Lifetime1 = var10;
                var8Lifetime1 = var10;
                this.field_F[var6Lifetime1] = var8Lifetime1;
                this.field_F[var7Lifetime1] = var9Lifetime1;
              }
              var4Lifetime2++;
            }
          } else {
            var4Lifetime2 = this.field_d % 480;
            var5Lifetime1 = 0;
            while (var5Lifetime1 < 480) {
              var6Lifetime1 = var4Lifetime2 - 1;
              var7Lifetime1 = var4Lifetime2;
              if (var6Lifetime1 < 0) {
                var6Lifetime1 = var6Lifetime1 + 480;
              }
              if (var7Lifetime1 < 0) {
                var7Lifetime1 = 480 + var7Lifetime1;
              }
              var8Lifetime1 = this.field_F[var6Lifetime1];
              var9Lifetime1 = this.field_F[var7Lifetime1];
              if (var8Lifetime1 <= var9Lifetime1) {
                var10 = var8Lifetime1 + var9Lifetime1 >> 1;
                var8Lifetime1 = var10;
                var9Lifetime1 = var10;
                this.field_F[var6Lifetime1] = var8Lifetime1;
                this.field_F[var7Lifetime1] = var9Lifetime1;
              }
              var5Lifetime1++;
              var4Lifetime2--;
            }
          }
          stackIn_424_1 = !(this.field_l);
          this.field_l = stackIn_424_1;
          if (aa.field_a == 0) {
            if (0 == (this.field_d & 127)) {
              this.field_ib = this.field_ib - 1;
            }
            if (95 >= this.field_ib) {
              if (this.field_ib < 30) {
                this.field_ib = 30;
              }
            } else {
              this.field_ib = 95;
            }
            this.h(340);
          } else {
            if (aa.field_a == 3) {
              if ((31 & this.field_d) == 0) {
                this.field_ib = this.field_ib + 1;
              }
              if (this.field_ib >= 11) {
                if (317 < this.field_ib) {
                  this.field_ib = 317;
                }
              } else {
                this.field_ib = 11;
              }
            }
          }
          this.field_y = this.field_y + 1;
          if ((7 & this.field_d) == 0) {
            this.field_c = this.field_c + 1;
            i.field_n = i.field_n + 1;
            if (this.field_c == 4) {
              this.field_c = 0;
            }
            if (i.field_n == 6) {
              i.field_n = 0;
            }
          }
          if ((this.field_d & 15) == 0) {
            sk.field_G = sk.field_G + 1;
            if (sk.field_G == 6) {
              sk.field_G = 0;
            }
          }
          if (this.field_y == m.field_i[0].field_n) {
            this.field_y = 0;
          }
          if (param0 <= 64) {
            this.field_W = -2;
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < 10; var4Lifetime3++) {
            lb.field_D[var4Lifetime3] = lb.field_D[var4Lifetime3] + pf.a((byte) 23, 3);
            if (lb.field_D[var4Lifetime3] > 100) {
              lb.field_D[var4Lifetime3] = 0;
            }
          }
          if (this.field_J != this.field_W) {
            if (this.field_W >= this.field_J) {
              this.field_W = this.field_W - 1;
            } else {
              this.field_W = this.field_W + 1;
            }
            if (5 > Math.abs(-this.field_J + this.field_W)) {
              this.field_W = this.field_J;
            }
            this.e(-21);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.S(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int incrementValue$0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_291_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        le var7 = null;
        int var8 = 0;
        Object var9_ref = null;
        int var9 = 0;
        ki var9_ref_ki = null;
        le var9_ref_le = null;
        int var10 = 0;
        le var10_ref_le = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object var22 = null;
        ki var22_ref = null;
        Object var23 = null;
        ki var23_ref = null;
        le var24 = null;
        le var25 = null;
        le var10_ref_leLifetime1;
        le var10_ref_leLifetime1Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var7_intLifetime4;
        int var8Lifetime5;
        var22 = null;
        var23 = null;
        var9_ref = null;
        var20 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (aa.field_a == 2) {
            var2_int = -(2 * m.field_i[0].field_n) + this.field_y;
            var3 = 0;
            while (m.field_i[0].field_n * 2 + this.field_y > var2_int) {
              incrementValue$0 = var3;
              var3++;
              var4 = incrementValue$0 + this.field_c;
              var4 = var4 % 4;
              for (var5 = 0; var5 < 640; var5 = var5 + m.field_i[0].field_m) {
                m.field_i[var4].a(var5, var2_int);
              }
              var2_int = var2_int + m.field_i[0].field_n;
            }
          } else {
            if (aa.field_a != 3) {
              if (aa.field_a == 0) {
                var2_int = -((-30 + this.field_ib) * 255 / 65) + 255;
                fi.field_a[fi.field_a.length - 1].a(0, 0, var2_int, 15387868);
                hf.field_d.e(-(hf.field_d.field_m >> 2) + 320, this.field_ib);
                ge.h(0, 0, 640, 70);
                ge.a(5120, (hf.field_d.field_m >> 2) + this.field_ib << 4, hf.field_d.field_m << 3, 50, cf.field_a);
                ge.h(0, 0, 640, 480);
              }
            } else {
              var2_int = -100 + this.field_ib;
              if (this.field_ib >= 240) {
                ge.a(77, 0, 486, 150, 265542, 5383094);
              } else {
                ge.h(77, 0, 563, 146);
                if (0 < var2_int) {
                  ge.a(77, var2_int - 145, 486, 145, 265542, 5383094);
                }
                if (var2_int < 145) {
                  ge.a(77, var2_int, 486, 145, 5383094, 8374005);
                }
                ge.d(77, var2_int + 145, 486, 145, 8374005);
                ge.h(0, 0, 640, 480);
                hf.field_d.c(320 - (hf.field_d.field_m >> 1), this.field_ib);
              }
            }
          }
          if (aa.field_a != 0) {
            al.a(this.field_H, (byte) -126);
          }
          if (aa.field_a == 3) {
            stackIn_45_0 = (this.field_ib >= 170) ? 1 : 0;
            var2_intLifetime1 = stackIn_45_0;
            var3Lifetime1 = -qa.field_i.field_n + (this.field_ib - 220);
            fe.field_f[this.field_c].b(0, 0, 100);
            var4Lifetime1 = 255 * (-11 + this.field_ib) / 306;
            if (var4Lifetime1 > 100) {
              var4Lifetime1 = 100;
            }
            ge.c(70, 0, 500, 480, 265542, var4Lifetime1);
            var5Lifetime1 = this.field_ib - 100;
            var6 = 0;
            if (this.field_ib > 100) {
              if (180 <= this.field_ib) {
                var6 = 50;
              } else {
                var6 = 50 - (9000 - this.field_ib * 50) / 80;
              }
            }
            ge.h(0, 0, 640, 145);
            if (this.field_ib < 250) {
              ge.a(5120, (hf.field_d.field_m >> 1) + this.field_ib << 4, hf.field_d.field_m << 4, -var6 + 50, cf.field_a);
            }
            if (var2_intLifetime1 != 0) {
              ge.a(320 - qa.field_i.field_m << 4, var3Lifetime1 - (-(qa.field_i.field_n >> 1) + 8) << 4, qa.field_i.field_m << 4, 50, sk.field_D);
            }
            if (var6 < 50) {
              var7_int = 145;
              var8 = 0;
              while (var7_int < 290) {
                ge.h(0, var7_int, 640, 2 + var7_int);
                ge.a(5120, -(4 * var8) + this.field_ib + (hf.field_d.field_m >> 1) << 4, hf.field_d.field_m << 4, 50 - var6, cf.field_a);
                var8 += 2;
                var7_int += 2;
              }
            }
            if (var5Lifetime1 > -90) {
              var7_intLifetime4 = var5Lifetime1 + 90;
              if (var7_intLifetime4 > 100) {
                var7_intLifetime4 = 100;
              }
              ge.h(0, 0, 640, var7_intLifetime4);
              var8Lifetime5 = 256 * var7_intLifetime4 / 100;
              if (256 < var8Lifetime5) {
                var8Lifetime5 = 256;
              }
              ma.a(this.field_m.field_s, 80, 0, this.field_m.field_m, var7_intLifetime4, var8Lifetime5, 0);
              ac.field_a.a((byte) 110);
            }
            if (var2_intLifetime1 != 0) {
              qa.field_i.c(-qa.field_i.field_m + 320 - (qa.field_i.field_m >> 1), var3Lifetime1);
            }
          } else {
            if (aa.field_a == 0) {
              ge.h(0, 0, 640, 480);
              fi.field_a[0].c(0, 0);
              j.field_f[this.field_p].b(this.field_a, this.field_ob, this.field_i, this.field_bb);
              var2_intLifetime1 = 80;
              var3Lifetime1 = 0;
              for (var4Lifetime1 = 95999; var4Lifetime1 >= 0; var4Lifetime1--) {
                this.field_N.field_s[var4Lifetime1] = ac.field_a.field_e[var3Lifetime1 + var2_intLifetime1];
                var2_intLifetime1++;
                if (var2_intLifetime1 == 560) {
                  var3Lifetime1 = var3Lifetime1 + ac.field_a.field_g;
                  var2_intLifetime1 = 80;
                }
              }
              this.field_N.c();
              ge.a(this.field_N.field_s, this.field_N.field_k, this.field_N.field_j);
              kl.a(100, 5, this.field_d, 0, 0, this.field_N.field_k, this.field_N.field_j);
              this.field_q.e();
              this.field_N.a(this.field_N.field_m << 3, this.field_N.field_n << 3, 3200, 1600, 63535, 4096);
              ac.field_a.a((byte) 116);
              ge.h(80, 0, 560, 480);
              fi.field_a[1].c(0, 0);
              this.field_q.b(80, 317, 580, 200, 100);
              ge.h(80, 316, 560, 371);
              var3Lifetime1 = 70;
              fi.field_a[0].c(0, 0);
              var4Lifetime1 = 0;
              while (var3Lifetime1 < 290) {
                ge.h(0, var3Lifetime1, 640, var3Lifetime1 + 2);
                ge.a(5120, (hf.field_d.field_m >> 2) + (this.field_ib - 2 * var4Lifetime1) << 4, hf.field_d.field_m << 3, 50, cf.field_a);
                var3Lifetime1 += 2;
                var4Lifetime1 += 2;
              }
              ge.h(80, 0, 560, 480);
              j.field_f[this.field_p].b(this.field_a, this.field_ob, this.field_i, this.field_bb);
              ge.b();
            }
          }
          if (this.field_C &&
            aa.field_a == 1) {
            pc.field_U[this.field_x].c(this.field_X, this.field_h);
          }
          for (var2_intLifetime2 = 0; var2_intLifetime2 < ib.field_c; var2_intLifetime2++) {
            var3Lifetime2 = pd.field_f[var2_intLifetime2] - (dj.field_a[0].field_m >> 1);
            var4Lifetime2 = 0;
            for (var5Lifetime2 = 0; var5Lifetime2 < mc.field_e[var2_intLifetime2].length; var5Lifetime2++) {
              dj.field_a[mc.field_e[var2_intLifetime2][var5Lifetime2]].c(var3Lifetime2, var4Lifetime2);
              var4Lifetime2 = var4Lifetime2 + (dj.field_a[var5Lifetime2].field_n - 1);
            }
          }
          ll.a(24733);
          ci.a(-2865);
          ck.field_a[1].c(20 + this.field_M, -wl.field_f[0].field_n + (this.field_k - 13));
          if (!wd.field_h.e(11253)) {
            var22_ref = (ki) (wd.field_h.a((byte) -117));
            if (var22_ref != null) {
              var22_ref.field_B = (float)this.field_M;
              var22_ref.field_q = (float)(-48 + this.field_k);
              if (jj.b(true)) {
                var22_ref.a((byte) -74);
              }
              for (var3Lifetime3 = 1; var3Lifetime3 < 4; var3Lifetime3++) {
                var23_ref = (ki) (wd.field_h.d((byte) 63));
                if (var23_ref == null) {
                  break;
                }
                var4Lifetime3 = var3Lifetime3;
                if (var4Lifetime3 == 1) {
                  var23_ref.field_B = 360.0f;
                  var23_ref.field_q = (float)(this.field_k - 48);
                } else {
                  if (var4Lifetime3 != 2) {
                    if (var4Lifetime3 == 3) {
                      var23_ref.field_B = 370.0f;
                      var23_ref.field_q = (float)(-28 + this.field_k);
                    }
                  } else {
                    var23_ref.field_q = (float)(this.field_k - 38);
                    var23_ref.field_B = 385.0f;
                  }
                }
                var23_ref.a((byte) -60);
                var23_ref.field_q = (float)(148 + (var3Lifetime3 - 1) * 59);
                var23_ref.field_B = 602.0f;
              }
            }
          }
          df.f(18180);
          var2_intLifetime3 = (int)(ia.a(true, (float)this.field_H * 0.00800000037997961f) * 50.0f);
          var3Lifetime4 = 727655;
          ge.c(80, this.field_O, 480, 480, var3Lifetime4, 120);
          var4Lifetime4 = 0;
          ge.h(80, 0, 560, 480);
          var5Lifetime3 = 0;
          var6Lifetime1 = 0;
          var7_intLifetime1 = this.field_d / 2 % 480;
          var8Lifetime1 = 0;
          while (var8Lifetime1 < 480) {
            if (var7_intLifetime1 >= 480) {
              var7_intLifetime1 = 0;
            }
            var9 = this.field_F[var7_intLifetime1] >> 4;
            var10 = 80 + var8Lifetime1;
            var11 = -var9 + this.field_O;
            if (80 != var10) {
              if (var10 == 559) {
                var6Lifetime1 = var11;
              }
            } else {
              var5Lifetime3 = var11;
            }
            ge.g(var10, var11, var9, var3Lifetime4, 120);
            this.a(30717, var10, var9, var2_intLifetime3, var11, 5);
            this.a(30717, var10, var9, -50 + var2_intLifetime3, var11, 30);
            this.a(30717, var10, var9, var2_intLifetime3 - 60, var11, 30);
            this.a(30717, var10, var9, -80 + var2_intLifetime3, var11, 5);
            if (var9 > var4Lifetime4) {
              var4Lifetime4 = var9;
            }
            var8Lifetime1++;
            var7_intLifetime1++;
          }
          for (var7_intLifetime2 = this.field_O; var7_intLifetime2 < 480; var7_intLifetime2++) {
            var8Lifetime2 = -this.field_O + var7_intLifetime2;
            if (var8Lifetime2 <= 85) {
              var9Lifetime1 = var8Lifetime2 | (var8Lifetime2 << 8 | var8Lifetime2 << 16);
              ge.i(var7_intLifetime2 + var2_intLifetime3, var7_intLifetime2, 5, -var9Lifetime1 + 5592405);
              ge.i(var7_intLifetime2 - (50 - var2_intLifetime3), var7_intLifetime2, 30, -var9Lifetime1 + 5592405);
              ge.i(var2_intLifetime3 + (-60 + var7_intLifetime2), var7_intLifetime2, 30, -var9Lifetime1 + 5592405);
              ge.i(var7_intLifetime2 + (-80 + var2_intLifetime3), var7_intLifetime2, 5, 5592405 - var9Lifetime1);
              continue;
            }
            break;
          }
          if (this.field_S) {
            ge.b(1, 1, 80, this.field_O, 480, 4);
            ge.b(2, 2, 80, this.field_O + 4, 480, 476 - this.field_O);
          }
          if (this.field_jb == 0 ||
            this.field_jb == 13 ||
            this.field_jb == 1) {
            if (this.field_jb != 13 &&
              this.field_jb != 1) {
              var7_intLifetime3 = this.field_d;
              if (var7_intLifetime3 > 4) {
                var7_intLifetime3 = 4;
              }
            } else {
              var7_intLifetime3 = -this.field_d + 4;
            }
            if (var7_intLifetime3 > 0) {
              var8Lifetime3 = this.field_v + (int)(ia.a(true, (float)this.field_d * 0.10000000149011612f) * 20.0f);
              if (var8Lifetime3 < 0) {
                var8Lifetime3 = 0;
              }
              if (var8Lifetime3 > 255) {
                var8Lifetime3 = 255;
              }
              for (var9Lifetime2 = 0; var9Lifetime2 < 10; var9Lifetime2++) {
                ge.a((var9Lifetime2 * lb.field_D[var9Lifetime2] + this.field_d) % 480 + 80 << 4, -90 + this.field_k + (int)(4.0f * ia.a(true, (float)(var9Lifetime2 * lb.field_D[var9Lifetime2] + this.field_d) * 0.10000000149011612f)) << 4, ll.field_c[var9Lifetime2] << 4, jf.field_f[var9Lifetime2], cf.field_a);
              }
              uc.a(78, -90 + this.field_k, 558, this.field_k - 90, 3, var8Lifetime3, var7_intLifetime3, this.field_fb);
            }
          }
          ge.h(0, 0, 640, 480);
          ge.c(70, var5Lifetime3, 10, -var5Lifetime3 + 480, var3Lifetime4, 120);
          ge.c(560, var6Lifetime1, 10, -var6Lifetime1 + 480, var3Lifetime4, 120);
          ka.b(0);
          var7 = qh.field_a[this.field_ab];
          var7.b(var7.field_m << 3, var7.field_n << 3, (int)this.field_B << 4, (int)this.field_Z << 4, this.field_g, 4096);
          lb.field_E[0].c(0, 0);
          lb.field_E[1].c(640 - lb.field_E[1].field_m, 0);
          var8Lifetime4 = 0;
          var9_ref_ki = (ki) (wd.field_h.a((byte) -117));
          while (var9_ref_ki != null) {
            if (var8Lifetime4 != 0) {
              var9_ref_ki.field_q = (float)((-1 + var8Lifetime4) * 59 + 148);
              var9_ref_ki.field_B = 602.0f;
              if (!this.field_gb[var8Lifetime4 - 1]) {
                if (this.field_lb[var8Lifetime4 - 1] < 0) {
                  var10_ref_le = tl.field_b;
                } else {
                  var10_ref_le = ak.field_t[this.field_lb[-1 + var8Lifetime4]];
                }
                if (this.field_cb[var8Lifetime4 - 1] >= 10) {
                  var10_ref_le.c((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B), (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y));
                } else {
                  var11Lifetime1 = var10_ref_le.field_m * this.field_cb[var8Lifetime4 - 1] / 10;
                  var10_ref_le.d((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B) + (-var11Lifetime1 + var10_ref_le.field_m) / 2, (var10_ref_le.field_m - var11Lifetime1) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var11Lifetime1, var11Lifetime1);
                }
              } else {
                if (this.field_cb[var8Lifetime4 - 1] >= 10) {
                  var9_ref_ki.a((byte) -97);
                } else {
                  var10Lifetime1 = var9_ref_ki.field_I.field_m * this.field_cb[-1 + var8Lifetime4] / 10;
                  var9_ref_ki.field_I.d((-var10Lifetime1 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_B + (float)var9_ref_ki.field_G), (-var10Lifetime1 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var10Lifetime1, var10Lifetime1);
                }
              }
              var8Lifetime4++;
            } else {
              var8Lifetime4++;
            }
            var9_ref_ki = (ki) (wd.field_h.d((byte) 63));
          }
          if (var8Lifetime4 == 5) {
            if (this.field_lb[-1 + var8Lifetime4] < 0) {
              var9_ref_le = tl.field_b;
            } else {
              var9_ref_le = ak.field_t[this.field_lb[var8Lifetime4 - 1]];
            }
            var10Lifetime2 = 148 + 59 * var8Lifetime4 - 59;
            if (this.field_cb[-1 + var8Lifetime4] < 10) {
              var11Lifetime2 = var9_ref_le.field_m * this.field_cb[var8Lifetime4 - 1] / 10;
              var9_ref_le.d(-(var9_ref_le.field_m / 2) + (-var11Lifetime2 + var9_ref_le.field_m) / 2 + 602, var10Lifetime2 - var9_ref_le.field_m / 2 + (var9_ref_le.field_m - var11Lifetime2) / 2, var11Lifetime2, var11Lifetime2);
            } else {
              var9_ref_le.c(602 - var9_ref_le.field_m / 2, -(var9_ref_le.field_m / 2) + var10Lifetime2);
            }
          }
          var9Lifetime3 = (23040 - 144 * (480 - this.field_O)) / 480;
          if (var9Lifetime3 > 0) {
            ge.c(25, 48 - var9Lifetime3 + 412, 28, var9Lifetime3, 1203134, 120);
          }
          boolean decompiledFrameRemainder0 = true;
          ge.c(37, 460, 4, 20, 1203134, 120);
          j.field_g.c(-(j.field_g.field_m >> 1) + this.field_M - 20, -j.field_g.field_n + this.field_k);
          if (2 == this.field_u && (2 <= this.field_Y ||
            4 == this.field_jb)) {
            var24 = ba.field_a[2][this.field_Y];
            var10_ref_leLifetime1 = var24;
            var11Lifetime3 = (bl.field_f - (var24.field_m >> 1) - (-100 + this.field_M)) * 150;
            if (var11Lifetime3 >= 0) {
              if (var11Lifetime3 > 65535) {
                var11Lifetime3 = var11Lifetime3 - 65535;
              }
            } else {
              var11Lifetime3 = -var11Lifetime3 + 65535;
            }
            var10_ref_leLifetime1.b(var24.field_m << 3, 160, bl.field_f << 4, mh.field_D << 4, var11Lifetime3, 4096);
            decompiledFrameRemainder0 = false;
          }
          else {
            var25 = ba.field_a[this.field_u][this.field_Y];
            var10_ref_leLifetime1Lifetime1 = var25;
            var10_ref_leLifetime1Lifetime1.c(-100 + this.field_M, -var25.field_n + this.field_k - 13);
          }
          boolean decompiledFrameRemainder1 = true;
          wl.field_f[this.field_U].c(-70 + this.field_M, this.field_k + (-13 - wl.field_f[0].field_n));
          var10Lifetime3 = -this.field_z;
          ci.field_d.a(0, ci.field_d.field_n << 3, this.field_M << 4, this.field_k - 48 << 4, var10Lifetime3, 4096);
          ck.field_a[0].c(20 + this.field_M, this.field_k - 13 - wl.field_f[0].field_n);
          fa.f(1);
          pl.field_e.a(this.field_j.toString(), 40, 124, 16777215, -1);
          pl.field_e.a(Integer.toString(1 + dc.field_c % 5), 40, 208, 16777215, -1);
          var11Lifetime4 = -48 / ((param0 - 56) / 43);
          pl.field_e.a(Integer.toString(1 + aa.field_a), 40, 288, 16777215, -1);
          if (13 != this.field_jb) {
            if (this.field_jb == 1) {
              var12 = this.field_d * 40 / 50;
              if (var12 > 40) {
                var12 = 40;
              }
              this.field_R.b(150, 260 + (-var12 + 40) / 2, 340, var12);
              this.field_f.b(150, (-var12 + 40) / 2 + 340, 340, var12);
            } else {
              if (this.field_jb != 2) {
                if (3 != this.field_jb) {
                  if (this.field_jb != 4) {
                    if (this.field_jb != 6) {
                      if (this.field_jb == 5) {
                        if (this.field_d < 32) {
                          f.a(this.field_d, (byte) 117);
                        }
                        ph.field_d.a(0, 0);
                        for (var12 = 0; var12 < ni.field_c.length; var12++) {
                          ni.field_c[var12].b(el.field_b[var12][0], el.field_b[var12][1]);
                        }
                        if (this.field_d / 2 < 255) {
                          stackIn_291_0 = this.field_d / 2;
                        } else {
                          stackIn_291_0 = 255;
                        }
                        var12 = stackIn_291_0;
                        kl.a(0, 0, 640, 480, 12163403, var12);
                        sb.field_r.a(wj.field_h, 321, 170, 6776679, -1);
                        sb.field_r.a(wj.field_h, 319, 170, 6776679, -1);
                        sb.field_r.a(wj.field_h, 320, 171, 6776679, -1);
                        sb.field_r.a(wj.field_h, 320, 169, 6776679, -1);
                        sb.field_r.a(wj.field_h, 320, 170, 16724736, -1);
                        sb.field_r.a(wj.field_h, 330, 180, 6776679, -1, 50);
                        var13 = gg.a(new String[]{this.field_j.toString()}, cl.field_b, true);
                        sb.field_r.a(var13, 321, 320, 6776679, -1);
                        sb.field_r.a(var13, 319, 320, 6776679, -1);
                        sb.field_r.a(var13, 320, 321, 6776679, -1);
                        sb.field_r.a(var13, 320, 319, 6776679, -1);
                        sb.field_r.a(var13, 320, 320, 16724736, -1);
                        sb.field_r.a(var13, 330, 330, 6776679, -1, 50);
                        ba.field_a[this.field_u][this.field_Y].c(-(ba.field_a[this.field_u][this.field_Y].field_k / 2) + 320, 240 - ba.field_a[this.field_u][this.field_Y].field_j / 2);
                        var21 = 0;
                        var14 = var21;
                        while (var21 < 5) {
                          nh.field_f[0][var21][this.field_Y].c(-16 + (320 - 60 * var21 + 120), -(Math.abs(var21 - 2) * 10) + 360);
                          var21++;
                        }
                        f.a(64 - this.field_d, (byte) 111);
                        if (600 < this.field_d) {
                          l.field_D[4].c(0, 0, this.field_d - 600, -700 + this.field_d);
                        }
                        if (!(this.field_d <= 1000)) {
                          f.a(this.field_d - 1000, (byte) 118);
                        }
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        pd.a(true);
                      }
                    } else {
                      if (this.field_d < 400) {
                        ph.field_d.a(0, 0);
                        ni.field_c[0].b(el.field_b[0][0], el.field_b[0][1]);
                        cm.field_F[this.field_Y].c(hc.field_h[aa.field_a][0], this.a(-97, 0, aa.field_a));
                      }
                      if (this.field_d > 350 &&
                        400 > this.field_d) {
                        f.a(this.field_d - 350, (byte) 70);
                      } else {
                        if (this.field_d >= 400 &&
                          this.field_d < 450) {
                          f.a(400 - this.field_d + 50, (byte) 78);
                        }
                      }
                    }
                  } else {
                    var12 = this.field_d;
                    if (0 < var12) {
                      var13_int = var12 - 100;
                      if (var13_int <= 255) {
                        if (var12 > 255) {
                          var12 = 255;
                        }
                        ma.a(l.field_D[aa.field_a], 0, 0, 640, var12, var13_int);
                      } else {
                        l.field_D[aa.field_a].a(0, 0);
                      }
                    }
                    if (450 < this.field_d &&
                      3 > aa.field_a) {
                      ph.field_d.a(0, 0);
                      for (var13_int = 0; var13_int <= aa.field_a + 1; var13_int++) {
                        ni.field_c[var13_int].b(el.field_b[var13_int][0], el.field_b[var13_int][1]);
                      }
                      var13_int = hc.field_h[1 + aa.field_a][0] + (cm.field_F[this.field_Y].field_m - qc.field_L[this.field_Y].field_m) / 2;
                      var14 = (-qc.field_L[this.field_Y].field_n + cm.field_F[this.field_Y].field_n) / 2 + hc.field_h[1 + aa.field_a][1];
                      if (this.field_d >= 650) {
                        if (this.field_d < 700) {
                          if (aa.field_a != 2) {
                            qc.field_L[this.field_Y].c(var13_int, var14);
                          } else {
                            qc.field_L[this.field_Y].f(var13_int, var14);
                          }
                        }
                        cm.field_F[this.field_Y].c(hc.field_h[aa.field_a + 1][0], this.a(89, 650, aa.field_a + 1));
                      } else {
                        var15 = -400 + this.field_d - 50;
                        var16 = hc.field_h[aa.field_a][0] + (cm.field_F[this.field_Y].field_m - qc.field_L[this.field_Y].field_m) / 2;
                        var17 = (cm.field_F[this.field_Y].field_n - qc.field_L[this.field_Y].field_n) / 2 + hc.field_h[aa.field_a][1];
                        var18 = var16 + (-var16 + var13_int) * var15 / 200;
                        var19 = (var14 - var17) * var15 / 200 + var17;
                        if (aa.field_a == 2) {
                          qc.field_L[this.field_Y].f(var18, var19);
                        } else {
                          qc.field_L[this.field_Y].c(var18, var19);
                        }
                      }
                    } else {
                      if (this.field_d > 450) {
                        ke.field_i.a(0, 0);
                      }
                    }
                    if (this.field_d > 400 &&
                      this.field_d < 450) {
                      f.a(this.field_d - 400, (byte) 126);
                    } else {
                      if (this.field_d >= 450 &&
                        this.field_d < 500) {
                        f.a(450 + (-this.field_d + 50), (byte) 111);
                      } else {
                        if (this.field_d > 800) {
                          f.a(-800 + this.field_d, (byte) 123);
                        }
                      }
                    }
                  }
                } else {
                  f.a(50 - this.field_d, (byte) 97);
                }
              } else {
                this.field_R.c(150, 260);
                this.field_f.c(150, 340);
                f.a(this.field_d, (byte) 110);
              }
            }
          } else {
            var12 = -600 + this.field_nb;
            if (var12 > 0) {
              var13_int = var12 - 100;
              if (var13_int <= 255) {
                if (255 < var12) {
                  var12 = 255;
                }
                ma.a(ib.field_d, 0, 0, 480, var12, var13_int);
              } else {
                ib.field_d.a(0, 0);
              }
            }
          }
          if (ok.field_e) {
            pe.a(-112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.Q(" + param0 + ')');
        }
    }

    hj() {
        int dupTemp$0 = 0;
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var1_intLifetime3;
        this.field_o = false;
        this.field_H = 0;
        this.field_A = 0;
        this.field_n = 32;
        this.field_I = 0;
        this.field_m = new le(480, 100);
        this.field_F = new int[480];
        this.field_ib = -40;
        this.field_p = 1;
        this.field_w = 0;
        this.field_C = false;
        this.field_x = 1;
        try {
          rk.field_d = 5180;
          b.field_m = 212;
          h.field_a = 9170;
          sd.field_e = 4180;
          bh.field_g = 0;
          cl.field_d = 8768;
          jc.field_e = 9419;
          nj.field_b = 617;
          this.field_M = 320;
          this.field_jb = 6;
          this.field_k = 480;
          this.field_nb = 0;
          this.field_O = this.field_k - 14;
          uj.b(0);
          dc.field_c = 0;
          rb.a(dc.field_c, (byte) -58);
          if (aa.field_a != 0) {
            if (3 == aa.field_a) {
              this.field_ib = 11;
            }
          } else {
            this.field_ib = 95;
          }
          this.field_r = 1;
          vi.a(true);
          fl.b(-114);
          this.field_m.e();
          for (var1_int = 0; var1_int < 134; var1_int++) {
            ge.b(pf.a((byte) 109, 480), pf.a((byte) -100, 100), 16777215);
          }
          ac.field_a.a((byte) 111);
          this.field_N = new le(480, 200);
          this.field_q = new le(480, 200);
          this.field_A = 0;
          this.field_I = 0;
          this.field_j = new StringBuilder(7);
          this.a(-19921);
          this.b((byte) -43);
          this.field_z = 49150;
          h.a(0, true);
          this.field_R = new le(340, 40);
          this.field_f = new le(340, 40);
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 10; var1_intLifetime1++) {
            jf.field_f[var1_intLifetime1] = 55 + (pf.a((byte) 119, 12) - 6);
            ll.field_c[var1_intLifetime1] = pf.a((byte) -91, 4) + 2;
            lb.field_D[var1_intLifetime1] = pf.a((byte) -101, 20);
          }
          this.field_fb = new int[ua.field_w.length];
          gl.a(ua.field_w, 0, this.field_fb, 0, this.field_fb.length);
          ch.b(-112);
          pg.field_b = null;
          dupTemp$0 = jf.a(-2147483648);
          this.field_W = dupTemp$0;
          this.field_J = dupTemp$0;
          this.field_cb = new int[5];
          this.field_S = true;
          for (var1_intLifetime2 = 0; this.field_cb.length > var1_intLifetime2; var1_intLifetime2++) {
            this.field_cb[var1_intLifetime2] = this.field_cb[var1_intLifetime2] - var1_intLifetime2 * 10;
          }
          this.field_gb = new boolean[5];
          for (var1_intLifetime3 = 0; this.field_gb.length > var1_intLifetime3; var1_intLifetime3++) {
            this.field_gb[var1_intLifetime3] = true;
          }
          this.field_lb = new int[5];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "hj.<init>()");
        }
    }

    static {
        field_db = 0L;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static cj $cfr$intArgs$a$ae8766b723be(int param0, boolean param1) {
        cj var2 = null;
        RuntimeException var2_ref = null;
        cj stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        cj stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -89) {
            field_db = 6L;
          }
          var2 = new cj(true);
          stackIn_4_0 = var2;
          stackIn_5_1 = (param1);
          stackIn_4_0.field_f = stackIn_5_1;
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "hj.O(" + param0 + ',' + param1 + ')');
        }
    }
}
