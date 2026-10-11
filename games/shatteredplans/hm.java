/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hm extends df {
    static boolean field_o;
    static sq field_q;
    static String[] field_p;

    final static String a(CharSequence[] param0, int param1, int param2, byte param3) {
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
        String stackIn_11_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (0 == param2) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param3 != 28) {
            field_p = (String[]) null;
          }
          if (1 == param2) {
            var10 = param0[param1];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_11_0 = "null";
            return stackIn_11_0;
          }
          var4_int = param2 + param1;
          var5 = 0;
          for (var6_int = param1; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
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
          stackIn_28_1 = new StringBuilder().append("hm.GA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(qa param0, ob param1, boolean param2) {
        try {
          di.a(param0.field_u, false, param1);
          if (!param2) {
            field_q = (sq) null;
          }
          param1.d(param0.field_v, 255);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "hm.HA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    hm() {
    }

    public static void d(boolean param0) {
        field_p = null;
        field_q = null;
        if (param0) {
          field_q = (sq) null;
        }
    }

    static {
        field_o = true;
    }
}
