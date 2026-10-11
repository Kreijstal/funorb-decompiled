/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String field_a;
    static String field_c;
    static int field_b;

    public static void a(int param0) {
        if (param0 < 40) {
          field_a = (String) null;
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        var7 = ZombieDawn.field_J;
        try {
          var2_long = 0L;
          var4 = param1.length();
          if (param0 != -66) {
            var8 = (CharSequence) null;
            sd.a(-119, (CharSequence) null);
          }
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + var6 + 1);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + var6 + 1);
            } else {
              if (48 <= var6 &&
                57 >= var6) {
                var2_long = var2_long + (long)(27 - (-var6 + 48));
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
          stackIn_26_1 = new StringBuilder().append("sd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "Game Complete!";
        field_c = "Email is valid";
    }
}
