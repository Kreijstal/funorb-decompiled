/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static he[] field_e;
    static int field_d;
    static String field_a;
    static nh field_b;
    private int[] field_f;
    static String field_c;
    static he[] field_g;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = (this.field_f.length >> 1) + param1;
        var4 = param0 & var3;
        while (true) {
          var5 = this.field_f[1 + (var4 + var4)];
          if (-1 == var5) {
            return -1;
          }
          if (this.field_f[var4 + var4] == param0) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    qf(int[] param0) {
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
          this.field_f = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_f[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            for (var4 = param0[var3Lifetime1] & -1 + var2_int; -1 != this.field_f[1 + var4 + var4]; var4 = var4 + 1 & -1 + var2_int) {
            }
            this.field_f[var4 + var4] = param0[var3Lifetime1];
            this.field_f[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qf.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_e = null;
        if (param0 != 64) {
          qf.a((byte) -43);
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_a = "Password: ";
    }
}
