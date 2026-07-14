/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends l {
    qd[] field_g;
    short[] field_p;
    private int[] field_m;
    static String field_i;
    byte[] field_j;
    int field_q;
    byte[] field_n;
    ml[] field_l;
    byte[] field_k;
    static il field_o;
    static String[] field_h;

    final static void d(int param0) {
        me.field_d.a(0, 18, -(ql.field_d ? 40 + (2 + (oc.field_k + 2)) : 0) + ij.field_m.field_K, (byte) -52, 0);
        wm.field_m.a(-40 + -oc.field_k + (ij.field_m.field_K + -2), 18, oc.field_k + 42, (byte) -69, 0);
        uf.field_j.a(20, -127, ij.field_m.field_K, 2, param0 + ij.field_m.field_ub, 0, oc.field_k);
    }

    final boolean a(jg param0, byte[] param1, byte param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        ml var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Virogrid.field_F ? 1 : 0;
        var5 = 1;
        var6 = 0;
        var7 = null;
        if (param2 == 112) {
          var8 = 0;
          L0: while (true) {
            if (-129 >= (var8 ^ -1)) {
              return var5 != 0;
            } else {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (0 != param1[var8]) {
                    break L1;
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              }
              var9 = ((rc) this).field_m[var8];
              if (var9 != -1) {
                L2: {
                  if (var9 != var6) {
                    L3: {
                      var6 = var9;
                      var9--;
                      if (-1 != (var9 & 1)) {
                        var7 = param0.a(param3, var9 >> 361113794, true);
                        break L3;
                      } else {
                        var7 = param0.a(param3, var9 >> -1605739134, 0);
                        break L3;
                      }
                    }
                    if (var7 == null) {
                      var5 = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                if (var7 != null) {
                  ((rc) this).field_l[var8] = var7;
                  ((rc) this).field_m[var8] = 0;
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

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if (param0 < -1) {
            var2 = 1;
            if (!(-65536 >= param0)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (255 < param0) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (-16 > (param0 ^ -1)) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (!((param0 ^ -1) >= -4)) {
                param0 = param0 >> 2;
                var2 += 2;
            }
            if (param0 > 1) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (65535 < (param0 ^ -1)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if ((param0 ^ -1) > 255) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (param0 > 15) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (param1 != 4) {
            rc.d(-101);
        }
        if (3 > param0) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(param0 >= -2)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    final static void c(int param0) {
        int var2 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        if (param0 != -1) {
            field_h = null;
        }
        hg var1 = gk.field_g;
        while (kf.a((byte) -74)) {
            var1.g(8, 8);
            var1.field_l = var1.field_l + 1;
            var2 = var1.field_l + 1;
            hd.a(false, var1);
            gk.field_g.b(var1.field_l + -var2, -1);
        }
    }

    final void a(byte param0) {
        ((rc) this).field_m = null;
        if (param0 >= -68) {
            int discarded$0 = rc.a(-96, -3);
        }
    }

    rc(byte[] param0) {
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
        qd[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        qd var15 = null;
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
        qd var25_ref = null;
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
        jc var38 = null;
        byte[] var39 = null;
        qd var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        qd var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        qd var48 = null;
        qd var49 = null;
        qd var50 = null;
        qd var51 = null;
        qd var52 = null;
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
        ((rc) this).field_p = new short[128];
        ((rc) this).field_g = new qd[128];
        ((rc) this).field_m = new int[128];
        ((rc) this).field_l = new ml[128];
        ((rc) this).field_j = new byte[128];
        ((rc) this).field_k = new byte[128];
        ((rc) this).field_n = new byte[128];
        var38 = new jc(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_g[var3 + var38.field_l] == 0) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var3++;
                var38.field_l = var38.field_l + 1;
                var5 = var38.field_l;
                var38.field_l = var38.field_l + var3;
                var6 = 0;
                L2: while (true) {
                  if (-1 == (var38.field_g[var6 + var38.field_l] ^ -1)) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var6++;
                        var38.field_l = var38.field_l + 1;
                        var8 = var38.field_l;
                        var38.field_l = var38.field_l + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (-1 == (var38.field_g[var9 + var38.field_l] ^ -1)) {
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
                                  var38.field_l = var38.field_l + 1;
                                  var63 = new byte[var9];
                                  var58 = var63;
                                  var53 = var58;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 > 1) {
                                    var63[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.g(11132);
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
                                var13 = new qd[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.g(11132);
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
                                      var14 = var38.g(11132);
                                      if (var14 <= 0) {
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
                                      if (var38.field_g[var38.field_l + var17] == 0) {
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
                                              if ((var20 ^ -1) <= -129) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (-129 >= (var20 ^ -1)) {
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
                                                          if ((var24 ^ -1) <= -129) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (var25_int <= -129) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= var27) {
                                                                        ((rc) this).field_q = 1 + var38.g(11132);
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
                                                                                    var15_array[var27] = var38.a((byte) -123);
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
                                                                                    var16[var27] = var38.a((byte) -98);
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
                                                                                        var19 = var38.g(11132);
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
                                                                                                      if (128 <= var30) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((rc) this).field_k[var30] = (byte)(var28 * ((rc) this).field_k[var30] + 32 >> -411365850);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = (-var27 + var30) / 2 + (var30 - var27) * var28;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = bn.a(var32, (byte) 122, -var27 + var30);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((rc) this).field_k[var33] = (byte)(((rc) this).field_k[var33] * var34 - -32 >> 1330236422);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((rc) this).field_k[var29] = (byte)(32 + var28 * ((rc) this).field_k[var29] >> 1646641382);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + (1 - -var38.g(11132));
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
                                                                                        var19 = var38.g(11132);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var47.length <= var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 90142337;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
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
                                                                                                          var31 = (255 & ((rc) this).field_n[var30]) + var28;
                                                                                                          if ((var31 ^ -1) <= -1) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if ((var31 ^ -1) >= -129) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((rc) this).field_n[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << -723355999;
                                                                                                    var32 = (-var27 + var30) * var28 - -((var30 + -var27) / 2);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = bn.a(var32, (byte) 126, var30 - var27);
                                                                                                          var35 = (((rc) this).field_n[var37] & 255) - -var34;
                                                                                                          if (var35 >= 0) {
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
                                                                                                        ((rc) this).field_n[var37] = (byte)var35;
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (((rc) this).field_n[var29] & 255);
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
                                                                                                ((rc) this).field_n[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.g(11132) + (1 + var19);
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
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if (0 < var52.field_j) {
                                                                                                          var52.field_b = var38.g(11132);
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
                                                                                                    if (0 < var51.field_h) {
                                                                                                      var51.field_j = var38.g(11132);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_h = var38.g(11132);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_e == null) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_a = var38.g(11132);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (null == var50.field_k) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_d = var38.g(11132);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (-1 > (var50.field_n ^ -1)) {
                                                                                              var50.field_l = var38.g(11132);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_n = var38.g(11132);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_e != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_e.length) {
                                                                                          var19 = 1 + var19 - -var38.g(11132);
                                                                                          var49.field_e[var29] = (byte)var19;
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
                                                                                if (null != var48.field_k) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var48.field_k.length > var29) {
                                                                                      var19 = 1 + var19 + var38.g(11132);
                                                                                      var48.field_k[var29] = (byte)var19;
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
                                                                              if (null == var45.field_e) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var29 >= var45.field_e.length) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_e[var29] = var38.a((byte) 115);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var45.field_k != null) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (var45.field_k.length + -2 > var29) {
                                                                                  var45.field_k[var29] = var38.a((byte) -83);
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
                                                                            if (-1 <= (((rc) this).field_m[var27] ^ -1)) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = var38.g(11132) + 1;
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((rc) this).field_k[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (-1 != (((rc) this).field_m[var26] ^ -1)) {
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
                                                                      var20--;
                                                                      ((rc) this).field_g[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (-1 != ((rc) this).field_m[var25_int]) {
                                                                  L62: {
                                                                    if (0 != var20) {
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
                                                                      var24 = var38.field_g[var8] + 16 << -1319386110;
                                                                      break L62;
                                                                    }
                                                                  }
                                                                  var20--;
                                                                  ((rc) this).field_n[var25_int] = (byte)var24;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (0 != ((rc) this).field_m[var24]) {
                                                              L64: {
                                                                if (var20 != 0) {
                                                                  break L64;
                                                                } else {
                                                                  var5++;
                                                                  var23 = -1 + var38.field_g[var5];
                                                                  if (var21 >= var65.length) {
                                                                    var20 = -1;
                                                                    break L64;
                                                                  } else {
                                                                    var21++;
                                                                    var20 = var4[var21];
                                                                    break L64;
                                                                  }
                                                                }
                                                              }
                                                              ((rc) this).field_j[var24] = (byte)var23;
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
                                                            var22 = var38.c(0);
                                                            break L65;
                                                          }
                                                        }
                                                        ((rc) this).field_p[var23] = (short)(((rc) this).field_p[var23] + rb.a(32768, -1 + var22 << -1625461170));
                                                        var20--;
                                                        ((rc) this).field_m[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.g(11132);
                                                    ((rc) this).field_p[var20] = (short)(((rc) this).field_p[var20] + (var19 << -337695448));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.g(11132);
                                                ((rc) this).field_p[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.a((byte) 41);
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
                                      var13[var14] = new qd();
                                      var40 = new qd();
                                      var15 = var40;
                                      var16_int = var38.g(11132);
                                      if (var16_int <= 0) {
                                        break L67;
                                      } else {
                                        var15.field_e = new byte[var16_int * 2];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.g(11132);
                                    if ((var16_int ^ -1) < -1) {
                                      var15.field_k = new byte[var16_int * 2 - -2];
                                      var40.field_k[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.a((byte) -82);
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
                        var7[var8] = var38.a((byte) -112);
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
                var4[var5] = var38.a((byte) -115);
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

    public static void a(int param0) {
        field_o = null;
        if (param0 != -24021) {
            int discarded$0 = rc.a(-32, -102);
        }
        field_h = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> has the most pieces";
        field_h = new String[255];
    }
}
