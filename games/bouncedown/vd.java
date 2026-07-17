/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vd {
    static int field_a;
    static pb field_b;

    final static jd a(int param0) {
        int var1 = 0;
        var1 = -63;
        if (ml.field_e == null) {
          ml.field_e = new jd(qj.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, qj.field_d.field_s, -1, 2147483647, true);
          return ml.field_e;
        } else {
          return ml.field_e;
        }
    }

    public static void b(int param0) {
        field_b = null;
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Bounce.field_N;
        try {
          var3 = ih.a(false, param1, false);
          var4 = 68 / ((-7 - param0) / 57);
          if (var3 == null) {
            var5 = 0;
            L0: while (true) {
              if (param1.length() > var5) {
                if (uc.a(2, param1.charAt(var5))) {
                  var5++;
                  continue L0;
                } else {
                  stackOut_8_0 = wb.field_d;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("vd.C(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 0 + 41);
        }
    }

    final static void a(byte param0, wi param1) {
        int var2_int = 0;
        try {
            if (param0 <= 35) {
                field_a = 33;
            }
            de.field_b = param1.a(-1640531527) << 5;
            var2_int = param1.d((byte) -104);
            kf.field_a = (7 & var2_int) << 18;
            de.field_b = de.field_b + (var2_int >> 3);
            kf.field_a = kf.field_a + (param1.a(-1640531527) << 2);
            var2_int = param1.d((byte) -119);
            ed.field_b = (63 & var2_int) << 15;
            kf.field_a = kf.field_a + (var2_int >> 6);
            ed.field_b = ed.field_b + (param1.d((byte) -119) << 7);
            var2_int = param1.d((byte) -119);
            qe.field_i = (1 & var2_int) << 16;
            ed.field_b = ed.field_b + (var2_int >> 1);
            qe.field_i = qe.field_i + param1.a(-1640531527);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "vd.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 6;
        field_b = null;
    }
}
