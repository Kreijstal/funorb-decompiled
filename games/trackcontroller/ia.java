/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static rc field_b;
    static aa field_a;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
          field_b = (rc) null;
        }
    }

    final static int b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TrackController.field_F ? 1 : 0;
        try {
          if (param0) {
            stackIn_3_0 = 79;
            return stackIn_3_0;
          }
          gl.field_E.a(hf.field_d, true, param0, ra.field_z);
          gl.field_E.b(true);
          while (mh.e(127)) {
            gl.field_E.a(md.field_d, 3931, kg.field_d);
          }
          if (ra.field_v != -1) {
            var1_int = ra.field_v;
            qc.b(-1, (byte) -42);
            stackIn_9_0 = var1_int;
            return stackIn_9_0;
          }
          if (gh.field_k) {
            stackIn_12_0 = 3;
            return stackIn_12_0;
          }
          if (rk.field_X == oe.field_b) {
            stackIn_15_0 = 1;
            return stackIn_15_0;
          }
          if (!sa.field_Q.b((byte) 121)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (oe.field_b != fd.field_h) {
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_21_0 = 2;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "ia.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, wb param4) {
        try {
          da.field_n.a(!param0 ? true : false, param2, true, param3, param4, param1);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ia.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new aa(2, 4, 4, 0);
    }
}
