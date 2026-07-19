/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends wp {
    static jn field_E;
    static ci field_G;
    static int field_F;

    wr(String param0, qm param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_C = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private wr(String param0, mh param1, qm param2) {
        super(param0, param1, param2);
        try {
            this.field_w = ks.field_x.field_i;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, ah param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 588;
              var3 = 428;
              var4 = param1.field_C >> 1751684968;
              var5 = param1.field_z >> 2129928360;
              var6 = param1.field_m >> 1746227656;
              var7 = 0;
              var8 = 0;
              var9 = 0;
              var10 = ro.a(var4, var2_int, 26, 614, var5, false, 26, var6, 26);
              if (var10 == -1) {
                break L1;
              } else {
                L2: {
                  if (-1.5707963267948966 < param1.field_s) {
                    if (param1.field_s < 1.5707963267948966) {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_8_0 = stackOut_5_0;
                      break L2;
                    }
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_8_0 = stackOut_3_0;
                    break L2;
                  }
                }
                var7 = stackIn_8_0;
                var9 = 26;
                var8 = var10;
                break L1;
              }
            }
            L3: {
              if (0 == (var10 ^ -1)) {
                var10 = ro.a(var4, var2_int, 454, 614, var5, false, 454, var6, 26);
                if (-1 != var10) {
                  L4: {
                    var8 = var10;
                    var9 = 454;
                    if (-1.5707963267948966 > param1.field_s) {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L4;
                    } else {
                      if (param1.field_s > 1.5707963267948966) {
                        stackOut_16_0 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_19_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                  }
                  var7 = stackIn_19_0;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (0 != (var10 ^ -1)) {
                break L5;
              } else {
                var10 = ro.a(var4, var3, 26, 26, var5, false, 454, var6, 26);
                if (0 != (var10 ^ -1)) {
                  L6: {
                    if (param1.field_s <= 0.0) {
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      break L6;
                    } else {
                      stackOut_24_0 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      break L6;
                    }
                  }
                  var7 = stackIn_26_0;
                  var8 = 26;
                  var9 = var10;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (param0 != var10) {
                break L7;
              } else {
                var10 = ro.a(var4, var3, 26, 614, var5, false, 454, var6, 614);
                if ((var10 ^ -1) == 0) {
                  break L7;
                } else {
                  L8: {
                    var9 = var10;
                    var8 = 614;
                    if (param1.field_s >= 0.0) {
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      break L8;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L8;
                    }
                  }
                  var7 = stackIn_32_0;
                  break L7;
                }
              }
            }
            L9: {
              var11 = var4 - var8;
              var12 = -var9 + var5;
              var13 = Math.sqrt((double)(var11 * var11 - -(var12 * var12)));
              if (param1.a(true)) {
                break L9;
              } else {
                if (var7 == 0) {
                  ro.a(param1, (byte) 113);
                  return;
                } else {
                  if (param1.field_p == 0) {
                    ro.a(param1, (byte) 113);
                    return;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L10: {
              L11: {
                L12: {
                  if ((var4 ^ -1) < -27) {
                    break L12;
                  } else {
                    if (0 > param1.field_E) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (rj.field_c + -52 >= var4) {
                  break L10;
                } else {
                  if ((param1.field_E ^ -1) < -1) {
                    param1.field_E = -param1.field_E;
                    if (param1.field_E != 0) {
                      break L10;
                    } else {
                      param1.field_E = -256;
                      if (var15 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
              param1.field_E = -param1.field_E;
              if (-1 == (param1.field_E ^ -1)) {
                param1.field_E = 256;
                break L10;
              } else {
                break L10;
              }
            }
            L13: {
              L14: {
                if (var5 > 26) {
                  break L14;
                } else {
                  if (param1.field_A >= 0) {
                    break L14;
                  } else {
                    param1.field_A = -param1.field_A;
                    if (-1 == (param1.field_A ^ -1)) {
                      param1.field_A = 256;
                      if (var15 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (-52 + rl.field_k >= var5) {
                break L13;
              } else {
                if ((param1.field_A ^ -1) < -1) {
                  param1.field_A = -param1.field_A;
                  if (0 != param1.field_A) {
                    break L13;
                  } else {
                    param1.field_A = 256;
                    if (var15 == 0) {
                      break L13;
                    } else {
                      ro.a(param1, (byte) 113);
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var2);
            stackOut_64_1 = new StringBuilder().append("wr.D(").append(param0).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L15;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L15;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ')');
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 454) {
            field_E = (jn) null;
            field_E = null;
            return;
        }
        field_E = null;
    }

    private wr(String param0, qm param1) {
        this(param0, ks.field_x.field_h, param1);
        try {
            this.field_w = ks.field_x.field_i;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              vr.a((java.awt.Component) ((Object) param1), -1);
              pl.a((java.awt.Component) ((Object) param1), 7);
              if (param0) {
                break L1;
              } else {
                field_F = -67;
                break L1;
              }
            }
            if (as.field_w != null) {
              as.field_w.a((java.awt.Component) ((Object) param1), (byte) 76);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("wr.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        this.field_C = !this.field_C ? true : false;
        super.b(param0, param1, param2, param3);
    }

    final static wc a(boolean param0, fs param1, boolean param2) {
        byte discarded$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var3 = null;
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
        ah var15 = null;
        int var16 = 0;
        ah[] var17 = null;
        ah[] var18 = null;
        int stackIn_11_0 = 0;
        fs stackIn_15_0 = null;
        fs stackIn_16_0 = null;
        fs stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        fs stackIn_18_0 = null;
        fs stackIn_19_0 = null;
        fs stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        wc stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        fs stackOut_14_0 = null;
        fs stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        fs stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        fs stackOut_17_0 = null;
        fs stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        fs stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        wc stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                param1.field_p = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var17 = new ah[100];
              var18 = var17;
              var4 = 1;
              var5 = param1.e(-31302);
              var6 = 0;
              if ((var5 ^ -1) >= -2) {
                break L2;
              } else {
                var6 = param1.e(-31302);
                break L2;
              }
            }
            L3: {
              var7 = param2 ? 1 : 0;
              if (var5 > 3) {
                L4: {
                  if (-2 == (param1.e(-31302) ^ -1)) {
                    stackOut_10_0 = 1;
                    stackIn_11_0 = stackOut_10_0;
                    break L4;
                  } else {
                    stackOut_9_0 = 0;
                    stackIn_11_0 = stackOut_9_0;
                    break L4;
                  }
                }
                var7 = stackIn_11_0;
                break L3;
              } else {
                break L3;
              }
            }
            var8 = param1.e(-31302);
            var9 = 0;
            L5: while (true) {
              L6: {
                if (var9 >= var8) {
                  break L6;
                } else {
                  L7: {
                    var10 = param1.e(-31302);
                    var11 = param1.e(-31302);
                    stackOut_14_0 = (fs) (param1);
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (param2) {
                      stackOut_16_0 = (fs) ((Object) stackIn_16_0);
                      stackOut_16_1 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L7;
                    } else {
                      stackOut_15_0 = (fs) ((Object) stackIn_15_0);
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L7;
                    }
                  }
                  L8: {
                    var12 = ((fs) (Object) stackIn_17_0).c(stackIn_17_1 != 0);
                    var13 = param1.c(true);
                    stackOut_17_0 = (fs) (param1);
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (param2) {
                      stackOut_19_0 = (fs) ((Object) stackIn_19_0);
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L8;
                    } else {
                      stackOut_18_0 = (fs) ((Object) stackIn_18_0);
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L8;
                    }
                  }
                  L9: {
                    discarded$2 = ((fs) (Object) stackIn_20_0).d(stackIn_20_1 != 0);
                    var14 = 0;
                    if (-5 > (var5 ^ -1)) {
                      var14 = param1.e(-31302);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-1 < (var10 ^ -1)) {
                      break L10;
                    } else {
                      if ((var10 ^ -1) <= -9) {
                        break L10;
                      } else {
                        if ((var11 ^ -1) > -1) {
                          break L10;
                        } else {
                          L11: {
                            if (var11 < 7) {
                              break L11;
                            } else {
                              if (var16 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var15 = uj.a(var10, var12, var11, (byte) 84, var13);
                          var15.field_F = var14;
                          incrementValue$3 = var4;
                          var4++;
                          var17[incrementValue$3] = var15;
                          break L10;
                        }
                      }
                    }
                  }
                  var9++;
                  if (var16 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              stackOut_31_0 = new wc(var18, var6, var7 != 0);
              stackIn_32_0 = stackOut_31_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var3);
            stackOut_33_1 = new StringBuilder().append("wr.F(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ')');
        }
        return stackIn_32_0;
    }

    final static vk a(fr param0, int param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        vk stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        vk stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param3 == -24674) {
              var4_int = jaggl.OpenGL.glGenProgramARB();
              jaggl.OpenGL.glBindProgramARB(param1, var4_int);
              jaggl.OpenGL.glProgramStringARB(param1, 34933, param2);
              jaggl.OpenGL.glGetIntegerv(34379, mb.field_h, 0);
              if ((mb.field_h[0] ^ -1) == 0) {
                jaggl.OpenGL.glBindProgramARB(param1, 0);
                stackOut_6_0 = new vk(param0, param1, var4_int);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                jaggl.OpenGL.glBindProgramARB(param1, 0);
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (vk) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("wr.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vk) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    static {
        field_E = new jn();
    }
}
