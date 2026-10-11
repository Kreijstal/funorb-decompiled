/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends le {
    le field_k;
    fn field_n;
    int field_i;
    static char[] field_o;
    static int field_m;
    static double field_j;
    static vn field_h;
    static vn field_p;
    static int[] field_q;
    static int field_l;

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ng.field_a != null) {
            ng.field_a.field_I.a(param1, (byte) 53);
          }
          if (param0) {
            hn.c((byte) -67);
          }
          if (ni.field_c == null) {
            return;
          }
          ni.field_c.field_I.a(param1, (byte) 76);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("hn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_q = null;
        int var1 = 94 / ((param0 + 33) / 38);
        field_p = null;
        field_h = null;
        field_o = null;
    }

    final static void a(int param0, int param1, mf param2, int param3) {
        if (param0 != 1780) {
          return;
        }
        try {
          cl.field_b = param2;
          pg.field_o = param3;
          el.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hn.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = -43 % ((param1 + 28) / 38);
        mo.field_b = param0;
        ff.field_a = param2;
    }

    hn(fn param0, le param1) {
        try {
          this.field_n = param0;
          this.field_i = param0.k();
          this.field_k = param1;
          this.field_n.g(128 + this.field_i * ge.field_c >> 8);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 71;
        field_o = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_j = Math.atan2(1.0, 0.0);
        field_q = new int[]{-1, 160, 342, 435};
        field_l = 8;
        field_p = new vn(720, 560);
    }
}
