/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static ci field_b;
    static int[] field_c;
    static long[] field_d;
    static boolean field_a;

    final static void a(byte param0) {
        int var1 = qd.a(false);
        int var2 = nj.b(3);
        de.field_c.a(vh.field_g - o.field_f, (o.field_f << 1) + var1, var2 + (bb.field_b << 1), true, -bb.field_b + id.field_c);
        le.a((byte) -115);
        if (param0 == 6) {
          return;
        }
        field_b = (ci) null;
    }

    final static void a(int param0) {
        if (param0 != -393711775) {
          field_b = (ci) null;
          if (pi.field_d != null) {
            if (null != pi.field_d.field_k) {
              pi.field_d.field_k.field_gb = false;
            }
            ud.field_d = null;
            pi.field_d = null;
            return;
          }
          ud.field_d = null;
          pi.field_d = null;
          return;
        }
        if (pi.field_d == null) {
          ud.field_d = null;
          pi.field_d = null;
          return;
        }
        if (null != pi.field_d.field_k) {
          pi.field_d.field_k.field_gb = false;
          ud.field_d = null;
          pi.field_d = null;
          return;
        }
        ud.field_d = null;
        pi.field_d = null;
    }

    final static boolean a(int param0, p param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.i(-111);
          stackIn_3_0 = (~var2_int != param0) ? 0 : 1;
          var3 = stackIn_3_0;
          stackIn_4_0 = var3;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("fi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 < 123) {
          field_b = (ci) null;
        }
    }

    static {
        field_d = new long[32];
    }
}
