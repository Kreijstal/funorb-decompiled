/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lo {
    static db field_a;
    static String[] field_c;
    static hp field_b;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          for (var2_int = 0; var2_int < param0.length(); var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!ep.a((char) var3, (byte) -14) &&
              !ag.a((char) var3, 48)) {
              return true;
            }
          }
          if (param1 > 42) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("lo.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, ng param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = CrazyCrystals.field_B;
          try {
            var6 = new byte[param0];
            var2 = var6;
            if (fp.field_e != null) {
              try {
                fp.field_e.a(0L, -1);
                fp.field_e.a(var6, -88);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var6[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param1.a(0, 24, 76, var2);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param1.a(0, 24, 76, var2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("lo.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized static long a(byte param0) {
        int var3 = 103 % ((35 - param0) / 39);
        long var1 = System.currentTimeMillis();
        if (!(u.field_b <= var1)) {
          r.field_f = r.field_f + (u.field_b - var1);
        }
        u.field_b = var1;
        return var1 + r.field_f;
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -114 / ((55 - param0) / 48);
        field_c = null;
        field_a = null;
    }

    static {
    }
}
