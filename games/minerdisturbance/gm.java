/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static boolean field_a;
    static String field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 77 % ((58 - param0) / 41);
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = MinerDisturbance.field_ab;
        try {
          if (param0 != 100) {
            gm.b(26);
          }
          var1_int = 0;
          while (true) {
            if (var1_int >= 3) {
              return;
            }
            if (null != pa.field_a[var1_int] &&
              !pa.field_a[var1_int].k()) {
              var1_int++;
              continue;
            }
            break;
          }
          pa.field_a[var1_int] = rc.a(re.field_a[ll.a((byte) -73, 5) + 25], 100, oc.field_f);
          mg.a(1963987425, pa.field_a[var1_int]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "gm.B(" + param0 + ')');
        }
    }

    static {
        field_a = false;
        field_c = "Loading music";
        field_b = "ON";
    }
}
