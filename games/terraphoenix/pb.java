/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static jj field_a;
    static String field_c;
    static int field_b;

    final static ci[] a(int param0, boolean param1, int param2, fa param3) {
        RuntimeException var4 = null;
        ci[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vh.a(param0, param2, param3, true)) {
            return null;
          }
          if (param1) {
            pb.a((byte) 72);
          }
          stackIn_6_0 = dj.c(-9);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("pb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static String a(byte param0) {
        if (qe.field_f == ua.field_d) {
          return ra.field_m;
        }
        if (param0 != -47) {
          return (String) null;
        }
        if (pe.field_a == ua.field_d) {
          return vh.field_l;
        }
        if (vc.field_a.a(param0 ^ 78)) {
          return ol.field_Hb;
        }
        return vh.field_l;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -22970) {
          pb.a((byte) -7);
        }
    }

    static {
        field_a = new jj();
        field_c = "Please check if address is correct";
    }
}
