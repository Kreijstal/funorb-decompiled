/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ipb {
    int field_a;
    private tsa[] field_b;

    ipb(ij param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        tsa var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_a = 0;
        try {
          L0: {
            this.field_b = new tsa[param0.c(3)];
            var2_int = 0;
            var3 = (tsa) ((Object) param0.d(0));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.b(-3846);
                incrementValue$2 = var2_int;
                var2_int++;
                this.field_b[incrementValue$2] = var3;
                var3 = (tsa) ((Object) param0.a((byte) 13));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ipb.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 <= 18) {
          L0: {
            this.field_b = (tsa[]) null;
            if (this.field_a < this.field_b.length) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_a < this.field_b.length) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final tsa a(byte param0) {
        int var2 = 75 / ((param0 - 70) / 55);
        int fieldTemp$0 = this.field_a;
        this.field_a = this.field_a + 1;
        return this.field_b[fieldTemp$0];
    }

    static {
    }
}
