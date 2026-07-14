/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends li {
    byte[] field_p;
    byte[] field_B;
    static int field_z;
    byte[] field_q;
    private int[] field_u;
    static int[] field_s;
    ae[] field_r;
    short[] field_n;
    static int[] field_x;
    gl[] field_v;
    static int[] field_o;
    int field_w;
    static String[] field_A;
    static String[] field_y;
    static int field_t;

    final static void a(byte param0) {
        if (param0 != -41) {
            field_A = null;
        }
        rc.field_d = null;
    }

    final static boolean a(int param0, byte param1) {
        if (param1 != -94) {
            al.a((byte) 42);
        }
        return 0 <= param0 ? true : false;
    }

    final boolean a(int param0, byte[] param1, id param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        ae var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        var5 = 1;
        var6 = 0;
        var7 = null;
        var8 = param0;
        L0: while (true) {
          if ((var8 ^ -1) <= -129) {
            return var5 != 0;
          } else {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1[var8] != 0) {
                  break L1;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
            var9 = ((al) this).field_u[var8];
            if (0 != var9) {
              L2: {
                if (var9 != var6) {
                  L3: {
                    var6 = var9;
                    var9--;
                    if (0 != (var9 & 1)) {
                      var7 = param2.a(param3, 64, var9 >> 737024130);
                      break L3;
                    } else {
                      var7 = param2.a(false, param3, var9 >> -1291724766);
                      break L3;
                    }
                  }
                  if (var7 != null) {
                    break L2;
                  } else {
                    var5 = 0;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (var7 != null) {
                ((al) this).field_r[var8] = var7;
                ((al) this).field_u[var8] = 0;
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

    public static void a(int param0) {
        field_y = null;
        field_A = null;
        if (param0 != -1216) {
            boolean discarded$0 = al.a(-62, (byte) -35);
        }
        field_s = null;
        field_x = null;
        field_o = null;
    }

    al(byte[] param0) {
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
        gl[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        gl var15 = null;
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
        gl var25_ref = null;
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
        ed var38 = null;
        byte[] var39 = null;
        gl var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        gl var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        gl var48 = null;
        gl var49 = null;
        gl var50 = null;
        gl var51 = null;
        gl var52 = null;
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
        ((al) this).field_u = new int[128];
        ((al) this).field_q = new byte[128];
        ((al) this).field_p = new byte[128];
        ((al) this).field_r = new ae[128];
        ((al) this).field_B = new byte[128];
        ((al) this).field_n = new short[128];
        ((al) this).field_v = new gl[128];
        var38 = new ed(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_p[var38.field_u - -var3] ^ -1)) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_u = var38.field_u + 1;
                var3++;
                var5 = var38.field_u;
                var38.field_u = var38.field_u + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_p[var38.field_u + var6] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var6++;
                        var38.field_u = var38.field_u + 1;
                        var8 = var38.field_u;
                        var38.field_u = var38.field_u + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_p[var38.field_u - -var9] == 0) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var38.field_u = var38.field_u + 1;
                                  var9++;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (1 < var9) {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.h(-11);
                                          if (var15_int == 0) {
                                            var12++;
                                            var13_int = var12;
                                            break L8;
                                          } else {
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
                                var13 = new gl[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.h(-11);
                                      if (var14 > 0) {
                                        stackOut_37_0 = new byte[var14 * 2];
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
                                      var14 = var38.h(-11);
                                      if ((var14 ^ -1) >= -1) {
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
                                      if (var38.field_p[var17 + var38.field_u] == 0) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_u = var38.field_u + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (128 <= var20) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
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
                                                          if (-129 >= var24) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if ((var25_int ^ -1) <= -129) {
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
                                                                        ((al) this).field_w = var38.h(-11) + 1;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var12 <= var27) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var70.length <= var27) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.g(108);
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
                                                                                  if (var27 >= var47.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.g(114);
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
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.h(-11);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((al) this).field_p[var30] = (byte)(var28 * ((al) this).field_p[var30] + 32 >> -1569099802);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = var28 * (-var27 + var30) - -((var30 - var27) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = lj.a(var32, false, -var27 + var30);
                                                                                                        ((al) this).field_p[var33] = (byte)(32 + ((al) this).field_p[var33] * var34 >> -1145891482);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((al) this).field_p[var29] = (byte)(((al) this).field_p[var29] * var28 - -32 >> -1232327770);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + (var19 + var38.h(-11));
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 != null) {
                                                                                        var19 = var38.h(-11);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << -1366637887;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var47.length) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        var27 = 0;
                                                                                                        L40: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L35;
                                                                                                          } else {
                                                                                                            var13[var27].field_n = var38.h(-11);
                                                                                                            var27++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L41: {
                                                                                                          var31 = var28 + (((al) this).field_B[var30] & 255);
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
                                                                                                        ((al) this).field_B[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << 1984192321;
                                                                                                    var32 = (var30 + -var27) / 2 + var28 * (-var27 + var30);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L43: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L44: {
                                                                                                          var34 = lj.a(var32, false, var30 + -var27);
                                                                                                          var35 = (255 & ((al) this).field_B[var37]) + var34;
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
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((al) this).field_B[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L43;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L46: {
                                                                                                  var30 = (((al) this).field_B[var29] & 255) - -var28;
                                                                                                  if (var30 >= 0) {
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
                                                                                                ((al) this).field_B[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + (1 - -var38.h(-11));
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
                                                                                            var13[var27].field_n = var38.h(-11);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L49: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        var27 = 0;
                                                                                        L50: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                  } else {
                                                                                                    var52 = var13[var27];
                                                                                                    if (0 < var52.field_c) {
                                                                                                      var52.field_d = var38.h(-11);
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
                                                                                                if ((var51.field_b ^ -1) < -1) {
                                                                                                  var51.field_c = var38.h(-11);
                                                                                                  var27++;
                                                                                                  continue L51;
                                                                                                } else {
                                                                                                  var27++;
                                                                                                  continue L51;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_b = var38.h(-11);
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L53: {
                                                                                          var50 = var13[var27];
                                                                                          if (null == var50.field_e) {
                                                                                            break L53;
                                                                                          } else {
                                                                                            var50.field_h = var38.h(-11);
                                                                                            break L53;
                                                                                          }
                                                                                        }
                                                                                        L54: {
                                                                                          if (null == var50.field_g) {
                                                                                            break L54;
                                                                                          } else {
                                                                                            var50.field_j = var38.h(-11);
                                                                                            break L54;
                                                                                          }
                                                                                        }
                                                                                        if (-1 > (var50.field_n ^ -1)) {
                                                                                          var50.field_f = var38.h(-11);
                                                                                          var27++;
                                                                                          continue L49;
                                                                                        } else {
                                                                                          var27++;
                                                                                          continue L49;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_e != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L55: while (true) {
                                                                                        if (var49.field_e.length > var29) {
                                                                                          var19 = var19 + 1 - -var38.h(-11);
                                                                                          var49.field_e[var29] = (byte)var19;
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
                                                                                if (var48.field_g != null) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L56: while (true) {
                                                                                    if (var29 < var48.field_g.length) {
                                                                                      var19 = var38.h(-11) + 1 + var19;
                                                                                      var48.field_g[var29] = (byte)var19;
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
                                                                              if (var45.field_e == null) {
                                                                                break L57;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L58: while (true) {
                                                                                  if (var45.field_e.length <= var29) {
                                                                                    break L57;
                                                                                  } else {
                                                                                    var45.field_e[var29] = var38.g(88);
                                                                                    var29 += 2;
                                                                                    continue L58;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var45.field_g != null) {
                                                                              var29 = 3;
                                                                              L59: while (true) {
                                                                                if (var29 < -2 + var45.field_g.length) {
                                                                                  var45.field_g[var29] = var38.g(98);
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
                                                                          if (var20 != 0) {
                                                                            break L60;
                                                                          } else {
                                                                            L61: {
                                                                              if (var66.length <= var21) {
                                                                                var20 = -1;
                                                                                break L61;
                                                                              } else {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L61;
                                                                              }
                                                                            }
                                                                            if (-1 <= (((al) this).field_u[var27] ^ -1)) {
                                                                              break L60;
                                                                            } else {
                                                                              var26 = var38.h(-11) - -1;
                                                                              break L60;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((al) this).field_p[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (-1 != (((al) this).field_u[var26] ^ -1)) {
                                                                      L62: {
                                                                        if (0 != var20) {
                                                                          break L62;
                                                                        } else {
                                                                          var25_ref = var13[var65[var21]];
                                                                          if (var69.length > var21) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L62;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L62;
                                                                          }
                                                                        }
                                                                      }
                                                                      var20--;
                                                                      ((al) this).field_v[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (((al) this).field_u[var25_int] != 0) {
                                                                  L63: {
                                                                    if (var20 != 0) {
                                                                      break L63;
                                                                    } else {
                                                                      L64: {
                                                                        if (var68.length > var21) {
                                                                          var21++;
                                                                          var20 = var7[var21];
                                                                          break L64;
                                                                        } else {
                                                                          var20 = -1;
                                                                          break L64;
                                                                        }
                                                                      }
                                                                      var8++;
                                                                      var24 = var38.field_p[var8] + 16 << -263835198;
                                                                      break L63;
                                                                    }
                                                                  }
                                                                  ((al) this).field_B[var25_int] = (byte)var24;
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
                                                            if (((al) this).field_u[var24] != 0) {
                                                              L65: {
                                                                if (-1 != var20) {
                                                                  break L65;
                                                                } else {
                                                                  L66: {
                                                                    if (var67.length <= var21) {
                                                                      var20 = -1;
                                                                      break L66;
                                                                    } else {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L66;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = -1 + var38.field_p[var5];
                                                                  break L65;
                                                                }
                                                              }
                                                              ((al) this).field_q[var24] = (byte)var23;
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
                                                        L67: {
                                                          if (var20 != 0) {
                                                            break L67;
                                                          } else {
                                                            L68: {
                                                              if (var21 < var66.length) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L68;
                                                              } else {
                                                                var20 = -1;
                                                                break L68;
                                                              }
                                                            }
                                                            var22 = var38.a(false);
                                                            break L67;
                                                          }
                                                        }
                                                        ((al) this).field_n[var23] = (short)(((al) this).field_n[var23] + (b.a(2, -1 + var22) << -38238642));
                                                        var20--;
                                                        ((al) this).field_u[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.h(-11);
                                                    ((al) this).field_n[var20] = (short)(((al) this).field_n[var20] + (var19 << -420243032));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.h(-11);
                                                ((al) this).field_n[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.g(87);
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
                                    L69: {
                                      var13[var14] = new gl();
                                      var40 = new gl();
                                      var15 = var40;
                                      var16_int = var38.h(-11);
                                      if ((var16_int ^ -1) >= -1) {
                                        break L69;
                                      } else {
                                        var15.field_e = new byte[var16_int * 2];
                                        break L69;
                                      }
                                    }
                                    var16_int = var38.h(-11);
                                    if ((var16_int ^ -1) < -1) {
                                      var15.field_g = new byte[2 + var16_int * 2];
                                      var40.field_g[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.g(125);
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
                        var7[var8] = var38.g(89);
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
                var4[var5] = var38.g(101);
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
        int var0 = Math.max(2, 3);
        field_A = new String[12 * var0];
        field_x = new int[12 * var0];
        field_o = new int[12 * var0];
    }
}
