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
                    L5: {
                      if (~var15 <= ~param6) {
                        break L5;
                      } else {
                        var16 = var15 * var12;
                        var17 = param2 + (-1 + param6 + -var15) * var13;
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
                                if (var12 <= var18) {
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
              ((nr) this).field_j.a((rt) this, 1);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_18_0 = ~param7;
              stackIn_19_0 = stackOut_18_0;
              break L2;
            }
            L9: {
              if (stackIn_19_0 != ~param9) {
                jaggl.OpenGL.glPixelStorei(3314, param7);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              jaggl.OpenGL.glTexSubImage2Dub(((nr) this).field_f, 0, param4, param0, param9, param6, param8, 5121, param1, param2);
              if (param7 == param9) {
                break L10;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L10;
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
          L11: {
            var11 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var11;
            stackOut_30_1 = new StringBuilder().append("nr.C(").append(param0).append(',');
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
          throw pn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
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
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
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
                  var10_array = new int[param2 * param0];
                  var11 = 0;
                  L4: while (true) {
                    L5: {
                      if (~param2 >= ~var11) {
                        break L5;
                      } else {
                        var12 = var11 * param0;
                        var13 = param6 + (param2 + (-var11 + -1)) * param8;
                        stackOut_6_0 = 0;
                        stackIn_17_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var15 != 0) {
                          break L2;
                        } else {
                          var14 = stackIn_7_0;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (~param0 >= ~var14) {
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
              ((nr) this).field_j.a((rt) this, 1);
              stackOut_16_0 = ~param0;
              stackIn_17_0 = stackOut_16_0;
              break L2;
            }
            L9: {
              if (stackIn_17_0 != ~param8) {
                jaggl.OpenGL.glPixelStorei(3314, param8);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              jaggl.OpenGL.glTexSubImage2Di(((nr) this).field_f, 0, param4, -param2 + ((nr) this).field_k + -param1, param0, param2, 32993, ((nr) this).field_j.field_tb, param5, param6);
              if (~param8 != ~param0) {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param7 == 0) {
                break L11;
              } else {
                ((nr) this).field_n = 0;
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var10 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var10;
            stackOut_29_1 = new StringBuilder().append("nr.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L12;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        RuntimeException var4 = null;
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
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
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
              if (((nr) this).field_f == 3553) {
                L2: {
                  ((nr) this).field_j.a((rt) this, 1);
                  stackOut_3_0 = ((nr) this).field_f;
                  stackOut_3_1 = 10242;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_6_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (param2) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 10497;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    break L2;
                  } else {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 33071;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_7_1 = stackOut_4_1;
                    stackIn_7_2 = stackOut_4_2;
                    break L2;
                  }
                }
                L3: {
                  jaggl.OpenGL.glTexParameteri(stackIn_7_0, stackIn_7_1, stackIn_7_2);
                  stackOut_7_0 = ((nr) this).field_f;
                  stackOut_7_1 = 10243;
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (param0) {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 10497;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L3;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 33071;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_11_1 = stackOut_8_1;
                    stackIn_11_2 = stackOut_8_2;
                    break L3;
                  }
                }
                jaggl.OpenGL.glTexParameteri(stackIn_11_0, stackIn_11_1, stackIn_11_2);
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              if (param1 == 11779) {
                break L4;
              } else {
                ((nr) this).field_k = 28;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "nr.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glFramebufferTexture2DEXT(param3, param0, ((nr) this).field_f, ((nr) this).field_d, param2);
              ((nr) this).field_l = param3;
              if (param1 == 0) {
                break L1;
              } else {
                ((nr) this).a(100, -69, 53, true, 65, (int[]) null, 57, (byte) -105, -113);
                break L1;
              }
            }
            ((nr) this).field_n = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var5, "nr.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
                  var11_array = new int[param6.length];
                  var12 = 0;
                  L3: while (true) {
                    L4: {
                      if (~var12 <= ~param4) {
                        break L4;
                      } else {
                        var13 = var12 * param3;
                        var14 = (-1 + param4 - var12) * param3;
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
              ((nr) this).field_j.a((rt) this, 1);
              stackOut_14_0 = -34038;
              stackIn_15_0 = stackOut_14_0;
              break L1;
            }
            L8: {
              L9: {
                L10: {
                  if (stackIn_15_0 == ~((nr) this).field_f) {
                    break L10;
                  } else {
                    if (!param5) {
                      break L10;
                    } else {
                      if (param7 != 0) {
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
                jaggl.OpenGL.glTexImage2Di(((nr) this).field_f, 0, ((nr) this).field_b, ((nr) this).field_m, ((nr) this).field_k, 0, 32993, ((nr) this).field_j.field_tb, param6, 4 * param8);
                jaggl.OpenGL.glPixelStorei(3314, 0);
                ((nr) this).a(false, false);
                if (var16 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
              fg.a(((nr) this).field_m, ((nr) this).field_k, ((nr) this).field_f, 32993, 72, param6, ((nr) this).field_j.field_tb, ((nr) this).field_b);
              ((nr) this).a(true, false);
              break L8;
            }
            ((nr) this).a(true, -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var11 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var11;
            stackOut_32_1 = new StringBuilder().append("nr.<init>(");
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
          throw pn.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glFramebufferTexture2DEXT(((nr) this).field_l, ((nr) this).field_n, ((nr) this).field_f, 0, 0);
              if (param0 == 11) {
                break L1;
              } else {
                ((nr) this).a(false, 38, false);
                break L1;
              }
            }
            ((nr) this).field_l = -1;
            ((nr) this).field_n = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "nr.B(" + param0 + ')');
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
                  var10_array = new byte[param6.length];
                  var11 = 0;
                  L3: while (true) {
                    L4: {
                      if (~var11 <= ~param4) {
                        break L4;
                      } else {
                        var12 = var11 * param3;
                        var13 = param3 * (-var11 + (param4 - 1));
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
                }
              }
              ((nr) this).field_j.a((rt) this, 1);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              stackOut_14_0 = param5;
              stackIn_15_0 = stackOut_14_0 ? 1 : 0;
              break L1;
            }
            L8: {
              L9: {
                L10: {
                  if (stackIn_15_0 == 0) {
                    break L10;
                  } else {
                    if (((nr) this).field_f != 34037) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                jaggl.OpenGL.glTexImage2Dub(((nr) this).field_f, 0, ((nr) this).field_b, ((nr) this).field_m, ((nr) this).field_k, 0, param7, 5121, param6, 0);
                ((nr) this).a(false, false);
                if (var15 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
              pu.a((byte) -55, param7, param2, param6, param1, param4, param3);
              ((nr) this).a(true, false);
              break L8;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((nr) this).a(true, -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var10 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var10;
            stackOut_26_1 = new StringBuilder().append("nr.<init>(");
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
          L12: {
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
          throw pn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        if (param6 <= 79) {
            return;
        }
        try {
            var8_int = -param3 + -param0 + ((nr) this).field_j.field_bb;
            ((nr) this).field_j.a((rt) this, 1);
            jaggl.OpenGL.glCopyTexSubImage2D(((nr) this).field_f, 0, param4, ((nr) this).field_k + (-param2 - param3), param1, var8_int, param5, param3);
            jaggl.OpenGL.glFlush();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "nr.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    nr(wl param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
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
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("nr.<init>(");
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
          throw pn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param7 + ')');
        }
    }

    nr(wl param0, int param1, int param2, int param3, int param4) {
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
        ((nr) this).field_l = -1;
        ((nr) this).field_n = -1;
        try {
          L0: {
            ((nr) this).field_k = param4;
            ((nr) this).field_m = param3;
            ((nr) this).field_j.a((rt) this, 1);
            jaggl.OpenGL.glTexImage2Dub(((nr) this).field_f, 0, ((nr) this).field_b, param3, param4, 0, ia.a(((nr) this).field_b, -16445), 5121, (byte[]) null, 0);
            ((nr) this).a(true, -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nr.<init>(");
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
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, byte[] param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              var5_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5_int >= gi.field_i.length) {
                      break L3;
                    } else {
                      param3 = gi.field_i[var5_int];
                      if (var7 != 0) {
                        break L2;
                      } else {
                        var6 = var5_int << 429233604;
                        L4: while (true) {
                          L5: {
                            L6: {
                              int incrementValue$6 = param3;
                              param3--;
                              if (0 == incrementValue$6) {
                                break L6;
                              } else {
                                int incrementValue$7 = var6;
                                var6++;
                                param4 = jr.field_n[incrementValue$7];
                                param0[param2[param4]] = param0[param2[param4]] + 1;
                                jr.field_n[param0[param2[param4]]] = param4;
                                if (var7 != 0) {
                                  break L5;
                                } else {
                                  if (var7 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var5_int++;
                            break L5;
                          }
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("nr.G(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
