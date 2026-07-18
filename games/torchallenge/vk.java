/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    boolean field_e;
    static long field_f;
    static String field_c;
    String field_g;
    static ka field_d;
    static boolean field_b;
    String field_a;
    static int field_h;
    static qe field_i;
    static int field_k;
    static int field_j;

    final static void a(int param0, byte param1) {
        e var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            sh.field_r = param0;
            if (param1 >= 66) {
              var2 = (e) (Object) tj.field_e.c((byte) 107);
              L1: while (true) {
                if (var2 == null) {
                  if (null != TorChallenge.field_I) {
                    var2 = (e) (Object) TorChallenge.field_I.c((byte) 119);
                    L2: while (true) {
                      if (var2 == null) {
                        break L0;
                      } else {
                        L3: {
                          if (var2.field_k.b(11163)) {
                            var2.field_n.f(128 + sh.field_r * var2.field_l >> 8);
                            break L3;
                          } else {
                            var2.a(true);
                            break L3;
                          }
                        }
                        var2 = (e) (Object) TorChallenge.field_I.c(-270);
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    if (var2.field_k.b(11163)) {
                      var2.field_n.f(128 + sh.field_r * var2.field_l >> 8);
                      break L4;
                    } else {
                      var2.a(true);
                      break L4;
                    }
                  }
                  var2 = (e) (Object) tj.field_e.c(-270);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2_ref, "vk.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a() {
        int var1 = 0;
        field_d = null;
        field_i = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Play the game without logging in just yet";
        field_b = false;
    }
}
