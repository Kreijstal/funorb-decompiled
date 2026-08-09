/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends cn {
    static int field_A;
    ln field_B;
    fs field_G;
    static String field_E;
    ln field_y;
    int field_z;
    static boolean field_C;
    static String field_D;
    static qr field_F;

    final static int e(int param0) {
        if (param0 >= -77) {
            field_F = (qr) null;
            return mr.field_a;
        }
        return mr.field_a;
    }

    public static void g(byte param0) {
        field_D = null;
        field_F = null;
        field_E = null;
        if (param0 != -106) {
            mg.g((byte) 34);
        }
    }

    final static qh d(int param0, int param1) {
        gb.field_n = new qh(420, 60, 200, param0 + rg.field_a * param1, vj.field_B.toUpperCase());
        fe var2 = new fe(-16 + (gb.field_n.field_k + 200), 2 + gb.field_n.field_t, 11, 11, -1, (bi) null, "X", 16711680);
        var2.field_h = gb.field_n;
        gb.field_n.a(var2, param0 ^ 20);
        lp var3 = new lp(gb.field_n.field_k + 9, gb.field_n.field_t + 20, 182, param1 * rg.field_a);
        gb.field_n.a(var3, param0 ^ 20);
        gb.field_n.field_z = var3;
        ph var4 = new ph(param1);
        gb.field_n.field_x = (jk) ((Object) var4);
        return gb.field_n;
    }

    mg(ln param0, ln param1, int param2) {
        try {
            this.field_B = param1;
            this.field_y = param0;
            this.field_z = param2;
            this.field_G = this.field_y.field_y;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    mg(ln param0, ln param1, fs param2, int param3) {
        try {
            this.field_z = param3;
            this.field_G = param2;
            this.field_y = param0;
            this.field_B = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static ln a(dc param0, ob param1, int param2) {
        RuntimeException var3 = null;
        ln stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 20) {
                break L1;
              } else {
                field_A = 35;
                break L1;
              }
            }
            stackIn_3_0 = gq.a(param0.field_g.field_e, -2284, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("mg.L(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_E = "<%0> wants to join";
        field_C = false;
        field_D = "Year";
    }
}
