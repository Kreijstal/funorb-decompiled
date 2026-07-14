/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends jb {
    int field_f;
    static String field_i;
    int[] field_g;
    boolean field_h;

    final static StringBuilder a(char param0, StringBuilder param1, int param2, int param3) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        int var4 = param1.length();
        param1.setLength(param2);
        for (var5 = var4; param2 > var5; var5++) {
            param1.setCharAt(var5, param0);
        }
        if (param3 != 5277) {
            Object var7 = null;
            StringBuilder discarded$0 = pp.a('T', (StringBuilder) null, -114, -83);
        }
        return param1;
    }

    final static uj a(int[] param0, byte param1, int param2, byte[] param3, wj[] param4) {
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        byte[][] var11 = null;
        int var12_int = 0;
        uj var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24_int = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        byte[] var28 = null;
        int var29 = 0;
        int var30 = 0;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        byte[][] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        byte[][] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        byte[][] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        byte[][] var55 = null;
        var30 = CrazyCrystals.field_B;
        if (256 == param4.length) {
          var53 = new int[256];
          var47 = var53;
          var41 = var47;
          var35 = var41;
          var31 = var35;
          var5 = var31;
          var54 = new int[256];
          var48 = var54;
          var42 = var48;
          var36 = var42;
          var6 = var36;
          var52 = new int[256];
          var46 = var52;
          var40 = var46;
          var34 = var40;
          var7 = var34;
          var51 = new int[256];
          var45 = var51;
          var39 = var45;
          var33 = var39;
          var8 = var33;
          var50 = new int[3 - -param0.length];
          var44 = var50;
          var38 = var44;
          var32 = var38;
          var9 = var32;
          var50[2] = param2;
          var50[1] = 16777215;
          var10 = 0;
          L0: while (true) {
            L1: {
              if (param0.length <= var10) {
                break L1;
              } else {
                var9[3 + var10] = param0[var10];
                var10++;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var10 = param0.length - -1;
              if (var10 >= 2) {
                break L2;
              } else {
                var10 = 2;
                break L2;
              }
            }
            var55 = new byte[256][];
            var49 = var55;
            var43 = var49;
            var37 = var43;
            var11 = var37;
            var12_int = 0;
            L3: while (true) {
              L4: {
                if (var12_int >= 256) {
                  break L4;
                } else {
                  var31[var12_int] = -1 + param4[var12_int].field_g;
                  var6[var12_int] = param4[var12_int].field_d + -1;
                  var7[var12_int] = param4[var12_int].field_f + var10;
                  var8[var12_int] = param4[var12_int].field_e + var10;
                  var11[var12_int] = new byte[var51[var12_int] * var52[var12_int]];
                  var13 = new byte[var51[var12_int] * var52[var12_int]];
                  var14 = param4[var12_int].field_j;
                  var15 = param4[var12_int].field_f;
                  var16 = param4[var12_int].field_e;
                  var17 = var52[var12_int];
                  var18 = -var15 + var17;
                  var19 = 0;
                  var20 = var52[var12_int] - -1;
                  var21 = 0;
                  L5: while (true) {
                    L6: {
                      if (var16 <= var21) {
                        break L6;
                      } else {
                        var22 = 0;
                        L7: while (true) {
                          L8: {
                            if (var15 <= var22) {
                              break L8;
                            } else {
                              L9: {
                                var19++;
                                if (var14[var19] != 0) {
                                  var23 = var17 - -1;
                                  var24_int = 0;
                                  L10: while (true) {
                                    L11: {
                                      if (var24_int >= param0.length) {
                                        break L11;
                                      } else {
                                        var13[var23 + var20] = (byte)(3 + var24_int);
                                        var23 = var23 + (1 + var17);
                                        var24_int++;
                                        if (0 == 0) {
                                          continue L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (-1 == param2) {
                                      break L9;
                                    } else {
                                      var24 = var13;
                                      var25 = -var17 + var20;
                                      var26 = var13;
                                      var27 = var20 + -1;
                                      var28 = var13;
                                      var29 = 1 + var20;
                                      var13[var20 - -var17] = (byte) 2;
                                      var28[var29] = (byte) 2;
                                      var26[var27] = (byte) 2;
                                      var24[var25] = (byte) 2;
                                      break L9;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var20++;
                              var22++;
                              if (0 == 0) {
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var20 = var20 + var18;
                          var21++;
                          if (0 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var20 = 1 + var52[var12_int];
                    var19 = 0;
                    var21 = 0;
                    L12: while (true) {
                      L13: {
                        if (var16 <= var21) {
                          break L13;
                        } else {
                          var22 = 0;
                          L14: while (true) {
                            L15: {
                              if (var15 <= var22) {
                                break L15;
                              } else {
                                L16: {
                                  L17: {
                                    var19++;
                                    if (-1 == (var14[var19] ^ -1)) {
                                      break L17;
                                    } else {
                                      var20++;
                                      var13[var20] = (byte) 1;
                                      if (0 == 0) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  var20++;
                                  break L16;
                                }
                                var22++;
                                if (0 == 0) {
                                  continue L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            var20 = var20 + var18;
                            var21++;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var12_int++;
                      if (0 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L18: {
                if (param1 > 66) {
                  break L18;
                } else {
                  pp.a((byte) -35);
                  break L18;
                }
              }
              L19: {
                L20: {
                  var12 = new uj(param3, var53, var54, var52, var51, var50, var55);
                  var12.field_o = var12.field_o - 1;
                  if (param0.length != 0) {
                    break L20;
                  } else {
                    var12.field_u = var12.field_u - 1;
                    if (0 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var12.field_u = var12.field_u - param0.length;
                break L19;
              }
              var12.field_A = var12.field_A - 1;
              return var12;
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    public static void a(byte param0) {
        if (param0 != 2) {
            field_i = null;
        }
        field_i = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = CrazyCrystals.field_B;
          if (param3 == 0) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        L1: {
          if (param2 < param1) {
            if (param0 <= param1) {
              if (param2 < param0) {
                qp.a((byte) 99, param4, param5, param1, kh.field_i, param2, param6, param7, param0);
                break L1;
              } else {
                qp.a((byte) 99, param7, param5, param1, kh.field_i, param0, param6, param4, param2);
                break L1;
              }
            } else {
              qp.a((byte) 99, param5, param4, param0, kh.field_i, param2, param6, param7, param1);
              break L1;
            }
          } else {
            if (param0 > param2) {
              qp.a((byte) 99, param7, param4, param0, kh.field_i, param1, param6, param5, param2);
              break L1;
            } else {
              if (param0 <= param1) {
                qp.a((byte) 99, param5, param7, param2, kh.field_i, param0, param6, param4, param1);
                break L1;
              } else {
                qp.a((byte) 99, param4, param7, param2, kh.field_i, param1, param6, param5, param0);
                break L1;
              }
            }
          }
        }
    }

    pp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "\"There's a bug in the spider web!\" - Ben D";
    }
}
