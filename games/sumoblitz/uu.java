/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu extends ms {
    mf field_z;
    int field_D;
    int field_y;
    static qr field_l;
    int field_q;
    int field_C;
    mq field_w;
    int field_x;
    qp field_B;
    td field_A;
    int field_H;
    static String field_s;
    int field_v;
    int field_m;
    int field_p;
    int field_r;
    int field_t;
    int field_k;
    static ri field_o;
    int field_G;
    int field_u;
    int field_F;
    int field_E;
    int field_n;

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                uu.a((byte) -101);
                break L1;
              }
            }
            stackOut_2_0 = sd.a(param1, 0, param1.length, 26564);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("uu.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_o = null;
        field_l = null;
        field_s = null;
        if (param0 <= 70) {
            uu.a((byte) 17);
        }
    }

    final void a(int param0) {
        if (param0 != 0) {
            return;
        }
        ((uu) this).field_B = null;
        ((uu) this).field_w = null;
        ((uu) this).field_z = null;
        ((uu) this).field_A = null;
    }

    final static void c(boolean param0) {
        pd var1 = null;
        pl var2 = null;
        var1 = (pd) (Object) vu.field_g.b(103);
        if (var1 == null) {
          kk.a((byte) -110);
          return;
        } else {
          var2 = ig.field_a;
          int discarded$8 = var2.c(true);
          int discarded$9 = var2.c(true);
          int discarded$10 = var2.c(true);
          int discarded$11 = var2.c(true);
          var1.b(false);
          return;
        }
    }

    uu() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new qr();
        field_s = "???";
    }
}
