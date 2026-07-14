/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static ee field_b;
    private byte[] field_d;
    private int[] field_c;
    static ee field_a;
    static String field_e;
    private int[] field_f;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 4) {
            il.a(56);
        }
        field_b = null;
        field_e = null;
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        if (0 == param0) {
          return 0;
        } else {
          L0: {
            if (param4 == -69) {
              break L0;
            } else {
              field_a = null;
              break L0;
            }
          }
          var7 = 0;
          param0 = param0 + param2;
          var8 = param5;
          L1: while (true) {
            L2: {
              var9 = param1[var8];
              if (-1 < (var9 ^ -1)) {
                var7 = ((il) this).field_c[var7];
                break L2;
              } else {
                var7++;
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((il) this).field_c[var7];
                if (((il) this).field_c[var7] >= 0) {
                  break L4;
                } else {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param0 > param2) {
                    var7 = 0;
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if ((var9 & 64) == 0) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((il) this).field_c[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((il) this).field_c[var7];
                if (((il) this).field_c[var7] >= 0) {
                  break L6;
                } else {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param0 > param2) {
                    var7 = 0;
                    break L6;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if ((var9 & 32) != 0) {
                  var7 = ((il) this).field_c[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((il) this).field_c[var7];
                if (0 <= ((il) this).field_c[var7]) {
                  break L8;
                } else {
                  param2++;
                  param3[param2] = (byte)var10;
                  if (param2 < param0) {
                    var7 = 0;
                    break L8;
                  } else {
                    break L3;
                  }
                }
              }
              L9: {
                if (-1 != (var9 & 16)) {
                  var7 = ((il) this).field_c[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((il) this).field_c[var7];
                if (0 <= ((il) this).field_c[var7]) {
                  break L10;
                } else {
                  param2++;
                  param3[param2] = (byte)var10;
                  if (param0 <= param2) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L10;
                  }
                }
              }
              L11: {
                if (-1 != (var9 & 8)) {
                  var7 = ((il) this).field_c[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((il) this).field_c[var7];
                if (0 <= ((il) this).field_c[var7]) {
                  break L12;
                } else {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param2 >= param0) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L12;
                  }
                }
              }
              L13: {
                if ((4 & var9) == -1) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((il) this).field_c[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((il) this).field_c[var7];
                if (-1 > ((il) this).field_c[var7]) {
                  param2++;
                  param3[param2] = (byte)var10;
                  if (param0 > param2) {
                    var7 = 0;
                    break L14;
                  } else {
                    break L3;
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if (-1 == (var9 & 2)) {
                  var7++;
                  break L15;
                } else {
                  var7 = ((il) this).field_c[var7];
                  break L15;
                }
              }
              L16: {
                var10 = ((il) this).field_c[var7];
                if (-1 < (((il) this).field_c[var7] ^ -1)) {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param0 > param2) {
                    var7 = 0;
                    break L16;
                  } else {
                    return -param5 + 1 + var8;
                  }
                } else {
                  break L16;
                }
              }
              L17: {
                if (0 != (1 & var9)) {
                  var7 = ((il) this).field_c[var7];
                  break L17;
                } else {
                  var7++;
                  break L17;
                }
              }
              L18: {
                var10 = ((il) this).field_c[var7];
                if (0 > ((il) this).field_c[var7]) {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param0 <= param2) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              var8++;
              continue L1;
            }
            return -param5 + 1 + var8;
          }
        }
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = BachelorFridge.field_y;
          var7 = 0;
          param1 = param1 + param4;
          var8 = param5 << 204726723;
          if (param2 == 20857) {
            break L0;
          } else {
            ((il) this).field_f = null;
            break L0;
          }
        }
        L1: while (true) {
          if (param1 <= param4) {
            return -param5 + (7 + var8 >> 260156451);
          } else {
            var9 = param0[param4] & 255;
            var10 = ((il) this).field_f[var9];
            var11 = ((il) this).field_d[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            } else {
              L2: {
                var12 = var8 >> 106662851;
                var13 = 7 & var8;
                var7 = var7 & -var13 >> -2012031777;
                var14 = (-1 + (var11 + var13) >> -617252093) + var12;
                var13 += 24;
                var7 = mp.a(var7, var10 >>> var13);
                param3[var12] = (byte)mp.a(var7, var10 >>> var13);
                if (var14 <= var12) {
                  break L2;
                } else {
                  var12++;
                  var13 -= 8;
                  var7 = var10 >>> var13;
                  param3[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7 = var10 >>> var13;
                    param3[var12] = (byte)(var10 >>> var13);
                    if (var12 < var14) {
                      var12++;
                      var13 -= 8;
                      var7 = var10 >>> var13;
                      param3[var12] = (byte)(var10 >>> var13);
                      if (var14 <= var12) {
                        break L2;
                      } else {
                        var12++;
                        var13 -= 8;
                        var7 = var10 << -var13;
                        param3[var12] = (byte)(var10 << -var13);
                        break L2;
                      }
                    } else {
                      var8 = var8 + var11;
                      param4++;
                      continue L1;
                    }
                  } else {
                    var8 = var8 + var11;
                    param4++;
                    continue L1;
                  }
                }
              }
              var8 = var8 + var11;
              param4++;
              continue L1;
            }
          }
        }
    }

    il(byte[] param0) {
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
        ((il) this).field_d = param0;
        ((il) this).field_f = new int[var2];
        ((il) this).field_c = new int[8];
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var2) {
          } else {
            var6 = param0[var5];
            if (-1 != (var6 ^ -1)) {
              L1: {
                var7 = 1 << 32 - var6;
                var8 = var19[var6];
                ((il) this).field_f[var5] = var8;
                if ((var8 & var7) != 0) {
                  var9 = var3[var6 + -1];
                  break L1;
                } else {
                  var10 = var6 - 1;
                  L2: while (true) {
                    L3: {
                      if ((var10 ^ -1) > -2) {
                        break L3;
                      } else {
                        var11 = var19[var10];
                        if (var8 != var11) {
                          break L3;
                        } else {
                          var12 = 1 << 32 + -var10;
                          if ((var12 & var11) != 0) {
                            var3[var10] = var3[-1 + var10];
                            break L3;
                          } else {
                            var3[var10] = mp.a(var12, var11);
                            var10--;
                            continue L2;
                          }
                        }
                      }
                    }
                    var9 = var7 | var8;
                    break L1;
                  }
                }
              }
              var19[var6] = var9;
              var10 = var6 + 1;
              L4: while (true) {
                if (var10 > 32) {
                  var10 = 0;
                  var11 = 0;
                  L5: while (true) {
                    if (var11 >= var6) {
                      L6: {
                        if (var4 > var10) {
                          break L6;
                        } else {
                          var4 = var10 + 1;
                          break L6;
                        }
                      }
                      ((il) this).field_c[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L7: {
                        var12 = -2147483648 >>> var11;
                        if ((var12 & var8) == 0) {
                          var10++;
                          break L7;
                        } else {
                          L8: {
                            if (((il) this).field_c[var10] != 0) {
                              break L8;
                            } else {
                              ((il) this).field_c[var10] = var4;
                              break L8;
                            }
                          }
                          var10 = ((il) this).field_c[var10];
                          break L7;
                        }
                      }
                      var12 = var12 >>> 1;
                      if (var10 >= ((il) this).field_c.length) {
                        var13 = new int[((il) this).field_c.length * 2];
                        var14 = 0;
                        L9: while (true) {
                          if (((il) this).field_c.length <= var14) {
                            ((il) this).field_c = var13;
                            var11++;
                            continue L5;
                          } else {
                            var13[var14] = ((il) this).field_c[var14];
                            var14++;
                            continue L9;
                          }
                        }
                      } else {
                        var11++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (var8 == var19[var10]) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has joined your game.";
    }
}
