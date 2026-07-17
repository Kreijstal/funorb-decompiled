/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static bd field_b;
    static bd[] field_a;
    static bd field_c;

    final static int a(int param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 31465) {
              stackOut_3_0 = hb.a(0, -109, param2, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -46;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("pi.B(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            pi.a(-10);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static ic a(int param0, int param1, int param2, int param3, int param4) {
        ic var5 = null;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var5 = (ic) (Object) ch.field_p.g(-23);
        L0: while (true) {
          if (var5 == null) {
            var5 = new ic();
            if (param1 != 6413) {
              field_b = null;
              var5.field_q = param0;
              var5.field_j = param3;
              var5.field_h = 1;
              ch.field_p.a((am) (Object) var5, 112);
              rl.a(param2, var5, param1 + 746031541);
              return var5;
            } else {
              var5.field_q = param0;
              var5.field_j = param3;
              var5.field_h = 1;
              ch.field_p.a((am) (Object) var5, 112);
              rl.a(param2, var5, param1 + 746031541);
              return var5;
            }
          } else {
            if (param3 == var5.field_j) {
              return var5;
            } else {
              var5 = (ic) (Object) ch.field_p.a(12684);
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new bd[3];
    }
}
