/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to {
    static String field_b;
    static int field_c;
    static String field_a;
    static int field_e;
    static String field_f;
    static String field_d;

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        j var3_ref_j = null;
        int var3 = 0;
        int var4_int = 0;
        hn var4 = null;
        Object var5 = null;
        int var6 = 0;
        mi var8 = null;
        byte[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var8 = id.field_f;
            var2 = var8.h(-11);
            if (var2 != 0) {
              if (1 != var2) {
                ke.a((Throwable) null, "A1: " + or.a(122), 0);
                rm.b((byte) 117);
                break L0;
              } else {
                var3 = var8.b(true);
                var4 = (hn) (Object) qo.field_B.a((byte) 100);
                L1: while (true) {
                  L2: {
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (var3 == var4.field_q) {
                        break L2;
                      } else {
                        var4 = (hn) (Object) qo.field_B.b(29);
                        continue L1;
                      }
                    }
                  }
                  if (var4 != null) {
                    var4.c(2);
                    return;
                  } else {
                    rm.b((byte) 87);
                    return;
                  }
                }
              }
            } else {
              var3_ref_j = (j) (Object) vf.field_C.a((byte) 100);
              if (var3_ref_j != null) {
                L3: {
                  var4_int = var8.h(-11);
                  if (var4_int != 0) {
                    var12 = new byte[var4_int];
                    var8.a(0, var12, var4_int, -89);
                    break L3;
                  } else {
                    var5 = null;
                    break L3;
                  }
                }
                var8.field_u = var8.field_u + 4;
                if (!var8.o(-4111)) {
                  rm.b((byte) 94);
                  return;
                } else {
                  var3_ref_j.c(2);
                  return;
                }
              } else {
                rm.b((byte) -61);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "to.A(" + -99 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Lost";
        field_c = 0;
        field_e = 0;
        field_d = "At the bottom of this level is a puller block. It sucks you towards it, but won't harm you if you touch it. Later levels also have pusher blocks (which are yellow). Notice that one of the blocks on this level is only there half the time? That's a phased block; it still needs painting, though!";
        field_f = "-<%0>";
        field_a = "You can ask to join this game";
    }
}
