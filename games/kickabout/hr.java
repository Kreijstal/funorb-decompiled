/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr extends gn {
    static String field_f;
    int field_i;
    int field_j;
    static boolean[] field_h;
    int field_e;
    static boolean field_k;
    static int[][][][] field_m;
    int field_l;
    int field_g;
    int field_n;

    final static void b(int param0) {
        du.field_n = param0 + Math.max(q.field_d.a(ag.field_l), q.field_d.a(h.field_a));
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != 2) {
            hr.a(-112);
        }
        field_h = null;
        field_f = null;
    }

    final static void a(byte param0) {
        int var2_int = 0;
        oh[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        oh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ut var15 = null;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_84_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        L0: {
          var14 = Kickabout.field_G;
          var15 = j.a(-5275);
          if (!pb.field_B) {
            break L0;
          } else {
            if (var15 == null) {
              break L0;
            } else {
              on.a(0, 0, 640, 480, tm.field_x[ih.field_c][rm.field_C]);
              var2_int = var15.field_v;
              var3 = var15.field_v;
              var4_int = -1 + ai.a(0, 6784) / var2_int;
              var5 = 1 + ai.a(640, 6784) / var2_int;
              var6 = qj.a(-6779, 0) / var3 + -1;
              var7 = qj.a(-6779, 640) / var3 - -1;
              var8 = var4_int;
              L1: while (true) {
                if (var8 >= var5) {
                  break L0;
                } else {
                  var9 = var6;
                  L2: while (true) {
                    if (var7 <= var9) {
                      var8++;
                      continue L1;
                    } else {
                      var10 = ug.a(param0 ^ -48, var8 * var2_int);
                      var11 = lf.a((byte) -85, var9 * var3);
                      var12 = ug.a(param0 + 48, var8 * var2_int + var2_int);
                      var13 = lf.a((byte) -97, var3 * var9 - -var3);
                      on.e(var10, var11, var12 + -var10, var13 + -var11, 65793);
                      pb.field_C.d(40 + Integer.toString(var8) + 44 + Integer.toString(var9) + 41, var10 + (-var10 + var12 >> 1351241377), (-var11 + var13 >> 361923681) + var11, 16777215, 65793);
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
        L3: {
          if (var15 != null) {
            L4: {
              if (bn.field_G != var15) {
                ja.field_S = var15.b();
                bn.field_G = var15;
                ou.field_B = -1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (hw.field_i != ou.field_B) {
                ou.field_B = hw.field_i;
                var2_int = var15.field_o * hw.field_i >> 280048616;
                var3 = hw.field_i * var15.field_v >> -1097311480;
                iw.a(param0 ^ 10, ja.field_S);
                var15.a(0, 0, var2_int, var3);
                ta.e(118);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (qr.a(0, (byte) -1) >= 0) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L6;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L6;
              }
            }
            L7: {
              var2_int = stackIn_19_0;
              if (896 >= qr.a(640, (byte) -1)) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L7;
              }
            }
            L8: {
              var3 = stackIn_22_0;
              if (ig.a(0, param0 + 4668) <= -1) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L8;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L8;
              }
            }
            L9: {
              var4_int = stackIn_25_0;
              if (-1345 >= ig.a(480, 4620)) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L9;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_28_0;
              if (var2_int != 0) {
                L11: {
                  var6 = b.c(param0 + -26, -15 + -var15.field_o);
                  stackOut_30_0 = -15;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (var4_int != 0) {
                    stackOut_32_0 = stackIn_32_0;
                    stackOut_32_1 = var15.field_v;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L11;
                  } else {
                    stackOut_31_0 = stackIn_31_0;
                    stackOut_31_1 = 0;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L11;
                  }
                }
                L12: {
                  var7 = stackIn_33_0 - stackIn_33_1;
                  stackOut_33_0 = 1344;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_34_0 = stackOut_33_0;
                  if (var5 == 0) {
                    stackOut_35_0 = stackIn_35_0;
                    stackOut_35_1 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L12;
                  } else {
                    stackOut_34_0 = stackIn_34_0;
                    stackOut_34_1 = var15.field_v;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    break L12;
                  }
                }
                var8 = stackIn_36_0 - -stackIn_36_1;
                L13: while (true) {
                  if (var7 >= var8) {
                    break L10;
                  } else {
                    ja.field_S.d(var6, go.a(var7, (byte) -56));
                    var7 = var7 + var15.field_v;
                    continue L13;
                  }
                }
              } else {
                break L10;
              }
            }
            L14: {
              if (var4_int == 0) {
                break L14;
              } else {
                var6 = go.a(-var15.field_v - 15, (byte) -56);
                var7 = -15;
                L15: while (true) {
                  if (var7 >= 896) {
                    break L14;
                  } else {
                    ja.field_S.d(b.c(-44, var7), var6);
                    var7 = var7 + var15.field_o;
                    continue L15;
                  }
                }
              }
            }
            L16: {
              if (var5 == 0) {
                break L16;
              } else {
                var6 = -15;
                L17: while (true) {
                  if (var6 + var15.field_v >= 1344) {
                    var7 = 0;
                    L18: while (true) {
                      if ((var7 ^ -1) <= -3) {
                        break L16;
                      } else {
                        var8 = go.a(var6, (byte) -56);
                        var9 = -15;
                        L19: while (true) {
                          if (896 <= var9) {
                            var6 = var6 + var15.field_v;
                            var7++;
                            continue L18;
                          } else {
                            ja.field_S.d(b.c(-16, var9), var8);
                            var9 = var9 + var15.field_o;
                            continue L19;
                          }
                        }
                      }
                    }
                  } else {
                    var6 = var6 + var15.field_v;
                    continue L17;
                  }
                }
              }
            }
            if (var3 == 0) {
              break L3;
            } else {
              var6 = -15;
              L20: while (true) {
                if (-897 >= (var15.field_o + var6 ^ -1)) {
                  var7 = 0;
                  L21: while (true) {
                    if (var7 >= 2) {
                      break L3;
                    } else {
                      L22: {
                        var8 = b.c(-63, var6);
                        stackOut_59_0 = -15;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_60_0 = stackOut_59_0;
                        if (var4_int != 0) {
                          stackOut_61_0 = stackIn_61_0;
                          stackOut_61_1 = var15.field_v;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          break L22;
                        } else {
                          stackOut_60_0 = stackIn_60_0;
                          stackOut_60_1 = 0;
                          stackIn_62_0 = stackOut_60_0;
                          stackIn_62_1 = stackOut_60_1;
                          break L22;
                        }
                      }
                      L23: {
                        var9 = stackIn_62_0 + -stackIn_62_1;
                        if (var5 != 0) {
                          stackOut_64_0 = var15.field_v;
                          stackIn_65_0 = stackOut_64_0;
                          break L23;
                        } else {
                          stackOut_63_0 = 0;
                          stackIn_65_0 = stackOut_63_0;
                          break L23;
                        }
                      }
                      var10 = stackIn_65_0 + 1359;
                      L24: while (true) {
                        if (var9 >= var10) {
                          var6 = var6 + var15.field_o;
                          var7++;
                          continue L21;
                        } else {
                          ja.field_S.d(var8, go.a(var9, (byte) -56));
                          var9 = var9 + var15.field_v;
                          continue L24;
                        }
                      }
                    }
                  }
                } else {
                  var6 = var6 + var15.field_o;
                  continue L20;
                }
              }
            }
          } else {
            on.a(0, 0, 640, 480, tm.field_x[ih.field_c][rm.field_C]);
            break L3;
          }
        }
        L25: {
          if (lg.field_a != null) {
            var2_int = b.c(-29, -15);
            var3 = go.a(-15, (byte) -56);
            if (-257 == (hw.field_i ^ -1)) {
              lg.field_a.d(var2_int, var3);
              break L25;
            } else {
              lg.field_a.a(var2_int, var3, lg.field_a.field_o * hw.field_i >> -684994552, hw.field_i * lg.field_a.field_v >> -1846022936);
              break L25;
            }
          } else {
            break L25;
          }
        }
        L26: {
          if (wh.field_q) {
            break L26;
          } else {
            L27: {
              if (rm.field_C != 3) {
                break L27;
              } else {
                de.a((byte) 92);
                break L27;
              }
            }
            L28: {
              if (rm.field_C == 2) {
                pd.a((byte) -79);
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (bv.field_l == null) {
                break L29;
              } else {
                L30: {
                  var2_int = fp.field_f * 6 >> 2141360360;
                  if (3 >= var2_int) {
                    stackOut_83_0 = var2_int;
                    stackIn_84_0 = stackOut_83_0;
                    break L30;
                  } else {
                    stackOut_82_0 = 6 + -var2_int;
                    stackIn_84_0 = stackOut_82_0;
                    break L30;
                  }
                }
                var2_int = stackIn_84_0;
                var3 = 0;
                L31: while (true) {
                  if (var3 >= bv.field_l.length) {
                    break L29;
                  } else {
                    if (bv.field_l[var3] != null) {
                      bv.field_l[var3].a(var2_int, true);
                      var3++;
                      continue L31;
                    } else {
                      var3++;
                      continue L31;
                    }
                  }
                }
              }
            }
            if (null != oi.field_e) {
              var2 = oi.field_e;
              var3 = 0;
              L32: while (true) {
                if (var2.length <= var3) {
                  break L26;
                } else {
                  var4 = var2[var3];
                  var4.a((byte) 125);
                  var3++;
                  continue L32;
                }
              }
            } else {
              break L26;
            }
          }
        }
        L33: {
          if (param0 == -48) {
            break L33;
          } else {
            hr.a(-68);
            break L33;
          }
        }
    }

    private hr() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new boolean[64];
        field_m = new int[4][5][][];
        field_m[3][0] = new int[3][1];
        field_m[3][0][0][0] = 5449;
        field_m[3][0][1][0] = 9540;
        field_m[3][0][2][0] = 3352;
        field_m[3][1] = new int[3][1];
        field_m[3][1][0][0] = 5250;
        field_m[3][1][1][0] = 4373;
        field_m[3][1][2][0] = 5267;
        field_m[3][2] = new int[3][1];
        field_m[3][2][0][0] = 5250;
        field_m[3][2][1][0] = 5279;
        field_m[3][2][2][0] = 5530;
        field_m[3][3] = new int[3][2];
        field_m[3][3][0][0] = 3224;
        field_m[3][3][0][1] = 2193;
        field_m[3][3][1][0] = 8491;
        field_m[3][3][1][1] = 8476;
        field_m[3][3][2][0] = 4384;
        field_m[3][3][2][1] = 4378;
        field_m[3][4] = new int[3][2];
        field_m[3][4][0][0] = 5250;
        field_m[3][4][0][1] = 5292;
        field_m[3][4][1][1] = 5413;
        field_m[3][4][1][0] = 5420;
        field_m[2][0] = new int[3][1];
        field_m[3][4][2][1] = 5582;
        field_m[3][4][2][0] = 5445;
        field_m[2][0][0][0] = 2234;
        field_m[2][0][1][0] = 3390;
        field_m[2][0][2][0] = 3381;
        field_m[2][1] = new int[3][1];
        field_m[2][1][0][0] = 3;
        field_m[2][1][1][0] = 9530;
        field_m[2][1][2][0] = 5409;
        field_m[2][2] = new int[3][1];
        field_m[2][2][0][0] = 3;
        field_m[2][2][1][0] = 3219;
        field_m[2][2][2][0] = 3351;
        field_m[2][3] = new int[3][1];
        field_m[2][3][0][0] = 5250;
        field_m[2][3][1][0] = 5420;
        field_m[2][3][2][0] = 5445;
        field_m[2][4] = new int[3][1];
        field_m[2][4][0][0] = 5404;
        field_m[2][4][1][0] = 5560;
        field_m[2][4][2][0] = 3254;
        field_m[1][0] = new int[3][1];
        field_m[1][0][0][0] = 7555;
        field_m[1][0][1][0] = 4384;
        field_m[1][0][2][0] = 2220;
        field_m[1][1] = new int[3][2];
        field_m[1][1][0][1] = 8344;
        field_m[1][1][0][0] = 8659;
        field_m[1][1][1][1] = 4245;
        field_m[1][1][1][0] = 4385;
        field_m[1][1][2][0] = 7728;
        field_m[1][1][2][1] = 6552;
        field_m[1][2] = new int[3][1];
        field_m[1][2][0][0] = 3217;
        field_m[1][2][1][0] = 3203;
        field_m[1][3] = new int[3][1];
        field_m[1][2][2][0] = 3472;
        field_m[1][3][0][0] = 3226;
        field_m[1][3][1][0] = 3617;
        field_m[1][4] = new int[3][2];
        field_m[1][3][2][0] = 6448;
        field_m[1][4][0][1] = 7582;
        field_m[1][4][0][0] = 7474;
        field_m[1][4][1][1] = 7305;
        field_m[1][4][1][0] = 7305;
        field_m[1][4][2][1] = 3484;
        field_m[0][0] = new int[3][1];
        field_m[1][4][2][0] = 3484;
        field_m[0][0][0][0] = 7555;
        field_m[0][0][1][0] = 4367;
        field_m[0][1] = new int[3][1];
        field_m[0][0][2][0] = 3848;
        field_m[0][1][0][0] = 8658;
        field_m[0][1][1][0] = 6450;
        field_m[0][1][2][0] = 3479;
        field_m[0][2] = new int[3][1];
        field_m[0][2][0][0] = 3128;
        field_m[0][2][1][0] = 2226;
        field_m[0][2][2][0] = 3468;
        field_m[0][3] = new int[3][1];
        field_m[0][3][0][0] = 7555;
        field_m[0][3][1][0] = 7438;
        field_m[0][4] = new int[3][1];
        field_m[0][3][2][0] = 7951;
        field_m[0][4][0][0] = 3084;
        field_m[0][4][1][0] = 3351;
        field_m[0][4][2][0] = 9688;
        field_k = false;
    }
}
