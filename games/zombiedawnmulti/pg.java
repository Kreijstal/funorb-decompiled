/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static String field_b;
    static cj field_a;
    static String[] field_d;
    static int field_c;

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_intLifetime1;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          ep.e();
          na.field_K = new int[260];
          eq.field_g = 11;
          for (var1_int = 0; 256 > var1_int; var1_int++) {
            var2 = 15.0;
            na.field_K[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (na.field_K.length > var5) {
            na.field_K[var5] = 255;
            var5++;
          }
          if (!param0) {
            return;
          }
          field_d = (String[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "pg.A(" + param0 + ')');
        }
    }

    final static gm a(int param0, byte param1, int param2, int param3) {
        if (param1 < -65) {
          return (gm) ((Object) new hg(param0, param3, param2));
        }
        String var5 = (String) null;
        pg.a((String) null, (byte) -66);
        return (gm) ((Object) new hg(param0, param3, param2));
    }

    final static ma a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        ma stackIn_3_0 = null;
        ma stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param0.length();
          if (param1 >= -85) {
            stackIn_3_0 = (ma) null;
            return stackIn_3_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          stackIn_13_0 = so.field_t;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("pg.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0) {
          return;
        }
        pg.a(77, (byte) -46, -11, 35);
    }

    static {
        field_d = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
