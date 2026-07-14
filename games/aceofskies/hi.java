/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends to {
    int field_u;
    static vs field_v;
    static String field_x;
    static int field_w;

    public static void k(int param0) {
        if (param0 > -40) {
            return;
        }
        field_v = null;
        field_x = null;
    }

    hi(ea param0) {
        super(((ea) param0).field_p, ((ea) param0).field_h, ((ea) param0).field_q, ((ea) param0).field_n, (ir) null, (no) null);
        param0.a(((hi) this).field_n, 0, 0, ((hi) this).field_q, (byte) 126);
        ((hi) this).field_u = 256;
        ((hi) this).field_s = param0;
    }

    public hi() {
        super(0, 0, 0, 0, (ir) null, (no) null);
        ((hi) this).field_u = 256;
    }

    final static boolean c(int param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_13_1 = 0;
        boolean stackIn_19_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_21_0 = false;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        boolean stackIn_26_0 = false;
        boolean stackIn_27_0 = false;
        boolean stackIn_28_0 = false;
        int stackIn_28_1 = 0;
        boolean stackOut_18_0 = false;
        boolean stackOut_20_0 = false;
        int stackOut_20_1 = 0;
        boolean stackOut_19_0 = false;
        int stackOut_19_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        boolean stackOut_25_0 = false;
        boolean stackOut_27_0 = false;
        int stackOut_27_1 = 0;
        boolean stackOut_26_0 = false;
        int stackOut_26_1 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_11_1 = 0;
        if (param0 == 14834) {
          if (si.a(param2, 2, param1)) {
            L0: {
              stackOut_18_0 = qr.a(param1, param0 + -22084, param2);
              stackIn_20_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if ((param1 & 36864) == 0) {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L0;
              } else {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                break L0;
              }
            }
            if (stackIn_21_0 | stackIn_21_1 != 0 | hh.a(0, param1, param2)) {
              return true;
            } else {
              L1: {
                if (0 == (param1 & 8192)) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L1;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L1;
                }
              }
              L2: {
                stackOut_25_0 = stackIn_25_0 != 0 | gl.a(param1, 544, param2) | gh.a(param2, false, param1);
                stackIn_27_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (-1 != (55 & param2 ^ -1)) {
                  stackOut_27_0 = stackIn_27_0;
                  stackOut_27_1 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  break L2;
                } else {
                  stackOut_26_0 = stackIn_26_0;
                  stackOut_26_1 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  break L2;
                }
              }
              return stackIn_28_0 & stackIn_28_1 != 0;
            }
          } else {
            return false;
          }
        } else {
          hi.k(13);
          if (si.a(param2, 2, param1)) {
            L3: {
              stackOut_3_0 = qr.a(param1, param0 + -22084, param2);
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if ((param1 & 36864) == 0) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L3;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L3;
              }
            }
            if (stackIn_6_0 | stackIn_6_1 != 0 | hh.a(0, param1, param2)) {
              return true;
            } else {
              L4: {
                if (0 == (param1 & 8192)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              L5: {
                stackOut_10_0 = stackIn_10_0 != 0 | gl.a(param1, 544, param2) | gh.a(param2, false, param1);
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (-1 != (55 & param2 ^ -1)) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L5;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L5;
                }
              }
              return stackIn_13_0 & stackIn_13_1 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ll var6 = null;
        if (-1 != (param1 ^ -1)) {
          return;
        } else {
          if (((hi) this).field_s != null) {
            if (0 != ((hi) this).field_u) {
              if ((((hi) this).field_u ^ -1) != -257) {
                var6 = new ll(((hi) this).field_s.field_q, ((hi) this).field_s.field_n);
                cm.a(var6, -14492);
                ((hi) this).field_s.a((byte) 90, param1, 0, 0);
                sl.c(2765);
                var6.a(param3 - -((hi) this).field_p, param2 - -((hi) this).field_h, ((hi) this).field_u);
                if (param0 < 64) {
                  field_v = (vs) null;
                  return;
                } else {
                  return;
                }
              } else {
                ((hi) this).field_s.a((byte) 69, param1, ((hi) this).field_h + param2, ((hi) this).field_p + param3);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void j(int param0) {
        if (!gi.a(true)) {
          return;
        } else {
          if (param0 != 8585) {
            hi.k(37);
            nk.a((byte) -119, 4, false);
            return;
          } else {
            nk.a((byte) -119, 4, false);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = -1;
    }
}
