/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends uh {
    static ji field_l;
    static int field_i;
    private String field_k;
    static String field_g;
    static String field_h;
    private String field_j;

    final static void a(java.awt.Canvas param0, int param1) {
        mj.a((java.awt.Component) (Object) param0, (byte) 96);
        ee.a((java.awt.Component) (Object) param0, 6769);
        if (vc.field_K == null) {
          if (param1 != 8053) {
            String discarded$4 = ka.a(false, -94, false, true);
            return;
          } else {
            return;
          }
        } else {
          vc.field_K.a((java.awt.Component) (Object) param0, param1 ^ -8058);
          if (param1 == 8053) {
            return;
          } else {
            String discarded$5 = ka.a(false, -94, false, true);
            return;
          }
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param0) {
          L0: {
            if (param2) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 != 2) {
            L1: {
              ka.b(-47);
              if (param3) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return oi.field_e[var4];
          } else {
            L2: {
              if (param3) {
                var4++;
                break L2;
              } else {
                break L2;
              }
            }
            return oi.field_e[var4];
          }
        } else {
          L3: {
            var4 += 4;
            if (param2) {
              var4 += 2;
              break L3;
            } else {
              break L3;
            }
          }
          if (param1 == 2) {
            L4: {
              if (param3) {
                var4++;
                break L4;
              } else {
                break L4;
              }
            }
            return oi.field_e[var4];
          } else {
            L5: {
              ka.b(-47);
              if (param3) {
                var4++;
                break L5;
              } else {
                break L5;
              }
            }
            return oi.field_e[var4];
          }
        }
    }

    public static void b(int param0) {
        if (param0 > -24) {
          String discarded$2 = ka.a(false, 106, false, false);
          field_h = null;
          field_l = null;
          field_g = null;
          return;
        } else {
          field_h = null;
          field_l = null;
          field_g = null;
          return;
        }
    }

    final sd a(boolean param0) {
        if (!param0) {
            sd discarded$0 = ((ka) this).a(true);
            return pc.field_v;
        }
        return pc.field_v;
    }

    final void a(int param0, va param1) {
        if (param0 != 4) {
          field_h = null;
          param1.b(0, ((ka) this).field_k);
          param1.a(((ka) this).field_j, -66);
          return;
        } else {
          param1.b(0, ((ka) this).field_k);
          param1.a(((ka) this).field_j, -66);
          return;
        }
    }

    ka(String param0, String param1) {
        ((ka) this).field_j = param1;
        ((ka) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "To Customer Support";
        field_g = "Press <%0> or SPACE";
    }
}
