/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends wf {
    int field_r;
    int field_z;
    int field_u;
    int field_B;
    static int field_g;
    int field_v;
    int field_j;
    int field_k;
    int field_q;
    nh field_s;
    int field_x;
    int field_C;
    int field_i;
    bb field_y;
    si field_h;
    int field_n;
    int field_p;
    hb field_t;
    int field_o;
    int field_m;
    static boolean field_D;
    int field_w;
    int field_l;

    final static void a(byte param0) {
        l.field_d.b(-56, new jk());
        if (param0 >= -126) {
            kc.a((byte) -99);
        }
    }

    final static void a(int param0, int param1) {
        try {
            Object discarded$1 = null;
            Throwable var2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == -14226) {
                  discarded$1 = kj.a(param0 + 36328, "resizing", new Object[]{new Integer(param1)}, ha.b(param0 + 14293));
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            if (param0 != 104) {
                field_D = false;
            }
            param1.removeMouseListener(hi.field_e);
            param1.removeMouseMotionListener(hi.field_e);
            param1.removeFocusListener(hi.field_e);
            cg.field_k = 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "kc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(boolean param0) {
        this.field_s = null;
        if (param0) {
            return;
        }
        this.field_t = null;
        this.field_y = null;
        this.field_h = null;
    }

    kc() {
    }

    static {
        field_g = 256;
    }
}
