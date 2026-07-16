/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static String field_a;
    static String field_c;
    static wb field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 122) {
            field_c = null;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, long param1) {
        int var3 = 0;
        InterruptedException var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = -60 % ((64 - param0) / 39);
        try {
          L0: {
            Thread.sleep(param1);
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = (InterruptedException) (Object) decompiledCaughtException;
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Click on the sticky ball!";
        field_c = "You";
    }
}
