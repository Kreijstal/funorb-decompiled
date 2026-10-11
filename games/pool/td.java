/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static dd field_g;
    static StringBuilder field_c;
    static nm field_e;
    static ph field_f;
    static dd field_a;
    static boolean field_d;
    static int field_b;

    final static long a(byte param0, CharSequence param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_long = 0L;
          var4 = param1.length();
          if (param0 != 52) {
            field_a = (dd) null;
          }
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + (var6 + 1));
            } else if (97 <= var6 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + (var6 + 1));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(var6 - 21);
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
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("td.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 56) {
          field_f = (ph) null;
        }
        field_f = null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          CharSequence var2 = (CharSequence) null;
          td.a((byte) 6, (CharSequence) null);
        }
        return ro.field_e;
    }

    final static boolean a(char param0, byte param1) {
        int var2;
        boolean stackIn_11_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var2 = -124 % ((69 - param1) / 54);
        if ((param0 < 48 ||
          param0 > 57) && (param0 < 65 ||
          90 < param0) && (param0 < 97 ||
          122 < param0)) {
          stackIn_11_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_11_0 = true;
        }
        return stackIn_11_0;
    }

    static {
        field_c = new StringBuilder(80);
        field_f = new ph();
    }
}
