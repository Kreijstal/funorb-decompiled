/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends bh {
    static int[] field_q;
    int field_o;
    static String field_n;
    int field_p;

    final static void a(vg param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int[] var8 = null;
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
        int var44 = 0;
        vg var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        dh stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        int stackIn_45_5 = 0;
        int stackIn_45_6 = 0;
        int stackIn_45_7 = 0;
        int stackIn_45_8 = 0;
        int stackIn_45_9 = 0;
        int stackIn_45_10 = 0;
        int stackIn_45_11 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        int stackIn_46_6 = 0;
        int stackIn_46_7 = 0;
        int stackIn_46_8 = 0;
        int stackIn_46_9 = 0;
        int stackIn_46_10 = 0;
        int stackIn_46_11 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int stackIn_47_6 = 0;
        int stackIn_47_7 = 0;
        int stackIn_47_8 = 0;
        int stackIn_47_9 = 0;
        int stackIn_47_10 = 0;
        int stackIn_47_11 = 0;
        int stackIn_47_12 = 0;
        int stackIn_51_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        dh stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        int stackOut_44_5 = 0;
        int stackOut_44_6 = 0;
        int stackOut_44_7 = 0;
        int stackOut_44_8 = 0;
        int stackOut_44_9 = 0;
        int stackOut_44_10 = 0;
        int stackOut_44_11 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        int stackOut_46_7 = 0;
        int stackOut_46_8 = 0;
        int stackOut_46_9 = 0;
        int stackOut_46_10 = 0;
        int stackOut_46_11 = 0;
        int stackOut_46_12 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_45_6 = 0;
        int stackOut_45_7 = 0;
        int stackOut_45_8 = 0;
        int stackOut_45_9 = 0;
        int stackOut_45_10 = 0;
        int stackOut_45_11 = 0;
        int stackOut_45_12 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          var40 = client.field_A ? 1 : 0;
          var45 = param0;
          if (!param4) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var45.field_Q == null) {
              break L2;
            } else {
              if ((var45.field_B ^ -1) >= -2) {
                break L2;
              } else {
                var62 = var45.field_Q;
                sh.a(var62, -25724, 0, nm.field_Nb, 0);
                break L1;
              }
            }
          }
          kh.a(2);
          break L1;
        }
        var66 = new int[param0.field_D];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param0.field_D];
        var64 = id.field_M;
        var63 = bc.field_I;
        var65 = sf.field_C;
        var13 = 0;
        L3: while (true) {
          if (param0.field_D <= var13) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= ta.field_d) {
                return;
              } else {
                L5: {
                  var14 = hb.field_Vb[var44];
                  var15 = param0.field_M[var14];
                  var16 = param0.field_c[var14];
                  var17 = param0.field_A[var14];
                  if (id.field_M.length > param0.field_F[var14]) {
                    stackOut_24_0 = param0.field_F[var14];
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  } else {
                    stackOut_23_0 = -1;
                    stackIn_25_0 = stackOut_23_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_25_0;
                  if (id.field_M.length > param0.field_t[var14]) {
                    stackOut_27_0 = param0.field_t[var14];
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    stackOut_26_0 = -1;
                    stackIn_28_0 = stackOut_26_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_28_0;
                  if (id.field_M.length <= param0.field_r[var14]) {
                    stackOut_30_0 = -1;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    stackOut_29_0 = param0.field_r[var14];
                    stackIn_31_0 = stackOut_29_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_31_0;
                    if (null == l.field_i) {
                      break L9;
                    } else {
                      if (null == param0.field_j) {
                        break L9;
                      } else {
                        if (param0.field_j.length <= var14) {
                          break L9;
                        } else {
                          if (0 == (param0.field_j[var14] ^ -1)) {
                            break L9;
                          } else {
                            if (l.field_i.length <= param0.field_j[var14]) {
                              break L9;
                            } else {
                              stackOut_36_0 = l.field_i[param0.field_j[var14]];
                              stackIn_38_0 = stackOut_36_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_37_0 = null;
                  stackIn_38_0 = (dh) (Object) stackOut_37_0;
                  break L8;
                }
                L10: {
                  var21_ref = stackIn_38_0;
                  var22 = kl.field_n[var15];
                  var23 = rn.field_b[var15];
                  var24 = kl.field_n[var16];
                  var25 = rn.field_b[var16];
                  var26 = kl.field_n[var17];
                  var27 = rn.field_b[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var20 == var19) {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21_ref != null) {
                          stackOut_50_0 = var21_ref.field_a;
                          stackIn_51_0 = stackOut_50_0;
                          break L11;
                        } else {
                          stackOut_49_0 = 8355711;
                          stackIn_51_0 = stackOut_49_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_51_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = 1476460288 & var32 * var28 >>> -1357940280 | -268500737 & var31 * var28 >>> 1730230664;
                      var33 = var33 + 65793 * var29;
                      tb.a(var23, var27, var22, var33 >> 626219073 & 8355711, var24, var25, 127, var26);
                      var44++;
                      continue L4;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21_ref != null) {
                    stackOut_43_0 = var21_ref.field_a;
                    stackIn_44_0 = stackOut_43_0;
                    break L12;
                  } else {
                    stackOut_42_0 = 8355711;
                    stackIn_44_0 = stackOut_42_0;
                    break L12;
                  }
                }
                L13: {
                  var34 = stackIn_44_0;
                  var35 = var34 & 16711935;
                  var36 = var34 & 65280;
                  var37 = (16711810 & var36 * var28) >>> -1017884856 | (var35 * var28 & -16711879) >>> 1795278632;
                  var38 = var35 * var29 >>> 770485128 & 285147391 | var36 * var29 >>> 853475976 & 1291910912;
                  var39 = -755040001 & var35 * var30 >>> -1925801080 | var36 * var30 >>> -1947323704 & -2046755072;
                  var37 = var37 + var31 * 65793;
                  var38 = var38 + var32 * 65793;
                  var39 = var39 + var33 * 65793;
                  stackOut_44_0 = var37 & 255;
                  stackOut_44_1 = var25;
                  stackOut_44_2 = var22;
                  stackOut_44_3 = var39 >> 225006032;
                  stackOut_44_4 = var24;
                  stackOut_44_5 = var37 >> 2099190608;
                  stackOut_44_6 = var39 & 255;
                  stackOut_44_7 = 255 & var38;
                  stackOut_44_8 = var27;
                  stackOut_44_9 = var38 >> 281414704;
                  stackOut_44_10 = var39 >> 1640941864 & 255;
                  stackOut_44_11 = var23;
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  stackIn_46_3 = stackOut_44_3;
                  stackIn_46_4 = stackOut_44_4;
                  stackIn_46_5 = stackOut_44_5;
                  stackIn_46_6 = stackOut_44_6;
                  stackIn_46_7 = stackOut_44_7;
                  stackIn_46_8 = stackOut_44_8;
                  stackIn_46_9 = stackOut_44_9;
                  stackIn_46_10 = stackOut_44_10;
                  stackIn_46_11 = stackOut_44_11;
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  stackIn_45_2 = stackOut_44_2;
                  stackIn_45_3 = stackOut_44_3;
                  stackIn_45_4 = stackOut_44_4;
                  stackIn_45_5 = stackOut_44_5;
                  stackIn_45_6 = stackOut_44_6;
                  stackIn_45_7 = stackOut_44_7;
                  stackIn_45_8 = stackOut_44_8;
                  stackIn_45_9 = stackOut_44_9;
                  stackIn_45_10 = stackOut_44_10;
                  stackIn_45_11 = stackOut_44_11;
                  if (param4) {
                    stackOut_46_0 = stackIn_46_0;
                    stackOut_46_1 = stackIn_46_1;
                    stackOut_46_2 = stackIn_46_2;
                    stackOut_46_3 = stackIn_46_3;
                    stackOut_46_4 = stackIn_46_4;
                    stackOut_46_5 = stackIn_46_5;
                    stackOut_46_6 = stackIn_46_6;
                    stackOut_46_7 = stackIn_46_7;
                    stackOut_46_8 = stackIn_46_8;
                    stackOut_46_9 = stackIn_46_9;
                    stackOut_46_10 = stackIn_46_10;
                    stackOut_46_11 = stackIn_46_11;
                    stackOut_46_12 = 0;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    stackIn_47_2 = stackOut_46_2;
                    stackIn_47_3 = stackOut_46_3;
                    stackIn_47_4 = stackOut_46_4;
                    stackIn_47_5 = stackOut_46_5;
                    stackIn_47_6 = stackOut_46_6;
                    stackIn_47_7 = stackOut_46_7;
                    stackIn_47_8 = stackOut_46_8;
                    stackIn_47_9 = stackOut_46_9;
                    stackIn_47_10 = stackOut_46_10;
                    stackIn_47_11 = stackOut_46_11;
                    stackIn_47_12 = stackOut_46_12;
                    break L13;
                  } else {
                    stackOut_45_0 = stackIn_45_0;
                    stackOut_45_1 = stackIn_45_1;
                    stackOut_45_2 = stackIn_45_2;
                    stackOut_45_3 = stackIn_45_3;
                    stackOut_45_4 = stackIn_45_4;
                    stackOut_45_5 = stackIn_45_5;
                    stackOut_45_6 = stackIn_45_6;
                    stackOut_45_7 = stackIn_45_7;
                    stackOut_45_8 = stackIn_45_8;
                    stackOut_45_9 = stackIn_45_9;
                    stackOut_45_10 = stackIn_45_10;
                    stackOut_45_11 = stackIn_45_11;
                    stackOut_45_12 = 1;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_47_1 = stackOut_45_1;
                    stackIn_47_2 = stackOut_45_2;
                    stackIn_47_3 = stackOut_45_3;
                    stackIn_47_4 = stackOut_45_4;
                    stackIn_47_5 = stackOut_45_5;
                    stackIn_47_6 = stackOut_45_6;
                    stackIn_47_7 = stackOut_45_7;
                    stackIn_47_8 = stackOut_45_8;
                    stackIn_47_9 = stackOut_45_9;
                    stackIn_47_10 = stackOut_45_10;
                    stackIn_47_11 = stackOut_45_11;
                    stackIn_47_12 = stackOut_45_12;
                    break L13;
                  }
                }
                wf.a(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_47_4, stackIn_47_5, stackIn_47_6, stackIn_47_7, stackIn_47_8, stackIn_47_9, stackIn_47_10, stackIn_47_11, stackIn_47_12 != 0, var37 >> -1725201496 & 255, var26, 255 & var38 >> -522552696);
                var44++;
                continue L4;
              }
            }
          } else {
            L14: {
              var14 = var63[var13] * param1 + var64[var13] * param3 + var65[var13] * param6 >> 227238920;
              if ((var14 ^ -1) > -1) {
                var14 = -var14;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (0 > var14) {
                stackOut_15_0 = 128;
                stackIn_16_0 = stackOut_15_0;
                break L15;
              } else {
                if (var14 < 128) {
                  stackOut_14_0 = var14 + 128;
                  stackIn_16_0 = stackOut_14_0;
                  break L15;
                } else {
                  stackOut_13_0 = 256;
                  stackIn_16_0 = stackOut_13_0;
                  break L15;
                }
              }
            }
            L16: {
              var14 = stackIn_16_0;
              var15 = param2 * var64[var13] + var63[var13] * param7 - -(var65[var13] * param5) >> -1816498232;
              stackOut_16_0 = ch.field_b;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (-1 >= (var15 ^ -1)) {
                stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                stackOut_18_1 = var15;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L16;
              } else {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = -var15;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L16;
              }
            }
            var15 = stackIn_19_0[stackIn_19_1];
            var14 = (256 + -var15) * var14 >>> 1268162184;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3 = 0;
        int var5 = client.field_A ? 1 : 0;
        if (!(cb.a(param1, param0, 4564))) {
            return false;
        }
        for (var3 = 0; var3 < param0.length(); var3++) {
            if (!(ci.a(param0.charAt(var3), (byte) 82))) {
                return false;
            }
        }
        int var4 = -86 % ((-31 - param2) / 56);
        return true;
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != -21771) {
            Object var2 = null;
            boolean discarded$0 = ug.a((CharSequence) null, false, -92);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "The Controls";
    }
}
