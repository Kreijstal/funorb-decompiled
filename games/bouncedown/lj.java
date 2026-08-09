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
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            StringBuilder stackIn_12_1 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            try {
              try {
                L0: {
                  L1: {
                    var7 = 105 % ((64 - param3) / 62);
                    var9 = param0.getParameter("cookiehost");
                    var8 = var9;
                    var8 = var9;
                    var10 = param1 + "=" + param2 + "; version=1; path=/; domain=" + var9;
                    var8 = var10;
                    var8 = var10;
                    if (param4 < 0L) {
                      var8 = var10 + "; Discard;";
                      break L1;
                    } else {
                      var8 = var10 + "; Expires=" + se.a(-80, fa.a(82) + 1000L * param4) + "; Max-Age=" + param4;
                      break L1;
                    }
                  }
                  ac.a((byte) 91, param0, "document.cookie=\"" + var8 + "\"");
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var6_ref);

                stackIn_9_1 = new StringBuilder().append("lj.B(");

                if (param0 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              L3: {


                stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

                if (param1 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L3;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param2 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
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
