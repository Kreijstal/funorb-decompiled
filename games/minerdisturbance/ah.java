/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static gh field_a;
    static int field_h;
    static int field_e;
    static ta field_g;
    static int field_b;
    static int field_f;
    static ea[] field_c;
    static ea field_d;
    static boolean field_i;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        field_g = null;
        field_d = null;
        if (!param0) {
          field_f = 2;
        }
    }

    final static long a(int param0, CharSequence param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          var2_long = 0L;
          var4 = param1.length();
          var5 = 0;
          if (param0 != -97) {
            stackIn_3_0 = -72L;
            return stackIn_3_0;
          }
          while (var5 < var4) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(var6 - 64);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + (1 + var6));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(27 + var6 - 48);
              }
            }
            if (var2_long < 177917621779460413L) {
              var5++;
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_21_0 = var2_long;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ah.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_h = 20;
        field_a = new gh();
        field_e = -1;
        field_g = new ta();
    }
}
