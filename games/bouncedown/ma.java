/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ma extends ug {
    int field_s;
    int field_p;
    int field_t;
    int field_q;
    int field_o;
    static String field_u;
    int field_r;
    static fe field_m;
    static String field_n;

    final void b(int param0, int param1, int param2, int param3, int param4) {
        this.a(param1 << 8, true, param0, param4, param3 << 5);
        if (param2 != -741572379) {
          CharSequence var7 = (CharSequence) null;
          ma.a((byte) 48, (CharSequence) null);
        }
    }

    public static void d(int param0) {
        field_n = null;
        field_u = null;
        if (param0 != 65) {
          field_u = (String) null;
        }
        field_m = null;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    private final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = this.field_t << 3;
        if (!param1) {
          this.a(-84, -19, 80, 103, -64, 69);
        }
        param2 = (param2 << 4) + (var6 & 15);
        int var7 = this.field_o << 3;
        param3 = (param3 << 4) + (15 & var7);
        this.a(var6, var7, param2, param3, param0, param4);
    }

    ma() {
    }

    final static long a(byte param0, CharSequence param1) {
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        var7 = Bounce.field_N;
        try {
          var2_long = 0L;
          var4 = param1.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + (1 + var6));
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(1 - (-var6 + 97));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-48 + (var6 + 27));
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          var5Lifetime1 = 119 / ((param0 - 23) / 36);
          stackIn_21_0 = var2_long;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ma.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_u = "to return to the normal view.";
        field_n = "That name is not available";
    }
}
