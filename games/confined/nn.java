/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends rk {
    int field_u;
    nn field_s;
    int field_m;
    int field_n;
    static fi field_q;
    int field_w;
    int field_r;
    static String field_v;
    static nf[] field_t;
    static bi field_o;
    static String[] field_p;

    final static al[] b(int param0) {
        if (param0 < 46) {
          return null;
        } else {
          return new al[]{pi.field_T, tj.field_n, tk.field_f};
        }
    }

    public static void c(int param0) {
        if (param0 != -11650) {
          field_p = null;
          field_p = null;
          field_t = null;
          field_q = null;
          field_o = null;
          field_v = null;
          return;
        } else {
          field_p = null;
          field_t = null;
          field_q = null;
          field_o = null;
          field_v = null;
          return;
        }
    }

    final static boolean a(mi param0, mi param1, mi param2, int param3) {
        Object var5 = null;
        int stackIn_15_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param0.b(0)) {
          if (param0.a("commonui", 0)) {
            if (param3 > 21) {
              if (param2.b(0)) {
                if (!param2.a("commonui", 0)) {
                  return false;
                } else {
                  L0: {
                    L1: {
                      if (!param1.b(0)) {
                        break L1;
                      } else {
                        if (!param1.a("button.gif", 0)) {
                          break L1;
                        } else {
                          stackOut_23_0 = 1;
                          stackIn_25_0 = stackOut_23_0;
                          break L0;
                        }
                      }
                    }
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  }
                  return stackIn_25_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              var5 = null;
              boolean discarded$1 = nn.a((mi) null, (mi) null, (mi) null, -51);
              if (param2.b(0)) {
                if (param2.a("commonui", 0)) {
                  if (!param1.b(0)) {
                    return false;
                  } else {
                    L2: {
                      if (!param1.a("button.gif", 0)) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L2;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                    return stackIn_15_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    nn(int param0, int param1, int param2, int param3, int param4) {
        ((nn) this).field_n = param4;
        ((nn) this).field_u = param0;
        ((nn) this).field_r = param1;
        ((nn) this).field_w = param3;
        ((nn) this).field_m = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new fi();
        field_v = "Fullscreen";
        field_p = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
