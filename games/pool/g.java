/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ma {
    private int[] field_r;
    short[] field_s;
    kp[] field_t;
    byte[] field_n;
    static char[] field_o;
    static String field_w;
    byte[] field_v;
    jg[] field_u;
    byte[] field_p;
    int field_q;
    static int[] field_l;
    static String field_m;

    public static void a(int param0) {
        field_l = null;
        field_w = null;
        field_o = null;
        field_m = null;
        if (param0 != 5893) {
            field_w = null;
        }
    }

    final boolean a(int param0, byte[] param1, int[] param2, cf param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Pool.field_O;
          if (param0 == 23605) {
            break L0;
          } else {
            ((g) this).c(35);
            break L0;
          }
        }
        var5 = 1;
        var6 = 0;
        var7 = null;
        var8 = 0;
        L1: while (true) {
          if ((var8 ^ -1) <= -129) {
            return var5 != 0;
          } else {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (0 != param1[var8]) {
                  break L2;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
            var9 = ((g) this).field_r[var8];
            if (var9 != 0) {
              L3: {
                if (var6 != var9) {
                  L4: {
                    var6 = var9;
                    var9--;
                    if ((1 & var9) == 0) {
                      var7 = (Object) (Object) param3.a(param2, var9 >> 941106082, -1);
                      break L4;
                    } else {
                      var7 = (Object) (Object) param3.b(param2, 6789, var9 >> -1317735582);
                      break L4;
                    }
                  }
                  if (var7 == null) {
                    var5 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (var7 != null) {
                ((g) this).field_u[var8] = (jg) var7;
                ((g) this).field_r[var8] = 0;
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

    final void c(int param0) {
        ((g) this).field_r = null;
        if (param0 != 23478) {
            g.a(-24);
        }
    }

    g(byte[] param0) {
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
        kp[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        kp var15 = null;
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
        ge var38 = null;
        byte[] var39 = null;
        kp var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        kp var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        kp var48 = null;
        kp var49 = null;
        kp var50 = null;
        kp var51 = null;
        kp var52 = null;
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
        ((g) this).field_v = new byte[128];
        ((g) this).field_n = new byte[128];
        ((g) this).field_r = new int[128];
        ((g) this).field_u = new jg[128];
        ((g) this).field_p = new byte[128];
        ((g) this).field_s = new short[128];
        ((g) this).field_t = new kp[128];
        var38 = new ge(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_t[var38.field_v - -var3] ^ -1)) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var38.field_v = var38.field_v + 1;
                var3++;
                var5 = var38.field_v;
                var38.field_v = var38.field_v + var3;
                var6 = 0;
                L2: while (true) {
                  if (-1 == (var38.field_t[var38.field_v + var6] ^ -1)) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if ((var8 ^ -1) <= (var6 ^ -1)) {
                        var38.field_v = var38.field_v + 1;
                        var6++;
                        var8 = var38.field_v;
                        var38.field_v = var38.field_v + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (-1 == (var38.field_t[var38.field_v + var9] ^ -1)) {
                            var67 = new byte[var9];
                            var62 = var67;
                            var57 = var62;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var38.field_v = var38.field_v + 1;
                                  var9++;
                                  var63 = new byte[var9];
                                  var58 = var63;
                                  var53 = var58;
                                  var39 = var53;
                                  var11 = var39;
                                  if (-2 <= (var9 ^ -1)) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var63[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if ((var14 ^ -1) <= (var9 ^ -1)) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.g(-119);
                                          if (-1 != (var15_int ^ -1)) {
                                            L9: {
                                              if ((var15_int ^ -1) < (var13_int ^ -1)) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          } else {
                                            int incrementValue$9 = var12;
                                            var12++;
                                            var13_int = incrementValue$9;
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
                                var13 = new kp[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if ((var14 ^ -1) <= (var13.length ^ -1)) {
                                    L11: {
                                      var14 = var38.g(-104);
                                      if ((var14 ^ -1) >= -1) {
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
                                      var14 = var38.g(-68);
                                      if (0 >= var14) {
                                        stackOut_40_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = new byte[2 * var14];
                                        stackIn_41_0 = stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_t[var38.field_v - -var17] == 0) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if ((var19 ^ -1) <= (var17 ^ -1)) {
                                            var17++;
                                            var38.field_v = var38.field_v + 1;
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
                                                      if (-129 >= (var23 ^ -1)) {
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
                                                              if (var25_int >= 128) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (128 <= var26) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= (var27 ^ -1)) {
                                                                        ((g) this).field_q = 1 + var38.g(-89);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var12 <= var27) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var46.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.e((byte) 105);
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
                                                                                  if ((var27 ^ -1) <= (var47.length ^ -1)) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.e((byte) 105);
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
                                                                                  if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.g(-123);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if ((var46.length ^ -1) >= (var27 ^ -1)) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var46.length) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((g) this).field_n[var30] = (byte)(32 + var28 * ((g) this).field_n[var30] >> 1567784902);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = (var30 - var27) / 2 + (var30 - var27) * var28;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = dg.a((byte) 44, -var27 + var30, var32);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((g) this).field_n[var33] = (byte)(32 + ((g) this).field_n[var33] * var34 >> 1467734822);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((g) this).field_n[var29] = (byte)(var28 * ((g) this).field_n[var29] + 32 >> 1995454918);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 - (-1 - var38.g(-105));
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 != null) {
                                                                                        var19 = var38.g(-97);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var47.length <= var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 1707308641;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var47.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        var27 = 0;
                                                                                                        L40: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L35;
                                                                                                          } else {
                                                                                                            var13[var27].field_e = var38.g(-89);
                                                                                                            var27++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L41: {
                                                                                                          var31 = (255 & ((g) this).field_v[var30]) - -var28;
                                                                                                          if (-1 >= (var31 ^ -1)) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        L42: {
                                                                                                          if (128 >= var31) {
                                                                                                            break L42;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L42;
                                                                                                          }
                                                                                                        }
                                                                                                        ((g) this).field_v[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 + 1] << 1652715681;
                                                                                                    var32 = (var30 + -var27) / 2 + var28 * (-var27 + var30);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L43: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L44: {
                                                                                                          var34 = dg.a((byte) 44, -var27 + var30, var32);
                                                                                                          var35 = (255 & ((g) this).field_v[var37]) - -var34;
                                                                                                          if ((var35 ^ -1) <= -1) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        L45: {
                                                                                                          if ((var35 ^ -1) >= -129) {
                                                                                                            break L45;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L45;
                                                                                                          }
                                                                                                        }
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((g) this).field_v[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L43;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L46: {
                                                                                                  var30 = var28 + (((g) this).field_v[var29] & 255);
                                                                                                  if (0 <= var30) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                L47: {
                                                                                                  if (128 >= var30) {
                                                                                                    break L47;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L47;
                                                                                                  }
                                                                                                }
                                                                                                ((g) this).field_v[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + (1 - -var38.g(-121));
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            break L35;
                                                                                          } else {
                                                                                            var13[var27].field_e = var38.g(-89);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L49: while (true) {
                                                                                      if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                                                        var27 = 0;
                                                                                        L50: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    return;
                                                                                                  } else {
                                                                                                    L53: {
                                                                                                      var52 = var13[var27];
                                                                                                      if ((var52.field_b ^ -1) >= -1) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var52.field_n = var38.g(-106);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L52;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L54: {
                                                                                                  var51 = var13[var27];
                                                                                                  if (var51.field_o <= 0) {
                                                                                                    break L54;
                                                                                                  } else {
                                                                                                    var51.field_b = var38.g(-89);
                                                                                                    break L54;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L51;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_o = var38.g(-99);
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L55: {
                                                                                          var50 = var13[var27];
                                                                                          if (var50.field_a == null) {
                                                                                            break L55;
                                                                                          } else {
                                                                                            var50.field_j = var38.g(-96);
                                                                                            break L55;
                                                                                          }
                                                                                        }
                                                                                        L56: {
                                                                                          if (var50.field_l == null) {
                                                                                            break L56;
                                                                                          } else {
                                                                                            var50.field_g = var38.g(-98);
                                                                                            break L56;
                                                                                          }
                                                                                        }
                                                                                        L57: {
                                                                                          if ((var50.field_e ^ -1) >= -1) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var50.field_k = var38.g(-95);
                                                                                            break L57;
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L49;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L58: {
                                                                                      var49 = var13[var27];
                                                                                      if (null == var49.field_a) {
                                                                                        break L58;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L59: while (true) {
                                                                                          if ((var49.field_a.length ^ -1) >= (var29 ^ -1)) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = var19 - -1 - -var38.g(-88);
                                                                                            var49.field_a[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L59;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L60: {
                                                                                  var48 = var13[var27];
                                                                                  if (var48.field_l == null) {
                                                                                    break L60;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L61: while (true) {
                                                                                      if (var29 >= var48.field_l.length) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = var19 + 1 + var38.g(-91);
                                                                                        var48.field_l[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L61;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L62: {
                                                                              var45 = var13[var27];
                                                                              if (var45.field_a == null) {
                                                                                break L62;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L63: while (true) {
                                                                                  if ((var29 ^ -1) <= (var45.field_a.length ^ -1)) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var45.field_a[var29] = var38.e((byte) 105);
                                                                                    var29 += 2;
                                                                                    continue L63;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L64: {
                                                                              if (var45.field_l == null) {
                                                                                break L64;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L65: while (true) {
                                                                                  if ((-2 + var45.field_l.length ^ -1) >= (var29 ^ -1)) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var45.field_l[var29] = var38.e((byte) 105);
                                                                                    var29 += 2;
                                                                                    continue L65;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L66: {
                                                                          if (0 != var20) {
                                                                            break L66;
                                                                          } else {
                                                                            L67: {
                                                                              if (var64.length > var21) {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L67;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L67;
                                                                              }
                                                                            }
                                                                            if ((((g) this).field_r[var27] ^ -1) >= -1) {
                                                                              break L66;
                                                                            } else {
                                                                              var26 = 1 + var38.g(-82);
                                                                              break L66;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((g) this).field_n[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L68: {
                                                                      if ((((g) this).field_r[var26] ^ -1) == -1) {
                                                                        break L68;
                                                                      } else {
                                                                        L69: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L69;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var63[var21]];
                                                                            if ((var67.length ^ -1) < (var21 ^ -1)) {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L69;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L69;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((g) this).field_t[var26] = (kp) var25;
                                                                        var20--;
                                                                        break L68;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L70: {
                                                                  if ((((g) this).field_r[var25_int] ^ -1) == -1) {
                                                                    break L70;
                                                                  } else {
                                                                    L71: {
                                                                      if (0 != var20) {
                                                                        break L71;
                                                                      } else {
                                                                        L72: {
                                                                          if (var66.length <= var21) {
                                                                            var20 = -1;
                                                                            break L72;
                                                                          } else {
                                                                            int incrementValue$12 = var21;
                                                                            var21++;
                                                                            var20 = var7[incrementValue$12];
                                                                            break L72;
                                                                          }
                                                                        }
                                                                        int incrementValue$13 = var8;
                                                                        var8++;
                                                                        var24 = 16 + var38.field_t[incrementValue$13] << 2075031138;
                                                                        break L71;
                                                                      }
                                                                    }
                                                                    ((g) this).field_v[var25_int] = (byte)var24;
                                                                    var20--;
                                                                    break L70;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L73: {
                                                              if (-1 == (((g) this).field_r[var24] ^ -1)) {
                                                                break L73;
                                                              } else {
                                                                L74: {
                                                                  if ((var20 ^ -1) != -1) {
                                                                    break L74;
                                                                  } else {
                                                                    int incrementValue$14 = var5;
                                                                    var5++;
                                                                    var23 = var38.field_t[incrementValue$14] - 1;
                                                                    if (var21 < var65.length) {
                                                                      int incrementValue$15 = var21;
                                                                      var21++;
                                                                      var20 = var4[incrementValue$15];
                                                                      break L74;
                                                                    } else {
                                                                      var20 = -1;
                                                                      break L74;
                                                                    }
                                                                  }
                                                                }
                                                                ((g) this).field_p[var24] = (byte)var23;
                                                                var20--;
                                                                break L73;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L75: {
                                                          if (-1 != (var20 ^ -1)) {
                                                            break L75;
                                                          } else {
                                                            L76: {
                                                              if ((var21 ^ -1) <= (var64.length ^ -1)) {
                                                                var20 = -1;
                                                                break L76;
                                                              } else {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L76;
                                                              }
                                                            }
                                                            var22 = var38.k(-112);
                                                            break L75;
                                                          }
                                                        }
                                                        ((g) this).field_s[var23] = (short)(((g) this).field_s[var23] + (rb.b(2, -1 + var22) << -1547347186));
                                                        var20--;
                                                        ((g) this).field_r[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.g(-89);
                                                    ((g) this).field_s[var20] = (short)(((g) this).field_s[var20] + (var19 << -228279800));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.g(-82);
                                                ((g) this).field_s[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.e((byte) 105);
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
                                    L77: {
                                      kp dupTemp$17 = new kp();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.g(-74);
                                      if (var16_int <= 0) {
                                        break L77;
                                      } else {
                                        var15.field_a = new byte[var16_int * 2];
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      var16_int = var38.g(-119);
                                      if (var16_int <= 0) {
                                        break L78;
                                      } else {
                                        var15.field_l = new byte[var16_int * 2 + 2];
                                        var40.field_l[1] = (byte)64;
                                        break L78;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.e((byte) 105);
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
                        var7[var8] = var38.e((byte) 105);
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
                var4[var5] = var38.e((byte) 105);
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
        field_w = "That concludes the Eight-ball Tutorial! Press <img=3> to go to the options menu to end the tutorial.";
        field_o = new char[]{(char)91, (char)93, (char)35};
        field_m = "Age:";
    }
}
