/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends wl {
    private int[] field_i;
    static o[] field_j;
    byte[] field_q;
    static long field_m;
    static int[] field_s;
    static volatile int field_p;
    byte[] field_l;
    short[] field_r;
    int field_n;
    je[] field_k;
    byte[] field_o;
    q[] field_t;

    final boolean a(byte[] param0, ue param1, int param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        je var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = wizardrun.field_H;
        var6 = -67 % ((59 - param2) / 57);
        var5 = 1;
        var7 = 0;
        var8 = null;
        var9 = 0;
        L0: while (true) {
          if (var9 >= 128) {
            return var5 != 0;
          } else {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0[var9] != 0) {
                  break L1;
                } else {
                  var9++;
                  continue L0;
                }
              }
            }
            var10 = ((h) this).field_i[var9];
            if (var10 != 0) {
              L2: {
                if (var10 != var7) {
                  L3: {
                    var7 = var10;
                    var10--;
                    if ((1 & var10) == 0) {
                      var8 = param1.b(-32480, param3, var10 >> -93786526);
                      break L3;
                    } else {
                      var8 = param1.a(19830, param3, var10 >> -897229502);
                      break L3;
                    }
                  }
                  if (var8 == null) {
                    var5 = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (var8 != null) {
                ((h) this).field_k[var9] = var8;
                ((h) this).field_i[var9] = 0;
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    final static boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (-11 < (ml.field_t ^ -1)) {
                break L1;
              } else {
                if (qb.field_p) {
                  break L1;
                } else {
                  if (wj.a(0)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final static boolean a(int param0, int param1, kl param2, int param3) {
        if (param3 > -113) {
            return true;
        }
        byte[] var5 = param2.a(param1, param0, 1);
        byte[] var4 = var5;
        if (var5 == null) {
            return false;
        }
        jg.a(var5, true);
        return true;
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (!(!param0)) {
            var4 += 4;
        }
        if (param3 != 26505) {
            Object var5 = null;
            boolean discarded$0 = h.a(-70, -30, (kl) null, 2);
        }
        if (!(!param2)) {
            var4 += 2;
        }
        if (!(!param1)) {
            var4++;
        }
        return ia.field_p[var4];
    }

    final void a(int param0) {
        int var2 = -16 / ((param0 - 53) / 58);
        ((h) this).field_i = null;
    }

    public static void c(boolean param0) {
        if (!param0) {
            Object var2 = null;
            boolean discarded$0 = h.a(109, -121, (kl) null, -59);
        }
        field_j = null;
        field_s = null;
    }

    h(byte[] param0) {
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
        q[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        q var15 = null;
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
        q var25_ref = null;
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
        va var38 = null;
        byte[] var39 = null;
        q var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        q var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        q var48 = null;
        q var49 = null;
        q var50 = null;
        q var51 = null;
        q var52 = null;
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
        ((h) this).field_r = new short[128];
        ((h) this).field_l = new byte[128];
        ((h) this).field_q = new byte[128];
        ((h) this).field_i = new int[128];
        ((h) this).field_o = new byte[128];
        ((h) this).field_k = new je[128];
        ((h) this).field_t = new q[128];
        var38 = new va(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_k[var3 + var38.field_m] == 0) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_m = var38.field_m + 1;
                var3++;
                var5 = var38.field_m;
                var38.field_m = var38.field_m + var3;
                var6 = 0;
                L2: while (true) {
                  if (-1 == (var38.field_k[var6 + var38.field_m] ^ -1)) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var38.field_m = var38.field_m + 1;
                        var6++;
                        var8 = var38.field_m;
                        var38.field_m = var38.field_m + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (0 == var38.field_k[var9 + var38.field_m]) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var38.field_m = var38.field_m + 1;
                                  var9++;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (1 < var9) {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.f(255);
                                          if (0 == var15_int) {
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
                                var13 = new q[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.f(255);
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
                                      var14 = var38.f(255);
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
                                    var70 = stackIn_41_0;
                                    var64 = var70;
                                    var58 = var64;
                                    var47 = var58;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_k[var17 + var38.field_m] == 0) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var19 >= var17) {
                                            var17++;
                                            var38.field_m = var38.field_m + 1;
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
                                                          if (var24 <= -129) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (128 <= var25_int) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if ((var27 ^ -1) <= -129) {
                                                                        ((h) this).field_n = 1 + var38.f(255);
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
                                                                                    var15_array[var27] = var38.k(0);
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
                                                                                    var16[var27] = var38.k(0);
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
                                                                                      L30: {
                                                                                        if (var15_array != null) {
                                                                                          var19 = var38.f(255);
                                                                                          var15_array[0] = (byte)var19;
                                                                                          var27 = 2;
                                                                                          L31: while (true) {
                                                                                            if (var46.length <= var27) {
                                                                                              var27 = var46[0];
                                                                                              var28 = var46[1];
                                                                                              var29 = 0;
                                                                                              L32: while (true) {
                                                                                                if (var27 <= var29) {
                                                                                                  var29 = 2;
                                                                                                  L33: while (true) {
                                                                                                    if (var29 >= var46.length) {
                                                                                                      var15_array = null;
                                                                                                      var30 = var27;
                                                                                                      L34: while (true) {
                                                                                                        if (128 <= var30) {
                                                                                                          if (var16 == null) {
                                                                                                            break L29;
                                                                                                          } else {
                                                                                                            var19 = var38.f(255);
                                                                                                            var16[0] = (byte)var19;
                                                                                                            var27 = 2;
                                                                                                            L35: while (true) {
                                                                                                              if (var27 >= var70.length) {
                                                                                                                break L30;
                                                                                                              } else {
                                                                                                                var19 = var38.f(255) + 1 + var19;
                                                                                                                var16[var27] = (byte)var19;
                                                                                                                var27 += 2;
                                                                                                                continue L35;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          ((h) this).field_q[var30] = (byte)(var28 * ((h) this).field_q[var30] - -32 >> 27916070);
                                                                                                          var30++;
                                                                                                          continue L34;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var30 = var46[var29];
                                                                                                      var31 = var15_array[var29 + 1];
                                                                                                      var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
                                                                                                      var33 = var27;
                                                                                                      L36: while (true) {
                                                                                                        if (var30 <= var33) {
                                                                                                          var28 = var31;
                                                                                                          var27 = var30;
                                                                                                          var29 += 2;
                                                                                                          continue L33;
                                                                                                        } else {
                                                                                                          var34 = pf.a(var32, 115, -var27 + var30);
                                                                                                          var32 = var32 + (var31 + -var28);
                                                                                                          ((h) this).field_q[var33] = (byte)(32 + ((h) this).field_q[var33] * var34 >> 311521446);
                                                                                                          var33++;
                                                                                                          continue L36;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  ((h) this).field_q[var29] = (byte)(32 + var28 * ((h) this).field_q[var29] >> -929684538);
                                                                                                  var29++;
                                                                                                  continue L32;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var19 = var38.f(255) + var19 - -1;
                                                                                              var15_array[var27] = (byte)var19;
                                                                                              var27 += 2;
                                                                                              continue L31;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          if (var16 == null) {
                                                                                            break L29;
                                                                                          } else {
                                                                                            var19 = var38.f(255);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var70.length) {
                                                                                                break L30;
                                                                                              } else {
                                                                                                var19 = var38.f(255) + 1 + var19;
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var27 = var70[0];
                                                                                      var28 = var70[1] << -913840639;
                                                                                      var29 = 0;
                                                                                      L38: while (true) {
                                                                                        if (var27 <= var29) {
                                                                                          var29 = 2;
                                                                                          L39: while (true) {
                                                                                            if (var29 >= var70.length) {
                                                                                              var16 = null;
                                                                                              var30 = var27;
                                                                                              L40: while (true) {
                                                                                                if (var30 >= 128) {
                                                                                                  break L29;
                                                                                                } else {
                                                                                                  L41: {
                                                                                                    var31 = var28 + (((h) this).field_o[var30] & 255);
                                                                                                    if (0 <= var31) {
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
                                                                                                  ((h) this).field_o[var30] = (byte)var31;
                                                                                                  var30++;
                                                                                                  continue L40;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var30 = var70[var29];
                                                                                              var31 = var16[1 + var29] << -375453663;
                                                                                              var32 = var28 * (-var27 + var30) + (var30 - var27) / 2;
                                                                                              var37 = var27;
                                                                                              var33 = var37;
                                                                                              L43: while (true) {
                                                                                                if (var37 >= var30) {
                                                                                                  var27 = var30;
                                                                                                  var28 = var31;
                                                                                                  var29 += 2;
                                                                                                  continue L39;
                                                                                                } else {
                                                                                                  L44: {
                                                                                                    var34 = pf.a(var32, 125, -var27 + var30);
                                                                                                    var35 = var34 + (((h) this).field_o[var37] & 255);
                                                                                                    if (0 <= var35) {
                                                                                                      break L44;
                                                                                                    } else {
                                                                                                      var35 = 0;
                                                                                                      break L44;
                                                                                                    }
                                                                                                  }
                                                                                                  L45: {
                                                                                                    if (var35 <= 128) {
                                                                                                      break L45;
                                                                                                    } else {
                                                                                                      var35 = 128;
                                                                                                      break L45;
                                                                                                    }
                                                                                                  }
                                                                                                  ((h) this).field_o[var37] = (byte)var35;
                                                                                                  var32 = var32 + (var31 - var28);
                                                                                                  var37++;
                                                                                                  continue L43;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          L46: {
                                                                                            var30 = (((h) this).field_o[var29] & 255) - -var28;
                                                                                            if (var30 >= 0) {
                                                                                              break L46;
                                                                                            } else {
                                                                                              var30 = 0;
                                                                                              break L46;
                                                                                            }
                                                                                          }
                                                                                          L47: {
                                                                                            if (-129 <= (var30 ^ -1)) {
                                                                                              break L47;
                                                                                            } else {
                                                                                              var30 = 128;
                                                                                              break L47;
                                                                                            }
                                                                                          }
                                                                                          ((h) this).field_o[var29] = (byte)var30;
                                                                                          var29++;
                                                                                          continue L38;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L48: while (true) {
                                                                                      if (var12 <= var27) {
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
                                                                                                        if ((var52.field_e ^ -1) < -1) {
                                                                                                          var52.field_a = var38.f(255);
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
                                                                                                    if (-1 > (var51.field_k ^ -1)) {
                                                                                                      var51.field_e = var38.f(255);
                                                                                                      var27++;
                                                                                                      continue L51;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L51;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_k = var38.f(255);
                                                                                                var27++;
                                                                                                continue L50;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L53: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_f) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_i = var38.f(255);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            L54: {
                                                                                              if (null == var50.field_c) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var50.field_j = var38.f(255);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            if ((var50.field_h ^ -1) < -1) {
                                                                                              var50.field_d = var38.f(255);
                                                                                              var27++;
                                                                                              continue L49;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L49;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_h = var38.f(255);
                                                                                        var27++;
                                                                                        continue L48;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (null != var49.field_f) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L55: while (true) {
                                                                                        if (var49.field_f.length > var29) {
                                                                                          var19 = var19 + (1 + var38.f(255));
                                                                                          var49.field_f[var29] = (byte)var19;
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
                                                                                if (null != var48.field_c) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L56: while (true) {
                                                                                    if (var29 < var48.field_c.length) {
                                                                                      var19 = var38.f(255) + (1 + var19);
                                                                                      var48.field_c[var29] = (byte)var19;
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
                                                                              if (null == var45.field_f) {
                                                                                break L57;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L58: while (true) {
                                                                                  if (var29 >= var45.field_f.length) {
                                                                                    break L57;
                                                                                  } else {
                                                                                    var45.field_f[var29] = var38.k(0);
                                                                                    var29 += 2;
                                                                                    continue L58;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_c) {
                                                                              var29 = 3;
                                                                              L59: while (true) {
                                                                                if (var29 < -2 + var45.field_c.length) {
                                                                                  var45.field_c[var29] = var38.k(0);
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
                                                                              if (var21 < var66.length) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L61;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L61;
                                                                              }
                                                                            }
                                                                            if (0 >= ((h) this).field_i[var27]) {
                                                                              break L60;
                                                                            } else {
                                                                              var26 = 1 + var38.f(255);
                                                                              break L60;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((h) this).field_q[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((h) this).field_i[var26] != 0) {
                                                                      L62: {
                                                                        if (var20 != 0) {
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
                                                                      ((h) this).field_t[var26] = var25_ref;
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
                                                                if (-1 != (((h) this).field_i[var25_int] ^ -1)) {
                                                                  L63: {
                                                                    if (var20 != 0) {
                                                                      break L63;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = var38.field_k[var8] - -16 << -2021932958;
                                                                      if (var68.length <= var21) {
                                                                        var20 = -1;
                                                                        break L63;
                                                                      } else {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L63;
                                                                      }
                                                                    }
                                                                  }
                                                                  var20--;
                                                                  ((h) this).field_o[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (-1 != ((h) this).field_i[var24]) {
                                                              L64: {
                                                                if (0 != var20) {
                                                                  break L64;
                                                                } else {
                                                                  L65: {
                                                                    if (var21 >= var67.length) {
                                                                      var20 = -1;
                                                                      break L65;
                                                                    } else {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L65;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = -1 + var38.field_k[var5];
                                                                  break L64;
                                                                }
                                                              }
                                                              ((h) this).field_l[var24] = (byte)var23;
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
                                                              if (var21 < var66.length) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L67;
                                                              } else {
                                                                var20 = -1;
                                                                break L67;
                                                              }
                                                            }
                                                            var22 = var38.f((byte) -90);
                                                            break L66;
                                                          }
                                                        }
                                                        ((h) this).field_r[var23] = (short)(((h) this).field_r[var23] + kl.b(32768, -1 + var22 << 4300814));
                                                        ((h) this).field_i[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.f(255);
                                                    ((h) this).field_r[var20] = (short)(((h) this).field_r[var20] + (var19 << -564480888));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.f(255);
                                                ((h) this).field_r[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.k(0);
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
                                      var13[var14] = new q();
                                      var40 = new q();
                                      var15 = var40;
                                      var16_int = var38.f(255);
                                      if (-1 <= (var16_int ^ -1)) {
                                        break L68;
                                      } else {
                                        var15.field_f = new byte[2 * var16_int];
                                        break L68;
                                      }
                                    }
                                    var16_int = var38.f(255);
                                    if ((var16_int ^ -1) < -1) {
                                      var15.field_c = new byte[var16_int * 2 + 2];
                                      var40.field_c[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.k(0);
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
                        var7[var8] = var38.k(0);
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
                var4[var5] = var38.k(0);
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
        field_p = 0;
    }
}
