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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
              if (!param3) {
                break L2;
              } else {
                var11_int = rl.a(4, param8);
                var12 = var11_int * param9;
                var13 = var11_int * param7;
                var14 = new byte[var12 * param6];
                var15 = 0;
                L3: while (true) {
                  if (var15 >= param6) {
                    param1 = var14;
                    break L2;
                  } else {
                    var16 = var15 * var12;
                    var17 = param2 + (-1 + param6 + -var15) * var13;
                    var18 = 0;
                    L4: while (true) {
                      if (var12 <= var18) {
                        var15++;
                        continue L3;
                      } else {
                        int incrementValue$2 = var16;
                        var16++;
                        int incrementValue$3 = var17;
                        var17++;
                        var14[incrementValue$2] = param1[incrementValue$3];
                        var18++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              ((nr) this).field_j.a((rt) this, 1);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              if (param7 != param9) {
                jaggl.OpenGL.glPixelStorei(3314, param7);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              jaggl.OpenGL.glTexSubImage2Dub(((nr) this).field_f, 0, param4, param0, param9, param6, param8, 5121, param1, param2);
              if (param7 == param9) {
                break L6;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L6;
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
          L7: {
            var11 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var11;
            stackOut_21_1 = new StringBuilder().append("nr.C(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
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
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
              if (!param3) {
                break L2;
              } else {
                var10_array = new int[param2 * param0];
                var11 = 0;
                L3: while (true) {
                  if (param2 <= var11) {
                    param5 = var10_array;
                    break L2;
                  } else {
                    var12 = var11 * param0;
                    var13 = param6 + (param2 + (-var11 + -1)) * param8;
                    var14 = 0;
                    L4: while (true) {
                      if (param0 <= var14) {
                        var11++;
                        continue L3;
                      } else {
                        int incrementValue$2 = var12;
                        var12++;
                        int incrementValue$3 = var13;
                        var13++;
                        var10_array[incrementValue$2] = param5[incrementValue$3];
                        var14++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              ((nr) this).field_j.a((rt) this, 1);
              if (param0 != param8) {
                jaggl.OpenGL.glPixelStorei(3314, param8);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              jaggl.OpenGL.glTexSubImage2Di(((nr) this).field_f, 0, param4, -param2 + ((nr) this).field_k + -param1, param0, param2, 32993, ((nr) this).field_j.field_tb, param5, param6);
              if (param8 != param0) {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param7 == 0) {
                break L7;
              } else {
                ((nr) this).field_n = 0;
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var10;
            stackOut_20_1 = new StringBuilder().append("nr.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        if (!(((nr) this).field_f != 3553)) {
            ((nr) this).field_j.a((rt) this, 1);
            jaggl.OpenGL.glTexParameteri(((nr) this).field_f, 10242, !param2 ? 33071 : 10497);
            jaggl.OpenGL.glTexParameteri(((nr) this).field_f, 10243, !param0 ? 33071 : 10497);
        }
        if (param1 != 11779) {
            ((nr) this).field_k = 28;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param3, param0, ((nr) this).field_f, ((nr) this).field_d, param2);
        ((nr) this).field_l = param3;
        if (param1 != 0) {
            Object var6 = null;
            ((nr) this).a(100, -69, 53, true, 65, (int[]) null, 57, (byte) -105, -113);
        }
        ((nr) this).field_n = param0;
    }

    nr(wl param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
        super(param0, param1, param2, param4 * param3, param5);
        RuntimeException var11 = null;
        int[] var11_array = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var17 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        ((nr) this).field_l = -1;
        ((nr) this).field_n = -1;
        try {
          L0: {
            L1: {
              ((nr) this).field_k = param4;
              ((nr) this).field_m = param3;
              if (!param9) {
                break L1;
              } else {
                var17 = new int[param6.length];
                var11_array = var17;
                var12 = 0;
                L2: while (true) {
                  if (var12 >= param4) {
                    param6 = var17;
                    break L1;
                  } else {
                    var13 = var12 * param3;
                    var14 = (-1 + param4 - var12) * param3;
                    var15 = 0;
                    L3: while (true) {
                      if (var15 >= param3) {
                        var12++;
                        continue L2;
                      } else {
                        int incrementValue$2 = var13;
                        var13++;
                        int incrementValue$3 = var14;
                        var14++;
                        var17[incrementValue$2] = param6[incrementValue$3];
                        var15++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            L4: {
              L5: {
                ((nr) this).field_j.a((rt) this, 1);
                if (((nr) this).field_f == 34037) {
                  break L5;
                } else {
                  if (!param5) {
                    break L5;
                  } else {
                    if (param7 != 0) {
                      break L5;
                    } else {
                      if (param8 == 0) {
                        fg.a(((nr) this).field_m, ((nr) this).field_k, ((nr) this).field_f, 32993, 72, param6, ((nr) this).field_j.field_tb, ((nr) this).field_b);
                        ((nr) this).a(true, false);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Di(((nr) this).field_f, 0, ((nr) this).field_b, ((nr) this).field_m, ((nr) this).field_k, 0, 32993, ((nr) this).field_j.field_tb, param6, 4 * param8);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              ((nr) this).a(false, false);
              break L4;
            }
            ((nr) this).a(true, -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var11 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var11;
            stackOut_17_1 = new StringBuilder().append("nr.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param6 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public final void a(byte param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(((nr) this).field_l, ((nr) this).field_n, ((nr) this).field_f, 0, 0);
        if (param0 != 11) {
            ((nr) this).a(false, 38, false);
        }
        ((nr) this).field_l = -1;
        ((nr) this).field_n = -1;
    }

    nr(wl param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
        super(param0, param1, param2, param4 * param3, param5);
        RuntimeException var10 = null;
        byte[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var16 = null;
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
        ((nr) this).field_l = -1;
        ((nr) this).field_n = -1;
        try {
          L0: {
            L1: {
              ((nr) this).field_m = param3;
              ((nr) this).field_k = param4;
              if (!param8) {
                break L1;
              } else {
                var16 = new byte[param6.length];
                var10_array = var16;
                var11 = 0;
                L2: while (true) {
                  if (var11 >= param4) {
                    param6 = var16;
                    break L1;
                  } else {
                    var12 = var11 * param3;
                    var13 = param3 * (-var11 + (param4 - 1));
                    var14 = 0;
                    L3: while (true) {
                      if (var14 >= param3) {
                        var11++;
                        continue L2;
                      } else {
                        int incrementValue$2 = var12;
                        var12++;
                        int incrementValue$3 = var13;
                        var13++;
                        var16[incrementValue$2] = param6[incrementValue$3];
                        var14++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            L4: {
              L5: {
                ((nr) this).field_j.a((rt) this, 1);
                jaggl.OpenGL.glPixelStorei(3317, 1);
                if (!param5) {
                  break L5;
                } else {
                  if (((nr) this).field_f != 34037) {
                    pu.a((byte) -55, param7, param2, param6, param1, param4, param3);
                    ((nr) this).a(true, false);
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Dub(((nr) this).field_f, 0, ((nr) this).field_b, ((nr) this).field_m, ((nr) this).field_k, 0, param7, 5121, param6, 0);
              ((nr) this).a(false, false);
              break L4;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((nr) this).a(true, -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var10;
            stackOut_15_1 = new StringBuilder().append("nr.<init>(");
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
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param6 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 <= 79) {
            return;
        }
        int var8 = -param3 + -param0 + ((nr) this).field_j.field_bb;
        ((nr) this).field_j.a((rt) this, 1);
        jaggl.OpenGL.glCopyTexSubImage2D(((nr) this).field_f, 0, param4, ((nr) this).field_k + (-param2 - param3), param1, var8, param5, param3);
        jaggl.OpenGL.glFlush();
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
                    int discarded$2 = -1;
                    rq.a(param6, param1, param2, param4, param7, param3);
                    ((nr) this).a(true, false);
                    break L1;
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
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
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param7 + ')');
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
            throw pn.a((Throwable) (Object) runtimeException, "nr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, byte[] param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= gi.field_i.length) {
                break L0;
              } else {
                param3 = gi.field_i[var5_int];
                var6 = var5_int << 4;
                L2: while (true) {
                  int incrementValue$12 = param3;
                  param3--;
                  if (0 == incrementValue$12) {
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$13 = var6;
                    var6++;
                    param4 = jr.field_n[incrementValue$13];
                    param0[param2[param4]] = param0[param2[param4]] + 1;
                    jr.field_n[param0[param2[param4]]] = param4;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("nr.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(false).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
