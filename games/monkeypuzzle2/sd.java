/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static le field_f;
    static java.math.BigInteger field_a;
    static int field_b;
    static boolean field_c;
    static int field_e;
    static boolean field_d;

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_24_0 = 0L;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_long = 0L;
          if (param0 != 37) {
            sd.a((byte) 7);
          }
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(var6 - 64);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(1 + var6 - 97);
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(var6 - 21);
              }
            }
            if (177917621779460413L > var2_long) {
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
          stackIn_24_0 = var2_long;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("sd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 122) {
          field_a = (java.math.BigInteger) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = false;
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_d = false;
    }
}
