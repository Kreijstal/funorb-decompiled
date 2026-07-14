/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static tf field_a;
    static go field_b;
    static hj field_c;

    final static boolean a(int param0) {
        if (param0 > -59) {
            field_c = null;
            return true;
        }
        return true;
    }

    final static void a(gn param0, int[] param1, int param2) {
        try {
            int var3 = 0;
            int var4 = 0;
            IOException var5 = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var6 = HoldTheLine.field_D;
              if (param2 <= -73) {
                break L0;
              } else {
                boolean discarded$2 = ai.a(-18);
                break L0;
              }
            }
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= -7) {
                var3++;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (pc.field_l[var3] <= var4) {
                    continue L1;
                  } else {
                    if (tk.field_c[var3][var4].field_r) {
                      try {
                        tk.field_c[var3][var4] = lm.a(param0.a(tk.field_c[var3][var4].field_h, 0, param1, ""), (byte) 123);
                      } catch (java.io.IOException decompiledCaughtParameter) {
                        decompiledCaughtException = decompiledCaughtParameter;
                        var4++;
                      }
                      continue L2;
                    } else {
                      var4++;
                      continue L2;
                    }
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

    final static void a(byte param0, ui param1) {
        if (param0 != -123) {
            field_b = null;
        }
        pk.field_H.b((tj) (Object) param1.field_j);
    }

    final static void a(int param0, int param1, int param2, int param3, qk param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        uj var21 = null;
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
        Object var41 = null;
        int[] var42 = null;
        int var45 = 0;
        qk var46 = null;
        int[] var51 = null;
        int[] var56 = null;
        int[] var61 = null;
        byte[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int[] var68 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        uj stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        uj stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
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
            var40 = HoldTheLine.field_D;
            var46 = param4;
            if (var46.field_r == null) {
              break L1;
            } else {
              if (-2 <= (var46.field_l ^ -1)) {
                break L1;
              } else {
                var63 = var46.field_r;
                ta.a(0, 0, pk.field_I, (byte) -83, var63);
                break L0;
              }
            }
          }
          hm.a((byte) 126);
          break L0;
        }
        L2: {
          var67 = new int[param4.field_o];
          var61 = var67;
          var56 = var61;
          var51 = var56;
          var42 = var51;
          var8 = var42;
          var68 = new int[param4.field_o];
          var65 = kf.field_T;
          if (param0 == -4006) {
            break L2;
          } else {
            var41 = null;
            ai.a((byte) -11, (ui) null);
            break L2;
          }
        }
        var66 = gb.field_q;
        var64 = u.field_S;
        var13 = 0;
        L3: while (true) {
          if (param4.field_o <= var13) {
            var45 = 0;
            var13 = var45;
            L4: while (true) {
              if (rb.field_t <= var45) {
                return;
              } else {
                L5: {
                  var14 = al.field_b[var45];
                  var15 = param4.field_w[var14];
                  var16 = param4.field_Q[var14];
                  var17 = param4.field_P[var14];
                  if (param4.field_e[var14] >= kf.field_T.length) {
                    stackOut_24_0 = -1;
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  } else {
                    stackOut_23_0 = param4.field_e[var14];
                    stackIn_25_0 = stackOut_23_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_25_0;
                  if (kf.field_T.length <= param4.field_K[var14]) {
                    stackOut_27_0 = -1;
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    stackOut_26_0 = param4.field_K[var14];
                    stackIn_28_0 = stackOut_26_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_28_0;
                  if (kf.field_T.length <= param4.field_x[var14]) {
                    stackOut_30_0 = -1;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    stackOut_29_0 = param4.field_x[var14];
                    stackIn_31_0 = stackOut_29_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_31_0;
                    if (kl.field_s == null) {
                      break L9;
                    } else {
                      if (param4.field_t == null) {
                        break L9;
                      } else {
                        if (var14 >= param4.field_t.length) {
                          break L9;
                        } else {
                          if ((param4.field_t[var14] ^ -1) == 0) {
                            break L9;
                          } else {
                            if (param4.field_t[var14] >= kl.field_s.length) {
                              break L9;
                            } else {
                              stackOut_36_0 = kl.field_s[param4.field_t[var14]];
                              stackIn_38_0 = stackOut_36_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_37_0 = null;
                  stackIn_38_0 = (uj) (Object) stackOut_37_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_38_0;
                  var22 = gd.field_d[var15];
                  var23 = om.field_p[var15];
                  var24 = gd.field_d[var16];
                  var25 = om.field_p[var16];
                  var26 = gd.field_d[var17];
                  var27 = om.field_p[var17];
                  if (var19 != var18) {
                    break L10;
                  } else {
                    if (var19 != var20) {
                      break L10;
                    } else {
                      L11: {
                        var28 = var67[var18];
                        var29 = var68[var18];
                        if (var21 == null) {
                          stackOut_42_0 = 8355711;
                          stackIn_43_0 = stackOut_42_0;
                          break L11;
                        } else {
                          stackOut_41_0 = var21.field_g;
                          stackIn_43_0 = stackOut_41_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_43_0;
                      var31 = 16711935 & var30;
                      var32 = 65280 & var30;
                      var33 = (-16711711 & var31 * var28) >>> -1538399736 | var28 * var32 >>> -241305752 & 1241579264;
                      var33 = var33 + 65793 * var29;
                      wl.a(var23, 8355711 & var33 >> 292895969, (byte) 102, var22, var26, var27, var24, var25);
                      var45++;
                      continue L4;
                    }
                  }
                }
                L12: {
                  var28 = var67[var18];
                  var29 = var67[var19];
                  var30 = var67[var20];
                  var31 = var68[var18];
                  var32 = var68[var19];
                  var33 = var68[var20];
                  if (var21 != null) {
                    stackOut_46_0 = var21.field_g;
                    stackIn_47_0 = stackOut_46_0;
                    break L12;
                  } else {
                    stackOut_45_0 = 8355711;
                    stackIn_47_0 = stackOut_45_0;
                    break L12;
                  }
                }
                var34 = stackIn_47_0;
                var35 = 16711935 & var34;
                var36 = 65280 & var34;
                var37 = (var35 * var28 & -16711770) >>> 1385883336 | var36 * var28 >>> -57060536 & -1727987968;
                var38 = var35 * var29 >>> 932891176 & 2080309503 | -1660879104 & var36 * var29 >>> 1898481832;
                var38 = var38 + 65793 * var32;
                var39 = var30 * var36 >>> 1971863176 & 738262784 | (-16711779 & var35 * var30) >>> -960938616;
                var37 = var37 + var31 * 65793;
                var39 = var39 + var33 * 65793;
                ll.a(var23, (var38 & 65313) >> -400726936, var22, var39 >> -1050913648, var24, 255 & var39, 255 & var38, 255 & var37 >> -45666488, -27987, 255 & var37, var27, var26, (var39 & 65402) >> 1049515688, var37 >> 28623888, var38 >> 1507597200, var25);
                var45++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param2 * var64[var13] + (param6 * var65[var13] - -(param1 * var66[var13])) >> 1719762088;
              if (-1 < var14) {
                var14 = -var14;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (-1 > var14) {
                stackOut_15_0 = 128;
                stackIn_16_0 = stackOut_15_0;
                break L14;
              } else {
                if ((var14 ^ -1) > -129) {
                  stackOut_14_0 = 128 - -var14;
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
              var15 = param7 * var64[var13] + (var65[var13] * param5 + param3 * var66[var13]) >> -871535352;
              stackOut_16_0 = qf.field_i;
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
            var14 = var14 * (-var15 + 256) >>> 1353335944;
            var67[var13] = var14;
            var68[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 > -109) {
            return;
        }
        field_a = null;
    }

    static {
    }
}
