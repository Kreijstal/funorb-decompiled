/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bi {
    private hb field_g;
    private int field_j;
    static qc field_b;
    private int field_c;
    static int field_d;
    static int field_a;
    static int field_e;
    private hb field_f;
    static int field_i;
    static int field_h;

    final static void a(byte param0, int param1, int param2, int param3, uh param4, int param5, int param6, int param7) {
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
        cf var21_ref = null;
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
        uh var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        cf stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        short stackOut_30_0 = 0;
        cf stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param4;
                if (var45.field_k == null) {
                  break L2;
                } else {
                  if (-2 <= (var45.field_j ^ -1)) {
                    break L2;
                  } else {
                    var61 = var45.field_k;
                    qj.a(0, var61, md.field_t, 0, 0);
                    break L1;
                  }
                }
              }
              ek.b(1);
              break L1;
            }
            L3: {
              var55 = new int[param4.field_b];
              var50 = var55;
              var41 = var50;
              var8_array = var41;
              var65 = new int[param4.field_b];
              var64 = mh.field_a;
              if (param0 >= 44) {
                break L3;
              } else {
                bi.a((byte) 81);
                break L3;
              }
            }
            var63 = fa.field_e;
            var62 = tk.field_r;
            var13 = 0;
            L4: while (true) {
              if (var13 >= param4.field_b) {
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (var44 >= cf.field_c) {
                    break L0;
                  } else {
                    L6: {
                      var14 = he.field_a[var44];
                      var15 = param4.field_K[var14];
                      var16 = param4.field_o[var14];
                      var17 = param4.field_w[var14];
                      if (param4.field_D[var14] >= mh.field_a.length) {
                        stackOut_25_0 = -1;
                        stackIn_26_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_24_0 = param4.field_D[var14];
                        stackIn_26_0 = stackOut_24_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_26_0;
                      if (param4.field_C[var14] >= mh.field_a.length) {
                        stackOut_28_0 = -1;
                        stackIn_29_0 = stackOut_28_0;
                        break L7;
                      } else {
                        stackOut_27_0 = param4.field_C[var14];
                        stackIn_29_0 = stackOut_27_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_29_0;
                      if (param4.field_g[var14] >= mh.field_a.length) {
                        stackOut_31_0 = -1;
                        stackIn_32_0 = stackOut_31_0;
                        break L8;
                      } else {
                        stackOut_30_0 = param4.field_g[var14];
                        stackIn_32_0 = stackOut_30_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_32_0;
                        if (vc.field_f == null) {
                          break L10;
                        } else {
                          if (null == param4.field_s) {
                            break L10;
                          } else {
                            if (var14 >= param4.field_s.length) {
                              break L10;
                            } else {
                              if (param4.field_s[var14] == -1) {
                                break L10;
                              } else {
                                if (param4.field_s[var14] >= vc.field_f.length) {
                                  break L10;
                                } else {
                                  stackOut_37_0 = vc.field_f[param4.field_s[var14]];
                                  stackIn_39_0 = stackOut_37_0;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_38_0 = null;
                      stackIn_39_0 = (cf) ((Object) stackOut_38_0);
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_39_0;
                        var22 = qb.field_ab[var15];
                        var23 = a.field_d[var15];
                        var24 = qb.field_ab[var16];
                        var25 = a.field_d[var16];
                        var26 = qb.field_ab[var17];
                        var27 = a.field_d[var17];
                        if (var19 != var18) {
                          break L12;
                        } else {
                          if (var20 == var19) {
                            L13: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21_ref != null) {
                                stackOut_48_0 = var21_ref.field_a;
                                stackIn_49_0 = stackOut_48_0;
                                break L13;
                              } else {
                                stackOut_47_0 = 8355711;
                                stackIn_49_0 = stackOut_47_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_49_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = (16711919 & var32 * var28) >>> -1822674104 | var31 * var28 >>> 1598065544 & 1761542399;
                            var33 = var33 + 65793 * var29;
                            uf.a(var27, var26, var33 >> 395252289 & 8355711, var24, -113, var22, var23, var25);
                            break L11;
                          } else {
                            break L12;
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
                          stackOut_44_0 = 8355711;
                          stackIn_45_0 = stackOut_44_0;
                          break L14;
                        } else {
                          stackOut_43_0 = var21_ref.field_a;
                          stackIn_45_0 = stackOut_43_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_45_0;
                      var35 = 16711935 & var34;
                      var36 = var34 & 65280;
                      var37 = (var28 * var36 & 16711860) >>> 1721603848 | (-16711739 & var35 * var28) >>> 1335525992;
                      var38 = 167706879 & var35 * var29 >>> 1827174376 | 1761672960 & var29 * var36 >>> 1003761064;
                      var38 = var38 + var32 * 65793;
                      var37 = var37 + 65793 * var31;
                      var39 = var35 * var30 >>> -1117359800 & -1124138753 | (16711776 & var36 * var30) >>> -15152536;
                      var39 = var39 + var33 * 65793;
                      w.a(var23, var26, 255 & var39, (65320 & var37) >> 1019571336, var24, var37 & 255, -22, var37 >> 1928597840, var39 >> -1075891632, var22, 255 & var38, var38 >> -1513576632 & 255, var38 >> -1460285456, var25, 255 & var39 >> -1428730936, var27);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var62[var13] * param3 + (var63[var13] * param6 + param7 * var64[var13]) >> -1180556216;
                  if (-1 < (var14 ^ -1)) {
                    var14 = -var14;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (-1 < (var14 ^ -1)) {
                    stackOut_16_0 = 128;
                    stackIn_17_0 = stackOut_16_0;
                    break L16;
                  } else {
                    if (128 > var14) {
                      stackOut_15_0 = var14 + 128;
                      stackIn_17_0 = stackOut_15_0;
                      break L16;
                    } else {
                      stackOut_14_0 = 256;
                      stackIn_17_0 = stackOut_14_0;
                      break L16;
                    }
                  }
                }
                L17: {
                  var14 = stackIn_17_0;
                  var15 = var62[var13] * param2 + (param1 * var64[var13] + param5 * var63[var13]) >> -1112973432;
                  stackOut_17_0 = ud.field_i;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var15 >= 0) {
                    stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                    stackOut_19_1 = var15;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L17;
                  } else {
                    stackOut_18_0 = (int[]) ((Object) stackIn_18_0);
                    stackOut_18_1 = -var15;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L17;
                  }
                }
                var15 = stackIn_20_0[stackIn_20_1];
                var14 = var14 * (256 - var15) >>> -1217148632;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var8);
            stackOut_52_1 = new StringBuilder().append("bi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param4 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L18;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L18;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final boolean a(byte param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5 = this.field_f;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param0 == -46) {
                    break L2;
                  } else {
                    bi.a((byte) 87);
                    break L2;
                  }
                }
                L3: {
                  if ((param3 ^ -1) > -1) {
                    break L3;
                  } else {
                    if (this.field_c < param3) {
                      break L3;
                    } else {
                      L4: {
                        var6 = this.a(-24942, param2, param3, true, param1) ? 1 : 0;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(-24942, param2, param3, false, param1) ? 1 : 0;
                          break L4;
                        }
                      }
                      stackOut_9_0 = var6;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                }
                throw new IllegalArgumentException();
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5_ref);
            stackOut_13_1 = new StringBuilder().append("bi.E(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final byte[] a(int param0, int param1) {
        try {
            int incrementValue$1 = 0;
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_55_0 = null;
            var18 = SolKnight.field_L ? 1 : 0;
            var3 = this.field_f;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 + param1 * 6) <= this.field_g.a(33)) {
                    this.field_g.a((long)(6 * param1), (byte) 45);
                    this.field_g.b(aj.field_t, -100, 0, 6);
                    var4_int = ((aj.field_t[0] & 255) << 127283760) - -((255 & aj.field_t[1]) << -925871512) - -(255 & aj.field_t[2]);
                    var5 = (255 & aj.field_t[5]) + ((255 & aj.field_t[4]) << 1282593640) + ((255 & aj.field_t[3]) << 18622608);
                    if (var4_int >= 0) {
                      if (var4_int <= this.field_c) {
                        if (var5 > 0) {
                          if ((long)var5 <= this.field_f.a(33) / 520L) {
                            L1: {
                              var6 = new byte[var4_int];
                              if (param0 == -925871512) {
                                break L1;
                              } else {
                                this.field_j = 45;
                                break L1;
                              }
                            }
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_52_0 = (byte[]) (var6);
                                stackIn_53_0 = stackOut_52_0;
                                stackOut_53_0 = (byte[]) ((Object) stackIn_53_0);
                                stackIn_54_0 = stackOut_53_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    this.field_f.a((long)(var5 * 520), (byte) 45);
                                    var9 = var4_int + -var7;
                                    if (65535 >= param1) {
                                      L4: {
                                        if (512 < var9) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      this.field_f.b(aj.field_t, param0 + 925871438, 0, var9 + var14);
                                      var13 = 255 & aj.field_t[7];
                                      var10 = ((aj.field_t[0] & 255) << 292145288) + (aj.field_t[1] & 255);
                                      var11 = (aj.field_t[2] << 1861713032 & 65280) + (255 & aj.field_t[3]);
                                      var12 = ((255 & aj.field_t[5]) << 358326536) + (16711680 & aj.field_t[4] << 314267568) + (255 & aj.field_t[6]);
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 10;
                                        if ((var9 ^ -1) < -511) {
                                          var9 = 510;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      this.field_f.b(aj.field_t, -79, 0, var9 - -var14);
                                      var13 = aj.field_t[9] & 255;
                                      var12 = ((255 & aj.field_t[7]) << -1631991192) + (16711680 & aj.field_t[6] << 980758512) + (255 & aj.field_t[8]);
                                      var10 = (255 & aj.field_t[3]) + (aj.field_t[0] << -1950152040 & -16777216) + ((16711680 & aj.field_t[1] << -1028614288) - -((255 & aj.field_t[2]) << 1061416040));
                                      var11 = (255 & aj.field_t[5]) + (65280 & aj.field_t[4] << 1513162664);
                                      break L3;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var11 == var8) {
                                      if (this.field_j == var13) {
                                        if (var12 >= 0) {
                                          if (((long)var12 ^ -1L) >= (this.field_f.a(33) / 520L ^ -1L)) {
                                            var15 = var14 - -var9;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var15 <= var16) {
                                                var8++;
                                                var5 = var12;
                                                continue L2;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = aj.field_t[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    return null;
                                  }
                                } else {
                                  stackOut_22_0 = null;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackOut_23_0 = stackIn_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        stackOut_9_0 = stackIn_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_55_0 = null;
                stackIn_56_0 = stackOut_55_0;
                return (byte[]) ((Object) stackIn_56_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_10_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_16_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_24_0);
                  } else {
                    return stackIn_54_0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, int param4) {
        try {
            boolean discarded$1 = false;
            Object var6 = null;
            RuntimeException var6_ref = null;
            Object var6_ref2 = null;
            IOException var7 = null;
            int var7_int = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            byte[] var17 = null;
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_63_0 = 0;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_62_0 = 0;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            var16 = SolKnight.field_L ? 1 : 0;
            try {
              var6_ref2 = this.field_f;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param3) {
                        var7_int = (int)((this.field_f.a(33) - -519L) / 520L);
                        if (-1 != (var7_int ^ -1)) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if ((this.field_g.a(33) ^ -1L) <= ((long)(param4 * 6 + 6) ^ -1L)) {
                          L2: {
                            this.field_g.a((long)(param4 * 6), (byte) 45);
                            this.field_g.b(aj.field_t, param0 ^ 24851, 0, 6);
                            var7_int = (aj.field_t[5] & 255) + ((aj.field_t[3] << 1994098000 & 16711680) - -(aj.field_t[4] << -247011768 & 65280));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (this.field_f.a(33) / 520L >= (long)var7_int) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      aj.field_t[1] = (byte)(param2 >> -310395960);
                      aj.field_t[2] = (byte)param2;
                      aj.field_t[5] = (byte)var7_int;
                      aj.field_t[0] = (byte)(param2 >> -599167696);
                      aj.field_t[3] = (byte)(var7_int >> -1662830480);
                      aj.field_t[4] = (byte)(var7_int >> -1638179320);
                      this.field_g.a((long)(param4 * 6), (byte) 45);
                      this.field_g.a(aj.field_t, -20291, 6, 0);
                      if (param0 == -24942) {
                        break L3;
                      } else {
                        var17 = (byte[]) null;
                        discarded$1 = this.a((byte) -38, -14, (byte[]) null, 28);
                        break L3;
                      }
                    }
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param2 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (param3) {
                              L7: {
                                this.field_f.a((long)(520 * var7_int), (byte) 45);
                                if ((param4 ^ -1) < -65536) {
                                  try {
                                    L8: {
                                      this.field_f.b(aj.field_t, param0 + 24822, 0, 10);
                                      decompiledRegionSelector1 = 0;
                                      break L8;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L9: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L9;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var10 = (255 & aj.field_t[8]) + (aj.field_t[6] << -1091346576 & 16711680) - -(aj.field_t[7] << -1331777016 & 65280);
                                    var11 = (255 & aj.field_t[3]) + (((aj.field_t[2] & 255) << 967179336) + (aj.field_t[1] << 1986446800 & 16711680) + ((aj.field_t[0] & 255) << -1916082024));
                                    var13 = aj.field_t[9] & 255;
                                    var12 = (255 & aj.field_t[5]) + ((aj.field_t[4] & 255) << -2028889848);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_f.b(aj.field_t, -118, 0, 8);
                                      decompiledRegionSelector0 = 0;
                                      break L10;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L11: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L11;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var10 = (16711680 & aj.field_t[4] << -179264656) - (-(aj.field_t[5] << 1667148456 & 65280) - (aj.field_t[6] & 255));
                                    var12 = ((255 & aj.field_t[2]) << -1422679416) + (aj.field_t[3] & 255);
                                    var13 = 255 & aj.field_t[7];
                                    var11 = (255 & aj.field_t[1]) + (aj.field_t[0] << 761439560 & 65280);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (var11 != param4) {
                                  break L12;
                                } else {
                                  if (var12 != var9) {
                                    break L12;
                                  } else {
                                    if (this.field_j == var13) {
                                      L13: {
                                        if (0 > var10) {
                                          break L13;
                                        } else {
                                          if (this.field_f.a(33) / 520L >= (long)var10) {
                                            break L6;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackOut_41_0 = stackIn_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_34_0 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              stackOut_35_0 = stackIn_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                          L14: {
                            if (var10 != 0) {
                              break L14;
                            } else {
                              L15: {
                                var10 = (int)((this.field_f.a(33) + 519L) / 520L);
                                param3 = false;
                                if (0 != var10) {
                                  break L15;
                                } else {
                                  var10++;
                                  break L15;
                                }
                              }
                              if (var10 != var7_int) {
                                break L14;
                              } else {
                                var10++;
                                break L14;
                              }
                            }
                          }
                          L16: {
                            if (-513 > (param2 + -var8 ^ -1)) {
                              break L16;
                            } else {
                              var10 = 0;
                              break L16;
                            }
                          }
                          L17: {
                            if ((param4 ^ -1) < -65536) {
                              L18: {
                                aj.field_t[3] = (byte)param4;
                                aj.field_t[2] = (byte)(param4 >> 644578728);
                                aj.field_t[9] = (byte)this.field_j;
                                aj.field_t[1] = (byte)(param4 >> 1930267344);
                                aj.field_t[0] = (byte)(param4 >> 1823467064);
                                aj.field_t[6] = (byte)(var10 >> 992722800);
                                aj.field_t[5] = (byte)var9;
                                aj.field_t[7] = (byte)(var10 >> 1397823944);
                                aj.field_t[4] = (byte)(var9 >> 1764226344);
                                aj.field_t[8] = (byte)var10;
                                this.field_f.a((long)(var7_int * 520), (byte) 45);
                                this.field_f.a(aj.field_t, -20291, 10, 0);
                                var11 = param2 + -var8;
                                if (510 < var11) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_f.a(param1, -20291, var11, var8);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                aj.field_t[1] = (byte)param4;
                                aj.field_t[0] = (byte)(param4 >> 1834801704);
                                aj.field_t[3] = (byte)var9;
                                aj.field_t[6] = (byte)var10;
                                aj.field_t[4] = (byte)(var10 >> 910679536);
                                aj.field_t[7] = (byte)this.field_j;
                                aj.field_t[5] = (byte)(var10 >> 848896808);
                                aj.field_t[2] = (byte)(var9 >> 1582593576);
                                this.field_f.a((long)(var7_int * 520), (byte) 45);
                                this.field_f.a(aj.field_t, -20291, 8, 0);
                                var11 = -var8 + param2;
                                if (-513 <= (var11 ^ -1)) {
                                  break L19;
                                } else {
                                  var11 = 512;
                                  break L19;
                                }
                              }
                              this.field_f.a(param1, param0 ^ 11823, var11, var8);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L4;
                        }
                      }
                      stackOut_59_0 = 1;
                      stackIn_60_0 = stackOut_59_0;
                      stackOut_60_0 = stackIn_60_0;
                      stackIn_61_0 = stackOut_60_0;
                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_62_0 = 0;
                  stackIn_63_0 = stackOut_62_0;
                  return stackIn_63_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_6_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_42_0 != 0;
                      } else {
                        return stackIn_61_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_66_0 = (RuntimeException) (var6_ref);
                stackOut_66_1 = new StringBuilder().append("bi.A(").append(param0).append(',');
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (param1 == null) {
                  stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                  stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackOut_68_2 = "null";
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  stackIn_69_2 = stackOut_68_2;
                  break L20;
                } else {
                  stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
                  stackOut_67_2 = "{...}";
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  stackIn_69_2 = stackOut_67_2;
                  break L20;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_j;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 102) {
            field_i = -73;
        }
    }

    bi(int param0, hb param1, hb param2, int param3) {
        this.field_g = null;
        this.field_c = 65000;
        this.field_f = null;
        try {
            this.field_f = param1;
            this.field_g = param2;
            this.field_j = param0;
            this.field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "bi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = null;
        field_a = 64;
        field_d = 2;
        field_i = 262144;
    }
}
