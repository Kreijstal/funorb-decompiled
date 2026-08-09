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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 31465) {
              stackIn_4_0 = hb.a(0, -109, param2, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -46;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("pi.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
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
        ic var5;
        int var6;
        ic var7;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var5 = (ic) ((Object) ch.field_p.g(-23));
        L0: while (true) {
          if (var5 == null) {
            var7 = new ic();
            if (param1 != 6413) {
              field_b = (bd) null;
              var7.field_q = param0;
              var7.field_j = param3;
              var7.field_h = param4;
              ch.field_p.a(var7, 112);
              rl.a(param2, var7, param1 + 746031541);
              return var7;
            } else {
              var7.field_q = param0;
              var7.field_j = param3;
              var7.field_h = param4;
              ch.field_p.a(var7, 112);
              rl.a(param2, var7, param1 + 746031541);
              return var7;
            }
          } else {
            if ((param3 ^ -1) != (var5.field_j ^ -1)) {
              var5 = (ic) ((Object) ch.field_p.a(12684));
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    static {
        field_a = new bd[3];
    }
}
