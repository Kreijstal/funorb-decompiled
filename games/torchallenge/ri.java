/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends na {
    static int field_i;
    static ka field_j;
    static String field_k;

    public static void g(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 12) {
          field_k = (String) null;
        }
    }

    final static qk a(int param0, String param1) {
        String var2 = null;
        qk var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        qk stackIn_10_0 = null;
        qk stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (gl.field_e == null) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            return null;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = il.a(var6, (byte) 21);
          if (param0 != 0) {
            stackIn_10_0 = (qk) null;
            return stackIn_10_0;
          }
          if (var2 == null) {
            return null;
          }
          var3 = (qk) (gl.field_e.a(true, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_F);
            var4 = il.a(var7, (byte) 21);
            if (!var4.equals(var2)) {
              var3 = (qk) (gl.field_e.a((byte) 125));
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
          stackIn_24_1 = new StringBuilder().append("ri.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final am a(boolean param0) {
        if (!param0) {
          ri.g(-27);
          return dh.field_V;
        }
        return dh.field_V;
    }

    final static void f(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (pg.field_p != null) {
          je.a((byte) 15, pg.field_p);
        }
        pg.field_p = null;
        ok.field_a = null;
        fe var1 = cj.field_h[10];
        if (param0 >= 122) {
          var2 = ab.field_g[10];
          ol.a(-118, var1, var2);
          return;
        }
        field_j = (ka) null;
        var2Lifetime1 = ab.field_g[10];
        ol.a(-118, var1, var2Lifetime1);
    }

    final static void a(String param0, byte param1) {
        try {
          kg.field_P = param0;
          fk.a(true, 12);
          int var2_int = -108 / ((param1 + 3) / 57);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ri.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ri(long param0, String param1) {
        super(param0, param1);
    }

    static {
        field_i = -1;
        field_k = "Confirm Password: ";
    }
}
