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
        if (!param0) {
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
        } else {
          return;
        }
    }

    final static boolean c(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 107) {
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
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          field_g = true;
          if (ia.field_r) {
            if (qd.field_bb) {
              return true;
            } else {
              L1: {
                if (!wc.j(98)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (!wc.j(98)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    n(byte[] param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -16) {
            return true;
        }
        return bq.field_c;
    }

    static {
        field_i = 1;
        field_g = false;
    }
}
