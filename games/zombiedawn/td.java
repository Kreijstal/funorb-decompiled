/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static af field_b;
    static vo field_c;
    static int field_d;
    static int field_a;
    static long field_e;

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        nn var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            var4 = (nn) (Object) ro.field_a.b((byte) 26);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                pi.a((byte) 25, 2, var4);
                var4 = (nn) (Object) ro.field_a.a(false);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "td.A(" + 2 + ',' + -95 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 94) {
            td.a((byte) -16);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (!i.field_Y) {
          throw new IllegalStateException();
        } else {
          de.field_i = true;
          var1 = -64 / ((param0 - 77) / 35);
          lk.a(true, 116);
          fl.field_a = 0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new af();
        field_c = new vo();
        field_d = 50;
    }
}
