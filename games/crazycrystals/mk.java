/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static vk field_b;
    static mg field_c;
    static dl field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -27838) {
          field_a = (dl) null;
        }
        field_c = null;
        field_a = null;
    }

    final boolean a(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != -2) {
          field_a = (dl) null;
        }
        stackIn_8_0 = (tk.field_k == this) || (this == fm.field_y) || (ek.field_h == this);
        return stackIn_8_0;
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
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
        var9 = CrazyCrystals.field_B;
        try {
          if (param3 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param3 == 1) {
            var10 = param1[param2];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_10_0 = "null";
            return stackIn_10_0;
          }
          var4_int = param3 + param2;
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
          if (param0 < 62) {
            field_c = (mg) null;
          }
          for (var7 = param2; var7 < var4_int; var7++) {
            var8 = param1[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_26_0 = var6.toString();
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("mk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = null;
    }
}
