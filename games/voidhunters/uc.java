/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static String field_a;

    public static void a(int param0) {
        if (param0 != 0) {
          field_a = (String) null;
        }
        field_a = null;
    }

    final static boolean b(int param0) {
        boolean[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = qd.field_a;
          var1 = var5;
          var2 = 0;
          while (true) {
            if (var2 >= var5.length) {
              var1_int = 15 / ((param0 + 54) / 33);
              return false;
            }
            var3 = var5[var2] ? 1 : 0;
            if (var3 == 0) {
              var2++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "uc.B(" + param0 + ')');
        }
    }

    static {
        field_a = "Name is available";
    }
}
