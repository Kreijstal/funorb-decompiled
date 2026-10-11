/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    static int field_b;
    static vn field_a;
    private int[] field_c;

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        int var4Lifetime1;
        for (var4 = 0; param1 > var4; var4++) {
          var6[var4] = param2;
        }
        var4Lifetime1 = -98 % ((param0 - 11) / 59);
        return new String(var3);
    }

    public static void a(int param0) {
        if (param0 > -74) {
          mo.a(-60);
        }
        field_a = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = (this.field_c.length >> 1) - param0;
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_c[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          }
          if (param1 == this.field_c[var4 + var4]) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    mo(int[] param0) {
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
          while (var2_int <= param0.length + (param0.length >> 1)) {
            var2_int = var2_int << 1;
          }
          this.field_c = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_c[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = var2_int - 1 & param0[var3Lifetime1];
            while (this.field_c[var4 + var4 + 1] != -1) {
              var4 = -1 + var2_int & 1 + var4;
            }
            this.field_c[var4 + var4] = param0[var3Lifetime1];
            this.field_c[var4 - (-var4 - 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("mo.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static StringBuilder a(int param0, int param1, char param2, StringBuilder param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          var4_int = param3.length();
          if (param0 != 0) {
            var7 = (StringBuilder) null;
            mo.a(19, -61, 'ￊ', (StringBuilder) null);
          }
          param3.setLength(param1);
          for (var5 = var4_int; var5 < param1; var5++) {
            param3.setCharAt(var5, param2);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("mo.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
