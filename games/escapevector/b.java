/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_a;
    static hh field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 118) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        var2 = EscapeVector.field_A;
        if (hg.b(12)) {
          boolean discarded$2 = pn.field_pb.a(true, (byte) -33, on.field_a, sm.field_b);
          pn.field_pb.m(0);
          L0: while (true) {
            if (!pn.p(-104)) {
              if (param0 >= -31) {
                field_a = null;
                return;
              } else {
                return;
              }
            } else {
              boolean discarded$3 = pn.field_pb.a(jc.field_c, nk.field_n, (byte) -121);
              continue L0;
            }
          }
        } else {
          if (null != df.field_d) {
            if (!df.field_d.field_c) {
              return;
            } else {
              ri.a(-25123);
              pn.field_pb.b((hm) (Object) new tm(pn.field_pb, ck.field_A), 69);
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "TNT - Collide with object to detonate";
    }
}
