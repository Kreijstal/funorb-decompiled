/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    static java.awt.Frame field_d;
    private int field_a;
    static volatile boolean field_b;
    static int field_c;

    final void a(int param0, char param1) {
        jaggl.OpenGL.glCallList(this.field_a - -param1);
        if (param0 != -23085) {
            this.a((byte) -107, -7);
        }
    }

    final void b(boolean param0) {
        jaggl.OpenGL.glEndList();
        if (param0) {
            this.field_a = -37;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 2) {
          L0: {
            field_c = 120;
            if (-1 == (param2 & 2048 ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param2 & 2048 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -32106) {
            return;
        }
        vn.field_f.a(0, 0, 0);
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            si.a(false, 22);
        }
    }

    final static void c(boolean param0) {
        kh.field_a = param0 ? true : false;
        za.a(34, new int[]{0, 19, 3, 22, 2, 14, 11}, 220, 210, 0, 430, (byte) -67);
        aa.field_b[0] = new nk(0);
    }

    final void a(byte param0, int param1) {
        jaggl.OpenGL.glNewList(param1 + this.field_a, 4864);
        int var3 = 89 / ((-23 - param0) / 54);
    }

    si(wl param0, int param1) {
        try {
            this.field_a = jaggl.OpenGL.glGenLists(param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "si.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = false;
    }
}
