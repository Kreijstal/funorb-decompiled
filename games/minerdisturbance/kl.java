/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static ec field_a;

    final static String a(CharSequence[] param0, int param1, int param2, boolean param3) {
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
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = MinerDisturbance.field_ab;
        try {
          if (param1 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param3) {
            kl.a(false);
          }
          if (1 == param1) {
            var10 = param0[param2];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_10_0 = "null";
            return stackIn_10_0;
          }
          var4_int = param1 + param2;
          var5 = 0;
          for (var6_int = param2; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param2; var7 < var4_int; var7++) {
            var8 = param0[var7];
            if (var8 != null) {
              discarded$3 = var6.append(var8);
            } else {
              discarded$4 = var6.append("null");
            }
          }
          stackIn_24_0 = var6.toString();
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("kl.A(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          CharSequence[] var2 = (CharSequence[]) null;
          kl.a((CharSequence[]) null, 11, -126, false);
        }
    }

    static {
        field_a = new ec(2);
    }
}
