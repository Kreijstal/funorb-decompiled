/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static String[] field_d;
    static int field_c;
    static String field_b;
    static String field_a;

    final static int a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param0 = param0 & 8191;
        if (param1) {
          if (param0 >= 4096) {
            if (param0 < 6144) {
              stackIn_19_0 = -va.field_d[-param0 + 6144];
            } else {
              stackIn_19_0 = va.field_d[-6144 + param0];
            }
            return stackIn_19_0;
          }
          if (param0 < 2048) {
            stackIn_15_0 = va.field_d[-param0 + 2048];
          } else {
            stackIn_15_0 = -va.field_d[-2048 + param0];
          }
          return stackIn_15_0;
        }
        im.a(true);
        if (param0 >= 4096) {
          if (param0 < 6144) {
            stackIn_9_0 = -va.field_d[-param0 + 6144];
          } else {
            stackIn_9_0 = va.field_d[-6144 + param0];
          }
          return stackIn_9_0;
        }
        if (param0 < 2048) {
          stackIn_5_0 = va.field_d[-param0 + 2048];
        } else {
          stackIn_5_0 = -va.field_d[-2048 + param0];
        }
        return stackIn_5_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (param0) {
          field_d = (String[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          var3 = jl.a(param0, 121, param2);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          var4 = 0;
          while (true) {
            if (param0.length() <= var4) {
              if (param1 == -14) {
                return null;
              }
              stackIn_13_0 = (String) null;
              return stackIn_13_0;
            }
            if (qb.a(param0.charAt(var4), (byte) -76)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_8_0 = gd.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("im.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        int var3Lifetime1;
        if (param1 != -24538) {
          im.a(95, true);
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
          if (var2 >= 128 &&
            var2 < 160) {
            var3 = oj.field_s[var2 - 128];
            if (0 == var3) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 &&
          var2 < 160) {
          var3Lifetime1 = oj.field_s[var2 - 128];
          if (0 == var3Lifetime1) {
            var3Lifetime1 = 63;
          }
          var2 = var3Lifetime1;
        }
        return (char)var2;
    }

    static {
        field_a = "HE";
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_d = new String[]{"By rating", "By win percentage"};
    }
}
