/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bf {
    private int field_B;
    private ag field_q;
    private he[] field_F;
    private nh field_f;
    private int field_G;
    int field_m;
    private ck[] field_L;
    private boolean field_C;
    private int field_E;
    private static int[] field_S;
    private int field_u;
    static he[] field_v;
    int field_O;
    int field_p;
    int field_I;
    double field_N;
    private int field_V;
    boolean field_s;
    static String field_x;
    int field_t;
    int field_d;
    private int field_K;
    private Random field_T;
    private int field_g;
    private he[] field_n;
    static bg field_h;
    private int field_M;
    private int field_c;
    double field_o;
    int field_w;
    double field_l;
    private he[] field_y;
    he field_D;
    private int field_U;
    private he[] field_r;
    private int field_R;
    private int field_e;
    private int field_z;
    private int field_a;
    int field_J;
    private gf field_b;
    private boolean field_A;
    private hi[] field_i;
    int field_k;
    private int field_P;
    int field_H;
    int field_W;
    int field_Q;
    double field_j;

    private final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        bf var6 = null;
        int var7 = 0;
        int var6_intLifetime1;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_o < (double)param0) {
            return;
          }
          this.field_a = this.field_a - 1;
          if (this.field_a <= 0) {
            return;
          }
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var2_int = -1;
          var3 = -1;
          var4 = (int)(this.field_o + (double)this.field_I);
          var5 = (int)(this.field_N + (double)this.field_t);
          var6_int = this.field_Q;
          if ((var6_int != 5) &&
            (decompiledFrameRemainder0 = (var6_int != 7 ||
            var7 != 0)) &&
            (decompiledFrameRemainder1 = (var6_int != 11 ||
            var7 != 0)) &&
            (decompiledFrameRemainder2 = (var6_int != 17)) &&
            (decompiledFrameRemainder3 = (18 != var6_int ||
            var7 != 0))) {
            if (var6_int != 61) {
              return;
            }
            decompiledFrameRemainder4 = (var7 != 0);
          }
          if ((decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            var2_int = 23;
            if (1 == this.field_J) {
              var2_int = -1;
            }
            if (this.field_J == 2) {
              var3 = 3;
            }
            decompiledFrameRemainder5 = (this.field_J == 3);
            if (decompiledFrameRemainder5) {
              var3 = 4;
              decompiledFrameRemainder5 = (var7 != 0);
            }
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            var4 -= 5;
            if (this.field_J != 2) {
              var3 = 6;
              if (var7 != 0) {
                var3 = 37;
              }
            } else {
              var3 = 37;
            }
            var5 -= 16;
            decompiledFrameRemainder5 = (var7 != 0);
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            if (this.field_J == 1 ||
              this.field_J == 3) {
              var3 = 37;
              var6_intLifetime1 = 0;
              while (true) {
                if (var6_intLifetime1 < 3) {
                  sd.field_a.a(hi.a(32, 4, this.field_T) + (var5 - 16), true, var3, hi.a(64, param0 + 4, this.field_T) + (var4 - 32), 0, true);
                  var6_intLifetime1++;
                  if (var7 == 0) {
                    continue;
                  }
                } else {
                  if (var2_int == -1) {
                    break;
                  }
                }
                th.a(-27610, 32, e.a(param0 + 115, (int)this.field_o), nl.field_r[var2_int]);
                break;
              }
            }
            var2_int = 36;
            decompiledFrameRemainder5 = (var7 != 0);
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            if (this.field_J == 1) {
              var3 = 15;
            }
            var2_int = 58;
            decompiledFrameRemainder5 = (this.field_J == 2);
            if (decompiledFrameRemainder5) {
              var3 = 16;
              decompiledFrameRemainder5 = (var7 != 0);
            }
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            var2_int = 64;
            var3 = 16;
            decompiledFrameRemainder5 = (var7 != 0);
          }
          if (decompiledFrameRemainder5) {
            var2_int = 64;
            var3 = 15;
            if (var7 != 0) {
              return;
            }
          }
          if (var3 != -1) {
            var6 = sd.field_a.a(var5, true, var3, var4, 0, true);
            if (61 == this.field_Q) {
              var6.field_o = var6.field_o - (double)var6.field_I;
            }
          }
          if (var2_int != -1) {
            th.a(-27610, 32, e.a(116, (int)this.field_o), nl.field_r[var2_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.F(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_v = null;
          if (param0 != -114) {
            bf.b(-11);
          }
          field_S = null;
          field_h = null;
          field_x = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "bf.G(" + param0 + ')');
        }
    }

    final boolean d(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        he[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        he var3_ref_he = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_e == 0 &&
            this.field_q != null) {
            od.a(-1630758008, this.field_q);
          }
          if (param0 < 35) {
            this.field_y = (he[]) null;
          }
          this.field_V = this.field_V + 1;
          this.field_e = this.field_e + 1;
          if (this.field_s) {
            var2 = this.field_n;
            this.field_z = this.field_z + 1;
            if (var6 != 0) {
              var2 = this.field_F;
            }
          } else {
            var2 = this.field_F;
          }
          if (this.field_V % qa.field_T[this.field_Q] == 0) {
            fieldTemp$0 = this.field_E + 1;
            this.field_E = this.field_E + 1;
            if (fieldTemp$0 == var2.length) {
              this.field_E = 0;
            }
          }
          if (this.field_r != null) {
            if (this.field_u > 0) {
              this.field_R = -(this.field_u / qa.field_T[this.field_Q]) - 1 + this.field_r.length;
              if (var6 != 0) {
                if (this.field_u >= 0) {
                  this.field_u = this.field_r.length - 1;
                  this.field_R = -(-this.field_u / qa.field_T[this.field_Q]) + (-1 + this.field_r.length);
                } else {
                  this.field_R = -(-this.field_u / qa.field_T[this.field_Q]) + (-1 + this.field_r.length);
                }
              }
            } else {
              boolean decompiledSharedTail0 = !(this.field_u >= 0);
              if (!decompiledSharedTail0) {
                this.field_u = this.field_r.length - 1;
                decompiledSharedTail0 = (var6 != 0);
              }
              if (decompiledSharedTail0) {
                this.field_R = -(-this.field_u / qa.field_T[this.field_Q]) + (-1 + this.field_r.length);
              }
            }
            if (-1 + this.field_r.length < this.field_R) {
              this.field_R = this.field_r.length - 1;
            }
            if (this.field_R < 0) {
              this.field_R = 0;
            }
          }
          if (null != this.field_y) {
            this.field_K = (this.field_y.length - 1) * (this.field_V % this.b((byte) -121, this.field_Q)) / this.b((byte) -123, this.field_Q);
          }
          this.field_A = false;
          var5 = this.field_Q;
          L11: switch ((var6 == 0
            || var5 == 17
            || var5 == 40
            ) ? var5 : -1) {
            case 17:
            case 5:
            case 11:
            case 18:
              var3 = 1 + this.field_V % this.b((byte) -125, this.field_Q) / 20;
              var4 = 2097152;
              var5 = 0;
              while (this.field_L.length > var5) {
                var4 += 256;
                this.field_L[var5].a(-var3 + (int)this.field_N + this.field_t + hi.a(var3 * 2, 4, this.field_T), var3 / 2, var4, 112, 1, (int)this.field_o + hi.a(2 * var3, 4, this.field_T) - var3);
                var5++;
                if (var6 != 0) {
                  break L11;
                }
              }
              if (var6 == 0) {
                break;
              }
            case 40:
              if (430.0 < (double)this.field_t + this.field_N) {
                this.e(63);
                return true;
              }
            default:
              break;
          }
          if (8 != this.field_Q &&
            this.field_Q != 9 &&
            this.field_Q != 10) {
            if (cj.field_c[this.field_Q] ||
              6 == this.field_Q ||
              this.field_Q == 0 ||
              this.field_Q == 35) {
              this.field_N = this.field_N + this.field_j;
              this.field_o = this.field_o + this.field_l;
              this.f(-46);
              if (var6 != 0) {
                this.a((byte) -123);
                this.f(-46);
                this.field_N = this.field_N + this.field_j;
                this.field_o = this.field_o + this.field_l;
                this.field_N = this.field_N + this.field_j;
                this.field_o = this.field_o + this.field_l;
              }
            } else {
              this.a((byte) -123);
              this.f(-46);
              this.field_N = this.field_N + this.field_j;
              this.field_o = this.field_o + this.field_l;
              if (var6 != 0) {
                this.field_N = this.field_N + this.field_j;
                this.field_o = this.field_o + this.field_l;
              }
            }
          } else {
            this.field_N = this.field_N + this.field_j;
            this.field_o = this.field_o + this.field_l;
          }
          if (2 == hc.field_G && (5 == this.field_Q ||
            this.field_Q == 11 ||
            this.field_Q == 17 ||
            18 == this.field_Q)) {
            var3_ref_he = this.b((byte) 55);
            if (this.field_o < 0.0) {
              this.field_C = true;
              this.field_g = (640 + var3_ref_he.field_d) / 2;
              if (var6 != 0 &&
                this.field_o > (double)((var3_ref_he.field_d + 640) / 2)) {
                this.field_C = false;
              }
            } else {
              if (this.field_o > (double)((var3_ref_he.field_d + 640) / 2)) {
                this.field_C = false;
              }
            }
          }
          if (this.field_q != null) {
            this.field_q.l(e.a(124, (int)this.field_o));
          }
          if (this.field_o < (double)(-(100 + this.field_m))) {
            return true;
          }
          if (38 != this.field_Q &&
            this.field_o > 740.0) {
            return true;
          }
          boolean decompiledFrameCompleted0 = true;
          if ((this.field_V & 1) == 0 &&
            vg.field_r[this.field_Q] != -1) {
            var3 = 0;
            while (this.field_i.length > var3) {
              this.field_i[var3].a(lb.field_B[this.field_Q], 30, (double)vg.field_r[this.field_Q], (double)(int)((double)dd.field_h[this.field_Q] + this.field_N), 0, -1.0, 1.0, (double)(int)((double)nc.field_L[this.field_Q] + this.field_o), 64);
              var3++;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            this.l(-39);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "bf.Q(" + param0 + ')');
        }
    }

    private final void a(byte param0, he param1) {
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 < 33) {
            this.a(47);
          }
          if (!this.field_A) {
            param1.a((int)((double)(-param1.field_a) + this.field_o) + this.field_F[this.field_E].field_a, this.field_F[this.field_E].field_f + (int)((double)(-param1.field_f) + this.field_N));
            if (this.field_y != null) {
              this.field_y[this.field_K].a((int)this.field_o, (int)this.field_N);
            }
            if (null != this.field_r) {
              this.field_r[this.field_R].a((int)this.field_o, (int)this.field_N);
              if (DrPhlogistonSavesTheEarth.field_D) {
                param1.c((int)this.field_o, (int)this.field_N, 128, qk.field_b[this.field_Q]);
                if (this.field_y != null) {
                  this.field_y[this.field_K].c((int)this.field_o, (int)this.field_N, 128, qk.field_b[this.field_Q]);
                }
                if (null != this.field_r) {
                  this.field_r[this.field_R].c((int)this.field_o, (int)this.field_N, 128, qk.field_b[this.field_Q]);
                }
              }
            }
          } else {
            param1.c((int)this.field_o, (int)this.field_N, 128, qk.field_b[this.field_Q]);
            if (this.field_y != null) {
              this.field_y[this.field_K].c((int)this.field_o, (int)this.field_N, 128, qk.field_b[this.field_Q]);
            }
            if (null != this.field_r) {
              this.field_r[this.field_R].c((int)this.field_o, (int)this.field_N, 128, qk.field_b[this.field_Q]);
            }
          }
          if (this.field_f != null &&
            2 == sd.field_e &&
            0 < g.field_s[this.field_Q]) {
            if (0 == (1 & this.field_e)) {
              this.field_f = gm.a(this.field_f, fb.field_c[this.field_Q], g.field_s[this.field_Q], ff.field_Q[this.field_Q][this.field_E], fk.field_t[this.field_Q], true);
            }
            if (this.field_f != null) {
              this.field_f.a((int)this.field_o, (int)this.field_N, 382);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_43_0 = var3;
          stackIn_43_1 = new StringBuilder().append("bf.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final boolean m(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -94) {
            return false;
          }
          if (!this.field_s) {
            return true;
          }
          if (this.field_s &&
            th.field_d[this.field_Q]) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.W(" + param0 + ')');
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_e = -20;
          }
          stackIn_16_0 = ((!(this.field_Q < 19) &&
            !(30 < this.field_Q)) ||
            (!(this.field_Q < 65) &&
            !(this.field_Q > 76)));
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.C(" + param0 + ')');
        }
    }

    final int e(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        int var5 = 0;
        try {
          var2_int = -(int)this.field_N + 430;
          var3 = (double)(this.field_e % k.field_M[this.field_Q]) / (0.5 * (double)k.field_M[this.field_Q]);
          var5 = 126 % ((param0 - 26) / 63);
          stackIn_1_0 = (int)((-var3 + 1.0) * (double)var2_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.H(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_int = this.field_Q;
          if (40 != var2_int &&
            var2_int != 41 &&
            var2_int != 8 &&
            9 != var2_int && ((var2_int != 10 ||
            var3 != 0) &&
            (var2_int != 15 ||
            var3 != 0)) && (16 != var2_int &&
            0.0 > this.field_N &&
            !cj.field_c[this.field_Q])) {
            this.field_j = 0.0;
            this.field_N = 0.0;
          }
          if (param0 != -39) {
            this.field_i = (hi[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.B(" + param0 + ')');
        }
    }

    private final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          ek.field_n = (ek.field_n + 1) % 5;
          if (param0 < 56) {
            this.field_T = (Random) null;
          }
          stackIn_4_0 = ek.field_n;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.A(" + param0 + ')');
        }
    }

    private final boolean g(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -34) {
            return true;
          }
          if (null == sd.field_a) {
            return false;
          }
          if (this.field_Q != 45 &&
            44 != this.field_Q) {
            return true;
          }
          stackIn_16_0 = !(!(200.0 > dl.a(true, -sd.field_a.field_N + this.field_o, -sd.field_a.field_D + this.field_N)));
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.D(" + param0 + ')');
        }
    }

    final boolean h(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 33 / ((-20 - param0) / 37);
          stackIn_13_0 = (this.field_Q == 5) || (this.field_Q == 11) || (this.field_Q == 17) || (18 == this.field_Q);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.L(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (0 > this.field_H) {
            return;
          }
          boolean decompiledFrameRemainder15 = true;
          boolean decompiledFrameRemainder14 = true;
          boolean decompiledFrameRemainder13 = true;
          boolean decompiledFrameRemainder12 = true;
          boolean decompiledFrameRemainder11 = true;
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var4 = this.field_Q;
          if (((0 != var4 ||
            var5 != 0) && var4 != 35) &&
            (decompiledFrameRemainder15 = (1 != var4 ||
            var5 != 0))) {
            decompiledFrameRemainder0 = (2 != var4);
            if (((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = (var4 != 47 ||
              var5 != 0))) &&
              (decompiledFrameRemainder1 = (4 != var4)) &&
              (decompiledFrameRemainder2 = (3 != var4)) &&
              (decompiledFrameRemainder3 = (var4 != 46)) &&
              (decompiledFrameRemainder4 = (var4 != 5)) &&
              (decompiledFrameRemainder5 = (var4 != 7 ||
              var5 != 0)) &&
              (decompiledFrameRemainder6 = (var4 != 12)) &&
              (decompiledFrameRemainder7 = (var4 != 11))) {
              decompiledFrameRemainder8 = (var4 != 13);
              if (((decompiledFrameRemainder8) &&
                (decompiledFrameRemainder8 = (var4 != 14 ||
                var5 != 0)) &&
                (decompiledFrameRemainder8 = (16 != var4 ||
                var5 != 0)) &&
                (decompiledFrameRemainder8 = (var4 != 38 ||
                var5 != 0)) &&
                (decompiledFrameRemainder8 = (var4 != 39)) &&
                (decompiledFrameRemainder8 = (var4 != 62)) &&
                (decompiledFrameRemainder8 = (var4 != 63))) &&
                (decompiledFrameRemainder9 = (var4 != 42)) &&
                (decompiledFrameRemainder10 = (var4 != 15 ||
                var5 != 0)) &&
                (decompiledFrameRemainder11 = (17 != var4 ||
                var5 != 0)) &&
                (decompiledFrameRemainder12 = (var4 != 18)) &&
                (decompiledFrameRemainder13 = (var4 != 61 ||
                var5 != 0)) &&
                (decompiledFrameRemainder14 = (var4 != 45 ||
                var5 != 0)) &&
                (decompiledFrameRemainder15 = (44 == var4))) {
                decompiledFrameRemainder14 = (var5 != 0);
              }
            }
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            if (this.field_c <= 0 &&
              this.field_U <= 0 &&
              Math.random() < (double)(sd.field_a.field_q + 1) / 100.0) {
              this.field_c = this.b((byte) -119, this.field_Q);
              this.field_U = 5 + hi.a(8, 4, this.field_T);
            }
            this.field_c = this.field_c - 1;
            if (0 > this.field_c &&
              0 < this.field_U &&
              (1 & this.field_V) == 0) {
              this.field_U = this.field_U - 1;
              this.e(param0 ^ -19);
            }
            if (this.field_V % this.a((byte) 79, this.field_Q) == 0) {
              this.k(0);
            }
            this.field_l = -oi.field_b[this.field_Q];
            decompiledFrameRemainder15 = (var5 != 0);
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            if (this.field_c < 0 &&
              0 >= this.field_U &&
              Math.random() < (double)(sd.field_a.field_q + 1) / 100.0) {
              this.field_c = this.b((byte) -127, this.field_Q);
              this.field_U = sd.field_a.field_q + 1;
            }
            this.field_c = this.field_c - 1;
            if (0 > this.field_c &&
              0 < this.field_U &&
              0 == this.field_V % (10 - sd.field_a.field_q)) {
              this.field_U = this.field_U - 1;
              this.e(63);
            }
            this.field_g = (int)this.field_o;
            this.field_l = -oi.field_b[this.field_Q];
            decompiledFrameRemainder15 = (this.field_Q == 47);
            if (decompiledFrameRemainder15) {
              this.field_l = this.field_l * -1.0;
              this.field_j = this.field_j - vh.field_a[this.field_Q] * ji.a(65535, (double)this.field_e / 50.0);
              decompiledFrameRemainder15 = (var5 != 0);
            }
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            if (Math.random() < 0.01 &&
              0 > this.field_c) {
              this.field_c = this.b((byte) -124, this.field_Q);
            }
            this.field_c = this.field_c - 1;
            if (this.field_c == 0) {
              this.e(63);
            }
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            this.field_g = (int)this.field_o;
            this.field_l = -oi.field_b[this.field_Q];
            decompiledFrameRemainder15 = (var5 != 0);
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            this.field_l = -oi.field_b[this.field_Q];
            decompiledFrameRemainder15 = (var5 != 0);
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            if (0 == this.field_V % 150) {
              this.d(param0 + 46);
            }
            if (this.field_V % this.b((byte) -120, this.field_Q) == 0) {
              this.e(63);
            }
            decompiledFrameRemainder15 = (this.field_V % 50 == 0);
            if (decompiledFrameRemainder15) {
              this.k(0);
              decompiledFrameRemainder15 = (var5 != 0);
            }
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            var2_int = (int)(-sd.field_a.field_N + this.field_o);
            var3 = (int)(this.field_N - sd.field_a.field_D);
            if (0 > this.field_u &&
              var2_int * var2_int + var3 * var3 > 5625) {
              this.field_u = this.b((byte) -119, this.field_Q);
              if (this.field_J == 2) {
                this.field_u = this.field_u * 2;
              }
            }
            this.field_u = this.field_u - 1;
            decompiledFrameRemainder15 = (this.field_u == 0);
            if (decompiledFrameRemainder15) {
              this.d(param0 ^ -46);
              this.field_u = -1;
              decompiledFrameRemainder15 = (var5 != 0);
            }
          }
          if (((decompiledFrameRemainder15) && (decompiledFrameRemainder14) && (decompiledFrameRemainder13) && (decompiledFrameRemainder12) && (decompiledFrameRemainder11) && (decompiledFrameRemainder10) && (decompiledFrameRemainder9) && (decompiledFrameRemainder8) && (decompiledFrameRemainder7)) &&
            (decompiledFrameRemainder15 = !(40 <= this.field_V % k.field_M[this.field_Q])) &&
            (decompiledFrameRemainder15 = ((3 & (int)this.field_o) == 0))) {
            this.e(63);
            decompiledFrameRemainder15 = (var5 != 0);
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8)) {
            if (this.field_u < 0 &&
              this.field_V % 125 == 0) {
              this.field_u = this.b((byte) -128, this.field_Q);
            }
            if (this.field_V % this.b((byte) -119, this.field_Q) == 0) {
              this.e(param0 ^ -19);
            }
            this.field_u = this.field_u - 1;
            if (this.field_u == 0) {
              if (3 == this.field_J) {
                if (0.5 > Math.random()) {
                  this.d(0);
                  if (var5 != 0) {
                    this.g(param0 ^ 119);
                    this.d(0);
                    this.g(param0 - 31);
                  }
                } else {
                  this.g(param0 ^ 119);
                  if (var5 != 0) {
                    this.d(0);
                    this.g(param0 - 31);
                  }
                }
              } else {
                this.d(0);
                this.g(param0 - 31);
              }
              this.field_u = -1;
            }
            decompiledFrameRemainder15 = !(this.field_V % 62 >= 10);
            if (decompiledFrameRemainder15) {
              this.k(0);
              decompiledFrameRemainder15 = (var5 != 0);
            }
          }
          if (((decompiledFrameRemainder15) && (decompiledFrameRemainder14) && (decompiledFrameRemainder13) && (decompiledFrameRemainder12) && (decompiledFrameRemainder11) && (decompiledFrameRemainder10) && (decompiledFrameRemainder9)) &&
            (decompiledFrameRemainder15 = (this.field_V % this.b((byte) -121, this.field_Q) == 0)) &&
            (decompiledFrameRemainder15 = !(!(635.0 > this.field_o)))) {
            this.e(63);
            decompiledFrameRemainder15 = (var5 != 0);
          }
          if (((decompiledFrameRemainder15) && (decompiledFrameRemainder14) && (decompiledFrameRemainder13) && (decompiledFrameRemainder12) && (decompiledFrameRemainder11) && (decompiledFrameRemainder10)) &&
            (decompiledFrameRemainder15 = (3 == this.field_J)) &&
            (decompiledFrameRemainder15 = (this.field_V % this.b((byte) -125, this.field_Q) == 0)) &&
            (decompiledFrameRemainder15 = !(!(this.field_o < 635.0)))) {
            this.e(param0 ^ -19);
            decompiledFrameRemainder15 = (var5 != 0);
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            ((double)(this.field_V % this.b((byte) -118, this.field_Q)) <= 10.0 * cd.a((byte) 106))) {
            this.e(63);
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12)) {
            if (this.field_V % 300 == 0) {
              this.d(0);
            }
            if (0 == this.field_V % this.b((byte) -127, this.field_Q)) {
              this.e(param0 + 109);
            }
            this.k(0);
            decompiledFrameRemainder15 = (var5 != 0);
          }
          if ((decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13)) {
            if (this.field_V % 300 == 0) {
              if (Math.random() < 0.5) {
                this.d(0);
                if (var5 != 0) {
                  this.g(param0 ^ 13);
                }
              } else {
                this.g(param0 ^ 13);
              }
            }
            if (this.field_V % this.b((byte) -123, this.field_Q) <= 100) {
              this.e(param0 ^ -19);
            }
            decompiledFrameRemainder15 = ((this.field_V & 11) == 0);
            if ((decompiledFrameRemainder15) &&
              (decompiledFrameRemainder15 = (0 == (1 & this.field_V >> 6)))) {
              this.k(0);
              decompiledFrameRemainder15 = (var5 != 0);
            }
          }
          if (((decompiledFrameRemainder15) && (decompiledFrameRemainder14)) &&
            (decompiledFrameRemainder15 = (this.field_V % 120 == 0))) {
            this.d(0);
            decompiledFrameRemainder15 = (var5 != 0);
          }
          if ((decompiledFrameRemainder15) && (this.g((byte) -125) &&
            0 == (1 & this.field_V))) {
            this.e(param0 + 109);
          }
          if (param0 != -46) {
            this.field_J = 51;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.J(" + param0 + ')');
        }
    }

    final void j(int param0) {
        he stackIn_52_1 = null;
        int stackIn_143_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        he var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        double var3 = 0.0;
        int var4 = 0;
        int var5 = 0;
        double var5_double = 0.0;
        int var6_int = 0;
        Random var6 = null;
        double var7_double = 0.0;
        int var7 = 0;
        int var8_int = 0;
        he[] var8 = null;
        double var9_double = 0.0;
        int var9_int = 0;
        he var9 = null;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var3_intLifetime1;
        double var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var3_intLifetime1Lifetime1;
        int var4Lifetime1Lifetime1;
        int var6_intLifetime1Lifetime1;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          boolean decompiledFrameCompleted1 = true;
          if (sd.field_e != 0 &&
            !this.field_s &&
            ta.field_j[this.field_Q] >= 0) {
            var2_int = 0;
            while (this.field_i.length > var2_int) {
              this.field_i[var2_int].a(param0 ^ 30217);
              var2_int++;
              if (var13 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (param0 != 30325)) {
            return;
          }
          var2 = this.b((byte) 55);
          if (this.field_Q != 42) {
            if (!this.field_s && (this.field_Q == 62 ||
              this.field_Q == 63)) {
              var3_int = (int)sd.field_a.field_N + am.field_p;
              var4 = (int)sd.field_a.field_D + ri.field_q;
              var5 = (int)(-this.field_o - (double)this.field_I + (double)var3_int);
              var6_int = (int)((double)var4 - ((double)this.field_t + this.field_N));
              var7_double = Math.atan2((double)var5, (double)var6_int) + 3.141592653589793;
              var9_double = var7_double - 1.5707963267948966;
              var11 = (int)(32.0 * (0.5 + var7_double / 6.283185307179586));
              if (0 != this.field_J) {
                if (1 == this.field_J && (3.141592653589793 < var9_double ||
                  0.0 > var9_double)) {
                  var11 = 0;
                  if (var13 != 0 && (3.141592653589793 > var9_double &&
                    0.0 < var9_double)) {
                    var11 = 16;
                  }
                }
              } else {
                if (3.141592653589793 > var9_double &&
                  0.0 < var9_double) {
                  var11 = 16;
                }
              }
              var11 = (12 + var11) % 32;
              if (this.field_Q == 62) {
                stackIn_52_1 = lc.field_i[var11];
              } else {
                stackIn_52_1 = jk.field_I[var11];
              }
              this.field_D = stackIn_52_1;
              this.field_p = -this.field_t + (int)this.field_N;
              this.field_d = 20 + ((int)this.field_o - this.field_I);
              this.field_D.a(this.field_d, this.field_p);
            }
            this.a((byte) 58, var2);
          }
          if ((this.field_Q == 45 ||
            this.field_Q == 44) && !this.field_s) {
            var3 = 1.1764705882352942;
            var5_double = var3 * 255.0 / this.i(param0 - 30232);
            if (0.0 < var5_double) {
              if (var5_double > 1.0) {
                var5_double = 1.0;
              }
              var7 = (int)(var5_double * 128.0);
              var8_int = (int)(64.0 * var5_double);
              var9_int = (int)(255.0 * var5_double);
              var10_ref_int__ = new int[128];
              var11Lifetime1 = 0;
              while (true) {
                boolean decompiledFrameRemainder3 = true;
                if (var11Lifetime1 < 128) {
                  var12 = (int)(Math.pow((double)var11Lifetime1, 1.5) / 8.0);
                  var10_ref_int__[var11Lifetime1] = li.a(li.a(var8_int * var12 >> 8 << 8, var7 * var12 >> 8 << 16), var9_int * var12 >> 8);
                  var11Lifetime1++;
                  if (var13 == 0) {
                    continue;
                  }
                } else {
                  decompiledFrameRemainder3 = (45 == this.field_Q);
                }
                if (decompiledFrameRemainder3) {
                  wj.a((int)this.field_o + this.field_I << 4, (int)this.field_N + 41 << 4, 1920, 126, var10_ref_int__);
                }
                if (this.field_Q != 44) {
                  break;
                }
                wj.a(41 + (int)this.field_o << 4, this.field_t + (int)this.field_N << 4, 1920, 126, var10_ref_int__);
                break;
              }
            }
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameCompleted0 = true;
          if (this.b((byte) -123, this.field_Q) > 0) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var3_intLifetime1 = this.b((byte) -121, this.field_Q) - this.field_V % this.b((byte) -123, this.field_Q);
            var4Lifetime1 = -(255 * var3_intLifetime1 / this.b((byte) -122, this.field_Q)) + 255;
            var6_intLifetime1 = this.field_Q;
            if ((var6_intLifetime1 != 5 && ((11 != var6_intLifetime1 ||
              var13 != 0) &&
              (17 != var6_intLifetime1 ||
              var13 != 0)) && var6_intLifetime1 != 18) &&
              (decompiledFrameRemainder0 = (var6_intLifetime1 != 4 ||
              var13 != 0)) &&
              (decompiledFrameRemainder2 = (42 == var6_intLifetime1))) {
              decompiledFrameRemainder1 = (var13 != 0);
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              var6_intLifetime1Lifetime1 = 0;
              while (var6_intLifetime1Lifetime1 < this.field_L.length) {
                this.field_L[var6_intLifetime1Lifetime1].c(-1);
                var6_intLifetime1Lifetime1++;
                if (var13 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder2 = (var13 != 0);
              }
            }
            if (((decompiledFrameRemainder2) && (decompiledFrameRemainder1) && (decompiledFrameCompleted0)) &&
              (decompiledFrameRemainder2 = !(0 >= this.field_c))) {
              var3_intLifetime1Lifetime1 = this.field_c;
              var4Lifetime1Lifetime1 = 255 - var3_intLifetime1Lifetime1 * 255 / this.b((byte) -128, this.field_Q);
              wj.c((int)this.field_o + this.field_I, this.field_t + (int)this.field_N, var3_intLifetime1Lifetime1, 16777215, var4Lifetime1Lifetime1);
              decompiledFrameRemainder2 = (var13 != 0);
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameCompleted0)) {
              var5Lifetime1 = this.e((byte) 116);
              if (var5Lifetime1 > 0) {
                var6 = new Random((long)(this.field_V / this.b((byte) -120, this.field_Q)));
                var7Lifetime1 = hi.a(3, 4, var6);
                if (var7Lifetime1 == 0) {
                  var8 = og.field_e;
                  if (var13 != 0) {
                    if (var7Lifetime1 == 1) {
                      var8 = oi.field_a;
                      var8 = cc.field_y;
                    } else {
                      var8 = cc.field_y;
                    }
                  }
                } else {
                  if (var7Lifetime1 == 1) {
                    var8 = oi.field_a;
                    if (var13 != 0) {
                      var8 = cc.field_y;
                    }
                  } else {
                    var8 = cc.field_y;
                  }
                }
                var9 = var8[this.field_V / 5 % var8.length];
                var10 = this.field_I + ((int)this.field_o - 5);
                var11Lifetime2 = this.field_t + (int)this.field_N;
                wj.e(var10, var11Lifetime2, 10, -var11Lifetime2 + 430, 61568, 0);
                var9.a(var10, var11Lifetime2 + var5Lifetime1);
              }
              this.a((byte) 34, var2);
            }
          }
          if (this.h(-76) &&
            !this.field_s) {
            var3Lifetime1 = (double)this.field_H / (double)ql.field_b[this.field_Q];
            stackIn_143_0 = (this.field_Q == 18) ? 30 : 10;
            var5Lifetime2 = stackIn_143_0;
            if (2 != sd.field_e) {
              wj.d(160, var5Lifetime2, 320, 10, 16763951);
              wj.f(161, 1 + var5Lifetime2, 318, 8, 16711680);
              wj.f(161, 1 + var5Lifetime2, (int)(318.0 * var3Lifetime1), 8, 65280);
              if (var13 == 0) {
                return;
              }
            }
            wj.a(160, var5Lifetime2, 320, 10, 16763951, 127);
            wj.d(161, 1 + var5Lifetime2, 318, 8, 16711680, 127);
            wj.d(161, var5Lifetime2 + 1, (int)(var3Lifetime1 * 318.0), 8, 65280, 127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "bf.V(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 7769) {
            return;
          }
          if (this.field_q != null) {
            gi.a(this.field_q, 3408);
            this.field_q.i(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.O(" + param0 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = param1.getDocumentBase().getFile();
              var3 = var2.indexOf((int) (char)param0);
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param1.getCodeBase(), var4);
              param1.getAppletContext().showDocument(kk.a(var5, param1, param0 + 4767936), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("bf.K(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0 == 5) {
          }
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var3 = this.field_Q;
          if ((var3 != 1) &&
            (decompiledFrameRemainder0 = (var3 != 5 ||
            var4 != 0)) &&
            (decompiledFrameRemainder0 = (var3 != 11)) &&
            (decompiledFrameRemainder0 = (var3 != 17)) &&
            (decompiledFrameRemainder0 = (var3 != 18 ||
            var4 != 0))) {
            decompiledFrameRemainder1 = (var3 != 15);
            if (((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder1 = (var3 != 16)) &&
              (decompiledFrameRemainder1 = (var3 != 7))) &&
              (decompiledFrameRemainder2 = (var3 != 42))) {
              decompiledFrameRemainder3 = (8 != var3 ||
                var4 != 0);
              if (((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder3 = (var3 != 9 ||
                var4 != 0)) &&
                (decompiledFrameRemainder3 = (var3 != 10))) &&
                (decompiledFrameRemainder4 = (var3 != 2 ||
                var4 != 0)) &&
                (decompiledFrameRemainder5 = (3 != var3)) &&
                (decompiledFrameRemainder5 = (var3 != 4 ||
                var4 != 0))) {
                decompiledFrameRemainder6 = (var3 != 0 ||
                  var4 != 0);
                if (((decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder6 = (35 != var3)) &&
                  (decompiledFrameRemainder6 = (var3 != 13)) &&
                  (decompiledFrameRemainder6 = (var3 != 14)) &&
                  (decompiledFrameRemainder6 = (var3 != 46))) &&
                  (decompiledFrameRemainder7 = (var3 != 37 ||
                  var4 != 0))) {
                  if (var3 == 6) {
                    return;
                  }
                  if (var3 != 12) {
                    return;
                  }
                  if (var4 == 0) {
                    return;
                  }
                }
              }
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            var2_int = (int)(250.0 / cd.a((byte) 103));
            if (var2_int <= this.field_V) {
              this.field_g = (int)sd.field_a.field_N;
              this.field_M = (int)sd.field_a.field_D;
              this.field_P = 25;
              if (var4 == 0) {
                return;
              }
            }
            this.field_g = this.field_m + hi.a(-(this.field_m * 4) + 640, 4, this.field_T);
            this.field_M = hi.a(-this.field_O + 425, param0 - 1, this.field_T) + 5;
            if (var4 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            this.field_g = hi.a(-this.field_m + 640, 4, this.field_T);
            this.field_M = hi.a(-this.field_O + 425, 4, this.field_T) + 5;
            if (!this.field_C) {
              return;
            }
            if (this.field_Q != 18) {
              this.field_g = (640 + this.field_m) / 2;
              if (var4 == 0) {
                return;
              }
            }
            this.field_g = (-this.field_m + 640) / 2;
            if (var4 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            if (this.field_V >= 0) {
              this.field_g = hi.a(-this.field_m + 640, 4, this.field_T);
              this.field_M = 5 + hi.a(425 - this.field_O, param0 - 1, this.field_T);
              if (var4 == 0) {
                return;
              }
            }
            this.field_g = (int)this.field_o - (50 - hi.a(100, 4, this.field_T));
            this.field_M = 200;
            if (var4 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            this.field_g = hi.a(640 - this.field_m, 4, this.field_T);
            this.field_M = 5 + hi.a(-this.field_O + 210, 4, this.field_T);
            if (var4 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            this.field_g = 0;
            this.field_M = hi.a(430 - this.field_O, 4, this.field_T);
            if (hc.field_G != 2) {
              return;
            }
            this.field_M = (int)sd.field_a.field_D;
            if (var4 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            if (hc.field_G > hi.a(3, 4, this.field_T)) {
              this.field_M = (int)sd.field_a.field_D + ri.field_q;
              if (var4 == 0) {
                return;
              }
            }
            this.field_M = hi.a(-this.field_O + 425, 4, this.field_T) + 5;
            if (var4 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            this.field_M = (int)sd.field_a.field_D;
            if (var4 == 0) {
              return;
            }
          }
          if (decompiledFrameRemainder7) {
            this.field_M = (int)this.field_N;
            this.field_g = -this.field_m;
            this.field_j = 0.0;
            if (var4 == 0) {
              return;
            }
          }
          this.field_M = (int)sd.field_a.field_D;
          this.field_g = (int)sd.field_a.field_N;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.AA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int var24 = 0;
        double var10Lifetime1;
        var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_double = (double)(int)(this.field_o + (double)this.field_I);
          var4 = (double)(int)(this.field_N + (double)this.field_t);
          var6 = -10.0;
          var8 = (double)((int)this.field_j / 4);
          var14 = 22.0;
          var16 = -1;
          if (param0 != 0) {
            this.field_I = -61;
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var23 = this.field_Q;
          if (((var23 != 0 ||
            var24 != 0) && var23 != 35) &&
            (decompiledFrameRemainder0 = (var23 != 5 ||
            var24 != 0)) &&
            (decompiledFrameRemainder1 = (11 != var23 ||
            var24 != 0))) {
            if (var23 == 17 &&
              var24 == 0) {
              var16 = 18;
              var10 = (double)this.field_V / 100.0;
              var12 = var10 + 3.141592653589793;
              var10 = var10 + (double)hi.a(10, 4, this.field_T) / 30.0;
              var12 = var12 + (double)hi.a(10, param0 ^ 4, this.field_T) / 30.0;
              sd.field_a.a(24, new gf(var16, -60.0 + var2_double, var4, ji.a(param0 ^ 65535, var10) * var14, var14 * pj.a(var10, 32768), -10.0, this.field_N));
              sd.field_a.a(24, new gf(var16, 60.0 + var2_double, var4, var14 * ji.a(65535, var12), var14 * pj.a(var12, param0 ^ 32768), -10.0, this.field_N));
              sd.field_a.a(24, new gf(var16, var2_double - 60.0, var4, ji.a(65535, var10) * -var14, pj.a(var10, 32768) * var14, -10.0, this.field_N));
              sd.field_a.a(24, new gf(var16, 60.0 + var2_double, var4, ji.a(65535, var12) * -var14, pj.a(var12, 32768) * var14, -10.0, this.field_N));
              return;
            }
            if ((var23 == 18)) {
              var16 = 18;
              var6 = -var2_double + ((double)am.field_p + sd.field_a.field_N);
              var4 = (double)(int)(this.field_N + 127.0);
              var8 = -var4 + (sd.field_a.field_D + (double)ri.field_q);
              var21 = Math.sqrt(var6 * var6 + var8 * var8);
              var6 = var6 / var21;
              var8 = var8 / var21;
              var8 = var8 * 22.0;
              var6 = var6 * 22.0;
            }
            decompiledFrameRemainder2 = false;
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            var16 = 12;
            var17 = (int)sd.field_a.field_N + am.field_p;
            var18 = ri.field_q + (int)sd.field_a.field_D;
            var8 = (double)(int)((double)var18 - ((double)this.field_t + this.field_N));
            var6 = (double)(int)((double)var17 - (this.field_o + (double)this.field_I));
            var19 = Math.sqrt(var6 * var6 + var8 * var8);
            var8 = var8 / var19;
            var6 = var6 / var19;
            var6 = var6 * 5.0;
            var8 = var8 * 5.0;
            var2_double = var2_double + 5.0;
            var4 = var4 - 80.0;
            var8 = var8 - 2.0;
            decompiledFrameRemainder2 = (var24 != 0);
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            var16 = 6;
            var6 = -1.0;
            var8 = 0.0;
            decompiledFrameRemainder2 = (var24 != 0);
          }
          if (decompiledFrameRemainder2) {
            var10Lifetime1 = (double)this.field_V / 10.0;
            var16 = 18;
            var10Lifetime1 = var10Lifetime1 + 1.5707963267948966;
            sd.field_a.a(24, new gf(var16, var2_double - 60.0, var4, var14 * ji.a(65535, var10Lifetime1), pj.a(var10Lifetime1, 32768) * var14, -10.0, this.field_N));
            sd.field_a.a(24, new gf(var16, 60.0 + var2_double, var4, ji.a(65535, -var10Lifetime1) * var14, pj.a(-var10Lifetime1, 32768) * var14, -10.0, this.field_N));
            return;
          }
          if (var16 != -1) {
            sd.field_a.a(24, new gf(var16, var2_double, var4, var6, var8, -10.0, this.field_N));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.R(" + param0 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 79) {
            stackIn_4_0 = (int)(100.0 / cd.a((byte) 72));
            return stackIn_4_0;
          }
          stackIn_2_0 = -10;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "bf.BA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int var24 = 0;
        var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (0 > this.field_V) {
            return;
          }
          var4 = (double)this.field_I + this.field_o;
          if (param0 != 63) {
            this.k(45);
          }
          L1: {
            boolean decompiledFrameRemainder6 = true;
            boolean decompiledFrameRemainder5 = true;
            boolean decompiledFrameRemainder4 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var6 = (double)this.field_t + this.field_N;
            var8 = -10.0;
            var10 = this.field_j / 4.0;
            var12 = bb.field_h[this.field_Q];
            var13 = (int)sd.field_a.field_N + am.field_p;
            var14 = (int)sd.field_a.field_D + ri.field_q;
            var15 = Math.atan2((double)var14 - var6, (double)var13 - var4);
            var23 = this.field_Q;
            if (var23 == 47) {
              var8 = var8 * -1.0;
              if (var24 == 0) {
                break L1;
              }
            } else {
              if ((var23 != 0) &&
                (decompiledFrameRemainder0 = (var23 != 35)) &&
                (decompiledFrameRemainder1 = (var23 != 12))) {
                decompiledFrameRemainder2 = (var23 != 5);
                if (((decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder2 = (var23 != 11)) &&
                  (decompiledFrameRemainder2 = (var23 != 17))) &&
                  (decompiledFrameRemainder3 = (var23 != 18 ||
                  var24 != 0)) &&
                  (decompiledFrameRemainder4 = (var23 != 43)) &&
                  (decompiledFrameRemainder4 = (var23 != 62))) {
                  decompiledFrameRemainder5 = (var23 != 13);
                  if (((decompiledFrameRemainder5) &&
                    (decompiledFrameRemainder5 = (var23 != 14 ||
                    var24 != 0)) &&
                    (decompiledFrameRemainder5 = (16 != var23 ||
                    var24 != 0)) &&
                    (decompiledFrameRemainder5 = (var23 != 42 ||
                    var24 != 0))) &&
                    (decompiledFrameRemainder6 = (var23 != 63))) {
                    L14: {
                      L15: {
                        if (var23 != 15 && (var23 != 38 ||
                          var24 != 0)) {
                          switch (var23) {
                            case 40:
                              break L15;
                            case 45:
                              break L14;
                            case 44:
                              break L14;
                            default:
                              break L1;
                          }
                        }
                        var8 = sd.field_a.field_N - this.field_o;
                        var10 = sd.field_a.field_D - this.field_N;
                        var21 = Math.atan2(var8, var10);
                        var21 = var21 + (Math.random() - 0.5) / 32.0;
                        var8 = ji.a(65535, var21) * 15.0;
                        var10 = pj.a(var21, param0 ^ 32831) * 15.0;
                        if (var24 == 0) {
                          break L1;
                        }
                      }
                      var10 = 0.0;
                      var8 = 0.0;
                      this.field_b = new gf(var12, var4, var6, 0.0, 0.0, (double)am.field_p + sd.field_a.field_N, sd.field_a.field_D + (double)ri.field_q);
                      sd.field_a.a(24, this.field_b);
                      if (var24 == 0) {
                        break L1;
                      }
                    }
                    if (sd.field_a.field_fb < 0) {
                      if (45 == this.field_Q) {
                        var6 = 41.0 + this.field_N;
                        if ((var24 != 0) &&
                          (44 == this.field_Q)) {
                          var4 = 41.0 + this.field_o;
                        }
                      } else {
                        if (44 == this.field_Q) {
                          var4 = 41.0 + this.field_o;
                        }
                      }
                      this.field_b = new gf(var12, var4, var6, 0.0, 0.0, sd.field_a.field_N + (double)am.field_p, sd.field_a.field_D + (double)ri.field_q);
                      this.field_b.field_l = this.field_V;
                      sd.field_a.a(-2 + sd.field_a.field_gb, param0 - 63);
                      sd.field_a.a(24, this.field_b);
                    }
                    return;
                  }
                }
              }
            }
            if ((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              var8 = (Math.random() + 2.0) * -2.0;
              var10 = (Math.random() + 1.0) * 2.0;
              var6 = var6 - 23.0;
              var4 = var4 - 39.0;
              if (var24 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              var8 = 2.0 * (2.0 + Math.random());
              var4 = var4 + 39.0;
              var10 = (1.0 + Math.random()) * 2.0;
              var6 = var6 - 23.0;
              if (var24 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2)) {
              var8 = -1.0 + (-0.5 + Math.random());
              var10 = Math.random() - 0.5 + -5.0;
              if (var24 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3)) {
              if (this.field_Q == 5) {
                this.field_j = 0.0;
                this.field_M = (int)this.field_N;
                this.field_g = (int)this.field_o;
                this.field_l = -1.0;
              }
              var8 = 0.0;
              var10 = 0.0;
              this.field_G = (int)(aa.field_c[this.field_Q] - 128.0);
              if (var24 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4)) {
              var8 = (double)(-(15 + hi.a(5, 4, this.field_T)));
              var10 = (double)(hi.a(40, 4, this.field_T) - 20);
              var4 = var4 + (double)(hi.a(100, 4, this.field_T) - 50);
              this.field_G = (int)(aa.field_c[this.field_Q] - 128.0);
              if (var24 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5)) {
              if (0 == this.field_J &&
                var15 < 3.141592653589793 &&
                0.0 < var15) {
                return;
              }
              if (this.field_J == 1 && (var15 > 3.141592653589793 ||
                var15 < 0.0)) {
                return;
              }
            }
            if (decompiledFrameRemainder6) {
              var10 = (double)(int)((double)var14 - ((double)this.field_t + this.field_N));
              var8 = (double)(int)((double)var13 - ((double)this.field_I + this.field_o));
              var2_double = Math.sqrt(var8 * var8 + var10 * var10);
              var8 = var8 / var2_double;
              var10 = var10 / var2_double;
              var8 = var8 * 5.0;
              var10 = var10 * 5.0;
              if (this.field_Q != 13) {
                if (this.field_Q != 62) {
                  break L1;
                }
                var4 = var4 + 12.0 * var8;
                var4 = var4 + 15.0;
                var6 = var6 + 12.0 * var10;
                if (var24 == 0) {
                  break L1;
                }
              }
              var10 = var10 - 2.0;
              if (var24 == 0) {
                break L1;
              }
            }
            if (0 == this.field_J &&
              var15 < 3.141592653589793 &&
              var15 > 0.0) {
              return;
            }
            if (this.field_J == 1 && (var15 > 3.141592653589793 ||
              0.0 > var15)) {
              return;
            }
            var10 = (double)(int)((double)var14 - ((double)this.field_t + this.field_N));
            var8 = (double)(int)(-this.field_o - (double)this.field_I + (double)var13);
            var2_double = Math.sqrt(var8 * var8 + var10 * var10);
            var10 = var10 / var2_double;
            var8 = var8 / var2_double;
            var10 = var10 * 5.0;
            var8 = var8 * 5.0;
            var4 = var4 + 7.0 * var8;
            var17 = var10 * 3.0;
            var6 = var6 + 7.0 * var10;
            var19 = -3.0 * var8;
            var4 = var4 - var17 / 2.0;
            var6 = var6 - var19 / 2.0;
            sd.field_a.a(24, new gf(var12, var4, var6, var8, var10, -10.0, var6, 2));
            sd.field_a.a(param0 ^ 39, new gf(var12, var4 + var17, var6 + var19, var8, var10, -10.0, var6, 2));
            sd.field_a.a(param0 - 39, new gf(var12, -var17 + var4, var6 - var19, var8, var10, -10.0, var6, 2));
            return;
          }
          sd.field_a.a(24, new gf(var12, var4, var6, var8, var10, -10.0, var6));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.M(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        int discarded$0 = 0;
        boolean stackIn_19_1 = false;
        boolean stackIn_52_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        bf var4 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        bf var4Lifetime1;
        int var3_intLifetime1;
        double var5Lifetime1;
        double var7Lifetime1;
        int var3_intLifetime1Lifetime1;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (wh.field_v[this.field_Q]) {
            return false;
          }
          if (param1 != 10) {
            discarded$0 = this.f((byte) -7);
          }
          if (sd.field_a.field_fb > 0 &&
            this.h(-78)) {
            return false;
          }
          this.field_A = true;
          this.field_H = this.field_H - param0;
          stackIn_19_1 = !(this.field_H >= 0);
          this.field_s = stackIn_19_1;
          if (this.field_s) {
            if (ga.field_j[this.field_Q] != -1) {
              var3_int = e.a(param1 + 104, this.field_I + (int)this.field_o);
              if (ga.field_j[this.field_Q] != 69) {
                th.a(-27610, 48, var3_int, nl.field_r[ga.field_j[this.field_Q]]);
              }
            }
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted1 = true;
            if (this.field_Q == 9) {
              var3_intLifetime1 = 0;
              while (var3_intLifetime1 < 4) {
                var4 = sd.field_a.a((int)(this.field_N + (double)(this.field_t / 2)), true, 8, (int)(this.field_o + (double)(this.field_I / 2)), 0, true);
                var5 = (1.0 + Math.random()) / 2.0;
                var7 = Math.random() * 6.283185307179586;
                var4.field_l = this.field_l + var5 * ji.a(65535, var7);
                var4.field_j = this.field_j + var5 * pj.a(var7, 32768);
                var3_intLifetime1++;
                if (var9 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                decompiledFrameRemainder0 = (var9 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1) &&
              (this.field_Q == 10)) {
              var3_intLifetime1Lifetime1 = 0;
              while (var3_intLifetime1Lifetime1 < 2) {
                var4Lifetime1 = sd.field_a.a((int)(this.field_N + (double)(this.field_t / 2)), true, 9, (int)(this.field_o + (double)(this.field_I / 2)), 0, true);
                var5Lifetime1 = (1.0 + Math.random()) / 2.0;
                var7Lifetime1 = Math.random() * 6.283185307179586;
                var4Lifetime1.field_l = this.field_l + var5Lifetime1 * ji.a(param1 + 65525, var7Lifetime1);
                var4Lifetime1.field_j = this.field_j + pj.a(var7Lifetime1, 32768) * var5Lifetime1;
                var3_intLifetime1Lifetime1++;
                if (var9 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              decompiledFrameRemainder1 = !(!th.field_d[this.field_Q]);
            }
            if (decompiledFrameRemainder1) {
              this.field_f = this.b((byte) 55).b();
            }
            this.field_l = -1.0;
          }
          stackIn_52_0 = this.field_s;
          return stackIn_52_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "bf.N(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(long param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ae.field_ib.setTime(new Date(param0));
          var3_int = ae.field_ib.get(7);
          var4 = ae.field_ib.get(5);
          var5 = ae.field_ib.get(2);
          var6 = ae.field_ib.get(1);
          var7 = ae.field_ib.get(11);
          var8 = ae.field_ib.get(12);
          if (param1 != -29) {
            bf.a(29, (java.applet.Applet) null);
          }
          var9 = ae.field_ib.get(13);
          stackIn_4_0 = nf.field_q[var3_int - 1] + ", " + var4 / 10 + var4 % 10 + "-" + ka.field_j[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "bf.U(" + param0 + ',' + param1 + ')');
        }
    }

    final he b(byte param0) {
        he stackIn_32_0 = null;
        he stackIn_34_0 = null;
        he stackIn_37_0 = null;
        he stackIn_40_0 = null;
        he stackIn_42_0 = null;
        he stackIn_54_0 = null;
        he stackIn_60_0 = null;
        he stackIn_62_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (param0 != 55) {
            this.field_V = -10;
          }
          var2_int = this.field_Q;
          if (48 != var2_int &&
            var2_int != 49 && (var2_int != 50 ||
            DrPhlogistonSavesTheEarth.field_D) && (51 != var2_int &&
            52 != var2_int &&
            53 != var2_int)) {
            if (var2_int != 45 &&
              var2_int != 44) {
              if (this.field_s && (this.field_z > 25 ||
                sd.field_e != 2 ||
                !(1 <= g.field_s[this.field_Q]))) {
                stackIn_54_0 = this.field_n[this.field_E % this.field_n.length];
                return stackIn_54_0;
              }
              if (this.field_Q == 12 &&
                2 == this.field_J) {
                stackIn_62_0 = ib.field_j[this.field_E % ib.field_j.length];
                return stackIn_62_0;
              }
              stackIn_60_0 = this.field_F[this.field_E % this.field_F.length];
              return stackIn_60_0;
            }
            if (this.field_s) {
              stackIn_37_0 = this.field_n[0];
              return stackIn_37_0;
            }
            if (!this.g((byte) -78)) {
              stackIn_42_0 = sh.field_c[this.field_Q][0];
              return stackIn_42_0;
            }
            stackIn_40_0 = sh.field_c[this.field_Q][1];
            return stackIn_40_0;
          }
          if (!this.field_s) {
            stackIn_34_0 = this.field_F[this.field_J % this.field_F.length];
            return stackIn_34_0;
          }
          stackIn_32_0 = this.field_n[this.field_J % this.field_n.length];
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.S(" + param0 + ')');
        }
    }

    private final int b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -117) {
            stackIn_4_0 = (int)((double)k.field_M[param1] / cd.a((byte) 116));
            return stackIn_4_0;
          }
          stackIn_2_0 = -23;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "bf.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final double i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        double stackIn_2_0 = 0.0;
        double stackIn_4_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -32 / ((28 - param0) / 32);
          if (sd.field_a == null) {
            stackIn_4_0 = -1.0;
            return stackIn_4_0;
          }
          stackIn_2_0 = dl.a(true, this.field_o - sd.field_a.field_N, -sd.field_a.field_D + this.field_N);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.DA(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        try {
          if (param0 != 128) {
            field_h = (bg) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "bf.E(" + param0 + ')');
        }
    }

    private final void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (0.0 > this.field_o) {
            return;
          }
          this.field_a = this.field_a - 1;
          if (this.field_a <= 0) {
            return;
          }
          if (param0 >= -20) {
            this.field_W = -93;
          }
          boolean decompiledFrameRemainder0 = true;
          var2_int = -1;
          var3 = this.field_Q;
          if (var3 == 11 &&
            var4 == 0) {
            if (this.field_J == 2 ||
              this.field_J == 3) {
              sd.field_a.a((int)(this.field_N + (double)this.field_t), true, 9, (int)((double)this.field_I + this.field_o), 0, true);
            }
            var2_int = 36;
            decompiledFrameRemainder0 = false;
          } else {
            decompiledFrameRemainder0 = (var3 == 18);
          }
          if (decompiledFrameRemainder0) {
            var2_int = 64;
            sd.field_a.a((int)((double)this.field_t + this.field_N), true, 4, (int)((double)this.field_I + this.field_o), 0, true);
          }
          if (var2_int != -1) {
            th.a(-27610, 32, e.a(112, (int)this.field_o), nl.field_r[var2_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.T(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_int = 15 % ((param0 + 90) / 33);
          boolean decompiledSharedTail0 = !(this.field_C);
          if (!decompiledSharedTail0) {
            var7 = 4.0 * oi.field_b[this.field_Q];
            var5 = 4.0 * ff.field_N[this.field_Q];
            var3 = 3.0 * vh.field_a[this.field_Q];
            decompiledSharedTail0 = (var12 != 0);
          }
          if (decompiledSharedTail0) {
            var7 = oi.field_b[this.field_Q];
            var5 = ff.field_N[this.field_Q];
            var3 = vh.field_a[this.field_Q];
          }
          var11 = this.field_Q;
          if (var11 == 1) {
            this.field_l = 0.0;
            this.field_j = 0.0;
            this.field_o = -(0.5 * (double)this.field_e * oi.field_b[this.field_Q]) + (double)(640 + this.field_m);
            this.field_N = 100.0 + 75.0 * ji.a(65535, (double)this.field_e / 18.0);
            return;
          }
          if (var11 == 38) {
            this.field_j = 0.0;
            this.field_l = 0.0;
            this.field_o = (double)(-(this.field_e / 2) + this.field_m + 640 + 160) - 150.0 * ji.a(65535, (double)this.field_e / 60.0);
            this.field_N = 100.0 + ji.a(65535, (double)this.field_e / 18.0) * 75.0;
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var11 == 42 &&
            var12 == 0) {
            if (0 == this.field_V % this.b((byte) -125, this.field_Q)) {
              this.field_j = 0.0;
              this.field_G = 0;
              this.field_l = -1.0;
              this.field_g = (int)this.field_o;
              this.field_M = (int)this.field_N;
            }
            var9 = (double)(this.field_V % this.b((byte) -124, this.field_Q)) / ((double)this.b((byte) -123, this.field_Q) * 0.5);
            if (!(0.0 < -var9 + 1.0)) {
              if ((!(!((double)this.field_P > -this.field_o + (double)this.field_g))) &&
                (!(!((double)this.field_M - this.field_N < (double)this.field_P)))) {
                this.c(5);
              }
            } else {
              this.field_l = 0.0;
              this.field_o = this.field_o - 1.0;
            }
            decompiledFrameRemainder0 = false;
          } else if (var11 != 39 ||
            var12 != 0) {
            if ((40 == var11)) {
              if (this.field_e == 1) {
                this.field_N = (double)(-this.field_O);
                this.field_o = (double)(-(this.f((byte) 118) * 100) + 570);
              }
              this.field_l = 0.0;
              this.field_j = var5;
            }
            decompiledFrameRemainder0 = false;
          }
          if (decompiledFrameRemainder0) {
            this.field_j = 0.0;
            this.field_o = -(var7 * (double)this.field_e) + (double)(this.field_m + 640);
            this.field_l = 0.0;
            this.field_N = ji.a(65535, (double)this.field_e / 24.0) * 75.0 + 100.0;
            return;
          }
          this.field_l = this.field_l - this.field_l / 10.0;
          this.field_j = this.field_j - this.field_j / 10.0;
          if (this.field_s) {
            this.field_j = this.field_j + var3;
            return;
          }
          if (Math.abs((double)(-this.field_g) + this.field_o) < (double)this.field_P &&
            Math.abs(this.field_N - (double)this.field_M) < (double)this.field_P) {
            if (!(aa.field_c[this.field_Q] > (double)this.field_G)) {
              this.field_G = 0;
              this.field_l = -1.0;
              this.field_j = 0.0;
              this.c(5);
              if (var12 == 0) {
                return;
              }
            }
            this.field_G = this.field_G + 1;
            if (var12 == 0) {
              return;
            }
          }
          if ((double)this.field_g < this.field_o) {
            if (-var7 < this.field_l) {
              this.field_l = this.field_l - var3;
            }
            if (this.field_l < -var7) {
              this.field_l = -var7;
              if (var12 != 0) {
                if (var7 > this.field_l) {
                  this.field_l = this.field_l + var3;
                }
                if (this.field_l > var7) {
                  this.field_l = var7;
                }
              }
            }
          } else {
            if (var7 > this.field_l) {
              this.field_l = this.field_l + var3;
            }
            if (this.field_l > var7) {
              this.field_l = var7;
            }
          }
          if ((double)this.field_M < this.field_N) {
            if (this.field_j > -var5) {
              this.field_j = this.field_j - var3;
            }
            if (!(-var5 > this.field_j)) {
              return;
            }
            this.field_j = -var5;
            if (var12 == 0) {
              return;
            }
          }
          if (var5 > this.field_j) {
            this.field_j = this.field_j + var3;
          }
          if (var5 < this.field_j) {
            this.field_j = var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "bf.P(" + param0 + ')');
        }
    }

    bf(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        he var7 = null;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        int var10 = 0;
        int var11 = 0;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_s = false;
        this.field_L = new ck[4];
        this.field_a = 200;
        this.field_A = false;
        this.field_u = -1;
        this.field_R = 0;
        this.field_c = 0;
        this.field_i = new hi[1];
        this.field_D = null;
        this.field_K = 0;
        this.field_U = 0;
        this.field_z = 0;
        this.field_f = null;
        this.field_E = 0;
        try {
          this.field_B = param2;
          this.field_T = new Random((long)this.field_B);
          this.field_J = param1;
          this.field_k = param3;
          this.field_W = param4;
          this.field_Q = param0;
          this.field_Q = param0;
          this.field_H = ql.field_b[this.field_Q];
          this.field_w = o.field_k[this.field_Q];
          if (this.field_Q == 12 &&
            0.333 > Math.random()) {
            this.field_V = 0;
            if (var11 != 0) {
              if (k.field_M[this.field_Q] == 0) {
                this.field_V = 0;
                this.field_V = hi.a(k.field_M[this.field_Q], 4, this.field_T);
              } else {
                this.field_V = hi.a(k.field_M[this.field_Q], 4, this.field_T);
              }
            }
          } else {
            boolean decompiledSharedTail1 = (k.field_M[this.field_Q] != 0);
            if (!decompiledSharedTail1) {
              this.field_V = 0;
              decompiledSharedTail1 = (var11 != 0);
            }
            if (decompiledSharedTail1) {
              this.field_V = hi.a(k.field_M[this.field_Q], 4, this.field_T);
            }
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var7_int = this.field_Q;
          if (64 == var7_int &&
            var11 == 0) {
            if (Math.random() <= 0.5) {
              this.field_n = bh.field_e;
              this.field_F = ad.field_v;
            } else {
              this.field_F = sh.field_c[this.field_Q];
              this.field_n = vj.field_g[this.field_Q];
            }
            decompiledFrameRemainder1 = false;
          } else {
            decompiledFrameRemainder0 = (var7_int == 62);
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            if (this.field_J == 0) {
              this.field_F = sh.field_c[this.field_Q];
              this.field_n = vj.field_g[this.field_Q];
              decompiledFrameRemainder1 = (var11 != 0);
            }
            if (decompiledFrameRemainder1) {
              this.field_F = bh.field_b;
              this.field_n = tl.field_I;
              decompiledFrameRemainder1 = (var11 != 0);
            }
          }
          if (decompiledFrameRemainder1) {
            this.field_F = sh.field_c[this.field_Q];
            this.field_n = vj.field_g[this.field_Q];
          }
          var7 = this.b((byte) 55);
          this.field_t = var7.field_k / 2 + var7.field_f;
          this.field_I = var7.field_d / 2 + var7.field_a;
          this.field_O = var7.field_c;
          this.field_m = var7.field_h;
          boolean decompiledSharedTail0 = (4 == this.field_Q ||
            this.field_Q == 3);
          if (!decompiledSharedTail0) {
            this.field_P = field_S[this.field_Q];
            decompiledSharedTail0 = (var11 != 0);
          }
          if (decompiledSharedTail0) {
            this.field_P = (int)((double)field_S[this.field_Q] / cd.a((byte) 121));
          }
          if (cj.field_c[this.field_Q]) {
            this.field_l = -oi.field_b[this.field_Q];
          }
          if (ac.field_j[this.field_Q] != -1 &&
            nl.field_r[ac.field_j[this.field_Q]] != null) {
            this.field_q = ag.a(nl.field_r[ac.field_j[this.field_Q]], 256, 64);
            this.field_q.f(-1);
            this.field_q.c(0, nl.field_r[ac.field_j[this.field_Q]].field_i.length);
          }
          this.field_i[0] = new hi(ta.field_j[this.field_Q]);
          this.field_o = 640.0;
          this.field_e = 0;
          this.field_N = (double)param4;
          var10 = this.field_Q;
          L14: switch ((var11 == 0
            || var10 == 0
            || var10 == 5
            || var10 == 8
            || var10 == 9
            || var10 == 10
            || var10 == 11
            || var10 == 16
            || var10 == 18
            || var10 == 47
            ) ? var10 : -1) {
            case 35:
            case 0:
              this.field_M = (int)this.field_N;
              if (var11 == 0) {
                break;
              }
            case 47:
              this.field_o = (double)(-this.field_m + 5);
              if (var11 == 0) {
                break;
              }
            case 7:
              this.field_r = vd.field_g;
              if (var11 == 0) {
                break;
              }
            case 11:
              this.field_r = mi.field_i;
              this.field_y = ib.field_r;
              var10 = 0;
              while (this.field_L.length > var10) {
                this.field_L[var10] = new ck();
                var10++;
                if (var11 != 0) {
                  break L14;
                }
              }
              if (var11 == 0) {
                break;
              }
            case 8:
            case 9:
            case 10:
              this.c(5);
              this.field_l = (-this.field_o + (double)this.field_g) / 640.0 * oi.field_b[this.field_Q];
              this.field_j = oi.field_b[this.field_Q] * (((double)this.field_M - this.field_N) / 480.0);
              var8 = Math.random();
              this.field_l = this.field_l * (0.25 + 0.75 * var8);
              this.field_j = this.field_j * (0.75 * var8 + 0.25);
              if (var11 == 0) {
                break;
              }
            case 12:
              if (0 != hi.a(2, 4, this.field_T)) {
                this.field_J = 0;
                if (var11 == 0) {
                  break;
                }
              }
              this.field_J = 2;
              if (var11 == 0) {
                break;
              }
            case 15:
            case 16:
              if (param5) {
                break;
              }
              this.field_o = (double)(50 + hi.a(-100 - (this.field_m - 640), 4, this.field_T));
              this.field_N = (double)(5 - this.field_O);
              this.field_j = 2.0 * -ff.field_N[this.field_Q];
              this.field_l = 0.0;
              if (var11 == 0) {
                break;
              }
            case 5:
            case 17:
            case 18:
              var10 = 0;
              while (var10 < this.field_L.length) {
                this.field_L[var10] = new ck();
                var10++;
                if (var11 != 0) {
                  return;
                }
              }
            default:
              break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var7_ref), "bf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_x = "The account name you use to access RuneScape and other Jagex.com games";
        field_S = new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        field_h = null;
    }
}
