/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iw {
    static String field_a;
    static String field_b;
    static ica field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        lla stackIn_3_0 = null;
        lla stackOut_2_0 = null;
        lla stackOut_1_0 = null;
        L0: {
          if (param1) {
            stackOut_2_0 = new lla(ipa.field_O, fu.field_t);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = new lla(kh.field_p, lk.field_l);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        rm.field_e = stackIn_3_0;
        nra.field_c = new jea(0L, (jea) null);
        nra.field_c.b(param0 ^ 65, (jea) (Object) rm.field_e.field_a);
        nra.field_c.b(param0 ^ 68, bc.field_b);
        hf.field_a = new jea(0L, lma.field_r);
        if (param0 != -64) {
          iw.a((byte) 33, false);
          vs.field_R = new jea(0L, (jea) null);
          hf.field_a.b(param0 + -64, vca.field_e);
          hf.field_a.b(-122, vs.field_R);
          vs.field_R.b(-125, rra.field_e);
          vs.field_R.b(-124, fsa.field_q);
          hn.c(param1, param0 ^ -62);
          return;
        } else {
          vs.field_R = new jea(0L, (jea) null);
          hf.field_a.b(param0 + -64, vca.field_e);
          hf.field_a.b(-122, vs.field_R);
          vs.field_R.b(-125, rra.field_e);
          vs.field_R.b(-124, fsa.field_q);
          hn.c(param1, param0 ^ -62);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Quick Chat Help";
        field_b = "Play rated game";
        field_c = new ica();
    }
}
