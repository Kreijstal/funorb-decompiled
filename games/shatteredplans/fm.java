/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static int field_f;
    private int[] field_a;
    static bi[] field_d;
    static bi field_e;
    static bi field_b;
    static int[] field_c;
    private byte[] field_h;
    private int[] field_g;

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 > (es.field_m ^ -1)) {
            L1: {
              if (null == bh.field_p) {
                bj.field_K = si.a(640, fa.field_W, 0, (byte) 98, 0, 480);
                break L1;
              } else {
                bj.field_K = bh.field_p.a(0);
                vr.a(param1 + -15468, 2);
                break L1;
              }
            }
            if (null == bj.field_K) {
              var2 = 3;
              break L0;
            } else {
              re.a((java.awt.Canvas) (Object) bj.field_K, false);
              var2 = 2;
              break L0;
            }
          } else {
            if (w.d(true)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          }
        }
        L2: {
          if (null != bh.field_p) {
            break L2;
          } else {
            if (!cp.field_u) {
              break L2;
            } else {
              gm.a(param0, 125, var2);
              break L2;
            }
          }
        }
    }

    final int a(byte[] param0, byte[] param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (0 != param2) {
          L0: {
            if (param3 == 7) {
              break L0;
            } else {
              field_b = null;
              break L0;
            }
          }
          var7 = 0;
          param2 = param2 + param5;
          var8 = param4;
          L1: while (true) {
            L2: {
              var9 = param1[var8];
              if ((var9 ^ -1) > -1) {
                var7 = ((fm) this).field_g[var7];
                break L2;
              } else {
                var7++;
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((fm) this).field_g[var7];
                if (0 <= ((fm) this).field_g[var7]) {
                  break L4;
                } else {
                  param5++;
                  param0[param5] = (byte)var10;
                  if (param5 >= param2) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L4;
                  }
                }
              }
              L5: {
                if (-1 != (64 & var9)) {
                  var7 = ((fm) this).field_g[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((fm) this).field_g[var7];
                if (((fm) this).field_g[var7] >= 0) {
                  break L6;
                } else {
                  param5++;
                  param0[param5] = (byte)var10;
                  if (param2 > param5) {
                    var7 = 0;
                    break L6;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if (-1 == (32 & var9)) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((fm) this).field_g[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((fm) this).field_g[var7];
                if (-1 < (((fm) this).field_g[var7] ^ -1)) {
                  param5++;
                  param0[param5] = (byte)(var10 ^ -1);
                  if (param2 > param5) {
                    var7 = 0;
                    break L8;
                  } else {
                    break L3;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if (0 != (var9 & 16)) {
                  var7 = ((fm) this).field_g[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((fm) this).field_g[var7];
                if (((fm) this).field_g[var7] < 0) {
                  param5++;
                  param0[param5] = (byte)(var10 ^ -1);
                  if (param5 < param2) {
                    var7 = 0;
                    break L10;
                  } else {
                    break L3;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if ((var9 & 8) != 0) {
                  var7 = ((fm) this).field_g[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((fm) this).field_g[var7];
                if (((fm) this).field_g[var7] < 0) {
                  param5++;
                  param0[param5] = (byte)var10;
                  if (param5 < param2) {
                    var7 = 0;
                    break L12;
                  } else {
                    break L3;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if (-1 != (4 & var9)) {
                  var7 = ((fm) this).field_g[var7];
                  break L13;
                } else {
                  var7++;
                  break L13;
                }
              }
              L14: {
                var10 = ((fm) this).field_g[var7];
                if (-1 >= (((fm) this).field_g[var7] ^ -1)) {
                  break L14;
                } else {
                  param5++;
                  param0[param5] = (byte)var10;
                  if (param2 > param5) {
                    var7 = 0;
                    break L14;
                  } else {
                    break L3;
                  }
                }
              }
              L15: {
                if (-1 != (2 & var9)) {
                  var7 = ((fm) this).field_g[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              L16: {
                var10 = ((fm) this).field_g[var7];
                if (((fm) this).field_g[var7] < 0) {
                  param5++;
                  param0[param5] = (byte)(var10 ^ -1);
                  if (param2 > param5) {
                    var7 = 0;
                    break L16;
                  } else {
                    return 1 + var8 + -param4;
                  }
                } else {
                  break L16;
                }
              }
              L17: {
                if (0 == (var9 & 1)) {
                  var7++;
                  break L17;
                } else {
                  var7 = ((fm) this).field_g[var7];
                  break L17;
                }
              }
              L18: {
                var10 = ((fm) this).field_g[var7];
                if (0 <= ((fm) this).field_g[var7]) {
                  break L18;
                } else {
                  break L18;
                }
              }
              var8++;
              continue L1;
            }
            return 1 + var8 + -param4;
          }
        } else {
          return 0;
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
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        var7 = 0;
        var8 = param1 << 1678918051;
        param5 = param5 + param4;
        L0: while (true) {
          if (param4 >= param5) {
            if (param2 == -6309) {
              return (var8 - -7 >> 1529703459) + -param1;
            } else {
              return 112;
            }
          } else {
            var9 = param0[param4] & 255;
            var10 = ((fm) this).field_a[var9];
            var11 = ((fm) this).field_h[var9];
            if (var11 != 0) {
              var12 = var8 >> -726862557;
              var13 = 7 & var8;
              var7 = var7 & -var13 >> 1006681023;
              var14 = var12 + (-1 + (var11 + var13) >> 1107304547);
              var8 = var8 + var11;
              var13 += 24;
              var7 = ee.a(var7, var10 >>> var13);
              param3[var12] = (byte)ee.a(var7, var10 >>> var13);
              if (var12 < var14) {
                var12++;
                var13 -= 8;
                var7 = var10 >>> var13;
                param3[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var13 -= 8;
                  var12++;
                  var7 = var10 >>> var13;
                  param3[var12] = (byte)(var10 >>> var13);
                  if (var14 > var12) {
                    var13 -= 8;
                    var12++;
                    var7 = var10 >>> var13;
                    param3[var12] = (byte)(var10 >>> var13);
                    if (var12 < var14) {
                      var13 -= 8;
                      var12++;
                      var7 = var10 << -var13;
                      param3[var12] = (byte)(var10 << -var13);
                      param4++;
                      continue L0;
                    } else {
                      param4++;
                      continue L0;
                    }
                  } else {
                    param4++;
                    continue L0;
                  }
                } else {
                  param4++;
                  continue L0;
                }
              } else {
                param4++;
                continue L0;
              }
            } else {
              throw new RuntimeException("" + var9);
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 < 58) {
            field_c = null;
        }
        field_b = null;
    }

    fm(byte[] param0) {
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
        ((fm) this).field_a = new int[var2];
        ((fm) this).field_h = param0;
        ((fm) this).field_g = new int[8];
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
                ((fm) this).field_a[var5] = var8;
                if ((var8 & var7) == 0) {
                  var9 = var8 | var7;
                  var10 = -1 + var6;
                  L2: while (true) {
                    if (-2 < (var10 ^ -1)) {
                      break L1;
                    } else {
                      var11 = var19[var10];
                      if (var8 != var11) {
                        break L1;
                      } else {
                        var12 = 1 << -var10 + 32;
                        if (0 == (var11 & var12)) {
                          var3[var10] = ee.a(var12, var11);
                          var10--;
                          continue L2;
                        } else {
                          var3[var10] = var3[var10 + -1];
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  var9 = var3[var6 + -1];
                  break L1;
                }
              }
              var19[var6] = var9;
              var10 = var6 + 1;
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
                          var4 = 1 + var10;
                          break L5;
                        }
                      }
                      ((fm) this).field_g[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if (0 != (var12 & var8)) {
                          L7: {
                            if (((fm) this).field_g[var10] != 0) {
                              break L7;
                            } else {
                              ((fm) this).field_g[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((fm) this).field_g[var10];
                          break L6;
                        } else {
                          var10++;
                          break L6;
                        }
                      }
                      L8: {
                        if (var10 < ((fm) this).field_g.length) {
                          break L8;
                        } else {
                          var13 = new int[((fm) this).field_g.length * 2];
                          var14 = 0;
                          L9: while (true) {
                            if (((fm) this).field_g.length <= var14) {
                              ((fm) this).field_g = var13;
                              break L8;
                            } else {
                              var13[var14] = ((fm) this).field_g[var14];
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
                  if (var8 == var19[var10]) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
