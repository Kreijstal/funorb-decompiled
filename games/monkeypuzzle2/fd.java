/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends wj {
    private String field_p;
    private boolean field_t;
    static int field_s;
    private rd field_q;
    static int field_r;
    static int field_n;
    static boolean[] field_o;

    final na a(String param0, int param1) {
        h var3 = null;
        na stackIn_10_0 = null;
        na stackIn_16_0 = null;
        na stackIn_23_0 = null;
        na stackIn_29_0 = null;
        na stackOut_22_0 = null;
        na stackOut_21_0 = null;
        na stackOut_28_0 = null;
        na stackOut_27_0 = null;
        na stackOut_9_0 = null;
        na stackOut_8_0 = null;
        na stackOut_15_0 = null;
        na stackOut_14_0 = null;
        if (((fd) this).field_q.a(param0, param1 ^ 0) == ol.field_h) {
          return ol.field_h;
        } else {
          if (param1 == 3917) {
            if (!param0.equals((Object) (Object) ((fd) this).field_p)) {
              var3 = jc.a(param1 + -4015, param0);
              if (!var3.a(param1 + -3917)) {
                return f.field_g;
              } else {
                L0: {
                  ((fd) this).field_p = param0;
                  ((fd) this).field_t = var3.b(param1 ^ 3879);
                  if (((fd) this).field_t) {
                    stackOut_22_0 = wj.field_i;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = ol.field_h;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                return stackIn_23_0;
              }
            } else {
              L1: {
                if (((fd) this).field_t) {
                  stackOut_28_0 = wj.field_i;
                  stackIn_29_0 = stackOut_28_0;
                  break L1;
                } else {
                  stackOut_27_0 = ol.field_h;
                  stackIn_29_0 = stackOut_27_0;
                  break L1;
                }
              }
              return stackIn_29_0;
            }
          } else {
            field_o = null;
            if (!param0.equals((Object) (Object) ((fd) this).field_p)) {
              var3 = jc.a(param1 + -4015, param0);
              if (!var3.a(param1 + -3917)) {
                return f.field_g;
              } else {
                L2: {
                  ((fd) this).field_p = param0;
                  ((fd) this).field_t = var3.b(param1 ^ 3879);
                  if (((fd) this).field_t) {
                    stackOut_9_0 = wj.field_i;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = ol.field_h;
                    stackIn_10_0 = stackOut_8_0;
                    break L2;
                  }
                }
                return stackIn_10_0;
              }
            } else {
              L3: {
                if (((fd) this).field_t) {
                  stackOut_15_0 = wj.field_i;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = ol.field_h;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return stackIn_16_0;
            }
          }
        }
    }

    fd(rj param0, rj param1) {
        super(param0);
        ((fd) this).field_t = false;
        ((fd) this).field_p = "";
        ((fd) this).field_q = new rd(param0, param1);
    }

    final String a(int param0, String param1) {
        if (((fd) this).field_q.a(param1, 3917) == ol.field_h) {
          return ((fd) this).field_q.a(1, param1);
        } else {
          if (((fd) this).a(param1, 3917) != ol.field_h) {
            if (param0 != 1) {
              return null;
            } else {
              return ue.field_E;
            }
          } else {
            return qi.field_J;
          }
        }
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 != -28970) {
            fd.e(-42);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new boolean[5];
        field_r = 0;
    }
}
