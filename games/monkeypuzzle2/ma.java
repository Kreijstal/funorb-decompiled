/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static int[] field_c;
    static kg field_b;
    static ib field_d;
    static String[] field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
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
          L2: {
            if (param1 >= param2) {
              break L2;
            } else {
              L3: {
                if (param2 < param6) {
                  break L3;
                } else {
                  L4: {
                    if (param6 > param1) {
                      break L4;
                    } else {
                      ca.a(param7, param5, param6, param0, param3, param1, ge.field_i, param4 + -18431, param2);
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ca.a(param7, param0, param1, param5, param3, param6, ge.field_i, -18427, param2);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              ca.a(param7, param3, param1, param5, param0, param2, ge.field_i, -18427, param6);
              if (var9 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L5: {
            if (param6 > param1) {
              break L5;
            } else {
              L6: {
                if (param2 < param6) {
                  break L6;
                } else {
                  ca.a(param7, param3, param6, param0, param5, param2, ge.field_i, param4 ^ -18431, param1);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              ca.a(param7, param0, param2, param3, param5, param6, ge.field_i, param4 + -18431, param1);
              if (var9 == 0) {
                break L1;
              } else {
                break L5;
              }
            }
          }
          ca.a(param7, param5, param2, param3, param0, param1, ge.field_i, -18427, param6);
          break L1;
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        le var10 = null;
        CharSequence var11 = null;
        String[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var11 = (CharSequence) ((Object) param2);
                        var3_int = wg.a(false, var11, param1);
                        if (param0 >= 120) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var10 = (le) null;
                        ma.a((le) null, -54, 47, -57, 64, -26);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = new String[1 + var3_int];
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 >= var3_int) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var9 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = var6;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param2.charAt(var8) == param1) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8++;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$1] = param2.substring(var6, var8);
                        var6 = var8 - -1;
                        var7++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4[var3_int] = param2.substring(var6);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = (String[]) (var4);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var3);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("ma.E(").append(param0).append(',').append(param1).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param2 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
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
                incrementValue$1 = var15;
                var15++;
                ge.field_i[incrementValue$1] = (var24 | var26 - (var26 >>> 8)) >>> 6;
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
            le var5 = (le) null;
            ma.a((le) null, 33, -88, 56, 51, -105);
        }
        if (param3) {
            var4++;
        }
        return qh.field_c[var4];
    }

    final static le a(ad param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        le stackIn_2_0 = null;
        le stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 16711680) {
              var4_int = param0.c(param3, (byte) -105);
              var5 = param0.a(param1, var4_int, -28459);
              stackIn_4_0 = kj.a(var5, param0, 17196, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (le) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ma.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var28 = 0;
        int var4 = param2 * param2;
        int var5 = param0 - param2 >> 4;
        int var6 = param0 + 15 >> 4;
        int var7 = param0 + param2 + 15 >> 4;
        int var8 = param1 - param2 >> 4;
        int var9 = param1 + 15 >> 4;
        int var10 = param1 + param2 + 15 >> 4;
        if (var5 < 0) {
            var5 = 0;
        }
        if (var7 > pc.field_R) {
            var7 = pc.field_R;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        if (var10 > ge.field_g) {
            var10 = ge.field_g;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var6 > pc.field_R) {
            var6 = pc.field_R;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        if (var9 > ge.field_g) {
            var9 = ge.field_g;
        }
        int var11 = (var6 << 4) - param0;
        var11 = var11 * var11;
        int var12 = (var6 + 1 << 4) - param0;
        var12 = var12 * var12;
        int var13 = (var6 + 2 << 4) - param0;
        var13 = var13 * var13;
        int var14 = var12 - var11;
        int var15 = var13 - var12;
        int var16 = var15 - var14;
        int var17 = (var9 << 4) - param1;
        var17 = var17 * var17;
        int var18 = (var9 + 1 << 4) - param1;
        var18 = var18 * var18;
        int var19 = (var9 + 2 << 4) - param1;
        var19 = var19 * var19;
        int var20 = var18 - var17;
        int var21 = var19 - var18;
        int var22 = var21 - var20;
        int var23 = 16;
        int var24 = var4;
        while (var4 > 2147483647 >>> var23) {
            var23--;
            var24 = var24 + 1 >>> 1;
        }
        int var25 = var9 * pc.field_R + var6;
        int var26 = var11 + var17;
        int var27 = var20;
        for (var28 = var9; var28 < var10; var28++) {
            ma.b(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
            var26 = var26 + var27;
            var27 = var27 + var22;
            var25 = var25 + pc.field_R;
        }
        var25 = var9 * pc.field_R + var6;
        var26 = var11 + var17;
        var27 = var20;
        for (var28 = var9 - 1; var28 >= var8; var28--) {
            var27 = var27 - var22;
            var26 = var26 - var27;
            var25 = var25 - pc.field_R;
            ma.a(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
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
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
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
                  incrementValue$1 = var15;
                  var15++;
                  ge.field_i[incrementValue$1] = (var24 | var26 - (var26 >>> 8)) >>> 6;
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
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
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
        field_c = new int[12];
        field_b = new kg();
        field_d = new ib();
    }
}
