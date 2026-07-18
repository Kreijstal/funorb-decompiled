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
              if (!param7) {
                break L2;
              } else {
                var11_int = pc.a(param2, (byte) -37);
                var12 = var11_int * param4;
                var13 = var11_int * param5;
                var14 = new byte[param9 * var12];
                var15 = 0;
                L3: while (true) {
                  if (var15 >= param9) {
                    param1 = var14;
                    break L2;
                  } else {
                    var16 = var15 * var12;
                    var17 = var13 * (-var15 + (param9 + -1)) - -param0;
                    var18 = 0;
                    L4: while (true) {
                      if (var18 >= var12) {
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
              ((us) this).field_d.a(82, (ht) this);
              jaggl.OpenGL.glPixelStorei(3317, 1);
              if (param4 == param5) {
                break L5;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param5);
                break L5;
              }
            }
            L6: {
              jaggl.OpenGL.glTexSubImage2Dub(((us) this).field_c, 0, param3, param6, param4, param9, param2, 5121, param1, param0);
              if (param5 != param4) {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L6;
              } else {
                break L6;
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
          L7: {
            var11 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var11;
            stackOut_21_1 = new StringBuilder().append("us.G(").append(param0).append(',');
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
          throw qo.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
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
            throw qo.a((Throwable) (Object) runtimeException, "us.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = ((us) this).field_d.field_Ec + -param4 + -param1;
        ((us) this).field_d.a(97, (ht) this);
        if (param0 < 110) {
            ((us) this).field_o = 53;
        }
        jaggl.OpenGL.glCopyTexSubImage2D(((us) this).field_c, 0, param2, -param4 - param3 + ((us) this).field_o, param5, var8, param6, param4);
        jaggl.OpenGL.glFlush();
    }

    final void a(boolean param0, boolean param1, int param2) {
        if (param2 != -27365) {
            ((us) this).a((byte) 11, 46, 71, -37, 98, -13, 14);
        }
        if (!(((us) this).field_c != 3553)) {
            ((us) this).field_d.a(66, (ht) this);
            jaggl.OpenGL.glTexParameteri(((us) this).field_c, 10242, param0 ? 10497 : 33071);
            jaggl.OpenGL.glTexParameteri(((us) this).field_c, 10243, param1 ? 10497 : 33071);
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException var9 = null;
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
                ((us) this).field_l = param3;
                ((us) this).field_o = param4;
                ((us) this).field_d.a(106, (ht) this);
                if (!param5) {
                  break L2;
                } else {
                  if (((us) this).field_c != 34037) {
                    dl.a(param3, param4, (byte) 11, param1, param2, param6, param7);
                    ((us) this).a(true, true);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Df(((us) this).field_c, 0, ((us) this).field_a, ((us) this).field_l, ((us) this).field_o, 0, param7, 5126, param6, 0);
              ((us) this).a(true, false);
              break L1;
            }
            ((us) this).a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var9;
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
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param7 + ')');
        }
    }

    public static void c(byte param0) {
        field_m = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param3, param1, ((us) this).field_c, ((us) this).field_j, param2);
        ((us) this).field_k = param3;
        if (param0 >= -21) {
            return;
        }
        ((us) this).field_n = param1;
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, boolean param7, boolean param8) {
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
              if (param7) {
                var10_array = new int[param1 * param0];
                var11 = 0;
                L4: while (true) {
                  if (param0 <= var11) {
                    param3 = var10_array;
                    break L3;
                  } else {
                    var12 = param1 * var11;
                    var13 = param4 + param6 * (param0 - (var11 - -1));
                    var14 = 0;
                    L5: while (true) {
                      if (var14 >= param1) {
                        var11++;
                        continue L4;
                      } else {
                        int incrementValue$2 = var12;
                        var12++;
                        int incrementValue$3 = var13;
                        var13++;
                        var10_array[incrementValue$2] = param3[incrementValue$3];
                        var14++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              ((us) this).field_d.a(81, (ht) this);
              if (param6 == param1) {
                break L6;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, param6);
                break L6;
              }
            }
            L7: {
              jaggl.OpenGL.glTexSubImage2Di(((us) this).field_c, 0, param5, -param0 + (((us) this).field_o + -param2), param1, param0, 32993, ((us) this).field_d.field_L, param3, param4);
              if (param1 != param6) {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L7;
              } else {
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
            stackOut_20_1 = new StringBuilder().append("us.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
        try {
          L0: {
            L1: {
              ((us) this).field_l = param3;
              ((us) this).field_o = param4;
              if (!param8) {
                break L1;
              } else {
                var16 = new byte[param6.length];
                var10_array = var16;
                var11 = 0;
                L2: while (true) {
                  if (param4 <= var11) {
                    param6 = var16;
                    break L1;
                  } else {
                    var12 = param3 * var11;
                    var13 = param3 * (-1 + (-var11 + param4));
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
                ((us) this).field_d.a(83, (ht) this);
                jaggl.OpenGL.glPixelStorei(3317, 1);
                if (!param5) {
                  break L5;
                } else {
                  if (34037 == ((us) this).field_c) {
                    break L5;
                  } else {
                    vq.a(param1, 23143, param6, param3, param2, param4, param7);
                    ((us) this).a(true, true);
                    break L4;
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Dub(((us) this).field_c, 0, ((us) this).field_a, ((us) this).field_l, ((us) this).field_o, 0, param7, 5121, param6, 0);
              ((us) this).a(true, false);
              break L4;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((us) this).a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var10;
            stackOut_15_1 = new StringBuilder().append("us.<init>(");
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
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param7 + ',' + param8 + ')');
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
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
        try {
          L0: {
            L1: {
              ((us) this).field_l = param3;
              ((us) this).field_o = param4;
              if (!param9) {
                break L1;
              } else {
                var17 = new int[param6.length];
                var11_array = var17;
                var12 = 0;
                L2: while (true) {
                  if (param4 <= var12) {
                    param6 = var17;
                    break L1;
                  } else {
                    var13 = var12 * param3;
                    var14 = param3 * (-var12 + param4 + -1);
                    var15 = 0;
                    L3: while (true) {
                      if (var15 >= param3) {
                        var12++;
                        continue L2;
                      } else {
                        int incrementValue$3 = var13;
                        var13++;
                        int incrementValue$4 = var14;
                        var14++;
                        var17[incrementValue$3] = param6[incrementValue$4];
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
                ((us) this).field_d.a(43, (ht) this);
                if (((us) this).field_c == 34037) {
                  break L5;
                } else {
                  if (!param5) {
                    break L5;
                  } else {
                    if (param7 != 0) {
                      break L5;
                    } else {
                      if (param8 != 0) {
                        break L5;
                      } else {
                        int discarded$5 = 32993;
                        eu.a(-122, ((us) this).field_o, ((us) this).field_l, ((us) this).field_c, param6, ((us) this).field_a, ((us) this).field_d.field_L);
                        ((us) this).a(true, true);
                        break L4;
                      }
                    }
                  }
                }
              }
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Di(((us) this).field_c, 0, ((us) this).field_a, ((us) this).field_l, ((us) this).field_o, 0, 32993, ((us) this).field_d.field_L, param6, 4 * param8);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              ((us) this).a(true, false);
              break L4;
            }
            ((us) this).a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var11 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var11;
            stackOut_17_1 = new StringBuilder().append("us.<init>(");
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
          throw qo.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public final void a(int param0) {
        int var2 = 6 / ((44 - param0) / 58);
        jaggl.OpenGL.glFramebufferTexture2DEXT(((us) this).field_k, ((us) this).field_n, ((us) this).field_c, 0, 0);
        ((us) this).field_k = -1;
        ((us) this).field_n = -1;
    }

    final static void a(java.applet.Applet param0) {
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
                var2_int = 25;
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
              throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -124 + ')');
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
