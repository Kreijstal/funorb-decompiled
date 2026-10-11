/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kca {
    static String field_a;
    private int[] field_b;

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8, int param9, int param10, byte param11, int param12) {
        RuntimeException var13 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param11 > -61) {
            stackIn_2_0 = 46;
            return stackIn_2_0;
          }
          if (!li.field_i) {
            stackIn_7_0 = ita.a(param7, 7988).a(param6, param2, param0, param9, param1, param8, param12, param4, param5, param10, param3);
            return stackIn_7_0;
          }
          stackIn_5_0 = nma.field_b[param7].a(param1, param3, param10, 0, param0, param2, (int[]) null, false, 0, param9, param6, param5, param12, (aja[]) null, param8 | param4 << 24, (aa) null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_10_0 = var13;
          stackIn_10_1 = new StringBuilder().append("kca.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 <= 124) {
          field_a = (String) null;
        }
        field_a = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        String var7;
        var6 = VoidHunters.field_G;
        if (param0 != -123454015) {
          var7 = (String) null;
          kca.a(114, -24, -99, -33, 59, -105, (String) null, 97, -95, -68, -115, (byte) 21, -117);
        }
        var3 = (this.field_b.length >> 1) - 1;
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_b[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          }
          if (param1 == this.field_b[var4 + var4]) {
            return var5;
          }
          var4 = var3 & var4 + 1;
        }
    }

    kca(int[] param0) {
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
          this.field_b = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_b[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & -1 + var2_int;
            while (this.field_b[1 + var4 + var4] != -1) {
              var4 = 1 + var4 & var2_int - 1;
            }
            this.field_b[var4 + var4] = param0[var3Lifetime1];
            this.field_b[var4 + var4 + 1] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("kca.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
