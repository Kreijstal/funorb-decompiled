/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tg implements Serializable {
    int[] field_j;
    boolean[] field_d;
    int[] field_f;
    static pj field_h;
    static oi field_c;
    int[] field_a;
    static long field_g;
    static long field_e;
    static int field_i;
    static String field_b;

    final static ae a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ae var5 = null;
        ae stackIn_4_0 = null;
        ae stackIn_7_0 = null;
        ae stackIn_10_0 = null;
        ae stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf('@');
            if (-1 == var2_int) {
              stackIn_7_0 = ok.field_f;
              return stackIn_7_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(1 + var2_int);
            var5 = fc.a(var3, param0);
            if (var5 == null) {
              stackIn_12_0 = dh.a(-27602, var4);
              return stackIn_12_0;
            }
            stackIn_10_0 = var5;
            return stackIn_10_0;
          }
          stackIn_4_0 = ga.field_c;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("tg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(long param0, boolean param1) {
        if (param0 <= 0L) {
          return;
        }
        if (param0 % 10L != 0L) {
          pg.a(param0, 2);
          if (param1) {
            tg.a(true);
            return;
          }
          return;
        }
        pg.a(-1L + param0, 2);
        pg.a(1L, 2);
        if (param1) {
          tg.a(true);
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_h = null;
        if (!param0) {
          field_b = (String) null;
        }
    }

    tg() {
        this.field_j = new int[300];
        this.field_d = new boolean[300];
        this.field_f = new int[300];
        this.field_a = new int[300];
    }

    static {
        field_c = new oi();
        field_i = 0;
    }
}
