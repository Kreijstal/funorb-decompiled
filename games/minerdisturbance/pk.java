/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static vm field_b;
    static ea field_d;
    static java.awt.Image field_a;
    static int field_i;
    static int[] field_f;
    static ea field_c;
    static ea[] field_h;
    static bj field_g;
    static volatile long field_e;

    final static void a(int param0, ea[] param1, int param2, boolean param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          if (param1 != null &&
            0 < param5) {
            var6_int = param1[0].field_x;
            var7 = param1[2].field_x;
            if (param3) {
              field_b = (vm) null;
            }
            var8 = param1[1].field_x;
            param1[0].b(param0, param4, param2);
            param1[2].b(-var7 + (param5 + param0), param4, param2);
            eh.b(en.field_b);
            eh.f(var6_int + param0, param4, param0 + (param5 - var7), param1[1].field_A + param4);
            var9 = var6_int + param0;
            var10 = -var7 + (param5 + param0);
            for (param0 = var9; var10 > param0; param0 = param0 + var8) {
              param1[1].b(param0, param4, param2);
            }
            eh.a(en.field_b);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("pk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < -77) {
          field_a = null;
          field_c = null;
          field_f = null;
          field_g = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    final static ih a(int param0, bj param1, byte param2, int param3, bj param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ih stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cn.a(param0, 258, param3, param1)) {
            stackIn_2_0 = null;
            return (ih) (stackIn_2_0);
          }
          if (param2 < 30) {
            field_g = (bj) null;
          }
          stackIn_6_0 = ge.a(param4.a(false, param3, param0), -569);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("pk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, int param3, vf param4, int param5) {
        Object stackIn_24_0 = null;
        Object stackIn_34_0 = null;
        java.awt.Frame stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        vk[] var10 = null;
        ia var11 = null;
        int var8Lifetime1;
        var9 = MinerDisturbance.field_ab;
        try {
          if (!param4.b((byte) 73)) {
            return null;
          }
          if (param1 == 0) {
            var10 = gn.a(-591, param4);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (var10[var8].field_f == param2 &&
                var10[var8].field_c == param3 && ((param5 == 0 ||
                param5 == var10[var8].field_b) &&
                (var7_int == 0 ||
                !(var10[var8].field_h <= param1)))) {
                param1 = var10[var8].field_h;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              stackIn_24_0 = null;
              return (java.awt.Frame) (stackIn_24_0);
            }
          }
          var11 = param4.a(param1, param5, param2, param3, (byte) -122);
          while (0 == var11.field_c) {
            gf.a(10L, -10309);
          }
          var7 = (java.awt.Frame) (var11.field_a);
          if (var7 == null) {
            return null;
          }
          if (var11.field_c == 2) {
            tf.a((byte) 108, param4, var7);
            stackIn_34_0 = null;
            return (java.awt.Frame) (stackIn_34_0);
          }
          var8Lifetime1 = -69 % ((-42 - param0) / 41);
          stackIn_36_0 = var7;
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_39_0 = var6_ref;
          stackIn_39_1 = new StringBuilder().append("pk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 < 102) {
          field_c = (ea) null;
        }
    }

    static {
        field_f = new int[8192];
        field_e = 0L;
    }
}
