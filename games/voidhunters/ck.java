/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends rqa {
    static phb[] field_o;

    final static float[] a(float param0, int param1, int param2, int param3, float param4, int param5, int param6, float param7) {
        float[] var8 = null;
        float[] var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float[] var13 = null;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float[] var17 = null;
        float[] var18 = null;
        float[] var19 = null;
        float[] var20 = null;
        float[] var21 = null;
        float[] var22 = null;
        var21 = new float[9];
        var19 = var21;
        var17 = var19;
        var8 = var17;
        var18 = new float[9];
        var9 = var18;
        var10 = (float)Math.cos((double)((float)param3 * 0.02454369328916073f));
        var11 = (float)Math.sin((double)((float)param3 * 0.02454369328916073f));
        var17[3] = 0.0f;
        var17[6] = -var11;
        var12 = 1.0f - var10;
        var17[4] = 1.0f;
        var21[0] = var10;
        var21[8] = var10;
        var17[7] = 0.0f;
        var17[5] = 0.0f;
        var17[1] = 0.0f;
        var21[2] = var11;
        var22 = new float[9];
        var20 = var22;
        var13 = var20;
        var14 = 1.0f;
        var15 = (float)param1;
        var10 = (float)param5 / 32767.0f;
        var12 = -var10 + 1.0f;
        var11 = -(float)Math.sqrt((double)(1.0f - var10 * var10));
        var16 = (float)Math.sqrt((double)(param2 * param2 + param6 * param6));
        if (0.0f != var16) {
          L0: {
            if (var16 != 0.0f) {
              var15 = (float)param2 / var16;
              var14 = (float)(-param6) / var16;
              break L0;
            } else {
              break L0;
            }
          }
          var13[0] = var14 * var14 * var12 + var10;
          var13[3] = var11 * -var15;
          var13[1] = var15 * var11;
          var13[7] = -var14 * var11;
          var22[4] = var10;
          var13[5] = var14 * var11;
          var13[6] = var14 * var15 * var12;
          var13[2] = var15 * var14 * var12;
          var13[8] = var10 + var15 * var15 * var12;
          var18[0] = var22[6] * var21[2] + (var22[3] * var21[1] + var22[0] * var21[0]);
          var18[1] = var22[7] * var21[2] + (var21[0] * var22[1] + var22[4] * var21[1]);
          var18[2] = var22[2] * var21[0] + var22[5] * var21[1] + var21[2] * var22[8];
          var18[3] = var22[6] * var21[5] + (var22[0] * var21[3] + var22[3] * var21[4]);
          var18[4] = var21[4] * var22[4] + var22[1] * var21[3] + var22[7] * var21[5];
          var18[6] = var22[0] * var21[6] + var22[3] * var21[7] + var22[6] * var21[8];
          var18[5] = var21[3] * var22[2] + var22[5] * var21[4] + var21[5] * var22[8];
          var18[7] = var21[6] * var22[1] + var22[4] * var21[7] + var21[8] * var22[7];
          var18[8] = var22[8] * var21[8] + (var22[2] * var21[6] + var22[5] * var21[7]);
          var9[8] = var9[8] * param0;
          var9[0] = var9[0] * param7;
          var9[1] = var9[1] * param7;
          var9[5] = var9[5] * param4;
          var9[3] = var9[3] * param4;
          var9[7] = var9[7] * param0;
          var9[6] = var9[6] * param0;
          var9[2] = var9[2] * param7;
          var9[4] = var9[4] * param4;
          return var9;
        } else {
          if (0.0f != var10) {
            L1: {
              if (var16 != 0.0f) {
                var15 = (float)param2 / var16;
                var14 = (float)(-param6) / var16;
                break L1;
              } else {
                break L1;
              }
            }
            var13[0] = var14 * var14 * var12 + var10;
            var13[3] = var11 * -var15;
            var13[1] = var15 * var11;
            var13[7] = -var14 * var11;
            var22[4] = var10;
            var13[5] = var14 * var11;
            var13[6] = var14 * var15 * var12;
            var13[2] = var15 * var14 * var12;
            var13[8] = var10 + var15 * var15 * var12;
            var18[0] = var22[6] * var21[2] + (var22[3] * var21[1] + var22[0] * var21[0]);
            var18[1] = var22[7] * var21[2] + (var21[0] * var22[1] + var22[4] * var21[1]);
            var18[2] = var22[2] * var21[0] + var22[5] * var21[1] + var21[2] * var22[8];
            var18[3] = var22[6] * var21[5] + (var22[0] * var21[3] + var22[3] * var21[4]);
            var18[4] = var21[4] * var22[4] + var22[1] * var21[3] + var22[7] * var21[5];
            var18[6] = var22[0] * var21[6] + var22[3] * var21[7] + var22[6] * var21[8];
            var18[5] = var21[3] * var22[2] + var22[5] * var21[4] + var21[5] * var22[8];
            var18[7] = var21[6] * var22[1] + var22[4] * var21[7] + var21[8] * var22[7];
            var18[8] = var22[8] * var21[8] + (var22[2] * var21[6] + var22[5] * var21[7]);
            var9[8] = var9[8] * param0;
            var9[0] = var9[0] * param7;
            var9[1] = var9[1] * param7;
            var9[5] = var9[5] * param4;
            var9[3] = var9[3] * param4;
            var9[7] = var9[7] * param0;
            var9[6] = var9[6] * param0;
            var9[2] = var9[2] * param7;
            var9[4] = var9[4] * param4;
            return var9;
          } else {
            var9 = var17;
            var9[8] = var9[8] * param0;
            var9[0] = var9[0] * param7;
            var9[1] = var9[1] * param7;
            var9[5] = var9[5] * param4;
            var9[3] = var9[3] * param4;
            var9[7] = var9[7] * param0;
            var9[6] = var9[6] * param0;
            var9[2] = var9[2] * param7;
            var9[4] = var9[4] * param4;
            return var9;
          }
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
            return true;
        }
        if (null == wba.field_o) {
            return false;
        }
        if (mgb.field_o) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        ij discarded$0 = null;
        field_o = null;
        if (param0 != 7311) {
            String var2 = (String) null;
            discarded$0 = ck.a(-5, (String) null);
        }
    }

    final static ij a(int param0, String param1) {
        RuntimeException var2 = null;
        ij var2_ref = null;
        qab var3 = null;
        int var4 = 0;
        int var5 = 0;
        ij stackIn_3_0 = null;
        ij stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_18_0 = null;
        ij stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var2_ref = new ij();
            if (param0 == -1) {
              var3 = new qab(param1);
              L1: while (true) {
                if (var3.a((byte) -111)) {
                  stackOut_18_0 = (ij) (var2_ref);
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = var3.a(param0 ^ 75);
                  if (!Character.isWhitespace((char) var4)) {
                    L2: {
                      if (var4 == 34) {
                        break L2;
                      } else {
                        if (var4 == 39) {
                          break L2;
                        } else {
                          if (var4 == 40) {
                            var2_ref.b(param0 + -10257, new tsa(wdb.field_vb, var3.field_b - 1));
                            continue L1;
                          } else {
                            if (var4 == 41) {
                              var2_ref.b(-10258, new tsa(ua.field_o, -1 + var3.field_b));
                              continue L1;
                            } else {
                              if (var4 == 44) {
                                var2_ref.b(-10258, new tsa(jwa.field_l, -1 + var3.field_b));
                                continue L1;
                              } else {
                                var2_ref.b(param0 ^ 10257, ir.a(-20, var3));
                                continue L1;
                              }
                            }
                          }
                        }
                      }
                    }
                    var2_ref.b(param0 ^ 10257, iba.a(117, var3));
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = (ij) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("ck.C(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -119) {
              btb.field_a = param0[0].a(false);
              stackOut_3_0 = new nc("void");
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ck.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    ck(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
