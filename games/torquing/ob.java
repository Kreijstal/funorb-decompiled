/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static byte[] field_a;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -12) {
            ob.a((byte) -1);
        }
        field_a = null;
    }

    final static pk a(int param0, int[] param1, byte[] param2, boolean param3, sm[] param4) {
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        byte[][] var11 = null;
        int var12_int = 0;
        pk var12 = null;
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
        var30 = Torquing.field_u;
        if (-257 != (param4.length ^ -1)) {
          throw new IllegalArgumentException();
        } else {
          L0: {
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
            var51 = new int[256];
            var45 = var51;
            var39 = var45;
            var33 = var39;
            var7 = var33;
            if (param3) {
              break L0;
            } else {
              field_a = null;
              break L0;
            }
          }
          var52 = new int[256];
          var46 = var52;
          var40 = var46;
          var34 = var40;
          var8 = var34;
          var50 = new int[param1.length + 3];
          var44 = var50;
          var38 = var44;
          var32 = var38;
          var9 = var32;
          var50[2] = param0;
          var50[1] = 16777215;
          var10 = 0;
          L1: while (true) {
            L2: {
              if (var10 >= param1.length) {
                break L2;
              } else {
                var9[3 + var10] = param1[var10];
                var10++;
                if (0 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var10 = 1 + param1.length;
              if (2 <= var10) {
                break L3;
              } else {
                var10 = 2;
                break L3;
              }
            }
            var55 = new byte[256][];
            var49 = var55;
            var43 = var49;
            var37 = var43;
            var11 = var37;
            var12_int = 0;
            L4: while (true) {
              L5: {
                if (var12_int >= 256) {
                  break L5;
                } else {
                  var31[var12_int] = -1 + param4[var12_int].field_a;
                  var6[var12_int] = param4[var12_int].field_g - 1;
                  var7[var12_int] = var10 + param4[var12_int].field_c;
                  var8[var12_int] = param4[var12_int].field_d - -var10;
                  var11[var12_int] = new byte[var51[var12_int] * var52[var12_int]];
                  var13 = new byte[var51[var12_int] * var52[var12_int]];
                  var14 = param4[var12_int].field_l;
                  var15 = param4[var12_int].field_c;
                  var16 = param4[var12_int].field_d;
                  var17 = var51[var12_int];
                  var18 = -var15 + var17;
                  var19 = 0;
                  var20 = var51[var12_int] - -1;
                  var21 = 0;
                  L6: while (true) {
                    L7: {
                      if (var21 >= var16) {
                        break L7;
                      } else {
                        var22 = 0;
                        L8: while (true) {
                          L9: {
                            if (var15 <= var22) {
                              break L9;
                            } else {
                              L10: {
                                var19++;
                                if ((var14[var19] ^ -1) == -1) {
                                  break L10;
                                } else {
                                  var23 = var17 + 1;
                                  var24_int = 0;
                                  L11: while (true) {
                                    L12: {
                                      if (var24_int >= param1.length) {
                                        break L12;
                                      } else {
                                        var13[var23 + var20] = (byte)(3 + var24_int);
                                        var23 = var23 + (1 + var17);
                                        var24_int++;
                                        if (0 == 0) {
                                          continue L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if (param0 != -1) {
                                      var24 = var13;
                                      var25 = -var17 + var20;
                                      var26 = var13;
                                      var27 = -1 + var20;
                                      var28 = var13;
                                      var29 = 1 + var20;
                                      var13[var17 + var20] = (byte) 2;
                                      var28[var29] = (byte) 2;
                                      var26[var27] = (byte) 2;
                                      var24[var25] = (byte) 2;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              var20++;
                              var22++;
                              if (0 == 0) {
                                continue L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var20 = var20 + var18;
                          var21++;
                          if (0 == 0) {
                            continue L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var20 = 1 + var51[var12_int];
                    var19 = 0;
                    var21 = 0;
                    L13: while (true) {
                      L14: {
                        if (var16 <= var21) {
                          break L14;
                        } else {
                          var22 = 0;
                          L15: while (true) {
                            L16: {
                              if (var22 >= var15) {
                                break L16;
                              } else {
                                L17: {
                                  L18: {
                                    var19++;
                                    if ((var14[var19] ^ -1) != -1) {
                                      break L18;
                                    } else {
                                      var20++;
                                      if (0 == 0) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  var20++;
                                  var13[var20] = (byte) 1;
                                  break L17;
                                }
                                var22++;
                                if (0 == 0) {
                                  continue L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var20 = var20 + var18;
                            var21++;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      var12_int++;
                      if (0 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              L19: {
                L20: {
                  var12 = new pk(param2, var53, var54, var51, var52, var50, var55);
                  var12.field_x = var12.field_x - 1;
                  if (param1.length == 0) {
                    break L20;
                  } else {
                    var12.field_t = var12.field_t - param1.length;
                    if (0 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var12.field_t = var12.field_t - 1;
                break L19;
              }
              var12.field_s = var12.field_s - 1;
              return var12;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[65536];
        dk.a(field_a, 0, 65536, (byte) -128);
    }
}
