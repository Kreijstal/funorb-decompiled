/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends gf {
    private String field_m;
    static String field_l;
    private boolean field_o;
    static int field_n;
    private um field_p;

    final String a(byte param0, String param1) {
        if (((ad) this).field_p.a(127, param1) == so.field_u) {
            return ((ad) this).field_p.a((byte) -121, param1);
        }
        if (param0 != -121) {
            ad.c((byte) 37);
            if (!(((ad) this).a(114, param1) != so.field_u)) {
                return ul.field_c;
            }
            return cp.field_h;
        }
        if (!(((ad) this).a(114, param1) != so.field_u)) {
            return ul.field_c;
        }
        return cp.field_h;
    }

    final cd a(int param0, String param1) {
        up var3 = null;
        cd stackIn_9_0 = null;
        cd stackIn_15_0 = null;
        cd stackIn_24_0 = null;
        cd stackIn_30_0 = null;
        cd stackOut_23_0 = null;
        cd stackOut_22_0 = null;
        cd stackOut_29_0 = null;
        cd stackOut_28_0 = null;
        cd stackOut_8_0 = null;
        cd stackOut_7_0 = null;
        cd stackOut_14_0 = null;
        cd stackOut_13_0 = null;
        if (param0 > 62) {
          if (((ad) this).field_p.a(110, param1) != so.field_u) {
            if (!param1.equals((Object) (Object) ((ad) this).field_m)) {
              var3 = vf.a(param1, 0);
              if (!var3.c(484)) {
                return gn.field_h;
              } else {
                L0: {
                  ((ad) this).field_m = param1;
                  ((ad) this).field_o = var3.a(484);
                  if (!((ad) this).field_o) {
                    stackOut_23_0 = so.field_u;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = so.field_s;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                return stackIn_24_0;
              }
            } else {
              L1: {
                if (!((ad) this).field_o) {
                  stackOut_29_0 = so.field_u;
                  stackIn_30_0 = stackOut_29_0;
                  break L1;
                } else {
                  stackOut_28_0 = so.field_s;
                  stackIn_30_0 = stackOut_28_0;
                  break L1;
                }
              }
              return stackIn_30_0;
            }
          } else {
            return so.field_u;
          }
        } else {
          ((ad) this).field_o = true;
          if (((ad) this).field_p.a(110, param1) != so.field_u) {
            if (!param1.equals((Object) (Object) ((ad) this).field_m)) {
              var3 = vf.a(param1, 0);
              if (!var3.c(484)) {
                return gn.field_h;
              } else {
                L2: {
                  ((ad) this).field_m = param1;
                  ((ad) this).field_o = var3.a(484);
                  if (!((ad) this).field_o) {
                    stackOut_8_0 = so.field_u;
                    stackIn_9_0 = stackOut_8_0;
                    break L2;
                  } else {
                    stackOut_7_0 = so.field_s;
                    stackIn_9_0 = stackOut_7_0;
                    break L2;
                  }
                }
                return stackIn_9_0;
              }
            } else {
              L3: {
                if (!((ad) this).field_o) {
                  stackOut_14_0 = so.field_u;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = so.field_s;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              return stackIn_15_0;
            }
          } else {
            return so.field_u;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 != 17) {
            ad.c((byte) 10);
            field_l = null;
            return;
        }
        field_l = null;
    }

    ad(tk param0, tk param1) {
        super(param0);
        ((ad) this).field_o = false;
        ((ad) this).field_m = "";
        ((ad) this).field_p = new um(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Player Name: ";
        field_n = -1;
    }
}
