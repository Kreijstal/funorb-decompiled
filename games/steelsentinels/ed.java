/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static int field_i;
    static int field_h;
    static String field_b;
    static String field_e;
    static int[][] field_c;
    static int field_a;
    static int field_f;
    static String field_d;
    static String field_g;
    static int field_j;

    final static void b() {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == va.field_h) {
                break L0;
              } else {
                try {
                  L1: {
                    va.field_h.a(-94, 0L);
                    va.field_h.a(rf.field_d.field_p, 24, 42, rf.field_d.field_t);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  rf.field_d.field_p = rf.field_d.field_p + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            rf.field_d.field_p = rf.field_d.field_p + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_g = null;
        int var1 = 80;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_e = "Basic Combat";
        field_b = "To report a player, right-click on their name and select the option to report abuse.";
        field_a = 64;
        field_d = "Unable to add friend - system busy";
        field_c = new int[][]{null, new int[10], new int[10]};
        field_g = "module:</col>";
    }
}
