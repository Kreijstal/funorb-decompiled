/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rt extends kl {
    int field_o;
    static String field_n;
    private int field_q;
    static String field_p;
    int field_l;
    private int field_m;

    final void a(int param0, int param1, int param2, int param3) {
        try {
            jaggl.OpenGL.glFramebufferTexture2DEXT(param0, param3, ((rt) this).field_e, ((rt) this).field_i, param1);
            ((rt) this).field_q = param3;
            ((rt) this).field_m = param0;
            if (param2 != 0) {
                ((rt) this).a(true, true, 64);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rt.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                rt.a(true, (String) null, (String) null);
                break L1;
              }
            }
            rma.a(false, param1, param2, (byte) 100);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rt.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    public final void a(int param0) {
        try {
            jaggl.OpenGL.glFramebufferTexture2DEXT(((rt) this).field_m, ((rt) this).field_q, ((rt) this).field_e, 0, 0);
            ((rt) this).field_q = -1;
            ((rt) this).field_m = -1;
            int var2_int = -46 % ((param0 - 14) / 56);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rt.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte[] param5, int param6, int param7, int param8, boolean param9) {
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
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                param0 = param7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param9) {
                  break L3;
                } else {
                  var11_int = jj.a(param8, (byte) -72);
                  var12 = param7 * var11_int;
                  var13 = var11_int * param0;
                  var14 = new byte[param2 * var12];
                  var15 = 0;
                  L4: while (true) {
                    L5: {
                      if (~param2 >= ~var15) {
                        break L5;
                      } else {
                        var16 = var15 * var12;
                        var17 = (-var15 + param2 - 1) * var13 - -param1;
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
                                if (var18 >= var12) {
                                  break L8;
                                } else {
                                  int incrementValue$2 = var16;
                                  var16++;
                                  int incrementValue$3 = var17;
                                  var17++;
                                  var14[incrementValue$2] = param5[incrementValue$3];
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
                    param5 = var14;
                    break L3;
                  }
                }
              }
              ((rt) this).field_h.a(true, (kl) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_18_0 = ~param7;
              stackIn_19_0 = stackOut_18_0;
              break L2;
            }
            L9: {
              if (stackIn_19_0 == ~param0) {
                break L9;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param0);
                break L9;
              }
            }
            jaggl.OpenGL.glTexSubImage2Dub(((rt) this).field_e, 0, param4, param3, param7, param2, param8, 5121, param5, param1);
            if (param6 == -24575) {
              L10: {
                if (param0 == param7) {
                  break L10;
                } else {
                  jaggl.OpenGL.glPixelStorei(3314, 0);
                  break L10;
                }
              }
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
            stackOut_29_0 = (RuntimeException) var11;
            stackOut_29_1 = new StringBuilder().append("rt.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param5 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L11;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void g(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            field_n = null;
            field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "rt.B(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        try {
          L0: {
            L1: {
              if (param2 != ~((rt) this).field_e) {
                break L1;
              } else {
                L2: {
                  ((rt) this).field_h.a(true, (kl) this);
                  stackOut_1_0 = ((rt) this).field_e;
                  stackOut_1_1 = 10242;
                  stackIn_6_0 = stackOut_1_0;
                  stackIn_6_1 = stackOut_1_1;
                  stackIn_2_0 = stackOut_1_0;
                  stackIn_2_1 = stackOut_1_1;
                  if (!param1) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 33071;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    break L2;
                  } else {
                    stackOut_2_0 = stackIn_2_0;
                    stackOut_2_1 = stackIn_2_1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 10497;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_7_1 = stackOut_4_1;
                    stackIn_7_2 = stackOut_4_2;
                    break L2;
                  }
                }
                L3: {
                  jaggl.OpenGL.glTexParameteri(stackIn_7_0, stackIn_7_1, stackIn_7_2);
                  stackOut_7_0 = ((rt) this).field_e;
                  stackOut_7_1 = 10243;
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (!param0) {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 33071;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L3;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 10497;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_11_1 = stackOut_8_1;
                    stackIn_11_2 = stackOut_8_2;
                    break L3;
                  }
                }
                jaggl.OpenGL.glTexParameteri(stackIn_11_0, stackIn_11_1, stackIn_11_2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "rt.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        int var8_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = ((rt) this).field_h.field_I + -param5 - param6;
              ((rt) this).field_h.a(true, (kl) this);
              jaggl.OpenGL.glCopyTexSubImage2D(((rt) this).field_e, 0, param3, ((rt) this).field_o - param2 - param6, param0, var8_int, param1, param6);
              jaggl.OpenGL.glFlush();
              if (param4 < -62) {
                break L1;
              } else {
                ((rt) this).field_l = -71;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "rt.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    rt(cka param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
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
        var16 = TombRacer.field_G ? 1 : 0;
        ((rt) this).field_q = -1;
        ((rt) this).field_m = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((rt) this).field_o = param4;
                ((rt) this).field_l = param3;
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
                        var13 = param3 * var12;
                        var14 = (-1 + (-var12 + param4)) * param3;
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
                                if (param3 <= var15) {
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
              ((rt) this).field_h.a(true, (kl) this);
              stackOut_14_0 = -34038;
              stackIn_15_0 = stackOut_14_0;
              break L1;
            }
            L8: {
              L9: {
                if (stackIn_15_0 == ~((rt) this).field_e) {
                  break L9;
                } else {
                  if (!param5) {
                    break L9;
                  } else {
                    if (param7 != 0) {
                      break L9;
                    } else {
                      if (0 != param8) {
                        break L9;
                      } else {
                        wd.a(((rt) this).field_e, 32993, ((rt) this).field_c, 81, param6, ((rt) this).field_h.field_P, ((rt) this).field_l, ((rt) this).field_o);
                        ((rt) this).a(true, 4);
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
              jaggl.OpenGL.glTexImage2Di(((rt) this).field_e, 0, ((rt) this).field_c, ((rt) this).field_l, ((rt) this).field_o, 0, 32993, ((rt) this).field_h.field_P, param6, param8 * 4);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              ((rt) this).a(false, 4);
              break L8;
            }
            ((rt) this).b(true, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var11 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var11;
            stackOut_32_1 = new StringBuilder().append("rt.<init>(");
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
          throw tba.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    rt(cka param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
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
        ((rt) this).field_q = -1;
        ((rt) this).field_m = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((rt) this).field_l = param3;
                ((rt) this).field_o = param4;
                ((rt) this).field_h.a(true, (kl) this);
                if (!param5) {
                  break L2;
                } else {
                  if (((rt) this).field_e == 34037) {
                    break L2;
                  } else {
                    gw.a(param7, 92, param1, param2, param6, param3, param4);
                    ((rt) this).a(true, 4);
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Df(((rt) this).field_e, 0, ((rt) this).field_c, ((rt) this).field_l, ((rt) this).field_o, 0, param7, 5126, param6, 0);
              ((rt) this).a(false, 4);
              break L1;
            }
            ((rt) this).b(true, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("rt.<init>(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param7 + ')');
        }
    }

    rt(cka param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
        super(param0, param1, param2, param4 * param3, param5);
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
        var15 = TombRacer.field_G ? 1 : 0;
        ((rt) this).field_q = -1;
        ((rt) this).field_m = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((rt) this).field_l = param3;
                ((rt) this).field_o = param4;
                if (param8) {
                  var10_array = new byte[param6.length];
                  var11 = 0;
                  L3: while (true) {
                    L4: {
                      if (var11 >= param4) {
                        break L4;
                      } else {
                        var12 = var11 * param3;
                        var13 = (-1 + (-var11 + param4)) * param3;
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
                                if (param3 <= var14) {
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
              ((rt) this).field_h.a(true, (kl) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_15_0 = param5;
              stackIn_16_0 = stackOut_15_0 ? 1 : 0;
              break L1;
            }
            L8: {
              L9: {
                L10: {
                  if (stackIn_16_0 == 0) {
                    break L10;
                  } else {
                    if (((rt) this).field_e != 34037) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                jaggl.OpenGL.glTexImage2Dub(((rt) this).field_e, 0, ((rt) this).field_c, ((rt) this).field_l, ((rt) this).field_o, 0, param7, 5121, param6, 0);
                ((rt) this).a(false, 4);
                if (var15 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
              ts.a((byte) 53, param6, param1, param3, param4, param7, param2);
              ((rt) this).a(true, 4);
              break L8;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((rt) this).b(true, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var10 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var10;
            stackOut_27_1 = new StringBuilder().append("rt.<init>(");
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
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
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
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    rt(cka param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3 * param4, false);
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
        ((rt) this).field_q = -1;
        ((rt) this).field_m = -1;
        try {
          L0: {
            ((rt) this).field_o = param4;
            ((rt) this).field_l = param3;
            ((rt) this).field_h.a(true, (kl) this);
            jaggl.OpenGL.glTexImage2Dub(((rt) this).field_e, 0, ((rt) this).field_c, param3, param4, 0, sja.b(((rt) this).field_c, 20934), 5121, (byte[]) null, 0);
            ((rt) this).b(true, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rt.<init>(");
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, byte param6, boolean param7, int param8) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == param1) {
                param1 = param3;
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
                  var10_array = new int[param3 * param2];
                  var11 = 0;
                  L4: while (true) {
                    L5: {
                      if (~param2 >= ~var11) {
                        break L5;
                      } else {
                        var12 = var11 * param3;
                        var13 = (-1 + -var11 + param2) * param1 + param0;
                        stackOut_8_0 = 0;
                        stackIn_19_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var15 != 0) {
                          break L2;
                        } else {
                          var14 = stackIn_9_0;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (~param3 >= ~var14) {
                                  break L8;
                                } else {
                                  int incrementValue$2 = var12;
                                  var12++;
                                  int incrementValue$3 = var13;
                                  var13++;
                                  var10_array[incrementValue$2] = param5[incrementValue$3];
                                  var14++;
                                  if (var15 != 0) {
                                    break L7;
                                  } else {
                                    if (var15 == 0) {
                                      continue L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var11++;
                              break L7;
                            }
                            if (var15 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    param5 = var10_array;
                    break L3;
                  }
                }
              }
              stackOut_18_0 = -72 / ((-66 - param6) / 44);
              stackIn_19_0 = stackOut_18_0;
              break L2;
            }
            L9: {
              var10_int = stackIn_19_0;
              ((rt) this).field_h.a(true, (kl) this);
              if (param3 == param1) {
                break L9;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param1);
                break L9;
              }
            }
            L10: {
              jaggl.OpenGL.glTexSubImage2Di(((rt) this).field_e, 0, param4, -param2 + (-param8 + ((rt) this).field_o), param3, param2, 32993, ((rt) this).field_h.field_P, param5, param0);
              if (param3 == param1) {
                break L10;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var10 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var10;
            stackOut_26_1 = new StringBuilder().append("rt.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L11;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Unable to delete name - system busy";
        field_p = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
