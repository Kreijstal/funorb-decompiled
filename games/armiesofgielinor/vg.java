/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends tc {
    static int field_p;
    static wk[] field_q;
    byte[] field_s;
    static String field_t;
    static String field_k;
    static int[] field_r;
    static String field_o;
    static boolean field_m;
    static String field_l;
    boolean field_n;

    final static boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 10) {
          if (ik.field_d == null) {
            if (iu.field_h) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          vg.a((byte) 89);
          if (ik.field_d != null) {
            return true;
          } else {
            L0: {
              if (!iu.field_h) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 < 31) {
            return;
        }
        field_t = null;
        field_o = null;
        field_k = null;
        field_l = null;
        field_r = null;
        field_q = null;
    }

    vg() {
    }

    static {
        field_k = "Objective";
        field_o = "This unit has already moved.";
        field_r = new int[]{14, 15, 16, 13, 10, 12, 11, 14, 14, 14, 15, 14, 16, 14, 14, 16};
        field_l = "Armies Expansion";
        field_t = "This ground is producing <%0> Mana per turn";
        field_m = false;
    }
}
