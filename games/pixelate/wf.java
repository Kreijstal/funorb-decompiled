/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wf {
    static int field_b;
    static String field_a;

    final static void a(int param0, we param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          RuntimeException var2_ref = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          var5 = Pixelate.field_H ? 1 : 0;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (null != vi.field_p) {
              try {
                vi.field_p.a(0L, 123);
                vi.field_p.a(var6, (byte) 0);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
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
            param1.a(24, 0, -3493, var2);
            if (param0 == 1) {
              return;
            }
            field_a = (String) null;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("wf.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -48) {
          wf.a((byte) 22);
        }
    }

    final static el a(boolean param0, String param1) {
        el stackIn_3_0 = null;
        el stackIn_6_0 = null;
        el stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        el stackIn_24_0 = null;
        el stackIn_38_0 = null;
        el stackIn_42_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = pd.field_Kb;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_6_0 = mk.field_a;
            return stackIn_6_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(-1 + var2_int) != 34) {
              stackIn_11_0 = gm.field_f;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_24_0 = gm.field_f;
                  return stackIn_24_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = param0 ? 1 : 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_38_0 = gm.field_f;
                return stackIn_38_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (li.field_i.indexOf(var5Lifetime1) == -1) {
                stackIn_42_0 = gm.field_f;
                return stackIn_42_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_49_0 = var2;
          stackIn_49_1 = new StringBuilder().append("wf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    static {
        field_a = "Staff impersonation";
    }
}
