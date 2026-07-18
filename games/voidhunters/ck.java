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
        float[] var23 = null;
        float[] var24 = null;
        float[] var25 = null;
        float[] var26 = null;
        var25 = new float[9];
        var23 = var25;
        var21 = var23;
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
        var25[0] = var10;
        var25[8] = var10;
        var17[7] = 0.0f;
        var17[5] = 0.0f;
        var17[1] = 0.0f;
        var25[2] = var11;
        var26 = new float[9];
        var24 = var26;
        var22 = var24;
        var20 = var22;
        var13 = var20;
        var14 = 1.0f;
        var15 = (float)0;
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
          var26[4] = var10;
          var13[5] = var14 * var11;
          var13[6] = var14 * var15 * var12;
          var13[2] = var15 * var14 * var12;
          var13[8] = var10 + var15 * var15 * var12;
          var18[0] = var26[6] * var25[2] + (var26[3] * var25[1] + var26[0] * var25[0]);
          var18[1] = var26[7] * var25[2] + (var25[0] * var26[1] + var26[4] * var25[1]);
          var18[2] = var26[2] * var25[0] + var26[5] * var25[1] + var25[2] * var26[8];
          var18[3] = var26[6] * var25[5] + (var26[0] * var25[3] + var26[3] * var25[4]);
          var18[4] = var25[4] * var26[4] + var26[1] * var25[3] + var26[7] * var25[5];
          var18[6] = var26[0] * var25[6] + var26[3] * var25[7] + var26[6] * var25[8];
          var18[5] = var25[3] * var26[2] + var26[5] * var25[4] + var25[5] * var26[8];
          var18[7] = var25[6] * var26[1] + var26[4] * var25[7] + var25[8] * var26[7];
          var18[8] = var26[8] * var25[8] + (var26[2] * var25[6] + var26[5] * var25[7]);
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
            var26[4] = var10;
            var13[5] = var14 * var11;
            var13[6] = var14 * var15 * var12;
            var13[2] = var15 * var14 * var12;
            var13[8] = var10 + var15 * var15 * var12;
            var18[0] = var26[6] * var25[2] + (var26[3] * var25[1] + var26[0] * var25[0]);
            var18[1] = var26[7] * var25[2] + (var25[0] * var26[1] + var26[4] * var25[1]);
            var18[2] = var26[2] * var25[0] + var26[5] * var25[1] + var25[2] * var26[8];
            var18[3] = var26[6] * var25[5] + (var26[0] * var25[3] + var26[3] * var25[4]);
            var18[4] = var25[4] * var26[4] + var26[1] * var25[3] + var26[7] * var25[5];
            var18[6] = var26[0] * var25[6] + var26[3] * var25[7] + var26[6] * var25[8];
            var18[5] = var25[3] * var26[2] + var26[5] * var25[4] + var25[5] * var26[8];
            var18[7] = var25[6] * var26[1] + var26[4] * var25[7] + var25[8] * var26[7];
            var18[8] = var26[8] * var25[8] + (var26[2] * var25[6] + var26[5] * var25[7]);
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
        if (null == wba.field_o) {
            return false;
        }
        if (mgb.field_o) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_o = null;
    }

    final static ij a(int param0, String param1) {
        ij var2 = null;
        RuntimeException var2_ref = null;
        qab var3 = null;
        int var4 = 0;
        int var5 = 0;
        ij stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_18_0 = null;
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
            var2 = new ij();
            var3 = new qab(param1);
            L1: while (true) {
              if (var3.a((byte) -111)) {
                stackOut_18_0 = (ij) var2;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                var4 = var3.a(-76);
                if (!Character.isWhitespace((char) var4)) {
                  L2: {
                    if (var4 == 34) {
                      break L2;
                    } else {
                      if (var4 == 39) {
                        break L2;
                      } else {
                        if (var4 == 40) {
                          var2.b(-10258, (ksa) (Object) new tsa(wdb.field_vb, var3.field_b - 1));
                          continue L1;
                        } else {
                          if (var4 == 41) {
                            var2.b(-10258, (ksa) (Object) new tsa(ua.field_o, -1 + var3.field_b));
                            continue L1;
                          } else {
                            if (var4 == 44) {
                              var2.b(-10258, (ksa) (Object) new tsa(jwa.field_l, -1 + var3.field_b));
                              continue L1;
                            } else {
                              var2.b(-10258, (ksa) (Object) ir.a(-20, var3));
                              continue L1;
                            }
                          }
                        }
                      }
                    }
                  }
                  var2.b(-10258, (ksa) (Object) iba.a(117, var3));
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref;
            stackOut_20_1 = new StringBuilder().append("ck.C(").append(-1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ck.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    ck(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
