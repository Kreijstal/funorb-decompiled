/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends am {
    pl[] field_o;
    static long field_n;
    static int field_m;
    static char[] field_h;
    byte[] field_l;
    short[] field_r;
    int field_j;
    static String field_p;
    private int[] field_k;
    byte[] field_s;
    jb[] field_q;
    byte[] field_i;

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0;
        if (param1 == -29205) {
          L0: while (true) {
            if (param0.length() <= var2) {
              return false;
            } else {
              var3 = param0.charAt(var2);
              if (!il.a((char) var3, (byte) -90)) {
                if (!qh.a((char) var3, -49)) {
                  return true;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static int[] a(boolean param0) {
        if (param0) {
            return null;
        }
        return new int[8];
    }

    final static void a(p param0, byte param1) {
        param0.field_e = param0.field_e - 1;
        param0.field_l.a(1, (byte) 94, param0.field_c);
        if (param1 != 70) {
            field_h = null;
        }
        if (-1 <= (param0.field_e ^ -1)) {
            param0.field_i = -1;
        }
    }

    public static void c(int param0) {
        field_h = null;
        field_p = null;
        if (param0 != 118) {
            int[] discarded$0 = nf.a(false);
        }
    }

    final boolean a(int[] param0, byte[] param1, rd param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        jb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = HostileSpawn.field_I ? 1 : 0;
          var5 = 1;
          var6 = 0;
          if (param3 == -20752) {
            break L0;
          } else {
            ((nf) this).field_q = null;
            break L0;
          }
        }
        var7 = null;
        var8 = 0;
        L1: while (true) {
          if (-129 >= (var8 ^ -1)) {
            return var5 != 0;
          } else {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1[var8] != 0) {
                  break L2;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
            var9 = ((nf) this).field_k[var8];
            if (var9 != 0) {
              L3: {
                if (var9 != var6) {
                  L4: {
                    var6 = var9;
                    var9--;
                    if ((var9 & 1) == 0) {
                      var7 = param2.a(param0, param3 + 20880, var9 >> -1298612542);
                      break L4;
                    } else {
                      var7 = param2.a((byte) -93, param0, var9 >> 923110082);
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
                ((nf) this).field_q[var8] = var7;
                ((nf) this).field_k[var8] = 0;
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

    nf(byte[] param0) {
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
        pl[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        pl var15 = null;
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
        pl var25_ref = null;
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
        vi var38 = null;
        byte[] var39 = null;
        pl var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        pl var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        pl var48 = null;
        pl var49 = null;
        pl var50 = null;
        pl var51 = null;
        pl var52 = null;
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
        ((nf) this).field_o = new pl[128];
        ((nf) this).field_r = new short[128];
        ((nf) this).field_s = new byte[128];
        ((nf) this).field_l = new byte[128];
        ((nf) this).field_q = new jb[128];
        ((nf) this).field_i = new byte[128];
        ((nf) this).field_k = new int[128];
        var38 = new vi(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_n[var38.field_i + var3]) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_i = var38.field_i + 1;
                var5 = var38.field_i;
                var38.field_i = var38.field_i + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_n[var38.field_i + var6] == 0) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var38.field_i = var38.field_i + 1;
                        var6++;
                        var8 = var38.field_i;
                        var38.field_i = var38.field_i + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_n[var9 + var38.field_i] == 0) {
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
                                  var38.field_i = var38.field_i + 1;
                                  var63 = new byte[var9];
                                  var58 = var63;
                                  var53 = var58;
                                  var39 = var53;
                                  var11 = var39;
                                  if (-2 > (var9 ^ -1)) {
                                    var63[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.l(32270);
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
                                var13 = new pl[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.l(32270);
                                      if ((var14 ^ -1) >= -1) {
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
                                      var14 = var38.l(32270);
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
                                      if (var38.field_n[var17 + var38.field_i] == 0) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var17++;
                                            var38.field_i = var38.field_i + 1;
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
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 <= -129) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (128 <= var25_int) {
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
                                                                      if (-129 >= var27) {
                                                                        ((nf) this).field_j = var38.l(32270) + 1;
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
                                                                                    var15_array[var27] = var38.j(0);
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
                                                                                    var16[var27] = var38.j(0);
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
                                                                                        var19 = var38.l(32270);
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
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((nf) this).field_i[var30] = (byte)(var28 * ((nf) this).field_i[var30] + 32 >> 1769286566);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = (var30 + -var27) / 2 + var28 * (var30 - var27);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = um.a(var30 - var27, var32, 10179);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((nf) this).field_i[var33] = (byte)(var34 * ((nf) this).field_i[var33] + 32 >> 1219373766);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((nf) this).field_i[var29] = (byte)(32 + ((nf) this).field_i[var29] * var28 >> -771642778);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.l(32270) + 1 + var19;
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
                                                                                        var19 = var38.l(32270);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << -359557727;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var47.length) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (255 & ((nf) this).field_l[var30]);
                                                                                                          if (var31 >= 0) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (128 >= var31) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((nf) this).field_l[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << -450414399;
                                                                                                    var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
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
                                                                                                          var34 = um.a(-var27 + var30, var32, 10179);
                                                                                                          var35 = var34 + (255 & ((nf) this).field_l[var37]);
                                                                                                          if (var35 >= 0) {
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
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        ((nf) this).field_l[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (255 & ((nf) this).field_l[var29]) - -var28;
                                                                                                  if (-1 >= (var30 ^ -1)) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (128 >= var30) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((nf) this).field_l[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 - (-1 - var38.l(32270));
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
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (var52.field_g > 0) {
                                                                                                          var52.field_d = var38.l(32270);
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
                                                                                                    if (var51.field_e > 0) {
                                                                                                      var51.field_g = var38.l(32270);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_e = var38.l(32270);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_n) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_o = var38.l(32270);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (var50.field_m == null) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_c = var38.l(32270);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if ((var50.field_b ^ -1) < -1) {
                                                                                              var50.field_h = var38.l(32270);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_b = var38.l(32270);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_n != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_n.length) {
                                                                                          var19 = var38.l(32270) + var19 + 1;
                                                                                          var49.field_n[var29] = (byte)var19;
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
                                                                                if (var48.field_m != null) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var48.field_m.length > var29) {
                                                                                      var19 = var38.l(32270) + var19 - -1;
                                                                                      var48.field_m[var29] = (byte)var19;
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
                                                                              if (null == var45.field_n) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var45.field_n.length <= var29) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_n[var29] = var38.j(0);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var45.field_m != null) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (-2 + var45.field_m.length > var29) {
                                                                                  var45.field_m[var29] = var38.j(0);
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
                                                                              if (var21 < var64.length) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (((nf) this).field_k[var27] <= 0) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = 1 + var38.l(32270);
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((nf) this).field_i[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((nf) this).field_k[var26] != 0) {
                                                                      L61: {
                                                                        if (var20 != 0) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var63[var21]];
                                                                          if (var67.length > var21) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      ((nf) this).field_o[var26] = var25_ref;
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
                                                                if (((nf) this).field_k[var25_int] != 0) {
                                                                  L62: {
                                                                    if (0 != var20) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = 16 + var38.field_n[var8] << 1576731970;
                                                                      if (var66.length <= var21) {
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
                                                                  ((nf) this).field_l[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (-1 != ((nf) this).field_k[var24]) {
                                                              L63: {
                                                                if (var20 != 0) {
                                                                  break L63;
                                                                } else {
                                                                  L64: {
                                                                    if (var21 < var65.length) {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L64;
                                                                    } else {
                                                                      var20 = -1;
                                                                      break L64;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = var38.field_n[var5] - 1;
                                                                  break L63;
                                                                }
                                                              }
                                                              ((nf) this).field_s[var24] = (byte)var23;
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
                                                              if (var21 < var64.length) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L66;
                                                              } else {
                                                                var20 = -1;
                                                                break L66;
                                                              }
                                                            }
                                                            var22 = var38.m(127);
                                                            break L65;
                                                          }
                                                        }
                                                        ((nf) this).field_r[var23] = (short)(((nf) this).field_r[var23] + (ua.a(2, -1 + var22) << 843377870));
                                                        var20--;
                                                        ((nf) this).field_k[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.l(32270);
                                                    ((nf) this).field_r[var20] = (short)(((nf) this).field_r[var20] + (var19 << -1655613304));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.l(32270);
                                                ((nf) this).field_r[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.j(0);
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
                                      var13[var14] = new pl();
                                      var40 = new pl();
                                      var15 = var40;
                                      var16_int = var38.l(32270);
                                      if ((var16_int ^ -1) >= -1) {
                                        break L67;
                                      } else {
                                        var15.field_n = new byte[var16_int * 2];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.l(32270);
                                    if (var16_int > 0) {
                                      var15.field_m = new byte[2 + 2 * var16_int];
                                      var40.field_m[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.j(0);
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
                        var7[var8] = var38.j(0);
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
                var4[var5] = var38.j(0);
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
        field_n = 0L;
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_p = "Empty";
    }
}
