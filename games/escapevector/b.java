/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_a;
    static PcmSample field_b;

    public static void releaseStatics(byte guard) {
        field_b = null;
        if (guard != 118) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          if (!IntrusiveNode.b(12)) {
            if (null != IsaacRandom.field_d &&
              IsaacRandom.field_d.field_c) {
              ri.a(-25123);
              pn.field_pb.b(new tm(pn.field_pb, ck.field_A), 69);
            }
            return;
          }
          pn.field_pb.handlePointerFrame(true, (byte) -33, on.field_a, DebouncedValidator.field_b);
          pn.field_pb.m(0);
          while (pn.p(-104)) {
            pn.field_pb.handleKey(jc.field_c, PasswordValidator.field_n, (byte) -121);
          }
          if (param0 < -31) {
            return;
          }
          field_a = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "b.B(" + param0 + ')');
        }
    }

    static {
        field_a = "TNT - Collide with object to detonate";
    }
}
