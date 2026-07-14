/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ot extends iga {
    static kv field_e;
    private String field_g;
    private long field_f;

    wba a(byte param0) {
        if (param0 != -106) {
            return null;
        }
        return bna.field_x;
    }

    final static boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, byte param6) {
        if (param6 <= 43) {
          L0: {
            boolean discarded$1 = ot.a(-115, -104, true, 1, -88, -103, (byte) -27);
            if (!lb.g((byte) -96)) {
              break L0;
            } else {
              L1: {
                kja.a(param1, param3, (byte) -66, param2);
                if (ms.field_u == null) {
                  break L1;
                } else {
                  if (!ms.field_u.a(true, param2, param1, param0, param4)) {
                    break L1;
                  } else {
                    param2 = false;
                    di.c(55);
                    break L1;
                  }
                }
              }
              fd.a(true, param1, param2);
              vd.a((byte) -35, param2, param5);
              param2 = false;
              break L0;
            }
          }
          return param2;
        } else {
          L2: {
            if (!lb.g((byte) -96)) {
              break L2;
            } else {
              L3: {
                kja.a(param1, param3, (byte) -66, param2);
                if (ms.field_u == null) {
                  break L3;
                } else {
                  if (!ms.field_u.a(true, param2, param1, param0, param4)) {
                    break L3;
                  } else {
                    param2 = false;
                    di.c(55);
                    break L3;
                  }
                }
              }
              fd.a(true, param1, param2);
              vd.a((byte) -35, param2, param5);
              param2 = false;
              break L2;
            }
          }
          return param2;
        }
    }

    ot(long param0, String param1) {
        ((ot) this).field_f = param0;
        ((ot) this).field_g = param1;
    }

    final void a(lu param0, boolean param1) {
        param0.b(1686281208, ((ot) this).field_f);
        if (param1) {
          ((ot) this).field_f = -1L;
          param0.a(26, ((ot) this).field_g);
          return;
        } else {
          param0.a(26, ((ot) this).field_g);
          return;
        }
    }

    public static void b(byte param0) {
        if (param0 >= -36) {
            field_e = null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
    }
}
