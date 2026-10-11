/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl {
    static String field_b;
    static is field_a;
    static int[] field_c;

    final static boolean b(int param0) {
        if (param0 != 0) {
          bl.a(-92, 118);
          if (null == oba.field_e) {
            return false;
          }
          if (km.field_p.a(param0 + 0)) {
            return true;
          }
          return false;
        }
        if (null == oba.field_e) {
          return false;
        }
        if (km.field_p.a(param0 + 0)) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          bea.c(param3, param1, param4 + param0, 10000536);
          bea.c(param3, param2 + param1, param0 + 1, 12105912);
          var5_int = 1;
          if (var5_int + param1 < bea.field_h) {
            var5_int = -param1 + bea.field_h;
          }
          var6 = param2;
          if (bea.field_k < var6 + param1) {
            var6 = bea.field_k - param1;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = var7 * 48 / param2 + 152;
            var9 = var8 << 16 | var8 << 8 | var8;
            bea.field_l[param3 + (var7 + param1) * bea.field_g] = var9;
            bea.field_l[param0 + ((var7 + param1) * bea.field_g + param3)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "bl.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 83) {
          field_a = (is) null;
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (oba.field_e != null && (param0 < 0 ||
            uga.field_n == km.field_p)) {
            if (param1 == ~ql.field_k.field_h &&
              mha.field_D + 10000L < bva.b((byte) -107)) {
              ql.field_k.k(param0, -2988);
            }
            if (ql.field_k.field_h > 0) {
              try {
                oba.field_e.a(ql.field_k.field_g, 0, ql.field_k.field_h, param1 + 119);
                mha.field_D = bva.b((byte) -107);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                dea.a(60);
              }
              ql.field_k.field_h = 0;
            }
            return;
          }
          ql.field_k.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_c = new int[]{0, 0, 1024, 0, 512, 0, -512, 0, 0, 0, 0, 0, 0};
    }
}
