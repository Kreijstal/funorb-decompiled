/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class m {
    static String field_g;
    static gh field_d;
    private int[] field_f;
    private byte[] field_e;
    private int[] field_c;
    static int[][] field_b;
    static String[] field_j;
    static gh field_i;
    static boolean[] field_h;
    static int field_a;

    m(byte[] param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var2 = param0.length;
        ((m) this).field_e = param0;
        ((m) this).field_f = new int[var2];
        ((m) this).field_c = new int[8];
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var2 <= var5) {
          } else {
            var6 = param0[var5];
            if (0 != var6) {
              L1: {
                var7 = 1 << -var6 + 32;
                var8 = var19[var6];
                ((m) this).field_f[var5] = var8;
                if (-1 == (var7 & var8 ^ -1)) {
                  var10 = -1 + var6;
                  L2: while (true) {
                    L3: {
                      if (var10 < 1) {
                        break L3;
                      } else {
                        var11 = var19[var10];
                        if (var11 != var8) {
                          break L3;
                        } else {
                          var12 = 1 << 32 + -var10;
                          if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break L3;
                          } else {
                            var3[var10] = vn.a(var11, var12);
                            var10--;
                            continue L2;
                          }
                        }
                      }
                    }
                    var9 = var7 | var8;
                    break L1;
                  }
                } else {
                  var9 = var3[-1 + var6];
                  break L1;
                }
              }
              var19[var6] = var9;
              var10 = 1 + var6;
              L4: while (true) {
                if (var10 > 32) {
                  var10 = 0;
                  var11 = 0;
                  L5: while (true) {
                    if (var11 >= var6) {
                      ((m) this).field_c[var10] = var5 ^ -1;
                      if (var10 >= var4) {
                        var4 = var10 - -1;
                        var5++;
                        continue L0;
                      } else {
                        var5++;
                        continue L0;
                      }
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if ((var12 & var8) == 0) {
                          var10++;
                          break L6;
                        } else {
                          L7: {
                            if (((m) this).field_c[var10] != 0) {
                              break L7;
                            } else {
                              ((m) this).field_c[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((m) this).field_c[var10];
                          break L6;
                        }
                      }
                      L8: {
                        if (var10 < ((m) this).field_c.length) {
                          break L8;
                        } else {
                          var13 = new int[((m) this).field_c.length * 2];
                          var14 = 0;
                          L9: while (true) {
                            if (var14 >= ((m) this).field_c.length) {
                              ((m) this).field_c = var13;
                              break L8;
                            } else {
                              var13[var14] = ((m) this).field_c[var14];
                              var14++;
                              continue L9;
                            }
                          }
                        }
                      }
                      var12 = var12 >>> 1;
                      var11++;
                      continue L5;
                    }
                  }
                } else {
                  if (var19[var10] == var8) {
                    var19[var10] = var9;
                    var10++;
                    continue L4;
                  } else {
                    var10++;
                    continue L4;
                  }
                }
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        String var15 = null;
        String var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        String stackIn_20_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        String stackOut_19_0 = null;
        String stackOut_18_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var21 = SteelSentinels.field_G;
          if (param2 == 7786) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          var6 = 1021128;
          var7 = param1 - 6;
          var8 = param3 + 3;
          var9 = param0 + -6;
          var10 = 3 + param5;
          var11 = var7 * param4 / 12200;
          fk.field_d.c("<img=1>", param3, param5 - -param0, 1021128, -1);
          if (-12201 <= (param4 ^ -1)) {
            break L1;
          } else {
            var6 = 1044724;
            var11 = var7;
            break L1;
          }
        }
        L2: {
          pb.a(var8, var10, var11, var9, var6);
          pb.h(param3, param5, param1, param0, 4408131);
          pb.d(6100 * param1 / 12200 + param3, param5, param0, 4408131);
          var12 = ej.field_C;
          var13 = param3 - -(param1 / 4);
          if (6100 >= param4) {
            stackOut_6_0 = 1400960;
            stackIn_7_0 = stackOut_6_0;
            break L2;
          } else {
            stackOut_5_0 = 4210752;
            stackIn_7_0 = stackOut_5_0;
            break L2;
          }
        }
        var14 = stackIn_7_0;
        var15_int = 0;
        L3: while (true) {
          if (-3 >= (var15_int ^ -1)) {
            L4: {
              if (oh.field_f < param3) {
                break L4;
              } else {
                if (oh.field_f >= param1 + param3) {
                  break L4;
                } else {
                  if (param5 > pi.field_c) {
                    break L4;
                  } else {
                    if (pi.field_c >= param0 + param5) {
                      break L4;
                    } else {
                      L5: {
                        if (6100 >= param4) {
                          stackOut_19_0 = ej.field_C;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        } else {
                          stackOut_18_0 = fi.field_z;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      var15 = stackIn_20_0;
                      var16 = db.a(bf.field_zb, param2 + -7846, new String[2]);
                      var17 = param3 - -(param1 / 2);
                      var18 = param5 + -18;
                      var19 = 8 + fk.field_d.c(var16);
                      var20 = 13;
                      var17 = var17 - var19 / 2;
                      pb.c(var17 - 4, var18, var19, var20, 0, 192);
                      pb.h(-4 + var17, var18, var19, var20, 1400960, 192);
                      fk.field_d.b(var16, var17, var18 + 10, 41727, -1);
                      break L4;
                    }
                  }
                }
              }
            }
            return;
          } else {
            L6: {
              pb.d(var13 + -(var7 / 4), -4 + param5, 3, var14);
              pb.d(var7 / 4 + var13, -4 + param5, 3, var14);
              pb.g(var13 - var7 / 4, -4 + param5, var7 / 2, var14);
              pb.d(var13 - var7 / 4, param5 + (param0 + 1), 2, var14);
              pb.d(var13 + var7 / 4, param5 + param0 - -1, 2, var14);
              pb.g(var13 - var7 / 4, 3 + (param5 - -param0), var7 / 2, var14);
              fk.field_d.a(var12, var13, -5 + param5, var14, -1);
              if (-6101 <= (param4 ^ -1)) {
                stackOut_11_0 = 4210752;
                stackIn_12_0 = stackOut_11_0;
                break L6;
              } else {
                stackOut_10_0 = 1400960;
                stackIn_12_0 = stackOut_10_0;
                break L6;
              }
            }
            var14 = stackIn_12_0;
            var12 = fi.field_z;
            var13 = var13 + param1 / 2;
            var15_int++;
            continue L3;
          }
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        if (-1 != (param1 ^ -1)) {
          if (param2 == 4408131) {
            param1 = param1 + param3;
            var7 = 0;
            var8 = param5;
            L0: while (true) {
              L1: {
                var9 = param4[var8];
                if (var9 <= -1) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((m) this).field_c[var7];
                  break L1;
                }
              }
              L2: {
                L3: {
                  var10 = ((m) this).field_c[var7];
                  if (-1 <= ((m) this).field_c[var7]) {
                    break L3;
                  } else {
                    param3++;
                    param0[param3] = (byte)var10;
                    if (param1 > param3) {
                      var7 = 0;
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (-1 == (64 & var9)) {
                    var7++;
                    break L4;
                  } else {
                    var7 = ((m) this).field_c[var7];
                    break L4;
                  }
                }
                L5: {
                  var10 = ((m) this).field_c[var7];
                  if (-1 < (((m) this).field_c[var7] ^ -1)) {
                    param3++;
                    param0[param3] = (byte)(var10 ^ -1);
                    if (param1 <= param3) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (0 != (32 & var9)) {
                    var7 = ((m) this).field_c[var7];
                    break L6;
                  } else {
                    var7++;
                    break L6;
                  }
                }
                L7: {
                  var10 = ((m) this).field_c[var7];
                  if (-1 < (((m) this).field_c[var7] ^ -1)) {
                    param3++;
                    param0[param3] = (byte)var10;
                    if (param3 >= param1) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-1 != (var9 & 16)) {
                    var7 = ((m) this).field_c[var7];
                    break L8;
                  } else {
                    var7++;
                    break L8;
                  }
                }
                L9: {
                  var10 = ((m) this).field_c[var7];
                  if (-1 < (((m) this).field_c[var7] ^ -1)) {
                    param3++;
                    param0[param3] = (byte)var10;
                    if (param1 <= param3) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (-1 == (8 & var9)) {
                    var7++;
                    break L10;
                  } else {
                    var7 = ((m) this).field_c[var7];
                    break L10;
                  }
                }
                L11: {
                  var10 = ((m) this).field_c[var7];
                  if (((m) this).field_c[var7] >= 0) {
                    break L11;
                  } else {
                    param3++;
                    param0[param3] = (byte)(var10 ^ -1);
                    if (param1 > param3) {
                      var7 = 0;
                      break L11;
                    } else {
                      break L2;
                    }
                  }
                }
                L12: {
                  if (0 != (var9 & 4)) {
                    var7 = ((m) this).field_c[var7];
                    break L12;
                  } else {
                    var7++;
                    break L12;
                  }
                }
                L13: {
                  var10 = ((m) this).field_c[var7];
                  if (0 <= ((m) this).field_c[var7]) {
                    break L13;
                  } else {
                    param3++;
                    param0[param3] = (byte)(var10 ^ -1);
                    if (param1 > param3) {
                      var7 = 0;
                      break L13;
                    } else {
                      return -param5 + (var8 + 1);
                    }
                  }
                }
                L14: {
                  if (0 != (2 & var9)) {
                    var7 = ((m) this).field_c[var7];
                    break L14;
                  } else {
                    var7++;
                    break L14;
                  }
                }
                L15: {
                  var10 = ((m) this).field_c[var7];
                  if (((m) this).field_c[var7] >= 0) {
                    break L15;
                  } else {
                    param3++;
                    param0[param3] = (byte)(var10 ^ -1);
                    if (param3 >= param1) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L15;
                    }
                  }
                }
                L16: {
                  if ((var9 & 1) != 0) {
                    var7 = ((m) this).field_c[var7];
                    break L16;
                  } else {
                    var7++;
                    break L16;
                  }
                }
                var10 = ((m) this).field_c[var7];
                if (0 > ((m) this).field_c[var7]) {
                  param3++;
                  param0[param3] = (byte)(var10 ^ -1);
                  if (param3 < param1) {
                    var7 = 0;
                    var8++;
                    continue L0;
                  } else {
                    break L2;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              }
              return -param5 + (var8 + 1);
            }
          } else {
            return 15;
          }
        } else {
          return 0;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_h = null;
        field_b = null;
        if (param0 != 64) {
            return;
        }
        field_d = null;
        field_j = null;
        field_g = null;
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        var15 = SteelSentinels.field_G;
        var7 = 0;
        param5 = param5 + param4;
        var8 = param0 << -109427421;
        L0: while (true) {
          if (param5 <= param4) {
            L1: {
              if (param2 > 114) {
                break L1;
              } else {
                var16 = null;
                int discarded$1 = ((m) this).a(-84, (byte[]) null, -104, (byte[]) null, 31, 47);
                break L1;
              }
            }
            return (7 + var8 >> 762891907) - param0;
          } else {
            var9 = param3[param4] & 255;
            var10 = ((m) this).field_f[var9];
            var11 = ((m) this).field_e[var9];
            if (-1 != (var11 ^ -1)) {
              var12 = var8 >> 1463592867;
              var13 = 7 & var8;
              var7 = var7 & -var13 >> 1394767103;
              var14 = (-1 + var11 + var13 >> -1531798429) + var12;
              var13 += 24;
              var7 = vn.a(var7, var10 >>> var13);
              param1[var12] = (byte)vn.a(var7, var10 >>> var13);
              if (var14 > var12) {
                L2: {
                  var13 -= 8;
                  var12++;
                  var7 = var10 >>> var13;
                  param1[var12] = (byte)(var10 >>> var13);
                  if (var12 >= var14) {
                    break L2;
                  } else {
                    var13 -= 8;
                    var12++;
                    var7 = var10 >>> var13;
                    param1[var12] = (byte)(var10 >>> var13);
                    if (var12 < var14) {
                      var12++;
                      var13 -= 8;
                      var7 = var10 >>> var13;
                      param1[var12] = (byte)(var10 >>> var13);
                      if (var12 >= var14) {
                        break L2;
                      } else {
                        var13 -= 8;
                        var12++;
                        var7 = var10 << -var13;
                        param1[var12] = (byte)(var10 << -var13);
                        break L2;
                      }
                    } else {
                      var8 = var8 + var11;
                      param4++;
                      continue L0;
                    }
                  }
                }
                var8 = var8 + var11;
                param4++;
                continue L0;
              } else {
                var8 = var8 + var11;
                param4++;
                continue L0;
              }
            } else {
              throw new RuntimeException("" + var9);
            }
          }
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        if (param1 < 126) {
            field_j = null;
        }
        return ne.a((byte) -118, param0, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Yes";
    }
}
