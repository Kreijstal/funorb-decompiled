/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pj extends cb {
    static String field_y;
    static String field_z;
    private Object field_A;
    static int[] field_x;

    final boolean c(byte param0) {
        if (param0 >= -11) {
          return true;
        }
        return false;
    }

    final static void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        hg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ih var13 = null;
        int var14 = 0;
        ih var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = fleas.field_A ? 1 : 0;
        try {
          var13 = ae.field_a;
          var15 = var13;
          var2 = var15.e(false);
          if (param0 <= 62) {
            return;
          }
          var3 = (hg) (ak.field_d.c((byte) 47));
          while (var3 != null) {
            if (var3.field_m != var2) {
              var3 = (hg) (ak.field_d.b((byte) -105));
              continue;
            }
            break;
          }
          if (var3 == null) {
            k.c(-28354);
            return;
          }
          var4 = var15.e(false);
          if (var4 != 0) {
            hm.field_c[0] = b.field_e;
            var5 = var3.field_j;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              hm.field_c[var6_int] = var13.h(0);
            }
            kh.a(var5, var4, 26721);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              td.a((byte) -107, var15);
              if (var6_intLifetime1 == 0) {
                lg.a(rf.field_l, var6_intLifetime1, w.field_a, wd.field_c, -103, dk.field_B);
              } else {
                lg.a(rf.field_l, var6_intLifetime1, w.field_a, wd.field_c, -113, dk.field_B);
              }
            }
            cm.a(var5, (byte) 118);
            var6 = new String[2][var5];
            var19 = new int[2][4 * var5];
            var8 = qh.field_D;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = mh.field_y[var9];
              var6[0][var10] = hm.field_c[var11];
              var19[0][var10 * 4] = jl.field_b[var11];
              var19[0][1 + var10 * 4] = kk.field_b[var11];
              var19[0][4 * var10 + 2] = hg.field_q[var11];
              var19[0][4 * var10 + 3] = vh.field_i[var11];
              if (ng.a(hm.field_c[var11], (byte) 7) &&
                kk.field_b[var11] + hg.field_q[var11] + vh.field_i[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = mh.field_y[var5 + var9Lifetime1];
              var6[1][var14] = hm.field_c[var11Lifetime1];
              var19[1][var14 * 4] = jl.field_b[var11Lifetime1];
              var19[1][var14 * 4 + 1] = kk.field_b[var11Lifetime1];
              var19[1][4 * var14 + 2] = hg.field_q[var11Lifetime1];
              var19[1][3 + 4 * var14] = vh.field_i[var11Lifetime1];
              if (ng.a(hm.field_c[var11Lifetime1], (byte) 7) &&
                0 == vh.field_i[var11Lifetime1] + (hg.field_q[var11Lifetime1] + kk.field_b[var11Lifetime1])) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
            var3.c(-1);
            return;
          }
          var3.c(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "pj.B(" + param0 + ')');
        }
    }

    pj(Object param0, int param1) {
        super(param1);
        try {
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void h(int param0) {
        field_y = null;
        field_z = null;
        field_x = null;
        int var1 = 88 / ((-41 - param0) / 58);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = fleas.field_A ? 1 : 0;
        try {
          gb.b(param3, param2, 1 + param1, 10000536);
          gb.b(param3, param4 + param2, 1 + param1, 12105912);
          var5_int = 1;
          var6 = param4;
          if (param2 + var5_int < gb.field_b) {
            var5_int = -param2 + gb.field_b;
          }
          if (gb.field_i < var6 + param2) {
            var6 = gb.field_i - param2;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + 48 * var7 / param4;
            var9 = var8 | (var8 << 16 | var8 << 8);
            gb.field_a[param3 + (param2 + var7) * gb.field_d] = var9;
            gb.field_a[param1 + ((param2 + var7) * gb.field_d + param3)] = var9;
          }
          if (param0 != 127) {
            pj.h(100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var5), "pj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d(byte param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          IOException var2_ref = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          var3 = fleas.field_A ? 1 : 0;
          try {
            if (param0 != 60) {
              field_y = (String) null;
            }
            if (td.field_k != null) {
              td.field_k.d(param0 - 14895);
            }
            if (null != vg.field_r) {
              vg.field_r.a(true);
            }
            if (rd.field_c != null) {
              try {
                rd.field_c.b((byte) -70);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != mc.field_c) {
              for (var1_int = 0; var1_int < mc.field_c.length; var1_int++) {
                if (mc.field_c[var1_int] != null) {
                  try {
                    mc.field_c[var1_int].b((byte) -70);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw pf.a((Throwable) ((Object) var1), "pj.E(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final Object g(int param0) {
        if (param0 != 5) {
          return (Object) null;
        }
        return this.field_A;
    }

    static {
        field_y = "Discard";
        field_z = "Sound: ";
    }
}
