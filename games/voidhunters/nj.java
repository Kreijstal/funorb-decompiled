/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj implements dja {
    static pfa field_a;

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
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          if (param1 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (~param1 == param0) {
            var10 = param3[param2];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param1 + param2;
          var5 = 0;
          for (var6_int = param2; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param3[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param2; var7 < var4_int; var7++) {
            var8 = param3[var7];
            if (var8 == null) {
              discarded$3 = var6.append("null");
            } else {
              discarded$4 = var6.append(var8);
            }
          }
          stackIn_23_0 = var6.toString();
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("nj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          CharSequence[] var4 = (CharSequence[]) null;
          nj.a(-62, 119, 20, (CharSequence[]) null);
        }
        return (tv[]) ((Object) new af[param1]);
    }

    public static void a(boolean param0) {
        if (param0) {
          CharSequence[] var2 = (CharSequence[]) null;
          nj.a(1, 39, 107, (CharSequence[]) null);
        }
        field_a = null;
    }

    public final tv a(byte param0) {
        int var2 = 69 % ((-64 - param0) / 50);
        return (tv) ((Object) new af());
    }

    static {
    }
}
