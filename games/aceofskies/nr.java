/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nr extends rt {
    int field_m;
    private int field_l;
    private int field_n;
    int field_k;

    final void a(int param0, byte[] param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        var19 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 == 0) {
                param7 = param9;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param3) {
                  break L3;
                } else {
                  var11_int = rl.a(4, param8);
                  var12 = var11_int * param9;
                  var13 = var11_int * param7;
                  var14 = new byte[var12 * param6];
                  var15 = 0;
                  L4: while (true) {
                    if (var15 >= param6) {
                      param1 = var14;
                      break L3;
                    } else {
                      var16 = var15 * var12;
                      var17 = param2 + (-1 + param6 + -var15) * var13;
                      stackOut_7_0 = 0;
                      stackIn_17_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var19 != 0) {
                        break L2;
                      } else {
                        var18 = stackIn_8_0;
                        L5: while (true) {
                          L6: {
                            if (var12 <= var18) {
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
              ((nr) this).field_j.a((rt) this, 1);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_16_0 = param7;
              stackIn_17_0 = stackOut_16_0;
              break L2;
            }
            L7: {
              if (stackIn_17_0 != param9) {
                jaggl.OpenGL.glPixelStorei(3314, param7);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              jaggl.OpenGL.glTexSubImage2Dub(((nr) this).field_f, 0, param4, param0, param9, param6, param8, 5121, param1, param2);
              if (param7 == param9) {
                break L8;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L8;
              }
            }
            if (param5 == -34038) {
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
            stackOut_26_1 = new StringBuilder().append("nr.C(").append(param0).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int[] param5, int param6, byte param7, int param8) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var15 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8 != 0) {
                break L1;
              } else {
                param8 = param0;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param3) {
                  break L3;
                } else {
                  var16 = new int[param2 * param0];
                  var10_array = var16;
                  var11 = 0;
                  L4: while (true) {
                    if (param2 <= var11) {
                      param5 = var16;
                      break L3;
                    } else {
                      var12 = var11 * param0;
                      var13 = param6 + (param2 + (-var11 + -1)) * param8;
                      stackOut_6_0 = 0;
                      stackIn_16_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var15 != 0) {
                        break L2;
                      } else {
                        var14 = stackIn_7_0;
                        L5: while (true) {
                          L6: {
                            if (param0 <= var14) {
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
              ((nr) this).field_j.a((rt) this, 1);
              stackOut_15_0 = param0;
              stackIn_16_0 = stackOut_15_0;
              break L2;
            }
            L7: {
              if (stackIn_16_0 != param8) {
                jaggl.OpenGL.glPixelStorei(3314, param8);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              jaggl.OpenGL.glTexSubImage2Di(((nr) this).field_f, 0, param4, -param2 + ((nr) this).field_k + -param1, param0, param2, 32993, ((nr) this).field_j.field_tb, param5, param6);
              if (param8 != param0) {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L8;
              } else {
                break L8;
              }
            }
            if (param7 == 0) {
              break L0;
            } else {
              ((nr) this).field_n = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var10 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var10;
            stackOut_25_1 = new StringBuilder().append("nr.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          if (((nr) this).field_f == 3553) {
            L1: {
              ((nr) this).field_j.a((rt) this, 1);
              stackOut_2_0 = ((nr) this).field_f;
              stackOut_2_1 = 10242;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (param2) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 10497;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 33071;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L1;
              }
            }
            L2: {
              jaggl.OpenGL.glTexParameteri(stackIn_5_0, stackIn_5_1, stackIn_5_2);
              stackOut_5_0 = ((nr) this).field_f;
              stackOut_5_1 = 10243;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (param0) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 10497;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L2;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 33071;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                break L2;
              }
            }
            jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_8_2);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 11779) {
          ((nr) this).field_k = 28;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        jaggl.OpenGL.glFramebufferTexture2DEXT(param3, param0, ((nr) this).field_f, ((nr) this).field_d, param2);
        ((nr) this).field_l = param3;
        if (param1 != 0) {
          var6 = null;
          ((nr) this).a(100, -69, 53, true, 65, (int[]) null, 57, (byte) -105, -113);
          ((nr) this).field_n = param0;
          return;
        } else {
          ((nr) this).field_n = param0;
          return;
        }
    }

    nr(wl param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
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
        var16 = AceOfSkies.field_G ? 1 : 0;
        ((nr) this).field_l = -1;
        ((nr) this).field_n = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((nr) this).field_k = param4;
                ((nr) this).field_m = param3;
                if (!param9) {
                  break L2;
                } else {
                  var17 = new int[param6.length];
                  var11_array = var17;
                  var12 = 0;
                  L3: while (true) {
                    if (var12 >= param4) {
                      param6 = var17;
                      break L2;
                    } else {
                      var13 = var12 * param3;
                      var14 = (-1 + param4 - var12) * param3;
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
              ((nr) this).field_j.a((rt) this, 1);
              stackOut_12_0 = -34038;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            L6: {
              L7: {
                L8: {
                  if (stackIn_13_0 == ~((nr) this).field_f) {
                    break L8;
                  } else {
                    if (!param5) {
                      break L8;
                    } else {
                      if (param7 != 0) {
                        break L8;
                      } else {
                        if (param8 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                jaggl.OpenGL.glPixelStorei(3314, param7);
                jaggl.OpenGL.glTexImage2Di(((nr) this).field_f, 0, ((nr) this).field_b, ((nr) this).field_m, ((nr) this).field_k, 0, 32993, ((nr) this).field_j.field_tb, param6, 4 * param8);
                jaggl.OpenGL.glPixelStorei(3314, 0);
                ((nr) this).a(false, false);
                if (var16 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
              fg.a(((nr) this).field_m, ((nr) this).field_k, ((nr) this).field_f, 32993, 72, param6, ((nr) this).field_j.field_tb, ((nr) this).field_b);
              ((nr) this).a(true, false);
              break L6;
            }
            ((nr) this).a(true, -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var11 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var11;
            stackOut_21_1 = new StringBuilder().append("nr.<init>(");
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
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
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
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    public final void a(byte param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(((nr) this).field_l, ((nr) this).field_n, ((nr) this).field_f, 0, 0);
        if (param0 != 11) {
          ((nr) this).a(false, 38, false);
          ((nr) this).field_l = -1;
          ((nr) this).field_n = -1;
          return;
        } else {
          ((nr) this).field_l = -1;
          ((nr) this).field_n = -1;
          return;
        }
    }

    nr(wl param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
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
        var15 = AceOfSkies.field_G ? 1 : 0;
        ((nr) this).field_l = -1;
        ((nr) this).field_n = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((nr) this).field_m = param3;
                ((nr) this).field_k = param4;
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
                      var13 = param3 * (-var11 + (param4 - 1));
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
              ((nr) this).field_j.a((rt) this, 1);
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
                    if (((nr) this).field_f != 34037) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                jaggl.OpenGL.glTexImage2Dub(((nr) this).field_f, 0, ((nr) this).field_b, ((nr) this).field_m, ((nr) this).field_k, 0, param7, 5121, param6, 0);
                ((nr) this).a(false, false);
                if (var15 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
              pu.a((byte) -55, param7, param2, param6, param1, param4, param3);
              ((nr) this).a(true, false);
              break L6;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((nr) this).a(true, -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var10 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var10;
            stackOut_19_1 = new StringBuilder().append("nr.<init>(");
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
          throw pn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        if (param6 <= 79) {
          return;
        } else {
          var8 = -param3 + -param0 + ((nr) this).field_j.field_bb;
          ((nr) this).field_j.a((rt) this, 1);
          jaggl.OpenGL.glCopyTexSubImage2D(((nr) this).field_f, 0, param4, ((nr) this).field_k + (-param2 - param3), param1, var8, param5, param3);
          jaggl.OpenGL.glFlush();
          return;
        }
    }

    nr(wl param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
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
        ((nr) this).field_l = -1;
        ((nr) this).field_n = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((nr) this).field_m = param3;
                ((nr) this).field_k = param4;
                ((nr) this).field_j.a((rt) this, 1);
                if (!param5) {
                  break L2;
                } else {
                  if (34037 == ((nr) this).field_f) {
                    break L2;
                  } else {
                    rq.a(param6, param1, param2, param4, param7, param3, -1);
                    ((nr) this).a(true, false);
                    if (!AceOfSkies.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Df(((nr) this).field_f, 0, ((nr) this).field_b, ((nr) this).field_m, ((nr) this).field_k, 0, param7, 5126, param6, 0);
              ((nr) this).a(false, false);
              break L1;
            }
            ((nr) this).a(true, -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("nr.<init>(");
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
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param7 + 41);
        }
    }

    nr(wl param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param4 * param3, false);
        ((nr) this).field_l = -1;
        ((nr) this).field_n = -1;
        try {
            ((nr) this).field_k = param4;
            ((nr) this).field_m = param3;
            ((nr) this).field_j.a((rt) this, 1);
            jaggl.OpenGL.glTexImage2Dub(((nr) this).field_f, 0, ((nr) this).field_b, param3, param4, 0, ia.a(((nr) this).field_b, -16445), 5121, (byte[]) null, 0);
            ((nr) this).a(true, -128);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "nr.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int[] param0, boolean param1, byte[] param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= gi.field_i.length) {
                  break L0;
                } else {
                  param3 = gi.field_i[var5_int];
                  if (var7 == 0) {
                    var6 = var5_int << 4;
                    L2: while (true) {
                      L3: {
                        int incrementValue$17 = param3;
                        param3--;
                        if (0 == incrementValue$17) {
                          var5_int++;
                          break L3;
                        } else {
                          int incrementValue$18 = var6;
                          var6++;
                          param4 = jr.field_n[incrementValue$18];
                          param0[param2[param4]] = param0[param2[param4]] + 1;
                          jr.field_n[param0[param2[param4]]] = param4;
                          if (var7 != 0) {
                            break L3;
                          } else {
                            continue L2;
                          }
                        }
                      }
                      continue L1;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("nr.G(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
    }
}
