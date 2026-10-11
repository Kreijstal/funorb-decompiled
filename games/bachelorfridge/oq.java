/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq {
    static mf field_b;
    static int field_a;

    final static String a(CharSequence[] param0, int param1, int param2, boolean param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        CharSequence var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence[] var10 = null;
        CharSequence var11 = null;
        var9 = BachelorFridge.field_y;
        try {
          if (param2 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param2 == 1) {
            var11 = param0[param1];
            var4 = var11;
            if (var4 != null) {
              return var11.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          if (!param3) {
            var10 = (CharSequence[]) null;
            oq.a((CharSequence[]) null, 104, -45, false);
          }
          var4_int = param1 + param2;
          var5 = 0;
          for (var6_int = param1; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var4_int > var7; var7++) {
            var8 = param0[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_27_0 = var6.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("oq.A(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        ge.field_L = param1 ? true : false;
        ge.a(320, 8, param0, aha.field_D, 2, 8, (aha.field_D.field_v + aha.field_D.field_B) * 3 / 2, (kv[]) null, aha.field_D.field_v, (byte) 91, 240, (kv[]) null);
        if (null != kga.field_c) {
          ju.field_r.a((java.awt.Component) ((Object) kga.field_c), false, 127);
        }
    }

    public static void a(byte param0) {
        if (param0 > -35) {
          return;
        }
        field_b = null;
    }

    static {
        field_a = 48;
    }
}
