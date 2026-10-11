/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh {
    static String field_b;
    static String field_a;

    final static void a(int param0, int param1) {
        if (param0 != 24) {
          field_a = (String) null;
        }
        ta.field_a = 1000000000L / (long)param1;
    }

    final static void a(gb param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = SolKnight.field_L ? 1 : 0;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (pj.field_D != null) {
              try {
                pj.field_D.a(0L, (byte) 45);
                pj.field_D.a((byte) 58, var6);
                for (var3_int = 0; 24 > var3_int; var3_int++) {
                  if (var6[var3_int] == 0) {
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
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            param0.a(8, 24, var2, 0);
            if (param1 < 54) {
              vh.a(120, 92);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var2_ref;
            stackIn_17_1 = new StringBuilder().append("vh.A(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          gb var2 = (gb) null;
          vh.a((gb) null, 57);
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = "Quit";
    }
}
