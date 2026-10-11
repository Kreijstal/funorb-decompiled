/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aq {
    static Calendar field_b;
    static ci[] field_a;

    final static String a(int param0, int param1) {
        if (param1 >= 79) {
          return param0 + 1 + "/" + rb.field_n.length;
        }
        field_b = (Calendar) null;
        return param0 + 1 + "/" + rb.field_n.length;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          field_a = (ci[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -52) {
            stackIn_4_0 = hq.a(0, (byte) -112, param1, param1.length);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("aq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 0) {
          return;
        }
        if (wp.field_g == null) {
          return;
        }
        var1 = wp.field_g;
        synchronized (var1) {
          wp.field_g = null;
        }
    }

    final static void b(int param0) {
        of.field_Ob = -no.field_q.field_w + qh.field_l >> 1;
        fm.field_M = -no.field_q.field_A;
        vk.field_H = of.field_Ob + 224;
        ac.b(param0, (byte) -94);
    }

    static {
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = null;
    }
}
