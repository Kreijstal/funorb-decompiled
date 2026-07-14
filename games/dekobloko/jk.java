/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_a;
    static int field_e;
    private int[] field_d;
    static String field_g;
    static int field_c;
    private int[] field_f;
    private byte[] field_b;

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (eh.field_a > 0) {
            L1: {
              if (li.field_b == null) {
                cl.field_v = sg.a(640, lf.field_e, 0, 0, 82, 480);
                break L1;
              } else {
                cl.field_v = li.field_b.c(27134);
                p.a(2, (byte) -30);
                break L1;
              }
            }
            if (null == cl.field_v) {
              var2 = 3;
              break L0;
            } else {
              hl.a((java.awt.Canvas) (Object) cl.field_v, (byte) -42);
              var2 = 2;
              break L0;
            }
          } else {
            if (ph.n(-30146)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          }
        }
        L2: {
          if (param0 == 2) {
            break L2;
          } else {
            field_e = -30;
            break L2;
          }
        }
        L3: {
          if (li.field_b != null) {
            break L3;
          } else {
            if (!ij.field_e) {
              break L3;
            } else {
              bl.a(param0 + -73, var2, param1);
              break L3;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -5 % ((-29 - param0) / 55);
        field_g = null;
        field_a = null;
    }

    final int a(int param0, byte param1, int param2, byte[] param3, byte[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        if (param5 == 0) {
          return 0;
        } else {
          L0: {
            if (param1 > 86) {
              break L0;
            } else {
              jk.a(-83, true);
              break L0;
            }
          }
          param5 = param5 + param2;
          var7 = 0;
          var8 = param0;
          L1: while (true) {
            L2: {
              var9 = param4[var8];
              if (0 <= var9) {
                var7++;
                break L2;
              } else {
                var7 = ((jk) this).field_f[var7];
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((jk) this).field_f[var7];
                if (((jk) this).field_f[var7] >= 0) {
                  break L4;
                } else {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param5 > param2) {
                    var7 = 0;
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if ((var9 & 64) != 0) {
                  var7 = ((jk) this).field_f[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((jk) this).field_f[var7];
                if (((jk) this).field_f[var7] < 0) {
                  param2++;
                  param3[param2] = (byte)var10;
                  if (param2 < param5) {
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
                if (-1 != (32 & var9)) {
                  var7 = ((jk) this).field_f[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((jk) this).field_f[var7];
                if (-1 >= (((jk) this).field_f[var7] ^ -1)) {
                  break L8;
                } else {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param5 <= param2) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L8;
                  }
                }
              }
              L9: {
                if ((16 & var9) == -1) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((jk) this).field_f[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((jk) this).field_f[var7];
                if (-1 > ((jk) this).field_f[var7]) {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param5 > param2) {
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
                if (0 != (8 & var9)) {
                  var7 = ((jk) this).field_f[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((jk) this).field_f[var7];
                if (((jk) this).field_f[var7] < 0) {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param5 > param2) {
                    var7 = 0;
                    break L12;
                  } else {
                    return var8 - (-1 - -param0);
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if ((4 & var9) == 0) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((jk) this).field_f[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((jk) this).field_f[var7];
                if (((jk) this).field_f[var7] < 0) {
                  param2++;
                  param3[param2] = (byte)var10;
                  if (param5 <= param2) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if (-1 == (2 & var9)) {
                  var7++;
                  break L15;
                } else {
                  var7 = ((jk) this).field_f[var7];
                  break L15;
                }
              }
              L16: {
                var10 = ((jk) this).field_f[var7];
                if (0 <= ((jk) this).field_f[var7]) {
                  break L16;
                } else {
                  param2++;
                  param3[param2] = (byte)var10;
                  if (param2 >= param5) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L16;
                  }
                }
              }
              L17: {
                if (-1 != (1 & var9)) {
                  var7 = ((jk) this).field_f[var7];
                  break L17;
                } else {
                  var7++;
                  break L17;
                }
              }
              var10 = ((jk) this).field_f[var7];
              if (((jk) this).field_f[var7] < 0) {
                param2++;
                param3[param2] = (byte)(var10 ^ -1);
                if (param5 <= param2) {
                  break L3;
                } else {
                  var7 = 0;
                  var8++;
                  continue L1;
                }
              } else {
                var8++;
                continue L1;
              }
            }
            return var8 - (-1 - -param0);
          }
        }
    }

    final int a(byte[] param0, byte[] param1, int param2, int param3, int param4, int param5) {
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
          var15 = client.field_A ? 1 : 0;
          if (param5 == 8) {
            break L0;
          } else {
            field_c = -58;
            break L0;
          }
        }
        var7 = 0;
        var8 = param3 << -1718073853;
        param2 = param2 + param4;
        L1: while (true) {
          if (param2 <= param4) {
            return -param3 + (var8 + 7 >> -1057081885);
          } else {
            var9 = 255 & param1[param4];
            var10 = ((jk) this).field_d[var9];
            var11 = ((jk) this).field_b[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            } else {
              var12 = var8 >> 1407045219;
              var13 = var8 & 7;
              var7 = var7 & -var13 >> -1061197921;
              var14 = var12 - -(var13 + (var11 + -1) >> 425602563);
              var13 += 24;
              var7 = de.b(var7, var10 >>> var13);
              param0[var12] = (byte)de.b(var7, var10 >>> var13);
              if (var14 > var12) {
                L2: {
                  var12++;
                  var13 -= 8;
                  var7 = var10 >>> var13;
                  param0[var12] = (byte)(var10 >>> var13);
                  if (var12 >= var14) {
                    break L2;
                  } else {
                    var13 -= 8;
                    var12++;
                    var7 = var10 >>> var13;
                    param0[var12] = (byte)(var10 >>> var13);
                    if (var12 < var14) {
                      var12++;
                      var13 -= 8;
                      var7 = var10 >>> var13;
                      param0[var12] = (byte)(var10 >>> var13);
                      if (var14 <= var12) {
                        break L2;
                      } else {
                        var12++;
                        var13 -= 8;
                        var7 = var10 << -var13;
                        param0[var12] = (byte)(var10 << -var13);
                        break L2;
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
              } else {
                var8 = var8 + var11;
                param4++;
                continue L1;
              }
            }
          }
        }
    }

    jk(byte[] param0) {
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
        ((jk) this).field_b = param0;
        ((jk) this).field_d = new int[var2];
        ((jk) this).field_f = new int[8];
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
                var7 = 1 << -var6 + 32;
                var8 = var19[var6];
                ((jk) this).field_d[var5] = var8;
                if ((var8 & var7) == 0) {
                  var9 = var8 | var7;
                  var10 = -1 + var6;
                  L2: while (true) {
                    if ((var10 ^ -1) > -2) {
                      break L1;
                    } else {
                      var11 = var19[var10];
                      if (var8 != var11) {
                        break L1;
                      } else {
                        var12 = 1 << 32 + -var10;
                        if ((var12 & var11) != 0) {
                          var3[var10] = var3[var10 - 1];
                          break L1;
                        } else {
                          var3[var10] = de.b(var11, var12);
                          var10--;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  var9 = var3[var6 - 1];
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
                      ((jk) this).field_f[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if (-1 == (var12 & var8 ^ -1)) {
                          var10++;
                          break L6;
                        } else {
                          L7: {
                            if (((jk) this).field_f[var10] != 0) {
                              break L7;
                            } else {
                              ((jk) this).field_f[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((jk) this).field_f[var10];
                          break L6;
                        }
                      }
                      var12 = var12 >>> 1;
                      if (((jk) this).field_f.length <= var10) {
                        var13 = new int[2 * ((jk) this).field_f.length];
                        var14 = 0;
                        L8: while (true) {
                          if (var14 >= ((jk) this).field_f.length) {
                            ((jk) this).field_f = var13;
                            var11++;
                            continue L4;
                          } else {
                            var13[var14] = ((jk) this).field_f[var14];
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Names can only contain letters, numbers, spaces and underscores";
    }
}
