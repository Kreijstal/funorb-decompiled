/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd extends wc {
    boolean field_s;
    boolean field_m;
    static String[] field_v;
    boolean field_q;
    static dk field_p;
    float field_o;
    boolean field_t;
    static int field_n;
    static int[] field_l;
    static int field_r;
    static Boolean field_u;
    boolean field_w;
    boolean field_x;

    abstract qm c(float param0, int param1);

    abstract qm a(byte param0);

    abstract qm k(int param0);

    abstract qm a(float param0, boolean param1);

    final static hj b(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        hj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -63) {
            var3 = (String) null;
            wd.b((String) null, (byte) -20);
          }
          stackIn_3_0 = dl.a(fb.field_i, param0, false, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wd.TA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract qm a(int param0, float param1);

    abstract qm o(int param0);

    final static void a(boolean param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int[][] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HoldTheLine.field_D;
        try {
          if (!param0) {
            stackIn_4_0 = fk.field_b;
          } else {
            stackIn_4_0 = dl.field_k;
          }
          em.field_i = stackIn_4_0;
          if (param1 != 97) {
            return;
          }
          for (var2_int = 0; l.field_a.length > var2_int; var2_int++) {
            if (var2_int != 13) {
              ((ti) (l.field_a[var2_int])).e(-127);
            } else {
              ((ec) (l.field_a[var2_int])).a(true, 6267);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "wd.VA(" + param0 + ',' + param1 + ')');
        }
    }

    abstract qm h(int param0);

    public static void i(int param0) {
        field_u = null;
        field_v = null;
        if (param0 != -3369) {
          return;
        }
        field_p = null;
        field_l = null;
    }

    final static String j(int param0) {
        if (param0 != -14) {
          return (String) null;
        }
        return sg.field_Y;
    }

    abstract qm m(int param0);

    abstract qm a(float param0, int param1);

    abstract qm l(int param0);

    abstract qm c(boolean param0);

    abstract qm b(float param0, int param1);

    abstract qm n(int param0);

    wd() {
    }

    static {
        field_v = new String[255];
        field_l = new int[]{24576, 7560980, 8421504, 0};
    }
}
