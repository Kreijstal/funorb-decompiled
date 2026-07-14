/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static kc field_a;
    static ri[] field_c;
    static byte[][] field_b;
    static int field_d;

    public static void b(boolean param0) {
        if (!param0) {
            field_a = null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    final static byte[] a(byte param0, String param1) {
        if (param0 < 87) {
            field_a = null;
            return ah.field_J.a(param1, "", -1);
        }
        return ah.field_J.a(param1, "", -1);
    }

    final static void a(boolean param0) {
        if (!param0) {
          if (null == ku.field_J) {
            return;
          } else {
            if (-1 != oh.field_e) {
              if ((an.field_a ^ -1) == 0) {
                return;
              } else {
                L0: {
                  if (an.field_a >= ku.field_J.length) {
                    break L0;
                  } else {
                    g.field_c = 0;
                    boolean discarded$2 = ig.b(120);
                    uc.field_f = iw.field_b;
                    kp.field_a = false;
                    aj.field_C = false;
                    break L0;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_d = -5;
          if (null == ku.field_J) {
            return;
          } else {
            if (-1 != oh.field_e) {
              if ((an.field_a ^ -1) == 0) {
                return;
              } else {
                L1: {
                  if (an.field_a >= ku.field_J.length) {
                    break L1;
                  } else {
                    g.field_c = 0;
                    boolean discarded$3 = ig.b(120);
                    uc.field_f = iw.field_b;
                    kp.field_a = false;
                    aj.field_C = false;
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_b = new byte[50][];
    }
}
