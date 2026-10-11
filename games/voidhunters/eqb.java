/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eqb {
    static char[] field_a;

    final static void a(ml param0, int param1) {
        int var2_int = 0;
        ml var3 = null;
        ml var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = VoidHunters.field_G;
        try {
          for (var2_int = 0; var2_int < 4; var2_int++) {
            var3 = new ml(29);
            var4 = new ml(32);
            var4.a(param1 ^ 14671, 2, new ml(25));
            var4.a(1, 3, new ml(25));
            var4.a(1, 4, new ml(25));
            var3.a(1, 0, var4);
            param0.a(param1 ^ 14671, var2_int, var3);
          }
          if (param1 != 14670) {
            field_a = (char[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("eqb.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 65) {
          field_a = (char[]) null;
        }
        field_a = null;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_a = new char[64];
        for (var0 = 0; var0 < 26; var0++) {
          field_a[var0] = (char)(65 + var0);
        }
        for (var0Lifetime1 = 26; var0Lifetime1 < 52; var0Lifetime1++) {
          field_a[var0Lifetime1] = (char)(var0Lifetime1 + 97 - 26);
        }
        for (var0Lifetime2 = 52; 62 > var0Lifetime2; var0Lifetime2++) {
          field_a[var0Lifetime2] = (char)(-52 + (var0Lifetime2 + 48));
        }
        field_a[63] = (char)45;
        field_a[62] = (char)42;
    }
}
