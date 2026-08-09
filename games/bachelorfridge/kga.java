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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            this.field_b = param1;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= this.field_b.length) {
                break L0;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (this.field_b.length <= var4) {
                    var3_int++;
                    continue L1;
                  } else {
                    L3: {
                      if (this.field_b[var4] == this.field_b[var3_int]) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("kga.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
    }
}
