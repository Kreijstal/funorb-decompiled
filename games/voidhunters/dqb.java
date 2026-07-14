/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dqb {
    private int[] field_d;
    private byte[] field_a;
    static String field_c;
    private int[] field_b;

    final int b(int param0, byte[] param1, byte[] param2, int param3, int param4, int param5) {
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
        L0: {
          var15 = VoidHunters.field_G;
          var7 = 0;
          if (param3 > 1) {
            break L0;
          } else {
            var16 = null;
            int discarded$1 = ((dqb) this).a(15, (byte[]) null, (byte[]) null, 34, 99, 31);
            break L0;
          }
        }
        param0 = param0 + param5;
        var8 = param4 << 1075936547;
        L1: while (true) {
          if (param5 >= param0) {
            return (7 + var8 >> -1426126653) + -param4;
          } else {
            var9 = 255 & param1[param5];
            var10 = ((dqb) this).field_d[var9];
            var11 = ((dqb) this).field_a[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            } else {
              var12 = var8 >> 239484419;
              var13 = var8 & 7;
              var7 = var7 & -var13 >> -1832139457;
              var14 = var12 + (var11 + (var13 - 1) >> -1629720925);
              var8 = var8 + var11;
              var13 += 24;
              var7 = knb.a(var7, var10 >>> var13);
              param2[var12] = (byte)knb.a(var7, var10 >>> var13);
              if (var14 > var12) {
                var13 -= 8;
                var12++;
                var7 = var10 >>> var13;
                param2[var12] = (byte)(var10 >>> var13);
                if (var14 > var12) {
                  var12++;
                  var13 -= 8;
                  var7 = var10 >>> var13;
                  param2[var12] = (byte)(var10 >>> var13);
                  if (var14 > var12) {
                    var12++;
                    var13 -= 8;
                    var7 = var10 >>> var13;
                    param2[var12] = (byte)(var10 >>> var13);
                    if (var12 < var14) {
                      var12++;
                      var13 -= 8;
                      var7 = var10 << -var13;
                      param2[var12] = (byte)(var10 << -var13);
                      param5++;
                      continue L1;
                    } else {
                      param5++;
                      continue L1;
                    }
                  } else {
                    param5++;
                    continue L1;
                  }
                } else {
                  param5++;
                  continue L1;
                }
              } else {
                param5++;
                continue L1;
              }
            }
          }
        }
    }

    final static byte[] a(byte param0, String param1) {
        if (param0 >= -1) {
            Object var3 = null;
            byte[] discarded$0 = dqb.a((byte) 2, (String) null);
        }
        return cja.field_j.a(param1, true, "");
    }

    dqb(byte[] param0) {
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
        ((dqb) this).field_a = param0;
        ((dqb) this).field_d = new int[var2];
        ((dqb) this).field_b = new int[8];
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
                ((dqb) this).field_d[var5] = var8;
                if (0 != (var8 & var7)) {
                  var9 = var3[var6 - 1];
                  break L1;
                } else {
                  var9 = var8 | var7;
                  var10 = -1 + var6;
                  L2: while (true) {
                    if (-2 < (var10 ^ -1)) {
                      break L1;
                    } else {
                      var11 = var19[var10];
                      if (var11 != var8) {
                        break L1;
                      } else {
                        var12 = 1 << -var10 + 32;
                        if (-1 != (var11 & var12 ^ -1)) {
                          var3[var10] = var3[var10 + -1];
                          break L1;
                        } else {
                          var3[var10] = knb.a(var11, var12);
                          var10--;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
              var19[var6] = var9;
              var10 = 1 + var6;
              L3: while (true) {
                if (32 < var10) {
                  var10 = 0;
                  var11 = 0;
                  L4: while (true) {
                    if (var6 <= var11) {
                      L5: {
                        if (var10 < var4) {
                          break L5;
                        } else {
                          var4 = var10 - -1;
                          break L5;
                        }
                      }
                      ((dqb) this).field_b[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if (0 == (var12 & var8)) {
                          var10++;
                          break L6;
                        } else {
                          L7: {
                            if (-1 != (((dqb) this).field_b[var10] ^ -1)) {
                              break L7;
                            } else {
                              ((dqb) this).field_b[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((dqb) this).field_b[var10];
                          break L6;
                        }
                      }
                      var12 = var12 >>> 1;
                      if (((dqb) this).field_b.length <= var10) {
                        var13 = new int[((dqb) this).field_b.length * 2];
                        var14 = 0;
                        L8: while (true) {
                          if (((dqb) this).field_b.length <= var14) {
                            ((dqb) this).field_b = var13;
                            var11++;
                            continue L4;
                          } else {
                            var13[var14] = ((dqb) this).field_b[var14];
                            var14++;
                            continue L8;
                          }
                        }
                      } else {
                        var11++;
                        continue L4;
                      }
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

    public static void a(int param0) {
        field_c = null;
        if (param0 != 15060) {
            Object var2 = null;
            byte[] discarded$0 = dqb.a((byte) 32, (String) null);
        }
    }

    final int a(int param0, byte[] param1, byte[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        if (param3 == 0) {
          return 0;
        } else {
          var7 = param4;
          param3 = param3 + param0;
          var8 = param5;
          L0: while (true) {
            L1: {
              var9 = param1[var8];
              if (-1 >= (var9 ^ -1)) {
                var7++;
                break L1;
              } else {
                var7 = ((dqb) this).field_b[var7];
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = ((dqb) this).field_b[var7];
                if (((dqb) this).field_b[var7] < 0) {
                  param0++;
                  param2[param0] = (byte)(var10 ^ -1);
                  if (param3 <= param0) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if ((64 & var9) == -1) {
                  var7++;
                  break L4;
                } else {
                  var7 = ((dqb) this).field_b[var7];
                  break L4;
                }
              }
              L5: {
                var10 = ((dqb) this).field_b[var7];
                if (-1 > ((dqb) this).field_b[var7]) {
                  param0++;
                  param2[param0] = (byte)(var10 ^ -1);
                  if (param3 > param0) {
                    var7 = 0;
                    break L5;
                  } else {
                    break L2;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if ((32 & var9) != 0) {
                  var7 = ((dqb) this).field_b[var7];
                  break L6;
                } else {
                  var7++;
                  break L6;
                }
              }
              L7: {
                var10 = ((dqb) this).field_b[var7];
                if (-1 < (((dqb) this).field_b[var7] ^ -1)) {
                  param0++;
                  param2[param0] = (byte)var10;
                  if (param3 > param0) {
                    var7 = 0;
                    break L7;
                  } else {
                    break L2;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (-1 != (var9 & 16)) {
                  var7 = ((dqb) this).field_b[var7];
                  break L8;
                } else {
                  var7++;
                  break L8;
                }
              }
              L9: {
                var10 = ((dqb) this).field_b[var7];
                if (((dqb) this).field_b[var7] >= 0) {
                  break L9;
                } else {
                  param0++;
                  param2[param0] = (byte)(var10 ^ -1);
                  if (param3 <= param0) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L9;
                  }
                }
              }
              L10: {
                if (0 == (8 & var9)) {
                  var7++;
                  break L10;
                } else {
                  var7 = ((dqb) this).field_b[var7];
                  break L10;
                }
              }
              L11: {
                var10 = ((dqb) this).field_b[var7];
                if (((dqb) this).field_b[var7] < 0) {
                  param0++;
                  param2[param0] = (byte)var10;
                  if (param0 < param3) {
                    var7 = 0;
                    break L11;
                  } else {
                    break L2;
                  }
                } else {
                  break L11;
                }
              }
              L12: {
                if (-1 != (4 & var9)) {
                  var7 = ((dqb) this).field_b[var7];
                  break L12;
                } else {
                  var7++;
                  break L12;
                }
              }
              L13: {
                var10 = ((dqb) this).field_b[var7];
                if (-1 < (((dqb) this).field_b[var7] ^ -1)) {
                  param0++;
                  param2[param0] = (byte)(var10 ^ -1);
                  if (param0 < param3) {
                    var7 = 0;
                    break L13;
                  } else {
                    break L2;
                  }
                } else {
                  break L13;
                }
              }
              L14: {
                if ((var9 & 2) == 0) {
                  var7++;
                  break L14;
                } else {
                  var7 = ((dqb) this).field_b[var7];
                  break L14;
                }
              }
              L15: {
                var10 = ((dqb) this).field_b[var7];
                if (((dqb) this).field_b[var7] >= 0) {
                  break L15;
                } else {
                  param0++;
                  param2[param0] = (byte)var10;
                  if (param3 > param0) {
                    var7 = 0;
                    break L15;
                  } else {
                    return var8 + 1 - param5;
                  }
                }
              }
              L16: {
                if (-1 != (var9 & 1)) {
                  var7 = ((dqb) this).field_b[var7];
                  break L16;
                } else {
                  var7++;
                  break L16;
                }
              }
              L17: {
                var10 = ((dqb) this).field_b[var7];
                if (0 > ((dqb) this).field_b[var7]) {
                  param0++;
                  param2[param0] = (byte)(var10 ^ -1);
                  if (param0 < param3) {
                    var7 = 0;
                    break L17;
                  } else {
                    break L2;
                  }
                } else {
                  break L17;
                }
              }
              var8++;
              continue L0;
            }
            return var8 + 1 - param5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Grappling hook launcher";
    }
}
