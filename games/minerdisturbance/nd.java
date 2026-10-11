/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static String field_a;
    static boolean field_e;
    static ie field_d;
    static int field_b;
    static java.awt.Frame field_f;
    static String[][] field_c;

    final static boolean a(int param0, int param1) {
        if (param1 != 1) {
          return false;
        }
        if (sn.field_b[param0] == null) {
          return false;
        }
        if (!sn.field_b[param0].field_t) {
          return false;
        }
        if (null == sn.field_b[param0].field_p) {
          return false;
        }
        if (null != sn.field_b[param0].field_p[1][0]) {
          return true;
        }
        return false;
    }

    final static pe a(int param0, String param1) {
        String var2 = null;
        pe var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        pe stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (ae.field_a == null) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            stackIn_7_0 = null;
            return (pe) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = cl.a(-95, var6);
          if (var2 == null) {
            return null;
          }
          if (param0 != 1) {
            field_a = (String) null;
          }
          var3 = (pe) (ae.field_a.a(-7895, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_ob);
            var4 = cl.a(-95, var7);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (pe) (ae.field_a.c(1));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("nd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 < 17) {
          return;
        }
        field_c = (String[][]) null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_a = "Munched and Crunched";
        field_d = new ie();
        field_b = 0;
        field_c = new String[][]{new String[]{"Double-tap mining: To damage rocks, strike them once. If there is nothing below them they will collapse. Once a rock is damaged, strike it again to clear it."}};
    }
}
