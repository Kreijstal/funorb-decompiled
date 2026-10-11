/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kga {
    static kg field_c;
    static kv field_d;
    static kv field_a;
    int[] field_b;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 15238) {
          return;
        }
        field_c = null;
    }

    kga(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_b = param1;
          for (var3_int = 0; var3_int < this.field_b.length; var3_int++) {
            for (var4 = 0; this.field_b.length > var4; var4++) {
              if (this.field_b[var4] == this.field_b[var3_int]) {
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("kga.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
    }
}
