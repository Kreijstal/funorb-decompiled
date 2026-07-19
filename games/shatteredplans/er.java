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
              var7 = this.field_d & 7;
              var9 = param1;
              if (param0 == 36) {
                break L1;
              } else {
                this.field_o = -5;
                break L1;
              }
            }
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (0 > var11) {
                L3: while (true) {
                  if (-9L <= (param1 ^ -1L)) {
                    L4: {
                      if ((param1 ^ -1L) >= -1L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param2[var5_int] << var6 & 255;
                        this.field_a[this.field_o] = (byte)ee.a((int) this.field_a[this.field_o], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if ((long)var7 - -param1 < 8L) {
                        this.field_d = (int)((long)this.field_d + param1);
                        break L5;
                      } else {
                        L6: {
                          param1 = param1 - (long)(-var7 + 8);
                          this.field_o = this.field_o + 1;
                          this.field_d = this.field_d + (8 + -var7);
                          if (-513 == (this.field_d ^ -1)) {
                            this.a((byte) -55);
                            this.field_o = 0;
                            this.field_d = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        this.field_a[this.field_o] = (byte)we.a(var8 << -var7 + 8, 255);
                        this.field_d = this.field_d + (int)param1;
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
                        if ((var8 ^ -1) > -257) {
                          L8: {
                            this.field_a[this.field_o] = (byte)ee.a((int) this.field_a[this.field_o], var8 >>> var7);
                            this.field_o = this.field_o + 1;
                            this.field_d = this.field_d + (8 + -var7);
                            if (this.field_d == 512) {
                              this.a((byte) -55);
                              this.field_o = 0;
                              this.field_d = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          this.field_a[this.field_o] = (byte)we.a(255, var8 << -var7 + 8);
                          param1 = param1 - 8L;
                          this.field_d = this.field_d + var7;
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
                var12 = var12 + ((255 & this.field_k[var11]) - -(255 & (int)var9));
                this.field_k[var11] = (byte)var12;
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
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("er.J(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final static void a(int param0, int param1, String param2, int param3, byte param4, boolean param5, int param6, int param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param4 >= 97) {
                break L1;
              } else {
                er.a(-92, 119, -115, 97, 9);
                break L1;
              }
            }
            L2: {
              if (-1 == (hi.field_o.field_rb ^ -1)) {
                break L2;
              } else {
                if (bg.field_g) {
                  break L2;
                } else {
                  if (ae.field_b) {
                    rg.a(true);
                    break L2;
                  } else {
                    sr.field_h = true;
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (sr.field_h) {
                ca.a(param3, param0, param0, param2, param7, param1, -10, 20, param6);
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
                  if (-1 != (cb.field_l.field_rb ^ -1)) {
                    qq.c(false);
                    sr.field_h = false;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var8);
            stackOut_16_1 = new StringBuilder().append("er.A(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, sr param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
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
        int var44 = 0;
        sr var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        hc stackIn_39_0 = null;
        int stackIn_44_0 = 0;
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
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int stackIn_47_6 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        hc stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        int stackOut_44_5 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_45_6 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var40 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param5;
                if (null == var45.field_p) {
                  break L2;
                } else {
                  if ((var45.field_o ^ -1) < -2) {
                    var61 = var45.field_p;
                    eb.a(0, 0, var61, 12, uo.field_h);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              kc.a((byte) -97);
              break L1;
            }
            var55 = new int[param5.field_e];
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var65 = new int[param5.field_e];
            var62 = fm.field_c;
            var63 = ra.field_f;
            var64 = hk.field_ob;
            var13 = 0;
            L3: while (true) {
              if (param5.field_e <= var13) {
                if (!param2) {
                  var44 = 0;
                  var13 = var44;
                  L4: while (true) {
                    if (var44 >= qj.field_e) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L5: {
                        var14 = jl.field_M[var44];
                        var15 = param5.field_s[var14];
                        var16 = param5.field_i[var14];
                        var17 = param5.field_B[var14];
                        if (param5.field_M[var14] >= fm.field_c.length) {
                          stackOut_25_0 = -1;
                          stackIn_26_0 = stackOut_25_0;
                          break L5;
                        } else {
                          stackOut_24_0 = param5.field_M[var14];
                          stackIn_26_0 = stackOut_24_0;
                          break L5;
                        }
                      }
                      L6: {
                        var18 = stackIn_26_0;
                        if (param5.field_P[var14] >= fm.field_c.length) {
                          stackOut_28_0 = -1;
                          stackIn_29_0 = stackOut_28_0;
                          break L6;
                        } else {
                          stackOut_27_0 = param5.field_P[var14];
                          stackIn_29_0 = stackOut_27_0;
                          break L6;
                        }
                      }
                      L7: {
                        var19 = stackIn_29_0;
                        if (param5.field_n[var14] < fm.field_c.length) {
                          stackOut_31_0 = param5.field_n[var14];
                          stackIn_32_0 = stackOut_31_0;
                          break L7;
                        } else {
                          stackOut_30_0 = -1;
                          stackIn_32_0 = stackOut_30_0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          var20 = stackIn_32_0;
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
                                  if (wc.field_a.length <= param5.field_b[var14]) {
                                    break L9;
                                  } else {
                                    stackOut_37_0 = wc.field_a[param5.field_b[var14]];
                                    stackIn_39_0 = stackOut_37_0;
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_38_0 = null;
                        stackIn_39_0 = (hc) ((Object) stackOut_38_0);
                        break L8;
                      }
                      L10: {
                        L11: {
                          var21_ref = stackIn_39_0;
                          var22 = ul.field_Cb[var15];
                          var23 = he.field_i[var15];
                          var24 = ul.field_Cb[var16];
                          var25 = he.field_i[var16];
                          var26 = ul.field_Cb[var17];
                          var27 = he.field_i[var17];
                          if (var18 != var19) {
                            break L11;
                          } else {
                            if (var20 != var19) {
                              break L11;
                            } else {
                              L12: {
                                var28 = var55[var18];
                                var29 = var65[var18];
                                if (var21_ref == null) {
                                  stackOut_43_0 = 8355711;
                                  stackIn_44_0 = stackOut_43_0;
                                  break L12;
                                } else {
                                  stackOut_42_0 = var21_ref.field_a;
                                  stackIn_44_0 = stackOut_42_0;
                                  break L12;
                                }
                              }
                              L13: {
                                var30 = stackIn_44_0;
                                var31 = 16711935 & var30;
                                var32 = 65280 & var30;
                                var33 = var28 * var31 >>> -1791041976 & 268370175 | var28 * var32 >>> 602548744 & 989921024;
                                var33 = var33 + 65793 * var29;
                                stackOut_44_0 = var23;
                                stackOut_44_1 = var26;
                                stackOut_44_2 = var27;
                                stackOut_44_3 = var25;
                                stackOut_44_4 = var33 >> -169953503 & 8355711;
                                stackOut_44_5 = var24;
                                stackIn_46_0 = stackOut_44_0;
                                stackIn_46_1 = stackOut_44_1;
                                stackIn_46_2 = stackOut_44_2;
                                stackIn_46_3 = stackOut_44_3;
                                stackIn_46_4 = stackOut_44_4;
                                stackIn_46_5 = stackOut_44_5;
                                stackIn_45_0 = stackOut_44_0;
                                stackIn_45_1 = stackOut_44_1;
                                stackIn_45_2 = stackOut_44_2;
                                stackIn_45_3 = stackOut_44_3;
                                stackIn_45_4 = stackOut_44_4;
                                stackIn_45_5 = stackOut_44_5;
                                if (param2) {
                                  stackOut_46_0 = stackIn_46_0;
                                  stackOut_46_1 = stackIn_46_1;
                                  stackOut_46_2 = stackIn_46_2;
                                  stackOut_46_3 = stackIn_46_3;
                                  stackOut_46_4 = stackIn_46_4;
                                  stackOut_46_5 = stackIn_46_5;
                                  stackOut_46_6 = 0;
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  stackIn_47_2 = stackOut_46_2;
                                  stackIn_47_3 = stackOut_46_3;
                                  stackIn_47_4 = stackOut_46_4;
                                  stackIn_47_5 = stackOut_46_5;
                                  stackIn_47_6 = stackOut_46_6;
                                  break L13;
                                } else {
                                  stackOut_45_0 = stackIn_45_0;
                                  stackOut_45_1 = stackIn_45_1;
                                  stackOut_45_2 = stackIn_45_2;
                                  stackOut_45_3 = stackIn_45_3;
                                  stackOut_45_4 = stackIn_45_4;
                                  stackOut_45_5 = stackIn_45_5;
                                  stackOut_45_6 = 1;
                                  stackIn_47_0 = stackOut_45_0;
                                  stackIn_47_1 = stackOut_45_1;
                                  stackIn_47_2 = stackOut_45_2;
                                  stackIn_47_3 = stackOut_45_3;
                                  stackIn_47_4 = stackOut_45_4;
                                  stackIn_47_5 = stackOut_45_5;
                                  stackIn_47_6 = stackOut_45_6;
                                  break L13;
                                }
                              }
                              oo.a(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_47_4, stackIn_47_5, stackIn_47_6 != 0, var22);
                              break L10;
                            }
                          }
                        }
                        L14: {
                          var28 = var55[var18];
                          var29 = var55[var19];
                          var30 = var55[var20];
                          var31 = var65[var18];
                          var32 = var65[var19];
                          var33 = var65[var20];
                          if (var21_ref == null) {
                            stackOut_50_0 = 8355711;
                            stackIn_51_0 = stackOut_50_0;
                            break L14;
                          } else {
                            stackOut_49_0 = var21_ref.field_a;
                            stackIn_51_0 = stackOut_49_0;
                            break L14;
                          }
                        }
                        var34 = stackIn_51_0;
                        var35 = 16711935 & var34;
                        var36 = var34 & 65280;
                        var37 = (-16711905 & var35 * var28) >>> 1592360616 | var28 * var36 >>> -1029733688 & -1845428480;
                        var38 = (16711777 & var36 * var29) >>> -2122901528 | var29 * var35 >>> -219224248 & 1459552511;
                        var37 = var37 + 65793 * var31;
                        var39 = var30 * var36 >>> -1019995096 & -570360064 | (-16711872 & var30 * var35) >>> -298751192;
                        var38 = var38 + 65793 * var32;
                        var39 = var39 + var33 * 65793;
                        bf.a((var38 & 65365) >> 1347032712, var37 & 255, var39 >> 1216567952, var37 >> -1397179576 & 255, var37 >> 851544272, var26, var22, var39 & 255, var25, 255 & var38, var27, (var39 & 65523) >> 1164154184, var24, var38 >> -685475440, var23, 256);
                        break L10;
                      }
                      var44++;
                      continue L4;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L15: {
                  var14 = var62[var13] * param0 - -(var63[var13] * param3) + var64[var13] * param7 >> 258849736;
                  if ((var14 ^ -1) <= -1) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (-1 < (var14 ^ -1)) {
                    stackOut_14_0 = 128;
                    stackIn_15_0 = stackOut_14_0;
                    break L16;
                  } else {
                    if ((var14 ^ -1) > -129) {
                      stackOut_13_0 = var14 + 128;
                      stackIn_15_0 = stackOut_13_0;
                      break L16;
                    } else {
                      stackOut_12_0 = 256;
                      stackIn_15_0 = stackOut_12_0;
                      break L16;
                    }
                  }
                }
                L17: {
                  var14 = stackIn_15_0;
                  var15 = var62[var13] * param6 - (-(param1 * var63[var13]) - var64[var13] * param4) >> -1986276792;
                  stackOut_15_0 = uc.field_w;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (0 > var15) {
                    stackOut_17_0 = (int[]) ((Object) stackIn_17_0);
                    stackOut_17_1 = -var15;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L17;
                  } else {
                    stackOut_16_0 = (int[]) ((Object) stackIn_16_0);
                    stackOut_16_1 = var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L17;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = (-var15 + 256) * var14 >>> -1224043320;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) (var8);
            stackOut_54_1 = new StringBuilder().append("er.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param5 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L18;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L18;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
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
              this.field_a[this.field_o] = (byte)ee.a((int) this.field_a[this.field_o], 128 >>> we.a(7, this.field_d));
              this.field_o = this.field_o + 1;
              if (this.field_o > 32) {
                L2: while (true) {
                  if (this.field_o >= 64) {
                    this.a((byte) -55);
                    this.field_o = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_o;
                    this.field_o = this.field_o + 1;
                    this.field_a[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (this.field_o >= 32) {
                ps.a(this.field_k, 0, this.field_a, 32, 32);
                this.a((byte) -55);
                var4_int = 0;
                var5 = param0;
                var6 = 59 % ((param1 - 19) / 32);
                L4: while (true) {
                  if ((var4_int ^ -1) <= -9) {
                    break L0;
                  } else {
                    var7 = this.field_c[var4_int];
                    param2[var5] = (byte)(int)(var7 >>> 2033646584);
                    param2[var5 + 1] = (byte)(int)(var7 >>> 1605775920);
                    param2[2 + var5] = (byte)(int)(var7 >>> 139367336);
                    param2[var5 - -3] = (byte)(int)(var7 >>> 878529632);
                    param2[var5 + 4] = (byte)(int)(var7 >>> 1046446808);
                    param2[var5 - -5] = (byte)(int)(var7 >>> 1171125584);
                    param2[var5 - -6] = (byte)(int)(var7 >>> -1530803960);
                    param2[var5 + 7] = (byte)(int)var7;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                fieldTemp$3 = this.field_o;
                this.field_o = this.field_o + 1;
                this.field_a[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("er.E(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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
        int decompiledRegionSelector0 = 0;
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
            if (-1 != (param0 + param4 ^ -1)) {
              L1: {
                var5_int = -77 / ((-61 - param1) / 34);
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
                      if (-1 > (param0 ^ -1)) {
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
                      stackOut_28_0 = (bi) (var8);
                      stackIn_29_0 = stackOut_28_0;
                      decompiledRegionSelector0 = 1;
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var5);
            stackOut_30_1 = new StringBuilder().append("er.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_29_0;
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
                        this.field_m = (long[]) null;
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        this.field_c[var2] = bg.a(this.field_c[var2], bg.a(this.field_f[var2], this.field_m[var2]));
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
                            this.field_e[0] = bg.a(this.field_e[0], ke.field_k[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_f[var3] = this.field_h[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_h[var3] = this.field_e[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var7 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_h[var3] = bg.a(this.field_h[var3], ke.field_l[var7][we.a((int)(this.field_f[we.a(var3 - var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_e[var3] = this.field_h[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_h[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_h[var3] = bg.a(this.field_h[var3], ke.field_l[var4][we.a(255, (int)(this.field_e[we.a(7, -var4 + var3)] >>> var5))]);
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
                this.field_e[var2] = this.field_c[var2];
                this.field_f[var2] = bg.a(this.field_m[var2], this.field_c[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_m[var2] = bg.a(bg.a(bg.a(co.a((long)this.field_a[5 + var3] << -1150471024, 16711680L), bg.a(bg.a(co.a((long)this.field_a[var3 + 3], 255L) << 409282208, bg.a(bg.a(co.a((long)this.field_a[1 + var3], 255L) << -1587319120, (long)this.field_a[var3] << 279525944), co.a((long)this.field_a[2 + var3] << -1317067160, 280375465082880L))), co.a(4278190080L, (long)this.field_a[4 + var3] << -656577768))), co.a((long)this.field_a[6 + var3], 255L) << -694505080), co.a(255L, (long)this.field_a[7 + var3]));
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
            this.field_k[var2] = (byte) 0;
        }
        if (param0 != -169953503) {
            field_l = (String) null;
        }
        this.field_a[0] = (byte) 0;
        this.field_o = 0;
        this.field_d = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            this.field_c[var2] = 0L;
        }
    }

    er() {
        this.field_c = new long[8];
        this.field_h = new long[8];
        this.field_a = new byte[64];
        this.field_o = 0;
        this.field_d = 0;
        this.field_e = new long[8];
        this.field_m = new long[8];
        this.field_f = new long[8];
        this.field_k = new byte[32];
    }

    static {
        field_n = "<%highlight>FLEET PLACEMENT</col> - To place fleets, <%key>click</col> on your Production panel (at the top of the <%highlight>Production window</col>), then <%key>click<col> on a <%glossary>system</col> you control.";
        field_p = "Press 'SPACE' to toggle game statistics";
        field_l = "<%highlight>ENDING TURNS</col> - <%key>Clicking</col> on the Ready button (a <%highlight>tick within a circle</col>) at the top-right of the screen marks your move as complete. Once all players have completed their moves, <%highlight>all orders will be executed</col> and a new turn will begin. Making any adjustments to your orders will clear your ready status, and you will need to press the button again when you are finished.";
        field_b = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
