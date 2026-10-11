/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hqa extends kca {
    static ura field_j;

    final it a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_5_0 = 0;
        it stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14) {
            var4 = (String) null;
            this.a((byte) 77, (String) null);
          }
          stackIn_5_0 = (fna.a(param0 ^ -118, param1) != null) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            return uh.field_k;
          }
          stackIn_8_0 = fp.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hqa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 14, param1) == fp.field_c) {
            stackIn_3_0 = pla.field_b;
            return stackIn_3_0;
          }
          if (param0 != -1) {
            field_j = (ura) null;
          }
          stackIn_7_0 = dua.field_j;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hqa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != -1852) {
          field_j = (ura) null;
          field_j = null;
          return;
        }
        field_j = null;
    }

    hqa(tra param0) {
        super(param0);
    }

    static {
        field_j = new ura();
    }
}
