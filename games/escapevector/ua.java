/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int field_a;
    static String field_b;
    static kg field_c;

    final static int[] a(int param0, boolean param1, int param2, ij param3) {
        int var6 = 0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          if (!param1) {
            field_b = (String) null;
          }
          var8 = param3.field_o[param2];
          var4 = var8;
          var5 = new int[var8.length];
          for (var6 = 0; var8.length > var6; var6++) {
            var5[var6] = bj.a(-19, param0, var8[var6]);
          }
          stackIn_7_0 = var5;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
          field_a = 95;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (aj.b(-127)) {
          return;
        }
        c var4 = om.field_c;
        var4.a(16, true);
        var4.field_m = var4.field_m + 1;
        if (param3 == 1) {
          var5 = var4.field_m;
          var4.f(0, -123);
          var4.h(param3 + 45, param0);
          var4.f(param2, -123);
          var4.h(param3 + 9, param1);
          var4.e(-96, var4.field_m - var5);
          return;
        }
        field_b = (String) null;
        var5Lifetime1 = var4.field_m;
        var4.f(0, -123);
        var4.h(param3 + 45, param0);
        var4.f(param2, -123);
        var4.h(param3 + 9, param1);
        var4.e(-96, var4.field_m - var5Lifetime1);
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = EscapeVector.field_A;
        try {
          if (param1 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (1 == param1) {
            var10 = param2[param0];
            var4 = var10;
            if (var4 != null) {
              stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param0 + param1;
          if (param3 != 4) {
            stackIn_14_0 = (String) null;
            return stackIn_14_0;
          }
          var5 = 0;
          for (var6_int = param0; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param2[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param0; var4_int > var7; var7++) {
            var8 = param2[var7];
            if (var8 == null) {
              discarded$0 = var6.append("null");
            } else {
              discarded$1 = var6.append(var8);
            }
          }
          stackIn_30_0 = var6.toString();
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = "Current Objective";
    }
}
