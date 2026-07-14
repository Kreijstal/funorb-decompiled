/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends tc {
    static int field_n;
    static String field_u;
    static int field_t;
    int field_s;
    static boolean field_w;
    static String field_p;
    static wk field_z;
    byte[] field_x;
    short[] field_r;
    private int[] field_q;
    fq[] field_v;
    static String field_o;
    byte[] field_l;
    byte[] field_k;
    static wk[] field_m;
    sn[] field_y;

    final static void a(wp param0, byte param1) {
        ft.field_q = param0;
        if (param1 != -34) {
            field_m = null;
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_z = null;
        field_o = null;
        field_m = null;
        if (param0 != 52) {
            return;
        }
        field_u = null;
    }

    final void a(int param0) {
        if (param0 <= 117) {
            ((io) this).field_q = null;
        }
        ((io) this).field_q = null;
    }

    final static boolean a(int[] param0, byte param1) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 <= 106) {
            Object var4 = null;
            boolean discarded$0 = io.a((int[]) null, (byte) -31);
        }
        for (var2 = 0; -9 < (var2 ^ -1); var2++) {
            if (param0[var2] != 0) {
                return true;
            }
        }
        return false;
    }

    final boolean a(int param0, byte[] param1, int[] param2, p param3) {
        int var5 = 0;
        int var6 = 0;
        sn var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          var5 = 1;
          var6 = 0;
          var7 = null;
          if (param0 == 11008) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if (-129 >= (var8 ^ -1)) {
            return var5 != 0;
          } else {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1[var8] != -1) {
                  break L2;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
            var9 = ((io) this).field_q[var8];
            if (-1 != var9) {
              L3: {
                if (var6 == var9) {
                  break L3;
                } else {
                  L4: {
                    var6 = var9;
                    var9--;
                    if ((1 & var9) != 0) {
                      var7 = param3.a(param2, 36, var9 >> -634626462);
                      break L4;
                    } else {
                      var7 = param3.a(true, param2, var9 >> -1323980030);
                      break L4;
                    }
                  }
                  if (var7 != null) {
                    break L3;
                  } else {
                    var5 = 0;
                    break L3;
                  }
                }
              }
              if (var7 != null) {
                ((io) this).field_y[var8] = var7;
                ((io) this).field_q[var8] = 0;
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

    io(byte[] param0) {
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
        fq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        fq var15 = null;
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
        fq var25_ref = null;
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
        vh var38 = null;
        byte[] var39 = null;
        fq var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        fq var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        fq var48 = null;
        fq var49 = null;
        fq var50 = null;
        fq var51 = null;
        fq var52 = null;
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
        Object stackOut_37_0 = null;
        byte[] stackOut_36_0 = null;
        byte[] stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        ((io) this).field_x = new byte[128];
        ((io) this).field_y = new sn[128];
        ((io) this).field_k = new byte[128];
        ((io) this).field_r = new short[128];
        ((io) this).field_q = new int[128];
        ((io) this).field_v = new fq[128];
        ((io) this).field_l = new byte[128];
        var38 = new vh(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_o[var3 + var38.field_q] ^ -1)) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var3++;
                var38.field_q = var38.field_q + 1;
                var5 = var38.field_q;
                var38.field_q = var38.field_q + var3;
                var6 = 0;
                L2: while (true) {
                  if (-1 == (var38.field_o[var6 + var38.field_q] ^ -1)) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var6++;
                        var38.field_q = var38.field_q + 1;
                        var8 = var38.field_q;
                        var38.field_q = var38.field_q + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (-1 == (var38.field_o[var9 + var38.field_q] ^ -1)) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var9++;
                                  var38.field_q = var38.field_q + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if ((var9 ^ -1) < -2) {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.k(0);
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
                                var13 = new fq[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.k(0);
                                      if (-1 <= (var14 ^ -1)) {
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = new byte[2 * var14];
                                        stackIn_38_0 = stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var46 = (byte[]) (Object) stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.k(0);
                                      if (0 < var14) {
                                        stackOut_40_0 = new byte[var14 * 2];
                                        stackIn_41_0 = stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var70 = (byte[]) (Object) stackIn_41_0;
                                    var64 = var70;
                                    var58 = var64;
                                    var47 = var58;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (0 == var38.field_o[var38.field_q + var17]) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var17++;
                                            var38.field_q = var38.field_q + 1;
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
                                                      if ((var23 ^ -1) <= -129) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (-129 >= var25_int) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if ((var26 ^ -1) <= -129) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((io) this).field_s = var38.k(0) - -1;
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
                                                                                    var15_array[var27] = var38.a((byte) 111);
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
                                                                                  if (var70.length <= var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.a((byte) 116);
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
                                                                                        var19 = var38.k(0);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var46.length) {
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
                                                                                                      if (var30 >= 128) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((io) this).field_l[var30] = (byte)(32 + ((io) this).field_l[var30] * var28 >> -53581754);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = (-var27 + var30) * var28 - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = os.a(-var27 + var30, var32, 1589591487);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((io) this).field_l[var33] = (byte)(32 + var34 * ((io) this).field_l[var33] >> -40104826);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((io) this).field_l[var29] = (byte)(32 + var28 * ((io) this).field_l[var29] >> 1958956870);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + 1 - -var38.k(0);
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
                                                                                        var19 = var38.k(0);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var70.length <= var27) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1] << 620094721;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var70.length) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (((io) this).field_x[var30] & 255);
                                                                                                          if ((var31 ^ -1) <= -1) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (var31 <= 128) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((io) this).field_x[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var16[var29 - -1] << -902000799;
                                                                                                    var32 = (-var27 + var30) / 2 + var28 * (-var27 + var30);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var37 >= var30) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = os.a(-var27 + var30, var32, 1589591487);
                                                                                                          var35 = var34 + (255 & ((io) this).field_x[var37]);
                                                                                                          if (-1 >= (var35 ^ -1)) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (128 >= var35) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        ((io) this).field_x[var37] = (byte)var35;
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (255 & ((io) this).field_x[var29]);
                                                                                                  if (var30 >= 0) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if ((var30 ^ -1) >= -129) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((io) this).field_x[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + 1 - -var38.k(0);
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
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (var52.field_j > 0) {
                                                                                                          var52.field_e = var38.k(0);
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
                                                                                                    if (-1 > (var51.field_b ^ -1)) {
                                                                                                      var51.field_j = var38.k(0);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_b = var38.k(0);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_l == null) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_m = var38.k(0);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_g) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_c = var38.k(0);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (0 < var50.field_d) {
                                                                                              var50.field_i = var38.k(0);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_d = var38.k(0);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (null != var49.field_l) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_l.length) {
                                                                                          var19 = var38.k(0) + (1 + var19);
                                                                                          var49.field_l[var29] = (byte)var19;
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
                                                                                if (null != var48.field_g) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var29 < var48.field_g.length) {
                                                                                      var19 = 1 + var19 + var38.k(0);
                                                                                      var48.field_g[var29] = (byte)var19;
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
                                                                              if (null == var45.field_l) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var29 >= var45.field_l.length) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_l[var29] = var38.a((byte) -89);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_g) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var29 < var45.field_g.length - 2) {
                                                                                  var45.field_g[var29] = var38.a((byte) 103);
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
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L59;
                                                                          } else {
                                                                            L60: {
                                                                              if (var21 >= var66.length) {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              } else {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (-1 <= (((io) this).field_q[var27] ^ -1)) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.k(0) - -1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((io) this).field_l[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (0 != ((io) this).field_q[var26]) {
                                                                      L61: {
                                                                        if (var20 != 0) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var65[var21]];
                                                                          if (var21 < var69.length) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      ((io) this).field_v[var26] = var25_ref;
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
                                                                if (-1 != ((io) this).field_q[var25_int]) {
                                                                  L62: {
                                                                    if (var20 != 0) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = 16 + var38.field_o[var8] << 1530818946;
                                                                      if (var68.length > var21) {
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
                                                                  ((io) this).field_x[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (((io) this).field_q[var24] != 0) {
                                                              L63: {
                                                                if (-1 != (var20 ^ -1)) {
                                                                  break L63;
                                                                } else {
                                                                  var5++;
                                                                  var23 = -1 + var38.field_o[var5];
                                                                  if (var21 >= var67.length) {
                                                                    var20 = -1;
                                                                    break L63;
                                                                  } else {
                                                                    var21++;
                                                                    var20 = var4[var21];
                                                                    break L63;
                                                                  }
                                                                }
                                                              }
                                                              var20--;
                                                              ((io) this).field_k[var24] = (byte)var23;
                                                              var24++;
                                                              continue L18;
                                                            } else {
                                                              var24++;
                                                              continue L18;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L64: {
                                                          if (0 != var20) {
                                                            break L64;
                                                          } else {
                                                            L65: {
                                                              if (var66.length <= var21) {
                                                                var20 = -1;
                                                                break L65;
                                                              } else {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L65;
                                                              }
                                                            }
                                                            var22 = var38.h(110);
                                                            break L64;
                                                          }
                                                        }
                                                        ((io) this).field_r[var23] = (short)(((io) this).field_r[var23] + (rn.a(-1 + var22, 2) << 1552347598));
                                                        ((io) this).field_q[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.k(0);
                                                    ((io) this).field_r[var20] = (short)(((io) this).field_r[var20] + (var19 << 815836392));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.k(0);
                                                ((io) this).field_r[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.a((byte) -53);
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
                                    L66: {
                                      var13[var14] = new fq();
                                      var40 = new fq();
                                      var15 = var40;
                                      var16_int = var38.k(0);
                                      if ((var16_int ^ -1) >= -1) {
                                        break L66;
                                      } else {
                                        var15.field_l = new byte[2 * var16_int];
                                        break L66;
                                      }
                                    }
                                    var16_int = var38.k(0);
                                    if (0 < var16_int) {
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
                                var10[var11_int] = var38.a((byte) -113);
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
                        var7[var8] = var38.a((byte) -120);
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
                var4[var5] = var38.a((byte) 8);
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
        field_u = "This <%0> is currently carrying the <%2>. Are you sure you wish to replace it with the <%1>? The <%2> will be lost forever if you do this.";
        field_p = "Open";
        field_o = "Play Campaign";
    }
}
