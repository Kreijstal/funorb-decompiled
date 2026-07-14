/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jp {
    static String field_b;
    static int[] field_a;
    static String field_d;
    static String field_c;

    abstract byte[] a(int param0, int param1);

    abstract kj a(byte param0);

    public static void b(byte param0) {
        if (param0 >= -42) {
            return;
        }
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 > 110) {
          bn.field_I.a(param5, param0, param4, 256, param2);
          if (null != bo.field_h) {
            bo.field_h.a(param0, param6 + -di.field_a, param3, param6, (byte) -94, param0);
            return;
          } else {
            return;
          }
        } else {
          jp.b((byte) -3);
          bn.field_I.a(param5, param0, param4, 256, param2);
          if (null == bo.field_h) {
            return;
          } else {
            bo.field_h.a(param0, param6 + -di.field_a, param3, param6, (byte) -94, param0);
            return;
          }
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (null != eg.field_n) {
          if (null == eg.field_n.field_o) {
            eg.field_n = null;
            bj.field_d = null;
            var1 = -128 / ((-64 - param0) / 33);
            return;
          } else {
            eg.field_n.field_o.field_U = false;
            eg.field_n = null;
            bj.field_d = null;
            var1 = -128 / ((-64 - param0) / 33);
            return;
          }
        } else {
          eg.field_n = null;
          bj.field_d = null;
          var1 = -128 / ((-64 - param0) / 33);
          return;
        }
    }

    final static int a(String param0, int param1, boolean param2) {
        if (param1 == 8192) {
          if (param2) {
            return ie.field_G.c(param0);
          } else {
            return lm.field_o.c(param0);
          }
        } else {
          field_d = null;
          if (param2) {
            return ie.field_G.c(param0);
          } else {
            return lm.field_o.c(param0);
          }
        }
    }

    abstract int b(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_d = "You have not yet unlocked this option for use.";
        field_b = "Please remove <%0> from your friend list first.";
    }
}
