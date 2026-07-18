/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    int field_x;
    bi field_c;
    int field_A;
    int field_s;
    bi field_e;
    bi field_b;
    pf field_i;
    lo field_m;
    int field_g;
    bi field_r;
    bi field_p;
    bi field_v;
    static bi[] field_a;
    bi field_o;
    int field_w;
    int[] field_u;
    static int field_z;
    int[] field_f;
    boolean[] field_h;
    bi field_n;
    int field_k;
    static fg field_l;
    bi field_d;
    um field_q;
    String field_t;
    static String field_j;
    static int[] field_y;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (sr.field_h) {
              L1: {
                if (em.field_h != 2) {
                  break L1;
                } else {
                  if (null == nd.field_k) {
                    break L1;
                  } else {
                    var3 = (CharSequence) (Object) param1;
                    int discarded$2 = 1;
                    if (!nd.field_k.equals((Object) (Object) ji.a(var3))) {
                      break L1;
                    } else {
                      var2_int = -10 % ((param0 - -1) / 38);
                      stackOut_9_0 = 1;
                      stackIn_10_0 = stackOut_9_0;
                      break L0;
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("fs.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 4) {
          var2 = null;
          boolean discarded$2 = fs.a(-14, (String) null);
          field_y = null;
          field_j = null;
          field_l = null;
          field_a = null;
          return;
        } else {
          field_y = null;
          field_j = null;
          field_l = null;
          field_a = null;
          return;
        }
    }

    final static void a(byte param0, boolean param1) {
        gr.a(true, param1, 0);
    }

    final static void a(int param0, int param1) {
        ol.field_e = param0;
        ri.field_O = param1;
    }

    fs(int param0, String param1, int param2, int param3, int param4) {
        try {
            ((fs) this).field_k = param3;
            ((fs) this).field_s = param4;
            ((fs) this).field_x = param0;
            ((fs) this).field_g = param2;
            ((fs) this).field_t = param1;
            ((fs) this).field_i = new pf();
            ((fs) this).field_w = 0;
            ((fs) this).field_f = null;
            ((fs) this).field_u = new int[4];
            ((fs) this).field_h = null;
            ((fs) this).field_A = 0;
            ((fs) this).field_m = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "fs.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 360;
        field_l = new fg();
        field_j = "Breaking real-world laws";
    }
}
