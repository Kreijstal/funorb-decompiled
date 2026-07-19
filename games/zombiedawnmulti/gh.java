/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String[] field_f;
    boolean field_e;
    boolean field_d;
    static int field_a;
    int field_c;
    static boolean field_g;
    String[] field_b;
    String field_h;

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 48) {
          L0: {
            L1: {
              if (10 > a.field_b) {
                break L1;
              } else {
                if (og.field_N) {
                  break L1;
                } else {
                  if (vo.e(1)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(md param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        boolean discarded$1 = false;
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
        af var21_ref = null;
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
        md var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_20_0 = 0;
        int[] stackIn_21_0 = null;
        int[] stackIn_22_0 = null;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        af stackIn_44_0 = null;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        short stackOut_32_0 = 0;
        short stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        af stackOut_42_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int[] stackOut_20_0 = null;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var40 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var44 = param0;
                  if (var44.field_z == null) {
                    break L3;
                  } else {
                    if ((var44.field_m ^ -1) < -2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                pn.b(8);
                if (var40 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var60 = var44.field_z;
              si.a(0, 255, var60, nn.field_c, 0);
              break L1;
            }
            L4: {
              if (param2 >= 44) {
                break L4;
              } else {
                discarded$1 = gh.a(-93);
                break L4;
              }
            }
            var54 = new int[param0.field_o];
            var49 = var54;
            var41 = var49;
            var8_array = var41;
            var64 = new int[param0.field_o];
            var62 = eb.field_J;
            var61 = bq.field_g;
            var63 = wp.field_i;
            var13 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  L8: {
                    if (param0.field_o <= var13) {
                      break L8;
                    } else {
                      var14 = var61[var13] * param7 + (var62[var13] * param1 + var63[var13] * param5) >> -1096849464;
                      stackOut_11_0 = 0;
                      stackOut_11_1 = var14;
                      stackIn_26_0 = stackOut_11_0;
                      stackIn_26_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (var40 != 0) {
                        L9: while (true) {
                          if (stackIn_26_0 >= stackIn_26_1) {
                            break L7;
                          } else {
                            var14 = ah.field_f[var13];
                            var15 = param0.field_y[var14];
                            var16 = param0.field_L[var14];
                            var17 = param0.field_H[var14];
                            if (var40 != 0) {
                              break L6;
                            } else {
                              L10: {
                                if (param0.field_F[var14] < eb.field_J.length) {
                                  stackOut_30_0 = param0.field_F[var14];
                                  stackIn_31_0 = stackOut_30_0;
                                  break L10;
                                } else {
                                  stackOut_29_0 = -1;
                                  stackIn_31_0 = stackOut_29_0;
                                  break L10;
                                }
                              }
                              L11: {
                                var18 = stackIn_31_0;
                                if (param0.field_K[var14] >= eb.field_J.length) {
                                  stackOut_33_0 = -1;
                                  stackIn_34_0 = stackOut_33_0;
                                  break L11;
                                } else {
                                  stackOut_32_0 = param0.field_K[var14];
                                  stackIn_34_0 = stackOut_32_0;
                                  break L11;
                                }
                              }
                              L12: {
                                var19 = stackIn_34_0;
                                if ((eb.field_J.length ^ -1) < (param0.field_x[var14] ^ -1)) {
                                  stackOut_36_0 = param0.field_x[var14];
                                  stackIn_37_0 = stackOut_36_0;
                                  break L12;
                                } else {
                                  stackOut_35_0 = -1;
                                  stackIn_37_0 = stackOut_35_0;
                                  break L12;
                                }
                              }
                              L13: {
                                L14: {
                                  var20 = stackIn_37_0;
                                  if (qh.field_f == null) {
                                    break L14;
                                  } else {
                                    if (null == param0.field_c) {
                                      break L14;
                                    } else {
                                      if (param0.field_c.length <= var14) {
                                        break L14;
                                      } else {
                                        if ((param0.field_c[var14] ^ -1) == 0) {
                                          break L14;
                                        } else {
                                          if (param0.field_c[var14] >= qh.field_f.length) {
                                            break L14;
                                          } else {
                                            stackOut_42_0 = qh.field_f[param0.field_c[var14]];
                                            stackIn_44_0 = stackOut_42_0;
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_43_0 = null;
                                stackIn_44_0 = (af) ((Object) stackOut_43_0);
                                break L13;
                              }
                              L15: {
                                L16: {
                                  L17: {
                                    var21_ref = stackIn_44_0;
                                    var22 = lo.field_j[var15];
                                    var23 = jk.field_k[var15];
                                    var24 = lo.field_j[var16];
                                    var25 = jk.field_k[var16];
                                    var26 = lo.field_j[var17];
                                    var27 = jk.field_k[var17];
                                    if (var18 != var19) {
                                      break L17;
                                    } else {
                                      if (var19 == var20) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    var28 = var54[var18];
                                    var29 = var54[var19];
                                    var30 = var54[var20];
                                    var31 = var64[var18];
                                    var32 = var64[var19];
                                    var33 = var64[var20];
                                    if (var21_ref == null) {
                                      stackOut_49_0 = 8355711;
                                      stackIn_50_0 = stackOut_49_0;
                                      break L18;
                                    } else {
                                      stackOut_48_0 = var21_ref.field_f;
                                      stackIn_50_0 = stackOut_48_0;
                                      break L18;
                                    }
                                  }
                                  var34 = stackIn_50_0;
                                  var35 = 16711935 & var34;
                                  var36 = var34 & 65280;
                                  var37 = (16711726 & var36 * var28) >>> 176816968 | -1962999553 & var35 * var28 >>> -1471903512;
                                  var38 = 1258225919 & var35 * var29 >>> -718166392 | (16711826 & var36 * var29) >>> -578303544;
                                  var37 = var37 + var31 * 65793;
                                  var39 = (16711695 & var36 * var30) >>> -1948119384 | -1140915969 & var30 * var35 >>> -1606232920;
                                  var38 = var38 + var32 * 65793;
                                  var39 = var39 + var33 * 65793;
                                  qe.a(var39 >> -1405369648, 255 & var37, var37 >> -1084372752, var37 >> 1010900008 & 255, 255 & var39, var27, 255 & var38, var26, var23, (var39 & 65366) >> -288412440, (65470 & var38) >> -85342808, var38 >> -292496848, var25, var24, var22, 121);
                                  if (var40 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                                L19: {
                                  var28 = var54[var18];
                                  var29 = var64[var18];
                                  if (var21_ref == null) {
                                    stackOut_53_0 = 8355711;
                                    stackIn_54_0 = stackOut_53_0;
                                    break L19;
                                  } else {
                                    stackOut_52_0 = var21_ref.field_f;
                                    stackIn_54_0 = stackOut_52_0;
                                    break L19;
                                  }
                                }
                                var30 = stackIn_54_0;
                                var31 = var30 & 16711935;
                                var32 = var30 & 65280;
                                var33 = (var28 * var31 & -16711894) >>> 1840684584 | (16711900 & var32 * var28) >>> 256767688;
                                var33 = var33 + var29 * 65793;
                                mo.a(var22, 8355711 & var33 >> 1033251745, var23, var24, var25, var26, var27, (byte) 58);
                                break L15;
                              }
                              var13++;
                              if (var40 == 0) {
                                stackOut_25_0 = tf.field_Eb ^ -1;
                                stackOut_25_1 = var13 ^ -1;
                                stackIn_26_0 = stackOut_25_0;
                                stackIn_26_1 = stackOut_25_1;
                                continue L9;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      } else {
                        L20: {
                          if (stackIn_12_0 > stackIn_12_1) {
                            var14 = -var14;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if ((var14 ^ -1) <= -1) {
                            if (var14 >= 128) {
                              stackOut_19_0 = 256;
                              stackIn_20_0 = stackOut_19_0;
                              break L21;
                            } else {
                              stackOut_18_0 = 128 - -var14;
                              stackIn_20_0 = stackOut_18_0;
                              break L21;
                            }
                          } else {
                            stackOut_16_0 = 128;
                            stackIn_20_0 = stackOut_16_0;
                            break L21;
                          }
                        }
                        L22: {
                          var14 = stackIn_20_0;
                          var15 = var61[var13] * param6 + (var62[var13] * param3 + param4 * var63[var13]) >> -1215445816;
                          stackOut_20_0 = na.field_K;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (-1 >= (var15 ^ -1)) {
                            stackOut_22_0 = (int[]) ((Object) stackIn_22_0);
                            stackOut_22_1 = var15;
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            break L22;
                          } else {
                            stackOut_21_0 = (int[]) ((Object) stackIn_21_0);
                            stackOut_21_1 = -var15;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            break L22;
                          }
                        }
                        var15 = stackIn_23_0[stackIn_23_1];
                        var14 = var14 * (256 - var15) >>> 373347976;
                        var54[var13] = var14;
                        var64[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                          continue L5;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var13 = 0;
                  L23: while (true) {
                    stackOut_25_0 = tf.field_Eb ^ -1;
                    stackOut_25_1 = var13 ^ -1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    if (stackIn_26_0 >= stackIn_26_1) {
                      break L7;
                    } else {
                      var14 = ah.field_f[var13];
                      var15 = param0.field_y[var14];
                      var16 = param0.field_L[var14];
                      var17 = param0.field_H[var14];
                      if (var40 != 0) {
                        break L6;
                      } else {
                        L24: {
                          if (param0.field_F[var14] < eb.field_J.length) {
                            stackOut_30_0 = param0.field_F[var14];
                            stackIn_31_0 = stackOut_30_0;
                            break L24;
                          } else {
                            stackOut_29_0 = -1;
                            stackIn_31_0 = stackOut_29_0;
                            break L24;
                          }
                        }
                        L25: {
                          var18 = stackIn_31_0;
                          if (param0.field_K[var14] >= eb.field_J.length) {
                            stackOut_33_0 = -1;
                            stackIn_34_0 = stackOut_33_0;
                            break L25;
                          } else {
                            stackOut_32_0 = param0.field_K[var14];
                            stackIn_34_0 = stackOut_32_0;
                            break L25;
                          }
                        }
                        L26: {
                          var19 = stackIn_34_0;
                          if ((eb.field_J.length ^ -1) < (param0.field_x[var14] ^ -1)) {
                            stackOut_36_0 = param0.field_x[var14];
                            stackIn_37_0 = stackOut_36_0;
                            break L26;
                          } else {
                            stackOut_35_0 = -1;
                            stackIn_37_0 = stackOut_35_0;
                            break L26;
                          }
                        }
                        L27: {
                          L28: {
                            var20 = stackIn_37_0;
                            if (qh.field_f == null) {
                              break L28;
                            } else {
                              if (null == param0.field_c) {
                                break L28;
                              } else {
                                if (param0.field_c.length <= var14) {
                                  break L28;
                                } else {
                                  if ((param0.field_c[var14] ^ -1) == 0) {
                                    break L28;
                                  } else {
                                    if (param0.field_c[var14] >= qh.field_f.length) {
                                      break L28;
                                    } else {
                                      stackOut_42_0 = qh.field_f[param0.field_c[var14]];
                                      stackIn_44_0 = stackOut_42_0;
                                      break L27;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_43_0 = null;
                          stackIn_44_0 = (af) ((Object) stackOut_43_0);
                          break L27;
                        }
                        L29: {
                          L30: {
                            L31: {
                              var21_ref = stackIn_44_0;
                              var22 = lo.field_j[var15];
                              var23 = jk.field_k[var15];
                              var24 = lo.field_j[var16];
                              var25 = jk.field_k[var16];
                              var26 = lo.field_j[var17];
                              var27 = jk.field_k[var17];
                              if (var18 != var19) {
                                break L31;
                              } else {
                                if (var19 == var20) {
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
                              if (var21_ref == null) {
                                stackOut_49_0 = 8355711;
                                stackIn_50_0 = stackOut_49_0;
                                break L32;
                              } else {
                                stackOut_48_0 = var21_ref.field_f;
                                stackIn_50_0 = stackOut_48_0;
                                break L32;
                              }
                            }
                            var34 = stackIn_50_0;
                            var35 = 16711935 & var34;
                            var36 = var34 & 65280;
                            var37 = (16711726 & var36 * var28) >>> 176816968 | -1962999553 & var35 * var28 >>> -1471903512;
                            var38 = 1258225919 & var35 * var29 >>> -718166392 | (16711826 & var36 * var29) >>> -578303544;
                            var37 = var37 + var31 * 65793;
                            var39 = (16711695 & var36 * var30) >>> -1948119384 | -1140915969 & var30 * var35 >>> -1606232920;
                            var38 = var38 + var32 * 65793;
                            var39 = var39 + var33 * 65793;
                            qe.a(var39 >> -1405369648, 255 & var37, var37 >> -1084372752, var37 >> 1010900008 & 255, 255 & var39, var27, 255 & var38, var26, var23, (var39 & 65366) >> -288412440, (65470 & var38) >> -85342808, var38 >> -292496848, var25, var24, var22, 121);
                            if (var40 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                          L33: {
                            var28 = var54[var18];
                            var29 = var64[var18];
                            if (var21_ref == null) {
                              stackOut_53_0 = 8355711;
                              stackIn_54_0 = stackOut_53_0;
                              break L33;
                            } else {
                              stackOut_52_0 = var21_ref.field_f;
                              stackIn_54_0 = stackOut_52_0;
                              break L33;
                            }
                          }
                          var30 = stackIn_54_0;
                          var31 = var30 & 16711935;
                          var32 = var30 & 65280;
                          var33 = (var28 * var31 & -16711894) >>> 1840684584 | (16711900 & var32 * var28) >>> 256767688;
                          var33 = var33 + var29 * 65793;
                          mo.a(var22, 8355711 & var33 >> 1033251745, var23, var24, var25, var26, var27, (byte) 58);
                          break L29;
                        }
                        var13++;
                        if (var40 == 0) {
                          continue L23;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                break L6;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var8 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var8);
            stackOut_57_1 = new StringBuilder().append("gh.C(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L34;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L34;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static double a(double param0, byte param1) {
        if (param1 <= 4) {
            field_a = -9;
        }
        return ah.field_a[(int)(32768.0 * param0 / 3.141592653589793) & 65535];
    }

    final static boolean a(int param0, int param1) {
        boolean discarded$0 = false;
        if (param1 != 11653) {
            discarded$0 = gh.a(-108, 3);
        }
        return 0 != (w.field_m & 1 << -param0) ? true : false;
    }

    public static void a(byte param0) {
        field_f = null;
        int var1 = 2 / ((param0 - -7) / 59);
    }

    gh(boolean param0) {
        this.field_d = param0 ? true : false;
    }

    static {
    }
}
