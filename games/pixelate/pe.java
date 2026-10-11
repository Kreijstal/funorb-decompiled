/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pe {
    static tf field_b;
    static Calendar field_a;
    static int field_c;

    public static void a(int param0) {
        if (param0 != 7) {
          pe.a(true);
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(fm param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -82) {
            stackIn_4_0 = param0.a((byte) 92);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("pe.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, long param2) {
        pc var4 = aa.field_f;
        var4.g(param1, 15514);
        var4.field_m = var4.field_m + 1;
        int var5 = var4.field_m;
        var4.e(160, param0);
        var4.a(false, param2);
        var4.f(var4.field_m - var5, -1);
    }

    final static boolean a(boolean param0) {
        am.field_e = true;
        if (!param0) {
          mc.field_q = 15000L + hm.a(64);
          return el.field_b == 11 ? true : false;
        }
        pe.a(-106, 76, -70L);
        mc.field_q = 15000L + hm.a(64);
        return el.field_b == 11 ? true : false;
    }

    static {
        field_b = new tf(640, 480);
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
