/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends ma {
    int field_l;
    static int field_p;
    static hj field_r;
    static Boolean field_q;
    static dd field_n;
    static int field_m;
    static String field_s;
    static boolean field_o;

    final static void a(int param0, dd param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        try {
          pq.field_m = param4;
          jc.field_h = param3;
          ad.field_r = param6;
          ej.field_g = param5;
          se.field_h = param0;
          rf.field_c = param8;
          li.field_e = param2;
          vn.field_j = param1;
          if (param7 != -1) {
            field_n = (dd) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "bq.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        sa var8_ref_sa = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        sa var12 = null;
        sa var13 = null;
        int var13_int = 0;
        int var14 = 0;
        sa var15 = null;
        sa var15Lifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12_intLifetime1;
        int var13_intLifetime1;
        int var14Lifetime1;
        int var9Lifetime2;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12_intLifetime1Lifetime1;
        try {
          if (param0 >= -116) {
            field_p = -107;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if ((param1 != 0 && (param1 <= 0 ||
            !(kj.field_g[0].field_u > param6))) &&
            (decompiledFrameRemainder0 = (kj.field_g[-1 + param1].field_u == param6))) {
            var7_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var7_int >= param1))) {
              var8_ref_sa = kj.field_g[var7_int];
              if (~var8_ref_sa.field_n != ~param5 &&
                ~var8_ref_sa.field_i != ~param5 && (-1 == param3 ||
                param3 != var8_ref_sa.field_n &&
                ~param3 != ~var8_ref_sa.field_i)) {
                var7_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              var7_int = param1;
              var8 = param6;
              var9 = param5;
              var10 = param3;
              var11 = param4;
              var12_int = param2;
              var13 = kj.field_g[var7_int];
              var13.field_n = (byte)var9;
              var13.field_u = var8;
              var13.field_i = (byte)var10;
              var13.field_a = (byte)var12_int;
              var13.field_x = (byte)var11;
              param1++;
              decompiledFrameCompleted0 = false;
            }
            if (decompiledFrameCompleted0) {
              if (param3 != -1 && (var8_ref_sa.field_a != -1 ||
                var8_ref_sa.field_x != -1)) {
                var9Lifetime2 = var7_int;
                var10Lifetime2 = param6;
                var11Lifetime2 = param5;
                var12_intLifetime1 = param3;
                var13_int = param4;
                var14 = param2;
                var15 = kj.field_g[var9Lifetime2];
                var15.field_n = (byte)var11Lifetime2;
                var15.field_i = (byte)var12_intLifetime1;
                var15.field_x = (byte)var13_int;
                var15.field_a = (byte)var14;
                var15.field_u = var10Lifetime2;
              }
              if (-1 != param2 &&
                var8_ref_sa.field_x != -1) {
                var9Lifetime2 = var7_int;
                var10Lifetime2 = param6;
                var11Lifetime2 = param5;
                var12_intLifetime1Lifetime1 = param3;
                var13_intLifetime1 = param4;
                var14Lifetime1 = param2;
                var15Lifetime1 = kj.field_g[var9Lifetime2];
                var15Lifetime1.field_x = (byte)var13_intLifetime1;
                var15Lifetime1.field_u = var10Lifetime2;
                var15Lifetime1.field_n = (byte)var11Lifetime2;
                var15Lifetime1.field_a = (byte)var14Lifetime1;
                var15Lifetime1.field_i = (byte)var12_intLifetime1Lifetime1;
              }
              stackIn_25_0 = param1;
              return stackIn_25_0;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            param1 = 1;
            var7_intLifetime1 = param6;
            var8Lifetime1 = param5;
            var9Lifetime1 = param3;
            var10Lifetime1 = param4;
            var11Lifetime1 = param2;
            var12 = kj.field_g[0];
            var12.field_a = (byte)var11Lifetime1;
            var12.field_n = (byte)var8Lifetime1;
            var12.field_i = (byte)var9Lifetime1;
            var12.field_x = (byte)var10Lifetime1;
            var12.field_u = var7_intLifetime1;
          }
          stackIn_30_0 = param1;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var7), "bq.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    bq(int param0) {
        this.field_l = param0;
    }

    public static void c(byte param0) {
        field_n = null;
        field_s = null;
        field_q = null;
        field_r = null;
        if (param0 > -16) {
          bq.a((byte) -80, 69, -63, -22, -2, -27, -72);
        }
    }

    static {
        field_p = -1;
        field_r = new hj(14, 0, 4, 1);
        field_s = "Foul!";
        field_o = false;
    }
}
