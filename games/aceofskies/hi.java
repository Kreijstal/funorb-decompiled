/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends to {
    int field_u;
    static vs field_v;
    static String field_x;
    static int field_w;

    public static void k(int param0) {
        field_v = null;
        field_x = null;
    }

    hi(ea param0) {
        super(param0.field_p, param0.field_h, param0.field_q, param0.field_n, (ir) null, (no) null);
        try {
            param0.a(((hi) this).field_n, 0, 0, ((hi) this).field_q, (byte) 126);
            ((hi) this).field_u = 256;
            ((hi) this).field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public hi() {
        super(0, 0, 0, 0, (ir) null, (no) null);
        ((hi) this).field_u = 256;
    }

    final static boolean c(int param0, int param1, int param2) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_12_1 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_11_1 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_10_1 = 0;
        if (si.a(param2, 2, param1)) {
          L0: {
            stackOut_2_0 = qr.a(param1, -7250, param2);
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if ((param1 & 36864) == 0) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          if (stackIn_5_0 | stackIn_5_1 != 0 | hh.a(0, param1, param2)) {
            return true;
          } else {
            L1: {
              if (0 == (param1 & 8192)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            L2: {
              stackOut_9_0 = stackIn_9_0 != 0 | gl.a(param1, 544, param2) | gh.a(param2, false, param1);
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if ((55 & param2) != 0) {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              } else {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L2;
              }
            }
            return stackIn_12_0 & stackIn_12_1 != 0;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ll var6 = null;
        if (param1 != 0) {
          return;
        } else {
          if (((hi) this).field_s != null) {
            if (0 != ((hi) this).field_u) {
              if (((hi) this).field_u != 256) {
                var6 = new ll(((hi) this).field_s.field_q, ((hi) this).field_s.field_n);
                cm.a(var6, -14492);
                ((hi) this).field_s.a((byte) 90, param1, 0, 0);
                sl.c(2765);
                var6.a(param3 - -((hi) this).field_p, param2 - -((hi) this).field_h, ((hi) this).field_u);
                if (param0 < 64) {
                  field_v = null;
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
        if (!(gi.a(true))) {
            return;
        }
        nk.a((byte) -119, 4, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = -1;
    }
}
