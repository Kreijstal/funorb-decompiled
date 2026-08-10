/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends bh {
    static int[] field_q;
    int field_o;
    static String field_n;
    int field_p;

    final static void a(vg param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        dh stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_47_0;
        int stackIn_47_1;
        int stackIn_47_2;
        int stackIn_47_3;
        int stackIn_47_4;
        int stackIn_47_5;
        int stackIn_47_6;
        int stackIn_47_7;
        int stackIn_47_8;
        int stackIn_47_9;
        int stackIn_47_10;
        int stackIn_47_11;
        int stackIn_48_0;
        int stackIn_48_1;
        int stackIn_48_2;
        int stackIn_48_3;
        int stackIn_48_4;
        int stackIn_48_5;
        int stackIn_48_6;
        int stackIn_48_7;
        int stackIn_48_8;
        int stackIn_48_9;
        int stackIn_48_10;
        int stackIn_48_11;
        int stackIn_48_12;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dh var21 = null;
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
                    break L2;
                  }
                }
              }
              kh.a(2);
              break L2;
            }
            var54 = new int[param0.field_D];
            var49 = var54;
            var41 = var49;
            var8 = var41;
            var64 = new int[param0.field_D];
            var62 = id.field_M;
            var61 = bc.field_I;
            var63 = sf.field_C;
            var13 = 0;
            L4: while (true) {
              if (param0.field_D <= var13) {
                var13 = 0;
                L5: while (true) {
                  if (var13 >= ta.field_d) {
                    break L0;
                  } else {
                    L6: {
                      var14 = hb.field_Vb[var13];
                      var15 = param0.field_M[var14];
                      var16 = param0.field_c[var14];
                      var17 = param0.field_A[var14];
                      if (id.field_M.length > param0.field_F[var14]) {
                        stackIn_26_0 = param0.field_F[var14];
                        break L6;
                      } else {
                        stackIn_26_0 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_26_0;
                      if (id.field_M.length > param0.field_t[var14]) {
                        stackIn_29_0 = param0.field_t[var14];
                        break L7;
                      } else {
                        stackIn_29_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_29_0;
                      if (id.field_M.length <= param0.field_r[var14]) {
                        stackIn_32_0 = -1;
                        break L8;
                      } else {
                        stackIn_32_0 = param0.field_r[var14];
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_32_0;
                        if (null == l.field_i) {
                          break L10;
                        } else {
                          if (null == param0.field_j) {
                            break L10;
                          } else {
                            if (param0.field_j.length <= var14) {
                              break L10;
                            } else {
                              if (0 == (param0.field_j[var14] ^ -1)) {
                                break L10;
                              } else {
                                if (l.field_i.length <= param0.field_j[var14]) {
                                  break L10;
                                } else {
                                  stackIn_39_0 = l.field_i[param0.field_j[var14]];
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_39_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_39_0;
                        var22 = kl.field_n[var15];
                        var23 = rn.field_b[var15];
                        var24 = kl.field_n[var16];
                        var25 = rn.field_b[var16];
                        var26 = kl.field_n[var17];
                        var27 = rn.field_b[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var20 == var19) {
                            L13: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 != null) {
                                stackIn_52_0 = var21.field_a;
                                break L13;
                              } else {
                                stackIn_52_0 = 8355711;
                                break L13;
                              }
                            }
                            var30 = stackIn_52_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = 1476460288 & var32 * var28 >>> -1357940280 | -268500737 & var31 * var28 >>> 1730230664;
                            var33 = var33 + 65793 * var29;
                            tb.a(var23, var27, var22, var33 >> 626219073 & 8355711, var24, var25, 127, var26);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                          stackIn_45_0 = var21.field_a;
                          break L14;
                        } else {
                          stackIn_45_0 = 8355711;
                          break L14;
                        }
                      }
                      L15: {
                        var34 = stackIn_45_0;
                        var35 = var34 & 16711935;
                        var36 = var34 & 65280;
                        var37 = (16711810 & var36 * var28) >>> -1017884856 | (var35 * var28 & -16711879) >>> 1795278632;
                        var38 = var35 * var29 >>> 770485128 & 285147391 | var36 * var29 >>> 853475976 & 1291910912;
                        var39 = -755040001 & var35 * var30 >>> -1925801080 | var36 * var30 >>> -1947323704 & -2046755072;
                        var37 = var37 + var31 * 65793;
                        var38 = var38 + var32 * 65793;
                        var39 = var39 + var33 * 65793;
                        stackIn_47_0 = var37 & 255;

                        stackIn_47_1 = var25;

                        stackIn_47_2 = var22;

                        stackIn_47_3 = var39 >> 225006032;

                        stackIn_47_4 = var24;

                        stackIn_47_5 = var37 >> 2099190608;

                        stackIn_47_6 = var39 & 255;

                        stackIn_47_7 = 255 & var38;

                        stackIn_47_8 = var27;

                        stackIn_47_9 = var38 >> 281414704;

                        stackIn_47_10 = var39 >> 1640941864 & 255;

                        stackIn_47_11 = var23;

                        if (param4) {
                          stackIn_48_0 = stackIn_47_0;
                          stackIn_48_1 = stackIn_47_1;
                          stackIn_48_2 = stackIn_47_2;
                          stackIn_48_3 = stackIn_47_3;
                          stackIn_48_4 = stackIn_47_4;
                          stackIn_48_5 = stackIn_47_5;
                          stackIn_48_6 = stackIn_47_6;
                          stackIn_48_7 = stackIn_47_7;
                          stackIn_48_8 = stackIn_47_8;
                          stackIn_48_9 = stackIn_47_9;
                          stackIn_48_10 = stackIn_47_10;
                          stackIn_48_11 = stackIn_47_11;
                          stackIn_48_12 = 0;
                          break L15;
                        } else {
                          stackIn_48_0 = stackIn_47_0;
                          stackIn_48_1 = stackIn_47_1;
                          stackIn_48_2 = stackIn_47_2;
                          stackIn_48_3 = stackIn_47_3;
                          stackIn_48_4 = stackIn_47_4;
                          stackIn_48_5 = stackIn_47_5;
                          stackIn_48_6 = stackIn_47_6;
                          stackIn_48_7 = stackIn_47_7;
                          stackIn_48_8 = stackIn_47_8;
                          stackIn_48_9 = stackIn_47_9;
                          stackIn_48_10 = stackIn_47_10;
                          stackIn_48_11 = stackIn_47_11;
                          stackIn_48_12 = 1;
                          break L15;
                        }
                      }
                      wf.a(stackIn_48_0, stackIn_48_1, stackIn_48_2, stackIn_48_3, stackIn_48_4, stackIn_48_5, stackIn_48_6, stackIn_48_7, stackIn_48_8, stackIn_48_9, stackIn_48_10, stackIn_48_11, stackIn_48_12 != 0, var37 >> -1725201496 & 255, var26, 255 & var38 >> -522552696);
                      break L11;
                    }
                    var13++;
                    continue L5;
                  }
                }
              } else {
                L16: {
                  var14 = var61[var13] * param1 + var62[var13] * param3 + var63[var13] * param6 >> 227238920;
                  if ((var14 ^ -1) > -1) {
                    var14 = -var14;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (0 > var14) {
                    stackIn_17_0 = 128;
                    break L17;
                  } else {
                    if (var14 < 128) {
                      stackIn_17_0 = var14 + 128;
                      break L17;
                    } else {
                      stackIn_17_0 = 256;
                      break L17;
                    }
                  }
                }
                L18: {
                  var14 = stackIn_17_0;
                  var15 = param2 * var62[var13] + var61[var13] * param7 - -(var63[var13] * param5) >> -1816498232;
                  stackIn_19_0 = ch.field_b;

                  if (-1 >= (var15 ^ -1)) {
                    stackIn_20_0 = (int[]) ((Object) stackIn_19_0);
                    stackIn_20_1 = var15;
                    break L18;
                  } else {
                    stackIn_20_0 = (int[]) ((Object) stackIn_19_0);
                    stackIn_20_1 = -var15;
                    break L18;
                  }
                }
                var15 = stackIn_20_0[stackIn_20_1];
                var14 = (256 + -var15) * var14 >>> 1268162184;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var8_ref = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var8_ref);

            stackIn_57_1 = new StringBuilder().append("ug.B(");

            if (param0 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L19;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L19;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!cb.a(param1, param0, 4564)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param0.length()) {
                  var4 = -86 % ((-31 - param2) / 56);
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!ci.a(param0.charAt(var3_int), (byte) 82)) {
                    stackIn_10_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ug.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != -21771) {
            CharSequence var2 = (CharSequence) null;
            ug.a((CharSequence) null, false, -92);
        }
        field_n = null;
    }

    private ug() throws Throwable {
        throw new Error();
    }

    final static boolean a(char param0, int param1) {
        int stackIn_9_0 = 0;
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
                      stackIn_9_0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = 1;
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
