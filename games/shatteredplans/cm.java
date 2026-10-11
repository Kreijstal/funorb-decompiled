/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    private int[] field_d;
    static bc field_a;
    static ro field_e;
    static int[] field_g;
    static boolean field_f;
    static String field_c;
    static bi field_b;

    cm(int[] param0) {
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
          this.field_d = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_d[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & -1 + var2_int;
            while (-1 != this.field_d[1 + var4 + var4]) {
              var4 = -1 + var2_int & 1 + var4;
            }
            this.field_d[var4 + var4] = param0[var3Lifetime1];
            this.field_d[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("cm.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = (this.field_d.length >> 1) - 1;
        if (param0 != 24396) {
          cm.a((byte) -59);
        }
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_d[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_d[var4 + var4] == param1) {
            return var5;
          }
          var4 = var4 + 1 & var3;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != -26) {
          cm.a((byte) 94);
        }
        field_a = null;
        field_g = null;
    }

    static {
        field_e = new ro();
        field_c = "Searching for an opponent";
    }
}
