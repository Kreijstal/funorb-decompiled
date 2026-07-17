/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends gi {
    static String field_p;
    int field_F;
    int field_A;
    int field_k;
    int field_t;
    int field_j;
    int field_u;
    int field_n;
    vk field_C;
    int field_h;
    int field_x;
    static int field_B;
    static he field_w;
    ri field_q;
    int field_z;
    int field_E;
    int field_m;
    int field_i;
    int field_l;
    ag field_D;
    ig field_o;
    int field_s;
    int field_v;
    static he[] field_y;
    int field_r;

    public static void a(byte param0) {
        field_w = null;
        field_y = null;
        field_p = null;
    }

    final static he a(int param0, int param1, vj param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          if (param1 == -9671) {
            if (fl.a(param3, param2, param0, (byte) -98)) {
              return uh.e(7786);
            } else {
              return null;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (he) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("cc.B(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L0;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L0;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
    }

    final void d(int param0) {
        ((cc) this).field_D = null;
        ((cc) this).field_q = null;
        ((cc) this).field_o = null;
        int var2 = 107 % ((0 - param0) / 47);
        ((cc) this).field_C = null;
    }

    cc() {
    }

    static {
    }
}
