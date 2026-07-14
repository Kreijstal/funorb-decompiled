/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends ig {
    static int field_w;
    static int field_q;
    static int field_v;
    static ko field_r;
    private sl field_p;
    static int field_s;
    static volatile int field_o;
    static int field_m;
    static od field_u;
    static dd[] field_t;
    static int field_n;

    final na a(String param0, boolean param1) {
        ip var4 = null;
        ip var5 = null;
        na stackIn_5_0 = null;
        na stackIn_10_0 = null;
        na stackIn_15_0 = null;
        na stackIn_22_0 = null;
        na stackIn_27_0 = null;
        na stackIn_32_0 = null;
        na stackOut_31_0 = null;
        na stackOut_30_0 = null;
        na stackOut_26_0 = null;
        na stackOut_25_0 = null;
        na stackOut_21_0 = null;
        na stackOut_20_0 = null;
        na stackOut_14_0 = null;
        na stackOut_13_0 = null;
        na stackOut_9_0 = null;
        na stackOut_8_0 = null;
        na stackOut_4_0 = null;
        na stackOut_3_0 = null;
        if (param1) {
          if (((ne) this).field_p instanceof sc) {
            var5 = ((sc) (Object) ((ne) this).field_p).a(83);
            if (var5 != null) {
              if (var5.c(-31873) != kr.field_e) {
                return gp.field_d;
              } else {
                L0: {
                  if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                    stackOut_31_0 = kr.field_e;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_30_0 = gp.field_d;
                    stackIn_32_0 = stackOut_30_0;
                    break L0;
                  }
                }
                return stackIn_32_0;
              }
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                  stackOut_26_0 = kr.field_e;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = gp.field_d;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return stackIn_27_0;
            }
          } else {
            L2: {
              if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                stackOut_21_0 = kr.field_e;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = gp.field_d;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return stackIn_22_0;
          }
        } else {
          ((ne) this).field_p = null;
          if (((ne) this).field_p instanceof sc) {
            var4 = ((sc) (Object) ((ne) this).field_p).a(83);
            if (var4 != null) {
              if (var4.c(-31873) != kr.field_e) {
                return gp.field_d;
              } else {
                L3: {
                  if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                    stackOut_14_0 = kr.field_e;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = gp.field_d;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                return stackIn_15_0;
              }
            } else {
              L4: {
                if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                  stackOut_9_0 = kr.field_e;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = gp.field_d;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return stackIn_10_0;
            }
          } else {
            L5: {
              if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                stackOut_4_0 = kr.field_e;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = gp.field_d;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void b(byte param0) {
        field_u = null;
        if (param0 != 15) {
            field_q = 105;
            field_r = null;
            field_t = null;
            return;
        }
        field_r = null;
        field_t = null;
    }

    final String a(String param0, int param1) {
        ip var3 = null;
        if (param1 == 0) {
          if (((ne) this).field_p instanceof sc) {
            var3 = ((sc) (Object) ((ne) this).field_p).a(-11);
            if (var3 == null) {
              if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                return null;
              } else {
                return rk.field_i;
              }
            } else {
              if (var3.c(-31873) == kr.field_e) {
                if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
                  return var3.a(73);
                } else {
                  return rk.field_i;
                }
              } else {
                return var3.a(73);
              }
            }
          } else {
            if (param0.equals((Object) (Object) ((ne) this).field_p.field_m)) {
              return null;
            } else {
              return rk.field_i;
            }
          }
        } else {
          return null;
        }
    }

    ne(sl param0, sl param1) {
        super(param0);
        ((ne) this).field_p = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 12;
        field_s = 0;
        field_o = 0;
        field_r = new ko();
        field_m = -1;
        field_n = -1;
    }
}
