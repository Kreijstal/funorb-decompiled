/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dl extends pa {
    boolean field_v;
    static ed field_w;
    static dd field_s;
    boolean field_r;
    static String field_u;
    volatile boolean field_q;
    static fh field_t;

    abstract int f(int param0);

    public static void h(int param0) {
        field_s = null;
        field_t = null;
        field_w = null;
        field_u = null;
        if (param0 != 2) {
          dl.h(-20);
        }
    }

    abstract byte[] g(int param0);

    final static n a(int param0, int param1, int param2, rh param3, rh param4) {
        RuntimeException var5 = null;
        n stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            field_u = (String) null;
          }
          if (!ha.a(param4, -32180, param2, param0)) {
            return null;
          }
          stackIn_6_0 = pd.a(param3.a(param2, (byte) 122, param0), true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    dl() {
        this.field_q = true;
    }

    static {
        field_w = new ed();
        field_u = "<%0>Balloons & landing pad:<%1> will carry one flea upwards until it reaches the landing pad. On its way, it will not affect anything and will pass in front of any obstacles. One use only.";
        field_t = new fh(10, 2, 2, 0);
    }
}
