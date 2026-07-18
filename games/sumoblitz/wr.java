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
            ((wr) this).field_C = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "wr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private wr(String param0, mh param1, qm param2) {
        super(param0, param1, param2);
        try {
            ((wr) this).field_w = ks.field_x.field_i;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "wr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 588;
              var3 = 428;
              var4 = param1.field_C >> 8;
              var5 = param1.field_z >> 8;
              var6 = param1.field_m >> 8;
              var7 = 0;
              var8 = 0;
              var9 = 0;
              var10 = ro.a(var4, var2_int, 26, 614, var5, false, 26, var6, 26);
              if (var10 == -1) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (-1.5707963267948966 >= param1.field_s) {
                      break L3;
                    } else {
                      if (param1.field_s >= 1.5707963267948966) {
                        break L3;
                      } else {
                        stackOut_4_0 = 1;
                        stackIn_6_0 = stackOut_4_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L2;
                }
                var7 = stackIn_6_0;
                var9 = 26;
                var8 = var10;
                break L1;
              }
            }
            L4: {
              if (var10 == -1) {
                var10 = ro.a(var4, var2_int, 454, 614, var5, false, 454, var6, 26);
                if (-1 != var10) {
                  L5: {
                    L6: {
                      var8 = var10;
                      var9 = 454;
                      if (-1.5707963267948966 > param1.field_s) {
                        break L6;
                      } else {
                        if (param1.field_s <= 1.5707963267948966) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L5;
                  }
                  var7 = stackIn_16_0;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (var10 != -1) {
                break L7;
              } else {
                var10 = ro.a(var4, var3, 26, 26, var5, false, 454, var6, 26);
                if (var10 != -1) {
                  L8: {
                    if (param1.field_s <= 0.0) {
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      break L8;
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      break L8;
                    }
                  }
                  var7 = stackIn_23_0;
                  var8 = 26;
                  var9 = var10;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (-1 != var10) {
                break L9;
              } else {
                var10 = ro.a(var4, var3, 26, 614, var5, false, 454, var6, 614);
                if (var10 == -1) {
                  break L9;
                } else {
                  L10: {
                    var9 = var10;
                    var8 = 614;
                    if (param1.field_s >= 0.0) {
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      break L10;
                    } else {
                      stackOut_27_0 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_29_0;
                  break L9;
                }
              }
            }
            L11: {
              L12: {
                var11 = var4 - var8;
                var12 = -var9 + var5;
                var13 = Math.sqrt((double)(var11 * var11 - -(var12 * var12)));
                if (param1.a(true)) {
                  break L12;
                } else {
                  if (var7 == 0) {
                    ro.a(param1, (byte) 113);
                    break L11;
                  } else {
                    if (param1.field_p == 0) {
                      ro.a(param1, (byte) 113);
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              L13: {
                L14: {
                  if (var4 > 26) {
                    break L14;
                  } else {
                    if (0 > param1.field_E) {
                      param1.field_E = -param1.field_E;
                      if (param1.field_E == 0) {
                        param1.field_E = 256;
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                if (~(rj.field_c + -52) <= ~var4) {
                  break L13;
                } else {
                  if (param1.field_E > 0) {
                    param1.field_E = -param1.field_E;
                    if (param1.field_E != 0) {
                      break L13;
                    } else {
                      param1.field_E = -256;
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
              }
              L15: {
                if (var5 > 26) {
                  break L15;
                } else {
                  if (param1.field_A >= 0) {
                    break L15;
                  } else {
                    param1.field_A = -param1.field_A;
                    if (param1.field_A == 0) {
                      param1.field_A = 256;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              L16: {
                if (-52 + rl.field_k >= var5) {
                  break L16;
                } else {
                  if (param1.field_A > 0) {
                    param1.field_A = -param1.field_A;
                    if (0 != param1.field_A) {
                      break L16;
                    } else {
                      param1.field_A = 256;
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              break L11;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var2;
            stackOut_58_1 = new StringBuilder().append("wr.D(").append(-1).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L17;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L17;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ')');
        }
    }

    public static void a(int param0) {
        field_G = null;
        field_E = null;
    }

    private wr(String param0, qm param1) {
        this(param0, ks.field_x.field_h, param1);
        try {
            ((wr) this).field_w = ks.field_x.field_i;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "wr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              vr.a((java.awt.Component) (Object) param1, -1);
              pl.a((java.awt.Component) (Object) param1, 7);
              if (as.field_w != null) {
                as.field_w.a((java.awt.Component) (Object) param1, (byte) 76);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("wr.C(").append(true).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        ((wr) this).field_C = !((wr) this).field_C ? true : false;
        super.b(param0, param1, param2, param3);
    }

    final static wc a(boolean param0, fs param1, boolean param2) {
        RuntimeException var3 = null;
        ah[] var3_array = null;
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
        int stackIn_8_0 = 0;
        wc stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        wc stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new ah[100];
              var3_array = var17;
              var4 = 1;
              var5 = param1.e(-31302);
              var6 = 0;
              if (var5 <= 1) {
                break L1;
              } else {
                var6 = param1.e(-31302);
                break L1;
              }
            }
            L2: {
              var7 = 0;
              if (var5 > 3) {
                L3: {
                  if (param1.e(-31302) == 1) {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                var7 = stackIn_8_0;
                break L2;
              } else {
                break L2;
              }
            }
            var8 = param1.e(-31302);
            var9 = 0;
            L4: while (true) {
              if (var9 >= var8) {
                stackOut_21_0 = new wc(var17, var6, var7 != 0);
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L5: {
                  var10 = param1.e(-31302);
                  var11 = param1.e(-31302);
                  var12 = param1.c(true);
                  var13 = param1.c(true);
                  byte discarded$2 = param1.d(true);
                  var14 = 0;
                  if (var5 > 4) {
                    var14 = param1.e(-31302);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var10 < 0) {
                    break L6;
                  } else {
                    if (var10 >= 8) {
                      break L6;
                    } else {
                      if (var11 < 0) {
                        break L6;
                      } else {
                        if (var11 < 7) {
                          var15 = uj.a(var10, var12, var11, (byte) 84, var13);
                          var15.field_F = var14;
                          int incrementValue$3 = var4;
                          var4++;
                          var3_array[incrementValue$3] = var15;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                var9++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("wr.F(").append(true).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + false + ')');
        }
        return stackIn_22_0;
    }

    final static vk a(fr param0, int param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        vk stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var4_int = jaggl.OpenGL.glGenProgramARB();
            jaggl.OpenGL.glBindProgramARB(34336, var4_int);
            jaggl.OpenGL.glProgramStringARB(34336, 34933, param2);
            jaggl.OpenGL.glGetIntegerv(34379, mb.field_h, 0);
            if (mb.field_h[0] == -1) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              stackOut_5_0 = new vk(param0, 34336, var4_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (vk) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("wr.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(34336).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + -24674 + ')');
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new jn();
    }
}
