/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int field_c;
    static dl field_d;
    static String field_a;
    static db field_b;

    public static void a(int param0) {
        field_d = null;
        if (param0 > -101) {
          field_d = (dl) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static boolean b(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = uf.field_c;
        synchronized (var1_ref) {
          if (ah.field_g == td.field_d) {
            return false;
          }
          if (param0 > -1) {
            field_a = (String) null;
          }
          pj.field_q = re.field_o[td.field_d];
          c.field_p = tp.field_i[td.field_d];
          td.field_d = td.field_d + 1 & 127;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final static void a(byte param0) {
        cb.a(1148, le.b((byte) -20));
        if (param0 > -3) {
          ge.a((byte) -27);
        }
    }

    static {
    }
}
