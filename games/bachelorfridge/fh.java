/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends bw {
    int field_h;
    je field_z;
    int field_t;
    int field_m;
    int field_q;
    static int field_v;
    static du field_i;
    int field_A;
    int field_x;
    int field_n;
    int field_l;
    int field_p;
    int field_u;
    static String field_s;
    be field_f;
    int field_w;
    int field_k;
    eka field_j;
    int field_y;
    int field_o;
    int field_C;
    int field_g;
    un field_B;
    int field_r;

    public static void c(byte param0) {
        field_s = null;
        field_i = null;
        if (param0 != 73) {
            field_v = 58;
        }
    }

    final void a(int param0) {
        this.field_j = null;
        this.field_B = null;
        this.field_f = null;
        int var2 = 64 / ((-2 - param0) / 40);
        this.field_z = null;
    }

    final static kv[] a(String param0, vr param1, String param2, int param3) {
        kv[] var4 = null;
        RuntimeException var4_ref = null;
        kv[] var5 = null;
        kv[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = pi.a(param1, -8845, param2, param0);
            var4 = var5;
            var5[1].field_n = var5[1].field_q;
            var5[3].field_o = var5[3].field_p;
            var5[param3].field_n = var5[7].field_q;
            var5[5].field_o = var5[5].field_p;
            stackIn_1_0 = (kv[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("fh.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    fh() {
    }

    static {
        field_i = new du(0, 2, 2, 1);
        field_s = "Withdraw request to join <%0>'s game";
    }
}
