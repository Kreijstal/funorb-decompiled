/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static int[] field_c;
    static kg field_b;
    static ib field_d;
    static String[] field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param4 == 4) {
            break L0;
          } else {
            ma.b(-106, -9, -49, -84, -66, 38, -48, -59, 40, 43, -59, -6, -28, -30);
            break L0;
          }
        }
        L1: {
          if (param1 >= param2) {
            if (param6 > param1) {
              ca.a(param7, param5, param2, param3, param0, param1, ge.field_i, -18427, param6);
              break L1;
            } else {
              if (param2 < param6) {
                ca.a(param7, param0, param2, param3, param5, param6, ge.field_i, param4 + -18431, param1);
                break L1;
              } else {
                ca.a(param7, param3, param6, param0, param5, param2, ge.field_i, param4 ^ -18431, param1);
                break L1;
              }
            }
          } else {
            if (param2 < param6) {
              ca.a(param7, param3, param1, param5, param0, param2, ge.field_i, -18427, param6);
              break L1;
            } else {
              if (param6 > param1) {
                ca.a(param7, param0, param1, param5, param3, param6, ge.field_i, -18427, param2);
                break L1;
              } else {
                ca.a(param7, param5, param6, param0, param3, param1, ge.field_i, param4 + -18431, param2);
                break L1;
              }
            }
          }
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        CharSequence var11 = (CharSequence) (Object) param2;
        int var3 = wg.a(false, var11, param1);
        if (param0 < 120) {
            Object var10 = null;
            ma.a((le) null, -54, 47, -57, 64, -26);
        }
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param2.charAt(var8) != param1; var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = var8 - -1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = re.field_d[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= pc.field_R - 1) {
                    break L2;
                  } else {
                    var22 = pc.field_R - 1;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 >= 0) {
                    break L3;
                  } else {
                    var23 = 0;
                    break L3;
                  }
                }
                L4: {
                  var24 = ge.field_i[var23 * pc.field_R + var22];
                  var25 = 64;
                  if (var25 >= 0) {
                    break L4;
                  } else {
                    var25 = -var25;
                    break L4;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                var15++;
                ge.field_i[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var16 = var16 + var17;
                var17 = var17 + param3;
                var18++;
                continue L0;
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L5: while (true) {
            L6: {
              if (var18 < param7) {
                break L6;
              } else {
                var17 = var17 - param3;
                var16 = var16 - var17;
                if (var16 < param5) {
                  L7: {
                    var19 = (var18 << 4) - param12;
                    var20 = (var16 << param4) / param6;
                    var21 = re.field_d[var20] * param10 >> 15;
                    var22 = var18 + (var19 * var21 + 131072 >> 18);
                    if (var22 >= 0) {
                      break L7;
                    } else {
                      var22 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var23 = param0 + (var14 * var21 + 131072 >> 18);
                    if (var23 >= 0) {
                      break L8;
                    } else {
                      var23 = 0;
                      break L8;
                    }
                  }
                  L9: {
                    var24 = ge.field_i[var23 * pc.field_R + var22];
                    var25 = 64;
                    if (var25 >= 0) {
                      break L9;
                    } else {
                      var25 = -var25;
                      break L9;
                    }
                  }
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  var15--;
                  ge.field_i[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var18--;
                  continue L5;
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        }
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param2)) {
            var4 += 4;
        }
        if (param0) {
            var4 += 2;
        }
        if (param1 <= 102) {
            Object var5 = null;
            ma.a((le) null, 33, -88, 56, 51, -105);
        }
        if (param3) {
            var4++;
        }
        return qh.field_c[var4];
    }

    final static le a(ad param0, String param1, int param2, String param3) {
        if (param2 != 16711680) {
            return null;
        }
        int var4 = param0.c(param3, (byte) -105);
        int var5 = param0.a(param1, var4, -28459);
        return kj.a(var5, param0, 17196, var4);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        L0: {
          var4 = param2 * param2;
          var5 = param0 - param2 >> 4;
          var6 = param0 + 15 >> 4;
          var7 = param0 + param2 + 15 >> 4;
          var8 = param1 - param2 >> 4;
          var9 = param1 + 15 >> 4;
          var10 = param1 + param2 + 15 >> 4;
          if (var5 >= 0) {
            break L0;
          } else {
            var5 = 0;
            break L0;
          }
        }
        L1: {
          if (var7 <= pc.field_R) {
            break L1;
          } else {
            var7 = pc.field_R;
            break L1;
          }
        }
        L2: {
          if (var8 >= 0) {
            break L2;
          } else {
            var8 = 0;
            break L2;
          }
        }
        L3: {
          if (var10 <= ge.field_g) {
            break L3;
          } else {
            var10 = ge.field_g;
            break L3;
          }
        }
        L4: {
          if (var6 >= 0) {
            break L4;
          } else {
            var6 = 0;
            break L4;
          }
        }
        L5: {
          if (var6 <= pc.field_R) {
            break L5;
          } else {
            var6 = pc.field_R;
            break L5;
          }
        }
        L6: {
          if (var9 >= 0) {
            break L6;
          } else {
            var9 = 0;
            break L6;
          }
        }
        L7: {
          if (var9 <= ge.field_g) {
            break L7;
          } else {
            var9 = ge.field_g;
            break L7;
          }
        }
        var11 = (var6 << 4) - param0;
        var11 = var11 * var11;
        var12 = (var6 + 1 << 4) - param0;
        var12 = var12 * var12;
        var13 = (var6 + 2 << 4) - param0;
        var13 = var13 * var13;
        var14 = var12 - var11;
        var15 = var13 - var12;
        var16 = var15 - var14;
        var17 = (var9 << 4) - param1;
        var17 = var17 * var17;
        var18 = (var9 + 1 << 4) - param1;
        var18 = var18 * var18;
        var19 = (var9 + 2 << 4) - param1;
        var19 = var19 * var19;
        var20 = var18 - var17;
        var21 = var19 - var18;
        var22 = var21 - var20;
        var23 = 16;
        var24 = var4;
        L8: while (true) {
          if (var4 <= 2147483647 >>> var23) {
            var25 = var9 * pc.field_R + var6;
            var26 = var11 + var17;
            var27 = var20;
            var28 = var9;
            L9: while (true) {
              if (var28 >= var10) {
                var25 = var9 * pc.field_R + var6;
                var26 = var11 + var17;
                var27 = var20;
                var28 = var9 - 1;
                L10: while (true) {
                  if (var28 < var8) {
                    return;
                  } else {
                    var27 = var27 - var22;
                    var26 = var26 - var27;
                    var25 = var25 - pc.field_R;
                    ma.a(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
                    var28--;
                    continue L10;
                  }
                }
              } else {
                ma.b(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
                var26 = var26 + var27;
                var27 = var27 + var22;
                var25 = var25 + pc.field_R;
                var28++;
                continue L9;
              }
            }
          } else {
            var23--;
            var24 = var24 + 1 >>> 1;
            continue L8;
          }
        }
    }

    final static void a(le param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var6 = param5 - param4;
        int var7 = param2;
        int var8 = 0;
        while (var7 < param3 + param2) {
            var9 = param4 + var8 * var6 / param3;
            if (var9 < 0) {
                break;
            }
            ge.h(0, var7, 640, var7 + 2);
            param0.b(param1, param2, var9);
            var7 += 2;
            var8 += 2;
        }
        ge.h(0, 0, 640, 480);
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = re.field_d[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= pc.field_R - 1) {
                    break L2;
                  } else {
                    var22 = pc.field_R - 1;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 <= ge.field_g - 1) {
                    break L3;
                  } else {
                    var23 = ge.field_g - 1;
                    break L3;
                  }
                }
                var24 = ge.field_i[var23 * pc.field_R + var22];
                var25 = 64;
                if (var25 >= 0) {
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  var15++;
                  ge.field_i[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var16 = var16 + var17;
                  var17 = var17 + param3;
                  var18++;
                  continue L0;
                } else {
                  throw new Error();
                }
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L4: while (true) {
            L5: {
              if (var18 < param7) {
                break L5;
              } else {
                var17 = var17 - param3;
                var16 = var16 - var17;
                if (var16 < param5) {
                  L6: {
                    var19 = (var18 << 4) - param12;
                    var20 = (var16 << param4) / param6;
                    var21 = re.field_d[var20] * param10 >> 15;
                    var22 = var18 + (var19 * var21 + 131072 >> 18);
                    if (var22 >= 0) {
                      break L6;
                    } else {
                      var22 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    var23 = param0 + (var14 * var21 + 131072 >> 18);
                    if (var23 <= ge.field_g - 1) {
                      break L7;
                    } else {
                      var23 = ge.field_g - 1;
                      break L7;
                    }
                  }
                  L8: {
                    var24 = ge.field_i[var23 * pc.field_R + var22];
                    var25 = 64;
                    if (var25 >= 0) {
                      break L8;
                    } else {
                      var25 = -var25;
                      break L8;
                    }
                  }
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  var15--;
                  ge.field_i[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var18--;
                  continue L4;
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        var7 = param6 - param5;
        var8 = 0;
        var9 = param2;
        var10 = 0;
        L0: while (true) {
          if (var9 >= param4 + param2) {
            return;
          } else {
            var11 = param5 + var10 * var7 / param4;
            if (var11 != 0) {
              var12 = param1;
              L1: while (true) {
                if (var12 < param3 + param1) {
                  if (param0[var8] != 0) {
                    var13 = var12 + var9 * ge.field_h;
                    var14 = 16711935 * var11;
                    var15 = (var14 & -16711936) + (16777215 * var11 - var14 & 16711680) >>> 8;
                    var14 = ge.field_i[var13];
                    var16 = var15 + var14;
                    var15 = (var15 & 16711935) + (var14 & 16711935);
                    var14 = (var15 & 16777472) + (var16 - var15 & 65536);
                    ge.f(var12, var9, 1, var16 - var14 | var14 - (var14 >>> 8));
                    var8++;
                    var12++;
                    continue L1;
                  } else {
                    var8++;
                    var12++;
                    continue L1;
                  }
                } else {
                  var9++;
                  var10++;
                  continue L0;
                }
              }
            } else {
              var9++;
              var10++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
        int var1 = -108 / ((-67 - param0) / 53);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[12];
        field_b = new kg();
        field_d = new ib();
    }
}
