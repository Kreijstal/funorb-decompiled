/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends vg {
    static boolean field_j;
    static double field_h;
    int field_i;
    static vna field_g;
    static su field_f;

    public static void a(byte param0) {
        pc var2;
        field_f = null;
        if (param0 <= 56) {
          var2 = (pc) null;
          al.a((pc) null, 17, -109, (pc) null);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    al(int param0) {
        this.field_i = param0;
    }

    final static int a(pc param0, int param1, int param2, pc param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pc var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = qb.a(param0.field_e, param0.field_a, param3.field_a, param0.field_k, (byte) -81, param3.field_e, param0.field_d, param3.field_d, param1, param3.field_k);
              if (-1 <= var4_int) {
                break L1;
              } else {
                System.out.println("Uh oh, collide.lineseg_lineseg returned " + var4_int);
                var4_int = 0;
                System.out.println("collide.lineseg_lineseg(" + param0.field_d + ", " + param0.field_k + ", " + param0.field_e + ", " + param0.field_a + ", " + param3.field_d + ", " + param3.field_k + ", " + param3.field_e + ", " + param3.field_a + ", " + param1 + ")");
                break L1;
              }
            }
            L2: {
              if (param2 == 12) {
                break L2;
              } else {
                var5 = (pc) null;
                al.a((pc) null, 111, 55, (pc) null);
                break L2;
              }
            }
            stackIn_5_0 = var4_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("al.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    static {
        field_h = 0.0;
        field_g = new vna();
        field_f = new su(12, 0, 1, 0);
    }
}
