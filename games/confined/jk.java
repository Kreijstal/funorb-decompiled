/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static od[] field_c;
    private ag field_d;
    private mi field_a;
    private mi field_b;

    final static void a(int param0, boolean param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          try {
            kf.a((byte) 53, "resizing", ii.b(param1), new Object[]{new Integer(param0)});
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var7 = Confined.field_J ? 1 : 0;
        var2 = -5 / ((-36 - param1) / 52);
        var3 = 0;
        var4 = tg.field_H;
        if (var4 < 5) {
          var3 = var4 * var4 * 8192 / 1100;
          var5 = 1;
          var6 = 0;
          if (param0 == 1) {
            var6 = 1;
          }
          if (param0 == 3) {
            var5 = -1;
          }
          if (param0 == 4) {
            var5 = 1;
            var6 = 1;
          }
          if (param0 == 5) {
            var5 = -1;
            var6 = 1;
          }
          if (6 == param0) {
            var5 = 1;
            var6 = -1;
          }
          if (7 == param0) {
            var5 = -1;
            var6 = -1;
          } else {
            if (8 == param0) {
              var5 = -1;
              var6 = -1;
            }
          }
          if (11 == param0) {
            var5 = -1;
          }
          if (12 == param0) {
            var6 = -1;
            var5 = -1;
          }
          if (param0 == 13) {
            var6 = -1;
            var5 = 1;
          }
          if (param0 == 14) {
            var6 = 1;
            var5 = -1;
          }
          if (15 == param0) {
            var5 = 1;
            var6 = 1;
          }
          gd.field_m = fj.a(var3 * var5, (byte) 122, var3 * var6);
          return;
        }
        if (var4 < 105) {
          var3 = (-40960 + var4 * 16384) / 220;
          var5Lifetime1 = 1;
          var6Lifetime1 = 0;
          if (param0 == 1) {
            var6Lifetime1 = 1;
          }
          if (param0 == 3) {
            var5Lifetime1 = -1;
          }
          if (param0 == 4) {
            var5Lifetime1 = 1;
            var6Lifetime1 = 1;
          }
          if (param0 == 5) {
            var5Lifetime1 = -1;
            var6Lifetime1 = 1;
          }
          if (6 == param0) {
            var5Lifetime1 = 1;
            var6Lifetime1 = -1;
          }
          if (7 == param0) {
            var5Lifetime1 = -1;
            var6Lifetime1 = -1;
          } else {
            if (8 == param0) {
              var5Lifetime1 = -1;
              var6Lifetime1 = -1;
            }
          }
          if (11 == param0) {
            var5Lifetime1 = -1;
          }
          if (12 == param0) {
            var6Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          if (param0 == 13) {
            var6Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param0 == 14) {
            var6Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (15 == param0) {
            var5Lifetime1 = 1;
            var6Lifetime1 = 1;
          }
          gd.field_m = fj.a(var3 * var5Lifetime1, (byte) 122, var3 * var6Lifetime1);
          return;
        }
        if (var4 >= 120) {
          var5Lifetime2 = 1;
          var6Lifetime2 = 0;
          if (param0 == 1) {
            var6Lifetime2 = 1;
          }
          if (param0 == 3) {
            var5Lifetime2 = -1;
          }
          if (param0 == 4) {
            var5Lifetime2 = 1;
            var6Lifetime2 = 1;
          }
          if (param0 == 5) {
            var5Lifetime2 = -1;
            var6Lifetime2 = 1;
          }
          if (6 == param0) {
            var5Lifetime2 = 1;
            var6Lifetime2 = -1;
          }
          if (7 == param0) {
            var5Lifetime2 = -1;
            var6Lifetime2 = -1;
          } else {
            if (8 == param0) {
              var5Lifetime2 = -1;
              var6Lifetime2 = -1;
            }
          }
          if (11 == param0) {
            var5Lifetime2 = -1;
          }
          if (12 == param0) {
            var6Lifetime2 = -1;
            var5Lifetime2 = -1;
          }
          if (param0 == 13) {
            var6Lifetime2 = -1;
            var5Lifetime2 = 1;
          }
          if (param0 == 14) {
            var6Lifetime2 = 1;
            var5Lifetime2 = -1;
          }
          if (15 == param0) {
            var5Lifetime2 = 1;
            var6Lifetime2 = 1;
          }
          gd.field_m = fj.a(var3 * var5Lifetime2, (byte) 122, var3 * var6Lifetime2);
          return;
        }
        var4 = -var4 + 120;
        var3Lifetime1 = -(8192 * (var4 * var4) / 3300) + 8192;
        var5Lifetime3 = 1;
        var6Lifetime3 = 0;
        if (param0 == 1) {
          var6Lifetime3 = 1;
        }
        if (param0 == 3) {
          var5Lifetime3 = -1;
        }
        if (param0 == 4) {
          var5Lifetime3 = 1;
          var6Lifetime3 = 1;
        }
        if (param0 == 5) {
          var5Lifetime3 = -1;
          var6Lifetime3 = 1;
        }
        if (6 == param0) {
          var5Lifetime3 = 1;
          var6Lifetime3 = -1;
        }
        if (7 == param0) {
          var5Lifetime3 = -1;
          var6Lifetime3 = -1;
        } else {
          if (8 == param0) {
            var5Lifetime3 = -1;
            var6Lifetime3 = -1;
          }
        }
        if (11 == param0) {
          var5Lifetime3 = -1;
        }
        if (12 == param0) {
          var6Lifetime3 = -1;
          var5Lifetime3 = -1;
        }
        if (param0 == 13) {
          var6Lifetime3 = -1;
          var5Lifetime3 = 1;
        }
        if (param0 == 14) {
          var6Lifetime3 = 1;
          var5Lifetime3 = -1;
        }
        if (15 == param0) {
          var5Lifetime3 = 1;
          var6Lifetime3 = 1;
        }
        gd.field_m = fj.a(var3Lifetime1 * var5Lifetime3, (byte) 122, var3Lifetime1 * var6Lifetime3);
        return;
    }

    final lb b(int param0, int param1) {
        byte[] var4 = null;
        lb var3 = (lb) (this.field_d.a(param0 ^ param0, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param1 < 32768) {
          var4 = this.field_a.a((byte) -2, 1, param1);
        } else {
          var4 = this.field_b.a((byte) -2, 1, 32767 & param1);
        }
        var3 = new lb();
        if (var4 != null) {
          var3.a(-119, new kg(var4));
        }
        if (param1 >= 32768) {
          var3.f(0);
        }
        this.field_d.a((byte) -2, (long)param1, var3);
        return var3;
    }

    final static void a(byte param0) {
        bg.field_d = tl.a(4314);
        vg.field_Z = new sh();
        if (param0 <= -29) {
          wl.a(-106, true, true);
          return;
        }
        jk.a(54);
        wl.a(-106, true, true);
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var4 = -29 / ((param0 - 87) / 36);
        if ((param1 & 7) != 0) {
          var2 = 8 - (7 & param1);
        }
        int var3 = param1 + var2;
        return var3;
    }

    final static nf b(int param0) {
        int var4_int = 0;
        nf var4 = null;
        int var5 = Confined.field_J ? 1 : 0;
        int var1 = sd.field_f[0] * rg.field_I[0];
        byte[] var2 = rj.field_f[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = an.field_p[va.a(255, (int) var2[var4_int])];
        }
        if (param0 == 255) {
          var4 = new nf(kb.field_a, em.field_e, jl.field_p[0], ij.field_r[0], rg.field_I[0], sd.field_f[0], var3);
          ql.a(false);
          return var4;
        }
        return (nf) null;
    }

    public static void a(int param0) {
        if (param0 >= -72) {
          return;
        }
        field_c = null;
    }

    private jk() throws Throwable {
        throw new Error();
    }

    static {
        field_c = new od[13];
    }
}
