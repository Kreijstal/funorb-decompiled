/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static vh field_c;
    static gb field_a;
    static String field_b;
    static int field_e;
    static int field_d;
    static String field_f;

    final static void a(boolean param0, gb param1) {
        qf var2 = null;
        try {
            qf.a(param1.a("", "headers.packvorbis", 0));
            var2 = qf.a(param1, "jagex logo2.packvorbis", "");
            jb discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "tk.B(" + true + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > param2) {
                var3_int = param2;
                param2 = param0;
                param0 = var3_int;
                L2: while (true) {
                  if (param0 == 0) {
                    break L1;
                  } else {
                    var3_int = param2 % param0;
                    param2 = param0;
                    param0 = var3_int;
                    continue L2;
                  }
                }
              } else {
                L3: while (true) {
                  if (param0 == 0) {
                    break L1;
                  } else {
                    var3_int = param2 % param0;
                    param2 = param0;
                    param0 = var3_int;
                    continue L3;
                  }
                }
              }
            }
            stackOut_7_0 = param2;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "tk.A(" + param0 + ',' + 44 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(int param0, jb[] param1, int param2) {
        try {
            jh.a(uh.field_i, (byte) 51, param2, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "tk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + true + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_b = null;
        field_a = null;
        int var1 = 62;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<col=ffffff>Flamethrower</col><br>The flamethrower is highly effective against larger organic targets, but burns fuel fast. It is best used as a back-up weapon in tight situations.";
        field_f = "The left and right mouse buttons fire the marine's primary and secondary weapons, respectively.";
    }
}
