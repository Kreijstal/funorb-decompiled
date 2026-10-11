/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends ae {
    um field_B;
    static bd field_x;
    static bd field_C;
    static int field_A;
    byte[] field_y;
    int field_E;
    static rj field_D;
    static bd field_z;

    final int d(int param0) {
        if (param0 >= -72) {
          rh.a(-71, false);
        }
        if (this.field_v) {
          return 0;
        }
        return 100;
    }

    public static void e(int param0) {
        field_C = null;
        field_x = null;
        field_D = null;
        if (param0 != 6) {
          field_z = (bd) null;
        }
        field_z = null;
    }

    final static boolean a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (!param1) {
          field_z = (bd) null;
        }
        var2 = param0;
        if (var2 == 10) {
          return true;
        }
        if (var2 != 129 &&
          var2 != 131 &&
          var2 != 133) {
          return false;
        }
        return true;
    }

    final static void d(byte param0) {
        int var4 = 0;
        int stackIn_17_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_32_0 = null;
        int stackIn_37_0 = 0;
        boolean stackIn_38_1 = false;
        vh stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        vh var10 = null;
        int var11 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          var1_int = s.field_g;
          var2 = 0;
          if (2 == be.field_e) {
            var3_long = -fj.field_Rb + hn.a((byte) 80);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          var3 = -94 / ((-2 - param0) / 60);
          for (var4 = 0; var4 < hf.field_d.length; var4++) {
            var5 = jf.field_b[var4];
            if (0 > var5) {
              var6 = ce.field_c;
            } else {
              if (mc.field_F.field_f != var5) {
                var6 = nf.field_m;
              } else {
                var6 = hh.field_e;
              }
            }
            var7 = hf.field_d[var4];
            if (2 == be.field_e &&
              var2 == 1) {
              if (gg.field_D.length <= ka.field_o.length) {
                stackIn_17_0 = ka.field_o.length;
              } else {
                stackIn_17_0 = gg.field_D.length;
              }
              var8 = stackIn_17_0;
              if (var4 >= 6 &&
                6 + var8 > var4) {
                if (0 <= -var8 + (var4 - 6 + ka.field_o.length)) {
                  stackIn_23_0 = ka.field_o[ka.field_o.length + (var4 - (6 + var8))];
                } else {
                  stackIn_23_0 = "";
                }
                var7 = stackIn_23_0;
              }
              if (uh.field_j.length > p.field_k.length) {
                stackIn_27_0 = uh.field_j.length;
              } else {
                stackIn_27_0 = p.field_k.length;
              }
              var9 = stackIn_27_0;
              if (var4 >= 7 + var8 &&
                var4 < var9 + var8 + 7) {
                if (var4 - (7 + var8) >= p.field_k.length) {
                  stackIn_32_0 = "";
                } else {
                  stackIn_32_0 = p.field_k[-7 + (var4 - var8)];
                }
                var7 = stackIn_32_0;
              }
            }
            if (var5 == -2) {
              var7 = Integer.toString(var2);
            }
            stackIn_37_0 = 91;
            stackIn_38_1 = !(var5 < 0);
            var8Lifetime1 = wb.a(stackIn_37_0, stackIn_38_1, var7);
            var9Lifetime1 = wk.field_c - (var8Lifetime1 >> 1);
            if (var5 >= 0) {
              var1_int = var1_int + cl.field_l;
              if (mc.field_F.field_f == var5) {
                stackIn_43_0 = al.field_N;
              } else {
                stackIn_43_0 = tk.field_c;
              }
              var10 = stackIn_43_0;
              if (var10 != null) {
                var10.a((jd.field_l << 1) + var8Lifetime1, var1_int, eh.field_d + (ab.field_b << 1), -jd.field_l + var9Lifetime1, 5);
              }
              var1_int = var1_int + ab.field_b;
            }
            if (var5 < 0) {
              lj.field_u.c(var7, var9Lifetime1, ka.field_q + var1_int, var6, -1);
              var1_int = var1_int + kb.field_d;
            } else {
              na.field_c.c(var7, var9Lifetime1, sd.field_s + var1_int, var6, -1);
              var1_int = var1_int + (eh.field_d + ab.field_b + cl.field_l);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "rh.N(" + param0 + ')');
        }
    }

    rh() {
    }

    final byte[] c(byte param0) {
        if (this.field_v) {
          throw new RuntimeException();
        }
        if (param0 != 127) {
          return (byte[]) null;
        }
        return this.field_y;
    }

    static {
    }
}
