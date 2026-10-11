/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg implements dja {
    static String field_a;
    static boolean field_b;
    static String field_c;

    public final tv a(byte param0) {
        int var2 = -61 / ((param0 + 64) / 50);
        return (tv) ((Object) new oca());
    }

    final static int b(byte param0) {
        int var1 = 8 % ((param0 - 63) / 33);
        if (!vba.f((byte) -89) ||
          null == qn.field_h.g(0)) {
          return -1;
        }
        return qn.field_h.g(0).field_r;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_c = (String) null;
        }
        return (tv[]) ((Object) new oca[param1]);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var11Lifetime1;
        int var11Lifetime2;
        var13 = VoidHunters.field_G;
        try {
          var7_int = param5 + param4;
          var8 = -param5 + param1;
          for (var11 = param4; var11 < var7_int; var11++) {
            ww.a(param3, param0, rba.field_b[var11], (byte) 75, param2);
          }
          var10 = -param5 + param0;
          var9 = param2 + param5;
          for (var11Lifetime1 = param1; var8 < var11Lifetime1; var11Lifetime1--) {
            ww.a(param3, param0, rba.field_b[var11Lifetime1], (byte) 75, param2);
          }
          var11Lifetime2 = var7_int;
          if (param6 <= 56) {
            return;
          }
          while (var8 >= var11Lifetime2) {
            var17 = rba.field_b[var11Lifetime2];
            ww.a(param3, var9, var17, (byte) 75, param2);
            ww.a(param3, param0, var17, (byte) 75, var10);
            var11Lifetime2++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var7), "rg.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 > -111) {
          field_c = (String) null;
        }
    }

    static {
        field_b = false;
        field_a = "Login: ";
        field_c = "Very long range";
    }
}
