/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static int[] field_a;

    final static t a(int param0, byte param1, la param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        t stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!nd.a(param3, param2, -1, param0)) {
            return null;
          }
          var4_int = -14 % ((-40 - param1) / 39);
          stackIn_4_0 = nl.c(-8791);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("wi.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Torquing.field_u;
        try {
          if (param2 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param2 == 1) {
            var10 = param3[param1];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param2 + param1;
          var5 = param0;
          for (var6_int = param1; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param3[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var4_int > var7; var7++) {
            var8 = param3[var7];
            if (var8 != null) {
              discarded$3 = var6.append(var8);
            } else {
              discarded$4 = var6.append("null");
            }
          }
          stackIn_22_0 = var6.toString();
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_25_0 = var4_ref;
          stackIn_25_1 = new StringBuilder().append("wi.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Torquing.field_u;
        try {
          var5 = u.field_v;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1_ref), "wi.D(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 > -108) {
          field_a = (int[]) null;
        }
        field_a = null;
    }

    static {
    }
}
