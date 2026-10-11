/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static String field_a;
    static String field_e;
    private int[] field_d;
    static ve field_b;
    static volatile int field_c;
    static String field_f;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = TetraLink.field_J;
        var4 = -94 / ((param0 + 1) / 57);
        var3 = (this.field_d.length >> 1) - 1;
        var5 = var3 & param1;
        while (true) {
          var6 = this.field_d[var5 + (var5 + 1)];
          if (var6 == -1) {
            return -1;
          }
          if (this.field_d[var5 + var5] == param1) {
            return var6;
          }
          var5 = var3 & var5 + 1;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          field_e = null;
          field_f = null;
          return;
        }
        field_f = (String) null;
        field_e = null;
        field_f = null;
    }

    qm(int[] param0) {
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
          while (param0.length + (param0.length >> 1) >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_d = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_d[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & -1 + var2_int;
            while (this.field_d[1 + (var4 + var4)] != -1) {
              var4 = var2_int - 1 & 1 + var4;
            }
            this.field_d[var4 + var4] = param0[var3Lifetime1];
            this.field_d[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qm.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_e = "Game drawn";
        field_a = "Report <%0> for abuse";
        field_c = 0;
        field_f = "Passwords must be between 5 and 20 letters and numbers";
    }
}
