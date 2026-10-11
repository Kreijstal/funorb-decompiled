/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aga extends rk {
    int field_x;
    int field_J;
    int field_E;
    int field_I;
    boolean field_A;
    boolean field_G;
    int field_F;
    int field_s;
    op field_w;
    int field_y;
    int field_v;
    int field_u;
    int field_C;
    int field_t;
    boolean field_z;
    int field_D;
    int field_H;
    int[] field_K;

    final boolean c(byte param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -10) {
            this.field_K = (int[]) null;
          }
          var3 = ur.field_e[param1];
          if (this.field_y == 44) {
            return false;
          }
          if (this.field_y == 29) {
            return false;
          }
          if (35 == this.field_y &&
            1 < var3.field_l) {
            return false;
          }
          if (this.field_y == 2) {
            return false;
          }
          if (this.field_y == 9 &&
            var3.field_a == 1) {
            return false;
          }
          if (this.field_y == 8 &&
            var3.field_a == 2) {
            return false;
          }
          if (54 == this.field_y) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3_ref), "aga.U(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean f(int param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = ur.field_e[param1];
          var4 = this.b(param1, (byte) -127);
          if (var3.field_g != param0 &&
            ~this.field_K[var4] != ~(1 + var3.field_g)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3_ref), "aga.OA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void d(boolean param0) {
        int[] var1 = dr.c(106);
        if (param0) {
          return;
        }
        if (null == var1) {
          return;
        }
        try {
          mn.field_l = new hca(var1[0], var1[1], kda.b(97));
          uka.field_h = new hca(320, 400, bf.field_h[wca.field_n].field_j);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "aga.GA(" + param0 + ')');
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4_int = 0;
        oha var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = BachelorFridge.field_y;
        try {
          if (this.field_y != 0 &&
            this.field_y != 35) {
            this.field_C = this.field_C - 1;
          }
          if (param1 >= -7) {
            this.a(19, (byte) -77);
          }
          var4_int = 0;
          while (var4_int < this.field_K.length) {
            if (var6 != 0) {
              return;
            }
            if (this.field_m[var4_int] != -1) {
              var5 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var4_int]]];
              if (this.field_K[var4_int] < var5.field_g) {
                this.field_K[var4_int] = this.field_K[var4_int] + 1;
              }
            }
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "aga.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = BachelorFridge.field_y;
        try {
          if (param0 <= 50) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_w.field_a[this.field_x][this.field_J].field_n != 23 ||
            !this.field_w.a(this.field_J, (byte) 124, this.field_x) ||
            this.field_D == 0 ||
            this.g((byte) 85)) {
            if (24 == this.field_w.field_a[this.field_x][this.field_J].field_n &&
              this.field_w.a(this.field_J, (byte) 120, this.field_x) &&
              this.field_D != 1 &&
              !this.g((byte) 85)) {
              this.b((byte) 125, 25);
              this.field_w.field_T.field_G[1] = true;
              decompiledFrameRemainder1 = (var3 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (25 == this.field_w.field_a[this.field_x][this.field_J].field_n &&
                this.field_w.a(this.field_J, (byte) 115, this.field_x) &&
                this.field_D != 2 &&
                !this.g((byte) 85)) {
                this.b((byte) 115, 26);
                this.field_w.field_T.field_G[2] = true;
                decompiledFrameRemainder1 = (var3 != 0);
              }
              if ((decompiledFrameRemainder1) &&
                (this.field_w.field_a[this.field_x][this.field_J].field_n == 26) &&
                (this.field_w.a(this.field_J, (byte) 121, this.field_x)) &&
                (this.field_D != 3) &&
                (!this.g((byte) 85))) {
                this.b((byte) 114, 27);
                this.field_w.field_T.field_G[3] = true;
                if (var3 != 0) {
                  this.b((byte) 115, 24);
                  this.field_w.field_T.field_G[0] = true;
                }
              }
            }
          } else {
            this.b((byte) 115, 24);
            this.field_w.field_T.field_G[0] = true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.i(23, 118) &&
            this.g((byte) 85) &&
            this.field_D == 0) {
            this.field_w.field_C[this.field_D] = this.field_w.field_C[this.field_D] + 1;
            this.field_w.field_T.field_s[this.field_D] = this.field_w.field_T.field_s[this.field_D] + 1;
            var2_int = this.field_w.b((byte) 65, this);
            if (var2_int != -1) {
              this.field_w.a(var2_int, (byte) 82);
              this.field_y = 0;
            }
            decompiledFrameRemainder0 = (var3 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (!this.i(24, -105) ||
              !this.g((byte) 85) ||
              1 != this.field_D) {
              if ((!this.i(25, 127) ||
                !this.g((byte) 85) ||
                this.field_D != 2) &&
                (decompiledFrameRemainder0 = !(!this.i(26, 125))) &&
                (decompiledFrameRemainder0 = !(!this.g((byte) 85))) &&
                (decompiledFrameRemainder0 = (this.field_D == 3))) {
                this.field_w.field_C[this.field_D] = this.field_w.field_C[this.field_D] + 1;
                this.field_w.field_T.field_s[this.field_D] = this.field_w.field_T.field_s[this.field_D] + 1;
                var2_intLifetime1 = this.field_w.b((byte) 63, this);
                if (-1 != var2_intLifetime1) {
                  this.field_w.a(var2_intLifetime1, (byte) 78);
                  this.field_y = 0;
                }
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                this.field_w.field_C[this.field_D] = this.field_w.field_C[this.field_D] + 1;
                this.field_w.field_T.field_s[this.field_D] = this.field_w.field_T.field_s[this.field_D] + 1;
                var2_intLifetime1 = this.field_w.b((byte) 116, this);
                if (var2_intLifetime1 != -1) {
                  this.field_w.a(var2_intLifetime1, (byte) 121);
                  this.field_y = 0;
                }
                if (var3 != 0) {
                  this.field_w.field_C[this.field_D] = this.field_w.field_C[this.field_D] + 1;
                  this.field_w.field_T.field_s[this.field_D] = this.field_w.field_T.field_s[this.field_D] + 1;
                  var2_intLifetime1 = this.field_w.b((byte) 51, this);
                  if (var2_intLifetime1 != -1) {
                    this.field_w.a(var2_intLifetime1, (byte) 120);
                    this.field_y = 0;
                  }
                }
              }
            } else {
              this.field_w.field_C[this.field_D] = this.field_w.field_C[this.field_D] + 1;
              this.field_w.field_T.field_s[this.field_D] = this.field_w.field_T.field_s[this.field_D] + 1;
              var2_intLifetime1 = this.field_w.b((byte) 51, this);
              if (var2_intLifetime1 != -1) {
                this.field_w.a(var2_intLifetime1, (byte) 120);
                this.field_y = 0;
              }
            }
          }
          if (this.field_w.a(this.field_D, this.field_x, this.field_J, (byte) -41) &&
            !this.g((byte) 85)) {
            this.field_w.a(this.field_D, (byte) 65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.K(" + param0 + ')');
        }
    }

    final void j(int param0) {
        int var2_int = 0;
        aga var3 = null;
        int var4 = 0;
        aga stackIn_14_0 = null;
        Object stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        aga stackOut_13_0;
        RuntimeException var2 = null;
        Object stackIn_33_0Lifetime1;
        var4 = BachelorFridge.field_y;
        try {
          if (param0 > -98) {
            return;
          }
          if (this.field_w.field_o == 3 &&
            this.g((byte) 85)) {
            this.c(true);
          }
          boolean decompiledFrameCompleted0 = true;
          if (31 == this.field_y) {
            var2_int = 0;
            while (var2_int < 7) {
              var3 = this.field_w.field_S[this.field_D].field_b[var2_int];
              stackOut_13_0 = var3;
              stackIn_33_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if ((stackIn_14_0 != null ||
                var4 != 0) &&
                (!var3.i(-106) ||
                var4 != 0) &&
                var2_int != this.field_u) {
                var3.h(121, this.field_t);
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_I = 0;
            this.field_w.field_a[this.field_x][this.field_J].field_l = null;
            this.field_C = 0;
            stackIn_33_0Lifetime1 = this;
          }
          this.field_y = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.BA(" + param0 + ')');
        }
    }

    final void c(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          var3_int = 56 % ((param1 - 57) / 59);
          var4 = 0;
          var5 = 0;
          while (this.field_m.length > var5) {
            if (var7 != 0) {
              return;
            }
            if (this.field_m[var5] != -1) {
              var6 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var5]]];
              if ((var6.field_j != 3 ||
                var7 != 0) && this.field_K[var5] <= var6.field_g) {
                if (~param0 == ~var4) {
                  this.field_K[var5] = -3 + var6.field_g;
                }
                var4++;
              }
            }
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "aga.H(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_t = (int)it.field_c[this.field_k[0]];
          if (this.field_I > this.field_t) {
            this.field_I = this.field_t;
          }
          if (param0 != -2) {
            this.c((byte) 99, -101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.R(" + param0 + ')');
        }
    }

    final void j(int param0, int param1) {
        oha var3 = ur.field_e[this.field_o.field_g.field_b[this.field_m[param0]]];
        if (param1 != 0) {
          return;
        }
        try {
          this.field_K[param0] = var3.field_g + 1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "aga.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0, byte param1) {
        RuntimeException runtimeException = null;
        oha var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y == 42) {
            return;
          }
          var3 = ur.field_e[param0];
          if (param1 > -78) {
            this.j(-35, -54);
          }
          var4 = this.b(param0, (byte) -113);
          if (var3.a(-125)) {
            this.field_K[var4] = 2 + var3.field_g;
            if (BachelorFridge.field_y == 0) {
              return;
            }
          }
          this.field_K[var4] = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "aga.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(rha param0, byte param1) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        try {
          param0.a(this.field_u + ": " + this.field_o.field_f, 4819);
          param0.a(109, 2);
          param0.a("x: " + this.field_x + " y: " + this.field_J, 4819);
          param0.a("hp: " + this.field_I + "/" + this.field_t, 4819);
          var3_int = 99 % ((-30 - param1) / 56);
          if (this.field_F != 0) {
            param0.a("splitid: " + this.field_F, 4819);
          }
          if (this.field_y != 0) {
            param0.a("status: " + pna.field_zb[this.field_y].field_d + " (" + this.field_C + " turns)", 4819);
          }
          if (37 == this.field_y) {
            param0.a("friendly: " + this.field_E, 4819);
          }
          if (this.field_H != 0) {
            param0.a("shield: " + this.field_H, 4819);
          }
          var4 = 0;
          while (var4 < 5) {
            var5 = this.field_m[var4];
            if (var8 != 0) {
              return;
            }
            if (-1 != var5 ||
              var8 != 0) {
              var6 = al.a(-80, this.field_o.field_g.field_b[var5]);
              var7 = this.field_K[var4];
              if (var7 == 0) {
                param0.a("move " + var4 + ": " + var6.field_f, 4819);
              } else {
                param0.a("move " + var4 + ": " + var6.field_f + " (cooldown " + var7 + ")", 4819);
              }
            }
            var4++;
          }
          param0.a("Creature checksum: " + Integer.toString(this.g(96), 16), 4819);
          param0.a(115, -2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("aga.N(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean i(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (this.field_x > 0 &&
            ~this.field_w.field_a[-1 + this.field_x][this.field_J].field_n == ~param0) {
            return true;
          }
          if (this.field_x < (this.field_w.field_z - 1) &&
            this.field_w.field_a[1 + this.field_x][this.field_J].field_n == param0) {
            return true;
          }
          if (this.field_J > 0 &&
            param0 == this.field_w.field_a[this.field_x][-1 + this.field_J].field_n) {
            return true;
          }
          if ((this.field_w.field_B - 1) > this.field_J &&
            ~param0 == ~this.field_w.field_a[this.field_x][1 + this.field_J].field_n) {
            return true;
          }
          var3_int = 36 % ((param1 - 83) / 33);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.T(" + param0 + ',' + param1 + ')');
        }
    }

    final String b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_7_0 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -91 % ((-21 - param0) / 54);
          if (0 <= this.field_D &&
            this.field_w.field_y.length > this.field_D) {
            stackIn_7_0 = this.field_w.field_y[this.field_D];
          } else {
            stackIn_7_0 = Integer.toString(this.field_D);
          }
          var3 = stackIn_7_0;
          stackIn_8_0 = "owner: " + var3 + " pos: " + this.field_u + " type: " + this.field_o.field_f;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.O(" + param0 + ')');
        }
    }

    private final void h(int param0, int param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_I = this.field_I + param1;
          if (this.field_I > this.field_t) {
            param1 = param1 + (-this.field_I + this.field_t);
            this.field_I = this.field_t;
          }
          this.field_w.field_T.field_F[this.field_D] = this.field_w.field_T.field_F[this.field_D] + param1;
          var3_int = -86 % ((param0 - 38) / 58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean g(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (this.field_y == 33) {
            return false;
          }
          if (this.field_y == 3) {
            param1 = param1 >> 1;
          }
          var3_int = -36 / ((param0 + 23) / 44);
          if (this.field_H > 0) {
            this.field_H = this.field_H - param1;
            if (this.field_H <= 0) {
              this.b((byte) 125, 0);
            }
            return false;
          }
          if (37 == this.field_y &&
            param1 != 0) {
            this.b((byte) 116, 0);
          }
          if (param1 < 0) {
            this.h(-24, -param1);
            return false;
          }
          if (29 == this.field_y ||
            this.field_y == 44) {
            this.b((byte) 115, 0);
          }
          this.field_I = this.field_I - param1;
          this.field_w.field_T.field_b[this.field_D] = this.field_w.field_T.field_b[this.field_D] + param1;
          if (this.field_I > 0) {
            return false;
          }
          this.j(-122);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.L(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(wia param0, int param1) {
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_126_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          if (this.a(32, (byte) -66)) {
            return;
          }
          var3_int = param0.field_n;
          if (od.field_w[this.field_w.field_a[this.field_x][this.field_J].field_n].field_b &&
            this.field_w.field_a[this.field_x][this.field_J].field_m &&
            !this.g((byte) 85) &&
            33 != this.field_y) {
            L1: {
              if (var3_int != 11) {
                if (var3_int == 10) {
                  this.b((byte) 126, 18);
                  this.field_w.field_T.field_e[this.field_D] = this.field_w.field_T.field_e[this.field_D] + 1;
                }
                if (var3_int != 10 ||
                  var5 != 0) {
                  if (var3_int == 7) {
                    this.b((byte) 111, 4);
                  }
                  if (var3_int != 7 ||
                    var5 != 0) {
                    if (var3_int == 6) {
                      this.b((byte) 120, 16);
                      this.field_w.field_T.field_e[this.field_D] = this.field_w.field_T.field_e[this.field_D] + 1;
                    }
                    if (var3_int != 6 ||
                      var5 != 0) {
                      if (9 != var3_int ||
                        28 == this.field_y) {
                        switch (var3_int) {
                          case 8:
                            this.b((byte) 126, 17);
                            this.field_w.field_T.field_e[this.field_D] = this.field_w.field_T.field_e[this.field_D] + 1;
                            if (var5 == 0) {
                              break L1;
                            }
                          default:
                            break L1;
                          case 29:
                            this.b((byte) 126, 12);
                            if (var5 == 0) {
                              break L1;
                            }
                          case 12:
                            this.b((byte) 113, 19);
                            this.field_w.field_T.field_e[this.field_D] = this.field_w.field_T.field_e[this.field_D] + 1;
                            if (var5 == 0) {
                              break L1;
                            }
                          case 13:
                            this.b((byte) 116, 7);
                            if (var5 == 0) {
                              break L1;
                            }
                            break;
                        }
                      }
                      this.b((byte) 127, 5);
                      if (var5 != 0) {
                        this.b((byte) 110, 6);
                      }
                    }}}} else {
                this.b((byte) 110, 6);
              }
            }
            if (!this.field_w.a(this.field_J, (byte) 120, this.field_x) &&
              29 != var3_int) {
              this.field_w.field_a[this.field_x][this.field_J].field_m = false;
            }
            if (!this.field_w.a(this.field_J, (byte) 117, this.field_x)) {
              this.field_w.field_a[this.field_x][this.field_J].field_j = 5;
              if (var5 != 0) {
                this.field_w.field_a[this.field_x][this.field_J].field_j = -1;
              }
            } else {
              this.field_w.field_a[this.field_x][this.field_J].field_j = -1;
            }
            this.d(-127);
          }
          if (21 == var3_int) {
            this.j(-114);
            this.field_A = false;
          }
          if ((21 != var3_int ||
            var5 != 0) &&
            var3_int == 38) {
            if (0 == param0.field_j) {
              this.h(-23, 30);
              if (var5 != 0) {
                this.g(-67, 75);
              }
            } else {
              this.g(-67, 75);
            }
            this.field_w.b((byte) 47, 0, this.field_x, this.field_J);
          }
          if (param1 >= -20) {
            this.field_v = -90;
          }
          if (this.field_w.field_o == 3) {
            var4 = this.field_w.a(1845, this.field_J, this.field_x);
            if (-1 != var4) {
              boolean decompiledSharedTail0 = (~this.field_D != ~var4);
              if (!decompiledSharedTail0) {
                this.field_w.a(this.field_D, (byte) 46);
                this.field_w.field_a[this.field_x][this.field_J].field_m = false;
                decompiledSharedTail0 = (var5 != 0);
              }
              if ((decompiledSharedTail0) &&
                (!this.g((byte) 85))) {
                this.b((byte) 111, var4 + 24);
                this.field_w.field_a[this.field_x][this.field_J].field_m = false;
                this.field_w.field_T.field_G[var4] = true;
              }
            }
          }
          if (this.field_w.field_o == 3 &&
            this.g((byte) 85)) {
            var4 = this.field_w.b((byte) 65, this);
            this.field_w.field_c[var4] = new int[]{this.field_x, this.field_J};
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_125_0 = var3;
          stackIn_125_1 = new StringBuilder().append("aga.D(");
          if (param0 == null) {
            stackIn_126_2 = "null";
          } else {
            stackIn_126_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_125_0), ((StringBuilder) (Object) stackIn_125_1).append(stackIn_126_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        oha var4 = null;
        int var5 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 <= 110) {
            this.a((byte) -104, (lu) null);
          }
          var2_int = 0;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3 < this.field_m.length)))) {
            stackIn_15_0 = ~this.field_m[var3];
            if (var5 == 0) {
              if (stackIn_15_0 != 0) {
                var4 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var3]]];
                if (3 != var4.field_j) {
                  var2_int++;
                }
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = var2_int;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.W(" + param0 + ')');
        }
    }

    final void a(wia param0, lc param1, eaa param2, byte param3) {
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_127_2 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_131_2 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        rv var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        oha var8 = null;
        int var9 = 0;
        int var7_intLifetime1;
        int var7_intLifetime2;
        var9 = BachelorFridge.field_y;
        try {
          var5_int = param0.field_n;
          var6 = new rv();
          if (this.field_y != 0 &&
            35 != this.field_y &&
            this.field_y != 31 &&
            0 >= this.field_C &&
            !this.g((byte) 85) &&
            this.field_H <= 0) {
            var6.a(true, new ks(new nq(this)));
            this.field_y = 0;
            this.d(114);
          }
          if (this.field_y == 42 &&
            this.field_G) {
            var6.a(true, new ks(new nq(this)));
            this.field_y = 0;
            this.d(param3 ^ -15);
          }
          if (param3 != 121) {
            return;
          }
          var7_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_K.length <= var7_int))) {
            stackIn_46_0 = 0;
            stackIn_46_1 = ~this.field_m[var7_int];
            if (var9 == 0) {
              if (stackIn_46_0 != stackIn_46_1) {
                var8 = ur.field_e[this.field_o.field_g.field_b[this.field_m[var7_int]]];
                if (this.field_K[var7_int] == var8.field_g &&
                  var8.field_g != 0) {
                  this.j(var7_int, 0);
                  var6.a(true, new kt(new nq(this.field_D, this.field_u), var7_int));
                }
              }
              var7_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_46_0 = 1;
            stackIn_46_1 = this.field_y;
          }
          if (stackIn_46_0 == stackIn_46_1) {
            var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, 5));
          }
          if (this.field_y == 12) {
            var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, 20));
          }
          if (this.field_y == 14) {
            var7_intLifetime1 = -this.field_I + this.field_t;
            if (var7_intLifetime1 > 5) {
              var7_intLifetime1 = 5;
            }
            if (var7_intLifetime1 > 0) {
              var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, -var7_intLifetime1));
            }
          }
          if (44 == this.field_y) {
            var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, -20));
          }
          if (this.field_y == 53) {
            var6.a(true, new qq(new nq(this.field_D, this.field_u), -1, 10));
          }
          if (this.field_y != 32) {
            if (var5_int == 29) {
              var6.a(true, new lia(new nq(this.field_D, this.field_u), 0, 12));
            }
            if (var5_int == 14) {
              var7_intLifetime2 = -this.field_I + this.field_t;
              if (var7_intLifetime2 > 5) {
                var7_intLifetime2 = 5;
              }
              if (var7_intLifetime2 > 0) {
                var6.a(true, new lia(new nq(this.field_D, this.field_u), -var7_intLifetime2, -1));
              }
            }
            if (21 == var5_int) {
              var6.a(true, new lia(new nq(this.field_D, this.field_u), this.field_I, -1));
            }
            if (15 == var5_int) {
              var6.a(true, new lia(new nq(this.field_D, this.field_u), 5, -1));
            }
            if (var5_int == 16) {
              var6.a(true, new lia(new nq(this.field_D, this.field_u), 0, kla.a(14, this.field_p, param3 + 2147483527) + 1));
            }
          }
          var7 = this.e(36, 73);
          if (null != var7) {
            var6.a(true, new lia(new nq(this.field_D, this.field_u), -30, -1));
          }
          if (var5_int == 36) {
            var6.a(true, new lia(new nq(this.field_D, this.field_u), -30, -1));
          }
          if (this.field_w.field_R && (this.field_x == 0 ||
            0 == this.field_J ||
            ~(this.field_w.field_z - 1) == ~this.field_x ||
            this.field_w.field_B - 1 == this.field_J)) {
            param1.a(new ns(new nq(this)), (byte) 75);
            this.field_w.field_R = false;
          }
          if (var6.field_m.g(0) > 0) {
            param2.a(var6, true);
          }
          var6.a(this.field_w, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_126_0 = var5;
          stackIn_126_1 = new StringBuilder().append("aga.CA(");
          if (param0 == null) {
            stackIn_127_2 = "null";
          } else {
            stackIn_127_2 = "{...}";
          }
          stackIn_130_1 = ((StringBuilder) (Object) stackIn_126_1).append(stackIn_127_2).append(',');
          if (param1 == null) {
            stackIn_131_2 = "null";
          } else {
            stackIn_131_2 = "{...}";
          }
          stackIn_134_1 = ((StringBuilder) (Object) stackIn_130_1).append(stackIn_131_2).append(',');
          if (param2 == null) {
            stackIn_135_2 = "null";
          } else {
            stackIn_135_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_126_0), ((StringBuilder) (Object) stackIn_134_1).append(stackIn_135_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, aga param1, byte param2) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != 2) {
            return false;
          }
          if (null != param1 &&
            ~param1.field_D != ~this.field_D &&
            0 <= param0) {
            this.field_w.field_T.field_f[param1.field_D] = this.field_w.field_T.field_f[param1.field_D] + param0;
            this.field_w.field_T.field_n[param1.field_D] = this.field_w.field_T.field_n[param1.field_D] + param0;
            this.field_w.field_T.field_b[this.field_D] = this.field_w.field_T.field_b[this.field_D] + param0;
            this.field_w.field_T.field_g[this.field_D] = this.field_w.field_T.field_g[this.field_D] + 1;
            this.field_w.field_T.field_y[param1.field_D] = this.field_w.field_T.field_y[param1.field_D] + 1;
            this.field_w.field_T.field_E[param1.field_D] = this.field_w.field_T.field_E[param1.field_D] + 1;
          }
          if (param1 != null &&
            0 > param0) {
            this.field_w.field_T.field_F[param1.field_D] = this.field_w.field_T.field_F[param1.field_D] - param0;
            if (~param1.field_D != ~this.field_D) {
              this.field_w.field_T.field_j[this.field_D] = true;
            }
          }
          if (!this.g(param2 + 72, param0)) {
            return false;
          }
          if (param1 != null) {
            this.field_w.field_T.field_w[param1.field_D] = this.field_w.field_T.field_w[param1.field_D] + 1;
            if (20 == param1.field_o.field_b &&
              this.field_o.field_b == 3) {
              this.field_w.field_T.field_x[param1.field_D] = true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("aga.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(')').toString());
        }
    }

    final void f(int param0) {
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          this.field_w.field_a[this.field_x][this.field_J].field_l = this;
          if (this.a(param0, (byte) 126)) {
            return;
          }
          this.a(this.field_w.field_a[this.field_x][this.field_J], -83);
          var2 = this.field_w.field_i;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2.length <= var3))) {
            var4 = var2[var3];
            stackIn_21_0 = ~this.field_x;
            stackIn_21_1 = ~var4[0];
            if (var5 == 0) {
              if (stackIn_21_0 == stackIn_21_1 &&
                this.field_J == var4[1]) {
                if (~var4[2] != ~this.field_D) {
                  this.field_w.field_T.field_A[this.field_D] = this.field_w.field_T.field_A[this.field_D] + 1;
                }
                var4[2] = this.field_D;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_21_0 = -4;
            stackIn_21_1 = ~this.field_w.field_o;
          }
          if (stackIn_21_0 == stackIn_21_1) {
            this.e(77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "aga.FA(" + param0 + ')');
        }
    }

    final boolean a(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -40 % ((-5 - param1) / 58);
          stackIn_4_0 = (~this.field_y == ~param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.NA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean g(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 85) {
            this.c((byte) -17, 73);
          }
          if (this.field_y >= 24 &&
            27 >= this.field_y) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.PA(" + param0 + ')');
        }
    }

    final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k[1] <= 0) {
            stackIn_2_0 = 2;
            return stackIn_2_0;
          }
          if (param0 > 117) {
            stackIn_7_0 = this.field_k[1] + 2;
            return stackIn_7_0;
          }
          stackIn_5_0 = 35;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.MA(" + param0 + ')');
        }
    }

    final static void a(Random param0, boolean param1, eaa param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        rea var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          var4 = (rea) (param2.b((byte) 90));
          if (!param1) {
            return;
          }
          while (var4 != null) {
            if (var5 != 0) {
              return;
            }
            fieldTemp$0 = var4.field_n + var4.field_h;
            var4.field_n = var4.field_n + var4.field_h;
            if (0 > fieldTemp$0) {
              var4.a(false);
            } else {
              var4.field_l = var4.field_l + var4.field_o;
              kla.a(50, param0, -2147483648);
            }
            var4 = (rea) (param2.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("aga.EA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean k(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        int var5 = 0;
        try {
          if (28 == this.field_y &&
            5 == param1) {
            return false;
          }
          if (this.field_y == 31) {
            return false;
          }
          if (this.g((byte) 85)) {
            return false;
          }
          if (param1 == 42) {
            this.field_G = false;
          }
          if (param0 != -2049) {
            return false;
          }
          this.field_y = param1;
          this.field_C = 1 + is.field_b[this.field_y];
          if (16 == param1) {
            var3_double = 100.0 * ((double)this.field_I / it.field_c[this.field_k[0]]);
            var5 = this.field_k[0] + 1;
            if (var5 > 5) {
              var5 = 5;
            }
            this.field_I = (int)(var3_double * it.field_c[var5] / 100.0);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final int[] e(int param0, int param1) {
        int[] stackIn_11_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_25_0 = null;
        int[] stackIn_27_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (0 < this.field_x &&
            ~param0 == ~this.field_w.field_a[-1 + this.field_x][this.field_J].field_n) {
            stackIn_27_0 = new int[]{this.field_x - 1, this.field_J};
            return stackIn_27_0;
          }
          if (this.field_x < -1 + this.field_w.field_z &&
            param0 == this.field_w.field_a[1 + this.field_x][this.field_J].field_n) {
            stackIn_11_0 = new int[]{1 + this.field_x, this.field_J};
            return stackIn_11_0;
          }
          if (this.field_J > 0 &&
            this.field_w.field_a[this.field_x][-1 + this.field_J].field_n == param0) {
            stackIn_17_0 = new int[]{this.field_x, this.field_J - 1};
            return stackIn_17_0;
          }
          if (-1 + this.field_w.field_B > this.field_J &&
            ~this.field_w.field_a[this.field_x][this.field_J + 1].field_n == ~param0) {
            stackIn_25_0 = new int[]{this.field_x, this.field_J + 1};
            return stackIn_25_0;
          }
          if (param1 < 69) {
            this.field_K = (int[]) null;
          }
          stackIn_32_0 = null;
          return (int[]) (stackIn_32_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.G(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return false;
          }
          if (this.field_w.field_o == 3 &&
            ~this.field_D == ~this.field_w.b(false, param0)) {
            return false;
          }
          if (32 == this.field_y) {
            return true;
          }
          stackIn_15_0 = ju.c(23745, param0);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.C(" + param0 + ',' + param1 + ')');
        }
    }

    aga(rk param0, op param1, int param2, int param3) {
        super(param0);
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        this.field_A = true;
        try {
          this.field_w = param1;
          this.field_D = param2;
          this.field_F = 0;
          this.field_u = param3;
          this.field_t = (int)it.field_c[this.field_k[0]];
          this.field_I = this.field_t;
          this.field_s = 4;
          this.field_K = new int[this.field_m.length];
          var5_int = 0;
          while (var5_int < this.field_K.length) {
            if (var6 != 0) {
              return;
            }
            if (this.field_m[var5_int] != -1) {
              this.field_K[var5_int] = 0;
            }
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("aga.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final aga b(boolean param0) {
        aga var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        aga stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          var2 = new aga((rk) (this), this.field_w, this.field_D, this.field_u);
          var3 = 0;
          do {
            if (var3 >= 4) {
              this.field_t = this.field_t >> 1;
              var2.field_t = var2.field_t - this.field_t;
              this.field_I = this.field_I >> 1;
              var2.field_x = this.field_x;
              break;
            }
            this.field_k[var3] = this.field_k[var3] >> 1;
            var2.field_k[var3] = var2.field_k[var3] - this.field_k[var3];
            var3++;
          } while (var4 == 0);
          if (!param0) {
            this.b((byte) -95, 67);
          }
          var2.field_J = this.field_J;
          this.field_F = 5 + this.field_u + 17 * this.field_D;
          var2.field_F = 5 + this.field_u + 17 * this.field_D;
          var2.field_I = this.field_I;
          stackIn_12_0 = var2;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "aga.KA(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.field_w.b((byte) 122, this);
          if (this.g((byte) 85)) {
            this.field_y = 0;
          }
          this.field_w.field_c[var2_int] = new int[]{this.field_x, this.field_J};
          if (this.field_w.field_a[this.field_x][this.field_J].field_n == 21) {
            this.field_w.a(var2_int, (byte) 115);
          }
          if (!param0) {
            this.field_H = 56;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "aga.J(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (!param2) {
            this.field_y = 87;
          }
          this.field_w.field_T.field_i[this.field_D] = this.field_w.field_T.field_i[this.field_D] + 1;
          this.field_x = param1;
          this.field_J = param0;
          this.f(32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "aga.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = 79 / ((param1 + 47) / 57);
          var4 = 0;
          while (this.field_m.length > var4) {
            if (this.field_m[var4] != -1 &&
              ~param0 == ~this.field_o.field_g.field_b[this.field_m[var4]]) {
              stackIn_8_0 = var4;
              return stackIn_8_0;
            }
            var4++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          var4_int = this.field_x;
          var5 = this.field_J;
          if (param2 == 2) {
            var4_int = var4_int - param1;
          }
          if (param2 != 2 ||
            var7 != 0) {
            if (param2 == 4) {
              var4_int = var4_int + param1;
            }
            if (param2 != 4 ||
              var7 != 0) {
              if (param2 != 1) {
                if (param2 == 3) {
                  var5 = var5 + param1;
                  if (var7 != 0) {
                    var5 = var5 - param1;
                  }
                }
              } else {
                var5 = var5 - param1;
              }
            }}
          if (param0) {
            this.field_H = 110;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_y == 43) {
            var6 = 0;
            while (param1 > var6) {
              stackIn_47_0 = param2;
              stackIn_47_1 = 2;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_47_0 == stackIn_47_1) {
                this.field_w.b((byte) -49, 29, -var6 + this.field_x, this.field_J);
              } else if (param2 != 4) {
                if (param2 != 1) {
                  if (param2 == 3) {
                    this.field_w.b((byte) -54, 29, this.field_x, var6 + this.field_J);
                  }
                } else {
                  this.field_w.b((byte) -80, 29, this.field_x, -var6 + this.field_J);
                }
              } else {
                this.field_w.b((byte) 50, 29, this.field_x + var6, this.field_J);
              }
              var6++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_47_0 = -41;
            stackIn_47_1 = ~this.field_y;
          }
          if (stackIn_47_0 == stackIn_47_1) {
            this.field_y = 0;
          }
          this.a(var4_int, var5, (byte) 17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "aga.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(boolean param0, int param1) {
        oha var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          var3 = ur.field_e[param1];
          var4 = this.b(param1, (byte) 30);
          stackIn_7_0 = (~(var3.field_g + 2) == ~this.field_K[var4]);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3_ref), "aga.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, lu param1) {
        lu stackIn_14_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        try {
          super.a((byte) -74, param1);
          param1.b(this.field_I, -126);
          param1.b(this.field_t, -119);
          param1.d(this.field_D, 0);
          param1.d(this.field_u, 0);
          param1.d(this.field_F, 0);
          param1.d(this.field_x, 0);
          param1.d(this.field_J, 0);
          param1.d(this.field_s, 0);
          param1.d(this.field_y, 0);
          param1.d(this.field_C, 0);
          param1.d(this.field_E, 0);
          if (param0 >= -21) {
            this.field_A = true;
          }
          var3_int = 0;
          do {
            if (5 <= var3_int) {
              param1.d(this.field_H, 0);
              break;
            }
            param1.d(this.field_K[var3_int], 0);
            var3_int++;
          } while (var4 == 0);
          stackIn_14_0 = (lu) (param1);
          if (!this.field_A) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          ((lu) (Object) stackIn_14_0).d(stackIn_15_1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("aga.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void d(int param0) {
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = BachelorFridge.field_y;
        try {
          bl.a(this.field_o.field_l, 0, this.field_k, 0, this.field_k.length);
          if (this.a(84, 0, this.field_m)) {
            this.field_k[0] = this.field_k[0] + 1;
          }
          if (this.a(85, 0, this.field_m)) {
            this.field_k[1] = this.field_k[1] + 1;
          }
          if (this.a(86, 0, this.field_m)) {
            this.field_k[2] = this.field_k[2] + 1;
          }
          if (this.a(87, 0, this.field_m)) {
            this.field_k[3] = this.field_k[3] + 1;
          }
          if (this.field_y == 7) {
            this.field_k[3] = this.field_k[3] - 1;
          }
          if (6 == this.field_y) {
            this.field_k[2] = this.field_k[2] - 1;
          }
          if (this.field_y == 5) {
            this.field_k[1] = this.field_k[1] - 1;
          }
          if (this.field_y == 4) {
            this.field_k[0] = this.field_k[0] - 1;
          }
          if (this.field_y == 18) {
            this.field_k[2] = this.field_k[2] + 1;
          }
          if (16 == this.field_y) {
            this.field_k[0] = this.field_k[0] + 1;
          }
          if (this.field_y == 17) {
            this.field_k[1] = this.field_k[1] + 1;
          }
          if (this.field_y == 19) {
            this.field_k[3] = this.field_k[3] + 1;
          }
          if (this.field_y == 28) {
            this.field_k[1] = 5;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_y == 35) {
            var2_int = 0;
            while (!(var2_int >= this.field_k.length)) {
              this.field_k[var2_int] = 0;
              var2_int++;
              if (var3 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var2_int = 0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (4 <= var2_int))) {
            stackIn_69_0 = ~this.field_k[var2_int];
            stackIn_69_1 = -1;
            if (var3 == 0) {
              if (stackIn_69_0 > stackIn_69_1) {
                this.field_k[var2_int] = 0;
              }
              if (this.field_k[var2_int] > 5) {
                this.field_k[var2_int] = 5;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.h(-2);
            stackIn_69_0 = 75;
            stackIn_69_1 = (param0 + 49) / 38;
          }
          var2_intLifetime1 = stackIn_69_0 % stackIn_69_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.B(" + param0 + ')');
        }
    }

    final boolean i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 33 / ((param0 + 7) / 62);
          stackIn_4_0 = !(this.field_I > 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.S(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_w.field_a[this.field_x][this.field_J].field_l = null;
          if (param2 != 17) {
            this.field_K = (int[]) null;
          }
          this.field_w.field_T.field_i[this.field_D] = this.field_w.field_T.field_i[this.field_D] + (Math.abs(-param0 + this.field_x) + Math.abs(this.field_J - param1));
          this.field_x = param0;
          this.field_J = param1;
          this.f(32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "aga.IA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 < 109) {
            return;
          }
          var3_int = this.field_y;
          if (!this.k(-2049, param1)) {
            return;
          }
          if (var3_int == 32 &&
            32 != this.field_y) {
            this.f(32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "aga.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final int g(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          var2_int = this.field_o.field_b * 74741;
          var2_int = var2_int ^ 37 * (5753 * this.field_x + this.field_J);
          var2_int = var2_int << 5 | var2_int >>> 27;
          var2_int = var2_int ^ this.field_I * 912487 + 57123 * this.field_t;
          var2_int = var2_int << 15 | var2_int >>> 17;
          var2_int = var2_int ^ this.field_D * 8676 + 78767 * this.field_u;
          if (param0 < 86) {
            this.field_v = 3;
          }
          if (this.i(-100)) {
            stackIn_6_0 = var2_int;
            return stackIn_6_0;
          }
          var2_int = var2_int << 1 | var2_int >>> 31;
          if (this.field_F != 0) {
            var2_int = var2_int ^ this.field_F * 7;
            var2_int = var2_int >>> 20 | var2_int << 12;
          }
          if (this.field_y != 0) {
            var2_int = var2_int ^ (this.field_C + 575 * this.field_y) * 91911;
            var2_int = var2_int << 24 | var2_int >>> 8;
          }
          if (this.field_y == 37) {
            var2_int = var2_int ^ 74821 * this.field_E;
          }
          if (0 != this.field_H) {
            var2_int = var2_int ^ 54857 * this.field_H;
            var2_int = var2_int << 19 | var2_int >>> 13;
          }
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= 5))) {
            var4 = this.field_m[var3];
            stackIn_31_0 = var4;
            if (var5 == 0) {
              if (stackIn_31_0 != -1) {
                var2_int = var2_int ^ 753 * (var4 + var3 * 1921);
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_31_0 = var2_int;
          }
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aga.P(" + param0 + ')');
        }
    }

    static {
    }
}
