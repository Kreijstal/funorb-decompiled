/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static boolean field_c;
    static String field_d;
    static int field_e;
    static hg field_b;
    static String field_a;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, byte param1) {
        tn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            lf.field_S = param0;
            ka.field_a.a(lf.field_S * 64 / 80, (byte) -100);
            var2 = (tn) (Object) ef.field_n.g(-18110);
            L1: while (true) {
              if (var2 == null) {
                if (param1 >= 80) {
                  break L0;
                } else {
                  an.a(-1, (byte) 64);
                  return;
                }
              } else {
                L2: {
                  if (!var2.field_n.b(20478)) {
                    var2.c(-2193);
                    break L2;
                  } else {
                    var2.field_k.h(lf.field_S * var2.field_o / 80);
                    break L2;
                  }
                }
                var2 = (tn) (Object) ef.field_n.a((byte) -119);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2_ref, "an.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "To play a multiplayer game, please log in or create a free account.";
        field_c = false;
        field_b = new hg(6, 0, 4, 2);
    }
}
