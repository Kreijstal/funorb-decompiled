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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -((int)param1 & 7) + 8 & 7;
              var7 = ((er) this).field_d & 7;
              var9 = param1;
              if (param0 == 36) {
                break L1;
              } else {
                ((er) this).field_o = -5;
                break L1;
              }
            }
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (0 > var11) {
                L3: while (true) {
                  if (param1 <= 8L) {
                    L4: {
                      if (param1 <= 0L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param2[var5_int] << var6 & 255;
                        ((er) this).field_a[((er) this).field_o] = (byte)ee.a((int) ((er) this).field_a[((er) this).field_o], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if ((long)var7 - -param1 < 8L) {
                        ((er) this).field_d = (int)((long)((er) this).field_d + param1);
                        break L5;
                      } else {
                        L6: {
                          param1 = param1 - (long)(-var7 + 8);
                          ((er) this).field_o = ((er) this).field_o + 1;
                          ((er) this).field_d = ((er) this).field_d + (8 + -var7);
                          if (((er) this).field_d == 512) {
                            this.a((byte) -55);
                            ((er) this).field_o = 0;
                            ((er) this).field_d = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((er) this).field_a[((er) this).field_o] = (byte)we.a(var8 << -var7 + 8, 255);
                        ((er) this).field_d = ((er) this).field_d + (int)param1;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param2[var5_int] << var6 | (param2[1 + var5_int] & 255) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((er) this).field_a[((er) this).field_o] = (byte)ee.a((int) ((er) this).field_a[((er) this).field_o], var8 >>> var7);
                            ((er) this).field_o = ((er) this).field_o + 1;
                            ((er) this).field_d = ((er) this).field_d + (8 + -var7);
                            if (((er) this).field_d == 512) {
                              this.a((byte) -55);
                              ((er) this).field_o = 0;
                              ((er) this).field_d = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          ((er) this).field_a[((er) this).field_o] = (byte)we.a(255, var8 << -var7 + 8);
                          param1 = param1 - 8L;
                          ((er) this).field_d = ((er) this).field_d + var7;
                          var5_int++;
                          continue L3;
                        } else {
                          break L7;
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
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("er.J(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    final static void a(int param0, int param1, String param2, int param3, byte param4, boolean param5, int param6, int param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (hi.field_o.field_rb == 0) {
                break L1;
              } else {
                if (bg.field_g) {
                  break L1;
                } else {
                  if (ae.field_b) {
                    rg.a(true);
                    break L1;
                  } else {
                    sr.field_h = true;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (sr.field_h) {
                L3: {
                  ca.a(320, param0, param0, param2, param7, param1, -10, 20, 180);
                  fa.field_X.a(param5, -20429);
                  if (!param5) {
                    break L3;
                  } else {
                    L4: {
                      if (hd.field_m.field_rb == 0) {
                        break L4;
                      } else {
                        sr.field_h = false;
                        break L4;
                      }
                    }
                    if (cb.field_l.field_rb != 0) {
                      qq.c(false);
                      sr.field_h = false;
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("er.A(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 320 + ',' + 122 + ',' + param5 + ',' + 180 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, sr param5, int param6, int param7) {
        RuntimeException var8 = null;
        byte[] var9 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        hc var21_ref = null;
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
        int[] var42 = null;
        byte[] var43 = null;
        int var44 = 0;
        sr var45 = null;
        byte[] var46 = null;
        int[] var50 = null;
        int[] var51 = null;
        byte[] var54 = null;
        int[] var58 = null;
        int[] var59 = null;
        byte[] var62 = null;
        int[] var66 = null;
        int[] var67 = null;
        byte[] var70 = null;
        int[] var71 = null;
        int[] var72 = null;
        int[] var73 = null;
        int[] var74 = null;
        int[] var75 = null;
        int[] var76 = null;
        int[] var77 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        hc stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var40 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param5;
                if (null == var45.field_p) {
                  break L2;
                } else {
                  if (var45.field_o > 1) {
                    var70 = var45.field_p;
                    var62 = var70;
                    var54 = var62;
                    var46 = var54;
                    var43 = var46;
                    var9 = var43;
                    eb.a(0, 0, var70, 12, uo.field_h);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              kc.a((byte) -97);
              break L1;
            }
            var74 = new int[param5.field_e];
            var66 = var74;
            var58 = var66;
            var50 = var58;
            var41 = var50;
            var76 = var41;
            var75 = new int[param5.field_e];
            var67 = var75;
            var59 = var67;
            var51 = var59;
            var42 = var51;
            var77 = var42;
            var71 = fm.field_c;
            var72 = ra.field_f;
            var73 = hk.field_ob;
            var13 = 0;
            L3: while (true) {
              if (~param5.field_e >= ~var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (~var44 <= ~qj.field_e) {
                    break L0;
                  } else {
                    L5: {
                      var14 = jl.field_M[var44];
                      var15 = param5.field_s[var14];
                      var16 = param5.field_i[var14];
                      var17 = param5.field_B[var14];
                      if (param5.field_M[var14] >= fm.field_c.length) {
                        stackOut_24_0 = -1;
                        stackIn_25_0 = stackOut_24_0;
                        break L5;
                      } else {
                        stackOut_23_0 = param5.field_M[var14];
                        stackIn_25_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_25_0;
                      if (param5.field_P[var14] >= fm.field_c.length) {
                        stackOut_27_0 = -1;
                        stackIn_28_0 = stackOut_27_0;
                        break L6;
                      } else {
                        stackOut_26_0 = param5.field_P[var14];
                        stackIn_28_0 = stackOut_26_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_28_0;
                      if (param5.field_n[var14] < fm.field_c.length) {
                        stackOut_30_0 = param5.field_n[var14];
                        stackIn_31_0 = stackOut_30_0;
                        break L7;
                      } else {
                        stackOut_29_0 = -1;
                        stackIn_31_0 = stackOut_29_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_31_0;
                        if (wc.field_a == null) {
                          break L9;
                        } else {
                          if (null == param5.field_b) {
                            break L9;
                          } else {
                            if (var14 >= param5.field_b.length) {
                              break L9;
                            } else {
                              if (param5.field_b[var14] == -1) {
                                break L9;
                              } else {
                                if (~wc.field_a.length >= ~param5.field_b[var14]) {
                                  break L9;
                                } else {
                                  stackOut_36_0 = wc.field_a[param5.field_b[var14]];
                                  stackIn_38_0 = stackOut_36_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_38_0 = (hc) (Object) stackOut_37_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_38_0;
                        var22 = ul.field_Cb[var15];
                        var23 = he.field_i[var15];
                        var24 = ul.field_Cb[var16];
                        var25 = he.field_i[var16];
                        var26 = ul.field_Cb[var17];
                        var27 = he.field_i[var17];
                        if (~var18 != ~var19) {
                          break L11;
                        } else {
                          if (var20 != var19) {
                            break L11;
                          } else {
                            L12: {
                              var28 = var76[var18];
                              var29 = var77[var18];
                              if (var21_ref == null) {
                                stackOut_42_0 = 8355711;
                                stackIn_43_0 = stackOut_42_0;
                                break L12;
                              } else {
                                stackOut_41_0 = var21_ref.field_a;
                                stackIn_43_0 = stackOut_41_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_43_0;
                            var31 = 16711935 & var30;
                            var32 = 65280 & var30;
                            var33 = var28 * var31 >>> 8 & 268370175 | var28 * var32 >>> 8 & 989921024;
                            var33 = var33 + 65793 * var29;
                            oo.a(var23, var26, var27, var25, var33 >> 1 & 8355711, var24, true, var22);
                            break L10;
                          }
                        }
                      }
                      L13: {
                        var28 = var76[var18];
                        var29 = var76[var19];
                        var30 = var76[var20];
                        var31 = var77[var18];
                        var32 = var77[var19];
                        var33 = var77[var20];
                        if (var21_ref == null) {
                          stackOut_46_0 = 8355711;
                          stackIn_47_0 = stackOut_46_0;
                          break L13;
                        } else {
                          stackOut_45_0 = var21_ref.field_a;
                          stackIn_47_0 = stackOut_45_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = 16711935 & var34;
                      var36 = var34 & 65280;
                      var37 = (-16711905 & var35 * var28) >>> 8 | var28 * var36 >>> 8 & -1845428480;
                      var38 = (16711777 & var36 * var29) >>> 8 | var29 * var35 >>> 8 & 1459552511;
                      var37 = var37 + 65793 * var31;
                      var39 = var30 * var36 >>> 8 & -570360064 | (-16711872 & var30 * var35) >>> 8;
                      var38 = var38 + 65793 * var32;
                      var39 = var39 + var33 * 65793;
                      bf.a((var38 & 65365) >> 8, var37 & 255, var39 >> 16, var37 >> 8 & 255, var37 >> 16, var26, var22, var39 & 255, var25, 255 & var38, var27, (var39 & 65523) >> 8, var24, var38 >> 16, var23, 256);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = var71[var13] * param0 - -(var72[var13] * param3) + var73[var13] * param7 >> 8;
                  if (var14 >= 0) {
                    break L14;
                  } else {
                    var14 = -var14;
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackOut_14_0 = 128;
                    stackIn_15_0 = stackOut_14_0;
                    break L15;
                  } else {
                    if (var14 < 128) {
                      stackOut_13_0 = var14 + 128;
                      stackIn_15_0 = stackOut_13_0;
                      break L15;
                    } else {
                      stackOut_12_0 = 256;
                      stackIn_15_0 = stackOut_12_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_15_0;
                  var15 = var71[var13] * param6 - (-(param1 * var72[var13]) - var73[var13] * param4) >> 8;
                  stackOut_15_0 = uc.field_w;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (0 > var15) {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = -var15;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L16;
                  } else {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L16;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = (-var15 + 256) * var14 >>> 8;
                var74[var13] = var14;
                var75[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var8;
            stackOut_50_1 = new StringBuilder().append("er.C(").append(param0).append(',').append(param1).append(',').append(false).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param5 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw r.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        am.a(param3, 3974311, -58, param2, param1, param4);
    }

    final static void a(boolean param0) {
        hg.field_t = mp.field_b.c(oq.field_i[21]);
        int var1 = mp.field_b.c(oq.field_i[22]);
        if (!(var1 <= hg.field_t)) {
            hg.field_t = var1;
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((er) this).field_a[((er) this).field_o] = (byte)ee.a((int) ((er) this).field_a[((er) this).field_o], 128 >>> we.a(7, ((er) this).field_d));
              ((er) this).field_o = ((er) this).field_o + 1;
              if (((er) this).field_o > 32) {
                L2: while (true) {
                  if (((er) this).field_o >= 64) {
                    this.a((byte) -55);
                    ((er) this).field_o = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((er) this).field_o;
                    ((er) this).field_o = ((er) this).field_o + 1;
                    ((er) this).field_a[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (((er) this).field_o >= 32) {
                ps.a(((er) this).field_k, 0, ((er) this).field_a, 32, 32);
                this.a((byte) -55);
                var4_int = 0;
                var5 = param0;
                var6 = 59 % ((param1 - 19) / 32);
                L4: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var7 = ((er) this).field_c[var4_int];
                    param2[var5] = (byte)(int)(var7 >>> 56);
                    param2[var5 + 1] = (byte)(int)(var7 >>> 48);
                    param2[2 + var5] = (byte)(int)(var7 >>> 40);
                    param2[var5 - -3] = (byte)(int)(var7 >>> 32);
                    param2[var5 + 4] = (byte)(int)(var7 >>> 24);
                    param2[var5 - -5] = (byte)(int)(var7 >>> 16);
                    param2[var5 - -6] = (byte)(int)(var7 >>> 8);
                    param2[var5 + 7] = (byte)(int)var7;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$3 = ((er) this).field_o;
                ((er) this).field_o = ((er) this).field_o + 1;
                ((er) this).field_a[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("er.E(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static bi a(int param0, byte param1, int param2, fs param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        bi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bi stackIn_3_0 = null;
        bi stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_28_0 = null;
        bi stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 + param4 != 0) {
              L1: {
                var5_int = -77;
                if (param2 < param4) {
                  param4 = param2;
                  param0 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param4 - -param0 > param2) {
                  param0 = param2 - param4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var6 = param4 * (182 + -pf.field_a[param3.field_x].field_z) / param2;
                var7 = (-pf.field_a[param3.field_x].field_z + 182) * param0 / param2;
                var8 = new bi(var6 + var7 + pf.field_a[param3.field_x].field_z / 2, 2 + rs.field_Cb.field_J);
                ra.a(-128);
                var8.e();
                if (param4 <= 0) {
                  var7 = var7 + pf.field_a[param3.field_x].field_z / 2;
                  var9 = ui.a(2105376, param3.field_k, -90, 128);
                  var10 = 0;
                  L4: while (true) {
                    if (var7 <= var10) {
                      break L3;
                    } else {
                      gf.j(var10, 0, var8.field_w, var9);
                      var10++;
                      continue L4;
                    }
                  }
                } else {
                  var6 = var6 + pf.field_a[param3.field_x].field_z / 2;
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= var6) {
                      if (param0 > 0) {
                        var9 = ui.a(2105376, param3.field_k, -106, 128);
                        var10 = 0;
                        L6: while (true) {
                          if (var10 >= var7) {
                            break L3;
                          } else {
                            gf.j(var6 + var10, 0, var8.field_w, var9);
                            var10++;
                            continue L6;
                          }
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      gf.j(var9, 0, var8.field_w, ui.a(0, param3.field_k, -81, 128 + var9 * 128 / var6));
                      var9++;
                      continue L5;
                    }
                  }
                }
              }
              var9 = 0;
              L7: while (true) {
                if (var8.field_z + -1 <= var9) {
                  var9 = 0;
                  L8: while (true) {
                    if (var8.field_w <= var9) {
                      var8.field_B[var8.field_w * var8.field_z + -1] = ui.a(0, var8.field_B[var8.field_w * var8.field_z - 1], -92, 190);
                      cg.i(0);
                      stackOut_28_0 = (bi) var8;
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      var8.field_B[var8.field_z + -1 - -(var9 * var8.field_z)] = ui.a(0, var8.field_B[var9 * var8.field_z + -1 + var8.field_z], -109, 128);
                      var9++;
                      continue L8;
                    }
                  }
                } else {
                  var8.field_B[var9] = ui.a(0, var8.field_B[var9], -124, 128);
                  var8.field_B[(var8.field_w - 1) * var8.field_z + var9] = ui.a(0, var8.field_B[var9 + (-1 + var8.field_w) * var8.field_z], -97, 64);
                  var9++;
                  continue L7;
                }
              }
            } else {
              stackOut_2_0 = new bi(1, 1);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("er.G(").append(param0).append(',').append(-127).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param4 + ')');
        }
        return stackIn_29_0;
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
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((er) this).field_c[var2] = bg.a(((er) this).field_c[var2], bg.a(((er) this).field_f[var2], ((er) this).field_m[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L5: while (true) {
                          if (var3 >= 8) {
                            ((er) this).field_e[0] = bg.a(((er) this).field_e[0], ke.field_k[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((er) this).field_f[var3] = ((er) this).field_h[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((er) this).field_h[var3] = ((er) this).field_e[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((er) this).field_h[var3] = bg.a(((er) this).field_h[var3], ke.field_l[var7][we.a((int)(((er) this).field_f[we.a(var3 - var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((er) this).field_e[var3] = ((er) this).field_h[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((er) this).field_h[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((er) this).field_h[var3] = bg.a(((er) this).field_h[var3], ke.field_l[var4][we.a(255, (int)(((er) this).field_e[we.a(7, -var4 + var3)] >>> var5))]);
                            var5 -= 8;
                            var4++;
                            continue L9;
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
            ((er) this).field_m[var2] = bg.a(bg.a(bg.a(co.a((long)((er) this).field_a[5 + var3] << 16, 16711680L), bg.a(bg.a(co.a((long)((er) this).field_a[var3 + 3], 255L) << 32, bg.a(bg.a(co.a((long)((er) this).field_a[1 + var3], 255L) << 48, (long)((er) this).field_a[var3] << 56), co.a((long)((er) this).field_a[2 + var3] << 40, 280375465082880L))), co.a(4278190080L, (long)((er) this).field_a[4 + var3] << 24))), co.a((long)((er) this).field_a[6 + var3], 255L) << 8), co.a(255L, (long)((er) this).field_a[7 + var3]));
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
        field_p = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((er) this).field_k[var2] = (byte) 0;
        }
        if (param0 != -169953503) {
            field_l = null;
        }
        ((er) this).field_a[0] = (byte) 0;
        ((er) this).field_o = 0;
        ((er) this).field_d = 0;
        for (var2 = 0; var2 < 8; var2++) {
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
