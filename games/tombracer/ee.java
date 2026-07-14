/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee implements isa {
    static volatile int field_a;

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        iu var8 = null;
        L0: {
          var6 = param0.field_i + param1;
          var7 = param3 + param0.field_n;
          bl.a(param0.field_m, var7, param0.field_p, var6, 1);
          var8 = pq.field_b[1];
          if (!(param0 instanceof rj)) {
            break L0;
          } else {
            if (((rj) (Object) param0).field_w) {
              var8.a(1 + var6 + (-var8.field_n + param0.field_m >> 1955757601), var7 - -1 + (-var8.field_k + param0.field_p >> 1794290785), 256);
              break L0;
            } else {
              if (param2 == 16777215) {
                L1: {
                  if (param0.b((byte) -34)) {
                    nn.a(2 + var6, 2 + var7, param0.field_p - 4, -4 + param0.field_m, false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  ee.a(55);
                  if (param0.b((byte) -34)) {
                    nn.a(2 + var6, 2 + var7, param0.field_p - 4, -4 + param0.field_m, false);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            }
          }
        }
        if (param2 != 16777215) {
          L3: {
            ee.a(55);
            if (param0.b((byte) -34)) {
              nn.a(2 + var6, 2 + var7, param0.field_p - 4, -4 + param0.field_m, false);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (param0.b((byte) -34)) {
              nn.a(2 + var6, 2 + var7, param0.field_p - 4, -4 + param0.field_m, false);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        laa.field_y = null;
        np.field_x = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
