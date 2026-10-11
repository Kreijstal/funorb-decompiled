/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends kf implements vn {
    static se field_Y;
    private ek field_V;
    private ek field_S;
    private ek field_X;
    static int field_W;
    static String field_T;
    static int field_U;

    public lg() {
        super(0, 0, 476, 225, (gl) null);
        this.field_X = new ek(i.field_f, (kg) null);
        this.field_S = new ek(ec.field_q, (kg) null);
        this.field_V = new ek(ic.field_b, (kg) null);
        fk var1 = new fk();
        this.field_X.field_p = (gl) ((Object) var1);
        this.field_S.field_p = (gl) ((Object) var1);
        this.field_V.field_p = (gl) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_S.b(30, var4, -var3 + this.field_t >> 1, -var2 + (this.field_y - 48), -16555);
        this.field_V.b(30, var4, var4 + ((-var3 + this.field_t >> 1) + var2), -48 + (this.field_y - var2), -16555);
        this.field_X.b(30, var3, this.field_t - var3 >> 1, -(2 * var2) - 78 + this.field_y, -16555);
        this.field_S.field_v = (kg) (this);
        this.field_X.field_v = (kg) (this);
        this.field_X.field_B = tm.field_h;
        this.field_V.field_v = (kg) (this);
        this.field_V.field_B = kh.field_c;
        this.b(this.field_S, (byte) -55);
        this.b(this.field_X, (byte) -55);
        this.b(this.field_V, (byte) -55);
    }

    public static void f(byte param0) {
        if (param0 != 1) {
          field_T = (String) null;
          field_T = null;
          field_Y = null;
          return;
        }
        field_T = null;
        field_Y = null;
    }

    final static int a(int param0, boolean param1) {
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        try {
          sc.field_n = sc.field_n + 65536;
          while (um.a(dk.field_c, sc.field_n, param0 + 11469) >= 65536) {
            sc.field_n = sc.field_n - dk.field_c;
            rb.field_b = rb.field_b + 1;
          }
          var2_int = -1;
          if (null != d.field_h) {
            var2_int = d.field_h.length;
          } else {
            if (vi.field_z != null) {
              var2_int = vi.field_z.length;
            }
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (ac.field_F < dk.field_g) {
              ac.field_F = ac.field_F + 1;
              if (dk.field_i < ac.field_F && (null == d.field_h ||
                d.field_h[wh.field_a] == null)) {
                ac.field_F = ac.field_F - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (ac.field_F >= dk.field_g &&
                  d.field_h[(1 + wh.field_a) % var2_int] == null) {
                  ac.field_F = ac.field_F - 1;
                }
              }
            }
            if (dk.field_g <= ac.field_F) {
              bh.field_m = wh.field_a;
              if (lb.field_b) {
                wh.field_a = wh.field_a + 1;
                if (wh.field_a >= var2_int) {
                  wh.field_a = wh.field_a - var2_int;
                }
              } else {
                wh.field_a = wh.field_a - 1;
                if (wh.field_a < 0) {
                  wh.field_a = wh.field_a + var2_int;
                }
              }
              ac.field_F = ac.field_F - dk.field_g;
            }
            if (dk.field_i < ac.field_F) {
              lb.field_b = true;
            }
          }
          if (ge.field_h != null) {
            var3 = -(ge.field_h.field_C / 2) + 357;
            var4 = 0;
            if (ig.field_Yb != 0 &&
              nf.field_h > var3 &&
              nf.field_h < ge.field_h.field_H + var3) {
              if (he.field_S > 269 - ge.field_h.field_I &&
                he.field_S < 269) {
                lb.field_b = false;
                var4 = 1;
                ac.field_F = dk.field_g;
              }
              if (he.field_S > 586 &&
                he.field_S < ge.field_h.field_I + 586) {
                lb.field_b = true;
                var4 = 1;
                ac.field_F = dk.field_g;
              }
            }
            if (var4 == 0 &&
              ac.field_F > dk.field_i &&
              var3 < pm.field_f &&
              pm.field_f < ge.field_h.field_H + var3) {
              if (269 - ge.field_h.field_I < bh.field_g &&
                bh.field_g < 269) {
                ac.field_F = dk.field_i;
              }
              if (bh.field_g > 586 &&
                bh.field_g < 586 + ge.field_h.field_I) {
                ac.field_F = dk.field_i;
              }
            }
          }
          if (param0 != 0) {
            stackIn_54_0 = 81;
            return stackIn_54_0;
          }
          if (param1) {
            rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
            if (rg.field_a.b((byte) 114)) {
              if (rg.field_a.field_h == 0) {
                stackIn_61_0 = 3;
                return stackIn_61_0;
              }
              if (rg.field_a.field_h == 1) {
                stackIn_65_0 = 2;
                return stackIn_65_0;
              }
            }
            stackIn_68_0 = -125;
            while (ab.$cfr$intArgs$c$a284cb190b53(stackIn_68_0)) {
              rg.field_a.a((byte) 58, 0);
              if (rg.field_a.b((byte) 114)) {
                if (rg.field_a.field_h == 0) {
                  stackIn_72_0 = 3;
                  return stackIn_72_0;
                }
                if (1 == rg.field_a.field_h) {
                  stackIn_75_0 = 1;
                  return stackIn_75_0;
                }
              }
              if (wh.field_c != 13) {
                stackIn_68_0 = -125;
                continue;
              }
              stackIn_78_0 = 1;
              return stackIn_78_0;
            }
          }
          stackIn_80_0 = 0;
          return stackIn_80_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "lg.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != 8927) {
          field_Y = (se) null;
          hm.a(4, (byte) -111);
          return;
        }
        hm.a(4, (byte) -111);
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -101) {
          return;
        }
        if (null != kb.field_i) {
          hk.d(hk.field_c, hk.field_h, hk.field_g - hk.field_c, hk.field_b - hk.field_h);
          kb.field_i.a(1141039778, param0);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1 < -103) {
          var5 = param0 + this.field_u;
          var6 = this.field_D + param3;
          hh.field_e.a(hh.field_c, var5 + 20, var6 + 20, this.field_t - 40, this.field_y - 50, 16777215, -1, 1, 0, hh.field_e.field_R);
          super.a(param0, -109, param2, param3);
          return;
        }
        field_W = 48;
        var5Lifetime1 = param0 + this.field_u;
        var6Lifetime1 = this.field_D + param3;
        hh.field_e.a(hh.field_c, var5Lifetime1 + 20, var6Lifetime1 + 20, this.field_t - 40, this.field_y - 50, 16777215, -1, 1, 0, hh.field_e.field_R);
        super.a(param0, -109, param2, param3);
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          if (this.field_S == param2) {
            vb.g((byte) 105);
          } else {
            if (param2 != this.field_X) {
              if (this.field_V == param2) {
                rk.c(false);
              }
            } else {
              ha.e(0);
            }
          }
          if (param0 == 67) {
            return;
          }
          field_T = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("lg.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(95, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.a(param2, (byte) -74);
            return stackIn_5_0;
          }
          if (param1 == 99) {
            stackIn_8_0 = this.a(32, param2);
            return stackIn_8_0;
          }
          var5_int = 86 / ((param0 + 22) / 49);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("lg.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_T = "Discard";
        field_U = -1;
    }
}
