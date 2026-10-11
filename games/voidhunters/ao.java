/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends rqa {
    static int field_o;

    ao(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            ao.a((byte) -16, false);
          }
          chb.field_a = param0[0].a(108);
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ao.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static kua a(cbb param0, int[] param1, int param2, int param3) {
        int var18_int = 0;
        kua stackIn_50_0 = null;
        Object stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var15 = 0;
        int var16 = 0;
        float var17 = 0.0f;
        int var17_int = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var19_int = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var20Lifetime1;
        var23 = VoidHunters.field_G;
        try {
          var4 = null;
          if (param3 != -3) {
            field_o = 121;
          }
          var5 = null;
          var6 = null;
          var7 = null;
          if (null != param0.field_M) {
            var8 = param0.field_B;
            var45 = new int[var8];
            var46 = new int[var8];
            var47 = new int[var8];
            var48 = new int[var8];
            var49 = new int[var8];
            var50 = new int[var8];
            for (var15 = 0; var8 > var15; var15++) {
              var45[var15] = 2147483647;
              var46[var15] = -2147483647;
              var47[var15] = 2147483647;
              var48[var15] = -2147483647;
              var49[var15] = 2147483647;
              var50[var15] = -2147483647;
            }
            var24 = new int[var8];
            var4 = var24;
            for (var15Lifetime1 = 0; var15Lifetime1 < param2; var15Lifetime1++) {
              var16 = param1[var15Lifetime1];
              if (-1 != param0.field_M[var16]) {
                var17_int = 255 & param0.field_M[var16];
                for (var18_int = 0; var18_int < 3; var18_int++) {
                  if (var18_int != 0) {
                    if (var18_int != 1) {
                      var19_int = param0.field_K[var16];
                    } else {
                      var19_int = param0.field_o[var16];
                    }
                  } else {
                    var19_int = param0.field_k[var16];
                  }
                  var20 = param0.field_v[var19_int];
                  var21 = param0.field_G[var19_int];
                  var22 = param0.field_x[var19_int];
                  if (var20 < var45[var17_int]) {
                    var45[var17_int] = var20;
                  }
                  if (var46[var17_int] < var20) {
                    var46[var17_int] = var20;
                  }
                  if (var21 < var47[var17_int]) {
                    var47[var17_int] = var21;
                  }
                  if (var21 > var48[var17_int]) {
                    var48[var17_int] = var21;
                  }
                  if (var22 < var49[var17_int]) {
                    var49[var17_int] = var22;
                  }
                  if (var50[var17_int] < var22) {
                    var50[var17_int] = var22;
                  }
                }
              }
            }
            var26 = new int[var8];
            var6 = var26;
            var25 = new int[var8];
            var5 = var25;
            var7 = new float[var8][];
            for (var15Lifetime2 = 0; var8 > var15Lifetime2; var15Lifetime2++) {
              var16Lifetime1 = param0.field_e[var15Lifetime2];
              if (var16Lifetime1 > 0) {
                var24[var15Lifetime2] = (var45[var15Lifetime2] + var46[var15Lifetime2]) / 2;
                var25[var15Lifetime2] = (var47[var15Lifetime2] + var48[var15Lifetime2]) / 2;
                var26[var15Lifetime2] = (var49[var15Lifetime2] + var50[var15Lifetime2]) / 2;
                if (1 == var16Lifetime1) {
                  var20Lifetime1 = param0.field_F[var15Lifetime2];
                  if (0 != var20Lifetime1) {
                    if (var20Lifetime1 > 0) {
                      var19 = (float)var20Lifetime1 / 1024.0f;
                      var17 = 1.0f;
                    } else {
                      var19 = 1.0f;
                      var17 = (float)(-var20Lifetime1) / 1024.0f;
                    }
                  } else {
                    var19 = 1.0f;
                    var17 = 1.0f;
                  }
                  var18 = 64.0f / (float)param0.field_a[var15Lifetime2];
                } else {
                  if (var16Lifetime1 == 2) {
                    var19 = 64.0f / (float)param0.field_C[var15Lifetime2];
                    var18 = 64.0f / (float)param0.field_a[var15Lifetime2];
                    var17 = 64.0f / (float)param0.field_F[var15Lifetime2];
                  } else {
                    var19 = (float)param0.field_C[var15Lifetime2] / 1024.0f;
                    var18 = (float)param0.field_a[var15Lifetime2] / 1024.0f;
                    var17 = (float)param0.field_F[var15Lifetime2] / 1024.0f;
                  }
                }
                ((Object[]) (var7))[var15Lifetime2] = ck.a(var19, 0, (int) param0.field_t[var15Lifetime2], dla.a((int) param0.field_J[var15Lifetime2], 255), var18, (int) param0.field_i[var15Lifetime2], (int) param0.field_H[var15Lifetime2], var17);
              }
            }
          }
          stackIn_50_0 = new kua((int[]) (var4), (int[]) (var5), (int[]) (var6), (float[][]) (var7));
          return stackIn_50_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_53_0 = var4;
          stackIn_53_1 = new StringBuilder().append("ao.B(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',');
          if (param1 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_53_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        if (wq.e((byte) 105)) {
          param1 = false;
        }
        mc.a(-119, param1);
        ria.e((byte) 89);
        int var2 = 103 / ((param0 + 19) / 55);
    }

    static {
        field_o = 0;
    }
}
