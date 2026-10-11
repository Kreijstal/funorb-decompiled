/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String field_b;
    static int[] field_a;

    final static Boolean a(byte param0) {
        Boolean var1 = ui.field_b;
        ui.field_b = null;
        if (param0 < 91) {
          field_a = (int[]) null;
        }
        return var1;
    }

    public static void a(int param0) {
        if (param0 <= 64) {
          field_b = (String) null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, oh[] param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TetraLink.field_J;
        try {
          if (param3 != null &&
            param0 > 0) {
            var5_int = param3[0].field_t;
            var6 = param3[2].field_t;
            var7 = param3[1].field_t;
            param3[0].c(param1, param2);
            param3[2].c(param1 + param0 - var6, param2);
            ra.a(lj.field_a);
            ra.b(var5_int + param1, param2, -var6 + (param0 + param1), param2 + param3[1].field_F);
            var8 = var5_int + param1;
            var9 = param1 - (-param0 + var6);
            for (param1 = var8; var9 > param1; param1 = param1 + var7) {
              param3[1].c(param1, param2);
            }
            if (param4 > -123) {
              field_b = (String) null;
            }
            ra.b(lj.field_a);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("gh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        if (sj.field_g != null &&
          sj.field_g.b(-20728, param1)) {
          sj.field_g = null;
        }
        if (param0 <= 76) {
          field_a = (int[]) null;
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
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
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TetraLink.field_J;
        try {
          if (param2 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param3 == ~param2) {
            var10 = param0[param1];
            var4 = var10;
            if (var4 != null) {
              stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param1 + param2;
          var5 = 0;
          for (var6_int = param1; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var7 < var4_int; var7++) {
            var8 = param0[var7];
            if (var8 == null) {
              discarded$3 = var6.append("null");
            } else {
              discarded$4 = var6.append(var8);
            }
          }
          stackIn_25_0 = var6.toString();
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("gh.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = new int[4];
        field_b = "Advertising websites";
    }
}
