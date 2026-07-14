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
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        try {
          L0: {
            var3_int = param0.d(param2 + 128);
            if (var3_int <= param1) {
              break L0;
            } else {
              var3_int = param1;
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param0.field_g = param0.field_g + fd.field_a.a((byte) 125, param0.field_f, var3_int, var4, param0.field_g, 0);
          var5 = va.a(param2, param2 ^ 71, var4, var3_int);
          stackOut_2_0 = (String) var5;
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return null;
    }

    final static boolean a(int param0, ka param1) {
        if (param0 <= 78) {
            field_d = -23;
            return param1.a((byte) -68);
        }
        return param1.a((byte) -68);
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -53) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, rh param2) {
        ia var3 = null;
        if (param1 <= 40) {
          return;
        } else {
          var3 = d.field_b;
          var3.d((byte) 38, param0);
          var3.a(param2.field_k, -110);
          var3.c(param2.field_l, -306);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
