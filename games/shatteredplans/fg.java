/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static ro field_a;
    static qr field_b;
    static int[] field_c;

    final boolean a(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 <= 14) {
          return true;
        }
        stackIn_8_0 = (this == ti.field_d) || (sh.field_c == this) || (this == ih.field_f);
        return stackIn_8_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ro a(String param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6_ref_String = null;
        int var6 = 0;
        ro var7 = null;
        int var8 = 0;
        ro stackIn_4_0 = null;
        ro stackIn_7_0 = null;
        ro stackIn_11_0 = null;
        ro stackIn_17_0 = null;
        ro stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = (ro) (field_a);
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = cm.field_e;
            return stackIn_7_0;
          }
          var3 = so.a(param0, '.', -92);
          if (var3.length < 2) {
            stackIn_11_0 = (ro) (field_a);
            return stackIn_11_0;
          }
          var4 = var3;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6_ref_String = var4[var5];
            var7 = w.a((byte) -94, var6_ref_String);
            if (var7 != null) {
              stackIn_17_0 = var7;
              return stackIn_17_0;
            }
          }
          var6 = 15 / ((55 - param1) / 53);
          stackIn_20_0 = oq.a(var3[var3.length - 1], false);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("fg.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 < 123) {
          field_b = (qr) null;
        }
    }

    static {
        field_a = new ro();
    }
}
