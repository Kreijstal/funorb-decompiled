/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static oj field_d;
    static int field_f;
    static String field_a;
    static int field_b;
    static String field_c;
    static int field_g;
    static volatile int field_e;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -20973) {
          field_g = 51;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static boolean a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          if (0L == (pd.field_i & 1L)) {
            return false;
          }
          de.a(-105);
          var1_int = 0;
          var2 = -112 / ((-54 - param0) / 32);
          while (true) {
            if (aq.field_a.length <= var1_int) {
              return false;
            }
            if (!aq.field_a[var1_int].b(59)) {
              var1_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ti.A(" + param0 + ')');
        }
    }

    static {
        field_f = 4;
        field_d = null;
        field_a = "You have entered another game.";
        field_c = "Return to game";
        field_b = 3;
        field_g = -750;
        field_e = 0;
    }
}
