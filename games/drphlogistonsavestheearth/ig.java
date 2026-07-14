/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends gi {
    static String field_o;
    short[] field_p;
    int field_l;
    private int[] field_r;
    static int field_h;
    ri[] field_q;
    static vj field_t;
    byte[] field_m;
    vk[] field_j;
    byte[] field_s;
    static int field_k;
    static String field_i;
    byte[] field_n;

    final boolean a(int[] param0, int param1, cf param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        vk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var5 = 1;
          if (param1 >= 98) {
            break L0;
          } else {
            ((ig) this).field_q = null;
            break L0;
          }
        }
        var6 = 0;
        var7 = null;
        var8 = 0;
        L1: while (true) {
          if (var8 >= 128) {
            return var5 != 0;
          } else {
            L2: {
              if (param3 == null) {
                break L2;
              } else {
                if (-1 != param3[var8]) {
                  break L2;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
            var9 = ((ig) this).field_r[var8];
            if (-1 != var9) {
              L3: {
                if (var9 != var6) {
                  L4: {
                    var6 = var9;
                    var9--;
                    if ((1 & var9) != 0) {
                      var7 = param2.a(256, var9 >> -1822546110, param0);
                      break L4;
                    } else {
                      var7 = param2.a(param0, var9 >> 2049151682, 1);
                      break L4;
                    }
                  }
                  if (var7 != null) {
                    break L3;
                  } else {
                    var5 = 0;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (var7 != null) {
                ((ig) this).field_j[var8] = var7;
                ((ig) this).field_r[var8] = 0;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            } else {
              var8++;
              continue L1;
            }
          }
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != -121) {
            return 89;
        }
        param0 = ((param0 & -1431655765) >>> -1168237663) + (1431655765 & param0);
        param0 = (param0 & 858993459) + ((param0 & -858993458) >>> 2071495490);
        param0 = 252645135 & param0 - -(param0 >>> 1170859684);
        param0 = param0 + (param0 >>> 1789222312);
        param0 = param0 + (param0 >>> 1686503024);
        return param0 & 255;
    }

    final static int a(byte param0) {
        if (param0 <= 77) {
            return -29;
        }
        return vi.field_e;
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 != -15877) {
            return;
        }
        field_i = null;
        field_t = null;
    }

    final void d(int param0) {
        ((ig) this).field_r = null;
        if (param0 <= 66) {
            ((ig) this).field_n = null;
        }
    }

    ig(byte[] param0) {
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
        ri[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        ri var15 = null;
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
        ri var25_ref = null;
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
        od var38 = null;
        byte[] var39 = null;
        ri var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        ri var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        ri var48 = null;
        ri var49 = null;
        ri var50 = null;
        ri var51 = null;
        ri var52 = null;
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
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        byte[] stackOut_39_0 = null;
        ((ig) this).field_j = new vk[128];
        ((ig) this).field_p = new short[128];
        ((ig) this).field_m = new byte[128];
        ((ig) this).field_s = new byte[128];
        ((ig) this).field_n = new byte[128];
        ((ig) this).field_q = new ri[128];
        ((ig) this).field_r = new int[128];
        var38 = new od(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_h[var3 + var38.field_j] ^ -1)) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_j = var38.field_j + 1;
                var3++;
                var5 = var38.field_j;
                var38.field_j = var38.field_j + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_h[var38.field_j - -var6] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var6++;
                        var38.field_j = var38.field_j + 1;
                        var8 = var38.field_j;
                        var38.field_j = var38.field_j + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (0 == var38.field_h[var38.field_j - -var9]) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var38.field_j = var38.field_j + 1;
                                  var9++;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (-2 > (var9 ^ -1)) {
                                    var65[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.l(31760);
                                          if (-1 != (var15_int ^ -1)) {
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
                                var13 = new ri[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.l(31760);
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
                                      var70 = stackIn_38_0;
                                      var64 = var70;
                                      var58 = var64;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.l(31760);
                                      if (0 >= var14) {
                                        stackOut_40_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = new byte[var14 * 2];
                                        stackIn_41_0 = stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (0 == var38.field_h[var17 + var38.field_j]) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var17++;
                                            var38.field_j = var38.field_j + 1;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if ((var20 ^ -1) <= -129) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (var23 >= 128) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if ((var24 ^ -1) <= -129) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (-129 >= var25_int) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (128 <= var26) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((ig) this).field_l = 1 + var38.l(31760);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var12 <= var27) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var70.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.n(95);
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
                                                                                  if (var47.length <= var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.n(-96);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (var12 <= var27) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    L29: {
                                                                                      L30: {
                                                                                        if (var15_array != null) {
                                                                                          var19 = var38.l(31760);
                                                                                          var15_array[0] = (byte)var19;
                                                                                          var27 = 2;
                                                                                          L31: while (true) {
                                                                                            if (var27 >= var70.length) {
                                                                                              var27 = var70[0];
                                                                                              var28 = var70[1];
                                                                                              var29 = 0;
                                                                                              L32: while (true) {
                                                                                                if (var29 >= var27) {
                                                                                                  var29 = 2;
                                                                                                  L33: while (true) {
                                                                                                    if (var29 >= var70.length) {
                                                                                                      var15_array = null;
                                                                                                      var30 = var27;
                                                                                                      L34: while (true) {
                                                                                                        if (-129 >= (var30 ^ -1)) {
                                                                                                          if (var16 == null) {
                                                                                                            break L29;
                                                                                                          } else {
                                                                                                            var19 = var38.l(31760);
                                                                                                            var16[0] = (byte)var19;
                                                                                                            var27 = 2;
                                                                                                            L35: while (true) {
                                                                                                              if (var27 >= var47.length) {
                                                                                                                break L30;
                                                                                                              } else {
                                                                                                                var19 = var38.l(31760) + 1 + var19;
                                                                                                                var16[var27] = (byte)var19;
                                                                                                                var27 += 2;
                                                                                                                continue L35;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          ((ig) this).field_m[var30] = (byte)(((ig) this).field_m[var30] * var28 + 32 >> -1184934810);
                                                                                                          var30++;
                                                                                                          continue L34;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var30 = var70[var29];
                                                                                                      var31 = var15_array[var29 - -1];
                                                                                                      var32 = var28 * (-var27 + var30) - -((var30 + -var27) / 2);
                                                                                                      var33 = var27;
                                                                                                      L36: while (true) {
                                                                                                        if (var33 >= var30) {
                                                                                                          var29 += 2;
                                                                                                          var27 = var30;
                                                                                                          var28 = var31;
                                                                                                          continue L33;
                                                                                                        } else {
                                                                                                          var34 = sj.a(-64, var30 - var27, var32);
                                                                                                          ((ig) this).field_m[var33] = (byte)(var34 * ((ig) this).field_m[var33] - -32 >> -266015610);
                                                                                                          var32 = var32 + (var31 - var28);
                                                                                                          var33++;
                                                                                                          continue L36;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  ((ig) this).field_m[var29] = (byte)(var28 * ((ig) this).field_m[var29] - -32 >> -1277617434);
                                                                                                  var29++;
                                                                                                  continue L32;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var19 = var19 + 1 + var38.l(31760);
                                                                                              var15_array[var27] = (byte)var19;
                                                                                              var27 += 2;
                                                                                              continue L31;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          if (var16 == null) {
                                                                                            break L29;
                                                                                          } else {
                                                                                            var19 = var38.l(31760);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var47.length) {
                                                                                                break L30;
                                                                                              } else {
                                                                                                var19 = var38.l(31760) + 1 + var19;
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var27 = var47[0];
                                                                                      var28 = var47[1] << 1395367553;
                                                                                      var29 = 0;
                                                                                      L38: while (true) {
                                                                                        if (var29 >= var27) {
                                                                                          var29 = 2;
                                                                                          L39: while (true) {
                                                                                            if (var29 >= var47.length) {
                                                                                              var16 = null;
                                                                                              var30 = var27;
                                                                                              L40: while (true) {
                                                                                                if (var30 <= -129) {
                                                                                                  break L29;
                                                                                                } else {
                                                                                                  L41: {
                                                                                                    var31 = (((ig) this).field_s[var30] & 255) + var28;
                                                                                                    if (-1 <= var31) {
                                                                                                      break L41;
                                                                                                    } else {
                                                                                                      var31 = 0;
                                                                                                      break L41;
                                                                                                    }
                                                                                                  }
                                                                                                  L42: {
                                                                                                    if (-129 <= (var31 ^ -1)) {
                                                                                                      break L42;
                                                                                                    } else {
                                                                                                      var31 = 128;
                                                                                                      break L42;
                                                                                                    }
                                                                                                  }
                                                                                                  ((ig) this).field_s[var30] = (byte)var31;
                                                                                                  var30++;
                                                                                                  continue L40;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var30 = var47[var29];
                                                                                              var31 = var16[1 + var29] << -136191167;
                                                                                              var32 = (var30 - var27) * var28 + (-var27 + var30) / 2;
                                                                                              var37 = var27;
                                                                                              var33 = var37;
                                                                                              L43: while (true) {
                                                                                                if (var30 <= var37) {
                                                                                                  var29 += 2;
                                                                                                  var28 = var31;
                                                                                                  var27 = var30;
                                                                                                  continue L39;
                                                                                                } else {
                                                                                                  L44: {
                                                                                                    var34 = sj.a(-79, -var27 + var30, var32);
                                                                                                    var35 = var34 + (((ig) this).field_s[var37] & 255);
                                                                                                    if (0 <= var35) {
                                                                                                      break L44;
                                                                                                    } else {
                                                                                                      var35 = 0;
                                                                                                      break L44;
                                                                                                    }
                                                                                                  }
                                                                                                  L45: {
                                                                                                    if (128 >= var35) {
                                                                                                      break L45;
                                                                                                    } else {
                                                                                                      var35 = 128;
                                                                                                      break L45;
                                                                                                    }
                                                                                                  }
                                                                                                  var32 = var32 + (-var28 + var31);
                                                                                                  ((ig) this).field_s[var37] = (byte)var35;
                                                                                                  var37++;
                                                                                                  continue L43;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          L46: {
                                                                                            var30 = var28 + (255 & ((ig) this).field_s[var29]);
                                                                                            if ((var30 ^ -1) <= -1) {
                                                                                              break L46;
                                                                                            } else {
                                                                                              var30 = 0;
                                                                                              break L46;
                                                                                            }
                                                                                          }
                                                                                          L47: {
                                                                                            if (var30 <= 128) {
                                                                                              break L47;
                                                                                            } else {
                                                                                              var30 = 128;
                                                                                              break L47;
                                                                                            }
                                                                                          }
                                                                                          ((ig) this).field_s[var29] = (byte)var30;
                                                                                          var29++;
                                                                                          continue L38;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L48: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        var27 = 0;
                                                                                        L49: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L50: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L51: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L52: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (0 < var52.field_l) {
                                                                                                          var52.field_p = var38.l(31760);
                                                                                                          var27++;
                                                                                                          continue L52;
                                                                                                        } else {
                                                                                                          var27++;
                                                                                                          continue L52;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var51 = var13[var27];
                                                                                                    if (0 < var51.field_k) {
                                                                                                      var51.field_l = var38.l(31760);
                                                                                                      var27++;
                                                                                                      continue L51;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L51;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_k = var38.l(31760);
                                                                                                var27++;
                                                                                                continue L50;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L53: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_a == null) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_n = var38.l(31760);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            L54: {
                                                                                              if (null == var50.field_m) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var50.field_g = var38.l(31760);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            if (0 < var50.field_i) {
                                                                                              var50.field_j = var38.l(31760);
                                                                                              var27++;
                                                                                              continue L49;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L49;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_i = var38.l(31760);
                                                                                        var27++;
                                                                                        continue L48;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_a != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L55: while (true) {
                                                                                        if (var49.field_a.length > var29) {
                                                                                          var19 = var38.l(31760) + (1 + var19);
                                                                                          var49.field_a[var29] = (byte)var19;
                                                                                          var29 += 2;
                                                                                          continue L55;
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
                                                                                if (var48.field_m != null) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L56: while (true) {
                                                                                    if (var29 < var48.field_m.length) {
                                                                                      var19 = 1 + (var19 - -var38.l(31760));
                                                                                      var48.field_m[var29] = (byte)var19;
                                                                                      var29 += 2;
                                                                                      continue L56;
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
                                                                            L57: {
                                                                              var45 = var13[var27];
                                                                              if (var45.field_a == null) {
                                                                                break L57;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L58: while (true) {
                                                                                  if (var45.field_a.length <= var29) {
                                                                                    break L57;
                                                                                  } else {
                                                                                    var45.field_a[var29] = var38.n(-109);
                                                                                    var29 += 2;
                                                                                    continue L58;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_m) {
                                                                              var29 = 3;
                                                                              L59: while (true) {
                                                                                if (var29 < var45.field_m.length - 2) {
                                                                                  var45.field_m[var29] = var38.n(-115);
                                                                                  var29 += 2;
                                                                                  continue L59;
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
                                                                        L60: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L60;
                                                                          } else {
                                                                            L61: {
                                                                              if (var66.length > var21) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L61;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L61;
                                                                              }
                                                                            }
                                                                            if (((ig) this).field_r[var27] <= 0) {
                                                                              break L60;
                                                                            } else {
                                                                              var26 = var38.l(31760) + 1;
                                                                              break L60;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((ig) this).field_m[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (0 != ((ig) this).field_r[var26]) {
                                                                      L62: {
                                                                        if (0 != var20) {
                                                                          break L62;
                                                                        } else {
                                                                          var25_ref = var13[var65[var21]];
                                                                          if (var21 >= var69.length) {
                                                                            var20 = -1;
                                                                            break L62;
                                                                          } else {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L62;
                                                                          }
                                                                        }
                                                                      }
                                                                      var20--;
                                                                      ((ig) this).field_q[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (-1 != ((ig) this).field_r[var25_int]) {
                                                                  L63: {
                                                                    if (var20 != 0) {
                                                                      break L63;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = 16 + var38.field_h[var8] << -1182454238;
                                                                      if (var21 >= var68.length) {
                                                                        var20 = -1;
                                                                        break L63;
                                                                      } else {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L63;
                                                                      }
                                                                    }
                                                                  }
                                                                  ((ig) this).field_s[var25_int] = (byte)var24;
                                                                  var20--;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (((ig) this).field_r[var24] != 0) {
                                                              L64: {
                                                                if (var20 != 0) {
                                                                  break L64;
                                                                } else {
                                                                  var5++;
                                                                  var23 = -1 + var38.field_h[var5];
                                                                  if (var21 < var67.length) {
                                                                    var21++;
                                                                    var20 = var4[var21];
                                                                    break L64;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L64;
                                                                  }
                                                                }
                                                              }
                                                              var20--;
                                                              ((ig) this).field_n[var24] = (byte)var23;
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
                                                              if (var21 < var66.length) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L66;
                                                              } else {
                                                                var20 = -1;
                                                                break L66;
                                                              }
                                                            }
                                                            var22 = var38.c((byte) 58);
                                                            break L65;
                                                          }
                                                        }
                                                        ((ig) this).field_p[var23] = (short)(((ig) this).field_p[var23] + rk.a(32768, var22 + -1 << 328554638));
                                                        ((ig) this).field_r[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.l(31760);
                                                    ((ig) this).field_p[var20] = (short)(((ig) this).field_p[var20] + (var19 << 1249033480));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.l(31760);
                                                ((ig) this).field_p[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.n(89);
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
                                      var13[var14] = new ri();
                                      var40 = new ri();
                                      var15 = var40;
                                      var16_int = var38.l(31760);
                                      if ((var16_int ^ -1) >= -1) {
                                        break L67;
                                      } else {
                                        var15.field_a = new byte[var16_int * 2];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.l(31760);
                                    if ((var16_int ^ -1) < -1) {
                                      var15.field_m = new byte[2 + 2 * var16_int];
                                      var40.field_m[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.n(125);
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
                        var7[var8] = var38.n(108);
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
                var4[var5] = var38.n(124);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Loading sound effects";
        field_i = "Unfortunately you are not eligible to create an account.";
    }
}
