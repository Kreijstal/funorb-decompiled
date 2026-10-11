/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int field_c;
    static vj field_b;
    static String field_d;
    private int[] field_a;

    public static void a(boolean param0) {
        if (!param0) {
          field_d = (String) null;
        }
        field_d = null;
        field_b = null;
    }

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = client.field_A ? 1 : 0;
        var3 = -1 + (this.field_a.length >> 1);
        if (param0 != -68) {
          return 51;
        }
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_a[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_a[var4 + var4] == param1) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    final static ij[] a(byte param0) {
        if (param0 != 27) {
          oc.a(false);
        }
        return new ij[]{ah.field_f, ge.field_g, hn.field_c};
    }

    oc(int[] param0) {
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
          this.field_a = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_a[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & -1 + var2_int;
            while (-1 != this.field_a[var4 - (-var4 - 1)]) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.field_a[var4 + var4] = param0[var3Lifetime1];
            this.field_a[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("oc.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_d = "Confirm Email:";
    }
}
