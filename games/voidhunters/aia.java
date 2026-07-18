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
                  var11_array = new int[param6.length];
                  var12 = 0;
                  L3: while (true) {
                    L4: {
                      if (var12 >= param4) {
                        break L4;
                      } else {
                        var13 = var12 * param3;
                        var14 = (param4 + -var12 - 1) * param3;
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
                                if (~param3 >= ~var15) {
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
              ((aia) this).field_g.a(57, (pib) this);
              stackOut_14_0 = 34037;
              stackIn_15_0 = stackOut_14_0;
              break L1;
            }
            L8: {
              L9: {
                L10: {
                  if (stackIn_15_0 == ((aia) this).field_b) {
                    break L10;
                  } else {
                    if (!param5) {
                      break L10;
                    } else {
                      if (0 != param7) {
                        break L10;
                      } else {
                        if (param8 == 0) {
                          break L9;
                        } else {
                          break L10;
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
                  break L8;
                } else {
                  break L9;
                }
              }
              jdb.a(param6, ((aia) this).field_g.field_cc, 29175, ((aia) this).field_d, ((aia) this).field_b, 32993, ((aia) this).field_j, ((aia) this).field_h);
              ((aia) this).a((byte) 62, true);
              break L8;
            }
            ((aia) this).a(62, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var11 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var11;
            stackOut_32_1 = new StringBuilder().append("aia.<init>(");
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
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
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
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        try {
          L0: {
            if (param2 == 10497) {
              L1: {
                if (((aia) this).field_b != 3553) {
                  break L1;
                } else {
                  L2: {
                    ((aia) this).field_g.a(116, (pib) this);
                    stackOut_3_0 = ((aia) this).field_b;
                    stackOut_3_1 = 10242;
                    stackIn_8_0 = stackOut_3_0;
                    stackIn_8_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (param1) {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 10497;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      break L2;
                    } else {
                      stackOut_4_0 = stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackOut_6_0 = stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 33071;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_9_1 = stackOut_6_1;
                      stackIn_9_2 = stackOut_6_2;
                      break L2;
                    }
                  }
                  L3: {
                    jaggl.OpenGL.glTexParameteri(stackIn_9_0, stackIn_9_1, stackIn_9_2);
                    stackOut_9_0 = ((aia) this).field_b;
                    stackOut_9_1 = 10243;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_12_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (param0) {
                      stackOut_12_0 = stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = 10497;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      break L3;
                    } else {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 33071;
                      stackIn_13_0 = stackOut_10_0;
                      stackIn_13_1 = stackOut_10_1;
                      stackIn_13_2 = stackOut_10_2;
                      break L3;
                    }
                  }
                  jaggl.OpenGL.glTexParameteri(stackIn_13_0, stackIn_13_1, stackIn_13_2);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "aia.M(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        byte stackOut_18_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
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
                  var10_array = new int[param2 * param4];
                  var11 = 0;
                  L4: while (true) {
                    L5: {
                      if (~var11 <= ~param4) {
                        break L5;
                      } else {
                        var12 = var11 * param2;
                        var13 = param6 + (-var11 + param4 - 1) * param1;
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
                                if (~var14 <= ~param2) {
                                  break L8;
                                } else {
                                  int incrementValue$2 = var12;
                                  var12++;
                                  int incrementValue$3 = var13;
                                  var13++;
                                  var10_array[incrementValue$2] = param8[incrementValue$3];
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
                    param8 = var10_array;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              stackOut_18_0 = param0;
              stackIn_19_0 = stackOut_18_0;
              break L2;
            }
            if (stackIn_19_0 == 32) {
              L9: {
                ((aia) this).field_g.a(97, (pib) this);
                if (~param2 != ~param1) {
                  jaggl.OpenGL.glPixelStorei(3314, param1);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                jaggl.OpenGL.glTexSubImage2Di(((aia) this).field_b, 0, param5, ((aia) this).field_j - param3 - param4, param2, param4, 32993, ((aia) this).field_g.field_cc, param8, param6);
                if (param1 != param2) {
                  jaggl.OpenGL.glPixelStorei(3314, 0);
                  break L10;
                } else {
                  break L10;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var10 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var10;
            stackOut_30_1 = new StringBuilder().append("aia.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param8 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    public final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glFramebufferTexture2DEXT(((aia) this).field_i, ((aia) this).field_k, ((aia) this).field_b, 0, 0);
              if (param0 == 31294) {
                break L1;
              } else {
                ((aia) this).a(3, 70, -60, -31, 85, 83, 30);
                break L1;
              }
            }
            ((aia) this).field_i = -1;
            ((aia) this).field_k = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "aia.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        try {
            jaggl.OpenGL.glFramebufferTexture2DEXT(param0, param1, ((aia) this).field_b, ((aia) this).field_c, param2);
            ((aia) this).field_k = param1;
            ((aia) this).field_i = param0;
            if (param3) {
                ((aia) this).field_k = -5;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "aia.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_14_0 = false;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
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
                  var10_array = new byte[param6.length];
                  var11 = 0;
                  L3: while (true) {
                    L4: {
                      if (param4 <= var11) {
                        break L4;
                      } else {
                        var12 = var11 * param3;
                        var13 = param3 * (-var11 + (param4 + -1));
                        stackOut_4_0 = 0;
                        stackIn_15_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          var14 = stackIn_5_0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (~param3 >= ~var14) {
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
                }
              }
              ((aia) this).field_g.a(118, (pib) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_14_0 = param5;
              stackIn_15_0 = stackOut_14_0 ? 1 : 0;
              break L1;
            }
            L8: {
              L9: {
                if (stackIn_15_0 == 0) {
                  break L9;
                } else {
                  if (((aia) this).field_b == 34037) {
                    break L9;
                  } else {
                    ue.a(param6, 0, param7, param1, param2, param3, param4);
                    ((aia) this).a((byte) 62, true);
                    if (var15 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Dub(((aia) this).field_b, 0, ((aia) this).field_d, ((aia) this).field_h, ((aia) this).field_j, 0, param7, 5121, param6, 0);
              ((aia) this).a((byte) 62, false);
              break L8;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((aia) this).a(-79, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var10 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var10;
            stackOut_26_1 = new StringBuilder().append("aia.<init>(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param6 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param7 + ',' + param8 + ')');
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
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                    L5: {
                      if (param0 <= var15) {
                        break L5;
                      } else {
                        var16 = var15 * var12;
                        var17 = (param0 - (var15 - -1)) * var13 + param2;
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
                                  var14[incrementValue$2] = param3[incrementValue$3];
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
                    param3 = var14;
                    break L3;
                  }
                }
              }
              ((aia) this).field_g.a(95, (pib) this);
              jaggl.OpenGL.glPixelStorei(3317, param9);
              stackOut_18_0 = param5;
              stackIn_19_0 = stackOut_18_0;
              break L2;
            }
            L9: {
              if (stackIn_19_0 != param4) {
                jaggl.OpenGL.glPixelStorei(3314, param4);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              jaggl.OpenGL.glTexSubImage2Dub(((aia) this).field_b, 0, param7, param6, param5, param0, param1, 5121, param3, param2);
              if (~param4 == ~param5) {
                break L10;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L10;
              }
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var11 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var11;
            stackOut_28_1 = new StringBuilder().append("aia.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4) {
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
        ((aia) this).field_k = -1;
        ((aia) this).field_i = -1;
        try {
          L0: {
            ((aia) this).field_j = param4;
            ((aia) this).field_h = param3;
            ((aia) this).field_g.a(102, (pib) this);
            jaggl.OpenGL.glTexImage2Dub(((aia) this).field_b, 0, ((aia) this).field_d, param3, param4, 0, fsb.a(((aia) this).field_d, false), 5121, (byte[]) null, 0);
            ((aia) this).a(-96, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("aia.<init>(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException var9 = null;
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
            var9 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var9;
            stackOut_10_1 = new StringBuilder().append("aia.<init>(");
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
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param7 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        try {
            var8_int = -param6 - (param3 - ((aia) this).field_g.field_Y);
            ((aia) this).field_g.a(121, (pib) this);
            jaggl.OpenGL.glCopyTexSubImage2D(((aia) this).field_b, 0, param2, ((aia) this).field_j - param3 - param1, param5, var8_int, param4, param3);
            int var9 = -33 / ((-65 - param0) / 43);
            jaggl.OpenGL.glFlush();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "aia.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
