/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static java.awt.Color field_d;
    static String field_c;
    private int[] field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 > -20) {
          da.a(121);
        }
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Bounce.field_N;
        var3 = -1 + (this.field_a.length >> 1);
        var4 = param1 & var3;
        if (param0 > -53) {
          field_b = (String) null;
        }
        while (true) {
          var5 = this.field_a[var4 + (var4 + 1)];
          if (-1 == var5) {
            return -1;
          }
          if (param1 == this.field_a[var4 + var4]) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    da(int[] param0) {
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
          while (var2_int <= (param0.length >> 1) + param0.length) {
            var2_int = var2_int << 1;
          }
          this.field_a = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_a[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & -1 + var2_int;
            while (this.field_a[var4 + (var4 + 1)] != -1) {
              var4 = -1 + var2_int & 1 + var4;
            }
            this.field_a[var4 + var4] = param0[var3Lifetime1];
            this.field_a[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("da.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_c = "To Customer Support";
        field_d = new java.awt.Color(10040319);
        field_b = "Loading extra data";
    }
}
