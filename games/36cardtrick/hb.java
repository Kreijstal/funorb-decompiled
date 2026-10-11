/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static int field_d;
    static long field_b;
    static kc field_c;
    static int[] field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          field_c = (kc) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static aa a(byte param0, String param1) {
        int var2_int = 0;
        String var3 = null;
        aa var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_3_0 = null;
        aa stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Main.field_T;
        try {
          if (sl.field_b == null) {
            stackIn_3_0 = null;
            return (aa) (stackIn_3_0);
          }
          var2_int = -89 / ((param0 - 27) / 60);
          var7 = (CharSequence) ((Object) param1);
          var3 = ff.a((byte) 116, var7);
          if (var3 == null) {
            var3 = param1;
          }
          var4 = (aa) (sl.field_b.a(-126, (long)var3.hashCode()));
          while (var4 != null) {
            var8 = (CharSequence) ((Object) var4.field_gb);
            var5 = ff.a((byte) 116, var8);
            if (var5 == null) {
              var5 = var4.field_gb;
            }
            if (var5.equals(var3)) {
              stackIn_15_0 = var4;
              return stackIn_15_0;
            }
            var4 = (aa) (sl.field_b.a(26847));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("hb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
    }
}
