/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int field_a;
    static String field_b;
    static kg field_c;

    final static int[] a(int param0, boolean param1, int param2, ij param3) {
        String stackIn_11_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (!param1) {
            field_b = (String) null;
          }
          int[] var8 = param3.field_o[param2];
          int[] var4 = var8;
          int[] var5 = new int[var8.length];
          for (int var6 = 0; var8.length > var6; var6++) {
            var5[var6] = bj.a(-19, param0, var8[var6]);
          }
          int[] stackIn_7_0 = var5;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var4_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
        if (aj.b(-127)) {
          return;
        }
        c var4 = om.field_c;
        var4.a(16, true);
        var4.position = var4.position + 1;
        if (param3 == 1) {
          int var5 = var4.position;
          var4.f(0, -123);
          var4.h(param3 + 45, param0);
          var4.f(param2, -123);
          var4.h(param3 + 9, param1);
          var4.e(-96, var4.position - var5);
          return;
        }
        field_b = (String) null;
        int var5Lifetime1 = var4.position;
        var4.f(0, -123);
        var4.h(param3 + 45, param0);
        var4.f(param2, -123);
        var4.h(param3 + 9, param1);
        var4.e(-96, var4.position - var5Lifetime1);
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        String stackIn_34_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (param1 == 0) {
            String stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (1 == param1) {
            CharSequence var10 = param2[param0];
            CharSequence var4 = var10;
            if (var4 != null) {
              String stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            String stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          int var4_int = param0 + param1;
          if (param3 != 4) {
            String stackIn_14_0 = (String) null;
            return stackIn_14_0;
          }
          int var5 = 0;
          for (int var6_int = param0; var4_int > var6_int; var6_int++) {
            CharSequence var7_ref_CharSequence = param2[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          StringBuilder var6 = new StringBuilder(var5);
          for (int var7 = param0; var4_int > var7; var7++) {
            CharSequence var8 = param2[var7];
            if (var8 == null) {
              StringBuilder discarded$0 = var6.append("null");
            } else {
              StringBuilder discarded$1 = var6.append(var8);
            }
          }
          String stackIn_30_0 = var6.toString();
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var4_ref;
          StringBuilder stackIn_33_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',');
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
