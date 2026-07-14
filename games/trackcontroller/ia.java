/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static rc field_b;
    static aa field_a;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
            field_b = null;
        }
    }

    final static int b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TrackController.field_F ? 1 : 0;
        if (!param0) {
          boolean discarded$12 = gl.field_E.a(hf.field_d, true, param0, ra.field_z);
          gl.field_E.b(true);
          L0: while (true) {
            if (!mh.e(127)) {
              if (0 == (ra.field_v ^ -1)) {
                if (!gh.field_k) {
                  if (rk.field_X != oe.field_b) {
                    if (sa.field_Q.b((byte) 121)) {
                      if (oe.field_b == fd.field_h) {
                        return 2;
                      } else {
                        return -1;
                      }
                    } else {
                      return 1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              } else {
                var1 = ra.field_v;
                qc.b(-1, (byte) -42);
                return var1;
              }
            } else {
              boolean discarded$13 = gl.field_E.a(md.field_d, 3931, kg.field_d);
              continue L0;
            }
          }
        } else {
          return 79;
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, wb param4) {
        da.field_n.a(!param0 ? true : false, param2, true, param3, param4, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new aa(2, 4, 4, 0);
    }
}
