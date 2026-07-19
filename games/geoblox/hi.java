/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ee implements ta, pl {
    private hc field_E;
    static volatile int field_C;
    vh field_D;
    private hk field_H;
    static dm field_F;
    static String field_I;
    static long field_G;
    private hk field_J;

    private final boolean h(byte param0) {
        if (!this.a(-115, (nl) (this.field_E))) {
            return false;
        }
        if (param0 != -118) {
            this.field_H = (hk) null;
            return true;
        }
        return true;
    }

    public hi() {
        super(0, 0, 496, 0, (dh) null);
        this.field_E = new hc("", (bb) null, 12);
        ff var1 = new ff(hh.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, ng.field_F.field_o, -1, 2147483647, true);
        el var2 = new el(sb.field_c, var1, (bb) null);
        this.field_H = new hk(ec.field_a, (bb) null);
        this.field_J = new hk(ck.field_d, (bb) null);
        this.field_E.field_j = ud.field_a;
        this.field_E.a((byte) -58, new uk(this.field_E));
        this.field_H.field_D = false;
        this.field_H.field_q = (dh) ((Object) new ml());
        this.field_J.field_q = (dh) ((Object) new fh());
        this.field_E.field_q = (dh) ((Object) new ac(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(50, 270, (byte) -8, var3, 20);
        int var5 = 200;
        this.b((byte) -110, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, -12037, 170, this.field_E, gk.field_c, wj.field_E));
        this.field_H.a(40, var5, (byte) -23, var3, -var5 + 496 >> 1828675425);
        this.field_J.a(40, 60, (byte) -85, var3 - -15, 3 + var4);
        this.field_J.field_u = (bb) (this);
        this.field_H.field_u = (bb) (this);
        this.b((byte) -102, this.field_H);
        this.b((byte) -105, this.field_J);
        this.field_D = new vh((ta) (this));
        this.field_D.a(150, -60 + this.field_r + (-this.field_E.field_v - this.field_E.field_r), (byte) -54, 20, 60 + this.field_E.field_v - -this.field_E.field_r);
        this.b((byte) -102, this.field_D);
        this.a(var4 + 55 + var3, 496, (byte) -55, 0, 0);
    }

    private final int a(int param0, int param1, String param2, String param3, int param4, int param5, el param6) {
        RuntimeException var8 = null;
        pi var9 = null;
        int var10 = 0;
        hd var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var11 = new hd(20, param0, param5 + 120, 25, param6, false, 120, 3, ng.field_F, 16777215, param2);
            var10 = -110 / ((70 - param1) / 33);
            this.b((byte) -108, var11);
            var9 = new pi(((nl) ((Object) param6)).a((byte) -113), param3, 126, param0 - -var11.field_h, 25 + param5, param4);
            var9.field_u = (bb) (this);
            this.b((byte) -115, var9);
            stackOut_0_0 = var9.field_h + var11.field_h;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var8);
            stackOut_2_1 = new StringBuilder().append("hi.O(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, nf param5, int param6, int param7) {
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
        fd var21_ref = null;
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
        nf var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int stackIn_18_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        fd stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        short stackOut_25_0 = 0;
        short stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        fd stackOut_38_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_18_0 = null;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param5;
                if (null == var45.field_n) {
                  break L2;
                } else {
                  if ((var45.field_v ^ -1) < -2) {
                    var61 = var45.field_n;
                    va.a(0, var61, 0, uh.field_x, (byte) -85);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              vc.d(2971);
              break L1;
            }
            if (param3 == 6562) {
              var55 = new int[param5.field_m];
              var50 = var55;
              var41 = var50;
              var8_array = var41;
              var65 = new int[param5.field_m];
              var63 = ok.field_h;
              var62 = oa.field_f;
              var64 = gi.field_b;
              var13 = 0;
              L3: while (true) {
                if (param5.field_m <= var13) {
                  var44 = 0;
                  var13 = var44;
                  L4: while (true) {
                    if (var44 >= ch.field_b) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L5: {
                        var14 = pj.field_i[var44];
                        var15 = param5.field_r[var14];
                        var16 = param5.field_B[var14];
                        var17 = param5.field_c[var14];
                        if (param5.field_P[var14] >= ok.field_h.length) {
                          stackOut_26_0 = -1;
                          stackIn_27_0 = stackOut_26_0;
                          break L5;
                        } else {
                          stackOut_25_0 = param5.field_P[var14];
                          stackIn_27_0 = stackOut_25_0;
                          break L5;
                        }
                      }
                      L6: {
                        var18 = stackIn_27_0;
                        if (ok.field_h.length > param5.field_u[var14]) {
                          stackOut_29_0 = param5.field_u[var14];
                          stackIn_30_0 = stackOut_29_0;
                          break L6;
                        } else {
                          stackOut_28_0 = -1;
                          stackIn_30_0 = stackOut_28_0;
                          break L6;
                        }
                      }
                      L7: {
                        var19 = stackIn_30_0;
                        if (ok.field_h.length > param5.field_e[var14]) {
                          stackOut_32_0 = param5.field_e[var14];
                          stackIn_33_0 = stackOut_32_0;
                          break L7;
                        } else {
                          stackOut_31_0 = -1;
                          stackIn_33_0 = stackOut_31_0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          var20 = stackIn_33_0;
                          if (l.field_i == null) {
                            break L9;
                          } else {
                            if (param5.field_G == null) {
                              break L9;
                            } else {
                              if (param5.field_G.length <= var14) {
                                break L9;
                              } else {
                                if (0 == (param5.field_G[var14] ^ -1)) {
                                  break L9;
                                } else {
                                  if (l.field_i.length <= param5.field_G[var14]) {
                                    break L9;
                                  } else {
                                    stackOut_38_0 = l.field_i[param5.field_G[var14]];
                                    stackIn_40_0 = stackOut_38_0;
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_39_0 = null;
                        stackIn_40_0 = (fd) ((Object) stackOut_39_0);
                        break L8;
                      }
                      L10: {
                        L11: {
                          var21_ref = stackIn_40_0;
                          var22 = sh.field_x[var15];
                          var23 = dj.field_N[var15];
                          var24 = sh.field_x[var16];
                          var25 = dj.field_N[var16];
                          var26 = sh.field_x[var17];
                          var27 = dj.field_N[var17];
                          if (var18 != var19) {
                            break L11;
                          } else {
                            if (var20 != var19) {
                              break L11;
                            } else {
                              L12: {
                                var28 = var55[var18];
                                var29 = var65[var18];
                                if (var21_ref != null) {
                                  stackOut_44_0 = var21_ref.field_a;
                                  stackIn_45_0 = stackOut_44_0;
                                  break L12;
                                } else {
                                  stackOut_43_0 = 8355711;
                                  stackIn_45_0 = stackOut_43_0;
                                  break L12;
                                }
                              }
                              var30 = stackIn_45_0;
                              var31 = var30 & 16711935;
                              var32 = 65280 & var30;
                              var33 = (-16711703 & var31 * var28) >>> 1087510824 | -285147392 & var32 * var28 >>> -1091139000;
                              var33 = var33 + var29 * 65793;
                              gi.a(var26, -122, var27, var25, var24, var22, var23, 8355711 & var33 >> -906591487);
                              break L10;
                            }
                          }
                        }
                        L13: {
                          var28 = var55[var18];
                          var29 = var55[var19];
                          var30 = var55[var20];
                          var31 = var65[var18];
                          var32 = var65[var19];
                          var33 = var65[var20];
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
                        var34 = stackIn_49_0;
                        var35 = var34 & 16711935;
                        var36 = 65280 & var34;
                        var37 = (var28 * var36 & 16711921) >>> -932940408 | -822148865 & var28 * var35 >>> 1822318632;
                        var38 = (var36 * var29 & 16711688) >>> 1466976808 | (var29 * var35 & -16711783) >>> 1474249800;
                        var38 = var38 + 65793 * var32;
                        var37 = var37 + 65793 * var31;
                        var39 = var30 * var36 >>> -1415641368 & 1543569152 | var30 * var35 >>> -1297425400 & -536936193;
                        var39 = var39 + var33 * 65793;
                        nb.a(255 & var37, 255 & var37 >> 752032680, var39 >> -30653808, var39 >> 1208420200 & 255, var25, 255 & var38, var37 >> 567486192, var23, var26, 255 & var39, -2, var38 >> 637744048, 255 & var38 >> 1425466440, var24, var22, var27);
                        break L10;
                      }
                      var44++;
                      continue L4;
                    }
                  }
                } else {
                  L14: {
                    var14 = var62[var13] * param7 + param4 * var63[var13] - -(var64[var13] * param1) >> -1846498232;
                    if (0 > var14) {
                      var14 = -var14;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var14 ^ -1) <= -1) {
                      if (128 <= var14) {
                        stackOut_17_0 = 256;
                        stackIn_18_0 = stackOut_17_0;
                        break L15;
                      } else {
                        stackOut_16_0 = 128 - -var14;
                        stackIn_18_0 = stackOut_16_0;
                        break L15;
                      }
                    } else {
                      stackOut_14_0 = 128;
                      stackIn_18_0 = stackOut_14_0;
                      break L15;
                    }
                  }
                  L16: {
                    var14 = stackIn_18_0;
                    var15 = param0 * var64[var13] + (param2 * var63[var13] + param6 * var62[var13]) >> -1093387128;
                    stackOut_18_0 = jf.field_b;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var15 < 0) {
                      stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                      stackOut_20_1 = -var15;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L16;
                    } else {
                      stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                      stackOut_19_1 = var15;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L16;
                    }
                  }
                  var15 = stackIn_21_0[stackIn_21_1];
                  var14 = var14 * (256 + -var15) >>> 1405589960;
                  var55[var13] = var14;
                  var65[var13] = var15;
                  var13++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var8);
            stackOut_52_1 = new StringBuilder().append("hi.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param5 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(CharSequence param0, byte[] param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        try {
          L0: {
            var6_int = -param2 + param3;
            if (param5 == 98) {
              var7 = 0;
              L1: while (true) {
                if (var7 >= var6_int) {
                  stackOut_68_0 = var6_int;
                  stackIn_69_0 = stackOut_68_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var8 = param0.charAt(param2 + var7);
                        if (0 >= var8) {
                          break L4;
                        } else {
                          if (var8 < 128) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var8 < 160) {
                          break L5;
                        } else {
                          if (var8 <= 255) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var8 != 8364) {
                        if (var8 != 8218) {
                          if (var8 != 402) {
                            if (8222 != var8) {
                              if (8230 != var8) {
                                if (var8 != 8224) {
                                  if (var8 == 8225) {
                                    param1[var7 + param4] = (byte)-121;
                                    break L2;
                                  } else {
                                    if (var8 != 710) {
                                      if (8240 == var8) {
                                        param1[var7 + param4] = (byte)-119;
                                        break L2;
                                      } else {
                                        if (var8 != 352) {
                                          if (var8 != 8249) {
                                            if (var8 != 338) {
                                              if (381 == var8) {
                                                param1[var7 + param4] = (byte)-114;
                                                break L2;
                                              } else {
                                                if (var8 == 8216) {
                                                  param1[param4 - -var7] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (var8 != 8217) {
                                                    if (var8 != 8220) {
                                                      if (var8 != 8221) {
                                                        if (8226 != var8) {
                                                          if (8211 != var8) {
                                                            if (var8 != 8212) {
                                                              if (var8 != 732) {
                                                                if (var8 == 8482) {
                                                                  param1[param4 - -var7] = (byte)-103;
                                                                  break L2;
                                                                } else {
                                                                  if (var8 == 353) {
                                                                    param1[param4 + var7] = (byte)-102;
                                                                    break L2;
                                                                  } else {
                                                                    if (var8 == 8250) {
                                                                      param1[var7 + param4] = (byte)-101;
                                                                      break L2;
                                                                    } else {
                                                                      if (339 != var8) {
                                                                        if (var8 == 382) {
                                                                          param1[var7 + param4] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var8 != 376) {
                                                                            param1[var7 + param4] = (byte)63;
                                                                            break L2;
                                                                          } else {
                                                                            param1[var7 + param4] = (byte)-97;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        param1[var7 + param4] = (byte)-100;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                param1[var7 + param4] = (byte)-104;
                                                                break L2;
                                                              }
                                                            } else {
                                                              param1[param4 - -var7] = (byte)-105;
                                                              break L2;
                                                            }
                                                          } else {
                                                            param1[var7 + param4] = (byte)-106;
                                                            break L2;
                                                          }
                                                        } else {
                                                          param1[param4 - -var7] = (byte)-107;
                                                          break L2;
                                                        }
                                                      } else {
                                                        param1[param4 - -var7] = (byte)-108;
                                                        break L2;
                                                      }
                                                    } else {
                                                      param1[var7 + param4] = (byte)-109;
                                                      break L2;
                                                    }
                                                  } else {
                                                    param1[param4 - -var7] = (byte)-110;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            } else {
                                              param1[var7 + param4] = (byte)-116;
                                              break L2;
                                            }
                                          } else {
                                            param1[param4 + var7] = (byte)-117;
                                            break L2;
                                          }
                                        } else {
                                          param1[param4 + var7] = (byte)-118;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      param1[var7 + param4] = (byte)-120;
                                      break L2;
                                    }
                                  }
                                } else {
                                  param1[param4 - -var7] = (byte)-122;
                                  break L2;
                                }
                              } else {
                                param1[var7 + param4] = (byte)-123;
                                break L2;
                              }
                            } else {
                              param1[var7 + param4] = (byte)-124;
                              break L2;
                            }
                          } else {
                            param1[param4 - -var7] = (byte)-125;
                            break L2;
                          }
                        } else {
                          param1[param4 + var7] = (byte)-126;
                          break L2;
                        }
                      } else {
                        param1[var7 + param4] = (byte)-128;
                        break L2;
                      }
                    }
                    param1[param4 + var7] = (byte)var8;
                    break L2;
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_1_0 = 52;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) (var6);
            stackOut_70_1 = new StringBuilder().append("hi.N(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L6;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L6;
            }
          }
          L7: {
            stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param1 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L7;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_69_0;
        }
    }

    private final boolean a(int param0, nl param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lh var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = param1.a((byte) -98);
            if (var3 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4 = 37 / ((-70 - param0) / 38);
                var5 = var3.a((byte) -105);
                if (var5 != kk.field_w) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("hi.J(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        boolean discarded$2 = false;
        RuntimeException var6 = null;
        nl var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_J != param4) {
                if (this.field_H == param4) {
                  this.f(-50);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ib.d(24107);
                break L1;
              }
            }
            L2: {
              if (param1 == -20) {
                break L2;
              } else {
                var7 = (nl) null;
                discarded$2 = this.a(-4, (nl) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6);
            stackOut_8_1 = new StringBuilder().append("hi.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public final void a(String param0, int param1) {
        hc var3 = null;
        String var4 = null;
        try {
            if (param1 != 20) {
                this.field_J = (hk) null;
            }
            var3 = this.field_E;
            var4 = param0;
            ((dj) ((Object) var3)).a(param1 + -136, var4, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hi.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_H.field_D = this.h((byte) -118);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hi.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void i(byte param0) {
        if (param0 > -45) {
            return;
        }
        field_I = null;
        field_F = null;
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        boolean discarded$2 = false;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_6_0 = false;
        int stackOut_3_0 = 0;
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
            L1: {
              if (param1 == 13) {
                break L1;
              } else {
                discarded$2 = this.h((byte) -45);
                break L1;
              }
            }
            if (!super.a(param0, param1 + 0, param2, param3)) {
              if (98 != param0) {
                if ((param0 ^ -1) != -100) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_9_0 = this.a(param3, -96);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = this.a(7305, param3);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("hi.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    public final void a(byte param0) {
        ((uk) ((Object) this.field_E.a((byte) -117))).c((byte) -80);
        if (param0 != 83) {
            this.field_H = (hk) null;
        }
    }

    private final int a(int param0, int param1, int param2, el param3, String param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -12037) {
                break L1;
              } else {
                field_G = 55L;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param0, -116, param5, param4, 35, param2, param3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("hi.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void f(int param0) {
        if (!this.h((byte) -118)) {
            return;
        }
        if (param0 >= -42) {
            return;
        }
        ag.c(12607, this.field_E.field_s);
    }

    static {
        field_C = 0;
        field_I = "Unfortunately you are not eligible to create an account.";
    }
}
