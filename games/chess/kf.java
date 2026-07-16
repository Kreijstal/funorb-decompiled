/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends o {
    private int[] field_o;
    dl[] field_r;
    int field_n;
    lm[] field_s;
    byte[] field_l;
    short[] field_p;
    byte[] field_k;
    byte[] field_q;
    static aj field_j;
    static String field_m;
    static ci field_t;
    static int field_u;

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param2.getGraphics();
            ph.field_j.a(param3, 12105912, var4, param0);
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
        if (param1 != 98) {
            Object var5 = null;
            kf.a(-46, (byte) 59, (java.awt.Canvas) null, -92);
        }
    }

    public static void c(byte param0) {
        field_j = null;
        if (param0 != -101) {
            kf.a(14);
        }
        field_m = null;
        field_t = null;
    }

    final boolean a(int[] param0, fe param1, byte param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        L0: {
          var10 = Chess.field_G;
          var5 = 1;
          var6 = 0;
          var7 = null;
          if (param2 == -73) {
            break L0;
          } else {
            var11 = null;
            boolean discarded$2 = ((kf) this).a((int[]) null, (fe) null, (byte) -119, (byte[]) null);
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if ((var8 ^ -1) <= -129) {
            return var5 != 0;
          } else {
            L2: {
              L3: {
                if (param3 == null) {
                  break L3;
                } else {
                  if (-1 != (param3[var8] ^ -1)) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var9 = ((kf) this).field_o[var8];
              if ((var9 ^ -1) == -1) {
                break L2;
              } else {
                L4: {
                  if ((var6 ^ -1) == (var9 ^ -1)) {
                    break L4;
                  } else {
                    L5: {
                      var6 = var9;
                      var9--;
                      if (0 == (1 & var9)) {
                        var7 = (Object) (Object) param1.a(param0, var9 >> -1873103902, param2 + 968449273);
                        break L5;
                      } else {
                        var7 = (Object) (Object) param1.a(var9 >> 414047586, param0, (byte) -48);
                        break L5;
                      }
                    }
                    if (var7 == null) {
                      var5 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var7 != null) {
                  ((kf) this).field_s[var8] = (lm) var7;
                  ((kf) this).field_o[var8] = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var8++;
            continue L1;
          }
        }
    }

    final void e(int param0) {
        ((kf) this).field_o = null;
        if (param0 <= 45) {
            Object var3 = null;
            boolean discarded$0 = ((kf) this).a((int[]) null, (fe) null, (byte) 87, (byte[]) null);
        }
    }

    kf(byte[] param0) {
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
        dl[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        dl var15 = null;
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
        p var38 = null;
        byte[] var39 = null;
        dl var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        dl var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        dl var48 = null;
        dl var49 = null;
        dl var50 = null;
        dl var51 = null;
        dl var52 = null;
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
        ((kf) this).field_r = new dl[128];
        ((kf) this).field_q = new byte[128];
        ((kf) this).field_k = new byte[128];
        ((kf) this).field_o = new int[128];
        ((kf) this).field_p = new short[128];
        ((kf) this).field_s = new lm[128];
        ((kf) this).field_l = new byte[128];
        var38 = new p(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_o[var38.field_l - -var3]) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if ((var5 ^ -1) <= (var3 ^ -1)) {
                var38.field_l = var38.field_l + 1;
                var3++;
                var5 = var38.field_l;
                var38.field_l = var38.field_l + var3;
                var6 = 0;
                L2: while (true) {
                  if ((var38.field_o[var38.field_l - -var6] ^ -1) == -1) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if ((var8 ^ -1) <= (var6 ^ -1)) {
                        var38.field_l = var38.field_l + 1;
                        var6++;
                        var8 = var38.field_l;
                        var38.field_l = var38.field_l + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (0 == var38.field_o[var38.field_l - -var9]) {
                            var67 = new byte[var9];
                            var62 = var67;
                            var57 = var62;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if ((var11_int ^ -1) <= (var9 ^ -1)) {
                                L6: {
                                  var9++;
                                  var38.field_l = var38.field_l + 1;
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
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if ((var14 ^ -1) <= (var9 ^ -1)) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.i(-77);
                                          if ((var15_int ^ -1) != -1) {
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
                                var13 = new dl[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.i(-125);
                                      if (var14 <= 0) {
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
                                      var14 = var38.i(-77);
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
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_o[var17 + var38.field_l] == 0) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var38.field_l = var38.field_l + 1;
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
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if ((var25_int ^ -1) <= -129) {
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
                                                                      if (var27 >= 128) {
                                                                        ((kf) this).field_n = 1 + var38.i(-86);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if ((var27 ^ -1) <= (var46.length ^ -1)) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.g(0);
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
                                                                                    var16[var27] = var38.g(0);
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
                                                                                  if (var12 <= var27) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.i(-109);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if ((var27 ^ -1) <= (var46.length ^ -1)) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if ((var46.length ^ -1) >= (var29 ^ -1)) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((kf) this).field_k[var30] = (byte)(32 + var28 * ((kf) this).field_k[var30] >> 1680097606);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if ((var33 ^ -1) <= (var30 ^ -1)) {
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = hf.a(var32, 1022407519, var30 - var27);
                                                                                                        ((kf) this).field_k[var33] = (byte)(32 + ((kf) this).field_k[var33] * var34 >> 315292454);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((kf) this).field_k[var29] = (byte)(32 + var28 * ((kf) this).field_k[var29] >> 1096502470);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.i(-106) + var19 + 1;
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
                                                                                        var19 = var38.i(-106);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << -803788031;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if ((var29 ^ -1) <= (var27 ^ -1)) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var47.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if ((var30 ^ -1) <= -129) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (255 & ((kf) this).field_q[var30]);
                                                                                                          if (-1 >= (var31 ^ -1)) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (-129 <= (var31 ^ -1)) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((kf) this).field_q[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 + 1] << -1625238687;
                                                                                                    var32 = var28 * (-var27 + var30) - -((var30 - var27) / 2);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if ((var30 ^ -1) >= (var37 ^ -1)) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = hf.a(var32, 1022407519, -var27 + var30);
                                                                                                          var35 = (((kf) this).field_q[var37] & 255) + var34;
                                                                                                          if (0 <= var35) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if ((var35 ^ -1) >= -129) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        ((kf) this).field_q[var37] = (byte)var35;
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (((kf) this).field_q[var29] & 255);
                                                                                                  if (0 <= var30) {
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
                                                                                                ((kf) this).field_q[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + (var19 - -var38.i(-112));
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
                                                                                                        return;
                                                                                                      } else {
                                                                                                        L52: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (var52.field_g <= 0) {
                                                                                                            break L52;
                                                                                                          } else {
                                                                                                            var52.field_f = var38.i(-93);
                                                                                                            break L52;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L53: {
                                                                                                      var51 = var13[var27];
                                                                                                      if (0 >= var51.field_e) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var51.field_g = var38.i(-108);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_e = var38.i(-112);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L54: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_a) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var50.field_l = var38.i(-123);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            L55: {
                                                                                              if (var50.field_k == null) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var50.field_d = var38.i(-95);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if ((var50.field_b ^ -1) >= -1) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_i = var38.i(-101);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_b = var38.i(-91);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L57: {
                                                                                      var49 = var13[var27];
                                                                                      if (null == var49.field_a) {
                                                                                        break L57;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L58: while (true) {
                                                                                          if ((var29 ^ -1) <= (var49.field_a.length ^ -1)) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var19 = var38.i(-120) + var19 + 1;
                                                                                            var49.field_a[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L58;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L59: {
                                                                                  var48 = var13[var27];
                                                                                  if (null == var48.field_k) {
                                                                                    break L59;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L60: while (true) {
                                                                                      if (var48.field_k.length <= var29) {
                                                                                        break L59;
                                                                                      } else {
                                                                                        var19 = 1 + (var19 + var38.i(-83));
                                                                                        var48.field_k[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L60;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L61: {
                                                                              var45 = var13[var27];
                                                                              if (var45.field_a == null) {
                                                                                break L61;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L62: while (true) {
                                                                                  if (var29 >= var45.field_a.length) {
                                                                                    break L61;
                                                                                  } else {
                                                                                    var45.field_a[var29] = var38.g(0);
                                                                                    var29 += 2;
                                                                                    continue L62;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L63: {
                                                                              if (null == var45.field_k) {
                                                                                break L63;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L64: while (true) {
                                                                                  if (var29 >= var45.field_k.length - 2) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var45.field_k[var29] = var38.g(0);
                                                                                    var29 += 2;
                                                                                    continue L64;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L65: {
                                                                          if (var20 != 0) {
                                                                            break L65;
                                                                          } else {
                                                                            L66: {
                                                                              if (var21 >= var64.length) {
                                                                                var20 = -1;
                                                                                break L66;
                                                                              } else {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L66;
                                                                              }
                                                                            }
                                                                            if (-1 <= (((kf) this).field_o[var27] ^ -1)) {
                                                                              break L65;
                                                                            } else {
                                                                              var26 = 1 + var38.i(-128);
                                                                              break L65;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((kf) this).field_k[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L67: {
                                                                      if (((kf) this).field_o[var26] == 0) {
                                                                        break L67;
                                                                      } else {
                                                                        L68: {
                                                                          if (var20 != 0) {
                                                                            break L68;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var63[var21]];
                                                                            if ((var21 ^ -1) > (var67.length ^ -1)) {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L68;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L68;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((kf) this).field_r[var26] = (dl) var25;
                                                                        break L67;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L69: {
                                                                  if (-1 == (((kf) this).field_o[var25_int] ^ -1)) {
                                                                    break L69;
                                                                  } else {
                                                                    L70: {
                                                                      if ((var20 ^ -1) != -1) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (var66.length > var21) {
                                                                            int incrementValue$12 = var21;
                                                                            var21++;
                                                                            var20 = var7[incrementValue$12];
                                                                            break L71;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L71;
                                                                          }
                                                                        }
                                                                        int incrementValue$13 = var8;
                                                                        var8++;
                                                                        var24 = var38.field_o[incrementValue$13] + 16 << -1813321662;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((kf) this).field_q[var25_int] = (byte)var24;
                                                                    break L69;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L72: {
                                                              if (-1 == (((kf) this).field_o[var24] ^ -1)) {
                                                                break L72;
                                                              } else {
                                                                L73: {
                                                                  if (-1 != (var20 ^ -1)) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if ((var65.length ^ -1) >= (var21 ^ -1)) {
                                                                        var20 = -1;
                                                                        break L74;
                                                                      } else {
                                                                        int incrementValue$14 = var21;
                                                                        var21++;
                                                                        var20 = var4[incrementValue$14];
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    int incrementValue$15 = var5;
                                                                    var5++;
                                                                    var23 = var38.field_o[incrementValue$15] + -1;
                                                                    break L73;
                                                                  }
                                                                }
                                                                ((kf) this).field_l[var24] = (byte)var23;
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
                                                          if ((var20 ^ -1) != -1) {
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
                                                            var22 = var38.c((byte) 58);
                                                            break L75;
                                                          }
                                                        }
                                                        ((kf) this).field_p[var23] = (short)(((kf) this).field_p[var23] + ce.a(32768, -1 + var22 << 553767086));
                                                        ((kf) this).field_o[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.i(-98);
                                                    ((kf) this).field_p[var20] = (short)(((kf) this).field_p[var20] + (var19 << 1706272360));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.i(-78);
                                                ((kf) this).field_p[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.g(0);
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
                                      dl dupTemp$17 = new dl();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.i(-94);
                                      if (var16_int <= 0) {
                                        break L77;
                                      } else {
                                        var15.field_a = new byte[2 * var16_int];
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      var16_int = var38.i(-111);
                                      if (0 >= var16_int) {
                                        break L78;
                                      } else {
                                        var15.field_k = new byte[2 * var16_int - -2];
                                        var40.field_k[1] = (byte)64;
                                        break L78;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.g(0);
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
                        var7[var8] = var38.g(0);
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
                var4[var5] = var38.g(0);
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

    final static boolean d(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        Object var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) lg.field_d;
        synchronized (var1_ref) {
          L0: {
            if (ph.field_h != ta.field_y) {
              L1: {
                vg.field_a = ag.field_a[ph.field_h];
                d.field_Ib = hj.field_a[ph.field_h];
                if (param0 == 18954) {
                  break L1;
                } else {
                  var3 = null;
                  kf.a(-30, (byte) -26, (java.awt.Canvas) null, 72);
                  break L1;
                }
              }
              ph.field_h = 127 & 1 + ph.field_h;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0) {
        if (an.field_c) {
            rc.b(0);
        }
        if (param0 > -70) {
            kf.a(89);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Find opponent";
    }
}
