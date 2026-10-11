/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mf {
    static cn[] field_b;
    static String[] field_c;
    static int[] field_d;
    static String field_a;

    final static void a(int param0, ec param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = DungeonAssault.field_K;
          try {
            var9 = new byte[24];
            var7 = var9;
            var6 = var7;
            var10 = var6;
            var8 = var10;
            var2 = var8;
            if (bk.field_b != null) {
              try {
                bk.field_b.a(0L, -26296);
                bk.field_b.a(param0 ^ -30463, var9);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var10[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (24 <= var3_int) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; 24 > var4; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            param1.a(var10, 1, 24, 0);
            if (param0 != -30463) {
              mf.a(114, 83, 37, -91, (byte) -11);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("mf.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cn a(int param0, int param1, int param2, int param3, byte param4) {
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = DungeonAssault.field_K;
        int var5 = param3 + param2 * 2;
        int var6 = param1 + 2 * param2;
        cn var7 = new cn(var5, var6);
        jh.a(var7);
        int var8 = 16711935 & param0;
        int var9 = param0 & 65280;
        int var11 = 72 / ((param4 - 11) / 53);
        for (var10 = 0; var10 < param2; var10++) {
          var12 = (var10 << 8) / (param2 - 1);
          var13 = var12 * var9 & 16711680 | var12 * var8 & -16711936;
          gf.a(var10, var10, -(2 * var10) + var5, var6 - 2 * var10, -var10 + param2, var13 >>> 8);
        }
        gf.b(param2, param2, param3, param1, 0);
        jh.b();
        var7.field_A = var7.field_A - param2;
        var7.field_w = var7.field_w - param2;
        return var7;
    }

    final static int b(int param0) {
        int stackIn_13_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        try {
          var1_int = 0;
          var2 = 0;
          while (ha.b((byte) 47)) {
            d.field_g.d(0);
            if (d.field_g.c(-94)) {
              var1_int = 1;
            }
            if (mm.field_t != 13) {
              continue;
            }
            var2 = 1;
          }
          d.field_g.a(-7734, ab.a(-776726687, lc.field_c, hm.field_k), ab.a(-776726687, hj.field_S, eh.field_h));
          if (d.field_g.c(77)) {
            var1_int = 1;
          }
          if (param0 != 12210) {
            stackIn_13_0 = 46;
            return stackIn_13_0;
          }
          var3 = 0;
          if (var1_int != 0 &&
            d.field_g.field_b >= 0) {
            var3 = n.field_g[d.field_g.field_b];
            if (var3 == 2 ||
              5 == var3) {
              jb.q(61270);
            }
          } else {
            if (var2 != 0 &&
              kh.field_t != 2) {
              jb.q(61270);
            }
          }
          if (0 == var3 &&
            kh.field_t == 2) {
            var4 = -kg.field_d + kd.c(param0 ^ -9766);
            var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
              var3 = 2;
              ae.a(true, 5, -1);
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "mf.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 5) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = DungeonAssault.field_K;
        try {
          if (param0 > -75) {
            return;
          }
          if (10 <= dk.field_c) {
            if (l.a(true)) {
              if (kh.field_n == 0) {
                mj.a(false, param1, false);
                ob.a(0, -84, param2, 0);
              } else {
                g.a(param2, 18131);
              }
            } else {
              gf.a();
              ah.a(false, 320, 240);
              ob.a(0, -97, param2, 0);
            }
          } else {
            var3_int = 0;
            if (im.field_d) {
              im.field_d = false;
              var3_int = 1;
            }
            hd.a(tl.b(-3), jc.field_d, var3_int != 0, (byte) 105, h.a(-3));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("mf.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_a = "This password is part of your Player Name, and would be easy to guess";
    }
}
