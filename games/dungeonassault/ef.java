/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static cn field_e;
    static String field_f;
    static boolean field_h;
    static String field_c;
    static String field_g;
    static String field_b;
    static String field_a;
    static cf field_d;

    private final boolean a(int param0) {
        if (param0 >= -62) {
          nh var3 = (nh) null;
          ef.a(92, -86, (nh) null, 64, (nh) null);
          if (rp.field_d == this) {
            return true;
          }
          if (k.field_e != this) {
            return this == qa.field_c ? true : false;
          }
          return true;
        }
        if (rp.field_d == this) {
          return true;
        }
        if (k.field_e == this) {
          return true;
        }
        if (this != qa.field_c) {
          return false;
        }
        return true;
    }

    final static tj a(int param0, int param1, nh param2, int param3, nh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        tj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -125 % ((param0 + 63) / 57);
          if (kk.a(param2, 1, param1, param3)) {
            stackIn_4_0 = rj.a(param4.b(5, param1, param3), 18118);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (tj) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ef.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
          return false;
        }
        if (sp.field_c == null) {
          return false;
        }
        if (!pd.field_A.a(-86)) {
          return false;
        }
        return true;
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        int var6_int = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        int var7Lifetime1;
        var9 = DungeonAssault.field_K;
        try {
          if (param3 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param3 == 1) {
            var10 = param2[param0];
            var4 = var10;
            if (var4 != null) {
              stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param3 + param0;
          var5 = 0;
          for (var6_int = param0; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param2[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
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
          var7Lifetime1 = 74 % ((param1 + 43) / 59);
          stackIn_27_0 = var6.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("ef.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == 111) {
          field_c = null;
          field_g = null;
          field_b = null;
          field_d = null;
          field_e = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    static {
        field_f = "COST:";
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
        field_g = "Achievements";
        field_a = "Create";
        field_c = "to keep fullscreen or";
    }
}
