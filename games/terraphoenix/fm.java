/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static bh field_b;
    static String field_a;

    final static ud a(byte[] param0, int param1) {
        ud var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ud stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (ud) (stackIn_2_0);
          }
          if (param1 <= 25) {
            fm.b(-84);
          }
          var2 = new ud(param0, ha.field_s, hj.field_K, sb.field_m, rf.field_p, qc.field_b);
          mj.a((byte) 101);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("fm.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static kf[] a(boolean param0) {
        if (!param0) {
          return new kf[]{te.field_g, gf.field_u, gm.field_j};
        }
        fm.a(47);
        return new kf[]{te.field_g, gf.field_u, gm.field_j};
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -19266) {
          field_a = (String) null;
        }
    }

    final static gd a(int param0) {
        if (param0 != -32218) {
          return (gd) null;
        }
        return new gd(vl.b(3), kf.a(false));
    }

    static {
        field_a = "Create";
    }
}
