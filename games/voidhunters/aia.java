/*
 * Decompiled by CFR-JS 0.4.0.
 */
class aia extends pib {
    int field_h;
    int field_j;
    private int field_k;
    private int field_i;

    aia(qfa param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
        super(param0, param1, param2, param3 * param4, param5);
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
        var16 = VoidHunters.field_G;
        ((aia) this).field_k = -1;
        ((aia) this).field_i = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((aia) this).field_h = param3;
                ((aia) this).field_j = param4;
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
                      var14 = (param4 + -var12 - 1) * param3;
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
              ((aia) this).field_g.a(57, (pib) this);
              stackOut_12_0 = 34037;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            L6: {
              L7: {
                L8: {
                  if (stackIn_13_0 == ((aia) this).field_b) {
                    break L8;
                  } else {
                    if (!param5) {
                      break L8;
                    } else {
                      if (0 != param7) {
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
                jaggl.OpenGL.glTexImage2Di(((aia) this).field_b, 0, ((aia) this).field_d, ((aia) this).field_h, ((aia) this).field_j, 0, 32993, ((aia) this).field_g.field_cc, param6, param8 * 4);
                jaggl.OpenGL.glPixelStorei(3314, 0);
                ((aia) this).a((byte) 62, false);
                if (var16 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
              jdb.a(param6, ((aia) this).field_g.field_cc, 29175, ((aia) this).field_d, ((aia) this).field_b, 32993, ((aia) this).field_j, ((aia) this).field_h);
              ((aia) this).a((byte) 62, true);
              break L6;
            }
            ((aia) this).a(62, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var11 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var11;
            stackOut_21_1 = new StringBuilder().append("aia.<init>(");
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
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
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
        if (param2 != 10497) {
          return;
        } else {
          L0: {
            if (((aia) this).field_b != 3553) {
              break L0;
            } else {
              L1: {
                ((aia) this).field_g.a(116, (pib) this);
                stackOut_2_0 = ((aia) this).field_b;
                stackOut_2_1 = 10242;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (param1) {
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
                stackOut_5_0 = ((aia) this).field_b;
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
            }
          }
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int[] param8) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
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
        byte stackOut_16_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 != 0) {
                break L1;
              } else {
                param1 = param2;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param7) {
                  var16 = new int[param2 * param4];
                  var10_array = var16;
                  var11 = 0;
                  L4: while (true) {
                    if (var11 >= param4) {
                      param8 = var16;
                      break L3;
                    } else {
                      var12 = var11 * param2;
                      var13 = param6 + (-var11 + param4 - 1) * param1;
                      stackOut_7_0 = 0;
                      stackIn_17_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var15 != 0) {
                        break L2;
                      } else {
                        var14 = stackIn_8_0;
                        L5: while (true) {
                          L6: {
                            if (var14 >= param2) {
                              var11++;
                              break L6;
                            } else {
                              int incrementValue$2 = var12;
                              var12++;
                              int incrementValue$3 = var13;
                              var13++;
                              var16[incrementValue$2] = param8[incrementValue$3];
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
                } else {
                  break L3;
                }
              }
              stackOut_16_0 = param0;
              stackIn_17_0 = stackOut_16_0;
              break L2;
            }
            if (stackIn_17_0 == 32) {
              L7: {
                ((aia) this).field_g.a(97, (pib) this);
                if (param2 != param1) {
                  jaggl.OpenGL.glPixelStorei(3314, param1);
                  break L7;
                } else {
                  break L7;
                }
              }
              jaggl.OpenGL.glTexSubImage2Di(((aia) this).field_b, 0, param5, ((aia) this).field_j - param3 - param4, param2, param4, 32993, ((aia) this).field_g.field_cc, param8, param6);
              if (param1 != param2) {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var10;
            stackOut_26_1 = new StringBuilder().append("aia.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param8 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(((aia) this).field_i, ((aia) this).field_k, ((aia) this).field_b, 0, 0);
        if (param0 != 31294) {
          ((aia) this).a(3, 70, -60, -31, 85, 83, 30);
          ((aia) this).field_i = -1;
          ((aia) this).field_k = -1;
          return;
        } else {
          ((aia) this).field_i = -1;
          ((aia) this).field_k = -1;
          return;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param0, param1, ((aia) this).field_b, ((aia) this).field_c, param2);
        ((aia) this).field_k = param1;
        ((aia) this).field_i = param0;
        if (param3) {
            ((aia) this).field_k = -5;
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
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
        var15 = VoidHunters.field_G;
        ((aia) this).field_k = -1;
        ((aia) this).field_i = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((aia) this).field_h = param3;
                ((aia) this).field_j = param4;
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
                      var12 = var11 * param3;
                      var13 = param3 * (-var11 + (param4 + -1));
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
              ((aia) this).field_g.a(118, (pib) this);
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
                  if (((aia) this).field_b == 34037) {
                    break L7;
                  } else {
                    ue.a(param6, 0, param7, param1, param2, param3, param4);
                    ((aia) this).a((byte) 62, true);
                    if (var15 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Dub(((aia) this).field_b, 0, ((aia) this).field_d, ((aia) this).field_h, ((aia) this).field_j, 0, param7, 5121, param6, 0);
              ((aia) this).a((byte) 62, false);
              break L6;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((aia) this).a(-79, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var10;
            stackOut_19_1 = new StringBuilder().append("aia.<init>(");
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
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3, int param4, int param5, int param6, int param7, boolean param8, int param9) {
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 == 0) {
                param4 = param5;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param8) {
                  break L3;
                } else {
                  var11_int = pu.a((byte) -122, param1);
                  var12 = var11_int * param5;
                  var13 = var11_int * param4;
                  var14 = new byte[var12 * param0];
                  var15 = 0;
                  L4: while (true) {
                    if (param0 <= var15) {
                      param3 = var14;
                      break L3;
                    } else {
                      var16 = var15 * var12;
                      var17 = (param0 - (var15 - -1)) * var13 + param2;
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
                              var14[incrementValue$2] = param3[incrementValue$3];
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
              ((aia) this).field_g.a(95, (pib) this);
              jaggl.OpenGL.glPixelStorei(3317, param9);
              stackOut_16_0 = param5;
              stackIn_17_0 = stackOut_16_0;
              break L2;
            }
            L7: {
              if (stackIn_17_0 != param4) {
                jaggl.OpenGL.glPixelStorei(3314, param4);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              jaggl.OpenGL.glTexSubImage2Dub(((aia) this).field_b, 0, param7, param6, param5, param0, param1, 5121, param3, param2);
              if (param4 == param5) {
                break L8;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L8;
              }
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var11 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var11;
            stackOut_24_1 = new StringBuilder().append("aia.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param4 * param3, false);
        ((aia) this).field_k = -1;
        ((aia) this).field_i = -1;
        try {
            ((aia) this).field_j = param4;
            ((aia) this).field_h = param3;
            ((aia) this).field_g.a(102, (pib) this);
            jaggl.OpenGL.glTexImage2Dub(((aia) this).field_b, 0, ((aia) this).field_d, param3, param4, 0, fsb.a(((aia) this).field_d, false), 5121, (byte[]) null, 0);
            ((aia) this).a(-96, true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "aia.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
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
        ((aia) this).field_k = -1;
        ((aia) this).field_i = -1;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  ((aia) this).field_j = param4;
                  ((aia) this).field_h = param3;
                  ((aia) this).field_g.a(100, (pib) this);
                  if (!param5) {
                    break L3;
                  } else {
                    if (((aia) this).field_b != 34037) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                jaggl.OpenGL.glTexImage2Df(((aia) this).field_b, 0, ((aia) this).field_d, ((aia) this).field_h, ((aia) this).field_j, 0, param7, 5126, param6, 0);
                ((aia) this).a((byte) 62, false);
                if (VoidHunters.field_G == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              co.a(param7, param2, param3, param1, param4, param6, -29702);
              ((aia) this).a((byte) 62, true);
              break L1;
            }
            ((aia) this).a(-86, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("aia.<init>(");
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
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param7 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = -param6 - (param3 - ((aia) this).field_g.field_Y);
        ((aia) this).field_g.a(121, (pib) this);
        jaggl.OpenGL.glCopyTexSubImage2D(((aia) this).field_b, 0, param2, ((aia) this).field_j - param3 - param1, param5, var8, param4, param3);
        int var9 = -33 / ((-65 - param0) / 43);
        jaggl.OpenGL.glFlush();
    }

    static {
    }
}
