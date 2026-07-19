/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    nh field_e;
    nh field_f;
    static ri[] field_c;
    boolean field_g;
    private aw field_a;
    ru[] field_d;
    private ru[] field_b;

    final boolean a(int param0) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        byte[] var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var16 = 0;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          L1: {
            var16 = Sumoblitz.field_L ? 1 : 0;
            if (this.field_e != null) {
              break L1;
            } else {
              L2: {
                if (ab.field_b == null) {
                  var22 = mr.a(0.6000000238418579f, 0.5f, 128, -30865, new vu(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
                  var19 = var22;
                  var18 = var19;
                  var2 = var18;
                  ab.field_b = aj.a((byte) -121, var22, false);
                  break L2;
                } else {
                  break L2;
                }
              }
              var23 = ab.a(false, ab.field_b, 0);
              var20 = var23;
              var17 = var20;
              var2 = var17;
              var24 = new byte[4 * var23.length];
              var21 = var24;
              var3 = var21;
              var4 = 0;
              var5 = 0;
              L3: while (true) {
                stackOut_5_0 = 16;
                stackIn_6_0 = stackOut_5_0;
                L4: while (true) {
                  L5: {
                    if (stackIn_6_0 <= var5) {
                      break L5;
                    } else {
                      var6 = 16384 * var5;
                      var7 = var6;
                      stackOut_7_0 = 0;
                      stackIn_21_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var16 != 0) {
                        break L0;
                      } else {
                        var8 = stackIn_8_0;
                        L6: while (true) {
                          L7: {
                            if ((var8 ^ -1) <= -129) {
                              break L7;
                            } else {
                              var9 = var7 - -(var8 * 128);
                              var10 = var7 + (127 & var8 + -1) * 128;
                              var11 = 128 * (1 + var8 & 127) + var7;
                              stackOut_10_0 = 0;
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var16 != 0) {
                                continue L4;
                              } else {
                                var12 = stackIn_11_0;
                                L8: while (true) {
                                  L9: {
                                    L10: {
                                      if (-129 >= (var12 ^ -1)) {
                                        break L10;
                                      } else {
                                        var13 = (float)((var17[var12 + var10] & 255) + -(var17[var12 + var11] & 255));
                                        var14 = (float)((var17[(var12 + -1 & 127) + var9] & 255) - (255 & var17[var9 + (127 & var12 + 1)]));
                                        var15 = (float)(128.0 / Math.sqrt((double)(16384.0f + var14 * var14 + var13 * var13)));
                                        incrementValue$5 = var4;
                                        var4++;
                                        var3[incrementValue$5] = (byte)(int)(127.0f + var15 * var14);
                                        incrementValue$6 = var4;
                                        var4++;
                                        var3[incrementValue$6] = (byte)(int)(127.0f + 128.0f * var15);
                                        incrementValue$7 = var4;
                                        var4++;
                                        var3[incrementValue$7] = (byte)(int)(var13 * var15 + 127.0f);
                                        incrementValue$8 = var4;
                                        var4++;
                                        incrementValue$9 = var6;
                                        var6++;
                                        var3[incrementValue$8] = var17[incrementValue$9];
                                        var12++;
                                        if (var16 != 0) {
                                          break L9;
                                        } else {
                                          if (var16 == 0) {
                                            continue L8;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    var8++;
                                    break L9;
                                  }
                                  if (var16 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var5++;
                          if (var16 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  this.field_e = this.field_a.a(true, nl.field_p, 16, 128, var24, 128);
                  break L1;
                }
              }
            }
          }
          stackOut_20_0 = param0;
          stackIn_21_0 = stackOut_20_0;
          break L0;
        }
        if (stackIn_21_0 > -120) {
          L11: {
            this.field_g = true;
            if (this.field_e == null) {
              stackOut_28_0 = 0;
              stackIn_29_0 = stackOut_28_0;
              break L11;
            } else {
              stackOut_27_0 = 1;
              stackIn_29_0 = stackOut_27_0;
              break L11;
            }
          }
          return stackIn_29_0 != 0;
        } else {
          L12: {
            if (this.field_e == null) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L12;
            } else {
              stackOut_23_0 = 1;
              stackIn_25_0 = stackOut_23_0;
              break L12;
            }
          }
          return stackIn_25_0 != 0;
        }
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= 14) {
          return false;
        } else {
          L0: {
            if (this.field_g) {
              if (null == this.field_f) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              }
            } else {
              if (this.field_d == null) {
                stackOut_4_0 = 0;
                stackIn_8_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L0;
              }
            }
          }
          return stackIn_8_0 != 0;
        }
    }

    public static void b(int param0) {
        if (param0 != 128) {
            sk.b(-102);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static mk a(fr param0, boolean param1, int param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        mk stackIn_2_0 = null;
        Object stackIn_13_0 = null;
        mk stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        mk stackOut_14_0 = null;
        mk stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param2);
            jaggl.OpenGL.glShaderSourceARB(var4_long, param3);
            jaggl.OpenGL.glCompileShaderARB(var4_long);
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, cl.field_z, 0);
            if (!param1) {
              L1: {
                if (cl.field_z[0] == 0) {
                  L2: {
                    if (cl.field_z[0] == 0) {
                      System.out.println("Shader compile failed:");
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, cl.field_z, 1);
                    if (-2 <= (cl.field_z[1] ^ -1)) {
                      break L3;
                    } else {
                      var10 = new byte[cl.field_z[1]];
                      jaggl.OpenGL.glGetInfoLogARB(var4_long, cl.field_z[1], cl.field_z, 0, var10, 0);
                      System.out.println(new String(var10));
                      break L3;
                    }
                  }
                  if (0 == cl.field_z[0]) {
                    jaggl.OpenGL.glDeleteObjectARB(var4_long);
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              stackOut_14_0 = new mk(param0, var4_long, param2);
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_1_0 = (mk) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("sk.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (mk) ((Object) stackIn_13_0);
          } else {
            return stackIn_15_0;
          }
        }
    }

    sk(aw param0) {
        nh discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var4 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_e = null;
        this.field_f = null;
        this.field_d = null;
        this.field_b = null;
        try {
          L0: {
            L1: {
              this.field_a = param0;
              this.field_g = this.field_a.field_Eb;
              if (!this.field_g) {
                break L1;
              } else {
                if (this.field_a.a((byte) -42, io.field_g, ps.field_c)) {
                  break L1;
                } else {
                  this.field_g = false;
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_g) {
                break L2;
              } else {
                if (this.field_a.a(io.field_g, ps.field_c, 6)) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              L4: {
                as.f(23369);
                if (!this.field_g) {
                  break L4;
                } else {
                  var15 = ab.a(false, pd.field_n, 0);
                  this.field_f = this.field_a.a(true, ps.field_c, 16, 128, var15, 128);
                  var16 = ab.a(false, mk.field_d, 0);
                  discarded$1 = this.field_a.a(true, ps.field_c, 16, 128, var16, 128);
                  if (var4 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_d = new ru[16];
              var2_int = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (-17 >= (var2_int ^ -1)) {
                      break L7;
                    } else {
                      var17 = iq.a(pd.field_n, 14381, 32768, var2_int * 32768);
                      this.field_d[var2_int] = this.field_a.a(var17, 128, 128, ps.field_c, 0, true);
                      var2_int++;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  this.field_b = new ru[16];
                  break L6;
                }
                var2_int = 0;
                L8: while (true) {
                  if (var2_int >= 16) {
                    break L3;
                  } else {
                    var18 = iq.a(mk.field_d, 14381, 32768, 32768 * var2_int);
                    this.field_b[var2_int] = this.field_a.a(var18, 128, 128, ps.field_c, 0, true);
                    var2_int++;
                    if (var4 == 0) {
                      continue L8;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("sk.<init>(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
