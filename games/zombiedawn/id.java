/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class id extends fb {
    boolean field_P;
    int field_F;
    private fn field_K;
    static int field_I;
    static int field_N;
    boolean field_J;
    private boolean field_G;
    static int field_D;
    int field_E;
    private boolean field_O;
    static String field_L;
    static int field_M;

    final boolean a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        if (!param0) {
          wk var5 = (wk) null;
          this.a((byte) -30, (wk) null);
        }
        for (var3 = 0; var3 < tl.field_g.length; var3++) {
          if (this.field_F == tl.field_g[var3]) {
            if (param1 &&
              !ka.field_h[var3]) {
              return false;
            }
            this.field_F = oo.field_U[var3];
            if (this.field_z > 0) {
              dj.field_e.field_u[this.field_z - 1] = dj.field_e.field_u[this.field_z - 1] - 1;
            }
            this.field_z = 0;
            return true;
          }
        }
        return false;
    }

    void a(byte param0, wk param1) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          if (param0 > -76) {
            this.b(true);
          }
          var3_int = param1.a(this.a(true), (byte) -118);
          var4 = param1.a(this.f(237239984), 0) - 24;
          if (this.field_O && (var3_int < -48 ||
            var4 < -48 ||
            !(var3_int <= qj.field_d) ||
            !(me.field_Bb >= var4 - 24))) {
            return;
          }
          if (!this.field_O && (var3_int < -48 ||
            var4 < -48 ||
            !(qj.field_d >= var3_int) ||
            !(var4 <= me.field_Bb))) {
            return;
          }
          if (tm.field_h.length < this.field_F) {
            return;
          }
          if (this.field_E <= 0) {
            if (!this.field_P) {
              if (!this.field_J) {
                tm.field_h[this.field_F].b(var3_int, var4);
              } else {
                tm.field_h[this.field_F].f(var3_int, var4);
              }
            } else {
              tm.field_h[this.field_F].c(var3_int, var4);
            }
            if (this.field_O) {
              if (!this.field_P) {
                if (!this.field_J) {
                  tm.field_h[-8 + this.field_F].b(var3_int, -24 + var4);
                } else {
                  tm.field_h[-8 + this.field_F].f(var3_int, var4 - 24);
                }
              } else {
                tm.field_h[this.field_F - 8].c(var3_int, -24 + var4);
              }
            }
          } else {
            if (ng.field_e &&
              this.field_E > 0) {
              bi.g(8 + var3_int, 1 + var4, 14, bb.field_e[-1 + this.field_E]);
            }
            if (!this.field_P) {
              tm.field_h[this.field_F].g(var3_int, var4, bb.field_e[this.field_E - 1]);
              if (this.field_O) {
                tm.field_h[-8 + this.field_F].g(var3_int, -24 + var4, bb.field_e[this.field_E - 1]);
              }
            } else {
              so.a(tm.field_h[this.field_F], var3_int, var4, bb.field_e[-1 + this.field_E]);
              if (this.field_O) {
                so.a(tm.field_h[this.field_F - 8], var3_int, var4 - 24, bb.field_e[this.field_E - 1]);
              }
            }
          }
          if (kc.field_Q) {
            pc.field_k.a(s.a(1938762664, "<%0>,<%1>", new String[]{Integer.toString(this.field_B), Integer.toString(this.field_u)}), 12 + var3_int, -5 + var4, 16777215, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("id.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    public static void i(int param0) {
        if (param0 >= -33) {
          id.i(45);
        }
        field_L = null;
    }

    private final void b(boolean param0) {
        le var2;
        int var3;
        int var4;
        int var5;
        ej var6;
        ej var7;
        var5 = ZombieDawn.field_J;
        if (0 == this.field_z) {
          return;
        }
        dj.field_e.field_u[-1 + this.field_z] = dj.field_e.field_u[-1 + this.field_z] - 1;
        if (0 >= dj.field_e.field_u[-1 + this.field_z]) {
          var2 = dj.field_e.field_R.field_b.field_b;
          while (var2 instanceof fb) {
            if (var2 instanceof ah &&
              this.field_z == ((fb) (var2)).field_z) {
              ((fb) (var2)).field_z = 0;
            }
            var2 = var2.field_b;
          }
        }
        this.field_E = this.field_z;
        this.field_z = 0;
        var6 = dj.field_e.field_H;
        var7 = var6;
        var3 = this.a(param0) / 24;
        var4 = this.f(237239984) / 24;
        if (this.f(237239984) % 24 == 0) {
          var4--;
        }
        var6.field_A.field_f[var4][var3] = eg.a(var6.field_A.field_f[var4][var3], -33554433);
        var7.field_A.a(param0, 14365, var4, false, var3);
        var6.field_A.field_t[var4 - 1][var3] = eg.a(var6.field_A.field_t[var4 - 1][var3], -33554433);
        if (this.field_O) {
          var6.field_A.field_f[-1 + var4][var3] = eg.a(var6.field_A.field_f[-1 + var4][var3], -33554433);
          var7.field_A.a(true, 14365, -1 + var4, false, var3);
          var6.field_A.field_t[var4 - 1][var3] = eg.a(var6.field_A.field_t[var4 - 1][var3], -33554433);
        }
        this.field_F = this.field_F + 1;
        return;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    id(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int[] var4;
        int var5;
        int var6;
        int[] var8;
        int[] var9;
        int[] var10;
        boolean stackIn_3_1 = false;
        boolean stackIn_6_1 = false;
        int var5Lifetime1;
        int var6Lifetime1;
        int[] var4Lifetime1;
        this.field_K = null;
        this.field_O = false;
        this.field_F = this.field_t;
        stackIn_3_1 = (0 != (1073741824 & this.field_t));
        this.field_P = stackIn_3_1;
        stackIn_6_1 = (0 != (this.field_t & 536870912));
        this.field_J = stackIn_6_1;
        this.field_F = this.field_F & -1610612737;
        this.field_F = this.field_F - 1;
        var10 = rc.field_u;
        var9 = var10;
        var8 = var9;
        var4 = var8;
        for (var5 = 0; var10.length > var5; var5++) {
          var6 = var10[var5];
          if (~this.field_F == ~var6) {
            this.field_O = true;
          }
        }
        var4Lifetime1 = ln.field_c;
        for (var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime1.length; var5Lifetime1++) {
          var6Lifetime1 = var4Lifetime1[var5Lifetime1];
          if (this.field_F == var6Lifetime1) {
            this.field_G = true;
          }
        }
    }

    void g(int param0) {
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int var2;
        fb var2_ref_fb;
        int var3;
        int var4_int;
        fb var4;
        int var5;
        int var6;
        va var7;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        var6 = ZombieDawn.field_J;
        if (param0 <= 95) {
          return;
        }
        if (dj.field_e.field_r < 400 &&
          dj.field_e.field_r > 200) {
          var2 = 0;
          while (!(var2 >= ka.field_h.length)) {
            if (this.field_F != tl.field_g[var2]) {
              var2++;
              continue;
            }
            if (dj.field_e.field_r >= 250 &&
              0 != pb.a(so.field_a, 25, 1)) {
              break;
            }
            if (!this.a(true, true)) {
              break;
            }
            var3 = this.a(true) / 24;
            var4_int = this.f(237239984) / 24;
            if (this.f(237239984) % 24 == 0) {
              var4_int--;
            }
            dj.field_e.field_H.field_A.field_f[var4_int][var3] = eg.a(dj.field_e.field_H.field_A.field_f[var4_int][var3], -33554433);
            dj.field_e.field_H.field_A.field_f[-1 + var4_int][var3] = eg.a(dj.field_e.field_H.field_A.field_f[-1 + var4_int][var3], -33554433);
            dj.field_e.field_H.field_A.a(true, 14365, var4_int, false, var3);
            dj.field_e.field_H.field_A.a(true, 14365, var4_int - 1, false, var3);
            if (pb.a(so.field_a, 2, 1) != 0) {
              break;
            }
            if (null != this.field_K) {
              pc.a((byte) 13, this.field_K);
            }
            this.field_K = kh.a(pb.a(so.field_a, 2, 1) + 64, false);
            break;
          }
        }
        if (this.field_z > 0) {
          this.field_E = this.field_z;
          var2_ref_fb = this.a((byte) -74, 50, 1);
          while (var2_ref_fb != null) {
            if (~var2_ref_fb.field_z == ~this.field_z &&
              this.a(var2_ref_fb, 1654152400) < 2500) {
              var3Lifetime1 = this.field_z;
              ck.a(-9, 6836);
              kh.a(93, false);
              kh.a(94, false);
              var4 = this.a((byte) -74, 48, 4);
              while (var4 != null) {
                if (var3Lifetime1 == var4.field_z) {
                  ((id) (var4)).b(true);
                }
                var4 = this.e((byte) 32);
              }
              dj.field_e.b(true);
              wh.a((byte) -81);
              break;
            }
            var2_ref_fb = this.e((byte) 32);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_G) {
          stackIn_36_0 = 12 + this.a(true);
          stackIn_36_1 = 24;
          var2Lifetime1 = stackIn_36_0 / stackIn_36_1;
          var3Lifetime2 = (this.f(237239984) - 1) / 24;
          if (0 <= var2Lifetime1 &&
            0 <= var3Lifetime2 &&
            var2Lifetime1 < dj.field_e.field_H.field_A.field_f[0].length &&
            var3Lifetime2 < dj.field_e.field_H.field_A.field_f.length) {
            var7 = ub.a(127, dj.field_e.field_H.field_A.field_f[var3Lifetime2][var2Lifetime1]);
            if ((var7 != null)) {
              if (var7.field_h >= 0) {
                if (var7.field_h <= 0) {
                  this.field_y = this.field_y + var7.field_h;
                } else {
                  var5 = (var7.field_h + this.field_y) % 1572864;
                  if (var5 >= var7.field_h) {
                    this.field_y = this.field_y + var7.field_h;
                  } else {
                    this.field_y = this.field_y + (-var5 + var7.field_h);
                  }
                }
              } else {
                var5 = this.field_y % 1572864;
                if (-var7.field_h > var5) {
                  this.field_y = this.field_y - (var5 + 1);
                } else {
                  this.field_y = this.field_y + var7.field_h;
                }
              }
              if (var7.field_i < 0) {
                var5Lifetime1 = this.field_x % 1572864;
                if (-var7.field_i <= var5Lifetime1) {
                  this.field_x = this.field_x + var7.field_i;
                } else {
                  this.field_x = -var5Lifetime1 + (this.field_x - 1);
                }
              } else {
                if (0 >= var7.field_i) {
                  this.field_x = this.field_x + var7.field_i;
                } else {
                  var5Lifetime2 = (var7.field_i + this.field_x) % 1572864;
                  if (var7.field_i <= var5Lifetime2) {
                    this.field_x = this.field_x + var7.field_i;
                  } else {
                    this.field_x = -var5Lifetime2 + var7.field_i + this.field_x;
                  }
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            return;
          }
        }

    }

    static {
        field_N = -1;
        field_L = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_M = 0;
    }
}
