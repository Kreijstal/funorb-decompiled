/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static ab field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 < 72) {
          return;
        }
        field_a = null;
    }

    final static long b(int param0) {
        if (param0 >= -86) {
          vl.b(84);
        }
        return rf.c(0) - ta.field_e;
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
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
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (1 == param0) {
            var10 = param1[param2];
            var4 = var10;
            if (var4 != null) {
              stackIn_10_0 = var10.toString();
              return stackIn_10_0;
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param0 + param2;
          var5 = 0;
          for (var6_int = param2; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param2; var7 < var4_int; var7++) {
            var8 = param1[var7];
            if (var8 != null) {
              discarded$3 = var6.append(var8);
            } else {
              discarded$4 = var6.append("null");
            }
          }
          if (param3 > -67) {
            vl.b(-128);
          }
          stackIn_26_0 = var6.toString();
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("vl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
