/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static db[] field_c;
    static od field_b;
    static o field_a;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        CharSequence var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = wizardrun.field_H;
        try {
          if (param3 > -60) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (param0 == 0) {
            stackIn_7_0 = "";
            return stackIn_7_0;
          }
          if (param0 == 1) {
            var10 = param1[param2];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_12_0 = "null";
            return stackIn_12_0;
          }
          var4_int = param0 + param2;
          var5 = 0;
          for (var6_int = param2; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param2; var7 < var4_int; var7++) {
            var8 = param1[var7];
            if (var8 == null) {
              discarded$0 = var6.append("null");
            } else {
              discarded$1 = var6.append(var8);
            }
          }
          stackIn_26_0 = var6.toString();
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("s.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 540) {
          return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_a = new o(540, 140);
    }
}
