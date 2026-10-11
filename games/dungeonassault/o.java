/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends ne {
    static String field_l;
    static long field_j;
    static wm field_n;
    int field_p;
    fa field_k;
    static ae field_i;
    static String field_q;
    static int field_m;
    static gj field_o;

    final static void a(int param0, int param1, jd param2) {
        wj var3 = null;
        try {
          var3 = ac.field_B;
          var3.d((byte) -122, param0);
          int var4 = -95 % ((-66 - param1) / 54);
          var3.a(6, param2.field_m);
          var3.i(param2.field_k, -128);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "o.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
          return;
        }
        field_n = null;
        field_l = null;
        field_o = null;
        field_i = null;
        field_q = null;
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 31) {
            stackIn_4_0 = ua.a((byte) 122, false, param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("o.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1, int param2) {
        ac var3 = gh.field_i[param2];
        if (param0 != 11404) {
          return;
        }
        if (var3 == null) {
          return;
        }
        try {
          var3.field_d = tp.a(kf.field_p, "idle", param1, param0 ^ -11074);
          var3.field_u = tp.a(kf.field_p, "victory", param1, -1998);
          var3.field_m = tp.a(kf.field_p, "defeat", param1, -1998);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "o.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param0 != 16711680) {
          String var5 = (String) null;
          o.a(-52, (String) null, 46);
        }
        return wk.c(false);
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = tg.field_f[param0][param2];
        if (ke.a(57, var3)) {
          return 439;
        }
        if (param1 < 93) {
          field_i = (ae) null;
        }
        return param2 * tg.field_d[param0] + tg.field_h[param0];
    }

    final static boolean a(int[] param0, int[] param1, int param2, lb param3, boolean param4) {
        int var6 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_28_0 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_42_0 = false;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int[] var8 = null;
        var7 = DungeonAssault.field_K;
        try {
          if (!mh.a(116, param2)) {
            return false;
          }
          if (param2 == ek.field_c) {
            return true;
          }
          param2 = param2 & 127;
          if (wh.field_a <= param2) {
            return false;
          }
          if (param2 >= cp.field_R) {
            stackIn_17_0 = (param1 != null) && (vl.a(param2 - cp.field_R, -109, param1));
            return stackIn_17_0;
          }
          if (ok.field_z <= param2) {
            stackIn_20_0 = vl.a(bl.field_n[-ok.field_z + param2], -93, param0);
            return stackIn_20_0;
          }
          if (!param4) {
            var8 = (int[]) null;
            o.a(52, -4, (int[]) null, -63, (int[]) null, -53, -87, 107, -97, 7, 14);
          }
          if (gn.field_d <= param2) {
            stackIn_28_0 = !(ci.field_s[param2 - gn.field_d] > param3.field_z);
            return stackIn_28_0;
          }
          if (uf.field_a > param2) {
            if (wm.field_a > param2) {
              return false;
            }
            stackIn_42_0 = !(dc.field_p[-wm.field_a + param2] > param3.field_f);
            return stackIn_42_0;
          }
          var5_int = 0;
          for (var6 = 0; var6 < 6; var6++) {
            var5_int = var5_int + param3.field_J[var6];
          }
          stackIn_36_0 = !(var5_int < hb.field_m[param2 - uf.field_a]);
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_45_0 = var5;
          stackIn_45_1 = new StringBuilder().append("o.F(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param4).append(')').toString());
        }
    }

    o(fa param0, int param1) {
        try {
          this.field_p = param1;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "o.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = DungeonAssault.field_K;
        try {
          if (param8 != 0) {
            return;
          }
          var11_int = -param6 + 256;
          for (var12 = -param5; 0 > var12; var12++) {
            for (var13 = -param0; 0 > var13; var13++) {
              param1 = param4[param3++];
              var14 = param2[param7];
              incrementValue$1 = param7;
              param7++;
              param2[incrementValue$1] = mp.a(nb.a(param6 * nb.a(65280, param1) + nb.a(var14, 65280) * var11_int, 16711680), nb.a(-16711936, nb.a(16711935, param1) * param6 + nb.a(16711935, var14) * var11_int)) >>> 8;
            }
            param7 = param7 + param9;
            param3 = param3 + param10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_12_0 = var11;
          stackIn_12_1 = new StringBuilder().append("o.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final static void a(int param0) {
        kn.field_g = false;
        if (param0 <= 110) {
          String var2 = (String) null;
          o.a(-101, (String) null, 102);
        }
    }

    static {
        field_l = "Thief";
        field_n = new wm(25);
        field_q = "Single-player game";
    }
}
