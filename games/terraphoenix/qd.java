/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends uf {
    static int field_l;
    static String field_j;
    static String[] field_h;
    short[] field_p;
    gm[] field_q;
    byte[] field_m;
    gg[] field_n;
    int field_k;
    byte[] field_r;
    static volatile int field_i;
    private int[] field_o;
    byte[] field_s;

    final void d(byte param0) {
        ((qd) this).field_o = null;
        if (param0 <= 35) {
            Object var3 = null;
            qd.a(-83, 2, (vi) null);
        }
    }

    final static void a(int param0, int param1, vi param2) {
        uc var5 = di.field_l;
        var5.k(-17410, param0);
        var5.field_k = var5.field_k + 1;
        int var4 = var5.field_k;
        var5.i(1, -95);
        var5.i(param2.field_l, -110);
        var5.a((byte) -107, param2.field_s);
        var5.e(param2.field_i, param1 ^ -15940);
        var5.e(param2.field_m, 8959);
        var5.e(param2.field_r, 8959);
        var5.e(param2.field_k, param1 ^ -15940);
        if (param1 != -7357) {
            qd.a((byte) -69, -70);
        }
        int discarded$0 = var5.d(var4, 8600);
        var5.j(var5.field_k + -var4, -119);
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 < 93) {
            return;
        }
        field_j = null;
    }

    final static void a(byte param0, int param1) {
        if (param0 <= 15) {
            return;
        }
        if (!(eh.field_g[param1] == null)) {
            gb.field_E.a(eh.field_g[param1], 100, ua.field_e * pe.field_f[param1] / 128);
        }
    }

    final boolean a(byte[] param0, int[] param1, int param2, da param3) {
        int var5 = 0;
        int var6 = 0;
        gg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Terraphoenix.field_V;
        var5 = 1;
        var6 = 0;
        var7 = null;
        var8 = param2;
        L0: while (true) {
          if (var8 <= -129) {
            return var5 != 0;
          } else {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (-1 != param0[var8]) {
                  break L1;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
            var9 = ((qd) this).field_o[var8];
            if (0 != var9) {
              L2: {
                if (var6 == var9) {
                  break L2;
                } else {
                  L3: {
                    var6 = var9;
                    var9--;
                    if ((var9 & 1) != 0) {
                      var7 = param3.a((byte) -21, param1, var9 >> 2096158338);
                      break L3;
                    } else {
                      var7 = param3.a((byte) -106, var9 >> 1042604130, param1);
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
                ((qd) this).field_n[var8] = var7;
                ((qd) this).field_o[var8] = 0;
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

    final static long a(int param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        var2 = 0L;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (65 > var6) {
                    break L3;
                  } else {
                    if (var6 > 90) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(var6 + -64);
                      break L2;
                    }
                  }
                }
                L4: {
                  if (97 > var6) {
                    break L4;
                  } else {
                    if (var6 <= 122) {
                      var2 = var2 + (long)(-97 + var6 + 1);
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 < 48) {
                  break L2;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(-48 + var6 + 27);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (177917621779460413L > var2) {
                var5++;
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L5: {
            if (param0 <= -46) {
              break L5;
            } else {
              field_l = -83;
              break L5;
            }
          }
          L6: while (true) {
            L7: {
              if (var2 % 37L != 0L) {
                break L7;
              } else {
                if (0L == var2) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    qd(byte[] param0) {
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
        gm[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        gm var15 = null;
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
        gm var25_ref = null;
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
        dh var38 = null;
        byte[] var39 = null;
        gm var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        gm var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        gm var48 = null;
        gm var49 = null;
        gm var50 = null;
        gm var51 = null;
        gm var52 = null;
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
        ((qd) this).field_s = new byte[128];
        ((qd) this).field_q = new gm[128];
        ((qd) this).field_p = new short[128];
        ((qd) this).field_o = new int[128];
        ((qd) this).field_n = new gg[128];
        ((qd) this).field_r = new byte[128];
        ((qd) this).field_m = new byte[128];
        var38 = new dh(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_i[var3 + var38.field_k] == 0) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var38.field_k = var38.field_k + 1;
                var3++;
                var5 = var38.field_k;
                var38.field_k = var38.field_k + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_i[var38.field_k + var6] == 0) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var38.field_k = var38.field_k + 1;
                        var6++;
                        var8 = var38.field_k;
                        var38.field_k = var38.field_k + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_i[var9 + var38.field_k] == 0) {
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
                                  var38.field_k = var38.field_k + 1;
                                  var63 = new byte[var9];
                                  var58 = var63;
                                  var53 = var58;
                                  var39 = var53;
                                  var11 = var39;
                                  if ((var9 ^ -1) < -2) {
                                    var63[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.a(-16384);
                                          if (-1 != (var15_int ^ -1)) {
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
                                var13 = new gm[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.a(-16384);
                                      if (var14 >= -1) {
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
                                      var14 = var38.a(-16384);
                                      if (-1 >= var14) {
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
                                      if (var38.field_i[var38.field_k - -var17] == 0) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var17++;
                                            var38.field_k = var38.field_k + 1;
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
                                                      if (var23 <= -129) {
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
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= var26) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= (var27 ^ -1)) {
                                                                        ((qd) this).field_k = 1 + var38.a(-16384);
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
                                                                                    var15_array[var27] = var38.f(2);
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
                                                                                    var16[var27] = var38.f(2);
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
                                                                                  if (var12 <= var27) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.a(-16384);
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
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((qd) this).field_s[var30] = (byte)(((qd) this).field_s[var30] * var28 + 32 >> 1662190086);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = var28 * (-var27 + var30) - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = pc.a(-64, -var27 + var30, var32);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((qd) this).field_s[var33] = (byte)(32 + var34 * ((qd) this).field_s[var33] >> -1127737018);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((qd) this).field_s[var29] = (byte)(32 + var28 * ((qd) this).field_s[var29] >> 1793838790);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 + var38.a(-16384);
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
                                                                                        var19 = var38.a(-16384);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var47.length <= var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 973967425;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var47.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = (((qd) this).field_r[var30] & 255) - -var28;
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
                                                                                                        ((qd) this).field_r[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << 626180737;
                                                                                                    var32 = (var30 + -var27) / 2 + var28 * (var30 + -var27);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = pc.a(-92, var30 - var27, var32);
                                                                                                          var35 = (255 & ((qd) this).field_r[var37]) - -var34;
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
                                                                                                        ((qd) this).field_r[var37] = (byte)var35;
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (255 & ((qd) this).field_r[var29]) + var28;
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
                                                                                                ((qd) this).field_r[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.a(-16384) + (1 + var19);
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L47: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (-1 > (var52.field_m ^ -1)) {
                                                                                                          var52.field_c = var38.a(-16384);
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
                                                                                                    if (-1 > (var51.field_d ^ -1)) {
                                                                                                      var51.field_m = var38.a(-16384);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_d = var38.a(-16384);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_h == null) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_b = var38.a(-16384);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_g) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_k = var38.a(-16384);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if ((var50.field_i ^ -1) < -1) {
                                                                                              var50.field_e = var38.a(-16384);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_i = var38.a(-16384);
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
                                                                                          var19 = 1 + (var19 - -var38.a(-16384));
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
                                                                                if (null != var48.field_g) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var48.field_g.length > var29) {
                                                                                      var19 = var19 - -1 - -var38.a(-16384);
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
                                                                              if (var45.field_h == null) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var45.field_h.length <= var29) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_h[var29] = var38.f(2);
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
                                                                                  var45.field_g[var29] = var38.f(2);
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
                                                                              if (var21 >= var64.length) {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              } else {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if ((((qd) this).field_o[var27] ^ -1) >= -1) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.a(-16384) - -1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((qd) this).field_s[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (-1 != ((qd) this).field_o[var26]) {
                                                                      L61: {
                                                                        if (var20 != 0) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var63[var21]];
                                                                          if (var67.length <= var21) {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          } else {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      ((qd) this).field_q[var26] = var25_ref;
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
                                                                if (-1 != (((qd) this).field_o[var25_int] ^ -1)) {
                                                                  L62: {
                                                                    if (0 != var20) {
                                                                      break L62;
                                                                    } else {
                                                                      L63: {
                                                                        if (var21 < var66.length) {
                                                                          var21++;
                                                                          var20 = var7[var21];
                                                                          break L63;
                                                                        } else {
                                                                          var20 = -1;
                                                                          break L63;
                                                                        }
                                                                      }
                                                                      var8++;
                                                                      var24 = var38.field_i[var8] + 16 << 975808098;
                                                                      break L62;
                                                                    }
                                                                  }
                                                                  var20--;
                                                                  ((qd) this).field_r[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (-1 != (((qd) this).field_o[var24] ^ -1)) {
                                                              L64: {
                                                                if (var20 != 0) {
                                                                  break L64;
                                                                } else {
                                                                  L65: {
                                                                    if (var65.length > var21) {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L65;
                                                                    } else {
                                                                      var20 = -1;
                                                                      break L65;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = var38.field_i[var5] + -1;
                                                                  break L64;
                                                                }
                                                              }
                                                              ((qd) this).field_m[var24] = (byte)var23;
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
                                                        L66: {
                                                          if (-1 != var20) {
                                                            break L66;
                                                          } else {
                                                            L67: {
                                                              if (var64.length <= var21) {
                                                                var20 = -1;
                                                                break L67;
                                                              } else {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L67;
                                                              }
                                                            }
                                                            var22 = var38.i((byte) 13);
                                                            break L66;
                                                          }
                                                        }
                                                        ((qd) this).field_p[var23] = (short)(((qd) this).field_p[var23] + (dg.a(2, var22 - 1) << 977587118));
                                                        var20--;
                                                        ((qd) this).field_o[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.a(-16384);
                                                    ((qd) this).field_p[var20] = (short)(((qd) this).field_p[var20] + (var19 << -248609688));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.a(-16384);
                                                ((qd) this).field_p[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.f(2);
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
                                    L68: {
                                      var13[var14] = new gm();
                                      var40 = new gm();
                                      var15 = var40;
                                      var16_int = var38.a(-16384);
                                      if (var16_int <= 0) {
                                        break L68;
                                      } else {
                                        var15.field_h = new byte[var16_int * 2];
                                        break L68;
                                      }
                                    }
                                    var16_int = var38.a(-16384);
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
                                var10[var11_int] = var38.f(2);
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
                        var7[var8] = var38.f(2);
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
                var4[var5] = var38.f(2);
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
        field_l = 50;
        field_h = new String[]{"Mission selection", "Available missions - Click to select.", "The selected mission's information.", "Start the selected mission.", "Enter the equip screen.", "Enter the research screen.", "From here you can access information about different equipment from the research screen, recruit new members into your squad and provide them with weapons from the equipment screen, and proceed into the next mission. To play a mission click on one of the mission circles to highlight it and then click on the 'select mission' button. Make sure you remember to equip your soldiers before this though!"};
        field_i = 0;
        field_j = "Squiddy Commander";
    }
}
