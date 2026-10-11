/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends kg {
    static int field_lb;
    String field_mb;
    static int[][][] field_nb;
    String field_F;
    int field_ob;

    qk() {
        super(0L, (kg) null);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 < 0) {
            var8_int = 127;
          } else {
            var8_int = ll.field_e[param0][param6][param3];
          }
          var9 = param1 - param7;
          var10 = param2 - param5;
          if (var10 < 0) {
            var10 = -var10;
          }
          var11 = 0;
          var12 = -43 % ((param4 - 57) / 60);
          if (var9 < 0) {
            var9 = -var9;
          }
          if (var9 >= 32) {
            var9 = -var9 + 64;
          }
          if (var9 > 64) {
            stackIn_14_0 = -1;
            return stackIn_14_0;
          }
          if (16 < var9) {
            stackIn_17_0 = 0;
            return stackIn_17_0;
          }
          if (var10 * 64 > 240) {
            stackIn_21_0 = 0;
            return stackIn_21_0;
          }
          var10 = var10 * 4 + 1;
          var13 = var9 * var9 + var10 * var10;
          var14 = 0;
          while (var13 > 0) {
            var13 = var13 >> 1;
            var14++;
          }
          var11Lifetime1 = -var14 + 9;
          var11Lifetime1 = var11Lifetime1 * var8_int >> 3;
          stackIn_26_0 = var11Lifetime1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var8), "qk.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static ka a(String param0, String param1, lj param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ka stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(param0, param3 ^ -117);
          if (param3 != 0) {
            qk.d((byte) -119);
          }
          var5 = param2.a(var4_int, param1, (byte) 115);
          stackIn_3_0 = jj.a((byte) 62, param2, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qk.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void d(byte param0) {
        if (null != da.field_c) {
          da.field_c.o(77);
        }
        m.field_j = new ib();
        if (param0 < -43) {
          bg.field_K.c(0, m.field_j);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        ll.a(param1, true, param0);
    }

    public static void c(boolean param0) {
        if (param0) {
          return;
        }
        field_nb = (int[][][]) null;
    }

    static {
        field_nb = new int[][][]{new int[][]{new int[]{0, 0}, new int[]{0, 219}}, new int[][]{new int[]{59, 160}, new int[]{122, 72}}, new int[][]{new int[]{0, 219}, new int[]{159, 79}}, new int[][]{new int[]{37, 186}, new int[]{101, 67}}, new int[][]{new int[]{119, 79}, new int[]{0, 79}}};
    }
}
