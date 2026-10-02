/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static long field_c;
    static int[] field_b;
    static Sprite[] field_e;
    static String[] subscriptionMonthlyCostTexts;
    static int field_a;
    static int[] field_f;

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (!(~nd.field_b >= ~var1)) {
            rj.field_b = rj.field_b + (nd.field_b - var1);
        }
        nd.field_b = var1;
        if (param0 != -12520) {
            subscriptionMonthlyCostTexts = (String[]) null;
        }
        return rj.field_b + var1;
    }

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 8192) {
            stackIn_4_0 = eg.a(param1, (byte) 49, param0, true);
            return stackIn_4_0;
          } else {
            stackIn_2_0 = -10;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var3);

          stackIn_7_1 = new StringBuilder().append("oa.A(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 8192) {
            field_e = (Sprite[]) null;
        }
        field_b = null;
        subscriptionMonthlyCostTexts = null;
        field_e = null;
        field_f = null;
    }

    static {
        field_f = new int[8192];
        subscriptionMonthlyCostTexts = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
