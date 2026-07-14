/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends ne {
    of[] field_n;
    static gp field_l;
    static String field_s;
    byte[] field_p;
    private int[] field_q;
    static String field_i;
    va[] field_k;
    int field_j;
    short[] field_r;
    byte[] field_m;
    static String field_t;
    byte[] field_o;

    final static boolean d(int param0) {
        if (param0 != 0) {
            field_l = null;
        }
        return sl.b(15000);
    }

    final boolean a(byte param0, lc param1, int[] param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        va var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        var5 = 1;
        if (param0 == 45) {
          var6 = 0;
          var7 = null;
          var8 = 0;
          L0: while (true) {
            if (-129 >= var8) {
              return var5 != 0;
            } else {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (-1 != param3[var8]) {
                    break L1;
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              }
              var9 = ((kk) this).field_q[var8];
              if (-1 != var9) {
                L2: {
                  if (var6 == var9) {
                    break L2;
                  } else {
                    L3: {
                      var6 = var9;
                      var9--;
                      if (-1 == (1 & var9)) {
                        var7 = param1.a(param2, var9 >> -548155134, -31164);
                        break L3;
                      } else {
                        var7 = param1.a(param2, (byte) -97, var9 >> -944245278);
                        break L3;
                      }
                    }
                    if (var7 != null) {
                      break L2;
                    } else {
                      var5 = 0;
                      break L2;
                    }
                  }
                }
                if (var7 != null) {
                  ((kk) this).field_k[var8] = var7;
                  ((kk) this).field_q[var8] = 0;
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

    final void a(byte param0) {
        ((kk) this).field_q = null;
        if (param0 != -97) {
            kk.a(95);
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_t = null;
        field_s = null;
        if (param0 != 0) {
            field_s = null;
        }
        field_l = null;
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        int var9_int = 0;
        int var11 = 0;
        int var12 = DungeonAssault.field_K;
        if (param3 != 48) {
            field_s = null;
        }
        int var4 = param0.length();
        int var5 = param1.length();
        int var6 = param2.length();
        if (!(var5 != 0)) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            var9_int = 0;
            while (true) {
                var9_int = param0.indexOf(param1, var9_int);
                if (0 > var9_int) {
                    break;
                }
                var7 = var7 + var8;
                var9_int = var9_int + var5;
            }
        }
        StringBuilder var9 = new StringBuilder(var7);
        int var10 = 0;
        while (true) {
            var11 = param0.indexOf(param1, var10);
            if (0 > var11) {
                break;
            }
            StringBuilder discarded$0 = var9.append(param0.substring(var10, var11));
            StringBuilder discarded$1 = var9.append(param2);
            var10 = var11 - -var5;
        }
        StringBuilder discarded$2 = var9.append(param0.substring(var10));
        return var9.toString();
    }

    final static tj a(nh param0, nh param1, String param2, int param3, String param4) {
        int var5 = param1.a(param4, param3 + 1000);
        int var6 = param1.a(param3, param2, var5);
        return ef.a(param3 + 61, var5, param1, var6, param0);
    }

    final static boolean a(nh param0, int param1, int param2, int param3) {
        byte[] var6 = param0.b(5, param2, param3);
        byte[] var4 = var6;
        if (var6 == null) {
            return false;
        }
        tn.a(param1 + 105, var6);
        if (param1 != 1) {
            Object var5 = null;
            boolean discarded$0 = kk.a((nh) null, -46, 0, -57);
            return true;
        }
        return true;
    }

    kk(byte[] param0) {
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
        of[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        of var15 = null;
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
        of var25_ref = null;
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
        ec var38 = null;
        byte[] var39 = null;
        of var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        of var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        of var48 = null;
        of var49 = null;
        of var50 = null;
        of var51 = null;
        of var52 = null;
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
        ((kk) this).field_o = new byte[128];
        ((kk) this).field_q = new int[128];
        ((kk) this).field_k = new va[128];
        ((kk) this).field_n = new of[128];
        ((kk) this).field_r = new short[128];
        ((kk) this).field_m = new byte[128];
        ((kk) this).field_p = new byte[128];
        var38 = new ec(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_m[var38.field_o - -var3] == 0) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var3++;
                var38.field_o = var38.field_o + 1;
                var5 = var38.field_o;
                var38.field_o = var38.field_o + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_m[var38.field_o + var6] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var38.field_o = var38.field_o + 1;
                        var6++;
                        var8 = var38.field_o;
                        var38.field_o = var38.field_o + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_m[var38.field_o - -var9] == 0) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var38.field_o = var38.field_o + 1;
                                  var9++;
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
                                          var15_int = var38.c(true);
                                          if (var15_int != 0) {
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
                                var13 = new of[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.c(true);
                                      if ((var14 ^ -1) < -1) {
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
                                      var14 = var38.c(true);
                                      if (-1 <= (var14 ^ -1)) {
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
                                      if (-1 == (var38.field_m[var17 + var38.field_o] ^ -1)) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var17++;
                                            var38.field_o = var38.field_o + 1;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if ((var20 ^ -1) <= -129) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (-129 >= (var23 ^ -1)) {
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 <= -129) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (-129 >= (var25_int ^ -1)) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if ((var27 ^ -1) <= -129) {
                                                                        ((kk) this).field_j = 1 + var38.c(true);
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
                                                                                    var15_array[var27] = var38.a((byte) 2);
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
                                                                                    var16[var27] = var38.a((byte) 2);
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
                                                                                        var19 = var38.c(true);
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
                                                                                                  if (var70.length <= var29) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((kk) this).field_m[var30] = (byte)(32 + ((kk) this).field_m[var30] * var28 >> 280799750);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[var29 + 1];
                                                                                                    var32 = (-var27 + var30) / 2 + var28 * (-var27 + var30);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = cp.f(105, -var27 + var30, var32);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((kk) this).field_m[var33] = (byte)(var34 * ((kk) this).field_m[var33] - -32 >> 203718694);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((kk) this).field_m[var29] = (byte)(32 + ((kk) this).field_m[var29] * var28 >> -984101306);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.c(true) + (1 + var19);
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 != null) {
                                                                                        var19 = var38.c(true);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 293865633;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var47.length) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 <= -129) {
                                                                                                        var27 = 0;
                                                                                                        L40: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L35;
                                                                                                          } else {
                                                                                                            var13[var27].field_c = var38.c(true);
                                                                                                            var27++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L41: {
                                                                                                          var31 = var28 + (((kk) this).field_p[var30] & 255);
                                                                                                          if (-1 <= var31) {
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
                                                                                                        ((kk) this).field_p[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 + 1] << 1205199905;
                                                                                                    var32 = (var30 + -var27) / 2 + var28 * (-var27 + var30);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L43: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L44: {
                                                                                                          var34 = cp.f(-63, var30 + -var27, var32);
                                                                                                          var35 = (255 & ((kk) this).field_p[var37]) - -var34;
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
                                                                                                        ((kk) this).field_p[var37] = (byte)var35;
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var37++;
                                                                                                        continue L43;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L46: {
                                                                                                  var30 = (((kk) this).field_p[var29] & 255) - -var28;
                                                                                                  if (-1 >= (var30 ^ -1)) {
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
                                                                                                ((kk) this).field_p[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 + var38.c(true);
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
                                                                                            var13[var27].field_c = var38.c(true);
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
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                  } else {
                                                                                                    var52 = var13[var27];
                                                                                                    if (-1 > (var52.field_h ^ -1)) {
                                                                                                      var52.field_a = var38.c(true);
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
                                                                                                if (var51.field_i > 0) {
                                                                                                  var51.field_h = var38.c(true);
                                                                                                  var27++;
                                                                                                  continue L51;
                                                                                                } else {
                                                                                                  var27++;
                                                                                                  continue L51;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_i = var38.c(true);
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L53: {
                                                                                          var50 = var13[var27];
                                                                                          if (null == var50.field_n) {
                                                                                            break L53;
                                                                                          } else {
                                                                                            var50.field_e = var38.c(true);
                                                                                            break L53;
                                                                                          }
                                                                                        }
                                                                                        L54: {
                                                                                          if (null == var50.field_o) {
                                                                                            break L54;
                                                                                          } else {
                                                                                            var50.field_m = var38.c(true);
                                                                                            break L54;
                                                                                          }
                                                                                        }
                                                                                        if (var50.field_c > 0) {
                                                                                          var50.field_b = var38.c(true);
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
                                                                                    if (var49.field_n != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L55: while (true) {
                                                                                        if (var29 < var49.field_n.length) {
                                                                                          var19 = 1 + (var19 - -var38.c(true));
                                                                                          var49.field_n[var29] = (byte)var19;
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
                                                                                if (var48.field_o != null) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L56: while (true) {
                                                                                    if (var29 < var48.field_o.length) {
                                                                                      var19 = var38.c(true) + var19 + 1;
                                                                                      var48.field_o[var29] = (byte)var19;
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
                                                                              if (var45.field_n == null) {
                                                                                break L57;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L58: while (true) {
                                                                                  if (var45.field_n.length <= var29) {
                                                                                    break L57;
                                                                                  } else {
                                                                                    var45.field_n[var29] = var38.a((byte) 2);
                                                                                    var29 += 2;
                                                                                    continue L58;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var45.field_o != null) {
                                                                              var29 = 3;
                                                                              L59: while (true) {
                                                                                if (-2 + var45.field_o.length > var29) {
                                                                                  var45.field_o[var29] = var38.a((byte) 2);
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
                                                                          if (0 != var20) {
                                                                            break L60;
                                                                          } else {
                                                                            L61: {
                                                                              if (var66.length > var21) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L61;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L61;
                                                                              }
                                                                            }
                                                                            if (0 >= ((kk) this).field_q[var27]) {
                                                                              break L60;
                                                                            } else {
                                                                              var26 = var38.c(true) + 1;
                                                                              break L60;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((kk) this).field_m[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (-1 != ((kk) this).field_q[var26]) {
                                                                      L62: {
                                                                        if (-1 != var20) {
                                                                          break L62;
                                                                        } else {
                                                                          var25_ref = var13[var65[var21]];
                                                                          if (var21 < var69.length) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L62;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L62;
                                                                          }
                                                                        }
                                                                      }
                                                                      ((kk) this).field_n[var26] = var25_ref;
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
                                                                if (((kk) this).field_q[var25_int] != 0) {
                                                                  L63: {
                                                                    if (var20 != 0) {
                                                                      break L63;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = var38.field_m[var8] - -16 << 808109474;
                                                                      if (var68.length > var21) {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L63;
                                                                      } else {
                                                                        var20 = -1;
                                                                        break L63;
                                                                      }
                                                                    }
                                                                  }
                                                                  ((kk) this).field_p[var25_int] = (byte)var24;
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
                                                            if (0 != ((kk) this).field_q[var24]) {
                                                              L64: {
                                                                if (-1 != var20) {
                                                                  break L64;
                                                                } else {
                                                                  var5++;
                                                                  var23 = var38.field_m[var5] - 1;
                                                                  if (var21 >= var67.length) {
                                                                    var20 = -1;
                                                                    break L64;
                                                                  } else {
                                                                    var21++;
                                                                    var20 = var4[var21];
                                                                    break L64;
                                                                  }
                                                                }
                                                              }
                                                              var20--;
                                                              ((kk) this).field_o[var24] = (byte)var23;
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
                                                            var22 = var38.e(-651413500);
                                                            break L65;
                                                          }
                                                        }
                                                        ((kk) this).field_r[var23] = (short)(((kk) this).field_r[var23] + (nb.a(-1 + var22, 2) << -729190578));
                                                        ((kk) this).field_q[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.c(true);
                                                    ((kk) this).field_r[var20] = (short)(((kk) this).field_r[var20] + (var19 << -68982072));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.c(true);
                                                ((kk) this).field_r[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.a((byte) 2);
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
                                      var13[var14] = new of();
                                      var40 = new of();
                                      var15 = var40;
                                      var16_int = var38.c(true);
                                      if ((var16_int ^ -1) >= -1) {
                                        break L67;
                                      } else {
                                        var15.field_n = new byte[var16_int * 2];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.c(true);
                                    if (var16_int > 0) {
                                      var15.field_o = new byte[var16_int * 2 + 2];
                                      var40.field_o[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.a((byte) 2);
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
                        var7[var8] = var38.a((byte) 2);
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
                var4[var5] = var38.a((byte) 2);
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
        field_s = "Renown: <col=DB0100><%0></col>";
        field_i = "Pit Demon";
        field_t = "Please try again in a few minutes.";
    }
}
