/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends IntrusiveNode {
    int field_k;
    static RgbSprite[] field_l;
    static String field_j;
    int field_o;
    int field_p;
    int field_n;
    int field_m;
    int field_i;
    static RgbSprite[] field_q;

    final static og a(mh param0, mh param1, kn param2, int param3, mh param4) {
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        og stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        og[] var11 = null;
        int var12 = 0;
        kn var13_ref_kn = null;
        int var13 = 0;
        int var15 = 0;
        wd var16 = null;
        int var17 = 0;
        ResourceArchive var18 = null;
        int[] var19 = null;
        char[] var20 = null;
        int[] var21 = null;
        char[] var22 = null;
        int var12Lifetime1;
        var17 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_3_0 = null;
            return (og) (stackIn_3_0);
          }
          if (param2.field_x != null) {
            stackIn_7_0 = param2.field_x.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (param2.field_v != null) {
            stackIn_10_0 = param2.field_v.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          if (param3 != 4) {
            var18 = (ResourceArchive) null;
            e.a((ResourceArchive) null, 30);
          }
          var22 = new char[var7];
          var20 = var22;
          var9 = var20;
          var21 = new int[var7];
          var19 = var21;
          var10 = var19;
          var11 = new og[var7];
          if (param2.field_x != null) {
            for (var12 = 0; param2.field_x.length > var12; var12++) {
              var13_ref_kn = pj.field_c.a(param2.field_x[var12], (byte) 124);
              var8[var12] = var13_ref_kn.field_D;
              var9[var12] = param2.field_w[var12];
              var11[var12] = e.a(param0, param1, var13_ref_kn, 4, param4);
            }
          }
          if (param2.field_v != null) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; param2.field_v.length > var14; var14++) {
              var15 = param2.field_v[var14];
              if (var15 == -1) {
                var8[var14 + var12Lifetime1] = ng.field_c;
                var9[var14 + var12Lifetime1] = param2.field_u[var14];
                var10[var12Lifetime1 + var14] = param2.field_v[var14];
              } else {
                var16 = nh.field_c.a(var15, true);
                var8[var14 + var12Lifetime1] = var16.h(-3);
                var9[var14 + var12Lifetime1] = param2.field_u[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var12Lifetime1 + var14] = param2.field_v[var14];
              }
            }
          }
          stackIn_28_0 = new og(0L, param4, param1, param0, var11, var21, var8, var22);
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("e.A(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var9 = 0;
        int var10 = 0;
        int var3 = sa.a(param0, -4097);
        int var4 = BrickABrac.c(2048, param0);
        int var5 = sa.a(param2, param1 - 4097);
        int var6 = BrickABrac.c(2048, param2);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        if (param1 == 0) {
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        e.a(118, 72, 44);
        var9 = (int)((long)var5 * (long)var4 >> 16);
        var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        int var1 = -115 % ((5 - param0) / 58);
        field_q = null;
    }

    final static void a(ResourceArchive param0, int param1) {
        RgbSprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new RgbSprite(param0.takeFileByName(104, "final_frame.jpg", ""), (java.awt.Component) ((Object) kj.field_D));
          var3 = var2.width;
          int var5 = -121 % ((-17 - param1) / 52);
          var4 = var2.height;
          HighscorePackSelector.pushRaster(-99);
          LevelCompleteScreen.field_I = new RgbSprite(var3, var4 * 3 / 4);
          LevelCompleteScreen.field_I.bindRasterTarget();
          var2.drawAt(0, 0);
          BitPacketBuffer.field_t = new RgbSprite(var3, -LevelCompleteScreen.field_I.height + var4);
          BitPacketBuffer.field_t.bindRasterTarget();
          var2.drawAt(0, -LevelCompleteScreen.field_I.height);
          BitPacketBuffer.field_t.offsetY = LevelCompleteScreen.field_I.height;
          sc.popRaster(-104);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "e.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    e(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_m = param4;
        this.field_o = param0;
        this.field_k = param2;
        this.field_p = param5;
        this.field_i = param1;
        this.field_n = param3;
    }

    static {
        field_j = "Friends";
    }
}
