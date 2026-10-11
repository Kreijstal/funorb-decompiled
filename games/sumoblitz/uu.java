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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            uu.a((byte) -101);
          }
          stackIn_3_0 = sd.a(param1, 0, param1.length, 26564);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("uu.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
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
        this.field_B = null;
        this.field_w = null;
        this.field_z = null;
        this.field_A = null;
    }

    final static void c(boolean param0) {
        pl var2 = null;
        if (param0) {
          return;
        }
        pd var1 = (pd) (vu.field_g.b(103));
        if (var1 != null) {
          var2 = ig.field_a;
          var2.c(true);
          var2.c(true);
          var2.c(true);
          var2.c(true);
          var1.b(param0);
          return;
        }
        kk.a((byte) -110);
    }

    uu() {
    }

    static {
        field_l = new qr();
        field_s = "???";
    }
}
