/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static mf field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        ng.field_pb = 3 & param1 >> 474699460;
        if (2 >= ng.field_pb) {
          lh.field_d = 3 & param1 >> 1758044066;
          vi.field_f = 3 & param1;
          if (param0 != 16) {
            L0: {
              ii.a(17);
              if (lh.field_d < -3) {
                lh.field_d = 2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-3 < vi.field_f) {
                vi.field_f = 2;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (lh.field_d < -3) {
                lh.field_d = 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-3 < vi.field_f) {
                vi.field_f = 2;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          ng.field_pb = 2;
          lh.field_d = 3 & param1 >> 1758044066;
          vi.field_f = 3 & param1;
          if (param0 == 16) {
            L4: {
              if (lh.field_d < -3) {
                lh.field_d = 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-3 < vi.field_f) {
                vi.field_f = 2;
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            L6: {
              ii.a(17);
              if (lh.field_d < -3) {
                lh.field_d = 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-3 < vi.field_f) {
                vi.field_f = 2;
                break L7;
              } else {
                break L7;
              }
            }
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 20) {
            field_a = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean b(int param0) {
        if (param0 == 16836) {
          if (20 <= fc.field_a) {
            if (aa.a((byte) -84)) {
              if ((am.field_g ^ -1) < -1) {
                if (g.i(90)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
