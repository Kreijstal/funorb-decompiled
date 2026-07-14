/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends kd {
    ke[] field_l;
    private int[] field_i;
    static hk field_j;
    byte[] field_n;
    static be field_s;
    byte[] field_q;
    rc[] field_h;
    int field_m;
    static int field_o;
    short[] field_k;
    static String field_p;
    byte[] field_r;

    final void a(int param0) {
        if (param0 >= -81) {
            return;
        }
        ((wj) this).field_i = null;
    }

    final boolean a(byte[] param0, ja param1, byte param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        ke var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Lexicominos.field_L ? 1 : 0;
        var5 = 1;
        var6 = 0;
        var7 = null;
        var8 = 0;
        L0: while (true) {
          if (128 <= var8) {
            L1: {
              if (param2 >= 76) {
                break L1;
              } else {
                wj.c(true);
                break L1;
              }
            }
            return var5 != 0;
          } else {
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0[var8] != 0) {
                  break L2;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
            var9 = ((wj) this).field_i[var8];
            if (var9 != 0) {
              L3: {
                if (var9 == var6) {
                  break L3;
                } else {
                  L4: {
                    var6 = var9;
                    var9--;
                    if ((1 & var9) == 0) {
                      var7 = param1.a(-1, param3, var9 >> -1827134814);
                      break L4;
                    } else {
                      var7 = param1.a(var9 >> 1047490754, param3, true);
                      break L4;
                    }
                  }
                  if (var7 == null) {
                    var5 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (var7 != null) {
                ((wj) this).field_l[var8] = var7;
                ((wj) this).field_i[var8] = 0;
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

    public static void c(boolean param0) {
        field_p = null;
        field_j = null;
        if (param0) {
            int[] discarded$0 = wj.b(-51);
        }
        field_s = null;
    }

    final static int[] b(int param0) {
        if (param0 != 26770) {
            wj.c(true);
        }
        return new int[8];
    }

    final static void c(int param0) {
        gb.field_d = false;
        ca.field_k = false;
        ni.a(param0 ^ -6357, -1);
        ee.field_c = c.field_m;
        bk.field_c = c.field_m;
        if (param0 != -6399) {
            field_p = null;
        }
    }

    wj(byte[] param0) {
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
        rc[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        rc var15 = null;
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
        rc var25_ref = null;
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
        wf var38 = null;
        byte[] var39 = null;
        rc var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        rc var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        rc var48 = null;
        rc var49 = null;
        rc var50 = null;
        rc var51 = null;
        rc var52 = null;
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
        ((wj) this).field_l = new ke[128];
        ((wj) this).field_h = new rc[128];
        ((wj) this).field_q = new byte[128];
        ((wj) this).field_n = new byte[128];
        ((wj) this).field_i = new int[128];
        ((wj) this).field_r = new byte[128];
        ((wj) this).field_k = new short[128];
        var38 = new wf(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_j[var3 + var38.field_h]) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_h = var38.field_h + 1;
                var5 = var38.field_h;
                var38.field_h = var38.field_h + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_j[var38.field_h + var6] == 0) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var6++;
                        var38.field_h = var38.field_h + 1;
                        var8 = var38.field_h;
                        var38.field_h = var38.field_h + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_j[var9 + var38.field_h] == 0) {
                            var67 = new byte[var9];
                            var62 = var67;
                            var57 = var62;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var9++;
                                  var38.field_h = var38.field_h + 1;
                                  var63 = new byte[var9];
                                  var58 = var63;
                                  var53 = var58;
                                  var39 = var53;
                                  var11 = var39;
                                  if ((var9 ^ -1) >= -2) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var63[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.d(true);
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
                                  }
                                }
                                var13 = new rc[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.d(true);
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
                                      var46 = stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.d(true);
                                      if (var14 <= 0) {
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
                                      if (-1 == (var38.field_j[var17 + var38.field_h] ^ -1)) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var17++;
                                            var38.field_h = var38.field_h + 1;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if ((var20 ^ -1) <= -129) {
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
                                                          if (-129 >= (var24 ^ -1)) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if ((var25_int ^ -1) <= -129) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if ((var26 ^ -1) <= -129) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((wj) this).field_m = var38.d(true) - -1;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var12 <= var27) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var46.length <= var27) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.e(true);
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
                                                                                    var16[var27] = var38.e(true);
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
                                                                                        var19 = var38.d(true);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var46.length <= var27) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var46.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((wj) this).field_n[var30] = (byte)(var28 * ((wj) this).field_n[var30] + 32 >> 1870569894);
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
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = rl.b(-var27 + var30, var32, 25668);
                                                                                                        ((wj) this).field_n[var33] = (byte)(var34 * ((wj) this).field_n[var33] - -32 >> 2044572166);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((wj) this).field_n[var29] = (byte)(var28 * ((wj) this).field_n[var29] - -32 >> -158679418);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.d(true) + var19 + 1;
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 != null) {
                                                                                        var19 = var38.d(true);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var47.length <= var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 1733682753;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var47.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var27 = 0;
                                                                                                        L40: while (true) {
                                                                                                          if (var27 >= var12) {
                                                                                                            break L35;
                                                                                                          } else {
                                                                                                            var13[var27].field_e = var38.d(true);
                                                                                                            var27++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L41: {
                                                                                                          var31 = var28 + (255 & ((wj) this).field_q[var30]);
                                                                                                          if (0 <= var31) {
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
                                                                                                        ((wj) this).field_q[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 - -1] << -1816063903;
                                                                                                    var32 = (var30 - var27) / 2 + (var30 - var27) * var28;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L43: while (true) {
                                                                                                      if (var37 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L44: {
                                                                                                          var34 = rl.b(var30 + -var27, var32, 25668);
                                                                                                          var35 = (255 & ((wj) this).field_q[var37]) - -var34;
                                                                                                          if (var35 >= 0) {
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
                                                                                                        ((wj) this).field_q[var37] = (byte)var35;
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var37++;
                                                                                                        continue L43;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L46: {
                                                                                                  var30 = (((wj) this).field_q[var29] & 255) + var28;
                                                                                                  if (-1 >= var30) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                L47: {
                                                                                                  if (-129 >= var30) {
                                                                                                    break L47;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L47;
                                                                                                  }
                                                                                                }
                                                                                                ((wj) this).field_q[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.d(true) + var19 - -1;
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            break L35;
                                                                                          } else {
                                                                                            var13[var27].field_e = var38.d(true);
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
                                                                                                    if (-1 > (var52.field_k ^ -1)) {
                                                                                                      var52.field_h = var38.d(true);
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
                                                                                                if (0 < var51.field_d) {
                                                                                                  var51.field_k = var38.d(true);
                                                                                                  var27++;
                                                                                                  continue L51;
                                                                                                } else {
                                                                                                  var27++;
                                                                                                  continue L51;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_d = var38.d(true);
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L53: {
                                                                                          var50 = var13[var27];
                                                                                          if (var50.field_c == null) {
                                                                                            break L53;
                                                                                          } else {
                                                                                            var50.field_j = var38.d(true);
                                                                                            break L53;
                                                                                          }
                                                                                        }
                                                                                        L54: {
                                                                                          if (null == var50.field_g) {
                                                                                            break L54;
                                                                                          } else {
                                                                                            var50.field_l = var38.d(true);
                                                                                            break L54;
                                                                                          }
                                                                                        }
                                                                                        if (-1 > (var50.field_e ^ -1)) {
                                                                                          var50.field_b = var38.d(true);
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
                                                                                    if (var49.field_c != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L55: while (true) {
                                                                                        if (var49.field_c.length > var29) {
                                                                                          var19 = var38.d(true) + 1 + var19;
                                                                                          var49.field_c[var29] = (byte)var19;
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
                                                                                    if (var48.field_g.length > var29) {
                                                                                      var19 = 1 + var19 + var38.d(true);
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
                                                                              if (null == var45.field_c) {
                                                                                break L57;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L58: while (true) {
                                                                                  if (var29 >= var45.field_c.length) {
                                                                                    break L57;
                                                                                  } else {
                                                                                    var45.field_c[var29] = var38.e(true);
                                                                                    var29 += 2;
                                                                                    continue L58;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var45.field_g != null) {
                                                                              var29 = 3;
                                                                              L59: while (true) {
                                                                                if (var29 < var45.field_g.length - 2) {
                                                                                  var45.field_g[var29] = var38.e(true);
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
                                                                              if (var21 >= var64.length) {
                                                                                var20 = -1;
                                                                                break L61;
                                                                              } else {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L61;
                                                                              }
                                                                            }
                                                                            if (((wj) this).field_i[var27] <= 0) {
                                                                              break L60;
                                                                            } else {
                                                                              var26 = var38.d(true) + 1;
                                                                              break L60;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((wj) this).field_n[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((wj) this).field_i[var26] != 0) {
                                                                      L62: {
                                                                        if (0 != var20) {
                                                                          break L62;
                                                                        } else {
                                                                          var25_ref = var13[var63[var21]];
                                                                          if (var21 < var67.length) {
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
                                                                      ((wj) this).field_h[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (0 != ((wj) this).field_i[var25_int]) {
                                                                  L63: {
                                                                    if (var20 != 0) {
                                                                      break L63;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = var38.field_j[var8] - -16 << -1072087262;
                                                                      if (var66.length <= var21) {
                                                                        var20 = -1;
                                                                        break L63;
                                                                      } else {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L63;
                                                                      }
                                                                    }
                                                                  }
                                                                  ((wj) this).field_q[var25_int] = (byte)var24;
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
                                                            if (((wj) this).field_i[var24] != 0) {
                                                              L64: {
                                                                if (var20 != 0) {
                                                                  break L64;
                                                                } else {
                                                                  var5++;
                                                                  var23 = -1 + var38.field_j[var5];
                                                                  if (var21 >= var65.length) {
                                                                    var20 = -1;
                                                                    break L64;
                                                                  } else {
                                                                    var21++;
                                                                    var20 = var4[var21];
                                                                    break L64;
                                                                  }
                                                                }
                                                              }
                                                              ((wj) this).field_r[var24] = (byte)var23;
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
                                                              if (var64.length > var21) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L66;
                                                              } else {
                                                                var20 = -1;
                                                                break L66;
                                                              }
                                                            }
                                                            var22 = var38.g((byte) -99);
                                                            break L65;
                                                          }
                                                        }
                                                        ((wj) this).field_k[var23] = (short)(((wj) this).field_k[var23] + vg.a(32768, -1 + var22 << -658371602));
                                                        var20--;
                                                        ((wj) this).field_i[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.d(true);
                                                    ((wj) this).field_k[var20] = (short)(((wj) this).field_k[var20] + (var19 << 1631847880));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.d(true);
                                                ((wj) this).field_k[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.e(true);
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
                                      var13[var14] = new rc();
                                      var40 = new rc();
                                      var15 = var40;
                                      var16_int = var38.d(true);
                                      if (var16_int <= 0) {
                                        break L67;
                                      } else {
                                        var15.field_c = new byte[var16_int * 2];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.d(true);
                                    if ((var16_int ^ -1) < -1) {
                                      var15.field_g = new byte[var16_int * 2 + 2];
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
                                var10[var11_int] = var38.e(true);
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
                        var7[var8] = var38.e(true);
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
                var4[var5] = var38.e(true);
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
        field_o = 500;
    }
}
