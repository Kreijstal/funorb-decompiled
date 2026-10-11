/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static java.awt.Color field_a;
    private int[] field_b;
    static String field_d;
    static String[] field_c;

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 18260) {
          field_d = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        if (!ms.field_a) {
          throw new IllegalStateException();
        }
        pu.field_m = true;
        jv.a(true, false);
        jv.field_a = param0;
    }

    bf(int[] param0) {
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
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_b[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (-1 != this.field_b[1 + (var4 + var4)]) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.field_b[var4 + var4] = param0[var3Lifetime1];
            this.field_b[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("bf.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var4 = -116 % ((param1 - 32) / 48);
        var3 = -1 + (this.field_b.length >> 1);
        var5 = var3 & param0;
        while (true) {
          var6 = this.field_b[var5 + (var5 + 1)];
          if (var6 == -1) {
            return -1;
          }
          if (param0 == this.field_b[var5 + var5]) {
            return var6;
          }
          var5 = var3 & 1 + var5;
        }
    }

    static {
        field_a = new java.awt.Color(10040319);
    }
}
