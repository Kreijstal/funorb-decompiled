/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf implements hd {
    static oa field_g;
    static String field_b;
    static int[] field_c;
    int field_e;
    static int field_d;
    static String field_f;
    int field_a;

    final static void a() {
        ij.c(4);
        if (!(null == kd.field_b)) {
            om.a(-46342, kd.field_b);
        }
        co.a(false);
        int discarded$16 = 1;
        lg.b();
        int discarded$23 = 27370;
        jk.a();
        if (!(!cm.a(-2043140287))) {
            da.field_p.c((byte) 33, 1);
            qn.a(0, 0);
        }
        r.a(-28036);
    }

    final static hj a(byte param0) {
        if (param0 >= -117) {
            field_c = null;
            return ai.field_c;
        }
        return ai.field_c;
    }

    final static int a(byte param0, int param1) {
        if (param1 != 0) {
          if (of.a(-969)) {
            if (param1 > ao.field_b) {
              return 1;
            } else {
              if (param0 <= 0) {
                hj discarded$4 = pf.a((byte) -18);
                return 0;
              } else {
                return 0;
              }
            }
          } else {
            return 2;
          }
        } else {
          if (param1 > ao.field_b) {
            return 1;
          } else {
            if (param0 <= 0) {
              hj discarded$5 = pf.a((byte) -18);
              return 0;
            } else {
              return 0;
            }
          }
        }
    }

    public final int a(byte param0, hd param1) {
        pf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var3 = (pf) (Object) param1;
              var4 = -(var3.field_e * var3.field_a) + var3.field_e * var3.field_a;
              if (param0 == -101) {
                break L1;
              } else {
                int discarded$2 = pf.a((byte) 83, 126);
                break L1;
              }
            }
            L2: {
              if (var4 != 0) {
                break L2;
              } else {
                var4 = var3.field_a * var3.field_a + (-(var3.field_a * var3.field_a) + var3.field_e * var3.field_e) - var3.field_e * var3.field_e;
                break L2;
              }
            }
            stackOut_4_0 = var4;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("pf.C(").append(param0).append(44);
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
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    public static void b(byte param0) {
        field_b = null;
        field_g = null;
        field_f = null;
        if (param0 <= 8) {
            pf.b((byte) -9);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Orb points: <%0>";
        field_c = new int[]{0, 2, 4, 7};
        field_f = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
