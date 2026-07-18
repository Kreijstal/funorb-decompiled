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
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
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
                    L5: {
                      if (~var15 <= ~param9) {
                        break L5;
                      } else {
                        var16 = var15 * var12;
                        var17 = var13 * (-var15 + (param9 + -1)) - -param0;
                        stackOut_8_0 = 0;
                        stackIn_19_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var19 != 0) {
                          break L2;
                        } else {
                          var18 = stackIn_9_0;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (~var18 <= ~var12) {
                                  break L8;
                                } else {
                                  int incrementValue$2 = var16;
                                  var16++;
                                  int incrementValue$3 = var17;
                                  var17++;
                                  var14[incrementValue$2] = param1[incrementValue$3];
                                  var18++;
                                  if (var19 != 0) {
                                    break L7;
                                  } else {
                                    if (var19 == 0) {
                                      continue L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var15++;
                              break L7;
                            }
                            if (var19 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    param1 = var14;
                    break L3;
                  }
                }
              }
              ((us) this).field_d.a(82, (ht) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_18_0 = ~param4;
              stackIn_19_0 = stackOut_18_0;
              break L2;
            }
            L9: {
              if (stackIn_19_0 == ~param5) {
                break L9;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param5);
                break L9;
              }
            }
            L10: {
              jaggl.OpenGL.glTexSubImage2Dub(((us) this).field_c, 0, param3, param6, param4, param9, param2, 5121, param1, param0);
              if (param5 != param4) {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L10;
              } else {
                break L10;
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
          L11: {
            var11 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var11;
            stackOut_30_1 = new StringBuilder().append("us.G(").append(param0).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param4 * param3, false);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
        try {
          L0: {
            ((us) this).field_o = param4;
            ((us) this).field_l = param3;
            ((us) this).field_d.a(27, (ht) this);
            jaggl.OpenGL.glTexImage2Dub(((us) this).field_c, 0, ((us) this).field_a, param3, param4, 0, be.a(false, ((us) this).field_a), 5121, (byte[]) null, 0);
            ((us) this).a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("us.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        int var8_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = ((us) this).field_d.field_Ec + -param4 + -param1;
              ((us) this).field_d.a(97, (ht) this);
              if (param0 >= 110) {
                break L1;
              } else {
                ((us) this).field_o = 53;
                break L1;
              }
            }
            jaggl.OpenGL.glCopyTexSubImage2D(((us) this).field_c, 0, param2, -param4 - param3 + ((us) this).field_o, param5, var8_int, param6, param4);
            jaggl.OpenGL.glFlush();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "us.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        try {
          L0: {
            L1: {
              if (param2 == -27365) {
                break L1;
              } else {
                ((us) this).a((byte) 11, 46, 71, -37, 98, -13, 14);
                break L1;
              }
            }
            L2: {
              if (((us) this).field_c == 3553) {
                L3: {
                  ((us) this).field_d.a(66, (ht) this);
                  stackOut_6_0 = ((us) this).field_c;
                  stackOut_6_1 = 10242;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_9_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (!param0) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = 33071;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L3;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 10497;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    stackIn_10_2 = stackOut_7_2;
                    break L3;
                  }
                }
                L4: {
                  jaggl.OpenGL.glTexParameteri(stackIn_10_0, stackIn_10_1, stackIn_10_2);
                  stackOut_10_0 = ((us) this).field_c;
                  stackOut_10_1 = 10243;
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_13_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (!param1) {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = 33071;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L4;
                  } else {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 10497;
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_14_1 = stackOut_11_1;
                    stackIn_14_2 = stackOut_11_2;
                    break L4;
                  }
                }
                jaggl.OpenGL.glTexParameteri(stackIn_14_0, stackIn_14_1, stackIn_14_2);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var4, "us.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("us.<init>(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param7 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_m = null;
            if (param0 != 28) {
                field_m = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "us.E(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param3, param1, ((us) this).field_c, ((us) this).field_j, param2);
        ((us) this).field_k = param3;
        if (param0 >= -21) {
            return;
        }
        try {
            ((us) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "us.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
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
                  var10_array = new int[param1 * param0];
                  var11 = 0;
                  L5: while (true) {
                    L6: {
                      if (~param0 >= ~var11) {
                        break L6;
                      } else {
                        var12 = param1 * var11;
                        var13 = param4 + param6 * (param0 - (var11 - -1));
                        stackOut_11_0 = 0;
                        stackIn_22_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var15 != 0) {
                          break L3;
                        } else {
                          var14 = stackIn_12_0;
                          L7: while (true) {
                            L8: {
                              L9: {
                                if (var14 >= param1) {
                                  break L9;
                                } else {
                                  int incrementValue$2 = var12;
                                  var12++;
                                  int incrementValue$3 = var13;
                                  var13++;
                                  var10_array[incrementValue$2] = param3[incrementValue$3];
                                  var14++;
                                  if (var15 != 0) {
                                    break L8;
                                  } else {
                                    if (var15 == 0) {
                                      continue L7;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var11++;
                              break L8;
                            }
                            if (var15 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    param3 = var10_array;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              ((us) this).field_d.a(81, (ht) this);
              stackOut_21_0 = param6;
              stackIn_22_0 = stackOut_21_0;
              break L3;
            }
            L10: {
              if (stackIn_22_0 == param1) {
                break L10;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param6);
                break L10;
              }
            }
            L11: {
              jaggl.OpenGL.glTexSubImage2Di(((us) this).field_c, 0, param5, -param0 + (((us) this).field_o + -param2), param1, param0, 32993, ((us) this).field_d.field_L, param3, param4);
              if (~param1 != ~param6) {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L11;
              } else {
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var10 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var10;
            stackOut_30_1 = new StringBuilder().append("us.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L12;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_15_0 = false;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((us) this).field_l = param3;
                ((us) this).field_o = param4;
                if (param8) {
                  var10_array = new byte[param6.length];
                  var11 = 0;
                  L3: while (true) {
                    L4: {
                      if (param4 <= var11) {
                        break L4;
                      } else {
                        var12 = param3 * var11;
                        var13 = param3 * (-1 + (-var11 + param4));
                        stackOut_5_0 = 0;
                        stackIn_16_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          var14 = stackIn_6_0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (var14 >= param3) {
                                  break L7;
                                } else {
                                  int incrementValue$2 = var12;
                                  var12++;
                                  int incrementValue$3 = var13;
                                  var13++;
                                  var10_array[incrementValue$2] = param6[incrementValue$3];
                                  var14++;
                                  if (var15 != 0) {
                                    break L6;
                                  } else {
                                    if (var15 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var11++;
                              break L6;
                            }
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    param6 = var10_array;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              ((us) this).field_d.a(83, (ht) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_15_0 = param5;
              stackIn_16_0 = stackOut_15_0 ? 1 : 0;
              break L1;
            }
            L8: {
              L9: {
                if (stackIn_16_0 == 0) {
                  break L9;
                } else {
                  if (34037 == ((us) this).field_c) {
                    break L9;
                  } else {
                    vq.a(param1, 23143, param6, param3, param2, param4, param7);
                    ((us) this).a(true, true);
                    if (var15 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Dub(((us) this).field_c, 0, ((us) this).field_a, ((us) this).field_l, ((us) this).field_o, 0, param7, 5121, param6, 0);
              ((us) this).a(true, false);
              break L8;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((us) this).a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var10 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var10;
            stackOut_27_1 = new StringBuilder().append("us.<init>(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param6 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param7 + ',' + param8 + ')');
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
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
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
                  var11_array = new int[param6.length];
                  var12 = 0;
                  L3: while (true) {
                    L4: {
                      if (~param4 >= ~var12) {
                        break L4;
                      } else {
                        var13 = var12 * param3;
                        var14 = param3 * (-var12 + param4 + -1);
                        stackOut_4_0 = 0;
                        stackIn_15_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var16 != 0) {
                          break L1;
                        } else {
                          var15 = stackIn_5_0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (var15 >= param3) {
                                  break L7;
                                } else {
                                  int incrementValue$2 = var13;
                                  var13++;
                                  int incrementValue$3 = var14;
                                  var14++;
                                  var11_array[incrementValue$2] = param6[incrementValue$3];
                                  var15++;
                                  if (var16 != 0) {
                                    break L6;
                                  } else {
                                    if (var16 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var12++;
                              break L6;
                            }
                            if (var16 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    param6 = var11_array;
                    break L2;
                  }
                }
              }
              ((us) this).field_d.a(43, (ht) this);
              stackOut_14_0 = ((us) this).field_c;
              stackIn_15_0 = stackOut_14_0;
              break L1;
            }
            L8: {
              L9: {
                if (stackIn_15_0 == 34037) {
                  break L9;
                } else {
                  if (!param5) {
                    break L9;
                  } else {
                    if (param7 != 0) {
                      break L9;
                    } else {
                      if (param8 != 0) {
                        break L9;
                      } else {
                        eu.a(-122, ((us) this).field_o, ((us) this).field_l, ((us) this).field_c, param6, ((us) this).field_a, ((us) this).field_d.field_L, 32993);
                        ((us) this).a(true, true);
                        if (var16 == 0) {
                          break L8;
                        } else {
                          break L9;
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
              break L8;
            }
            ((us) this).a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var11 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var11;
            stackOut_32_1 = new StringBuilder().append("us.<init>(");
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L10;
            }
          }
          L11: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param6 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public final void a(int param0) {
        try {
            int var2_int = 6 / ((44 - param0) / 58);
            jaggl.OpenGL.glFramebufferTexture2DEXT(((us) this).field_k, ((us) this).field_n, ((us) this).field_c, 0, 0);
            ((us) this).field_k = -1;
            ((us) this).field_n = -1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "us.D(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            int var2_int = 0;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
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
                stackIn_8_0 = stackOut_5_0;
                stackIn_8_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_9_1 = stackOut_6_1;
                  stackIn_9_2 = stackOut_6_2;
                  break L3;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
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
