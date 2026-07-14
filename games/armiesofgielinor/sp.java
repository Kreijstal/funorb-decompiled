/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sp implements Iterator {
    static String field_d;
    private ms field_a;
    private wg field_c;
    static String field_g;
    static int field_b;
    private ms field_f;
    static double field_e;

    final static java.awt.Container a(int param0) {
        if (!(null == g.field_f)) {
            return (java.awt.Container) (Object) g.field_f;
        }
        if (param0 != 0) {
            field_g = null;
            return (java.awt.Container) (Object) ag.d((byte) -124);
        }
        return (java.awt.Container) (Object) ag.d((byte) -124);
    }

    final static d a(kl param0, int param1, int param2, int param3, kl param4) {
        if (param2 == 0) {
          if (!kp.a(false, param3, param0, param1)) {
            return null;
          } else {
            return gm.a(param4.a((byte) 58, param1, param3), 126);
          }
        } else {
          field_e = 2.5194855074937275;
          if (!kp.a(false, param3, param0, param1)) {
            return null;
          } else {
            return gm.a(param4.a((byte) 58, param1, param3), 126);
          }
        }
    }

    public final void remove() {
        if (!(null != ((sp) this).field_a)) {
            throw new IllegalStateException();
        }
        ((sp) this).field_a.c((byte) -76);
        ((sp) this).field_a = null;
    }

    final static je b(byte param0) {
        if (param0 >= -80) {
            je discarded$0 = sp.b((byte) -47);
            return bv.field_x.field_Jb;
        }
        return bv.field_x.field_Jb;
    }

    public final boolean hasNext() {
        return ((sp) this).field_f != ((sp) this).field_c.field_f;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 > -60) {
            je discarded$0 = sp.b((byte) -85);
            field_g = null;
            return;
        }
        field_g = null;
    }

    public final Object next() {
        ms var1 = ((sp) this).field_f;
        if (((sp) this).field_c.field_f != var1) {
            ((sp) this).field_f = var1.field_s;
        } else {
            var1 = null;
            ((sp) this).field_f = null;
        }
        ((sp) this).field_a = var1;
        return (Object) (Object) var1;
    }

    sp(wg param0) {
        ((sp) this).field_a = null;
        ((sp) this).field_c = param0;
        ((sp) this).field_a = null;
        ((sp) this).field_f = ((sp) this).field_c.field_f.field_s;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This unit has no use for this accessory.";
        field_g = "Drawn";
        field_b = 0;
        field_e = 0.0;
    }
}
