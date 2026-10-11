/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bbb {
    static String field_a;

    public static void a(int param0) {
        if (param0 != 0) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static phb[] a(phb[] param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        phb var4 = null;
        int var5 = 0;
        phb[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          var2_int = 60 / ((-15 - param1) / 36);
          for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3];
            param0[var3].field_l = 0;
            var4.field_k = 0;
            param0[var3].field_m = param0[var3].field_q;
            param0[var3].field_n = param0[var3].field_p;
          }
          stackIn_5_0 = (phb[]) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("bbb.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Please try again in a few minutes.";
    }
}
