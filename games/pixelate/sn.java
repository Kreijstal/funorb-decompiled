/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends fa {
    private int[] field_r;
    byte[] field_o;
    byte[] field_p;
    static volatile boolean field_s;
    int field_v;
    short[] field_u;
    static String field_q;
    sp[] field_n;
    byte[] field_t;
    static tf field_m;
    static String field_k;
    un[] field_l;

    final static String b(byte param0) {
        if (param0 != 11) {
            field_q = null;
        }
        return oo.field_a;
    }

    final static void e(int param0) {
        int var2 = 0;
        int var1 = -63 / ((60 - param0) / 39);
        if ((ia.field_h ^ -1) < -33) {
            var2 = ia.field_h % 32;
            if (-1 == (var2 ^ -1)) {
                var2 = 32;
            }
            nk.a((byte) 93, -var2 + ia.field_h);
        } else {
            nk.a((byte) 93, 0);
        }
    }

    final static void a(jn param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        ae var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        wg var22 = null;
        wg var23 = null;
        wg var24 = null;
        ae stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        ae stackIn_17_0 = null;
        ae stackIn_18_0 = null;
        ae stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ae stackOut_10_0 = null;
        ae stackOut_9_0 = null;
        ae stackOut_8_0 = null;
        ae stackOut_7_0 = null;
        ae stackOut_6_0 = null;
        ae stackOut_1_0 = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        ae stackOut_16_0 = null;
        ae stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ae stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          var21 = Pixelate.field_H ? 1 : 0;
          var22 = uj.a(param0.field_o, param0.field_l, 0);
          var3 = 4;
          var4 = 14;
          if (param0.field_n != 0) {
            if (-2 == (param0.field_n ^ -1)) {
              stackOut_10_0 = new ae(0, var3 << var4, 0);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              if (2 == param0.field_n) {
                stackOut_9_0 = new ae(0, 0, var3 << var4);
                stackIn_11_0 = stackOut_9_0;
                break L0;
              } else {
                if (3 == param0.field_n) {
                  stackOut_8_0 = new ae(-var3 << var4, 0, 0);
                  stackIn_11_0 = stackOut_8_0;
                  break L0;
                } else {
                  if (param0.field_n != 4) {
                    stackOut_7_0 = new ae(0, 0, -var3 << var4);
                    stackIn_11_0 = stackOut_7_0;
                    break L0;
                  } else {
                    stackOut_6_0 = new ae(0, -var3 << var4, 0);
                    stackIn_11_0 = stackOut_6_0;
                    break L0;
                  }
                }
              }
            }
          } else {
            stackOut_1_0 = new ae(var3 << var4, 0, 0);
            stackIn_11_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_11_0;
          if (0 >= var22.a(var5, (byte) 106).field_i) {
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L1;
          } else {
            stackOut_12_0 = 1;
            stackIn_14_0 = stackOut_12_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_14_0;
          var7 = 2048 * param0.field_x / param0.field_w;
          if (param1 == 1183261192) {
            break L2;
          } else {
            field_s = false;
            break L2;
          }
        }
        L3: {
          stackOut_16_0 = (ae) var5;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (param0.field_k) {
            stackOut_18_0 = (ae) (Object) stackIn_18_0;
            stackOut_18_1 = var7;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L3;
          } else {
            stackOut_17_0 = (ae) (Object) stackIn_17_0;
            stackOut_17_1 = -var7;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L3;
          }
        }
        L4: {
          var23 = uj.a(stackIn_19_0, stackIn_19_1, param1 + -1183261192);
          var24 = var22.a(param1 + -1183261184, var23);
          var9 = 0;
          var10 = 2;
          var11 = 0;
          var12 = 2;
          var13 = 0;
          var14 = 2;
          var15 = 0;
          var16 = 2;
          var17 = 0;
          var18 = 2;
          var19 = 0;
          var20 = 2;
          if (0 == param0.field_n) {
            var11 = 1;
            var10 = 1;
            break L4;
          } else {
            if (param0.field_n == 1) {
              var14 = 1;
              var15 = 1;
              break L4;
            } else {
              if (param0.field_n != 2) {
                if (-4 != param0.field_n) {
                  if (-5 != param0.field_n) {
                    if (5 == param0.field_n) {
                      var20 = 1;
                      var17 = 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    var16 = 1;
                    var13 = 1;
                    break L4;
                  }
                } else {
                  var9 = 1;
                  var12 = 1;
                  break L4;
                }
              } else {
                var19 = 1;
                var18 = 1;
                break L4;
              }
            }
          }
        }
        L5: {
          if (var6 == 0) {
            um.a(var9, var17, var24, var18, var14, (byte) -101, param0.field_u >> 1183261192, var13, var10, param0.field_r >> -1680338296, param0.field_t);
            um.a(var11, var19, var22, var20, var16, (byte) -110, param0.field_u >> -22199384, var15, var12, param0.field_r >> -1892941048, param0.field_t);
            break L5;
          } else {
            um.a(var11, var19, var22, var20, var16, (byte) -114, param0.field_u >> -1790390168, var15, var12, param0.field_r >> -2091534648, param0.field_t);
            um.a(var9, var17, var24, var18, var14, (byte) -100, param0.field_u >> 317072008, var13, var10, param0.field_r >> 1016172296, param0.field_t);
            break L5;
          }
        }
    }

    final static String a(CharSequence param0, int param1) {
        if (param1 != 0) {
            String discarded$0 = sn.b((byte) 30);
        }
        return ne.a(param1 ^ 98, false, param0);
    }

    public static void a(int param0) {
        field_m = null;
        field_k = null;
        if (param0 != 0) {
            return;
        }
        field_q = null;
    }

    final void a(boolean param0) {
        if (param0) {
            String discarded$0 = sn.b((byte) -17);
        }
        ((sn) this).field_r = null;
    }

    final static void a(byte param0) {
        ln.a(param0 + 165);
        if (!(null == ec.field_u)) {
            pf.a(ec.field_u, 0);
        }
        if (param0 != -91) {
            return;
        }
        vi.a((byte) -109);
        db.a((byte) -94);
        ep.c(-26721);
        if (se.b(true)) {
            aa.field_f.g(1, 15514);
            vg.b(0, param0 + 10091);
        }
        na.a(true);
    }

    sn(byte[] param0) {
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
        we var38 = null;
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
        Object stackOut_37_0 = null;
        byte[] stackOut_36_0 = null;
        byte[] stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        ((sn) this).field_r = new int[128];
        ((sn) this).field_o = new byte[128];
        ((sn) this).field_l = new un[128];
        ((sn) this).field_u = new short[128];
        ((sn) this).field_t = new byte[128];
        ((sn) this).field_n = new sp[128];
        ((sn) this).field_p = new byte[128];
        var38 = new we(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_k[var3 + var38.field_m]) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_m = var38.field_m + 1;
                var5 = var38.field_m;
                var38.field_m = var38.field_m + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_k[var6 + var38.field_m] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if ((var6 ^ -1) >= (var8 ^ -1)) {
                        var6++;
                        var38.field_m = var38.field_m + 1;
                        var8 = var38.field_m;
                        var38.field_m = var38.field_m + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (0 == var38.field_k[var38.field_m + var9]) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var38.field_m = var38.field_m + 1;
                                  var9++;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if ((var9 ^ -1) >= -2) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if ((var14 ^ -1) <= (var9 ^ -1)) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.f(255);
                                          if (var15_int == 0) {
                                            int incrementValue$9 = var12;
                                            var12++;
                                            var13_int = incrementValue$9;
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
                                  }
                                }
                                var13 = new un[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.f(255);
                                      if (0 >= var14) {
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
                                      var14 = var38.f(255);
                                      if ((var14 ^ -1) < -1) {
                                        stackOut_40_0 = new byte[2 * var14];
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
                                      if (-1 == (var38.field_k[var38.field_m + var17] ^ -1)) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if ((var17 ^ -1) >= (var19 ^ -1)) {
                                            var38.field_m = var38.field_m + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
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
                                                          if (-129 >= (var24 ^ -1)) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (-129 >= (var25_int ^ -1)) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var26 ^ -1)) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= (var27 ^ -1)) {
                                                                        ((sn) this).field_v = 1 + var38.f(255);
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
                                                                                    var15_array[var27] = var38.a(0);
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
                                                                                    var16[var27] = var38.a(0);
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
                                                                                        var19 = var38.f(255);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var46.length) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if ((var27 ^ -1) >= (var29 ^ -1)) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var46.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((sn) this).field_t[var30] = (byte)(((sn) this).field_t[var30] * var28 - -32 >> 1468553350);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[var29 + 1];
                                                                                                    var32 = (var30 - var27) / 2 + (-var27 + var30) * var28;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if ((var30 ^ -1) >= (var33 ^ -1)) {
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = cm.a(var30 + -var27, (byte) 120, var32);
                                                                                                        ((sn) this).field_t[var33] = (byte)(((sn) this).field_t[var33] * var34 - -32 >> 871632038);
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((sn) this).field_t[var29] = (byte)(var28 * ((sn) this).field_t[var29] + 32 >> -1206461690);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 - -1 - -var38.f(255);
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
                                                                                        var19 = var38.f(255);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1] << 2066474753;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if ((var70.length ^ -1) >= (var29 ^ -1)) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = (255 & ((sn) this).field_o[var30]) - -var28;
                                                                                                          if (var31 >= 0) {
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
                                                                                                        ((sn) this).field_o[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var16[var29 + 1] << 1662812065;
                                                                                                    var32 = (-var27 + var30) / 2 + (var30 + -var27) * var28;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var37 >= var30) {
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = cm.a(var30 - var27, (byte) 124, var32);
                                                                                                          var35 = var34 + (((sn) this).field_o[var37] & 255);
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
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((sn) this).field_o[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (((sn) this).field_o[var29] & 255) + var28;
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
                                                                                                ((sn) this).field_o[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.f(255) + (var19 - -1);
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L47: while (true) {
                                                                                      if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                                                        return;
                                                                                                      } else {
                                                                                                        L52: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (var52.field_a <= 0) {
                                                                                                            break L52;
                                                                                                          } else {
                                                                                                            var52.field_m = var38.f(255);
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
                                                                                                      if ((var51.field_g ^ -1) >= -1) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var51.field_a = var38.f(255);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_g = var38.f(255);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L54: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_b) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var50.field_f = var38.f(255);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            L55: {
                                                                                              if (var50.field_h == null) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var50.field_d = var38.f(255);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if ((var50.field_e ^ -1) >= -1) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_i = var38.f(255);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_e = var38.f(255);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L57: {
                                                                                      var49 = var13[var27];
                                                                                      if (var49.field_b == null) {
                                                                                        break L57;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L58: while (true) {
                                                                                          if (var29 >= var49.field_b.length) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var19 = var38.f(255) + var19 + 1;
                                                                                            var49.field_b[var29] = (byte)var19;
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
                                                                                  if (null == var48.field_h) {
                                                                                    break L59;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L60: while (true) {
                                                                                      if ((var48.field_h.length ^ -1) >= (var29 ^ -1)) {
                                                                                        break L59;
                                                                                      } else {
                                                                                        var19 = var38.f(255) + var19 + 1;
                                                                                        var48.field_h[var29] = (byte)var19;
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
                                                                              if (var45.field_b == null) {
                                                                                break L61;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L62: while (true) {
                                                                                  if (var29 >= var45.field_b.length) {
                                                                                    break L61;
                                                                                  } else {
                                                                                    var45.field_b[var29] = var38.a(0);
                                                                                    var29 += 2;
                                                                                    continue L62;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L63: {
                                                                              if (var45.field_h == null) {
                                                                                break L63;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L64: while (true) {
                                                                                  if (-2 + var45.field_h.length <= var29) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var45.field_h[var29] = var38.a(0);
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
                                                                          if ((var20 ^ -1) != -1) {
                                                                            break L65;
                                                                          } else {
                                                                            L66: {
                                                                              if (var21 < var66.length) {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L66;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L66;
                                                                              }
                                                                            }
                                                                            if (((sn) this).field_r[var27] <= 0) {
                                                                              break L65;
                                                                            } else {
                                                                              var26 = 1 + var38.f(255);
                                                                              break L65;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((sn) this).field_t[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L67: {
                                                                      if ((((sn) this).field_r[var26] ^ -1) == -1) {
                                                                        break L67;
                                                                      } else {
                                                                        L68: {
                                                                          if (var20 != 0) {
                                                                            break L68;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var65[var21]];
                                                                            if (var21 < var69.length) {
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
                                                                        ((sn) this).field_l[var26] = (un) var25;
                                                                        break L67;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L69: {
                                                                  if (0 == ((sn) this).field_r[var25_int]) {
                                                                    break L69;
                                                                  } else {
                                                                    L70: {
                                                                      if (0 != var20) {
                                                                        break L70;
                                                                      } else {
                                                                        int incrementValue$12 = var8;
                                                                        var8++;
                                                                        var24 = 16 + var38.field_k[incrementValue$12] << -1722978366;
                                                                        if ((var21 ^ -1) > (var68.length ^ -1)) {
                                                                          int incrementValue$13 = var21;
                                                                          var21++;
                                                                          var20 = var7[incrementValue$13];
                                                                          break L70;
                                                                        } else {
                                                                          var20 = -1;
                                                                          break L70;
                                                                        }
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((sn) this).field_o[var25_int] = (byte)var24;
                                                                    break L69;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L71: {
                                                              if (-1 == (((sn) this).field_r[var24] ^ -1)) {
                                                                break L71;
                                                              } else {
                                                                L72: {
                                                                  if (-1 != (var20 ^ -1)) {
                                                                    break L72;
                                                                  } else {
                                                                    int incrementValue$14 = var5;
                                                                    var5++;
                                                                    var23 = var38.field_k[incrementValue$14] + -1;
                                                                    if ((var21 ^ -1) <= (var67.length ^ -1)) {
                                                                      var20 = -1;
                                                                      break L72;
                                                                    } else {
                                                                      int incrementValue$15 = var21;
                                                                      var21++;
                                                                      var20 = var4[incrementValue$15];
                                                                      break L72;
                                                                    }
                                                                  }
                                                                }
                                                                ((sn) this).field_p[var24] = (byte)var23;
                                                                var20--;
                                                                break L71;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L73: {
                                                          if ((var20 ^ -1) != -1) {
                                                            break L73;
                                                          } else {
                                                            L74: {
                                                              if (var66.length <= var21) {
                                                                var20 = -1;
                                                                break L74;
                                                              } else {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L74;
                                                              }
                                                            }
                                                            var22 = var38.j(127);
                                                            break L73;
                                                          }
                                                        }
                                                        ((sn) this).field_u[var23] = (short)(((sn) this).field_u[var23] + cm.a(var22 - 1 << 1348226766, 32768));
                                                        var20--;
                                                        ((sn) this).field_r[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.f(255);
                                                    ((sn) this).field_u[var20] = (short)(((sn) this).field_u[var20] + (var19 << -131183832));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.f(255);
                                                ((sn) this).field_u[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.a(0);
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
                                    L75: {
                                      un dupTemp$17 = new un();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.f(255);
                                      if (0 >= var16_int) {
                                        break L75;
                                      } else {
                                        var15.field_b = new byte[2 * var16_int];
                                        break L75;
                                      }
                                    }
                                    L76: {
                                      var16_int = var38.f(255);
                                      if ((var16_int ^ -1) >= -1) {
                                        break L76;
                                      } else {
                                        var15.field_h = new byte[2 + var16_int * 2];
                                        var40.field_h[1] = (byte)64;
                                        break L76;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.a(0);
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
                        var7[var8] = var38.a(0);
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
                var4[var5] = var38.a(0);
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

    final boolean a(po param0, int[] param1, byte param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Pixelate.field_H ? 1 : 0;
        var5 = 1;
        var6 = 0;
        var7 = null;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 128) {
            L1: {
              if (param2 < -49) {
                break L1;
              } else {
                ((sn) this).field_v = 113;
                break L1;
              }
            }
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
                  continue L0;
                }
              }
            }
            var9 = ((sn) this).field_r[var8];
            if (var9 != 0) {
              L3: {
                if (var6 != var9) {
                  L4: {
                    var6 = var9;
                    var9--;
                    if ((1 & var9) != 0) {
                      var7 = (Object) (Object) param0.a((byte) -46, param1, var9 >> -1133688702);
                      break L4;
                    } else {
                      var7 = (Object) (Object) param0.a(var9 >> -1594980702, param1, (byte) 106);
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
                ((sn) this).field_n[var8] = (sp) var7;
                ((sn) this).field_r[var8] = 0;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = true;
        field_q = "Accept";
        field_k = "Username: ";
    }
}
