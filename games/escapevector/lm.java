/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    boolean field_a;
    String field_f;
    String[] field_c;
    static String[] field_b;
    int field_g;
    boolean field_e;
    static hh field_d;

    public static void b(byte param0) {
        field_b = null;
        field_d = null;
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (bd.field_h == null) {
                break L0;
              } else {
                try {
                  L1: {
                    bd.field_h.a(0, 0L);
                    bd.field_h.a(true, om.field_g.field_m, om.field_g.field_g, 24);
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
                  L3: {
                    om.field_g.field_m = om.field_g.field_m + 24;
                    if (param0 <= -44) {
                      break L3;
                    } else {
                      lm.a((byte) -105);
                      break L3;
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              }
            }
            om.field_g.field_m = om.field_g.field_m + 24;
            if (param0 > -44) {
              lm.a((byte) -105);
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

    lm(boolean param0) {
        ((lm) this).field_a = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"infracstructure_glow_asteroid", "infracstructure_glow_ice", null, "infracstructure_glow_alien", null};
    }
}
