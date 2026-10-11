/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static String field_a;
    static String field_b;

    final static boolean a(boolean param0) {
        if (param0) {
          return true;
        }
        if (sb.field_sb == -1) {
          if (!tk.a(-121, 1)) {
            return false;
          }
          sb.field_sb = tk.field_h.i(-117);
          tk.field_h.field_l = 0;
        }
        if (-2 == sb.field_sb) {
          if (!tk.a(60, 2)) {
            return false;
          }
          sb.field_sb = tk.field_h.f(674914976);
          tk.field_h.field_l = 0;
        }
        return tk.a(-121, sb.field_sb);
    }

    final static long a(CharSequence param0, boolean param1) {
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
        CharSequence var8 = null;
        var7 = Chess.field_G;
        try {
          var2_long = 0L;
          if (param1) {
            var8 = (CharSequence) null;
            jl.a((CharSequence) null, false);
          }
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(var6 + 1 - 65);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(var6 + 1 - 97);
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-48 + (27 + var6));
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
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("jl.B(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1699) {
          jl.a(true);
        }
    }

    static {
        field_a = "Add <%0> to friend list";
        field_b = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
