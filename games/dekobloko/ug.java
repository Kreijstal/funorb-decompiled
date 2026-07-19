/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends bh {
    static int[] field_q;
    int field_o;
    static String field_n;
    int field_p;

    final static void a(vg param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
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
        dh var21_ref = null;
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
        vg var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_18_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        dh stackIn_42_0 = null;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        int stackIn_49_6 = 0;
        int stackIn_49_7 = 0;
        int stackIn_49_8 = 0;
        int stackIn_49_9 = 0;
        int stackIn_49_10 = 0;
        int stackIn_49_11 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        int stackIn_50_5 = 0;
        int stackIn_50_6 = 0;
        int stackIn_50_7 = 0;
        int stackIn_50_8 = 0;
        int stackIn_50_9 = 0;
        int stackIn_50_10 = 0;
        int stackIn_50_11 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackIn_51_5 = 0;
        int stackIn_51_6 = 0;
        int stackIn_51_7 = 0;
        int stackIn_51_8 = 0;
        int stackIn_51_9 = 0;
        int stackIn_51_10 = 0;
        int stackIn_51_11 = 0;
        int stackIn_51_12 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        short stackOut_33_0 = 0;
        dh stackOut_40_0 = null;
        Object stackOut_41_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        int stackOut_48_6 = 0;
        int stackOut_48_7 = 0;
        int stackOut_48_8 = 0;
        int stackOut_48_9 = 0;
        int stackOut_48_10 = 0;
        int stackOut_48_11 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        int stackOut_50_5 = 0;
        int stackOut_50_6 = 0;
        int stackOut_50_7 = 0;
        int stackOut_50_8 = 0;
        int stackOut_50_9 = 0;
        int stackOut_50_10 = 0;
        int stackOut_50_11 = 0;
        int stackOut_50_12 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int stackOut_49_5 = 0;
        int stackOut_49_6 = 0;
        int stackOut_49_7 = 0;
        int stackOut_49_8 = 0;
        int stackOut_49_9 = 0;
        int stackOut_49_10 = 0;
        int stackOut_49_11 = 0;
        int stackOut_49_12 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int[] stackOut_18_0 = null;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var40 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var44 = param0;
              if (!param4) {
                break L1;
              } else {
                field_q = (int[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var44.field_Q == null) {
                  break L3;
                } else {
                  if ((var44.field_B ^ -1) >= -2) {
                    break L3;
                  } else {
                    var60 = var44.field_Q;
                    sh.a(var60, -25724, 0, nm.field_Nb, 0);
                    if (var40 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              kh.a(2);
              break L2;
            }
            var54 = new int[param0.field_D];
            var49 = var54;
            var41 = var49;
            var8_array = var41;
            var64 = new int[param0.field_D];
            var62 = id.field_M;
            var61 = bc.field_I;
            var63 = sf.field_C;
            var13 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  L7: {
                    if ((param0.field_D ^ -1) >= (var13 ^ -1)) {
                      break L7;
                    } else {
                      var14 = var61[var13] * param1 + var62[var13] * param3 + var63[var13] * param6 >> 227238920;
                      stackOut_9_0 = var14 ^ -1;
                      stackOut_9_1 = -1;
                      stackIn_24_0 = stackOut_9_0;
                      stackIn_24_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var40 != 0) {
                        L8: while (true) {
                          if (stackIn_24_0 >= stackIn_24_1) {
                            break L6;
                          } else {
                            var14 = hb.field_Vb[var13];
                            var15 = param0.field_M[var14];
                            var16 = param0.field_c[var14];
                            var17 = param0.field_A[var14];
                            if (var40 != 0) {
                              break L5;
                            } else {
                              L9: {
                                if (id.field_M.length > param0.field_F[var14]) {
                                  stackOut_28_0 = param0.field_F[var14];
                                  stackIn_29_0 = stackOut_28_0;
                                  break L9;
                                } else {
                                  stackOut_27_0 = -1;
                                  stackIn_29_0 = stackOut_27_0;
                                  break L9;
                                }
                              }
                              L10: {
                                var18 = stackIn_29_0;
                                if (id.field_M.length > param0.field_t[var14]) {
                                  stackOut_31_0 = param0.field_t[var14];
                                  stackIn_32_0 = stackOut_31_0;
                                  break L10;
                                } else {
                                  stackOut_30_0 = -1;
                                  stackIn_32_0 = stackOut_30_0;
                                  break L10;
                                }
                              }
                              L11: {
                                var19 = stackIn_32_0;
                                if ((id.field_M.length ^ -1) >= (param0.field_r[var14] ^ -1)) {
                                  stackOut_34_0 = -1;
                                  stackIn_35_0 = stackOut_34_0;
                                  break L11;
                                } else {
                                  stackOut_33_0 = param0.field_r[var14];
                                  stackIn_35_0 = stackOut_33_0;
                                  break L11;
                                }
                              }
                              L12: {
                                L13: {
                                  var20 = stackIn_35_0;
                                  if (null == l.field_i) {
                                    break L13;
                                  } else {
                                    if (null == param0.field_j) {
                                      break L13;
                                    } else {
                                      if ((param0.field_j.length ^ -1) >= (var14 ^ -1)) {
                                        break L13;
                                      } else {
                                        if (0 == (param0.field_j[var14] ^ -1)) {
                                          break L13;
                                        } else {
                                          if (l.field_i.length <= param0.field_j[var14]) {
                                            break L13;
                                          } else {
                                            stackOut_40_0 = l.field_i[param0.field_j[var14]];
                                            stackIn_42_0 = stackOut_40_0;
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_41_0 = null;
                                stackIn_42_0 = (dh) ((Object) stackOut_41_0);
                                break L12;
                              }
                              L14: {
                                L15: {
                                  L16: {
                                    var21_ref = stackIn_42_0;
                                    var22 = kl.field_n[var15];
                                    var23 = rn.field_b[var15];
                                    var24 = kl.field_n[var16];
                                    var25 = rn.field_b[var16];
                                    var26 = kl.field_n[var17];
                                    var27 = rn.field_b[var17];
                                    if (var18 != var19) {
                                      break L16;
                                    } else {
                                      if ((var20 ^ -1) == (var19 ^ -1)) {
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  L17: {
                                    var28 = var54[var18];
                                    var29 = var54[var19];
                                    var30 = var54[var20];
                                    var31 = var64[var18];
                                    var32 = var64[var19];
                                    var33 = var64[var20];
                                    if (var21_ref != null) {
                                      stackOut_47_0 = var21_ref.field_a;
                                      stackIn_48_0 = stackOut_47_0;
                                      break L17;
                                    } else {
                                      stackOut_46_0 = 8355711;
                                      stackIn_48_0 = stackOut_46_0;
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    var34 = stackIn_48_0;
                                    var35 = var34 & 16711935;
                                    var36 = var34 & 65280;
                                    var37 = (16711810 & var36 * var28) >>> -1017884856 | (var35 * var28 & -16711879) >>> 1795278632;
                                    var38 = var35 * var29 >>> 770485128 & 285147391 | var36 * var29 >>> 853475976 & 1291910912;
                                    var39 = -755040001 & var35 * var30 >>> -1925801080 | var36 * var30 >>> -1947323704 & -2046755072;
                                    var37 = var37 + var31 * 65793;
                                    var38 = var38 + var32 * 65793;
                                    var39 = var39 + var33 * 65793;
                                    stackOut_48_0 = var37 & 255;
                                    stackOut_48_1 = var25;
                                    stackOut_48_2 = var22;
                                    stackOut_48_3 = var39 >> 225006032;
                                    stackOut_48_4 = var24;
                                    stackOut_48_5 = var37 >> 2099190608;
                                    stackOut_48_6 = var39 & 255;
                                    stackOut_48_7 = 255 & var38;
                                    stackOut_48_8 = var27;
                                    stackOut_48_9 = var38 >> 281414704;
                                    stackOut_48_10 = var39 >> 1640941864 & 255;
                                    stackOut_48_11 = var23;
                                    stackIn_50_0 = stackOut_48_0;
                                    stackIn_50_1 = stackOut_48_1;
                                    stackIn_50_2 = stackOut_48_2;
                                    stackIn_50_3 = stackOut_48_3;
                                    stackIn_50_4 = stackOut_48_4;
                                    stackIn_50_5 = stackOut_48_5;
                                    stackIn_50_6 = stackOut_48_6;
                                    stackIn_50_7 = stackOut_48_7;
                                    stackIn_50_8 = stackOut_48_8;
                                    stackIn_50_9 = stackOut_48_9;
                                    stackIn_50_10 = stackOut_48_10;
                                    stackIn_50_11 = stackOut_48_11;
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    stackIn_49_2 = stackOut_48_2;
                                    stackIn_49_3 = stackOut_48_3;
                                    stackIn_49_4 = stackOut_48_4;
                                    stackIn_49_5 = stackOut_48_5;
                                    stackIn_49_6 = stackOut_48_6;
                                    stackIn_49_7 = stackOut_48_7;
                                    stackIn_49_8 = stackOut_48_8;
                                    stackIn_49_9 = stackOut_48_9;
                                    stackIn_49_10 = stackOut_48_10;
                                    stackIn_49_11 = stackOut_48_11;
                                    if (param4) {
                                      stackOut_50_0 = stackIn_50_0;
                                      stackOut_50_1 = stackIn_50_1;
                                      stackOut_50_2 = stackIn_50_2;
                                      stackOut_50_3 = stackIn_50_3;
                                      stackOut_50_4 = stackIn_50_4;
                                      stackOut_50_5 = stackIn_50_5;
                                      stackOut_50_6 = stackIn_50_6;
                                      stackOut_50_7 = stackIn_50_7;
                                      stackOut_50_8 = stackIn_50_8;
                                      stackOut_50_9 = stackIn_50_9;
                                      stackOut_50_10 = stackIn_50_10;
                                      stackOut_50_11 = stackIn_50_11;
                                      stackOut_50_12 = 0;
                                      stackIn_51_0 = stackOut_50_0;
                                      stackIn_51_1 = stackOut_50_1;
                                      stackIn_51_2 = stackOut_50_2;
                                      stackIn_51_3 = stackOut_50_3;
                                      stackIn_51_4 = stackOut_50_4;
                                      stackIn_51_5 = stackOut_50_5;
                                      stackIn_51_6 = stackOut_50_6;
                                      stackIn_51_7 = stackOut_50_7;
                                      stackIn_51_8 = stackOut_50_8;
                                      stackIn_51_9 = stackOut_50_9;
                                      stackIn_51_10 = stackOut_50_10;
                                      stackIn_51_11 = stackOut_50_11;
                                      stackIn_51_12 = stackOut_50_12;
                                      break L18;
                                    } else {
                                      stackOut_49_0 = stackIn_49_0;
                                      stackOut_49_1 = stackIn_49_1;
                                      stackOut_49_2 = stackIn_49_2;
                                      stackOut_49_3 = stackIn_49_3;
                                      stackOut_49_4 = stackIn_49_4;
                                      stackOut_49_5 = stackIn_49_5;
                                      stackOut_49_6 = stackIn_49_6;
                                      stackOut_49_7 = stackIn_49_7;
                                      stackOut_49_8 = stackIn_49_8;
                                      stackOut_49_9 = stackIn_49_9;
                                      stackOut_49_10 = stackIn_49_10;
                                      stackOut_49_11 = stackIn_49_11;
                                      stackOut_49_12 = 1;
                                      stackIn_51_0 = stackOut_49_0;
                                      stackIn_51_1 = stackOut_49_1;
                                      stackIn_51_2 = stackOut_49_2;
                                      stackIn_51_3 = stackOut_49_3;
                                      stackIn_51_4 = stackOut_49_4;
                                      stackIn_51_5 = stackOut_49_5;
                                      stackIn_51_6 = stackOut_49_6;
                                      stackIn_51_7 = stackOut_49_7;
                                      stackIn_51_8 = stackOut_49_8;
                                      stackIn_51_9 = stackOut_49_9;
                                      stackIn_51_10 = stackOut_49_10;
                                      stackIn_51_11 = stackOut_49_11;
                                      stackIn_51_12 = stackOut_49_12;
                                      break L18;
                                    }
                                  }
                                  wf.a(stackIn_51_0, stackIn_51_1, stackIn_51_2, stackIn_51_3, stackIn_51_4, stackIn_51_5, stackIn_51_6, stackIn_51_7, stackIn_51_8, stackIn_51_9, stackIn_51_10, stackIn_51_11, stackIn_51_12 != 0, var37 >> -1725201496 & 255, var26, 255 & var38 >> -522552696);
                                  if (var40 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                                L19: {
                                  var28 = var54[var18];
                                  var29 = var64[var18];
                                  if (var21_ref != null) {
                                    stackOut_54_0 = var21_ref.field_a;
                                    stackIn_55_0 = stackOut_54_0;
                                    break L19;
                                  } else {
                                    stackOut_53_0 = 8355711;
                                    stackIn_55_0 = stackOut_53_0;
                                    break L19;
                                  }
                                }
                                var30 = stackIn_55_0;
                                var31 = var30 & 16711935;
                                var32 = var30 & 65280;
                                var33 = 1476460288 & var32 * var28 >>> -1357940280 | -268500737 & var31 * var28 >>> 1730230664;
                                var33 = var33 + 65793 * var29;
                                tb.a(var23, var27, var22, var33 >> 626219073 & 8355711, var24, var25, 127, var26);
                                break L14;
                              }
                              var13++;
                              if (var40 == 0) {
                                stackOut_23_0 = var13;
                                stackOut_23_1 = ta.field_d;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                continue L8;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      } else {
                        L20: {
                          if (stackIn_10_0 > stackIn_10_1) {
                            var14 = -var14;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (0 > var14) {
                            stackOut_17_0 = 128;
                            stackIn_18_0 = stackOut_17_0;
                            break L21;
                          } else {
                            if (var14 < 128) {
                              stackOut_16_0 = var14 + 128;
                              stackIn_18_0 = stackOut_16_0;
                              break L21;
                            } else {
                              stackOut_15_0 = 256;
                              stackIn_18_0 = stackOut_15_0;
                              break L21;
                            }
                          }
                        }
                        L22: {
                          var14 = stackIn_18_0;
                          var15 = param2 * var62[var13] + var61[var13] * param7 - -(var63[var13] * param5) >> -1816498232;
                          stackOut_18_0 = ch.field_b;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_19_0 = stackOut_18_0;
                          if (-1 >= (var15 ^ -1)) {
                            stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                            stackOut_20_1 = var15;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            break L22;
                          } else {
                            stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                            stackOut_19_1 = -var15;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            break L22;
                          }
                        }
                        var15 = stackIn_21_0[stackIn_21_1];
                        var14 = (256 + -var15) * var14 >>> 1268162184;
                        var54[var13] = var14;
                        var64[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                          continue L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var13 = 0;
                  L23: while (true) {
                    stackOut_23_0 = var13;
                    stackOut_23_1 = ta.field_d;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    if (stackIn_24_0 >= stackIn_24_1) {
                      break L6;
                    } else {
                      var14 = hb.field_Vb[var13];
                      var15 = param0.field_M[var14];
                      var16 = param0.field_c[var14];
                      var17 = param0.field_A[var14];
                      if (var40 != 0) {
                        break L5;
                      } else {
                        L24: {
                          if (id.field_M.length > param0.field_F[var14]) {
                            stackOut_28_0 = param0.field_F[var14];
                            stackIn_29_0 = stackOut_28_0;
                            break L24;
                          } else {
                            stackOut_27_0 = -1;
                            stackIn_29_0 = stackOut_27_0;
                            break L24;
                          }
                        }
                        L25: {
                          var18 = stackIn_29_0;
                          if (id.field_M.length > param0.field_t[var14]) {
                            stackOut_31_0 = param0.field_t[var14];
                            stackIn_32_0 = stackOut_31_0;
                            break L25;
                          } else {
                            stackOut_30_0 = -1;
                            stackIn_32_0 = stackOut_30_0;
                            break L25;
                          }
                        }
                        L26: {
                          var19 = stackIn_32_0;
                          if ((id.field_M.length ^ -1) >= (param0.field_r[var14] ^ -1)) {
                            stackOut_34_0 = -1;
                            stackIn_35_0 = stackOut_34_0;
                            break L26;
                          } else {
                            stackOut_33_0 = param0.field_r[var14];
                            stackIn_35_0 = stackOut_33_0;
                            break L26;
                          }
                        }
                        L27: {
                          L28: {
                            var20 = stackIn_35_0;
                            if (null == l.field_i) {
                              break L28;
                            } else {
                              if (null == param0.field_j) {
                                break L28;
                              } else {
                                if ((param0.field_j.length ^ -1) >= (var14 ^ -1)) {
                                  break L28;
                                } else {
                                  if (0 == (param0.field_j[var14] ^ -1)) {
                                    break L28;
                                  } else {
                                    if (l.field_i.length <= param0.field_j[var14]) {
                                      break L28;
                                    } else {
                                      stackOut_40_0 = l.field_i[param0.field_j[var14]];
                                      stackIn_42_0 = stackOut_40_0;
                                      break L27;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_41_0 = null;
                          stackIn_42_0 = (dh) ((Object) stackOut_41_0);
                          break L27;
                        }
                        L29: {
                          L30: {
                            L31: {
                              var21_ref = stackIn_42_0;
                              var22 = kl.field_n[var15];
                              var23 = rn.field_b[var15];
                              var24 = kl.field_n[var16];
                              var25 = rn.field_b[var16];
                              var26 = kl.field_n[var17];
                              var27 = rn.field_b[var17];
                              if (var18 != var19) {
                                break L31;
                              } else {
                                if ((var20 ^ -1) == (var19 ^ -1)) {
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            L32: {
                              var28 = var54[var18];
                              var29 = var54[var19];
                              var30 = var54[var20];
                              var31 = var64[var18];
                              var32 = var64[var19];
                              var33 = var64[var20];
                              if (var21_ref != null) {
                                stackOut_47_0 = var21_ref.field_a;
                                stackIn_48_0 = stackOut_47_0;
                                break L32;
                              } else {
                                stackOut_46_0 = 8355711;
                                stackIn_48_0 = stackOut_46_0;
                                break L32;
                              }
                            }
                            L33: {
                              var34 = stackIn_48_0;
                              var35 = var34 & 16711935;
                              var36 = var34 & 65280;
                              var37 = (16711810 & var36 * var28) >>> -1017884856 | (var35 * var28 & -16711879) >>> 1795278632;
                              var38 = var35 * var29 >>> 770485128 & 285147391 | var36 * var29 >>> 853475976 & 1291910912;
                              var39 = -755040001 & var35 * var30 >>> -1925801080 | var36 * var30 >>> -1947323704 & -2046755072;
                              var37 = var37 + var31 * 65793;
                              var38 = var38 + var32 * 65793;
                              var39 = var39 + var33 * 65793;
                              stackOut_48_0 = var37 & 255;
                              stackOut_48_1 = var25;
                              stackOut_48_2 = var22;
                              stackOut_48_3 = var39 >> 225006032;
                              stackOut_48_4 = var24;
                              stackOut_48_5 = var37 >> 2099190608;
                              stackOut_48_6 = var39 & 255;
                              stackOut_48_7 = 255 & var38;
                              stackOut_48_8 = var27;
                              stackOut_48_9 = var38 >> 281414704;
                              stackOut_48_10 = var39 >> 1640941864 & 255;
                              stackOut_48_11 = var23;
                              stackIn_50_0 = stackOut_48_0;
                              stackIn_50_1 = stackOut_48_1;
                              stackIn_50_2 = stackOut_48_2;
                              stackIn_50_3 = stackOut_48_3;
                              stackIn_50_4 = stackOut_48_4;
                              stackIn_50_5 = stackOut_48_5;
                              stackIn_50_6 = stackOut_48_6;
                              stackIn_50_7 = stackOut_48_7;
                              stackIn_50_8 = stackOut_48_8;
                              stackIn_50_9 = stackOut_48_9;
                              stackIn_50_10 = stackOut_48_10;
                              stackIn_50_11 = stackOut_48_11;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              stackIn_49_2 = stackOut_48_2;
                              stackIn_49_3 = stackOut_48_3;
                              stackIn_49_4 = stackOut_48_4;
                              stackIn_49_5 = stackOut_48_5;
                              stackIn_49_6 = stackOut_48_6;
                              stackIn_49_7 = stackOut_48_7;
                              stackIn_49_8 = stackOut_48_8;
                              stackIn_49_9 = stackOut_48_9;
                              stackIn_49_10 = stackOut_48_10;
                              stackIn_49_11 = stackOut_48_11;
                              if (param4) {
                                stackOut_50_0 = stackIn_50_0;
                                stackOut_50_1 = stackIn_50_1;
                                stackOut_50_2 = stackIn_50_2;
                                stackOut_50_3 = stackIn_50_3;
                                stackOut_50_4 = stackIn_50_4;
                                stackOut_50_5 = stackIn_50_5;
                                stackOut_50_6 = stackIn_50_6;
                                stackOut_50_7 = stackIn_50_7;
                                stackOut_50_8 = stackIn_50_8;
                                stackOut_50_9 = stackIn_50_9;
                                stackOut_50_10 = stackIn_50_10;
                                stackOut_50_11 = stackIn_50_11;
                                stackOut_50_12 = 0;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                stackIn_51_2 = stackOut_50_2;
                                stackIn_51_3 = stackOut_50_3;
                                stackIn_51_4 = stackOut_50_4;
                                stackIn_51_5 = stackOut_50_5;
                                stackIn_51_6 = stackOut_50_6;
                                stackIn_51_7 = stackOut_50_7;
                                stackIn_51_8 = stackOut_50_8;
                                stackIn_51_9 = stackOut_50_9;
                                stackIn_51_10 = stackOut_50_10;
                                stackIn_51_11 = stackOut_50_11;
                                stackIn_51_12 = stackOut_50_12;
                                break L33;
                              } else {
                                stackOut_49_0 = stackIn_49_0;
                                stackOut_49_1 = stackIn_49_1;
                                stackOut_49_2 = stackIn_49_2;
                                stackOut_49_3 = stackIn_49_3;
                                stackOut_49_4 = stackIn_49_4;
                                stackOut_49_5 = stackIn_49_5;
                                stackOut_49_6 = stackIn_49_6;
                                stackOut_49_7 = stackIn_49_7;
                                stackOut_49_8 = stackIn_49_8;
                                stackOut_49_9 = stackIn_49_9;
                                stackOut_49_10 = stackIn_49_10;
                                stackOut_49_11 = stackIn_49_11;
                                stackOut_49_12 = 1;
                                stackIn_51_0 = stackOut_49_0;
                                stackIn_51_1 = stackOut_49_1;
                                stackIn_51_2 = stackOut_49_2;
                                stackIn_51_3 = stackOut_49_3;
                                stackIn_51_4 = stackOut_49_4;
                                stackIn_51_5 = stackOut_49_5;
                                stackIn_51_6 = stackOut_49_6;
                                stackIn_51_7 = stackOut_49_7;
                                stackIn_51_8 = stackOut_49_8;
                                stackIn_51_9 = stackOut_49_9;
                                stackIn_51_10 = stackOut_49_10;
                                stackIn_51_11 = stackOut_49_11;
                                stackIn_51_12 = stackOut_49_12;
                                break L33;
                              }
                            }
                            wf.a(stackIn_51_0, stackIn_51_1, stackIn_51_2, stackIn_51_3, stackIn_51_4, stackIn_51_5, stackIn_51_6, stackIn_51_7, stackIn_51_8, stackIn_51_9, stackIn_51_10, stackIn_51_11, stackIn_51_12 != 0, var37 >> -1725201496 & 255, var26, 255 & var38 >> -522552696);
                            if (var40 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                          L34: {
                            var28 = var54[var18];
                            var29 = var64[var18];
                            if (var21_ref != null) {
                              stackOut_54_0 = var21_ref.field_a;
                              stackIn_55_0 = stackOut_54_0;
                              break L34;
                            } else {
                              stackOut_53_0 = 8355711;
                              stackIn_55_0 = stackOut_53_0;
                              break L34;
                            }
                          }
                          var30 = stackIn_55_0;
                          var31 = var30 & 16711935;
                          var32 = var30 & 65280;
                          var33 = 1476460288 & var32 * var28 >>> -1357940280 | -268500737 & var31 * var28 >>> 1730230664;
                          var33 = var33 + 65793 * var29;
                          tb.a(var23, var27, var22, var33 >> 626219073 & 8355711, var24, var25, 127, var26);
                          break L29;
                        }
                        var13++;
                        if (var40 == 0) {
                          continue L23;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var8 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) (var8);
            stackOut_58_1 = new StringBuilder().append("ug.B(");
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param0 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L35;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L35;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!cb.a(param1, param0, 4564)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var3_int ^ -1) <= (param0.length() ^ -1)) {
                      break L3;
                    } else {
                      stackOut_7_0 = ci.a(param0.charAt(var3_int), (byte) 82);
                      stackIn_14_0 = stackOut_7_0 ? 1 : 0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_8_0) {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3_int++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_13_0 = -86 % ((-31 - param2) / 56);
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                var4 = stackIn_14_0;
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("ug.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_q = null;
        if (param0 != -21771) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = ug.a((CharSequence) null, false, -92);
        }
        field_n = null;
    }

    private ug() throws Throwable {
        throw new Error();
    }

    final static boolean a(char param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 == 32) {
          L0: {
            L1: {
              if (160 == param0) {
                break L1;
              } else {
                if (param0 == 32) {
                  break L1;
                } else {
                  if (param0 == 95) {
                    break L1;
                  } else {
                    if (param0 != 45) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    static {
        field_n = "The Controls";
    }
}
