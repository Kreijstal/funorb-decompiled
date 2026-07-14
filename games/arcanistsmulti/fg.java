/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends pg {
    static ll[] field_k;
    static String field_o;
    static String field_i;
    private int[] field_q;
    int field_r;
    byte[] field_l;
    wf[] field_p;
    byte[] field_h;
    short[] field_m;
    static String field_g;
    ba[] field_n;
    byte[] field_j;

    final static String a(String param0, int param1) {
        int var2 = bk.a(qf.field_d, 1021, ib.field_r);
        if (!(param1 != (var2 ^ -1))) {
            param0 = "<img=0>" + param0;
        }
        if (var2 == 2) {
            param0 = "<img=1>" + param0;
        }
        return param0;
    }

    final void a(int param0) {
        if (param0 != 23257) {
            field_g = null;
        }
        ((fg) this).field_q = null;
    }

    public static void b(boolean param0) {
        field_o = null;
        field_g = null;
        field_i = null;
        field_k = null;
        if (!param0) {
            field_o = null;
        }
    }

    final static byte[] a(String param0, byte param1) {
        if (param1 != -45) {
            Object var3 = null;
            byte[] discarded$0 = fg.a((String) null, (byte) -82);
        }
        return ld.field_q.a(param0, "", -1);
    }

    final boolean a(int param0, gi param1, int[] param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        wf var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        var5 = 1;
        var6 = 0;
        var7 = null;
        var9 = -60 % ((-13 - param0) / 37);
        var8 = 0;
        L0: while (true) {
          if (-129 >= (var8 ^ -1)) {
            return var5 != 0;
          } else {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (0 != param3[var8]) {
                  break L1;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
            var10 = ((fg) this).field_q[var8];
            if (var10 != 0) {
              L2: {
                if (var6 == var10) {
                  break L2;
                } else {
                  L3: {
                    var6 = var10;
                    var10--;
                    if (-1 == (var10 & 1 ^ -1)) {
                      var7 = param1.a(var10 >> -1610346110, param2, -2);
                      break L3;
                    } else {
                      var7 = param1.a(param2, var10 >> -1860846366, -2);
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
                ((fg) this).field_p[var8] = var7;
                ((fg) this).field_q[var8] = 0;
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

    fg(byte[] param0) {
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
        ba[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        ba var15 = null;
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
        ba var25_ref = null;
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
        wk var38 = null;
        byte[] var39 = null;
        ba var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        ba var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        ba var48 = null;
        ba var49 = null;
        ba var50 = null;
        ba var51 = null;
        ba var52 = null;
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
        ((fg) this).field_j = new byte[128];
        ((fg) this).field_h = new byte[128];
        ((fg) this).field_l = new byte[128];
        ((fg) this).field_p = new wf[128];
        ((fg) this).field_n = new ba[128];
        ((fg) this).field_m = new short[128];
        ((fg) this).field_q = new int[128];
        var38 = new wk(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_j[var3 + var38.field_g] ^ -1)) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_g = var38.field_g + 1;
                var5 = var38.field_g;
                var38.field_g = var38.field_g + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_j[var38.field_g - -var6] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var38.field_g = var38.field_g + 1;
                        var6++;
                        var8 = var38.field_g;
                        var38.field_g = var38.field_g + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (-1 == (var38.field_j[var9 + var38.field_g] ^ -1)) {
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
                                  var38.field_g = var38.field_g + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if ((var9 ^ -1) < -2) {
                                    var65[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.e((byte) -124);
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
                                var13 = new ba[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.e((byte) 125);
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
                                      var46 = (byte[]) (Object) stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.e((byte) 96);
                                      if (var14 > 0) {
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
                                      if (-1 == (var38.field_j[var38.field_g + var17] ^ -1)) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var38.field_g = var38.field_g + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (-129 >= (var20 ^ -1)) {
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
                                                          if (-129 >= (var24 ^ -1)) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (-129 >= var25_int) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var26 ^ -1)) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((fg) this).field_r = var38.e((byte) -111) - -1;
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
                                                                                    var15_array[var27] = var38.o(6);
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
                                                                                  if (var27 >= var70.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.o(6);
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
                                                                                        var19 = var38.e((byte) -102);
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
                                                                                                  if (var29 >= var46.length) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((fg) this).field_h[var30] = (byte)(32 + var28 * ((fg) this).field_h[var30] >> -927257402);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = var28 * (var30 + -var27) + (-var27 + var30) / 2;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = jg.a(var30 + -var27, -271087521, var32);
                                                                                                        ((fg) this).field_h[var33] = (byte)(32 + ((fg) this).field_h[var33] * var34 >> 70882790);
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((fg) this).field_h[var29] = (byte)(var28 * ((fg) this).field_h[var29] + 32 >> 53246182);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 - -1 - -var38.e((byte) 31);
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
                                                                                        var19 = var38.e((byte) 51);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var70.length <= var27) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1] << 640449249;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var70.length) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = (255 & ((fg) this).field_j[var30]) - -var28;
                                                                                                          if (0 <= var31) {
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
                                                                                                        ((fg) this).field_j[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var16[1 + var29] << -550095039;
                                                                                                    var32 = (-var27 + var30) / 2 + var28 * (-var27 + var30);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = jg.a(-var27 + var30, -271087521, var32);
                                                                                                          var35 = (((fg) this).field_j[var37] & 255) + var34;
                                                                                                          if (var35 >= 0) {
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
                                                                                                        ((fg) this).field_j[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (255 & ((fg) this).field_j[var29]) + var28;
                                                                                                  if (-1 >= (var30 ^ -1)) {
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
                                                                                                ((fg) this).field_j[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.e((byte) -87) + (1 + var19);
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
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (var52.field_j > 0) {
                                                                                                          var52.field_d = var38.e((byte) 94);
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
                                                                                                    if (0 < var51.field_e) {
                                                                                                      var51.field_j = var38.e((byte) -87);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_e = var38.e((byte) 119);
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
                                                                                                var50.field_g = var38.e((byte) -106);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_l) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_i = var38.e((byte) -99);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (var50.field_n > 0) {
                                                                                              var50.field_m = var38.e((byte) -90);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_n = var38.e((byte) -102);
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
                                                                                        if (var49.field_h.length > var29) {
                                                                                          var19 = 1 + (var19 - -var38.e((byte) 101));
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
                                                                                if (null != var48.field_l) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var48.field_l.length > var29) {
                                                                                      var19 = var19 + (1 - -var38.e((byte) -93));
                                                                                      var48.field_l[var29] = (byte)var19;
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
                                                                                  if (var29 >= var45.field_h.length) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_h[var29] = var38.o(6);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_l) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var29 < var45.field_l.length - 2) {
                                                                                  var45.field_l[var29] = var38.o(6);
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
                                                                          if (0 != var20) {
                                                                            break L59;
                                                                          } else {
                                                                            L60: {
                                                                              if (var66.length <= var21) {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              } else {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (-1 <= (((fg) this).field_q[var27] ^ -1)) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = 1 + var38.e((byte) -125);
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((fg) this).field_h[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((fg) this).field_q[var26] != 0) {
                                                                      L61: {
                                                                        if (var20 != 0) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var65[var21]];
                                                                          if (var21 >= var69.length) {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          } else {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      var20--;
                                                                      ((fg) this).field_n[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (((fg) this).field_q[var25_int] != 0) {
                                                                  L62: {
                                                                    if (-1 != var20) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = 16 + var38.field_j[var8] << 1756243586;
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
                                                                  ((fg) this).field_j[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (0 != ((fg) this).field_q[var24]) {
                                                              L63: {
                                                                if (0 != var20) {
                                                                  break L63;
                                                                } else {
                                                                  L64: {
                                                                    if (var67.length > var21) {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L64;
                                                                    } else {
                                                                      var20 = -1;
                                                                      break L64;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = var38.field_j[var5] + -1;
                                                                  break L63;
                                                                }
                                                              }
                                                              ((fg) this).field_l[var24] = (byte)var23;
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
                                                              if (var21 < var66.length) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L66;
                                                              } else {
                                                                var20 = -1;
                                                                break L66;
                                                              }
                                                            }
                                                            var22 = var38.a(70);
                                                            break L65;
                                                          }
                                                        }
                                                        ((fg) this).field_m[var23] = (short)(((fg) this).field_m[var23] + (dg.a(2, var22 - 1) << -181601778));
                                                        var20--;
                                                        ((fg) this).field_q[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.e((byte) -100);
                                                    ((fg) this).field_m[var20] = (short)(((fg) this).field_m[var20] + (var19 << -926025368));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.e((byte) 79);
                                                ((fg) this).field_m[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.o(6);
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
                                      var13[var14] = new ba();
                                      var40 = new ba();
                                      var15 = var40;
                                      var16_int = var38.e((byte) -106);
                                      if (-1 <= (var16_int ^ -1)) {
                                        break L67;
                                      } else {
                                        var15.field_h = new byte[var16_int * 2];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.e((byte) 101);
                                    if ((var16_int ^ -1) < -1) {
                                      var15.field_l = new byte[var16_int * 2 - -2];
                                      var40.field_l[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.o(6);
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
                        var7[var8] = var38.o(6);
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
                var4[var5] = var38.o(6);
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
        field_o = null;
        field_g = "Only show lobby chat from my friends";
        field_i = "Lets you swim and decreases the damage done by water attacks";
    }
}
