/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends jb {
    byte[] field_f;
    byte[] field_i;
    cp[] field_j;
    byte[] field_p;
    static int[] field_l;
    private int[] field_k;
    static int field_q;
    static int field_h;
    short[] field_n;
    ko[] field_m;
    static bc field_o;
    int field_g;

    final boolean a(boolean param0, bn param1, int[] param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        ko var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = CrazyCrystals.field_B;
        var5 = param0 ? 1 : 0;
        var6 = 0;
        var7 = null;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 128) {
            return var5 != 0;
          } else {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (-1 != param3[var8]) {
                  break L1;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
            var9 = ((dk) this).field_k[var8];
            if (-1 != var9) {
              L2: {
                if (var6 == var9) {
                  break L2;
                } else {
                  L3: {
                    var6 = var9;
                    var9--;
                    if (0 == (1 & var9)) {
                      var7 = param1.a(param2, false, var9 >> 1792808130);
                      break L3;
                    } else {
                      var7 = param1.a(var9 >> 1315610946, false, param2);
                      break L3;
                    }
                  }
                  if (var7 == null) {
                    var5 = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (var7 != null) {
                ((dk) this).field_m[var8] = var7;
                ((dk) this).field_k[var8] = 0;
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

    final static String a(CharSequence[] param0, byte param1) {
        if (param1 != -55) {
            field_o = null;
        }
        return mk.a(115, param0, 0, param0.length);
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 != 55) {
            Object var2 = null;
            String discarded$0 = dk.a((CharSequence[]) null, (byte) 19);
        }
        field_o = null;
    }

    dk(byte[] param0) {
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
        cp[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        cp var15 = null;
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
        cp var25_ref = null;
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
        ng var38 = null;
        byte[] var39 = null;
        cp var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        cp var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        cp var48 = null;
        cp var49 = null;
        cp var50 = null;
        cp var51 = null;
        cp var52 = null;
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
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        Object stackOut_37_0 = null;
        byte[] stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        byte[] stackOut_39_0 = null;
        ((dk) this).field_j = new cp[128];
        ((dk) this).field_f = new byte[128];
        ((dk) this).field_p = new byte[128];
        ((dk) this).field_i = new byte[128];
        ((dk) this).field_n = new short[128];
        ((dk) this).field_k = new int[128];
        ((dk) this).field_m = new ko[128];
        var38 = new ng(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_h[var3 + var38.field_f]) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_f = var38.field_f + 1;
                var3++;
                var5 = var38.field_f;
                var38.field_f = var38.field_f + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_h[var6 + var38.field_f] == 0) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var38.field_f = var38.field_f + 1;
                        var6++;
                        var8 = var38.field_f;
                        var38.field_f = var38.field_f + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_h[var38.field_f + var9] == 0) {
                            var67 = new byte[var9];
                            var62 = var67;
                            var57 = var62;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var9++;
                                  var38.field_f = var38.field_f + 1;
                                  var63 = new byte[var9];
                                  var58 = var63;
                                  var53 = var58;
                                  var39 = var53;
                                  var11 = var39;
                                  if (1 >= var9) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var63[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.h(255);
                                          if (0 != var15_int) {
                                            L9: {
                                              if (var15_int > var13_int) {
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
                                  }
                                }
                                var13 = new cp[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.h(255);
                                      if (0 >= var14) {
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = new byte[var14 * 2];
                                        stackIn_38_0 = stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var46 = stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.h(255);
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
                                      if (var38.field_h[var38.field_f + var17] == 0) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_f = var38.field_f + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (128 <= var20) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (128 <= var20) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (var23 >= 128) {
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (128 <= var24) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (-129 >= (var25_int ^ -1)) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((dk) this).field_g = var38.h(255) - -1;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var46.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.d((byte) 106);
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
                                                                                    var16[var27] = var38.d((byte) 111);
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
                                                                                  if (var27 >= var12) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.h(255);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var46.length <= var27) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var46.length <= var29) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if ((var30 ^ -1) <= -129) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((dk) this).field_p[var30] = (byte)(((dk) this).field_p[var30] * var28 - -32 >> -1185039802);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = (var30 + -var27) / 2 + var28 * (-var27 + var30);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = hm.a(-var27 + var30, 36, var32);
                                                                                                        ((dk) this).field_p[var33] = (byte)(((dk) this).field_p[var33] * var34 - -32 >> 1946502598);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((dk) this).field_p[var29] = (byte)(32 + var28 * ((dk) this).field_p[var29] >> 1563673094);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.h(255) + (var19 + 1);
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
                                                                                        var19 = var38.h(255);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var47.length <= var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 231329857;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var47.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 <= -129) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (255 & ((dk) this).field_i[var30]);
                                                                                                          if (-1 <= var31) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (-129 <= (var31 ^ -1)) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((dk) this).field_i[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << 1714543649;
                                                                                                    var32 = (var30 + -var27) / 2 + var28 * (var30 + -var27);
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
                                                                                                          var34 = hm.a(var30 - var27, 75, var32);
                                                                                                          var35 = (255 & ((dk) this).field_i[var37]) - -var34;
                                                                                                          if (-1 >= (var35 ^ -1)) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (var35 <= 128) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((dk) this).field_i[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (255 & ((dk) this).field_i[var29]);
                                                                                                  if (var30 >= 0) {
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
                                                                                                ((dk) this).field_i[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.h(255) + (var19 - -1);
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
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if ((var52.field_i ^ -1) < -1) {
                                                                                                          var52.field_e = var38.h(255);
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
                                                                                                    if (0 < var51.field_l) {
                                                                                                      var51.field_i = var38.h(255);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_l = var38.h(255);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_a) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_f = var38.h(255);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_b) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_c = var38.h(255);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (0 < var50.field_g) {
                                                                                              var50.field_j = var38.h(255);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_g = var38.h(255);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (null != var49.field_a) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_a.length) {
                                                                                          var19 = var38.h(255) + (var19 - -1);
                                                                                          var49.field_a[var29] = (byte)var19;
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
                                                                                      var19 = 1 + (var19 - -var38.h(255));
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
                                                                              if (null == var45.field_a) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var45.field_a.length <= var29) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_a[var29] = var38.d((byte) -97);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_b) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var29 < var45.field_b.length - 2) {
                                                                                  var45.field_b[var29] = var38.d((byte) 113);
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
                                                                              if (var64.length > var21) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if ((((dk) this).field_k[var27] ^ -1) >= -1) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.h(255) + 1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((dk) this).field_p[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (-1 != (((dk) this).field_k[var26] ^ -1)) {
                                                                      L61: {
                                                                        if (var20 != 0) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var63[var21]];
                                                                          if (var21 < var67.length) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      ((dk) this).field_j[var26] = var25_ref;
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
                                                                if (((dk) this).field_k[var25_int] != 0) {
                                                                  L62: {
                                                                    if (0 != var20) {
                                                                      break L62;
                                                                    } else {
                                                                      L63: {
                                                                        if (var66.length <= var21) {
                                                                          var20 = -1;
                                                                          break L63;
                                                                        } else {
                                                                          var21++;
                                                                          var20 = var7[var21];
                                                                          break L63;
                                                                        }
                                                                      }
                                                                      var8++;
                                                                      var24 = 16 + var38.field_h[var8] << -410681694;
                                                                      break L62;
                                                                    }
                                                                  }
                                                                  var20--;
                                                                  ((dk) this).field_i[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (((dk) this).field_k[var24] != 0) {
                                                              L64: {
                                                                if (var20 != 0) {
                                                                  break L64;
                                                                } else {
                                                                  var5++;
                                                                  var23 = -1 + var38.field_h[var5];
                                                                  if (var65.length <= var21) {
                                                                    var20 = -1;
                                                                    break L64;
                                                                  } else {
                                                                    var21++;
                                                                    var20 = var4[var21];
                                                                    break L64;
                                                                  }
                                                                }
                                                              }
                                                              var20--;
                                                              ((dk) this).field_f[var24] = (byte)var23;
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
                                                              if (var21 < var64.length) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L66;
                                                              } else {
                                                                var20 = -1;
                                                                break L66;
                                                              }
                                                            }
                                                            var22 = var38.e(-63);
                                                            break L65;
                                                          }
                                                        }
                                                        ((dk) this).field_n[var23] = (short)(((dk) this).field_n[var23] + pf.b(32768, -1 + var22 << -159636530));
                                                        ((dk) this).field_k[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.h(255);
                                                    ((dk) this).field_n[var20] = (short)(((dk) this).field_n[var20] + (var19 << -1502518392));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.h(255);
                                                ((dk) this).field_n[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.d((byte) 106);
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
                                      var13[var14] = new cp();
                                      var40 = new cp();
                                      var15 = var40;
                                      var16_int = var38.h(255);
                                      if (-1 <= (var16_int ^ -1)) {
                                        break L67;
                                      } else {
                                        var15.field_a = new byte[2 * var16_int];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.h(255);
                                    if (0 < var16_int) {
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
                                var10[var11_int] = var38.d((byte) 108);
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
                        var7[var8] = var38.d((byte) 113);
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
                var4[var5] = var38.d((byte) -54);
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
    }
}
