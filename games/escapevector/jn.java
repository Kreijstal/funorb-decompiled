/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static int field_c;
    private int[] field_f;
    static int field_e;
    static int field_a;
    static int field_d;
    static int field_b;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = (this.field_f.length >> 1) - param1;
        var4 = var3 & param0;
        while (true) {
          var5 = this.field_f[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_f[var4 + var4] == param0) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 13) {
            var3 = (String) null;
            jn.a(-106, (String) null);
          }
          stackIn_3_0 = fk.field_a.a(-4, param1, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    jn(int[] param0) {
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
          this.field_f = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_f[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (this.field_f[var4 + (var4 + 1)] != -1) {
              var4 = var2_int - 1 & var4 + 1;
            }
            this.field_f[var4 + var4] = param0[var3Lifetime1];
            this.field_f[var4 - (-var4 - 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("jn.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        id.a(400, 50);
    }
}
