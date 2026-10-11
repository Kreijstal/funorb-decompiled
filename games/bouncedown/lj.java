/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lj {
    static Calendar field_c;
    static String[] field_b;
    static int field_a;

    final static void a(java.applet.Applet param0, String param1, String param2, byte param3, long param4) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          String var8Lifetime1;
          String var8Lifetime2;
          String var8Lifetime3;
          String var8Lifetime4;
          try {
            try {
              var7 = 105 % ((64 - param3) / 62);
              var9 = param0.getParameter("cookiehost");
              var8 = var9;
              var8Lifetime1 = var9;
              var10 = param1 + "=" + param2 + "; version=1; path=/; domain=" + var9;
              var8Lifetime2 = var10;
              var8Lifetime3 = var10;
              if (param4 < 0L) {
                var8Lifetime4 = var10 + "; Discard;";
              } else {
                var8Lifetime4 = var10 + "; Expires=" + se.a(-80, fa.a(82) + 1000L * param4) + "; Max-Age=" + param4;
              }
              ac.a((byte) 91, param0, "document.cookie=\"" + var8Lifetime4 + "\"");
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var6_ref;
            stackIn_9_1 = new StringBuilder().append("lj.B(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        if (param0 != -50) {
          field_c = (Calendar) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_b = (String[]) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_b = new String[]{"Splot", "Splat", "Splam", "Splocher", "Splout", "Splassive Splat", "Spliny Splat", "Splikey Splat", "Splega Splat", "Splatty"};
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = 0;
    }
}
