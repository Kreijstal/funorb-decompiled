/*
 * Decompiled by CFR-JS 0.4.0.
 */
class us extends ht {
    int field_o;
    int field_l;
    private int field_k;
    static String field_m;
    private int field_n;

    final void a(int param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, boolean param7, byte param8, int param9) {
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == 0) {
                param5 = param4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param7) {
                  break L3;
                } else {
                  var11_int = pc.a(param2, (byte) -37);
                  var12 = var11_int * param4;
                  var13 = var11_int * param5;
                  var14 = new byte[param9 * var12];
                  var15 = 0;
                  L4: while (true) {
                    if (var15 >= param9) {
                      param1 = var14;
                      break L3;
                    } else {
                      var16 = var15 * var12;
                      var17 = var13 * (-var15 + (param9 + -1)) - -param0;
                      stackOut_7_0 = 0;
                      stackIn_17_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var19 != 0) {
                        break L2;
                      } else {
                        var18 = stackIn_8_0;
                        L5: while (true) {
                          L6: {
                            if (var18 >= var12) {
                              var15++;
                              break L6;
                            } else {
                              int incrementValue$2 = var16;
                              var16++;
                              int incrementValue$3 = var17;
                              var17++;
                              var14[incrementValue$2] = param1[incrementValue$3];
                              var18++;
                              if (var19 != 0) {
                                break L6;
                              } else {
                                continue L5;
                              }
                            }
                          }
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
              ((us) this).field_d.a(82, (ht) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_16_0 = param4;
              stackIn_17_0 = stackOut_16_0;
              break L2;
            }
            L7: {
              if (stackIn_17_0 == param5) {
                break L7;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param5);
                break L7;
              }
            }
            L8: {
              jaggl.OpenGL.glTexSubImage2Dub(((us) this).field_c, 0, param3, param6, param4, param9, param2, 5121, param1, param0);
              if (param5 != param4) {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L8;
              } else {
                break L8;
              }
            }
            if (param8 < -120) {
              jaggl.OpenGL.glPixelStorei(3317, 4);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var11 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var11;
            stackOut_26_1 = new StringBuilder().append("us.G(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param4 * param3, false);
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
        try {
            ((us) this).field_o = param4;
            ((us) this).field_l = param3;
            ((us) this).field_d.a(27, (ht) this);
            jaggl.OpenGL.glTexImage2Dub(((us) this).field_c, 0, ((us) this).field_a, param3, param4, 0, be.a(false, ((us) this).field_a), 5121, (byte[]) null, 0);
            ((us) this).a(true, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "us.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = ((us) this).field_d.field_Ec + -param4 + -param1;
        ((us) this).field_d.a(97, (ht) this);
        if (param0 < 110) {
          ((us) this).field_o = 53;
          jaggl.OpenGL.glCopyTexSubImage2D(((us) this).field_c, 0, param2, -param4 - param3 + ((us) this).field_o, param5, var8, param6, param4);
          jaggl.OpenGL.glFlush();
          return;
        } else {
          jaggl.OpenGL.glCopyTexSubImage2D(((us) this).field_c, 0, param2, -param4 - param3 + ((us) this).field_o, param5, var8, param6, param4);
          jaggl.OpenGL.glFlush();
          return;
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        if (param2 != -27365) {
          L0: {
            ((us) this).a((byte) 11, 46, 71, -37, 98, -13, 14);
            if (((us) this).field_c == 3553) {
              L1: {
                ((us) this).field_d.a(66, (ht) this);
                stackOut_13_0 = ((us) this).field_c;
                stackOut_13_1 = 10242;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (!param0) {
                  stackOut_15_0 = stackIn_15_0;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = 33071;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L1;
                } else {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = 10497;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L1;
                }
              }
              L2: {
                jaggl.OpenGL.glTexParameteri(stackIn_16_0, stackIn_16_1, stackIn_16_2);
                stackOut_16_0 = ((us) this).field_c;
                stackOut_16_1 = 10243;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (!param1) {
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 33071;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L2;
                } else {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = 10497;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L2;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_19_0, stackIn_19_1, stackIn_19_2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (((us) this).field_c == 3553) {
              L4: {
                ((us) this).field_d.a(66, (ht) this);
                stackOut_3_0 = ((us) this).field_c;
                stackOut_3_1 = 10242;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (!param0) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = 33071;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  break L4;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 10497;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  break L4;
                }
              }
              L5: {
                jaggl.OpenGL.glTexParameteri(stackIn_6_0, stackIn_6_1, stackIn_6_2);
                stackOut_6_0 = ((us) this).field_c;
                stackOut_6_1 = 10243;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (!param1) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = 33071;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L5;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = 10497;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L5;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_9_0, stackIn_9_1, stackIn_9_2);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException runtimeException = null;
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
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  ((us) this).field_l = param3;
                  ((us) this).field_o = param4;
                  ((us) this).field_d.a(106, (ht) this);
                  if (!param5) {
                    break L3;
                  } else {
                    if (((us) this).field_c != 34037) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                jaggl.OpenGL.glTexImage2Df(((us) this).field_c, 0, ((us) this).field_a, ((us) this).field_l, ((us) this).field_o, 0, param7, 5126, param6, 0);
                ((us) this).a(true, false);
                if (!Sumoblitz.field_L) {
                  break L1;
                } else {
                  break L2;
                }
              }
              dl.a(param3, param4, (byte) 11, param1, param2, param6, param7);
              ((us) this).a(true, true);
              break L1;
            }
            ((us) this).a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("us.<init>(");
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
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param7 + 41);
        }
    }

    public static void c(byte param0) {
        field_m = null;
        if (param0 != 28) {
            field_m = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param3, param1, ((us) this).field_c, ((us) this).field_j, param2);
        ((us) this).field_k = param3;
        if (param0 >= -21) {
          return;
        } else {
          ((us) this).field_n = param1;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, boolean param7, boolean param8) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8) {
                break L1;
              } else {
                ((us) this).a(11);
                break L1;
              }
            }
            L2: {
              if (param6 != 0) {
                break L2;
              } else {
                param6 = param1;
                break L2;
              }
            }
            L3: {
              L4: {
                if (param7) {
                  var16 = new int[param1 * param0];
                  var10_array = var16;
                  var11 = 0;
                  L5: while (true) {
                    if (param0 <= var11) {
                      param3 = var16;
                      break L4;
                    } else {
                      var12 = param1 * var11;
                      var13 = param4 + param6 * (param0 - (var11 - -1));
                      stackOut_9_0 = 0;
                      stackIn_19_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var15 != 0) {
                        break L3;
                      } else {
                        var14 = stackIn_10_0;
                        L6: while (true) {
                          L7: {
                            if (var14 >= param1) {
                              var11++;
                              break L7;
                            } else {
                              int incrementValue$2 = var12;
                              var12++;
                              int incrementValue$3 = var13;
                              var13++;
                              var16[incrementValue$2] = param3[incrementValue$3];
                              var14++;
                              if (var15 != 0) {
                                break L7;
                              } else {
                                continue L6;
                              }
                            }
                          }
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              ((us) this).field_d.a(81, (ht) this);
              stackOut_18_0 = param6;
              stackIn_19_0 = stackOut_18_0;
              break L3;
            }
            L8: {
              if (stackIn_19_0 == param1) {
                break L8;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param6);
                break L8;
              }
            }
            jaggl.OpenGL.glTexSubImage2Di(((us) this).field_c, 0, param5, -param0 + (((us) this).field_o + -param2), param1, param0, 32993, ((us) this).field_d.field_L, param3, param4);
            if (param1 != param6) {
              jaggl.OpenGL.glPixelStorei(3314, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var10 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var10;
            stackOut_25_1 = new StringBuilder().append("us.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException var10 = null;
        byte[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_12_0 = false;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((us) this).field_l = param3;
                ((us) this).field_o = param4;
                if (!param8) {
                  break L2;
                } else {
                  var16 = new byte[param6.length];
                  var10_array = var16;
                  var11 = 0;
                  L3: while (true) {
                    if (param4 <= var11) {
                      param6 = var16;
                      break L2;
                    } else {
                      var12 = param3 * var11;
                      var13 = param3 * (-1 + (-var11 + param4));
                      stackOut_4_0 = 0;
                      stackIn_13_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var15 != 0) {
                        break L1;
                      } else {
                        var14 = stackIn_5_0;
                        L4: while (true) {
                          L5: {
                            if (var14 >= param3) {
                              var11++;
                              break L5;
                            } else {
                              int incrementValue$2 = var12;
                              var12++;
                              int incrementValue$3 = var13;
                              var13++;
                              var16[incrementValue$2] = param6[incrementValue$3];
                              var14++;
                              if (var15 != 0) {
                                break L5;
                              } else {
                                continue L4;
                              }
                            }
                          }
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
              ((us) this).field_d.a(83, (ht) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_12_0 = param5;
              stackIn_13_0 = stackOut_12_0 ? 1 : 0;
              break L1;
            }
            L6: {
              L7: {
                if (stackIn_13_0 == 0) {
                  break L7;
                } else {
                  if (34037 == ((us) this).field_c) {
                    break L7;
                  } else {
                    vq.a(param1, 23143, param6, param3, param2, param4, param7);
                    ((us) this).a(true, true);
                    if (var15 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Dub(((us) this).field_c, 0, ((us) this).field_a, ((us) this).field_l, ((us) this).field_o, 0, param7, 5121, param6, 0);
              ((us) this).a(true, false);
              break L6;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((us) this).a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var10;
            stackOut_19_1 = new StringBuilder().append("us.<init>(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
        super(param0, param1, param2, param4 * param3, param5);
        RuntimeException var11 = null;
        int[] var11_array = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((us) this).field_l = param3;
                ((us) this).field_o = param4;
                if (!param9) {
                  break L2;
                } else {
                  var17 = new int[param6.length];
                  var11_array = var17;
                  var12 = 0;
                  L3: while (true) {
                    if (param4 <= var12) {
                      param6 = var17;
                      break L2;
                    } else {
                      var13 = var12 * param3;
                      var14 = param3 * (-var12 + param4 + -1);
                      stackOut_4_0 = 0;
                      stackIn_13_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var16 != 0) {
                        break L1;
                      } else {
                        var15 = stackIn_5_0;
                        L4: while (true) {
                          L5: {
                            if (var15 >= param3) {
                              var12++;
                              break L5;
                            } else {
                              int incrementValue$2 = var13;
                              var13++;
                              int incrementValue$3 = var14;
                              var14++;
                              var17[incrementValue$2] = param6[incrementValue$3];
                              var15++;
                              if (var16 != 0) {
                                break L5;
                              } else {
                                continue L4;
                              }
                            }
                          }
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
              ((us) this).field_d.a(43, (ht) this);
              stackOut_12_0 = ((us) this).field_c;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            L6: {
              L7: {
                if (stackIn_13_0 == 34037) {
                  break L7;
                } else {
                  if (!param5) {
                    break L7;
                  } else {
                    if (param7 != 0) {
                      break L7;
                    } else {
                      if (param8 != 0) {
                        break L7;
                      } else {
                        eu.a(-122, ((us) this).field_o, ((us) this).field_l, ((us) this).field_c, param6, ((us) this).field_a, ((us) this).field_d.field_L, 32993);
                        ((us) this).a(true, true);
                        if (var16 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
              }
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Di(((us) this).field_c, 0, ((us) this).field_a, ((us) this).field_l, ((us) this).field_o, 0, 32993, ((us) this).field_d.field_L, param6, 4 * param8);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              ((us) this).a(true, false);
              break L6;
            }
            ((us) this).a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var11 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var11;
            stackOut_21_1 = new StringBuilder().append("us.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param6 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    public final void a(int param0) {
        int var2 = 6 / ((44 - param0) / 58);
        jaggl.OpenGL.glFramebufferTexture2DEXT(((us) this).field_k, ((us) this).field_n, ((us) this).field_c, 0, 0);
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            int var2_int = 0;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(td.a((byte) 127, param0, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                var2_int = 76 / ((0 - param1) / 39);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) var2_ref2;
                stackOut_5_1 = new StringBuilder().append("us.I(");
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param0 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L3;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L3;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Logging in...";
    }
}
