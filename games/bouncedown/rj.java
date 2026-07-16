/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends ai {
    static String field_h;
    private int[] field_p;
    int field_m;
    short[] field_n;
    ch[] field_l;
    byte[] field_o;
    byte[] field_i;
    ue[] field_k;
    static uf field_q;
    byte[] field_r;
    static int field_g;
    static int field_j;

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = Bounce.field_N;
        qk.c();
        kk.field_s = 11;
        if (param0 != 255) {
            field_g = 35;
        }
        jl.field_b = new int[260];
        for (var1 = 0; var1 < 256; var1++) {
            var2 = 15.0;
            jl.field_b[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
        }
        int var5 = 256;
        var1 = var5;
        while (jl.field_b.length > var5) {
            jl.field_b[var5] = 255;
            var5++;
        }
    }

    public static void d(int param0) {
        field_q = null;
        field_h = null;
        if (param0 != 0) {
            field_h = null;
        }
    }

    final boolean a(byte param0, byte[] param1, int[] param2, i param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Bounce.field_N;
        if (param0 >= 84) {
          var5 = 1;
          var6 = 0;
          var7 = null;
          var8 = 0;
          L0: while (true) {
            if (128 <= var8) {
              return var5 != 0;
            } else {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (-1 != (param1[var8] ^ -1)) {
                    break L1;
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              }
              var9 = ((rj) this).field_p[var8];
              if (var9 != 0) {
                L2: {
                  if (var9 != var6) {
                    L3: {
                      var6 = var9;
                      var9--;
                      if ((1 & var9) != 0) {
                        var7 = (Object) (Object) param3.a(param2, 0, var9 >> 1116621186);
                        break L3;
                      } else {
                        var7 = (Object) (Object) param3.a(25910, var9 >> 1388745410, param2);
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
                  ((rj) this).field_k[var8] = (ue) var7;
                  ((rj) this).field_p[var8] = 0;
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
        } else {
          return true;
        }
    }

    final void e(int param0) {
        if (param0 <= 114) {
            ((rj) this).field_m = -40;
        }
        ((rj) this).field_p = null;
    }

    rj(byte[] param0) {
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
        ch[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        ch var15 = null;
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
        wi var38 = null;
        byte[] var39 = null;
        ch var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        ch var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        ch var48 = null;
        ch var49 = null;
        ch var50 = null;
        ch var51 = null;
        ch var52 = null;
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
        ((rj) this).field_o = new byte[128];
        ((rj) this).field_r = new byte[128];
        ((rj) this).field_n = new short[128];
        ((rj) this).field_p = new int[128];
        ((rj) this).field_k = new ue[128];
        ((rj) this).field_l = new ch[128];
        ((rj) this).field_i = new byte[128];
        var38 = new wi(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_i[var3 + var38.field_h] ^ -1)) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var38.field_h = var38.field_h + 1;
                var3++;
                var5 = var38.field_h;
                var38.field_h = var38.field_h + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_i[var6 + var38.field_h] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var38.field_h = var38.field_h + 1;
                        var6++;
                        var8 = var38.field_h;
                        var38.field_h = var38.field_h + var6;
                        var9 = 0;
                        L4: while (true) {
                          if ((var38.field_i[var9 + var38.field_h] ^ -1) == -1) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if ((var11_int ^ -1) <= (var9 ^ -1)) {
                                L6: {
                                  var38.field_h = var38.field_h + 1;
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
                                          var15_int = var38.d((byte) -120);
                                          if (var15_int != 0) {
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
                                  } else {
                                    var12 = var9;
                                    break L6;
                                  }
                                }
                                var13 = new ch[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.d((byte) -81);
                                      if ((var14 ^ -1) < -1) {
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
                                      var14 = var38.d((byte) -100);
                                      if ((var14 ^ -1) >= -1) {
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
                                      if ((var38.field_i[var38.field_h + var17] ^ -1) == -1) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var17++;
                                            var38.field_h = var38.field_h + 1;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (128 <= var20) {
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
                                                          if (-129 >= (var24 ^ -1)) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (var25_int >= 128) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var26 ^ -1)) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var27) {
                                                                        ((rj) this).field_m = 1 + var38.d((byte) -95);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var70.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.k(124);
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
                                                                                    var16[var27] = var38.k(73);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.d((byte) -100);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if ((var70.length ^ -1) >= (var29 ^ -1)) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((rj) this).field_o[var30] = (byte)(((rj) this).field_o[var30] * var28 - -32 >> 991980614);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = var28 * (var30 - var27) - -((var30 - var27) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = mf.a(0, var30 + -var27, var32);
                                                                                                        ((rj) this).field_o[var33] = (byte)(32 + ((rj) this).field_o[var33] * var34 >> 179045414);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((rj) this).field_o[var29] = (byte)(32 + var28 * ((rj) this).field_o[var29] >> 1711120422);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + 1 + var38.d((byte) -110);
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 != null) {
                                                                                        var19 = var38.d((byte) -120);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 588346721;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if ((var27 ^ -1) >= (var29 ^ -1)) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if ((var29 ^ -1) <= (var47.length ^ -1)) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var27 = 0;
                                                                                                        L40: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L35;
                                                                                                          } else {
                                                                                                            var13[var27].field_k = var38.d((byte) -106);
                                                                                                            var27++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L41: {
                                                                                                          var31 = var28 + (255 & ((rj) this).field_r[var30]);
                                                                                                          if (-1 >= (var31 ^ -1)) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        L42: {
                                                                                                          if (var31 <= 128) {
                                                                                                            break L42;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L42;
                                                                                                          }
                                                                                                        }
                                                                                                        ((rj) this).field_r[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << -1687688511;
                                                                                                    var32 = (var30 + -var27) * var28 + (-var27 + var30) / 2;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L43: while (true) {
                                                                                                      if ((var37 ^ -1) <= (var30 ^ -1)) {
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L44: {
                                                                                                          var34 = mf.a(0, var30 + -var27, var32);
                                                                                                          var35 = var34 + (((rj) this).field_r[var37] & 255);
                                                                                                          if (0 <= var35) {
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
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((rj) this).field_r[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L43;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L46: {
                                                                                                  var30 = (((rj) this).field_r[var29] & 255) - -var28;
                                                                                                  if (var30 >= 0) {
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
                                                                                                ((rj) this).field_r[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.d((byte) -90) + 1 + var19;
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
                                                                                            var13[var27].field_k = var38.d((byte) -106);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L49: while (true) {
                                                                                      if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                                        var27 = 0;
                                                                                        L50: while (true) {
                                                                                          if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    return;
                                                                                                  } else {
                                                                                                    L53: {
                                                                                                      var52 = var13[var27];
                                                                                                      if (0 >= var52.field_f) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var52.field_d = var38.d((byte) -127);
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
                                                                                                  if ((var51.field_c ^ -1) >= -1) {
                                                                                                    break L54;
                                                                                                  } else {
                                                                                                    var51.field_f = var38.d((byte) -99);
                                                                                                    break L54;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L51;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_c = var38.d((byte) -121);
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L55: {
                                                                                          var50 = var13[var27];
                                                                                          if (var50.field_e == null) {
                                                                                            break L55;
                                                                                          } else {
                                                                                            var50.field_l = var38.d((byte) -104);
                                                                                            break L55;
                                                                                          }
                                                                                        }
                                                                                        L56: {
                                                                                          if (null == var50.field_i) {
                                                                                            break L56;
                                                                                          } else {
                                                                                            var50.field_b = var38.d((byte) -78);
                                                                                            break L56;
                                                                                          }
                                                                                        }
                                                                                        L57: {
                                                                                          if (0 >= var50.field_k) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var50.field_g = var38.d((byte) -95);
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
                                                                                      if (null == var49.field_e) {
                                                                                        break L58;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L59: while (true) {
                                                                                          if ((var49.field_e.length ^ -1) >= (var29 ^ -1)) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = var38.d((byte) -69) + var19 - -1;
                                                                                            var49.field_e[var29] = (byte)var19;
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
                                                                                  if (null == var48.field_i) {
                                                                                    break L60;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L61: while (true) {
                                                                                      if ((var29 ^ -1) <= (var48.field_i.length ^ -1)) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = var19 - -1 - -var38.d((byte) -115);
                                                                                        var48.field_i[var29] = (byte)var19;
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
                                                                              if (var45.field_e == null) {
                                                                                break L62;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L63: while (true) {
                                                                                  if ((var45.field_e.length ^ -1) >= (var29 ^ -1)) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var45.field_e[var29] = var38.k(-84);
                                                                                    var29 += 2;
                                                                                    continue L63;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L64: {
                                                                              if (var45.field_i == null) {
                                                                                break L64;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L65: while (true) {
                                                                                  if ((var45.field_i.length - 2 ^ -1) >= (var29 ^ -1)) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var45.field_i[var29] = var38.k(51);
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
                                                                          if ((var20 ^ -1) != -1) {
                                                                            break L66;
                                                                          } else {
                                                                            L67: {
                                                                              if ((var66.length ^ -1) >= (var21 ^ -1)) {
                                                                                var20 = -1;
                                                                                break L67;
                                                                              } else {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L67;
                                                                              }
                                                                            }
                                                                            if (-1 <= (((rj) this).field_p[var27] ^ -1)) {
                                                                              break L66;
                                                                            } else {
                                                                              var26 = var38.d((byte) -87) + 1;
                                                                              break L66;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((rj) this).field_o[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L68: {
                                                                      if (0 == ((rj) this).field_p[var26]) {
                                                                        break L68;
                                                                      } else {
                                                                        L69: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L69;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var65[var21]];
                                                                            if ((var21 ^ -1) > (var69.length ^ -1)) {
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
                                                                        var20--;
                                                                        ((rj) this).field_l[var26] = (ch) var25;
                                                                        break L68;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L70: {
                                                                  if (((rj) this).field_p[var25_int] == 0) {
                                                                    break L70;
                                                                  } else {
                                                                    L71: {
                                                                      if (var20 != 0) {
                                                                        break L71;
                                                                      } else {
                                                                        int incrementValue$12 = var8;
                                                                        var8++;
                                                                        var24 = var38.field_i[incrementValue$12] + 16 << -2004360766;
                                                                        if ((var68.length ^ -1) >= (var21 ^ -1)) {
                                                                          var20 = -1;
                                                                          break L71;
                                                                        } else {
                                                                          int incrementValue$13 = var21;
                                                                          var21++;
                                                                          var20 = var7[incrementValue$13];
                                                                          break L71;
                                                                        }
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((rj) this).field_r[var25_int] = (byte)var24;
                                                                    break L70;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L72: {
                                                              if (-1 == (((rj) this).field_p[var24] ^ -1)) {
                                                                break L72;
                                                              } else {
                                                                L73: {
                                                                  if (0 != var20) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (var21 < var67.length) {
                                                                        int incrementValue$14 = var21;
                                                                        var21++;
                                                                        var20 = var4[incrementValue$14];
                                                                        break L74;
                                                                      } else {
                                                                        var20 = -1;
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    int incrementValue$15 = var5;
                                                                    var5++;
                                                                    var23 = -1 + var38.field_i[incrementValue$15];
                                                                    break L73;
                                                                  }
                                                                }
                                                                ((rj) this).field_i[var24] = (byte)var23;
                                                                var20--;
                                                                break L72;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L75: {
                                                          if (0 != var20) {
                                                            break L75;
                                                          } else {
                                                            L76: {
                                                              if (var21 < var66.length) {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L76;
                                                              } else {
                                                                var20 = -1;
                                                                break L76;
                                                              }
                                                            }
                                                            var22 = var38.d(-10937);
                                                            break L75;
                                                          }
                                                        }
                                                        ((rj) this).field_n[var23] = (short)(((rj) this).field_n[var23] + (da.b(-1 + var22, 2) << -448011410));
                                                        ((rj) this).field_p[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.d((byte) -90);
                                                    ((rj) this).field_n[var20] = (short)(((rj) this).field_n[var20] + (var19 << -1030815928));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.d((byte) -99);
                                                ((rj) this).field_n[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.k(-53);
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
                                      ch dupTemp$17 = new ch();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.d((byte) -65);
                                      if (var16_int <= 0) {
                                        break L77;
                                      } else {
                                        var15.field_e = new byte[var16_int * 2];
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      var16_int = var38.d((byte) -102);
                                      if ((var16_int ^ -1) >= -1) {
                                        break L78;
                                      } else {
                                        var15.field_i = new byte[2 + 2 * var16_int];
                                        var40.field_i[1] = (byte)64;
                                        break L78;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.k(-63);
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
                        var7[var8] = var38.k(-84);
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
                var4[var5] = var38.k(-90);
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
        field_h = "Age:";
        field_q = new uf();
        field_g = 0;
        field_j = -1;
    }
}
