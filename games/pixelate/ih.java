/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_e;
    static ak field_g;
    static int[] field_c;
    static String field_d;
    static String field_b;
    static tf[] field_a;
    static int field_f;

    final static uc a(byte param0) {
        int var1 = 0;
        if (!(rf.field_d != null)) {
            rf.field_d = new uc(ep.field_b, 20, 0, 0, 0, 11579568, -1, 0, 0, ep.field_b.field_w, -1, 2147483647, true);
        }
        return rf.field_d;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_e = null;
        field_b = null;
        field_g = null;
    }

    final static void a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (fq.field_o != null) {
          fq.field_o.c(-1);
          int fieldTemp$1 = hn.field_d + 1;
          hn.field_d = hn.field_d + 1;
          if (fieldTemp$1 < ce.field_f) {
            L0: {
              fo.field_t = hn.field_d + -128;
              if (fo.field_t >= 0) {
                stackOut_17_0 = 6 * fo.field_t;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                stackOut_16_0 = 0;
                stackIn_18_0 = stackOut_16_0;
                break L0;
              }
            }
            L1: {
              fo.field_t = stackIn_18_0;
              if (fo.field_t <= 256) {
                stackOut_20_0 = fo.field_t;
                stackIn_21_0 = stackOut_20_0;
                break L1;
              } else {
                stackOut_19_0 = 256;
                stackIn_21_0 = stackOut_19_0;
                break L1;
              }
            }
            L2: {
              fo.field_t = stackIn_21_0;
              if (jc.field_d) {
                break L2;
              } else {
                if (hn.field_d >= ce.field_f - 2) {
                  break L2;
                } else {
                  hn.field_d = -2 + ce.field_f;
                  return;
                }
              }
            }
            return;
          } else {
            L3: {
              rg.field_e = fq.field_o;
              hn.field_d = 0;
              fq.field_o = null;
              fo.field_t = hn.field_d + -128;
              if (fo.field_t >= 0) {
                stackOut_5_0 = 6 * fo.field_t;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            L4: {
              fo.field_t = stackIn_6_0;
              if (fo.field_t <= 256) {
                stackOut_8_0 = fo.field_t;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = 256;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            fo.field_t = stackIn_9_0;
            if (!jc.field_d) {
              if (hn.field_d >= ce.field_f - 2) {
                return;
              } else {
                hn.field_d = -2 + ce.field_f;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_d = "Connecting to<br>friend server...";
        field_e = "End Game";
        field_b = "Invite";
    }
}
