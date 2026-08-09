/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends mc {
    int field_u;
    static String field_o;
    static int field_n;
    static int[] field_p;
    ee field_t;
    static String field_s;
    mc field_q;
    static wf field_r;

    final static oh[] a(byte param0, ah param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        oh[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -68) {
                break L1;
              } else {
                var6 = (String) null;
                bf.a((byte) -110, (ah) null, (String) null, (String) null);
                break L1;
              }
            }
            var4_int = param1.a(-1, param2);
            var5 = param1.a(var4_int, false, param3);
            stackIn_3_0 = uh.a(var5, 0, param1, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("bf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_p = null;
        field_s = null;
        if (param0 != 65364) {
            field_n = -58;
        }
        field_o = null;
        field_r = null;
    }

    final static void a(int param0, int param1, id param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        rm stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        rm var21 = null;
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
        id var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var44 = param2;
              if (param0 == 65793) {
                break L1;
              } else {
                field_r = (wf) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var44.field_u == null) {
                  break L3;
                } else {
                  if (1 < var44.field_Q) {
                    var60 = var44.field_u;
                    gn.a(0, 0, 0, var60, c.field_m);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              hj.a((byte) -93);
              break L2;
            }
            var54 = new int[param2.field_O];
            var49 = var54;
            var41 = var49;
            var8 = var41;
            var64 = new int[param2.field_O];
            var62 = kk.field_T;
            var61 = field_p;
            var63 = od.field_X;
            var13 = 0;
            L4: while (true) {
              if (var13 >= param2.field_O) {
                var13 = 0;
                L5: while (true) {
                  if (og.field_f <= var13) {
                    break L0;
                  } else {
                    L6: {
                      var14 = lg.field_ab[var13];
                      var15 = param2.field_K[var14];
                      var16 = param2.field_I[var14];
                      var17 = param2.field_e[var14];
                      if (param2.field_t[var14] < kk.field_T.length) {
                        stackIn_27_0 = param2.field_t[var14];
                        break L6;
                      } else {
                        stackIn_27_0 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_27_0;
                      if (param2.field_b[var14] >= kk.field_T.length) {
                        stackIn_30_0 = -1;
                        break L7;
                      } else {
                        stackIn_30_0 = param2.field_b[var14];
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_30_0;
                      if (param2.field_N[var14] < kk.field_T.length) {
                        stackIn_33_0 = param2.field_N[var14];
                        break L8;
                      } else {
                        stackIn_33_0 = -1;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_33_0;
                        if (dh.field_n == null) {
                          break L10;
                        } else {
                          if (param2.field_v == null) {
                            break L10;
                          } else {
                            if (param2.field_v.length <= var14) {
                              break L10;
                            } else {
                              if (0 == (param2.field_v[var14] ^ -1)) {
                                break L10;
                              } else {
                                if (dh.field_n.length <= param2.field_v[var14]) {
                                  break L10;
                                } else {
                                  stackIn_40_0 = dh.field_n[param2.field_v[var14]];
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_40_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_40_0;
                        var22 = lj.field_b[var15];
                        var23 = pl.field_f[var15];
                        var24 = lj.field_b[var16];
                        var25 = pl.field_f[var16];
                        var26 = lj.field_b[var17];
                        var27 = pl.field_f[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var20 != var19) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 != null) {
                                stackIn_45_0 = var21.field_j;
                                break L13;
                              } else {
                                stackIn_45_0 = 8355711;
                                break L13;
                              }
                            }
                            var30 = stackIn_45_0;
                            var31 = var30 & 16711935;
                            var32 = 65280 & var30;
                            var33 = (16711819 & var28 * var32) >>> 75854888 | (-16711730 & var31 * var28) >>> 1040630312;
                            var33 = var33 + 65793 * var29;
                            aa.a(var23, var26, var22, var25, var24, var27, var33 >> 1091358177 & 8355711, 102);
                            break L11;
                          }
                        }
                      }
                      L14: {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                          stackIn_49_0 = var21.field_j;
                          break L14;
                        } else {
                          stackIn_49_0 = 8355711;
                          break L14;
                        }
                      }
                      var34 = stackIn_49_0;
                      var35 = var34 & 16711935;
                      var36 = var34 & 65280;
                      var37 = -1526791937 & var28 * var35 >>> -2016528664 | var36 * var28 >>> -747834296 & 2080440064;
                      var38 = var35 * var29 >>> -1003206168 & -1761672961 | var29 * var36 >>> 2027138408 & 906034944;
                      var38 = var38 + var32 * 65793;
                      var39 = (var30 * var35 & -16711832) >>> 853593256 | var36 * var30 >>> -518003352 & -436142336;
                      var37 = var37 + var31 * 65793;
                      var39 = var39 + 65793 * var33;
                      qk.a(var23, param0 ^ -65890, 255 & var37, var24, (var37 & 65364) >> 346656648, (var38 & 65309) >> 1892710792, var37 >> 561586544, var26, var38 & 255, var22, 255 & var39, var25, 255 & var39 >> 783878376, var38 >> -46500304, var27, var39 >> 1111968208);
                      break L11;
                    }
                    var13++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param5 * var61[var13] + param1 * var62[var13] + param6 * var63[var13] >> -1704145272;
                  if ((var14 ^ -1) > -1) {
                    var14 = -var14;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if ((var14 ^ -1) <= -1) {
                    if ((var14 ^ -1) > -129) {
                      stackIn_18_0 = 128 - -var14;
                      break L16;
                    } else {
                      stackIn_18_0 = 256;
                      break L16;
                    }
                  } else {
                    stackIn_18_0 = 128;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_18_0;
                  var15 = var63[var13] * param7 + var62[var13] * param3 + param4 * var61[var13] >> -1155498584;
                  stackIn_20_0 = da.field_g;

                  if (-1 < (var15 ^ -1)) {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = -var15;
                    break L17;
                  } else {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = var15;
                    break L17;
                  }
                }
                var15 = stackIn_21_0[stackIn_21_1];
                var14 = (-var15 + 256) * var14 >>> 834941480;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var8_ref);

            stackIn_54_1 = new StringBuilder().append("bf.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    bf(ee param0, mc param1) {
        try {
            this.field_t = param0;
            this.field_u = param0.k();
            this.field_q = param1;
            this.field_t.f(128 + this.field_u * wb.field_c >> -2024861560);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = new int[8192];
        field_s = "Please try again in a few minutes.";
        field_o = "Open in popup window";
    }
}
