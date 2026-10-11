/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static String field_d;
    static int field_a;
    static boolean field_b;
    static int[] field_e;
    static String[][] field_c;
    static volatile long field_f;

    public static void a(int param0) {
        field_e = null;
        if (param0 != 0) {
          return;
        }
        field_c = (String[][]) null;
        field_d = null;
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          var3 = null;
          if (param1 != -1) {
            stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          if (null != rb.field_l &&
            !rb.field_l.equals(param2.getParameter("settings"))) {
            var3 = rb.field_l;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (u.field_a != null &&
            !u.field_a.equals(param2.getParameter("session"))) {
            var4Lifetime1 = u.field_a;
          }
          stackIn_11_0 = pl.a((String) (var4Lifetime1), (String) (var3), false, param0, -1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("gn.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 != -29550) {
          return;
        }
        ef.f((byte) 53);
        uf.k(-4840);
    }

    static {
        field_d = "Stamina Mode";
        field_f = 0L;
    }
}
