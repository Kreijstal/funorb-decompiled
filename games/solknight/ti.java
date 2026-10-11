/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_e;
    static String field_a;
    static nc field_b;
    static String field_d;
    static ff field_c;
    static String[] field_g;
    static e field_f;

    final static int a(qc param0, int param1, sd param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          if (param2 != null &&
            null != param2.field_i &&
            param0 != null &&
            param0.field_m == param2.field_o) {
            var4_int = param0.field_r.length;
            var5 = param2.field_i[param1].length / var4_int;
            for (var6 = param3; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (~param0.field_n == ~param2.field_m[param1][var6] &&
                kj.a(param2.field_n[param1][var6], (byte) -109)) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param0.field_r[var7] != param2.field_i[param1][var7 + var4_int * var6]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_17_0 = var6;
                  return stackIn_17_0;
                }
              }
            }
            stackIn_20_0 = -1;
            return stackIn_20_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("ti.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        int var1 = -55 % ((param0 - 62) / 40);
        field_a = null;
        field_b = null;
        field_g = null;
    }

    final static long a(CharSequence param0, byte param1) {
        int var5 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          var2_long = 0L;
          if (param1 != 44) {
            ti.a((byte) 25);
          }
          var4 = param0.length();
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(1 - (-var6 + 65));
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + (var6 + 1));
            } else {
              if (var6 >= 48 &&
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
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ti.B(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        il.field_c.field_l = 0;
        int var1 = -8 / ((param0 + 58) / 63);
        il.field_c.field_c = 0;
    }

    static {
        field_a = "CONGRATULATIONS!";
        field_d = "Highscores";
        field_b = new nc();
        field_c = new ff(4, 1, 1, 1);
        field_g = new String[]{"By rating", "By win percentage"};
    }
}
