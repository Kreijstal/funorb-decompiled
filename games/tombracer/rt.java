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
        jaggl.OpenGL.glFramebufferTexture2DEXT(param0, param3, ((rt) this).field_e, ((rt) this).field_i, param1);
        ((rt) this).field_q = param3;
        ((rt) this).field_m = param0;
        if (param2 != 0) {
            ((rt) this).a(true, true, 64);
        }
    }

    final static void a(boolean param0, String param1, String param2) {
        try {
            if (!param0) {
                Object var4 = null;
                rt.a(true, (String) null, (String) null);
            }
            rma.a(false, param1, param2, (byte) 100);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rt.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(((rt) this).field_m, ((rt) this).field_q, ((rt) this).field_e, 0, 0);
        ((rt) this).field_q = -1;
        ((rt) this).field_m = -1;
        int var2 = -46 % ((param0 - 14) / 56);
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
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
                    if (param2 <= var15) {
                      param5 = var14;
                      break L3;
                    } else {
                      var16 = var15 * var12;
                      var17 = (-var15 + param2 - 1) * var13 - -param1;
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
                              var14[incrementValue$2] = param5[incrementValue$3];
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
              ((rt) this).field_h.a(true, (kl) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_16_0 = param7;
              stackIn_17_0 = stackOut_16_0;
              break L2;
            }
            L7: {
              if (stackIn_17_0 == param0) {
                break L7;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param0);
                break L7;
              }
            }
            jaggl.OpenGL.glTexSubImage2Dub(((rt) this).field_e, 0, param4, param3, param7, param2, param8, 5121, param5, param1);
            if (param6 == -24575) {
              L8: {
                if (param0 == param7) {
                  break L8;
                } else {
                  jaggl.OpenGL.glPixelStorei(3314, 0);
                  break L8;
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
          L9: {
            var11 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var11;
            stackOut_25_1 = new StringBuilder().append("rt.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    public static void g(int param0) {
        if (param0 != -1) {
            field_n = null;
            field_n = null;
            field_p = null;
            return;
        }
        field_n = null;
        field_p = null;
    }

    final void a(boolean param0, boolean param1, int param2) {
        if (param2 == ~((rt) this).field_e) {
            ((rt) this).field_h.a(true, (kl) this);
            jaggl.OpenGL.glTexParameteri(((rt) this).field_e, 10242, param1 ? 10497 : 33071);
            jaggl.OpenGL.glTexParameteri(((rt) this).field_e, 10243, param0 ? 10497 : 33071);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var8 = 0;
        var8 = ((rt) this).field_h.field_I + -param5 - param6;
        ((rt) this).field_h.a(true, (kl) this);
        jaggl.OpenGL.glCopyTexSubImage2D(((rt) this).field_e, 0, param3, ((rt) this).field_o - param2 - param6, param0, var8, param1, param6);
        jaggl.OpenGL.glFlush();
        if (param4 >= -62) {
          ((rt) this).field_l = -71;
          return;
        } else {
          return;
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
                  var17 = new int[param6.length];
                  var11_array = var17;
                  var12 = 0;
                  L3: while (true) {
                    if (param4 <= var12) {
                      param6 = var17;
                      break L2;
                    } else {
                      var13 = param3 * var12;
                      var14 = (-1 + (-var12 + param4)) * param3;
                      stackOut_4_0 = 0;
                      stackIn_13_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var16 != 0) {
                        break L1;
                      } else {
                        var15 = stackIn_5_0;
                        L4: while (true) {
                          L5: {
                            if (param3 <= var15) {
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
              ((rt) this).field_h.a(true, (kl) this);
              stackOut_12_0 = -34038;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            L6: {
              L7: {
                if (stackIn_13_0 == ~((rt) this).field_e) {
                  break L7;
                } else {
                  if (!param5) {
                    break L7;
                  } else {
                    if (param7 != 0) {
                      break L7;
                    } else {
                      if (0 != param8) {
                        break L7;
                      } else {
                        wd.a(((rt) this).field_e, 32993, ((rt) this).field_c, 81, param6, ((rt) this).field_h.field_P, ((rt) this).field_l, ((rt) this).field_o);
                        ((rt) this).a(true, 4);
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
              jaggl.OpenGL.glTexImage2Di(((rt) this).field_e, 0, ((rt) this).field_c, ((rt) this).field_l, ((rt) this).field_o, 0, 32993, ((rt) this).field_h.field_P, param6, param8 * 4);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              ((rt) this).a(false, 4);
              break L6;
            }
            ((rt) this).b(true, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var11 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var11;
            stackOut_21_1 = new StringBuilder().append("rt.<init>(");
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
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    rt(cka param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
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
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("rt.<init>(");
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param7 + 41);
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
        var15 = TombRacer.field_G ? 1 : 0;
        ((rt) this).field_q = -1;
        ((rt) this).field_m = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((rt) this).field_l = param3;
                ((rt) this).field_o = param4;
                if (!param8) {
                  break L2;
                } else {
                  var16 = new byte[param6.length];
                  var10_array = var16;
                  var11 = 0;
                  L3: while (true) {
                    if (var11 >= param4) {
                      param6 = var16;
                      break L2;
                    } else {
                      var12 = var11 * param3;
                      var13 = (-1 + (-var11 + param4)) * param3;
                      stackOut_4_0 = 0;
                      stackIn_13_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var15 != 0) {
                        break L1;
                      } else {
                        var14 = stackIn_5_0;
                        L4: while (true) {
                          L5: {
                            if (param3 <= var14) {
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
              ((rt) this).field_h.a(true, (kl) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_12_0 = param5;
              stackIn_13_0 = stackOut_12_0 ? 1 : 0;
              break L1;
            }
            L6: {
              L7: {
                L8: {
                  if (stackIn_13_0 == 0) {
                    break L8;
                  } else {
                    if (((rt) this).field_e != 34037) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                jaggl.OpenGL.glTexImage2Dub(((rt) this).field_e, 0, ((rt) this).field_c, ((rt) this).field_l, ((rt) this).field_o, 0, param7, 5121, param6, 0);
                ((rt) this).a(false, 4);
                if (var15 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
              ts.a((byte) 53, param6, param1, param3, param4, param7, param2);
              ((rt) this).a(true, 4);
              break L6;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((rt) this).b(true, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var10 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var10;
            stackOut_19_1 = new StringBuilder().append("rt.<init>(");
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
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          L10: {
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
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    rt(cka param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3 * param4, false);
        ((rt) this).field_q = -1;
        ((rt) this).field_m = -1;
        try {
            ((rt) this).field_o = param4;
            ((rt) this).field_l = param3;
            ((rt) this).field_h.a(true, (kl) this);
            jaggl.OpenGL.glTexImage2Dub(((rt) this).field_e, 0, ((rt) this).field_c, param3, param4, 0, sja.b(((rt) this).field_c, 20934), 5121, (byte[]) null, 0);
            ((rt) this).b(true, 3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rt.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
        int[] var16 = null;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
                  var16 = new int[param3 * param2];
                  var10_array = var16;
                  var11 = 0;
                  L4: while (true) {
                    if (param2 <= var11) {
                      param5 = var10_array;
                      break L3;
                    } else {
                      var12 = var11 * param3;
                      var13 = (-1 + -var11 + param2) * param1 + param0;
                      stackOut_7_0 = 0;
                      stackIn_17_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var15 != 0) {
                        break L2;
                      } else {
                        var14 = stackIn_8_0;
                        L5: while (true) {
                          L6: {
                            if (param3 <= var14) {
                              var11++;
                              break L6;
                            } else {
                              int incrementValue$2 = var12;
                              var12++;
                              int incrementValue$3 = var13;
                              var13++;
                              var16[incrementValue$2] = param5[incrementValue$3];
                              var14++;
                              if (var15 != 0) {
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
              stackOut_16_0 = -72 / ((-66 - param6) / 44);
              stackIn_17_0 = stackOut_16_0;
              break L2;
            }
            L7: {
              var10_int = stackIn_17_0;
              ((rt) this).field_h.a(true, (kl) this);
              if (param3 == param1) {
                break L7;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param1);
                break L7;
              }
            }
            jaggl.OpenGL.glTexSubImage2Di(((rt) this).field_e, 0, param4, -param2 + (-param8 + ((rt) this).field_o), param3, param2, 32993, ((rt) this).field_h.field_P, param5, param0);
            if (param3 == param1) {
              break L0;
            } else {
              jaggl.OpenGL.glPixelStorei(3314, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var10;
            stackOut_22_1 = new StringBuilder().append("rt.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param5 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
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
