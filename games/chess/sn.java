/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static String field_d;
    static String field_g;
    private int[] field_c;
    static String[] field_f;
    private byte[] field_h;
    static String field_e;
    private int[] field_a;
    static String field_b;

    final int a(byte param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
        if (-1 == (param2 ^ -1)) {
          return 0;
        } else {
          param2 = param2 + param4;
          var7 = 0;
          var8 = param3;
          if (param0 >= 57) {
            L0: while (true) {
              L1: {
                var9 = param1[var8];
                if (0 > var9) {
                  var7 = ((sn) this).field_c[var7];
                  break L1;
                } else {
                  var7++;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var10 = ((sn) this).field_c[var7];
                  if (0 <= ((sn) this).field_c[var7]) {
                    break L3;
                  } else {
                    int incrementValue$8 = param4;
                    param4++;
                    param5[incrementValue$8] = (byte)(var10 ^ -1);
                    if (param2 > param4) {
                      var7 = 0;
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if ((64 & var9) == 0) {
                    var7++;
                    break L4;
                  } else {
                    var7 = ((sn) this).field_c[var7];
                    break L4;
                  }
                }
                L5: {
                  var10 = ((sn) this).field_c[var7];
                  if (((sn) this).field_c[var7] >= 0) {
                    break L5;
                  } else {
                    int incrementValue$9 = param4;
                    param4++;
                    param5[incrementValue$9] = (byte)var10;
                    if (param4 < param2) {
                      var7 = 0;
                      break L5;
                    } else {
                      break L2;
                    }
                  }
                }
                L6: {
                  if (-1 != (var9 & 32)) {
                    var7 = ((sn) this).field_c[var7];
                    break L6;
                  } else {
                    var7++;
                    break L6;
                  }
                }
                L7: {
                  var10 = ((sn) this).field_c[var7];
                  if (-1 < (((sn) this).field_c[var7] ^ -1)) {
                    int incrementValue$10 = param4;
                    param4++;
                    param5[incrementValue$10] = (byte)(var10 ^ -1);
                    if (param2 > param4) {
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
                  if ((16 & var9) != 0) {
                    var7 = ((sn) this).field_c[var7];
                    break L8;
                  } else {
                    var7++;
                    break L8;
                  }
                }
                L9: {
                  var10 = ((sn) this).field_c[var7];
                  if (0 <= ((sn) this).field_c[var7]) {
                    break L9;
                  } else {
                    int incrementValue$11 = param4;
                    param4++;
                    param5[incrementValue$11] = (byte)(var10 ^ -1);
                    if (param2 > param4) {
                      var7 = 0;
                      break L9;
                    } else {
                      break L2;
                    }
                  }
                }
                L10: {
                  if ((var9 & 8) != 0) {
                    var7 = ((sn) this).field_c[var7];
                    break L10;
                  } else {
                    var7++;
                    break L10;
                  }
                }
                L11: {
                  var10 = ((sn) this).field_c[var7];
                  if (0 <= ((sn) this).field_c[var7]) {
                    break L11;
                  } else {
                    int incrementValue$12 = param4;
                    param4++;
                    param5[incrementValue$12] = (byte)(var10 ^ -1);
                    if (param2 > param4) {
                      var7 = 0;
                      break L11;
                    } else {
                      break L2;
                    }
                  }
                }
                L12: {
                  if ((4 & var9) != 0) {
                    var7 = ((sn) this).field_c[var7];
                    break L12;
                  } else {
                    var7++;
                    break L12;
                  }
                }
                L13: {
                  var10 = ((sn) this).field_c[var7];
                  if (((sn) this).field_c[var7] < 0) {
                    int incrementValue$13 = param4;
                    param4++;
                    param5[incrementValue$13] = (byte)var10;
                    if (param4 >= param2) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (-1 != (2 & var9)) {
                    var7 = ((sn) this).field_c[var7];
                    break L14;
                  } else {
                    var7++;
                    break L14;
                  }
                }
                L15: {
                  var10 = ((sn) this).field_c[var7];
                  if (((sn) this).field_c[var7] < 0) {
                    int incrementValue$14 = param4;
                    param4++;
                    param5[incrementValue$14] = (byte)(var10 ^ -1);
                    if (param4 < param2) {
                      var7 = 0;
                      break L15;
                    } else {
                      return -param3 + 1 + var8;
                    }
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (0 != (var9 & 1)) {
                    var7 = ((sn) this).field_c[var7];
                    break L16;
                  } else {
                    var7++;
                    break L16;
                  }
                }
                var10 = ((sn) this).field_c[var7];
                if (-1 < (((sn) this).field_c[var7] ^ -1)) {
                  int incrementValue$15 = param4;
                  param4++;
                  param5[incrementValue$15] = (byte)(var10 ^ -1);
                  if (param2 > param4) {
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
              return -param3 + 1 + var8;
            }
          } else {
            return -103;
          }
        }
    }

    final int a(boolean param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
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
          var15 = Chess.field_G;
          var7 = 0;
          if (param0) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var8 = param5 << 183275587;
        param1 = param1 + param2;
        L1: while (true) {
          if (param2 >= param1) {
            return -param5 + (7 + var8 >> 1800648931);
          } else {
            var9 = param3[param2] & 255;
            var10 = ((sn) this).field_a[var9];
            var11 = ((sn) this).field_h[var9];
            if (var11 != 0) {
              L2: {
                var12 = var8 >> 461555747;
                var13 = var8 & 7;
                var7 = var7 & -var13 >> 2124791775;
                var14 = var12 + (var13 - (-var11 - -1) >> -2083736509);
                var13 += 24;
                int dupTemp$1 = s.a(var7, var10 >>> var13);
                var7 = dupTemp$1;
                param4[var12] = (byte)dupTemp$1;
                if (var12 >= var14) {
                  break L2;
                } else {
                  var12++;
                  var13 -= 8;
                  var7 = var10 >>> var13;
                  param4[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7 = var10 >>> var13;
                    param4[var12] = (byte)(var10 >>> var13);
                    if (var14 > var12) {
                      var12++;
                      var13 -= 8;
                      var7 = var10 >>> var13;
                      param4[var12] = (byte)(var10 >>> var13);
                      if (var14 > var12) {
                        var13 -= 8;
                        var12++;
                        var7 = var10 << -var13;
                        param4[var12] = (byte)(var10 << -var13);
                        break L2;
                      } else {
                        var8 = var8 + var11;
                        param2++;
                        continue L1;
                      }
                    } else {
                      var8 = var8 + var11;
                      param2++;
                      continue L1;
                    }
                  } else {
                    var8 = var8 + var11;
                    param2++;
                    continue L1;
                  }
                }
              }
              var8 = var8 + var11;
              param2++;
              continue L1;
            } else {
              throw new RuntimeException("" + var9);
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -65) {
            field_f = null;
        }
        field_d = null;
        field_e = null;
        field_f = null;
        field_b = null;
        field_g = null;
    }

    sn(byte[] param0) {
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
        ((sn) this).field_h = param0;
        ((sn) this).field_a = new int[var2];
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        ((sn) this).field_c = new int[8];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var2 <= var5) {
            return;
          } else {
            var6 = param0[var5];
            if (var6 != 0) {
              L1: {
                var7 = 1 << -var6 + 32;
                var8 = var19[var6];
                ((sn) this).field_a[var5] = var8;
                if ((var7 & var8) == 0) {
                  var9 = var7 | var8;
                  var10 = var6 - 1;
                  L2: while (true) {
                    if ((var10 ^ -1) > -2) {
                      break L1;
                    } else {
                      var11 = var19[var10];
                      if (var8 != var11) {
                        break L1;
                      } else {
                        var12 = 1 << 32 + -var10;
                        if (0 != (var11 & var12)) {
                          var3[var10] = var3[var10 - 1];
                          break L1;
                        } else {
                          var3[var10] = s.a(var12, var11);
                          var10--;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  var9 = var3[-1 + var6];
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
                        if (var4 > var10) {
                          break L5;
                        } else {
                          var4 = 1 + var10;
                          break L5;
                        }
                      }
                      ((sn) this).field_c[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if ((var12 & var8) != 0) {
                          L7: {
                            if (0 != ((sn) this).field_c[var10]) {
                              break L7;
                            } else {
                              ((sn) this).field_c[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((sn) this).field_c[var10];
                          break L6;
                        } else {
                          var10++;
                          break L6;
                        }
                      }
                      var12 = var12 >>> 1;
                      if (var10 >= ((sn) this).field_c.length) {
                        var13 = new int[2 * ((sn) this).field_c.length];
                        var14 = 0;
                        L8: while (true) {
                          if (var14 >= ((sn) this).field_c.length) {
                            ((sn) this).field_c = var13;
                            var11++;
                            continue L4;
                          } else {
                            var13[var14] = ((sn) this).field_c[var14];
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for fonts";
        field_f = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_e = "Message lobby";
        field_b = "Quit to website";
    }
}
