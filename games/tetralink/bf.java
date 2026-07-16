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
        if (param0 > -68) {
            Object var6 = null;
            oh[] discarded$0 = bf.a((byte) -110, (ah) null, (String) null, (String) null);
        }
        int var4 = param1.a(-1, param2);
        int var5 = param1.a(var4, false, param3);
        return uh.a(var5, 0, param1, var4);
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
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        rm var21_ref = null;
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
        id var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        rm stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        rm stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          var40 = TetraLink.field_J;
          var45 = param2;
          if (param0 == 65793) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var45.field_u == null) {
              break L2;
            } else {
              if (1 < var45.field_Q) {
                var62 = var45.field_u;
                gn.a(0, 0, 0, var62, c.field_m);
                break L1;
              } else {
                break L2;
              }
            }
          }
          hj.a((byte) -93);
          break L1;
        }
        var66 = new int[param2.field_O];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param2.field_O];
        var64 = kk.field_T;
        var63 = field_p;
        var65 = od.field_X;
        var13 = 0;
        L3: while (true) {
          if (var13 >= param2.field_O) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (og.field_f <= var44) {
                return;
              } else {
                L5: {
                  var14 = lg.field_ab[var44];
                  var15 = param2.field_K[var14];
                  var16 = param2.field_I[var14];
                  var17 = param2.field_e[var14];
                  if (param2.field_t[var14] < kk.field_T.length) {
                    stackOut_25_0 = param2.field_t[var14];
                    stackIn_26_0 = stackOut_25_0;
                    break L5;
                  } else {
                    stackOut_24_0 = -1;
                    stackIn_26_0 = stackOut_24_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_26_0;
                  if (param2.field_b[var14] >= kk.field_T.length) {
                    stackOut_28_0 = -1;
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  } else {
                    stackOut_27_0 = param2.field_b[var14];
                    stackIn_29_0 = stackOut_27_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_29_0;
                  if (param2.field_N[var14] < kk.field_T.length) {
                    stackOut_31_0 = param2.field_N[var14];
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
                    if (dh.field_n == null) {
                      break L9;
                    } else {
                      if (param2.field_v == null) {
                        break L9;
                      } else {
                        if (param2.field_v.length <= var14) {
                          break L9;
                        } else {
                          if (0 == (param2.field_v[var14] ^ -1)) {
                            break L9;
                          } else {
                            if (dh.field_n.length <= param2.field_v[var14]) {
                              break L9;
                            } else {
                              stackOut_37_0 = dh.field_n[param2.field_v[var14]];
                              stackIn_39_0 = stackOut_37_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_38_0 = null;
                  stackIn_39_0 = (rm) (Object) stackOut_38_0;
                  break L8;
                }
                L10: {
                  var21_ref = stackIn_39_0;
                  var22 = lj.field_b[var15];
                  var23 = pl.field_f[var15];
                  var24 = lj.field_b[var16];
                  var25 = pl.field_f[var16];
                  var26 = lj.field_b[var17];
                  var27 = pl.field_f[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var20 != var19) {
                      break L10;
                    } else {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21_ref != null) {
                          stackOut_43_0 = var21_ref.field_j;
                          stackIn_44_0 = stackOut_43_0;
                          break L11;
                        } else {
                          stackOut_42_0 = 8355711;
                          stackIn_44_0 = stackOut_42_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_44_0;
                      var31 = var30 & 16711935;
                      var32 = 65280 & var30;
                      var33 = (16711819 & var28 * var32) >>> 75854888 | (-16711730 & var31 * var28) >>> 1040630312;
                      var33 = var33 + 65793 * var29;
                      aa.a(var23, var26, var22, var25, var24, var27, var33 >> 1091358177 & 8355711, 102);
                      var44++;
                      continue L4;
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
                  if (var21_ref != null) {
                    stackOut_47_0 = var21_ref.field_j;
                    stackIn_48_0 = stackOut_47_0;
                    break L12;
                  } else {
                    stackOut_46_0 = 8355711;
                    stackIn_48_0 = stackOut_46_0;
                    break L12;
                  }
                }
                var34 = stackIn_48_0;
                var35 = var34 & 16711935;
                var36 = var34 & 65280;
                var37 = -1526791937 & var28 * var35 >>> -2016528664 | var36 * var28 >>> -747834296 & 2080440064;
                var38 = var35 * var29 >>> -1003206168 & -1761672961 | var29 * var36 >>> 2027138408 & 906034944;
                var38 = var38 + var32 * 65793;
                var39 = (var30 * var35 & -16711832) >>> 853593256 | var36 * var30 >>> -518003352 & -436142336;
                var37 = var37 + var31 * 65793;
                var39 = var39 + 65793 * var33;
                qk.a(var23, param0 ^ -65890, 255 & var37, var24, (var37 & 65364) >> 346656648, (var38 & 65309) >> 1892710792, var37 >> 561586544, var26, var38 & 255, var22, 255 & var39, var25, 255 & var39 >> 783878376, var38 >> -46500304, var27, var39 >> 1111968208);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param5 * var63[var13] + param1 * var64[var13] + param6 * var65[var13] >> -1704145272;
              if ((var14 ^ -1) > -1) {
                var14 = -var14;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if ((var14 ^ -1) <= -1) {
                if ((var14 ^ -1) > -129) {
                  stackOut_16_0 = 128 - -var14;
                  stackIn_17_0 = stackOut_16_0;
                  break L14;
                } else {
                  stackOut_15_0 = 256;
                  stackIn_17_0 = stackOut_15_0;
                  break L14;
                }
              } else {
                stackOut_13_0 = 128;
                stackIn_17_0 = stackOut_13_0;
                break L14;
              }
            }
            L15: {
              var14 = stackIn_17_0;
              var15 = var65[var13] * param7 + var64[var13] * param3 + param4 * var63[var13] >> -1155498584;
              stackOut_17_0 = da.field_g;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (-1 < (var15 ^ -1)) {
                stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                stackOut_19_1 = -var15;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L15;
              } else {
                stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                stackOut_18_1 = var15;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L15;
              }
            }
            var15 = stackIn_20_0[stackIn_20_1];
            var14 = (-var15 + 256) * var14 >>> 834941480;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    bf(ee param0, mc param1) {
        ((bf) this).field_t = param0;
        ((bf) this).field_u = param0.k();
        ((bf) this).field_q = param1;
        ((bf) this).field_t.f(128 + ((bf) this).field_u * wb.field_c >> -2024861560);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[8192];
        field_s = "Please try again in a few minutes.";
        field_o = "Open in popup window";
    }
}
