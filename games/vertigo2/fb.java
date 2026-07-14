/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fb extends gp {
    int field_B;
    int field_x;
    int field_t;
    static boolean[][] field_w;
    int field_y;
    int field_C;
    int field_z;
    static StringBuilder field_D;
    static int field_E;
    static lg field_v;
    static String field_A;
    static cr field_u;

    abstract void a(int param0, int param1, int param2, int param3, int param4);

    abstract void a(int param0, int param1, int param2, int param3);

    final static void h(int param0) {
        field_D.setLength(param0);
        ui.field_g = 0;
    }

    final static boolean i(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == 11) {
          if (!sp.field_V) {
            if (ag.b(49)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (!vj.field_h) {
              L0: {
                if (!ag.b(49)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L0;
                }
              }
              return stackIn_10_0 != 0;
            } else {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              return stackIn_6_0 != 0;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_v = null;
        field_D = null;
        field_A = null;
        field_u = null;
        if (param0 < 91) {
          fb.a(-125, false);
          field_w = null;
          return;
        } else {
          field_w = null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        if (!(!tf.a((byte) 117))) {
            param1 = false;
        }
        d.a(69, param1);
        kp.i(param0);
    }

    fb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new boolean[][]{new boolean[11], new boolean[10]};
        field_D = new StringBuilder(80);
        field_E = 0;
        or discarded$0 = new or();
        field_A = "Lobby";
    }
}
