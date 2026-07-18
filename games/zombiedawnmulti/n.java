/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends br {
    int field_h;
    static int field_i;
    byte[] field_f;
    static boolean field_g;

    final static void b(boolean param0) {
        L0: {
          rn.a(-54);
          if (dk.field_Ib != null) {
            nq.a(95, dk.field_Ib);
            break L0;
          } else {
            break L0;
          }
        }
        tb.b(4862);
        qb.b(31);
        da.b(-8);
        if (ib.b(23517)) {
          ma.field_a.b((byte) -35, 1);
          cb.a(0, false);
          ak.a((byte) -111);
          return;
        } else {
          ak.a((byte) -111);
          return;
        }
    }

    final static boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        if (!ia.field_r) {
          if (wc.j(98)) {
            return true;
          } else {
            return false;
          }
        } else {
          if (!qd.field_bb) {
            L0: {
              if (!wc.j(98)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              }
            }
            return stackIn_8_0 != 0;
          } else {
            stackOut_2_0 = 1;
            stackIn_4_0 = stackOut_2_0;
            return stackIn_4_0 != 0;
          }
        }
    }

    n(byte[] param0) {
        try {
            ((n) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -16) {
            return true;
        }
        return bq.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 1;
        field_g = false;
    }
}
