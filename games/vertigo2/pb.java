/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static boolean field_f;
    static dm field_b;
    static String field_c;
    static String field_e;
    static String field_d;
    static String field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 16711935) {
            pb.a((byte) -16, -56, 95, -50);
        }
        field_c = null;
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        oi.field_b = param3;
        ma.field_m = param2;
        int var4 = -120 / ((64 - param0) / 39);
        sr.field_a = param1;
    }

    final static void a(int param0, int param1, int param2, jp param3, int param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        uq var21 = null;
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
        jp var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        uq stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        uq stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          L1: {
            var40 = Vertigo2.field_L ? 1 : 0;
            var45 = param3;
            if (var45.field_x == null) {
              break L1;
            } else {
              if (-2 > (var45.field_G ^ -1)) {
                var62 = var45.field_x;
                op.a(0, oq.field_F, 0, var62, false);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ln.b(0);
          break L0;
        }
        L2: {
          var66 = new int[param3.field_K];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          if (param7 >= 30) {
            break L2;
          } else {
            field_f = true;
            break L2;
          }
        }
        var67 = new int[param3.field_K];
        var63 = pk.field_w;
        var64 = dp.field_A;
        var65 = dh.field_d;
        var13 = 0;
        L3: while (true) {
          if (param3.field_K <= var13) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= ja.field_a) {
                return;
              } else {
                L5: {
                  var14 = ac.field_K[var44];
                  var15 = param3.field_p[var14];
                  var16 = param3.field_L[var14];
                  var17 = param3.field_c[var14];
                  if (pk.field_w.length > param3.field_g[var14]) {
                    stackOut_24_0 = param3.field_g[var14];
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  } else {
                    stackOut_23_0 = -1;
                    stackIn_25_0 = stackOut_23_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_25_0;
                  if (param3.field_P[var14] < pk.field_w.length) {
                    stackOut_27_0 = param3.field_P[var14];
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    stackOut_26_0 = -1;
                    stackIn_28_0 = stackOut_26_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_28_0;
                  if (pk.field_w.length > param3.field_C[var14]) {
                    stackOut_30_0 = param3.field_C[var14];
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
                    if (wc.field_o == null) {
                      break L9;
                    } else {
                      if (param3.field_J == null) {
                        break L9;
                      } else {
                        if (param3.field_J.length <= var14) {
                          break L9;
                        } else {
                          if ((param3.field_J[var14] ^ -1) == 0) {
                            break L9;
                          } else {
                            if (wc.field_o.length > param3.field_J[var14]) {
                              stackOut_38_0 = wc.field_o[param3.field_J[var14]];
                              stackIn_39_0 = stackOut_38_0;
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_37_0 = null;
                  stackIn_39_0 = (uq) (Object) stackOut_37_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_39_0;
                  var22 = nj.field_a[var15];
                  var23 = ml.field_t[var15];
                  var24 = nj.field_a[var16];
                  var25 = ml.field_t[var16];
                  var26 = nj.field_a[var17];
                  var27 = ml.field_t[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var20 != var19) {
                      break L10;
                    } else {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 != null) {
                          stackOut_43_0 = var21.field_e;
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
                      var32 = var30 & 65280;
                      var33 = var28 * var31 >>> 1661001512 & 989790463 | (var28 * var32 & 16711885) >>> -1944780600;
                      var33 = var33 + 65793 * var29;
                      oj.a(var27, var22, var24, var26, (byte) 107, var23, var25, (16711422 & var33) >> 138645761);
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
                  if (var21 != null) {
                    stackOut_47_0 = var21.field_e;
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
                var36 = 65280 & var34;
                var37 = (-16711842 & var35 * var28) >>> 1051127048 | -436142336 & var36 * var28 >>> 553557672;
                var38 = var36 * var29 >>> 373544584 & -570360064 | 385810687 & var35 * var29 >>> 2129990280;
                var38 = var38 + 65793 * var32;
                var37 = var37 + var31 * 65793;
                var39 = (var30 * var36 & 16711862) >>> -957052824 | (-16711741 & var35 * var30) >>> -28285912;
                var39 = var39 + var33 * 65793;
                vj.a(var25, (byte) -122, 255 & var38, var38 >> 164300784, 255 & var39, var22, 255 & var37 >> 161061704, var37 >> -1408837296, var24, var23, 255 & var39 >> 824558760, var26, var39 >> 1178158448, var37 & 255, var38 >> -1973704792 & 255, var27);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = var63[var13] * param4 - -(var64[var13] * param1) + param6 * var65[var13] >> 1126490216;
              if (0 <= var14) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (var14 < 0) {
                stackOut_15_0 = 128;
                stackIn_16_0 = stackOut_15_0;
                break L14;
              } else {
                if (-129 < (var14 ^ -1)) {
                  stackOut_14_0 = 128 + var14;
                  stackIn_16_0 = stackOut_14_0;
                  break L14;
                } else {
                  stackOut_13_0 = 256;
                  stackIn_16_0 = stackOut_13_0;
                  break L14;
                }
              }
            }
            L15: {
              var14 = stackIn_16_0;
              var15 = param2 * var64[var13] + (var63[var13] * param0 + var65[var13] * param5) >> 314446696;
              stackOut_16_0 = bl.field_r;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if ((var15 ^ -1) <= -1) {
                stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                stackOut_18_1 = var15;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L15;
              } else {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = -var15;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L15;
              }
            }
            var15 = stackIn_19_0[stackIn_19_1];
            var14 = var14 * (256 + -var15) >>> 1251422152;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Oh, dear. There's a blue paint pot on this level. Until you pick it up, you can't paint the block beneath it purple! What's worse is that if you grab the blue pot, you'll have to paint five tiles blue before you can pick up some purple paint. The compass you can collect on this level should help - pick it up to get a zoomed-out view of the level.";
        field_f = false;
        field_c = "Click or press F10 to open Quick Chat";
        field_e = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_a = "Return to lobby";
    }
}
