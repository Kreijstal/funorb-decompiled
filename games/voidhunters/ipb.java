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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_a = 0;
        try {
          this.field_b = new tsa[param0.c(3)];
          var2_int = 0;
          var3 = (tsa) (param0.d(0));
          while (var3 != null) {
            var3.b(-3846);
            incrementValue$2 = var2_int;
            var2_int++;
            this.field_b[incrementValue$2] = var3;
            var3 = (tsa) (param0.a((byte) 13));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ipb.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        if (param0 > 18) {
          return this.field_a >= this.field_b.length ? true : false;
        }
        this.field_b = (tsa[]) null;
        return this.field_a >= this.field_b.length ? true : false;
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
