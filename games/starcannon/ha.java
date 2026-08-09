/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha {
    static Calendar field_b;
    static int field_d;
    static int field_c;
    static hl[] field_a;

    final static String a(rb param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param0.d(param2 + 128);
                  if (var3_int <= param1) {
                    break L2;
                  } else {
                    var3_int = param1;
                    break L2;
                  }
                }
                var4 = new byte[var3_int];
                param0.field_g = param0.field_g + fd.field_a.a((byte) 125, param0.field_f, var3_int, var4, param0.field_g, 0);
                var5 = va.a(param2, param2 ^ 71, var4, var3_int);
                stackIn_3_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_5_0 = "Cabbage";
              return stackIn_5_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("ha.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, ka param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 78) {
                break L1;
              } else {
                field_d = -23;
                break L1;
              }
            }
            stackIn_3_0 = param1.a((byte) -68);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ha.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -53) {
            field_a = (hl[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, rh param2) {
        ia var3 = null;
        if (param1 <= 40) {
            return;
        }
        try {
            var3 = d.field_b;
            var3.d((byte) 38, param0);
            var3.a(param2.field_k, -110);
            var3.c(param2.field_l, -306);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ha.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
