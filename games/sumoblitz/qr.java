/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr {
    static jn field_c;
    static ta field_a;
    static gf field_e;
    static int[] field_d;
    static ud field_b;

    final static an a(String[] args, int param1) {
        an var2 = new an(false);
        var2.field_h = args;
        if (param1 != 8192) {
            qr.a(1, -118);
        }
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        vk.a(qu.field_k, kc.field_l, (byte) -107, se.field_d, param1, 0, true);
        if (param0 != 13136) {
            field_d = null;
        }
        for (var2 = 0; var2 < se.field_d; var2++) {
            pd.field_q[param1 + var2] = var2;
        }
        vk.a(ab.field_c, oc.field_f, (byte) -107, param1 + se.field_d, param1 + param1, param1, false);
        if (se.field_d > param1) {
            se.field_d = param1;
        }
    }

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 17704) {
          L0: {
            L1: {
              if ((Object) (Object) jj.field_f == this) {
                break L1;
              } else {
                if ((Object) (Object) uu.field_l == this) {
                  break L1;
                } else {
                  if (this != (Object) (Object) ga.field_j) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != 119) {
            field_e = null;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new jn();
        field_e = new gf();
        field_d = new int[8192];
    }
}
