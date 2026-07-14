/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mn implements Iterator {
    static vh field_e;
    static int field_a;
    private rg field_b;
    static int field_g;
    private rg field_c;
    static String field_d;
    private qi field_f;

    final static kf a(int param0, nb param1) {
        kf var2 = null;
        var2 = new kf(param1, (ma) (Object) param1);
        oj.field_o.b((byte) -74, (ma) (Object) var2);
        if (param0 != -24296) {
          mn.a(-16);
          qf.field_d.b((kd) (Object) param1);
          return var2;
        } else {
          qf.field_d.b((kd) (Object) param1);
          return var2;
        }
    }

    public final boolean hasNext() {
        return ((mn) this).field_f.field_d != ((mn) this).field_c;
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            mn.a(69);
            if (ig.field_j.a(114)) {
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
            if (ig.field_j.a(114)) {
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

    public final void remove() {
        if (!(null != ((mn) this).field_b)) {
            throw new IllegalStateException();
        }
        ((mn) this).field_b.a(false);
        ((mn) this).field_b = null;
    }

    public final Object next() {
        rg var1 = ((mn) this).field_c;
        if (((mn) this).field_f.field_d == var1) {
            var1 = null;
            ((mn) this).field_c = null;
        } else {
            ((mn) this).field_c = var1.field_q;
        }
        ((mn) this).field_b = var1;
        return (Object) (Object) var1;
    }

    public static void a(int param0) {
        if (param0 != 19000) {
            field_g = 83;
            field_e = null;
            field_d = null;
            return;
        }
        field_e = null;
        field_d = null;
    }

    mn(qi param0) {
        ((mn) this).field_b = null;
        ((mn) this).field_f = param0;
        ((mn) this).field_c = ((mn) this).field_f.field_d.field_q;
        ((mn) this).field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Catching breath!";
    }
}
