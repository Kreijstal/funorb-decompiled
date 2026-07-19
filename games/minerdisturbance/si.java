/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    static long[] field_f;
    static String field_c;
    static rc[] field_b;
    static int field_d;
    static String field_e;
    static boolean field_a;

    final static void a(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        if (null == ci.field_i) {
          if (param0 >= -23) {
            discarded$4 = si.a((byte) -22);
            return;
          } else {
            return;
          }
        } else {
          ci.field_i.b(127);
          ci.field_i = null;
          if (param0 < -23) {
            return;
          } else {
            discarded$5 = si.a((byte) -22);
            return;
          }
        }
    }

    final static int a(byte param0) {
        if (param0 >= -28) {
            field_d = 17;
            ke.field_U.a(0);
            if (!aj.field_c.a((byte) -53)) {
                return fn.b(true);
            }
            return 0;
        }
        ke.field_U.a(0);
        if (!(aj.field_c.a((byte) -53))) {
            return fn.b(true);
        }
        return 0;
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        field_f = null;
        field_e = null;
        if (param0 >= -126) {
            field_f = (long[]) null;
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              jc.a(0, bd.field_g, fb.field_c, -125, true, he.field_e, param0);
              if (param1 == -14391) {
                break L1;
              } else {
                si.a(-79);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (fb.field_c <= var2_int) {
                jc.a(param0, v.field_c, param0 + fb.field_c, -2, false, bc.field_d, param0 - -param0);
                if (fb.field_c <= param0) {
                  break L0;
                } else {
                  fb.field_c = param0;
                  return;
                }
              } else {
                an.field_a[param0 + var2_int] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "si.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Play the game without logging in just yet";
        field_b = new rc[5];
        field_e = "Please log in";
        field_a = false;
        field_f = new long[32];
    }
}
