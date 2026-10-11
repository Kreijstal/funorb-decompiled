/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static da field_b;
    static String[] field_d;
    static String field_a;
    static String field_c;

    public static void a(byte param0) {
        if (param0 != 113) {
          o var2 = (o) null;
          eb.a(false, (o) null, 11);
        }
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static o a(boolean param0, o param1, int param2) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        o stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        o var11 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          param1.d();
          var11 = new o(param1.field_p, param1.field_t / 3);
          var4 = 0;
          var5 = 0;
          var6 = param1.field_v;
          var7 = var11.field_v;
          for (var8 = 0; var11.field_t > var8; var8++) {
            for (var9 = 0; var9 < var11.field_p; var9++) {
              incrementValue$4 = var5;
              var5++;
              incrementValue$5 = var4;
              var4++;
              var7[incrementValue$4] = var7[incrementValue$4] + rf.b(20, var6[incrementValue$5], param0, 2);
            }
            var5 = var5 - var11.field_p;
            for (var9Lifetime1 = 0; var11.field_p > var9Lifetime1; var9Lifetime1++) {
              incrementValue$2 = var5;
              var5++;
              incrementValue$3 = var4;
              var4++;
              var7[incrementValue$2] = var7[incrementValue$2] + rf.b(20, var6[incrementValue$3], param0, 1);
            }
            var5 = var5 - var11.field_p;
            for (var9Lifetime2 = 0; var11.field_p > var9Lifetime2; var9Lifetime2++) {
              incrementValue$0 = var5;
              var5++;
              incrementValue$1 = var4;
              var4++;
              var7[incrementValue$0] = var7[incrementValue$0] + rf.b(20, var6[incrementValue$1], param0, 0);
            }
          }
          var8Lifetime1 = -54 % ((param2 + 21) / 57);
          var11.f();
          stackIn_14_0 = var11;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("eb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = "Player Name: ";
        field_d = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_c = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
