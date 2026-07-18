/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kt extends elb {
    private int field_p;
    private int field_s;
    private int field_o;
    static int[] field_r;
    private int field_j;
    static int field_l;
    private byte[] field_k;
    private int field_n;
    private int field_m;
    private int field_i;
    private int field_q;

    final void a(int param0, int param1, int param2) {
        int var5 = VoidHunters.field_G;
        int var4 = 102 / ((-53 - param0) / 48);
        if (0 == param1) {
            ((kt) this).field_n = -(param2 >= 0 ? param2 : -param2) + ((kt) this).field_o;
            ((kt) this).field_n = ((kt) this).field_n * ((kt) this).field_n >> 12;
            ((kt) this).field_j = 4096;
            ((kt) this).field_p = ((kt) this).field_n;
        } else {
            ((kt) this).field_j = ((kt) this).field_n * ((kt) this).field_q >> 12;
            if (((kt) this).field_j < 0) {
                ((kt) this).field_j = 0;
            } else {
                if (((kt) this).field_j > 4096) {
                    ((kt) this).field_j = 4096;
                }
            }
            ((kt) this).field_n = ((kt) this).field_o - (param2 >= 0 ? param2 : -param2);
            ((kt) this).field_n = ((kt) this).field_n * ((kt) this).field_n >> 12;
            ((kt) this).field_n = ((kt) this).field_n * ((kt) this).field_j >> 12;
            ((kt) this).field_p = ((kt) this).field_p + (((kt) this).field_n * ((kt) this).field_i >> 12);
            ((kt) this).field_i = ((kt) this).field_s * ((kt) this).field_i >> 12;
        }
    }

    public static void d() {
        int var1 = 2;
        field_r = null;
    }

    void a(int param0, byte param1, int param2) {
        ((kt) this).field_k[param2] = (byte)param1;
        if (param0 != 0) {
            ((kt) this).a(59, (byte) -51, -30);
        }
    }

    final void a(boolean param0) {
        ((kt) this).field_p = 0;
        if (!param0) {
            return;
        }
        ((kt) this).field_m = 0;
    }

    final static void a(wma param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        apb var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        wma var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        apb stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        apb stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param0;
                if (var45.field_E == null) {
                  break L2;
                } else {
                  if (var45.field_z > 1) {
                    var62 = var45.field_E;
                    tga.a(rua.field_q, 0, (byte) 118, var62, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              int discarded$1 = -15;
              ila.c();
              break L1;
            }
            var66 = new int[param0.field_L];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param0.field_L];
            var65 = bva.field_b;
            var64 = mpa.field_o;
            var63 = lf.field_p;
            var13 = 0;
            L3: while (true) {
              if (var13 >= param0.field_L) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= pca.field_j) {
                    break L0;
                  } else {
                    L5: {
                      var14 = aq.field_p[var44];
                      var15 = param0.field_w[var14];
                      var16 = param0.field_N[var14];
                      var17 = param0.field_D[var14];
                      if (param0.field_j[var14] < bva.field_b.length) {
                        stackOut_23_0 = param0.field_j[var14];
                        stackIn_24_0 = stackOut_23_0;
                        break L5;
                      } else {
                        stackOut_22_0 = -1;
                        stackIn_24_0 = stackOut_22_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_24_0;
                      if (param0.field_G[var14] < bva.field_b.length) {
                        stackOut_26_0 = param0.field_G[var14];
                        stackIn_27_0 = stackOut_26_0;
                        break L6;
                      } else {
                        stackOut_25_0 = -1;
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_27_0;
                      if (bva.field_b.length > param0.field_I[var14]) {
                        stackOut_29_0 = param0.field_I[var14];
                        stackIn_30_0 = stackOut_29_0;
                        break L7;
                      } else {
                        stackOut_28_0 = -1;
                        stackIn_30_0 = stackOut_28_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_30_0;
                        if (gs.field_a == null) {
                          break L9;
                        } else {
                          if (param0.field_K == null) {
                            break L9;
                          } else {
                            if (param0.field_K.length <= var14) {
                              break L9;
                            } else {
                              if (param0.field_K[var14] == -1) {
                                break L9;
                              } else {
                                if (param0.field_K[var14] < gs.field_a.length) {
                                  stackOut_37_0 = gs.field_a[param0.field_K[var14]];
                                  stackIn_38_0 = stackOut_37_0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_36_0 = null;
                      stackIn_38_0 = (apb) (Object) stackOut_36_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_38_0;
                        var22 = cl.field_b[var15];
                        var23 = lr.field_o[var15];
                        var24 = cl.field_b[var16];
                        var25 = lr.field_o[var16];
                        var26 = cl.field_b[var17];
                        var27 = lr.field_o[var17];
                        if (var19 != var18) {
                          break L11;
                        } else {
                          if (var19 != var20) {
                            break L11;
                          } else {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_42_0 = var21_ref.field_c;
                                stackIn_43_0 = stackOut_42_0;
                                break L12;
                              } else {
                                stackOut_41_0 = 8355711;
                                stackIn_43_0 = stackOut_41_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_43_0;
                            var31 = 16711935 & var30;
                            var32 = 65280 & var30;
                            var33 = (-16711864 & var28 * var31) >>> 8 | (16711880 & var28 * var32) >>> 8;
                            var33 = var33 + 65793 * var29;
                            cma.a(var24, var26, false, var27, (16711422 & var33) >> 1, var23, var22, var25);
                            break L10;
                          }
                        }
                      }
                      L13: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref == null) {
                          stackOut_46_0 = 8355711;
                          stackIn_47_0 = stackOut_46_0;
                          break L13;
                        } else {
                          stackOut_45_0 = var21_ref.field_c;
                          stackIn_47_0 = stackOut_45_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = 16711935 & var34;
                      var36 = 65280 & var34;
                      var37 = (var28 * var36 & 16711864) >>> 8 | (-16711900 & var35 * var28) >>> 8;
                      var38 = -1895890689 & var29 * var35 >>> 8 | (16711892 & var36 * var29) >>> 8;
                      var38 = var38 + 65793 * var32;
                      var39 = 234946304 & var30 * var36 >>> 8 | -218169089 & var35 * var30 >>> 8;
                      var37 = var37 + var31 * 65793;
                      var39 = var39 + var33 * 65793;
                      vqb.a(var39 >> 16, var38 >> 8 & 255, var38 >> 16, var22, (var39 & 65337) >> 8, var25, var37 >> 16, (65314 & var37) >> 8, var39 & 255, -18419, var26, var27, var37 & 255, var24, var38 & 255, var23);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = var63[var13] * param6 + (var64[var13] * param5 + var65[var13] * param7) >> 8;
                  if (0 <= var14) {
                    break L14;
                  } else {
                    var14 = -var14;
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackOut_14_0 = 128;
                    stackIn_15_0 = stackOut_14_0;
                    break L15;
                  } else {
                    if (var14 < 128) {
                      stackOut_13_0 = 128 - -var14;
                      stackIn_15_0 = stackOut_13_0;
                      break L15;
                    } else {
                      stackOut_12_0 = 256;
                      stackIn_15_0 = stackOut_12_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_15_0;
                  var15 = var65[var13] * param2 + var64[var13] * param1 - -(param4 * var63[var13]) >> 8;
                  stackOut_15_0 = ap.field_p;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (0 <= var15) {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = var15;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L16;
                  } else {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = -var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L16;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = var14 * (256 - var15) >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var8;
            stackOut_52_1 = new StringBuilder().append("kt.E(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + param1 + ',' + param2 + ',' + -119 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    kt(int param0, int param1, int param2, int param3, int param4, float param5, float param6, float param7) {
        super(param0, param1, param2, param3, param4);
        ((kt) this).field_q = (int)(param7 * 4096.0f);
        ((kt) this).field_o = (int)(4096.0f * param6);
        int dupTemp$0 = (int)(Math.pow(0.5, (double)(-param5)) * 4096.0);
        ((kt) this).field_s = dupTemp$0;
        ((kt) this).field_i = dupTemp$0;
    }

    final void a(int param0) {
        ((kt) this).field_p = ((kt) this).field_p >> 4;
        ((kt) this).field_i = ((kt) this).field_s;
        if (((kt) this).field_p < 0) {
            ((kt) this).field_p = 0;
        } else {
            if (!(((kt) this).field_p <= 255)) {
                ((kt) this).field_p = 255;
            }
        }
        if (param0 != 1424903724) {
            ((kt) this).a(113, 123, 40);
        }
        int fieldTemp$0 = ((kt) this).field_m;
        ((kt) this).field_m = ((kt) this).field_m + 1;
        ((kt) this).a(0, (byte)((kt) this).field_p, fieldTemp$0);
        ((kt) this).field_p = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[]{0, 1, 21, 4, 3, 20, 12};
        field_l = 256;
    }
}
