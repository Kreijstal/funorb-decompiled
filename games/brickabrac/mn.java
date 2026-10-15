/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mn extends tk {
    int field_C;
    int field_D;
    int field_F;
    static int field_v;
    int field_x;
    static String field_u;
    int field_E;
    static String field_B;
    static int field_A;
    int field_z;
    static String field_w;
    static int field_y;

    public static void f(int param0) {
        field_B = null;
        field_u = null;
        if (param0 != 2) {
          String var2 = (String) null;
          mn.a(9, (mh) null, (mm) null, (int[]) null, (String) null, 53, (byte) -45, 67L, (String) null);
        }
        field_w = null;
    }

    final static void a(int param0, int param1, id param2, mm param3, byte param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mn.a(-1, param2, param3, (int[]) null, param2.field_hc, -1, (byte) -58, param2.field_gc, param2.field_Yb);
        bm.field_d.a(true, true);
        bm.field_d.a((int[]) null, (byte) -120, 0);
        bm.field_d.a((byte) -93);
        nn var12 = bm.field_d;
        if (param4 < 48) {
          return;
        }
        try {
          var8 = param5;
          var9 = param1;
          var10 = param6;
          var11 = param0;
          var12.field_d.a(var9, -79, var11, var10, var8);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "mn.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(jp param0, int param1, int param2, int param3, int param4, int param5, jp param6, int param7, jp param8, int param9, int param10) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        try {
          if (param9 != 1) {
            return;
          }
          param0.d((param1 - param0.field_x) / 2 + (param3 + (param5 * 5 >> 16)), param2);
          param8.c(param3 + (-param8.field_x + param1) / 2 + (10 * param5 >> 16), -param8.field_z + 480 + param10 + (param2 - 35 / param7));
          param6.c((param5 * 20 >> 16) + (-param6.field_x + param1) / 2 + param3, -param6.field_z + (480 + param2) + param10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("mn.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final static void a(int param0, mh param1, mm param2, int[] param3, String param4, int param5, byte param6, long param7, String param8) {
        try {
          o.field_b = param2;
          if (param6 != -58) {
            field_u = (String) null;
          }
          bm.field_d = new nn(param1, param7, param4, param8, param5, param0, param3);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "mn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static jp[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        jp[] var10;
        jp[] var11_ref_jp__;
        int var11;
        int var12;
        jp var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = BrickABrac.field_J ? 1 : 0;
        var9 = param5 + (param2 + param1);
        var10 = new jp[]{new jp(var9, var9), new jp(param6, var9), new jp(var9, var9), new jp(var9, param6), new jp(64, 64), new jp(var9, param6), new jp(var9, var9), new jp(param6, var9), new jp(var9, var9)};
        var11_ref_jp__ = var10;
        for (var12 = 0; var11_ref_jp__.length > var12; var12++) {
          var13 = var11_ref_jp__[var12];
          for (var14 = 0; var13.field_G.length > var14; var14++) {
            var13.field_G[var14] = param0;
          }
        }
        if (param3 != 9361) {
          field_w = (String) null;
        }
        for (var11 = 0; var11 < param2; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_G[var12Lifetime1 + (-1 + var9 - var11) * var9] = param8;
            var10[8].field_G[var12Lifetime1 + (-var11 + (var9 - 1)) * var9] = param8;
            var10[2].field_G[-var11 + var9 - 1 + var9 * var12Lifetime1] = param8;
            var10[8].field_G[var9 - (1 + var11) + var9 * var12Lifetime1] = param8;
          }
        }
        for (var11Lifetime1 = 0; param2 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_G[var11Lifetime1 * var9 + var12Lifetime2] = param7;
            var10[0].field_G[var11Lifetime1 + var12Lifetime2 * var9] = param7;
            if (var12Lifetime2 < var9 - var11Lifetime1) {
              var10[2].field_G[var12Lifetime2 + var9 * var11Lifetime1] = param7;
              var10[6].field_G[var9 * var12Lifetime2 + var11Lifetime1] = param7;
            }
          }
        }
        for (var11Lifetime2 = 0; param6 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param2 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_G[var11Lifetime2 + (-1 + (var9 - var12Lifetime3)) * param6] = param8;
            var10[5].field_G[var9 * var11Lifetime2 + var9 - (1 + var12Lifetime3)] = param8;
            var10[1].field_G[var12Lifetime3 * param6 + var11Lifetime2] = param7;
            var10[3].field_G[var12Lifetime3 + var11Lifetime2 * var9] = param7;
          }
        }
        for (var11Lifetime3 = 0; param6 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param1; var12Lifetime4++) {
            var10[1].field_G[param6 * (-var12Lifetime4 + (var9 - 1)) + var11Lifetime3] = param4;
            var10[3].field_G[var11Lifetime3 * var9 + (var9 - (1 + var12Lifetime4))] = param4;
            var10[7].field_G[var12Lifetime4 * param6 + var11Lifetime3] = param4;
            var10[5].field_G[var12Lifetime4 + var9 * var11Lifetime3] = param4;
          }
        }
        return var10;
    }

    mn() {
    }

    static {
        field_u = "From Level";
        field_B = "<%0> cannot join; the game is full.";
        field_w = "Game options changed (<%0>)";
        field_y = 640;
    }
}
