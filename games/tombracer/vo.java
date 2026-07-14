/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo {
    private boolean field_a;
    private int field_g;
    static boolean field_b;
    int field_e;
    cka field_h;
    private int field_d;
    private boolean field_c;
    static int field_f;

    final static jea e(int param0) {
        if (param0 != 35040) {
            return null;
        }
        return nsa.field_i.field_tb;
    }

    final void a(int param0, byte[] param1, int param2) {
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        byte[] stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        byte[] stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        byte[] stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        byte[] stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        byte[] stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte[] stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        ((vo) this).d(34963);
        if (param2 > ((vo) this).field_g) {
          L0: {
            stackOut_2_0 = ((vo) this).field_d;
            stackOut_2_1 = param2;
            stackOut_2_2 = (byte[]) param1;
            stackOut_2_3 = 0;
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_4_2 = stackOut_2_2;
            stackIn_4_3 = stackOut_2_3;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            if (((vo) this).field_a) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = (byte[]) (Object) stackIn_4_2;
              stackOut_4_3 = stackIn_4_3;
              stackOut_4_4 = 35040;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = (byte[]) (Object) stackIn_3_2;
              stackOut_3_3 = stackIn_3_3;
              stackOut_3_4 = 35044;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_5_4 = stackOut_3_4;
              break L0;
            }
          }
          jaggl.OpenGL.glBufferDataARBub(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4);
          ((vo) this).field_h.field_mb = ((vo) this).field_h.field_mb + (-((vo) this).field_g + param2);
          ((vo) this).field_g = param2;
          var4 = -114 / ((param0 - -27) / 51);
          return;
        } else {
          jaggl.OpenGL.glBufferSubDataARBub(((vo) this).field_d, 0, param2, param1, 0);
          var4 = -114 / ((param0 - -27) / 51);
          return;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(((vo) this).field_c)) {
            ((vo) this).field_h.d(-31014, ((vo) this).field_e, ((vo) this).field_g);
            ((vo) this).field_c = true;
        }
        super.finalize();
    }

    abstract void d(int param0);

    vo(cka param0, int param1, byte[] param2, int param3, boolean param4) {
        ((vo) this).field_c = false;
        ((vo) this).field_h = param0;
        ((vo) this).field_a = param4 ? true : false;
        ((vo) this).field_d = param1;
        ((vo) this).field_g = param3;
        jaggl.OpenGL.glGenBuffersARB(1, lc.field_N, 0);
        ((vo) this).field_e = lc.field_N[0];
        ((vo) this).d(34963);
        jaggl.OpenGL.glBufferDataARBub(param1, ((vo) this).field_g, param2, 0, ((vo) this).field_a ? 35040 : 35044);
        ((vo) this).field_h.field_mb = ((vo) this).field_h.field_mb + ((vo) this).field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
