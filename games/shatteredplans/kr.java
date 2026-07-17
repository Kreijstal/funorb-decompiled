/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr extends Exception {
    static boolean field_b;
    static bi field_d;
    static int[] field_e;
    static String field_c;
    static v field_a;
    static String[] field_f;

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0, ln param1) {
        RuntimeException var2 = null;
        mg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pf var11 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.field_T.g(112)) {
              return;
            } else {
              var11 = new pf();
              param1.field_T.a((byte) -90, var11);
              var4 = 65 / ((param0 - -1) / 60);
              param1.field_T.a((byte) -113, var11.h(88));
              var3 = (mg) (Object) var11.d(0);
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  var5 = -var3.field_y.field_A + var3.field_B.field_A;
                  var6 = -var3.field_y.field_S + var3.field_B.field_S;
                  var7 = (mg) (Object) param1.field_T.d(0);
                  L2: while (true) {
                    L3: {
                      if (var7 == null) {
                        break L3;
                      } else {
                        var8 = -var7.field_y.field_A + var7.field_B.field_A;
                        var9 = var7.field_B.field_S - var7.field_y.field_S;
                        if (ul.a(var8, var9, 0, var5, var6)) {
                          wp.a((byte) -125, (oh) (Object) var3, (oh) (Object) var7);
                          break L3;
                        } else {
                          var7 = (mg) (Object) param1.field_T.a((byte) -71);
                          continue L2;
                        }
                      }
                    }
                    L4: {
                      if (var7 != null) {
                        break L4;
                      } else {
                        param1.field_T.a((byte) -113, (oh) (Object) var3);
                        break L4;
                      }
                    }
                    var3 = (mg) (Object) var11.a((byte) -71);
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("kr.A(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        L0: {
          var6 = 0;
          var7 = 0;
          var8 = gf.field_i << 4;
          var9 = gf.field_l << 4;
          if (param3 > param2) {
            var10_int = param3;
            param3 = param2;
            param2 = var10_int;
            var10_int = param1;
            param1 = param5;
            param5 = var10_int;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 < var8) {
            break L1;
          } else {
            if (param3 <= var9) {
              L2: {
                if (param0 >= 24) {
                  break L2;
                } else {
                  field_c = null;
                  break L2;
                }
              }
              L3: {
                var10 = (long)(-param3 + param2);
                if (param2 > var9) {
                  var7 = (int)((long)(param2 - var9) * 65536L / var10);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var12 = (long)(param5 + -param1);
                if (param3 >= var8) {
                  break L4;
                } else {
                  var6 = (int)((long)(-param3 + var8) * 65536L / var10);
                  break L4;
                }
              }
              L5: {
                var9 = gf.field_f << 4;
                param5 = param5 - (int)((long)var7 * var12 >> 16);
                param2 = param2 - (int)(var10 * (long)var7 >> 16);
                param1 = param1 + (int)(var12 * (long)var6 >> 16);
                var8 = gf.field_a << 4;
                param3 = param3 + (int)(var10 * (long)var6 >> 16);
                if (param5 >= param1) {
                  break L5;
                } else {
                  var14 = param3;
                  param3 = param2;
                  param2 = var14;
                  var14 = param1;
                  param1 = param5;
                  param5 = var14;
                  break L5;
                }
              }
              L6: {
                if (param5 < var8) {
                  break L6;
                } else {
                  if (param1 <= var9) {
                    L7: {
                      var7 = 0;
                      var6 = 0;
                      var12 = (long)(param5 + -param1);
                      if (var9 >= param5) {
                        break L7;
                      } else {
                        var7 = (int)((long)(-var9 + param5) * 65536L / (long)(param5 + -param1));
                        break L7;
                      }
                    }
                    L8: {
                      if (param1 >= var8) {
                        break L8;
                      } else {
                        var6 = (int)(65536L * (long)(-param1 + var8) / (long)(param5 - param1));
                        break L8;
                      }
                    }
                    var10 = (long)(-param3 + param2);
                    param5 = param5 - (int)(var12 * (long)var7 >> 16);
                    param2 = param2 - (int)(var10 * (long)var7 >> 16);
                    param3 = param3 + (int)((long)var6 * var10 >> 16);
                    param1 = param1 + (int)(var12 * (long)var6 >> 16);
                    ar.a(param2, param3, param5, (byte) -1, param1, param4);
                    return;
                  } else {
                    break L6;
                  }
                }
              }
              return;
            } else {
              break L1;
            }
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
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
        L0: {
          var24 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param3 >= param2) {
            break L0;
          } else {
            var6_int = param3;
            param3 = param2;
            param2 = var6_int;
            var6_int = param0;
            param0 = param5;
            param5 = var6_int;
            break L0;
          }
        }
        var6_int = -param2 + param3;
        var7 = -param5 + param0;
        if (var6_int != 0) {
          L1: {
            var8 = (var7 << 12) / var6_int;
            var9 = param2 - -7 >> 4;
            var10 = var8 * (-param2 + (var9 << 4)) + (param5 << 12);
            var11 = 16 + -(15 & param2 + 7);
            var12 = var9;
            var13 = var10 >> 16;
            var15 = var12;
            var16 = var13;
            var17 = param4;
            var18 = (16 + -((var10 & 62246) >> 12)) * var11;
            if (gf.field_i <= var15) {
              if (var15 < gf.field_l) {
                if (gf.field_a > var16) {
                  break L1;
                } else {
                  if (var16 >= gf.field_f) {
                    break L1;
                  } else {
                    var18 = (int)(Math.pow((double)var18 / 256.0, 0.55) * 256.0);
                    var19 = var17 & 65280;
                    var17 = var17 & 16711935;
                    var19 = var19 * var18;
                    var17 = var17 * var18;
                    var19 = var19 & 16711680;
                    var17 = var17 & -16711936;
                    var20 = var15 + 640 * var16;
                    var21 = gf.field_h[var20];
                    var19 = var19 + ((var21 & 65280) * (256 + -var18) & 16711680);
                    var17 = var17 + (-16711936 & (var21 & 16711935) * (-var18 + 256));
                    gf.field_h[var20] = ee.a(var19, var17) >>> 8;
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          L2: {
            var14 = var8 + var10;
            var15 = var12;
            var16 = 1 + var13;
            var17 = param4;
            var18 = (15 & var10 >> 12) * var11;
            if (gf.field_i <= var15) {
              if (gf.field_l <= var15) {
                break L2;
              } else {
                if (gf.field_a <= var16) {
                  if (gf.field_f > var16) {
                    var18 = (int)(Math.pow((double)var18 / 256.0, 0.55) * 256.0);
                    var19 = var17 & 65280;
                    var19 = var19 * var18;
                    var17 = var17 & 16711935;
                    var17 = var17 * var18;
                    var19 = var19 & 16711680;
                    var17 = var17 & -16711936;
                    var20 = var15 + var16 * 640;
                    var21 = gf.field_h[var20];
                    var19 = var19 + ((var21 & 65280) * (-var18 + 256) & 16711680);
                    var17 = var17 + ((-var18 + 256) * (16711935 & var21) & -16711936);
                    gf.field_h[var20] = ee.a(var19, var17) >>> 8;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L3: {
            var9 = param3 - -7 >> 4;
            var10 = var8 * (-param3 + (var9 << 4)) + (param0 << 12);
            var11 = 16 + -(param3 + 7 & 15);
            var15 = var9;
            var16 = var10 >> 16;
            var17 = var15;
            var18 = var16;
            var19 = param4;
            var20 = (16 - (var10 >> 12 & 15)) * var11;
            if (gf.field_i > var17) {
              break L3;
            } else {
              if (gf.field_l <= var17) {
                break L3;
              } else {
                if (var18 < gf.field_a) {
                  break L3;
                } else {
                  if (gf.field_f <= var18) {
                    break L3;
                  } else {
                    var20 = (int)(Math.pow((double)var20 / 256.0, 0.55) * 256.0);
                    var21 = 65280 & var19;
                    var21 = var21 * var20;
                    var19 = var19 & 16711935;
                    var19 = var19 * var20;
                    var21 = var21 & 16711680;
                    var19 = var19 & -16711936;
                    var22 = var18 * 640 - -var17;
                    var23 = gf.field_h[var22];
                    var21 = var21 + ((65280 & var23) * (-var20 + 256) & 16711680);
                    var19 = var19 + ((256 - var20) * (var23 & 16711935) & -16711936);
                    gf.field_h[var22] = ee.a(var19, var21) >>> 8;
                    break L3;
                  }
                }
              }
            }
          }
          L4: {
            var17 = var15;
            var18 = 1 + var16;
            var19 = param4;
            var20 = var11 * (var10 >> 12 & 15);
            if (var17 >= gf.field_i) {
              if (gf.field_l > var17) {
                if (gf.field_a <= var18) {
                  if (var18 < gf.field_f) {
                    var20 = (int)(256.0 * Math.pow((double)var20 / 256.0, 0.55));
                    var21 = 65280 & var19;
                    var21 = var21 * var20;
                    var19 = var19 & 16711935;
                    var19 = var19 * var20;
                    var21 = var21 & 16711680;
                    var19 = var19 & -16711936;
                    var22 = 640 * var18 - -var17;
                    var23 = gf.field_h[var22];
                    var19 = var19 + ((var23 & 16711935) * (-var20 + 256) & -16711936);
                    var21 = var21 + ((65280 & var23) * (256 - var20) & 16711680);
                    gf.field_h[var22] = ee.a(var21, var19) >>> 8;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              break L4;
            }
          }
          L5: {
            if (param1 == -55) {
              break L5;
            } else {
              ik discarded$1 = kr.b((byte) 124);
              break L5;
            }
          }
          var8 = var8 << 4;
          var12++;
          L6: while (true) {
            if (var15 <= var12) {
              return;
            } else {
              L7: {
                var17 = var12;
                var18 = var14 >> 16;
                var19 = param4;
                var20 = 256 + -(var14 >> 8 & 255);
                if (gf.field_i <= var17) {
                  if (var17 < gf.field_l) {
                    if (var18 < gf.field_a) {
                      break L7;
                    } else {
                      if (gf.field_f > var18) {
                        var20 = (int)(Math.pow((double)var20 / 256.0, 0.55) * 256.0);
                        var21 = var19 & 65280;
                        var19 = var19 & 16711935;
                        var21 = var21 * var20;
                        var21 = var21 & 16711680;
                        var19 = var19 * var20;
                        var19 = var19 & -16711936;
                        var22 = var17 + 640 * var18;
                        var23 = gf.field_h[var22];
                        var19 = var19 + (-16711936 & (-var20 + 256) * (16711935 & var23));
                        var21 = var21 + (16711680 & (256 - var20) * (var23 & 65280));
                        gf.field_h[var22] = ee.a(var21, var19) >>> 8;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                var17 = var12;
                var18 = (var14 >> 16) - -1;
                var19 = param4;
                var20 = (var14 & 65489) >> 8;
                if (var17 < gf.field_i) {
                  break L8;
                } else {
                  if (gf.field_l > var17) {
                    if (var18 >= gf.field_a) {
                      if (gf.field_f > var18) {
                        var20 = (int)(256.0 * Math.pow((double)var20 / 256.0, 0.55));
                        var21 = 65280 & var19;
                        var21 = var21 * var20;
                        var19 = var19 & 16711935;
                        var21 = var21 & 16711680;
                        var19 = var19 * var20;
                        var19 = var19 & -16711936;
                        var22 = var18 * 640 - -var17;
                        var23 = gf.field_h[var22];
                        var21 = var21 + ((256 - var20) * (65280 & var23) & 16711680);
                        var19 = var19 + (-16711936 & (16711935 & var23) * (256 + -var20));
                        gf.field_h[var22] = ee.a(var19, var21) >>> 8;
                        break L8;
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
              }
              var14 = var14 + var8;
              var12++;
              continue L6;
            }
          }
        } else {
          L9: {
            if (16 <= var7) {
              L10: {
                var8 = param2 >> 4;
                var9 = param5 >> 4;
                var10 = param4;
                var11 = (-(param2 & 15) + 16) * (16 - (param5 & 15));
                if (gf.field_i <= var8) {
                  if (var8 < gf.field_l) {
                    if (var9 >= gf.field_a) {
                      if (var9 >= gf.field_f) {
                        break L10;
                      } else {
                        var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                        var12 = 65280 & var10;
                        var10 = var10 & 16711935;
                        var12 = var12 * var11;
                        var10 = var10 * var11;
                        var12 = var12 & 16711680;
                        var10 = var10 & -16711936;
                        var13 = var9 * 640 - -var8;
                        var14 = gf.field_h[var13];
                        var12 = var12 + ((-var11 + 256) * (65280 & var14) & 16711680);
                        var10 = var10 + (-16711936 & (var14 & 16711935) * (256 - var11));
                        gf.field_h[var13] = ee.a(var10, var12) >>> 8;
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                var8 = param2 >> 4;
                var9 = param0 >> 4;
                var10 = param4;
                var11 = (15 & param0) * (16 + -(15 & param2));
                if (gf.field_i > var8) {
                  break L11;
                } else {
                  if (gf.field_l <= var8) {
                    break L11;
                  } else {
                    if (gf.field_a > var9) {
                      break L11;
                    } else {
                      if (gf.field_f > var9) {
                        var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                        var12 = var10 & 65280;
                        var12 = var12 * var11;
                        var10 = var10 & 16711935;
                        var10 = var10 * var11;
                        var12 = var12 & 16711680;
                        var10 = var10 & -16711936;
                        var13 = var9 * 640 + var8;
                        var14 = gf.field_h[var13];
                        var12 = var12 + ((-var11 + 256) * (var14 & 65280) & 16711680);
                        var10 = var10 + (-16711936 & (-var11 + 256) * (var14 & 16711935));
                        gf.field_h[var13] = ee.a(var10, var12) >>> 8;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
              L12: {
                gf.e(param2 >> 4, 1 + (param5 >> 4), (var7 >> 4) - 2, param4, 256 - 16 * (15 & param2));
                var8 = (param2 >> 4) - -1;
                var9 = param5 >> 4;
                var10 = param4;
                var11 = (15 & param2) * (16 + -(param5 & 15));
                if (var8 >= gf.field_i) {
                  if (gf.field_l > var8) {
                    if (var9 < gf.field_a) {
                      break L12;
                    } else {
                      if (var9 < gf.field_f) {
                        var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                        var12 = var10 & 65280;
                        var10 = var10 & 16711935;
                        var12 = var12 * var11;
                        var10 = var10 * var11;
                        var12 = var12 & 16711680;
                        var10 = var10 & -16711936;
                        var13 = var9 * 640 - -var8;
                        var14 = gf.field_h[var13];
                        var12 = var12 + ((65280 & var14) * (256 - var11) & 16711680);
                        var10 = var10 + ((16711935 & var14) * (-var11 + 256) & -16711936);
                        gf.field_h[var13] = ee.a(var10, var12) >>> 8;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                var8 = (param2 >> 4) - -1;
                var9 = param0 >> 4;
                var10 = param4;
                var11 = (15 & param2) * (15 & param0);
                if (gf.field_i > var8) {
                  break L13;
                } else {
                  if (var8 < gf.field_l) {
                    if (gf.field_a > var9) {
                      break L13;
                    } else {
                      if (gf.field_f <= var9) {
                        break L13;
                      } else {
                        var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                        var12 = var10 & 65280;
                        var12 = var12 * var11;
                        var10 = var10 & 16711935;
                        var12 = var12 & 16711680;
                        var10 = var10 * var11;
                        var10 = var10 & -16711936;
                        var13 = var9 * 640 + var8;
                        var14 = gf.field_h[var13];
                        var10 = var10 + ((var14 & 16711935) * (-var11 + 256) & -16711936);
                        var12 = var12 + (16711680 & (var14 & 65280) * (256 - var11));
                        gf.field_h[var13] = ee.a(var12, var10) >>> 8;
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              gf.e(1 + (param2 >> 4), 1 + (param5 >> 4), -2 + (var7 >> 4), param4, (15 & param2) * 16);
              break L9;
            } else {
              L14: {
                var8 = param2 >> 4;
                var9 = param5 >> 4;
                var10 = param4;
                var11 = (16 + -(15 & param2)) * var7;
                if (gf.field_i > var8) {
                  break L14;
                } else {
                  if (gf.field_l <= var8) {
                    break L14;
                  } else {
                    if (var9 >= gf.field_a) {
                      if (var9 >= gf.field_f) {
                        break L14;
                      } else {
                        var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                        var12 = var10 & 65280;
                        var10 = var10 & 16711935;
                        var12 = var12 * var11;
                        var12 = var12 & 16711680;
                        var10 = var10 * var11;
                        var10 = var10 & -16711936;
                        var13 = var8 + var9 * 640;
                        var14 = gf.field_h[var13];
                        var10 = var10 + (-16711936 & (var14 & 16711935) * (256 + -var11));
                        var12 = var12 + (16711680 & (-var11 + 256) * (65280 & var14));
                        gf.field_h[var13] = ee.a(var12, var10) >>> 8;
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
              }
              var8 = 1 + (param2 >> 4);
              var9 = param5 >> 4;
              var10 = param4;
              var11 = (15 & param2) * var7;
              if (gf.field_i <= var8) {
                if (gf.field_l <= var8) {
                  break L9;
                } else {
                  if (gf.field_a > var9) {
                    break L9;
                  } else {
                    if (gf.field_f <= var9) {
                      break L9;
                    } else {
                      var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                      var12 = 65280 & var10;
                      var10 = var10 & 16711935;
                      var12 = var12 * var11;
                      var12 = var12 & 16711680;
                      var10 = var10 * var11;
                      var10 = var10 & -16711936;
                      var13 = var9 * 640 + var8;
                      var14 = gf.field_h[var13];
                      var12 = var12 + (16711680 & (-var11 + 256) * (var14 & 65280));
                      var10 = var10 + (-16711936 & (16711935 & var14) * (-var11 + 256));
                      gf.field_h[var13] = ee.a(var12, var10) >>> 8;
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
          }
          return;
        }
    }

    kr(String param0) {
        super(param0);
    }

    final static ik b(byte param0) {
        if (ed.field_c.g(69)) {
            return new ik();
        }
        if (param0 != -103) {
            ik discarded$0 = kr.b((byte) -5);
        }
        return (ik) (Object) ed.field_c.h(44);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_c = "Please enter your date of birth to enable chat:";
    }
}
