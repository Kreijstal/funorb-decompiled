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
        ((aia) this).field_k = -1;
        ((aia) this).field_i = -1;
        try {
          L0: {
            L1: {
              ((aia) this).field_h = param3;
              ((aia) this).field_j = param4;
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
                    var14 = (param4 + -var12 - 1) * param3;
                    var15 = 0;
                    L3: while (true) {
                      if (param3 <= var15) {
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
                ((aia) this).field_g.a(57, (pib) this);
                if (34037 == ((aia) this).field_b) {
                  break L5;
                } else {
                  if (!param5) {
                    break L5;
                  } else {
                    if (0 != param7) {
                      break L5;
                    } else {
                      if (param8 == 0) {
                        jdb.a(param6, ((aia) this).field_g.field_cc, 29175, ((aia) this).field_d, ((aia) this).field_b, 32993, ((aia) this).field_j, ((aia) this).field_h);
                        ((aia) this).a((byte) 62, true);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Di(((aia) this).field_b, 0, ((aia) this).field_d, ((aia) this).field_h, ((aia) this).field_j, 0, 32993, ((aia) this).field_g.field_cc, param6, param8 * 4);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              ((aia) this).a((byte) 62, false);
              break L4;
            }
            ((aia) this).a(62, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var11 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var11;
            stackOut_17_1 = new StringBuilder().append("aia.<init>(");
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
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        if (param2 != 10497) {
            return;
        }
        if (((aia) this).field_b == 3553) {
            ((aia) this).field_g.a(116, (pib) this);
            jaggl.OpenGL.glTexParameteri(((aia) this).field_b, 10242, !param1 ? 33071 : 10497);
            jaggl.OpenGL.glTexParameteri(((aia) this).field_b, 10243, !param0 ? 33071 : 10497);
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
              if (param7) {
                var10_array = new int[param2 * param4];
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param4) {
                    param8 = var10_array;
                    break L2;
                  } else {
                    var12 = var11 * param2;
                    var13 = param6 + (-var11 + param4 - 1) * param1;
                    var14 = 0;
                    L4: while (true) {
                      if (var14 >= param2) {
                        var11++;
                        continue L3;
                      } else {
                        int incrementValue$2 = var12;
                        var12++;
                        int incrementValue$3 = var13;
                        var13++;
                        var10_array[incrementValue$2] = param8[incrementValue$3];
                        var14++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            if (param0 == 32) {
              L5: {
                ((aia) this).field_g.a(97, (pib) this);
                if (param2 != param1) {
                  jaggl.OpenGL.glPixelStorei(3314, param1);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                jaggl.OpenGL.glTexSubImage2Di(((aia) this).field_b, 0, param5, ((aia) this).field_j - param3 - param4, param2, param4, 32993, ((aia) this).field_g.field_cc, param8, param6);
                if (param1 != param2) {
                  jaggl.OpenGL.glPixelStorei(3314, 0);
                  break L6;
                } else {
                  break L6;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var10;
            stackOut_21_1 = new StringBuilder().append("aia.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param8 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(((aia) this).field_i, ((aia) this).field_k, ((aia) this).field_b, 0, 0);
        if (param0 != 31294) {
            ((aia) this).a(3, 70, -60, -31, 85, 83, 30);
        }
        ((aia) this).field_i = -1;
        ((aia) this).field_k = -1;
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
        ((aia) this).field_k = -1;
        ((aia) this).field_i = -1;
        try {
          L0: {
            L1: {
              ((aia) this).field_h = param3;
              ((aia) this).field_j = param4;
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
                    var12 = var11 * param3;
                    var13 = param3 * (-var11 + (param4 + -1));
                    var14 = 0;
                    L3: while (true) {
                      if (param3 <= var14) {
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
                ((aia) this).field_g.a(118, (pib) this);
                jaggl.OpenGL.glPixelStorei(3317, 1);
                if (!param5) {
                  break L5;
                } else {
                  if (((aia) this).field_b == 34037) {
                    break L5;
                  } else {
                    ue.a(param6, 0, param7, param1, param2, param3, param4);
                    ((aia) this).a((byte) 62, true);
                    break L4;
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Dub(((aia) this).field_b, 0, ((aia) this).field_d, ((aia) this).field_h, ((aia) this).field_j, 0, param7, 5121, param6, 0);
              ((aia) this).a((byte) 62, false);
              break L4;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((aia) this).a(-79, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var10;
            stackOut_15_1 = new StringBuilder().append("aia.<init>(");
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
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param7 + 44 + param8 + 41);
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
              if (!param8) {
                break L2;
              } else {
                var11_int = pu.a((byte) -122, param1);
                var12 = var11_int * param5;
                var13 = var11_int * param4;
                var14 = new byte[var12 * param0];
                var15 = 0;
                L3: while (true) {
                  if (param0 <= var15) {
                    param3 = var14;
                    break L2;
                  } else {
                    var16 = var15 * var12;
                    var17 = (param0 - (var15 - -1)) * var13 + param2;
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
                        var14[incrementValue$2] = param3[incrementValue$3];
                        var18++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              ((aia) this).field_g.a(95, (pib) this);
              jaggl.OpenGL.glPixelStorei(3317, param9);
              if (param5 != param4) {
                jaggl.OpenGL.glPixelStorei(3314, param4);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              jaggl.OpenGL.glTexSubImage2Dub(((aia) this).field_b, 0, param7, param6, param5, param0, param1, 5121, param3, param2);
              if (param4 == param5) {
                break L6;
              } else {
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L6;
              }
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var11;
            stackOut_19_1 = new StringBuilder().append("aia.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
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
        ((aia) this).field_k = -1;
        ((aia) this).field_i = -1;
        try {
          L0: {
            L1: {
              L2: {
                ((aia) this).field_j = param4;
                ((aia) this).field_h = param3;
                ((aia) this).field_g.a(100, (pib) this);
                if (!param5) {
                  break L2;
                } else {
                  if (((aia) this).field_b != 34037) {
                    int discarded$1 = -29702;
                    co.a(param7, param2, param3, param1, param4, param6);
                    ((aia) this).a((byte) 62, true);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Df(((aia) this).field_b, 0, ((aia) this).field_d, ((aia) this).field_h, ((aia) this).field_j, 0, param7, 5126, param6, 0);
              ((aia) this).a((byte) 62, false);
              break L1;
            }
            ((aia) this).a(-86, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var9;
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
