/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_a;
    static hh field_b;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = EscapeVector.field_A;
        try {
          L0: {
            if (hg.b(12)) {
              boolean discarded$12 = pn.field_pb.a(true, (byte) -33, on.field_a, sm.field_b);
              pn.field_pb.m(0);
              L1: while (true) {
                if (!pn.p(-104)) {
                  break L0;
                } else {
                  boolean discarded$13 = pn.field_pb.a(jc.field_c, nk.field_n, (byte) -121);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == df.field_d) {
                  break L2;
                } else {
                  if (!df.field_d.field_c) {
                    break L2;
                  } else {
                    ri.a(-25123);
                    pn.field_pb.b((hm) (Object) new tm(pn.field_pb, ck.field_A), 69);
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "b.B(" + -103 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "TNT - Collide with object to detonate";
    }
}
