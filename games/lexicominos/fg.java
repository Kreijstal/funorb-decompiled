/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static db[] field_e;
    static String field_a;
    static int[] field_f;
    static wh field_c;
    static String field_d;
    static boolean field_b;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        if (param0 != 24) {
          field_a = null;
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(byte param0) {
        try {
            int var1 = 0;
            Exception var2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var1 = 0;
              if (kf.field_y == null) {
                break L0;
              } else {
                try {
                  L1: {
                    kf.field_y.a((byte) 40, 0L);
                    kf.field_y.b(ig.field_a.field_h, ig.field_a.field_j, 24, -31593);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  ig.field_a.field_h = ig.field_a.field_h + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            ig.field_a.field_h = ig.field_a.field_h + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading languages";
        field_d = "Email: ";
        field_f = new int[256];
    }
}
