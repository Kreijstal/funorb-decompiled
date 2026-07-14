/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ksa {
    byte[] field_j;
    byte[] field_g;
    short[] field_e;
    gd[] field_d;
    int field_i;
    private int[] field_k;
    cja[] field_h;
    byte[] field_f;

    final boolean a(int param0, bmb param1, int[] param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        gd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = VoidHunters.field_G;
          if (param0 == 1069) {
            break L0;
          } else {
            ((sd) this).field_i = -8;
            break L0;
          }
        }
        var5 = 1;
        var6 = 0;
        var7 = null;
        var8 = 0;
        L1: while (true) {
          if (var8 <= -129) {
            return var5 != 0;
          } else {
            L2: {
              if (param3 == null) {
                break L2;
              } else {
                if (param3[var8] != 0) {
                  break L2;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
            var9 = ((sd) this).field_k[var8];
            if (-1 != var9) {
              L3: {
                if (var6 != var9) {
                  L4: {
                    var6 = var9;
                    var9--;
                    if (0 != (var9 & 1)) {
                      var7 = param1.a((byte) 127, var9 >> -527458526, param2);
                      break L4;
                    } else {
                      var7 = param1.a((byte) -16, param2, var9 >> 635068482);
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
                ((sd) this).field_d[var8] = var7;
                ((sd) this).field_k[var8] = 0;
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

    final void a(int param0) {
        ((sd) this).field_k = null;
        if (param0 != 0) {
            ((sd) this).field_d = null;
        }
    }

    sd(byte[] param0) {
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
        cja[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        cja var15 = null;
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
        cja var25_ref = null;
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
        ds var38 = null;
        byte[] var39 = null;
        cja var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        cja var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        cja var48 = null;
        cja var49 = null;
        cja var50 = null;
        cja var51 = null;
        cja var52 = null;
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
        byte[] var71 = null;
        byte[] var72 = null;
        byte[] var73 = null;
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        byte[] stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        ((sd) this).field_e = new short[128];
        ((sd) this).field_d = new gd[128];
        ((sd) this).field_g = new byte[128];
        ((sd) this).field_f = new byte[128];
        ((sd) this).field_j = new byte[128];
        ((sd) this).field_k = new int[128];
        ((sd) this).field_h = new cja[128];
        var38 = new ds(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_h[var3 + var38.field_e] == 0) {
            var69 = new byte[var3];
            var62 = var69;
            var55 = var62;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_e = var38.field_e + 1;
                var5 = var38.field_e;
                var38.field_e = var38.field_e + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_h[var38.field_e + var6] == 0) {
                    var70 = new byte[var6];
                    var63 = var70;
                    var56 = var63;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var38.field_e = var38.field_e + 1;
                        var6++;
                        var8 = var38.field_e;
                        var38.field_e = var38.field_e + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_h[var38.field_e + var9] == 0) {
                            var71 = new byte[var9];
                            var64 = var71;
                            var57 = var64;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var9++;
                                  var38.field_e = var38.field_e + 1;
                                  var67 = new byte[var9];
                                  var60 = var67;
                                  var53 = var60;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 > 1) {
                                    var67[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.e((byte) -101);
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
                                var13 = new cja[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.e((byte) -123);
                                      if (-1 > (var14 ^ -1)) {
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
                                      var72 = stackIn_38_0;
                                      var65 = var72;
                                      var58 = var65;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.e((byte) -122);
                                      if ((var14 ^ -1) < -1) {
                                        stackOut_40_0 = new byte[var14 * 2];
                                        stackIn_41_0 = stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var73 = stackIn_41_0;
                                    var66 = var73;
                                    var59 = var66;
                                    var47 = var59;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_h[var38.field_e + var17] == 0) {
                                        var68 = new byte[var17];
                                        var61 = var68;
                                        var54 = var61;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var17++;
                                            var38.field_e = var38.field_e + 1;
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
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
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
                                                                  if ((var26 ^ -1) <= -129) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= var27) {
                                                                        ((sd) this).field_i = var38.e((byte) -105) + 1;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var12 <= var27) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var72.length <= var27) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.d((byte) -114);
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
                                                                                  if (var73.length <= var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.d((byte) -114);
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
                                                                                        var19 = var38.e((byte) -103);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var72.length) {
                                                                                            var27 = var72[0];
                                                                                            var28 = var72[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var72.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((sd) this).field_f[var30] = (byte)(var28 * ((sd) this).field_f[var30] - -32 >> -1423934842);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var72[var29];
                                                                                                    var31 = var15_array[var29 + 1];
                                                                                                    var32 = (-var27 + var30) * var28 - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = lb.a(var32, var30 + -var27, false);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((sd) this).field_f[var33] = (byte)(32 + ((sd) this).field_f[var33] * var34 >> -620508954);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((sd) this).field_f[var29] = (byte)(32 + var28 * ((sd) this).field_f[var29] >> 1965016806);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.e((byte) -123) + (var19 - -1);
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
                                                                                        var19 = var38.e((byte) -89);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var73.length) {
                                                                                            var27 = var73[0];
                                                                                            var28 = var73[1] << -593856095;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var73.length) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = (255 & ((sd) this).field_g[var30]) - -var28;
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
                                                                                                        ((sd) this).field_g[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var73[var29];
                                                                                                    var31 = var16[1 + var29] << -827436543;
                                                                                                    var32 = (-var27 + var30) / 2 + (-var27 + var30) * var28;
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
                                                                                                          var34 = lb.a(var32, -var27 + var30, false);
                                                                                                          var35 = var34 + (((sd) this).field_g[var37] & 255);
                                                                                                          if ((var35 ^ -1) <= -1) {
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
                                                                                                        ((sd) this).field_g[var37] = (byte)var35;
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (255 & ((sd) this).field_g[var29]) + var28;
                                                                                                  if (0 <= var30) {
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
                                                                                                ((sd) this).field_g[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + (var19 + var38.e((byte) -104));
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
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (-1 > (var52.field_i ^ -1)) {
                                                                                                          var52.field_e = var38.e((byte) -126);
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
                                                                                                    if ((var51.field_f ^ -1) < -1) {
                                                                                                      var51.field_i = var38.e((byte) -112);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_f = var38.e((byte) -125);
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
                                                                                                var50.field_d = var38.e((byte) -91);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_a) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_g = var38.e((byte) -113);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (0 < var50.field_b) {
                                                                                              var50.field_c = var38.e((byte) -89);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_b = var38.e((byte) -115);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_h != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_h.length) {
                                                                                          var19 = var38.e((byte) -114) + (var19 - -1);
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
                                                                                if (null != var48.field_a) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var29 < var48.field_a.length) {
                                                                                      var19 = var19 - (-1 + -var38.e((byte) -121));
                                                                                      var48.field_a[var29] = (byte)var19;
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
                                                                                    var45.field_h[var29] = var38.d((byte) -114);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var45.field_a != null) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var29 < -2 + var45.field_a.length) {
                                                                                  var45.field_a[var29] = var38.d((byte) -114);
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
                                                                          if (-1 != var20) {
                                                                            break L59;
                                                                          } else {
                                                                            L60: {
                                                                              if (var68.length > var21) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (((sd) this).field_k[var27] <= 0) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.e((byte) -106) + 1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((sd) this).field_f[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((sd) this).field_k[var26] != 0) {
                                                                      L61: {
                                                                        if (0 != var20) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var67[var21]];
                                                                          if (var71.length > var21) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      var20--;
                                                                      ((sd) this).field_h[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (((sd) this).field_k[var25_int] != 0) {
                                                                  L62: {
                                                                    if (var20 != 0) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = var38.field_h[var8] - -16 << 1073844418;
                                                                      if (var21 >= var70.length) {
                                                                        var20 = -1;
                                                                        break L62;
                                                                      } else {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L62;
                                                                      }
                                                                    }
                                                                  }
                                                                  var20--;
                                                                  ((sd) this).field_g[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (((sd) this).field_k[var24] != 0) {
                                                              L63: {
                                                                if (var20 != 0) {
                                                                  break L63;
                                                                } else {
                                                                  var5++;
                                                                  var23 = -1 + var38.field_h[var5];
                                                                  if (var21 < var69.length) {
                                                                    var21++;
                                                                    var20 = var4[var21];
                                                                    break L63;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L63;
                                                                  }
                                                                }
                                                              }
                                                              var20--;
                                                              ((sd) this).field_j[var24] = (byte)var23;
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
                                                          if (var20 != 0) {
                                                            break L64;
                                                          } else {
                                                            L65: {
                                                              if (var21 >= var68.length) {
                                                                var20 = -1;
                                                                break L65;
                                                              } else {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L65;
                                                              }
                                                            }
                                                            var22 = var38.l(11436);
                                                            break L64;
                                                          }
                                                        }
                                                        ((sd) this).field_e[var23] = (short)(((sd) this).field_e[var23] + dla.a(-1 + var22 << -550792562, 32768));
                                                        var20--;
                                                        ((sd) this).field_k[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.e((byte) -110);
                                                    ((sd) this).field_e[var20] = (short)(((sd) this).field_e[var20] + (var19 << 1862026952));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.e((byte) -124);
                                                ((sd) this).field_e[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.d((byte) -114);
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
                                      var13[var14] = new cja();
                                      var40 = new cja();
                                      var15 = var40;
                                      var16_int = var38.e((byte) -123);
                                      if (0 >= var16_int) {
                                        break L66;
                                      } else {
                                        var15.field_h = new byte[2 * var16_int];
                                        break L66;
                                      }
                                    }
                                    var16_int = var38.e((byte) -124);
                                    if (0 < var16_int) {
                                      var15.field_a = new byte[2 * var16_int + 2];
                                      var40.field_a[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.d((byte) -114);
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
                        var7[var8] = var38.d((byte) -114);
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
                var4[var5] = var38.d((byte) -114);
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
