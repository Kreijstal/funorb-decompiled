/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static boolean field_c;
    static int field_d;
    static String[] field_a;
    static volatile boolean field_b;
    static int field_e;

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.applet.Applet var5 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          var3 = null;
          if (param0 < 80) {
            var5 = (java.applet.Applet) null;
            kk.a(-39, (java.net.URL) null, (java.applet.Applet) null);
          }
          if (td.field_i != null &&
            !td.field_i.equals(param2.getParameter("settings"))) {
            var3 = td.field_i;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (bf.field_i != null &&
            !bf.field_i.equals(param2.getParameter("session"))) {
            var4Lifetime1 = bf.field_i;
          }
          stackIn_10_0 = wg.a((String) (var3), -7362, (String) (var4Lifetime1), -1, param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          kk.a(-33);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = new String[]{"Gain 10,000 points", "Gain 20,000 points", "Gain 30,000 points", "Gain 40,000 points", "Gain 50,000 points", "Destroy 10% of the asteroid cluster", "Destroy 30% of the asteroid cluster", "Destroy 60% of the asteroid cluster", "Destroy 100% of the asteroid cluster", "Get a x10 combo", "Get a x10 combo on four levels", "Get a x10 combo on every level", "Get a x25 combo", "Get a x25 combo on four levels", "Get a x25 combo on every level", "Get a x50 combo"};
        field_e = 0;
        field_d = 0;
        field_b = true;
    }
}
