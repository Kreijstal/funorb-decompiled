/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_a;
    static int field_b;
    static int[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 <= 60) {
          field_a = (String) null;
        }
    }

    final static mu a(int param0, String param1) {
        String var2 = null;
        mu var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_10_0 = null;
        mu stackIn_13_0 = null;
        mu stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (hia.field_s == null) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            return null;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = jd.a(1, var6);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (mu) (stackIn_10_0);
          }
          if (param0 <= 85) {
            stackIn_13_0 = (mu) null;
            return stackIn_13_0;
          }
          var3 = (mu) (hia.field_s.a(-128, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_tb);
            var4 = jd.a(1, var7);
            if (!var4.equals(var2)) {
              var3 = (mu) (hia.field_s.b((byte) 47));
              continue;
            }
            break;
          }
          stackIn_19_0 = var3;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("wp.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (null != hka.field_b) {
          if (null == hka.field_b.field_h) {
            lu.field_b = null;
            if (param0 != -1) {
              var2 = (String) null;
              wp.a(-23, (String) null);
              hka.field_b = null;
              return;
            }
            hka.field_b = null;
            return;
          }
          hka.field_b.field_h.field_cb = false;
        }
        lu.field_b = null;
        if (param0 == -1) {
          hka.field_b = null;
          return;
        }
        var2Lifetime1 = (String) null;
        wp.a(-23, (String) null);
        hka.field_b = null;
    }

    static {
        field_c = new int[8192];
    }
}
