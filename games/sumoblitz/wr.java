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
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
                      stackIn_8_0 = 1;
                      break L2;
                    } else {
                      stackIn_8_0 = 0;
                      break L2;
                    }
                  } else {
                    stackIn_8_0 = 0;
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
                      stackIn_19_0 = 1;
                      break L4;
                    } else {
                      if (param1.field_s > 1.5707963267948966) {
                        stackIn_19_0 = 1;
                        break L4;
                      } else {
                        stackIn_19_0 = 0;
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
                      stackIn_26_0 = 0;
                      break L6;
                    } else {
                      stackIn_26_0 = 1;
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
                      stackIn_32_0 = 0;
                      break L8;
                    } else {
                      stackIn_32_0 = 1;
                      break L8;
                    }
                  }
                  var7 = stackIn_32_0;
                  break L7;
                }
              }
            }
            L9: {
              L10: {
                var11 = var4 - var8;
                var12 = -var9 + var5;
                var13 = Math.sqrt((double)(var11 * var11 - -(var12 * var12)));
                Math.asin((double)var11 / var13);
                if (param1.a(true)) {
                  break L10;
                } else {
                  if (var7 == 0) {
                    ro.a(param1, (byte) 113);
                    break L9;
                  } else {
                    if (param1.field_p == 0) {
                      ro.a(param1, (byte) 113);
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              L11: {
                L12: {
                  if ((var4 ^ -1) < -27) {
                    break L12;
                  } else {
                    if (0 > param1.field_E) {
                      param1.field_E = -param1.field_E;
                      if (-1 == (param1.field_E ^ -1)) {
                        param1.field_E = 256;
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                if (rj.field_c + -52 >= var4) {
                  break L11;
                } else {
                  if ((param1.field_E ^ -1) < -1) {
                    param1.field_E = -param1.field_E;
                    if (param1.field_E != 0) {
                      break L11;
                    } else {
                      param1.field_E = -256;
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              L13: {
                if (var5 > 26) {
                  break L13;
                } else {
                  if (param1.field_A >= 0) {
                    break L13;
                  } else {
                    param1.field_A = -param1.field_A;
                    if (-1 == (param1.field_A ^ -1)) {
                      param1.field_A = 256;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              L14: {
                if (-52 + rl.field_k >= var5) {
                  break L14;
                } else {
                  if ((param1.field_A ^ -1) < -1) {
                    param1.field_A = -param1.field_A;
                    if (0 != param1.field_A) {
                      break L14;
                    } else {
                      param1.field_A = 256;
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              break L9;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackIn_63_0 = (RuntimeException) (var2);

            stackIn_63_1 = new StringBuilder().append("wr.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L15;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L15;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ')');
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 454) {
            field_E = (jn) null;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            L2: {
              if (as.field_w != null) {
                as.field_w.a((java.awt.Component) ((Object) param1), (byte) 76);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("wr.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
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
        int incrementValue$0 = 0;
        int stackIn_11_0 = 0;
        fs stackIn_16_0 = null;
        fs stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        fs stackIn_19_0 = null;
        fs stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        wc stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        ah[] var3 = null;
        RuntimeException var3_ref = null;
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
              var3 = var17;
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
                    stackIn_11_0 = 1;
                    break L4;
                  } else {
                    stackIn_11_0 = 0;
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
              if (var9 >= var8) {
                stackIn_34_0 = new wc(var17, var6, var7 != 0);
                break L0;
              } else {
                L6: {
                  var10 = param1.e(-31302);
                  var11 = param1.e(-31302);
                  stackIn_16_0 = (fs) (param1);

                  if (param2) {
                    stackIn_17_0 = (fs) ((Object) stackIn_16_0);
                    stackIn_17_1 = 0;
                    break L6;
                  } else {
                    stackIn_17_0 = (fs) ((Object) stackIn_16_0);
                    stackIn_17_1 = 1;
                    break L6;
                  }
                }
                L7: {
                  var12 = ((fs) (Object) stackIn_17_0).c(stackIn_17_1 != 0);
                  var13 = param1.c(true);
                  stackIn_19_0 = (fs) (param1);

                  if (param2) {
                    stackIn_20_0 = (fs) ((Object) stackIn_19_0);
                    stackIn_20_1 = 0;
                    break L7;
                  } else {
                    stackIn_20_0 = (fs) ((Object) stackIn_19_0);
                    stackIn_20_1 = 1;
                    break L7;
                  }
                }
                L8: {
                  ((fs) (Object) stackIn_20_0).d(stackIn_20_1 != 0);
                  var14 = 0;
                  if (-5 > (var5 ^ -1)) {
                    var14 = param1.e(-31302);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (-1 >= (var10 ^ -1)) {
                  if ((var10 ^ -1) > -9) {
                    if ((var11 ^ -1) <= -1) {
                      L9: {
                        if (var11 < 7) {
                          var15 = uj.a(var10, var12, var11, (byte) 84, var13);
                          var15.field_F = var14;
                          incrementValue$0 = var4;
                          var4++;
                          var3[incrementValue$0] = var15;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var9++;
                      continue L5;
                    } else {
                      var9++;
                      continue L5;
                    }
                  } else {
                    var9++;
                    continue L5;
                  }
                } else {
                  var9++;
                  continue L5;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3_ref = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3_ref);

            stackIn_37_1 = new StringBuilder().append("wr.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L10;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param2 + ')');
        }
        return stackIn_34_0;
    }

    final static vk a(fr param0, int param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        vk stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -24674) {
              var4_int = jaggl.OpenGL.glGenProgramARB();
              jaggl.OpenGL.glBindProgramARB(param1, var4_int);
              jaggl.OpenGL.glProgramStringARB(param1, 34933, param2);
              jaggl.OpenGL.glGetIntegerv(34379, mb.field_h, 0);
              if ((mb.field_h[0] ^ -1) == 0) {
                jaggl.OpenGL.glBindProgramARB(param1, 0);
                stackIn_7_0 = new vk(param0, param1, var4_int);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                jaggl.OpenGL.glBindProgramARB(param1, 0);
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (vk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("wr.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
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
