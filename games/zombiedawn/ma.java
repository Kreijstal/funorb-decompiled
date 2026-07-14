/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends le {
    gi[] field_o;
    static String field_q;
    byte[] field_h;
    nf[] field_s;
    byte[] field_m;
    static String field_n;
    byte[] field_t;
    static int field_r;
    static int field_k;
    static boolean field_p;
    int field_u;
    short[] field_j;
    private int[] field_l;
    static String field_i;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1 < 81) {
            String discarded$0 = ma.a(false, 21, true, true);
        }
        if (param0) {
            var4 += 4;
        }
        if (param2) {
            var4 += 2;
        }
        if (!(!param3)) {
            var4++;
        }
        return vl.field_p[var4];
    }

    final boolean a(boolean param0, int[] param1, ka param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        gi var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ka stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ka stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ka stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        ka stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ka stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        ka stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        var10 = ZombieDawn.field_J;
        var5 = param0 ? 1 : 0;
        var6 = 0;
        var7 = null;
        var8 = 0;
        L0: while (true) {
          if (-129 >= (var8 ^ -1)) {
            return var5 != 0;
          } else {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3[var8] != 0) {
                  break L1;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
            var9 = ((ma) this).field_l[var8];
            if (0 != var9) {
              L2: {
                if (var9 != var6) {
                  L3: {
                    var6 = var9;
                    var9--;
                    if ((1 & var9) != 0) {
                      var7 = param2.a(1856253636, param1, var9 >> 1375166882);
                      break L3;
                    } else {
                      L4: {
                        stackOut_11_0 = (ka) param2;
                        stackOut_11_1 = var9 >> 1106370594;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param0) {
                          stackOut_13_0 = (ka) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          break L4;
                        } else {
                          stackOut_12_0 = (ka) (Object) stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          break L4;
                        }
                      }
                      var7 = ((ka) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2 != 0, param1);
                      break L3;
                    }
                  }
                  if (var7 == null) {
                    var5 = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (var7 != null) {
                ((ma) this).field_o[var8] = var7;
                ((ma) this).field_l[var8] = 0;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    final static void a(oe param0, int param1, String param2, rb param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ZombieDawn.field_J;
          var5 = 0;
          var6 = -1;
          if (!param4) {
            break L0;
          } else {
            int discarded$2 = ma.d((byte) 75);
            break L0;
          }
        }
        var7 = 1;
        L1: while (true) {
          if (param2.length() <= var7) {
            return;
          } else {
            L2: {
              var8 = param2.charAt(var7);
              if (var8 == 60) {
                var6 = param0.field_e[0] + ((var5 >> 1997582664) - -param3.b(param2.substring(0, var7)));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 != var6) {
                param0.field_e[var7] = var6;
                break L3;
              } else {
                L4: {
                  if (var8 == 32) {
                    var5 = var5 + param1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                param0.field_e[var7] = (var5 >> -597594264) - -param0.field_e[0] + param3.b(param2.substring(0, 1 + var7)) - param3.a((char) var8);
                break L3;
              }
            }
            if (62 == var8) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    public static void c(byte param0) {
        int var1 = 47 % ((param0 - -23) / 32);
        field_n = null;
        field_i = null;
        field_q = null;
    }

    ma(byte[] param0) {
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        nf[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        nf var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        nf var25_ref = null;
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
        int var37 = 0;
        de var38 = null;
        byte[] var39 = null;
        nf var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        nf var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        nf var48 = null;
        nf var49 = null;
        nf var50 = null;
        nf var51 = null;
        nf var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] var59 = null;
        byte[] var60 = null;
        byte[] var61 = null;
        byte[] var62 = null;
        byte[] var63 = null;
        byte[] var64 = null;
        byte[] var65 = null;
        byte[] var66 = null;
        byte[] var67 = null;
        byte[] var68 = null;
        byte[] var69 = null;
        byte[] var70 = null;
        byte[] var71 = null;
        byte[] var72 = null;
        byte[] var73 = null;
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        byte[] stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        ((ma) this).field_o = new gi[128];
        ((ma) this).field_l = new int[128];
        ((ma) this).field_t = new byte[128];
        ((ma) this).field_j = new short[128];
        ((ma) this).field_h = new byte[128];
        ((ma) this).field_s = new nf[128];
        ((ma) this).field_m = new byte[128];
        var38 = new de(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_h[var38.field_j - -var3] == 0) {
            var69 = new byte[var3];
            var62 = var69;
            var55 = var62;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var3++;
                var38.field_j = var38.field_j + 1;
                var5 = var38.field_j;
                var38.field_j = var38.field_j + var3;
                var6 = 0;
                L2: while (true) {
                  if (0 == var38.field_h[var38.field_j - -var6]) {
                    var70 = new byte[var6];
                    var63 = var70;
                    var56 = var63;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var38.field_j = var38.field_j + 1;
                        var6++;
                        var8 = var38.field_j;
                        var38.field_j = var38.field_j + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_h[var38.field_j + var9] == 0) {
                            var71 = new byte[var9];
                            var64 = var71;
                            var57 = var64;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var38.field_j = var38.field_j + 1;
                                  var9++;
                                  var67 = new byte[var9];
                                  var60 = var67;
                                  var53 = var60;
                                  var39 = var53;
                                  var11 = var39;
                                  if ((var9 ^ -1) < -2) {
                                    var67[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.d((byte) -118);
                                          if (var15_int != 0) {
                                            L9: {
                                              if (var13_int < var15_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          } else {
                                            var12++;
                                            var13_int = var12;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var12 = var9;
                                    break L6;
                                  }
                                }
                                var13 = new nf[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.d((byte) -117);
                                      if (0 < var14) {
                                        stackOut_37_0 = new byte[2 * var14];
                                        stackIn_38_0 = stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var72 = stackIn_38_0;
                                      var65 = var72;
                                      var58 = var65;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.d((byte) -124);
                                      if (-1 > (var14 ^ -1)) {
                                        stackOut_40_0 = new byte[2 * var14];
                                        stackIn_41_0 = stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var73 = stackIn_41_0;
                                    var66 = var73;
                                    var59 = var66;
                                    var47 = var59;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_h[var38.field_j - -var17] == 0) {
                                        var68 = new byte[var17];
                                        var61 = var68;
                                        var54 = var61;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var17++;
                                            var38.field_j = var38.field_j + 1;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if ((var20 ^ -1) <= -129) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (-129 >= (var20 ^ -1)) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (128 <= var23) {
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if ((var25_int ^ -1) <= -129) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (128 <= var26) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if ((var27 ^ -1) <= -129) {
                                                                        ((ma) this).field_u = 1 + var38.d((byte) -123);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var72.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.e((byte) 116);
                                                                                    var27 += 2;
                                                                                    continue L24;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L25: {
                                                                              if (var16 == null) {
                                                                                break L25;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L26: while (true) {
                                                                                  if (var73.length <= var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.e((byte) 116);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (var27 >= var12) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var12 <= var27) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.d((byte) -115);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var72.length <= var27) {
                                                                                            var27 = var72[0];
                                                                                            var28 = var72[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var72.length) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if ((var30 ^ -1) <= -129) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((ma) this).field_m[var30] = (byte)(var28 * ((ma) this).field_m[var30] + 32 >> -1338554714);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var72[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = (var30 + -var27) / 2 + var28 * (-var27 + var30);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = rm.a(-var27 + var30, var32, false);
                                                                                                        ((ma) this).field_m[var33] = (byte)(var34 * ((ma) this).field_m[var33] - -32 >> -1590497562);
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((ma) this).field_m[var29] = (byte)(32 + var28 * ((ma) this).field_m[var29] >> -1868340218);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.d((byte) -122) + (1 + var19);
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 == null) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        var19 = var38.d((byte) -118);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var73.length <= var27) {
                                                                                            var27 = var73[0];
                                                                                            var28 = var73[1] << -1563631135;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var73.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (-129 >= var30) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (255 & ((ma) this).field_h[var30]);
                                                                                                          if (var31 >= 0) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (-129 >= var31) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((ma) this).field_h[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var73[var29];
                                                                                                    var31 = var16[var29 + 1] << 480242657;
                                                                                                    var32 = (-var27 + var30) / 2 + (var30 + -var27) * var28;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = rm.a(-var27 + var30, var32, false);
                                                                                                          var35 = var34 + (((ma) this).field_h[var37] & 255);
                                                                                                          if (0 <= var35) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (-129 <= (var35 ^ -1)) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        ((ma) this).field_h[var37] = (byte)var35;
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (255 & ((ma) this).field_h[var29]) + var28;
                                                                                                  if ((var30 ^ -1) <= -1) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (var30 <= 128) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((ma) this).field_h[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 - -1 + var38.d((byte) -118);
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L47: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (0 < var52.field_f) {
                                                                                                          var52.field_g = var38.d((byte) -119);
                                                                                                          var27++;
                                                                                                          continue L51;
                                                                                                        } else {
                                                                                                          var27++;
                                                                                                          continue L51;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var51 = var13[var27];
                                                                                                    if (0 < var51.field_a) {
                                                                                                      var51.field_f = var38.d((byte) -126);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_a = var38.d((byte) -128);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_h) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_i = var38.d((byte) -118);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_b) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_e = var38.d((byte) -120);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (var50.field_j > 0) {
                                                                                              var50.field_c = var38.d((byte) -127);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_j = var38.d((byte) -122);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (null != var49.field_h) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_h.length) {
                                                                                          var19 = var19 + 1 - -var38.d((byte) -128);
                                                                                          var49.field_h[var29] = (byte)var19;
                                                                                          var29 += 2;
                                                                                          continue L54;
                                                                                        } else {
                                                                                          var27++;
                                                                                          continue L28;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      var27++;
                                                                                      continue L28;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var48 = var13[var27];
                                                                                if (var48.field_b != null) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var29 < var48.field_b.length) {
                                                                                      var19 = 1 + (var19 + var38.d((byte) -125));
                                                                                      var48.field_b[var29] = (byte)var19;
                                                                                      var29 += 2;
                                                                                      continue L55;
                                                                                    } else {
                                                                                      var27++;
                                                                                      continue L27;
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  var27++;
                                                                                  continue L27;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L56: {
                                                                              var45 = var13[var27];
                                                                              if (null == var45.field_h) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var45.field_h.length <= var29) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_h[var29] = var38.e((byte) 116);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_b) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var45.field_b.length - 2 > var29) {
                                                                                  var45.field_b[var29] = var38.e((byte) 116);
                                                                                  var29 += 2;
                                                                                  continue L58;
                                                                                } else {
                                                                                  var27++;
                                                                                  continue L22;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              var27++;
                                                                              continue L22;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L59: {
                                                                          if (var20 != 0) {
                                                                            break L59;
                                                                          } else {
                                                                            L60: {
                                                                              if (var68.length > var21) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (0 >= ((ma) this).field_l[var27]) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.d((byte) -119) + 1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((ma) this).field_m[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (0 != ((ma) this).field_l[var26]) {
                                                                      L61: {
                                                                        if (0 != var20) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var67[var21]];
                                                                          if (var21 < var71.length) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      ((ma) this).field_s[var26] = var25_ref;
                                                                      var20--;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (0 != ((ma) this).field_l[var25_int]) {
                                                                  L62: {
                                                                    if (var20 != 0) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = 16 + var38.field_h[var8] << 596389762;
                                                                      if (var21 < var70.length) {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L62;
                                                                      } else {
                                                                        var20 = -1;
                                                                        break L62;
                                                                      }
                                                                    }
                                                                  }
                                                                  var20--;
                                                                  ((ma) this).field_h[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (0 != ((ma) this).field_l[var24]) {
                                                              L63: {
                                                                if (var20 != 0) {
                                                                  break L63;
                                                                } else {
                                                                  L64: {
                                                                    if (var69.length <= var21) {
                                                                      var20 = -1;
                                                                      break L64;
                                                                    } else {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L64;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = var38.field_h[var5] + -1;
                                                                  break L63;
                                                                }
                                                              }
                                                              ((ma) this).field_t[var24] = (byte)var23;
                                                              var20--;
                                                              var24++;
                                                              continue L18;
                                                            } else {
                                                              var24++;
                                                              continue L18;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L65: {
                                                          if (var20 != 0) {
                                                            break L65;
                                                          } else {
                                                            L66: {
                                                              if (var21 >= var68.length) {
                                                                var20 = -1;
                                                                break L66;
                                                              } else {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L66;
                                                              }
                                                            }
                                                            var22 = var38.b(true);
                                                            break L65;
                                                          }
                                                        }
                                                        ((ma) this).field_j[var23] = (short)(((ma) this).field_j[var23] + (eg.a(2, var22 + -1) << -996372562));
                                                        ((ma) this).field_l[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.d((byte) -123);
                                                    ((ma) this).field_j[var20] = (short)(((ma) this).field_j[var20] + (var19 << -366464344));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.d((byte) -121);
                                                ((ma) this).field_j[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.e((byte) 116);
                                            var19++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    L67: {
                                      var13[var14] = new nf();
                                      var40 = new nf();
                                      var15 = var40;
                                      var16_int = var38.d((byte) -125);
                                      if (-1 <= (var16_int ^ -1)) {
                                        break L67;
                                      } else {
                                        var15.field_h = new byte[2 * var16_int];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.d((byte) -123);
                                    if ((var16_int ^ -1) < -1) {
                                      var15.field_b = new byte[2 + var16_int * 2];
                                      var40.field_b[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.e((byte) 116);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var7[var8] = var38.e((byte) 116);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4[var5] = var38.e((byte) 116);
                var5++;
                continue L1;
              }
            }
          } else {
            var3++;
            continue L0;
          }
        }
    }

    final static int d(byte param0) {
        int var1 = 45 % ((-7 - param0) / 35);
        return eb.field_a - eb.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_n = "Resizable";
        field_i = "That name is not available";
    }
}
