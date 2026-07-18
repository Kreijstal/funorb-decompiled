/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends vi {
    static long field_q;
    static jp[] field_r;
    private int field_u;
    vl field_p;
    static String field_s;
    int field_t;

    public static void b() {
        field_r = null;
        field_s = null;
    }

    final int a(int param0, StringBuilder param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ee var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -1437511254;
              var3_int = var3_int + (73 + ((cl) this).field_u * 71 << 3);
              var3_int = var3_int ^ ((cl) this).field_t * 21 - -29298 << 9;
              if (param0 >= 79) {
                break L1;
              } else {
                ((cl) this).field_u = 98;
                break L1;
              }
            }
            var4 = (ee) (Object) ((cl) this).field_p.d(-103);
            L2: while (true) {
              if (var4 == null) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = var3_int ^ var4.a(92, param1);
                var4 = (ee) (Object) ((cl) this).field_p.a((byte) 116);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("cl.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    cl() {
        super(0, 0, 0, 0, 0);
        ((cl) this).field_p = new vl();
    }

    final void a(int param0, wq param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ee var4 = null;
        int var5 = 0;
        Object var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ((cl) this).field_u = param1.l(255);
              ((cl) this).field_p.c((byte) -72);
              ((cl) this).field_t = 0;
              var3_int = 0;
              if (param0 >= 89) {
                break L1;
              } else {
                var6 = null;
                ((cl) this).a(-40, (wq) null);
                break L1;
              }
            }
            L2: while (true) {
              if (((cl) this).field_u <= var3_int) {
                break L0;
              } else {
                var4 = new ee();
                var4.a(91, param1);
                ((cl) this).field_p.a((nm) (Object) var4, (byte) 3);
                ((cl) this).field_t = ((cl) this).field_t + var4.field_t;
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("cl.L(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "The invitation has been withdrawn.";
    }
}
