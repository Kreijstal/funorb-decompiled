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
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = EscapeVector.field_A;
        try {
          if (!hg.b(12)) {
            if (null != df.field_d &&
              df.field_d.field_c) {
              ri.a(-25123);
              pn.field_pb.b(new tm(pn.field_pb, ck.field_A), 69);
            }
            return;
          }
          pn.field_pb.a(true, (byte) -33, on.field_a, sm.field_b);
          pn.field_pb.m(0);
          while (pn.p(-104)) {
            pn.field_pb.a(jc.field_c, nk.field_n, (byte) -121);
          }
          if (param0 < -31) {
            return;
          }
          field_a = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "b.B(" + param0 + ')');
        }
    }

    static {
        field_a = "TNT - Collide with object to detonate";
    }
}
