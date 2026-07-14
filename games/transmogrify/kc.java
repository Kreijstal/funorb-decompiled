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
        l.field_d.b(-56, (qg) (Object) new jk());
        if (param0 >= -126) {
            kc.a((byte) -99);
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param0 == -14226) {
                Object discarded$1 = kj.a(param0 + 36328, "resizing", new Object[1], ha.b(param0 + 14293));
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        if (param0 != 104) {
          field_D = false;
          param1.removeMouseListener((java.awt.event.MouseListener) (Object) hi.field_e);
          param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hi.field_e);
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) hi.field_e);
          cg.field_k = 0;
          return;
        } else {
          param1.removeMouseListener((java.awt.event.MouseListener) (Object) hi.field_e);
          param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hi.field_e);
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) hi.field_e);
          cg.field_k = 0;
          return;
        }
    }

    final void b(boolean param0) {
        ((kc) this).field_s = null;
        if (param0) {
            return;
        }
        ((kc) this).field_t = null;
        ((kc) this).field_y = null;
        ((kc) this).field_h = null;
    }

    kc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 256;
    }
}
