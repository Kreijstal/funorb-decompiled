/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pla {
    private int[] field_a;
    static String field_b;

    public static void b(int param0) {
        field_b = null;
        if (param0 != -1) {
          field_b = (String) null;
        }
    }

    pla(int[] param0) {
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
          this.field_a = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_a[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            for (var4 = param0[var3Lifetime1] & var2_int - 1; -1 != this.field_a[var4 + var4 + 1]; var4 = var4 + 1 & -1 + var2_int) {
            }
            this.field_a[var4 + var4] = param0[var3Lifetime1];
            this.field_a[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("pla.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static jua a(int param0, String[] param1) {
        jua var2 = null;
        RuntimeException var2_ref = null;
        jua stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new jua(false);
          var2.field_c = param1;
          if (param0 <= 80) {
            pla.b(3);
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("pla.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int b(int param0, int param1) {
        if (param0 <= 18) {
          field_b = (String) null;
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          return 6144 <= param1 ? ida.field_b[param1 - 6144] : -ida.field_b[-param1 + 6144];
        }
        return param1 >= 2048 ? -ida.field_b[-2048 + param1] : ida.field_b[2048 - param1];
    }

    final static goa a(int param0) {
        if (param0 != -1) {
          field_b = (String) null;
        }
        return new goa(hha.a(false), nd.b((byte) -107));
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = -1 + (this.field_a.length >> 1);
        if (param1 != 1) {
          return -46;
        }
        var4 = var3 & param0;
        while (true) {
          var5 = this.field_a[var4 + (var4 + 1)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_a[var4 + var4] == param0) {
            return var5;
          }
          var4 = var4 + 1 & var3;
        }
    }

    static {
        field_b = "Please check if address is correct";
        pda discarded$0 = new pda(false);
    }
}
