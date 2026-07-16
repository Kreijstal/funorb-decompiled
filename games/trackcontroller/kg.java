/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static qj[] field_e;
    static String field_a;
    static boolean field_f;
    static int field_d;
    static int[] field_b;
    static int field_c;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 != -1) {
            field_c = -1;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, byte param1, int param2, wb param3) {
        int var4 = 0;
        Object var5 = null;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var4 = -101 % ((param1 - 11) / 46);
          if (null == da.field_n) {
            break L0;
          } else {
            ia.a(param0, param2, 1048576, 1000000, param3);
            break L0;
          }
        }
        if (fj.field_P == null) {
          return;
        } else {
          var5 = (Object) (Object) sb.field_b;
          synchronized (var5) {
            L1: {
              fj.field_P.a(param2, (byte) -113, -1);
              if (param3 == ch.field_n) {
                return;
              } else {
                L2: {
                  fj.field_P.f(11795);
                  sb.field_b.c();
                  ch.field_n = param3;
                  if (ch.field_n != null) {
                    fj.field_P.a(ch.field_n, 14526, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L1;
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 480;
        field_b = new int[256];
    }
}
