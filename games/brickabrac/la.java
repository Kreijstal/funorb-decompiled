/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static lo field_a;
    static mh field_b;
    static boolean field_c;

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
                  var21 = on.field_L[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= lb.field_c - 1) {
                    break L2;
                  } else {
                    var22 = lb.field_c - 1;
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
                  var24 = lb.field_l[var23 * lb.field_c + var22];
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
                lb.field_l[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
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
                    var21 = on.field_L[var20] * param10 >> 15;
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
                    var24 = lb.field_l[var23 * lb.field_c + var22];
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
                  lb.field_l[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
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
                  var21 = on.field_L[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= lb.field_c - 1) {
                    break L2;
                  } else {
                    var22 = lb.field_c - 1;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 <= lb.field_d - 1) {
                    break L3;
                  } else {
                    var23 = lb.field_d - 1;
                    break L3;
                  }
                }
                var24 = lb.field_l[var23 * lb.field_c + var22];
                var25 = 64;
                if (var25 >= 0) {
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  var15++;
                  lb.field_l[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
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
                    var21 = on.field_L[var20] * param10 >> 15;
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
                    if (var23 <= lb.field_d - 1) {
                      break L7;
                    } else {
                      var23 = lb.field_d - 1;
                      break L7;
                    }
                  }
                  L8: {
                    var24 = lb.field_l[var23 * lb.field_c + var22];
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
                  lb.field_l[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
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

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11) {
        param6 = -param8;
        L0: while (true) {
          if (param6 >= 0) {
            return;
          } else {
            param5 = -param7;
            L1: while (true) {
              if (param5 >= 0) {
                param4 = param4 + param9;
                param3 = param3 + param10;
                param6++;
                continue L0;
              } else {
                param3++;
                param2 = param1[param3];
                if (param2 == 0) {
                  param4++;
                  param5++;
                  continue L1;
                } else {
                  if (param2 >> 8 != (param2 & 65535)) {
                    param4++;
                    param0[param4] = param2;
                    param5++;
                    continue L1;
                  } else {
                    param2 = param2 & 255;
                    param4++;
                    param0[param4] = param11[param2];
                    param5++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        param7--;
        L0: while (true) {
          if (param7 < 0) {
            return;
          } else {
            var9 = param6 - 1;
            L1: while (true) {
              if (var9 < 0) {
                param1 = param1 + param8;
                param7--;
                continue L0;
              } else {
                if (param0[param1] > 1) {
                  L2: {
                    param2 = param1 - 1;
                    param3 = param1 + 1;
                    param4 = param1 - lb.field_c;
                    param5 = param1 + lb.field_c;
                    if (param0[param4 + 1] != 0) {
                      break L2;
                    } else {
                      param0[param4 + 1] = 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (param0[param5 + 1] != 0) {
                      break L3;
                    } else {
                      param0[param5 + 1] = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (param0[param4 - 1] != 0) {
                      break L4;
                    } else {
                      param0[param4 - 1] = 1;
                      break L4;
                    }
                  }
                  L5: {
                    if (param0[param5 - 1] != 0) {
                      break L5;
                    } else {
                      param0[param5 - 1] = 1;
                      break L5;
                    }
                  }
                  L6: {
                    if (param0[param2] != 0) {
                      break L6;
                    } else {
                      param0[param2] = 1;
                      break L6;
                    }
                  }
                  L7: {
                    if (param0[param3] != 0) {
                      break L7;
                    } else {
                      param0[param3] = 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (param0[param4] != 0) {
                      break L8;
                    } else {
                      param0[param4] = 1;
                      break L8;
                    }
                  }
                  L9: {
                    if (param0[param5] != 0) {
                      break L9;
                    } else {
                      param0[param5] = 1;
                      break L9;
                    }
                  }
                  L10: {
                    if (param0[param2 - 1] != 0) {
                      break L10;
                    } else {
                      param0[param2 - 1] = 1;
                      break L10;
                    }
                  }
                  L11: {
                    if (param0[param3 + 1] != 0) {
                      break L11;
                    } else {
                      param0[param3 + 1] = 1;
                      break L11;
                    }
                  }
                  L12: {
                    if (param0[param4 - lb.field_c] != 0) {
                      break L12;
                    } else {
                      param0[param4 - lb.field_c] = 1;
                      break L12;
                    }
                  }
                  if (param0[param5 + lb.field_c] == 0) {
                    param0[param5 + lb.field_c] = 1;
                    param1++;
                    var9--;
                    continue L1;
                  } else {
                    param1++;
                    var9--;
                    continue L1;
                  }
                } else {
                  param1++;
                  var9--;
                  continue L1;
                }
              }
            }
          }
        }
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
          if (var7 <= lb.field_c) {
            break L1;
          } else {
            var7 = lb.field_c;
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
          if (var10 <= lb.field_d) {
            break L3;
          } else {
            var10 = lb.field_d;
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
          if (var6 <= lb.field_c) {
            break L5;
          } else {
            var6 = lb.field_c;
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
          if (var9 <= lb.field_d) {
            break L7;
          } else {
            var9 = lb.field_d;
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
            var25 = var9 * lb.field_c + var6;
            var26 = var11 + var17;
            var27 = var20;
            var28 = var9;
            L9: while (true) {
              if (var28 >= var10) {
                var25 = var9 * lb.field_c + var6;
                var26 = var11 + var17;
                var27 = var20;
                var28 = var9 - 1;
                L10: while (true) {
                  if (var28 < var8) {
                    return;
                  } else {
                    var27 = var27 - var22;
                    var26 = var26 - var27;
                    var25 = var25 - lb.field_c;
                    la.b(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
                    var28--;
                    continue L10;
                  }
                }
              } else {
                la.a(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
                var26 = var26 + var27;
                var27 = var27 + var22;
                var25 = var25 + lb.field_c;
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

    final static void a(jp param0, int param1, int param2, int[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param1 = param1 + param0.field_E;
          param2 = param2 + param0.field_F;
          var4 = param1 + param2 * lb.field_c;
          var5 = 0;
          var6 = param0.field_C;
          var7 = param0.field_D;
          var8 = lb.field_c - var7;
          var9 = 0;
          if (param2 >= lb.field_b) {
            break L0;
          } else {
            var10 = lb.field_b - param2;
            var6 = var6 - var10;
            param2 = lb.field_b;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * lb.field_c;
            break L0;
          }
        }
        L1: {
          if (param2 + var6 <= lb.field_j) {
            break L1;
          } else {
            var6 = var6 - (param2 + var6 - lb.field_j);
            break L1;
          }
        }
        L2: {
          if (param1 >= lb.field_i) {
            break L2;
          } else {
            var10 = lb.field_i - param1;
            var7 = var7 - var10;
            param1 = lb.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param1 + var7 <= lb.field_f) {
            break L3;
          } else {
            var10 = param1 + var7 - lb.field_f;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              la.a(lb.field_l, param0.field_G, 0, var5, var4, 0, 0, var7, var6, var8, var9, param3);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -59) {
            Object var2 = null;
            la.a(4, 89, -93, -46, -111, (int[]) null, 101);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        L0: {
          var7 = 0;
          var8 = 65536 / param3;
          var9 = 255 - param6;
          if (param0 >= lb.field_i) {
            break L0;
          } else {
            param2 = param2 - (lb.field_i - param0);
            param0 = lb.field_i;
            break L0;
          }
        }
        L1: {
          if (param1 >= lb.field_b) {
            break L1;
          } else {
            var7 = var7 + (lb.field_b - param1) * var8;
            param3 = param3 - (lb.field_b - param1);
            param1 = lb.field_b;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= lb.field_f) {
            break L2;
          } else {
            param2 = lb.field_f - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= lb.field_j) {
            break L3;
          } else {
            param3 = lb.field_j - param1;
            break L3;
          }
        }
        var10 = lb.field_c - param2;
        var11 = param0 + param1 * lb.field_c;
        var12 = -param3;
        L4: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = 65536 - var7 >> 8;
            var14 = var7 >> 8;
            var15 = ((param4 & 16711935) * var13 + (param5 & 16711935) * var14 & -16711936) >>> 8;
            var16 = ((param4 & 65280) * var13 + (param5 & 65280) * var14 & 16711680) >> 8;
            var17 = -param2;
            L5: while (true) {
              if (var17 >= 0) {
                var11 = var11 + var10;
                var7 = var7 + var8;
                var12++;
                continue L4;
              } else {
                var18 = lb.field_l[var11];
                var11++;
                lb.field_l[var11] = (var15 * param6 + (var18 & 16711935) * var9 & -16711936) + (var16 * param6 + (var18 & 65280) * var9 & 16711680) >>> 8;
                var17++;
                continue L5;
              }
            }
          }
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 117) {
            return true;
        }
        return ka.field_l == jm.field_f ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        pa.field_i[0] = param0;
        pa.field_i[1] = param1;
        pa.field_i[2] = param3;
        int var7 = 0;
        int var8 = 3;
        int var9 = 1;
        int var10 = 254;
        int var11 = param2;
        param6 = 273 * param6 + 36;
        lb.a(param0, param1, 2 * param2, 254, param5);
        for (var12 = 0; var12 < param3; var12++) {
            lb.a(param0, param1, var12 * param2, 254 / (1 + var12), param5);
            lb.a(param0, param1, var12 * param2, 196 / (1 + var12), param5);
            var13 = 0;
            for (var14 = 0; var14 < var9; var14++) {
                var7 = var7 % pa.field_i.length;
                var7++;
                var15 = pa.field_i[var7];
                var7++;
                var16 = pa.field_i[var7];
                var7++;
                var17 = pa.field_i[var7];
                var13 = var13 + var17;
                lb.a(var15, var16, var11, var10, param5);
                lb.a(var15, var16, var11 >> 1, var10 >> 1, param5);
                for (var18 = 0; var18 < var17; var18++) {
                    var8 = var8 % pa.field_i.length;
                    param6 = param6 % mh.field_F.length;
                    var8++;
                    param6++;
                    pa.field_i[var8] = var15 + (var11 * sa.a(mh.field_F[param6], -4097) >> 16);
                    var8++;
                    param6++;
                    pa.field_i[var8] = var16 + (var11 * BrickABrac.c(2048, mh.field_F[param6]) >> 16);
                    var8++;
                    param6++;
                    pa.field_i[var8] = 1 + er.a(-1560508993, param4, mh.field_F[param6]);
                }
            }
            var9 = var13;
            var11 = var11 / 2;
            var10 = 60 + 126 * var11 / param2;
        }
    }

    final static int a(int param0, int param1, int param2) {
        param0 = param0 / 60;
        int var3 = (param0 >> 8) % 6;
        param0 = param0 & 255;
        int var4 = 256;
        int var5 = 255 * (param2 * (var4 - param1)) >> 8 >> 8;
        int var6 = 255 * (param2 * (var4 - (param0 * param1 >> 8)) >> 8) >> 8;
        int var7 = 255 * (param2 * (var4 - ((var4 - param0) * param1 >> 8)) >> 8) >> 8;
        var4 = var3 & 1;
        var3 = var3 >> 1;
        return (var5 << (2 - (2 + var3) % 3 << 3)) + (param2 << (2 - (var3 + var4) % 3 << 3)) + (var7 + (-var4 >> 31 & var6 - var7) << (2 - (4 + var3 - var4) % 3 << 3));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new lo();
    }
}
