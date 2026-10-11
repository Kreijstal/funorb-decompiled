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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 31465) {
            stackIn_4_0 = hb.a(0, -109, param2, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -46;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pi.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
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
        int var6 = HostileSpawn.field_I ? 1 : 0;
        ic var5 = (ic) (ch.field_p.g(-23));
        while (var5 != null) {
          if (~param3 == ~var5.field_j) {
            return var5;
          }
          var5 = (ic) (ch.field_p.a(12684));
        }
        ic var7 = new ic();
        if (param1 == 6413) {
          var7.field_q = param0;
          var7.field_j = param3;
          var7.field_h = param4;
          ch.field_p.a(var7, 112);
          rl.a(param2, var7, param1 + 746031541);
          return var7;
        }
        field_b = (bd) null;
        var7.field_q = param0;
        var7.field_j = param3;
        var7.field_h = param4;
        ch.field_p.a(var7, 112);
        rl.a(param2, var7, param1 + 746031541);
        return var7;
    }

    static {
        field_a = new bd[3];
    }
}
