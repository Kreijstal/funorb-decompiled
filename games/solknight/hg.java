/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends gg {
    int field_z;
    int field_s;
    int field_k;
    fc field_p;
    int field_v;
    int field_l;
    int field_t;
    int field_i;
    static int field_F;
    int field_r;
    int field_j;
    static qf field_E;
    int field_n;
    int field_q;
    sh field_u;
    int field_x;
    int field_h;
    int field_o;
    g field_D;
    int field_A;
    qi field_w;
    static int field_y;
    int field_m;
    static int[] field_B;
    int field_C;

    final void a(byte param0) {
        this.field_D = null;
        if (param0 <= 90) {
            return;
        }
        this.field_w = null;
        this.field_u = null;
        this.field_p = null;
    }

    final static void a(int param0, String param1, String param2) {
        RuntimeException runtimeException = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              hc.a(param2, false, param1, false);
              if (param0 == 8192) {
                break L1;
              } else {
                var4 = (String) null;
                hg.a(40, (String) null, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    public static void a(int param0) {
        field_B = null;
        if (param0 != 8192) {
            hg.a(15);
            field_E = null;
            return;
        }
        field_E = null;
    }

    hg() {
    }

    static {
        field_F = 0;
        field_E = new qf();
        field_B = new int[8192];
    }
}
