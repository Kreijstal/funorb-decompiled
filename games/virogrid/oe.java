/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_d;
    static lc field_e;
    static String field_a;
    static int field_f;
    static String field_c;
    static hk[][] field_b;

    public static void b(int param0) {
        field_d = null;
        if (param0 != 0) {
          field_b = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (param0 == 0) {
              L0: {
                if (null == gh.field_Ib) {
                  break L0;
                } else {
                  try {
                    L1: {
                      gh.field_Ib.a(0L, 0);
                      gh.field_Ib.a(sh.field_qb.field_l, sh.field_qb.field_g, 24, param0 ^ 0);
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
                    sh.field_qb.field_l = sh.field_qb.field_l + 24;
                    return;
                  } else {
                    break L0;
                  }
                }
              }
              sh.field_qb.field_l = sh.field_qb.field_l + 24;
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static kg a(String param0, boolean param1) {
        Object var3 = null;
        if (param1) {
          var3 = null;
          kg discarded$2 = oe.a((String) null, false);
          return new kg(param0);
        } else {
          return new kg(param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "All players have left <%0>'s game.";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_c = "Reject <%0> from this game";
        field_e = new lc(15, 0, 1, 0);
    }
}
