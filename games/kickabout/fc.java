/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static boolean field_f;
    static gm field_c;
    static ot field_h;
    static String field_e;
    static int field_a;
    static String field_b;
    static boolean field_d;
    static int[] field_g;

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 != 29136) {
            Object var2 = null;
            fc.a((String) null, -116, 0);
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        po.field_f = false;
        wq.field_g = false;
        var3 = 123 / ((param2 - 22) / 47);
        if (null != rk.field_f) {
          if (rk.field_f.field_C) {
            L0: {
              var4 = 1;
              if ((param1 ^ -1) == -9) {
                L1: {
                  param1 = 2;
                  if (hk.field_G) {
                    param0 = dt.field_j;
                    break L1;
                  } else {
                    param0 = cb.field_f;
                    break L1;
                  }
                }
                pb.field_E.a(ep.field_b, (byte) 120);
                break L0;
              } else {
                break L0;
              }
            }
            L2: {
              if ((param1 ^ -1) != -11) {
                break L2;
              } else {
                pc.a((byte) -126);
                var4 = 0;
                break L2;
              }
            }
            L3: {
              if (var4 == 0) {
                break L3;
              } else {
                L4: {
                  if (po.field_f) {
                    param0 = vo.a((byte) -18, mh.field_l, new String[1]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!is.field_a) {
                    break L5;
                  } else {
                    param0 = ai.field_L;
                    break L5;
                  }
                }
                rk.field_f.a(param1, 101, param0);
                break L3;
              }
            }
            if (-257 != (param1 ^ -1)) {
              if ((param1 ^ -1) != -11) {
                if (hk.field_G) {
                  return;
                } else {
                  pb.field_E.h((byte) -76);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 2;
        field_e = "Slight stagger";
        field_b = "rankings";
    }
}
