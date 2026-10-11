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
        if (param0 != -8) {
          field_w = (he) null;
        }
    }

    final static he a(int param0, int param1, vj param2, int param3) {
        RuntimeException var4 = null;
        he stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9671) {
            stackIn_2_0 = (he) null;
            return stackIn_2_0;
          }
          if (fl.a(param3, param2, param0, (byte) -98)) {
            return uh.e(7786);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("cc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(int param0) {
        this.field_D = null;
        this.field_q = null;
        this.field_o = null;
        int var2 = 107 % ((0 - param0) / 47);
        this.field_C = null;
    }

    cc() {
    }

    static {
    }
}
