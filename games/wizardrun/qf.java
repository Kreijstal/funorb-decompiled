/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends mf {
    static vh field_m;
    static int field_l;
    static String field_k;

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param0) != hg.field_c) {
            return null;
          }
          stackIn_3_0 = di.field_a;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qf.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final ok a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        ok stackIn_3_0 = null;
        ok stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!af.a(var4, (byte) 78)) {
            stackIn_3_0 = hg.field_c;
            return stackIn_3_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = ph.a(1124, var5);
          if (param0 > ~var3_int &&
            130 >= var3_int) {
            return gf.field_V;
          }
          stackIn_8_0 = hg.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_k = null;
        if (!param0) {
          return;
        }
        field_m = null;
    }

    final static String c(byte param0) {
        String var1 = "";
        if (r.field_b != null) {
          var1 = r.field_b.d(false);
        }
        if (0 == var1.length()) {
          var1 = vk.d((byte) -110);
        }
        if (param0 == 77) {
          if (0 == var1.length()) {
            var1 = ei.field_i;
          }
          return var1;
        }
        return (String) null;
    }

    qf(og param0) {
        super(param0);
    }

    static {
        field_k = "Achievements";
    }
}
