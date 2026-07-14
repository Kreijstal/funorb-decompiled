/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eka extends bw {
    be[] field_m;
    byte[] field_f;
    static String field_o;
    un[] field_l;
    byte[] field_i;
    static ee[][] field_g;
    int field_h;
    short[] field_n;
    byte[] field_j;
    private int[] field_k;

    final static void c(byte param0) {
        if (param0 != -69) {
            int discarded$0 = eka.a((byte) 30, 108);
        }
    }

    public static void a(int param0) {
        if (param0 <= 116) {
            eka.c((byte) 21);
        }
        field_g = null;
        field_o = null;
    }

    final boolean a(byte[] param0, int param1, i param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        be var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = BachelorFridge.field_y;
          var5 = 1;
          var6 = 0;
          var7 = null;
          if (param1 == 1436234146) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if (-129 >= var8) {
            return var5 != 0;
          } else {
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (-1 != param0[var8]) {
                  break L2;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
            var9 = ((eka) this).field_k[var8];
            if (0 != var9) {
              L3: {
                if (var6 == var9) {
                  break L3;
                } else {
                  L4: {
                    var6 = var9;
                    var9--;
                    if (0 != (var9 & 1)) {
                      var7 = param2.a(var9 >> -1010683390, (byte) 15, param3);
                      break L4;
                    } else {
                      var7 = param2.a(-52, param3, var9 >> 1436234146);
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
                ((eka) this).field_m[var8] = var7;
                ((eka) this).field_k[var8] = 0;
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

    final static int a(byte param0, int param1) {
        if (param0 <= 81) {
            field_g = null;
        }
        String var2 = lka.field_E[param1][6];
        String var2_ref = var2.toLowerCase();
        var2_ref = var2_ref.trim();
        ji var3 = (ji) (Object) id.field_i.a(true, (long)var2_ref.hashCode());
        return var3.field_h;
    }

    eka(byte[] param0) {
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
        un[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        un var15 = null;
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
        un var25_ref = null;
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
        lu var38 = null;
        byte[] var39 = null;
        un var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        un var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        un var48 = null;
        un var49 = null;
        un var50 = null;
        un var51 = null;
        un var52 = null;
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
        ((eka) this).field_m = new be[128];
        ((eka) this).field_l = new un[128];
        ((eka) this).field_i = new byte[128];
        ((eka) this).field_j = new byte[128];
        ((eka) this).field_k = new int[128];
        ((eka) this).field_f = new byte[128];
        ((eka) this).field_n = new short[128];
        var38 = new lu(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_h[var3 + var38.field_g]) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var3++;
                var38.field_g = var38.field_g + 1;
                var5 = var38.field_g;
                var38.field_g = var38.field_g + var3;
                var6 = 0;
                L2: while (true) {
                  if (-1 == (var38.field_h[var38.field_g + var6] ^ -1)) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var6++;
                        var38.field_g = var38.field_g + 1;
                        var8 = var38.field_g;
                        var38.field_g = var38.field_g + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (-1 == (var38.field_h[var38.field_g - -var9] ^ -1)) {
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
                                  if (var9 > 1) {
                                    var65[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.b(16711935);
                                          if (-1 == (var15_int ^ -1)) {
                                            var12++;
                                            var13_int = var12;
                                            break L8;
                                          } else {
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
                                var13 = new un[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.b(16711935);
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
                                      var70 = (byte[]) (Object) stackIn_38_0;
                                      var64 = var70;
                                      var58 = var64;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.b(16711935);
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
                                    var47 = (byte[]) (Object) stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_h[var38.field_g + var17] == 0) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var17++;
                                            var38.field_g = var38.field_g + 1;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (-129 >= (var20 ^ -1)) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
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
                                                                  if ((var26 ^ -1) <= -129) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var27) {
                                                                        ((eka) this).field_h = var38.b(16711935) - -1;
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
                                                                                    var15_array[var27] = var38.b(true);
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
                                                                                    var16[var27] = var38.b(true);
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
                                                                                        var19 = var38.b(16711935);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var70.length <= var27) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var70.length) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((eka) this).field_i[var30] = (byte)(var28 * ((eka) this).field_i[var30] + 32 >> 160103750);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = (var30 - var27) / 2 + var28 * (var30 - var27);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = gd.a(var30 - var27, false, var32);
                                                                                                        ((eka) this).field_i[var33] = (byte)(var34 * ((eka) this).field_i[var33] - -32 >> 500821414);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((eka) this).field_i[var29] = (byte)(32 + var28 * ((eka) this).field_i[var29] >> 1101202982);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.b(16711935) + var19 - -1;
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
                                                                                        var19 = var38.b(16711935);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var47.length <= var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 1122641057;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var47.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if ((var30 ^ -1) <= -129) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (255 & ((eka) this).field_f[var30]);
                                                                                                          if (var31 <= -1) {
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
                                                                                                        ((eka) this).field_f[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 - -1] << 492871137;
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
                                                                                                          var34 = gd.a(-var27 + var30, false, var32);
                                                                                                          var35 = (255 & ((eka) this).field_f[var37]) + var34;
                                                                                                          if ((var35 ^ -1) <= -1) {
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
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((eka) this).field_f[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (255 & ((eka) this).field_f[var29]);
                                                                                                  if ((var30 ^ -1) <= -1) {
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
                                                                                                ((eka) this).field_f[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.b(16711935) + 1 + var19;
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
                                                                                                      if (var12 <= var27) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if ((var52.field_l ^ -1) < -1) {
                                                                                                          var52.field_g = var38.b(16711935);
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
                                                                                                    if (0 < var51.field_c) {
                                                                                                      var51.field_l = var38.b(16711935);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_c = var38.b(16711935);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_j == null) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_d = var38.b(16711935);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_b) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_k = var38.b(16711935);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if ((var50.field_e ^ -1) < -1) {
                                                                                              var50.field_h = var38.b(16711935);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_e = var38.b(16711935);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_j != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_j.length) {
                                                                                          var19 = var38.b(16711935) + var19 + 1;
                                                                                          var49.field_j[var29] = (byte)var19;
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
                                                                                    if (var48.field_b.length > var29) {
                                                                                      var19 = var19 + (1 + var38.b(16711935));
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
                                                                              if (null == var45.field_j) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var45.field_j.length <= var29) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_j[var29] = var38.b(true);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_b) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var29 < var45.field_b.length + -2) {
                                                                                  var45.field_b[var29] = var38.b(true);
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
                                                                              if (var21 >= var66.length) {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              } else {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (0 >= ((eka) this).field_k[var27]) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.b(16711935) + 1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((eka) this).field_i[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((eka) this).field_k[var26] != -1) {
                                                                      L61: {
                                                                        if (-1 != var20) {
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
                                                                      ((eka) this).field_l[var26] = var25_ref;
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
                                                                if (((eka) this).field_k[var25_int] != -1) {
                                                                  L62: {
                                                                    if (-1 != var20) {
                                                                      break L62;
                                                                    } else {
                                                                      L63: {
                                                                        if (var68.length <= var21) {
                                                                          var20 = -1;
                                                                          break L63;
                                                                        } else {
                                                                          var21++;
                                                                          var20 = var7[var21];
                                                                          break L63;
                                                                        }
                                                                      }
                                                                      var8++;
                                                                      var24 = var38.field_h[var8] - -16 << -227506494;
                                                                      break L62;
                                                                    }
                                                                  }
                                                                  ((eka) this).field_f[var25_int] = (byte)var24;
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
                                                            if (((eka) this).field_k[var24] != 0) {
                                                              L64: {
                                                                if (-1 != (var20 ^ -1)) {
                                                                  break L64;
                                                                } else {
                                                                  L65: {
                                                                    if (var67.length <= var21) {
                                                                      var20 = -1;
                                                                      break L65;
                                                                    } else {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L65;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = var38.field_h[var5] + -1;
                                                                  break L64;
                                                                }
                                                              }
                                                              ((eka) this).field_j[var24] = (byte)var23;
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
                                                          if (-1 != (var20 ^ -1)) {
                                                            break L66;
                                                          } else {
                                                            L67: {
                                                              if (var66.length > var21) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L67;
                                                              } else {
                                                                var20 = -1;
                                                                break L67;
                                                              }
                                                            }
                                                            var22 = var38.d(-1);
                                                            break L66;
                                                          }
                                                        }
                                                        ((eka) this).field_n[var23] = (short)(((eka) this).field_n[var23] + (dda.a(2, var22 - 1) << 1944110478));
                                                        var20--;
                                                        ((eka) this).field_k[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.b(16711935);
                                                    ((eka) this).field_n[var20] = (short)(((eka) this).field_n[var20] + (var19 << 1251289192));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.b(16711935);
                                                ((eka) this).field_n[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.b(true);
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
                                      var13[var14] = new un();
                                      var40 = new un();
                                      var15 = var40;
                                      var16_int = var38.b(16711935);
                                      if (0 >= var16_int) {
                                        break L68;
                                      } else {
                                        var15.field_j = new byte[2 * var16_int];
                                        break L68;
                                      }
                                    }
                                    var16_int = var38.b(16711935);
                                    if (-1 > (var16_int ^ -1)) {
                                      var15.field_b = new byte[2 + 2 * var16_int];
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
                                var10[var11_int] = var38.b(true);
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
                        var7[var8] = var38.b(true);
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
                var4[var5] = var38.b(true);
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

    final void b(boolean param0) {
        ((eka) this).field_k = null;
        if (param0) {
            eka.a(-113);
        }
    }

    final static void a(sna param0, int param1, sna param2) {
        if (param2.field_z == null) {
            param2.field_z = new eaa();
        }
        if (!(param0.field_z != null)) {
            param0.field_z = new eaa();
        }
        if (null == wja.field_m) {
            wja.field_m = new wma(64);
        }
        if (fq.field_s == null) {
            fq.field_s = new wma(64);
        }
        if (param1 > -45) {
            return;
        }
        es.field_j = param2.field_z;
        cca.field_v = param0.field_z;
        eo.c(-55);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You are invited to <%0>'s game.";
    }
}
