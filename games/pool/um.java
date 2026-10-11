/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um {
    static int field_c;
    static int field_d;
    static String field_a;
    private static int field_b;
    static boolean field_e;

    final static void a(int param0, int param1) {
        ma var2 = null;
        int var3 = 0;
        kg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Pool.field_O;
        try {
          var4 = (kg) (we.field_c.c((byte) 65));
          while (var4 != null) {
            fr.a(98, var4, param1);
            var4 = (kg) (we.field_c.f((byte) -5));
          }
          if (param0 != 10) {
            field_e = false;
          }
          var2 = ke.field_f.c((byte) -34);
          while (var2 != null) {
            hi.a(1, param1);
            var2 = ke.field_f.f((byte) -5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "um.T(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 107) {
          um.a(-2);
        }
    }

    static {
        field_b = 10;
        field_c = 1 << field_b;
        field_a = "Drawn";
    }
}
