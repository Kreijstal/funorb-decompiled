/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks {
    static String field_b;
    static String field_f;
    private byte[] field_a;
    private int[] field_c;
    static int field_e;
    static String field_g;
    private int[] field_d;

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_f = null;
        if (param0 != 0) {
            field_g = null;
        }
    }

    ks(byte[] param0) {
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
        ((ks) this).field_a = param0;
        ((ks) this).field_d = new int[var2];
        ((ks) this).field_c = new int[8];
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
            if (0 != var6) {
              L1: {
                var7 = 1 << 32 - var6;
                var8 = var19[var6];
                ((ks) this).field_d[var5] = var8;
                if ((var8 & var7) != 0) {
                  var9 = var3[-1 + var6];
                  break L1;
                } else {
                  var9 = var7 | var8;
                  var10 = -1 + var6;
                  L2: while (true) {
                    if (var10 < 1) {
                      break L1;
                    } else {
                      var11 = var19[var10];
                      if (var8 != var11) {
                        break L1;
                      } else {
                        var12 = 1 << 32 + -var10;
                        if (-1 == (var11 & var12 ^ -1)) {
                          var3[var10] = hf.a(var11, var12);
                          var10--;
                          continue L2;
                        } else {
                          var3[var10] = var3[-1 + var10];
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              var19[var6] = var9;
              var10 = var6 - -1;
              L3: while (true) {
                if ((var10 ^ -1) < -33) {
                  var10 = 0;
                  var11 = 0;
                  L4: while (true) {
                    if (var6 <= var11) {
                      L5: {
                        if (var10 < var4) {
                          break L5;
                        } else {
                          var4 = var10 + 1;
                          break L5;
                        }
                      }
                      ((ks) this).field_c[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if ((var8 & var12) == 0) {
                          var10++;
                          break L6;
                        } else {
                          L7: {
                            if (0 != ((ks) this).field_c[var10]) {
                              break L7;
                            } else {
                              ((ks) this).field_c[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((ks) this).field_c[var10];
                          break L6;
                        }
                      }
                      L8: {
                        if (((ks) this).field_c.length > var10) {
                          break L8;
                        } else {
                          var13 = new int[2 * ((ks) this).field_c.length];
                          var14 = 0;
                          L9: while (true) {
                            if (((ks) this).field_c.length <= var14) {
                              ((ks) this).field_c = var13;
                              break L8;
                            } else {
                              var13[var14] = ((ks) this).field_c[var14];
                              var14++;
                              continue L9;
                            }
                          }
                        }
                      }
                      var12 = var12 >>> 1;
                      var11++;
                      continue L4;
                    }
                  }
                } else {
                  if (var19[var10] == var8) {
                    var19[var10] = var9;
                    var10++;
                    continue L3;
                  } else {
                    var10++;
                    continue L3;
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

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Kickabout.field_G;
        if (param2 != 0) {
          L0: {
            var7 = 0;
            param2 = param2 + param4;
            if (!param5) {
              break L0;
            } else {
              ((ks) this).field_a = null;
              break L0;
            }
          }
          var8 = param0;
          L1: while (true) {
            L2: {
              var9 = param3[var8];
              if (-1 < (var9 ^ -1)) {
                var7 = ((ks) this).field_c[var7];
                break L2;
              } else {
                var7++;
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((ks) this).field_c[var7];
                if (((ks) this).field_c[var7] < 0) {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param2 > param4) {
                    var7 = 0;
                    break L4;
                  } else {
                    break L3;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if ((var9 & 64) != 0) {
                  var7 = ((ks) this).field_c[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((ks) this).field_c[var7];
                if (((ks) this).field_c[var7] < 0) {
                  param4++;
                  param1[param4] = (byte)var10;
                  if (param2 > param4) {
                    var7 = 0;
                    break L6;
                  } else {
                    break L3;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (-1 == (32 & var9)) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((ks) this).field_c[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((ks) this).field_c[var7];
                if (-1 < (((ks) this).field_c[var7] ^ -1)) {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param2 <= param4) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if ((var9 & 16) != 0) {
                  var7 = ((ks) this).field_c[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((ks) this).field_c[var7];
                if (((ks) this).field_c[var7] < 0) {
                  param4++;
                  param1[param4] = (byte)var10;
                  if (param4 >= param2) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if (-1 == (8 & var9)) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((ks) this).field_c[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((ks) this).field_c[var7];
                if (0 <= ((ks) this).field_c[var7]) {
                  break L12;
                } else {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param2 > param4) {
                    var7 = 0;
                    break L12;
                  } else {
                    break L3;
                  }
                }
              }
              L13: {
                if (0 == (var9 & 4)) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((ks) this).field_c[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((ks) this).field_c[var7];
                if (-1 < (((ks) this).field_c[var7] ^ -1)) {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param2 > param4) {
                    var7 = 0;
                    break L14;
                  } else {
                    return var8 + 1 - param0;
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if (0 != (var9 & 2)) {
                  var7 = ((ks) this).field_c[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              L16: {
                var10 = ((ks) this).field_c[var7];
                if (((ks) this).field_c[var7] >= 0) {
                  break L16;
                } else {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param4 >= param2) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L16;
                  }
                }
              }
              L17: {
                if ((1 & var9) != 0) {
                  var7 = ((ks) this).field_c[var7];
                  break L17;
                } else {
                  var7++;
                  break L17;
                }
              }
              L18: {
                var10 = ((ks) this).field_c[var7];
                if (((ks) this).field_c[var7] >= 0) {
                  break L18;
                } else {
                  break L18;
                }
              }
              var8++;
              continue L1;
            }
            return var8 + 1 - param0;
          }
        } else {
          return 0;
        }
    }

    final static short a(int param0, int param1, int param2, int param3) {
        int var4 = -3 / ((param2 - 23) / 41);
        return (short)(param0 | (param1 << 1725180170 | param3 << 39015463));
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Kickabout.field_G;
        var7 = 0;
        var8 = param2 << -689335837;
        param1 = param1 + param5;
        L0: while (true) {
          if (param1 <= param5) {
            if (param0 == -1) {
              return -param2 + (var8 + 7 >> -1030715069);
            } else {
              return -15;
            }
          } else {
            var9 = param4[param5] & 255;
            var10 = ((ks) this).field_d[var9];
            var11 = ((ks) this).field_a[var9];
            if (-1 != (var11 ^ -1)) {
              var12 = var8 >> 2042312931;
              var13 = var8 & 7;
              var7 = var7 & -var13 >> -1779341505;
              var14 = (var13 - (-var11 + 1) >> 978944515) + var12;
              var8 = var8 + var11;
              var13 += 24;
              var7 = hf.a(var7, var10 >>> var13);
              param3[var12] = (byte)hf.a(var7, var10 >>> var13);
              if (var14 > var12) {
                var13 -= 8;
                var12++;
                var7 = var10 >>> var13;
                param3[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var13 -= 8;
                  var12++;
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
                      var7 = var10 << -var13;
                      param3[var12] = (byte)(var10 << -var13);
                      param5++;
                      continue L0;
                    } else {
                      param5++;
                      continue L0;
                    }
                  } else {
                    param5++;
                    continue L0;
                  }
                } else {
                  param5++;
                  continue L0;
                }
              } else {
                param5++;
                continue L0;
              }
            } else {
              throw new RuntimeException("" + var9);
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "+";
        field_f = "(next round starts in <%0> seconds)";
    }
}
