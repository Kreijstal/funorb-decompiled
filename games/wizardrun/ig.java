/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ig extends DualLinkNode {
    int field_p;
    static cd field_q;

    abstract Object e(int param0);

    final static void a(Sprite[] param0, int param1, byte param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = wizardrun.field_H;
        try {
          if (param0 == null) {
            return;
          }
          if (param4 > 0 &&
            param3 > 0) {
            if (null == param0[3]) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param0[3].fullWidth;
            }
            var6_int = stackIn_10_0;
            if (param0[5] != null) {
              stackIn_13_0 = param0[5].fullWidth;
            } else {
              stackIn_13_0 = 0;
            }
            var7 = stackIn_13_0;
            if (null != param0[1]) {
              stackIn_16_0 = param0[1].fullHeight;
            } else {
              stackIn_16_0 = 0;
            }
            var8 = stackIn_16_0;
            if (null == param0[7]) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param0[7].fullHeight;
            }
            var9 = stackIn_19_0;
            var10 = param1 + param4;
            var11 = param5 + param3;
            var12 = var6_int + param1;
            var13 = -var7 + var10;
            var14 = param5 + var8;
            if (param2 != -110) {
              ig.a((byte) -10);
            }
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = var6_int * param4 / (var6_int + var7) + param1;
              var16 = var6_int * param4 / (var6_int + var7) + param1;
            }
            var18 = var14;
            var19 = var15;
            SoftwareRasterizer.saveClip(td.field_a);
            if (var18 > var19) {
              var19 = param3 * var8 / (var9 + var8) + param5;
              var18 = param3 * var8 / (var9 + var8) + param5;
            }
            if (null != param0[0]) {
              SoftwareRasterizer.intersectClip(param1, param5, var16, var18);
              param0[0].e(param1, param5);
              SoftwareRasterizer.restoreClip(td.field_a);
            }
            if (param0[2] != null) {
              SoftwareRasterizer.intersectClip(var17, param5, var10, var18);
              param0[2].e(var13, param5);
              SoftwareRasterizer.restoreClip(td.field_a);
            }
            if (param0[6] != null) {
              SoftwareRasterizer.intersectClip(param1, var19, var16, var11);
              param0[6].e(param1, var15);
              SoftwareRasterizer.restoreClip(td.field_a);
            }
            if (param0[8] != null) {
              SoftwareRasterizer.intersectClip(var17, var19, var10, var11);
              param0[8].e(var13, var15);
              SoftwareRasterizer.restoreClip(td.field_a);
            }
            if (param0[1] != null &&
              param0[1].fullWidth != 0) {
              SoftwareRasterizer.intersectClip(var16, param5, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param0[1].fullWidth) {
                param0[1].e(var20, param5);
              }
              SoftwareRasterizer.restoreClip(td.field_a);
            }
            if (param0[7] != null &&
              param0[7].fullWidth != 0) {
              SoftwareRasterizer.intersectClip(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param0[7].fullWidth) {
                param0[7].e(var20Lifetime1, var15);
              }
              SoftwareRasterizer.restoreClip(td.field_a);
            }
            if (param0[3] != null &&
              0 != param0[3].fullHeight) {
              SoftwareRasterizer.intersectClip(param1, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param0[3].fullHeight) {
                param0[3].e(param1, var20Lifetime2);
              }
              SoftwareRasterizer.restoreClip(td.field_a);
            }
            if (null != param0[5] &&
              param0[5].fullHeight != 0) {
              SoftwareRasterizer.intersectClip(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param0[5].fullHeight) {
                param0[5].e(var13, var20Lifetime3);
              }
              SoftwareRasterizer.restoreClip(td.field_a);
            }
            if (param0[4] != null &&
              0 != param0[4].fullWidth &&
              0 != param0[4].fullHeight) {
              SoftwareRasterizer.intersectClip(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param0[4].fullHeight) {
                for (var21 = var12; var21 < var13; var21 = var21 + param0[4].fullWidth) {
                  param0[4].e(var21, var20Lifetime4);
                }
              }
              SoftwareRasterizer.restoreClip(td.field_a);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("ig.B(");
          if (param0 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_q = null;
        if (param0 >= -82) {
          field_q = (cd) null;
        }
    }

    abstract boolean d(int param0);

    ig(int param0) {
        this.field_p = param0;
    }

    static {
    }
}
