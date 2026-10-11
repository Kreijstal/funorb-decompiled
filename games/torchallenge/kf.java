/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static int field_b;
    static k field_e;
    static int field_c;
    static ji field_a;
    static int field_d;

    final static void a(int param0, bf param1) {
        int var2_int = 0;
        bf var3 = null;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param1.field_n == null) {
          return;
        }
        if (param1.field_k != 0 ||
          param1.field_m != 0) {
          for (var2_int = 0; vd.field_f > var2_int; var2_int++) {
            var3 = we.field_i[var2_int];
            if (var3.field_b == 2 &&
              param1.field_k == var3.field_k &&
              var3.field_m == param1.field_m) {
              return;
            }
          }
        }
        if (param1.field_j == null) {
        }
        if (param0 != 1) {
          return;
        }
        try {
          ib.a(true, param1);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 >= -69) {
          field_d = -39;
        }
    }

    final static int a(qe param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3_intLifetime1;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var4 = -1;
          var5 = 0;
          if (!vg.a(param0.field_F, -1)) {
            if (param2 != 8) {
              field_d = 52;
            }
            stackIn_38_0 = -1;
            return stackIn_38_0;
          }
          if (n.field_kb == null) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (param0.field_H >= 0 &&
            param0.field_H < ol.field_g.field_a &&
            n.field_kb[param0.field_o][param0.field_H] == null) {
            n.field_kb[param0.field_o][param0.field_H] = new int[8];
            for (var3_int = 0; var3_int < 8; var3_int++) {
              n.field_kb[param0.field_o][param0.field_H][var3_int] = -1;
            }
            n.field_kb[param0.field_o][param0.field_H][0] = param1;
            stackIn_13_0 = 1;
            return stackIn_13_0;
          }
          if (param0.field_H >= 0 &&
            param0.field_H < ol.field_g.field_a &&
            n.field_kb[param0.field_o][param0.field_H] != null) {
            var7 = 0;
            var3_intLifetime1 = var7;
            while (8 > var7) {
              if (n.field_kb[param0.field_o][param0.field_H][var7] == param1) {
                stackIn_21_0 = 1;
                return stackIn_21_0;
              }
              if (n.field_kb[param0.field_o][param0.field_H][var7] < 0 &&
                var4 < 0) {
                var4 = var7;
              }
              var7++;
            }
            if (var4 < 0) {
              return 1;
            }
            n.field_kb[param0.field_o][param0.field_H][var4] = param1;
            stackIn_32_0 = 1;
            return stackIn_32_0;
          }
          stackIn_34_0 = -1;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("kf.A(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = new k(13, 0, 1, 0);
        field_d = 0;
        field_a = null;
    }
}
