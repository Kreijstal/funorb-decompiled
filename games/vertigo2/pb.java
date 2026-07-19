/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static boolean field_f;
    static dm field_b;
    static String field_c;
    static String field_e;
    static String field_d;
    static String field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 16711935) {
            pb.a((byte) -16, -56, 95, -50);
        }
        field_c = null;
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        oi.field_b = param3;
        ma.field_m = param2;
        int var4 = -120 / ((64 - param0) / 39);
        sr.field_a = param1;
    }

    final static void a(int param0, int param1, int param2, jp param3, int param4, int param5, int param6, int param7) {
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
        uq var21_ref = null;
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
        jp var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        uq stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        uq stackOut_39_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param3;
                if (var45.field_x == null) {
                  break L2;
                } else {
                  if (-2 > (var45.field_G ^ -1)) {
                    var61 = var45.field_x;
                    op.a(0, oq.field_F, 0, var61, false);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ln.b(0);
              break L1;
            }
            L3: {
              var55 = new int[param3.field_K];
              var50 = var55;
              var41 = var50;
              var8_array = var41;
              if (param7 >= 30) {
                break L3;
              } else {
                field_f = true;
                break L3;
              }
            }
            var65 = new int[param3.field_K];
            var62 = pk.field_w;
            var63 = dp.field_A;
            var64 = dh.field_d;
            var13 = 0;
            L4: while (true) {
              if (param3.field_K <= var13) {
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (var44 >= ja.field_a) {
                    break L0;
                  } else {
                    L6: {
                      var14 = ac.field_K[var44];
                      var15 = param3.field_p[var14];
                      var16 = param3.field_L[var14];
                      var17 = param3.field_c[var14];
                      if (pk.field_w.length > param3.field_g[var14]) {
                        stackOut_25_0 = param3.field_g[var14];
                        stackIn_26_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_24_0 = -1;
                        stackIn_26_0 = stackOut_24_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_26_0;
                      if (param3.field_P[var14] < pk.field_w.length) {
                        stackOut_28_0 = param3.field_P[var14];
                        stackIn_29_0 = stackOut_28_0;
                        break L7;
                      } else {
                        stackOut_27_0 = -1;
                        stackIn_29_0 = stackOut_27_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_29_0;
                      if (pk.field_w.length > param3.field_C[var14]) {
                        stackOut_31_0 = param3.field_C[var14];
                        stackIn_32_0 = stackOut_31_0;
                        break L8;
                      } else {
                        stackOut_30_0 = -1;
                        stackIn_32_0 = stackOut_30_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_32_0;
                        if (wc.field_o == null) {
                          break L10;
                        } else {
                          if (param3.field_J == null) {
                            break L10;
                          } else {
                            if (param3.field_J.length <= var14) {
                              break L10;
                            } else {
                              if ((param3.field_J[var14] ^ -1) == 0) {
                                break L10;
                              } else {
                                if (wc.field_o.length > param3.field_J[var14]) {
                                  stackOut_39_0 = wc.field_o[param3.field_J[var14]];
                                  stackIn_40_0 = stackOut_39_0;
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_38_0 = null;
                      stackIn_40_0 = (uq) ((Object) stackOut_38_0);
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_40_0;
                        var22 = nj.field_a[var15];
                        var23 = ml.field_t[var15];
                        var24 = nj.field_a[var16];
                        var25 = ml.field_t[var16];
                        var26 = nj.field_a[var17];
                        var27 = ml.field_t[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var20 != var19) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21_ref != null) {
                                stackOut_44_0 = var21_ref.field_e;
                                stackIn_45_0 = stackOut_44_0;
                                break L13;
                              } else {
                                stackOut_43_0 = 8355711;
                                stackIn_45_0 = stackOut_43_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_45_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = var28 * var31 >>> 1661001512 & 989790463 | (var28 * var32 & 16711885) >>> -1944780600;
                            var33 = var33 + 65793 * var29;
                            oj.a(var27, var22, var24, var26, (byte) 107, var23, var25, (16711422 & var33) >> 138645761);
                            break L11;
                          }
                        }
                      }
                      L14: {
                        var28 = var55[var18];
                        var29 = var55[var19];
                        var30 = var55[var20];
                        var31 = var65[var18];
                        var32 = var65[var19];
                        var33 = var65[var20];
                        if (var21_ref != null) {
                          stackOut_48_0 = var21_ref.field_e;
                          stackIn_49_0 = stackOut_48_0;
                          break L14;
                        } else {
                          stackOut_47_0 = 8355711;
                          stackIn_49_0 = stackOut_47_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_49_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = (-16711842 & var35 * var28) >>> 1051127048 | -436142336 & var36 * var28 >>> 553557672;
                      var38 = var36 * var29 >>> 373544584 & -570360064 | 385810687 & var35 * var29 >>> 2129990280;
                      var38 = var38 + 65793 * var32;
                      var37 = var37 + var31 * 65793;
                      var39 = (var30 * var36 & 16711862) >>> -957052824 | (-16711741 & var35 * var30) >>> -28285912;
                      var39 = var39 + var33 * 65793;
                      vj.a(var25, (byte) -122, 255 & var38, var38 >> 164300784, 255 & var39, var22, 255 & var37 >> 161061704, var37 >> -1408837296, var24, var23, 255 & var39 >> 824558760, var26, var39 >> 1178158448, var37 & 255, var38 >> -1973704792 & 255, var27);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var62[var13] * param4 - -(var63[var13] * param1) + param6 * var64[var13] >> 1126490216;
                  if (0 <= var14) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (var14 < 0) {
                    stackOut_16_0 = 128;
                    stackIn_17_0 = stackOut_16_0;
                    break L16;
                  } else {
                    if (-129 < (var14 ^ -1)) {
                      stackOut_15_0 = 128 + var14;
                      stackIn_17_0 = stackOut_15_0;
                      break L16;
                    } else {
                      stackOut_14_0 = 256;
                      stackIn_17_0 = stackOut_14_0;
                      break L16;
                    }
                  }
                }
                L17: {
                  var14 = stackIn_17_0;
                  var15 = param2 * var63[var13] + (var62[var13] * param0 + var64[var13] * param5) >> 314446696;
                  stackOut_17_0 = bl.field_r;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if ((var15 ^ -1) <= -1) {
                    stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                    stackOut_19_1 = var15;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L17;
                  } else {
                    stackOut_18_0 = (int[]) ((Object) stackIn_18_0);
                    stackOut_18_1 = -var15;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L17;
                  }
                }
                var15 = stackIn_20_0[stackIn_20_1];
                var14 = var14 * (256 + -var15) >>> 1251422152;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var8);
            stackOut_52_1 = new StringBuilder().append("pb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param3 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L18;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L18;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_d = "Oh, dear. There's a blue paint pot on this level. Until you pick it up, you can't paint the block beneath it purple! What's worse is that if you grab the blue pot, you'll have to paint five tiles blue before you can pick up some purple paint. The compass you can collect on this level should help - pick it up to get a zoomed-out view of the level.";
        field_f = false;
        field_c = "Click or press F10 to open Quick Chat";
        field_e = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_a = "Return to lobby";
    }
}
