/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends pi {
    byte[] field_r;
    byte[] field_x;
    private int[] field_n;
    ng[] field_y;
    byte[] field_s;
    static String field_w;
    int field_q;
    static String field_u;
    ji[] field_v;
    static ea[] field_p;
    short[] field_t;
    static ea[] field_o;

    final static boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (0 == (oj.field_J ^ -1)) {
                break L1;
              } else {
                if (!nb.field_i[oj.field_J].c(-78)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    public static void e(int param0) {
        field_o = null;
        field_p = null;
        field_u = null;
        if (param0 <= 5) {
            field_u = null;
        }
        field_w = null;
    }

    final void a(int param0) {
        ((vc) this).field_n = null;
        if (param0 != 12361) {
            Object var3 = null;
            boolean discarded$0 = ((vc) this).a((ri) null, (byte) -77, (byte[]) null, (int[]) null);
        }
    }

    final boolean a(ri param0, byte param1, byte[] param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        ji var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = MinerDisturbance.field_ab;
        var5 = 1;
        var6 = 0;
        var7 = null;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 128) {
            L1: {
              if (param1 == -31) {
                break L1;
              } else {
                ((vc) this).field_v = null;
                break L1;
              }
            }
            return var5 != 0;
          } else {
            L2: {
              if (param2 == null) {
                break L2;
              } else {
                if (param2[var8] != 0) {
                  break L2;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
            var9 = ((vc) this).field_n[var8];
            if (0 != var9) {
              L3: {
                if (var6 != var9) {
                  L4: {
                    var6 = var9;
                    var9--;
                    if ((1 & var9) == 0) {
                      var7 = param0.a(var9 >> 1124674338, param3, (byte) 112);
                      break L4;
                    } else {
                      var7 = param0.a(-26575, param3, var9 >> -117830750);
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
                ((vc) this).field_v[var8] = var7;
                ((vc) this).field_n[var8] = 0;
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

    final static void a(int param0, int param1, int param2) {
        int var3 = 88 / ((param0 - 55) / 51);
        if (!kj.a(false)) {
            // if_acmpeq L57
            // ifne L70
            aa.field_j.a(param2, param1, -117);
            ck.a(-30833);
        } else {
            pj.field_c.a(param2, param1, -123);
        }
    }

    vc(byte[] param0) {
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
        ng[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        ng var15 = null;
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
        ng var25_ref = null;
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
        sb var38 = null;
        byte[] var39 = null;
        ng var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        ng var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        ng var48 = null;
        ng var49 = null;
        ng var50 = null;
        ng var51 = null;
        ng var52 = null;
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
        ((vc) this).field_r = new byte[128];
        ((vc) this).field_y = new ng[128];
        ((vc) this).field_s = new byte[128];
        ((vc) this).field_v = new ji[128];
        ((vc) this).field_x = new byte[128];
        ((vc) this).field_n = new int[128];
        ((vc) this).field_t = new short[128];
        var38 = new sb(param0);
        var3 = 0;
        L0: while (true) {
          if (-1 == (var38.field_u[var3 + var38.field_o] ^ -1)) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var38.field_o = var38.field_o + 1;
                var3++;
                var5 = var38.field_o;
                var38.field_o = var38.field_o + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_u[var6 + var38.field_o] == 0) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var38.field_o = var38.field_o + 1;
                        var6++;
                        var8 = var38.field_o;
                        var38.field_o = var38.field_o + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_u[var9 + var38.field_o] == 0) {
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
                                  var38.field_o = var38.field_o + 1;
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
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.d((byte) -54);
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
                                var13 = new ng[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.d((byte) -54);
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
                                      var46 = stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.d((byte) -54);
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
                                      if (0 == var38.field_u[var17 + var38.field_o]) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_o = var38.field_o + 1;
                                            var17++;
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
                                                      if (-129 >= (var23 ^ -1)) {
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
                                                              if (-129 >= (var25_int ^ -1)) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (128 <= var26) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= (var27 ^ -1)) {
                                                                        ((vc) this).field_q = var38.d((byte) -54) - -1;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var46.length <= var27) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.m(4);
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
                                                                                    var16[var27] = var38.m(4);
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
                                                                                        var19 = var38.d((byte) -54);
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
                                                                                                  if (var29 >= var46.length) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if ((var30 ^ -1) <= -129) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((vc) this).field_x[var30] = (byte)(((vc) this).field_x[var30] * var28 - -32 >> 811242310);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = var28 * (var30 + -var27) - -((var30 - var27) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = lb.a(false, var32, -var27 + var30);
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        ((vc) this).field_x[var33] = (byte)(32 + ((vc) this).field_x[var33] * var34 >> 557219558);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((vc) this).field_x[var29] = (byte)(((vc) this).field_x[var29] * var28 + 32 >> -1346910746);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + (var19 - -var38.d((byte) -54));
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
                                                                                        var19 = var38.d((byte) -54);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << -1531587999;
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
                                                                                                          var31 = var28 + (255 & ((vc) this).field_r[var30]);
                                                                                                          if (var31 >= 0) {
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
                                                                                                        ((vc) this).field_r[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << 1983150433;
                                                                                                    var32 = (var30 - var27) * var28 - -((var30 + -var27) / 2);
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
                                                                                                          var34 = lb.a(false, var32, var30 + -var27);
                                                                                                          var35 = var34 + (((vc) this).field_r[var37] & 255);
                                                                                                          if (var35 >= 0) {
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
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((vc) this).field_r[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (((vc) this).field_r[var29] & 255) + var28;
                                                                                                  if (var30 <= -1) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (-129 >= var30) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((vc) this).field_r[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.d((byte) -54) + (var19 + 1);
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
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (-1 > (var52.field_c ^ -1)) {
                                                                                                          var52.field_f = var38.d((byte) -54);
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
                                                                                                    if ((var51.field_j ^ -1) < -1) {
                                                                                                      var51.field_c = var38.d((byte) -54);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_j = var38.d((byte) -54);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_b == null) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_a = var38.d((byte) -54);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_g) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_h = var38.d((byte) -54);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (0 < var50.field_m) {
                                                                                              var50.field_d = var38.d((byte) -54);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_m = var38.d((byte) -54);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_b != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var49.field_b.length > var29) {
                                                                                          var19 = var38.d((byte) -54) + (var19 + 1);
                                                                                          var49.field_b[var29] = (byte)var19;
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
                                                                                if (var48.field_g != null) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var48.field_g.length > var29) {
                                                                                      var19 = 1 + (var19 - -var38.d((byte) -54));
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
                                                                              if (var45.field_b == null) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var29 >= var45.field_b.length) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_b[var29] = var38.m(4);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_g) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (-2 + var45.field_g.length > var29) {
                                                                                  var45.field_g[var29] = var38.m(4);
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
                                                                              if (var64.length > var21) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if ((((vc) this).field_n[var27] ^ -1) >= -1) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = 1 + var38.d((byte) -54);
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((vc) this).field_x[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((vc) this).field_n[var26] != 0) {
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
                                                                      ((vc) this).field_y[var26] = var25_ref;
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
                                                                if (((vc) this).field_n[var25_int] != 0) {
                                                                  L62: {
                                                                    if (var20 != 0) {
                                                                      break L62;
                                                                    } else {
                                                                      L63: {
                                                                        if (var21 >= var66.length) {
                                                                          var20 = -1;
                                                                          break L63;
                                                                        } else {
                                                                          var21++;
                                                                          var20 = var7[var21];
                                                                          break L63;
                                                                        }
                                                                      }
                                                                      var8++;
                                                                      var24 = 16 + var38.field_u[var8] << 1270177378;
                                                                      break L62;
                                                                    }
                                                                  }
                                                                  ((vc) this).field_r[var25_int] = (byte)var24;
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
                                                            if (0 != ((vc) this).field_n[var24]) {
                                                              L64: {
                                                                if (0 != var20) {
                                                                  break L64;
                                                                } else {
                                                                  L65: {
                                                                    if (var21 < var65.length) {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L65;
                                                                    } else {
                                                                      var20 = -1;
                                                                      break L65;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = var38.field_u[var5] + -1;
                                                                  break L64;
                                                                }
                                                              }
                                                              ((vc) this).field_s[var24] = (byte)var23;
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
                                                          if (var20 != 0) {
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
                                                            var22 = var38.k(8);
                                                            break L66;
                                                          }
                                                        }
                                                        ((vc) this).field_t[var23] = (short)(((vc) this).field_t[var23] + (c.a(2, -1 + var22) << -1679267442));
                                                        var20--;
                                                        ((vc) this).field_n[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.d((byte) -54);
                                                    ((vc) this).field_t[var20] = (short)(((vc) this).field_t[var20] + (var19 << 1745989032));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.d((byte) -54);
                                                ((vc) this).field_t[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.m(4);
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
                                      var13[var14] = new ng();
                                      var40 = new ng();
                                      var15 = var40;
                                      var16_int = var38.d((byte) -54);
                                      if (0 >= var16_int) {
                                        break L68;
                                      } else {
                                        var15.field_b = new byte[2 * var16_int];
                                        break L68;
                                      }
                                    }
                                    var16_int = var38.d((byte) -54);
                                    if ((var16_int ^ -1) < -1) {
                                      var15.field_g = new byte[2 * var16_int + 2];
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
                                var10[var11_int] = var38.m(4);
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
                        var7[var8] = var38.m(4);
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
                var4[var5] = var38.m(4);
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
        field_w = "Instructions";
        field_u = "Discover oil!";
    }
}
