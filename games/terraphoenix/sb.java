/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends uf {
    static ci field_p;
    static int field_j;
    static String field_k;
    static String field_n;
    static int[] field_m;
    static jj field_h;
    static String field_l;
    static int field_i;
    byte[] field_o;

    public static void c(byte param0) {
        field_n = null;
        field_m = null;
        field_p = null;
        field_k = null;
        field_h = null;
        field_l = null;
        if (param0 != 29) {
          field_h = (jj) null;
        }
    }

    final static qj a(boolean param0, byte[] param1) {
        qj var2 = null;
        RuntimeException var2_ref = null;
        qj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            sb.c((byte) -62);
          }
          if (param1 == null) {
            return null;
          }
          var2 = new qj(param1, ha.field_s, hj.field_K, field_m, rf.field_p, wb.field_a, qc.field_b);
          mj.a((byte) 95);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("sb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    sb(byte[] param0) {
        try {
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Research this topic";
        field_n = "ACT I, Reconstruction";
        field_l = "Members' Benefits";
    }
}
