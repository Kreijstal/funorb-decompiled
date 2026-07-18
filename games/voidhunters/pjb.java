/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pjb extends llb {
    private llb field_xb;
    static Object field_vb;
    private llb field_Ab;
    private llb field_yb;
    private llb field_wb;
    private int field_zb;
    private llb field_Bb;
    private llb field_Cb;
    static String field_Db;

    final boolean j(int param0) {
        if (!(0 == ((pjb) this).field_Cb.field_o)) {
            ((pjb) this).field_zb = 20;
            return true;
        }
        if (param0 >= -2) {
            ((pjb) this).field_xb = null;
            if (((pjb) this).field_Cb.field_C == 0) {
                return false;
            }
            if (((pjb) this).field_zb <= 0) {
                if (((pjb) this).field_zb != 0) {
                    return false;
                }
                ((pjb) this).field_zb = 3;
                return true;
            }
            ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
            if (((pjb) this).field_zb != 0) {
                return false;
            }
            ((pjb) this).field_zb = 3;
            return true;
        }
        if (((pjb) this).field_Cb.field_C == 0) {
            return false;
        }
        if (((pjb) this).field_zb > 0) {
            ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
            if (!(((pjb) this).field_zb != 0)) {
                ((pjb) this).field_zb = 3;
                return true;
            }
            return false;
        }
        if (((pjb) this).field_zb != 0) {
            return false;
        }
        ((pjb) this).field_zb = 3;
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((pjb) this).field_G = param5;
        ((pjb) this).field_L = param0;
        ((pjb) this).field_hb = param6;
        ((pjb) this).field_K = param2;
        ((pjb) this).a(param1, param3, (byte) 88, param4);
        if (param7 != -1) {
            Object var10 = null;
            pjb.a((faa) null, (tv[]) null, -91, 37, (Class[]) null, 13);
        }
    }

    final static void a(faa param0, tv[] param1, int param2, int param3, Class[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        tv[] var8 = null;
        int var9 = 0;
        tv var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                stackOut_3_0 = param1.length;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_4_0;
              param0.a(-632, var6_int, param2);
              if (var6_int != 0) {
                var7 = iia.a(-98, -1 + param4.length);
                var8 = param1;
                var9 = 0;
                L3: while (true) {
                  if (var8.length <= var9) {
                    break L2;
                  } else {
                    L4: {
                      var10 = var8[var9];
                      stackOut_8_0 = (faa) param0;
                      stackOut_8_1 = 114;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var10 == null) {
                        stackOut_10_0 = (faa) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L4;
                      } else {
                        stackOut_9_0 = (faa) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L4;
                      }
                    }
                    if (vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0)) {
                      var11 = 0;
                      L5: while (true) {
                        L6: {
                          if (param4.length <= var11) {
                            stb.a(2, param3, param0, var10);
                            var9++;
                            break L6;
                          } else {
                            if (param4[var11] == ((Object) (Object) var10).getClass()) {
                              param0.a(-632, var11, var7);
                              stb.a(2, param3, param0, var10);
                              break L6;
                            } else {
                              var11++;
                              continue L5;
                            }
                          }
                        }
                        var9++;
                        var9++;
                        break L2;
                      }
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (param5 >= 117) {
                break L7;
              } else {
                field_vb = null;
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("pjb.C(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          L10: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param5 + ')');
        }
    }

    final int a(int param0, int param1, byte param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var5 = 50 % ((24 - param2) / 41);
          var6 = 0;
          var7 = ((pjb) this).field_yb.field_G - ((pjb) this).field_Bb.field_G;
          if (0 >= var7) {
            break L0;
          } else {
            var8 = ((pjb) this).field_Bb.field_K;
            var9 = param0 - param1;
            var6 = (var9 * var8 + var7 / 2) / var7;
            break L0;
          }
        }
        if (param3) {
          L1: {
            if (0 > var6) {
              var6 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          if (-param1 + param0 >= var6) {
            return var6;
          } else {
            var6 = -param1 + param0;
            return var6;
          }
        } else {
          L2: {
            if (param0 + -param1 < var6) {
              var6 = param0 - param1;
              break L2;
            } else {
              break L2;
            }
          }
          if (0 > var6) {
            var6 = 0;
            return var6;
          } else {
            return var6;
          }
        }
    }

    public static void e() {
        field_vb = null;
        field_Db = null;
    }

    final static jk a(long param0) {
        return (jk) (Object) icb.field_p.a(-1, param0);
    }

    final boolean i(int param0) {
        if (((pjb) this).field_Ab.field_o != 0) {
            ((pjb) this).field_zb = 20;
            return true;
        }
        if (param0 != 20) {
            boolean discarded$4 = ((pjb) this).a(false);
            if (((pjb) this).field_Ab.field_C == 0) {
                return false;
            }
            if (!(((pjb) this).field_zb <= 0)) {
                ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
            }
            if (0 != ((pjb) this).field_zb) {
                return false;
            }
            if (((pjb) this).field_Bb.field_db + ((pjb) this).field_Bb.field_u <= uia.field_b) {
                return false;
            }
            ((pjb) this).field_zb = 3;
            return true;
        }
        if (((pjb) this).field_Ab.field_C == 0) {
            return false;
        }
        if (!(((pjb) this).field_zb <= 0)) {
            ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
        }
        if (0 != ((pjb) this).field_zb) {
            return false;
        }
        if (((pjb) this).field_Bb.field_db + ((pjb) this).field_Bb.field_u <= uia.field_b) {
            return false;
        }
        ((pjb) this).field_zb = 3;
        return true;
    }

    pjb(long param0, pjb param1) {
        this(param0, param1.field_wb, param1.field_Cb, param1.field_Ab, param1.field_Bb);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        llb var15 = null;
        llb var16 = null;
        llb var17 = null;
        llb var18 = null;
        llb var19 = null;
        llb var20 = null;
        llb stackIn_12_0 = null;
        llb stackIn_12_1 = null;
        llb stackIn_12_2 = null;
        llb stackIn_13_0 = null;
        llb stackIn_13_1 = null;
        llb stackIn_13_2 = null;
        llb stackIn_14_0 = null;
        llb stackIn_14_1 = null;
        llb stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        llb stackIn_18_0 = null;
        llb stackIn_18_1 = null;
        llb stackIn_18_2 = null;
        llb stackIn_19_0 = null;
        llb stackIn_19_1 = null;
        llb stackIn_19_2 = null;
        llb stackIn_20_0 = null;
        llb stackIn_20_1 = null;
        llb stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        llb stackOut_17_0 = null;
        llb stackOut_17_1 = null;
        llb stackOut_17_2 = null;
        llb stackOut_19_0 = null;
        llb stackOut_19_1 = null;
        llb stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        llb stackOut_18_0 = null;
        llb stackOut_18_1 = null;
        llb stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        llb stackOut_11_0 = null;
        llb stackOut_11_1 = null;
        llb stackOut_11_2 = null;
        llb stackOut_13_0 = null;
        llb stackOut_13_1 = null;
        llb stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        llb stackOut_12_0 = null;
        llb stackOut_12_1 = null;
        llb stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          if (((pjb) this).field_G >= ((pjb) this).field_hb * 2) {
            var6 = -((pjb) this).field_hb + ((pjb) this).field_G;
            var5 = ((pjb) this).field_hb;
            break L0;
          } else {
            var6 = ((pjb) this).field_G / 2;
            var5 = ((pjb) this).field_G / 2;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param0 <= 0) {
          L1: {
            var9 = param0 - param3;
            var10 = var7 - var8;
            var11 = 0;
            if (var9 <= 0) {
              break L1;
            } else {
              var11 = (var10 * param1 + var9 / 2) / var9;
              break L1;
            }
          }
          L2: {
            var12 = var11 - -(var8 / 2);
            var15 = ((pjb) this).field_wb;
            var15.field_G = var5;
            var15.field_hb = ((pjb) this).field_hb;
            var15.field_L = 0;
            var15.field_K = 0;
            var16 = ((pjb) this).field_Cb;
            var16.field_L = 0;
            var16.field_G = ((pjb) this).field_G - var6;
            var16.field_K = var6;
            var16.field_hb = ((pjb) this).field_hb;
            var14 = 60 / ((-68 - param2) / 40);
            var17 = ((pjb) this).field_yb;
            var17.field_K = var5;
            var17.field_G = var7;
            var17.field_L = 0;
            var17.field_hb = ((pjb) this).field_hb;
            var18 = ((pjb) this).field_Ab;
            var18.field_hb = ((pjb) this).field_hb;
            var18.field_L = 0;
            var18.field_G = var12;
            var18.field_K = 0;
            var19 = ((pjb) this).field_xb;
            var19.field_hb = ((pjb) this).field_hb;
            var19.field_L = 0;
            var19.field_K = var12;
            var19.field_G = -var12 + var7;
            var20 = ((pjb) this).field_Bb;
            var20.field_G = var8;
            stackOut_17_0 = ((pjb) this).field_wb;
            stackOut_17_1 = ((pjb) this).field_Cb;
            stackOut_17_2 = ((pjb) this).field_yb;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_19_2 = stackOut_17_2;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            if (param3 >= param0) {
              stackOut_19_0 = (llb) (Object) stackIn_19_0;
              stackOut_19_1 = (llb) (Object) stackIn_19_1;
              stackOut_19_2 = (llb) (Object) stackIn_19_2;
              stackOut_19_3 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              stackIn_20_3 = stackOut_19_3;
              break L2;
            } else {
              stackOut_18_0 = (llb) (Object) stackIn_18_0;
              stackOut_18_1 = (llb) (Object) stackIn_18_1;
              stackOut_18_2 = (llb) (Object) stackIn_18_2;
              stackOut_18_3 = 1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_20_3 = stackOut_18_3;
              break L2;
            }
          }
          stackIn_20_2.field_y = stackIn_20_3 != 0;
          stackIn_20_1.field_y = stackIn_20_3 != 0;
          stackIn_20_0.field_y = stackIn_20_3 != 0;
          var20.field_L = 0;
          var20.field_hb = ((pjb) this).field_hb;
          var20.field_K = var11;
          return;
        } else {
          L3: {
            var8 = var8 * param3 / param0;
            if (((pjb) this).field_hb > var8) {
              var8 = ((pjb) this).field_hb;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var7 >= var8) {
              break L4;
            } else {
              var8 = var7;
              break L4;
            }
          }
          L5: {
            var9 = param0 - param3;
            var10 = var7 - var8;
            var11 = 0;
            if (var9 <= 0) {
              break L5;
            } else {
              var11 = (var10 * param1 + var9 / 2) / var9;
              break L5;
            }
          }
          L6: {
            var12 = var11 - -(var8 / 2);
            var15 = ((pjb) this).field_wb;
            var15.field_G = var5;
            var15.field_hb = ((pjb) this).field_hb;
            var15.field_L = 0;
            var15.field_K = 0;
            var16 = ((pjb) this).field_Cb;
            var16.field_L = 0;
            var16.field_G = ((pjb) this).field_G - var6;
            var16.field_K = var6;
            var16.field_hb = ((pjb) this).field_hb;
            var14 = 60 / ((-68 - param2) / 40);
            var17 = ((pjb) this).field_yb;
            var17.field_K = var5;
            var17.field_G = var7;
            var17.field_L = 0;
            var17.field_hb = ((pjb) this).field_hb;
            var18 = ((pjb) this).field_Ab;
            var18.field_hb = ((pjb) this).field_hb;
            var18.field_L = 0;
            var18.field_G = var12;
            var18.field_K = 0;
            var19 = ((pjb) this).field_xb;
            var19.field_hb = ((pjb) this).field_hb;
            var19.field_L = 0;
            var19.field_K = var12;
            var19.field_G = -var12 + var7;
            var20 = ((pjb) this).field_Bb;
            var20.field_G = var8;
            stackOut_11_0 = ((pjb) this).field_wb;
            stackOut_11_1 = ((pjb) this).field_Cb;
            stackOut_11_2 = ((pjb) this).field_yb;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_13_2 = stackOut_11_2;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            if (param3 >= param0) {
              stackOut_13_0 = (llb) (Object) stackIn_13_0;
              stackOut_13_1 = (llb) (Object) stackIn_13_1;
              stackOut_13_2 = (llb) (Object) stackIn_13_2;
              stackOut_13_3 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              stackIn_14_3 = stackOut_13_3;
              break L6;
            } else {
              stackOut_12_0 = (llb) (Object) stackIn_12_0;
              stackOut_12_1 = (llb) (Object) stackIn_12_1;
              stackOut_12_2 = (llb) (Object) stackIn_12_2;
              stackOut_12_3 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              stackIn_14_3 = stackOut_12_3;
              break L6;
            }
          }
          stackIn_14_2.field_y = stackIn_14_3 != 0;
          stackIn_14_1.field_y = stackIn_14_3 != 0;
          stackIn_14_0.field_y = stackIn_14_3 != 0;
          var20.field_L = 0;
          var20.field_hb = ((pjb) this).field_hb;
          var20.field_K = var11;
          return;
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((pjb) this).field_yb = null;
            if (0 == ((pjb) this).field_Bb.field_C) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == ((pjb) this).field_Bb.field_C) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean b(boolean param0) {
        if (((pjb) this).field_xb.field_o != 0) {
          ((pjb) this).field_zb = 20;
          return true;
        } else {
          if (-1 != ((pjb) this).field_xb.field_C) {
            L0: {
              if (-1 < ((pjb) this).field_zb) {
                ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((pjb) this).field_zb != 0) {
              if (!param0) {
                ((pjb) this).field_Ab = null;
                return false;
              } else {
                return false;
              }
            } else {
              if (uia.field_b < ((pjb) this).field_Bb.field_E + (((pjb) this).field_Bb.field_u - -((pjb) this).field_Bb.field_db + ((pjb) this).field_Bb.field_G)) {
                if (param0) {
                  return false;
                } else {
                  ((pjb) this).field_Ab = null;
                  return false;
                }
              } else {
                ((pjb) this).field_zb = 3;
                return true;
              }
            }
          } else {
            if (param0) {
              return false;
            } else {
              ((pjb) this).field_Ab = null;
              return false;
            }
          }
        }
    }

    final boolean h(int param0) {
        if (((pjb) this).field_wb.field_o == param0) {
          if (0 != ((pjb) this).field_wb.field_C) {
            if (0 >= ((pjb) this).field_zb) {
              if (-1 != ((pjb) this).field_zb) {
                return false;
              } else {
                ((pjb) this).field_zb = 3;
                return true;
              }
            } else {
              ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
              if (-1 != ((pjb) this).field_zb) {
                return false;
              } else {
                ((pjb) this).field_zb = 3;
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          ((pjb) this).field_zb = 20;
          return true;
        }
    }

    pjb(long param0, llb param1, llb param2, llb param3, llb param4) {
        super(param0, (llb) null);
        RuntimeException var7 = null;
        llb var9 = null;
        llb var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((pjb) this).field_wb = new llb(0L, param1);
            ((pjb) this).field_Cb = new llb(0L, param2);
            ((pjb) this).b(-561, ((pjb) this).field_wb);
            ((pjb) this).b(-561, ((pjb) this).field_Cb);
            ((pjb) this).field_yb = new llb(0L, (llb) null);
            ((pjb) this).b(-561, ((pjb) this).field_yb);
            ((pjb) this).field_Ab = new llb(0L, param3);
            ((pjb) this).field_xb = new llb(0L, param3);
            ((pjb) this).field_xb.field_S = true;
            var9 = ((pjb) this).field_Ab;
            var10 = var9;
            var10.field_S = true;
            ((pjb) this).field_yb.b(-561, ((pjb) this).field_Ab);
            ((pjb) this).field_yb.b(-561, ((pjb) this).field_xb);
            ((pjb) this).field_Bb = new llb(0L, param4);
            ((pjb) this).field_Bb.field_Z = true;
            ((pjb) this).field_yb.b(-561, ((pjb) this).field_Bb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("pjb.<init>(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "Next condition/action value 2";
    }
}
