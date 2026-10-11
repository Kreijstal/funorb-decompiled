/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends oh {
    static int field_h;
    static bi field_k;
    static long field_l;
    static String field_i;
    byte[] field_j;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_23_4;
        int stackIn_26_0;
        int stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_27_4;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime1Lifetime1;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 < param6) {
            var10 = param6;
            param6 = param2;
            param2 = var10;
            var10Lifetime2 = param4;
            param4 = param7;
            param7 = var10Lifetime2;
            param1 = param8 - param1;
          }
          var9_int = 0;
          if (gf.field_i <= param2 &&
            param6 <= gf.field_l) {
            if (param4 > param7) {
              var10Lifetime1 = param6;
              param6 = param2;
              param2 = var10Lifetime1;
              var10Lifetime1 = param4;
              param4 = param7;
              param7 = var10Lifetime1;
              param1 = param8 - param1;
            }
            if (param7 >= gf.field_a &&
              param4 <= gf.field_f) {
              var9_int = var9_int + param1 / param8;
              param1 = param1 % param8;
              if (param1 < 0) {
                param1 = param1 + param8;
                var9_int--;
              }
              var10Lifetime1Lifetime1 = (int)Math.sqrt((double)((-param6 + param2) * (param2 - param6) + (param7 - param4) * (param7 - param4))) + 1;
              if (param0 <= 27) {
                return;
              }
              var11 = param6;
              var12 = param4;
              while (param1 < var10Lifetime1Lifetime1) {
                var13 = (param2 - param6) * param1 / var10Lifetime1Lifetime1 + param6;
                var14 = param4 + (-param4 + param7) * param1 / var10Lifetime1Lifetime1;
                stackIn_22_0 = var11;
                stackIn_22_1 = var12;
                stackIn_22_2 = var13;
                stackIn_22_3 = var14;
                if ((var9_int & 1) != 0) {
                  stackIn_23_4 = param5;
                } else {
                  stackIn_23_4 = param3;
                }
                gf.g(stackIn_22_0, stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_23_4);
                var12 = var14;
                var11 = var13;
                var9_int++;
                param1 = param1 + param8;
              }
              stackIn_26_0 = var11;
              stackIn_26_1 = var12;
              stackIn_26_2 = param2;
              stackIn_26_3 = param7;
              if ((var9_int & 1) == 0) {
                stackIn_27_4 = param3;
              } else {
                stackIn_27_4 = param5;
              }
              gf.g(stackIn_26_0, stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_27_4);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var9), "be.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(qr param0, int param1, qr param2, int param3, int param4, byte param5, int param6, qr param7, byte[] param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param5 != -122) {
            return;
          }
          sb.field_h = param6;
          ks.field_e = param8;
          ec.field_p = -1L;
          em.field_k = param8.length;
          he.field_p = null;
          np.field_a = null;
          id.field_c = new byte[(sb.field_h + 7) / 8];
          k.field_i = false;
          var10_int = 0;
          for (var11 = 0; var11 < ks.field_e.length; var11++) {
            var10_int = var10_int + (ks.field_e[var11] & 255);
          }
          var10_int = (7 + var10_int) / 8;
          qj.field_f = new byte[var10_int];
          if (null == param7.field_M) {
            param7.field_M = new pf();
          }
          gr.field_p = param7.field_M;
          gr.field_p.a(0);
          ShatteredPlansClient.field_H = new in(param1);
          a.field_j = -1;
          bh.field_h = -1;
          ah.field_X = 0;
          kf.field_g = 0;
          if (param0.field_M == null) {
            param0.field_M = new pf();
          }
          kj.field_a = param0.field_M;
          kj.field_a.a(0);
          ea.field_b = new in(param3);
          if (param2.field_M == null) {
            param2.field_M = new pf();
          }
          uo.field_a = param2.field_M;
          uo.field_a.a(0);
          qp.field_w = new in(param4);
          sf.field_e = 0L;
          ks.field_i = param9;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_19_0 = var10;
          stackIn_19_1 = new StringBuilder().append("be.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param8 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param9).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 < 67) {
          be.a((byte) -90, 116, 111, -79, -48, 35, -128, -23, -56);
        }
        field_i = null;
    }

    be(byte[] param0) {
        try {
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Total number of players in game will not exceed 6.";
    }
}
