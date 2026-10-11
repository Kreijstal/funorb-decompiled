/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static vc field_a;
    private int[] field_b;

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = (this.field_b.length >> 1) - 1;
        if (param0 != 76) {
          field_a = (vc) null;
        }
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_b[var4 + (var4 + 1)];
          if (var5 == -1) {
            return -1;
          }
          if (param1 == this.field_b[var4 + var4]) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          ni.a(false);
        }
    }

    ni(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while ((param0.length >> 1) + param0.length >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_b = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_b[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = var2_int - 1 & param0[var3Lifetime1];
            while (-1 != this.field_b[1 + var4 + var4]) {
              var4 = var2_int - 1 & 1 + var4;
            }
            this.field_b[var4 + var4] = param0[var3Lifetime1];
            this.field_b[var4 + var4 + 1] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ni.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
