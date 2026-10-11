/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr {
    private int[] field_d;
    static je field_c;
    static long field_a;
    static boolean field_b;

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = BachelorFridge.field_y;
        if (param0 >= -74) {
          this.field_d = (int[]) null;
        }
        var3 = -1 + (this.field_d.length >> 1);
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_d[var4 + (var4 + 1)];
          if (-1 == var5) {
            return -1;
          }
          if (param1 == this.field_d[var4 + var4]) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    cr(int[] param0) {
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
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & -1 + var2_int;
            while (-1 != this.field_d[1 + var4 + var4]) {
              var4 = 1 + var4 & var2_int - 1;
            }
            this.field_d[var4 + var4] = param0[var3Lifetime1];
            this.field_d[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("cr.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 21592) {
          field_b = true;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
          field_b = true;
        }
        return param0 > param1 ? param0 : param2 >= param1 ? param1 : param2;
    }

    static {
    }
}
