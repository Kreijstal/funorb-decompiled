/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lo {
    static byte[][][] field_c;
    int field_a;
    int field_h;
    int field_e;
    int field_b;
    int field_d;
    int field_g;
    static long field_f;

    final static sm[] a(wj param0, byte param1) {
        int var5 = 0;
        Object stackIn_3_0 = null;
        sm[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        sm[] var4 = null;
        sm var6 = null;
        int var6_int = 0;
        int var7 = 0;
        vh var8 = null;
        var7 = DungeonAssault.field_K;
        try {
          var2_int = param0.j(76, 8);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (sm[]) (stackIn_3_0);
          }
          var3 = param0.j(-80, 12);
          var4 = new sm[var3];
          if (param1 >= -109) {
            var8 = (vh) null;
            lo.a(-66, true, (vh) null, -109, 2);
          }
          for (var5 = 0; var3 > var5; var5++) {
            if (jl.a(param0, -125)) {
              var6 = new sm();
              param0.j(74, 24);
              param0.j(110, 24);
              var6.field_d = param0.j(-66, 24);
              param0.j(-79, 9);
              param0.j(-75, 12);
              param0.j(83, 12);
              param0.j(-66, 12);
              var4[var5] = var6;
            } else {
              var6_int = param0.j(-117, hh.a(1, -1 + var5));
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("lo.O(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = DungeonAssault.field_K;
        try {
          while (true) {
            param0--;
            if (0 > param0) {
              if (param4 == 0) {
                return;
              }
              var17 = (int[]) null;
              lo.a(-38, 98, 90, 94, -49, -128, (int[]) null, -44, -86, 68);
              return;
            }
            var18 = param6;
            var10 = var18;
            var11 = param1;
            var12 = param5;
            var13 = param3;
            var14 = param8;
            var15 = (var18[var11] & 16711422) >> 1;
            var10[var11] = var15 - (-nb.a(65280, var13 >> 9) + (-nb.a(16711680, var12 >> 1) - nb.a(var14 >> 17, 255)));
            param1++;
            param8 = param8 + param2;
            param5 = param5 + param7;
            param3 = param3 + param9;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("lo.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = -65 % ((param0 + 64) / 43);
        field_c = (byte[][][]) null;
    }

    final static void a(int param0, boolean param1, vh param2, int param3, int param4) {
        RuntimeException var5 = null;
        wj var6 = null;
        tc stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        vh stackIn_2_4;
        int stackIn_2_5;
        boolean stackIn_3_6 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = ek.field_b;
          stackIn_2_1 = 22199;
          stackIn_2_2 = 1000000;
          stackIn_2_3 = param3;
          stackIn_2_4 = (vh) (param2);
          stackIn_2_5 = param4;
          stackIn_3_6 = !(param1);
          ((tc) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_2_4, stackIn_2_5, stackIn_3_6);
          if (param0 >= 65) {
            return;
          }
          var6 = (wj) null;
          lo.a((wj) null, (byte) 71);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("lo.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
    }
}
