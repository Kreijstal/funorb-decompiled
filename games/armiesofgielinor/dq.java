/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_j;
    static String field_d;
    static String field_f;
    static String field_g;
    private int[] field_h;
    static int field_c;
    private byte[] field_a;
    static wk[] field_i;
    static ru[] field_e;
    private int[] field_b;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 76 % ((param0 - 52) / 39);
          var3 = param1;
          var4 = param1;
          if (1 == var4) {
            var3 = 2;
            break L0;
          } else {
            if (var4 != 2) {
              if (var4 != 3) {
                if (var4 == 4) {
                  var3 = 3;
                  break L0;
                } else {
                  var3 = param1;
                  break L0;
                }
              } else {
                var3 = 4;
                break L0;
              }
            } else {
              var3 = 1;
              break L0;
            }
          }
        }
        return var3;
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != -1) {
            field_d = null;
        }
        field_i = null;
        field_d = null;
    }

    final static void a(int param0, int param1, String param2, boolean param3, byte param4, int param5) {
        if (param3) {
            no.field_P.field_y = qn.field_l;
            no.field_P.field_B = qn.field_d;
            no.field_P.field_v = qn.field_g;
            ku.field_J.b();
            qn.b();
            gq.b(bc.field_j[3][0], 0, 0, param1);
            fe.c(jc.a(param2, (byte) 42), uh.field_e[3][0] >> 1294412577, 20 + (uh.field_e[3][1] >> 1909519937), 2, true);
            no.field_P.b();
            ku.field_J.h(param0, param5);
        } else {
            gq.b(bc.field_j[3][0], param0, param5, param1);
            fe.c(jc.a(param2, (byte) 42), (uh.field_e[3][0] >> 1376585217) - -param0, 20 + (uh.field_e[3][1] >> -272940991) + param5, 2, true);
        }
        int var6 = 67 % ((param4 - 48) / 53);
    }

    final static int a(int param0, CharSequence param1) {
        if (param0 <= 7) {
            return -59;
        }
        return ob.a(10, true, param1, 0);
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        var7 = 0;
        var8 = param4 << 385110691;
        param2 = param2 + param0;
        if (param5 >= 24) {
          L0: while (true) {
            if (param0 >= param2) {
              return (var8 - -7 >> 1985910691) - param4;
            } else {
              var9 = param1[param0] & 255;
              var10 = ((dq) this).field_h[var9];
              var11 = ((dq) this).field_a[var9];
              if (0 == var11) {
                throw new RuntimeException("" + var9);
              } else {
                var12 = var8 >> -572783453;
                var13 = var8 & 7;
                var7 = var7 & -var13 >> -21459393;
                var14 = var12 + (var11 + (var13 + -1) >> -1380689533);
                var8 = var8 + var11;
                var13 += 24;
                var7 = oe.c(var7, var10 >>> var13);
                param3[var12] = (byte)oe.c(var7, var10 >>> var13);
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
                        param0++;
                        continue L0;
                      } else {
                        param0++;
                        continue L0;
                      }
                    } else {
                      param0++;
                      continue L0;
                    }
                  } else {
                    param0++;
                    continue L0;
                  }
                } else {
                  param0++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return -2;
        }
    }

    dq(byte[] param0) {
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
        ((dq) this).field_a = param0;
        ((dq) this).field_h = new int[var2];
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        ((dq) this).field_b = new int[8];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var2) {
          } else {
            var6 = param0[var5];
            if (-1 != (var6 ^ -1)) {
              L1: {
                var7 = 1 << -var6 + 32;
                var8 = var19[var6];
                ((dq) this).field_h[var5] = var8;
                if (-1 != (var8 & var7 ^ -1)) {
                  var9 = var3[var6 - 1];
                  break L1;
                } else {
                  var9 = var8 | var7;
                  var10 = var6 - 1;
                  L2: while (true) {
                    if ((var10 ^ -1) > -2) {
                      break L1;
                    } else {
                      var11 = var19[var10];
                      if (var8 != var11) {
                        break L1;
                      } else {
                        var12 = 1 << -var10 + 32;
                        if ((var11 & var12) == 0) {
                          var3[var10] = oe.c(var11, var12);
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
              var10 = 1 + var6;
              L3: while (true) {
                if (-33 > (var10 ^ -1)) {
                  var10 = 0;
                  var11 = 0;
                  L4: while (true) {
                    if (var11 >= var6) {
                      L5: {
                        if (var4 > var10) {
                          break L5;
                        } else {
                          var4 = 1 + var10;
                          break L5;
                        }
                      }
                      ((dq) this).field_b[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if (-1 != (var8 & var12 ^ -1)) {
                          L7: {
                            if (0 != ((dq) this).field_b[var10]) {
                              break L7;
                            } else {
                              ((dq) this).field_b[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((dq) this).field_b[var10];
                          break L6;
                        } else {
                          var10++;
                          break L6;
                        }
                      }
                      L8: {
                        if (var10 < ((dq) this).field_b.length) {
                          break L8;
                        } else {
                          var13 = new int[((dq) this).field_b.length * 2];
                          var14 = 0;
                          L9: while (true) {
                            if (var14 >= ((dq) this).field_b.length) {
                              ((dq) this).field_b = var13;
                              break L8;
                            } else {
                              var13[var14] = ((dq) this).field_b[var14];
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

    final int a(byte[] param0, int param1, boolean param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 != 0) {
          L0: {
            if (!param2) {
              break L0;
            } else {
              ((dq) this).field_a = null;
              break L0;
            }
          }
          param3 = param3 + param4;
          var7 = 0;
          var8 = param1;
          L1: while (true) {
            L2: {
              var9 = param0[var8];
              if (0 > var9) {
                var7 = ((dq) this).field_b[var7];
                break L2;
              } else {
                var7++;
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((dq) this).field_b[var7];
                if (-1 >= (((dq) this).field_b[var7] ^ -1)) {
                  break L4;
                } else {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param3 > param4) {
                    var7 = 0;
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if ((var9 & 64) != 0) {
                  var7 = ((dq) this).field_b[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((dq) this).field_b[var7];
                if (((dq) this).field_b[var7] >= 0) {
                  break L6;
                } else {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param4 < param3) {
                    var7 = 0;
                    break L6;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if ((32 & var9) == 0) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((dq) this).field_b[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((dq) this).field_b[var7];
                if (((dq) this).field_b[var7] >= 0) {
                  break L8;
                } else {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param3 > param4) {
                    var7 = 0;
                    break L8;
                  } else {
                    break L3;
                  }
                }
              }
              L9: {
                if ((var9 & 16) == 0) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((dq) this).field_b[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((dq) this).field_b[var7];
                if (((dq) this).field_b[var7] < 0) {
                  param4++;
                  param5[param4] = (byte)var10;
                  if (param3 > param4) {
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
                if (-1 != (8 & var9)) {
                  var7 = ((dq) this).field_b[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((dq) this).field_b[var7];
                if (((dq) this).field_b[var7] >= 0) {
                  break L12;
                } else {
                  param4++;
                  param5[param4] = (byte)var10;
                  if (param4 < param3) {
                    var7 = 0;
                    break L12;
                  } else {
                    return 1 + (var8 - param1);
                  }
                }
              }
              L13: {
                if (-1 == (var9 & 4)) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((dq) this).field_b[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((dq) this).field_b[var7];
                if (-1 < (((dq) this).field_b[var7] ^ -1)) {
                  param4++;
                  param5[param4] = (byte)var10;
                  if (param4 >= param3) {
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
                if (-1 != (2 & var9)) {
                  var7 = ((dq) this).field_b[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              L16: {
                var10 = ((dq) this).field_b[var7];
                if (0 > ((dq) this).field_b[var7]) {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param4 >= param3) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L16;
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
                  var7 = ((dq) this).field_b[var7];
                  break L17;
                }
              }
              var10 = ((dq) this).field_b[var7];
              if (-1 < (((dq) this).field_b[var7] ^ -1)) {
                param4++;
                param5[param4] = (byte)(var10 ^ -1);
                if (param4 >= param3) {
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
            return 1 + (var8 - param1);
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_d = "Useful items to carry with you. Each unit can only hold one accessory at a time. Equipping a unit with a new accessory will cause whatever accessory that unit is currently holding to be discarded.";
        field_f = "Breaking real-world laws";
        field_j = "Ranged weapons will improve the effectiveness of ranged attacks.";
        field_g = "Click to Scroll";
    }
}
