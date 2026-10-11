/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq {
    static cj field_b;
    static cj field_c;
    static boolean field_h;
    private int[] field_e;
    static String field_g;
    static String field_d;
    static int field_a;
    static cj field_f;

    qq(int[] param0) {
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
          this.field_e = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_e[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            for (var4 = param0[var3Lifetime1] & -1 + var2_int; this.field_e[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2_int - 1) {
            }
            this.field_e[var4 + var4] = param0[var3Lifetime1];
            this.field_e[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qq.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 21) {
          return;
        }
        field_c = null;
        field_g = null;
        field_f = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 1481485697) {
          qq.b(81, 106);
        }
        var3 = (this.field_e.length >> 1) - 1;
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_e[1 + (var4 + var4)];
          if (-1 == var5) {
            return -1;
          }
          if (param1 == this.field_e[var4 + var4]) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    final static uj b(int param0, int param1) {
        if (!df.field_H) {
          return null;
        }
        if (4 <= jp.field_c.a(param0 ^ param0)) {
          return null;
        }
        wj var2 = new wj(param1);
        jp.field_c.a(var2, false);
        return var2.field_m;
    }

    static {
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_h = false;
        field_d = "Close";
    }
}
