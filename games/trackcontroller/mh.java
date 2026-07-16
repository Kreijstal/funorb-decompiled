/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends fc {
    static String[] field_k;
    short[] field_q;
    byte[] field_l;
    private int[] field_n;
    int field_m;
    byte[] field_r;
    uh[] field_p;
    static boolean field_i;
    byte[] field_j;
    ik[] field_o;

    final void f(int param0) {
        if (param0 != 21645) {
            ((mh) this).f(21);
        }
        ((mh) this).field_n = null;
    }

    final boolean a(byte[] param0, int[] param1, byte param2, jc param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TrackController.field_F ? 1 : 0;
        var5 = 1;
        var6 = 0;
        if (param2 <= -29) {
          var7 = null;
          var8 = 0;
          L0: while (true) {
            if ((var8 ^ -1) <= -129) {
              return var5 != 0;
            } else {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (0 != param0[var8]) {
                    break L1;
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              }
              var9 = ((mh) this).field_n[var8];
              if (var9 != 0) {
                L2: {
                  if (var9 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var6 = var9;
                      var9--;
                      if ((var9 & 1) == 0) {
                        var7 = (Object) (Object) param3.a(param1, false, var9 >> 87380994);
                        break L3;
                      } else {
                        var7 = (Object) (Object) param3.a(param1, -2059411540, var9 >> -899237790);
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
                  ((mh) this).field_o[var8] = (ik) var7;
                  ((mh) this).field_n[var8] = 0;
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
          return false;
        }
    }

    final static boolean e(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) cj.field_o;
        synchronized (var1_ref) {
          L0: {
            if (lj.field_d != fc.field_d) {
              kg.field_d = mc.field_K[lj.field_d];
              md.field_d = tk.field_o[lj.field_d];
              lj.field_d = 1 + lj.field_d & param0;
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    public static void d(int param0) {
        if (param0 != -24011) {
            field_i = false;
        }
        field_k = null;
    }

    mh(byte[] param0) {
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
        uh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        uh var15 = null;
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
        be var38 = null;
        byte[] var39 = null;
        uh var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        uh var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        uh var48 = null;
        uh var49 = null;
        uh var50 = null;
        uh var51 = null;
        uh var52 = null;
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
        ((mh) this).field_r = new byte[128];
        ((mh) this).field_j = new byte[128];
        ((mh) this).field_l = new byte[128];
        ((mh) this).field_q = new short[128];
        ((mh) this).field_n = new int[128];
        ((mh) this).field_p = new uh[128];
        ((mh) this).field_o = new ik[128];
        var38 = new be(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_j[var3 + var38.field_k] ^ -1)) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_k = var38.field_k + 1;
                var5 = var38.field_k;
                var38.field_k = var38.field_k + var3;
                var6 = 0;
                L2: while (true) {
                  if ((var38.field_j[var6 + var38.field_k] ^ -1) == -1) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
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
                          if ((var38.field_j[var38.field_k - -var9] ^ -1) == -1) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var38.field_k = var38.field_k + 1;
                                  var9++;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (-2 <= (var9 ^ -1)) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if ((var9 ^ -1) >= (var14 ^ -1)) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.h(16383);
                                          if ((var15_int ^ -1) != -1) {
                                            L9: {
                                              if ((var13_int ^ -1) > (var15_int ^ -1)) {
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
                                var13 = new uh[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if ((var13.length ^ -1) >= (var14 ^ -1)) {
                                    L11: {
                                      var14 = var38.h(16383);
                                      if (0 >= var14) {
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
                                      var14 = var38.h(16383);
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
                                    var70 = stackIn_41_0;
                                    var64 = var70;
                                    var58 = var64;
                                    var47 = var58;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (-1 == (var38.field_j[var38.field_k - -var17] ^ -1)) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if ((var19 ^ -1) <= (var17 ^ -1)) {
                                            var38.field_k = var38.field_k + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
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
                                                              if (128 <= var25_int) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var26 ^ -1)) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var27) {
                                                                        ((mh) this).field_m = var38.h(16383) - -1;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if ((var46.length ^ -1) >= (var27 ^ -1)) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.f(-128);
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
                                                                                  if ((var27 ^ -1) <= (var70.length ^ -1)) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.f(-127);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.h(16383);
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
                                                                                                  if (var46.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((mh) this).field_j[var30] = (byte)(((mh) this).field_j[var30] * var28 - -32 >> 1690542374);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = (var30 + -var27) * var28 - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = mf.a(-var27 + var30, 14, var32);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((mh) this).field_j[var33] = (byte)(((mh) this).field_j[var33] * var34 - -32 >> 1477188902);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((mh) this).field_j[var29] = (byte)(((mh) this).field_j[var29] * var28 - -32 >> -920856602);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 - -1 + var38.h(16383);
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 != null) {
                                                                                        var19 = var38.h(16383);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if ((var27 ^ -1) <= (var70.length ^ -1)) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1] << 649052801;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if ((var30 ^ -1) <= -129) {
                                                                                                        var27 = 0;
                                                                                                        L40: while (true) {
                                                                                                          if (var27 >= var12) {
                                                                                                            break L35;
                                                                                                          } else {
                                                                                                            var13[var27].field_j = var38.h(16383);
                                                                                                            var27++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L41: {
                                                                                                          var31 = (255 & ((mh) this).field_r[var30]) - -var28;
                                                                                                          if (0 <= var31) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        L42: {
                                                                                                          if ((var31 ^ -1) >= -129) {
                                                                                                            break L42;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L42;
                                                                                                          }
                                                                                                        }
                                                                                                        ((mh) this).field_r[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var16[1 + var29] << 1400793761;
                                                                                                    var32 = var28 * (var30 + -var27) - -((var30 - var27) / 2);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L43: while (true) {
                                                                                                      if ((var30 ^ -1) >= (var37 ^ -1)) {
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L44: {
                                                                                                          var34 = mf.a(-var27 + var30, 14, var32);
                                                                                                          var35 = var34 + (255 & ((mh) this).field_r[var37]);
                                                                                                          if ((var35 ^ -1) <= -1) {
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
                                                                                                        ((mh) this).field_r[var37] = (byte)var35;
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        var37++;
                                                                                                        continue L43;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L46: {
                                                                                                  var30 = var28 + (((mh) this).field_r[var29] & 255);
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
                                                                                                ((mh) this).field_r[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.h(16383) + var19 - -1;
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
                                                                                            var13[var27].field_j = var38.h(16383);
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
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                                                                    return;
                                                                                                  } else {
                                                                                                    L53: {
                                                                                                      var52 = var13[var27];
                                                                                                      if (-1 <= (var52.field_h ^ -1)) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var52.field_l = var38.h(16383);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L52;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L54: {
                                                                                                  var51 = var13[var27];
                                                                                                  if (0 >= var51.field_a) {
                                                                                                    break L54;
                                                                                                  } else {
                                                                                                    var51.field_h = var38.h(16383);
                                                                                                    break L54;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L51;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_a = var38.h(16383);
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L55: {
                                                                                          var50 = var13[var27];
                                                                                          if (var50.field_c == null) {
                                                                                            break L55;
                                                                                          } else {
                                                                                            var50.field_f = var38.h(16383);
                                                                                            break L55;
                                                                                          }
                                                                                        }
                                                                                        L56: {
                                                                                          if (null == var50.field_i) {
                                                                                            break L56;
                                                                                          } else {
                                                                                            var50.field_g = var38.h(16383);
                                                                                            break L56;
                                                                                          }
                                                                                        }
                                                                                        L57: {
                                                                                          if (var50.field_j <= 0) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var50.field_k = var38.h(16383);
                                                                                            break L57;
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L49;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L58: {
                                                                                      var49 = var13[var27];
                                                                                      if (null == var49.field_c) {
                                                                                        break L58;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L59: while (true) {
                                                                                          if (var29 >= var49.field_c.length) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = var38.h(16383) + (1 + var19);
                                                                                            var49.field_c[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L59;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L60: {
                                                                                  var48 = var13[var27];
                                                                                  if (null == var48.field_i) {
                                                                                    break L60;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L61: while (true) {
                                                                                      if ((var29 ^ -1) <= (var48.field_i.length ^ -1)) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = var19 - -1 + var38.h(16383);
                                                                                        var48.field_i[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L61;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L62: {
                                                                              var45 = var13[var27];
                                                                              if (var45.field_c == null) {
                                                                                break L62;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L63: while (true) {
                                                                                  if ((var29 ^ -1) <= (var45.field_c.length ^ -1)) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var45.field_c[var29] = var38.f(-126);
                                                                                    var29 += 2;
                                                                                    continue L63;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L64: {
                                                                              if (null == var45.field_i) {
                                                                                break L64;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L65: while (true) {
                                                                                  if (var45.field_i.length - 2 <= var29) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var45.field_i[var29] = var38.f(-128);
                                                                                    var29 += 2;
                                                                                    continue L65;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L66: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L66;
                                                                          } else {
                                                                            L67: {
                                                                              if ((var21 ^ -1) > (var66.length ^ -1)) {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L67;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L67;
                                                                              }
                                                                            }
                                                                            if (-1 <= (((mh) this).field_n[var27] ^ -1)) {
                                                                              break L66;
                                                                            } else {
                                                                              var26 = 1 + var38.h(16383);
                                                                              break L66;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((mh) this).field_j[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L68: {
                                                                      if ((((mh) this).field_n[var26] ^ -1) == -1) {
                                                                        break L68;
                                                                      } else {
                                                                        L69: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L69;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var65[var21]];
                                                                            if ((var21 ^ -1) <= (var69.length ^ -1)) {
                                                                              var20 = -1;
                                                                              break L69;
                                                                            } else {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L69;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((mh) this).field_p[var26] = (uh) var25;
                                                                        break L68;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L70: {
                                                                  if (0 == ((mh) this).field_n[var25_int]) {
                                                                    break L70;
                                                                  } else {
                                                                    L71: {
                                                                      if (0 != var20) {
                                                                        break L71;
                                                                      } else {
                                                                        int incrementValue$12 = var8;
                                                                        var8++;
                                                                        var24 = var38.field_j[incrementValue$12] - -16 << -406894174;
                                                                        if ((var21 ^ -1) > (var68.length ^ -1)) {
                                                                          int incrementValue$13 = var21;
                                                                          var21++;
                                                                          var20 = var7[incrementValue$13];
                                                                          break L71;
                                                                        } else {
                                                                          var20 = -1;
                                                                          break L71;
                                                                        }
                                                                      }
                                                                    }
                                                                    ((mh) this).field_r[var25_int] = (byte)var24;
                                                                    var20--;
                                                                    break L70;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L72: {
                                                              if (-1 == (((mh) this).field_n[var24] ^ -1)) {
                                                                break L72;
                                                              } else {
                                                                L73: {
                                                                  if (0 != var20) {
                                                                    break L73;
                                                                  } else {
                                                                    int incrementValue$14 = var5;
                                                                    var5++;
                                                                    var23 = var38.field_j[incrementValue$14] - 1;
                                                                    if ((var67.length ^ -1) >= (var21 ^ -1)) {
                                                                      var20 = -1;
                                                                      break L73;
                                                                    } else {
                                                                      int incrementValue$15 = var21;
                                                                      var21++;
                                                                      var20 = var4[incrementValue$15];
                                                                      break L73;
                                                                    }
                                                                  }
                                                                }
                                                                var20--;
                                                                ((mh) this).field_l[var24] = (byte)var23;
                                                                break L72;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L74: {
                                                          if (0 != var20) {
                                                            break L74;
                                                          } else {
                                                            L75: {
                                                              if (var21 < var66.length) {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L75;
                                                              } else {
                                                                var20 = -1;
                                                                break L75;
                                                              }
                                                            }
                                                            var22 = var38.m(127);
                                                            break L74;
                                                          }
                                                        }
                                                        ((mh) this).field_q[var23] = (short)(((mh) this).field_q[var23] + tc.a(-1 + var22 << 1195177710, 32768));
                                                        ((mh) this).field_n[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.h(16383);
                                                    ((mh) this).field_q[var20] = (short)(((mh) this).field_q[var20] + (var19 << -1427565496));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.h(16383);
                                                ((mh) this).field_q[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.f(-128);
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
                                    L76: {
                                      uh dupTemp$17 = new uh();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.h(16383);
                                      if (var16_int <= 0) {
                                        break L76;
                                      } else {
                                        var15.field_c = new byte[2 * var16_int];
                                        break L76;
                                      }
                                    }
                                    L77: {
                                      var16_int = var38.h(16383);
                                      if (-1 <= (var16_int ^ -1)) {
                                        break L77;
                                      } else {
                                        var15.field_i = new byte[2 + 2 * var16_int];
                                        var40.field_i[1] = (byte)64;
                                        break L77;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.f(-128);
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
                        var7[var8] = var38.f(-128);
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
                var4[var5] = var38.f(-126);
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
        field_k = new String[]{"All scores", "My scores", "Best each"};
        field_i = false;
    }
}
