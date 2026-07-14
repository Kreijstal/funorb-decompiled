/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static int[] field_q;
    private long[] field_c;
    private byte[] field_a;
    static int[] field_b;
    static boolean field_g;
    static String field_n;
    static String field_p;
    static String field_l;
    private int field_d;
    static qr field_j;
    private int field_o;
    private long[] field_f;
    static int field_i;
    private long[] field_e;
    private long[] field_h;
    private long[] field_m;
    private byte[] field_k;

    final void a(byte param0, long param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = ShatteredPlansClient.field_F ? 1 : 0;
          var5 = 0;
          var6 = -((int)param1 & 7) + 8 & 7;
          var7 = ((er) this).field_d & 7;
          var9 = param1;
          if (param0 == 36) {
            break L0;
          } else {
            ((er) this).field_o = -5;
            break L0;
          }
        }
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if (0 > var11) {
            L2: while (true) {
              if (-9L <= (param1 ^ -1L)) {
                L3: {
                  if ((param1 ^ -1L) >= -1L) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = param2[var5] << var6 & 255;
                    ((er) this).field_a[((er) this).field_o] = (byte)ee.a((int) ((er) this).field_a[((er) this).field_o], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if ((long)var7 - -param1 < 8L) {
                    ((er) this).field_d = (int)((long)((er) this).field_d + param1);
                    break L4;
                  } else {
                    L5: {
                      param1 = param1 - (long)(-var7 + 8);
                      ((er) this).field_o = ((er) this).field_o + 1;
                      ((er) this).field_d = ((er) this).field_d + (8 + -var7);
                      if (-513 == (((er) this).field_d ^ -1)) {
                        this.a((byte) -55);
                        ((er) this).field_o = 0;
                        ((er) this).field_d = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((er) this).field_a[((er) this).field_o] = (byte)we.a(var8 << -var7 + 8, 255);
                    ((er) this).field_d = ((er) this).field_d + (int)param1;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param2[var5] << var6 | (param2[1 + var5] & 255) >>> -var6 + 8;
                  if (var8 < 0) {
                    break L6;
                  } else {
                    if ((var8 ^ -1) > -257) {
                      L7: {
                        ((er) this).field_a[((er) this).field_o] = (byte)ee.a((int) ((er) this).field_a[((er) this).field_o], var8 >>> var7);
                        ((er) this).field_o = ((er) this).field_o + 1;
                        ((er) this).field_d = ((er) this).field_d + (8 + -var7);
                        if (((er) this).field_d == 512) {
                          this.a((byte) -55);
                          ((er) this).field_o = 0;
                          ((er) this).field_d = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((er) this).field_a[((er) this).field_o] = (byte)we.a(255, var8 << -var7 + 8);
                      param1 = param1 - 8L;
                      ((er) this).field_d = ((er) this).field_d + var7;
                      var5++;
                      continue L2;
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((255 & ((er) this).field_k[var11]) - -(255 & (int)var9));
            ((er) this).field_k[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1, String param2, int param3, byte param4, boolean param5, int param6, int param7) {
        if (param4 < 97) {
            er.a(-92, 119, -115, 97, 9);
        }
        if (-1 != (hi.field_o.field_rb ^ -1)) {
            if (!bg.field_g) {
                if (!ae.field_b) {
                    sr.field_h = true;
                } else {
                    rg.a(true);
                }
            }
        }
        if (!(!sr.field_h)) {
            ca.a(param3, param0, param0, param2, param7, param1, -10, 20, param6);
            fa.field_X.a(param5, -20429);
            if (param5) {
                if (hd.field_m.field_rb != -1) {
                    sr.field_h = false;
                }
                if (!(-1 == cb.field_l.field_rb)) {
                    qq.c(false);
                    sr.field_h = false;
                }
            }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, sr param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        hc var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
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
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        sr var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        hc stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        int stackIn_45_5 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        int stackIn_46_6 = 0;
        int stackIn_50_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        hc stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_45_6 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        int stackOut_44_5 = 0;
        int stackOut_44_6 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          L1: {
            var40 = ShatteredPlansClient.field_F ? 1 : 0;
            var45 = param5;
            if (null == var45.field_p) {
              break L1;
            } else {
              if ((var45.field_o ^ -1) < -2) {
                var62 = var45.field_p;
                eb.a(0, 0, var62, 12, uo.field_h);
                break L0;
              } else {
                break L1;
              }
            }
          }
          kc.a((byte) -97);
          break L0;
        }
        var66 = new int[param5.field_e];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param5.field_e];
        var63 = fm.field_c;
        var64 = ra.field_f;
        var65 = hk.field_ob;
        var13 = 0;
        L2: while (true) {
          if (param5.field_e <= var13) {
            if (!param2) {
              var44 = 0;
              var13 = var44;
              L3: while (true) {
                if (var44 >= qj.field_e) {
                  return;
                } else {
                  L4: {
                    var14 = jl.field_M[var44];
                    var15 = param5.field_s[var14];
                    var16 = param5.field_i[var14];
                    var17 = param5.field_B[var14];
                    if (param5.field_M[var14] >= fm.field_c.length) {
                      stackOut_24_0 = -1;
                      stackIn_25_0 = stackOut_24_0;
                      break L4;
                    } else {
                      stackOut_23_0 = param5.field_M[var14];
                      stackIn_25_0 = stackOut_23_0;
                      break L4;
                    }
                  }
                  L5: {
                    var18 = stackIn_25_0;
                    if (param5.field_P[var14] >= fm.field_c.length) {
                      stackOut_27_0 = -1;
                      stackIn_28_0 = stackOut_27_0;
                      break L5;
                    } else {
                      stackOut_26_0 = param5.field_P[var14];
                      stackIn_28_0 = stackOut_26_0;
                      break L5;
                    }
                  }
                  L6: {
                    var19 = stackIn_28_0;
                    if (param5.field_n[var14] < fm.field_c.length) {
                      stackOut_30_0 = param5.field_n[var14];
                      stackIn_31_0 = stackOut_30_0;
                      break L6;
                    } else {
                      stackOut_29_0 = -1;
                      stackIn_31_0 = stackOut_29_0;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var20 = stackIn_31_0;
                      if (wc.field_a == null) {
                        break L8;
                      } else {
                        if (null == param5.field_b) {
                          break L8;
                        } else {
                          if (var14 >= param5.field_b.length) {
                            break L8;
                          } else {
                            if (param5.field_b[var14] == -1) {
                              break L8;
                            } else {
                              if (wc.field_a.length <= param5.field_b[var14]) {
                                break L8;
                              } else {
                                stackOut_36_0 = wc.field_a[param5.field_b[var14]];
                                stackIn_38_0 = stackOut_36_0;
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_37_0 = null;
                    stackIn_38_0 = (hc) (Object) stackOut_37_0;
                    break L7;
                  }
                  L9: {
                    var21 = stackIn_38_0;
                    var22 = ul.field_Cb[var15];
                    var23 = he.field_i[var15];
                    var24 = ul.field_Cb[var16];
                    var25 = he.field_i[var16];
                    var26 = ul.field_Cb[var17];
                    var27 = he.field_i[var17];
                    if (var18 != var19) {
                      break L9;
                    } else {
                      if (var20 != var19) {
                        break L9;
                      } else {
                        L10: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21 == null) {
                            stackOut_42_0 = 8355711;
                            stackIn_43_0 = stackOut_42_0;
                            break L10;
                          } else {
                            stackOut_41_0 = var21.field_a;
                            stackIn_43_0 = stackOut_41_0;
                            break L10;
                          }
                        }
                        L11: {
                          var30 = stackIn_43_0;
                          var31 = 16711935 & var30;
                          var32 = 65280 & var30;
                          var33 = var28 * var31 >>> -1791041976 & 268370175 | var28 * var32 >>> 602548744 & 989921024;
                          var33 = var33 + 65793 * var29;
                          stackOut_43_0 = var23;
                          stackOut_43_1 = var26;
                          stackOut_43_2 = var27;
                          stackOut_43_3 = var25;
                          stackOut_43_4 = var33 >> -169953503 & 8355711;
                          stackOut_43_5 = var24;
                          stackIn_45_0 = stackOut_43_0;
                          stackIn_45_1 = stackOut_43_1;
                          stackIn_45_2 = stackOut_43_2;
                          stackIn_45_3 = stackOut_43_3;
                          stackIn_45_4 = stackOut_43_4;
                          stackIn_45_5 = stackOut_43_5;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          stackIn_44_2 = stackOut_43_2;
                          stackIn_44_3 = stackOut_43_3;
                          stackIn_44_4 = stackOut_43_4;
                          stackIn_44_5 = stackOut_43_5;
                          if (param2) {
                            stackOut_45_0 = stackIn_45_0;
                            stackOut_45_1 = stackIn_45_1;
                            stackOut_45_2 = stackIn_45_2;
                            stackOut_45_3 = stackIn_45_3;
                            stackOut_45_4 = stackIn_45_4;
                            stackOut_45_5 = stackIn_45_5;
                            stackOut_45_6 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            stackIn_46_2 = stackOut_45_2;
                            stackIn_46_3 = stackOut_45_3;
                            stackIn_46_4 = stackOut_45_4;
                            stackIn_46_5 = stackOut_45_5;
                            stackIn_46_6 = stackOut_45_6;
                            break L11;
                          } else {
                            stackOut_44_0 = stackIn_44_0;
                            stackOut_44_1 = stackIn_44_1;
                            stackOut_44_2 = stackIn_44_2;
                            stackOut_44_3 = stackIn_44_3;
                            stackOut_44_4 = stackIn_44_4;
                            stackOut_44_5 = stackIn_44_5;
                            stackOut_44_6 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            stackIn_46_1 = stackOut_44_1;
                            stackIn_46_2 = stackOut_44_2;
                            stackIn_46_3 = stackOut_44_3;
                            stackIn_46_4 = stackOut_44_4;
                            stackIn_46_5 = stackOut_44_5;
                            stackIn_46_6 = stackOut_44_6;
                            break L11;
                          }
                        }
                        oo.a(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_46_4, stackIn_46_5, stackIn_46_6 != 0, var22);
                        var44++;
                        continue L3;
                      }
                    }
                  }
                  L12: {
                    var28 = var66[var18];
                    var29 = var66[var19];
                    var30 = var66[var20];
                    var31 = var67[var18];
                    var32 = var67[var19];
                    var33 = var67[var20];
                    if (var21 == null) {
                      stackOut_49_0 = 8355711;
                      stackIn_50_0 = stackOut_49_0;
                      break L12;
                    } else {
                      stackOut_48_0 = var21.field_a;
                      stackIn_50_0 = stackOut_48_0;
                      break L12;
                    }
                  }
                  var34 = stackIn_50_0;
                  var35 = 16711935 & var34;
                  var36 = var34 & 65280;
                  var37 = (-16711905 & var35 * var28) >>> 1592360616 | var28 * var36 >>> -1029733688 & -1845428480;
                  var38 = (16711777 & var36 * var29) >>> -2122901528 | var29 * var35 >>> -219224248 & 1459552511;
                  var37 = var37 + 65793 * var31;
                  var39 = var30 * var36 >>> -1019995096 & -570360064 | (-16711872 & var30 * var35) >>> -298751192;
                  var38 = var38 + 65793 * var32;
                  var39 = var39 + var33 * 65793;
                  bf.a((var38 & 65365) >> 1347032712, var37 & 255, var39 >> 1216567952, var37 >> -1397179576 & 255, var37 >> 851544272, var26, var22, var39 & 255, var25, 255 & var38, var27, (var39 & 65523) >> 1164154184, var24, var38 >> -685475440, var23, 256);
                  var44++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          } else {
            L13: {
              var14 = var63[var13] * param0 - -(var64[var13] * param3) + var65[var13] * param7 >> 258849736;
              if (var14 <= -1) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (-1 > var14) {
                stackOut_13_0 = 128;
                stackIn_14_0 = stackOut_13_0;
                break L14;
              } else {
                if ((var14 ^ -1) > -129) {
                  stackOut_12_0 = var14 + 128;
                  stackIn_14_0 = stackOut_12_0;
                  break L14;
                } else {
                  stackOut_11_0 = 256;
                  stackIn_14_0 = stackOut_11_0;
                  break L14;
                }
              }
            }
            L15: {
              var14 = stackIn_14_0;
              var15 = var63[var13] * param6 - (-(param1 * var64[var13]) - var65[var13] * param4) >> -1986276792;
              stackOut_14_0 = uc.field_w;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (0 > var15) {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = -var15;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L15;
              } else {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = var15;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L15;
              }
            }
            var15 = stackIn_17_0[stackIn_17_1];
            var14 = (-var15 + 256) * var14 >>> -1224043320;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 > -95) {
            return;
        }
        am.a(param3, 3974311, -58, param2, param1, param4);
    }

    final static void a(boolean param0) {
        if (!param0) {
            return;
        }
        hg.field_t = mp.field_b.c(oq.field_i[21]);
        int var1 = mp.field_b.c(oq.field_i[22]);
        if (!(var1 <= hg.field_t)) {
            hg.field_t = var1;
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          ((er) this).field_a[((er) this).field_o] = (byte)ee.a((int) ((er) this).field_a[((er) this).field_o], 128 >>> we.a(7, ((er) this).field_d));
          ((er) this).field_o = ((er) this).field_o + 1;
          if (((er) this).field_o > 32) {
            L1: while (true) {
              if (((er) this).field_o >= 64) {
                this.a((byte) -55);
                ((er) this).field_o = 0;
                break L0;
              } else {
                ((er) this).field_o = ((er) this).field_o + 1;
                ((er) this).field_a[((er) this).field_o] = (byte) 0;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: while (true) {
          if (((er) this).field_o >= 32) {
            ps.a(((er) this).field_k, 0, ((er) this).field_a, 32, 32);
            this.a((byte) -55);
            var4 = 0;
            var5 = param0;
            var6 = 59 % ((param1 - 19) / 32);
            L3: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var7 = ((er) this).field_c[var4];
                param2[var5] = (byte)(int)(var7 >>> 2033646584);
                param2[var5 + 1] = (byte)(int)(var7 >>> 1605775920);
                param2[2 + var5] = (byte)(int)(var7 >>> 139367336);
                param2[var5 - -3] = (byte)(int)(var7 >>> 878529632);
                param2[var5 + 4] = (byte)(int)(var7 >>> 1046446808);
                param2[var5 - -5] = (byte)(int)(var7 >>> 1171125584);
                param2[var5 - -6] = (byte)(int)(var7 >>> -1530803960);
                param2[var5 + 7] = (byte)(int)var7;
                var4++;
                var5 += 8;
                continue L3;
              }
            }
          } else {
            ((er) this).field_o = ((er) this).field_o + 1;
            ((er) this).field_a[((er) this).field_o] = (byte) 0;
            continue L2;
          }
        }
    }

    final static bi a(int param0, byte param1, int param2, fs param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        bi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (-1 != (param0 + param4 ^ -1)) {
          L0: {
            var5 = -77 / ((-61 - param1) / 34);
            if (param2 < param4) {
              param4 = param2;
              param0 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param4 - -param0 > param2) {
              param0 = param2 - param4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var6 = param4 * (182 + -pf.field_a[param3.field_x].field_z) / param2;
            var7 = (-pf.field_a[param3.field_x].field_z + 182) * param0 / param2;
            var8 = new bi(var6 + var7 + pf.field_a[param3.field_x].field_z / 2, 2 + rs.field_Cb.field_J);
            ra.a(-128);
            var8.e();
            if (param4 <= 0) {
              var7 = var7 + pf.field_a[param3.field_x].field_z / 2;
              var9 = ui.a(2105376, param3.field_k, -90, 128);
              var10 = 0;
              L3: while (true) {
                if (var7 <= var10) {
                  break L2;
                } else {
                  gf.j(var10, 0, var8.field_w, var9);
                  var10++;
                  continue L3;
                }
              }
            } else {
              var6 = var6 + pf.field_a[param3.field_x].field_z / 2;
              var9 = 0;
              L4: while (true) {
                if (var9 >= var6) {
                  if (-1 > (param0 ^ -1)) {
                    var9 = ui.a(2105376, param3.field_k, -106, 128);
                    var10 = 0;
                    L5: while (true) {
                      if (var10 >= var7) {
                        break L2;
                      } else {
                        gf.j(var6 + var10, 0, var8.field_w, var9);
                        var10++;
                        continue L5;
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  gf.j(var9, 0, var8.field_w, ui.a(0, param3.field_k, -81, 128 + var9 * 128 / var6));
                  var9++;
                  continue L4;
                }
              }
            }
          }
          var9 = 0;
          L6: while (true) {
            if (var8.field_z + -1 <= var9) {
              var9 = 0;
              L7: while (true) {
                if (var8.field_w <= var9) {
                  var8.field_B[var8.field_w * var8.field_z + -1] = ui.a(0, var8.field_B[var8.field_w * var8.field_z - 1], -92, 190);
                  cg.i(0);
                  return var8;
                } else {
                  var8.field_B[var8.field_z + -1 - -(var9 * var8.field_z)] = ui.a(0, var8.field_B[var9 * var8.field_z + -1 + var8.field_z], -109, 128);
                  var9++;
                  continue L7;
                }
              }
            } else {
              var8.field_B[var9] = ui.a(0, var8.field_B[var9], -124, 128);
              var8.field_B[(var8.field_w - 1) * var8.field_z + var9] = ui.a(0, var8.field_B[var9 + (-1 + var8.field_w) * var8.field_z], -97, 64);
              var9++;
              continue L6;
            }
          }
        } else {
          return new bi(1, 1);
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (10 < var2) {
                    L3: {
                      var2 = 0;
                      if (param0 == -55) {
                        break L3;
                      } else {
                        ((er) this).field_m = null;
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        ((er) this).field_c[var2] = bg.a(((er) this).field_c[var2], bg.a(((er) this).field_f[var2], ((er) this).field_m[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L6: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            ((er) this).field_e[0] = bg.a(((er) this).field_e[0], ke.field_k[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((er) this).field_f[var3] = ((er) this).field_h[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((er) this).field_h[var3] = ((er) this).field_e[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var7 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((er) this).field_h[var3] = bg.a(((er) this).field_h[var3], ke.field_l[var7][we.a((int)(((er) this).field_f[we.a(var3 - var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((er) this).field_e[var3] = ((er) this).field_h[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((er) this).field_h[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            ((er) this).field_h[var3] = bg.a(((er) this).field_h[var3], ke.field_l[var4][we.a(255, (int)(((er) this).field_e[we.a(7, -var4 + var3)] >>> var5))]);
                            var5 -= 8;
                            var4++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((er) this).field_e[var2] = ((er) this).field_c[var2];
                ((er) this).field_f[var2] = bg.a(((er) this).field_m[var2], ((er) this).field_c[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((er) this).field_m[var2] = bg.a(bg.a(bg.a(co.a((long)((er) this).field_a[5 + var3] << -1150471024, 16711680L), bg.a(bg.a(co.a((long)((er) this).field_a[var3 + 3], 255L) << 409282208, bg.a(bg.a(co.a((long)((er) this).field_a[1 + var3], 255L) << -1587319120, (long)((er) this).field_a[var3] << 279525944), co.a((long)((er) this).field_a[2 + var3] << -1317067160, 280375465082880L))), co.a(4278190080L, (long)((er) this).field_a[4 + var3] << -656577768))), co.a((long)((er) this).field_a[6 + var3], 255L) << -694505080), co.a(255L, (long)((er) this).field_a[7 + var3]));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_q = null;
        field_j = null;
        field_n = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_p = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            ((er) this).field_k[var2] = (byte) 0;
        }
        if (param0 != -169953503) {
            field_l = null;
        }
        ((er) this).field_a[0] = (byte) 0;
        ((er) this).field_o = 0;
        ((er) this).field_d = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            ((er) this).field_c[var2] = 0L;
        }
    }

    er() {
        ((er) this).field_c = new long[8];
        ((er) this).field_h = new long[8];
        ((er) this).field_a = new byte[64];
        ((er) this).field_o = 0;
        ((er) this).field_d = 0;
        ((er) this).field_e = new long[8];
        ((er) this).field_m = new long[8];
        ((er) this).field_f = new long[8];
        ((er) this).field_k = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "<%highlight>FLEET PLACEMENT</col> - To place fleets, <%key>click</col> on your Production panel (at the top of the <%highlight>Production window</col>), then <%key>click<col> on a <%glossary>system</col> you control.";
        field_p = "Press 'SPACE' to toggle game statistics";
        field_l = "<%highlight>ENDING TURNS</col> - <%key>Clicking</col> on the Ready button (a <%highlight>tick within a circle</col>) at the top-right of the screen marks your move as complete. Once all players have completed their moves, <%highlight>all orders will be executed</col> and a new turn will begin. Making any adjustments to your orders will clear your ready status, and you will need to press the button again when you are finished.";
        field_b = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
