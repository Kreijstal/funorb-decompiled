/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends qe {
    static String field_p;
    static li field_q;
    static dl field_n;
    static String field_o;

    kk(wa param0) {
        super(param0);
    }

    public static void c(byte param0) {
        field_q = null;
        field_p = null;
        field_n = null;
        field_o = null;
        int var1 = -65 / ((param0 + 64) / 56);
    }

    final wl a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        wl stackIn_4_0 = null;
        wl stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_o = (String) null;
          }
          var4 = (CharSequence) ((Object) param0);
          if (!pa.a(var4, -113)) {
            stackIn_4_0 = ee.field_c;
            return stackIn_4_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = fm.a(var5, false);
          if (var3_int > 0 &&
            130 >= var3_int) {
            return bm.field_i;
          }
          stackIn_9_0 = ee.field_c;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kk.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, true) == ee.field_c) {
            stackIn_2_0 = mb.field_gb;
            return stackIn_2_0;
          }
          if (param0 == -26358) {
            return null;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kk.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_p = "Accept";
        field_q = null;
        field_o = "Please remove <%0> from your ignore list first.";
        field_n = new dl();
    }
}
