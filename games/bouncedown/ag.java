/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String[] field_b;
    static kh field_a;
    static int field_c;

    final static String b(int param0) {
        if (nh.field_P) {
          if (param0 != -1) {
            return (String) null;
          }
          return null;
        }
        if (ge.field_c < ea.field_b) {
          if (param0 != -1) {
            return (String) null;
          }
          return null;
        }
        if (ge.field_c < sd.field_lb + ea.field_b) {
          return oc.field_b;
        }
        if (param0 != -1) {
          return (String) null;
        }
        return null;
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, boolean param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (null != jg.field_B &&
            !jg.field_B.equals(param0.getParameter("settings"))) {
            var3 = jg.field_B;
            var4 = var3;
            var4 = var3;
          }
          if (param2) {
            field_c = 112;
          }
          if (null != bl.field_b &&
            !bl.field_b.equals(param0.getParameter("session"))) {
            var4 = bl.field_b;
          }
          stackIn_10_0 = bi.a(param1, (byte) -107, -1, (String) (var3), (String) (var4));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ag.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1) {
          ag.b(8);
        }
    }

    static {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
