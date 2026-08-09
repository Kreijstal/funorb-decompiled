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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var11 = null;
        RuntimeException var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var17 = null;
        this.field_k = -1;
        this.field_i = -1;
        try {
          L0: {
            L1: {
              this.field_h = param3;
              this.field_j = param4;
              if (!param9) {
                break L1;
              } else {
                var17 = new int[param6.length];
                var11 = var17;
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
                        incrementValue$0 = var13;
                        var13++;
                        incrementValue$1 = var14;
                        var14++;
                        var17[incrementValue$0] = param6[incrementValue$1];
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
                this.field_g.a(57, (pib) (this));
                if (34037 == this.field_b) {
                  break L5;
                } else {
                  if (!param5) {
                    break L5;
                  } else {
                    if (0 != param7) {
                      break L5;
                    } else {
                      if (param8 == 0) {
                        jdb.a(param6, this.field_g.field_cc, 29175, this.field_d, this.field_b, 32993, this.field_j, this.field_h);
                        this.a((byte) 62, true);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Di(this.field_b, 0, this.field_d, this.field_h, this.field_j, 0, 32993, this.field_g.field_cc, param6, param8 * 4);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              this.a((byte) 62, false);
              break L4;
            }
            this.a(62, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var11_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var11_ref);

            stackIn_19_1 = new StringBuilder().append("aia.<init>(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        if (param2 != 10497) {
            return;
        }
        if (this.field_b == 3553) {
            this.field_g.a(116, (pib) (this));
            jaggl.OpenGL.glTexParameteri(this.field_b, 10242, !param1 ? 33071 : 10497);
            jaggl.OpenGL.glTexParameteri(this.field_b, 10243, !param0 ? 33071 : 10497);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int[] param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (-1 != (param1 ^ -1)) {
                break L1;
              } else {
                param1 = param2;
                break L1;
              }
            }
            L2: {
              if (param7) {
                var10 = new int[param2 * param4];
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param4) {
                    param8 = var10;
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
                        incrementValue$0 = var12;
                        var12++;
                        incrementValue$1 = var13;
                        var13++;
                        var10[incrementValue$0] = param8[incrementValue$1];
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
                this.field_g.a(97, (pib) (this));
                if (param2 != param1) {
                  jaggl.OpenGL.glPixelStorei(3314, param1);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                jaggl.OpenGL.glTexSubImage2Di(this.field_b, 0, param5, this.field_j - param3 - param4, param2, param4, 32993, this.field_g.field_cc, param8, param6);
                if (param1 != param2) {
                  jaggl.OpenGL.glPixelStorei(3314, 0);
                  break L6;
                } else {
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var10_ref);

            stackIn_23_1 = new StringBuilder().append("aia.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(this.field_i, this.field_k, this.field_b, 0, 0);
        if (param0 != 31294) {
            this.a(3, 70, -60, -31, 85, 83, 30);
        }
        this.field_i = -1;
        this.field_k = -1;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param0, param1, this.field_b, this.field_c, param2);
        this.field_k = param1;
        this.field_i = param0;
        if (param3) {
            this.field_k = -5;
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
        super(param0, param1, param2, param4 * param3, param5);
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var16 = null;
        this.field_k = -1;
        this.field_i = -1;
        try {
          L0: {
            L1: {
              this.field_h = param3;
              this.field_j = param4;
              if (!param8) {
                break L1;
              } else {
                var16 = new byte[param6.length];
                var10 = var16;
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
                        incrementValue$0 = var12;
                        var12++;
                        incrementValue$1 = var13;
                        var13++;
                        var16[incrementValue$0] = param6[incrementValue$1];
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
                this.field_g.a(118, (pib) (this));
                jaggl.OpenGL.glPixelStorei(3317, 1);
                if (!param5) {
                  break L5;
                } else {
                  if (-34038 == (this.field_b ^ -1)) {
                    break L5;
                  } else {
                    ue.a(param6, 0, param7, param1, param2, param3, param4);
                    this.a((byte) 62, true);
                    break L4;
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Dub(this.field_b, 0, this.field_d, this.field_h, this.field_j, 0, param7, 5121, param6, 0);
              this.a((byte) 62, false);
              break L4;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            this.a(-79, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var10_ref);

            stackIn_17_1 = new StringBuilder().append("aia.<init>(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3, int param4, int param5, int param6, int param7, boolean param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (-1 == (param4 ^ -1)) {
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
                        incrementValue$0 = var16;
                        var16++;
                        incrementValue$1 = var17;
                        var17++;
                        var14[incrementValue$0] = param3[incrementValue$1];
                        var18++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              this.field_g.a(95, (pib) (this));
              jaggl.OpenGL.glPixelStorei(3317, param9);
              if (param5 != param4) {
                jaggl.OpenGL.glPixelStorei(3314, param4);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              jaggl.OpenGL.glTexSubImage2Dub(this.field_b, 0, param7, param6, param5, param0, param1, 5121, param3, param2);
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
            stackIn_21_0 = (RuntimeException) (var11);

            stackIn_21_1 = new StringBuilder().append("aia.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param4 * param3, false);
        this.field_k = -1;
        this.field_i = -1;
        try {
            this.field_j = param4;
            this.field_h = param3;
            this.field_g.a(102, (pib) (this));
            jaggl.OpenGL.glTexImage2Dub(this.field_b, 0, this.field_d, param3, param4, 0, fsb.a(this.field_d, false), 5121, (byte[]) null, 0);
            this.a(-96, true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "aia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    aia(qfa param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        this.field_k = -1;
        this.field_i = -1;
        try {
          L0: {
            L1: {
              L2: {
                this.field_j = param4;
                this.field_h = param3;
                this.field_g.a(100, (pib) (this));
                if (!param5) {
                  break L2;
                } else {
                  if ((this.field_b ^ -1) != -34038) {
                    co.a(param7, param2, param3, param1, param4, param6, -29702);
                    this.a((byte) 62, true);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jaggl.OpenGL.glTexImage2Df(this.field_b, 0, this.field_d, this.field_h, this.field_j, 0, param7, 5126, param6, 0);
              this.a((byte) 62, false);
              break L1;
            }
            this.a(-86, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var9);

            stackIn_9_1 = new StringBuilder().append("aia.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param7 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = -param6 - (param3 - this.field_g.field_Y);
        this.field_g.a(121, (pib) (this));
        jaggl.OpenGL.glCopyTexSubImage2D(this.field_b, 0, param2, this.field_j - param3 - param1, param5, var8, param4, param3);
        int var9 = -33 / ((-65 - param0) / 43);
        jaggl.OpenGL.glFlush();
    }

    static {
    }
}
